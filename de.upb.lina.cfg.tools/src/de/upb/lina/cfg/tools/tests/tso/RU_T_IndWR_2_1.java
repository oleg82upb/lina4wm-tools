package de.upb.lina.cfg.tools.tests.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.TSOStoreBufferGraphTest;


public class RU_T_IndWR_2_1 extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "Test_Independent_Write_Read_2_1.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 13;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 14;
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
      return 3;
   }


   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L4 <(r1: b)>", "L5 <(r1: b)>", "L6 <(r1: b)>");
   }
}
