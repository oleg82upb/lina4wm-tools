package de.upb.lina.cfg.tools.tests.tso.custom;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.TSOStoreBufferGraphTest;


public class RU_T_IndWR_2 extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "Test_Independent_Write_Read_2.s";
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
      // TODO Auto-generated method stub
      return 0;
   }


   @Override
   protected int getExpectedNumberOfWriteDefChainEdges()
   {
      // TODO Auto-generated method stub
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
      return Arrays.asList("L4 <(r1: b)>", "L5 <(r1: b)>", "L6 <(r1: b)>");
   }
}
