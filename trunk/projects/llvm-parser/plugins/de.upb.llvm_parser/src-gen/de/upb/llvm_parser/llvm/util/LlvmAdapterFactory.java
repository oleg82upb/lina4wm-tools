/**
 */
package de.upb.llvm_parser.llvm.util;

import de.upb.llvm_parser.llvm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.llvm_parser.llvm.LlvmPackage
 * @generated
 */
public class LlvmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LlvmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LlvmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LlvmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LlvmSwitch<Adapter> modelSwitch =
		new LlvmSwitch<Adapter>() {
			@Override
			public Adapter caseLLVM(LLVM object) {
				return createLLVMAdapter();
			}
			@Override
			public Adapter caseAbstractElement(AbstractElement object) {
				return createAbstractElementAdapter();
			}
			@Override
			public Adapter caseTopLevelEntity(TopLevelEntity object) {
				return createTopLevelEntityAdapter();
			}
			@Override
			public Adapter caseMainLevelEntity(MainLevelEntity object) {
				return createMainLevelEntityAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseFunctionDefinition(FunctionDefinition object) {
				return createFunctionDefinitionAdapter();
			}
			@Override
			public Adapter caseAliasDefinition(AliasDefinition object) {
				return createAliasDefinitionAdapter();
			}
			@Override
			public Adapter caseTypeUse(TypeUse object) {
				return createTypeUseAdapter();
			}
			@Override
			public Adapter caseAddressUse(AddressUse object) {
				return createAddressUseAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter casePredefined(Predefined object) {
				return createPredefinedAdapter();
			}
			@Override
			public Adapter caseVector(Vector object) {
				return createVectorAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseAggregate_Types(Aggregate_Types object) {
				return createAggregate_TypesAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseNonConstantValue(NonConstantValue object) {
				return createNonConstantValueAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseParameterList(ParameterList object) {
				return createParameterListAdapter();
			}
			@Override
			public Adapter caseFunctionBody(FunctionBody object) {
				return createFunctionBodyAdapter();
			}
			@Override
			public Adapter caseBasicBlock(BasicBlock object) {
				return createBasicBlockAdapter();
			}
			@Override
			public Adapter caseTypeList(TypeList object) {
				return createTypeListAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.LLVM <em>LLVM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.LLVM
	 * @generated
	 */
	public Adapter createLLVMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.AbstractElement
	 * @generated
	 */
	public Adapter createAbstractElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.TopLevelEntity <em>Top Level Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.TopLevelEntity
	 * @generated
	 */
	public Adapter createTopLevelEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.MainLevelEntity <em>Main Level Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.MainLevelEntity
	 * @generated
	 */
	public Adapter createMainLevelEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.FunctionDefinition
	 * @generated
	 */
	public Adapter createFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.AliasDefinition <em>Alias Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.AliasDefinition
	 * @generated
	 */
	public Adapter createAliasDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.TypeUse <em>Type Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.TypeUse
	 * @generated
	 */
	public Adapter createTypeUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.AddressUse <em>Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.AddressUse
	 * @generated
	 */
	public Adapter createAddressUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Predefined <em>Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Predefined
	 * @generated
	 */
	public Adapter createPredefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Vector
	 * @generated
	 */
	public Adapter createVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Aggregate_Types <em>Aggregate Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Aggregate_Types
	 * @generated
	 */
	public Adapter createAggregate_TypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.NonConstantValue <em>Non Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.NonConstantValue
	 * @generated
	 */
	public Adapter createNonConstantValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.ParameterList
	 * @generated
	 */
	public Adapter createParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.FunctionBody <em>Function Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.FunctionBody
	 * @generated
	 */
	public Adapter createFunctionBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.BasicBlock <em>Basic Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.BasicBlock
	 * @generated
	 */
	public Adapter createBasicBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.TypeList <em>Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.TypeList
	 * @generated
	 */
	public Adapter createTypeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LlvmAdapterFactory
