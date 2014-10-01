package de.upb.lina.cfg.tools;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.SwitchCase;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;

public class ReorderingUtil {
	private List<Instruction> instructions = new ArrayList<Instruction>();
	private List<ControlFlowLocation> processed = new ArrayList<ControlFlowLocation>();
		
	private FunctionDefinition function;


	public ControlFlowDiagram createReachibilityGraph(FunctionDefinition function){
		instructions = new ArrayList<Instruction>();
		this.function = function;
		ProgramCounter pc = new ProgramCounter();
		ControlFlowDiagram cfg = ControlflowFactory.eINSTANCE
				.createControlFlowDiagram();

		cfg.setName(function.getAddress().getName());
		List<ControlFlowLocation> toBeProcessed = new ArrayList<ControlFlowLocation>();
		processed = new ArrayList<ControlFlowLocation>();


		EList<BasicBlock> blocks = function.getBody().getBlocks();
		for (BasicBlock b : blocks) {
			for(Instruction i: b.getInstructions()){
				instructions.add(i);
			}
		}

		//first node
		ControlFlowLocation location = createControlFlowLocation(cfg, pc.next(), ControlflowFactory.eINSTANCE.createStoreBuffer());
		if (cfg.getStart() == null) {
			cfg.setStart(location);
			toBeProcessed.add(location);
		}

		//while we have still nodes to work on
		while(!toBeProcessed.isEmpty()){
			ControlFlowLocation toExplore = toBeProcessed.get(0);

			Instruction nextInstruction = null;
			if(toExplore.getPc()<instructions.size()){
				nextInstruction = instructions.get(toExplore.getPc());	
			}
			

			//empty buffer
			if(toExplore.getBuffer().getAddressValuePairs().isEmpty()){
				if(nextInstruction != null){
					addNonFlushOptions(pc, cfg, toBeProcessed, toExplore, nextInstruction);
				}

			//buffer with entries
			}else{
				//if its synching or at the end just do x flushes
				//nextInstruction == null
				//nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getReturn())
				if(nextInstruction == null || isSynch(nextInstruction)){
					ControlFlowLocation last = toExplore;
					
//					for(int i =0; i<toExplore.getBuffer().getAddressValuePairs().size(); i++){
//						ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc(), createFlushedStoreBuffer(last.getBuffer()));
//						Transition transition = createFlushTransition(cfg);
//						transition.setSource(last);
//						transition.setTarget(nextLocation);
//						last = nextLocation;
//					}
					
					//if there are no new instructions coming we are at the end
//					if(nextInstruction != null){
//						if(!isInList(toBeProcessed,last) && !isInList(processed,last)){
//							toBeProcessed.add(last);	
//						}
//					}
					
					ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc(), createFlushedStoreBuffer(last.getBuffer()));
					Transition transition = createFlushTransition(cfg);
					transition.setSource(last);
					transition.setTarget(nextLocation);
					
					if(!isInList(toBeProcessed,nextLocation) && !isInList(processed,nextLocation)){
						toBeProcessed.add(nextLocation);	
					}
					
					

				//not synching -> we have to implement SC and possible flush
				}else{

					//flush transition
					ControlFlowLocation flushLocation = createControlFlowLocation(cfg, toExplore.getPc(), createFlushedStoreBuffer(toExplore.getBuffer()));
					Transition transition = createFlushTransition(cfg);
					transition.setSource(toExplore);
					transition.setTarget(flushLocation);
					if(!isInList(toBeProcessed,flushLocation) && !isInList(processed,flushLocation)){
						toBeProcessed.add(flushLocation);
					}

					//other options -SC
					addNonFlushOptions(pc, cfg, toBeProcessed, toExplore, nextInstruction);
				}
			}
			//last
			ControlFlowLocation lastProcessed = toBeProcessed.get(0);
			toBeProcessed.remove(0);
			processed.add(lastProcessed);
		}
		
