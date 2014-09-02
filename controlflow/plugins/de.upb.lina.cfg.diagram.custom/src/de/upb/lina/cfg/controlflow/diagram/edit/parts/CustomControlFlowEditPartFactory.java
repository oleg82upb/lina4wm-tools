/**
 * 
 */
package de.upb.lina.cfg.controlflow.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.notation.View;

import de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry;

/**
 * @author Oleg Travkin
 * 
 */
public class CustomControlFlowEditPartFactory extends
		ControlFlowEditPartFactory {

	@Override
	public EditPart createEditPart(EditPart context, Object model) {

		if (model instanceof View) {
			View view = (View) model;
			
			if (ControlFlowVisualIDRegistry.getVisualID(view) == TransitionEditPart.VISUAL_ID) {
				return new CustomTransitionEditPart(view);
			}
			
			if (ControlFlowVisualIDRegistry.getVisualID(view) == ControlFlowLocationEditPart.VISUAL_ID) {
				return new CustomControlFlowLocationEditPart(view);
			}
		}
		return super.createEditPart(context, model);
	}

}
