/**
 */
package de.upb.llvm_parser.llvm.provider;


import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.upb.llvm_parser.llvm.Parameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ParameterItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource
{
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterItemProvider(AdapterFactory adapterFactory)
	{
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object)
	{
		if (itemPropertyDescriptors == null)
		{
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
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object)
	{
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(LlvmPackage.Literals.PARAMETER__TYPE);
			childrenFeatures.add(LlvmPackage.Literals.PARAMETER__VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child)
	{
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Parameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object)
	{
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Parameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object)
	{
		return getString("_UI_Parameter_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification)
	{
		updateChildren(notification);

		switch (notification.getFeatureID(Parameter.class))
		{
			case LlvmPackage.PARAMETER__TYPE:
			case LlvmPackage.PARAMETER__VALUE:
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
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object)
	{
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createLLVM()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createAbstractElement()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createTopLevelEntity()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createMainLevelEntity()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createAliasDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createTypeUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createAddress()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createAggregate_Type()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createVector()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createPrimitiveValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createValueStruct()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createFunctionParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createFunctionParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createFunctionBody()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createBasicBlock()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createLogicOperation()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createNestedCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createMetaArgValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createMetadataValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createGetElementPtr()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createNestedGetElementPtr()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createFence()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createCmpXchg()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createAtomicRMW()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createLoad()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createCall()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createAlloc()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createPhiCase()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createPhi()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createLandingPad()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createClause()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createVariableAttributeAccess()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createExtractValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createInsertValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createExtractElement()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createInsertElement()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createShuffleVector()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createCompare()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createIndirectBranch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createSwitchCase()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createResume()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createUnreachable()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__TYPE,
				 LlvmFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__VALUE,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__VALUE,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__VALUE,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__VALUE,
				 LlvmFactory.eINSTANCE.createPrimitiveValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__VALUE,
				 LlvmFactory.eINSTANCE.createNestedCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.PARAMETER__VALUE,
				 LlvmFactory.eINSTANCE.createNestedGetElementPtr()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection)
	{
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == LlvmPackage.Literals.PARAMETER__TYPE ||
			childFeature == LlvmPackage.Literals.PARAMETER__VALUE;

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
	public ResourceLocator getResourceLocator()
	{
		return LLVMEditPlugin.INSTANCE;
	}

}
