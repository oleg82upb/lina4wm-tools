package de.upb.lina.cfg.tools.stringrepresentation;


import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.tools.CFGConstants;
import de.upb.lina.cfg.tools.GraphUtility;
import de.upb.lina.cfg.tools.StringUtils;
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


public class InstructionToStringConverter {
   private Instruction instruction;
   private Transition transition;
   private StringBuilder stringBuilder;


   public InstructionToStringConverter(Instruction instruction) {
      this.instruction = instruction;
      this.stringBuilder = new StringBuilder();
   }


   public InstructionToStringConverter(Transition transition) {
      this(transition.getInstruction());
      this.transition = transition;
   }


   public String createStringRepresentation() {
      if (instruction instanceof Load) {
         Load load = (Load) instruction;
         stringBuilder.append(GraphUtility.addressToString(load.getResult()));
         stringBuilder.append(CFGConstants.ASSIGN);
         stringBuilder.append(CFGConstants.LOAD);
         stringBuilder.append(CFGConstants.WS);
         stringBuilder.append(StringUtils.LEFT_BRACKET);
         stringBuilder.append(GraphUtility.parameterValueToString(load.getAddress()));
         stringBuilder.append(StringUtils.RIGHT_BRACKET);
      } else if (instruction instanceof Store) {
         Store store = (Store) instruction;
         stringBuilder.append(CFGConstants.STORE);
         stringBuilder.append(StringUtils.LEFT_BRACKET);
         stringBuilder.append(GraphUtility.parameterValueToString(store.getValue()));
         stringBuilder.append(", ");
         stringBuilder.append(GraphUtility.parameterValueToString(store.getTargetAddress()));
         stringBuilder.append(StringUtils.RIGHT_BRACKET);
      } else if (instruction instanceof Branch) {
         if (transition != null) {
            if (transition instanceof GuardedTransition) {
               return ((GuardedTransition) transition).getCondition();
            } else {
               return CFGConstants.BRANCH + CFGConstants.WS + CFGConstants.PC_PREFIX + transition.getTarget().getPc();
            }
         } else {
            throw new RuntimeException("Cannot create string representation of branch instruction without according transition.");
         }
      } else if (instruction instanceof GetElementPtr) {
         GetElementPtr instr = (GetElementPtr) instruction;
         stringBuilder.append(GraphUtility.addressToString(instr.getResult()));
         stringBuilder.append(CFGConstants.ASSIGN);
         stringBuilder.append(CFGConstants.GETELEMENENTPTR);
         stringBuilder.append(StringUtils.LEFT_BRACKET);
         stringBuilder.append(GraphUtility.parameterValueToString(instr.getAggregate()));
         stringBuilder.append(", ");
         for (int i = 0; i < instr.getIndices().size(); i++) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getIndices().get(i)));
            if (i + 1 < instr.getIndices().size()) {
               stringBuilder.append(", ");
            }
         }
         return stringBuilder + StringUtils.RIGHT_BRACKET;
      } else if (instruction instanceof CmpXchg) {
         CmpXchg instr = (CmpXchg) instruction;
         stringBuilder.append(GraphUtility.addressToString(instr.getResult()));
         stringBuilder.append(CFGConstants.ASSIGN);
         stringBuilder.append("CAS(");
         stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
         stringBuilder.append(", ");
         stringBuilder.append(GraphUtility.parameterValueToString(instr.getValue()));
         stringBuilder.append(", ");
         stringBuilder.append(GraphUtility.parameterValueToString(instr.getNewValue()));
         stringBuilder.append(StringUtils.RIGHT_BRACKET);
      } else if (instruction instanceof Call) {

         Call instr = (Call) instruction;
         if (instr.getResult() != null) {
            stringBuilder.append(GraphUtility.addressToString(instr.getResult()));
            stringBuilder.append(CFGConstants.ASSIGN);
         }
         stringBuilder.append(CFGConstants.CALL);
         stringBuilder.append(CFGConstants.WS);
         stringBuilder.append(GraphUtility.parameterValueToString(instr.getFunction()));
         stringBuilder.append(GraphUtility.parameterListToString(instr.getPList()));
      } else if (instruction instanceof Alloc) {
         Alloc instr = (Alloc) instruction;
         stringBuilder.append(GraphUtility.addressToString(instr.getResult()));
         stringBuilder.append(CFGConstants.ASSIGN);
         stringBuilder.append(CFGConstants.ALLOC);
         stringBuilder.append(CFGConstants.WS);
         stringBuilder.append(GraphUtility.clean(GraphUtility.typeUseToString(instr.getType())));
      } else if (instruction instanceof ArithmeticOperation) {
         ArithmeticOperation instr = (ArithmeticOperation) instruction;
         stringBuilder.append(GraphUtility.addressToString(instr.getResult()));
         stringBuilder.append(CFGConstants.ASSIGN);

         String operation = instr.getOperation();
         stringBuilder.append(GraphUtility.valueToString(instr.getValue1()));
         stringBuilder.append(CFGConstants.WS);
         if (operation.equals("add") || operation.equals("fadd")) {
            stringBuilder.append("+ ");
         } else if (operation.equals("sub") || operation.equals("fsub")) {
            stringBuilder.append("- ");
         } else if (operation.equals("mul") || operation.equals("fmul")) {
            stringBuilder.append("* ");
         } else if (operation.equals("udiv") || operation.equals("sdiv") || operation.equals("fdiv")) {
            stringBuilder.append(": ");
         } else if (operation.equals("urem") || operation.equals("srem") || operation.equals("frem")) {
            stringBuilder.append("% ");
         }
         stringBuilder.append(GraphUtility.valueToString(instr.getValue2()));
      } else if (instruction instanceof LogicOperation) {
         LogicOperation instr = (LogicOperation) instruction;
         stringBuilder.append(GraphUtility.addressToString(instr.getResult()));
         stringBuilder.append(CFGConstants.ASSIGN);
         String operation = instr.getOperation();
         stringBuilder.append(GraphUtility.valueToString(instr.getValue1()));
         stringBuilder.append(CFGConstants.WS);
         if (operation.equals("shl")) {
            stringBuilder.append("<< ");
         } else if (operation.equals("lshr")) {
            stringBuilder.append(">>[L] ");
         } else if (operation.equals("ashr")) {
            stringBuilder.append(">>[A] ");
         } else if (operation.equals("and")) {
            stringBuilder.append("& ");
         } else if (operation.equals("or")) {
            stringBuilder.append("| ");
         } else if (operation.equals("xor")) {
            stringBuilder.append("^ ");
         }
         stringBuilder.append(GraphUtility.valueToString(instr.getValue2()));
      }
      // Compare
      else if (instruction instanceof Compare) {
         Compare instr = (Compare) instruction;
         stringBuilder.append(GraphUtility.addressToString(instr.getResult()));
         stringBuilder.append(CFGConstants.ASSIGN);
         stringBuilder.append(StringUtils.LEFT_BRACKET);
         String compare = instr.getCond();
         if (compare.equals(CFGConstants.FALSE)) {
            stringBuilder.append(CFGConstants.FALSE);
            return stringBuilder.toString();
         } else if (compare.equals(CFGConstants.TRUE)) {
            stringBuilder.append(CFGConstants.TRUE);
            return stringBuilder.toString();
         }
         stringBuilder.append(GraphUtility.valueToString(instr.getOperand1()));
         stringBuilder.append(CFGConstants.WS);
         if (compare.equals("eq")) {
            stringBuilder.append("== ");
         } else if (compare.equals("ne")) {
            stringBuilder.append("!= ");
         } else if (compare.equals("ugt") || compare.equals("sgt")) {
            stringBuilder.append("> ");
         } else if (compare.equals("uge") || compare.equals("sge")) {
            stringBuilder.append(">= ");
         } else if (compare.equals("ult") || compare.equals("slt")) {
            stringBuilder.append("< ");
         } else if (compare.equals("ule") || compare.equals("sle")) {
            stringBuilder.append("<= ");
         } else if (compare.equals("oeq")) {
            stringBuilder.append("=[o] ");
         } else if (compare.equals("ogt")) {
            stringBuilder.append(">[o] ");
         } else if (compare.equals("oge")) {
            stringBuilder.append(">=[o] ");
         } else if (compare.equals("olt")) {
            stringBuilder.append("<[o] ");
         } else if (compare.equals("ole")) {
            stringBuilder.append("<=[o] ");
         } else if (compare.equals("one")) {
            stringBuilder.append("!=[o] ");
         } else if (compare.equals("ueq")) {
            stringBuilder.append("=[u] ");
         } else if (compare.equals("ugt")) {
            stringBuilder.append(">[u] ");
         } else if (compare.equals("uge")) {
            stringBuilder.append(">=[u] ");
         } else if (compare.equals("ult")) {
            stringBuilder.append("<[u] ");
         } else if (compare.equals("ule")) {
            stringBuilder.append("<=[u] ");
         } else if (compare.equals("une")) {
            stringBuilder.append("!=[u] ");
         } else if (compare.equals("ord")) {
            stringBuilder.append("orderd ");
         } else if (compare.equals("uno")) {
            stringBuilder.append("not orderd ");
         }
         stringBuilder.append(GraphUtility.valueToString(instr.getOperand2()));
         stringBuilder.append(StringUtils.RIGHT_BRACKET);
      } else if (instruction instanceof Return) {
         stringBuilder.append(CFGConstants.RETURN);
         EObject returnValue = ((Return) instruction).getValue();
         Value value = null;
         if (returnValue instanceof Parameter) {
            value = ((Parameter) returnValue).getValue();
         } else if (returnValue instanceof PrimitiveValue) {
            value = (PrimitiveValue) returnValue;
         }

         if (value != null) {
            stringBuilder.append(CFGConstants.WS);
            stringBuilder.append(GraphUtility.valueToString(value));
            stringBuilder.append(CFGConstants.WS);
         }
         return stringBuilder.toString();
      } else if (instruction instanceof Cast) {
         Cast instr = (Cast) instruction;
         stringBuilder.append(GraphUtility.addressToString(instr.getResult()));
         stringBuilder.append(CFGConstants.ASSIGN);
         stringBuilder.append(StringUtils.LEFT_BRACKET);
         stringBuilder.append(GraphUtility.clean(GraphUtility.typeUseToString(instr.getTo())));
         stringBuilder.append(") ");
         stringBuilder.append(GraphUtility.valueToString(instr.getValue()));
      } else if (instruction instanceof Invoke) {
         Invoke instr = (Invoke) instruction;
         stringBuilder.append(CFGConstants.INVOKE);
         stringBuilder.append(CFGConstants.WS);
         stringBuilder.append(GraphUtility.addressToString(instr.getName()));
         stringBuilder.append(GraphUtility.parameterListToString(instr.getPList()));
         return stringBuilder.toString();
      }
      // Fence
      else if (instruction instanceof Fence) {
         return CFGConstants.FENCE;
      }
      // AtomicRMW
      else if (instruction instanceof AtomicRMW) {
         stringBuilder.append("atomicRMW( ");
         AtomicRMW instr = (AtomicRMW) instruction;
         String operation = instr.getOperation();
         if (operation.equals("xchg")) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" <-> ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("add")) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" = ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" + ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("sub")) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" = ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" - ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("and")) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" = ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(CFGConstants.WS);
            stringBuilder.append(CFGConstants.WEDGE);
            stringBuilder.append(CFGConstants.WS);
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("nand")) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" = ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" !& ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("or")) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" = ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(CFGConstants.WS);
            stringBuilder.append(CFGConstants.VEE);
            stringBuilder.append(CFGConstants.WS);
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("xor")) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" = ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" xor ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getArgument()));
         } else if (operation.equals("max") || operation.equals("umax")) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" = max(");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(", ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getArgument()));
            stringBuilder.append(") ");
         } else if (operation.equals("min") || operation.equals("umin")) {
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(" = min(");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getAddress()));
            stringBuilder.append(", ");
            stringBuilder.append(GraphUtility.parameterValueToString(instr.getArgument()));
            stringBuilder.append(StringUtils.RIGHT_BRACKET);
         }
         stringBuilder.append(" )");
      } else if (instruction instanceof Phi) {
         Phi phiInstruction = (Phi) instruction;
         stringBuilder.append(GraphUtility.addressToString(phiInstruction.getResult()));
         stringBuilder.append(" := ");
         stringBuilder.append(CFGConstants.PHI);
         stringBuilder.append(" ");

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
            stringBuilder.append("[");
            stringBuilder.append(GraphUtility.valueToString(phiCase.getValue()));
            stringBuilder.append(", ");
            stringBuilder.append(CFGConstants.PC_PREFIX);
            stringBuilder.append(sourcePC);
            stringBuilder.append("]");

            if (phiCaseIterator.hasNext()) {
               stringBuilder.append(", ");
            }
         }
      }
      // not-implemented
      else {
         stringBuilder.append(instruction.toString());
      }
      return stringBuilder.toString();
   }
}
