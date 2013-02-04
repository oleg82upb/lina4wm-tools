/**
 */
package de.upb.llvm_parser.llvm.provider;


import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.LlvmPackage;

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
 * This is the item provider adapter for a {@link de.upb.llvm_parser.llvm.BasicBlock} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BasicBlockItemProvider
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
	public BasicBlockItemProvider(AdapterFactory adapterFactory) {
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

			addLabelPropertyDescriptor(object);
			addRetadrPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BasicBlock_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicBlock_label_feature", "_UI_BasicBlock_type"),
				 LlvmPackage.Literals.BASIC_BLOCK__LABEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Retadr feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRetadrPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BasicBlock_retadr_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BasicBlock_retadr_feature", "_UI_BasicBlock_type"),
				 LlvmPackage.Literals.BASIC_BLOCK__RETADR,
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
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS);
			childrenFeatures.add(LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR);
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
	 * This returns BasicBlock.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BasicBlock"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BasicBlock)object).getLabel();
		return label == null || label.length() == 0 ?
			getString("_UI_BasicBlock_type") :
			getString("_UI_BasicBlock_type") + " " + label;
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

		switch (notification.getFeatureID(BasicBlock.class)) {
			case LlvmPackage.BASIC_BLOCK__LABEL:
			case LlvmPackage.BASIC_BLOCK__RETADR:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LlvmPackage.BASIC_BLOCK__INSTRUCTIONS:
			case LlvmPackage.BASIC_BLOCK__TERMINATOR:
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
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createLLVM()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createAbstractElement()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createTopLevelEntity()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createMainLevelEntity()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createTypeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createGlobalDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createFunctionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createAliasDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createTypeUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createAddressUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createAddress()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createPredefined()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createAggregate_Types()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createVector()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createArray()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createNonConstantValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createValueStruct()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createParameterList()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createTypeList()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createFunctionBody()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createBasicBlock()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createInstructionUse()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createRet_Instr()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createInstruction()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createARITHMETIC_OP()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createLOGICAL_OP()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createCast()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createGetElementPtr()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createExtractValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createInsertValue()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createFence()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createCmpXchg()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createAtomicRMW()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createLoad()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createStore()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createCall()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createAlloc()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createPHI()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createValuePair()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createLandingPad()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createClause()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createSelect()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createVA_Arg()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createExtractElement()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createInsertElement()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createShuffleVector()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createCompare()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createIndirectBranch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createLabelList()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createJumpTable()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createResume()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createUnreachable()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS,
				 LlvmFactory.eINSTANCE.createBranch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR,
				 LlvmFactory.eINSTANCE.createRet_Instr()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR,
				 LlvmFactory.eINSTANCE.createIndirectBranch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR,
				 LlvmFactory.eINSTANCE.createSwitch()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR,
				 LlvmFactory.eINSTANCE.createInvoke()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR,
				 LlvmFactory.eINSTANCE.createResume()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR,
				 LlvmFactory.eINSTANCE.createUnreachable()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR,
				 LlvmFactory.eINSTANCE.createReturn()));

		newChildDescriptors.add
			(createChildParameter
				(LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR,
				 LlvmFactory.eINSTANCE.createBranch()));
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
			childFeature == LlvmPackage.Literals.BASIC_BLOCK__INSTRUCTIONS ||
			childFeature == LlvmPackage.Literals.BASIC_BLOCK__TERMINATOR;

		if (qualify) {
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
		return LLVMEditPlugin.INSTANCE;
	}

}
