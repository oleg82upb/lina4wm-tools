package de.upb.lina.cfg.controlflow.diagram.navigator;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.PlatformObject;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * @generated
 */
public abstract class ControlFlowAbstractNavigatorItem extends PlatformObject
{

	/**
	 * @generated
	 */
	static
	{
		final Class[] supportedTypes = new Class[] { ITabbedPropertySheetPageContributor.class };
		final ITabbedPropertySheetPageContributor propertySheetPageContributor = new ITabbedPropertySheetPageContributor()
		{
			public String getContributorId()
			{
				return "de.upb.lina.cfg.diagram"; //$NON-NLS-1$
			}
		};
		Platform.getAdapterManager().registerAdapters(new IAdapterFactory()
		{

			public Object getAdapter(Object adaptableObject, Class adapterType)
			{
				if (adaptableObject instanceof de.upb.lina.cfg.controlflow.diagram.navigator.ControlFlowAbstractNavigatorItem
						&& adapterType == ITabbedPropertySheetPageContributor.class)
				{
					return propertySheetPageContributor;
				}
				return null;
			}

			public Class[] getAdapterList()
			{
				return supportedTypes;
			}
		}, de.upb.lina.cfg.controlflow.diagram.navigator.ControlFlowAbstractNavigatorItem.class);
	}

	/**
	 * @generated
	 */
	private Object myParent;

	/**
	 * @generated
	 */
	protected ControlFlowAbstractNavigatorItem(Object parent)
	{
		myParent = parent;
	}

	/**
	 * @generated
	 */
	public Object getParent()
	{
		return myParent;
	}

}
