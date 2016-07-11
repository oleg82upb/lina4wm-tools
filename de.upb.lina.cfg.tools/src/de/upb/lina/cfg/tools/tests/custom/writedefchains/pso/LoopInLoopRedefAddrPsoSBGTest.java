package de.upb.lina.cfg.tools.tests.custom.writedefchains.pso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.PSOStoreBufferGraphTest;


public class LoopInLoopRedefAddrPsoSBGTest extends PSOStoreBufferGraphTest {


   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/Test_loop_in_loop_redef_addr.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 22;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 34;
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
      return Arrays.asList("L9 <(r1Cpy: b)>", "L10 <(r1Cpy: b)>", "L4 <(r1Cpy: b)>", "L6 <(r1Cpy: b)>", "L5 <(r1Cpy: b)>",
            "L7 <(r1Cpy: b)>", "L2 <(r1Cpy: b)>", "L11 <(r1Cpy: b)>", "L3 <(r1Cpy: b)>");
   }

}
