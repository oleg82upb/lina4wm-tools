/**
 */
package de.upb.lina.cfg.controlflow.provider;


import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.ControlflowPackage;

import de.upb.llvm_parser.llvm.LlvmFactory;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.upb.lina.cfg.controlflow.ControlFlowDiagram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ControlFlowDiagramItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowDiagramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null)
		{
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addVariableCopyParamsPropertyDescriptor(object);
			addMemoryModelPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlFlowDiagram_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlFlowDiagram_name_feature", "_UI_ControlFlowDiagram_type"),
				 ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variable Copy Params feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariableCopyParamsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlFlowDiagram_variableCopyParams_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlFlowDiagram_variableCopyParams_feature", "_UI_ControlFlowDiagram_type"),
				 ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__VARIABLE_COPY_PARAMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Memory Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemoryModelPropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ControlFlowDiagram_memoryModel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ControlFlowDiagram_memoryModel_feature", "_UI_ControlFlowDiagram_type"),
				 ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__MEMORY_MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__LOCATIONS);
			childrenFeatures.add(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__TRANSITIONS);
			childrenFeatures.add(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__START);
			childrenFeatures.add(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ControlFlowDiagram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ControlFlowDiagram"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ControlFlowDiagram)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ControlFlowDiagram_type") :
			getString("_UI_ControlFlowDiagram_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ControlFlowDiagram.class))
		{
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__NAME:
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__MEMORY_MODEL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS:
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS:
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__START:
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__LOCATIONS,
				 ControlflowFactory.eINSTANCE.createControlFlowLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__TRANSITIONS,
				 ControlflowFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__TRANSITIONS,
				 ControlflowFactory.eINSTANCE.createWriteDefChainTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__TRANSITIONS,
				 ControlflowFactory.eINSTANCE.createEarlyReadTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__TRANSITIONS,
				 ControlflowFactory.eINSTANCE.createGuardedTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__TRANSITIONS,
				 ControlflowFactory.eINSTANCE.createMultiTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__TRANSITIONS,
				 ControlflowFactory.eINSTANCE.createFlushTransition()));

		newChildDescriptors.add
			(createChildParameter
				(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__START,
				 ControlflowFactory.eINSTANCE.createControlFlowLocation()));

		newChildDescriptors.add
			(createChildParameter
				(ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES,
				 LlvmFactory.eINSTANCE.createAddress()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__LOCATIONS ||
			childFeature == ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM__START;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ControlFlowEditPlugin.INSTANCE;
	}

}
