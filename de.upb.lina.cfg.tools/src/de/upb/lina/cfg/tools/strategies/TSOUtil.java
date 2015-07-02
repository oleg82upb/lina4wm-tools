package de.upb.lina.cfg.tools.strategies;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.lina.cfg.tools.CFGActivator;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.IGraphGenerator;
import de.upb.lina.cfg.tools.ProgramCounter;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.SwitchCase;
import de.upb.llvm_parser.llvm.Value;

public class TSOUtil implements IGraphGenerator {
	private List<Instruction> instructions = new ArrayList<Instruction>();
	private List<ControlFlowLocation> processed = new ArrayList<ControlFlowLocation>();
	private HashMap<Address, Address> writeDefMap = new HashMap<Address, Address>();//orgAdr is key, copyAdr is value

	private GraphUtility util = new GraphUtility();

	private FunctionDefinition function;
	public TSOUtil(FunctionDefinition function)
	{
		this.function = function;
	}

	private boolean endProcess = false;
	private boolean loopWithoutFence = false;
	private ArrayList<String> placesInLoopWithoutFence;

	public ControlFlowDiagram createGraph() {
		instructions = new ArrayList<Instruction>();
		this.placesInLoopWithoutFence = new ArrayList<String>();
		boolean containsFlushesAfterReturn = false;
		ProgramCounter pc = new ProgramCounter();
		ControlFlowDiagram cfg = ControlflowFactory.eINSTANCE
				.createControlFlowDiagram();
		SCUtil sc = new SCUtil(function);
		PreComputationChecker checker = new PreComputationChecker("", 0);
		ControlFlowDiagram scCfg = sc.createGraph();
		List<Transition> earlyReadsInFunction = checker.collectEarlyReadsinSCGraph(scCfg);
		checker.checkForWriteDefChains(scCfg, new ArrayList<Transition>());

		cfg.setName(function.getAddress().getName());
		List<ControlFlowLocation> toBeProcessed = new ArrayList<ControlFlowLocation>();
		processed = new ArrayList<ControlFlowLocation>();

		// Generate a list of all instructions
		EList<BasicBlock> blocks = function.getBody().getBlocks();
		for (BasicBlock b : blocks) {
			for (Instruction i : b.getInstructions()) {
				instructions.add(i);
			}
		}
		// first node
		String instructionLabel = util.findLabelByInstruction(function, instructions.get(0));
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		ControlFlowLocation location = createControlFlowLocation(cfg, pc.next(), buffer, instructionLabel);
		if (cfg.getStart() == null) {
			cfg.setStart(location);
			toBeProcessed.add(location);
		}

		// while we have still nodes to work on
		while (!toBeProcessed.isEmpty() && !endProcess) {
			ControlFlowLocation toExplore = toBeProcessed.get(0);

			// get the right instruction of our pc, null if we are at the end
			Instruction nextInstruction = null;
			if (toExplore.getPc() < instructions.size()) {
				nextInstruction = instructions.get(toExplore.getPc());
			}
			// else it is the last location and no further program steps exist

			// empty buffer
			if (toExplore.getBuffer().getAddressValuePairs().isEmpty()) {
				if (nextInstruction != null) {
					addNonFlushOptions(pc, cfg, toBeProcessed, toExplore, nextInstruction, earlyReadsInFunction, checker);
				}

				// buffer with entries
			} else {
				if(nextInstruction == null)
				{
					// possible flushes after a return
					containsFlushesAfterReturn = true;
				}
				// create flush options, TSO behavior
				addFlushOptions(cfg, toBeProcessed, toExplore, nextInstruction);

				// create normal SC behavior
				if (nextInstruction != null && !util.isSynch(nextInstruction)) {
					// other options -SC
					addNonFlushOptions(pc, cfg, toBeProcessed, toExplore, nextInstruction, earlyReadsInFunction, checker);
				}
			}
			// last
			ControlFlowLocation lastProcessed = toBeProcessed.get(0);
			toBeProcessed.remove(0);
			processed.add(lastProcessed);
		}

		if (containsFlushesAfterReturn) {
			CFGActivator.logWarning("Method " + function.getAddress().getName()
					+ " potentially returns with a non-empty store buffer.", null);
		}

		if (CFGConstants.DEBUG) {
			System.out.println("#nodes: " + cfg.getLocations().size() + " ;#edges: " + cfg.getTransitions().size());
		}
		return cfg;

	}

