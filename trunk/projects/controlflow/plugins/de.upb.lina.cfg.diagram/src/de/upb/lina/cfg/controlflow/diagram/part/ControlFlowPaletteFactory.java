package de.upb.lina.cfg.controlflow.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import de.upb.lina.cfg.controlflow.diagram.providers.ControlFlowElementTypes;

/**
 * @generated
 */
public class ControlFlowPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createControlflow1Group());
	}

	/**
	 * Creates "controlflow" palette tool group
	 * @generated
	 */
	private PaletteContainer createControlflow1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Controlflow1Group_title);
		paletteContainer.setId("createControlflow1Group"); //$NON-NLS-1$
		paletteContainer.add(createControlFlowLocation1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlFlowLocation1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ControlFlowLocation1CreationTool_title,
				Messages.ControlFlowLocation1CreationTool_desc,
				Collections
						.singletonList(ControlFlowElementTypes.ControlFlowLocation_2001));
		entry.setId("createControlFlowLocation1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlFlowElementTypes
				.getImageDescriptor(ControlFlowElementTypes.ControlFlowLocation_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Transition2CreationTool_title,
				Messages.Transition2CreationTool_desc,
				Collections
						.singletonList(ControlFlowElementTypes.Transition_4001));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(ControlFlowElementTypes
				.getImageDescriptor(ControlFlowElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
