package de.upb.lina.cfg.tools.strategies;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.IGraphGenerator;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.SwitchCase;

public class SCUtil implements IGraphGenerator{
	private List<Instruction> instructions; 
	private List<ControlFlowLocation> processed;
	private FunctionDefinition function;
	
	public SCUtil(FunctionDefinition function)
	{
		this.function = function;
		this.instructions = new ArrayList<Instruction>();
		this.processed = new ArrayList<ControlFlowLocation>();
	}
	

	public ControlFlowDiagram createGraph()
	{
		ControlFlowDiagram cfg = ControlflowFactory.eINSTANCE.createControlFlowDiagram();
		cfg.setName(function.getAddress().getName());
		List<ControlFlowLocation> toBeProcessed = new ArrayList<ControlFlowLocation>();

		// Generate a list of all instructions
		EList<BasicBlock> blocks = function.getBody().getBlocks();
		for (BasicBlock b : blocks)
		{
			for (Instruction i : b.getInstructions())
			{
				instructions.add(i);
			}
		}

		// first node
		ControlFlowLocation location = createControlFlowLocation(cfg, 0,
				ControlflowFactory.eINSTANCE.createStoreBuffer(),
				GraphUtility.findLabelByInstruction(function, instructions.get(0)));
		cfg.setStart(location);
		toBeProcessed.add(location);

		// while we have still nodes to work on
		while (!toBeProcessed.isEmpty())
		{
			ControlFlowLocation toExplore = toBeProcessed.get(0);

			// get the right instruction of our pc, null if we are at the end
			Instruction nextInstruction = null;
			if (toExplore.getPc() < instructions.size())
			{
				nextInstruction = instructions.get(toExplore.getPc());
			}

			// empty buffer
			if (toExplore.getBuffer().getAddressValuePairs().isEmpty())
			{
				if (nextInstruction != null)
				{
					addNonFlushTransitions(cfg, toBeProcessed, toExplore, nextInstruction);
				}
			}
			// last
			ControlFlowLocation lastProcessed = toBeProcessed.get(0);
			toBeProcessed.remove(0);
			processed.add(lastProcessed);
		}

		return cfg;
	}
	
