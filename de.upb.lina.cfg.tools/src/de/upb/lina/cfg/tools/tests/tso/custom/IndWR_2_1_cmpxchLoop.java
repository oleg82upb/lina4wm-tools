package de.upb.lina.cfg.tools.tests.tso.custom;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.TSOStoreBufferGraphTest;


public class IndWR_2_1_cmpxchLoop extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "LoopTests/Test_Independent_Write_Read_2_1_cmpxchLoop.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 15;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 16;
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
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 2;
   }


   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L5 <(r1: b)>", "L6 <(r1: b)>");
   }
}
