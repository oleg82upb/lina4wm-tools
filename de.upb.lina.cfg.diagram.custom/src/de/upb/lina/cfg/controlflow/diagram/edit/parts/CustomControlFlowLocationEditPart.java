/**
 * 
 */
package de.upb.lina.cfg.controlflow.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @author Oleg Travkin
 *
 */
public class CustomControlFlowLocationEditPart extends ControlFlowLocationEditPart
{


	public CustomControlFlowLocationEditPart(View view)
	{
		super(view);
	}

	protected IFigure createNodeShape()
	{
		return primaryShape = new CustomControlFlowLocationFigure();
	}
	
	public class CustomControlFlowLocationFigure extends ControlFlowLocationFigure
	{

		public CustomControlFlowLocationFigure()
		{
			super();
			this.getCflBufferLabel().setBorder(null);
		}
	}

}
