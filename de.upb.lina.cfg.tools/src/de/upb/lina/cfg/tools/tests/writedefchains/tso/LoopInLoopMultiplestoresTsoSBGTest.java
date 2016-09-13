package de.upb.lina.cfg.tools.tests.writedefchains.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.tests.TSOStoreBufferGraphTest;


public class LoopInLoopMultiplestoresTsoSBGTest extends TSOStoreBufferGraphTest {


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 31;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 46;
   }


   @Override
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 15;
   }


   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/Test_loop_in_loop_multiplestores.s";
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
      return Arrays.asList("L6 <(r3: a)>", "L7 <(r3: a)>", "L9 <(r3: a)>", "L8 <(r3: a)>", "L10 <(r3: a)>", "L4 <(r3: a)>",
            "L14 <(r3: a)>", "L12 <(r1" + CFGConstants.WDC_SUFFIX + ": b)>", "L13 <(r1" + CFGConstants.WDC_SUFFIX + ": b)>", "L7 <(r1"
                  + CFGConstants.WDC_SUFFIX + ": b)>", "L9 <(r1" + CFGConstants.WDC_SUFFIX + ": b)>", "L8 <(r1" + CFGConstants.WDC_SUFFIX
                  + ": b)>", "L10 <(r1" + CFGConstants.WDC_SUFFIX + ": b)>", "L4 <(r1" + CFGConstants.WDC_SUFFIX + ": b)>", "L14 <(r1"
                  + CFGConstants.WDC_SUFFIX + ": b)>");
   }

}
