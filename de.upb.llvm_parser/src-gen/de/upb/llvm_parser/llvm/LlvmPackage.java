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
public interface LlvmPackage extends EPackage
{
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
   * The number of structural features of the '<em>Main Level Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_LEVEL_ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_DEFINITION__ADDRESS = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_DEFINITION__VALUE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_DEFINITION__ALIGN = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

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
   * The feature id for the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__PARAMETER = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__ALIGN = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_DEFINITION__BODY = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 4;

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
   * The feature id for the '<em><b>Function Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_USE__FUNCTION_INPUT = 0;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_USE__POINTER = 1;

  /**
   * The number of structural features of the '<em>Type Use</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_USE_FEATURE_COUNT = 2;

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
   * The feature id for the '<em><b>Function Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADDRESS_USE__FUNCTION_INPUT = TYPE_USE__FUNCTION_INPUT;

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
   * The feature id for the '<em><b>Function Input</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PREDEFINED__FUNCTION_INPUT = TYPE_USE__FUNCTION_INPUT;

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
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.Aggregate_TypeImpl <em>Aggregate Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.Aggregate_TypeImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAggregate_Type()
   * @generated
   */
  int AGGREGATE_TYPE = 14;

  /**
   * The number of structural features of the '<em>Aggregate Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGGREGATE_TYPE_FEATURE_COUNT = 0;

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
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__LENGTH = AGGREGATE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR__TYPE = AGGREGATE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VECTOR_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 2;

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
   * The feature id for the '<em><b>Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__LENGTH = AGGREGATE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY__TYPE = AGGREGATE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 2;

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
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.PrimitiveValueImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPrimitiveValue()
   * @generated
   */
  int PRIMITIVE_VALUE = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_STRUCT__VALUES = VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Value Struct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VALUE_STRUCT_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

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
  int STRUCTURE__TYPES = AGGREGATE_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Structure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURE_FEATURE_COUNT = AGGREGATE_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.ParameterImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 20;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.ParameterListImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 21;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.FunctionParameterImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionParameter()
   * @generated
   */
  int FUNCTION_PARAMETER = 22;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER__TYPE = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Function Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionParameterListImpl <em>Function Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.FunctionParameterListImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionParameterList()
   * @generated
   */
  int FUNCTION_PARAMETER_LIST = 23;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_LIST__PARAMS = 0;

  /**
   * The number of structural features of the '<em>Function Parameter List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_PARAMETER_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionBodyImpl <em>Function Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.FunctionBodyImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionBody()
   * @generated
   */
  int FUNCTION_BODY = 24;

  /**
   * The feature id for the '<em><b>Meta</b></em>' containment reference list.
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
  int INSTRUCTION = 25;

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
  int BASIC_BLOCK = 26;

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
   * The number of structural features of the '<em>Basic Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_BLOCK_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.ArithmeticOperationImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getArithmeticOperation()
   * @generated
   */
  int ARITHMETIC_OPERATION = 27;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_OPERATION__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_OPERATION__OPERATION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Optype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_OPERATION__OPTYPE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_OPERATION__VALUE1 = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Value2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_OPERATION__VALUE2 = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Arithmetic Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_OPERATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LogicOperationImpl <em>Logic Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.LogicOperationImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLogicOperation()
   * @generated
   */
  int LOGIC_OPERATION = 28;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPERATION__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPERATION__OPERATION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Optype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPERATION__OPTYPE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPERATION__VALUE1 = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Value2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPERATION__VALUE2 = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Logic Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGIC_OPERATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CastImpl <em>Cast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.CastImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCast()
   * @generated
   */
  int CAST = 29;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__OPERATION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__FROM = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__VALUE = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST__TO = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Cast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.NestedCastImpl <em>Nested Cast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.NestedCastImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getNestedCast()
   * @generated
   */
  int NESTED_CAST = 30;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_CAST__OPERATION = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_CAST__FROM = VALUE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_CAST__VALUE = VALUE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_CAST__TO = VALUE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Nested Cast</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_CAST_FEATURE_COUNT = VALUE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.MetaArgValueImpl <em>Meta Arg Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.MetaArgValueImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getMetaArgValue()
   * @generated
   */
  int META_ARG_VALUE = 31;

  /**
   * The feature id for the '<em><b>Arg</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_ARG_VALUE__ARG = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_ARG_VALUE__VALUE = 1;

  /**
   * The number of structural features of the '<em>Meta Arg Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_ARG_VALUE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.MetaImpl <em>Meta</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.MetaImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getMeta()
   * @generated
   */
  int META = 32;

  /**
   * The feature id for the '<em><b>Meta</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META__META = 0;

  /**
   * The feature id for the '<em><b>Arg</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META__ARG = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META__VALUE = 2;

  /**
   * The number of structural features of the '<em>Meta</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int META_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.MetadataValueImpl <em>Metadata Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.MetadataValueImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getMetadataValue()
   * @generated
   */
  int METADATA_VALUE = 33;

  /**
   * The feature id for the '<em><b>Node Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_VALUE__NODE_ID = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_VALUE__VALUES = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Metadata Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METADATA_VALUE_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl <em>Get Element Ptr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.GetElementPtrImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGetElementPtr()
   * @generated
   */
  int GET_ELEMENT_PTR = 34;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ELEMENT_PTR__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ELEMENT_PTR__AGGREGATE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ELEMENT_PTR__INDICES = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Get Element Ptr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_ELEMENT_PTR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.NestedGetElementPtrImpl <em>Nested Get Element Ptr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.NestedGetElementPtrImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getNestedGetElementPtr()
   * @generated
   */
  int NESTED_GET_ELEMENT_PTR = 35;

  /**
   * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_GET_ELEMENT_PTR__AGGREGATE = VALUE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Indices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_GET_ELEMENT_PTR__INDICES = VALUE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Nested Get Element Ptr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_GET_ELEMENT_PTR_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

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
  int FENCE__ORDERING = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fence</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FENCE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

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
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_XCHG__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_XCHG__VOLATILE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_XCHG__ADDRESS = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_XCHG__VALUE = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>New Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_XCHG__NEW_VALUE = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_XCHG__ORDERING = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Cmp Xchg</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CMP_XCHG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 6;

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
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RMW__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RMW__VOLATILE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Operation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RMW__OPERATION = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RMW__ADDRESS = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RMW__ARGUMENT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RMW__ORDERING = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Atomic RMW</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_RMW_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 6;

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
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__VOLATILE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__ADDRESS = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__ALIGN = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Meta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__META = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__ATOMIC = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__ORDERING = INSTRUCTION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Load</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 7;

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
   * The feature id for the '<em><b>Volatile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__VOLATILE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Target Address</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__TARGET_ADDRESS = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__ALIGN = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Meta</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__META = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Atomic</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__ATOMIC = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE__ORDERING = INSTRUCTION_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Store</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STORE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 7;

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
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__FUNCTION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>PList</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__PLIST = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

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
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOC__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOC__TYPE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Num Of Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOC__NUM_OF_ELEMENTS = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOC__ALIGN = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Alloc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLOC_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.PhiCaseImpl <em>Phi Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.PhiCaseImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPhiCase()
   * @generated
   */
  int PHI_CASE = 43;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHI_CASE__VALUE = 0;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHI_CASE__LABEL = 1;

