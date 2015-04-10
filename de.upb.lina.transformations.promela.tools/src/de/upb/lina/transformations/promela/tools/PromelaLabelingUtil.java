package de.upb.lina.transformations.promela.tools;

import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.emf.ecore.EClass;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.FlushTransition;
import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.PhiCase;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;
import de.upb.llvm_parser.llvm.impl.PredefinedImpl;

public class PromelaLabelingUtil {

	private static final String ASSIGN = " = ";
	private static final String MEM = "memory[";
	private static final String VOID = "void";
	private static final String ALLOC = "alloc";
	private static final String TRUE = "true";
	private static final String FALSE = "false";
	private static final String RETURN = "RET";
	private static final String BRANCH = "goto";
	
	private static final String TODO = "TODO";
	private static final String WS = " ";
	
	private static final String SKIP = "skip;";

	/**
	 * Gets called to get a label for the given transition
	 * @param t transition that needs a label
	 * @return label for the transition
	 */
	public static String getNewTransitionLabel(Transition t) {
		String result = "";

		EClass type = t.getInstruction().eClass();

		if (type.equals(LlvmPackage.eINSTANCE.getLoad())) {
			Load instr = (Load) t.getInstruction();
			result += clean(instr.getResult().getName()) + ASSIGN;
			result += MEM + " ";
			result += clean(toString(instr.getAddress()));
			result += "];";
		}
		// Store
		else if (type.equals(LlvmPackage.eINSTANCE.getStore())) {
			result += SKIP;
		}
//		// Branch
		else if (type.equals(LlvmPackage.eINSTANCE.getBranch())) {
			if (! (t instanceof GuardedTransition)) {
				result += BRANCH + WS + AMTLGenerator.getBufferAsString(t.getTarget().getBuffer(), t.getTarget().getPc()) + ";";
			}
		}
		// GetElementPtr TODO
		else if (type.equals(LlvmPackage.eINSTANCE.getGetElementPtr())) {
			GetElementPtr instr = (GetElementPtr) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			result += type.getName() + WS;
			result += toString(instr.getAggerate());
			for (int i = 0; i < instr.getIndizies().size(); i++) {
				result += toString(instr.getIndizies().get(i));
			}
		}
		// CmpXchg TODO
		else if (type.equals(LlvmPackage.eINSTANCE.getCmpXchg())) {

			CmpXchg instr = (CmpXchg) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			result += "CAS(";
			result += toString(instr.getAddress()) +", ";
			result += toString(instr.getValue()) + ", ";
			result += toString(instr.getNewValue()) + ")";
		}
		// Call TODO
		else if (type.equals(LlvmPackage.eINSTANCE.getCall())) {

			Call instr = (Call) t.getInstruction();
			if(instr.getResult() != null){
				result += instr.getResult().getName() + ASSIGN;
			}else{
				result += VOID + WS;
			}
			result += type.getName() + WS;
			result += toString(instr.getFunction());
			result += toString(instr.getPList());
		}
		// Alloc TODO
		else if (type.equals(LlvmPackage.eINSTANCE.getAlloc())) {
			Alloc instr = (Alloc) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			result += ALLOC + WS;
			result += toString(instr.getType());
		}
		// Arithmetic Operations TODO
		else if (type.equals(LlvmPackage.eINSTANCE.getArithmeticOperation())) {
			ArithmeticOperation instr = (ArithmeticOperation) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			String operation = instr.getOperation();
			result += toString(instr.getValue1()) + WS;
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
			result += toString(instr.getValue2());
		}
		// Logical Operations
		else if (type.equals(LlvmPackage.eINSTANCE.getLogicOperation())) {
			LogicOperation instr = (LogicOperation) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN;
			String operation = instr.getOperation();
			result += toString(instr.getValue1()) + WS;
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
			result += toString(instr.getValue2());
		}
		// Compare
		else if (type.equals(LlvmPackage.eINSTANCE.getCompare())) {
			Compare instr = (Compare) t.getInstruction();
			result += instr.getResult().getName() + ASSIGN + "(";
			String compare = instr.getCond();
			if (compare.equals(FALSE)) {
				result += FALSE;
				return result;
			} else if (compare.equals(TRUE)) {
				result += TRUE;
				return result;
			}
			result += toString(instr.getOperand1()) + WS;
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
			result += toString(instr.getOperand2()) + ")";
		}
		// Return
		else if (type.equals(LlvmPackage.eINSTANCE.getReturn())) {
			result += RETURN + WS;
			if (((Return) t.getInstruction()).getValue().getValue() != null) {
				result += toString(((Return) t.getInstruction()).getValue());
			} else {
				result += WS + VOID;
			}
		}
		// Cast
		else if (type.equals(LlvmPackage.eINSTANCE.getCast())) {
			Cast instr = (Cast) t.getInstruction();
			result += (instr.getResult().getName() + ASSIGN + "(" + toString((TypeUse)instr.getFrom()) + "->" + toString(instr.getTo()) + ") " + toString(instr.getValue()));
		}
		// Invoke
		else if (type.equals(LlvmPackage.eINSTANCE.getInvoke())) {
			result += type.getName();
			Invoke instr = (Invoke) t.getInstruction();
			result += instr.getName().getName();
			result += toString(instr.getPList());
		}
		// Fence
		else if (type.equals(LlvmPackage.eINSTANCE.getFence())) {
			result += type.getName();
			Fence instr = (Fence) t.getInstruction();
			result += instr.getOrdering();
		}
		// AtomicRMW
		else if (type.equals(LlvmPackage.eINSTANCE.getAtomicRMW())) {
			result += "atomic( ";
			AtomicRMW instr = (AtomicRMW) t.getInstruction();
			String operation = instr.getOperation();
			if (operation.equals("xchg")) {
				result += toString(instr.getAddress());
				result += " = ";
				result += toString(instr.getArgument());
			} else if (operation.equals("add")) {
				result += toString(instr.getAddress());
				result += " = ";
				result += toString(instr.getAddress());
				result += " + ";
				result += toString(instr.getArgument());
			} else if (operation.equals("sub")) {
				result += toString(instr.getAddress());
				result += " = ";
				result += toString(instr.getAddress());
				result += " - ";
				result += toString(instr.getArgument());
			} else if (operation.equals("and")) {
				result += toString(instr.getAddress());
				result += " = ";
				result += toString(instr.getAddress());
				result += " & ";
				result += toString(instr.getArgument());
			} else if (operation.equals("nand")) {
				result += toString(instr.getAddress());
				result += " = ";
				result += toString(instr.getAddress());
				result += " !& ";
				result += toString(instr.getArgument());
			} else if (operation.equals("or")) {
				result += toString(instr.getAddress());
				result += " = ";
				result += toString(instr.getAddress());
				result += " | ";
				result += toString(instr.getArgument());
			} else if (operation.equals("xor")) {
				result += toString(instr.getAddress());
				result += " = ";
				result += toString(instr.getAddress());
				result += " ^ ";
				result += toString(instr.getArgument());
			} else if (operation.equals("max") || operation.equals("umax")) {
				result += toString(instr.getAddress());
				result += " = ";
				result += toString(instr.getAddress());
				result += " > ";
				result += toString(instr.getArgument());
				result += " ? ";
				result += toString(instr.getAddress());
				result += " : ";
				result += toString(instr.getArgument());
			} else if (operation.equals("min") || operation.equals("umin")) {
				result += toString(instr.getAddress());
				result += " = ";
				result += toString(instr.getAddress());
				result += " < ";
				result += toString(instr.getArgument());
				result += " ? ";
				result += toString(instr.getAddress());
				result += " : ";
				result += toString(instr.getArgument());
			}
			result += " )";
			//phi
		}else if(type.equals(LlvmPackage.eINSTANCE.getPhi())){
			Phi phiInstruction = (Phi)t.getInstruction();
			result += "phi(";
			HashMap<String, Integer> incomingLabels = new HashMap<String, Integer>();
			for(Transition incoming: t.getSource().getIncoming()){
				if(incoming.getSource().getBlockLabel() != null){
					incomingLabels.put(incoming.getSource().getBlockLabel(), incoming.getSource().getPc());
				}
			}
			for(PhiCase phiCase: phiInstruction.getCases()){
				String phiLabel = phiCase.getLabel().replace("%", "");
				if(incomingLabels.containsKey(phiLabel)){
					phiLabel += "(PC:"+incomingLabels.get(phiLabel)+")";
				}
				result+= "[" + toString(phiCase.getValue()) + ", " + phiLabel + "], ";
			}
			result = result.substring(0,result.length()-2) + ")";

		}
		// not-implemented
		else {
			result += type.getName();
		}
		return result;
	}
	
	
	public static String clean(String string){
		return AMTLGenerator.clean(string);
	}

