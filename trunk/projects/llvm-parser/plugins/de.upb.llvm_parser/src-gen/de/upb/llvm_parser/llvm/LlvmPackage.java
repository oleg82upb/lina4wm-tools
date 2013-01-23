/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.llvm_parser.llvm.LlvmFactory
 * @model kind="package"
 * @generated
 */
public interface LlvmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "llvm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.upb.de/llvm_parser/llvm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "llvm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LlvmPackage eINSTANCE = de.upb.llvm_parser.llvm.impl.LlvmPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LLVMImpl <em>LLVM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LLVMImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLLVM()
	 * @generated
	 */
	int LLVM = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLVM__ELEMENTS = 0;

	/**
	 * The number of structural features of the '<em>LLVM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LLVM_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AbstractElementImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAbstractElement()
	 * @generated
	 */
	int ABSTRACT_ELEMENT = 1;

	/**
	 * The number of structural features of the '<em>Abstract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.TopLevelEntityImpl <em>Top Level Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.TopLevelEntityImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTopLevelEntity()
	 * @generated
	 */
	int TOP_LEVEL_ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ENTITY__MODULE = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ENTITY__TARGET = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Libs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ENTITY__LIBS = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Top Level Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOP_LEVEL_ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.MainLevelEntityImpl <em>Main Level Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.MainLevelEntityImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getMainLevelEntity()
	 * @generated
	 */
	int MAIN_LEVEL_ENTITY = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_LEVEL_ENTITY__ADDRESS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main Level Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_LEVEL_ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.TypeDefinitionImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 4;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__ADDRESS = MAIN_LEVEL_ENTITY__ADDRESS;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__STRUCT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ADDRESS = MAIN_LEVEL_ENTITY__ADDRESS;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__RETURN_TYPE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__PL = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__BODY = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>TList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__TLIST = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AliasDefinitionImpl <em>Alias Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AliasDefinitionImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAliasDefinition()
	 * @generated
	 */
	int ALIAS_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Aliastype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION__ALIASTYPE = 1;

	/**
	 * The feature id for the '<em><b>Aliasvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION__ALIASVALUE = 2;

	/**
	 * The feature id for the '<em><b>Aliasee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION__ALIASEE = 3;

	/**
	 * The number of structural features of the '<em>Alias Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.Aggregate_TypesImpl <em>Aggregate Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.Aggregate_TypesImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAggregate_Types()
	 * @generated
	 */
	int AGGREGATE_TYPES = 13;

	/**
	 * The number of structural features of the '<em>Aggregate Types</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_TYPES_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.VectorImpl <em>Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.VectorImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getVector()
	 * @generated
	 */
	int VECTOR = 11;

	/**
	 * The number of structural features of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FEATURE_COUNT = AGGREGATE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.TypeUseImpl <em>Type Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.TypeUseImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeUse()
	 * @generated
	 */
	int TYPE_USE = 7;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE__POINTER = VECTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE_FEATURE_COUNT = VECTOR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AddressUseImpl <em>Address Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AddressUseImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAddressUse()
	 * @generated
	 */
	int ADDRESS_USE = 8;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_USE__POINTER = TYPE_USE__POINTER;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_USE__ADDRESS = TYPE_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Address Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_USE_FEATURE_COUNT = TYPE_USE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AddressImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__NAME = 0;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.PredefinedImpl <em>Predefined</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.PredefinedImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPredefined()
	 * @generated
	 */
	int PREDEFINED = 10;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED__POINTER = TYPE_USE__POINTER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED__TYPE = TYPE_USE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predefined</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_FEATURE_COUNT = TYPE_USE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ArrayImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 12;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = AGGREGATE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ValueImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 16;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ConstantImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.NonConstantValueImpl <em>Non Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.NonConstantValueImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getNonConstantValue()
	 * @generated
	 */
	int NON_CONSTANT_VALUE = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONSTANT_VALUE__NAME = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONSTANT_VALUE__POINTER = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Non Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_CONSTANT_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.StructureImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 17;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__TYPES = AGGREGATE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = AGGREGATE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ParameterListImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 18;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__LISTS = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionBodyImpl <em>Function Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FunctionBodyImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionBody()
	 * @generated
	 */
	int FUNCTION_BODY = 19;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BODY__BLOCKS = 0;

	/**
	 * The number of structural features of the '<em>Function Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BODY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.BasicBlockImpl <em>Basic Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.BasicBlockImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getBasicBlock()
	 * @generated
	 */
	int BASIC_BLOCK = 20;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Basic Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.TypeListImpl <em>Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.TypeListImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeList()
	 * @generated
	 */
	int TYPE_LIST = 21;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Typelists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST__TYPELISTS = 1;

	/**
	 * The number of structural features of the '<em>Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.LLVM <em>LLVM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LLVM</em>'.
	 * @see de.upb.llvm_parser.llvm.LLVM
	 * @generated
	 */
	EClass getLLVM();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.LLVM#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see de.upb.llvm_parser.llvm.LLVM#getElements()
	 * @see #getLLVM()
	 * @generated
	 */
	EReference getLLVM_Elements();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Element</em>'.
	 * @see de.upb.llvm_parser.llvm.AbstractElement
	 * @generated
	 */
	EClass getAbstractElement();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.TopLevelEntity <em>Top Level Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Top Level Entity</em>'.
	 * @see de.upb.llvm_parser.llvm.TopLevelEntity
	 * @generated
	 */
	EClass getTopLevelEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.TopLevelEntity#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see de.upb.llvm_parser.llvm.TopLevelEntity#getModule()
	 * @see #getTopLevelEntity()
	 * @generated
	 */
	EAttribute getTopLevelEntity_Module();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.TopLevelEntity#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see de.upb.llvm_parser.llvm.TopLevelEntity#getTarget()
	 * @see #getTopLevelEntity()
	 * @generated
	 */
	EAttribute getTopLevelEntity_Target();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.TopLevelEntity#getLibs <em>Libs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Libs</em>'.
	 * @see de.upb.llvm_parser.llvm.TopLevelEntity#getLibs()
	 * @see #getTopLevelEntity()
	 * @generated
	 */
	EAttribute getTopLevelEntity_Libs();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.MainLevelEntity <em>Main Level Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Main Level Entity</em>'.
	 * @see de.upb.llvm_parser.llvm.MainLevelEntity
	 * @generated
	 */
	EClass getMainLevelEntity();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.MainLevelEntity#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see de.upb.llvm_parser.llvm.MainLevelEntity#getAddress()
	 * @see #getMainLevelEntity()
	 * @generated
	 */
	EReference getMainLevelEntity_Address();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.TypeDefinition#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeDefinition#getStruct()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_Struct();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionDefinition#getReturnType()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getPl <em>Pl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pl</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionDefinition#getPl()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Pl();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionDefinition#getBody()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Body();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getTList <em>TList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TList</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionDefinition#getTList()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_TList();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.AliasDefinition <em>Alias Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias Definition</em>'.
	 * @see de.upb.llvm_parser.llvm.AliasDefinition
	 * @generated
	 */
	EClass getAliasDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AliasDefinition#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see de.upb.llvm_parser.llvm.AliasDefinition#getAddress()
	 * @see #getAliasDefinition()
	 * @generated
	 */
	EReference getAliasDefinition_Address();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AliasDefinition#getAliastype <em>Aliastype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aliastype</em>'.
	 * @see de.upb.llvm_parser.llvm.AliasDefinition#getAliastype()
	 * @see #getAliasDefinition()
	 * @generated
	 */
	EReference getAliasDefinition_Aliastype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AliasDefinition#getAliasvalue <em>Aliasvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aliasvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.AliasDefinition#getAliasvalue()
	 * @see #getAliasDefinition()
	 * @generated
	 */
	EReference getAliasDefinition_Aliasvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AliasDefinition#getAliasee <em>Aliasee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aliasee</em>'.
	 * @see de.upb.llvm_parser.llvm.AliasDefinition#getAliasee()
	 * @see #getAliasDefinition()
	 * @generated
	 */
	EReference getAliasDefinition_Aliasee();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.TypeUse <em>Type Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Use</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeUse
	 * @generated
	 */
	EClass getTypeUse();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.TypeUse#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pointer</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeUse#getPointer()
	 * @see #getTypeUse()
	 * @generated
	 */
	EAttribute getTypeUse_Pointer();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.AddressUse <em>Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Use</em>'.
	 * @see de.upb.llvm_parser.llvm.AddressUse
	 * @generated
	 */
	EClass getAddressUse();

	/**
	 * Returns the meta object for the reference '{@link de.upb.llvm_parser.llvm.AddressUse#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see de.upb.llvm_parser.llvm.AddressUse#getAddress()
	 * @see #getAddressUse()
	 * @generated
	 */
	EReference getAddressUse_Address();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see de.upb.llvm_parser.llvm.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Address#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.llvm_parser.llvm.Address#getName()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Name();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Predefined <em>Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Predefined</em>'.
	 * @see de.upb.llvm_parser.llvm.Predefined
	 * @generated
	 */
	EClass getPredefined();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Predefined#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.Predefined#getType()
	 * @see #getPredefined()
	 * @generated
	 */
	EAttribute getPredefined_Type();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vector</em>'.
	 * @see de.upb.llvm_parser.llvm.Vector
	 * @generated
	 */
	EClass getVector();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Array</em>'.
	 * @see de.upb.llvm_parser.llvm.Array
	 * @generated
	 */
	EClass getArray();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Aggregate_Types <em>Aggregate Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Types</em>'.
	 * @see de.upb.llvm_parser.llvm.Aggregate_Types
	 * @generated
	 */
	EClass getAggregate_Types();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see de.upb.llvm_parser.llvm.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.NonConstantValue <em>Non Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Constant Value</em>'.
	 * @see de.upb.llvm_parser.llvm.NonConstantValue
	 * @generated
	 */
	EClass getNonConstantValue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.NonConstantValue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.llvm_parser.llvm.NonConstantValue#getName()
	 * @see #getNonConstantValue()
	 * @generated
	 */
	EAttribute getNonConstantValue_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.NonConstantValue#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pointer</em>'.
	 * @see de.upb.llvm_parser.llvm.NonConstantValue#getPointer()
	 * @see #getNonConstantValue()
	 * @generated
	 */
	EAttribute getNonConstantValue_Pointer();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure</em>'.
	 * @see de.upb.llvm_parser.llvm.Structure
	 * @generated
	 */
	EClass getStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Structure#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.Structure#getTypes()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Types();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter List</em>'.
	 * @see de.upb.llvm_parser.llvm.ParameterList
	 * @generated
	 */
	EClass getParameterList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.ParameterList#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.ParameterList#getTypes()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.ParameterList#getLists <em>Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lists</em>'.
	 * @see de.upb.llvm_parser.llvm.ParameterList#getLists()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Lists();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.ParameterList#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.upb.llvm_parser.llvm.ParameterList#getVariables()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Variables();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.FunctionBody <em>Function Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Body</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionBody
	 * @generated
	 */
	EClass getFunctionBody();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.FunctionBody#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blocks</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionBody#getBlocks()
	 * @see #getFunctionBody()
	 * @generated
	 */
	EReference getFunctionBody_Blocks();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.BasicBlock <em>Basic Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Block</em>'.
	 * @see de.upb.llvm_parser.llvm.BasicBlock
	 * @generated
	 */
	EClass getBasicBlock();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.BasicBlock#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see de.upb.llvm_parser.llvm.BasicBlock#getLabel()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EAttribute getBasicBlock_Label();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.TypeList <em>Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type List</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeList
	 * @generated
	 */
	EClass getTypeList();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.TypeList#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeList#getTypes()
	 * @see #getTypeList()
	 * @generated
	 */
	EReference getTypeList_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.TypeList#getTypelists <em>Typelists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Typelists</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeList#getTypelists()
	 * @see #getTypeList()
	 * @generated
	 */
	EReference getTypeList_Typelists();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LlvmFactory getLlvmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.LLVMImpl <em>LLVM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.LLVMImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLLVM()
		 * @generated
		 */
		EClass LLVM = eINSTANCE.getLLVM();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LLVM__ELEMENTS = eINSTANCE.getLLVM_Elements();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.AbstractElementImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAbstractElement()
		 * @generated
		 */
		EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.TopLevelEntityImpl <em>Top Level Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.TopLevelEntityImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTopLevelEntity()
		 * @generated
		 */
		EClass TOP_LEVEL_ENTITY = eINSTANCE.getTopLevelEntity();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_LEVEL_ENTITY__MODULE = eINSTANCE.getTopLevelEntity_Module();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_LEVEL_ENTITY__TARGET = eINSTANCE.getTopLevelEntity_Target();

		/**
		 * The meta object literal for the '<em><b>Libs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOP_LEVEL_ENTITY__LIBS = eINSTANCE.getTopLevelEntity_Libs();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.MainLevelEntityImpl <em>Main Level Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.MainLevelEntityImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getMainLevelEntity()
		 * @generated
		 */
		EClass MAIN_LEVEL_ENTITY = eINSTANCE.getMainLevelEntity();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAIN_LEVEL_ENTITY__ADDRESS = eINSTANCE.getMainLevelEntity_Address();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.TypeDefinitionImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__STRUCT = eINSTANCE.getTypeDefinition_Struct();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__RETURN_TYPE = eINSTANCE.getFunctionDefinition_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Pl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__PL = eINSTANCE.getFunctionDefinition_Pl();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__BODY = eINSTANCE.getFunctionDefinition_Body();

		/**
		 * The meta object literal for the '<em><b>TList</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__TLIST = eINSTANCE.getFunctionDefinition_TList();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.AliasDefinitionImpl <em>Alias Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.AliasDefinitionImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAliasDefinition()
		 * @generated
		 */
		EClass ALIAS_DEFINITION = eINSTANCE.getAliasDefinition();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_DEFINITION__ADDRESS = eINSTANCE.getAliasDefinition_Address();

		/**
		 * The meta object literal for the '<em><b>Aliastype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_DEFINITION__ALIASTYPE = eINSTANCE.getAliasDefinition_Aliastype();

		/**
		 * The meta object literal for the '<em><b>Aliasvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_DEFINITION__ALIASVALUE = eINSTANCE.getAliasDefinition_Aliasvalue();

		/**
		 * The meta object literal for the '<em><b>Aliasee</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS_DEFINITION__ALIASEE = eINSTANCE.getAliasDefinition_Aliasee();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.TypeUseImpl <em>Type Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.TypeUseImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeUse()
		 * @generated
		 */
		EClass TYPE_USE = eINSTANCE.getTypeUse();

		/**
		 * The meta object literal for the '<em><b>Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_USE__POINTER = eINSTANCE.getTypeUse_Pointer();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.AddressUseImpl <em>Address Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.AddressUseImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAddressUse()
		 * @generated
		 */
		EClass ADDRESS_USE = eINSTANCE.getAddressUse();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_USE__ADDRESS = eINSTANCE.getAddressUse_Address();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.AddressImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__NAME = eINSTANCE.getAddress_Name();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.PredefinedImpl <em>Predefined</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.PredefinedImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPredefined()
		 * @generated
		 */
		EClass PREDEFINED = eINSTANCE.getPredefined();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PREDEFINED__TYPE = eINSTANCE.getPredefined_Type();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.VectorImpl <em>Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.VectorImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getVector()
		 * @generated
		 */
		EClass VECTOR = eINSTANCE.getVector();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ArrayImpl <em>Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ArrayImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getArray()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getArray();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.Aggregate_TypesImpl <em>Aggregate Types</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.Aggregate_TypesImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAggregate_Types()
		 * @generated
		 */
		EClass AGGREGATE_TYPES = eINSTANCE.getAggregate_Types();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ConstantImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.NonConstantValueImpl <em>Non Constant Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.NonConstantValueImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getNonConstantValue()
		 * @generated
		 */
		EClass NON_CONSTANT_VALUE = eINSTANCE.getNonConstantValue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_CONSTANT_VALUE__NAME = eINSTANCE.getNonConstantValue_Name();

		/**
		 * The meta object literal for the '<em><b>Pointer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_CONSTANT_VALUE__POINTER = eINSTANCE.getNonConstantValue_Pointer();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ValueImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.StructureImpl <em>Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.StructureImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getStructure()
		 * @generated
		 */
		EClass STRUCTURE = eINSTANCE.getStructure();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__TYPES = eINSTANCE.getStructure_Types();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ParameterListImpl <em>Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ParameterListImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getParameterList()
		 * @generated
		 */
		EClass PARAMETER_LIST = eINSTANCE.getParameterList();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__TYPES = eINSTANCE.getParameterList_Types();

		/**
		 * The meta object literal for the '<em><b>Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__LISTS = eINSTANCE.getParameterList_Lists();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__VARIABLES = eINSTANCE.getParameterList_Variables();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.FunctionBodyImpl <em>Function Body</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.FunctionBodyImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionBody()
		 * @generated
		 */
		EClass FUNCTION_BODY = eINSTANCE.getFunctionBody();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BODY__BLOCKS = eINSTANCE.getFunctionBody_Blocks();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.BasicBlockImpl <em>Basic Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.BasicBlockImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getBasicBlock()
		 * @generated
		 */
		EClass BASIC_BLOCK = eINSTANCE.getBasicBlock();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_BLOCK__LABEL = eINSTANCE.getBasicBlock_Label();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.TypeListImpl <em>Type List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.TypeListImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeList()
		 * @generated
		 */
		EClass TYPE_LIST = eINSTANCE.getTypeList();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_LIST__TYPES = eINSTANCE.getTypeList_Types();

		/**
		 * The meta object literal for the '<em><b>Typelists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_LIST__TYPELISTS = eINSTANCE.getTypeList_Typelists();

	}

} //LlvmPackage
