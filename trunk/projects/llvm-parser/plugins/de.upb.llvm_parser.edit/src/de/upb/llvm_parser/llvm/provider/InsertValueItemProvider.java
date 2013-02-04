/**
 */
package de.upb.llvm_parser.llvm.provider;


import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.LlvmPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.upb.llvm_parser.llvm.InsertValue} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InsertValueItemProvider
	extends InstructionItemProvider
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
	public InsertValueItemProvider(AdapterFactory adapterFactory) {
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
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addIndexPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InsertValue_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InsertValue_index_feature", "_UI_InsertValue_type"),
				 LlvmPackage.Literals.INSERT_VALUE__INDEX,
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
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LlvmPackage.Literals.INSERT_VALUE__STRUCT);
			childrenFeatures.add(LlvmPackage.Literals.INSERT_VALUE__VALUE);
			childrenFeatures.add(LlvmPackage.Literals.INSERT_VALUE__INSERTTYPE);
			childrenFeatures.add(LlvmPackage.Literals.INSERT_VALUE__INSERTVALUE);
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
	 * This returns InsertValue.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InsertValue"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_InsertValue_type");
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

		switch (notification.getFeatureID(InsertValue.class)) {
			case LlvmPackage.INSERT_VALUE__INDEX:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LlvmPackage.INSERT_VALUE__STRUCT:
			case LlvmPackage.INSERT_VALUE__VALUE:
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
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
				(LlvmPackage.Literals.INSERT_VALUE__STRUCT,
				 LlvmFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__VALUE,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__VALUE,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__VALUE,
				 LlvmFactory.eINSTANCE.createNonConstantValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__VALUE,
				 LlvmFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__INSERTTYPE,
				 LlvmFactory.eINSTANCE.createTypeUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__INSERTTYPE,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__INSERTTYPE,
				 LlvmFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__INSERTVALUE,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__INSERTVALUE,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__INSERTVALUE,
				 LlvmFactory.eINSTANCE.createNonConstantValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.INSERT_VALUE__INSERTVALUE,
				 LlvmFactory.eINSTANCE.createCast()));
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
			childFeature == LlvmPackage.Literals.INSERT_VALUE__VALUE ||
			childFeature == LlvmPackage.Literals.INSERT_VALUE__INSERTVALUE;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
