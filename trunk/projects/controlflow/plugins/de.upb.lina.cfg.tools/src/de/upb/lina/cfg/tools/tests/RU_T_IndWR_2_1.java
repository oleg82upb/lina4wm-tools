package de.upb.lina.cfg.tools.tests;

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
import de.upb.lina.cfg.tools.ReorderingUtil;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LlvmPackage;

public class RU_T_IndWR_2_1 extends TSO_Test {
	@Before
	public void setUp() throws Exception {
		astLoc = "testdata/Test_Independent_Write_Read_2_1.s.llvm";
		super.setUp();
	}

	@Test
	public final void testCreateReachibilityGraph() {
		ReorderingUtil util = new ReorderingUtil();

		ControlFlowDiagram diag = util.createReachibilityGraph((FunctionDefinition) ast.getElements().get(0));
		
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
			String buffer = gUtil.getBufferAsString(l);
			boolean isValidBuffer = buffer.equals(l.getPc()+"<(%b,null)>");
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
