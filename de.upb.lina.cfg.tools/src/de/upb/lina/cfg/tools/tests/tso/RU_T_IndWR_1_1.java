package de.upb.lina.cfg.tools.tests.tso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.strategies.TSOUtil;
import de.upb.lina.cfg.tools.tests.TSO_Test;
import de.upb.llvm_parser.llvm.LlvmPackage;

public class RU_T_IndWR_1_1 extends TSO_Test {
	@Before
	public void setUp() throws Exception {
		testLocation = "testdata/Test_Independent_Write_Read_1_1.s";
		super.setUp();
	}

	@Test
	public final void testCreateReachibilityGraph() {
		TSOUtil util = new TSOUtil(this.functionTestData);
		ControlFlowDiagram diag = util.createGraph();

		//check for correct amount of locations and edges
		assertEquals(diag.getLocations().size(),12);
		assertEquals(diag.getTransitions().size(),13);

		List<ControlFlowLocation> locs = diag.getLocations();

		List<ControlFlowLocation> nonEmptyBuffers  = new ArrayList<ControlFlowLocation>();
		Transition fenceTransition = null;

		for(ControlFlowLocation l: locs){
			if(!l.getBuffer().getAddressValuePairs().isEmpty()){
				nonEmptyBuffers.add(l);
			}
			//Find our fence
			for(Transition t: l.getOutgoing()){
				if(!t.eClass().equals(ControlflowPackage.eINSTANCE.getFlushTransition())){
					if(t.getInstruction().eClass().equals(LlvmPackage.eINSTANCE.getFence())){
						fenceTransition = t;
					}
				}
			}
		}

		//check that there is only two nodes with a buffer
		assertEquals(nonEmptyBuffers.size(), 3);

		//check that all buffers contain the correct elements
		for(ControlFlowLocation l: nonEmptyBuffers){
			String buffer = gUtil.getBufferAsString(l);
			boolean isValidBuffer = buffer.equals(l.getPc()+"<(null,%b)>");
			assertTrue(isValidBuffer);

		}

		//Check weather we synch before the fence
		if(fenceTransition != null){
			for(ControlFlowLocation l: diag.getLocations()){
				if(l.getPc() > fenceTransition.getSource().getPc() || l.getIncoming().contains(fenceTransition)){
					assertTrue(l.getBuffer().getAddressValuePairs().isEmpty());
				}
			}
		}else{
			fail("No fence in this test.");
		}
	}
}
