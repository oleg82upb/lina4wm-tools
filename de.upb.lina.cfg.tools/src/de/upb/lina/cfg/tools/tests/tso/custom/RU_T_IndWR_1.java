package de.upb.lina.cfg.tools.tests.tso.custom;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.TSOStoreBufferGraphTest;


public class RU_T_IndWR_1 extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "Test_Independent_Write_Read_1.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 10;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 10;
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
