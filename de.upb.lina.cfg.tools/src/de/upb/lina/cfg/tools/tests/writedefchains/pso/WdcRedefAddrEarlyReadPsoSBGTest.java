package de.upb.lina.cfg.tools.tests.writedefchains.pso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.PSOStoreBufferGraphTest;


public class WdcRedefAddrEarlyReadPsoSBGTest extends PSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/wdc_redef_addr_earlyread.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 15;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 19;
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
      return Arrays.asList("L7 <(r1Cpy: a)>", "L2 <(r1Cpy: a)>", "L8 <(r1Cpy: a)>", "L3 <(r1Cpy: a)>", "L4 <(r1Cpy: a)>");
   }
}
