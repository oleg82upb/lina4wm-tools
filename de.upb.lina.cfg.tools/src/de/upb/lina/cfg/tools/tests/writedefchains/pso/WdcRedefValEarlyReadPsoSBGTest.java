package de.upb.lina.cfg.tools.tests.writedefchains.pso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.tests.PSOStoreBufferGraphTest;


public class WdcRedefValEarlyReadPsoSBGTest extends PSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/wdc_redef_val_earlyread.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 14;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 18;
   }


   @Override
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 5;
   }


   @Override
   protected int getExpectedNumberOfEarlyReadEdges()
   {
      return 1;
   }


   @Override
   protected int getExpectedNumberOfWriteDefChainEdges()
   {
      return 1;
   }


   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L6 <(r1: a" + CFGConstants.WDC_SUFFIX + ")>", "L1 <(r1: a" + CFGConstants.WDC_SUFFIX + ")>", "L7 <(r1: a"
            + CFGConstants.WDC_SUFFIX + ")>", "L2 <(r1: a" + CFGConstants.WDC_SUFFIX + ")>", "L3 <(r1: a" + CFGConstants.WDC_SUFFIX + ")>");
   }

}
