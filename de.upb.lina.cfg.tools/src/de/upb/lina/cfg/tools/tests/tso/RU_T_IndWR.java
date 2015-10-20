package de.upb.lina.cfg.tools.tests.tso;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.strategies.TSOGraphGenerator;
import de.upb.lina.cfg.tools.strategies.TSOUtil;
import de.upb.lina.cfg.tools.tests.TSO_Test;

public class RU_T_IndWR extends TSO_Test {

	@Before
	public void setUp() throws Exception {
		testLocation = "testdata/Test_Independent_Write_Read.s";
		super.setUp();
	}

	@Test
	public final void testCreateReachibilityGraph() {
		TSOGraphGenerator generator = new TSOGraphGenerator(this.functionTestData);
		ControlFlowDiagram diag = generator.createGraph();
		
		//check for correct amount of locations and edges
		assertEquals(diag.getLocations().size(),8);
		assertEquals(diag.getTransitions().size(),8);
		
		List<ControlFlowLocation> locs = diag.getLocations();
		
		List<ControlFlowLocation> nonEmptyBuffers  = new ArrayList<ControlFlowLocation>();
		for(ControlFlowLocation l: locs){
			if(!l.getBuffer().getAddressValuePairs().isEmpty()){
				nonEmptyBuffers.add(l);
			}
		}
		
		//check that there is only three nodes with a buffer
		assertEquals(nonEmptyBuffers.size(), 2);
		
		//check that all buffers contain the correct elements
		for(ControlFlowLocation l: nonEmptyBuffers){
			String buffer = gUtil.bufferToString(l, CFGConstants.TSO);
			boolean isValidBuffer = buffer.equals("L" +l.getPc()+" <(null: b)>");
			assertTrue(isValidBuffer);
			
		}
	}

}