  /**
   * The number of structural features of the '<em>Phi Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHI_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.PhiImpl <em>Phi</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.PhiImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPhi()
   * @generated
   */
  int PHI = 44;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHI__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHI__TYPE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHI__CASES = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Phi</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PHI_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl <em>Landing Pad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.LandingPadImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLandingPad()
   * @generated
   */
  int LANDING_PAD = 45;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDING_PAD__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDING_PAD__STRUCT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Personalitytype</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDING_PAD__PERSONALITYTYPE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Personalityvalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDING_PAD__PERSONALITYVALUE = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Clause</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDING_PAD__CLAUSE = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Landing Pad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDING_PAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ClauseImpl <em>Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.ClauseImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getClause()
   * @generated
   */
  int CLAUSE = 46;

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
  int SELECT = 47;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__CONDITION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>True Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__TRUE_VALUE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Else Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__ELSE_VALUE = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl <em>Variable Attribute Access</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getVariableAttributeAccess()
   * @generated
   */
  int VARIABLE_ATTRIBUTE_ACCESS = 48;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE_ACCESS__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Va List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE_ACCESS__VA_LIST = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>AType</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE_ACCESS__ATYPE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable Attribute Access</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ATTRIBUTE_ACCESS_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ExtractValueImpl <em>Extract Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.ExtractValueImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractValue()
   * @generated
   */
  int EXTRACT_VALUE = 49;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_VALUE__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aggerate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_VALUE__AGGERATE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_VALUE__INDEX = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Extract Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_VALUE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl <em>Insert Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.InsertValueImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInsertValue()
   * @generated
   */
  int INSERT_VALUE = 50;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_VALUE__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Aggerate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_VALUE__AGGERATE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_VALUE__VALUE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_VALUE__INDEX = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Insert Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_VALUE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ExtractElementImpl <em>Extract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.ExtractElementImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractElement()
   * @generated
   */
  int EXTRACT_ELEMENT = 51;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_ELEMENT__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_ELEMENT__VECTOR = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_ELEMENT__INDEX = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Extract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_ELEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl <em>Insert Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.InsertElementImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInsertElement()
   * @generated
   */
  int INSERT_ELEMENT = 52;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_ELEMENT__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Vector</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_ELEMENT__VECTOR = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_ELEMENT__VALUE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_ELEMENT__INDEX = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Insert Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_ELEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl <em>Shuffle Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getShuffleVector()
   * @generated
   */
  int SHUFFLE_VECTOR = 53;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHUFFLE_VECTOR__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHUFFLE_VECTOR__VALUE1 = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHUFFLE_VECTOR__VALUE2 = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHUFFLE_VECTOR__MASK = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Shuffle Vector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHUFFLE_VECTOR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CompareImpl <em>Compare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.CompareImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCompare()
   * @generated
   */
  int COMPARE = 54;

  /**
   * The feature id for the '<em><b>Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE__RESULT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE__COND = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Op Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE__OP_TYPE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Operand1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE__OPERAND1 = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Operand2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE__OPERAND2 = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Compare</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl <em>Indirect Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.IndirectBranchImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getIndirectBranch()
   * @generated
   */
  int INDIRECT_BRANCH = 55;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_BRANCH__TARGET = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pot Target Labels</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_BRANCH__POT_TARGET_LABELS = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Indirect Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_BRANCH_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.SwitchImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 56;

  /**
   * The feature id for the '<em><b>Case Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__CASE_VALUE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default Case</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__DEFAULT_CASE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Cases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__CASES = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.SwitchCaseImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSwitchCase()
   * @generated
   */
  int SWITCH_CASE = 57;

  /**
   * The feature id for the '<em><b>Case Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__CASE_VALUE = 0;

  /**
   * The feature id for the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE__DESTINATION = 1;

  /**
   * The number of structural features of the '<em>Switch Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_CASE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InvokeImpl <em>Invoke</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.InvokeImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInvoke()
   * @generated
   */
  int INVOKE = 58;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__RETURN_TYPE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__NAME = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>PList</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__PLIST = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__TARGET_LABEL = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unwind Target Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__UNWIND_TARGET_LABEL = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Invoke</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ResumeImpl <em>Resume</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.ResumeImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getResume()
   * @generated
   */
  int RESUME = 59;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESUME__TYPE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESUME__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Resume</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESUME_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.UnreachableImpl <em>Unreachable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.UnreachableImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getUnreachable()
   * @generated
   */
  int UNREACHABLE = 60;

  /**
   * The number of structural features of the '<em>Unreachable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNREACHABLE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.ReturnImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 61;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Return</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.BranchImpl <em>Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.llvm.impl.BranchImpl
   * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getBranch()
   * @generated
   */
  int BRANCH = 62;

