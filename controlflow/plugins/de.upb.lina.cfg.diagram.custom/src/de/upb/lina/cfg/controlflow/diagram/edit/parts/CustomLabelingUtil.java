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
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.Parameter;
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
		
		// Load
        if (type.equals(LlvmPackage.eINSTANCE.getLoad())) {
                Load instr = (Load) t.getInstruction();
                result += instr.getResult().getName() + " = ";
                result += type.getName() + " ";
                result += addValue(instr.getAddress());
        }
        // Store
        else if (type.equals(LlvmPackage.eINSTANCE.getStore())) {
        		Store instr = (Store) t.getInstruction();
                result += type.getName() + " ";
                result += addValue(instr.getTargetAddress());
                result += addValue(instr.getValue());
        }
     // Branch
        else if (type.equals(LlvmPackage.eINSTANCE.getBranch())) {
                if (t instanceof GuardedTransition) {
                        result += "[" + (((GuardedTransition) t).getCondition().replace("[", ""));
                }
        }
        // GetElementPtr
        else if (type.equals(LlvmPackage.eINSTANCE.getGetElementPtr())) {
                GetElementPtr instr = (GetElementPtr) t.getInstruction();
                result += instr.getResult().getName() + " = ";
                result += type.getName() + " ";
                result += addValue(instr.getAggerate());
                for (int i = 0; i < instr.getIndizies().size(); i++) {
                        result += addValue(instr.getIndizies().get(i));
                }
        }
        // CmpXchg
        else if (type.equals(LlvmPackage.eINSTANCE.getCmpXchg())) {
                
                CmpXchg instr = (CmpXchg) t.getInstruction();
                result += instr.getResult().getName() + " = ";
                result += type.getName() + " ";
                result += addValue(instr.getAddress());
                result += addValue(instr.getValue());
                result += addValue(instr.getNewValue());
        }
        // Call
        else if (type.equals(LlvmPackage.eINSTANCE.getCall())) {
                
                Call instr = (Call) t.getInstruction();
                if(instr.getResult() != null){
                	result += instr.getResult().getName() + " = ";
                }else{
                	result += "void ";
                }
                result += type.getName() + " ";
                result += addValue(instr.getFunction());
                result += addParameterList(instr.getPList());
        }
        // Alloc
        else if (type.equals(LlvmPackage.eINSTANCE.getAlloc())) {
                Alloc instr = (Alloc) t.getInstruction();
                result += instr.getResult().getName() + " = ";
                result += type.getName() + " ";
                result += addType(instr.getType());
        }
        // Arithmetic Operations
        else if (type.equals(LlvmPackage.eINSTANCE.getArithmeticOperation())) {
                ArithmeticOperation instr = (ArithmeticOperation) t.getInstruction();
                result += instr.getResult().getName() + " = ";
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
                result += instr.getResult().getName() + " = ";
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
                result += instr.getResult().getName() + " = ";
                String compare = instr.getCond();
                if (compare.equals("false")) {
                        result += "false";
                        return result;
                } else if (compare.equals("true")) {
                        result += "true";
                        return result;
                }
                result += addValue(instr.getOperand1()) + " ";
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
                result += addValue(instr.getOperand2());
        }
        // Return
        else if (type.equals(LlvmPackage.eINSTANCE.getReturn())) {
                result += type.getName();
                if (((Return) t.getInstruction()).getValue().getValue() != null) {
                        result += addValue(((Return) t.getInstruction()).getValue());
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
                        result += addValue(instr.getAddress());
                        result += " = ";
                        result += addValue(instr.getArgument());
                } else if (operation.equals("add")) {
                        result += addValue(instr.getAddress());
                        result += " = ";
                        result += addValue(instr.getAddress());
                        result += " + ";
                        result += addValue(instr.getArgument());
                } else if (operation.equals("sub")) {
                        result += addValue(instr.getAddress());
                        result += " = ";
                        result += addValue(instr.getAddress());
                        result += " - ";
                        result += addValue(instr.getArgument());
                } else if (operation.equals("and")) {
                        result += addValue(instr.getAddress());
                        result += " = ";
                        result += addValue(instr.getAddress());
                        result += " & ";
                        result += addValue(instr.getArgument());
                } else if (operation.equals("nand")) {
                        result += addValue(instr.getAddress());
                        result += " = ";
                        result += addValue(instr.getAddress());
                        result += " !& ";
                        result += addValue(instr.getArgument());
                } else if (operation.equals("or")) {
                        result += addValue(instr.getAddress());
                        result += " = ";
                        result += addValue(instr.getAddress());
                        result += " | ";
                        result += addValue(instr.getArgument());
                } else if (operation.equals("xor")) {
                        result += addValue(instr.getAddress());
                        result += " = ";
                        result += addValue(instr.getAddress());
                        result += " ^ ";
                        result += addValue(instr.getArgument());
                } else if (operation.equals("max") || operation.equals("umax")) {
                        result += addValue(instr.getAddress());
                        result += " = ";
                        result += addValue(instr.getAddress());
                        result += " > ";
                        result += addValue(instr.getArgument());
                        result += " ? ";
                        result += addValue(instr.getAddress());
                        result += " : ";
                        result += addValue(instr.getArgument());
                } else if (operation.equals("min") || operation.equals("umin")) {
                        result += addValue(instr.getAddress());
                        result += " = ";
                        result += addValue(instr.getAddress());
                        result += " < ";
                        result += addValue(instr.getArgument());
                        result += " ? ";
                        result += addValue(instr.getAddress());
                        result += " : ";
                        result += addValue(instr.getArgument());
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
		
		if(value instanceof AddressUseImpl){
			AddressUseImpl aui = (AddressUseImpl)value;
			result +=aui.getAddress().getName();
		}

		else if (value.eClass().equals(LlvmPackage.eINSTANCE.getConstant())) {
			Constant constant = (Constant) value;
			result += constant.getValue();
		}
		
		return (result + " ");
	}

	private String addValue(Parameter val) {
		return addValue(val.getValue());
	}
}