	private void addNonFlushTransitions(ControlFlowDiagram cfg,
			List<ControlFlowLocation> toBeProcessed,
			ControlFlowLocation toExplore, Instruction nextInstruction) {

		//check for branches
		if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getBranch())){
			Branch branch = (Branch)nextInstruction;
			//no jump, real branch
			if(branch.getElseDestination() != null){
				GuardedTransition trueCase = ControlflowFactory.eINSTANCE.createGuardedTransition();

				Instruction trueInstruction = GraphUtility.getInstructionWithLabel(function, branch.getDestination().substring(1));
				ControlFlowLocation trueLocation = createControlFlowLocation(cfg, GraphUtility.getPcOfInstruction(trueInstruction, instructions), createStoreBuffer(toExplore.getBuffer(), trueInstruction), GraphUtility.findLabelByInstruction(function, nextInstruction));
				trueCase.setSource(toExplore);
				trueCase.setTarget(trueLocation);
				trueCase.setInstruction(branch);
				trueCase.setCondition("["+ GraphUtility.valueToString(branch.getCondition()) + "]");
				trueCase.setDiagram(cfg);

				Instruction elseInstruction = GraphUtility.getInstructionWithLabel(function, branch.getElseDestination().substring(1));
				ControlFlowLocation falseLocation = createControlFlowLocation(cfg, GraphUtility.getPcOfInstruction(elseInstruction, instructions), createStoreBuffer(toExplore.getBuffer(), elseInstruction), GraphUtility.findLabelByInstruction(function, nextInstruction));
				GuardedTransition falseCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
				falseCase.setSource(toExplore);
				falseCase.setTarget(falseLocation);
				falseCase.setInstruction(branch);
				falseCase.setCondition("[else]");
				falseCase.setDiagram(cfg);

				if(!GraphUtility.isInList(toBeProcessed,trueLocation) && !GraphUtility.isInList(processed,trueLocation)){
					toBeProcessed.add(trueLocation);
				}
				if(!GraphUtility.isInList(toBeProcessed,falseLocation) && !GraphUtility.isInList(processed,falseLocation)){
					toBeProcessed.add(falseLocation);
				}
			}

			//jump
			//&& branch.getElseDestination() == null
			else if(branch.getDestination() != null){
				Transition t = createTransition(cfg, branch);
				Instruction trueInstruction = GraphUtility.getInstructionWithLabel(function, branch.getDestination().substring(1));
				ControlFlowLocation nextLocation = createControlFlowLocation(cfg, GraphUtility.getPcOfInstruction(trueInstruction, instructions), createStoreBuffer(toExplore.getBuffer(), branch), GraphUtility.findLabelByInstruction(function, nextInstruction));
				t.setSource(toExplore);
				t.setTarget(nextLocation);
				if(!GraphUtility.isInList(toBeProcessed,nextLocation) && !GraphUtility.isInList(processed,nextLocation)){
					toBeProcessed.add(nextLocation);
				}
			}
		}else if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getSwitch())){
			//TODO: check if switch implementation correct
			Switch swit = (Switch)nextInstruction;
			
			Instruction defaultInstruction = GraphUtility.getInstructionWithLabel(function, swit.getDefaultCase().substring(1));
			ControlFlowLocation defaultLocation = createControlFlowLocation(cfg, GraphUtility.getPcOfInstruction(defaultInstruction, instructions), createStoreBuffer(toExplore.getBuffer(), defaultInstruction), GraphUtility.findLabelByInstruction(function, nextInstruction));
			
			GuardedTransition defaultCase = ControlflowFactory.eINSTANCE.createGuardedTransition();
			defaultCase.setCondition("else");
			defaultCase.setSource(toExplore);
			defaultCase.setTarget(defaultLocation);
			defaultCase.setDiagram(cfg);
			defaultCase.setInstruction(swit);
			
			if(!GraphUtility.isInList(toBeProcessed,defaultLocation) && !GraphUtility.isInList(processed,defaultLocation)){
				toBeProcessed.add(defaultLocation);
			}
			
			for(SwitchCase sc: swit.getCases()){
				Instruction caseInstruction = GraphUtility.getInstructionWithLabel(function, sc.getDestination().substring(1));
				ControlFlowLocation caseLocation = createControlFlowLocation(cfg, GraphUtility.getPcOfInstruction(caseInstruction, instructions), createStoreBuffer(toExplore.getBuffer(), caseInstruction), GraphUtility.findLabelByInstruction(function, nextInstruction));
				
				GuardedTransition caseC = ControlflowFactory.eINSTANCE.createGuardedTransition();
				caseC.setCondition(GraphUtility.valueToString(sc.getCaseValue().getValue()));
				caseC.setSource(toExplore);
				caseC.setTarget(caseLocation);
				caseC.setInstruction(swit);
				caseC.setDiagram(cfg);
				
				if(!GraphUtility.isInList(toBeProcessed,caseLocation) && !GraphUtility.isInList(processed,caseLocation)){
					toBeProcessed.add(caseLocation);
				}
			}
		}else if(nextInstruction.eClass().equals(LlvmPackage.eINSTANCE.getIndirectBranch())){
			// TODO: target depends on register content -> condition of
			// control flow guards unclear
			throw new RuntimeException(
					"IndirectBranch found. Handling of such is not implemented yet");
		}else{
			//normal writes will be dealt here
			
			Transition t = createTransition(cfg, nextInstruction);
			ControlFlowLocation nextLocation = createControlFlowLocation(cfg, toExplore.getPc()+1, createStoreBuffer(toExplore.getBuffer(), nextInstruction), GraphUtility.findLabelByInstruction(function, nextInstruction));
			t.setSource(toExplore);
			t.setTarget(nextLocation);
			
			if(!GraphUtility.isInList(toBeProcessed,nextLocation) && !GraphUtility.isInList(processed,nextLocation)){
				toBeProcessed.add(nextLocation);
			}
		}
	}

	private StoreBuffer createStoreBuffer(StoreBuffer oldBuffer, Instruction nextInstruction){
		StoreBuffer buffer = ControlflowFactory.eINSTANCE.createStoreBuffer();
		//create deep copy
		for (AddressValuePair pair : oldBuffer.getAddressValuePairs())
		{
			AddressValuePair newPair = ControlflowFactory.eINSTANCE.createAddressValuePair();
			newPair.setAddress(pair.getAddress());
			newPair.getValues().addAll(pair.getValues());
			buffer.getAddressValuePairs().add(newPair);
		}

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
			if(GraphUtility.isRepresentedBy(l, pc, buffer)){
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


	@Override
	public String getWarnings()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