  /**
   * The feature id for the '<em><b>Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__DESTINATION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__CONDITION = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Destination</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__ELSE_DESTINATION = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;


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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.GlobalDefinition#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see de.upb.llvm_parser.llvm.GlobalDefinition#getAddress()
   * @see #getGlobalDefinition()
   * @generated
   */
  EReference getGlobalDefinition_Address();

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
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.GlobalDefinition#getAlign <em>Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Align</em>'.
   * @see de.upb.llvm_parser.llvm.GlobalDefinition#getAlign()
   * @see #getGlobalDefinition()
   * @generated
   */
  EAttribute getGlobalDefinition_Align();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameter</em>'.
   * @see de.upb.llvm_parser.llvm.FunctionDefinition#getParameter()
   * @see #getFunctionDefinition()
   * @generated
   */
  EReference getFunctionDefinition_Parameter();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.FunctionDefinition#getAlign <em>Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Align</em>'.
   * @see de.upb.llvm_parser.llvm.FunctionDefinition#getAlign()
   * @see #getFunctionDefinition()
   * @generated
   */
  EAttribute getFunctionDefinition_Align();

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
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.TypeUse#getFunctionInput <em>Function Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Function Input</em>'.
   * @see de.upb.llvm_parser.llvm.TypeUse#getFunctionInput()
   * @see #getTypeUse()
   * @generated
   */
  EAttribute getTypeUse_FunctionInput();

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
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Vector#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see de.upb.llvm_parser.llvm.Vector#getLength()
   * @see #getVector()
   * @generated
   */
  EAttribute getVector_Length();

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
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Array#getLength <em>Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Length</em>'.
   * @see de.upb.llvm_parser.llvm.Array#getLength()
   * @see #getArray()
   * @generated
   */
  EAttribute getArray_Length();

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
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Aggregate_Type <em>Aggregate Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aggregate Type</em>'.
   * @see de.upb.llvm_parser.llvm.Aggregate_Type
   * @generated
   */
  EClass getAggregate_Type();

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
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.PrimitiveValue <em>Primitive Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Value</em>'.
   * @see de.upb.llvm_parser.llvm.PrimitiveValue
   * @generated
   */
  EClass getPrimitiveValue();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.PrimitiveValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.PrimitiveValue#getValue()
   * @see #getPrimitiveValue()
   * @generated
   */
  EAttribute getPrimitiveValue_Value();

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
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.ValueStruct#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see de.upb.llvm_parser.llvm.ValueStruct#getValues()
   * @see #getValueStruct()
   * @generated
   */
  EReference getValueStruct_Values();

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
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see de.upb.llvm_parser.llvm.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.upb.llvm_parser.llvm.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Parameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.Parameter#getValue()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Value();

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
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.ParameterList#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.upb.llvm_parser.llvm.ParameterList#getParams()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Params();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.FunctionParameter <em>Function Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Parameter</em>'.
   * @see de.upb.llvm_parser.llvm.FunctionParameter
   * @generated
   */
  EClass getFunctionParameter();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionParameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.upb.llvm_parser.llvm.FunctionParameter#getType()
   * @see #getFunctionParameter()
   * @generated
   */
  EReference getFunctionParameter_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.FunctionParameter#getValue()
   * @see #getFunctionParameter()
   * @generated
   */
  EReference getFunctionParameter_Value();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.FunctionParameterList <em>Function Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Parameter List</em>'.
   * @see de.upb.llvm_parser.llvm.FunctionParameterList
   * @generated
   */
  EClass getFunctionParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.FunctionParameterList#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.upb.llvm_parser.llvm.FunctionParameterList#getParams()
   * @see #getFunctionParameterList()
   * @generated
   */
  EReference getFunctionParameterList_Params();

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
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.FunctionBody#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta</em>'.
   * @see de.upb.llvm_parser.llvm.FunctionBody#getMeta()
   * @see #getFunctionBody()
   * @generated
   */
  EReference getFunctionBody_Meta();

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
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ArithmeticOperation <em>Arithmetic Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arithmetic Operation</em>'.
   * @see de.upb.llvm_parser.llvm.ArithmeticOperation
   * @generated
   */
  EClass getArithmeticOperation();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ArithmeticOperation#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.ArithmeticOperation#getResult()
   * @see #getArithmeticOperation()
   * @generated
   */
  EReference getArithmeticOperation_Result();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ArithmeticOperation#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see de.upb.llvm_parser.llvm.ArithmeticOperation#getOperation()
   * @see #getArithmeticOperation()
   * @generated
   */
  EAttribute getArithmeticOperation_Operation();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ArithmeticOperation#getOptype <em>Optype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Optype</em>'.
   * @see de.upb.llvm_parser.llvm.ArithmeticOperation#getOptype()
   * @see #getArithmeticOperation()
   * @generated
   */
  EReference getArithmeticOperation_Optype();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ArithmeticOperation#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value1</em>'.
   * @see de.upb.llvm_parser.llvm.ArithmeticOperation#getValue1()
   * @see #getArithmeticOperation()
   * @generated
   */
  EReference getArithmeticOperation_Value1();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ArithmeticOperation#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value2</em>'.
   * @see de.upb.llvm_parser.llvm.ArithmeticOperation#getValue2()
   * @see #getArithmeticOperation()
   * @generated
   */
  EReference getArithmeticOperation_Value2();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.LogicOperation <em>Logic Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logic Operation</em>'.
   * @see de.upb.llvm_parser.llvm.LogicOperation
   * @generated
   */
  EClass getLogicOperation();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LogicOperation#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.LogicOperation#getResult()
   * @see #getLogicOperation()
   * @generated
   */
  EReference getLogicOperation_Result();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LogicOperation#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see de.upb.llvm_parser.llvm.LogicOperation#getOperation()
   * @see #getLogicOperation()
   * @generated
   */
  EAttribute getLogicOperation_Operation();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LogicOperation#getOptype <em>Optype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Optype</em>'.
   * @see de.upb.llvm_parser.llvm.LogicOperation#getOptype()
   * @see #getLogicOperation()
   * @generated
   */
  EReference getLogicOperation_Optype();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LogicOperation#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value1</em>'.
   * @see de.upb.llvm_parser.llvm.LogicOperation#getValue1()
   * @see #getLogicOperation()
   * @generated
   */
  EReference getLogicOperation_Value1();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LogicOperation#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value2</em>'.
   * @see de.upb.llvm_parser.llvm.LogicOperation#getValue2()
   * @see #getLogicOperation()
   * @generated
   */
  EReference getLogicOperation_Value2();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Cast#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.Cast#getResult()
   * @see #getCast()
   * @generated
   */
  EReference getCast_Result();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Cast#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see de.upb.llvm_parser.llvm.Cast#getOperation()
   * @see #getCast()
   * @generated
   */
  EAttribute getCast_Operation();

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
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.NestedCast <em>Nested Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Cast</em>'.
   * @see de.upb.llvm_parser.llvm.NestedCast
   * @generated
   */
  EClass getNestedCast();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.NestedCast#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see de.upb.llvm_parser.llvm.NestedCast#getOperation()
   * @see #getNestedCast()
   * @generated
   */
  EAttribute getNestedCast_Operation();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.NestedCast#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>From</em>'.
   * @see de.upb.llvm_parser.llvm.NestedCast#getFrom()
   * @see #getNestedCast()
   * @generated
   */
  EReference getNestedCast_From();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.NestedCast#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.NestedCast#getValue()
   * @see #getNestedCast()
   * @generated
   */
  EReference getNestedCast_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.NestedCast#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see de.upb.llvm_parser.llvm.NestedCast#getTo()
   * @see #getNestedCast()
   * @generated
   */
  EReference getNestedCast_To();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.MetaArgValue <em>Meta Arg Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta Arg Value</em>'.
   * @see de.upb.llvm_parser.llvm.MetaArgValue
   * @generated
   */
  EClass getMetaArgValue();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.MetaArgValue#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg</em>'.
   * @see de.upb.llvm_parser.llvm.MetaArgValue#getArg()
   * @see #getMetaArgValue()
   * @generated
   */
  EAttribute getMetaArgValue_Arg();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.MetaArgValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.MetaArgValue#getValue()
   * @see #getMetaArgValue()
   * @generated
   */
  EAttribute getMetaArgValue_Value();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Meta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Meta</em>'.
   * @see de.upb.llvm_parser.llvm.Meta
   * @generated
   */
  EClass getMeta();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Meta#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Meta</em>'.
   * @see de.upb.llvm_parser.llvm.Meta#getMeta()
   * @see #getMeta()
   * @generated
   */
  EAttribute getMeta_Meta();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Meta#getArg <em>Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Arg</em>'.
   * @see de.upb.llvm_parser.llvm.Meta#getArg()
   * @see #getMeta()
   * @generated
   */
  EReference getMeta_Arg();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Meta#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.Meta#getValue()
   * @see #getMeta()
   * @generated
   */
  EReference getMeta_Value();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.MetadataValue <em>Metadata Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metadata Value</em>'.
   * @see de.upb.llvm_parser.llvm.MetadataValue
   * @generated
   */
  EClass getMetadataValue();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.MetadataValue#getNodeId <em>Node Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Node Id</em>'.
   * @see de.upb.llvm_parser.llvm.MetadataValue#getNodeId()
   * @see #getMetadataValue()
   * @generated
   */
  EAttribute getMetadataValue_NodeId();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.MetadataValue#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see de.upb.llvm_parser.llvm.MetadataValue#getValues()
   * @see #getMetadataValue()
   * @generated
   */
  EReference getMetadataValue_Values();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.GetElementPtr#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.GetElementPtr#getResult()
   * @see #getGetElementPtr()
   * @generated
   */
  EReference getGetElementPtr_Result();

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
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.GetElementPtr#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see de.upb.llvm_parser.llvm.GetElementPtr#getIndices()
   * @see #getGetElementPtr()
   * @generated
   */
  EReference getGetElementPtr_Indices();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.NestedGetElementPtr <em>Nested Get Element Ptr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Get Element Ptr</em>'.
   * @see de.upb.llvm_parser.llvm.NestedGetElementPtr
   * @generated
   */
  EClass getNestedGetElementPtr();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.NestedGetElementPtr#getAggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aggregate</em>'.
   * @see de.upb.llvm_parser.llvm.NestedGetElementPtr#getAggregate()
   * @see #getNestedGetElementPtr()
   * @generated
   */
  EReference getNestedGetElementPtr_Aggregate();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.NestedGetElementPtr#getIndices <em>Indices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Indices</em>'.
   * @see de.upb.llvm_parser.llvm.NestedGetElementPtr#getIndices()
   * @see #getNestedGetElementPtr()
   * @generated
   */
  EReference getNestedGetElementPtr_Indices();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.CmpXchg#getResult()
   * @see #getCmpXchg()
   * @generated
   */
  EReference getCmpXchg_Result();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.CmpXchg#isVolatile <em>Volatile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Volatile</em>'.
   * @see de.upb.llvm_parser.llvm.CmpXchg#isVolatile()
   * @see #getCmpXchg()
   * @generated
   */
  EAttribute getCmpXchg_Volatile();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see de.upb.llvm_parser.llvm.CmpXchg#getAddress()
   * @see #getCmpXchg()
   * @generated
   */
  EReference getCmpXchg_Address();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.CmpXchg#getValue()
   * @see #getCmpXchg()
   * @generated
   */
  EReference getCmpXchg_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewValue <em>New Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New Value</em>'.
   * @see de.upb.llvm_parser.llvm.CmpXchg#getNewValue()
   * @see #getCmpXchg()
   * @generated
   */
  EReference getCmpXchg_NewValue();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AtomicRMW#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.AtomicRMW#getResult()
   * @see #getAtomicRMW()
   * @generated
   */
  EReference getAtomicRMW_Result();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.AtomicRMW#isVolatile <em>Volatile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Volatile</em>'.
   * @see de.upb.llvm_parser.llvm.AtomicRMW#isVolatile()
   * @see #getAtomicRMW()
   * @generated
   */
  EAttribute getAtomicRMW_Volatile();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOperation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Operation</em>'.
   * @see de.upb.llvm_parser.llvm.AtomicRMW#getOperation()
   * @see #getAtomicRMW()
   * @generated
   */
  EAttribute getAtomicRMW_Operation();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see de.upb.llvm_parser.llvm.AtomicRMW#getAddress()
   * @see #getAtomicRMW()
   * @generated
   */
  EReference getAtomicRMW_Address();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AtomicRMW#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see de.upb.llvm_parser.llvm.AtomicRMW#getArgument()
   * @see #getAtomicRMW()
   * @generated
   */
  EReference getAtomicRMW_Argument();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Load#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.Load#getResult()
   * @see #getLoad()
   * @generated
   */
  EReference getLoad_Result();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Load#isVolatile <em>Volatile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Volatile</em>'.
   * @see de.upb.llvm_parser.llvm.Load#isVolatile()
   * @see #getLoad()
   * @generated
   */
  EAttribute getLoad_Volatile();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Load#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Address</em>'.
   * @see de.upb.llvm_parser.llvm.Load#getAddress()
   * @see #getLoad()
   * @generated
   */
  EReference getLoad_Address();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Load#getAlign <em>Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Align</em>'.
   * @see de.upb.llvm_parser.llvm.Load#getAlign()
   * @see #getLoad()
   * @generated
   */
  EAttribute getLoad_Align();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Load#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta</em>'.
   * @see de.upb.llvm_parser.llvm.Load#getMeta()
   * @see #getLoad()
   * @generated
   */
  EReference getLoad_Meta();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Load#isAtomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atomic</em>'.
   * @see de.upb.llvm_parser.llvm.Load#isAtomic()
   * @see #getLoad()
   * @generated
   */
  EAttribute getLoad_Atomic();

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
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Store</em>'.
   * @see de.upb.llvm_parser.llvm.Store
   * @generated
   */
  EClass getStore();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Store#isVolatile <em>Volatile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Volatile</em>'.
   * @see de.upb.llvm_parser.llvm.Store#isVolatile()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Volatile();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Store#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.Store#getValue()
   * @see #getStore()
   * @generated
   */
  EReference getStore_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Store#getTargetAddress <em>Target Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target Address</em>'.
   * @see de.upb.llvm_parser.llvm.Store#getTargetAddress()
   * @see #getStore()
   * @generated
   */
  EReference getStore_TargetAddress();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Store#getAlign <em>Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Align</em>'.
   * @see de.upb.llvm_parser.llvm.Store#getAlign()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Align();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Store#getMeta <em>Meta</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Meta</em>'.
   * @see de.upb.llvm_parser.llvm.Store#getMeta()
   * @see #getStore()
   * @generated
   */
  EReference getStore_Meta();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Store#isAtomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Atomic</em>'.
   * @see de.upb.llvm_parser.llvm.Store#isAtomic()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Atomic();

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
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see de.upb.llvm_parser.llvm.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Call#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.Call#getResult()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Result();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Call#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see de.upb.llvm_parser.llvm.Call#getFunction()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Function();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Alloc#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.Alloc#getResult()
   * @see #getAlloc()
   * @generated
   */
  EReference getAlloc_Result();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Alloc#getNumOfElements <em>Num Of Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Of Elements</em>'.
   * @see de.upb.llvm_parser.llvm.Alloc#getNumOfElements()
   * @see #getAlloc()
   * @generated
   */
  EReference getAlloc_NumOfElements();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Alloc#getAlign <em>Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Align</em>'.
   * @see de.upb.llvm_parser.llvm.Alloc#getAlign()
   * @see #getAlloc()
   * @generated
   */
  EAttribute getAlloc_Align();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.PhiCase <em>Phi Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phi Case</em>'.
   * @see de.upb.llvm_parser.llvm.PhiCase
   * @generated
   */
  EClass getPhiCase();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.PhiCase#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.PhiCase#getValue()
   * @see #getPhiCase()
   * @generated
   */
  EReference getPhiCase_Value();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.PhiCase#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see de.upb.llvm_parser.llvm.PhiCase#getLabel()
   * @see #getPhiCase()
   * @generated
   */
  EAttribute getPhiCase_Label();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Phi <em>Phi</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Phi</em>'.
   * @see de.upb.llvm_parser.llvm.Phi
   * @generated
   */
  EClass getPhi();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Phi#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.Phi#getResult()
   * @see #getPhi()
   * @generated
   */
  EReference getPhi_Result();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Phi#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.upb.llvm_parser.llvm.Phi#getType()
   * @see #getPhi()
   * @generated
   */
  EReference getPhi_Type();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Phi#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.upb.llvm_parser.llvm.Phi#getCases()
   * @see #getPhi()
   * @generated
   */
  EReference getPhi_Cases();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LandingPad#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.LandingPad#getResult()
   * @see #getLandingPad()
   * @generated
   */
  EReference getLandingPad_Result();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.Select#getResult()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Result();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.upb.llvm_parser.llvm.Select#getCondition()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Condition();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getTrueValue <em>True Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>True Value</em>'.
   * @see de.upb.llvm_parser.llvm.Select#getTrueValue()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_TrueValue();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getElseValue <em>Else Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Value</em>'.
   * @see de.upb.llvm_parser.llvm.Select#getElseValue()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_ElseValue();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess <em>Variable Attribute Access</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Attribute Access</em>'.
   * @see de.upb.llvm_parser.llvm.VariableAttributeAccess
   * @generated
   */
  EClass getVariableAttributeAccess();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.VariableAttributeAccess#getResult()
   * @see #getVariableAttributeAccess()
   * @generated
   */
  EReference getVariableAttributeAccess_Result();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getVaList <em>Va List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Va List</em>'.
   * @see de.upb.llvm_parser.llvm.VariableAttributeAccess#getVaList()
   * @see #getVariableAttributeAccess()
   * @generated
   */
  EReference getVariableAttributeAccess_VaList();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.VariableAttributeAccess#getAType <em>AType</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>AType</em>'.
   * @see de.upb.llvm_parser.llvm.VariableAttributeAccess#getAType()
   * @see #getVariableAttributeAccess()
   * @generated
   */
  EReference getVariableAttributeAccess_AType();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractValue#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.ExtractValue#getResult()
   * @see #getExtractValue()
   * @generated
   */
  EReference getExtractValue_Result();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractValue#getAggerate <em>Aggerate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aggerate</em>'.
   * @see de.upb.llvm_parser.llvm.ExtractValue#getAggerate()
   * @see #getExtractValue()
   * @generated
   */
  EReference getExtractValue_Aggerate();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertValue#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.InsertValue#getResult()
   * @see #getInsertValue()
   * @generated
   */
  EReference getInsertValue_Result();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertValue#getAggerate <em>Aggerate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aggerate</em>'.
   * @see de.upb.llvm_parser.llvm.InsertValue#getAggerate()
   * @see #getInsertValue()
   * @generated
   */
  EReference getInsertValue_Aggerate();

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
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ExtractElement <em>Extract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extract Element</em>'.
   * @see de.upb.llvm_parser.llvm.ExtractElement
   * @generated
   */
  EClass getExtractElement();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractElement#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.ExtractElement#getResult()
   * @see #getExtractElement()
   * @generated
   */
  EReference getExtractElement_Result();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractElement#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector</em>'.
   * @see de.upb.llvm_parser.llvm.ExtractElement#getVector()
   * @see #getExtractElement()
   * @generated
   */
  EReference getExtractElement_Vector();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.InsertElement#getResult()
   * @see #getInsertElement()
   * @generated
   */
  EReference getInsertElement_Result();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector</em>'.
   * @see de.upb.llvm_parser.llvm.InsertElement#getVector()
   * @see #getInsertElement()
   * @generated
   */
  EReference getInsertElement_Vector();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.InsertElement#getValue()
   * @see #getInsertElement()
   * @generated
   */
  EReference getInsertElement_Value();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.ShuffleVector#getResult()
   * @see #getShuffleVector()
   * @generated
   */
  EReference getShuffleVector_Result();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value1</em>'.
   * @see de.upb.llvm_parser.llvm.ShuffleVector#getValue1()
   * @see #getShuffleVector()
   * @generated
   */
  EReference getShuffleVector_Value1();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value2</em>'.
   * @see de.upb.llvm_parser.llvm.ShuffleVector#getValue2()
   * @see #getShuffleVector()
   * @generated
   */
  EReference getShuffleVector_Value2();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMask <em>Mask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mask</em>'.
   * @see de.upb.llvm_parser.llvm.ShuffleVector#getMask()
   * @see #getShuffleVector()
   * @generated
   */
  EReference getShuffleVector_Mask();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Compare#getResult <em>Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Result</em>'.
   * @see de.upb.llvm_parser.llvm.Compare#getResult()
   * @see #getCompare()
   * @generated
   */
  EReference getCompare_Result();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Compare#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cond</em>'.
   * @see de.upb.llvm_parser.llvm.Compare#getCond()
   * @see #getCompare()
   * @generated
   */
  EAttribute getCompare_Cond();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Compare#getOpType <em>Op Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Op Type</em>'.
   * @see de.upb.llvm_parser.llvm.Compare#getOpType()
   * @see #getCompare()
   * @generated
   */
  EReference getCompare_OpType();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Compare#getOperand1 <em>Operand1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand1</em>'.
   * @see de.upb.llvm_parser.llvm.Compare#getOperand1()
   * @see #getCompare()
   * @generated
   */
  EReference getCompare_Operand1();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Compare#getOperand2 <em>Operand2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand2</em>'.
   * @see de.upb.llvm_parser.llvm.Compare#getOperand2()
   * @see #getCompare()
   * @generated
   */
  EReference getCompare_Operand2();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.IndirectBranch#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see de.upb.llvm_parser.llvm.IndirectBranch#getTarget()
   * @see #getIndirectBranch()
   * @generated
   */
  EReference getIndirectBranch_Target();

