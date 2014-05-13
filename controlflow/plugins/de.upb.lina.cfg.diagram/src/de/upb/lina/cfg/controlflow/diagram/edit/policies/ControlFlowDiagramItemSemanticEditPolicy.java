package de.upb.lina.cfg.controlflow.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import de.upb.lina.cfg.controlflow.diagram.edit.commands.ControlFlowLocationCreateCommand;
import de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowElementTypes;

/**
 * @generated
 */
public class ControlFlowDiagramItemSemanticEditPolicy extends
		ControlFlowBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControlFlowDiagramItemSemanticEditPolicy() {
		super(ControlFlowElementTypes.ControlFlowDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (ControlFlowElementTypes.ControlFlowLocation_2001 == req
				.getElementType()) {
			return getGEFWrapper(new ControlFlowLocationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
