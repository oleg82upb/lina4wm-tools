package de.upb.lina.cfg.tools.tests.writedefchains.pso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.tests.PSOStoreBufferGraphTest;


public class WcdRedefAddrPsoSBGTest extends PSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/wcd_redef_addr.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 13;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 16;
   }


   @Override
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 4;
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
      return Arrays.asList("L6 <(r1" + CFGConstants.WDC_SUFFIX + ": a)>", "L2 <(r1" + CFGConstants.WDC_SUFFIX + ": a)>", "L7 <(r1"
            + CFGConstants.WDC_SUFFIX + ": a)>", "L3 <(r1" + CFGConstants.WDC_SUFFIX + ": a)>");
   }

}
