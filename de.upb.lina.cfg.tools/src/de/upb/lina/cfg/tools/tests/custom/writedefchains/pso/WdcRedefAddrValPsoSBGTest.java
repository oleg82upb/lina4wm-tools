package de.upb.lina.cfg.tools.tests.custom.writedefchains.pso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.PSOStoreBufferGraphTest;


public class WdcRedefAddrValPsoSBGTest extends PSOStoreBufferGraphTest {


   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/wdc_redef_addr+val.s";
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
   protected int getExpectedNumberOfNodesWithNonEmptyBuffers()
   {
      return 5;
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
      return Arrays.asList("L6 <(r1Cpy: aCpy)>", "L1 <(r1Cpy: aCpy)>", "L7 <(r1Cpy: aCpy)>", "L2 <(r1Cpy: aCpy)>", "L3 <(r1Cpy: aCpy)>");
   }

}
