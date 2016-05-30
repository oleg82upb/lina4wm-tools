package de.upb.lina.cfg.tools.strategies;


import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.tools.EMemoryModel;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.llvm_parser.llvm.FunctionDefinition;


public class SCGraphGenerator extends AbstractGraphGenerator {

   public SCGraphGenerator(FunctionDefinition function) {
      super(function);
   }


   @Override
   protected ControlFlowLocation getLocationByPcAndBuffer(int pc, StoreBuffer buffer) {
      return GraphUtility.getLocationRepresentedBy(this.graph.getLocations(), pc, buffer, getMemoryModel());
   }


   @Override
   public EMemoryModel getMemoryModel() {
      return EMemoryModel.SC;
   }

}
