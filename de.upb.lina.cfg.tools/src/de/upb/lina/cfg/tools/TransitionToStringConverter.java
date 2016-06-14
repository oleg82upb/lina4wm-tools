package de.upb.lina.cfg.tools;


import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.PhiCase;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Value;


public class TransitionToStringConverter {

   public TransitionToStringConverter() {
   }


   /**
    * Creates a string representation of the given transition, consisting of the name of the
    * instruction linked with the transition and its parameters.
    * 
    * @param transition the transition to create the string representation of
    * @return string representation of the transition
    */
   public static String createStringRepresentationOfTransition(Transition transition) {

      if (transition instanceof FlushTransition) {

         FlushTransition flushTransition = (FlushTransition) transition;
         if (!flushTransition.getSource().getBuffer().getAddressValuePairs().isEmpty()) {
            StringBuffer stringBuffer = new StringBuffer(CFGConstants.FLUSH);
            AddressValuePair flushedAddressValuePair = GraphUtility.getFlushedAddressValuePair(flushTransition);
            if (flushedAddressValuePair != null) {
               stringBuffer.append(StringUtils.LEFT_BRACKET);
               stringBuffer.append(GraphUtility.addressValuePairToString(flushedAddressValuePair));
               stringBuffer.append(StringUtils.RIGHT_BRACKET);
            }
            return stringBuffer.toString();
         }

         throw new RuntimeException("Found flush transition for an empty buffer!");
      }

      if (transition instanceof EarlyReadTransition) {
         String s = GraphUtility.addressToString(((Load) transition.getInstruction()).getResult());
         s += CFGConstants.ASSIGN;
         s += ((EarlyReadTransition) transition).getAssignmentExpression();
         return s;
      }

      if (transition instanceof WriteDefChainTransition) {
         WriteDefChainTransition wdc = (WriteDefChainTransition) transition;
         Store store = (Store) wdc.getInstruction();
         if (wdc.getCopyAddress() != null && wdc.getCopyValue() != null) {
            String s = GraphUtility.addressToString(wdc.getCopyAddress()) + CFGConstants.ASSIGN
                  + GraphUtility.parameterValueToString(store.getTargetAddress()) + "; " + GraphUtility.addressToString(wdc.getCopyValue())
                  + CFGConstants.ASSIGN + GraphUtility.parameterValueToString(store.getValue()) + "; " + CFGConstants.STORE
                  + StringUtils.LEFT_BRACKET + wdc.getCopyValue().getName() + ", " + wdc.getCopyAddress().getName()
                  + StringUtils.RIGHT_BRACKET;
            return s;
         } else if (wdc.getCopyValue() != null) {
            String s = GraphUtility.addressToString(wdc.getCopyValue()) + CFGConstants.ASSIGN
                  + GraphUtility.parameterValueToString(store.getValue()) + "; " + CFGConstants.STORE + StringUtils.LEFT_BRACKET
                  + wdc.getCopyValue().getName() + ", " + GraphUtility.parameterValueToString(store.getTargetAddress())
                  + StringUtils.RIGHT_BRACKET;
            return s;
         } else {
            String s = GraphUtility.addressToString(wdc.getCopyAddress()) + CFGConstants.ASSIGN
                  + GraphUtility.parameterValueToString(store.getTargetAddress()) + "; " + CFGConstants.STORE + StringUtils.LEFT_BRACKET
                  + GraphUtility.parameterValueToString(store.getValue()) + ", " + wdc.getCopyAddress().getName()
                  + StringUtils.RIGHT_BRACKET;
            return s;
         }

      }


      // special transition done
      // the following use normal transitions
      StringBuffer stringBuffer = new StringBuffer();

      if (transition.getInstruction() == null) {
         return CFGConstants.TODO;
      }

      Instruction instruction = transition.getInstruction();
      if (instruction instanceof Load) {
         Load instr = (Load) transition.getInstruction();
         stringBuffer.append(GraphUtility.addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(CFGConstants.LOAD);
         stringBuffer.append(CFGConstants.WS);
         stringBuffer.append(StringUtils.LEFT_BRACKET);
         stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
         stringBuffer.append(StringUtils.RIGHT_BRACKET);
      } else if (instruction instanceof Store) {
         Store instr = (Store) transition.getInstruction();
         stringBuffer.append(CFGConstants.STORE);
         stringBuffer.append(StringUtils.LEFT_BRACKET);
         stringBuffer.append(GraphUtility.parameterValueToString(instr.getValue()));
         stringBuffer.append(", ");
         stringBuffer.append(GraphUtility.parameterValueToString(instr.getTargetAddress()));
         stringBuffer.append(StringUtils.RIGHT_BRACKET);
      } else if (instruction instanceof Branch) {
         if (transition instanceof GuardedTransition) {
            return ((GuardedTransition) transition).getCondition();
         } else {
            return CFGConstants.BRANCH + CFGConstants.WS + CFGConstants.PC_PREFIX + transition.getTarget().getPc();
         }
      } else if (instruction instanceof GetElementPtr) {
         GetElementPtr instr = (GetElementPtr) transition.getInstruction();
         stringBuffer.append(GraphUtility.addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(CFGConstants.GETELEMENENTPTR);
         stringBuffer.append(StringUtils.LEFT_BRACKET);
         stringBuffer.append(GraphUtility.parameterValueToString(instr.getAggregate()));
         stringBuffer.append(", ");
         for (int i = 0; i < instr.getIndices().size(); i++) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getIndices().get(i)));
            if (i + 1 < instr.getIndices().size()) {
               stringBuffer.append(", ");
            }
         }
         return stringBuffer + StringUtils.RIGHT_BRACKET;
      } else if (instruction instanceof CmpXchg) {
         CmpXchg instr = (CmpXchg) transition.getInstruction();
         stringBuffer.append(GraphUtility.addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append("CAS(");
         stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
         stringBuffer.append(", ");
         stringBuffer.append(GraphUtility.parameterValueToString(instr.getValue()));
         stringBuffer.append(", ");
         stringBuffer.append(GraphUtility.parameterValueToString(instr.getNewValue()));
         stringBuffer.append(StringUtils.RIGHT_BRACKET);
      } else if (instruction instanceof Call) {

         Call instr = (Call) transition.getInstruction();
         if (instr.getResult() != null) {
            stringBuffer.append(GraphUtility.addressToString(instr.getResult()));
            stringBuffer.append(CFGConstants.ASSIGN);
         }
         stringBuffer.append(CFGConstants.CALL);
         stringBuffer.append(CFGConstants.WS);
         stringBuffer.append(GraphUtility.parameterValueToString(instr.getFunction()));
         stringBuffer.append(GraphUtility.parameterListToString(instr.getPList()));
      } else if (instruction instanceof Alloc) {
         Alloc instr = (Alloc) transition.getInstruction();
         stringBuffer.append(GraphUtility.addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(CFGConstants.ALLOC);
         stringBuffer.append(CFGConstants.WS);
         stringBuffer.append(GraphUtility.clean(GraphUtility.typeUseToString(instr.getType())));
      } else if (instruction instanceof ArithmeticOperation) {
         ArithmeticOperation instr = (ArithmeticOperation) transition.getInstruction();
         stringBuffer.append(GraphUtility.addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);

         String operation = instr.getOperation();
         stringBuffer.append(GraphUtility.valueToString(instr.getValue1()));
         stringBuffer.append(CFGConstants.WS);
         if (operation.equals("add") || operation.equals("fadd")) {
            stringBuffer.append("+ ");
         } else if (operation.equals("sub") || operation.equals("fsub")) {
            stringBuffer.append("- ");
         } else if (operation.equals("mul") || operation.equals("fmul")) {
            stringBuffer.append("* ");
         } else if (operation.equals("udiv") || operation.equals("sdiv") || operation.equals("fdiv")) {
            stringBuffer.append(": ");
         } else if (operation.equals("urem") || operation.equals("srem") || operation.equals("frem")) {
            stringBuffer.append("% ");
         }
         stringBuffer.append(GraphUtility.valueToString(instr.getValue2()));
      } else if (instruction instanceof LogicOperation) {
         LogicOperation instr = (LogicOperation) transition.getInstruction();
         stringBuffer.append(GraphUtility.addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         String operation = instr.getOperation();
         stringBuffer.append(GraphUtility.valueToString(instr.getValue1()));
         stringBuffer.append(CFGConstants.WS);
         if (operation.equals("shl")) {
            stringBuffer.append("<< ");
         } else if (operation.equals("lshr")) {
            stringBuffer.append(">>[L] ");
         } else if (operation.equals("ashr")) {
            stringBuffer.append(">>[A] ");
         } else if (operation.equals("and")) {
            stringBuffer.append("& ");
         } else if (operation.equals("or")) {
            stringBuffer.append("| ");
         } else if (operation.equals("xor")) {
            stringBuffer.append("^ ");
         }
         stringBuffer.append(GraphUtility.valueToString(instr.getValue2()));
      }
      // Compare
      else if (instruction instanceof Compare) {
         Compare instr = (Compare) transition.getInstruction();
         stringBuffer.append(GraphUtility.addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(StringUtils.LEFT_BRACKET);
         String compare = instr.getCond();
         if (compare.equals(CFGConstants.FALSE)) {
            stringBuffer.append(CFGConstants.FALSE);
            return stringBuffer.toString();
         } else if (compare.equals(CFGConstants.TRUE)) {
            stringBuffer.append(CFGConstants.TRUE);
            return stringBuffer.toString();
         }
         stringBuffer.append(GraphUtility.valueToString(instr.getOperand1()));
         stringBuffer.append(CFGConstants.WS);
         if (compare.equals("eq")) {
            stringBuffer.append("== ");
         } else if (compare.equals("ne")) {
            stringBuffer.append("!= ");
         } else if (compare.equals("ugt") || compare.equals("sgt")) {
            stringBuffer.append("> ");
         } else if (compare.equals("uge") || compare.equals("sge")) {
            stringBuffer.append(">= ");
         } else if (compare.equals("ult") || compare.equals("slt")) {
            stringBuffer.append("< ");
         } else if (compare.equals("ule") || compare.equals("sle")) {
            stringBuffer.append("<= ");
         } else if (compare.equals("oeq")) {
            stringBuffer.append("=[o] ");
         } else if (compare.equals("ogt")) {
            stringBuffer.append(">[o] ");
         } else if (compare.equals("oge")) {
            stringBuffer.append(">=[o] ");
         } else if (compare.equals("olt")) {
            stringBuffer.append("<[o] ");
         } else if (compare.equals("ole")) {
            stringBuffer.append("<=[o] ");
         } else if (compare.equals("one")) {
            stringBuffer.append("!=[o] ");
         } else if (compare.equals("ueq")) {
            stringBuffer.append("=[u] ");
         } else if (compare.equals("ugt")) {
            stringBuffer.append(">[u] ");
         } else if (compare.equals("uge")) {
            stringBuffer.append(">=[u] ");
         } else if (compare.equals("ult")) {
            stringBuffer.append("<[u] ");
         } else if (compare.equals("ule")) {
            stringBuffer.append("<=[u] ");
         } else if (compare.equals("une")) {
            stringBuffer.append("!=[u] ");
         } else if (compare.equals("ord")) {
            stringBuffer.append("orderd ");
         } else if (compare.equals("uno")) {
            stringBuffer.append("not orderd ");
         }
         stringBuffer.append(GraphUtility.valueToString(instr.getOperand2()));
         stringBuffer.append(StringUtils.RIGHT_BRACKET);
      } else if (instruction instanceof Return) {
         stringBuffer.append(CFGConstants.RETURN);
         EObject returnValue = ((Return) transition.getInstruction()).getValue();
         Value value = null;
         if (returnValue instanceof Parameter) {
            value = ((Parameter) returnValue).getValue();
         } else if (returnValue instanceof PrimitiveValue) {
            value = (PrimitiveValue) returnValue;
         }

         if (value != null) {
            stringBuffer.append(CFGConstants.WS);
            stringBuffer.append(GraphUtility.valueToString(value));
            stringBuffer.append(CFGConstants.WS);
         }
         return stringBuffer.toString();
      } else if (instruction instanceof Cast) {
         Cast instr = (Cast) transition.getInstruction();
         stringBuffer.append(GraphUtility.addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(StringUtils.LEFT_BRACKET);
         stringBuffer.append(GraphUtility.clean(GraphUtility.typeUseToString(instr.getTo())));
         stringBuffer.append(") ");
         stringBuffer.append(GraphUtility.valueToString(instr.getValue()));
      } else if (instruction instanceof Invoke) {
         Invoke instr = (Invoke) transition.getInstruction();
         stringBuffer.append(CFGConstants.INVOKE);
         stringBuffer.append(CFGConstants.WS);
         stringBuffer.append(GraphUtility.addressToString(instr.getName()));
         stringBuffer.append(GraphUtility.parameterListToString(instr.getPList()));
         return stringBuffer.toString();
      }
      // Fence
      else if (instruction instanceof Fence) {
         return CFGConstants.FENCE;
      }
      // AtomicRMW
      else if (instruction instanceof AtomicRMW) {
         stringBuffer.append("atomicRMW( ");
         AtomicRMW instr = (AtomicRMW) transition.getInstruction();
         String operation = instr.getOperation();
         if (operation.equals("xchg")) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" <-> ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("add")) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" + ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("sub")) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" - ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("and")) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(CFGConstants.WS);
            stringBuffer.append(CFGConstants.WEDGE);
            stringBuffer.append(CFGConstants.WS);
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("nand")) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" !& ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("or")) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(CFGConstants.WS);
            stringBuffer.append(CFGConstants.VEE);
            stringBuffer.append(CFGConstants.WS);
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("xor")) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" xor ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("max") || operation.equals("umax")) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = max(");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(", ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getArgument()));
            stringBuffer.append(") ");
         } else if (operation.equals("min") || operation.equals("umin")) {
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = min(");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuffer.append(", ");
            stringBuffer.append(GraphUtility.parameterValueToString(instr.getArgument()));
            stringBuffer.append(StringUtils.RIGHT_BRACKET);
         }
         stringBuffer.append(" )");
      } else if (instruction instanceof Phi) {
         Phi phiInstruction = (Phi) transition.getInstruction();
         stringBuffer = new StringBuffer(GraphUtility.addressToString(phiInstruction.getResult()));
         stringBuffer.append(" := ");
         stringBuffer.append(CFGConstants.PHI);
         stringBuffer.append(" ");

         FunctionBody body = null;
         EObject o = phiInstruction.eContainer().eContainer();
         if (o instanceof FunctionBody) {
            body = (FunctionBody) o;
         } else {
            throw new RuntimeException("Could not resolve FunctionBody of phi instruction");
         }

         Iterator<PhiCase> phiCaseIterator = phiInstruction.getCases().iterator();
         while (phiCaseIterator.hasNext()) {
            PhiCase phiCase = phiCaseIterator.next();
            String caseLabel = phiCase.getLabel().replace("%", "");
            int sourcePC = -1;

            for (BasicBlock block : body.getBlocks()) {
               if (caseLabel.equals(block.getLabel())) {
                  // get last instruction because it is the one jumping to
                  // the block containing the phi instruction
                  int size = block.getInstructions().size();
                  Instruction last = block.getInstructions().get(size - 1);
                  sourcePC = GraphUtility.getPcOfInstruction(last,
                        GraphUtility.gatherInstructionsInCodeOrder((FunctionDefinition) body.eContainer()));
               }
            }

            // we use the PC instead of the original label, since we don't
            // have the labels in the store buffer graph anymore
            stringBuffer.append("[");
            stringBuffer.append(GraphUtility.valueToString(phiCase.getValue()));
            stringBuffer.append(", ");
            stringBuffer.append(CFGConstants.PC_PREFIX);
            stringBuffer.append(sourcePC);
            stringBuffer.append("]");

            if (phiCaseIterator.hasNext()) {
               stringBuffer.append(", ");
            }
         }
      }
      // not-implemented
      else {
         stringBuffer.append(instruction.toString());
      }
      return stringBuffer.toString();
   }

}
