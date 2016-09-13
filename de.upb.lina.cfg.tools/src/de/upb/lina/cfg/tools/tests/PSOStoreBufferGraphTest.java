package de.upb.lina.cfg.tools.tests;

import de.upb.lina.cfg.tools.EMemoryModel;


public abstract class PSOStoreBufferGraphTest extends StoreBufferGraphTest {

   @Override
   protected EMemoryModel getMemoryModel()
   {
      return EMemoryModel.PSO;
   }

}
