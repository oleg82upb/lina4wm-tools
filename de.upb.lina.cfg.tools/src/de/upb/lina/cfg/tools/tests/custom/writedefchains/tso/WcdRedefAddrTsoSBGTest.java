package de.upb.lina.cfg.tools.tests.custom.writedefchains.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.TSOStoreBufferGraphTest;


public class WcdRedefAddrTsoSBGTest extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/wcd_redef_addr.s";
   }


   @Override
   protected int getExpectedNumberOfNodes()
   {
      return 13;
   }


   @Override
   protected int getExpectedNumberOfEdges()
   {
      return 16;
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
      return Arrays.asList("L6 <(r1Cpy: a)>", "L2 <(r1Cpy: a)>", "L7 <(r1Cpy: a)>", "L3 <(r1Cpy: a)>");
   }
}
