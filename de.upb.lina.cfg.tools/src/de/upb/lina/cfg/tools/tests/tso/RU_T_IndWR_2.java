package de.upb.lina.cfg.tools.tests.tso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.tests.TSO_Test;
import de.upb.llvm_parser.llvm.LlvmPackage;

public class RU_T_IndWR_2 extends TSO_Test {
	@Before
	public void setUp() throws Exception {
		testLocation = "Test_Independent_Write_Read_2.s";
		super.setUp();
	}

	@Test
	public final void testCreateReachibilityGraph() {
		
		//check for correct amount of locations and edges
		assertEquals(diag.getLocations().size(),12);
		assertEquals(diag.getTransitions().size(),13);
		
		List<ControlFlowLocation> locs = diag.getLocations();
		
		Transition casTransition = null;
		
		List<ControlFlowLocation> nonEmptyBuffers  = new ArrayList<ControlFlowLocation>();
		for(ControlFlowLocation l: locs){
			if(!l.getBuffer().getAddressValuePairs().isEmpty()){
				nonEmptyBuffers.add(l);
			}
			for(Transition t: l.getOutgoing()){
				if(!t.eClass().equals(ControlflowPackage.eINSTANCE.getFlushTransition())){
					if(t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getCmpXchg())){
						casTransition = t;
					}
				}
			}
		}
		
		//check that there is only three nodes with a buffer
		assertEquals(nonEmptyBuffers.size(), 3);
		
		//check that all buffers contain the correct elements
		for(ControlFlowLocation l: nonEmptyBuffers){
			String buffer = GraphUtility.bufferToString(l, CFGConstants.TSO);
			boolean isValidBuffer = buffer.equals("L" +l.getPc()+" <(r1: b)>");
			assertTrue(isValidBuffer);	
		}
		
		//Check weather we synch before the fence
		if(casTransition != null){
			for(ControlFlowLocation l: diag.getLocations()){
				if(l.getPc() > casTransition.getSource().getPc() || l.getIncoming().contains(casTransition)){
					assertTrue(l.getBuffer().getAddressValuePairs().isEmpty());
				}
			}
		}else{
			fail("No cas in this test.");
		}
		
	}
}
