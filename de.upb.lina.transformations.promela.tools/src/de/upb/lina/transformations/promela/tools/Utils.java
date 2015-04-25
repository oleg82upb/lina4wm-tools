package de.upb.lina.transformations.promela.tools;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.StoreBuffer;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;

public class Utils {
	public static String produceStringFromValue(Value value){
		String result = valueToString(value);
		return clean(result);
	}
	
	public static String clean(String string){
		//String result = string;
		string = string.replaceAll("%", "v");
		string = string.trim();
		string = string.replaceAll(" ", "");
		return string;
	}
	
	
	/**
	 * Transforms a value into a String.
	 * @param value
	 * @return
	 */
	private static String valueToString(Value value) {
		if (value.eClass().equals(LlvmPackage.eINSTANCE.getConstant())) {
			Constant constant = (Constant) value;
			return constant.getValue().toString();
		}

		if (value instanceof AddressUseImpl) {
			AddressUseImpl aui = (AddressUseImpl) value;
			return aui.getAddress().getName();
		}
		
		if(value.eClass().equals(LlvmPackage.eINSTANCE.getPrimitiveValue())){
			PrimitiveValue val = (PrimitiveValue)value;
			return val.getValue();
		}
		return value.toString();
	}
	
	
	/**
	 * Returns the given buffer and pc as a String
	 * @param buf
	 * @param pc
	 * @return
	 */
	public static String getBufferAsString(StoreBuffer buf,  int pc){
		String buffer = "L_"+pc;
		if(!buf.getAddressValuePairs().isEmpty()){
			buffer += "_";
		}
		for(AddressValuePair p: buf.getAddressValuePairs()){
			buffer += "("+addValue(p.getAddress().getValue())+","+addValue(p.getValue().getValue())+")";
		}
		return clean(buffer);
	}
	
	/**
	 * Returns the given value as a String
	 * @param value to be transfored into a String
	 * @return String of the given value
	 */
	public static String addValue(Value value) {
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

		return (result);
	}
}
