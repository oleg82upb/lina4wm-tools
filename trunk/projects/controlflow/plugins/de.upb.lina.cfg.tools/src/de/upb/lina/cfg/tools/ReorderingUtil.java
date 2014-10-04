package de.upb.lina.cfg.tools;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.swing.JOptionPane;

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
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;

public class ReorderingUtil {
	private List<Instruction> instructions = new ArrayList<Instruction>();
	private List<ControlFlowLocation> processed = new ArrayList<ControlFlowLocation>();
	
	private GraphUtility util = new GraphUtility();

	private FunctionDefinition function;
	private boolean endProcess = false;
	private WarningLogger warningLogger;
	private boolean loopWithoutFence = false;


	public ControlFlowDiagram createReachibilityGraph(FunctionDefinition function, WarningLogger warningLogger){
		instructions = new ArrayList<Instruction>();
		this.function = function;
		this.warningLogger = warningLogger;
		ProgramCounter pc = new ProgramCounter();
		ControlFlowDiagram cfg = ControlflowFactory.eINSTANCE
				.createControlFlowDiagram();

		cfg.setName(function.getAddress().getName());
		List<ControlFlowLocation> toBeProcessed = new ArrayList<ControlFlowLocation>();
		processed = new ArrayList<ControlFlowLocation>();

		//Generate a list of all instructions
		EList<BasicBlock> blocks = function.getBody().getBlocks();
		for (BasicBlock b : blocks) {
			for(Instruction i: b.getInstructions()){
				instructions.add(i);
			}
		}

		//first node
		ControlFlowLocation location = createControlFlowLocation(cfg, pc.next(), ControlflowFactory.eINSTANCE.createStoreBuffer(), util.findLabelByInstruction(function,instructions.get(0)));
		if (cfg.getStart() == null) {
			cfg.setStart(location);
			toBeProcessed.add(location);
		}
		
		
		//while we have still nodes to work on
		while(!toBeProcessed.isEmpty() && !endProcess){
			ControlFlowLocation toExplore = toBeProcessed.get(0);

			//get the right instruction of our pc, null if we are at the end
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
				//possible flushes after a return
				if(nextInstruction == null){
					warningLogger.logUnflushedBuffer(function.getAddress().getName());
				}
				//create flush options, TSO behavior
				addFlushOptions(cfg, toBeProcessed, toExplore, nextInstruction);

				//create normal SC behavior
				if(nextInstruction != null && !isSynch(nextInstruction)){
					//other options -SC
					addNonFlushOptions(pc, cfg, toBeProcessed, toExplore, nextInstruction);
					System.out.println(!isSynch(nextInstruction));
				}
			}
			//last
			ControlFlowLocation lastProcessed = toBeProcessed.get(0);
			toBeProcessed.remove(0);
			processed.add(lastProcessed);
		}
		
		return cfg;

	}


	private void addFlushOptions(ControlFlowDiagram cfg,
			List<ControlFlowLocation> toBeProcessed,
			ControlFlowLocation toExplore, Instruction nextInstruction) {
		
		ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc(), createFlushedStoreBuffer(toExplore.getBuffer()), util.findLabelByInstruction(function, nextInstruction));
		Transition transition = createFlushTransition(cfg);
		transition.setSource(toExplore);
		transition.setTarget(nextLocation);

		if(!util.isInList(toBeProcessed,nextLocation) && !util.isInList(processed,nextLocation)){
			toBeProcessed.add(nextLocation);	
		}
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

				Instruction trueInstruction = util.getInstructionWithLabel(function, branch.getDestination().substring(1));
				ControlFlowLocation trueLocation = createControlFlowLocation(cfg, util.getPcOfInstruction(trueInstruction, instructions), createStoreBuffer(toExplore.getBuffer(), trueInstruction), util.findLabelByInstruction(function, nextInstruction));
				trueCase.setSource(toExplore);
				trueCase.setTarget(trueLocation);
				trueCase.setInstruction(branch);
				trueCase.setCondition("["+ util.valueToString(branch.getCondition()) + "]");
				trueCase.setDiagram(cfg);

				Instruction elseInstruction = util.getInstructionWithLabel(function, branch.getElseDestination().substring(1));
				ControlFlowLocation falseLocation = createControlFlowLocation(cfg, util.getPcOfInstruction(elseInstruction, instructions), createStoreBuffer(toExplore.getBuffer(), elseInstruction), util.findLabelByInstruction(function, nextInstruction));
				GuardedTransition falseCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
				falseCase.setSource(toExplore);
				falseCase.setTarget(falseLocation);
				falseCase.setInstruction(branch);
				falseCase.setCondition("[else]");
				falseCase.setDiagram(cfg);

				if(!util.isInList(toBeProcessed,trueLocation) && !util.isInList(processed,trueLocation)){
					toBeProcessed.add(trueLocation);
				}
				if(!util.isInList(toBeProcessed,falseLocation) && !util.isInList(processed,falseLocation)){
					toBeProcessed.add(falseLocation);
				}
			}

			//jump
			//&& branch.getElseDestination() == null
			else if(branch.getDestination() != null){
				Transition t = createTransition(cfg, branch);
				Instruction trueInstruction = util.getInstructionWithLabel(function, branch.getDestination().substring(1));
				ControlFlowLocation nextLocation = createControlFlowLocation(cfg, util.getPcOfInstruction(trueInstruction, instructions), createStoreBuffer(toExplore.getBuffer(), branch), util.findLabelByInstruction(function, nextInstruction));
				t.setSource(toExplore);
				t.setTarget(nextLocation);
				if(!util.isInList(toBeProcessed,nextLocation) && !util.isInList(processed,nextLocation)){
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
			//normal writes will be dealt here
			
			Transition t = createTransition(cfg, nextInstruction);
			ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc()+1, createStoreBuffer(toExplore.getBuffer(), nextInstruction), util.findLabelByInstruction(function, nextInstruction));
			t.setSource(toExplore);
			t.setTarget(nextLocation);
			
			//if we have a write we have to check if we have a loop without fence 
			//See createStoreBuffer for more details
			if(loopWithoutFence){
				loopWithoutFence = false;
				warningLogger.logPlaceInLoopWithoutFence(function.getAddress().getName(), toExplore, nextLocation, nextInstruction);
			}
			
			if(!util.isInList(toBeProcessed,nextLocation) && !util.isInList(processed,nextLocation)){
				toBeProcessed.add(nextLocation);
			}
		}
	}

	private boolean isSynch(Instruction instruction){
		return (instruction.eClass().equals(LlvmPackage.eINSTANCE.getFence()) || instruction.eClass().equals(LlvmPackage.eINSTANCE.getCmpXchg()));
	}

	private StoreBuffer createStoreBuffer(StoreBuffer oldBuffer, Instruction nextInstruction){
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		//create deep copy
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
			if(!util.isAVPInList(buffer.getAddressValuePairs(), newPair)){
				buffer.getAddressValuePairs().add(newPair);
			}else{
				//TODO: Error handling - loop without fence
				loopWithoutFence = true;
			}

		}

		return buffer;
	}

	/**
	 * Creates a deep copy of the old buffer without its first entry (flushed)
	 * @param oldBuffer the buffer to be flushed
	 * @return flushed deep copy of the old buffer
	 */
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
			ControlFlowDiagram diag, int pc, StoreBuffer buffer, String blockLabel) {
		for(ControlFlowLocation l: diag.getLocations()){
			if(util.isCorrectLocation(l, pc, buffer)){
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
}
