package de.upb.lina.transformations.logic.precomputation;


import java.util.ArrayList;
import java.util.List;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.gendata.AddressMapping;
import de.upb.lina.cfg.gendata.ConstraintMapping;
import de.upb.lina.cfg.gendata.GendataFactory;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.transformations.logic.TransformationConfiguration;


/**
 * Maps each transition of the store buffer graphs to a specific condition in the form of a string.
 * This is done to access the conditions more easily during the transformation from the store buffer
 * graph to promela. Transitions having an explicit condition, as they are guarded ones, keep their
 * transitions, while transitions without explicit condition are mapped to their implicit condition,
 * i.e. {@code true}. This allows to easily model the non-determinism introduced by relaxed memory
 * models such as TSO or PSO in promela. IMPORTANT: This task needs to be performed AFTER the
 * address mappings have been computed on the generation data.
 * 
 * @author Alexander Hetzer
 *
 */
public class TransitionConditionPrecomputationTask extends APrecomputationTask {

   private List<ControlFlowLocation> processedNodes;
   private List<ControlFlowLocation> toBeProcessedNodes;


   public TransitionConditionPrecomputationTask(TransformationConfiguration transformationConfiguration, GeneratorData generationData) {
      super(transformationConfiguration, generationData);
   }


   @Override
   protected void initialize() {
      processedNodes = new ArrayList<ControlFlowLocation>();
      toBeProcessedNodes = new ArrayList<ControlFlowLocation>();
   }


   @Override
   protected void runPrecomputationTask() {
      computeTransitionConditionMapping();
   }


   private ControlFlowLocation processNextNode() {
      ControlFlowLocation nextNode = toBeProcessedNodes.remove(0);
      processedNodes.add(nextNode);
      return nextNode;
   }


   /**
    * Computes the transition condition mapping.
    */
   private void computeTransitionConditionMapping() {
      for (ControlFlowDiagram storeBufferGraph : storeBufferGraphs) {

         toBeProcessedNodes.add(storeBufferGraph.getStart());

         while (!toBeProcessedNodes.isEmpty()) {

            ControlFlowLocation currentNode = processNextNode();
            List<Transition> outgoingTransitionsOfCurrentNode = currentNode.getOutgoing();

            if (hasNodeMultipleOutgoingTransitions(currentNode)) {
               GuardedTransition ifTransition = null;

               // Determine if the node has an outgoing if-transition
               for (Transition transition : outgoingTransitionsOfCurrentNode) {
                  if (transition instanceof GuardedTransition) {
                     GuardedTransition guardedTransition = (GuardedTransition) transition;
                     if (ifTransition == null && !guardedTransition.getCondition().contains("else")) {
                        ifTransition = guardedTransition;
                        createAndAddTransitionConditionMapping(guardedTransition, guardedTransition.getCondition());
                     }
                  } else {
                     // flushes and normal transitions that need a condition
                     createAndAddTransitionConditionMapping(transition, "true");
                  }
               }

               // If an if-transition has been found, find the according else-transition
               if (ifTransition != null) {
                  for (Transition transition : outgoingTransitionsOfCurrentNode) {
                     if (transition instanceof GuardedTransition && !transition.equals(ifTransition)) {
                        GuardedTransition gt = (GuardedTransition) transition;
                        createAndAddTransitionConditionMapping(gt, "!" + ifTransition.getCondition());
                     }
                  }
               }
            }

            addNodesToBeProcessed(outgoingTransitionsOfCurrentNode);
         }
      }
   }


   /**
    * Creates a transition condition mapping for the given transition/ condition pair and adds it to
    * the generation data.
    * 
    * @param transition the transition to be mapped
    * @param condition the condition to map the transition to
    */
   private void createAndAddTransitionConditionMapping(Transition transition, String condition) {
      // replace brackets in condition
      condition = condition.replaceAll("[\\[\\]]", "");
      String refactoredCondition = replaceOldAddressNamesWithNewOnes(condition);

      // construct mapping
      ConstraintMapping mapping = GendataFactory.eINSTANCE.createConstraintMapping();
      mapping.setTransition(transition);
      mapping.setCondition(refactoredCondition);
      generationData.getConstraints().add(mapping);
   }


   /**
    * Replaces all occurrences of address names in the given condition with the new names, defined
    * in the generation data.
    * 
    * @param condition the condition to refactor
    * @return the condition, in which all address names have been replaced with their new version,
    *         defined in the generation data
    */
   private String replaceOldAddressNamesWithNewOnes(String condition) {
      String refactoredCondition = condition;
      if (!condition.equalsIgnoreCase("true")) {
         for (AddressMapping addressMapping : generationData.getAddressMappings()) {
            for (String oldName : addressMapping.getOldNames()) {
               if (oldName.trim().equals(condition.replaceAll("!", "").trim())) {
                  refactoredCondition = addressMapping.getName();
                  if (condition.startsWith("!")) {
                     refactoredCondition = "!" + refactoredCondition;
                  }
               }
            }
         }
      }
      return refactoredCondition;
   }


   /**
    * Checks whether the given node has more than one outgoing transitions.
    * 
    * @param node the node to check
    * @return {@code true}, if the given node has more than one outgoing transition, {@code false}
    *         else
    */
   private boolean hasNodeMultipleOutgoingTransitions(ControlFlowLocation node) {
      return node.getOutgoing().size() > 1;
   }


   /**
    * Adds all nodes, which can be reached by the given list of transitions to the set of nodes to
    * be processed, if they have not been processed yet.
    * 
    * @param outgoingTransitionsOfCurrentNode list of transitions to follow
    */
   private void addNodesToBeProcessed(List<Transition> outgoingTransitionsOfCurrentNode) {
      for (Transition t : outgoingTransitionsOfCurrentNode) {
         if (!processedNodes.contains(t.getTarget()) && !toBeProcessedNodes.contains(t.getTarget())) {
            toBeProcessedNodes.add(t.getTarget());
         }
      }
   }

}
