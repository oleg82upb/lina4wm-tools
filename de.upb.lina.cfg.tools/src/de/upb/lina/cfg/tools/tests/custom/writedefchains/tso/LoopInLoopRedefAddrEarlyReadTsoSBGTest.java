package de.upb.lina.cfg.tools.tests.custom.writedefchains.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.TSOStoreBufferGraphTest;


public class LoopInLoopRedefAddrEarlyReadTsoSBGTest extends TSOStoreBufferGraphTest {


   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/Test_loop_in_loop_redef_addr_earlyread.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 23;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 35;
   }


   @Override
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 9;
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
      return Arrays.asList("L10 <(r1Cpy: b)>", "L11 <(r1Cpy: b)>", "L5 <(r1Cpy: b)>", "L7 <(r1Cpy: b)>", "L6 <(r1Cpy: b)>",
            "L8 <(r1Cpy: b)>", "L3 <(r1Cpy: b)>", "L12 <(r1Cpy: b)>", "L4 <(r1Cpy: b)>");
   }
}
