/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LlvmFactoryImpl extends EFactoryImpl implements LlvmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LlvmFactory init() {
		try {
			LlvmFactory theLlvmFactory = (LlvmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.upb.de/llvm_parser/llvm"); 
			if (theLlvmFactory != null) {
				return theLlvmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LlvmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LlvmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LlvmPackage.LLVM: return createLLVM();
			case LlvmPackage.ABSTRACT_ELEMENT: return createAbstractElement();
			case LlvmPackage.TOP_LEVEL_ENTITY: return createTopLevelEntity();
			case LlvmPackage.MAIN_LEVEL_ENTITY: return createMainLevelEntity();
			case LlvmPackage.TYPE_DEFINITION: return createTypeDefinition();
			case LlvmPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
			case LlvmPackage.ALIAS_DEFINITION: return createAliasDefinition();
			case LlvmPackage.TYPE_USE: return createTypeUse();
			case LlvmPackage.ADDRESS_USE: return createAddressUse();
			case LlvmPackage.ADDRESS: return createAddress();
			case LlvmPackage.PREDEFINED: return createPredefined();
			case LlvmPackage.VECTOR: return createVector();
			case LlvmPackage.ARRAY: return createArray();
			case LlvmPackage.AGGREGATE_TYPES: return createAggregate_Types();
			case LlvmPackage.CONSTANT: return createConstant();
			case LlvmPackage.NON_CONSTANT_VALUE: return createNonConstantValue();
			case LlvmPackage.VALUE: return createValue();
			case LlvmPackage.STRUCTURE: return createStructure();
			case LlvmPackage.PARAMETER_LIST: return createParameterList();
			case LlvmPackage.FUNCTION_BODY: return createFunctionBody();
			case LlvmPackage.BASIC_BLOCK: return createBasicBlock();
			case LlvmPackage.TYPE_LIST: return createTypeList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LLVM createLLVM() {
		LLVMImpl llvm = new LLVMImpl();
		return llvm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElement createAbstractElement() {
		AbstractElementImpl abstractElement = new AbstractElementImpl();
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelEntity createTopLevelEntity() {
		TopLevelEntityImpl topLevelEntity = new TopLevelEntityImpl();
		return topLevelEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainLevelEntity createMainLevelEntity() {
		MainLevelEntityImpl mainLevelEntity = new MainLevelEntityImpl();
		return mainLevelEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDefinition createTypeDefinition() {
		TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
		return typeDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition createFunctionDefinition() {
		FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AliasDefinition createAliasDefinition() {
		AliasDefinitionImpl aliasDefinition = new AliasDefinitionImpl();
		return aliasDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse createTypeUse() {
		TypeUseImpl typeUse = new TypeUseImpl();
		return typeUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressUse createAddressUse() {
		AddressUseImpl addressUse = new AddressUseImpl();
		return addressUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predefined createPredefined() {
		PredefinedImpl predefined = new PredefinedImpl();
		return predefined;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector createVector() {
		VectorImpl vector = new VectorImpl();
		return vector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Array createArray() {
		ArrayImpl array = new ArrayImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Aggregate_Types createAggregate_Types() {
		Aggregate_TypesImpl aggregate_Types = new Aggregate_TypesImpl();
		return aggregate_Types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonConstantValue createNonConstantValue() {
		NonConstantValueImpl nonConstantValue = new NonConstantValueImpl();
		return nonConstantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value createValue() {
		ValueImpl value = new ValueImpl();
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList createParameterList() {
		ParameterListImpl parameterList = new ParameterListImpl();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBody createFunctionBody() {
		FunctionBodyImpl functionBody = new FunctionBodyImpl();
		return functionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBlock createBasicBlock() {
		BasicBlockImpl basicBlock = new BasicBlockImpl();
		return basicBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeList createTypeList() {
		TypeListImpl typeList = new TypeListImpl();
		return typeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LlvmPackage getLlvmPackage() {
		return (LlvmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LlvmPackage getPackage() {
		return LlvmPackage.eINSTANCE;
	}

} //LlvmFactoryImpl
