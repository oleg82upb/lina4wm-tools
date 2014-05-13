package de.upb.lina.cfg.controlflow.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowDiagramEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowLocationEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.TransitionEditPart;
import de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowElementTypes;

/**
 * @generated
 */
public class ControlFlowDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<ControlFlowNodeDescriptor> getSemanticChildren(View view) {
		switch (ControlFlowVisualIDRegistry.getVisualID(view)) {
		case ControlFlowDiagramEditPart.VISUAL_ID:
			return getControlFlowDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowNodeDescriptor> getControlFlowDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		ControlFlowDiagram modelElement = (ControlFlowDiagram) view
				.getElement();
		LinkedList<ControlFlowNodeDescriptor> result = new LinkedList<ControlFlowNodeDescriptor>();
		for (Iterator<?> it = modelElement.getLocations().iterator(); it
				.hasNext();) {
			ControlFlowLocation childElement = (ControlFlowLocation) it.next();
			int visualID = ControlFlowVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == ControlFlowLocationEditPart.VISUAL_ID) {
				result.add(new ControlFlowNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getContainedLinks(View view) {
		switch (ControlFlowVisualIDRegistry.getVisualID(view)) {
		case ControlFlowDiagramEditPart.VISUAL_ID:
			return getControlFlowDiagram_1000ContainedLinks(view);
		case ControlFlowLocationEditPart.VISUAL_ID:
			return getControlFlowLocation_2001ContainedLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getIncomingLinks(View view) {
		switch (ControlFlowVisualIDRegistry.getVisualID(view)) {
		case ControlFlowLocationEditPart.VISUAL_ID:
			return getControlFlowLocation_2001IncomingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getOutgoingLinks(View view) {
		switch (ControlFlowVisualIDRegistry.getVisualID(view)) {
		case ControlFlowLocationEditPart.VISUAL_ID:
			return getControlFlowLocation_2001OutgoingLinks(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getControlFlowDiagram_1000ContainedLinks(
			View view) {
		ControlFlowDiagram modelElement = (ControlFlowDiagram) view
				.getElement();
		LinkedList<ControlFlowLinkDescriptor> result = new LinkedList<ControlFlowLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getControlFlowLocation_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getControlFlowLocation_2001IncomingLinks(
			View view) {
		ControlFlowLocation modelElement = (ControlFlowLocation) view
				.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<ControlFlowLinkDescriptor> result = new LinkedList<ControlFlowLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getTransition_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getControlFlowLocation_2001OutgoingLinks(
			View view) {
		ControlFlowLocation modelElement = (ControlFlowLocation) view
				.getElement();
		LinkedList<ControlFlowLinkDescriptor> result = new LinkedList<ControlFlowLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<ControlFlowLinkDescriptor> getTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<ControlFlowLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			ControlFlowDiagram container) {
		LinkedList<ControlFlowLinkDescriptor> result = new LinkedList<ControlFlowLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != ControlFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ControlFlowLocation dst = link.getTarget();
			ControlFlowLocation src = link.getSource();
			result.add(new ControlFlowLinkDescriptor(src, dst, link,
					ControlFlowElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ControlFlowLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(
			ControlFlowLocation target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<ControlFlowLinkDescriptor> result = new LinkedList<ControlFlowLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != ControlflowPackage.eINSTANCE
					.getTransition_Target()
					|| false == setting.getEObject() instanceof Transition) {
				continue;
			}
			Transition link = (Transition) setting.getEObject();
			if (TransitionEditPart.VISUAL_ID != ControlFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ControlFlowLocation src = link.getSource();
			result.add(new ControlFlowLinkDescriptor(src, target, link,
					ControlFlowElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<ControlFlowLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
			ControlFlowLocation source) {
		ControlFlowDiagram container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element
				.eContainer()) {
			if (element instanceof ControlFlowDiagram) {
				container = (ControlFlowDiagram) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<ControlFlowLinkDescriptor> result = new LinkedList<ControlFlowLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links
				.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof Transition) {
				continue;
			}
			Transition link = (Transition) linkObject;
			if (TransitionEditPart.VISUAL_ID != ControlFlowVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			ControlFlowLocation dst = link.getTarget();
			ControlFlowLocation src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new ControlFlowLinkDescriptor(src, dst, link,
					ControlFlowElementTypes.Transition_4001,
					TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<ControlFlowNodeDescriptor> getSemanticChildren(View view) {
			return ControlFlowDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ControlFlowLinkDescriptor> getContainedLinks(View view) {
			return ControlFlowDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ControlFlowLinkDescriptor> getIncomingLinks(View view) {
			return ControlFlowDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<ControlFlowLinkDescriptor> getOutgoingLinks(View view) {
			return ControlFlowDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