  /**
   * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.IndirectBranch#getPotTargetLabels <em>Pot Target Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Pot Target Labels</em>'.
   * @see de.upb.llvm_parser.llvm.IndirectBranch#getPotTargetLabels()
   * @see #getIndirectBranch()
   * @generated
   */
  EAttribute getIndirectBranch_PotTargetLabels();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Switch#getCaseValue <em>Case Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Value</em>'.
   * @see de.upb.llvm_parser.llvm.Switch#getCaseValue()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_CaseValue();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Switch#getDefaultCase <em>Default Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default Case</em>'.
   * @see de.upb.llvm_parser.llvm.Switch#getDefaultCase()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_DefaultCase();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Switch#getCases <em>Cases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cases</em>'.
   * @see de.upb.llvm_parser.llvm.Switch#getCases()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Cases();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.SwitchCase <em>Switch Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch Case</em>'.
   * @see de.upb.llvm_parser.llvm.SwitchCase
   * @generated
   */
  EClass getSwitchCase();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.SwitchCase#getCaseValue <em>Case Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Case Value</em>'.
   * @see de.upb.llvm_parser.llvm.SwitchCase#getCaseValue()
   * @see #getSwitchCase()
   * @generated
   */
  EReference getSwitchCase_CaseValue();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.SwitchCase#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see de.upb.llvm_parser.llvm.SwitchCase#getDestination()
   * @see #getSwitchCase()
   * @generated
   */
  EAttribute getSwitchCase_Destination();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see de.upb.llvm_parser.llvm.Invoke#getReturnType()
   * @see #getInvoke()
   * @generated
   */
  EReference getInvoke_ReturnType();

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
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Invoke#getTargetLabel <em>Target Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target Label</em>'.
   * @see de.upb.llvm_parser.llvm.Invoke#getTargetLabel()
   * @see #getInvoke()
   * @generated
   */
  EAttribute getInvoke_TargetLabel();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindTargetLabel <em>Unwind Target Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unwind Target Label</em>'.
   * @see de.upb.llvm_parser.llvm.Invoke#getUnwindTargetLabel()
   * @see #getInvoke()
   * @generated
   */
  EAttribute getInvoke_UnwindTargetLabel();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Resume#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see de.upb.llvm_parser.llvm.Resume#getType()
   * @see #getResume()
   * @generated
   */
  EReference getResume_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Resume#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.Resume#getValue()
   * @see #getResume()
   * @generated
   */
  EReference getResume_Value();

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
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Return#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.llvm.Return#getValue()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_Value();

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
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Branch#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Destination</em>'.
   * @see de.upb.llvm_parser.llvm.Branch#getDestination()
   * @see #getBranch()
   * @generated
   */
  EAttribute getBranch_Destination();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Branch#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.upb.llvm_parser.llvm.Branch#getCondition()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Condition();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Branch#getElseDestination <em>Else Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Else Destination</em>'.
   * @see de.upb.llvm_parser.llvm.Branch#getElseDestination()
   * @see #getBranch()
   * @generated
   */
  EAttribute getBranch_ElseDestination();

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
  interface Literals
  {
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
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_DEFINITION__ADDRESS = eINSTANCE.getGlobalDefinition_Address();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GLOBAL_DEFINITION__VALUE = eINSTANCE.getGlobalDefinition_Value();

