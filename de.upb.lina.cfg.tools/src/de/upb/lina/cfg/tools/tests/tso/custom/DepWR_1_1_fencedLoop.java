package de.upb.lina.cfg.tools.tests.tso.custom;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.TSOStoreBufferGraphTest;


public class DepWR_1_1_fencedLoop extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "LoopTests/Test_Dependent_Write_Read_1_1_fencedLoop.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 15;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 17;
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
      return 3;
   }


   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L3 <(r1: b)>", "L4 <(r1: b)>", "L5 <(r1: b)>");
   }
}
