package de.upb.lina.cfg.tools.tests.writedefchains.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.TSOStoreBufferGraphTest;


public class TestLoopInLoopTsoSBGTest extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/Test_loop_in_loop.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 21;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 32;
   }


   @Override
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 8;
   }


   @Override
   protected int getExpectedNumberOfEarlyReadEdges()
   {
      return 0;
   }


   @Override
   protected int getExpectedNumberOfWriteDefChainEdges()
   {
      return 0;
   }


   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L9 <(r1: b)>", "L10 <(r1: b)>", "L5 <(r1: b)>", "L7 <(r1: b)>", "L6 <(r1: b)>", "L3 <(r1: b)>",
            "L11 <(r1: b)>", "L4 <(r1: b)>");
   }

}
