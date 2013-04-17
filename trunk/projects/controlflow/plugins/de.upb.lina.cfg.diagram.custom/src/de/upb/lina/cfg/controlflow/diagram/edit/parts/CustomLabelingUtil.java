package de.upb.lina.cfg.controlflow.diagram.edit.parts;

import org.eclipse.emf.ecore.EClass;

import de.upb.lina.cfg.controlflow.GuardedTransition;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.InstructionUse;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.NonConstantValue;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Value;

public class CustomLabelingUtil {
	private String sTrueConst = "[true]";
	private String sFalseConst = "[false]";

	public String getTransitionLabel(Transition t) {
		String result = "";
		EClass type = t.getInstruction().eClass();
		if (t.getInstruction().eContainer().eClass().equals(LlvmPackage.eINSTANCE.getInstructionUse()))
			result = ((InstructionUse) t.getInstruction().eContainer()).getReg_or_var() + " = ";
		result += type.getName() + " ";
		// Load
		if (type.equals(LlvmPackage.eINSTANCE.getLoad())) {
			Load instr = (Load) t.getInstruction();
			result += addValue(instr.getAdress());
		}
		// Store
		if (type.equals(LlvmPackage.eINSTANCE.getStore())) {
			Store instr = (Store) t.getInstruction();
			result += addValue(instr.getNewvalue());
			result += addValue(instr.getAdress());
		}
		// Branch
		if (type.equals(LlvmPackage.eINSTANCE.getBranch())) {
			if (t instanceof GuardedTransition) {
				result += ((GuardedTransition) t).getCondition();
			}
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
