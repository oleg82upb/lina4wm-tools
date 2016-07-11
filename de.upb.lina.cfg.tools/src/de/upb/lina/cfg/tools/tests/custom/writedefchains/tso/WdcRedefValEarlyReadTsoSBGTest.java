package de.upb.lina.cfg.tools.tests.custom.writedefchains.tso;


import java.util.Arrays;
import java.util.List;

import de.upb.lina.cfg.tools.tests.custom.TSOStoreBufferGraphTest;


public class WdcRedefValEarlyReadTsoSBGTest extends TSOStoreBufferGraphTest {

   @Override
   protected String getTestLocation()
   {
      return "writedefchaintests/wdc_redef_val_earlyread.s";
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
      return 1;
   }

   @Override
   protected int getExpectedNumberOfWriteDefChainEdges()
   {
      return 1;
   }

   @Override
   protected List<String> getExpectedStoreBufferStringRepresentations()
   {
      return Arrays.asList("L6 <(r1: aCpy)>", "L1 <(r1: aCpy)>", "L7 <(r1: aCpy)>", "L2 <(r1: aCpy)>", "L3 <(r1: aCpy)>");
   }

}
