package de.upb.lina.cfg.tools.strategies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.checks.LoadsInWriteDefChainPropertyChecker;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Store;

public class TSOGraphGenerator extends AbstractGraphGenerator
{
	private LoadsInWriteDefChainPropertyChecker liwdcChecker = null;
	
	//original address/value is key and is mapped to a new address/value
	protected HashMap<Address, Address> wdcMapping = null;

	public TSOGraphGenerator(FunctionDefinition function)
	{
		super(function);
	}

	
	
	@Override
	protected void initialize()
	{
		super.initialize();
		this.wdcMapping = new HashMap<Address, Address>();
		
		SCGraphGenerator scGen = new SCGraphGenerator(function); 
		ControlFlowDiagram scGraph = scGen.createGraph();
		
		this.liwdcChecker = new LoadsInWriteDefChainPropertyChecker(null);
		this.liwdcChecker.checkForWriteDefChains(scGraph, new ArrayList<Transition>());
	}



	@Override
	protected void addTransitions(ControlFlowLocation sourceLocation, Instruction nextInstruction)
	{
		if(!GraphUtility.isSynch(nextInstruction) || sourceLocation.getBuffer().getAddressValuePairs().isEmpty())
		{
			addInstructionTransitions(sourceLocation, nextInstruction);
		}
		addFlushTransition(sourceLocation);
	}





	protected void addFlushTransition(ControlFlowLocation sourceLocation)
	{
		StoreBuffer srcBuffer = sourceLocation.getBuffer();
		int srcPC= sourceLocation.getPc();
		
		if(srcBuffer.getAddressValuePairs().isEmpty())
		{
			//nothing to flush
			return;
		}
		
		StoreBuffer targetBuffer = cloneStoreBuffer(srcBuffer);
		AddressValuePair pair = targetBuffer.getAddressValuePairs().get(0);
		targetBuffer.getAddressValuePairs().remove(pair);
		ControlFlowLocation targetLocation = getLocationByPcAndBuffer(srcPC, targetBuffer);
		if(targetLocation == null)
		{
			targetLocation = createControlFlowLocation(srcPC, targetBuffer);
			this.toBeProcessedLocations.add(targetLocation);
		}
		
		createFlushTransition(sourceLocation, targetLocation);
		
	}


	@Override
	protected void addInstructionTransitions(ControlFlowLocation currentLocation, Instruction nextInstruction)
	{
		if (nextInstruction instanceof Store)
		{
			Store store = (Store) nextInstruction;
			int type = typeOfWriteDefChain(store);
			StoreBuffer nextBuffer = cloneStoreBuffer(currentLocation.getBuffer());
			AddressValuePair pair = createAddressValuePairForWrite(currentLocation.getBuffer(), store);
			nextBuffer.getAddressValuePairs().add(pair);

			ControlFlowLocation nextLoc = getLocationByPcAndBuffer(currentLocation.getPc() + 1, nextBuffer);

			if (nextLoc == null)
			{
				nextLoc = createControlFlowLocation(currentLocation.getPc() + 1, nextBuffer);
				this.toBeProcessedLocations.add(nextLoc);
			}

			createWriteTransition(currentLocation, store, nextLoc, pair, type);
			return;

		} else if (nextInstruction instanceof Load && isEarlyRead(currentLocation, (Load) nextInstruction))
		{
			ControlFlowLocation nextLoc = getLocationByPcAndBuffer(currentLocation.getPc() + 1,
					currentLocation.getBuffer());
			if (nextLoc == null)
			{
				nextLoc = createControlFlowLocation(currentLocation.getPc() + 1,
						cloneStoreBuffer(currentLocation.getBuffer()));
				this.toBeProcessedLocations.add(nextLoc);
			}

			createEarlyReadTransition(currentLocation, (Load) nextInstruction, nextLoc);
			return;
		}

		// else super will take care of it
		super.addInstructionTransitions(currentLocation, nextInstruction);
	}

	
	protected AddressValuePair createAddressValuePairForWrite(StoreBuffer buffer, Store store)
	{
		AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
		newPair.setAddress(store.getTargetAddress());
		
		int wdcType = typeOfWriteDefChain(store);

		// address must be redefined
		if (wdcType == CFGConstants.WDC_BOTH || wdcType == CFGConstants.WDC_ADDRESS)
		{
			Address newAddress = getOrCreateAddressCopyForWDC(store);

			Parameter param = getOrCreateParamForAddress(newAddress, store.getTargetAddress());
			newPair.setAddress(param);
		}

		if (wdcType == CFGConstants.WDC_BOTH || wdcType == CFGConstants.WDC_VALUE)
		{

			// create address
			Address newValue = getOrCreateValueCopyForWDC(store);
			// create Parameter
			Parameter param = getOrCreateParamForAddress(newValue, store.getValue());
			newPair.getValues().add(param);
		}
		else
		{
			// otherwise, use original value
			newPair.getValues().add(store.getValue());
		}
		
		return newPair;
	}



