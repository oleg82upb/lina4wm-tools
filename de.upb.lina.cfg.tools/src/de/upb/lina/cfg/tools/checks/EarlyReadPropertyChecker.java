package de.upb.lina.cfg.tools.checks;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.Store;

public class EarlyReadPropertyChecker extends AbstractPropertyChecker {

	//TODO I guess we do not need this anymore?
	public EarlyReadPropertyChecker(LLVM ast) {
		super(ast);
	}

	@Override
	public boolean check() {
		return false;

	}
	
	/**
	 * @param scCfg ControlFlowDiagram with SC semantic
	 * @return a list of transitions which are possibly early reads
	 */
	public List<Transition> collectEarlyReadsinSCGraph(ControlFlowDiagram scCfg) {

		List<Transition> earlyReads = new ArrayList<Transition>();
		List<Transition> loads = new ArrayList<Transition>();
		EList<Transition> TransitionList = scCfg.getTransitions();
		// find all loads
		for (Transition t : TransitionList) {
			if (t.getInstruction() instanceof Load) {
				loads.add(t);
			}
		}
		// check for all loads whether they are early reads or not
		for (Transition t : loads) {
			if (detectEarlyReadforSC(t)) {
				earlyReads.add(t);
			}
		}
		return earlyReads;
	}
	
	/**
	 * @param t a transition, which has a load-instruction
	 * @return <code>true</code> if the transition is a possible early read
	 */
	private boolean detectEarlyReadforSC(Transition t) {
		Load load = (Load) t.getInstruction();
		List<Transition> explored = new ArrayList<Transition>();
		explored.add(t);
		if (load.getAddress().getValue() instanceof AddressUse) {
			for (Transition tr : t.getSource().getIncoming())
				if (isEarlyRead(tr, explored, t))
					return true;
		} else if (CFGConstants.DEBUG) {
			System.out.println("load.getAddress().getValue() of type " + load.getAddress().getValue().toString());
		}
		return false;
	}

	/**
	 * @param t the transition to be checked for being a store
	 * @param explored list of already checked transitions
	 * @param load the load transition to be checked
	 * @return <code>true</code> if load is a possible early read
	 */
	private boolean isEarlyRead(Transition t, List<Transition> explored, Transition load) {
		// fence found
		if (GraphUtility.isSynch(t.getInstruction())) {
			return false;
		}
		// loop found
		if (explored.contains(t)) {
			return false;
		}
		// check if load is early read w.r.t. transition t
		explored.add(t);
		Load l = (Load) load.getInstruction();
		AddressUse loadaddress = (AddressUse) l.getAddress().getValue();

		if (t.getInstruction() instanceof Store) {
			Store store = (Store) t.getInstruction();
			if (store.getTargetAddress().getValue() instanceof AddressUse) {
				AddressUse storeaddress = (AddressUse) store.getTargetAddress().getValue();

				if (loadaddress.getAddress().equals(storeaddress.getAddress())) {
					return true;
				}
			}
		}
		// reached end of graph
		if (t.getSource().getIncoming().isEmpty())
			return false;
		// check for all incoming transitions
		for (Transition transition : t.getSource().getIncoming()) {
			if (isEarlyRead(transition, explored, load))
				return true;
		}
		// no early read found
		return false;
	}

	@Override
	protected void setErrorLevel() {
		// TODO Auto-generated method stub
		
	}

}
