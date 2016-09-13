package de.upb.lina.cfg.tools.tests.writedefchains.pso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.PSOStoreBufferGraphTest;


public class LoopInLoopRedefAddrValPsoSBGTest extends PSOStoreBufferGraphTest {


   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/Test_loop_in_loop_redef_addr+val.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 23;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 36;
   }


   @Override
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 10;
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
      return Arrays.asList("L9 <(r1Cpy: bCpy)>", "L10 <(r1Cpy: bCpy)>", "L4 <(r1Cpy: bCpy)>", "L7 <(r1Cpy: bCpy)>", "L5 <(r1Cpy: bCpy)>",
            "L6 <(r1Cpy: bCpy)>", "L1 <(r1Cpy: bCpy)>", "L11 <(r1Cpy: bCpy)>", "L2 <(r1Cpy: bCpy)>", "L3 <(r1Cpy: bCpy)>");
   }

}
