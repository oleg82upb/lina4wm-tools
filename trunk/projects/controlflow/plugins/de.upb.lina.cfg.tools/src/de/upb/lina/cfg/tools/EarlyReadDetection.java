package de.upb.lina.cfg.tools;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.Store;

public class EarlyReadDetection {

	public static List<Transition> collectEarlyReadsinTSOGraph(
			ControlFlowDiagram cfg) {

		List<Transition> earlyReads = new ArrayList<Transition>();
		EList<Transition> TransitionList = cfg.getTransitions();
		for (Transition t : TransitionList) {
			if (detectEarlyReadforTSO(t)) {
				earlyReads.add(t);
			}
		}
		return earlyReads;
	}

	private static boolean detectEarlyReadforTSO(Transition t) {

		ControlFlowLocation source = t.getSource();

		if (!source.getBuffer().getAddressValuePairs().isEmpty()) {

			if (!(t instanceof FlushTransition)) {

				if (t.getInstruction().eClass()
						.equals(LlvmPackage.eINSTANCE.getLoad())) {

					for (AddressValuePair avp : source.getBuffer()
							.getAddressValuePairs()) {

						if (t.getInstruction() instanceof Load) {

							Load load = (Load) t.getInstruction();

							if (avp.getValue().getValue() instanceof AddressUse
									&& load.getAddress().getValue() instanceof AddressUse) {
								AddressUse avpaddress = (AddressUse) avp
										.getValue().getValue();
								AddressUse taddress = (AddressUse) load
										.getAddress().getValue();

								if (avpaddress.getAddress().equals(
										taddress.getAddress()))
									return true;
							} else {
								System.out.println("not of type AddressUse "
										+ t.getSource().getPc() + " to "
										+ t.getTarget().getPc());
							}
						} else {
							System.out
									.println("t.getInstruction() not of type Load");
						}
					}
				}
			}
		}
		return false;
	}

	public static List<Transition> collectEarlyReadsinSCGraph(
			ControlFlowDiagram cfg) {

		List<Transition> earlyReads = new ArrayList<Transition>();
		List<Transition> loads = new ArrayList<Transition>();
		EList<Transition> TransitionList = cfg.getTransitions();
		for (Transition t : TransitionList) {
			if (t.getInstruction().eClass()
					.equals(LlvmPackage.eINSTANCE.getLoad())) {
				loads.add(t);
			}
		}
		for (Transition t : loads) {
			if (detectEarlyReadforSC(t)) {
				earlyReads.add(t);
			}
		}
		return earlyReads;
	}

	private static boolean detectEarlyReadforSC(Transition t) {
		Load load = (Load) t.getInstruction();
		List<Transition> explored = new ArrayList<Transition>();
		explored.add(t);
		if (load.getAddress().getValue() instanceof AddressUse) {
			for(Transition tr: t.getSource().getIncoming())
			if (isEarlyRead(tr, explored, t))
				return true;
		} else {
			System.out.println("t.getInstruction() of type "+t.getInstruction().toString());
		}
		return false;
	}

	private static boolean isEarlyRead(Transition t, List<Transition> explored, Transition load) {
		
		if (t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getFence())) {
			return false;
		}
		if(explored.contains(t)){
			return false;
		}
		explored.add(t);
		Load l = (Load) load.getInstruction();
		AddressUse loadaddress = (AddressUse) l.getAddress().getValue();
		
		if (t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getStore())) {
			Store store = (Store) t.getInstruction();
			if (store.getValue().getValue() instanceof AddressUse) {
				AddressUse storeaddress = (AddressUse) store.getValue().getValue();

				if (loadaddress.getAddress().equals(storeaddress.getAddress())) {
					return true;
				}
			}
		}
		if(t.getSource().getIncoming().isEmpty())return false;
		for (Transition transition : t.getSource().getIncoming()) {
			if (isEarlyRead(transition, explored, load))
				return true;
		}
		return false;
	}

}