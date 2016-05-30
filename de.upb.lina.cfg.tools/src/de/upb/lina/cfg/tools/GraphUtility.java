package de.upb.lina.cfg.tools;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
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


   /**
    * @param string representation of address or value
    * @return
    */
   public static String clean(String string) {
      int loc = string.indexOf("%");
      // if the address is starts with a number, do not give it a v_
      if (loc > -1 && string.substring(loc + 1, loc + 2).matches("[0-9]")) {
         string = string.replaceAll("%", "v");
      } else {
         string = string.replaceAll("%", "");
      }
      string = string.trim();
      string = string.replaceAll(" ", "");
      string = string.replaceAll("\"", "");
      string = string.replaceAll("\\.", "_");

      // if the address is starts with a number, do not give it a v_
      string = string.replaceAll("@_", "");

      string = string.replaceAll("@", "");

      return string;
   }


   /**
    * Returns the label under which the given instruction is listed
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
    * Returns the transition that belongs to the instruction i in cfg
    * 
    * @param cfg
    * @param i
    * @return CFG transition corresponding to instruction i
    */
   public static Transition findCorrespondingTransition(ControlFlowDiagram cfg, Instruction i) {
      for (Transition t : cfg.getTransitions()) {
         if (i.equals(t.getInstruction())) {
            return t;
         }
      }
      return null;
   }


   /**
    * Returns the first instruction that is listed under the given label
    * 
    * @param function
    * @param destLabel
    * @return instruction corresponding to the label
    */
   public static Instruction getInstructionByLabel(FunctionDefinition function, String destLabel) {
      for (BasicBlock b : function.getBody().getBlocks()) {
         if (destLabel.equals(b.getLabel())) {
            return b.getInstructions().get(0);
         }
      }
      throw new RuntimeException("Could not find label " + destLabel + " in function " + function.getAddress().getName());
   }


   // /**
   // * Searches for the block with label destLabel and returns preceeding
   // * location of the transition that is corresponding to the first instruction
   // * of the block.
   // *
   // * @param cfg
   // * @param function
   // * @param destLabel
   // * @return
   // */
   // public static ControlFlowLocation findLabeledLocation(ControlFlowDiagram cfg,
   // FunctionDefinition function,
   // String destLabel)
   // {
   // Instruction dest = getInstructionByLabel(function, destLabel);
   // Transition destTrans = findCorrespondingTransition(cfg, dest);
   // return destTrans.getSource();
   // }

   /**
    * Checks weather l is equal to the given pc in combination with the given buffer
    * 
    * @param l
    * @param pc
    * @param buffer
    * @return true if location is represented by the given pc and store buffer combination
    */
   public static boolean isRepresentedBy(ControlFlowLocation l, int pc, StoreBuffer buffer, EMemoryModel memoryModel) {
      return (bufferToString(l, memoryModel).equalsIgnoreCase(bufferToString(buffer, pc, memoryModel)));
   }


   /**
    * Returns the given ControlFlowLocation as a String
    * 
    * @param location
    * @return
    */
   public static String bufferToString(ControlFlowLocation location, EMemoryModel memoryModel) {
      return bufferToString(location.getBuffer(), location.getPc(), memoryModel);
   }


   /**
    * Returns the given buffer and pc as a String
    * 
    * @param buf
    * @param pc
    * @return
    */
   public static String bufferToString(StoreBuffer buf, int pc, EMemoryModel memoryModel) {

      String buffer = CFGConstants.PC_PREF + pc;
      if (buf.getAddressValuePairs().isEmpty()) {
         return buffer;
      }

      buffer += " <";
      if (memoryModel == EMemoryModel.SC || memoryModel == EMemoryModel.TSO) {

         Iterator<AddressValuePair> i = buf.getAddressValuePairs().iterator();
         while (i.hasNext()) {

            buffer += "(" + addressValuePairToString(i.next()) + ")";
            if (i.hasNext()) {
               buffer += ", ";
            }
         }
      } else if (memoryModel == EMemoryModel.PSO) {
         // entries will be represented in alphabetical order
         ArrayList<String> list = new ArrayList<String>();
         Iterator<AddressValuePair> i = buf.getAddressValuePairs().iterator();
         while (i.hasNext()) {
            Value v = i.next().getAddress().getValue();
            String value = valueToRawString(v);
            if (!list.contains(value)) {
               list.add(value);
            }
         }

         Collections.sort(list, String.CASE_INSENSITIVE_ORDER);

         // create representation in sorted order
         Iterator<String> sIter = list.iterator();
         while (sIter.hasNext()) {
            String addressString = sIter.next();

            i = buf.getAddressValuePairs().iterator();
            while (i.hasNext()) {
               AddressValuePair pair = i.next();
               Value v = pair.getAddress().getValue();
               if (addressString.equals(valueToRawString(v))) {
                  buffer += "(" + addressValuePairToString(pair) + ")";
                  if (sIter.hasNext()) {
                     buffer += ", ";
                  }
               }
            }
         }
      } else {
         buffer += "not specified";
      }

      buffer += ">";
      return buffer;
   }


   public static String addressValuePairToString(AddressValuePair pair) {
      String result = valueToString(pair.getAddress().getValue()) + ": ";
      Iterator<Parameter> i = pair.getValues().iterator();
      while (i.hasNext()) {
         Parameter param = i.next();
         result += GraphUtility.valueToString(param.getValue());
         if (i.hasNext()) {
            result += ", ";
         }
      }
      return result;
   }


   /**
    * Returns the pc of the given instruction in the given list of all instructions
    * 
    * @param instruction
    * @param instructions
    * @return
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
    * Checks wether a location is contained in the given list, which represents the combination of
    * PC and StoreBuffer
    * 
    * @param list
    * @param location
    * @return the represented location or null, if there is none
    */
   public static ControlFlowLocation getLocationRepresentedBy(List<ControlFlowLocation> list, int pc, StoreBuffer storeBuffer,
         EMemoryModel memoryModel) {
      for (ControlFlowLocation loc : list) {
         if (isRepresentedBy(loc, pc, storeBuffer, memoryModel)) {
            return loc;
         }
      }
      return null;
   }


   /**
    * Checks wether the given pair is in the given list
    * 
    * @param list
    * @param pair
    * @return true if pair is in list, else false
    */
   public static boolean isAVPInList(List<AddressValuePair> list, AddressValuePair pair) {
      String pairString = addressValuePairToString(pair);

      for (AddressValuePair p : list) {
         if (pairString.equalsIgnoreCase(addressValuePairToString(p))) {
            return true;
         }
      }
      return false;
   }


   /**
    * Retruns a list of all nodes that are adjacent to the given location
    * 
    * @param l
    * @return
    */
   public static ArrayList<ControlFlowLocation> getAdjacentNodes(ControlFlowLocation l) {
      ArrayList<ControlFlowLocation> adjacents = new ArrayList<ControlFlowLocation>();
      for (Transition t : l.getOutgoing()) {
         adjacents.add(t.getTarget());
      }
      return adjacents;
   }


   public static boolean isSynch(Instruction instruction) {
      return (instruction instanceof Fence || instruction instanceof CmpXchg || instruction instanceof Return
            || instruction instanceof AtomicRMW || instruction instanceof Invoke);
   }


   /**
    * Gets called to get a label for the given transition
    * 
    * @param t transition that needs a label
    * @return label for the transition
    */
   public static String getNewTransitionLabel(Transition t) {
      String result = "";

      if (t instanceof FlushTransition) {

         if (!t.getSource().getBuffer().getAddressValuePairs().isEmpty()) {

            if (t.getDiagram().getMemoryModel() == EMemoryModel.TSO.getModelId()) {
               // this is TSO specific as the whole pair
               AddressValuePair p = t.getSource().getBuffer().getAddressValuePairs().get(0);
               return CFGConstants.FLUSH + "(" + addressValuePairToString(p) + ")";
            }
            return CFGConstants.FLUSH; // TODO compute what was flushed for PSO
         }

         throw new RuntimeException("Found flush transition for an empty buffer!");
      }

      if (t instanceof EarlyReadTransition) {
         String s = addressToString(((Load) t.getInstruction()).getResult());
         s += CFGConstants.ASSIGN;
         s += ((EarlyReadTransition) t).getAssignmentExpression();
         return s;
      }

      if (t instanceof WriteDefChainTransition) {
         WriteDefChainTransition wdc = (WriteDefChainTransition) t;
         Store store = (Store) wdc.getInstruction();
         if (wdc.getCopyAddress() != null && wdc.getCopyValue() != null) {
            String s = addressToString(wdc.getCopyAddress()) + CFGConstants.ASSIGN + parameterValueToString(store.getTargetAddress())
                  + "; " + addressToString(wdc.getCopyValue()) + CFGConstants.ASSIGN + parameterValueToString(store.getValue()) + "; "
                  + CFGConstants.STORE + "(" + wdc.getCopyValue().getName() + ", " + wdc.getCopyAddress().getName() + ")";
            return s;
         } else if (wdc.getCopyValue() != null) {
            String s = addressToString(wdc.getCopyValue()) + CFGConstants.ASSIGN + parameterValueToString(store.getValue()) + "; "
                  + CFGConstants.STORE + "(" + wdc.getCopyValue().getName() + ", " + parameterValueToString(store.getTargetAddress()) + ")";
            return s;
         } else {
            String s = addressToString(wdc.getCopyAddress()) + CFGConstants.ASSIGN + parameterValueToString(store.getTargetAddress())
                  + "; " + CFGConstants.STORE + "(" + parameterValueToString(store.getValue()) + ", " + wdc.getCopyAddress().getName()
                  + ")";
            return s;
         }

      }


      // special transition done
      // the following use normal transitions

      if (t.getInstruction() == null) {
         return CFGConstants.TODO;
      }

      Instruction instruction = t.getInstruction();
      if (instruction instanceof Load) {
         Load instr = (Load) t.getInstruction();
         result += addressToString(instr.getResult()) + CFGConstants.ASSIGN;
         result += CFGConstants.LOAD + CFGConstants.WS + "(" + parameterValueToString(instr.getAddress()) + ")";
      } else if (instruction instanceof Store) {
         Store instr = (Store) t.getInstruction();
         result += CFGConstants.STORE + "(" + parameterValueToString(instr.getValue()) + ", "
               + parameterValueToString(instr.getTargetAddress()) + ")";
      } else if (instruction instanceof Branch) {
         if (t instanceof GuardedTransition) {
            return ((GuardedTransition) t).getCondition();
         } else {
            return CFGConstants.BRANCH + CFGConstants.WS + CFGConstants.PC_PREF + t.getTarget().getPc();
         }
      } else if (instruction instanceof GetElementPtr) {
         GetElementPtr instr = (GetElementPtr) t.getInstruction();
         result += addressToString(instr.getResult()) + CFGConstants.ASSIGN;
         result += CFGConstants.GETELEMENENTPTR + "(";
         result += parameterValueToString(instr.getAggregate()) + ", ";
         for (int i = 0; i < instr.getIndices().size(); i++) {
            result += parameterValueToString(instr.getIndices().get(i));
            if (i + 1 < instr.getIndices().size()) {
               result += ", ";
            }
         }
         return result + ")";
      } else if (instruction instanceof CmpXchg) {

         CmpXchg instr = (CmpXchg) t.getInstruction();
         result += addressToString(instr.getResult()) + CFGConstants.ASSIGN;
         result += "CAS(";
         result += parameterValueToString(instr.getAddress()) + ", ";
         result += parameterValueToString(instr.getValue()) + ", ";
         result += parameterValueToString(instr.getNewValue()) + ")";
      } else if (instruction instanceof Call) {

         Call instr = (Call) t.getInstruction();
         if (instr.getResult() != null) {
            result += addressToString(instr.getResult()) + CFGConstants.ASSIGN;
         }
         result += CFGConstants.CALL + CFGConstants.WS;
         result += parameterValueToString(instr.getFunction());
         result += parameterListToString(instr.getPList());
      } else if (instruction instanceof Alloc) {
         Alloc instr = (Alloc) t.getInstruction();
         result += addressToString(instr.getResult()) + CFGConstants.ASSIGN;
         result += CFGConstants.ALLOC + CFGConstants.WS;
         result += clean(typeUseToString(instr.getType()));
      } else if (instruction instanceof ArithmeticOperation) {
         ArithmeticOperation instr = (ArithmeticOperation) t.getInstruction();
         result += addressToString(instr.getResult()) + CFGConstants.ASSIGN;

         String operation = instr.getOperation();
         result += valueToString(instr.getValue1()) + CFGConstants.WS;
         if (operation.equals("add") || operation.equals("fadd")) {
            result += "+ ";
         } else if (operation.equals("sub") || operation.equals("fsub")) {
            result += "- ";
         } else if (operation.equals("mul") || operation.equals("fmul")) {
            result += "* ";
         } else if (operation.equals("udiv") || operation.equals("sdiv") || operation.equals("fdiv")) {
            result += ": ";
         } else if (operation.equals("urem") || operation.equals("srem") || operation.equals("frem")) {
            result += "% ";
         }
         result += valueToString(instr.getValue2());
      } else if (instruction instanceof LogicOperation) {
         LogicOperation instr = (LogicOperation) t.getInstruction();
         result += addressToString(instr.getResult()) + CFGConstants.ASSIGN;
         String operation = instr.getOperation();
         result += valueToString(instr.getValue1()) + CFGConstants.WS;
         if (operation.equals("shl")) {
            result += "<< ";
         } else if (operation.equals("lshr")) {
            result += ">>[L] ";
         } else if (operation.equals("ashr")) {
            result += ">>[A] ";
         } else if (operation.equals("and")) {
            result += "& ";
         } else if (operation.equals("or")) {
            result += "| ";
         } else if (operation.equals("xor")) {
            result += "^ ";
         }
         result += valueToString(instr.getValue2());
      }
      // Compare
      else if (instruction instanceof Compare) {
         Compare instr = (Compare) t.getInstruction();
         result += addressToString(instr.getResult()) + CFGConstants.ASSIGN + "(";
         String compare = instr.getCond();
         if (compare.equals(CFGConstants.FALSE)) {
            result += CFGConstants.FALSE;
            return result;
         } else if (compare.equals(CFGConstants.TRUE)) {
            result += CFGConstants.TRUE;
            return result;
         }
         result += valueToString(instr.getOperand1()) + CFGConstants.WS;
         if (compare.equals("eq")) {
            result += "== ";
         } else if (compare.equals("ne")) {
            result += "!= ";
         } else if (compare.equals("ugt") || compare.equals("sgt")) {
            result += "> ";
         } else if (compare.equals("uge") || compare.equals("sge")) {
            result += ">= ";
         } else if (compare.equals("ult") || compare.equals("slt")) {
            result += "< ";
         } else if (compare.equals("ule") || compare.equals("sle")) {
            result += "<= ";
         } else if (compare.equals("oeq")) {
            result += "=[o] ";
         } else if (compare.equals("ogt")) {
            result += ">[o] ";
         } else if (compare.equals("oge")) {
            result += ">=[o] ";
         } else if (compare.equals("olt")) {
            result += "<[o] ";
         } else if (compare.equals("ole")) {
            result += "<=[o] ";
         } else if (compare.equals("one")) {
            result += "!=[o] ";
         } else if (compare.equals("ueq")) {
            result += "=[u] ";
         } else if (compare.equals("ugt")) {
            result += ">[u] ";
         } else if (compare.equals("uge")) {
            result += ">=[u] ";
         } else if (compare.equals("ult")) {
            result += "<[u] ";
         } else if (compare.equals("ule")) {
            result += "<=[u] ";
         } else if (compare.equals("une")) {
            result += "!=[u] ";
         } else if (compare.equals("ord")) {
            result += "orderd ";
         } else if (compare.equals("uno")) {
            result += "not orderd ";
         }
         result += valueToString(instr.getOperand2()) + ")";
      } else if (instruction instanceof Return) {
         result += CFGConstants.RETURN;
         EObject returnValue = ((Return) t.getInstruction()).getValue();
         Value value = null;
         if (returnValue instanceof Parameter) {
            value = ((Parameter) returnValue).getValue();
         } else if (returnValue instanceof PrimitiveValue) {
            value = (PrimitiveValue) returnValue;
         }

         if (value != null) {
            result += CFGConstants.WS + valueToString(value) + CFGConstants.WS;
         }
         return result;
      } else if (instruction instanceof Cast) {
         Cast instr = (Cast) t.getInstruction();
         result += (addressToString(instr.getResult()) + CFGConstants.ASSIGN + "("
         // + typeUseToString((TypeUse) instr.getFrom()) + "->"
               + clean(typeUseToString(instr.getTo())) + ") " + valueToString(instr.getValue()));
      } else if (instruction instanceof Invoke) {
         Invoke instr = (Invoke) t.getInstruction();
         result += CFGConstants.INVOKE + CFGConstants.WS + addressToString(instr.getName()) + parameterListToString(instr.getPList());
         return result;
      }
      // Fence
      else if (instruction instanceof Fence) {
         return CFGConstants.FENCE;
         // Fence instr = (Fence) t.getInstruction();
         // result += instr.getOrdering();
      }
      // AtomicRMW
      else if (instruction instanceof AtomicRMW) {
         result += "atomicRMW( ";
         AtomicRMW instr = (AtomicRMW) t.getInstruction();
         String operation = instr.getOperation();
         if (operation.equals("xchg")) {
            result += parameterValueToString(instr.getAddress());
            result += " <-> ";
            result += parameterValueToString(instr.getArgument());
         } else if (operation.equals("add")) {
            result += parameterValueToString(instr.getAddress());
            result += " = ";
            result += parameterValueToString(instr.getAddress());
            result += " + ";
            result += parameterValueToString(instr.getArgument());
         } else if (operation.equals("sub")) {
            result += parameterValueToString(instr.getAddress());
            result += " = ";
            result += parameterValueToString(instr.getAddress());
            result += " - ";
            result += parameterValueToString(instr.getArgument());
         } else if (operation.equals("and")) {
            result += parameterValueToString(instr.getAddress());
            result += " = ";
            result += parameterValueToString(instr.getAddress());
            result += CFGConstants.WS + CFGConstants.WEDGE + CFGConstants.WS;
            result += parameterValueToString(instr.getArgument());
         } else if (operation.equals("nand")) {
            result += parameterValueToString(instr.getAddress());
            result += " = ";
            result += parameterValueToString(instr.getAddress());
            result += " !& ";
            result += parameterValueToString(instr.getArgument());
         } else if (operation.equals("or")) {
            result += parameterValueToString(instr.getAddress());
            result += " = ";
            result += parameterValueToString(instr.getAddress());
            result += CFGConstants.WS + CFGConstants.VEE + CFGConstants.WS;
            result += parameterValueToString(instr.getArgument());
         } else if (operation.equals("xor")) {
            result += parameterValueToString(instr.getAddress());
            result += " = ";
            result += parameterValueToString(instr.getAddress());
            result += " xor ";
            result += parameterValueToString(instr.getArgument());
         } else if (operation.equals("max") || operation.equals("umax")) {
            result += parameterValueToString(instr.getAddress());
            result += " = max(";
            result += parameterValueToString(instr.getAddress());
            result += ", ";
            result += parameterValueToString(instr.getArgument());
            result += ") ";
         } else if (operation.equals("min") || operation.equals("umin")) {
            result += parameterValueToString(instr.getAddress());
            result += " = min(";
            result += parameterValueToString(instr.getAddress());
            result += ", ";
            result += parameterValueToString(instr.getArgument());
            result += ")";
         }
         result += " )";
      } else if (instruction instanceof Phi) {
         Phi phiInstruction = (Phi) t.getInstruction();
         result = addressToString(phiInstruction.getResult());
         result += " := " + CFGConstants.PHI + " ";

         FunctionBody body = null;
         EObject o = phiInstruction.eContainer().eContainer();
         if (o instanceof FunctionBody) {
            body = (FunctionBody) o;
         } else {
            throw new RuntimeException("Could not resolve FunctionBody of phi instruction");
         }

         Iterator<PhiCase> i = phiInstruction.getCases().iterator();
         while (i.hasNext()) {
            PhiCase phiCase = i.next();
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
            result += "[" + valueToString(phiCase.getValue()) + ", " + CFGConstants.PC_PREF + sourcePC + "]";

            if (i.hasNext()) {
               result += ", ";
            }
         }
      }
      // not-implemented
      else {
         result += instruction.toString();
      }
      return result;
   }


   /**
    * creates string representation of the parameter list
    * 
    * @param pList
    * @return
    */
   public static String parameterListToString(ParameterList pList) {
      String result = "(";
      Iterator<Parameter> i = pList.getParams().iterator();
      while (i.hasNext()) {
         Parameter p = i.next();
         if (i.hasNext()) {
            result += parameterValueToString(p) + ", ";
         } else {
            result += parameterValueToString(p);
         }
      }
      result += ")";
      return result;
   }


   /**
    * Adds a type
    * 
    * @param type the type to add to the String.
    * @return concatenated String
    */
   public static String typeUseToString(TypeUse type) {
      String result;
      if (type instanceof Predefined) {
         result = ((Predefined) type).getType();
         if (((Predefined) type).getPointer() != null) {
            result += ((Predefined) type).getPointer();
         }
      } else if (type instanceof AddressUse) {
         result = ((AddressUse) type).getAddress().getName();
         if (((AddressUse) type).getPointer() != null) {
            result += ((AddressUse) type).getPointer();
         }
      } else if (type instanceof FunctionType) {
         FunctionType ftype = (FunctionType) type;
         result = typeToString(ftype.getReturnType()) + "(";
         Iterator<FunctionParameter> i = ftype.getParameter().getParams().iterator();
         while (i.hasNext()) {
            result += typeToString(i.next());
            if (i.hasNext()) {
               result += ", ";
            }
         }
         result += ")";
      } else {
         result = type.toString();
      }
      return result;
   }


   public static String aggregateTypeToString(Aggregate_Type type) {
      String result = null;
      if (type instanceof Array) {
         Array array = (Array) type;
         EObject arrayType = array.getType();
         result = "[" + array.getLength() + " x " + typeToString(arrayType) + "]";
         if (array.getPointer() != null) {
            result += array.getPointer();
         }
      } else if (type instanceof Vector) {
         Vector vector = (Vector) type;
         EObject arrayType = vector.getType();

         result = "[" + vector.getLength() + " x " + typeToString(arrayType) + "]";
      } else if (type instanceof Structure) {
         Structure struct = (Structure) type;
         result = "{";
         EList<EObject> types = struct.getTypes();
         Iterator<EObject> i = types.iterator();
         while (i.hasNext()) {
            result += typeToString(i.next());
            if (i.hasNext()) {
               result += ", ";
            }
         }
         if (struct.getPointer() != null) {
            result += struct.getPointer();
         }
         result += "}";
      }

      return result;
   }


   public static String typeToString(EObject type) {
      if (type instanceof TypeUse) {
         return typeUseToString((TypeUse) type);
      } else if (type instanceof Aggregate_Type) {
         return aggregateTypeToString((Aggregate_Type) type);
      } else
         return null;
   }


   private static String addressToString(Address adr) {
      return clean(adr.getName());
   }


   public static String valueToString(Value value) {
      String result = GraphUtility.valueToRawString(value);
      return clean(result);
   }


   /**
    * Add a value to the String
    * 
    * @param value
    * @return the concatenated String
    */
   public static String valueToRawString(Value value) {
      String result = "";

      if (value instanceof AddressUse) {
         AddressUse aui = (AddressUse) value;
         result += aui.getAddress().getName();
      } else if (value instanceof IntegerConstant) {
         result += ((IntegerConstant) value).getValue();
      } else if (value instanceof DecimalConstant) {
         result += ((DecimalConstant) value).getValue();
      } else if (value instanceof PrimitiveValue) {
         result += ((PrimitiveValue) value).getValue();
      } else if (value instanceof NestedGetElementPtr) {
         // TODO indices are missing and actually a simple representation
         return "(GetElementPtr" + CFGConstants.WS + parameterValueToString(((NestedGetElementPtr) value).getAggregate()) + ")";
      } else if (value instanceof NestedCast) {
         NestedCast val = (NestedCast) value;
         result += "(" + typeToString(val.getFrom()) + "-->" + typeToString(val.getTo()) + ")" + valueToString(val.getValue());
      } else {
         result += CFGConstants.TODO;
      }

      return (result + CFGConstants.WS);
   }


   public static String parameterValueToString(Parameter val) {
      return valueToString(val.getValue());
   }


   /**
    * @return a list of all instructions
    */
   public static ArrayList<Instruction> gatherInstructionsInCodeOrder(FunctionDefinition function) {
      ArrayList<Instruction> list = new ArrayList<Instruction>();
      EList<BasicBlock> blocks = function.getBody().getBlocks();
      for (BasicBlock b : blocks) {
         for (Instruction i : b.getInstructions()) {
            list.add(i);
         }
      }
      return list;
   }


   /**
    * 
    * @param transition
    * @return AVP that was flushed on this transition
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
