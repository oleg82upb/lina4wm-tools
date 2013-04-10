package de.upb.lina.cfg.controlflow.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowDiagramEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowLocationEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.ControlFlowLocationPcEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.TransitionEditPart;
import de.upb.lina.cfg.controlflow.diagram.edit.parts.WrappingLabelEditPart;
import de.upb.lina.cfg.controlflow.diagram.part.ControlFlowDiagramEditorPlugin;
import de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry;
import de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowElementTypes;
import de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowParserProvider;

/**
 * @generated
 */
public class ControlFlowNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		ControlFlowDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		ControlFlowDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof ControlFlowNavigatorItem
				&& !isOwnView(((ControlFlowNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof ControlFlowNavigatorGroup) {
			ControlFlowNavigatorGroup group = (ControlFlowNavigatorGroup) element;
			return ControlFlowDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof ControlFlowNavigatorItem) {
			ControlFlowNavigatorItem navigatorItem = (ControlFlowNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (ControlFlowVisualIDRegistry.getVisualID(view)) {
		case ControlFlowLocationEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://www.upb.de/lina/cfg/controlflow?ControlFlowLocation", ControlFlowElementTypes.ControlFlowLocation_2001); //$NON-NLS-1$
		case TransitionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://www.upb.de/lina/cfg/controlflow?Transition", ControlFlowElementTypes.Transition_4001); //$NON-NLS-1$
		case ControlFlowDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://www.upb.de/lina/cfg/controlflow?ControlFlowDiagram", ControlFlowElementTypes.ControlFlowDiagram_1000); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = ControlFlowDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& ControlFlowElementTypes.isKnownElementType(elementType)) {
			image = ControlFlowElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof ControlFlowNavigatorGroup) {
			ControlFlowNavigatorGroup group = (ControlFlowNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof ControlFlowNavigatorItem) {
			ControlFlowNavigatorItem navigatorItem = (ControlFlowNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (ControlFlowVisualIDRegistry.getVisualID(view)) {
		case ControlFlowLocationEditPart.VISUAL_ID:
			return getControlFlowLocation_2001Text(view);
		case TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		case ControlFlowDiagramEditPart.VISUAL_ID:
			return getControlFlowDiagram_1000Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getControlFlowLocation_2001Text(View view) {
		IParser parser = ControlFlowParserProvider.getParser(
				ControlFlowElementTypes.ControlFlowLocation_2001, view
						.getElement() != null ? view.getElement() : view,
				ControlFlowVisualIDRegistry
						.getType(ControlFlowLocationPcEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlFlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getTransition_4001Text(View view) {
		IParser parser = ControlFlowParserProvider.getParser(
				ControlFlowElementTypes.Transition_4001,
				view.getElement() != null ? view.getElement() : view,
				ControlFlowVisualIDRegistry
						.getType(WrappingLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			ControlFlowDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlFlowDiagram_1000Text(View view) {
		ControlFlowDiagram domainModelElement = (ControlFlowDiagram) view
				.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			ControlFlowDiagramEditorPlugin.getInstance().logError(
					"No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return ControlFlowDiagramEditPart.MODEL_ID
				.equals(ControlFlowVisualIDRegistry.getModelID(view));
	}

}