    /**
     * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_DEFINITION__ALIGN = eINSTANCE.getGlobalDefinition_Align();

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
     * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__PARAMETER = eINSTANCE.getFunctionDefinition_Parameter();

    /**
     * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION_DEFINITION__ALIGN = eINSTANCE.getFunctionDefinition_Align();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_DEFINITION__BODY = eINSTANCE.getFunctionDefinition_Body();

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
     * The meta object literal for the '<em><b>Function Input</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_USE__FUNCTION_INPUT = eINSTANCE.getTypeUse_FunctionInput();

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
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VECTOR__LENGTH = eINSTANCE.getVector_Length();

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
     * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARRAY__LENGTH = eINSTANCE.getArray_Length();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY__TYPE = eINSTANCE.getArray_Type();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.Aggregate_TypeImpl <em>Aggregate Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.Aggregate_TypeImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAggregate_Type()
     * @generated
     */
    EClass AGGREGATE_TYPE = eINSTANCE.getAggregate_Type();

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
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.PrimitiveValueImpl <em>Primitive Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.PrimitiveValueImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPrimitiveValue()
     * @generated
     */
    EClass PRIMITIVE_VALUE = eINSTANCE.getPrimitiveValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_VALUE__VALUE = eINSTANCE.getPrimitiveValue_Value();

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
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VALUE_STRUCT__VALUES = eINSTANCE.getValueStruct_Values();

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
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.ParameterImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__VALUE = eINSTANCE.getParameter_Value();

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
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER_LIST__PARAMS = eINSTANCE.getParameterList_Params();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.FunctionParameterImpl <em>Function Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.FunctionParameterImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionParameter()
     * @generated
     */
    EClass FUNCTION_PARAMETER = eINSTANCE.getFunctionParameter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_PARAMETER__TYPE = eINSTANCE.getFunctionParameter_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_PARAMETER__VALUE = eINSTANCE.getFunctionParameter_Value();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.FunctionParameterListImpl <em>Function Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.FunctionParameterListImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionParameterList()
     * @generated
     */
    EClass FUNCTION_PARAMETER_LIST = eINSTANCE.getFunctionParameterList();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_PARAMETER_LIST__PARAMS = eINSTANCE.getFunctionParameterList_Params();

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
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_BODY__META = eINSTANCE.getFunctionBody_Meta();

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
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ArithmeticOperationImpl <em>Arithmetic Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.ArithmeticOperationImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getArithmeticOperation()
     * @generated
     */
    EClass ARITHMETIC_OPERATION = eINSTANCE.getArithmeticOperation();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_OPERATION__RESULT = eINSTANCE.getArithmeticOperation_Result();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARITHMETIC_OPERATION__OPERATION = eINSTANCE.getArithmeticOperation_Operation();

