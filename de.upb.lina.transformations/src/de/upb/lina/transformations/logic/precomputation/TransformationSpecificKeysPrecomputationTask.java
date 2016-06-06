package de.upb.lina.transformations.logic.precomputation;


import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.transformations.Constants;
import de.upb.lina.transformations.logic.TransformationConfiguration;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.GetElementPtr;


/**
 * This task precomputes the so called transformation specific keys. Each key represents a specific
 * property, of which it needs to be known if the store buffer graphs, on which the following
 * transformation is based, fulfill this property or not. This tasks checks the store buffer graphs
 * for those properties and adds the keys to the generation data, if required.
 * 
 * Currently this task only checks if the store buffer graphs make use of compare exchange or get
 * element pointer instructions.
 * 
 * @author Alexander Hetzer
 *
 */
public class TransformationSpecificKeysPrecomputationTask extends APrecomputationTask {


   public TransformationSpecificKeysPrecomputationTask(TransformationConfiguration transformationConfiguration, GeneratorData generationData) {
      super(transformationConfiguration, generationData);
   }


   @Override
   protected void initialize() {

   }


   @Override
   protected void runPrecomputationTask() {
      computeTransformationSpecificKeys();
   }


   /**
    * Computes the transformation specific keys.
    */
   private void computeTransformationSpecificKeys() {
      for (ControlFlowDiagram storeBufferGraph : storeBufferGraphs) {
         if (isStoreBufferGraphValid(storeBufferGraph)) {
            for (Transition t : storeBufferGraph.getTransitions()) {
               handleCompareExchangeInstruction(t);
               handleGetElementPointerInstruction(t);
            }
         }
      }
   }


   /**
    * Checks whether the given store buffer graph is valid, i.e. has a start node, which is not a
    * dead end.
    * 
    * @param storeBufferGraph the store buffer graph to check
    * @return {@code true}, if the store buffer graph has a start node, which is not a dead end,
    *         {@code false} else
    */
   private boolean isStoreBufferGraphValid(ControlFlowDiagram storeBufferGraph) {
      return storeBufferGraph.getStart() != null && !storeBufferGraph.getStart().getOutgoing().isEmpty();
   }


   /**
    * Checks whether the given transition is host to a compare exchange instruction. If so, it
    * ensures that the according key is added to the generation data.
    * 
    * @param transition the transition to check
    */
   private void handleCompareExchangeInstruction(Transition transition) {
      if (transition.getInstruction() instanceof CmpXchg) {
         if (!generationData.getTransformationSpecificKeys().contains(Constants.NEEDSCAS)) {
            generationData.getTransformationSpecificKeys().add(Constants.NEEDSCAS);
         }
      }
   }


   /**
    * Checks whether the given transition is host to a get element pointer instruction. If so, it
    * ensures that the according key is added to the generation data.
    * 
    * @param transition the transition to check
    */
   private void handleGetElementPointerInstruction(Transition transition) {
      if (transition.getInstruction() instanceof GetElementPtr) {
         if (!generationData.getTransformationSpecificKeys().contains(Constants.NEEDSGETELEMENTPTR)) {
            generationData.getTransformationSpecificKeys().add(Constants.NEEDSGETELEMENTPTR);
         }
      }
   }

}
