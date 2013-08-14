/**
 */
package de.upb.llvm_parser.llvm.provider;


import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.LlvmPackage;

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
 * This is the item provider adapter for a {@link de.upb.llvm_parser.llvm.GetElementPtr} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GetElementPtrItemProvider
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
	public GetElementPtrItemProvider(AdapterFactory adapterFactory) {
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
		if (childrenFeatures == null)
		{
			super.getChildrenFeatures(object);
			childrenFeatures.add(LlvmPackage.Literals.GET_ELEMENT_PTR__RESULT);
			childrenFeatures.add(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE);
			childrenFeatures.add(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATENAME);
			childrenFeatures.add(LlvmPackage.Literals.GET_ELEMENT_PTR__IND_TYPES);
			childrenFeatures.add(LlvmPackage.Literals.GET_ELEMENT_PTR__INDIZIES);
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
	 * This returns GetElementPtr.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GetElementPtr"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_GetElementPtr_type");
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

		switch (notification.getFeatureID(GetElementPtr.class))
		{
			case LlvmPackage.GET_ELEMENT_PTR__RESULT:
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATE:
			case LlvmPackage.GET_ELEMENT_PTR__AGGREGATENAME:
			case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
			case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
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
				(LlvmPackage.Literals.GET_ELEMENT_PTR__RESULT,
				 LlvmFactory.eINSTANCE.createAddress()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createLLVM()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createAbstractElement()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createTopLevelEntity()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createMainLevelEntity()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createAliasDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createTypeUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createAddress()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createAggregate_Types()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createVector()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createPrimitiveValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createValueStruct()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createFunctionParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createFunctionParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createFunctionBody()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createBasicBlock()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createArithmeticOperation()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createLogicOperation()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createNestedCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createMetaArgValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createMeta()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createMetadataValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createGetElementPtr()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createNestedGetElementPtr()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createExtractValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createInsertValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createFence()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createCmpXchg()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createAtomicRMW()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createLoad()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createCall()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createAlloc()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createPhiCase()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createPhi()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createLandingPad()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createClause()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createVariableAttributeAccess()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createExtractElement()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createInsertElement()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createShuffleVector()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createCompare()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createIndirectBranch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createResume()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createUnreachable()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE,
				 LlvmFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATENAME,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATENAME,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATENAME,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATENAME,
				 LlvmFactory.eINSTANCE.createPrimitiveValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATENAME,
				 LlvmFactory.eINSTANCE.createNestedCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATENAME,
				 LlvmFactory.eINSTANCE.createNestedGetElementPtr()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__IND_TYPES,
				 LlvmFactory.eINSTANCE.createTypeUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__IND_TYPES,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__IND_TYPES,
				 LlvmFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__INDIZIES,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__INDIZIES,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__INDIZIES,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__INDIZIES,
				 LlvmFactory.eINSTANCE.createPrimitiveValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__INDIZIES,
				 LlvmFactory.eINSTANCE.createNestedCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.GET_ELEMENT_PTR__INDIZIES,
				 LlvmFactory.eINSTANCE.createNestedGetElementPtr()));
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
			childFeature == LlvmPackage.Literals.GET_ELEMENT_PTR__RESULT ||
			childFeature == LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATE ||
			childFeature == LlvmPackage.Literals.GET_ELEMENT_PTR__IND_TYPES ||
			childFeature == LlvmPackage.Literals.GET_ELEMENT_PTR__AGGREGATENAME ||
			childFeature == LlvmPackage.Literals.GET_ELEMENT_PTR__INDIZIES;

		if (qualify)
		{
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
