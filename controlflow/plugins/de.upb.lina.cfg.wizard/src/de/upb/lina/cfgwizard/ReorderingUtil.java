package de.upb.lina.cfgwizard;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.Transition;

public class ReorderingUtil {
	public void addTSO(ArrayList<ControlFlowDiagram> list) {
		for (ControlFlowDiagram cfg : list) {
			ControlFlowLocation start = cfg.getStart();
			Set<Transition> may = new TreeSet<Transition>();
			ControlFlowLocation act = start;
			while (!act.getOutgoing().isEmpty()) {

			}
		}
	}
}