	private void addFlushOptions(ControlFlowDiagram cfg,
			List<ControlFlowLocation> toBeProcessed,
			ControlFlowLocation toExplore, Instruction nextInstruction) {

		StoreBuffer buffer = createFlushedStoreBuffer(toExplore.getBuffer());
		ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc(),
				buffer, util.findLabelByInstruction(function, nextInstruction));
		Transition transition = createFlushTransition(cfg);
		transition.setSource(toExplore);
		transition.setTarget(nextLocation);

		if (!util.isInList(toBeProcessed, nextLocation) && !util.isInList(processed, nextLocation)) {
			toBeProcessed.add(nextLocation);
		}
	}

	private void addNonFlushOptions(ProgramCounter pc, ControlFlowDiagram cfg, 
			List<ControlFlowLocation> toBeProcessed,
			ControlFlowLocation toExplore, Instruction nextInstruction, List<Transition> earlyReadsInFunction, PreComputationChecker checker) {
		
		String instructionLabel = util.findLabelByInstruction(function, nextInstruction);
		
		// check for branches
		if (nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getBranch())) {
			Branch branch = (Branch) nextInstruction;
			// no jump, real branch
			if (branch.getElseDestination() != null) {
				GuardedTransition trueCase = ControlflowFactory.eINSTANCE.createGuardedTransition();

				Instruction trueInstruction = util.getInstructionWithLabel(function,
						branch.getDestination().substring(1));
				StoreBuffer trueBuffer = createStoreBuffer(toExplore.getBuffer(), branch);
				ControlFlowLocation trueLocation = createControlFlowLocation(cfg,
						util.getPcOfInstruction(trueInstruction, instructions),
						trueBuffer, instructionLabel);
				trueCase.setSource(toExplore);
				trueCase.setTarget(trueLocation);
				trueCase.setInstruction(branch);
				trueCase.setCondition("[" + util.valueToString(branch.getCondition()) + "]");
				trueCase.setDiagram(cfg);

				Instruction elseInstruction = util.getInstructionWithLabel(function, branch.getElseDestination()
						.substring(1));
				StoreBuffer elseBuffer = createStoreBuffer(toExplore.getBuffer(), branch);
				ControlFlowLocation falseLocation = createControlFlowLocation(cfg,
						util.getPcOfInstruction(elseInstruction, instructions),
						elseBuffer, instructionLabel);
				GuardedTransition falseCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
				falseCase.setSource(toExplore);
				falseCase.setTarget(falseLocation);
				falseCase.setInstruction(branch);
				falseCase.setCondition("[else]");
				falseCase.setDiagram(cfg);

				if (!util.isInList(toBeProcessed, trueLocation) && !util.isInList(processed, trueLocation)) {
					toBeProcessed.add(trueLocation);
				}
				if (!util.isInList(toBeProcessed, falseLocation) && !util.isInList(processed, falseLocation)) {
					toBeProcessed.add(falseLocation);
				}
			}

			// jump
			// && branch.getElseDestination() == null
			else if (branch.getDestination() != null) {
				Transition t = createTransition(cfg, branch);
				Instruction trueInstruction = util.getInstructionWithLabel(function,
						branch.getDestination().substring(1));
				StoreBuffer buffer = createStoreBuffer(toExplore.getBuffer(), branch);
				ControlFlowLocation nextLocation = createControlFlowLocation(cfg,
						util.getPcOfInstruction(trueInstruction, instructions),
						buffer, instructionLabel);
				t.setSource(toExplore);
				t.setTarget(nextLocation);
				if (!util.isInList(toBeProcessed, nextLocation) && !util.isInList(processed, nextLocation)) {
					toBeProcessed.add(nextLocation);
				}
			}
		} else if (nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getSwitch())) {
			// TODO: check if switch implementation correct
			Switch swit = (Switch) nextInstruction;

			Instruction defaultInstruction = util.getInstructionWithLabel(function, swit.getDefaultCase().substring(1));
			StoreBuffer defaultBuffer = createStoreBuffer(toExplore.getBuffer(), swit);
			ControlFlowLocation defaultLocation = createControlFlowLocation(cfg,
					util.getPcOfInstruction(defaultInstruction, instructions),
					defaultBuffer, instructionLabel);

			GuardedTransition defaultCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
			defaultCase.setCondition("else");
			defaultCase.setSource(toExplore);
			defaultCase.setTarget(defaultLocation);
			defaultCase.setDiagram(cfg);
			defaultCase.setInstruction(swit);

			if (!util.isInList(toBeProcessed, defaultLocation) && !util.isInList(processed, defaultLocation)) {
				toBeProcessed.add(defaultLocation);
			}

			for (SwitchCase sc : swit.getCases()) {
				Instruction caseInstruction = util.getInstructionWithLabel(function, sc.getDestination().substring(1));
				StoreBuffer caseBuffer = createStoreBuffer(toExplore.getBuffer(), swit);
				ControlFlowLocation caseLocation = createControlFlowLocation(cfg,
						util.getPcOfInstruction(caseInstruction, instructions),
						caseBuffer,	instructionLabel);

				GuardedTransition caseC = ControlflowFactory.eINSTANCE.createGuardedTransition();
				caseC.setCondition("else");
				caseC.setSource(toExplore);
				caseC.setTarget(caseLocation);
				caseC.setInstruction(swit);
				caseC.setDiagram(cfg);

				if (!util.isInList(toBeProcessed, caseLocation) && !util.isInList(processed, caseLocation)) {
					toBeProcessed.add(caseLocation);
				}
			}
		} else if (nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getIndirectBranch())) {
			// TODO: target depends on register content -> condition of
			// control flow guards unclear
			throw new RuntimeException(
					"IndirectBranch found. Handling of such is not implemented yet");

			//check if nextInstruction is store in WriteDefChain with redefined address or value
		} else if (nextInstruction instanceof Store 
				&& (instructionIsWriteDefChain(checker.getWdcValue(), toExplore, nextInstruction) 
						|| instructionIsWriteDefChain(checker.getWdcAddress(), toExplore, nextInstruction))) {
		
			WriteDefChainTransition transition = createWriteDefChainTransition(cfg, nextInstruction);
			
			// create next location
			transition.setSource(toExplore);
			StoreBuffer buffer = createStoreBufferAfterWriteDefChainTransition(cfg, toExplore.getBuffer(), transition, checker);
			ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc() + 1, buffer,
					instructionLabel);
			transition.setTarget(nextLocation);

			if (!util.isInList(toBeProcessed, nextLocation) && !util.isInList(processed, nextLocation)) {
				toBeProcessed.add(nextLocation);
			}
			
		} else {
			// check if instruction is earlyRead
			if (nextInstruction instanceof Load) {
				String assignmentExpression = instructionIsEarlyRead(earlyReadsInFunction, toExplore, nextInstruction);

				if (assignmentExpression != null) {
					// instruction is early read
					Transition t = createEarlyReadTransition(cfg, (Load) nextInstruction, assignmentExpression);
					StoreBuffer buffer = createStoreBuffer(toExplore.getBuffer(), nextInstruction);
					ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc() + 1, buffer,
							instructionLabel);
					t.setSource(toExplore);
					t.setTarget(nextLocation);

					if (!util.isInList(toBeProcessed, nextLocation) && !util.isInList(processed, nextLocation)) {
						toBeProcessed.add(nextLocation);
					}
					return;
				}
			}
			// normal writes will be dealt here

			Transition t = createTransition(cfg, nextInstruction);
			StoreBuffer buffer = createStoreBuffer(toExplore.getBuffer(), nextInstruction);
			ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc() + 1,
					buffer,	instructionLabel);
			t.setSource(toExplore);
			t.setTarget(nextLocation);

			// if we have a write we have to check if we have a loop without fence
			// See createStoreBuffer for more details
			if (loopWithoutFence) {
				loopWithoutFence = false;
				reportLoopWithoutFence(function.getAddress().getName(), toExplore, nextLocation, nextInstruction);
				// warningLogger.logPlaceInLoopWithoutFence(function.getAddress().getName(), toExplore, nextLocation, nextInstruction);
			}

			if (!util.isInList(toBeProcessed, nextLocation) && !util.isInList(processed, nextLocation)) {
				toBeProcessed.add(nextLocation);
			}
		}
	}

	private StoreBuffer createStoreBuffer(StoreBuffer oldBuffer, Instruction nextInstruction) {
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		// create deep copy
		for (AddressValuePair pair : oldBuffer.getAddressValuePairs()) {
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setAddress(pair.getAddress());
			newPair.setValue(pair.getValue());
			buffer.getAddressValuePairs().add(newPair);
		}

		// add new buffer entry for store
		if (nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getStore())) {
			Store store = (Store) nextInstruction;
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setAddress(store.getTargetAddress());
			newPair.setValue(store.getValue());
			if (!util.isAVPInList(buffer.getAddressValuePairs(), newPair)) {
				buffer.getAddressValuePairs().add(newPair);
			} else {
				// TODO: Error handling - loop without fence
				loopWithoutFence = true;
			}

		}

		return buffer;
	}
	
	private StoreBuffer createStoreBufferAfterWriteDefChainTransition(ControlFlowDiagram cfg, StoreBuffer oldBuffer,
			WriteDefChainTransition wdcTransition, PreComputationChecker checker) {
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		// create deep copy
		for (AddressValuePair pair : oldBuffer.getAddressValuePairs()) {
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setAddress(pair.getAddress());
			newPair.setValue(pair.getValue());
			buffer.getAddressValuePairs().add(newPair);
		}
		
		// add new buffer entry for store
		Store store = (Store) wdcTransition.getInstruction();
		AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
		boolean redefinedAddress = instructionIsWriteDefChain(checker.getWdcAddress(), wdcTransition.getSource(), store);
		boolean redefinedValue = instructionIsWriteDefChain(checker.getWdcValue(), wdcTransition.getSource(), store);
		
		// address redefined
		if (redefinedAddress) {
			//create address
			Address orgAddress = ((AddressUse) store.getTargetAddress().getValue()).getAddress();

			if (writeDefMap.containsKey(orgAddress)) {
				wdcTransition.setCopyAddress(writeDefMap.get(orgAddress));
			} else {
				Address copyAddress = LlvmFactory.eINSTANCE.createAddress();
				copyAddress.setName(orgAddress.getName() + "Copy");
				writeDefMap.put(orgAddress, copyAddress);
				cfg.getVariableCopies().add(copyAddress);
				wdcTransition.setCopyAddress(copyAddress);
			}
				//create Parameter
				Parameter existingParam = getParamWithName(wdcTransition.getCopyAddress().getName(), cfg.getVariableCopyParams());
				Parameter addressParameter = null;
				if (existingParam != null) {
					// use existing parameter
					addressParameter = existingParam;
				} else {
					// create new parameter
					addressParameter = EcoreUtil.copy(store.getTargetAddress());
					((AddressUse) addressParameter.getValue()).setAddress(wdcTransition.getCopyAddress());
					cfg.getVariableCopyParams().add(addressParameter);
				}
				newPair.setAddress(addressParameter);
				newPair.setValue(store.getValue());
		} 
		// value redefined
		if (redefinedValue) {
			
			//create address
			Address orgValue = ((AddressUse) store.getValue().getValue()).getAddress();
			
			if(writeDefMap.containsKey(orgValue)){
				wdcTransition.setCopyValue(writeDefMap.get(orgValue));
			}else{
				Address copyValue = LlvmFactory.eINSTANCE.createAddress();
				copyValue.setName(orgValue.getName() + "Copy");
				writeDefMap.put(orgValue, copyValue);
				cfg.getVariableCopies().add(copyValue);
				wdcTransition.setCopyValue(copyValue);
			}
				//create Parameter
				Parameter existingParam = getParamWithName(wdcTransition.getCopyValue().getName(), cfg.getVariableCopyParams());
				Parameter valueParam = null;
				if(existingParam != null){
					valueParam = existingParam;
				}else{
					valueParam = EcoreUtil.copy(store.getValue());
					((AddressUse) valueParam.getValue()).setAddress(wdcTransition.getCopyValue());
					cfg.getVariableCopyParams().add(valueParam);
				}
				if(!redefinedAddress){
					newPair.setAddress(store.getTargetAddress());
				}
				newPair.setValue(valueParam);
		}
		buffer.getAddressValuePairs().add(newPair);

		return buffer;
	}

	/**
	 * Creates a deep copy of the old buffer without its first entry (flushed)
	 * 
	 * @param oldBuffer
	 *            the buffer to be flushed
	 * @return flushed deep copy of the old buffer
	 */
	private StoreBuffer createFlushedStoreBuffer(StoreBuffer oldBuffer) {
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		for (AddressValuePair pair : oldBuffer.getAddressValuePairs()) {
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setAddress(pair.getAddress());
			newPair.setValue(pair.getValue());
			buffer.getAddressValuePairs().add(newPair);
		}
		buffer.getAddressValuePairs().remove(0);

		return buffer;
	}

	private Parameter getParamWithName(String name, EList<Parameter> variableCopyParams) {
		for(Parameter param : variableCopyParams){
			if(((AddressUse)param.getValue()).getAddress().getName().equals(name)){
				return param;
			}
		}
		return null;
	}

	/**
	 * @param diag
	 * @param pc
	 * @return
	 */
	private ControlFlowLocation createControlFlowLocation(
			ControlFlowDiagram diag, int pc, StoreBuffer buffer, String blockLabel) {
		for (ControlFlowLocation l : diag.getLocations()) {
			if (util.isCorrectLocation(l, pc, buffer)) {
				return l;
			}
		}
		ControlFlowLocation loc = ControlflowFactory.eINSTANCE
				.createControlFlowLocation();
		loc.setBuffer(buffer);
		loc.setPc(pc);
		loc.setDiagram(diag);
		loc.setBlockLabel(blockLabel);
		return loc;
	}

	/**
	 * @param diag
	 * @param i
	 * @return
	 */
	private Transition createTransition(ControlFlowDiagram diag, Instruction i) {
		Transition transition = ControlflowFactory.eINSTANCE.createTransition();
		transition.setInstruction(i);
		transition.setDiagram(diag);
		return transition;
	}

	/**
	 * @param diag
	 * @param i
	 * @return
	 */
	private Transition createFlushTransition(ControlFlowDiagram diag) {
		FlushTransition transition = ControlflowFactory.eINSTANCE.createFlushTransition();
		transition.setDiagram(diag);
		return transition;
	}

	private Transition createEarlyReadTransition(ControlFlowDiagram cfg, Load nextInstruction,
			String assignmentExpression) {
		EarlyReadTransition transition = ControlflowFactory.eINSTANCE.createEarlyReadTransition();
		transition.setInstruction(nextInstruction);
		transition.setAssignmentExpression(assignmentExpression);
		transition.setDiagram(cfg);
		return transition;
	}

	private WriteDefChainTransition createWriteDefChainTransition(ControlFlowDiagram cfg, Instruction nextInstruction) {
		WriteDefChainTransition transition = ControlflowFactory.eINSTANCE.createWriteDefChainTransition();
		transition.setDiagram(cfg);
		transition.setInstruction(nextInstruction);
		return transition;
	}

	private boolean instructionIsWriteDefChain(List<Transition> wdcInScGraph, ControlFlowLocation toExplore, Instruction store ){
		for(Transition t : wdcInScGraph){
			if(t.getInstruction().equals(store) 
					&& t.getSource().getPc() == toExplore.getPc()
					&& t.getTarget().getPc() == toExplore.getPc() + 1){
				return true;
			}
		}
		return false;
	}
	
	private String instructionIsEarlyRead(List<Transition> earlyReadsInFunction, ControlFlowLocation toExplore,
			Instruction nextInstruction) {
		for (Transition transition : earlyReadsInFunction) {
			if (transition.getSource().getPc() == toExplore.getPc()
					&& transition.getTarget().getPc() == toExplore.getPc() + 1
					&& transition.getInstruction().equals(nextInstruction)) {
				if (nextInstruction instanceof Load) {
					Load earlyReadInstruction = (Load) nextInstruction;
					// now check if it is indeed an early read
					EList<AddressValuePair> avpList = toExplore.getBuffer().getAddressValuePairs();
					ListIterator<AddressValuePair> it = avpList.listIterator(avpList.size());
					//newest entries first
					while (it.hasPrevious()) {
						AddressValuePair avp = (AddressValuePair) it.previous();
						if (avp.getAddress().getValue() instanceof AddressUse
								&& earlyReadInstruction.getAddress().getValue() instanceof AddressUse) {
							AddressUse avpAddress = (AddressUse) avp.getAddress().getValue();
							AddressUse earlyReadAddress = (AddressUse) earlyReadInstruction.getAddress().getValue();
							if (avpAddress.getAddress().equals(earlyReadAddress.getAddress())) {
								Value value = avp.getValue().getValue();
								if (value instanceof AddressUse) {
									return ((AddressUse) value).getAddress().getName();
								}
								if(value instanceof Constant){
									return ((Constant) value).getValue().toString();
								}
								if(value instanceof PrimitiveValue){
									return ((PrimitiveValue)value).getValue();
								}
								return "TODO";
							}
						}
					}
				}
			}
		}
		// no early read
		return null;
	}

	/**
	 * @return the writeDefMap
	 */
	public HashMap<Address, Address> getWriteDefMap() {
		return writeDefMap;
	}

	private void reportLoopWithoutFence(String functionName, ControlFlowLocation locBeforeLatesFence,
			ControlFlowLocation nextLocAfterWrite, Instruction instruction) {
		String error = functionName + " - between " + util.getBufferAsString(locBeforeLatesFence) + " and "
				+ util.getBufferAsString(nextLocAfterWrite) + " caused by " + instruction.toString() + "\n";
		if (!placesInLoopWithoutFence.contains(error)) {
			placesInLoopWithoutFence.add(error);
		}
	}

	public String getWarnings() {

		String error = null;

		if (!placesInLoopWithoutFence.isEmpty()) {
			error = "Loops without fence have been found at: \n";
			for (String s : placesInLoopWithoutFence) {
				error += s + "\n";
			}
			error += "\n";
		}

		return error;
	}
}
