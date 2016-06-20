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


/**
 * This class is responsible for creating the string representation of instructions. In order to do
 * so, create a new instance of this class and pass it either the instruction or the transition
 * holding the according instruction. Calling {{@link #createStringRepresentation()} will then
 * return the string representation of the according instruction. NOTE: Since creating the string
 * representation of a branch instruction is only possible, if the transition holding the
 * instruction is known is well, it is a better idea to always initialize the class with the
 * transition, holding it, if possible.
 * 
 * @author Alexander Hetzer
 *
 */
public class InstructionToStringConverter {
   private Instruction instruction;
   private Transition transition;
   private StringBuilder stringBuilder;

   private StringConversionManager stringConversionManager;


   /**
    * Creates a new instruction to string converter, which can be used to create the string
    * representation of the given function. NOTE: Since creating the string representation of a
    * branch instruction is only possible, if the transition holding the instruction is known is
    * well, this constructor should be avoided!
    * 
    * @param instruction the instruction to create the string representation of
    * @param stringConversionManager the string conversion manager, which should be used to clean
    *           strings
    */
   public InstructionToStringConverter(Instruction instruction, StringConversionManager stringConversionManager) {
      this.instruction = instruction;
      this.stringBuilder = new StringBuilder();
      this.stringConversionManager = stringConversionManager;
   }


   /**
    * Creates a new instruction to string converter, which can be used to create the string
    * representation of the function hosted by the given transition.
    * 
    * @param transition the transition hosting the instruction to create the string representation
    *           of
    * @param stringConversionManager the string conversion manager, which should be used to clean
    *           strings
    */
   public InstructionToStringConverter(Transition transition, StringConversionManager stringConversionManager) {
      this(transition.getInstruction(), stringConversionManager);
      this.transition = transition;
   }


   /**
    * Creates the string representation of the instruction, this class was initialized with.
    * 
    * @return the string representation of the instruction, this class was initialized with
    */
   public String createStringRepresentation() {
      if (instruction instanceof Load) {
         createLoadStringRepresentation();
      } else if (instruction instanceof Store) {
         createStoreStringRepresentation();
      } else if (instruction instanceof Branch) {
         createBranchStringRepresentation();
      } else if (instruction instanceof GetElementPtr) {
         createGetElementPointerStringRepresentation();
      } else if (instruction instanceof CmpXchg) {
         createCompareExchangeStringRepresentation();
      } else if (instruction instanceof Call) {
         createCallStringRepresentation();
      } else if (instruction instanceof Alloc) {
         createAllocStringRepresentation();
      } else if (instruction instanceof ArithmeticOperation) {
         createArithmeticOperationStringRepresentation();
      } else if (instruction instanceof LogicOperation) {
         createLogicOperationStringRepresentation();
      } else if (instruction instanceof Compare) {
         createCompareStringRepresentation();
      } else if (instruction instanceof Return) {
         return createReturnStringRepresentation();
      } else if (instruction instanceof Cast) {
         createCastStringRepresentation();
      } else if (instruction instanceof Invoke) {
         createInvokeStringRepresentation();
      } else if (instruction instanceof Fence) {
         createFenceStringRepresentation();
      } else if (instruction instanceof AtomicRMW) {
         createAtomicRMWStringRepresentation();
      } else if (instruction instanceof Phi) {
         createPhiStringRepresentation();
      } else {
         // backup: instruction not-implemented
         stringBuilder.append(instruction.toString());
      }
      return stringBuilder.toString();
   }


