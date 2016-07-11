package de.upb.lina.cfg.tools.tests.tso.custom;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.TSOStoreBufferGraphTest;


public class DepRFW_Loop extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "LoopTests/Test_Dependent_Read_Fence_Write_Loop.s";
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
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 5;
   }


   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L6 <(r1: v0Cpy)>", "L7 <(r1: v0Cpy)>", "L8 <(r1: v0Cpy)>", "L3 <(r1: v0Cpy)>", "L4 <(r1: v0Cpy)>");
   }
}
