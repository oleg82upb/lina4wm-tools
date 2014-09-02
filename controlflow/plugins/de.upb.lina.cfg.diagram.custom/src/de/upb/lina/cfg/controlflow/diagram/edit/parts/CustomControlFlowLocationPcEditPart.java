/**
 * 
 */
package de.upb.lina.cfg.controlflow.diagram.edit.parts;

import org.eclipse.gmf.runtime.notation.View;

/**
 * @author Oleg Travkin
 *
 */
public class CustomControlFlowLocationPcEditPart extends ControlFlowLocationPcEditPart
{

	/**
	 * @param view
	 */
	public CustomControlFlowLocationPcEditPart(View view)
	{
		super(view);
		
	}

	@Override
	protected String getLabelText()
	{
		// TODO implement string representation of the store buffer
		return super.getLabelText() + "WTF";
	}



	
}
