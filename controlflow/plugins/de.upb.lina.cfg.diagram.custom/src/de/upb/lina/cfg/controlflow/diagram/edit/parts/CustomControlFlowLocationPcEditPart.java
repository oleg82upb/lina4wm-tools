/**
 * 
 */
package de.upb.lina.cfg.controlflow.diagram.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

import de.upb.lina.cfg.controlflow.AddressValuePair;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.LlvmPackage;
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
		
		return (result);
	}
	
	



	
}
