package de.upb.lina.cfg.tools;


import de.upb.lina.cfg.tools.strategies.PSOGraphGenerator;
import de.upb.lina.cfg.tools.strategies.SCGraphGenerator;
import de.upb.lina.cfg.tools.strategies.TSOGraphGenerator;
import de.upb.llvm_parser.llvm.FunctionDefinition;


/**
 * This enum list all memory models currently supported by Weak2SC. Each model is identified by a
 * unique ID and additionally has a name.
 * 
 * @author Alexander Hetzer
 *
 */
public enum EMemoryModel {
   SC("SC", 0) {
      @Override
      public IGraphGenerator createGraphGenerator(FunctionDefinition function) {
         return new SCGraphGenerator(function);
      }
   },
   TSO("TSO", 1) {
      @Override
      public IGraphGenerator createGraphGenerator(FunctionDefinition function) {
         return new TSOGraphGenerator(function);
      }
   },
   PSO("PSO", 2) {
      @Override
      public IGraphGenerator createGraphGenerator(FunctionDefinition function) {
         return new PSOGraphGenerator(function);
      }
   };
   // RMO("RMO", 3),
   // ARM("ARM", 4),
   // POWER("POWER", 5)

   private String modelName;
   private int modelId;


   private EMemoryModel(String modelName, int modelId) {
      this.modelName = modelName;
      this.modelId = modelId;
   }


   public abstract IGraphGenerator createGraphGenerator(FunctionDefinition function);


   /**
    * Returns the memory model, which matches the given model name.
    * 
    * @param modelName name of the model to search for
    * @return the memory model, which matches the given model name if one is found, {@code null}
    *         otherwise
    */
   public static EMemoryModel getMemoryModelByName(String modelName) {
      for (EMemoryModel model : EMemoryModel.getMemoryModels()) {
         if (model.getModelName().equals(modelName)) {
            return model;
         }
      }
      return null;
   }


   /**
    * Returns the memory model, which is identified by the given ID.
    * 
    * @param modelId ID of the model to search for
    * @return the memory model, whwhich is identified by the given ID if it is found, {@code null}
    *         otherwise
    */
   public static EMemoryModel getMemoryModelById(int modelId) {
      for (EMemoryModel model : EMemoryModel.getMemoryModels()) {
         if (model.getModelId() == modelId) {
            return model;
         }
      }
      return null;
   }


   /**
    * Returns an array of all memory models registered in this enum.
    * 
    * @return array of all memory models registered in this enum
    */
   public static EMemoryModel[] getMemoryModels() {
      return EMemoryModel.values();
   }


   public String getModelName() {
      return modelName;
   }


   public int getModelId() {
      return modelId;
   }


}
