/**
 */
package de.upb.llvm_parser.llvm.provider;


import de.upb.llvm_parser.llvm.CmpXchg;
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
 * This is the item provider adapter for a {@link de.upb.llvm_parser.llvm.CmpXchg} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CmpXchgItemProvider
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
	public CmpXchgItemProvider(AdapterFactory adapterFactory) {
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

			addVolatilePropertyDescriptor(object);
			addOrderingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Volatile feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVolatilePropertyDescriptor(Object object)
	{
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmpXchg_volatile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmpXchg_volatile_feature", "_UI_CmpXchg_type"),
				 LlvmPackage.Literals.CMP_XCHG__VOLATILE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ordering feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOrderingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CmpXchg_ordering_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CmpXchg_ordering_feature", "_UI_CmpXchg_type"),
				 LlvmPackage.Literals.CMP_XCHG__ORDERING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(LlvmPackage.Literals.CMP_XCHG__RESULT);
			childrenFeatures.add(LlvmPackage.Literals.CMP_XCHG__ADDRESS);
			childrenFeatures.add(LlvmPackage.Literals.CMP_XCHG__VALUE);
			childrenFeatures.add(LlvmPackage.Literals.CMP_XCHG__NEW_VALUE);
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
	 * This returns CmpXchg.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CmpXchg"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CmpXchg cmpXchg = (CmpXchg)object;
		return getString("_UI_CmpXchg_type") + " " + cmpXchg.isVolatile();
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

		switch (notification.getFeatureID(CmpXchg.class))
		{
			case LlvmPackage.CMP_XCHG__VOLATILE:
			case LlvmPackage.CMP_XCHG__ORDERING:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LlvmPackage.CMP_XCHG__RESULT:
			case LlvmPackage.CMP_XCHG__ADDRESS:
			case LlvmPackage.CMP_XCHG__VALUE:
			case LlvmPackage.CMP_XCHG__NEW_VALUE:
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
				(LlvmPackage.Literals.CMP_XCHG__RESULT,
				 LlvmFactory.eINSTANCE.createAddress()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.CMP_XCHG__ADDRESS,
				 LlvmFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.CMP_XCHG__VALUE,
				 LlvmFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.CMP_XCHG__NEW_VALUE,
				 LlvmFactory.eINSTANCE.createParameter()));
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
			childFeature == LlvmPackage.Literals.CMP_XCHG__ADDRESS ||
			childFeature == LlvmPackage.Literals.CMP_XCHG__VALUE ||
			childFeature == LlvmPackage.Literals.CMP_XCHG__NEW_VALUE;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
