package de.upb.lina.cfgwizard;

import java.util.ArrayList;
import java.util.Collections;
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
	private List<ControlFlowLocation> createdLocs = new ArrayList<ControlFlowLocation>();
	private List<Transition> createdTransitions = new ArrayList<Transition>();
	private List<Instruction> instructions = new ArrayList<Instruction>();
	
	private FunctionDefinition function;

	public void addTSO(ArrayList<ControlFlowDiagram> list) {
//		for (ControlFlowDiagram cfg : list) {
//			ControlFlowLocation start = cfg.getStart();
//			Set<Transition> may = new TreeSet<Transition>();
//			ControlFlowLocation act = start;
//			while (!act.getOutgoing().isEmpty()) {
//
//			}
//		}
	}


	public ControlFlowDiagram createReachibilityGraph(FunctionDefinition function){
		instructions = new ArrayList<Instruction>();
		this.function = function;
		ProgramCounter pc = new ProgramCounter();
		ControlFlowDiagram cfg = ControlflowFactory.eINSTANCE
				.createControlFlowDiagram();

		cfg.setName(function.getAddress().getName());
		List<ControlFlowLocation> toBeProcessed = new ArrayList<ControlFlowLocation>();


		EList<BasicBlock> blocks = function.getBody().getBlocks();
		for (BasicBlock b : blocks) {
			for(Instruction i: b.getInstructions()){
				instructions.add(i);
			}
		}
		System.out.println(instructions.size());

		//first node
		ControlFlowLocation location = createControlFlowLocation(cfg, pc.next(), ControlflowFactory.eINSTANCE.createStoreBuffer());
		if (cfg.getStart() == null) {
			cfg.setStart(location);
			toBeProcessed.add(location);
		}

		//while we have still nodes to work on
		while(!toBeProcessed.isEmpty()){
			ControlFlowLocation toExplore = toBeProcessed.get(0);

			//TODO: find the end of the programm
			Instruction nextInstruction = null;
			if(toExplore.getPc()<instructions.size()){
				nextInstruction = instructions.get(toExplore.getPc());	
			}
			

			//empty buffer
			if(toExplore.getBuffer().getBuffer().isEmpty()){
				if(nextInstruction != null){
					addNonFlushOptions(pc, cfg, toBeProcessed, toExplore, nextInstruction);
				}

				//buffer with entries
			}else{
				//if its synching just do x flushes
				if(nextInstruction == null || isSynch(nextInstruction)){
					ControlFlowLocation last = toExplore;
					for(int i =0; i<toExplore.getBuffer().getBuffer().size(); i++){
						ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc(), createFlushedStoreBuffer(last.getBuffer()));
						Transition transition = createFlushTransition(cfg);
						transition.setSource(last);
						transition.setTarget(nextLocation);
						last = nextLocation;
					}
					if(!toBeProcessed.contains(last)){
						toBeProcessed.add(last);	
					}
				}else{
					//TODO: see if we have to flush anyway as we read a var that is not flushed yet

					//flush transition
					ControlFlowLocation flushLocation = createControlFlowLocation(cfg, toExplore.getPc(), createFlushedStoreBuffer(toExplore.getBuffer()));
					Transition transition = createFlushTransition(cfg);
					transition.setSource(toExplore);
					transition.setTarget(flushLocation);
					if(!toBeProcessed.contains(flushLocation)){
						toBeProcessed.add(flushLocation);
					}

					//other options
					if(nextInstruction != null){
						addNonFlushOptions(pc, cfg, toBeProcessed, toExplore, nextInstruction);
					}


					//
				}
			}
			System.out.println(toBeProcessed.size());
			//last
			toBeProcessed.remove(0);
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
				int pcInt = toExplore.getPc()+1;
				ControlFlowLocation trueLocation = createControlFlowLocation(cfg, pcInt, createStoreBuffer(toExplore.getBuffer(), getInstructionWithLabel(function, branch.getDestination().substring(1))));
				trueCase.setSource(toExplore);
				trueCase.setTarget(trueLocation);
				trueCase.setDiagram(cfg);
				
				ControlFlowLocation falseLocation = createControlFlowLocation(cfg, pcInt, createStoreBuffer(toExplore.getBuffer(), getInstructionWithLabel(function, branch.getDestination().substring(1))));
				GuardedTransition falseCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
				falseCase.setSource(toExplore);
				falseCase.setTarget(falseLocation);
				falseCase.setDiagram(cfg);
				
				if(!toBeProcessed.contains(trueLocation)){
					toBeProcessed.add(trueLocation);
				}
				if(!toBeProcessed.contains(falseLocation)){
					toBeProcessed.add(falseLocation);
				}
			}
				
			if(branch.getDestination() != null && branch.getElseDestination() == null){
				//THIS SHIT MAKES PROBLEMS!!!!11111
				//tobeProcessed becomes fuller and fuller and i do not know why yet
				Transition t = createTransition(cfg, nextInstruction);
				ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc()+1, createStoreBuffer(toExplore.getBuffer(), nextInstruction));
				t.setSource(toExplore);
				t.setTarget(nextLocation);
				if(!toBeProcessed.contains(nextLocation)){
					toBeProcessed.add(nextLocation);
				}
			}
		}else if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getSwitch())){
			
		}else if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getIndirectBranch())){
			
		}else{
			Transition t = createTransition(cfg, nextInstruction);
			ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc()+1, createStoreBuffer(toExplore.getBuffer(), nextInstruction));
			t.setSource(toExplore);
			t.setTarget(nextLocation);
			if(!toBeProcessed.contains(nextLocation)){
				toBeProcessed.add(nextLocation);
			}
		}
	}

	//TODO: Add other synching instructions
	private boolean isSynch(Instruction instruction){
		return ( instruction.eClass().equals(LlvmPackage.eINSTANCE.getFence()) || instruction.eClass().equals(LlvmPackage.eINSTANCE.getCmpXchg()));
	}

	private StoreBuffer createStoreBuffer(StoreBuffer oldBuffer, Instruction nextInstruction){
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		for(AddressValuePair pair: oldBuffer.getBuffer()){
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setMemAddress(pair.getMemAddress());
			newPair.setMemValue(pair.getMemValue());
			buffer.getBuffer().add(newPair);
		}

		//add new buffer entry for store
		if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getStore())){
			Store store = (Store)nextInstruction;
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setMemAddress(store.getTargetAddress());
			newPair.setMemValue(store.getValue());
			if(!buffer.getBuffer().contains(newPair)){
				buffer.getBuffer().add(newPair);
			}

		}


		return buffer;
	}

	private StoreBuffer createFlushedStoreBuffer(StoreBuffer oldBuffer){
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		for(AddressValuePair pair: oldBuffer.getBuffer()){
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setMemAddress(pair.getMemAddress());
			newPair.setMemValue(pair.getMemValue());
			buffer.getBuffer().add(newPair);
		}
		buffer.getBuffer().remove(0);

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
			if(l.getPc() == pc && l.getBuffer().getBuffer().equals(buffer.getBuffer())){
				return l;
			}
		}
		ControlFlowLocation loc = ControlflowFactory.eINSTANCE
				.createControlFlowLocation();
		loc.setPc(pc);
		loc.setBuffer(buffer);
		loc.setDiagram(diag);
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
}
