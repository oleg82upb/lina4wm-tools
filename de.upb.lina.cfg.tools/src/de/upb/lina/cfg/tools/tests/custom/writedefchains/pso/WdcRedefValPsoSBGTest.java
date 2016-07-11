package de.upb.lina.cfg.tools.tests.custom.writedefchains.pso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.PSOStoreBufferGraphTest;


public class WdcRedefValPsoSBGTest extends PSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/wdc_redef_val.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 12;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 15;
   }


   @Override
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 4;
   }


   @Override
   protected int getExpectedNumberOfEarlyReadEdges()
   {
      return 0;
   }


   @Override
   protected int getExpectedNumberOfWriteDefChainEdges()
   {
      return 1;
   }


   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L5 <(r1: aCpy)>", "L1 <(r1: aCpy)>", "L6 <(r1: aCpy)>", "L2 <(r1: aCpy)>");
   }

}
