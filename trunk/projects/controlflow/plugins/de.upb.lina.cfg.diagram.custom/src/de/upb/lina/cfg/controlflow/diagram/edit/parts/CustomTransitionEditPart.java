/**
 * 
 */
package de.upb.lina.cfg.controlflow.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.View;

import de.upb.lina.cfg.controlflow.Transition;

/**
 * @author Oleg Travkin
 *
 */
public class CustomTransitionEditPart extends TransitionEditPart {

	private static String EMPTY = "null";
	/**
	 * @param view
	 */
	public CustomTransitionEditPart(View view) {
		super(view);
	}

	@Override
	protected Connection createConnectionFigure() {
		TransitionFigure figure = new TransitionFigure();

		String labelText = null;
		if(this.getModel() != null)
		{
			Transition t = null;
			if(this.getModel() instanceof Connector)
			{
				Connector c = (Connector) this.getModel();
				EObject o = c.getElement();
				if(o instanceof Transition)
				{
					t = (Transition) o; 
				}
			}
			labelText = getTransitionLabelStringFor(t);
		}
		else {
			labelText = EMPTY;
		}
		
		figure.getTransitionLabel().setText(labelText);
		return figure;
	}
	
	protected String getTransitionLabelStringFor(Transition t) {
		if (t == null) {
			return EMPTY;
		}
		
		//TODO provide more information than just the kind of instruction, but also parameters...
		return t.getInstruction().eClass().getName();
	}
	
}
