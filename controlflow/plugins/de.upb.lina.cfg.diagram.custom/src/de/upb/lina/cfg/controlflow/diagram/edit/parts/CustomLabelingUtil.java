package de.upb.lina.cfg.controlflow.diagram.edit.parts;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.InstructionUse;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.NonConstantValue;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;
import de.upb.llvm_parser.llvm.impl.PredefinedImpl;

public class CustomLabelingUtil {

	public String getNewTransitionLabel(Transition t) {
		String result = "";
		EClass type = t.getInstruction().eClass();
		if (t.getInstruction().eContainer().eClass().equals(LlvmPackage.eINSTANCE.getInstructionUse()))
			result = ((InstructionUse) t.getInstruction().eContainer()).getReg_or_var() + " = ";

		// Load
		if (type.equals(LlvmPackage.eINSTANCE.getLoad())) {
			result += type.getName() + " ";
			Load instr = (Load) t.getInstruction();
			result += addValue(instr.getAdress());
		}
		// Store
		else if (type.equals(LlvmPackage.eINSTANCE.getStore())) {
			result += type.getName() + " ";
			Store instr = (Store) t.getInstruction();
			result += addValue(instr.getNewvalue());
			result += addValue(instr.getAdress());
		}
		// Branch
		else if (type.equals(LlvmPackage.eINSTANCE.getBranch())) {
			if (t instanceof GuardedTransition) {
				result += "[" + (((GuardedTransition) t).getCondition().replace("[", ""));
			}
		}
		// GetElementPtr
		else if (type.equals(LlvmPackage.eINSTANCE.getGetElementPtr())) {
			result += type.getName() + " ";
			GetElementPtr instr = (GetElementPtr) t.getInstruction();
			result += addValue(instr.getAggregatename());
			for (int i = 0; i < instr.getIndizies().size(); i++) {
				result += addValue(instr.getIndizies().get(i));
			}
		}
		// CmpXchg
		else if (type.equals(LlvmPackage.eINSTANCE.getCmpXchg())) {
			result += type.getName() + " ";
			CmpXchg instr = (CmpXchg) t.getInstruction();
			result += addValue(instr.getAdress());
			result += addValue(instr.getComparevalue());
			result += addValue(instr.getNewvalue());
		}
		// Call
		else if (type.equals(LlvmPackage.eINSTANCE.getCall())) {
			result += type.getName() + " ";
			Call instr = (Call) t.getInstruction();
			result += addValue(instr.getAdress());
			result += addParameterList(instr.getPList());
		}
		// Alloc
		else if (type.equals(LlvmPackage.eINSTANCE.getAlloc())) {
			result += type.getName() + " ";
			Alloc instr = (Alloc) t.getInstruction();
			result += addType(instr.getType());
		}
		// Arithmetic Operations
		else if (type.equals(LlvmPackage.eINSTANCE.getArithmeticOperation())) {
			ArithmeticOperation instr = (ArithmeticOperation) t.getInstruction();
			String operation = instr.getOperation();
			result += addValue(instr.getValue1()) + " ";
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
			result += addValue(instr.getValue2());
		}
		// Logical Operations
		else if (type.equals(LlvmPackage.eINSTANCE.getLogicOperation())) {
			LogicOperation instr = (LogicOperation) t.getInstruction();
			String operation = instr.getOperation();
			result += addValue(instr.getValue1()) + " ";
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
			result += addValue(instr.getValue2());
		}
		// Compare
		else if (type.equals(LlvmPackage.eINSTANCE.getCompare())) {
			Compare instr = (Compare) t.getInstruction();
			String compare = instr.getPred();
			if (compare.equals("false")) {
				result += "false";
				return result;
			} else if (compare.equals("true")) {
				result += "true";
				return result;
			}
			result += addValue(instr.getValue1()) + " ";
			if (compare.equals("eq")) {
				result += "= ";
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
			result += addValue(instr.getValue2());
		}
		// Return
		else if (type.equals(LlvmPackage.eINSTANCE.getReturn())) {
			result += type.getName();
			if (((Return) t.getInstruction()).getReturnvalue() != null) {
				result += addValue(((Return) t.getInstruction()).getReturnvalue());
			} else {
				result += " void";
			}
		}
		// Cast
		else if (type.equals(LlvmPackage.eINSTANCE.getCast())) {
			Cast instr = (Cast) t.getInstruction();
			result += ("( " + addType(instr.getFrom()) + "->" + addType(instr.getTo()) + " )" + addValue(instr.getValue()));
		}
		// Invoke
		else if (type.equals(LlvmPackage.eINSTANCE.getInvoke())) {
			result += type.getName();
			Invoke instr = (Invoke) t.getInstruction();
			result += instr.getName().getName();
			result += addParameterList(instr.getPList());
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
				result += addValue(instr.getAdress());
				result += " = ";
				result += addValue(instr.getOpvalue());
			} else if (operation.equals("add")) {
				result += addValue(instr.getAdress());
				result += " = ";
				result += addValue(instr.getAdress());
				result += " + ";
				result += addValue(instr.getOpvalue());
			} else if (operation.equals("sub")) {
				result += addValue(instr.getAdress());
				result += " = ";
				result += addValue(instr.getAdress());
				result += " - ";
				result += addValue(instr.getOpvalue());
			} else if (operation.equals("and")) {
				result += addValue(instr.getAdress());
				result += " = ";
				result += addValue(instr.getAdress());
				result += " & ";
				result += addValue(instr.getOpvalue());
			} else if (operation.equals("nand")) {
				result += addValue(instr.getAdress());
				result += " = ";
				result += addValue(instr.getAdress());
				result += " !& ";
				result += addValue(instr.getOpvalue());
			} else if (operation.equals("or")) {
				result += addValue(instr.getAdress());
				result += " = ";
				result += addValue(instr.getAdress());
				result += " | ";
				result += addValue(instr.getOpvalue());
			} else if (operation.equals("xor")) {
				result += addValue(instr.getAdress());
				result += " = ";
				result += addValue(instr.getAdress());
				result += " ^ ";
				result += addValue(instr.getOpvalue());
			} else if (operation.equals("max") || operation.equals("umax")) {
				result += addValue(instr.getAdress());
				result += " = ";
				result += addValue(instr.getAdress());
				result += " > ";
				result += addValue(instr.getOpvalue());
				result += " ? ";
				result += addValue(instr.getAdress());
				result += " : ";
				result += addValue(instr.getOpvalue());
			} else if (operation.equals("min") || operation.equals("umin")) {
				result += addValue(instr.getAdress());
				result += " = ";
				result += addValue(instr.getAdress());
				result += " < ";
				result += addValue(instr.getOpvalue());
				result += " ? ";
				result += addValue(instr.getAdress());
				result += " : ";
				result += addValue(instr.getOpvalue());
			}
			result += " )";
		}
		// not-implemented
		else {
			result += type.getName();
		}
		return result;
	}

	private String addParameterList(ParameterList pList) {
		String result = "";
		// TODO Auto-generated method stub
		return result;
	}

	private String addType(EObject type) {
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

	private String addValue(Value value) {
		String result = "";
		if (value.eClass().equals(LlvmPackage.eINSTANCE.getNonConstantValue())) {
			NonConstantValue ncv = (NonConstantValue) value;
			result = ncv.getName();
			if (ncv.getPointer() != null)
				result += ncv.getPointer();

		} else if (value.eClass().equals(LlvmPackage.eINSTANCE.getConstant())) {
			Constant constant = (Constant) value;
			result += constant.getValue();
		} else {
			result = value.getName();
		}
		return (result + " ");
	}
}
