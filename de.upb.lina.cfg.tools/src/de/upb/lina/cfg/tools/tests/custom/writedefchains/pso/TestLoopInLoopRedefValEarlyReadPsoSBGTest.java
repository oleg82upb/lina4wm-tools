package de.upb.lina.cfg.tools.tests.custom.writedefchains.pso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.PSOStoreBufferGraphTest;


public class TestLoopInLoopRedefValEarlyReadPsoSBGTest extends PSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/Test_loop_in_loop_redef_val_earlyread.s";
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
      return Arrays.asList("L9 <(r1: bCpy)>", "L10 <(r1: bCpy)>", "L5 <(r1: bCpy)>", "L7 <(r1: bCpy)>", "L6 <(r1: bCpy)>",
            "L2 <(r1: bCpy)>", "L11 <(r1: bCpy)>", "L3 <(r1: bCpy)>", "L4 <(r1: bCpy)>");
   }
}
