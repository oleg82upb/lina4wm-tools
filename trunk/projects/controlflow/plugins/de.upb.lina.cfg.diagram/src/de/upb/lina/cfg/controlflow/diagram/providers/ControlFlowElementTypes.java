package de.upb.lina.cfg.controlflow.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowDiagramEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowLocationEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.TransitionEditPart;
import de.upb.lina.cfg.controlflow.diagram.part.ControlFlowDiagramEditorPlugin;

/**
 * @generated
 */
public class ControlFlowElementTypes
{

	/**
	 * @generated
	 */
	private ControlFlowElementTypes()
	{
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			ControlFlowDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ControlFlowDiagram_1000 = getElementType("de.upb.lina.cfg.diagram.ControlFlowDiagram_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlFlowLocation_2001 = getElementType("de.upb.lina.cfg.diagram.ControlFlowLocation_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Transition_4001 = getElementType("de.upb.lina.cfg.diagram.Transition_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element)
	{
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element)
	{
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint)
	{
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint)
	{
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint)
	{
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null)
		{
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(ControlFlowDiagram_1000, ControlflowPackage.eINSTANCE.getControlFlowDiagram());

			elements.put(ControlFlowLocation_2001, ControlflowPackage.eINSTANCE.getControlFlowLocation());

			elements.put(Transition_4001, ControlflowPackage.eINSTANCE.getTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id)
	{
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType)
	{
		if (KNOWN_ELEMENT_TYPES == null)
		{
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ControlFlowDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(ControlFlowLocation_2001);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID)
	{
		switch (visualID) {
		case ControlFlowDiagramEditPart.VISUAL_ID:
			return ControlFlowDiagram_1000;
		case ControlFlowLocationEditPart.VISUAL_ID:
			return ControlFlowLocation_2001;
		case TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages)
	{

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType)
		{
			return de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID)
		{
			return de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowElementTypes.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter)
		{
			return de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowElementTypes.getElement(elementTypeAdapter);
		}
	};

}
