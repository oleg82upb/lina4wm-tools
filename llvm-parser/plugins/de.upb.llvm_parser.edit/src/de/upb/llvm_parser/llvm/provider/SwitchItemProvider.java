/**
 */
package de.upb.llvm_parser.llvm.provider;


import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Switch;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.upb.llvm_parser.llvm.Switch} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwitchItemProvider
	extends Ret_InstrItemProvider
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
	public SwitchItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(LlvmPackage.Literals.SWITCH__COMPTYPE);
			childrenFeatures.add(LlvmPackage.Literals.SWITCH__COMPVALUE);
			childrenFeatures.add(LlvmPackage.Literals.SWITCH__DEFAULTTYPE);
			childrenFeatures.add(LlvmPackage.Literals.SWITCH__DEFAULTVALUE);
			childrenFeatures.add(LlvmPackage.Literals.SWITCH__JTYPES);
			childrenFeatures.add(LlvmPackage.Literals.SWITCH__JVALUES);
			childrenFeatures.add(LlvmPackage.Literals.SWITCH__DESTINATIONTYPES);
			childrenFeatures.add(LlvmPackage.Literals.SWITCH__DESTINATIONS);
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
	 * This returns Switch.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Switch"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Switch_type");
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

		switch (notification.getFeatureID(Switch.class)) {
			case LlvmPackage.SWITCH__COMPTYPE:
			case LlvmPackage.SWITCH__COMPVALUE:
			case LlvmPackage.SWITCH__DEFAULTTYPE:
			case LlvmPackage.SWITCH__DEFAULTVALUE:
			case LlvmPackage.SWITCH__JTYPES:
			case LlvmPackage.SWITCH__JVALUES:
			case LlvmPackage.SWITCH__DESTINATIONTYPES:
			case LlvmPackage.SWITCH__DESTINATIONS:
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
				(LlvmPackage.Literals.SWITCH__COMPTYPE,
				 LlvmFactory.eINSTANCE.createTypeUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__COMPTYPE,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__COMPTYPE,
				 LlvmFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__COMPVALUE,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__COMPVALUE,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__COMPVALUE,
				 LlvmFactory.eINSTANCE.createNonConstantValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__COMPVALUE,
				 LlvmFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__COMPVALUE,
				 LlvmFactory.eINSTANCE.createGetElementPtr2()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DEFAULTTYPE,
				 LlvmFactory.eINSTANCE.createTypeUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DEFAULTTYPE,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DEFAULTTYPE,
				 LlvmFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DEFAULTVALUE,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DEFAULTVALUE,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DEFAULTVALUE,
				 LlvmFactory.eINSTANCE.createNonConstantValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DEFAULTVALUE,
				 LlvmFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DEFAULTVALUE,
				 LlvmFactory.eINSTANCE.createGetElementPtr2()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__JTYPES,
				 LlvmFactory.eINSTANCE.createTypeUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__JTYPES,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__JTYPES,
				 LlvmFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__JVALUES,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__JVALUES,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__JVALUES,
				 LlvmFactory.eINSTANCE.createNonConstantValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__JVALUES,
				 LlvmFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__JVALUES,
				 LlvmFactory.eINSTANCE.createGetElementPtr2()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DESTINATIONTYPES,
				 LlvmFactory.eINSTANCE.createTypeUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DESTINATIONTYPES,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DESTINATIONTYPES,
				 LlvmFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DESTINATIONS,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DESTINATIONS,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DESTINATIONS,
				 LlvmFactory.eINSTANCE.createNonConstantValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DESTINATIONS,
				 LlvmFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.SWITCH__DESTINATIONS,
				 LlvmFactory.eINSTANCE.createGetElementPtr2()));
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
			childFeature == LlvmPackage.Literals.SWITCH__COMPTYPE ||
			childFeature == LlvmPackage.Literals.SWITCH__DEFAULTTYPE ||
			childFeature == LlvmPackage.Literals.SWITCH__JTYPES ||
			childFeature == LlvmPackage.Literals.SWITCH__DESTINATIONTYPES ||
			childFeature == LlvmPackage.Literals.SWITCH__COMPVALUE ||
			childFeature == LlvmPackage.Literals.SWITCH__DEFAULTVALUE ||
			childFeature == LlvmPackage.Literals.SWITCH__JVALUES ||
			childFeature == LlvmPackage.Literals.SWITCH__DESTINATIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