	protected Address getOrCreateAddressCopyForWDC(Store store)
	{
		Address orgAddress = ((AddressUse) store.getTargetAddress().getValue()).getAddress();
		Address newAddress = null;

		if (wdcMapping.containsKey(orgAddress))
		{
			newAddress = wdcMapping.get(orgAddress);
		} else
		{
			newAddress = LlvmFactory.eINSTANCE.createAddress();
			newAddress.setName(orgAddress.getName() + CFGConstants.WDC_SUFFIX);
			wdcMapping.put(orgAddress, newAddress);
			this.graph.getVariableCopies().add(newAddress);
		}
		return newAddress;
	}



	protected Address getOrCreateValueCopyForWDC(Store store)
	{
		Address orgValue = ((AddressUse) store.getValue().getValue()).getAddress();
		Address newValue = null;

		if (wdcMapping.containsKey(orgValue))
		{
			newValue = wdcMapping.get(orgValue);
		} else
		{
			newValue = LlvmFactory.eINSTANCE.createAddress();
			newValue.setName(orgValue.getName() + CFGConstants.WDC_SUFFIX);
			wdcMapping.put(orgValue, newValue);
			this.graph.getVariableCopies().add(newValue);
		}
		return newValue;
	}


	protected Parameter getOrCreateParamForAddress(Address address, Parameter existing)
	{
		//search
		for (Parameter param : this.graph.getVariableCopyParams())
		{
			if (address.equals(((AddressUse) param.getValue()).getAddress()))
			{
				return param;
			}
		}
		// if we are here, we need a new one
		Parameter param = EcoreUtil.copy(existing);
		((AddressUse) param.getValue()).setAddress(address);
		this.graph.getVariableCopyParams().add(param);
		return param;
	}

	protected Transition createWriteTransition(ControlFlowLocation source, Store store, ControlFlowLocation target, AddressValuePair pair, int type)
	{
		if(type == CFGConstants.WDC_NONE)
		{
			return createTransition(source, store, target);
		}
		
		WriteDefChainTransition transition = ControlflowFactory.eINSTANCE.createWriteDefChainTransition();
		transition.setDiagram(this.graph);
		transition.setSource(source);
		transition.setTarget(target);
		transition.setInstruction(store);
		
		if (type == CFGConstants.WDC_BOTH || type == CFGConstants.WDC_ADDRESS)
		{
			Address copyA = ((AddressUse)pair.getAddress().getValue()).getAddress();
			transition.setCopyAddress(copyA);
		}
		if (type == CFGConstants.WDC_BOTH || type == CFGConstants.WDC_VALUE)
		{
			Parameter v = pair.getValues().get(0);
			Address copyV = ((AddressUse)v.getValue()).getAddress();
			transition.setCopyValue(copyV);
		}
		
		return transition;
	}

