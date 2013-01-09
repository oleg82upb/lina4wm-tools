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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_LEVEL_ENTITY__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Main Level Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAIN_LEVEL_ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.NamedTypeImpl <em>Named Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.NamedTypeImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getNamedType()
	 * @generated
	 */
	int NAMED_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__NAME = MAIN_LEVEL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__STRUCT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__INSTR = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__ARRAY = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Caststruct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__CASTSTRUCT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__ALIAS = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE__TYPE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Named Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_TYPE_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CastStructureImpl <em>Cast Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CastStructureImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCastStructure()
	 * @generated
	 */
	int CAST_STRUCTURE = 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_STRUCTURE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_STRUCTURE__OP = 1;

	/**
	 * The number of structural features of the '<em>Cast Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_STRUCTURE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ARRAYImpl <em>ARRAY</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ARRAYImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getARRAY()
	 * @generated
	 */
	int ARRAY = 6;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__STRUCT = 0;

	/**
	 * The feature id for the '<em><b>Lstruct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__LSTRUCT = 1;

	/**
	 * The feature id for the '<em><b>Rstruct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY__RSTRUCT = 2;

	/**
	 * The number of structural features of the '<em>ARRAY</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARRAY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ValueStructImpl <em>Value Struct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ValueStructImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getValueStruct()
	 * @generated
	 */
	int VALUE_STRUCT = 7;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_STRUCT__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
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
	int STRUCTURE = 8;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Arrays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__ARRAYS = 1;

	/**
	 * The feature id for the '<em><b>Lists</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE__LISTS = 2;

	/**
	 * The number of structural features of the '<em>Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AliasImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAlias()
	 * @generated
	 */
	int ALIAS = 9;

	/**
	 * The feature id for the '<em><b>Aliastype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__ALIASTYPE = 0;

	/**
	 * The feature id for the '<em><b>Aliasvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__ALIASVALUE = 1;

	/**
	 * The feature id for the '<em><b>Aliasee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__ALIASEE = 2;

	/**
	 * The number of structural features of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl <em>Function Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionHeader()
	 * @generated
	 */
	int FUNCTION_HEADER = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_HEADER__NAME = MAIN_LEVEL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_HEADER__RETURN_TYPE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_HEADER__PL = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_HEADER__BODY = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>TList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_HEADER__TLIST = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_HEADER_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ParameterListImpl <em>Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ParameterListImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getParameterList()
	 * @generated
	 */
	int PARAMETER_LIST = 11;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
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
	 * The feature id for the '<em><b>Variables</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__VARIABLES = 2;

	/**
	 * The feature id for the '<em><b>Casts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST__CASTS = 3;

	/**
	 * The number of structural features of the '<em>Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_LIST_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionBodyImpl <em>Function Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FunctionBodyImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionBody()
	 * @generated
	 */
	int FUNCTION_BODY = 12;

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
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.BasicBlockImpl <em>Basic Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.BasicBlockImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getBasicBlock()
	 * @generated
	 */
	int BASIC_BLOCK = 13;

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
	 * The feature id for the '<em><b>Terminator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK__TERMINATOR = 2;

	/**
	 * The number of structural features of the '<em>Basic Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_BLOCK_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.Ret_InstrImpl <em>Ret Instr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.Ret_InstrImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getRet_Instr()
	 * @generated
	 */
	int RET_INSTR = 14;

	/**
	 * The number of structural features of the '<em>Ret Instr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RET_INSTR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.TypeListImpl <em>Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.TypeListImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeList()
	 * @generated
	 */
	int TYPE_LIST = 15;

	/**
	 * The feature id for the '<em><b>Types</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST__TYPES = 0;

	/**
	 * The number of structural features of the '<em>Type List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InstructionImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 16;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl <em>Get Element Ptr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.GetElementPtrImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGetElementPtr()
	 * @generated
	 */
	int GET_ELEMENT_PTR = 17;

	/**
	 * The feature id for the '<em><b>Elementtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__ELEMENTTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elementarray</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__ELEMENTARRAY = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__ELEMENT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Indicetypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__INDICETYPES = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__INDICES = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Get Element Ptr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ExtractValueImpl <em>Extract Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ExtractValueImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractValue()
	 * @generated
	 */
	int EXTRACT_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__ARRAY = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__STRUCT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__TYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__INDEX = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Extract Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl <em>Insert Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InsertValueImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInsertValue()
	 * @generated
	 */
	int INSERT_VALUE = 19;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__STRUCT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inserttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__INSERTTYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Insertvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__INSERTVALUE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__INDEX = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Insert Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FenceImpl <em>Fence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FenceImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFence()
	 * @generated
	 */
	int FENCE = 20;

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
	int CMP_XCHG = 21;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__ADRESSTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__ADRESS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Comparetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__COMPARETYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Comparevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__COMPAREVALUE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Newtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__NEWTYPE = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Newvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__NEWVALUE = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__ORDERING = INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Cmp Xchg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl <em>Atomic RMW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AtomicRMWImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAtomicRMW()
	 * @generated
	 */
	int ATOMIC_RMW = 22;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__ADRESSTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__ADRESS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Optype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__OPTYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Opvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__OPVALUE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__ORDERING = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Atomic RMW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LoadImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 23;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ADRESSTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ADRESS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ORDERING = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__INDEX = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.StoreImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 24;

	/**
	 * The feature id for the '<em><b>Newtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NEWTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Newvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__NEWVALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ADRESSTYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ADRESS = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ORDERING = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__INDEX = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CallImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 25;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ADRESSTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__ADRESS = INSTRUCTION_FEATURE_COUNT + 1;

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
	int ALLOC = 26;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC__TYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Numelementstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC__NUMELEMENTSTYPE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Numelementsvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC__NUMELEMENTSVALUE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Alloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.PHIImpl <em>PHI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.PHIImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPHI()
	 * @generated
	 */
	int PHI = 27;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI__VALUES = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>PHI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHI_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ValuePairImpl <em>Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ValuePairImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getValuePair()
	 * @generated
	 */
	int VALUE_PAIR = 28;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PAIR__VALUE1 = 0;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PAIR__VALUE2 = 1;

	/**
	 * The number of structural features of the '<em>Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PAIR_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl <em>Landing Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LandingPadImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLandingPad()
	 * @generated
	 */
	int LANDING_PAD = 29;

	/**
	 * The feature id for the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__STRUCT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Personalitytype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__PERSONALITYTYPE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Personalityvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__PERSONALITYVALUE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Personalityfunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__PERSONALITYFUNCTION = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__VALUE = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Castto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__CASTTO = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__CLAUSE = INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Landing Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ClauseImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 30;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Filtertype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__FILTERTYPE = 2;

	/**
	 * The feature id for the '<em><b>Filtervalue</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__FILTERVALUE = 3;

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
	int SELECT = 31;

	/**
	 * The feature id for the '<em><b>Conditiontype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CONDITIONTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Conditionvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CONDITIONVALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Val1type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL1TYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Val1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL1VALUE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Val2type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL2TYPE = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Val2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL2VALUE = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl <em>VA Arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.VA_ArgImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getVA_Arg()
	 * @generated
	 */
	int VA_ARG = 32;

	/**
	 * The feature id for the '<em><b>Listtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG__LISTTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Listvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG__LISTVALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arg Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG__ARG_TYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>VA Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ExtractElementImpl <em>Extract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ExtractElementImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractElement()
	 * @generated
	 */
	int EXTRACT_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Vectortype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__VECTORTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vectorvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__VECTORVALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Indextype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__INDEXTYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__INDEX = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Extract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl <em>Insert Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InsertElementImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInsertElement()
	 * @generated
	 */
	int INSERT_ELEMENT = 34;

	/**
	 * The feature id for the '<em><b>Vectortype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__VECTORTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vectorvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__VECTORVALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scalartype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__SCALARTYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Scalarvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__SCALARVALUE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Indextype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__INDEXTYPE = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__INDEX = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Insert Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl <em>Shuffle Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getShuffleVector()
	 * @generated
	 */
	int SHUFFLE_VECTOR = 35;

	/**
	 * The feature id for the '<em><b>Val1type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VAL1TYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Val1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VAL1VALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Val2type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VAL2TYPE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Val2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VAL2VALUE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Masktype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__MASKTYPE = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Maskvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__MASKVALUE = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Shuffle Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CastImpl <em>Cast</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CastImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCast()
	 * @generated
	 */
	int CAST = 36;

	/**
	 * The feature id for the '<em><b>Castfrom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__CASTFROM = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Caststruct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__CASTSTRUCT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__VALUE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__DUAL = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__OP = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Global</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__GLOBAL = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Castto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__CASTTO = INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__LIST = INSTRUCTION_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CompareImpl <em>Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CompareImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCompare()
	 * @generated
	 */
	int COMPARE = 37;

	/**
	 * The feature id for the '<em><b>Comptype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__COMPTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__VALUE1 = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE__VALUE2 = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl <em>ARITHMETIC OP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getARITHMETIC_OP()
	 * @generated
	 */
	int ARITHMETIC_OP = 38;

	/**
	 * The feature id for the '<em><b>Optype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OP__OPTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OP__VALUE1 = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OP__VALUE2 = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ARITHMETIC OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LOGICAL_OPImpl <em>LOGICAL OP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LOGICAL_OPImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLOGICAL_OP()
	 * @generated
	 */
	int LOGICAL_OP = 39;

	/**
	 * The feature id for the '<em><b>Optype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP__OPTYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP__VALUE1 = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP__VALUE2 = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>LOGICAL OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl <em>Indirect Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.IndirectBranchImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getIndirectBranch()
	 * @generated
	 */
	int INDIRECT_BRANCH = 40;

	/**
	 * The feature id for the '<em><b>Adresstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH__ADRESSTYPE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH__ADRESS = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>LList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH__LLIST = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Indirect Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LabelListImpl <em>Label List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LabelListImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLabelList()
	 * @generated
	 */
	int LABEL_LIST = 41;

	/**
	 * The feature id for the '<em><b>Labeltype</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_LIST__LABELTYPE = 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_LIST__LABELS = 1;

	/**
	 * The number of structural features of the '<em>Label List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_LIST_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.SwitchImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 42;

	/**
	 * The feature id for the '<em><b>Comptype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__COMPTYPE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__COMPVALUE = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defaulttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DEFAULTTYPE = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Defaultvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DEFAULTVALUE = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>JTable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__JTABLE = RET_INSTR_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.JumpTableImpl <em>Jump Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.JumpTableImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getJumpTable()
	 * @generated
	 */
	int JUMP_TABLE = 43;

	/**
	 * The feature id for the '<em><b>Jtypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TABLE__JTYPES = 0;

	/**
	 * The feature id for the '<em><b>Jvalues</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TABLE__JVALUES = 1;

	/**
	 * The feature id for the '<em><b>Destinationtypes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TABLE__DESTINATIONTYPES = 2;

	/**
	 * The feature id for the '<em><b>Destinations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TABLE__DESTINATIONS = 3;

	/**
	 * The number of structural features of the '<em>Jump Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InvokeImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 44;

	/**
	 * The feature id for the '<em><b>Functiontype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FUNCTIONTYPE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Functionvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FUNCTIONVALUE = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>PList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__PLIST = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Totype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TOTYPE = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Tovalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TOVALUE = RET_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unwindtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__UNWINDTYPE = RET_INSTR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Unwindvalue</b></em>' attribute.
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
	int RESUME = 45;

	/**
	 * The feature id for the '<em><b>Resumestruct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME__RESUMESTRUCT = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resumevalue</b></em>' attribute.
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
	int UNREACHABLE = 46;

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
	int RETURN = 47;

	/**
	 * The feature id for the '<em><b>Returntype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RETURNTYPE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Returnvalue</b></em>' attribute.
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
	int BRANCH = 48;

	/**
	 * The feature id for the '<em><b>Destinationtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DESTINATIONTYPE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DESTINATION = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Condtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CONDTYPE = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Condvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__CONDVALUE = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label Truetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_TRUETYPE = RET_INSTR_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_TRUE = RET_INSTR_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Label Falsetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_FALSETYPE = RET_INSTR_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label False</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_FALSE = RET_INSTR_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 8;


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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.MainLevelEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.llvm_parser.llvm.MainLevelEntity#getName()
	 * @see #getMainLevelEntity()
	 * @generated
	 */
	EAttribute getMainLevelEntity_Name();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.NamedType <em>Named Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Type</em>'.
	 * @see de.upb.llvm_parser.llvm.NamedType
	 * @generated
	 */
	EClass getNamedType();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.NamedType#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see de.upb.llvm_parser.llvm.NamedType#getStruct()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.NamedType#getInstr <em>Instr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instr</em>'.
	 * @see de.upb.llvm_parser.llvm.NamedType#getInstr()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_Instr();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.NamedType#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Array</em>'.
	 * @see de.upb.llvm_parser.llvm.NamedType#getArray()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_Array();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.NamedType#getCaststruct <em>Caststruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caststruct</em>'.
	 * @see de.upb.llvm_parser.llvm.NamedType#getCaststruct()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_Caststruct();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.NamedType#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see de.upb.llvm_parser.llvm.NamedType#getAlias()
	 * @see #getNamedType()
	 * @generated
	 */
	EReference getNamedType_Alias();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.NamedType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.NamedType#getType()
	 * @see #getNamedType()
	 * @generated
	 */
	EAttribute getNamedType_Type();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.CastStructure <em>Cast Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast Structure</em>'.
	 * @see de.upb.llvm_parser.llvm.CastStructure
	 * @generated
	 */
	EClass getCastStructure();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.CastStructure#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.CastStructure#getType()
	 * @see #getCastStructure()
	 * @generated
	 */
	EAttribute getCastStructure_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.CastStructure#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Op</em>'.
	 * @see de.upb.llvm_parser.llvm.CastStructure#getOp()
	 * @see #getCastStructure()
	 * @generated
	 */
	EReference getCastStructure_Op();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ARRAY <em>ARRAY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ARRAY</em>'.
	 * @see de.upb.llvm_parser.llvm.ARRAY
	 * @generated
	 */
	EClass getARRAY();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ARRAY#getStruct <em>Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Struct</em>'.
	 * @see de.upb.llvm_parser.llvm.ARRAY#getStruct()
	 * @see #getARRAY()
	 * @generated
	 */
	EReference getARRAY_Struct();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ARRAY#getLstruct <em>Lstruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lstruct</em>'.
	 * @see de.upb.llvm_parser.llvm.ARRAY#getLstruct()
	 * @see #getARRAY()
	 * @generated
	 */
	EReference getARRAY_Lstruct();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ARRAY#getRstruct <em>Rstruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rstruct</em>'.
	 * @see de.upb.llvm_parser.llvm.ARRAY#getRstruct()
	 * @see #getARRAY()
	 * @generated
	 */
	EReference getARRAY_Rstruct();

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
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.ValueStruct#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.ValueStruct#getTypes()
	 * @see #getValueStruct()
	 * @generated
	 */
	EAttribute getValueStruct_Types();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.ValueStruct#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.ValueStruct#getValue()
	 * @see #getValueStruct()
	 * @generated
	 */
	EAttribute getValueStruct_Value();

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
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.Structure#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.Structure#getTypes()
	 * @see #getStructure()
	 * @generated
	 */
	EAttribute getStructure_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Structure#getArrays <em>Arrays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arrays</em>'.
	 * @see de.upb.llvm_parser.llvm.Structure#getArrays()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Arrays();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Structure#getLists <em>Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lists</em>'.
	 * @see de.upb.llvm_parser.llvm.Structure#getLists()
	 * @see #getStructure()
	 * @generated
	 */
	EReference getStructure_Lists();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Alias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alias</em>'.
	 * @see de.upb.llvm_parser.llvm.Alias
	 * @generated
	 */
	EClass getAlias();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Alias#getAliastype <em>Aliastype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aliastype</em>'.
	 * @see de.upb.llvm_parser.llvm.Alias#getAliastype()
	 * @see #getAlias()
	 * @generated
	 */
	EAttribute getAlias_Aliastype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Alias#getAliasvalue <em>Aliasvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aliasvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Alias#getAliasvalue()
	 * @see #getAlias()
	 * @generated
	 */
	EAttribute getAlias_Aliasvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Alias#getAliasee <em>Aliasee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aliasee</em>'.
	 * @see de.upb.llvm_parser.llvm.Alias#getAliasee()
	 * @see #getAlias()
	 * @generated
	 */
	EAttribute getAlias_Aliasee();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.FunctionHeader <em>Function Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Header</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionHeader
	 * @generated
	 */
	EClass getFunctionHeader();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.FunctionHeader#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Type</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionHeader#getReturnType()
	 * @see #getFunctionHeader()
	 * @generated
	 */
	EAttribute getFunctionHeader_ReturnType();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionHeader#getPl <em>Pl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pl</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionHeader#getPl()
	 * @see #getFunctionHeader()
	 * @generated
	 */
	EReference getFunctionHeader_Pl();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionHeader#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionHeader#getBody()
	 * @see #getFunctionHeader()
	 * @generated
	 */
	EReference getFunctionHeader_Body();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.FunctionHeader#getTList <em>TList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>TList</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionHeader#getTList()
	 * @see #getFunctionHeader()
	 * @generated
	 */
	EReference getFunctionHeader_TList();

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
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.ParameterList#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.ParameterList#getTypes()
	 * @see #getParameterList()
	 * @generated
	 */
	EAttribute getParameterList_Types();

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
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.ParameterList#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Variables</em>'.
	 * @see de.upb.llvm_parser.llvm.ParameterList#getVariables()
	 * @see #getParameterList()
	 * @generated
	 */
	EAttribute getParameterList_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.ParameterList#getCasts <em>Casts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Casts</em>'.
	 * @see de.upb.llvm_parser.llvm.ParameterList#getCasts()
	 * @see #getParameterList()
	 * @generated
	 */
	EReference getParameterList_Casts();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Ret_Instr <em>Ret Instr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ret Instr</em>'.
	 * @see de.upb.llvm_parser.llvm.Ret_Instr
	 * @generated
	 */
	EClass getRet_Instr();

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
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.TypeList#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Types</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeList#getTypes()
	 * @see #getTypeList()
	 * @generated
	 */
	EAttribute getTypeList_Types();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.GetElementPtr <em>Get Element Ptr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Element Ptr</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr
	 * @generated
	 */
	EClass getGetElementPtr();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.GetElementPtr#getElementtype <em>Elementtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elementtype</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getElementtype()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EAttribute getGetElementPtr_Elementtype();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.GetElementPtr#getElementarray <em>Elementarray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elementarray</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getElementarray()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EReference getGetElementPtr_Elementarray();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.GetElementPtr#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getElement()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EAttribute getGetElementPtr_Element();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.GetElementPtr#getIndicetypes <em>Indicetypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Indicetypes</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getIndicetypes()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EAttribute getGetElementPtr_Indicetypes();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.GetElementPtr#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Indices</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getIndices()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EAttribute getGetElementPtr_Indices();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ExtractValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractValue#getType()
	 * @see #getExtractValue()
	 * @generated
	 */
	EAttribute getExtractValue_Type();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getValue()
	 * @see #getInsertValue()
	 * @generated
	 */
	EAttribute getInsertValue_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertValue#getInserttype <em>Inserttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inserttype</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getInserttype()
	 * @see #getInsertValue()
	 * @generated
	 */
	EAttribute getInsertValue_Inserttype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertValue#getInsertvalue <em>Insertvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insertvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getInsertvalue()
	 * @see #getInsertValue()
	 * @generated
	 */
	EAttribute getInsertValue_Insertvalue();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.CmpXchg#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getAdresstype()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EAttribute getCmpXchg_Adresstype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.CmpXchg#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getAdress()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EAttribute getCmpXchg_Adress();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.CmpXchg#getComparetype <em>Comparetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparetype</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getComparetype()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EAttribute getCmpXchg_Comparetype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.CmpXchg#getComparevalue <em>Comparevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparevalue</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getComparevalue()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EAttribute getCmpXchg_Comparevalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewtype <em>Newtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newtype</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getNewtype()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EAttribute getCmpXchg_Newtype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewvalue <em>Newvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getNewvalue()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EAttribute getCmpXchg_Newvalue();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getAdresstype()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EAttribute getAtomicRMW_Adresstype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getAdress()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EAttribute getAtomicRMW_Adress();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOptype <em>Optype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optype</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getOptype()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EAttribute getAtomicRMW_Optype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOpvalue <em>Opvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getOpvalue()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EAttribute getAtomicRMW_Opvalue();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Load#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.Load#getAdresstype()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Adresstype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Load#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.Load#getAdress()
	 * @see #getLoad()
	 * @generated
	 */
	EAttribute getLoad_Adress();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Store#getNewtype <em>Newtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newtype</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getNewtype()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Newtype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Store#getNewvalue <em>Newvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getNewvalue()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Newvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Store#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getAdresstype()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Adresstype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Store#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.Store#getAdress()
	 * @see #getStore()
	 * @generated
	 */
	EAttribute getStore_Adress();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Call#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.Call#getAdresstype()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_Adresstype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Call#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.Call#getAdress()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_Adress();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Alloc#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.Alloc#getType()
	 * @see #getAlloc()
	 * @generated
	 */
	EAttribute getAlloc_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Alloc#getNumelementstype <em>Numelementstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numelementstype</em>'.
	 * @see de.upb.llvm_parser.llvm.Alloc#getNumelementstype()
	 * @see #getAlloc()
	 * @generated
	 */
	EAttribute getAlloc_Numelementstype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Alloc#getNumelementsvalue <em>Numelementsvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numelementsvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Alloc#getNumelementsvalue()
	 * @see #getAlloc()
	 * @generated
	 */
	EAttribute getAlloc_Numelementsvalue();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.ValuePair <em>Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value Pair</em>'.
	 * @see de.upb.llvm_parser.llvm.ValuePair
	 * @generated
	 */
	EClass getValuePair();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ValuePair#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see de.upb.llvm_parser.llvm.ValuePair#getValue1()
	 * @see #getValuePair()
	 * @generated
	 */
	EAttribute getValuePair_Value1();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ValuePair#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see de.upb.llvm_parser.llvm.ValuePair#getValue2()
	 * @see #getValuePair()
	 * @generated
	 */
	EAttribute getValuePair_Value2();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalitytype <em>Personalitytype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personalitytype</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getPersonalitytype()
	 * @see #getLandingPad()
	 * @generated
	 */
	EAttribute getLandingPad_Personalitytype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalityvalue <em>Personalityvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personalityvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getPersonalityvalue()
	 * @see #getLandingPad()
	 * @generated
	 */
	EAttribute getLandingPad_Personalityvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonalityfunction <em>Personalityfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Personalityfunction</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getPersonalityfunction()
	 * @see #getLandingPad()
	 * @generated
	 */
	EAttribute getLandingPad_Personalityfunction();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LandingPad#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getValue()
	 * @see #getLandingPad()
	 * @generated
	 */
	EAttribute getLandingPad_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LandingPad#getCastto <em>Castto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Castto</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getCastto()
	 * @see #getLandingPad()
	 * @generated
	 */
	EAttribute getLandingPad_Castto();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Clause#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause#getType()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Clause#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause#getValue()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Value();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.Clause#getFiltertype <em>Filtertype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Filtertype</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause#getFiltertype()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Filtertype();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.Clause#getFiltervalue <em>Filtervalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Filtervalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause#getFiltervalue()
	 * @see #getClause()
	 * @generated
	 */
	EAttribute getClause_Filtervalue();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Select#getConditiontype <em>Conditiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditiontype</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getConditiontype()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Conditiontype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Select#getConditionvalue <em>Conditionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conditionvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getConditionvalue()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Conditionvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Select#getVal1type <em>Val1type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val1type</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal1type()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Val1type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Select#getVal1value <em>Val1value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val1value</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal1value()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Val1value();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Select#getVal2type <em>Val2type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val2type</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal2type()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Val2type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Select#getVal2value <em>Val2value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val2value</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal2value()
	 * @see #getSelect()
	 * @generated
	 */
	EAttribute getSelect_Val2value();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.VA_Arg#getListtype <em>Listtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listtype</em>'.
	 * @see de.upb.llvm_parser.llvm.VA_Arg#getListtype()
	 * @see #getVA_Arg()
	 * @generated
	 */
	EAttribute getVA_Arg_Listtype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.VA_Arg#getListvalue <em>Listvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Listvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.VA_Arg#getListvalue()
	 * @see #getVA_Arg()
	 * @generated
	 */
	EAttribute getVA_Arg_Listvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.VA_Arg#getArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg Type</em>'.
	 * @see de.upb.llvm_parser.llvm.VA_Arg#getArgType()
	 * @see #getVA_Arg()
	 * @generated
	 */
	EAttribute getVA_Arg_ArgType();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ExtractElement#getVectortype <em>Vectortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vectortype</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractElement#getVectortype()
	 * @see #getExtractElement()
	 * @generated
	 */
	EAttribute getExtractElement_Vectortype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ExtractElement#getVectorvalue <em>Vectorvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vectorvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractElement#getVectorvalue()
	 * @see #getExtractElement()
	 * @generated
	 */
	EAttribute getExtractElement_Vectorvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ExtractElement#getIndextype <em>Indextype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indextype</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractElement#getIndextype()
	 * @see #getExtractElement()
	 * @generated
	 */
	EAttribute getExtractElement_Indextype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ExtractElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractElement#getIndex()
	 * @see #getExtractElement()
	 * @generated
	 */
	EAttribute getExtractElement_Index();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertElement#getVectortype <em>Vectortype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vectortype</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getVectortype()
	 * @see #getInsertElement()
	 * @generated
	 */
	EAttribute getInsertElement_Vectortype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertElement#getVectorvalue <em>Vectorvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vectorvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getVectorvalue()
	 * @see #getInsertElement()
	 * @generated
	 */
	EAttribute getInsertElement_Vectorvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertElement#getScalartype <em>Scalartype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalartype</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getScalartype()
	 * @see #getInsertElement()
	 * @generated
	 */
	EAttribute getInsertElement_Scalartype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertElement#getScalarvalue <em>Scalarvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scalarvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getScalarvalue()
	 * @see #getInsertElement()
	 * @generated
	 */
	EAttribute getInsertElement_Scalarvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertElement#getIndextype <em>Indextype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Indextype</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getIndextype()
	 * @see #getInsertElement()
	 * @generated
	 */
	EAttribute getInsertElement_Indextype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getIndex()
	 * @see #getInsertElement()
	 * @generated
	 */
	EAttribute getInsertElement_Index();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1type <em>Val1type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val1type</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVal1type()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EAttribute getShuffleVector_Val1type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1value <em>Val1value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val1value</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVal1value()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EAttribute getShuffleVector_Val1value();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2type <em>Val2type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val2type</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVal2type()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EAttribute getShuffleVector_Val2type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2value <em>Val2value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Val2value</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVal2value()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EAttribute getShuffleVector_Val2value();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMasktype <em>Masktype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Masktype</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getMasktype()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EAttribute getShuffleVector_Masktype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMaskvalue <em>Maskvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maskvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getMaskvalue()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EAttribute getShuffleVector_Maskvalue();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Cast#getCastfrom <em>Castfrom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Castfrom</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getCastfrom()
	 * @see #getCast()
	 * @generated
	 */
	EAttribute getCast_Castfrom();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Cast#getCaststruct <em>Caststruct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caststruct</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getCaststruct()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_Caststruct();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Cast#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getValue()
	 * @see #getCast()
	 * @generated
	 */
	EAttribute getCast_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Cast#getDual <em>Dual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dual</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getDual()
	 * @see #getCast()
	 * @generated
	 */
	EAttribute getCast_Dual();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Cast#getOp <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Op</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getOp()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_Op();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Cast#getGlobal <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getGlobal()
	 * @see #getCast()
	 * @generated
	 */
	EAttribute getCast_Global();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Cast#getCastto <em>Castto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Castto</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getCastto()
	 * @see #getCast()
	 * @generated
	 */
	EAttribute getCast_Castto();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Cast#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast#getList()
	 * @see #getCast()
	 * @generated
	 */
	EReference getCast_List();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Compare#getComptype <em>Comptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comptype</em>'.
	 * @see de.upb.llvm_parser.llvm.Compare#getComptype()
	 * @see #getCompare()
	 * @generated
	 */
	EAttribute getCompare_Comptype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Compare#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see de.upb.llvm_parser.llvm.Compare#getValue1()
	 * @see #getCompare()
	 * @generated
	 */
	EAttribute getCompare_Value1();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Compare#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see de.upb.llvm_parser.llvm.Compare#getValue2()
	 * @see #getCompare()
	 * @generated
	 */
	EAttribute getCompare_Value2();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ARITHMETIC_OP#getOptype <em>Optype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optype</em>'.
	 * @see de.upb.llvm_parser.llvm.ARITHMETIC_OP#getOptype()
	 * @see #getARITHMETIC_OP()
	 * @generated
	 */
	EAttribute getARITHMETIC_OP_Optype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ARITHMETIC_OP#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see de.upb.llvm_parser.llvm.ARITHMETIC_OP#getValue1()
	 * @see #getARITHMETIC_OP()
	 * @generated
	 */
	EAttribute getARITHMETIC_OP_Value1();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.ARITHMETIC_OP#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see de.upb.llvm_parser.llvm.ARITHMETIC_OP#getValue2()
	 * @see #getARITHMETIC_OP()
	 * @generated
	 */
	EAttribute getARITHMETIC_OP_Value2();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LOGICAL_OP#getOptype <em>Optype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optype</em>'.
	 * @see de.upb.llvm_parser.llvm.LOGICAL_OP#getOptype()
	 * @see #getLOGICAL_OP()
	 * @generated
	 */
	EAttribute getLOGICAL_OP_Optype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LOGICAL_OP#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see de.upb.llvm_parser.llvm.LOGICAL_OP#getValue1()
	 * @see #getLOGICAL_OP()
	 * @generated
	 */
	EAttribute getLOGICAL_OP_Value1();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LOGICAL_OP#getValue2 <em>Value2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value2</em>'.
	 * @see de.upb.llvm_parser.llvm.LOGICAL_OP#getValue2()
	 * @see #getLOGICAL_OP()
	 * @generated
	 */
	EAttribute getLOGICAL_OP_Value2();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdresstype <em>Adresstype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresstype</em>'.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch#getAdresstype()
	 * @see #getIndirectBranch()
	 * @generated
	 */
	EAttribute getIndirectBranch_Adresstype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adress</em>'.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch#getAdress()
	 * @see #getIndirectBranch()
	 * @generated
	 */
	EAttribute getIndirectBranch_Adress();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.IndirectBranch#getLList <em>LList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>LList</em>'.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch#getLList()
	 * @see #getIndirectBranch()
	 * @generated
	 */
	EReference getIndirectBranch_LList();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.LabelList <em>Label List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label List</em>'.
	 * @see de.upb.llvm_parser.llvm.LabelList
	 * @generated
	 */
	EClass getLabelList();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.LabelList#getLabeltype <em>Labeltype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labeltype</em>'.
	 * @see de.upb.llvm_parser.llvm.LabelList#getLabeltype()
	 * @see #getLabelList()
	 * @generated
	 */
	EAttribute getLabelList_Labeltype();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.LabelList#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Labels</em>'.
	 * @see de.upb.llvm_parser.llvm.LabelList#getLabels()
	 * @see #getLabelList()
	 * @generated
	 */
	EAttribute getLabelList_Labels();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Switch#getComptype <em>Comptype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comptype</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getComptype()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_Comptype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Switch#getCompvalue <em>Compvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getCompvalue()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_Compvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Switch#getDefaulttype <em>Defaulttype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defaulttype</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getDefaulttype()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_Defaulttype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Switch#getDefaultvalue <em>Defaultvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Defaultvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getDefaultvalue()
	 * @see #getSwitch()
	 * @generated
	 */
	EAttribute getSwitch_Defaultvalue();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Switch#getJTable <em>JTable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>JTable</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getJTable()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_JTable();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.JumpTable <em>Jump Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jump Table</em>'.
	 * @see de.upb.llvm_parser.llvm.JumpTable
	 * @generated
	 */
	EClass getJumpTable();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.JumpTable#getJtypes <em>Jtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Jtypes</em>'.
	 * @see de.upb.llvm_parser.llvm.JumpTable#getJtypes()
	 * @see #getJumpTable()
	 * @generated
	 */
	EAttribute getJumpTable_Jtypes();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.JumpTable#getJvalues <em>Jvalues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Jvalues</em>'.
	 * @see de.upb.llvm_parser.llvm.JumpTable#getJvalues()
	 * @see #getJumpTable()
	 * @generated
	 */
	EAttribute getJumpTable_Jvalues();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.JumpTable#getDestinationtypes <em>Destinationtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Destinationtypes</em>'.
	 * @see de.upb.llvm_parser.llvm.JumpTable#getDestinationtypes()
	 * @see #getJumpTable()
	 * @generated
	 */
	EAttribute getJumpTable_Destinationtypes();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.JumpTable#getDestinations <em>Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Destinations</em>'.
	 * @see de.upb.llvm_parser.llvm.JumpTable#getDestinations()
	 * @see #getJumpTable()
	 * @generated
	 */
	EAttribute getJumpTable_Destinations();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Invoke#getFunctiontype <em>Functiontype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functiontype</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getFunctiontype()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Functiontype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Invoke#getFunctionvalue <em>Functionvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Functionvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getFunctionvalue()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Functionvalue();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Invoke#getTotype <em>Totype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Totype</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getTotype()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Totype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Invoke#getTovalue <em>Tovalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tovalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getTovalue()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Tovalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindtype <em>Unwindtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unwindtype</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getUnwindtype()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Unwindtype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindvalue <em>Unwindvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unwindvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getUnwindvalue()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_Unwindvalue();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Resume#getResumevalue <em>Resumevalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resumevalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Resume#getResumevalue()
	 * @see #getResume()
	 * @generated
	 */
	EAttribute getResume_Resumevalue();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Return#getReturntype <em>Returntype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returntype</em>'.
	 * @see de.upb.llvm_parser.llvm.Return#getReturntype()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Returntype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Return#getReturnvalue <em>Returnvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Returnvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Return#getReturnvalue()
	 * @see #getReturn()
	 * @generated
	 */
	EAttribute getReturn_Returnvalue();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Branch#getDestinationtype <em>Destinationtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destinationtype</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getDestinationtype()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Destinationtype();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Branch#getCondtype <em>Condtype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condtype</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getCondtype()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Condtype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Branch#getCondvalue <em>Condvalue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condvalue</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getCondvalue()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Condvalue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Branch#getLabelTruetype <em>Label Truetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Truetype</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getLabelTruetype()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_LabelTruetype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Branch#getLabelTrue <em>Label True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label True</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getLabelTrue()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_LabelTrue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Branch#getLabelFalsetype <em>Label Falsetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Falsetype</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getLabelFalsetype()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_LabelFalsetype();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Branch#getLabelFalse <em>Label False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label False</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getLabelFalse()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_LabelFalse();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAIN_LEVEL_ENTITY__NAME = eINSTANCE.getMainLevelEntity_Name();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.NamedTypeImpl <em>Named Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.NamedTypeImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getNamedType()
		 * @generated
		 */
		EClass NAMED_TYPE = eINSTANCE.getNamedType();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE__STRUCT = eINSTANCE.getNamedType_Struct();

		/**
		 * The meta object literal for the '<em><b>Instr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE__INSTR = eINSTANCE.getNamedType_Instr();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE__ARRAY = eINSTANCE.getNamedType_Array();

		/**
		 * The meta object literal for the '<em><b>Caststruct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE__CASTSTRUCT = eINSTANCE.getNamedType_Caststruct();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAMED_TYPE__ALIAS = eINSTANCE.getNamedType_Alias();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_TYPE__TYPE = eINSTANCE.getNamedType_Type();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.CastStructureImpl <em>Cast Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.CastStructureImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCastStructure()
		 * @generated
		 */
		EClass CAST_STRUCTURE = eINSTANCE.getCastStructure();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAST_STRUCTURE__TYPE = eINSTANCE.getCastStructure_Type();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST_STRUCTURE__OP = eINSTANCE.getCastStructure_Op();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ARRAYImpl <em>ARRAY</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ARRAYImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getARRAY()
		 * @generated
		 */
		EClass ARRAY = eINSTANCE.getARRAY();

		/**
		 * The meta object literal for the '<em><b>Struct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__STRUCT = eINSTANCE.getARRAY_Struct();

		/**
		 * The meta object literal for the '<em><b>Lstruct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__LSTRUCT = eINSTANCE.getARRAY_Lstruct();

		/**
		 * The meta object literal for the '<em><b>Rstruct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARRAY__RSTRUCT = eINSTANCE.getARRAY_Rstruct();

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
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_STRUCT__TYPES = eINSTANCE.getValueStruct_Types();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_STRUCT__VALUE = eINSTANCE.getValueStruct_Value();

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
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRUCTURE__TYPES = eINSTANCE.getStructure_Types();

		/**
		 * The meta object literal for the '<em><b>Arrays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__ARRAYS = eINSTANCE.getStructure_Arrays();

		/**
		 * The meta object literal for the '<em><b>Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE__LISTS = eINSTANCE.getStructure_Lists();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.AliasImpl <em>Alias</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.AliasImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAlias()
		 * @generated
		 */
		EClass ALIAS = eINSTANCE.getAlias();

		/**
		 * The meta object literal for the '<em><b>Aliastype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS__ALIASTYPE = eINSTANCE.getAlias_Aliastype();

		/**
		 * The meta object literal for the '<em><b>Aliasvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS__ALIASVALUE = eINSTANCE.getAlias_Aliasvalue();

		/**
		 * The meta object literal for the '<em><b>Aliasee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS__ALIASEE = eINSTANCE.getAlias_Aliasee();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl <em>Function Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionHeader()
		 * @generated
		 */
		EClass FUNCTION_HEADER = eINSTANCE.getFunctionHeader();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_HEADER__RETURN_TYPE = eINSTANCE.getFunctionHeader_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Pl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_HEADER__PL = eINSTANCE.getFunctionHeader_Pl();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_HEADER__BODY = eINSTANCE.getFunctionHeader_Body();

		/**
		 * The meta object literal for the '<em><b>TList</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_HEADER__TLIST = eINSTANCE.getFunctionHeader_TList();

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
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_LIST__TYPES = eINSTANCE.getParameterList_Types();

		/**
		 * The meta object literal for the '<em><b>Lists</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__LISTS = eINSTANCE.getParameterList_Lists();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_LIST__VARIABLES = eINSTANCE.getParameterList_Variables();

		/**
		 * The meta object literal for the '<em><b>Casts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMETER_LIST__CASTS = eINSTANCE.getParameterList_Casts();

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
		 * The meta object literal for the '<em><b>Terminator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_BLOCK__TERMINATOR = eINSTANCE.getBasicBlock_Terminator();

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
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.TypeListImpl <em>Type List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.TypeListImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeList()
		 * @generated
		 */
		EClass TYPE_LIST = eINSTANCE.getTypeList();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_LIST__TYPES = eINSTANCE.getTypeList_Types();

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
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl <em>Get Element Ptr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.GetElementPtrImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getGetElementPtr()
		 * @generated
		 */
		EClass GET_ELEMENT_PTR = eINSTANCE.getGetElementPtr();

		/**
		 * The meta object literal for the '<em><b>Elementtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_ELEMENT_PTR__ELEMENTTYPE = eINSTANCE.getGetElementPtr_Elementtype();

		/**
		 * The meta object literal for the '<em><b>Elementarray</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_ELEMENT_PTR__ELEMENTARRAY = eINSTANCE.getGetElementPtr_Elementarray();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_ELEMENT_PTR__ELEMENT = eINSTANCE.getGetElementPtr_Element();

		/**
		 * The meta object literal for the '<em><b>Indicetypes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_ELEMENT_PTR__INDICETYPES = eINSTANCE.getGetElementPtr_Indicetypes();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GET_ELEMENT_PTR__INDICES = eINSTANCE.getGetElementPtr_Indices();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_VALUE__TYPE = eINSTANCE.getExtractValue_Type();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_VALUE__VALUE = eINSTANCE.getInsertValue_Value();

		/**
		 * The meta object literal for the '<em><b>Inserttype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_VALUE__INSERTTYPE = eINSTANCE.getInsertValue_Inserttype();

		/**
		 * The meta object literal for the '<em><b>Insertvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_VALUE__INSERTVALUE = eINSTANCE.getInsertValue_Insertvalue();

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
		 * The meta object literal for the '<em><b>Adresstype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_XCHG__ADRESSTYPE = eINSTANCE.getCmpXchg_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_XCHG__ADRESS = eINSTANCE.getCmpXchg_Adress();

		/**
		 * The meta object literal for the '<em><b>Comparetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_XCHG__COMPARETYPE = eINSTANCE.getCmpXchg_Comparetype();

		/**
		 * The meta object literal for the '<em><b>Comparevalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_XCHG__COMPAREVALUE = eINSTANCE.getCmpXchg_Comparevalue();

		/**
		 * The meta object literal for the '<em><b>Newtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_XCHG__NEWTYPE = eINSTANCE.getCmpXchg_Newtype();

		/**
		 * The meta object literal for the '<em><b>Newvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CMP_XCHG__NEWVALUE = eINSTANCE.getCmpXchg_Newvalue();

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
		 * The meta object literal for the '<em><b>Adresstype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_RMW__ADRESSTYPE = eINSTANCE.getAtomicRMW_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_RMW__ADRESS = eINSTANCE.getAtomicRMW_Adress();

		/**
		 * The meta object literal for the '<em><b>Optype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_RMW__OPTYPE = eINSTANCE.getAtomicRMW_Optype();

		/**
		 * The meta object literal for the '<em><b>Opvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_RMW__OPVALUE = eINSTANCE.getAtomicRMW_Opvalue();

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
		 * The meta object literal for the '<em><b>Adresstype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__ADRESSTYPE = eINSTANCE.getLoad_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOAD__ADRESS = eINSTANCE.getLoad_Adress();

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
		 * The meta object literal for the '<em><b>Newtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__NEWTYPE = eINSTANCE.getStore_Newtype();

		/**
		 * The meta object literal for the '<em><b>Newvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__NEWVALUE = eINSTANCE.getStore_Newvalue();

		/**
		 * The meta object literal for the '<em><b>Adresstype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__ADRESSTYPE = eINSTANCE.getStore_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__ADRESS = eINSTANCE.getStore_Adress();

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
		 * The meta object literal for the '<em><b>Adresstype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__ADRESSTYPE = eINSTANCE.getCall_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__ADRESS = eINSTANCE.getCall_Adress();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOC__TYPE = eINSTANCE.getAlloc_Type();

		/**
		 * The meta object literal for the '<em><b>Numelementstype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOC__NUMELEMENTSTYPE = eINSTANCE.getAlloc_Numelementstype();

		/**
		 * The meta object literal for the '<em><b>Numelementsvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOC__NUMELEMENTSVALUE = eINSTANCE.getAlloc_Numelementsvalue();

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
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHI__VALUES = eINSTANCE.getPHI_Values();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ValuePairImpl <em>Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ValuePairImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getValuePair()
		 * @generated
		 */
		EClass VALUE_PAIR = eINSTANCE.getValuePair();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_PAIR__VALUE1 = eINSTANCE.getValuePair_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VALUE_PAIR__VALUE2 = eINSTANCE.getValuePair_Value2();

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
		 * The meta object literal for the '<em><b>Personalitytype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAD__PERSONALITYTYPE = eINSTANCE.getLandingPad_Personalitytype();

		/**
		 * The meta object literal for the '<em><b>Personalityvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAD__PERSONALITYVALUE = eINSTANCE.getLandingPad_Personalityvalue();

		/**
		 * The meta object literal for the '<em><b>Personalityfunction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAD__PERSONALITYFUNCTION = eINSTANCE.getLandingPad_Personalityfunction();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAD__VALUE = eINSTANCE.getLandingPad_Value();

		/**
		 * The meta object literal for the '<em><b>Castto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAD__CASTTO = eINSTANCE.getLandingPad_Castto();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__TYPE = eINSTANCE.getClause_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__VALUE = eINSTANCE.getClause_Value();

		/**
		 * The meta object literal for the '<em><b>Filtertype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__FILTERTYPE = eINSTANCE.getClause_Filtertype();

		/**
		 * The meta object literal for the '<em><b>Filtervalue</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAUSE__FILTERVALUE = eINSTANCE.getClause_Filtervalue();

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
		 * The meta object literal for the '<em><b>Conditiontype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__CONDITIONTYPE = eINSTANCE.getSelect_Conditiontype();

		/**
		 * The meta object literal for the '<em><b>Conditionvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__CONDITIONVALUE = eINSTANCE.getSelect_Conditionvalue();

		/**
		 * The meta object literal for the '<em><b>Val1type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__VAL1TYPE = eINSTANCE.getSelect_Val1type();

		/**
		 * The meta object literal for the '<em><b>Val1value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__VAL1VALUE = eINSTANCE.getSelect_Val1value();

		/**
		 * The meta object literal for the '<em><b>Val2type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__VAL2TYPE = eINSTANCE.getSelect_Val2type();

		/**
		 * The meta object literal for the '<em><b>Val2value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SELECT__VAL2VALUE = eINSTANCE.getSelect_Val2value();

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
		 * The meta object literal for the '<em><b>Listtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VA_ARG__LISTTYPE = eINSTANCE.getVA_Arg_Listtype();

		/**
		 * The meta object literal for the '<em><b>Listvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VA_ARG__LISTVALUE = eINSTANCE.getVA_Arg_Listvalue();

		/**
		 * The meta object literal for the '<em><b>Arg Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VA_ARG__ARG_TYPE = eINSTANCE.getVA_Arg_ArgType();

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
		 * The meta object literal for the '<em><b>Vectortype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_ELEMENT__VECTORTYPE = eINSTANCE.getExtractElement_Vectortype();

		/**
		 * The meta object literal for the '<em><b>Vectorvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_ELEMENT__VECTORVALUE = eINSTANCE.getExtractElement_Vectorvalue();

		/**
		 * The meta object literal for the '<em><b>Indextype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_ELEMENT__INDEXTYPE = eINSTANCE.getExtractElement_Indextype();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRACT_ELEMENT__INDEX = eINSTANCE.getExtractElement_Index();

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
		 * The meta object literal for the '<em><b>Vectortype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT__VECTORTYPE = eINSTANCE.getInsertElement_Vectortype();

		/**
		 * The meta object literal for the '<em><b>Vectorvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT__VECTORVALUE = eINSTANCE.getInsertElement_Vectorvalue();

		/**
		 * The meta object literal for the '<em><b>Scalartype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT__SCALARTYPE = eINSTANCE.getInsertElement_Scalartype();

		/**
		 * The meta object literal for the '<em><b>Scalarvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT__SCALARVALUE = eINSTANCE.getInsertElement_Scalarvalue();

		/**
		 * The meta object literal for the '<em><b>Indextype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT__INDEXTYPE = eINSTANCE.getInsertElement_Indextype();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_ELEMENT__INDEX = eINSTANCE.getInsertElement_Index();

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
		 * The meta object literal for the '<em><b>Val1type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUFFLE_VECTOR__VAL1TYPE = eINSTANCE.getShuffleVector_Val1type();

		/**
		 * The meta object literal for the '<em><b>Val1value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUFFLE_VECTOR__VAL1VALUE = eINSTANCE.getShuffleVector_Val1value();

		/**
		 * The meta object literal for the '<em><b>Val2type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUFFLE_VECTOR__VAL2TYPE = eINSTANCE.getShuffleVector_Val2type();

		/**
		 * The meta object literal for the '<em><b>Val2value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUFFLE_VECTOR__VAL2VALUE = eINSTANCE.getShuffleVector_Val2value();

		/**
		 * The meta object literal for the '<em><b>Masktype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUFFLE_VECTOR__MASKTYPE = eINSTANCE.getShuffleVector_Masktype();

		/**
		 * The meta object literal for the '<em><b>Maskvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHUFFLE_VECTOR__MASKVALUE = eINSTANCE.getShuffleVector_Maskvalue();

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
		 * The meta object literal for the '<em><b>Castfrom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAST__CASTFROM = eINSTANCE.getCast_Castfrom();

		/**
		 * The meta object literal for the '<em><b>Caststruct</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__CASTSTRUCT = eINSTANCE.getCast_Caststruct();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAST__VALUE = eINSTANCE.getCast_Value();

		/**
		 * The meta object literal for the '<em><b>Dual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAST__DUAL = eINSTANCE.getCast_Dual();

		/**
		 * The meta object literal for the '<em><b>Op</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__OP = eINSTANCE.getCast_Op();

		/**
		 * The meta object literal for the '<em><b>Global</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAST__GLOBAL = eINSTANCE.getCast_Global();

		/**
		 * The meta object literal for the '<em><b>Castto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAST__CASTTO = eINSTANCE.getCast_Castto();

		/**
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__LIST = eINSTANCE.getCast_List();

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
		 * The meta object literal for the '<em><b>Comptype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE__COMPTYPE = eINSTANCE.getCompare_Comptype();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE__VALUE1 = eINSTANCE.getCompare_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARE__VALUE2 = eINSTANCE.getCompare_Value2();

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
		 * The meta object literal for the '<em><b>Optype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_OP__OPTYPE = eINSTANCE.getARITHMETIC_OP_Optype();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_OP__VALUE1 = eINSTANCE.getARITHMETIC_OP_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARITHMETIC_OP__VALUE2 = eINSTANCE.getARITHMETIC_OP_Value2();

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
		 * The meta object literal for the '<em><b>Optype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_OP__OPTYPE = eINSTANCE.getLOGICAL_OP_Optype();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_OP__VALUE1 = eINSTANCE.getLOGICAL_OP_Value1();

		/**
		 * The meta object literal for the '<em><b>Value2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOGICAL_OP__VALUE2 = eINSTANCE.getLOGICAL_OP_Value2();

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
		 * The meta object literal for the '<em><b>Adresstype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIRECT_BRANCH__ADRESSTYPE = eINSTANCE.getIndirectBranch_Adresstype();

		/**
		 * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDIRECT_BRANCH__ADRESS = eINSTANCE.getIndirectBranch_Adress();

		/**
		 * The meta object literal for the '<em><b>LList</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIRECT_BRANCH__LLIST = eINSTANCE.getIndirectBranch_LList();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.LabelListImpl <em>Label List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.LabelListImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLabelList()
		 * @generated
		 */
		EClass LABEL_LIST = eINSTANCE.getLabelList();

		/**
		 * The meta object literal for the '<em><b>Labeltype</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_LIST__LABELTYPE = eINSTANCE.getLabelList_Labeltype();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL_LIST__LABELS = eINSTANCE.getLabelList_Labels();

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
		 * The meta object literal for the '<em><b>Comptype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__COMPTYPE = eINSTANCE.getSwitch_Comptype();

		/**
		 * The meta object literal for the '<em><b>Compvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__COMPVALUE = eINSTANCE.getSwitch_Compvalue();

		/**
		 * The meta object literal for the '<em><b>Defaulttype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__DEFAULTTYPE = eINSTANCE.getSwitch_Defaulttype();

		/**
		 * The meta object literal for the '<em><b>Defaultvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWITCH__DEFAULTVALUE = eINSTANCE.getSwitch_Defaultvalue();

		/**
		 * The meta object literal for the '<em><b>JTable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__JTABLE = eINSTANCE.getSwitch_JTable();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.JumpTableImpl <em>Jump Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.JumpTableImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getJumpTable()
		 * @generated
		 */
		EClass JUMP_TABLE = eINSTANCE.getJumpTable();

		/**
		 * The meta object literal for the '<em><b>Jtypes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_TABLE__JTYPES = eINSTANCE.getJumpTable_Jtypes();

		/**
		 * The meta object literal for the '<em><b>Jvalues</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_TABLE__JVALUES = eINSTANCE.getJumpTable_Jvalues();

		/**
		 * The meta object literal for the '<em><b>Destinationtypes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_TABLE__DESTINATIONTYPES = eINSTANCE.getJumpTable_Destinationtypes();

		/**
		 * The meta object literal for the '<em><b>Destinations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUMP_TABLE__DESTINATIONS = eINSTANCE.getJumpTable_Destinations();

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
		 * The meta object literal for the '<em><b>Functiontype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__FUNCTIONTYPE = eINSTANCE.getInvoke_Functiontype();

		/**
		 * The meta object literal for the '<em><b>Functionvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__FUNCTIONVALUE = eINSTANCE.getInvoke_Functionvalue();

		/**
		 * The meta object literal for the '<em><b>PList</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__PLIST = eINSTANCE.getInvoke_PList();

		/**
		 * The meta object literal for the '<em><b>Totype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__TOTYPE = eINSTANCE.getInvoke_Totype();

		/**
		 * The meta object literal for the '<em><b>Tovalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__TOVALUE = eINSTANCE.getInvoke_Tovalue();

		/**
		 * The meta object literal for the '<em><b>Unwindtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__UNWINDTYPE = eINSTANCE.getInvoke_Unwindtype();

		/**
		 * The meta object literal for the '<em><b>Unwindvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__UNWINDVALUE = eINSTANCE.getInvoke_Unwindvalue();

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
		 * The meta object literal for the '<em><b>Resumevalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESUME__RESUMEVALUE = eINSTANCE.getResume_Resumevalue();

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
		 * The meta object literal for the '<em><b>Returntype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN__RETURNTYPE = eINSTANCE.getReturn_Returntype();

		/**
		 * The meta object literal for the '<em><b>Returnvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETURN__RETURNVALUE = eINSTANCE.getReturn_Returnvalue();

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
		 * The meta object literal for the '<em><b>Destinationtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__DESTINATIONTYPE = eINSTANCE.getBranch_Destinationtype();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__DESTINATION = eINSTANCE.getBranch_Destination();

		/**
		 * The meta object literal for the '<em><b>Condtype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__CONDTYPE = eINSTANCE.getBranch_Condtype();

		/**
		 * The meta object literal for the '<em><b>Condvalue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__CONDVALUE = eINSTANCE.getBranch_Condvalue();

		/**
		 * The meta object literal for the '<em><b>Label Truetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__LABEL_TRUETYPE = eINSTANCE.getBranch_LabelTruetype();

		/**
		 * The meta object literal for the '<em><b>Label True</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__LABEL_TRUE = eINSTANCE.getBranch_LabelTrue();

		/**
		 * The meta object literal for the '<em><b>Label Falsetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__LABEL_FALSETYPE = eINSTANCE.getBranch_LabelFalsetype();

		/**
		 * The meta object literal for the '<em><b>Label False</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__LABEL_FALSE = eINSTANCE.getBranch_LabelFalse();

	}

} //LlvmPackage
