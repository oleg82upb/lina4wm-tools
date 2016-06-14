package de.upb.lina.cfg.tools;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Aggregate_Type;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.DecimalConstant;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.FunctionParameter;
import de.upb.llvm_parser.llvm.FunctionType;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.IntegerConstant;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.NestedCast;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.PhiCase;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.Vector;


public abstract class GraphUtility {

   private static final String RIGHT_BRACKET = ")";
   private static final String LEFT_BRACKET = "(";
   private final static String REPLACE_STRINGS_REGEX = "\\s|\"|@_|@|%";
   private final static String REPLACE_DOTS_REGEX = "\\.";
   private final static String NUMBERS_REGEX = "[0-9]";
   private final static String EMPTY_STRING = "";
   private final static Pattern REPLACE_PATTERN = Pattern.compile(REPLACE_STRINGS_REGEX);
   private final static Pattern REPLACE_DOT_PATTERN = Pattern.compile(REPLACE_DOTS_REGEX);


   /**
    * Deletes any strange symbols used in LLVM code such as {@code @} or {@code %} from the given
    * string. If the string only consists of numbers after this procedure, a 'v' will be
    * concatenated in front of the number. The resulting string is returned.
    * 
    * @param string the string to clean
    * @return the result of the clean operation
    */
   public static String clean(String string) {
      // TODO: determine whether the patterns cause any problems
      // unless nothing strange happens all of a sudden, we can delete the commented code soon
      // int loc = string.indexOf("%");
      // if the address is starts with a number, do not give it a v_
      // if (loc > -1 && string.substring(loc + 1, loc + 2).matches("[0-9]")) {
      // string = string.replaceAll("%", "v");
      // } else {
      // string = string.replaceAll("%", "");
      // }
      // string = string.trim();
      boolean needsVariablePrefix = string.contains("%");
      string = REPLACE_PATTERN.matcher(string).replaceAll(EMPTY_STRING);
      string = REPLACE_DOT_PATTERN.matcher(string).replaceAll("_");
      // old string.replaceAll(REPLACE_STRINGS_REGEX, EMPTY_STRING);
      if (needsVariablePrefix && string.matches(NUMBERS_REGEX)) {
         string = "v".concat(string);
      }
      // string = string.replaceAll("\"", "");
      // string = string.replaceAll("\\.", "_");

      // if the address is starts with a number, do not give it a v_
      // string = string.replaceAll("@_", "");

      // string = string.replaceAll("@", "");

      return string;
   }


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
      return (bufferToString(node, memoryModel).equalsIgnoreCase(bufferToString(buffer, pc, memoryModel)));
   }


   /**
    * Returns the string representation of the given store buffer graph node under the given memory
    * model.
    * 
    * @param node the store buffer graph node to represent as a string
    * @return the string representation of the given store buffer graph node under the given memory
    *         model
    */
   public static String bufferToString(ControlFlowLocation node, EMemoryModel memoryModel) {
      return bufferToString(node.getBuffer(), node.getPc(), memoryModel);
   }


   /**
    * Returns the string representation of the store buffer graph node constructed from the given pc
    * and store buffer under the given memory model.
    * 
    * @param pc the pc to use to construct a store buffer graph node
    * @param storeBuffer the store buffer to use to construct a store buffer graph node
    * @param memoryModel the memory model to consider
    * @return the string representation of given store buffer graph node constructed from the given
    *         pc and store buffer under the given memory model
    */
   public static String bufferToString(StoreBuffer storeBuffer, int pc, EMemoryModel memoryModel) {

      StringBuffer stringBuffer = new StringBuffer(CFGConstants.PC_PREFIX);
      stringBuffer.append(pc);

      if (storeBuffer.getAddressValuePairs().isEmpty()) {
         return stringBuffer.toString();
      }

      stringBuffer.append(" <");
      if (memoryModel == EMemoryModel.SC || memoryModel == EMemoryModel.TSO) {

         Iterator<AddressValuePair> addressValuePairIterator = storeBuffer.getAddressValuePairs().iterator();
         while (addressValuePairIterator.hasNext()) {
            stringBuffer.append(LEFT_BRACKET);
            stringBuffer.append(addressValuePairToString(addressValuePairIterator.next()));
            stringBuffer.append(RIGHT_BRACKET);
            if (addressValuePairIterator.hasNext()) {
               stringBuffer.append(", ");
            }
         }
      } else if (memoryModel == EMemoryModel.PSO) {
         // TODO improve this, by sorting the the addressvaluepairs directly, using a
         // comparator
         // entries will be represented in alphabetical order
         ArrayList<String> addressNamesInStoreBuffer = new ArrayList<String>();

         for (AddressValuePair addressValuePair : storeBuffer.getAddressValuePairs()) {
            Value addressValue = addressValuePair.getAddress().getValue();
            String addressName = valueToLLVMString(addressValue);
            if (!addressNamesInStoreBuffer.contains(addressName)) {
               addressNamesInStoreBuffer.add(addressName);
            }
         }

         Collections.sort(addressNamesInStoreBuffer, String.CASE_INSENSITIVE_ORDER);

         // Create representation in sorted order
         Iterator<String> addressNameIterator = addressNamesInStoreBuffer.iterator();
         while (addressNameIterator.hasNext()) {
            String addressName = addressNameIterator.next();
            for (AddressValuePair addressValuePair : storeBuffer.getAddressValuePairs()) {
               Value addressValue = addressValuePair.getAddress().getValue();
               if (addressName.equals(valueToLLVMString(addressValue))) {
                  stringBuffer.append(LEFT_BRACKET);
                  stringBuffer.append(addressValuePairToString(addressValuePair));
                  stringBuffer.append(RIGHT_BRACKET);
                  if (addressNameIterator.hasNext()) {
                     stringBuffer.append(", ");
                  }
               }
            }
         }

      } else {
         stringBuffer.append("not specified");
      }

      stringBuffer.append(">");
      return stringBuffer.toString();
   }


   /**
    * Returns the string representation of the given address value pair.
    * 
    * @param addressValuePair the address value pair to represent as a string
    * @return the string representation of the given address value pair
    */
   public static String addressValuePairToString(AddressValuePair addressValuePair) {
      StringBuffer stringBuffer = new StringBuffer(valueToString(addressValuePair.getAddress().getValue()));
      stringBuffer.append(": ");
      Iterator<Parameter> parameterIterator = addressValuePair.getValues().iterator();
      while (parameterIterator.hasNext()) {
         Parameter parameter = parameterIterator.next();
         stringBuffer.append(GraphUtility.valueToString(parameter.getValue()));
         if (parameterIterator.hasNext()) {
            stringBuffer.append(", ");
         }
      }
      return stringBuffer.toString();
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
    * Creates a string representation of the given transition, consisting of the name of the
    * instruction linked with the transition and its parameters.
    * 
    * @param transition the transition to create the string representation of
    * @return string representation of the transition
    */
   public static String createStringRepresentationOfTransition(Transition transition) {

      if (transition instanceof FlushTransition) {

         if (!transition.getSource().getBuffer().getAddressValuePairs().isEmpty()) {

            if (transition.getDiagram().getMemoryModel() == EMemoryModel.TSO.getModelId()) {
               // this is TSO specific as the whole pair
               AddressValuePair p = transition.getSource().getBuffer().getAddressValuePairs().get(0);
               return CFGConstants.FLUSH + LEFT_BRACKET + addressValuePairToString(p) + RIGHT_BRACKET;
            }
            return CFGConstants.FLUSH; // TODO compute what was flushed for PSO
         }

         throw new RuntimeException("Found flush transition for an empty buffer!");
      }

      if (transition instanceof EarlyReadTransition) {
         String s = addressToString(((Load) transition.getInstruction()).getResult());
         s += CFGConstants.ASSIGN;
         s += ((EarlyReadTransition) transition).getAssignmentExpression();
         return s;
      }

      if (transition instanceof WriteDefChainTransition) {
         WriteDefChainTransition wdc = (WriteDefChainTransition) transition;
         Store store = (Store) wdc.getInstruction();
         if (wdc.getCopyAddress() != null && wdc.getCopyValue() != null) {
            String s = addressToString(wdc.getCopyAddress()) + CFGConstants.ASSIGN + parameterValueToString(store.getTargetAddress())
                  + "; " + addressToString(wdc.getCopyValue()) + CFGConstants.ASSIGN + parameterValueToString(store.getValue()) + "; "
                  + CFGConstants.STORE + LEFT_BRACKET + wdc.getCopyValue().getName() + ", " + wdc.getCopyAddress().getName()
                  + RIGHT_BRACKET;
            return s;
         } else if (wdc.getCopyValue() != null) {
            String s = addressToString(wdc.getCopyValue()) + CFGConstants.ASSIGN + parameterValueToString(store.getValue()) + "; "
                  + CFGConstants.STORE + LEFT_BRACKET + wdc.getCopyValue().getName() + ", "
                  + parameterValueToString(store.getTargetAddress()) + RIGHT_BRACKET;
            return s;
         } else {
            String s = addressToString(wdc.getCopyAddress()) + CFGConstants.ASSIGN + parameterValueToString(store.getTargetAddress())
                  + "; " + CFGConstants.STORE + LEFT_BRACKET + parameterValueToString(store.getValue()) + ", "
                  + wdc.getCopyAddress().getName() + RIGHT_BRACKET;
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
         stringBuffer.append(addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(CFGConstants.LOAD);
         stringBuffer.append(CFGConstants.WS);
         stringBuffer.append(LEFT_BRACKET);
         stringBuffer.append(parameterValueToString(instr.getAddress()));
         stringBuffer.append(RIGHT_BRACKET);
      } else if (instruction instanceof Store) {
         Store instr = (Store) transition.getInstruction();
         stringBuffer.append(CFGConstants.STORE);
         stringBuffer.append(LEFT_BRACKET);
         stringBuffer.append(parameterValueToString(instr.getValue()));
         stringBuffer.append(", ");
         stringBuffer.append(parameterValueToString(instr.getTargetAddress()));
         stringBuffer.append(RIGHT_BRACKET);
      } else if (instruction instanceof Branch) {
         if (transition instanceof GuardedTransition) {
            return ((GuardedTransition) transition).getCondition();
         } else {
            return CFGConstants.BRANCH + CFGConstants.WS + CFGConstants.PC_PREFIX + transition.getTarget().getPc();
         }
      } else if (instruction instanceof GetElementPtr) {
         GetElementPtr instr = (GetElementPtr) transition.getInstruction();
         stringBuffer.append(addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(CFGConstants.GETELEMENENTPTR);
         stringBuffer.append(LEFT_BRACKET);
         stringBuffer.append(parameterValueToString(instr.getAggregate()));
         stringBuffer.append(", ");
         for (int i = 0; i < instr.getIndices().size(); i++) {
            stringBuffer.append(parameterValueToString(instr.getIndices().get(i)));
            if (i + 1 < instr.getIndices().size()) {
               stringBuffer.append(", ");
            }
         }
         return stringBuffer + RIGHT_BRACKET;
      } else if (instruction instanceof CmpXchg) {
         CmpXchg instr = (CmpXchg) transition.getInstruction();
         stringBuffer.append(addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append("CAS(");
         stringBuffer.append(parameterValueToString(instr.getAddress()));
         stringBuffer.append(", ");
         stringBuffer.append(parameterValueToString(instr.getValue()));
         stringBuffer.append(", ");
         stringBuffer.append(parameterValueToString(instr.getNewValue()));
         stringBuffer.append(RIGHT_BRACKET);
      } else if (instruction instanceof Call) {

         Call instr = (Call) transition.getInstruction();
         if (instr.getResult() != null) {
            stringBuffer.append(addressToString(instr.getResult()));
            stringBuffer.append(CFGConstants.ASSIGN);
         }
         stringBuffer.append(CFGConstants.CALL);
         stringBuffer.append(CFGConstants.WS);
         stringBuffer.append(parameterValueToString(instr.getFunction()));
         stringBuffer.append(parameterListToString(instr.getPList()));
      } else if (instruction instanceof Alloc) {
         Alloc instr = (Alloc) transition.getInstruction();
         stringBuffer.append(addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(CFGConstants.ALLOC);
         stringBuffer.append(CFGConstants.WS);
         stringBuffer.append(clean(typeUseToString(instr.getType())));
      } else if (instruction instanceof ArithmeticOperation) {
         ArithmeticOperation instr = (ArithmeticOperation) transition.getInstruction();
         stringBuffer.append(addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);

         String operation = instr.getOperation();
         stringBuffer.append(valueToString(instr.getValue1()));
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
         stringBuffer.append(valueToString(instr.getValue2()));
      } else if (instruction instanceof LogicOperation) {
         LogicOperation instr = (LogicOperation) transition.getInstruction();
         stringBuffer.append(addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         String operation = instr.getOperation();
         stringBuffer.append(valueToString(instr.getValue1()));
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
         stringBuffer.append(valueToString(instr.getValue2()));
      }
      // Compare
      else if (instruction instanceof Compare) {
         Compare instr = (Compare) transition.getInstruction();
         stringBuffer.append(addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(LEFT_BRACKET);
         String compare = instr.getCond();
         if (compare.equals(CFGConstants.FALSE)) {
            stringBuffer.append(CFGConstants.FALSE);
            return stringBuffer.toString();
         } else if (compare.equals(CFGConstants.TRUE)) {
            stringBuffer.append(CFGConstants.TRUE);
            return stringBuffer.toString();
         }
         stringBuffer.append(valueToString(instr.getOperand1()));
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
         stringBuffer.append(valueToString(instr.getOperand2()));
         stringBuffer.append(RIGHT_BRACKET);
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
            stringBuffer.append(valueToString(value));
            stringBuffer.append(CFGConstants.WS);
         }
         return stringBuffer.toString();
      } else if (instruction instanceof Cast) {
         Cast instr = (Cast) transition.getInstruction();
         stringBuffer.append(addressToString(instr.getResult()));
         stringBuffer.append(CFGConstants.ASSIGN);
         stringBuffer.append(LEFT_BRACKET);
         stringBuffer.append(clean(typeUseToString(instr.getTo())));
         stringBuffer.append(") ");
         stringBuffer.append(valueToString(instr.getValue()));
      } else if (instruction instanceof Invoke) {
         Invoke instr = (Invoke) transition.getInstruction();
         stringBuffer.append(CFGConstants.INVOKE);
         stringBuffer.append(CFGConstants.WS);
         stringBuffer.append(addressToString(instr.getName()));
         stringBuffer.append(parameterListToString(instr.getPList()));
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
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" <-> ");
            stringBuffer.append(parameterValueToString(instr.getArgument()));
         } else if (operation.equals("add")) {
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" + ");
            stringBuffer.append(parameterValueToString(instr.getArgument()));
         } else if (operation.equals("sub")) {
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" - ");
            stringBuffer.append(parameterValueToString(instr.getArgument()));
         } else if (operation.equals("and")) {
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(CFGConstants.WS);
            stringBuffer.append(CFGConstants.WEDGE);
            stringBuffer.append(CFGConstants.WS);
            stringBuffer.append(parameterValueToString(instr.getArgument()));
         } else if (operation.equals("nand")) {
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" !& ");
            stringBuffer.append(parameterValueToString(instr.getArgument()));
         } else if (operation.equals("or")) {
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(CFGConstants.WS);
            stringBuffer.append(CFGConstants.VEE);
            stringBuffer.append(CFGConstants.WS);
            stringBuffer.append(parameterValueToString(instr.getArgument()));
         } else if (operation.equals("xor")) {
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = ");
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" xor ");
            stringBuffer.append(parameterValueToString(instr.getArgument()));
         } else if (operation.equals("max") || operation.equals("umax")) {
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = max(");
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(", ");
            stringBuffer.append(parameterValueToString(instr.getArgument()));
            stringBuffer.append(") ");
         } else if (operation.equals("min") || operation.equals("umin")) {
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(" = min(");
            stringBuffer.append(parameterValueToString(instr.getAddress()));
            stringBuffer.append(", ");
            stringBuffer.append(parameterValueToString(instr.getArgument()));
            stringBuffer.append(RIGHT_BRACKET);
         }
         stringBuffer.append(" )");
      } else if (instruction instanceof Phi) {
         Phi phiInstruction = (Phi) transition.getInstruction();
         stringBuffer = new StringBuffer(addressToString(phiInstruction.getResult()));
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
                  sourcePC = getPcOfInstruction(last, gatherInstructionsInCodeOrder((FunctionDefinition) body.eContainer()));
               }
            }

            // we use the PC instead of the original label, since we don't
            // have the labels in the store buffer graph anymore
            stringBuffer.append("[");
            stringBuffer.append(valueToString(phiCase.getValue()));
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


   /**
    * Creates the string representation of the given parameter list.
    * 
    * @param parameterList the parameter list to create the string representation of
    * @return the string representation of the given parameter list
    */
   public static String parameterListToString(ParameterList parameterList) {
      StringBuffer stringBuffer = new StringBuffer(LEFT_BRACKET);
      Iterator<Parameter> parameterIterator = parameterList.getParams().iterator();
      while (parameterIterator.hasNext()) {
         Parameter parameter = parameterIterator.next();
         stringBuffer.append(parameterValueToString(parameter));
         if (parameterIterator.hasNext()) {
            stringBuffer.append(", ");
         }
      }
      stringBuffer.append(RIGHT_BRACKET);
      return stringBuffer.toString();
   }


   /**
    * Creates the string representation of the given type use.
    * 
    * @param typeUse the type use to be represented as a string
    * @return the string representation of the given type use
    */
   public static String typeUseToString(TypeUse typeUse) {
      StringBuffer stringBuffer = new StringBuffer();
      if (typeUse instanceof Predefined) {
         Predefined predefinedTypeUse = (Predefined) typeUse;
         stringBuffer = new StringBuffer(predefinedTypeUse.getType());
         if (predefinedTypeUse.getPointer() != null) {
            stringBuffer.append(predefinedTypeUse.getPointer());
         }
      } else if (typeUse instanceof AddressUse) {
         AddressUse addressUse = (AddressUse) typeUse;
         stringBuffer = new StringBuffer(addressUse.getAddress().getName());
         if (addressUse.getPointer() != null) {
            stringBuffer.append(addressUse.getPointer());
         }
      } else if (typeUse instanceof FunctionType) {
         FunctionType ftype = (FunctionType) typeUse;
         stringBuffer = new StringBuffer(typeToString(ftype.getReturnType()));
         stringBuffer.append(LEFT_BRACKET);
         Iterator<FunctionParameter> i = ftype.getParameter().getParams().iterator();
         while (i.hasNext()) {
            stringBuffer.append(typeToString(i.next()));
            if (i.hasNext()) {
               stringBuffer.append(", ");
            }
         }
         stringBuffer.append(RIGHT_BRACKET);
      } else {
         return typeUse.toString();
      }
      return stringBuffer.toString();
   }


   /**
    * Creates the string representation of the given aggregate type.
    * 
    * @param aggregateType the aggregate type to represent
    * @return the string representation of the given aggregate type
    */
   public static String aggregateTypeToString(Aggregate_Type aggregateType) {
      StringBuffer stringBuffer = new StringBuffer();
      if (aggregateType instanceof Array) {
         Array array = (Array) aggregateType;
         EObject arrayType = array.getType();
         stringBuffer = new StringBuffer("[");
         stringBuffer.append(array.getLength());
         stringBuffer.append(" x ");
         stringBuffer.append(typeToString(arrayType));
         stringBuffer.append("]");
         if (array.getPointer() != null) {
            stringBuffer.append(array.getPointer());
         }
      } else if (aggregateType instanceof Vector) {
         Vector vector = (Vector) aggregateType;
         EObject vectorType = vector.getType();

         stringBuffer = new StringBuffer("[");
         stringBuffer.append(vector.getLength());
         stringBuffer.append(" x ");
         stringBuffer.append(typeToString(vectorType));
         stringBuffer.append("]");
      } else if (aggregateType instanceof Structure) {
         Structure struct = (Structure) aggregateType;
         stringBuffer = new StringBuffer("{");
         EList<EObject> types = struct.getTypes();
         Iterator<EObject> typeIterator = types.iterator();
         while (typeIterator.hasNext()) {
            stringBuffer.append(typeToString(typeIterator.next()));
            if (typeIterator.hasNext()) {
               stringBuffer.append(", ");
            }
         }
         if (struct.getPointer() != null) {
            stringBuffer.append(struct.getPointer());
         }
         stringBuffer.append("}");
      }

      return stringBuffer.toString();
   }


   /**
    * Creates the string representation of the given type.
    * 
    * @param type the type to represent
    * @return the string representation of the given type
    */
   public static String typeToString(EObject type) {
      if (type instanceof TypeUse) {
         return typeUseToString((TypeUse) type);
      } else if (type instanceof Aggregate_Type) {
         return aggregateTypeToString((Aggregate_Type) type);
      } else
         return null;
   }


   /**
    * Creates the string representation of the given address.
    * 
    * @param adress the address to represent
    * @return the string representation of the given address
    */
   private static String addressToString(Address adress) {
      return clean(adress.getName());
   }


   /**
    * Creates the string representation of the given value.
    * 
    * @param value the value to represent
    * @return the string representation of the given value
    */
   public static String valueToString(Value value) {
      String result = GraphUtility.valueToLLVMString(value);
      return clean(result);
   }


   /**
    * Creates the LLVM string representation of the given value.
    * 
    * @param value the value to be represented
    * @return the LLVM string representation of the given value
    */
   public static String valueToLLVMString(Value value) {
      StringBuffer stringBuffer = new StringBuffer();

      if (value instanceof AddressUse) {
         AddressUse addressUse = (AddressUse) value;
         stringBuffer.append(addressUse.getAddress().getName());
      } else if (value instanceof IntegerConstant) {
         stringBuffer.append(((IntegerConstant) value).getValue());
      } else if (value instanceof DecimalConstant) {
         stringBuffer.append(((DecimalConstant) value).getValue());
      } else if (value instanceof PrimitiveValue) {
         stringBuffer.append(((PrimitiveValue) value).getValue());
      } else if (value instanceof NestedGetElementPtr) {
         // TODO indices are missing and actually a simple representation
         return "(GetElementPtr" + CFGConstants.WS + parameterValueToString(((NestedGetElementPtr) value).getAggregate()) + RIGHT_BRACKET;
      } else if (value instanceof NestedCast) {
         NestedCast val = (NestedCast) value;
         stringBuffer.append(LEFT_BRACKET);
         stringBuffer.append(typeToString(val.getFrom()));
         stringBuffer.append("-->");
         stringBuffer.append(typeToString(val.getTo()));
         stringBuffer.append(RIGHT_BRACKET);
         stringBuffer.append(valueToString(val.getValue()));
      } else {
         stringBuffer.append(CFGConstants.TODO);
      }

      stringBuffer.append(CFGConstants.WS);
      return stringBuffer.toString();
   }


   /**
    * Creates the string representation of the value of the given parameter.
    * 
    * @param parameter the parameter hosting the value to represent
    * @return the string representation of the value of the given parameter
    */
   public static String parameterValueToString(Parameter parameter) {
      return valueToString(parameter.getValue());
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
    * @return the address value pair, which is flushed in the given transition
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

}
