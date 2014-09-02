package de.upb.lina.cfg.controlflow.diagram.edit.parts;

import org.eclipse.draw2d.Figure;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.Connector;
import org.eclipse.gmf.runtime.notation.View;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.Transition;

public class CustomControlFlowLocationEditPart extends
		ControlFlowLocationEditPart {

	public CustomControlFlowLocationEditPart(View view) {
		super(view);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected NodeFigure createNodeFigure() {
		ControlFlowLocationFigure figure = new ControlFlowLocationFigure();
		
		
//		TransitionFigure figure = new TransitionFigure();

		String labelText = null;
		if (this.getModel() != null) {
			ControlFlowLocation l = null;
			if (this.getModel() instanceof Figure) {
				Connector c = (Connector) this.getModel();
				EObject o = c.
				if (o instanceof Transition) {
					t = (Transition) o;
				}
			}
			labelText = getTransitionLabelStringFor(t);
		} else {
			labelText = EMPTY;
		}
		
		//bekomme das Label der Figure hier nicht rein :/
		figure.getTransitionLabel().setText(labelText);
		return figure;
		
		
		
		
		
		return super.createNodeFigure();
	}
	
	
	
	

}
