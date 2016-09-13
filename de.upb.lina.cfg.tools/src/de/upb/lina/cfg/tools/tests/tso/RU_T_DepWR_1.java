package de.upb.lina.cfg.tools.tests.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.TSOStoreBufferGraphTest;


public class RU_T_DepWR_1 extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "Test_Dependent_Write_Read_1.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 9;
   }


   @Override
   protected int getExpectedNumberOfEdges()
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
      return Arrays.asList("L3 <(r1: b)>", "L4 <(r1: b)>");
   }


}
