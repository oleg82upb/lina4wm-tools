package de.upb.lina.cfg.controlflow.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import de.upb.lina.cfg.controlflow.diagram.part.ControlFlowVisualIDRegistry;

/**
 * @generated
 */
public class ControlFlowNavigatorSorter extends ViewerSorter
{

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element)
	{
		if (element instanceof ControlFlowNavigatorItem)
		{
			ControlFlowNavigatorItem item = (ControlFlowNavigatorItem) element;
			return ControlFlowVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
