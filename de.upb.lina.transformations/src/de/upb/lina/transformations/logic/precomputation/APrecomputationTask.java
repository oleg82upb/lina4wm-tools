package de.upb.lina.transformations.logic.precomputation;


import java.util.List;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.transformations.logic.TransformationConfiguration;


/**
 * Base class for all precomputation tasks. Precomputation tasks need to implement both the
 * {@link #initialize()} and the {@link #runPrecomputationTask()} method, which should contain the
 * main logic of this task.
 * 
 * @author Alexander Hetzer
 *
 */
public abstract class APrecomputationTask implements IPrecomputationTask {

   protected TransformationConfiguration transformationConfiguration;

   protected GeneratorData generationData;
   protected List<ControlFlowDiagram> storeBufferGraphs;


   /**
    * Creates an abstract precomputation task.
    * 
    * @param transformationConfiguration the transformation configuration to take into account for
    *           the precomputation
    * @param generationData the generation data object to fill
    */
   public APrecomputationTask(TransformationConfiguration transformationConfiguration, GeneratorData generationData) {
      this.transformationConfiguration = transformationConfiguration;
      this.storeBufferGraphs = transformationConfiguration.getStoreBufferGraphs();
      this.generationData = generationData;
   }


   /**
    * Initializes the precomputation task. This method will be run at the beginning of the task
    * execution.
    */
   protected abstract void initialize();


   /**
    * Performs the main computation of this task. This method will be called after the
    * initialization.
    */
   protected abstract void runPrecomputationTask();


   @Override
   public void execute() throws PrecomputationTaskFailedException {
      initialize();
      runPrecomputationTask();
   }


}
