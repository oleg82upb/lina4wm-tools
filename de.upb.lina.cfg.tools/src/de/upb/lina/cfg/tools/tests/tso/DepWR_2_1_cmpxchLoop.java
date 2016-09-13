package de.upb.lina.cfg.tools.tests.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.TSOStoreBufferGraphTest;


public class DepWR_2_1_cmpxchLoop extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "LoopTests/Test_Dependent_Write_Read_2_1_cmpxchLoop.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 14;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 15;
   }


   @Override
   protected int getExpectedNumberOfEarlyReadEdges()
   {
      return 1;
   }


   @Override
   protected int getExpectedNumberOfWriteDefChainEdges()
   {
      return 0;
   }


   @Override
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 2;
   }


   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L4 <(r1: b)>", "L5 <(r1: b)>");
   }
}
