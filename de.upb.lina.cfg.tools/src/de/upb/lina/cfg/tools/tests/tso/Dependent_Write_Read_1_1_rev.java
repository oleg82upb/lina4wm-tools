package de.upb.lina.cfg.tools.tests.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.TSOStoreBufferGraphTest;


public class Dependent_Write_Read_1_1_rev extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "ReverseLS/Test_Dependent_Write_Read_1_1_rev.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 11;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 11;
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
      return Arrays.asList("L4 <(r1: b)>", "L5 <(r1: b)>");
   }
}
