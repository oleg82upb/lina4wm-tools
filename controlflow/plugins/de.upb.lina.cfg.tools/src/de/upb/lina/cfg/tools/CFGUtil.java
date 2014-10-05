package de.upb.lina.cfg.tools;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.impl.BranchImpl;

public class CFGUtil {
//	public void deleteLooseGraphs(ArrayList<ControlFlowDiagram> list) {
//		for (ControlFlowDiagram cfg : list) {
//			ControlFlowLocation loose = findLooseGraph(cfg);
//			while (loose != null) {
//				EList<Transition> saveT = loose.getOutgoing();
//				for (Transition t : saveT) {
//					deleteTransition(t);
//				}
//				deleteLoc(loose);
//				loose = findLooseGraph(cfg);
//			}
//		}
//	}
//
//	/**FIXME ConcurrentModificationException
//	 * @param cfgs
//	 */
//	public void removeSingleBranches(ArrayList<ControlFlowDiagram> cfgs) {
//		for (ControlFlowDiagram cfg : cfgs) {
//			EList<Transition> list = cfg.getTransitions();
//			for (int i = 0; i < list.size(); i++) {
//				Transition transition = list.get(i);
//				if (transition.getInstruction() instanceof BranchImpl) {
//					if (((Branch) transition.getInstruction()).getDestination() != null) {
//						for (Transition tr1 : transition.getSource().getIncoming()) {
//							tr1.setTarget(transition.getTarget());
//							transition.getTarget().getIncoming().add(tr1);
//						}
//						if (cfg.getStart() == transition.getSource()){
//							cfg.setStart(transition.getTarget());
//						}
//						transition.getSource().getIncoming().clear();
//						transition.getSource().setDiagram(null);
//						transition.getSource().getOutgoing().clear();
//						transition.getTarget().getIncoming().remove(transition);
//						transition.setSource(null);
//						transition.setTarget(null);
//						transition.setDiagram(null);
//						transition.setInstruction(null);
//						i--;
//					}
//				}
//			}
//		}
//	}
//
//	private ControlFlowLocation findLooseGraph(ControlFlowDiagram cfg) {
//		EList<ControlFlowLocation> locs = cfg.getLocations();
//		for (ControlFlowLocation loc : locs) {
//			if (loc.getIncoming().isEmpty() && !(loc.equals(cfg.getStart()))) {
//				return loc;
//			}
//		}
//		return null;
//	}
//
//	/**
//	 * Deletes the given transition.
//	 * @param t transition to be deleted
//	 */
//	private void deleteTransition(Transition t) {
//		t.setDiagram(null);
//		t.setSource(null);
//		t.getTarget().getIncoming().remove(t);
//		t.setTarget(null);
//		t.setInstruction(null);
//	}
//
//	/**
//	 * Deletes the given ControlFlowLocation.
//	 * @param loose location to be deleted
//	 */
//	private void deleteLoc(ControlFlowLocation loose) {
//		loose.setDiagram(null);
//		loose.getOutgoing().clear();
//	}
}
