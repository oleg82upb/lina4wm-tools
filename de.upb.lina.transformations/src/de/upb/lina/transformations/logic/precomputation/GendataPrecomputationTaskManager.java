package de.upb.lina.transformations.logic.precomputation;


import java.util.ArrayList;
import java.util.List;

import de.upb.lina.transformations.Activator;
import de.upb.lina.transformations.logic.TransformationConfiguration;


public class GendataPrecomputationTaskManager {

   private List<IPrecomputationTask> precomputationTasks;

   private TransformationConfiguration transformationConfiguration;


   public GendataPrecomputationTaskManager(TransformationConfiguration transformationConfiguration) {
      this.transformationConfiguration = transformationConfiguration;
      this.precomputationTasks = new ArrayList<IPrecomputationTask>();
      registerPrecomputationTasks();
   }


   private void registerPrecomputationTasks() {
      // TODO register all tasks
   }


   public void registerPrecomputationTask(IPrecomputationTask precomputationTask) {
      precomputationTasks.add(precomputationTask);
   }


   public void executePrecomputation() {
      for (IPrecomputationTask precomputationTask : precomputationTasks) {
         try {
            precomputationTask.execute();
         } catch (PrecomputationTaskFailedException precomputationFailedException) {
            Activator.logError(precomputationFailedException.getMessage(), precomputationFailedException);
         }
      }
   }

}
