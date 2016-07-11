package de.upb.lina.cfg.tools.tests.tso.custom;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.TSOStoreBufferGraphTest;


public class RU_T_DepWR_12 extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "Test_Dependent_Write_Read_12.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 12;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 13;
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
