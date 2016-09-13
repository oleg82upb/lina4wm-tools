package de.upb.lina.cfg.tools.tests;


import de.upb.lina.cfg.tools.EMemoryModel;


public abstract class TSOStoreBufferGraphTest extends StoreBufferGraphTest {

   @Override
   protected EMemoryModel getMemoryModel()
   {
      return EMemoryModel.TSO;
   }


}
