package de.upb.lina.cfg.controlflow.diagram.providers;

import java.lang.ref.WeakReference;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.AbstractEditPartProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.CreateGraphicEditPartOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpart.IEditPartOperation;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowDiagramEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowEditPartFactory;
import de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry;

/**
 * @generated
 */
public class ControlFlowEditPartProvider extends DefaultEditPartProvider
{

	/**
	 * @generated
	 */
	public ControlFlowEditPartProvider()
	{
		super(new ControlFlowEditPartFactory(), ControlFlowVisualIDRegistry.TYPED_INSTANCE,
				ControlFlowDiagramEditPart.MODEL_ID);
	}
}