   private void createCompareStringRepresentation() {
      Compare compare = (Compare) instruction;
      stringBuilder.append(stringConversionManager.addressToString(compare.getResult()));
      stringBuilder.append(CFGConstants.ASSIGN);
      stringBuilder.append(StringUtils.LEFT_BRACKET);
      String compareCondition = compare.getCond();
      if (compareCondition.equals(CFGConstants.FALSE)) {
         stringBuilder.append(CFGConstants.FALSE);
         return;
      } else if (compareCondition.equals(CFGConstants.TRUE)) {
         stringBuilder.append(CFGConstants.TRUE);
         return;
      }
      stringBuilder.append(stringConversionManager.valueToString(compare.getOperand1()));
      stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
      if (compareCondition.equals("eq")) {
         stringBuilder.append("== ");
      } else if (compareCondition.equals("ne")) {
         stringBuilder.append("!= ");
      } else if (compareCondition.equals("ugt") || compareCondition.equals("sgt")) {
         stringBuilder.append("> ");
      } else if (compareCondition.equals("uge") || compareCondition.equals("sge")) {
         stringBuilder.append(">= ");
      } else if (compareCondition.equals("ult") || compareCondition.equals("slt")) {
         stringBuilder.append("< ");
      } else if (compareCondition.equals("ule") || compareCondition.equals("sle")) {
         stringBuilder.append("<= ");
      } else if (compareCondition.equals("oeq")) {
         stringBuilder.append("=[o] ");
      } else if (compareCondition.equals("ogt")) {
         stringBuilder.append(">[o] ");
      } else if (compareCondition.equals("oge")) {
         stringBuilder.append(">=[o] ");
      } else if (compareCondition.equals("olt")) {
         stringBuilder.append("<[o] ");
      } else if (compareCondition.equals("ole")) {
         stringBuilder.append("<=[o] ");
      } else if (compareCondition.equals("one")) {
         stringBuilder.append("!=[o] ");
      } else if (compareCondition.equals("ueq")) {
         stringBuilder.append("=[u] ");
      } else if (compareCondition.equals("ugt")) {
         stringBuilder.append(">[u] ");
      } else if (compareCondition.equals("uge")) {
         stringBuilder.append(">=[u] ");
      } else if (compareCondition.equals("ult")) {
         stringBuilder.append("<[u] ");
      } else if (compareCondition.equals("ule")) {
         stringBuilder.append("<=[u] ");
      } else if (compareCondition.equals("une")) {
         stringBuilder.append("!=[u] ");
      } else if (compareCondition.equals("ord")) {
         stringBuilder.append("orderd ");
      } else if (compareCondition.equals("uno")) {
         stringBuilder.append("not orderd ");
      }
      stringBuilder.append(stringConversionManager.valueToString(compare.getOperand2()));
      stringBuilder.append(StringUtils.RIGHT_BRACKET);
   }


   private void createLogicOperationStringRepresentation() {
      LogicOperation logicOperation = (LogicOperation) instruction;
      stringBuilder.append(stringConversionManager.addressToString(logicOperation.getResult()));
      stringBuilder.append(CFGConstants.ASSIGN);
      String operationName = logicOperation.getOperation();
      stringBuilder.append(stringConversionManager.valueToString(logicOperation.getValue1()));
      stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
      if (operationName.equals("shl")) {
         stringBuilder.append("<< ");
      } else if (operationName.equals("lshr")) {
         stringBuilder.append(">>[L] ");
      } else if (operationName.equals("ashr")) {
         stringBuilder.append(">>[A] ");
      } else if (operationName.equals("and")) {
         stringBuilder.append("& ");
      } else if (operationName.equals("or")) {
         stringBuilder.append("| ");
      } else if (operationName.equals("xor")) {
         stringBuilder.append("^ ");
      }
      stringBuilder.append(stringConversionManager.valueToString(logicOperation.getValue2()));
   }


   private void createArithmeticOperationStringRepresentation() {
      ArithmeticOperation arithmeticOperation = (ArithmeticOperation) instruction;
      stringBuilder.append(stringConversionManager.addressToString(arithmeticOperation.getResult()));
      stringBuilder.append(CFGConstants.ASSIGN);

      String operation = arithmeticOperation.getOperation();
      stringBuilder.append(stringConversionManager.valueToString(arithmeticOperation.getValue1()));
      stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
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
      stringBuilder.append(stringConversionManager.valueToString(arithmeticOperation.getValue2()));
   }


   private void createAllocStringRepresentation() {
      Alloc alloc = (Alloc) instruction;
      stringBuilder.append(stringConversionManager.addressToString(alloc.getResult()));
      stringBuilder.append(CFGConstants.ASSIGN);
      stringBuilder.append(CFGConstants.ALLOC);
      stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
      stringBuilder.append(stringConversionManager.clean(stringConversionManager.typeUseToString(alloc.getType())));
   }


   private void createCallStringRepresentation() {
      Call call = (Call) instruction;
      if (call.getResult() != null) {
         stringBuilder.append(stringConversionManager.addressToString(call.getResult()));
         stringBuilder.append(CFGConstants.ASSIGN);
      }
      stringBuilder.append(CFGConstants.CALL);
      stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
      stringBuilder.append(stringConversionManager.parameterValueToString(call.getFunction()));
      stringBuilder.append(stringConversionManager.parameterListToString(call.getPList()));
   }


