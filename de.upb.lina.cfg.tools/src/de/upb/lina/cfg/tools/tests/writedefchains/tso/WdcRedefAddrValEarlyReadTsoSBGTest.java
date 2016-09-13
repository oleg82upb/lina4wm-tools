package de.upb.lina.cfg.tools.tests.writedefchains.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.tests.TSOStoreBufferGraphTest;


public class WdcRedefAddrValEarlyReadTsoSBGTest extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/wdc_redef_addr+val_earlyread.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 15;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 19;
   }


   @Override
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 5;
   }


   @Override
   protected int getExpectedNumberOfEarlyReadEdges()
   {
      return 0;
   }


   @Override
   protected int getExpectedNumberOfWriteDefChainEdges()
   {
      return 1;
   }


   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L7 <(r1" + CFGConstants.WDC_SUFFIX + ": a" + CFGConstants.WDC_SUFFIX + ")>", "L2 <(r1"
            + CFGConstants.WDC_SUFFIX + ": a" + CFGConstants.WDC_SUFFIX + ")>", "L8 <(r1" + CFGConstants.WDC_SUFFIX + ": a"
            + CFGConstants.WDC_SUFFIX + ")>", "L3 <(r1" + CFGConstants.WDC_SUFFIX + ": a" + CFGConstants.WDC_SUFFIX + ")>", "L4 <(r1"
            + CFGConstants.WDC_SUFFIX + ": a" + CFGConstants.WDC_SUFFIX + ")>");
   }

}
