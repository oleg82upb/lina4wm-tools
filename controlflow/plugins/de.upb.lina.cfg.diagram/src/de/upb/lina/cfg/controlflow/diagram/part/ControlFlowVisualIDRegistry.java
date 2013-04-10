package de.upb.lina.cfg.controlflow.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowDiagramEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowLocationEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowLocationPcEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.TransitionEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.WrappingLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class ControlFlowVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "de.upb.lina.cfg.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (ControlFlowDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return ControlFlowDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				ControlFlowDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ControlflowPackage.eINSTANCE.getControlFlowDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((ControlFlowDiagram) domainElement)) {
			return ControlFlowDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
				.getModelID(containerView);
		if (!ControlFlowDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (ControlFlowDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ControlFlowDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ControlFlowDiagramEditPart.VISUAL_ID:
			if (ControlflowPackage.eINSTANCE.getControlFlowLocation()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlFlowLocationEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
				.getModelID(containerView);
		if (!ControlFlowDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (ControlFlowDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = ControlFlowDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ControlFlowDiagramEditPart.VISUAL_ID:
			if (ControlFlowLocationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlFlowLocationEditPart.VISUAL_ID:
			if (ControlFlowLocationPcEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TransitionEditPart.VISUAL_ID:
			if (WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (ControlflowPackage.eINSTANCE.getTransition().isSuperTypeOf(
				domainElement.eClass())) {
			return TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(ControlFlowDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ControlFlowDiagramEditPart.VISUAL_ID:
			return false;
		case ControlFlowLocationEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
