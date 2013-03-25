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
	 * The feature id for the '<em><b>Meta</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_LEVEL_ENTITY__META = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Meta</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__META = MAIN_LEVEL_ENTITY__META;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__ADDRESS = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__STRUCT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.GlobalDefinitionImpl <em>Global Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.GlobalDefinitionImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGlobalDefinition()
	 * @generated
	 */
	int GLOBAL_DEFINITION = 5;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION__META = MAIN_LEVEL_ENTITY__META;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION__ADRESS = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION__TYPE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION__VALUE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Global Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_DEFINITION_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 6;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__META = MAIN_LEVEL_ENTITY__META;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__RETURN_TYPE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ADDRESS = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Pl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__PL = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__BODY = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>TList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__TLIST = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AliasDefinitionImpl <em>Alias Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AliasDefinitionImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAliasDefinition()
	 * @generated
	 */
	int ALIAS_DEFINITION = 7;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION__META = MAIN_LEVEL_ENTITY__META;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION__ADDRESS = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aliastype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION__ALIASTYPE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aliasvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION__ALIASVALUE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Aliasee</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION__ALIASEE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Alias Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_DEFINITION_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.TypeUseImpl <em>Type Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.TypeUseImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeUse()
	 * @generated
	 */
	int TYPE_USE = 8;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE__POINTER = 0;

	/**
	 * The number of structural features of the '<em>Type Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_USE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AddressUseImpl <em>Address Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AddressUseImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAddressUse()
	 * @generated
	 */
	int ADDRESS_USE = 9;

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
	int ADDRESS = 10;

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
	int PREDEFINED = 11;

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
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.Aggregate_TypesImpl <em>Aggregate Types</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.Aggregate_TypesImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAggregate_Types()
	 * @generated
	 */
	int AGGREGATE_TYPES = 14;

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
	int VECTOR = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR__TYPE = AGGREGATE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VECTOR_FEATURE_COUNT = AGGREGATE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ArrayImpl <em>Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ArrayImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getArray()
	 * @generated
	 */
	int ARRAY = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__TYPE = AGGREGATE_TYPES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = AGGREGATE_TYPES_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ValueImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 17;

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
	int CONSTANT = 15;

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
	int NON_CONSTANT_VALUE = 16;

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
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ValueStructImpl <em>Value Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ValueStructImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getValueStruct()
	 * @generated
	 */
	int VALUE_STRUCT = 18;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRUCT__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRUCT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Value Struct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRUCT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.StructureImpl <em>Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.StructureImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getStructure()
	 * @generated
	 */
	int STRUCTURE = 19;

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
	int PARAMETER_LIST = 20;

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
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionBodyImpl <em>Function Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FunctionBodyImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionBody()
	 * @generated
	 */
	int FUNCTION_BODY = 22;

	/**
	 * The feature id for the '<em><b>Meta</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BODY__META = 0;

	/**
	 * The feature id for the '<em><b>Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BODY__BLOCKS = 1;

	/**
	 * The number of structural features of the '<em>Function Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_BODY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InstructionImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 23;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.BasicBlockImpl <em>Basic Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.BasicBlockImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getBasicBlock()
	 * @generated
	 */
	int BASIC_BLOCK = 24;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__LABEL = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__INSTRUCTIONS = 1;

	/**
	 * The feature id for the '<em><b>Retadr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__RETADR = 2;

	/**
	 * The feature id for the '<em><b>Terminator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__TERMINATOR = 3;

	/**
	 * The number of structural features of the '<em>Basic Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InstructionUseImpl <em>Instruction Use</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InstructionUseImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInstructionUse()
	 * @generated
	 */
	int INSTRUCTION_USE = 25;

	/**
	 * The feature id for the '<em><b>Reg or var</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_USE__REG_OR_VAR = 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_USE__INSTRUCTION = 1;

	/**
	 * The number of structural features of the '<em>Instruction Use</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_USE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.Ret_InstrImpl <em>Ret Instr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.Ret_InstrImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getRet_Instr()
	 * @generated
	 */
	int RET_INSTR = 26;

	/**
	 * The number of structural features of the '<em>Ret Instr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RET_INSTR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.Std_InstrImpl <em>Std Instr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.Std_InstrImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getStd_Instr()
	 * @generated
	 */
	int STD_INSTR = 27;

	/**
	 * The number of structural features of the '<em>Std Instr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STD_INSTR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl <em>ARITHMETIC OP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getARITHMETIC_OP()
	 * @generated
	 */
	int ARITHMETIC_OP = 28;

	/**
	 * The feature id for the '<em><b>Optype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OP__OPTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OP__VALUE1 = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OP__VALUE2 = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ARITHMETIC OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OP_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LOGICAL_OPImpl <em>LOGICAL OP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LOGICAL_OPImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLOGICAL_OP()
	 * @generated
	 */
	int LOGICAL_OP = 29;

	/**
	 * The feature id for the '<em><b>Optype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP__OPTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP__VALUE1 = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP__VALUE2 = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LOGICAL OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CastImpl <em>Cast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CastImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCast()
	 * @generated
	 */
	int CAST = 30;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__FROM = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__VALUE = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__TO = VALUE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_FEATURE_COUNT = VALUE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl <em>Get Element Ptr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.GetElementPtrImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGetElementPtr()
	 * @generated
	 */
	int GET_ELEMENT_PTR = 31;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__AGGREGATE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregatename</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__AGGREGATENAME = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ind Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__IND_TYPES = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indizies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__INDIZIES = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Get Element Ptr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.GetElementPtr1Impl <em>Get Element Ptr1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.GetElementPtr1Impl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGetElementPtr1()
	 * @generated
	 */
	int GET_ELEMENT_PTR1 = 32;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR1__AGGREGATE = GET_ELEMENT_PTR__AGGREGATE;

	/**
	 * The feature id for the '<em><b>Aggregatename</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR1__AGGREGATENAME = GET_ELEMENT_PTR__AGGREGATENAME;

	/**
	 * The feature id for the '<em><b>Ind Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR1__IND_TYPES = GET_ELEMENT_PTR__IND_TYPES;

	/**
	 * The feature id for the '<em><b>Indizies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR1__INDIZIES = GET_ELEMENT_PTR__INDIZIES;

	/**
	 * The number of structural features of the '<em>Get Element Ptr1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR1_FEATURE_COUNT = GET_ELEMENT_PTR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.GetElementPtr2Impl <em>Get Element Ptr2</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.GetElementPtr2Impl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGetElementPtr2()
	 * @generated
	 */
	int GET_ELEMENT_PTR2 = 33;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR2__AGGREGATE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregatename</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR2__AGGREGATENAME = VALUE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ind Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR2__IND_TYPES = VALUE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indizies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR2__INDIZIES = VALUE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Get Element Ptr2</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR2_FEATURE_COUNT = VALUE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ExtractValueImpl <em>Extract Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ExtractValueImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractValue()
	 * @generated
	 */
	int EXTRACT_VALUE = 34;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__ARRAY = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__STRUCT = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__VALUE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__INDEX = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Extract Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl <em>Insert Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InsertValueImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInsertValue()
	 * @generated
	 */
	int INSERT_VALUE = 35;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__STRUCT = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__VALUE = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inserttype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__INSERTTYPE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Insertvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__INSERTVALUE = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__INDEX = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Insert Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FenceImpl <em>Fence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FenceImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFence()
	 * @generated
	 */
	int FENCE = 36;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCE__ORDERING = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FENCE_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CmpXchgImpl <em>Cmp Xchg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CmpXchgImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCmpXchg()
	 * @generated
	 */
	int CMP_XCHG = 37;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__ADRESSTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__ADRESS = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparetype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__COMPARETYPE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comparevalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__COMPAREVALUE = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Newtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__NEWTYPE = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Newvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__NEWVALUE = STD_INSTR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__ORDERING = STD_INSTR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cmp Xchg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl <em>Atomic RMW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AtomicRMWImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAtomicRMW()
	 * @generated
	 */
	int ATOMIC_RMW = 38;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__ADRESSTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__ADRESS = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__OPTYPE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__OPVALUE = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__ORDERING = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Atomic RMW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LoadImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 39;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ADRESSTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__TYPES = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ADRESS = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ORDERING = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__INDEX = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.StoreImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 40;

	/**
	 * The feature id for the '<em><b>Newtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NEWTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__TYPES = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Newvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NEWVALUE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ADRESSTYPE = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ADRESS = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ORDERING = STD_INSTR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__INDEX = STD_INSTR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CallImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 41;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ADRESSTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ADRESS = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>PList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PLIST = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AllocImpl <em>Alloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AllocImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAlloc()
	 * @generated
	 */
	int ALLOC = 42;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC__TYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Typelist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC__TYPELIST = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numelementstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC__NUMELEMENTSTYPE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Numelementsvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC__NUMELEMENTSVALUE = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Alloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.PHIImpl <em>PHI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.PHIImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPHI()
	 * @generated
	 */
	int PHI = 43;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI__TYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Firstclass</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI__FIRSTCLASS = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI__VALUES = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>PHI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl <em>Landing Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LandingPadImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLandingPad()
	 * @generated
	 */
	int LANDING_PAD = 44;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__STRUCT = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Personalitytype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__PERSONALITYTYPE = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Personalityvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__PERSONALITYVALUE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__CLAUSE = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Landing Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ClauseImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 45;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Filterarray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__FILTERARRAY = 2;

	/**
	 * The feature id for the '<em><b>Constant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__CONSTANT = 3;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.SelectImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 46;

	/**
	 * The feature id for the '<em><b>Conditiontype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CONDITIONTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditionvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CONDITIONVALUE = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Val1type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL1TYPE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Val1value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL1VALUE = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Val2type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL2TYPE = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Val2value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL2VALUE = STD_INSTR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl <em>VA Arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.VA_ArgImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getVA_Arg()
	 * @generated
	 */
	int VA_ARG = 47;

	/**
	 * The feature id for the '<em><b>Listtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG__LISTTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Listvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG__LISTVALUE = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arg Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG__ARG_TYPE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VA Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ExtractElementImpl <em>Extract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ExtractElementImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractElement()
	 * @generated
	 */
	int EXTRACT_ELEMENT = 48;

	/**
	 * The feature id for the '<em><b>Vectortype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__VECTORTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vectorvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__VECTORVALUE = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Indextype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__INDEXTYPE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__INDEX = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Extract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl <em>Insert Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InsertElementImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInsertElement()
	 * @generated
	 */
	int INSERT_ELEMENT = 49;

	/**
	 * The feature id for the '<em><b>Vectortype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__VECTORTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vectorvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__VECTORVALUE = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scalartype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__SCALARTYPE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scalarvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__SCALARVALUE = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Indextype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__INDEXTYPE = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__INDEX = STD_INSTR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Insert Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl <em>Shuffle Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getShuffleVector()
	 * @generated
	 */
	int SHUFFLE_VECTOR = 50;

	/**
	 * The feature id for the '<em><b>Val1type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VAL1TYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Val1value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VAL1VALUE = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Val2type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VAL2TYPE = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Val2value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VAL2VALUE = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Masktype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__MASKTYPE = STD_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maskvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__MASKVALUE = STD_INSTR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Shuffle Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CompareImpl <em>Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CompareImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCompare()
	 * @generated
	 */
	int COMPARE = 51;

	/**
	 * The feature id for the '<em><b>Comptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__COMPTYPE = STD_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__VALUE1 = STD_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__VALUE2 = STD_INSTR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_FEATURE_COUNT = STD_INSTR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl <em>Indirect Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.IndirectBranchImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getIndirectBranch()
	 * @generated
	 */
	int INDIRECT_BRANCH = 52;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH__ADRESSTYPE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH__ADRESS = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Labeltype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH__LABELTYPE = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH__LABELS = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Indirect Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.SwitchImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 53;

	/**
	 * The feature id for the '<em><b>Comptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__COMPTYPE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__COMPVALUE = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defaulttype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DEFAULTTYPE = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defaultvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DEFAULTVALUE = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Jtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__JTYPES = RET_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Jvalues</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__JVALUES = RET_INSTR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Destinationtypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DESTINATIONTYPES = RET_INSTR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DESTINATIONS = RET_INSTR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InvokeImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 54;

	/**
	 * The feature id for the '<em><b>Functiontype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FUNCTIONTYPE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__NAME = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>PList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__PLIST = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Totype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TOTYPE = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tovalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TOVALUE = RET_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unwindtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__UNWINDTYPE = RET_INSTR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unwindvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__UNWINDVALUE = RET_INSTR_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ResumeImpl <em>Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ResumeImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getResume()
	 * @generated
	 */
	int RESUME = 55;

	/**
	 * The feature id for the '<em><b>Resumestruct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__RESUMESTRUCT = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resumevalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__RESUMEVALUE = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.UnreachableImpl <em>Unreachable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.UnreachableImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getUnreachable()
	 * @generated
	 */
	int UNREACHABLE = 56;

	/**
	 * The number of structural features of the '<em>Unreachable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREACHABLE_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ReturnImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 57;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RETURNTYPE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returnvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RETURNVALUE = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.BranchImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 58;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DESTINATION = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CONDVALUE = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Truetype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_TRUETYPE = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_TRUE = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Falsetype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_FALSETYPE = RET_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_FALSE = RET_INSTR_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 6;


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
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.MainLevelEntity#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Meta</em>'.
	 * @see de.upb.llvm_parser.llvm.MainLevelEntity#getMeta()
	 * @see #getMainLevelEntity()
	 * @generated
	 */
	EAttribute getMainLevelEntity_Meta();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.TypeDefinition#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeDefinition#getAddress()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_Address();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.GlobalDefinition <em>Global Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global Definition</em>'.
	 * @see de.upb.llvm_parser.llvm.GlobalDefinition
	 * @generated
	 */
	EClass getGlobalDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.GlobalDefinition#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.GlobalDefinition#getAdress()
	 * @see #getGlobalDefinition()
	 * @generated
	 */
	EReference getGlobalDefinition_Adress();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.GlobalDefinition#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.GlobalDefinition#getType()
	 * @see #getGlobalDefinition()
	 * @generated
	 */
	EReference getGlobalDefinition_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.GlobalDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.GlobalDefinition#getValue()
	 * @see #getGlobalDefinition()
	 * @generated
	 */
	EReference getGlobalDefinition_Value();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionDefinition#getAddress()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Address();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Vector#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.Vector#getType()
	 * @see #getVector()
	 * @generated
	 */
	EReference getVector_Type();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Array#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.Array#getType()
	 * @see #getArray()
	 * @generated
	 */
	EReference getArray_Type();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ValueStruct <em>Value Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Struct</em>'.
	 * @see de.upb.llvm_parser.llvm.ValueStruct
	 * @generated
	 */
	EClass getValueStruct();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.ValueStruct#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.ValueStruct#getTypes()
	 * @see #getValueStruct()
	 * @generated
	 */
	EReference getValueStruct_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.ValueStruct#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.ValueStruct#getValue()
	 * @see #getValueStruct()
	 * @generated
	 */
	EReference getValueStruct_Value();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.FunctionBody <em>Function Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Body</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionBody
	 * @generated
	 */
	EClass getFunctionBody();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.FunctionBody#getMeta <em>Meta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Meta</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionBody#getMeta()
	 * @see #getFunctionBody()
	 * @generated
	 */
	EAttribute getFunctionBody_Meta();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see de.upb.llvm_parser.llvm.Instruction
	 * @generated
	 */
	EClass getInstruction();

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
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.BasicBlock#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see de.upb.llvm_parser.llvm.BasicBlock#getInstructions()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EReference getBasicBlock_Instructions();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.BasicBlock#getRetadr <em>Retadr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retadr</em>'.
	 * @see de.upb.llvm_parser.llvm.BasicBlock#getRetadr()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EAttribute getBasicBlock_Retadr();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.BasicBlock#getTerminator <em>Terminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Terminator</em>'.
	 * @see de.upb.llvm_parser.llvm.BasicBlock#getTerminator()
	 * @see #getBasicBlock()
	 * @generated
	 */
	EReference getBasicBlock_Terminator();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.InstructionUse <em>Instruction Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction Use</em>'.
	 * @see de.upb.llvm_parser.llvm.InstructionUse
	 * @generated
	 */
	EClass getInstructionUse();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InstructionUse#getReg_or_var <em>Reg or var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reg or var</em>'.
	 * @see de.upb.llvm_parser.llvm.InstructionUse#getReg_or_var()
	 * @see #getInstructionUse()
	 * @generated
	 */
	EAttribute getInstructionUse_Reg_or_var();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InstructionUse#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instruction</em>'.
	 * @see de.upb.llvm_parser.llvm.InstructionUse#getInstruction()
	 * @see #getInstructionUse()
	 * @generated
	 */
	EReference getInstructionUse_Instruction();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Ret_Instr <em>Ret Instr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ret Instr</em>'.
	 * @see de.upb.llvm_parser.llvm.Ret_Instr
	 * @generated
	 */
	EClass getRet_Instr();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Std_Instr <em>Std Instr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Std Instr</em>'.
	 * @see de.upb.llvm_parser.llvm.Std_Instr
	 * @generated
	 */
	EClass getStd_Instr();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ARITHMETIC_OP <em>ARITHMETIC OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARITHMETIC OP</em>'.
	 * @see de.upb.llvm_parser.llvm.ARITHMETIC_OP
	 * @generated
	 */
	EClass getARITHMETIC_OP();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ARITHMETIC_OP#getOptype <em>Optype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optype</em>'.
	 * @see de.upb.llvm_parser.llvm.ARITHMETIC_OP#getOptype()
	 * @see #getARITHMETIC_OP()
	 * @generated
	 */
	EReference getARITHMETIC_OP_Optype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ARITHMETIC_OP#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value1</em>'.
	 * @see de.upb.llvm_parser.llvm.ARITHMETIC_OP#getValue1()
	 * @see #getARITHMETIC_OP()
	 * @generated
	 */
	EReference getARITHMETIC_OP_Value1();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ARITHMETIC_OP#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value2</em>'.
	 * @see de.upb.llvm_parser.llvm.ARITHMETIC_OP#getValue2()
	 * @see #getARITHMETIC_OP()
	 * @generated
	 */
	EReference getARITHMETIC_OP_Value2();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.LOGICAL_OP <em>LOGICAL OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LOGICAL OP</em>'.
	 * @see de.upb.llvm_parser.llvm.LOGICAL_OP
	 * @generated
	 */
	EClass getLOGICAL_OP();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LOGICAL_OP#getOptype <em>Optype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optype</em>'.
	 * @see de.upb.llvm_parser.llvm.LOGICAL_OP#getOptype()
	 * @see #getLOGICAL_OP()
	 * @generated
	 */
	EReference getLOGICAL_OP_Optype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LOGICAL_OP#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value1</em>'.
	 * @see de.upb.llvm_parser.llvm.LOGICAL_OP#getValue1()
	 * @see #getLOGICAL_OP()
	 * @generated
	 */
	EReference getLOGICAL_OP_Value1();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LOGICAL_OP#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value2</em>'.
	 * @see de.upb.llvm_parser.llvm.LOGICAL_OP#getValue2()
	 * @see #getLOGICAL_OP()
	 * @generated
	 */
	EReference getLOGICAL_OP_Value2();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Cast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast
	 * @generated
	 */
	EClass getCast();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Cast#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getFrom()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_From();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Cast#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getValue()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Cast#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getTo()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_To();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.GetElementPtr <em>Get Element Ptr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Element Ptr</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr
	 * @generated
	 */
	EClass getGetElementPtr();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.GetElementPtr#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregate</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getAggregate()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EReference getGetElementPtr_Aggregate();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.GetElementPtr#getAggregatename <em>Aggregatename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregatename</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getAggregatename()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EReference getGetElementPtr_Aggregatename();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.GetElementPtr#getIndTypes <em>Ind Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ind Types</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getIndTypes()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EReference getGetElementPtr_IndTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.GetElementPtr#getIndizies <em>Indizies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Indizies</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getIndizies()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EReference getGetElementPtr_Indizies();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.GetElementPtr1 <em>Get Element Ptr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Element Ptr1</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr1
	 * @generated
	 */
	EClass getGetElementPtr1();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.GetElementPtr2 <em>Get Element Ptr2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Element Ptr2</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr2
	 * @generated
	 */
	EClass getGetElementPtr2();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ExtractValue <em>Extract Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extract Value</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractValue
	 * @generated
	 */
	EClass getExtractValue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractValue#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractValue#getArray()
	 * @see #getExtractValue()
	 * @generated
	 */
	EReference getExtractValue_Array();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractValue#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractValue#getStruct()
	 * @see #getExtractValue()
	 * @generated
	 */
	EReference getExtractValue_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractValue#getValue()
	 * @see #getExtractValue()
	 * @generated
	 */
	EReference getExtractValue_Value();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.ExtractValue#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Index</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractValue#getIndex()
	 * @see #getExtractValue()
	 * @generated
	 */
	EAttribute getExtractValue_Index();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.InsertValue <em>Insert Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Value</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue
	 * @generated
	 */
	EClass getInsertValue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertValue#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getStruct()
	 * @see #getInsertValue()
	 * @generated
	 */
	EReference getInsertValue_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getValue()
	 * @see #getInsertValue()
	 * @generated
	 */
	EReference getInsertValue_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertValue#getInserttype <em>Inserttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inserttype</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getInserttype()
	 * @see #getInsertValue()
	 * @generated
	 */
	EReference getInsertValue_Inserttype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertValue#getInsertvalue <em>Insertvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insertvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getInsertvalue()
	 * @see #getInsertValue()
	 * @generated
	 */
	EReference getInsertValue_Insertvalue();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.InsertValue#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Index</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getIndex()
	 * @see #getInsertValue()
	 * @generated
	 */
	EAttribute getInsertValue_Index();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Fence <em>Fence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fence</em>'.
	 * @see de.upb.llvm_parser.llvm.Fence
	 * @generated
	 */
	EClass getFence();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Fence#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see de.upb.llvm_parser.llvm.Fence#getOrdering()
	 * @see #getFence()
	 * @generated
	 */
	EAttribute getFence_Ordering();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.CmpXchg <em>Cmp Xchg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmp Xchg</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg
	 * @generated
	 */
	EClass getCmpXchg();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getAdresstype()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EReference getCmpXchg_Adresstype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getAdress()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EReference getCmpXchg_Adress();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getComparetype <em>Comparetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparetype</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getComparetype()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EReference getCmpXchg_Comparetype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getComparevalue <em>Comparevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comparevalue</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getComparevalue()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EReference getCmpXchg_Comparevalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewtype <em>Newtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Newtype</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getNewtype()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EReference getCmpXchg_Newtype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewvalue <em>Newvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Newvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getNewvalue()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EReference getCmpXchg_Newvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.CmpXchg#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getOrdering()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EAttribute getCmpXchg_Ordering();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.AtomicRMW <em>Atomic RMW</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic RMW</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW
	 * @generated
	 */
	EClass getAtomicRMW();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getAdresstype()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EReference getAtomicRMW_Adresstype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getAdress()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EReference getAtomicRMW_Adress();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOptype <em>Optype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Optype</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getOptype()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EReference getAtomicRMW_Optype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOpvalue <em>Opvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Opvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getOpvalue()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EReference getAtomicRMW_Opvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getOrdering()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EAttribute getAtomicRMW_Ordering();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see de.upb.llvm_parser.llvm.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Load#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.Load#getAdresstype()
	 * @see #getLoad()
	 * @generated
	 */
	EReference getLoad_Adresstype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Load#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.Load#getTypes()
	 * @see #getLoad()
	 * @generated
	 */
	EReference getLoad_Types();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Load#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.Load#getAdress()
	 * @see #getLoad()
	 * @generated
	 */
	EReference getLoad_Adress();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Load#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see de.upb.llvm_parser.llvm.Load#getOrdering()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Load#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.upb.llvm_parser.llvm.Load#getIndex()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Index();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store</em>'.
	 * @see de.upb.llvm_parser.llvm.Store
	 * @generated
	 */
	EClass getStore();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Store#getNewtype <em>Newtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Newtype</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getNewtype()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Newtype();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Store#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getTypes()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Types();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Store#getNewvalue <em>Newvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Newvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getNewvalue()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Newvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Store#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getAdresstype()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Adresstype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Store#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getAdress()
	 * @see #getStore()
	 * @generated
	 */
	EReference getStore_Adress();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Store#getOrdering <em>Ordering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ordering</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getOrdering()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Ordering();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Store#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getIndex()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Index();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call</em>'.
	 * @see de.upb.llvm_parser.llvm.Call
	 * @generated
	 */
	EClass getCall();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Call#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.Call#getAdresstype()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Adresstype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Call#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.Call#getAdress()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Adress();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Call#getPList <em>PList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PList</em>'.
	 * @see de.upb.llvm_parser.llvm.Call#getPList()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_PList();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Alloc <em>Alloc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alloc</em>'.
	 * @see de.upb.llvm_parser.llvm.Alloc
	 * @generated
	 */
	EClass getAlloc();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Alloc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.Alloc#getType()
	 * @see #getAlloc()
	 * @generated
	 */
	EReference getAlloc_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Alloc#getTypelist <em>Typelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Typelist</em>'.
	 * @see de.upb.llvm_parser.llvm.Alloc#getTypelist()
	 * @see #getAlloc()
	 * @generated
	 */
	EReference getAlloc_Typelist();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Alloc#getNumelementstype <em>Numelementstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numelementstype</em>'.
	 * @see de.upb.llvm_parser.llvm.Alloc#getNumelementstype()
	 * @see #getAlloc()
	 * @generated
	 */
	EReference getAlloc_Numelementstype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Alloc#getNumelementsvalue <em>Numelementsvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Numelementsvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Alloc#getNumelementsvalue()
	 * @see #getAlloc()
	 * @generated
	 */
	EReference getAlloc_Numelementsvalue();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.PHI <em>PHI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PHI</em>'.
	 * @see de.upb.llvm_parser.llvm.PHI
	 * @generated
	 */
	EClass getPHI();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.PHI#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.PHI#getType()
	 * @see #getPHI()
	 * @generated
	 */
	EReference getPHI_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.PHI#getFirstclass <em>Firstclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Firstclass</em>'.
	 * @see de.upb.llvm_parser.llvm.PHI#getFirstclass()
	 * @see #getPHI()
	 * @generated
	 */
	EReference getPHI_Firstclass();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.PHI#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.upb.llvm_parser.llvm.PHI#getValues()
	 * @see #getPHI()
	 * @generated
	 */
	EReference getPHI_Values();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.LandingPad <em>Landing Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Landing Pad</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad
	 * @generated
	 */
	EClass getLandingPad();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LandingPad#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getStruct()
	 * @see #getLandingPad()
	 * @generated
	 */
	EReference getLandingPad_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalitytype <em>Personalitytype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personalitytype</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getPersonalitytype()
	 * @see #getLandingPad()
	 * @generated
	 */
	EReference getLandingPad_Personalitytype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalityvalue <em>Personalityvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personalityvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getPersonalityvalue()
	 * @see #getLandingPad()
	 * @generated
	 */
	EReference getLandingPad_Personalityvalue();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.LandingPad#getClause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clause</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getClause()
	 * @see #getLandingPad()
	 * @generated
	 */
	EReference getLandingPad_Clause();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Clause#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause#getType()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Clause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause#getValue()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Clause#getFilterarray <em>Filterarray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Filterarray</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause#getFilterarray()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Filterarray();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Clause#getConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constant</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause#getConstant()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Constant();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Select</em>'.
	 * @see de.upb.llvm_parser.llvm.Select
	 * @generated
	 */
	EClass getSelect();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getConditiontype <em>Conditiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditiontype</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getConditiontype()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Conditiontype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getConditionvalue <em>Conditionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Conditionvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getConditionvalue()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Conditionvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getVal1type <em>Val1type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val1type</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal1type()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Val1type();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getVal1value <em>Val1value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val1value</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal1value()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Val1value();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getVal2type <em>Val2type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val2type</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal2type()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Val2type();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getVal2value <em>Val2value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val2value</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal2value()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Val2value();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.VA_Arg <em>VA Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>VA Arg</em>'.
	 * @see de.upb.llvm_parser.llvm.VA_Arg
	 * @generated
	 */
	EClass getVA_Arg();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.VA_Arg#getListtype <em>Listtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listtype</em>'.
	 * @see de.upb.llvm_parser.llvm.VA_Arg#getListtype()
	 * @see #getVA_Arg()
	 * @generated
	 */
	EReference getVA_Arg_Listtype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.VA_Arg#getListvalue <em>Listvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.VA_Arg#getListvalue()
	 * @see #getVA_Arg()
	 * @generated
	 */
	EReference getVA_Arg_Listvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.VA_Arg#getArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Arg Type</em>'.
	 * @see de.upb.llvm_parser.llvm.VA_Arg#getArgType()
	 * @see #getVA_Arg()
	 * @generated
	 */
	EReference getVA_Arg_ArgType();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ExtractElement <em>Extract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extract Element</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractElement
	 * @generated
	 */
	EClass getExtractElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractElement#getVectortype <em>Vectortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vectortype</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractElement#getVectortype()
	 * @see #getExtractElement()
	 * @generated
	 */
	EReference getExtractElement_Vectortype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractElement#getVectorvalue <em>Vectorvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vectorvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractElement#getVectorvalue()
	 * @see #getExtractElement()
	 * @generated
	 */
	EReference getExtractElement_Vectorvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractElement#getIndextype <em>Indextype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indextype</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractElement#getIndextype()
	 * @see #getExtractElement()
	 * @generated
	 */
	EReference getExtractElement_Indextype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractElement#getIndex()
	 * @see #getExtractElement()
	 * @generated
	 */
	EReference getExtractElement_Index();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.InsertElement <em>Insert Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insert Element</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement
	 * @generated
	 */
	EClass getInsertElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getVectortype <em>Vectortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vectortype</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getVectortype()
	 * @see #getInsertElement()
	 * @generated
	 */
	EReference getInsertElement_Vectortype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getVectorvalue <em>Vectorvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vectorvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getVectorvalue()
	 * @see #getInsertElement()
	 * @generated
	 */
	EReference getInsertElement_Vectorvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getScalartype <em>Scalartype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scalartype</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getScalartype()
	 * @see #getInsertElement()
	 * @generated
	 */
	EReference getInsertElement_Scalartype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getScalarvalue <em>Scalarvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scalarvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getScalarvalue()
	 * @see #getInsertElement()
	 * @generated
	 */
	EReference getInsertElement_Scalarvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getIndextype <em>Indextype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Indextype</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getIndextype()
	 * @see #getInsertElement()
	 * @generated
	 */
	EReference getInsertElement_Indextype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getIndex()
	 * @see #getInsertElement()
	 * @generated
	 */
	EReference getInsertElement_Index();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ShuffleVector <em>Shuffle Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shuffle Vector</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector
	 * @generated
	 */
	EClass getShuffleVector();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1type <em>Val1type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val1type</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVal1type()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EReference getShuffleVector_Val1type();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1value <em>Val1value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val1value</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVal1value()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EReference getShuffleVector_Val1value();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2type <em>Val2type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val2type</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVal2type()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EReference getShuffleVector_Val2type();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2value <em>Val2value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val2value</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVal2value()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EReference getShuffleVector_Val2value();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMasktype <em>Masktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Masktype</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getMasktype()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EReference getShuffleVector_Masktype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMaskvalue <em>Maskvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Maskvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getMaskvalue()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EReference getShuffleVector_Maskvalue();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare</em>'.
	 * @see de.upb.llvm_parser.llvm.Compare
	 * @generated
	 */
	EClass getCompare();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Compare#getComptype <em>Comptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comptype</em>'.
	 * @see de.upb.llvm_parser.llvm.Compare#getComptype()
	 * @see #getCompare()
	 * @generated
	 */
	EReference getCompare_Comptype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Compare#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value1</em>'.
	 * @see de.upb.llvm_parser.llvm.Compare#getValue1()
	 * @see #getCompare()
	 * @generated
	 */
	EReference getCompare_Value1();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Compare#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value2</em>'.
	 * @see de.upb.llvm_parser.llvm.Compare#getValue2()
	 * @see #getCompare()
	 * @generated
	 */
	EReference getCompare_Value2();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.IndirectBranch <em>Indirect Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indirect Branch</em>'.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch
	 * @generated
	 */
	EClass getIndirectBranch();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch#getAdresstype()
	 * @see #getIndirectBranch()
	 * @generated
	 */
	EReference getIndirectBranch_Adresstype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch#getAdress()
	 * @see #getIndirectBranch()
	 * @generated
	 */
	EReference getIndirectBranch_Adress();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.IndirectBranch#getLabeltype <em>Labeltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labeltype</em>'.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch#getLabeltype()
	 * @see #getIndirectBranch()
	 * @generated
	 */
	EReference getIndirectBranch_Labeltype();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.IndirectBranch#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch#getLabels()
	 * @see #getIndirectBranch()
	 * @generated
	 */
	EReference getIndirectBranch_Labels();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Switch</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch
	 * @generated
	 */
	EClass getSwitch();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Switch#getComptype <em>Comptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comptype</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getComptype()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Comptype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Switch#getCompvalue <em>Compvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getCompvalue()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Compvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Switch#getDefaulttype <em>Defaulttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaulttype</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getDefaulttype()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Defaulttype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Switch#getDefaultvalue <em>Defaultvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Defaultvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getDefaultvalue()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Defaultvalue();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Switch#getJtypes <em>Jtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jtypes</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getJtypes()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Jtypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Switch#getJvalues <em>Jvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Jvalues</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getJvalues()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Jvalues();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Switch#getDestinationtypes <em>Destinationtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destinationtypes</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getDestinationtypes()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Destinationtypes();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Switch#getDestinations <em>Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destinations</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getDestinations()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Destinations();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Invoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invoke</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke
	 * @generated
	 */
	EClass getInvoke();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getFunctiontype <em>Functiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Functiontype</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getFunctiontype()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Functiontype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getName()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Name();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getPList <em>PList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>PList</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getPList()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_PList();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getTotype <em>Totype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Totype</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getTotype()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Totype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getTovalue <em>Tovalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tovalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getTovalue()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Tovalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindtype <em>Unwindtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unwindtype</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getUnwindtype()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Unwindtype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindvalue <em>Unwindvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unwindvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getUnwindvalue()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Unwindvalue();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Resume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resume</em>'.
	 * @see de.upb.llvm_parser.llvm.Resume
	 * @generated
	 */
	EClass getResume();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Resume#getResumestruct <em>Resumestruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resumestruct</em>'.
	 * @see de.upb.llvm_parser.llvm.Resume#getResumestruct()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Resumestruct();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Resume#getResumevalue <em>Resumevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resumevalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Resume#getResumevalue()
	 * @see #getResume()
	 * @generated
	 */
	EReference getResume_Resumevalue();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Unreachable <em>Unreachable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unreachable</em>'.
	 * @see de.upb.llvm_parser.llvm.Unreachable
	 * @generated
	 */
	EClass getUnreachable();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see de.upb.llvm_parser.llvm.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Return#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returntype</em>'.
	 * @see de.upb.llvm_parser.llvm.Return#getReturntype()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Returntype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Return#getReturnvalue <em>Returnvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Returnvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Return#getReturnvalue()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Returnvalue();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Branch#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Destination</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getDestination()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Destination();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Branch#getCondvalue <em>Condvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getCondvalue()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Condvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Branch#getLabelTruetype <em>Label Truetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Truetype</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getLabelTruetype()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_LabelTruetype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Branch#getLabelTrue <em>Label True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label True</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getLabelTrue()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_LabelTrue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Branch#getLabelFalsetype <em>Label Falsetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Falsetype</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getLabelFalsetype()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_LabelFalsetype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Branch#getLabelFalse <em>Label False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label False</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getLabelFalse()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_LabelFalse();

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
		 * The meta object literal for the '<em><b>Meta</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_LEVEL_ENTITY__META = eINSTANCE.getMainLevelEntity_Meta();

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
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__ADDRESS = eINSTANCE.getTypeDefinition_Address();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__STRUCT = eINSTANCE.getTypeDefinition_Struct();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.GlobalDefinitionImpl <em>Global Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.GlobalDefinitionImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGlobalDefinition()
		 * @generated
		 */
		EClass GLOBAL_DEFINITION = eINSTANCE.getGlobalDefinition();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_DEFINITION__ADRESS = eINSTANCE.getGlobalDefinition_Adress();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_DEFINITION__TYPE = eINSTANCE.getGlobalDefinition_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL_DEFINITION__VALUE = eINSTANCE.getGlobalDefinition_Value();

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
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__ADDRESS = eINSTANCE.getFunctionDefinition_Address();

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
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VECTOR__TYPE = eINSTANCE.getVector_Type();

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
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__TYPE = eINSTANCE.getArray_Type();

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
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ValueStructImpl <em>Value Struct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ValueStructImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getValueStruct()
		 * @generated
		 */
		EClass VALUE_STRUCT = eINSTANCE.getValueStruct();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_STRUCT__TYPES = eINSTANCE.getValueStruct_Types();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALUE_STRUCT__VALUE = eINSTANCE.getValueStruct_Value();

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
		 * The meta object literal for the '<em><b>Meta</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_BODY__META = eINSTANCE.getFunctionBody_Meta();

		/**
		 * The meta object literal for the '<em><b>Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_BODY__BLOCKS = eINSTANCE.getFunctionBody_Blocks();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.InstructionImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

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
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__INSTRUCTIONS = eINSTANCE.getBasicBlock_Instructions();

		/**
		 * The meta object literal for the '<em><b>Retadr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_BLOCK__RETADR = eINSTANCE.getBasicBlock_Retadr();

		/**
		 * The meta object literal for the '<em><b>Terminator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__TERMINATOR = eINSTANCE.getBasicBlock_Terminator();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.InstructionUseImpl <em>Instruction Use</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.InstructionUseImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInstructionUse()
		 * @generated
		 */
		EClass INSTRUCTION_USE = eINSTANCE.getInstructionUse();

		/**
		 * The meta object literal for the '<em><b>Reg or var</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTRUCTION_USE__REG_OR_VAR = eINSTANCE.getInstructionUse_Reg_or_var();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION_USE__INSTRUCTION = eINSTANCE.getInstructionUse_Instruction();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.Ret_InstrImpl <em>Ret Instr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.Ret_InstrImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getRet_Instr()
		 * @generated
		 */
		EClass RET_INSTR = eINSTANCE.getRet_Instr();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.Std_InstrImpl <em>Std Instr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.Std_InstrImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getStd_Instr()
		 * @generated
		 */
		EClass STD_INSTR = eINSTANCE.getStd_Instr();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl <em>ARITHMETIC OP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getARITHMETIC_OP()
		 * @generated
		 */
		EClass ARITHMETIC_OP = eINSTANCE.getARITHMETIC_OP();

		/**
		 * The meta object literal for the '<em><b>Optype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_OP__OPTYPE = eINSTANCE.getARITHMETIC_OP_Optype();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_OP__VALUE1 = eINSTANCE.getARITHMETIC_OP_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARITHMETIC_OP__VALUE2 = eINSTANCE.getARITHMETIC_OP_Value2();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.LOGICAL_OPImpl <em>LOGICAL OP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.LOGICAL_OPImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLOGICAL_OP()
		 * @generated
		 */
		EClass LOGICAL_OP = eINSTANCE.getLOGICAL_OP();

		/**
		 * The meta object literal for the '<em><b>Optype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OP__OPTYPE = eINSTANCE.getLOGICAL_OP_Optype();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OP__VALUE1 = eINSTANCE.getLOGICAL_OP_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOGICAL_OP__VALUE2 = eINSTANCE.getLOGICAL_OP_Value2();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.CastImpl <em>Cast</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.CastImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCast()
		 * @generated
		 */
		EClass CAST = eINSTANCE.getCast();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__FROM = eINSTANCE.getCast_From();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__VALUE = eINSTANCE.getCast_Value();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__TO = eINSTANCE.getCast_To();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl <em>Get Element Ptr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.GetElementPtrImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGetElementPtr()
		 * @generated
		 */
		EClass GET_ELEMENT_PTR = eINSTANCE.getGetElementPtr();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_ELEMENT_PTR__AGGREGATE = eINSTANCE.getGetElementPtr_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Aggregatename</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_ELEMENT_PTR__AGGREGATENAME = eINSTANCE.getGetElementPtr_Aggregatename();

		/**
		 * The meta object literal for the '<em><b>Ind Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_ELEMENT_PTR__IND_TYPES = eINSTANCE.getGetElementPtr_IndTypes();

		/**
		 * The meta object literal for the '<em><b>Indizies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_ELEMENT_PTR__INDIZIES = eINSTANCE.getGetElementPtr_Indizies();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.GetElementPtr1Impl <em>Get Element Ptr1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.GetElementPtr1Impl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGetElementPtr1()
		 * @generated
		 */
		EClass GET_ELEMENT_PTR1 = eINSTANCE.getGetElementPtr1();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.GetElementPtr2Impl <em>Get Element Ptr2</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.GetElementPtr2Impl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGetElementPtr2()
		 * @generated
		 */
		EClass GET_ELEMENT_PTR2 = eINSTANCE.getGetElementPtr2();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ExtractValueImpl <em>Extract Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ExtractValueImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractValue()
		 * @generated
		 */
		EClass EXTRACT_VALUE = eINSTANCE.getExtractValue();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_VALUE__ARRAY = eINSTANCE.getExtractValue_Array();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_VALUE__STRUCT = eINSTANCE.getExtractValue_Struct();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_VALUE__VALUE = eINSTANCE.getExtractValue_Value();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_VALUE__INDEX = eINSTANCE.getExtractValue_Index();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl <em>Insert Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.InsertValueImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInsertValue()
		 * @generated
		 */
		EClass INSERT_VALUE = eINSTANCE.getInsertValue();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_VALUE__STRUCT = eINSTANCE.getInsertValue_Struct();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_VALUE__VALUE = eINSTANCE.getInsertValue_Value();

		/**
		 * The meta object literal for the '<em><b>Inserttype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_VALUE__INSERTTYPE = eINSTANCE.getInsertValue_Inserttype();

		/**
		 * The meta object literal for the '<em><b>Insertvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_VALUE__INSERTVALUE = eINSTANCE.getInsertValue_Insertvalue();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_VALUE__INDEX = eINSTANCE.getInsertValue_Index();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.FenceImpl <em>Fence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.FenceImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFence()
		 * @generated
		 */
		EClass FENCE = eINSTANCE.getFence();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FENCE__ORDERING = eINSTANCE.getFence_Ordering();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.CmpXchgImpl <em>Cmp Xchg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.CmpXchgImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCmpXchg()
		 * @generated
		 */
		EClass CMP_XCHG = eINSTANCE.getCmpXchg();

		/**
		 * The meta object literal for the '<em><b>Adresstype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_XCHG__ADRESSTYPE = eINSTANCE.getCmpXchg_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_XCHG__ADRESS = eINSTANCE.getCmpXchg_Adress();

		/**
		 * The meta object literal for the '<em><b>Comparetype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_XCHG__COMPARETYPE = eINSTANCE.getCmpXchg_Comparetype();

		/**
		 * The meta object literal for the '<em><b>Comparevalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_XCHG__COMPAREVALUE = eINSTANCE.getCmpXchg_Comparevalue();

		/**
		 * The meta object literal for the '<em><b>Newtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_XCHG__NEWTYPE = eINSTANCE.getCmpXchg_Newtype();

		/**
		 * The meta object literal for the '<em><b>Newvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_XCHG__NEWVALUE = eINSTANCE.getCmpXchg_Newvalue();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_XCHG__ORDERING = eINSTANCE.getCmpXchg_Ordering();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl <em>Atomic RMW</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.AtomicRMWImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAtomicRMW()
		 * @generated
		 */
		EClass ATOMIC_RMW = eINSTANCE.getAtomicRMW();

		/**
		 * The meta object literal for the '<em><b>Adresstype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RMW__ADRESSTYPE = eINSTANCE.getAtomicRMW_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RMW__ADRESS = eINSTANCE.getAtomicRMW_Adress();

		/**
		 * The meta object literal for the '<em><b>Optype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RMW__OPTYPE = eINSTANCE.getAtomicRMW_Optype();

		/**
		 * The meta object literal for the '<em><b>Opvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RMW__OPVALUE = eINSTANCE.getAtomicRMW_Opvalue();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_RMW__ORDERING = eINSTANCE.getAtomicRMW_Ordering();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.LoadImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '<em><b>Adresstype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD__ADRESSTYPE = eINSTANCE.getLoad_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD__TYPES = eINSTANCE.getLoad_Types();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD__ADRESS = eINSTANCE.getLoad_Adress();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__ORDERING = eINSTANCE.getLoad_Ordering();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__INDEX = eINSTANCE.getLoad_Index();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.StoreImpl <em>Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.StoreImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getStore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getStore();

		/**
		 * The meta object literal for the '<em><b>Newtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__NEWTYPE = eINSTANCE.getStore_Newtype();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__TYPES = eINSTANCE.getStore_Types();

		/**
		 * The meta object literal for the '<em><b>Newvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__NEWVALUE = eINSTANCE.getStore_Newvalue();

		/**
		 * The meta object literal for the '<em><b>Adresstype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__ADRESSTYPE = eINSTANCE.getStore_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__ADRESS = eINSTANCE.getStore_Adress();

		/**
		 * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__ORDERING = eINSTANCE.getStore_Ordering();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__INDEX = eINSTANCE.getStore_Index();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.CallImpl <em>Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.CallImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCall()
		 * @generated
		 */
		EClass CALL = eINSTANCE.getCall();

		/**
		 * The meta object literal for the '<em><b>Adresstype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__ADRESSTYPE = eINSTANCE.getCall_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__ADRESS = eINSTANCE.getCall_Adress();

		/**
		 * The meta object literal for the '<em><b>PList</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__PLIST = eINSTANCE.getCall_PList();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.AllocImpl <em>Alloc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.AllocImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAlloc()
		 * @generated
		 */
		EClass ALLOC = eINSTANCE.getAlloc();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOC__TYPE = eINSTANCE.getAlloc_Type();

		/**
		 * The meta object literal for the '<em><b>Typelist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOC__TYPELIST = eINSTANCE.getAlloc_Typelist();

		/**
		 * The meta object literal for the '<em><b>Numelementstype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOC__NUMELEMENTSTYPE = eINSTANCE.getAlloc_Numelementstype();

		/**
		 * The meta object literal for the '<em><b>Numelementsvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOC__NUMELEMENTSVALUE = eINSTANCE.getAlloc_Numelementsvalue();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.PHIImpl <em>PHI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.PHIImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPHI()
		 * @generated
		 */
		EClass PHI = eINSTANCE.getPHI();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHI__TYPE = eINSTANCE.getPHI_Type();

		/**
		 * The meta object literal for the '<em><b>Firstclass</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHI__FIRSTCLASS = eINSTANCE.getPHI_Firstclass();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHI__VALUES = eINSTANCE.getPHI_Values();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl <em>Landing Pad</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.LandingPadImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLandingPad()
		 * @generated
		 */
		EClass LANDING_PAD = eINSTANCE.getLandingPad();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAD__STRUCT = eINSTANCE.getLandingPad_Struct();

		/**
		 * The meta object literal for the '<em><b>Personalitytype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAD__PERSONALITYTYPE = eINSTANCE.getLandingPad_Personalitytype();

		/**
		 * The meta object literal for the '<em><b>Personalityvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAD__PERSONALITYVALUE = eINSTANCE.getLandingPad_Personalityvalue();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAD__CLAUSE = eINSTANCE.getLandingPad_Clause();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ClauseImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__TYPE = eINSTANCE.getClause_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__VALUE = eINSTANCE.getClause_Value();

		/**
		 * The meta object literal for the '<em><b>Filterarray</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__FILTERARRAY = eINSTANCE.getClause_Filterarray();

		/**
		 * The meta object literal for the '<em><b>Constant</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__CONSTANT = eINSTANCE.getClause_Constant();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.SelectImpl <em>Select</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.SelectImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSelect()
		 * @generated
		 */
		EClass SELECT = eINSTANCE.getSelect();

		/**
		 * The meta object literal for the '<em><b>Conditiontype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__CONDITIONTYPE = eINSTANCE.getSelect_Conditiontype();

		/**
		 * The meta object literal for the '<em><b>Conditionvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__CONDITIONVALUE = eINSTANCE.getSelect_Conditionvalue();

		/**
		 * The meta object literal for the '<em><b>Val1type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__VAL1TYPE = eINSTANCE.getSelect_Val1type();

		/**
		 * The meta object literal for the '<em><b>Val1value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__VAL1VALUE = eINSTANCE.getSelect_Val1value();

		/**
		 * The meta object literal for the '<em><b>Val2type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__VAL2TYPE = eINSTANCE.getSelect_Val2type();

		/**
		 * The meta object literal for the '<em><b>Val2value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__VAL2VALUE = eINSTANCE.getSelect_Val2value();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl <em>VA Arg</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.VA_ArgImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getVA_Arg()
		 * @generated
		 */
		EClass VA_ARG = eINSTANCE.getVA_Arg();

		/**
		 * The meta object literal for the '<em><b>Listtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VA_ARG__LISTTYPE = eINSTANCE.getVA_Arg_Listtype();

		/**
		 * The meta object literal for the '<em><b>Listvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VA_ARG__LISTVALUE = eINSTANCE.getVA_Arg_Listvalue();

		/**
		 * The meta object literal for the '<em><b>Arg Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VA_ARG__ARG_TYPE = eINSTANCE.getVA_Arg_ArgType();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ExtractElementImpl <em>Extract Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ExtractElementImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractElement()
		 * @generated
		 */
		EClass EXTRACT_ELEMENT = eINSTANCE.getExtractElement();

		/**
		 * The meta object literal for the '<em><b>Vectortype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_ELEMENT__VECTORTYPE = eINSTANCE.getExtractElement_Vectortype();

		/**
		 * The meta object literal for the '<em><b>Vectorvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_ELEMENT__VECTORVALUE = eINSTANCE.getExtractElement_Vectorvalue();

		/**
		 * The meta object literal for the '<em><b>Indextype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_ELEMENT__INDEXTYPE = eINSTANCE.getExtractElement_Indextype();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_ELEMENT__INDEX = eINSTANCE.getExtractElement_Index();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl <em>Insert Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.InsertElementImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInsertElement()
		 * @generated
		 */
		EClass INSERT_ELEMENT = eINSTANCE.getInsertElement();

		/**
		 * The meta object literal for the '<em><b>Vectortype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_ELEMENT__VECTORTYPE = eINSTANCE.getInsertElement_Vectortype();

		/**
		 * The meta object literal for the '<em><b>Vectorvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_ELEMENT__VECTORVALUE = eINSTANCE.getInsertElement_Vectorvalue();

		/**
		 * The meta object literal for the '<em><b>Scalartype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_ELEMENT__SCALARTYPE = eINSTANCE.getInsertElement_Scalartype();

		/**
		 * The meta object literal for the '<em><b>Scalarvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_ELEMENT__SCALARVALUE = eINSTANCE.getInsertElement_Scalarvalue();

		/**
		 * The meta object literal for the '<em><b>Indextype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_ELEMENT__INDEXTYPE = eINSTANCE.getInsertElement_Indextype();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_ELEMENT__INDEX = eINSTANCE.getInsertElement_Index();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl <em>Shuffle Vector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getShuffleVector()
		 * @generated
		 */
		EClass SHUFFLE_VECTOR = eINSTANCE.getShuffleVector();

		/**
		 * The meta object literal for the '<em><b>Val1type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUFFLE_VECTOR__VAL1TYPE = eINSTANCE.getShuffleVector_Val1type();

		/**
		 * The meta object literal for the '<em><b>Val1value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUFFLE_VECTOR__VAL1VALUE = eINSTANCE.getShuffleVector_Val1value();

		/**
		 * The meta object literal for the '<em><b>Val2type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUFFLE_VECTOR__VAL2TYPE = eINSTANCE.getShuffleVector_Val2type();

		/**
		 * The meta object literal for the '<em><b>Val2value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUFFLE_VECTOR__VAL2VALUE = eINSTANCE.getShuffleVector_Val2value();

		/**
		 * The meta object literal for the '<em><b>Masktype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUFFLE_VECTOR__MASKTYPE = eINSTANCE.getShuffleVector_Masktype();

		/**
		 * The meta object literal for the '<em><b>Maskvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUFFLE_VECTOR__MASKVALUE = eINSTANCE.getShuffleVector_Maskvalue();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.CompareImpl <em>Compare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.CompareImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCompare()
		 * @generated
		 */
		EClass COMPARE = eINSTANCE.getCompare();

		/**
		 * The meta object literal for the '<em><b>Comptype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE__COMPTYPE = eINSTANCE.getCompare_Comptype();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE__VALUE1 = eINSTANCE.getCompare_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARE__VALUE2 = eINSTANCE.getCompare_Value2();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl <em>Indirect Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.IndirectBranchImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getIndirectBranch()
		 * @generated
		 */
		EClass INDIRECT_BRANCH = eINSTANCE.getIndirectBranch();

		/**
		 * The meta object literal for the '<em><b>Adresstype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIRECT_BRANCH__ADRESSTYPE = eINSTANCE.getIndirectBranch_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIRECT_BRANCH__ADRESS = eINSTANCE.getIndirectBranch_Adress();

		/**
		 * The meta object literal for the '<em><b>Labeltype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIRECT_BRANCH__LABELTYPE = eINSTANCE.getIndirectBranch_Labeltype();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIRECT_BRANCH__LABELS = eINSTANCE.getIndirectBranch_Labels();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.SwitchImpl <em>Switch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.SwitchImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSwitch()
		 * @generated
		 */
		EClass SWITCH = eINSTANCE.getSwitch();

		/**
		 * The meta object literal for the '<em><b>Comptype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__COMPTYPE = eINSTANCE.getSwitch_Comptype();

		/**
		 * The meta object literal for the '<em><b>Compvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__COMPVALUE = eINSTANCE.getSwitch_Compvalue();

		/**
		 * The meta object literal for the '<em><b>Defaulttype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__DEFAULTTYPE = eINSTANCE.getSwitch_Defaulttype();

		/**
		 * The meta object literal for the '<em><b>Defaultvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__DEFAULTVALUE = eINSTANCE.getSwitch_Defaultvalue();

		/**
		 * The meta object literal for the '<em><b>Jtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__JTYPES = eINSTANCE.getSwitch_Jtypes();

		/**
		 * The meta object literal for the '<em><b>Jvalues</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__JVALUES = eINSTANCE.getSwitch_Jvalues();

		/**
		 * The meta object literal for the '<em><b>Destinationtypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__DESTINATIONTYPES = eINSTANCE.getSwitch_Destinationtypes();

		/**
		 * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__DESTINATIONS = eINSTANCE.getSwitch_Destinations();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.InvokeImpl <em>Invoke</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.InvokeImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInvoke()
		 * @generated
		 */
		EClass INVOKE = eINSTANCE.getInvoke();

		/**
		 * The meta object literal for the '<em><b>Functiontype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__FUNCTIONTYPE = eINSTANCE.getInvoke_Functiontype();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__NAME = eINSTANCE.getInvoke_Name();

		/**
		 * The meta object literal for the '<em><b>PList</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__PLIST = eINSTANCE.getInvoke_PList();

		/**
		 * The meta object literal for the '<em><b>Totype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__TOTYPE = eINSTANCE.getInvoke_Totype();

		/**
		 * The meta object literal for the '<em><b>Tovalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__TOVALUE = eINSTANCE.getInvoke_Tovalue();

		/**
		 * The meta object literal for the '<em><b>Unwindtype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__UNWINDTYPE = eINSTANCE.getInvoke_Unwindtype();

		/**
		 * The meta object literal for the '<em><b>Unwindvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__UNWINDVALUE = eINSTANCE.getInvoke_Unwindvalue();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ResumeImpl <em>Resume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ResumeImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getResume()
		 * @generated
		 */
		EClass RESUME = eINSTANCE.getResume();

		/**
		 * The meta object literal for the '<em><b>Resumestruct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__RESUMESTRUCT = eINSTANCE.getResume_Resumestruct();

		/**
		 * The meta object literal for the '<em><b>Resumevalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESUME__RESUMEVALUE = eINSTANCE.getResume_Resumevalue();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.UnreachableImpl <em>Unreachable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.UnreachableImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getUnreachable()
		 * @generated
		 */
		EClass UNREACHABLE = eINSTANCE.getUnreachable();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ReturnImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Returntype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__RETURNTYPE = eINSTANCE.getReturn_Returntype();

		/**
		 * The meta object literal for the '<em><b>Returnvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__RETURNVALUE = eINSTANCE.getReturn_Returnvalue();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.BranchImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__DESTINATION = eINSTANCE.getBranch_Destination();

		/**
		 * The meta object literal for the '<em><b>Condvalue</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__CONDVALUE = eINSTANCE.getBranch_Condvalue();

		/**
		 * The meta object literal for the '<em><b>Label Truetype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__LABEL_TRUETYPE = eINSTANCE.getBranch_LabelTruetype();

		/**
		 * The meta object literal for the '<em><b>Label True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__LABEL_TRUE = eINSTANCE.getBranch_LabelTrue();

		/**
		 * The meta object literal for the '<em><b>Label Falsetype</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__LABEL_FALSETYPE = eINSTANCE.getBranch_LabelFalsetype();

		/**
		 * The meta object literal for the '<em><b>Label False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__LABEL_FALSE = eINSTANCE.getBranch_LabelFalse();

	}

} //LlvmPackage
