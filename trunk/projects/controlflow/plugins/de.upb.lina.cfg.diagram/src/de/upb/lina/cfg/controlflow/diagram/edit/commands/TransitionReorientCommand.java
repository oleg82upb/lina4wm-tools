package de.upb.lina.cfg.controlflow.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.diagram.edit.policies.ControlFlowBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class TransitionReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public TransitionReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Transition) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof ControlFlowLocation && newEnd instanceof ControlFlowLocation)) {
			return false;
		}
		ControlFlowLocation target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof ControlFlowDiagram)) {
			return false;
		}
		ControlFlowDiagram container = (ControlFlowDiagram) getLink()
				.eContainer();
		return ControlFlowBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransition_4001(container, getLink(), getNewSource(),
						target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof ControlFlowLocation && newEnd instanceof ControlFlowLocation)) {
			return false;
		}
		ControlFlowLocation source = getLink().getSource();
		if (!(getLink().eContainer() instanceof ControlFlowDiagram)) {
			return false;
		}
		ControlFlowDiagram container = (ControlFlowDiagram) getLink()
				.eContainer();
		return ControlFlowBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransition_4001(container, getLink(), source,
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected Transition getLink() {
		return (Transition) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected ControlFlowLocation getOldSource() {
		return (ControlFlowLocation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ControlFlowLocation getNewSource() {
		return (ControlFlowLocation) newEnd;
	}

	/**
	 * @generated
	 */
	protected ControlFlowLocation getOldTarget() {
		return (ControlFlowLocation) oldEnd;
	}

	/**
	 * @generated
	 */
	protected ControlFlowLocation getNewTarget() {
		return (ControlFlowLocation) newEnd;
	}
}