   private void createCompareExchangeStringRepresentation() {
      CmpXchg compareExchange = (CmpXchg) instruction;
      stringBuilder.append(stringConversionManager.addressToString(compareExchange.getResult()));
      stringBuilder.append(CFGConstants.ASSIGN);
      stringBuilder.append("CAS(");
      stringBuilder.append(stringConversionManager.parameterValueToString(compareExchange.getAddress()));
      stringBuilder.append(", ");
      stringBuilder.append(stringConversionManager.parameterValueToString(compareExchange.getValue()));
      stringBuilder.append(", ");
      stringBuilder.append(stringConversionManager.parameterValueToString(compareExchange.getNewValue()));
      stringBuilder.append(StringUtils.RIGHT_BRACKET);
   }


   private void createGetElementPointerStringRepresentation() {
      GetElementPtr getElementPointer = (GetElementPtr) instruction;
      stringBuilder.append(stringConversionManager.addressToString(getElementPointer.getResult()));
      stringBuilder.append(CFGConstants.ASSIGN);
      stringBuilder.append(CFGConstants.GETELEMENENTPTR);
      stringBuilder.append(StringUtils.LEFT_BRACKET);
      stringBuilder.append(stringConversionManager.parameterValueToString(getElementPointer.getAggregate()));
      for (Parameter getElementPointerIndex : getElementPointer.getIndices()) {
         stringBuilder.append(", ");
         stringBuilder.append(stringConversionManager.parameterValueToString(getElementPointerIndex));
      }
      stringBuilder.append(StringUtils.RIGHT_BRACKET);
   }


   private void createBranchStringRepresentation() {
      if (transition != null) {
         if (transition instanceof GuardedTransition) {
            stringBuilder.append(((GuardedTransition) transition).getCondition());
         } else {
            stringBuilder.append(CFGConstants.BRANCH + StringUtils.WHITESPACE_SINGLE + CFGConstants.PC_PREFIX
                  + transition.getTarget().getPc());
         }
      } else {
         // notice that a suitable string representation of the branch instruction can only be
         // created when knowing the transition it is linked to
         throw new RuntimeException("Cannot create string representation of branch instruction without according transition.");
      }
   }


   private void createStoreStringRepresentation() {
      Store store = (Store) instruction;
      stringBuilder.append(CFGConstants.STORE);
      stringBuilder.append(StringUtils.LEFT_BRACKET);
      stringBuilder.append(stringConversionManager.parameterValueToString(store.getValue()));
      stringBuilder.append(", ");
      stringBuilder.append(stringConversionManager.parameterValueToString(store.getTargetAddress()));
      stringBuilder.append(StringUtils.RIGHT_BRACKET);
   }


   private void createLoadStringRepresentation() {
      Load load = (Load) instruction;
      stringBuilder.append(stringConversionManager.addressToString(load.getResult()));
      stringBuilder.append(CFGConstants.ASSIGN);
      stringBuilder.append(CFGConstants.LOAD);
      stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
      stringBuilder.append(StringUtils.LEFT_BRACKET);
      stringBuilder.append(stringConversionManager.parameterValueToString(load.getAddress()));
      stringBuilder.append(StringUtils.RIGHT_BRACKET);
   }


   private String createReturnStringRepresentation() {
      Return returnInstruction = ((Return) instruction);
      stringBuilder.append(CFGConstants.RETURN);
      EObject returnValue = returnInstruction.getValue();
      Value castedReturnValue = null;
      if (returnValue instanceof Parameter) {
         castedReturnValue = ((Parameter) returnValue).getValue();
      } else if (returnValue instanceof PrimitiveValue) {
         castedReturnValue = (PrimitiveValue) returnValue;
      }

      if (castedReturnValue != null) {
         stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
         stringBuilder.append(stringConversionManager.valueToString(castedReturnValue));
         stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
      }
      return stringBuilder.toString();
   }


   private void createCastStringRepresentation() {
      Cast instr = (Cast) instruction;
      stringBuilder.append(stringConversionManager.addressToString(instr.getResult()));
      stringBuilder.append(CFGConstants.ASSIGN);
      stringBuilder.append(StringUtils.LEFT_BRACKET);
      stringBuilder.append(stringConversionManager.clean(stringConversionManager.typeUseToString(instr.getTo())));
      stringBuilder.append(") ");
      stringBuilder.append(stringConversionManager.valueToString(instr.getValue()));
   }