		return cfg;

	}


	private void addNonFlushOptions(ProgramCounter pc, ControlFlowDiagram cfg,
			List<ControlFlowLocation> toBeProcessed,
			ControlFlowLocation toExplore, Instruction nextInstruction) {
		
		//check for branches
		if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getBranch())){
			Branch branch = (Branch)nextInstruction;
			//no jump, real branch
			if(branch.getElseDestination() != null){
				GuardedTransition trueCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
				
				Instruction trueInstruction = getInstructionWithLabel(function, branch.getDestination().substring(1));
				ControlFlowLocation trueLocation = createControlFlowLocation(cfg, getPcOfInstruction(trueInstruction), createStoreBuffer(toExplore.getBuffer(), trueInstruction));
				trueCase.setSource(toExplore);
				trueCase.setTarget(trueLocation);
				trueCase.setInstruction(branch);
				trueCase.setCondition("["+ valueToString(branch.getCondition()) + "]");
                
				trueCase.setDiagram(cfg);
				
				Instruction elseInstruction = getInstructionWithLabel(function, branch.getElseDestination().substring(1));
				ControlFlowLocation falseLocation = createControlFlowLocation(cfg, getPcOfInstruction(elseInstruction), createStoreBuffer(toExplore.getBuffer(), elseInstruction));
				GuardedTransition falseCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
				falseCase.setSource(toExplore);
				falseCase.setTarget(falseLocation);
				falseCase.setInstruction(branch);
				falseCase.setCondition("[else]");
				falseCase.setDiagram(cfg);
				
				if(!isInList(toBeProcessed,trueLocation) && !isInList(processed,trueLocation)){
					toBeProcessed.add(trueLocation);
				}
				if(!isInList(toBeProcessed,falseLocation) && !isInList(processed,falseLocation)){
					toBeProcessed.add(falseLocation);
				}
			}
			
			//jump
			if(branch.getDestination() != null && branch.getElseDestination() == null){
				//THIS SHIT MAKES PROBLEMS!!!!11111
				//tobeProcessed becomes fuller and fuller and i do not know why yet
				Transition t = createTransition(cfg, branch);
				Instruction trueInstruction = getInstructionWithLabel(function, branch.getDestination().substring(1));
				ControlFlowLocation nextLocation = createControlFlowLocation(cfg, getPcOfInstruction(trueInstruction), createStoreBuffer(toExplore.getBuffer(), branch));
				t.setSource(toExplore);
				t.setTarget(nextLocation);
				if(!isInList(toBeProcessed,nextLocation) && !isInList(processed,nextLocation)){
					toBeProcessed.add(nextLocation);
				}
			}
		}else if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getSwitch())){
			//TODO: add support for switches
			
		}else if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getIndirectBranch())){
			// TODO: target depends on register content -> condition of
			// control flow guards unclear
			throw new RuntimeException(
					"IndirectBranch found. Handling of such is not implemented yet");
		}else{
			Transition t = createTransition(cfg, nextInstruction);
			ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc()+1, createStoreBuffer(toExplore.getBuffer(), nextInstruction));
			t.setSource(toExplore);
			t.setTarget(nextLocation);
			if(!isInList(toBeProcessed,nextLocation) && !isInList(processed,nextLocation)){
				toBeProcessed.add(nextLocation);
			}
		}
	}
	
	public int getPcOfInstruction(Instruction instruction){
		for(int i = 0; i<instructions.size(); i++){
			Instruction inst = instructions.get(i);
			if(inst.equals(instruction)){
				return i;
			}
		}
		
		return -1;
	}

	//TODO: Add other synching instructions
	private boolean isSynch(Instruction instruction){
		return ( instruction.eClass().equals(LlvmPackage.eINSTANCE.getFence()) || instruction.eClass().equals(LlvmPackage.eINSTANCE.getCmpXchg()));
	}

	private StoreBuffer createStoreBuffer(StoreBuffer oldBuffer, Instruction nextInstruction){
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		for(AddressValuePair pair: oldBuffer.getAddressValuePairs()){
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setAddress(pair.getAddress());
			newPair.setValue(pair.getValue());
			buffer.getAddressValuePairs().add(newPair);
		}

		//add new buffer entry for store
		if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getStore())){
			Store store = (Store)nextInstruction;
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setAddress(store.getTargetAddress());
			newPair.setValue(store.getValue());
			if(!isAVPInList(buffer.getAddressValuePairs(), newPair)){
				buffer.getAddressValuePairs().add(newPair);
			}

		}


		return buffer;
	}

	private StoreBuffer createFlushedStoreBuffer(StoreBuffer oldBuffer){
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		for(AddressValuePair pair: oldBuffer.getAddressValuePairs()){
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setAddress(pair.getAddress());
			newPair.setValue(pair.getValue());
			buffer.getAddressValuePairs().add(newPair);
		}
		buffer.getAddressValuePairs().remove(0);

		return buffer;
	}


	/**
	 * @param diag
	 * @param pc
	 * @return
	 */
	private ControlFlowLocation createControlFlowLocation(
			ControlFlowDiagram diag, int pc, StoreBuffer buffer) {
		for(ControlFlowLocation l: diag.getLocations()){
			if(isCorrectLocation(l, pc, buffer)){
				return l;
			}
		}
		ControlFlowLocation loc = ControlflowFactory.eINSTANCE
				.createControlFlowLocation();
		loc.setBuffer(buffer);
		loc.setPc(pc);
		loc.setDiagram(diag);
		return loc;
	}
	
	private boolean isCorrectLocation(ControlFlowLocation l, int pc, StoreBuffer buffer){
		if(l.getPc() == pc){
			EList<AddressValuePair>pairsOfLocation = l.getBuffer().getAddressValuePairs();
			EList<AddressValuePair>pairsOfCreatedBuffer = buffer.getAddressValuePairs();
			if(pairsOfLocation.size() != pairsOfCreatedBuffer.size()){
				return false;
			}
			for(AddressValuePair p: pairsOfCreatedBuffer){
				for(AddressValuePair p2: pairsOfLocation){
					Comparator<AddressValuePair> comparator = new Comparator<AddressValuePair>() {

						@Override
						public int compare(AddressValuePair o1, AddressValuePair o2) {
							if(addValue(o1.getAddress().getValue()).compareToIgnoreCase(addValue(o2.getAddress().getValue())) != 0){
									
								return -2;
							}
							
							if(addValue(o1.getValue().getValue()).compareToIgnoreCase(addValue(o2.getValue().getValue()))!= 0){
								return 2;
							}
							
							return 0;
						}
						
						private String addValue(Value value) {
							String result = "";
							
							if(value instanceof AddressUseImpl){
								AddressUseImpl aui = (AddressUseImpl)value;
								result +=aui.getAddress().getName();
							}

							else if (value.eClass().equals(LlvmPackage.eINSTANCE.getConstant())) {
								Constant constant = (Constant) value;
								result += constant.getValue();
							}
							
							return (result);
						}
						
					};
					
					if(comparator.compare(p, p2) != 0){
						return false;
					}
				}
			}
		}else{
			return false;
		}
		return true;
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
	
	
	/**
	 * Searches for the block with label destLabel and returns preceeding
	 * location of the transition that is corresponding to the first instruction
	 * of the block.
	 * 
	 * @param cfg
	 * @param function
	 * @param destLabel
	 * @return
	 */
	private ControlFlowLocation findLabeledLocation(ControlFlowDiagram cfg,
			FunctionDefinition function, String destLabel) {
		Instruction dest = getInstructionWithLabel(function, destLabel);
		Transition destTrans = findCorrespondingTransition(cfg, dest);
		return destTrans.getSource();
	}
	
	/**
	 * 
	 * @param cfg
	 * @param i
	 * @return CFG transition corresponding to instruction i
	 */
	private Transition findCorrespondingTransition(ControlFlowDiagram cfg,
			Instruction i) {
		for (Transition t : cfg.getTransitions()) {
			if (i.equals(t.getInstruction())) {
				return t;
			}
		}
		return null;
	}
	
	/**
	 * @param function
	 * @param destLabel
	 * @return instruction corresponding to the label
	 */
	private Instruction getInstructionWithLabel(FunctionDefinition function,
			String destLabel) {
		for (BasicBlock b : function.getBody().getBlocks()) {
			if (destLabel.equals(b.getLabel())) {
				return b.getInstructions().get(0);
			}
		}
		return null;
	}
	
	
	private String valueToString(Value value) {
		if (value.eClass().equals(LlvmPackage.eINSTANCE.getConstant())) {
			Constant constant = (Constant) value;
			return constant.getValue().toString();
		}

		if (value instanceof AddressUseImpl) {
			AddressUseImpl aui = (AddressUseImpl) value;
			return aui.getAddress().getName();
		}
		return value.toString();
	}
	
	private boolean isInList(List<ControlFlowLocation> list, ControlFlowLocation location){
		for(ControlFlowLocation loc: list){
			if(isCorrectLocation(location, loc.getPc(), loc.getBuffer())){
				return true;
			}
		}
		return false;
	}
	
	private boolean isAVPInList(List<AddressValuePair> list, AddressValuePair pair){
		Comparator<AddressValuePair> comparator = new Comparator<AddressValuePair>() {

			@Override
			public int compare(AddressValuePair o1, AddressValuePair o2) {
				if(addValue(o1.getAddress().getValue()).compareToIgnoreCase(addValue(o2.getAddress().getValue())) != 0){
						
					return -2;
				}
				
				if(addValue(o1.getValue().getValue()).compareToIgnoreCase(addValue(o2.getValue().getValue()))!= 0){
					return 2;
				}
				
				return 0;
			}
			
			private String addValue(Value value) {
				String result = "";
				
				if(value instanceof AddressUseImpl){
					AddressUseImpl aui = (AddressUseImpl)value;
					result +=aui.getAddress().getName();
				}

				else if (value.eClass().equals(LlvmPackage.eINSTANCE.getConstant())) {
					Constant constant = (Constant) value;
					result += constant.getValue();
				}
				
				return (result);
			}
			
		};
		
		for(AddressValuePair p: list){
			if(comparator.compare(p, pair) == 0){
				return true;
			}
		}
		return false;
	}
}