    /**
     * The meta object literal for the '<em><b>Optype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_OPERATION__OPTYPE = eINSTANCE.getArithmeticOperation_Optype();

    /**
     * The meta object literal for the '<em><b>Value1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_OPERATION__VALUE1 = eINSTANCE.getArithmeticOperation_Value1();

    /**
     * The meta object literal for the '<em><b>Value2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARITHMETIC_OPERATION__VALUE2 = eINSTANCE.getArithmeticOperation_Value2();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.LogicOperationImpl <em>Logic Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.LogicOperationImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLogicOperation()
     * @generated
     */
    EClass LOGIC_OPERATION = eINSTANCE.getLogicOperation();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_OPERATION__RESULT = eINSTANCE.getLogicOperation_Result();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOGIC_OPERATION__OPERATION = eINSTANCE.getLogicOperation_Operation();

    /**
     * The meta object literal for the '<em><b>Optype</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_OPERATION__OPTYPE = eINSTANCE.getLogicOperation_Optype();

    /**
     * The meta object literal for the '<em><b>Value1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_OPERATION__VALUE1 = eINSTANCE.getLogicOperation_Value1();

    /**
     * The meta object literal for the '<em><b>Value2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOGIC_OPERATION__VALUE2 = eINSTANCE.getLogicOperation_Value2();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST__RESULT = eINSTANCE.getCast_Result();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAST__OPERATION = eINSTANCE.getCast_Operation();

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
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.NestedCastImpl <em>Nested Cast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.NestedCastImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getNestedCast()
     * @generated
     */
    EClass NESTED_CAST = eINSTANCE.getNestedCast();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NESTED_CAST__OPERATION = eINSTANCE.getNestedCast_Operation();

