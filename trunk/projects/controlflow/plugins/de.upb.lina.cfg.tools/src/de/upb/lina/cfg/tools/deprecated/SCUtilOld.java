package de.upb.lina.cfg.tools.deprecated;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.MultiTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.ProgramCounter;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.SwitchCase;

public class SCUtilOld {
	private GraphUtility util = new GraphUtility();
	
	public ControlFlowDiagram createCFG(FunctionDefinition function) {
//		//START OF CORRECT
		ProgramCounter pc = new ProgramCounter();
		ControlFlowDiagram cfg = ControlflowFactory.eINSTANCE
				.createControlFlowDiagram();

		cfg.setName(function.getAddress().getName());

		//create the naive normal cfg
		EList<BasicBlock> blocks = function.getBody().getBlocks();
		for (BasicBlock b : blocks) {
			ControlFlowLocation location = createControlFlowLocation(cfg, pc);
			location.setBlockLabel(b.getLabel());
			if (cfg.getStart() == null) {
				cfg.setStart(location);
			}
			//correct
			for (Instruction instr : b.getInstructions()) {
				Transition t = createTransition(cfg, instr);
				ControlFlowLocation nextLocation = createControlFlowLocation(
						cfg, pc);
				nextLocation.setBlockLabel(b.getLabel());
				t.setSource(location);
				t.setTarget(nextLocation);
				location = nextLocation;
			}
		}

		ArrayList<Transition> newTransitions = new ArrayList<Transition>();
		for (Transition t : cfg.getTransitions()) {
			if (t.getInstruction() instanceof Branch) {
				Branch br = (Branch) t.getInstruction();
				//check Destination
				ControlFlowLocation target = util.findLabeledLocation(cfg, function,
						br.getDestination().substring(1));
				if (!t.getTarget().equals(target)) {
					t.setTarget(target);
				}
				
				
				if (br.getElseDestination() != null) {
					
					 // replace transition with guarded
                    GuardedTransition trueCase = ControlflowFactory.eINSTANCE
                                    .createGuardedTransition();
                    trueCase.setInstruction(t.getInstruction());
                    GuardedTransition elseCase = ControlflowFactory.eINSTANCE
                                    .createGuardedTransition();
                    elseCase.setInstruction(t.getInstruction());
                    newTransitions.add(trueCase);
                    newTransitions.add(elseCase);

                    trueCase.setSource(t.getSource());
                    elseCase.setSource(t.getSource());
                    trueCase.setCondition("["+ util.valueToString(br.getCondition()) + "]");
                    elseCase.setCondition("[else]");
                    t.setSource(null);
                    t.setTarget(null);

                    trueCase.setTarget(util.findLabeledLocation(cfg, function, br
                                    .getDestination().substring(1)));
                    elseCase.setTarget(util.findLabeledLocation(cfg, function, br
                                    .getElseDestination().substring(1)));
					
				}
			} else if (t.getInstruction() instanceof IndirectBranch) {
				// TODO: target depends on register content -> condition of
				// control flow guards unclear
				throw new RuntimeException(
						"IndirectBranch found. Handling of such is not implemented yet");
			} else if (t.getInstruction() instanceof Switch) {
				// replace normal transition by guarded one
				Switch sw = (Switch) t.getInstruction();
				GuardedTransition newT = ControlflowFactory.eINSTANCE
						.createGuardedTransition();
				newT.setCondition("else");
				newT.setSource(t.getSource());
				ControlFlowLocation defaultTarget = util.findLabeledLocation(cfg,
						function, sw.getDefaultCase().substring(1));
				newT.setTarget(defaultTarget);

				newTransitions.add(newT);

				// add other cases
				for (SwitchCase sc : sw.getCases()) {
					GuardedTransition otherCase = ControlflowFactory.eINSTANCE
							.createGuardedTransition();
					otherCase.setSource(t.getSource());
					otherCase.setCondition(util.valueToString(sc.getCaseValue()
							.getValue()));
					ControlFlowLocation target = util.findLabeledLocation(cfg,
							function, sc.getDestination().substring(1));
					otherCase.setTarget(target);

					newTransitions.add(otherCase);
				}

				// will be cleaned up later
				t.setSource(null);
				t.setTarget(null);

			} else if (t.getInstruction() instanceof Invoke) {
				// do nothing
			}
		} //end for 
		

		// has to be done separately in order to not modify collection while
		// iterating
		for (Transition t : newTransitions) {
			t.setDiagram(cfg);
		}

		cleanUp(cfg);
		return cfg;
	}

	/**
	 * Removes locations and transitions if not connected
	 * 
	 * @param cfl
	 */
	private void cleanUp(ControlFlowDiagram cfg) {
		ArrayList<ControlFlowLocation> locations = new ArrayList<ControlFlowLocation>();
		for (ControlFlowLocation location : cfg.getLocations()) {
			if (location.getIncoming().isEmpty()
					&& location.getOutgoing().isEmpty()) {
				locations.add(location);
			}
		}

		for (ControlFlowLocation location : locations) {
			location.setDiagram(null); // remove
		}

		ArrayList<Transition> transitions = new ArrayList<Transition>();
		for (Transition t : cfg.getTransitions()) {
			// should not happen
			if (t.getSource() == null || t.getTarget() == null) {
				transitions.add(t);
			}
		}
		for (Transition t : transitions) {
			t.setDiagram(null);
			t.setSource(null);
			t.setTarget(null);
		}
	}

	/**
	 * @param diag
	 * @param pc
	 * @return
	 */
	private ControlFlowLocation createControlFlowLocation(
			ControlFlowDiagram diag, ProgramCounter pc) {
		ControlFlowLocation loc = ControlflowFactory.eINSTANCE
				.createControlFlowLocation();
		loc.setPc(pc.next());
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
	
	private Transition createMultiTransition(ControlFlowDiagram diag, ArrayList <Instruction> instructions) {
		MultiTransition transition = ControlflowFactory.eINSTANCE.createMultiTransition();
		transition.getInstructions().addAll(instructions);
		transition.setDiagram(diag);
		return transition;
	}
}