   private void createInvokeStringRepresentation() {
      Invoke instr = (Invoke) instruction;
      stringBuilder.append(CFGConstants.INVOKE);
      stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
      stringBuilder.append(stringConversionManager.addressToString(instr.getName()));
      stringBuilder.append(stringConversionManager.parameterListToString(instr.getPList()));
   }


   private void createFenceStringRepresentation() {
      stringBuilder.append(CFGConstants.FENCE);
   }


   private void createAtomicRMWStringRepresentation() {
      stringBuilder.append("atomicRMW( ");
      AtomicRMW atomicReadModifyWrite = (AtomicRMW) instruction;
      String operationName = atomicReadModifyWrite.getOperation();
      if (operationName.equals("xchg")) {
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" <-> ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getArgument()));
      } else if (operationName.equals("add")) {
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" = ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" + ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getArgument()));
      } else if (operationName.equals("sub")) {
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" = ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" - ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getArgument()));
      } else if (operationName.equals("and")) {
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" = ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
         stringBuilder.append(CFGConstants.WEDGE);
         stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getArgument()));
      } else if (operationName.equals("nand")) {
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" = ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" !& ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getArgument()));
      } else if (operationName.equals("or")) {
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" = ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
         stringBuilder.append(CFGConstants.VEE);
         stringBuilder.append(StringUtils.WHITESPACE_SINGLE);
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getArgument()));
      } else if (operationName.equals("xor")) {
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" = ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" xor ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getArgument()));
      } else if (operationName.equals("max") || operationName.equals("umax")) {
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" = max(");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(", ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getArgument()));
         stringBuilder.append(") ");
      } else if (operationName.equals("min") || operationName.equals("umin")) {
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(" = min(");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getAddress()));
         stringBuilder.append(", ");
         stringBuilder.append(stringConversionManager.parameterValueToString(atomicReadModifyWrite.getArgument()));
         stringBuilder.append(StringUtils.RIGHT_BRACKET);
      }
      stringBuilder.append(" )");
   }


   private void createPhiStringRepresentation() {
      Phi phiInstruction = (Phi) instruction;
      stringBuilder.append(stringConversionManager.addressToString(phiInstruction.getResult()));
      stringBuilder.append(" := ");
      stringBuilder.append(CFGConstants.PHI);
      stringBuilder.append(" ");

      FunctionBody functionBodyContainingPhi = null;
      EObject suspectedFunctionBodyContainingPhi = phiInstruction.eContainer().eContainer();
      if (suspectedFunctionBodyContainingPhi instanceof FunctionBody) {
         functionBodyContainingPhi = (FunctionBody) suspectedFunctionBodyContainingPhi;
      } else {
         throw new RuntimeException("Could not resolve function body of phi instruction " + phiInstruction + ".");
      }

      Iterator<PhiCase> phiCaseIterator = phiInstruction.getCases().iterator();
      while (phiCaseIterator.hasNext()) {
         PhiCase phiCase = phiCaseIterator.next();
         String caseLabel = phiCase.getLabel().replace("%", "");
         int sourcePC = -1;

         for (BasicBlock block : functionBodyContainingPhi.getBlocks()) {
            if (caseLabel.equals(block.getLabel())) {
               // get last instruction because it is the one jumping to
               // the block containing the phi instruction
               int size = block.getInstructions().size();
               Instruction last = block.getInstructions().get(size - 1);
               sourcePC = GraphUtility.getPcOfInstruction(last,
                     GraphUtility.gatherInstructionsInCodeOrder((FunctionDefinition) functionBodyContainingPhi.eContainer()));
            }
         }

         // we use the PC instead of the original label, since we don't
         // have the labels in the store buffer graph anymore
         stringBuilder.append("[");
         stringBuilder.append(stringConversionManager.valueToString(phiCase.getValue()));
         stringBuilder.append(", ");
         stringBuilder.append(CFGConstants.PC_PREFIX);
         stringBuilder.append(sourcePC);
         stringBuilder.append("]");

         if (phiCaseIterator.hasNext()) {
            stringBuilder.append(", ");
         }
      }
   }
}