    /**
     * The meta object literal for the '<em><b>From</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_CAST__FROM = eINSTANCE.getNestedCast_From();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_CAST__VALUE = eINSTANCE.getNestedCast_Value();

    /**
     * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_CAST__TO = eINSTANCE.getNestedCast_To();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.MetaArgValueImpl <em>Meta Arg Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.MetaArgValueImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getMetaArgValue()
     * @generated
     */
    EClass META_ARG_VALUE = eINSTANCE.getMetaArgValue();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_ARG_VALUE__ARG = eINSTANCE.getMetaArgValue_Arg();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META_ARG_VALUE__VALUE = eINSTANCE.getMetaArgValue_Value();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.MetaImpl <em>Meta</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.MetaImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getMeta()
     * @generated
     */
    EClass META = eINSTANCE.getMeta();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute META__META = eINSTANCE.getMeta_Meta();

    /**
     * The meta object literal for the '<em><b>Arg</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META__ARG = eINSTANCE.getMeta_Arg();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference META__VALUE = eINSTANCE.getMeta_Value();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.MetadataValueImpl <em>Metadata Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.MetadataValueImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getMetadataValue()
     * @generated
     */
    EClass METADATA_VALUE = eINSTANCE.getMetadataValue();

    /**
     * The meta object literal for the '<em><b>Node Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METADATA_VALUE__NODE_ID = eINSTANCE.getMetadataValue_NodeId();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METADATA_VALUE__VALUES = eINSTANCE.getMetadataValue_Values();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_ELEMENT_PTR__RESULT = eINSTANCE.getGetElementPtr_Result();

    /**
     * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_ELEMENT_PTR__AGGREGATE = eINSTANCE.getGetElementPtr_Aggregate();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GET_ELEMENT_PTR__INDICES = eINSTANCE.getGetElementPtr_Indices();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.NestedGetElementPtrImpl <em>Nested Get Element Ptr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.NestedGetElementPtrImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getNestedGetElementPtr()
     * @generated
     */
    EClass NESTED_GET_ELEMENT_PTR = eINSTANCE.getNestedGetElementPtr();

    /**
     * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_GET_ELEMENT_PTR__AGGREGATE = eINSTANCE.getNestedGetElementPtr_Aggregate();

    /**
     * The meta object literal for the '<em><b>Indices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_GET_ELEMENT_PTR__INDICES = eINSTANCE.getNestedGetElementPtr_Indices();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CMP_XCHG__RESULT = eINSTANCE.getCmpXchg_Result();

    /**
     * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CMP_XCHG__VOLATILE = eINSTANCE.getCmpXchg_Volatile();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CMP_XCHG__ADDRESS = eINSTANCE.getCmpXchg_Address();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CMP_XCHG__VALUE = eINSTANCE.getCmpXchg_Value();

    /**
     * The meta object literal for the '<em><b>New Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CMP_XCHG__NEW_VALUE = eINSTANCE.getCmpXchg_NewValue();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_RMW__RESULT = eINSTANCE.getAtomicRMW_Result();

    /**
     * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_RMW__VOLATILE = eINSTANCE.getAtomicRMW_Volatile();

    /**
     * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATOMIC_RMW__OPERATION = eINSTANCE.getAtomicRMW_Operation();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_RMW__ADDRESS = eINSTANCE.getAtomicRMW_Address();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATOMIC_RMW__ARGUMENT = eINSTANCE.getAtomicRMW_Argument();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD__RESULT = eINSTANCE.getLoad_Result();

    /**
     * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD__VOLATILE = eINSTANCE.getLoad_Volatile();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD__ADDRESS = eINSTANCE.getLoad_Address();

    /**
     * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD__ALIGN = eINSTANCE.getLoad_Align();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOAD__META = eINSTANCE.getLoad_Meta();

    /**
     * The meta object literal for the '<em><b>Atomic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD__ATOMIC = eINSTANCE.getLoad_Atomic();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD__ORDERING = eINSTANCE.getLoad_Ordering();

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
     * The meta object literal for the '<em><b>Volatile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORE__VOLATILE = eINSTANCE.getStore_Volatile();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORE__VALUE = eINSTANCE.getStore_Value();

    /**
     * The meta object literal for the '<em><b>Target Address</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORE__TARGET_ADDRESS = eINSTANCE.getStore_TargetAddress();

    /**
     * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORE__ALIGN = eINSTANCE.getStore_Align();

    /**
     * The meta object literal for the '<em><b>Meta</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STORE__META = eINSTANCE.getStore_Meta();

    /**
     * The meta object literal for the '<em><b>Atomic</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORE__ATOMIC = eINSTANCE.getStore_Atomic();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STORE__ORDERING = eINSTANCE.getStore_Ordering();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__RESULT = eINSTANCE.getCall_Result();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__FUNCTION = eINSTANCE.getCall_Function();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALLOC__RESULT = eINSTANCE.getAlloc_Result();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALLOC__TYPE = eINSTANCE.getAlloc_Type();

    /**
     * The meta object literal for the '<em><b>Num Of Elements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALLOC__NUM_OF_ELEMENTS = eINSTANCE.getAlloc_NumOfElements();

    /**
     * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALLOC__ALIGN = eINSTANCE.getAlloc_Align();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.PhiCaseImpl <em>Phi Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.PhiCaseImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPhiCase()
     * @generated
     */
    EClass PHI_CASE = eINSTANCE.getPhiCase();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PHI_CASE__VALUE = eINSTANCE.getPhiCase_Value();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PHI_CASE__LABEL = eINSTANCE.getPhiCase_Label();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.PhiImpl <em>Phi</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.PhiImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPhi()
     * @generated
     */
    EClass PHI = eINSTANCE.getPhi();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PHI__RESULT = eINSTANCE.getPhi_Result();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PHI__TYPE = eINSTANCE.getPhi_Type();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PHI__CASES = eINSTANCE.getPhi_Cases();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LANDING_PAD__RESULT = eINSTANCE.getLandingPad_Result();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__RESULT = eINSTANCE.getSelect_Result();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__CONDITION = eINSTANCE.getSelect_Condition();

