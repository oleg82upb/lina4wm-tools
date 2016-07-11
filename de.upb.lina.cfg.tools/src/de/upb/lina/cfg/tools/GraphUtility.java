package de.upb.lina.cfg.tools;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.lina.cfg.tools.stringrepresentation.StringConversionManager;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.Return;


public abstract class GraphUtility {

   private static StringConversionManager stringConversionManager = new StringConversionManager();


   /**
    * Returns the label under which the given instruction is listed.
    * 
    * @param function function of the instruction
    * @param instruction instruction to look for
    * @return label of the instruction
    */
   public static String findLabelByInstruction(FunctionDefinition function, Instruction instruction) {
      if (instruction == null) {
         return "null";
      }
      for (BasicBlock b : function.getBody().getBlocks()) {
         if (b.getInstructions().contains(instruction)) {
            return b.getLabel();
         }
      }
      return "null";
   }


   /**
    * Returns the first instruction in the given function that is listed under the given label.
    * 
    * @param function the function to search
    * @param label the label of the block to return the first instruction of
    * @return the first instruction of the block with the given label in the given function
    */
   public static Instruction getInstructionByLabel(FunctionDefinition function, String label) {
      for (BasicBlock b : function.getBody().getBlocks()) {
         if (label.equals(b.getLabel())) {
            return b.getInstructions().get(0);
         }
      }
      throw new RuntimeException("Could not find label " + label + " in function " + function.getAddress().getName());
   }


   /**
    * Checks weather the given node is equal to the given pc in combination with the given buffer
    * under the given memory model.
    * 
    * @param node the node to check
    * @param pc the pc to compare against
    * @param buffer the buffer to compare against
    * @param memoryModel the memory model to consider for the check
    * @return {@code true}, if the given node is represented by the given pc and store buffer
    *         combination, {@code false} else
    */
   public static boolean isRepresentedBy(ControlFlowLocation node, int pc, StoreBuffer buffer, EMemoryModel memoryModel) {
      return (stringConversionManager.bufferToString(node, memoryModel).equalsIgnoreCase(stringConversionManager.bufferToString(buffer, pc,
            memoryModel)));
   }


   /**
    * Returns the pc of the given instruction in the given list of all instructions.
    * 
    * @param instruction the instruction to obtain the pc for
    * @param instructions the list of all instructions.
    * @return the pc of the given instruction in the given list of all instructions, {@code -1}, if
    *         the instruction is not found
    */
   public static int getPcOfInstruction(Instruction instruction, List<Instruction> instructions) {
      for (int i = 0; i < instructions.size(); i++) {
         Instruction inst = instructions.get(i);
         if (inst.equals(instruction)) {
            return i;
         }
      }

      return -1;
   }


   /**
    * Checks whether a store buffer graph node is contained in the given list, which represents the
    * combination of PC and store buffer.
    * 
    * @param storeBufferGraphNodes the list to search for the according node
    * @param pc the pc to seach for
    * @param storeBuffer the store buffer to search for
    * @param memoryModel the memory model to consider
    * @return the represented location or null, if there is none
    */
   public static ControlFlowLocation getLocationRepresentedBy(List<ControlFlowLocation> storeBufferGraphNodes, int pc,
         StoreBuffer storeBuffer, EMemoryModel memoryModel) {
      for (ControlFlowLocation loc : storeBufferGraphNodes) {
         if (isRepresentedBy(loc, pc, storeBuffer, memoryModel)) {
            return loc;
         }
      }
      return null;
   }


   /**
    * Checks whether the given instruction is a synchronizing instruction.
    * 
    * @param instruction the instruction to check
    * @return {@code true}, if the given instruction is a synchronizing instruction, {@code false}
    *         else
    */
   public static boolean isSynchronizingInstruction(Instruction instruction) {
      return (instruction instanceof Fence || instruction instanceof CmpXchg || instruction instanceof Return
            || instruction instanceof AtomicRMW || instruction instanceof Invoke);
   }


   /**
    * Creates a list of all instructions in the given function in the order they are given in the
    * code.
    * 
    * @param function the function to gather the instructions for
    * @return a list of all instructions in the given function in the order they are given in the
    *         code
    */
   public static ArrayList<Instruction> gatherInstructionsInCodeOrder(FunctionDefinition function) {
      ArrayList<Instruction> list = new ArrayList<Instruction>();
      EList<BasicBlock> blocks = function.getBody().getBlocks();
      for (BasicBlock b : blocks) {
         list.addAll(b.getInstructions());
      }
      return list;
   }


   /**
    * Returns the address value pair, which is flushed in the given flush transition. NOTE: This
    * method is used by the .mtl models!
    * 
    * @param transition the flush transition to consider
    * @return the address value pair, which is flushed in the given transition, {@code null} if none
    *         was found
    */
   public static AddressValuePair getFlushedAddressValuePair(FlushTransition transition) {
      StoreBuffer sourceBuffer = transition.getSource().getBuffer();
      StoreBuffer targetBuffer = transition.getTarget().getBuffer();

      for (AddressValuePair sourcePair : sourceBuffer.getAddressValuePairs()) {
         boolean found = false;
         for (AddressValuePair targetPair : targetBuffer.getAddressValuePairs()) {
            if (sourcePair.getAddress().equals(targetPair.getAddress()) && sourcePair.getValues().equals(targetPair.getValues())) {
               found = true;
            }
         }

         if (!found) {
            return sourcePair;
         }
      }

      return null;
   }


   /**
    * Collects all early read edges in the given store buffer graph.
    * 
    * @param storeBufferGraph the store buffer graph to search in
    * @return all early read edges in the given store buffer graph
    */
   public static List<EarlyReadTransition> collectEarlyReadEdges(ControlFlowDiagram storeBufferGraph)
   {
      return storeBufferGraph.getTransitions().stream().filter(x -> (x instanceof EarlyReadTransition)).map(x -> (EarlyReadTransition) x)
            .collect(Collectors.toList());
   }


   /**
    * Collects all write def chain edges in the given store buffer graph.
    * 
    * @param storeBufferGraph the store buffer graph to search in
    * @return all write def chain edges in the given store buffer graph
    */
   public static List<WriteDefChainTransition> collectWriteDefChainTransitions(ControlFlowDiagram storeBufferGraph)
   {
      return storeBufferGraph.getTransitions().stream().filter(x -> (x instanceof WriteDefChainTransition))
            .map(x -> (WriteDefChainTransition) x).collect(Collectors.toList());
   }


   /**
    * Collects all nodes with non empty store buffers in the given store buffer graph.
    * 
    * @param storeBufferGraph the store buffer graph to search in
    * @return all nodes with non empty store buffers in the given store buffer graph
    */
   public static List<ControlFlowLocation> collectNodesWithNonEmptyStoreBuffers(ControlFlowDiagram storeBufferGraph)
   {
      return storeBufferGraph.getLocations().stream().filter(x -> !x.getBuffer().getAddressValuePairs().isEmpty())
            .collect(Collectors.toList());
   }


   /**
    * Collects all edges hosting a synchronizing instruction in the given store buffer graph.
    * 
    * @param storeBufferGraph the store buffer graph to search in
    * @return all edges hosting a synchronizing instruction in the given store buffer graph
    */
   public static List<Transition> collectEdgesWithSynchronizingInstruction(ControlFlowDiagram storeBufferGraph)
   {
      return storeBufferGraph.getTransitions().stream().filter(x -> GraphUtility.isSynchronizingInstruction(x.getInstruction()))
            .collect(Collectors.toList());
   }

}