	/**
	 * creates string representation of the parameter list 
	 * @param pList
	 * @return 
	 */
	private static String toString(ParameterList pList) {
		String result = "(";
		Iterator<Parameter> i = pList.getParams().iterator();
		while (i.hasNext())
		{
			Parameter p = i.next();
			if(i.hasNext())
			{
				result += toString(p) + ", ";
			}
			else {
				result += toString(p);
			}
		}
		result += ")";
		return result;
	}

	/**
	 * Adds a type
	 * @param type the type to add to the String.
	 * @return concatenated String
	 */
	private static String toString(TypeUse type) {
		String result;
		if (type instanceof PredefinedImpl) {
			result = ((Predefined) type).getType();
			if (((Predefined) type).getPointer() != null) {
				result += ((Predefined) type).getPointer();
			}
		} else if (type instanceof AddressUseImpl) {
			result = ((AddressUse) type).getAddress().getName();
			if (((AddressUse) type).getPointer() != null) {
				result += ((AddressUse) type).getPointer();
			}
		} else {
			result = type.toString();
		}
		return result;
	}

	/**
	 * Add a value to the String
	 * @param value
	 * @return the concatenated String
	 */
	private static String toString(Value value) {
		String result = "";

		if(value instanceof AddressUseImpl){
			AddressUseImpl aui = (AddressUseImpl)value;
			result +=aui.getAddress().getName();
		}

		else if (value.eClass().equals(LlvmPackage.eINSTANCE.getConstant())) {
			Constant constant = (Constant) value;
			result += constant.getValue();
		}

		else if(value.eClass().equals(LlvmPackage.eINSTANCE.getPrimitiveValue())){
			PrimitiveValue val = (PrimitiveValue)value;
			result += val.getValue();
		}
		else {
			result += TODO;
		}

		return (result + WS);
	}

	private static String toString(Parameter val) {
		return toString(val.getValue());
	}
}

