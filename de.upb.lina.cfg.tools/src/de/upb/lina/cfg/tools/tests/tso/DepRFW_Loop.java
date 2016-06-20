package de.upb.lina.cfg.tools.tests.tso;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.EMemoryModel;
import de.upb.lina.cfg.tools.tests.TSO_Test;


public class DepRFW_Loop extends TSO_Test {
   @Override
   @Before
   public void setUp() throws Exception {
      testLocation = "LoopTests/Test_Dependent_Read_Fence_Write_Loop.s";
      super.setUp();
   }


   @Test
   public final void testCreateReachibilityGraph() {

      // check for correct amount of locations and edges
      assertEquals(diag.getLocations().size(), 14);
      assertEquals(diag.getTransitions().size(), 18);

      List<ControlFlowLocation> locs = diag.getLocations();

      List<ControlFlowLocation> nonEmptyBuffers = new ArrayList<ControlFlowLocation>();
      for (ControlFlowLocation l : locs) {
         if (!l.getBuffer().getAddressValuePairs().isEmpty()) {
            nonEmptyBuffers.add(l);
         }
      }

      // check that there is only three nodes with a buffer
      assertEquals(nonEmptyBuffers.size(), 5);

      // check that all buffers contain the correct elements
      for (ControlFlowLocation l : nonEmptyBuffers) {
         String buffer = stringConversionManager.bufferToString(l, EMemoryModel.TSO);
         boolean isValidBuffer = buffer.equals("L" + l.getPc() + " <(r1: v0" + CFGConstants.WDC_SUFFIX + ")>");
         assertTrue(isValidBuffer);
      }

   }
}
