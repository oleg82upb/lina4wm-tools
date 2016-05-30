package de.upb.lina.cfg.tools.checks;


import java.util.ArrayList;
import java.util.List;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.EMemoryModel;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.strategies.SCGraphGenerator;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl;


/**
 * Checker for writing loops without fences.
 * 
 * @author Alexander Hetzer
 *
 */
public class WritingLoopWithoutFencePropertyChecker extends AbstractPropertyChecker {

   private String result;


   public WritingLoopWithoutFencePropertyChecker(LLVM ast) {
      super(ast);
   }


   @Override
   public boolean check() {
      result = "";
      isPropetyFulfilled = checkforLoopWithoutFence();
      if (isPropetyFulfilled) {
         addMessage("The selected ast contains a writing loop without fence in function " + result + ".");
      }
      return isPropetyFulfilled;
   }


   private boolean checkforLoopWithoutFence() {
      int a_elem = ast.getElements().size();
      boolean loopWithoutFence = false;
      boolean loopWithoutFenceinfunc = false;

      // for every function
      for (int i = 0; i < a_elem; i++) {
         if (ast.getElements().get(i) instanceof FunctionDefinitionImpl) {
            FunctionDefinition func = (FunctionDefinition) ast.getElements().get(i);
            if (func.getBody() != null) {
               // create sc-graph and search for loops without fence
               SCGraphGenerator sc = new SCGraphGenerator(func);
               Transition storeInLoopWithoutFence = containsLoopWithoutFences(sc.createGraph());
               loopWithoutFenceinfunc = storeInLoopWithoutFence != null;

               if (loopWithoutFenceinfunc) {
                  result = func.getAddress().getName();
                  if (CFGConstants.IN_DEBUG_MODE) {
                     System.out.println("Writing loops without fence found in function " + func.getAddress().getName());
                  }
               }
            }
         }
         loopWithoutFence = loopWithoutFence | loopWithoutFenceinfunc;
      }
      if (CFGConstants.IN_DEBUG_MODE) {
         System.out.println("Writing loop without fence:" + loopWithoutFence);
      }
      return loopWithoutFence;
   }


   private Transition containsLoopWithoutFences(ControlFlowDiagram cfg) {
      List<Transition> transitions = cfg.getTransitions();
      for (Transition t : transitions) {
         if (t.getInstruction() instanceof Store && detectLoopWithoutFence(t)) {
            return t;
         }
      }

      return null;
   }


   private boolean detectLoopWithoutFence(Transition t) {
      List<Transition> explored = new ArrayList<Transition>();
      explored.add(t);
      for (Transition tr : t.getTarget().getOutgoing())
         if (isLoopWithoutFence(tr, explored, t))
            return true;
      return false;
   }


   private boolean isLoopWithoutFence(Transition t, List<Transition> explored, Transition write) {
      // fence found
      if (GraphUtility.isSynch(t.getInstruction())) {
         return false;
      }
      // loop without fence found
      if (t.equals(write)) {
         return true;
      }

      // loop found, but no write inside the loop
      if (explored.contains(t)) {
         return false;
      }
      // reached end of graph
      if (t.getTarget().getOutgoing().isEmpty())
         return false;
      // check for all outgoing transitions
      explored.add(t);
      for (Transition transition : t.getTarget().getOutgoing()) {
         if (isLoopWithoutFence(transition, explored, write)) {
            return true;
         }
      }
      // no loop without fence found
      explored.remove(t);
      return false;
   }


   @Override
   protected void setErrorLevel() {
      errorLevel = CFGConstants.LEVEL_ERROR;
   }


   @Override
   protected void setSemanticsToPerformChecksFor() {
      addSemanticToPerformChecksFor(EMemoryModel.TSO);
      addSemanticToPerformChecksFor(EMemoryModel.PSO);
   }

}
