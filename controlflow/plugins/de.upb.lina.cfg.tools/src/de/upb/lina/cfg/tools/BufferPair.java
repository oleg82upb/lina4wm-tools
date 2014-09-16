package de.upb.lina.cfg.tools;

import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;

public class BufferPair {
	private Parameter memAdd;
	private Parameter reg;
	
	public BufferPair(Parameter memAdd, Parameter reg){
		this.memAdd = memAdd;
		this.reg = reg;
	}

	public Parameter getMemAdd() {
		return memAdd;
	}

	public Parameter getReg() {
		return reg;
	}
	
	public String toString(){
		return "(" + addValue(memAdd.getValue())+" , "+ addValue(reg.getValue())+")";
	}
	
	/**
	 * Add a value to the String
	 * @param value
	 * @return the concatenated String
	 */
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
	
	
}
