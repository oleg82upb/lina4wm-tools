package de.upb.lina.transformations.logic.precomputation;


public interface IPrecomputationTask {

   /**
    * Executes this precomputation task.
    * 
    * @throws PrecomputationTaskFailedException if the execution fails
    */
   public void execute() throws PrecomputationTaskFailedException;

}