	/**
	 * @param source
	 * @param instr
	 * @param target
	 * @return newly created transition that has source, target, instruction and the control flow graph set up
	 */
	protected FlushTransition createFlushTransition(ControlFlowLocation source, ControlFlowLocation target) {
		FlushTransition transition = ControlflowFactory.eINSTANCE.createFlushTransition();
		transition.setDiagram(this.graph);
		transition.setSource(source);
		transition.setTarget(target);
		return transition;
	}
	
	/**
	 * @param location
	 * @param load
	 * @return true if the load instruction would result in an early read based on the current location
	 */
	protected boolean isEarlyRead(ControlFlowLocation location, Load load)
	{
		Parameter adrParam = load.getAddress();
		
		Iterator<AddressValuePair> i = location.getBuffer().getAddressValuePairs().iterator();
		while(i.hasNext())
		{
			AddressValuePair pair = i.next();
			if(((AddressUse)pair.getAddress().getValue()).getAddress().getName().equals(((AddressUse)adrParam.getValue()).getAddress().getName()))
			{
				//store buffer contains entry for address
				//it must be an early read
				return true;
			}
		}
		return false;
	}
	
	/**
	 * @param location
	 * @param load
	 * @return the latest address value pair from the store buffer for the address requested by load. null otherwise. 
	 */
	protected AddressValuePair getLatestBufferEntry(ControlFlowLocation location, Load load)
	{
		Parameter adrParam = load.getAddress();
		List<AddressValuePair> l =location.getBuffer().getAddressValuePairs();
		ListIterator<AddressValuePair> i = l.listIterator(l.size());
		while(i.hasPrevious())
		{
			AddressValuePair pair = i.previous();
			if(((AddressUse)pair.getAddress().getValue()).getAddress().getName().equals(((AddressUse)adrParam.getValue()).getAddress().getName()))
			{
				//store buffer contains entry for address
				//it must be an early read
				return pair;
			}
		}
		return null;
	}
	
	protected EarlyReadTransition createEarlyReadTransition(ControlFlowLocation source, Load load, ControlFlowLocation target)
	{
		EarlyReadTransition transition = ControlflowFactory.eINSTANCE.createEarlyReadTransition();
		AddressValuePair pair = getLatestBufferEntry(source, load);
		Parameter value = pair.getValues().get(0);
		String valueInBuffer = GraphUtility.valueToString(value.getValue());
		transition.setAssignmentExpression(valueInBuffer);
		transition.setInstruction(load);
		transition.setDiagram(this.graph);
		transition.setSource(source);
		transition.setTarget(target);
		return transition;
	}
	
	
	protected int typeOfWriteDefChain(Store store)
	{
		
		Iterator<Transition> i = this.liwdcChecker.getWdcAddressValue().iterator();
		while(i.hasNext())
		{
			if(store.equals(i.next().getInstruction()))
			{
				return CFGConstants.WDC_BOTH;
			}
		}
		
		i = this.liwdcChecker.getWdcAddress().iterator();
		while(i.hasNext())
		{
			if(store.equals(i.next().getInstruction()))
			{
				return CFGConstants.WDC_ADDRESS;
			}
		}
		
		i = this.liwdcChecker.getWdcValue().iterator();
		while(i.hasNext())
		{
			if(store.equals(i.next().getInstruction()))
			{
				return CFGConstants.WDC_VALUE;
			}
		}
		
		return CFGConstants.WDC_NONE;
	}
	
	


	@Override
	public String getWarnings()
	{
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	protected ControlFlowLocation getLocationByPcAndBuffer(int pc, StoreBuffer buffer)
	{
		return GraphUtility.getLocationRepresentedBy(this.graph.getLocations(), pc, buffer, CFGConstants.TSO);
	}



	@Override
	public int getMemoryModel()
	{
		return CFGConstants.TSO;
	}

}
