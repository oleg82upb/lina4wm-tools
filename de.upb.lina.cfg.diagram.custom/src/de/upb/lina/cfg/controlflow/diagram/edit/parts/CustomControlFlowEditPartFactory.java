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
			else if (ControlFlowVisualIDRegistry.getVisualID(view) == ControlFlowLocationPcEditPart.VISUAL_ID) {
				return new CustomControlFlowLocationPcEditPart(view);
			}
		}

		return super.createEditPart(context, model);
	}

}
