package de.upb.lina.cfg.tools.tests.custom;


import de.upb.lina.cfg.tools.EMemoryModel;


public abstract class TSOStoreBufferGraphTest extends StoreBufferGraphTest {

   @Override
   protected EMemoryModel getMemoryModel()
   {
      return EMemoryModel.TSO;
   }


}