    /**
     * The meta object literal for the '<em><b>True Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__TRUE_VALUE = eINSTANCE.getSelect_TrueValue();

    /**
     * The meta object literal for the '<em><b>Else Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SELECT__ELSE_VALUE = eINSTANCE.getSelect_ElseValue();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl <em>Variable Attribute Access</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getVariableAttributeAccess()
     * @generated
     */
    EClass VARIABLE_ATTRIBUTE_ACCESS = eINSTANCE.getVariableAttributeAccess();

    /**
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ATTRIBUTE_ACCESS__RESULT = eINSTANCE.getVariableAttributeAccess_Result();

    /**
     * The meta object literal for the '<em><b>Va List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ATTRIBUTE_ACCESS__VA_LIST = eINSTANCE.getVariableAttributeAccess_VaList();

    /**
     * The meta object literal for the '<em><b>AType</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ATTRIBUTE_ACCESS__ATYPE = eINSTANCE.getVariableAttributeAccess_AType();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTRACT_VALUE__RESULT = eINSTANCE.getExtractValue_Result();

    /**
     * The meta object literal for the '<em><b>Aggerate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTRACT_VALUE__AGGERATE = eINSTANCE.getExtractValue_Aggerate();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_VALUE__RESULT = eINSTANCE.getInsertValue_Result();

    /**
     * The meta object literal for the '<em><b>Aggerate</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_VALUE__AGGERATE = eINSTANCE.getInsertValue_Aggerate();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_VALUE__VALUE = eINSTANCE.getInsertValue_Value();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INSERT_VALUE__INDEX = eINSTANCE.getInsertValue_Index();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTRACT_ELEMENT__RESULT = eINSTANCE.getExtractElement_Result();

    /**
     * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTRACT_ELEMENT__VECTOR = eINSTANCE.getExtractElement_Vector();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_ELEMENT__RESULT = eINSTANCE.getInsertElement_Result();

    /**
     * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_ELEMENT__VECTOR = eINSTANCE.getInsertElement_Vector();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSERT_ELEMENT__VALUE = eINSTANCE.getInsertElement_Value();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHUFFLE_VECTOR__RESULT = eINSTANCE.getShuffleVector_Result();

    /**
     * The meta object literal for the '<em><b>Value1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHUFFLE_VECTOR__VALUE1 = eINSTANCE.getShuffleVector_Value1();

    /**
     * The meta object literal for the '<em><b>Value2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHUFFLE_VECTOR__VALUE2 = eINSTANCE.getShuffleVector_Value2();

    /**
     * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHUFFLE_VECTOR__MASK = eINSTANCE.getShuffleVector_Mask();

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
     * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE__RESULT = eINSTANCE.getCompare_Result();

    /**
     * The meta object literal for the '<em><b>Cond</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARE__COND = eINSTANCE.getCompare_Cond();

    /**
     * The meta object literal for the '<em><b>Op Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE__OP_TYPE = eINSTANCE.getCompare_OpType();

    /**
     * The meta object literal for the '<em><b>Operand1</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE__OPERAND1 = eINSTANCE.getCompare_Operand1();

    /**
     * The meta object literal for the '<em><b>Operand2</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARE__OPERAND2 = eINSTANCE.getCompare_Operand2();

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
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INDIRECT_BRANCH__TARGET = eINSTANCE.getIndirectBranch_Target();

    /**
     * The meta object literal for the '<em><b>Pot Target Labels</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INDIRECT_BRANCH__POT_TARGET_LABELS = eINSTANCE.getIndirectBranch_PotTargetLabels();

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
     * The meta object literal for the '<em><b>Case Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__CASE_VALUE = eINSTANCE.getSwitch_CaseValue();

    /**
     * The meta object literal for the '<em><b>Default Case</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__DEFAULT_CASE = eINSTANCE.getSwitch_DefaultCase();

    /**
     * The meta object literal for the '<em><b>Cases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__CASES = eINSTANCE.getSwitch_Cases();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.SwitchCaseImpl <em>Switch Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.llvm.impl.SwitchCaseImpl
     * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSwitchCase()
     * @generated
     */
    EClass SWITCH_CASE = eINSTANCE.getSwitchCase();

    /**
     * The meta object literal for the '<em><b>Case Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH_CASE__CASE_VALUE = eINSTANCE.getSwitchCase_CaseValue();

    /**
     * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_CASE__DESTINATION = eINSTANCE.getSwitchCase_Destination();

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
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE__RETURN_TYPE = eINSTANCE.getInvoke_ReturnType();

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
     * The meta object literal for the '<em><b>Target Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVOKE__TARGET_LABEL = eINSTANCE.getInvoke_TargetLabel();

    /**
     * The meta object literal for the '<em><b>Unwind Target Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INVOKE__UNWIND_TARGET_LABEL = eINSTANCE.getInvoke_UnwindTargetLabel();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESUME__TYPE = eINSTANCE.getResume_Type();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RESUME__VALUE = eINSTANCE.getResume_Value();

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
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN__VALUE = eINSTANCE.getReturn_Value();

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
     * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH__DESTINATION = eINSTANCE.getBranch_Destination();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BRANCH__CONDITION = eINSTANCE.getBranch_Condition();

    /**
     * The meta object literal for the '<em><b>Else Destination</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BRANCH__ELSE_DESTINATION = eINSTANCE.getBranch_ElseDestination();

  }

} //LlvmPackage
