/**
 * 
 */
package de.upb.lina.cfg.controlflow.diagram.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.llvm_parser.llvm.DecimalConstant;
import de.upb.llvm_parser.llvm.IntegerConstant;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.impl.AddressUseImpl;

/**
 * @author Oleg Travkin, Alexander Hetzer
 *
 */
public class CustomControlFlowLocationPcEditPart extends ControlFlowLocationPcEditPart
{
	
	private View view;

	/**
	 * @param view
	 */
	public CustomControlFlowLocationPcEditPart(View view)
	{
		super(view);
		this.view = view;	
	}

	@Override
	protected String getLabelText()
	{
		String label = "PC:"+super.getLabelText()+ " <";
		ControlFlowLocation loc = (ControlFlowLocation)view.getElement();

		if(loc.getBuffer() != null){
			for(AddressValuePair pair:loc.getBuffer().getAddressValuePairs()){
				label += "(" + addValue(pair.getAddress().getValue()) + ", " + addValue(pair.getValue().getValue())+")";
			}
		}
		label += ">";
		return label;
	}
	
	
	/**
	 * Returns the given value as a String
	 * @param value to be transfored into a String
	 * @return String of the given value
	 */
	public String addValue(Value value) {
		String result = "";

		if(value instanceof AddressUseImpl){
			AddressUseImpl aui = (AddressUseImpl)value;
			result +=aui.getAddress().getName();
		}
		else if (value instanceof IntegerConstant) {
			IntegerConstant constant = (IntegerConstant) value;
			result += constant.getValue();
		}
		else if (value instanceof DecimalConstant) {
			DecimalConstant constant = (DecimalConstant) value;
			result += constant.getValue();
		}
		else if(value instanceof PrimitiveValue){
			PrimitiveValue val = (PrimitiveValue)value;
			result += val.getValue();
		}

		return (result);
	}
	



	
}
