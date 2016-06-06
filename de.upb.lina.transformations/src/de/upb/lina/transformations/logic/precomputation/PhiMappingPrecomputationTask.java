package de.upb.lina.transformations.logic.precomputation;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.gendata.GendataFactory;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.gendata.PhiMapping;
import de.upb.lina.transformations.logic.TransformationConfiguration;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Phi;


/**
 * This task is responsible for creating so called phi mappings. These mappings map
 * 
 * @author Alexander Hetzer
 *
 */
public class PhiMappingPrecomputationTask extends APrecomputationTask {

   /**
    * Maps each block label to a list of phi instructions contained in that associated block. That
    * means to obtain the list of phi instructions in block 'a', you can access the value mapped to
    * the key 'a' in this map.
    */
   private HashMap<String, List<Phi>> blockLabelToPhiInstructionsMap;


   public PhiMappingPrecomputationTask(TransformationConfiguration transformationConfiguration, GeneratorData generationData) {
      super(transformationConfiguration, generationData);
   }


   @Override
   protected void initialize() {
      blockLabelToPhiInstructionsMap = new HashMap<String, List<Phi>>();
   }


   @Override
   protected void runPrecomputationTask() {
      computePhiMapping();
   }


   private void computePhiMapping() {
      for (ControlFlowDiagram storeBufferGraph : storeBufferGraphs) {
         mapPhiInstructionsToBlockLabelsForFunction(storeBufferGraph.getFunctionDefinition());

         // assign a phiMapping to each transition that changes the block
         for (Transition transition : storeBufferGraph.getTransitions()) {
            if (isBranchTransition(transition)) {
               handleBranchTransition(transition);
            }
            if (isIndirectBranchTransition(transition)) {
               handleIndirectBranchTransition(transition);
            }
         }
      }
   }


   /**
    * Checks whether the instruction of the given transition is an indirect branch.
    * 
    * @param transition the host of the instruction to check
    * @return {@code true}, if the instruction of the given transition is an indirect branch,
    *         {@code false} else
    */
   private boolean isIndirectBranchTransition(Transition transition) {
      return transition.getInstruction() instanceof IndirectBranch;
   }


   /**
    * Checks whether the instruction of the given transition is a branch.
    * 
    * @param transition the host of the instruction to check
    * @return {@code true}, if the instruction of the given transition is a branch, {@code false}
    *         else
    */
   private boolean isBranchTransition(Transition transition) {
      return transition.getInstruction() instanceof Branch;
   }


   /**
    * Handles the phi mapping creation for the given transition, assuming it holds a branch
    * instruction.
    * 
    * @param transition the transition to create the phi mapping for (assumed to hold a branch
    *           instruction
    */
   private void handleBranchTransition(Transition transition) {
      Branch branch = (Branch) transition.getInstruction();
      String destinationBlockToAnalyze = determineDestinationBlockToAnalyze(transition);
      List<Phi> phiInstructionsInDestinationBlock = getPhiInstructionsInBlock(destinationBlockToAnalyze);
      createPhiMapping(transition, phiInstructionsInDestinationBlock, ((BasicBlock) branch.eContainer()).getLabel());
   }


   /**
    * Determines the destination block to analyze for the given transition, which is assumed to hold
    * a branch instruction. Generally it is assumed that the destination of the if-case needs to be
    * analyzed. If the transition is responsible for an else case, though, the destination of the
    * else case will be returned.
    * 
    * @param transition the transition to determine the destination for (assumed to host a branch
    *           instruction)
    * @return label of the destination block to be analyzed
    */
   private String determineDestinationBlockToAnalyze(Transition transition) {
      Branch branch = (Branch) transition.getInstruction();
      // assume we work with the if destination
      String destinationBlockToAnalyze = branch.getDestination().replace("%", "");

      // check if we need to work with the else destination
      if (transition instanceof GuardedTransition) {
         GuardedTransition guardedTransition = (GuardedTransition) transition;
         if (guardedTransition.getCondition().startsWith("[not")) {
            destinationBlockToAnalyze = branch.getElseDestination().replace("%", "");
         }
      }
      return destinationBlockToAnalyze;
   }


   /**
    * Handles the phi mapping creating for a transition holding an indirect branch instruction.
    * 
    * @param transition the transition to create the phi mappings for (assumed to hold an in
    *           indirect branch instruction)
    */
   private void handleIndirectBranchTransition(Transition transition) {
      IndirectBranch branch = (IndirectBranch) transition.getInstruction();
      for (String potentialDestination : branch.getPotTargetLabels()) {
         String cleanedDestinationLabel = potentialDestination.replace("%", "");
         List<Phi> phiInstructionsOfDestination = getPhiInstructionsInBlock(cleanedDestinationLabel);

         createPhiMapping(transition, phiInstructionsOfDestination, ((BasicBlock) branch.eContainer()).getLabel());
      }
   }


   /**
    * Scans the blocks of the given function and creates a mapping from a block label to a list of
    * phi instructions contained in the associated block.
    * 
    * @param functionDefinition function to scan and generate the mapping for
    */
   private void mapPhiInstructionsToBlockLabelsForFunction(FunctionDefinition functionDefinition) {
      blockLabelToPhiInstructionsMap.clear();

      for (BasicBlock basicBlock : functionDefinition.getBody().getBlocks()) {
         String basicBlockLabel = basicBlock.getLabel();
         blockLabelToPhiInstructionsMap.put(basicBlockLabel, new ArrayList<Phi>());

         for (Instruction instruction : basicBlock.getInstructions()) {
            if (instruction instanceof Phi) {
               Phi phiInstruction = (Phi) instruction;
               List<Phi> phiInstructionsInCurrentBlock = getPhiInstructionsInBlock(basicBlockLabel);
               if (!phiInstructionsInCurrentBlock.contains(phiInstruction)) {
                  phiInstructionsInCurrentBlock.add(phiInstruction);
               }
            }
         }
      }
   }


   /**
    * Returns the phi instructions, contained in the block with the associated label. Returns
    * {@code null}, if no block with the given label exists.
    * 
    * @param blockLabel label of the block to analyze
    * @return phi instructions, contained in the block with the associated label, {@code null} if no
    *         block with the given label exists.
    */
   private List<Phi> getPhiInstructionsInBlock(String blockLabel) {
      return blockLabelToPhiInstructionsMap.get(blockLabel);
   }


   /**
    * Creates a phi mapping consisting of the given transition, the list of phi instructions and the
    * according block label.
    * 
    * @param transition the transition to map
    * @param phiInstructions the phi instructions to map to the transition
    * @param blockLabel the block label the phi instructions belong to
    */
   private void createPhiMapping(Transition transition, List<Phi> phiInstructions, String blockLabel) {
      if (!phiInstructions.isEmpty()) {
         PhiMapping mapping = GendataFactory.eINSTANCE.createPhiMapping();
         mapping.setTransition(transition);
         mapping.getPhi().addAll(phiInstructions);
         mapping.setBlockLabelToUse(blockLabel);
         generationData.getPhiMappings().add(mapping);
      }
   }

}
