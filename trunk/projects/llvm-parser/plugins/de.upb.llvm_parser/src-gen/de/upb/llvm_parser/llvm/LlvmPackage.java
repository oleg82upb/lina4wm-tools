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
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl <em>Function Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FunctionHeaderImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionHeader()
	 * @generated
	 */
	int FUNCTION_HEADER = 4;

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
	 * The feature id for the '<em><b>Pl</b></em>' attribute.
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
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.TypeListImpl <em>Type List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.TypeListImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeList()
	 * @generated
	 */
	int TYPE_LIST = 5;

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
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AggregateImpl <em>Aggregate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AggregateImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAggregate()
	 * @generated
	 */
	int AGGREGATE = 6;

	/**
	 * The feature id for the '<em><b>Agg</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE__AGG = 0;

	/**
	 * The number of structural features of the '<em>Aggregate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LocalVarImpl <em>Local Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LocalVarImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLocalVar()
	 * @generated
	 */
	int LOCAL_VAR = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VAR__NAME = MAIN_LEVEL_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VAR__TYPE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VAR__INSTR = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VAR__ALIAS = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Local Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VAR_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AliasImpl <em>Alias</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AliasImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAlias()
	 * @generated
	 */
	int ALIAS = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Aliasee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS__ALIASEE = 1;

	/**
	 * The number of structural features of the '<em>Alias</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALIAS_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ClauseImpl <em>Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ClauseImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getClause()
	 * @generated
	 */
	int CLAUSE = 23;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE__FILTER = 0;

	/**
	 * The number of structural features of the '<em>Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAUSE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.TypeAndValueImpl <em>Type And Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.TypeAndValueImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeAndValue()
	 * @generated
	 */
	int TYPE_AND_VALUE = 9;

	/**
	 * The feature id for the '<em><b>Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_AND_VALUE__FILTER = CLAUSE__FILTER;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_AND_VALUE__TYPE = CLAUSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_AND_VALUE__VALUE = CLAUSE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_AND_VALUE__AGGREGATE = CLAUSE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Type And Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_AND_VALUE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InstructionImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 33;

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
	int GET_ELEMENT_PTR = 10;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__POINTER = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR__PARAMS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Get Element Ptr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_ELEMENT_PTR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ExtractValueImpl <em>Extract Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ExtractValueImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractValue()
	 * @generated
	 */
	int EXTRACT_VALUE = 11;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__AGGREGATE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_VALUE__TYPE = INSTRUCTION_FEATURE_COUNT + 1;

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
	int INSERT_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__AGGREGATE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_VALUE__TYPE = INSTRUCTION_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FenceImpl <em>Fence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FenceImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFence()
	 * @generated
	 */
	int FENCE = 13;

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
	int CMP_XCHG = 14;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__ADRESS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compare val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__COMPARE_VAL = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>New val</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__NEW_VAL = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG__ORDERING = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cmp Xchg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMP_XCHG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl <em>Atomic RMW</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AtomicRMWImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAtomicRMW()
	 * @generated
	 */
	int ATOMIC_RMW = 15;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__ADRESS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW__ORDERING = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atomic RMW</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_RMW_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LoadImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 16;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ADRESS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__ORDERING = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__INDEX = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.StoreImpl <em>Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.StoreImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getStore()
	 * @generated
	 */
	int STORE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ADRESS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__ORDERING = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__INDEX = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CallImpl <em>Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CallImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCall()
	 * @generated
	 */
	int CALL = 18;

	/**
	 * The feature id for the '<em><b>Pointer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__POINTER = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PList</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL__PLIST = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.AllocImpl <em>Alloc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.AllocImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAlloc()
	 * @generated
	 */
	int ALLOC = 19;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC__TYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Num Elements</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC__NUM_ELEMENTS = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Alloc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOC_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.PHIImpl <em>PHI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.PHIImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getPHI()
	 * @generated
	 */
	int PHI = 20;

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
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.CompareImpl <em>Compare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.CompareImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getCompare()
	 * @generated
	 */
	int COMPARE = 30;

	/**
	 * The number of structural features of the '<em>Compare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ValuePairImpl <em>Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ValuePairImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getValuePair()
	 * @generated
	 */
	int VALUE_PAIR = 21;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PAIR__VALUE1 = COMPARE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PAIR__VALUE2 = COMPARE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_PAIR_FEATURE_COUNT = COMPARE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl <em>Landing Pad</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LandingPadImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLandingPad()
	 * @generated
	 */
	int LANDING_PAD = 22;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__TYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Personality</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__PERSONALITY = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__CLAUSE = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Personalitytype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__PERSONALITYTYPE = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Personalityfunction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__PERSONALITYFUNCTION = INSTRUCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__VALUE = INSTRUCTION_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Castto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD__CASTTO = INSTRUCTION_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Landing Pad</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LANDING_PAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.SelectImpl <em>Select</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.SelectImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSelect()
	 * @generated
	 */
	int SELECT = 24;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__CONDITION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Val1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL1 = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Val2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT__VAL2 = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Select</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELECT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.VA_ArgImpl <em>VA Arg</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.VA_ArgImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getVA_Arg()
	 * @generated
	 */
	int VA_ARG = 25;

	/**
	 * The feature id for the '<em><b>List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG__LIST = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arg Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG__ARG_TYPE = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>VA Arg</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VA_ARG_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ExtractElementImpl <em>Extract Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ExtractElementImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getExtractElement()
	 * @generated
	 */
	int EXTRACT_ELEMENT = 26;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__VECTOR = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT__INDEX = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extract Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRACT_ELEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl <em>Insert Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InsertElementImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInsertElement()
	 * @generated
	 */
	int INSERT_ELEMENT = 27;

	/**
	 * The feature id for the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__VECTOR = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scalar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__SCALAR = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT__INDEX = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Insert Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_ELEMENT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl <em>Shuffle Vector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getShuffleVector()
	 * @generated
	 */
	int SHUFFLE_VECTOR = 28;

	/**
	 * The feature id for the '<em><b>Vector1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VECTOR1 = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Vector2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__VECTOR2 = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR__MASK = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shuffle Vector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHUFFLE_VECTOR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

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
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Castto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST__CASTTO = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Cast</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAST_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl <em>ARITHMETIC OP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getARITHMETIC_OP()
	 * @generated
	 */
	int ARITHMETIC_OP = 31;

	/**
	 * The number of structural features of the '<em>ARITHMETIC OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_OP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LOGICAL_OPImpl <em>LOGICAL OP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LOGICAL_OPImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLOGICAL_OP()
	 * @generated
	 */
	int LOGICAL_OP = 32;

	/**
	 * The number of structural features of the '<em>LOGICAL OP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGICAL_OP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.Ret_InstrImpl <em>Ret Instr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.Ret_InstrImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getRet_Instr()
	 * @generated
	 */
	int RET_INSTR = 45;

	/**
	 * The number of structural features of the '<em>Ret Instr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RET_INSTR_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl <em>Indirect Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.IndirectBranchImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getIndirectBranch()
	 * @generated
	 */
	int INDIRECT_BRANCH = 34;

	/**
	 * The feature id for the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH__ADRESS = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>LList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH__LLIST = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Indirect Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDIRECT_BRANCH_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.LabelListImpl <em>Label List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.LabelListImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLabelList()
	 * @generated
	 */
	int LABEL_LIST = 35;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_LIST__LABELS = 0;

	/**
	 * The number of structural features of the '<em>Label List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_LIST_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.SwitchImpl <em>Switch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.SwitchImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getSwitch()
	 * @generated
	 */
	int SWITCH = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__VALUE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__DEFAULT = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>JTable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH__JTABLE = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Switch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWITCH_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.JumpTableImpl <em>Jump Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.JumpTableImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getJumpTable()
	 * @generated
	 */
	int JUMP_TABLE = 37;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TABLE__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Destinations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TABLE__DESTINATIONS = 1;

	/**
	 * The number of structural features of the '<em>Jump Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUMP_TABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.InvokeImpl <em>Invoke</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.InvokeImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInvoke()
	 * @generated
	 */
	int INVOKE = 38;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__FUNCTION = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>PList</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__PLIST = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__TO = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unwind</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE__UNWIND = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Invoke</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVOKE_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.ResumeImpl <em>Resume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.ResumeImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getResume()
	 * @generated
	 */
	int RESUME = 39;

	/**
	 * The number of structural features of the '<em>Resume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESUME_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.UnreachableImpl <em>Unreachable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.UnreachableImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getUnreachable()
	 * @generated
	 */
	int UNREACHABLE = 40;

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
	int RETURN = 41;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__VALUE = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.BranchImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 42;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__DESTINATION = RET_INSTR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cond</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__COND = RET_INSTR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_TRUE = RET_INSTR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__LABEL_FALSE = RET_INSTR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = RET_INSTR_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link de.upb.llvm_parser.llvm.impl.FunctionBodyImpl <em>Function Body</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.llvm_parser.llvm.impl.FunctionBodyImpl
	 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getFunctionBody()
	 * @generated
	 */
	int FUNCTION_BODY = 43;

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
	int BASIC_BLOCK = 44;

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.FunctionHeader#getPl <em>Pl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pl</em>'.
	 * @see de.upb.llvm_parser.llvm.FunctionHeader#getPl()
	 * @see #getFunctionHeader()
	 * @generated
	 */
	EAttribute getFunctionHeader_Pl();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Aggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate</em>'.
	 * @see de.upb.llvm_parser.llvm.Aggregate
	 * @generated
	 */
	EClass getAggregate();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.llvm.Aggregate#getAgg <em>Agg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Agg</em>'.
	 * @see de.upb.llvm_parser.llvm.Aggregate#getAgg()
	 * @see #getAggregate()
	 * @generated
	 */
	EAttribute getAggregate_Agg();

	/**
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.LocalVar <em>Local Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Var</em>'.
	 * @see de.upb.llvm_parser.llvm.LocalVar
	 * @generated
	 */
	EClass getLocalVar();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LocalVar#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.LocalVar#getType()
	 * @see #getLocalVar()
	 * @generated
	 */
	EAttribute getLocalVar_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LocalVar#getInstr <em>Instr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Instr</em>'.
	 * @see de.upb.llvm_parser.llvm.LocalVar#getInstr()
	 * @see #getLocalVar()
	 * @generated
	 */
	EReference getLocalVar_Instr();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LocalVar#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Alias</em>'.
	 * @see de.upb.llvm_parser.llvm.LocalVar#getAlias()
	 * @see #getLocalVar()
	 * @generated
	 */
	EReference getLocalVar_Alias();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Alias#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.Alias#getType()
	 * @see #getAlias()
	 * @generated
	 */
	EReference getAlias_Type();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.TypeAndValue <em>Type And Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type And Value</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeAndValue
	 * @generated
	 */
	EClass getTypeAndValue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.TypeAndValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeAndValue#getType()
	 * @see #getTypeAndValue()
	 * @generated
	 */
	EAttribute getTypeAndValue_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.TypeAndValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeAndValue#getValue()
	 * @see #getTypeAndValue()
	 * @generated
	 */
	EAttribute getTypeAndValue_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.TypeAndValue#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregate</em>'.
	 * @see de.upb.llvm_parser.llvm.TypeAndValue#getAggregate()
	 * @see #getTypeAndValue()
	 * @generated
	 */
	EReference getTypeAndValue_Aggregate();

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
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.GetElementPtr#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pointer</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getPointer()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EReference getGetElementPtr_Pointer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.GetElementPtr#getParams <em>Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Params</em>'.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr#getParams()
	 * @see #getGetElementPtr()
	 * @generated
	 */
	EReference getGetElementPtr_Params();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ExtractValue#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregate</em>'.
	 * @see de.upb.llvm_parser.llvm.ExtractValue#getAggregate()
	 * @see #getExtractValue()
	 * @generated
	 */
	EReference getExtractValue_Aggregate();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertValue#getAggregate <em>Aggregate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Aggregate</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getAggregate()
	 * @see #getInsertValue()
	 * @generated
	 */
	EReference getInsertValue_Aggregate();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.InsertValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertValue#getType()
	 * @see #getInsertValue()
	 * @generated
	 */
	EAttribute getInsertValue_Type();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getCompare_val <em>Compare val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compare val</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getCompare_val()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EReference getCmpXchg_Compare_val();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.CmpXchg#getNew_val <em>New val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>New val</em>'.
	 * @see de.upb.llvm_parser.llvm.CmpXchg#getNew_val()
	 * @see #getCmpXchg()
	 * @generated
	 */
	EReference getCmpXchg_New_val();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.AtomicRMW#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW#getValue()
	 * @see #getAtomicRMW()
	 * @generated
	 */
	EReference getAtomicRMW_Value();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Call#getPointer <em>Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pointer</em>'.
	 * @see de.upb.llvm_parser.llvm.Call#getPointer()
	 * @see #getCall()
	 * @generated
	 */
	EReference getCall_Pointer();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Call#getPList <em>PList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PList</em>'.
	 * @see de.upb.llvm_parser.llvm.Call#getPList()
	 * @see #getCall()
	 * @generated
	 */
	EAttribute getCall_PList();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Alloc#getNumElements <em>Num Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Num Elements</em>'.
	 * @see de.upb.llvm_parser.llvm.Alloc#getNumElements()
	 * @see #getAlloc()
	 * @generated
	 */
	EReference getAlloc_NumElements();

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
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.LandingPad#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getType()
	 * @see #getLandingPad()
	 * @generated
	 */
	EAttribute getLandingPad_Type();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.LandingPad#getPersonality <em>Personality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personality</em>'.
	 * @see de.upb.llvm_parser.llvm.LandingPad#getPersonality()
	 * @see #getLandingPad()
	 * @generated
	 */
	EReference getLandingPad_Personality();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clause</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause
	 * @generated
	 */
	EClass getClause();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.Clause#getFilter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filter</em>'.
	 * @see de.upb.llvm_parser.llvm.Clause#getFilter()
	 * @see #getClause()
	 * @generated
	 */
	EReference getClause_Filter();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getVal1 <em>Val1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val1</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal1()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Val1();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Select#getVal2 <em>Val2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Val2</em>'.
	 * @see de.upb.llvm_parser.llvm.Select#getVal2()
	 * @see #getSelect()
	 * @generated
	 */
	EReference getSelect_Val2();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.VA_Arg#getList <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>List</em>'.
	 * @see de.upb.llvm_parser.llvm.VA_Arg#getList()
	 * @see #getVA_Arg()
	 * @generated
	 */
	EReference getVA_Arg_List();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.InsertElement#getScalar <em>Scalar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scalar</em>'.
	 * @see de.upb.llvm_parser.llvm.InsertElement#getScalar()
	 * @see #getInsertElement()
	 * @generated
	 */
	EReference getInsertElement_Scalar();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVector1 <em>Vector1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vector1</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVector1()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EReference getShuffleVector_Vector1();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVector2 <em>Vector2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vector2</em>'.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector#getVector2()
	 * @see #getShuffleVector()
	 * @generated
	 */
	EReference getShuffleVector_Vector2();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Cast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cast</em>'.
	 * @see de.upb.llvm_parser.llvm.Cast
	 * @generated
	 */
	EClass getCast();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compare</em>'.
	 * @see de.upb.llvm_parser.llvm.Compare
	 * @generated
	 */
	EClass getCompare();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.LOGICAL_OP <em>LOGICAL OP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LOGICAL OP</em>'.
	 * @see de.upb.llvm_parser.llvm.LOGICAL_OP
	 * @generated
	 */
	EClass getLOGICAL_OP();

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
	 * Returns the meta object for class '{@link de.upb.llvm_parser.llvm.IndirectBranch <em>Indirect Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indirect Branch</em>'.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch
	 * @generated
	 */
	EClass getIndirectBranch();

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
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.LabelList#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see de.upb.llvm_parser.llvm.LabelList#getLabels()
	 * @see #getLabelList()
	 * @generated
	 */
	EReference getLabelList_Labels();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Switch#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getValue()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Value();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Switch#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Default</em>'.
	 * @see de.upb.llvm_parser.llvm.Switch#getDefault()
	 * @see #getSwitch()
	 * @generated
	 */
	EReference getSwitch_Default();

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
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.JumpTable#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see de.upb.llvm_parser.llvm.JumpTable#getValues()
	 * @see #getJumpTable()
	 * @generated
	 */
	EReference getJumpTable_Values();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.llvm.JumpTable#getDestinations <em>Destinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Destinations</em>'.
	 * @see de.upb.llvm_parser.llvm.JumpTable#getDestinations()
	 * @see #getJumpTable()
	 * @generated
	 */
	EReference getJumpTable_Destinations();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getFunction()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Function();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.llvm_parser.llvm.Invoke#getPList <em>PList</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PList</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getPList()
	 * @see #getInvoke()
	 * @generated
	 */
	EAttribute getInvoke_PList();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getTo()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_To();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Invoke#getUnwind <em>Unwind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Unwind</em>'.
	 * @see de.upb.llvm_parser.llvm.Invoke#getUnwind()
	 * @see #getInvoke()
	 * @generated
	 */
	EReference getInvoke_Unwind();

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
	 * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.llvm.Branch#getCond <em>Cond</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cond</em>'.
	 * @see de.upb.llvm_parser.llvm.Branch#getCond()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Cond();

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
		 * The meta object literal for the '<em><b>Pl</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_HEADER__PL = eINSTANCE.getFunctionHeader_Pl();

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
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.AggregateImpl <em>Aggregate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.AggregateImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getAggregate()
		 * @generated
		 */
		EClass AGGREGATE = eINSTANCE.getAggregate();

		/**
		 * The meta object literal for the '<em><b>Agg</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATE__AGG = eINSTANCE.getAggregate_Agg();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.LocalVarImpl <em>Local Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.LocalVarImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getLocalVar()
		 * @generated
		 */
		EClass LOCAL_VAR = eINSTANCE.getLocalVar();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_VAR__TYPE = eINSTANCE.getLocalVar_Type();

		/**
		 * The meta object literal for the '<em><b>Instr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VAR__INSTR = eINSTANCE.getLocalVar_Instr();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VAR__ALIAS = eINSTANCE.getLocalVar_Alias();

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
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALIAS__TYPE = eINSTANCE.getAlias_Type();

		/**
		 * The meta object literal for the '<em><b>Aliasee</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALIAS__ALIASEE = eINSTANCE.getAlias_Aliasee();

		/**
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.TypeAndValueImpl <em>Type And Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.TypeAndValueImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getTypeAndValue()
		 * @generated
		 */
		EClass TYPE_AND_VALUE = eINSTANCE.getTypeAndValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_AND_VALUE__TYPE = eINSTANCE.getTypeAndValue_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_AND_VALUE__VALUE = eINSTANCE.getTypeAndValue_Value();

		/**
		 * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_AND_VALUE__AGGREGATE = eINSTANCE.getTypeAndValue_Aggregate();

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
		 * The meta object literal for the '<em><b>Pointer</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_ELEMENT_PTR__POINTER = eINSTANCE.getGetElementPtr_Pointer();

		/**
		 * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_ELEMENT_PTR__PARAMS = eINSTANCE.getGetElementPtr_Params();

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
		 * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTRACT_VALUE__AGGREGATE = eINSTANCE.getExtractValue_Aggregate();

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
		 * The meta object literal for the '<em><b>Aggregate</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_VALUE__AGGREGATE = eINSTANCE.getInsertValue_Aggregate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERT_VALUE__TYPE = eINSTANCE.getInsertValue_Type();

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
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_XCHG__ADRESS = eINSTANCE.getCmpXchg_Adress();

		/**
		 * The meta object literal for the '<em><b>Compare val</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_XCHG__COMPARE_VAL = eINSTANCE.getCmpXchg_Compare_val();

		/**
		 * The meta object literal for the '<em><b>New val</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMP_XCHG__NEW_VAL = eINSTANCE.getCmpXchg_New_val();

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
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RMW__ADRESS = eINSTANCE.getAtomicRMW_Adress();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_RMW__VALUE = eINSTANCE.getAtomicRMW_Value();

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
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE__VALUE = eINSTANCE.getStore_Value();

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
		 * The meta object literal for the '<em><b>Pointer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL__POINTER = eINSTANCE.getCall_Pointer();

		/**
		 * The meta object literal for the '<em><b>PList</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL__PLIST = eINSTANCE.getCall_PList();

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
		 * The meta object literal for the '<em><b>Num Elements</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOC__NUM_ELEMENTS = eINSTANCE.getAlloc_NumElements();

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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAD__TYPE = eINSTANCE.getLandingPad_Type();

		/**
		 * The meta object literal for the '<em><b>Personality</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAD__PERSONALITY = eINSTANCE.getLandingPad_Personality();

		/**
		 * The meta object literal for the '<em><b>Clause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LANDING_PAD__CLAUSE = eINSTANCE.getLandingPad_Clause();

		/**
		 * The meta object literal for the '<em><b>Personalitytype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LANDING_PAD__PERSONALITYTYPE = eINSTANCE.getLandingPad_Personalitytype();

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
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ClauseImpl <em>Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ClauseImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getClause()
		 * @generated
		 */
		EClass CLAUSE = eINSTANCE.getClause();

		/**
		 * The meta object literal for the '<em><b>Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAUSE__FILTER = eINSTANCE.getClause_Filter();

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
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__CONDITION = eINSTANCE.getSelect_Condition();

		/**
		 * The meta object literal for the '<em><b>Val1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__VAL1 = eINSTANCE.getSelect_Val1();

		/**
		 * The meta object literal for the '<em><b>Val2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELECT__VAL2 = eINSTANCE.getSelect_Val2();

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
		 * The meta object literal for the '<em><b>List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VA_ARG__LIST = eINSTANCE.getVA_Arg_List();

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
		 * The meta object literal for the '<em><b>Vector</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_ELEMENT__VECTOR = eINSTANCE.getInsertElement_Vector();

		/**
		 * The meta object literal for the '<em><b>Scalar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERT_ELEMENT__SCALAR = eINSTANCE.getInsertElement_Scalar();

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
		 * The meta object literal for the '<em><b>Vector1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUFFLE_VECTOR__VECTOR1 = eINSTANCE.getShuffleVector_Vector1();

		/**
		 * The meta object literal for the '<em><b>Vector2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUFFLE_VECTOR__VECTOR2 = eINSTANCE.getShuffleVector_Vector2();

		/**
		 * The meta object literal for the '<em><b>Mask</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHUFFLE_VECTOR__MASK = eINSTANCE.getShuffleVector_Mask();

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
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CAST__VALUE = eINSTANCE.getCast_Value();

		/**
		 * The meta object literal for the '<em><b>Castto</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAST__CASTTO = eINSTANCE.getCast_Castto();

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
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl <em>ARITHMETIC OP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.ARITHMETIC_OPImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getARITHMETIC_OP()
		 * @generated
		 */
		EClass ARITHMETIC_OP = eINSTANCE.getARITHMETIC_OP();

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
		 * The meta object literal for the '{@link de.upb.llvm_parser.llvm.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.llvm_parser.llvm.impl.InstructionImpl
		 * @see de.upb.llvm_parser.llvm.impl.LlvmPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

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
		 * The meta object literal for the '<em><b>Adress</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INDIRECT_BRANCH__ADRESS = eINSTANCE.getIndirectBranch_Adress();

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
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL_LIST__LABELS = eINSTANCE.getLabelList_Labels();

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
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__VALUE = eINSTANCE.getSwitch_Value();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWITCH__DEFAULT = eINSTANCE.getSwitch_Default();

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
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_TABLE__VALUES = eINSTANCE.getJumpTable_Values();

		/**
		 * The meta object literal for the '<em><b>Destinations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JUMP_TABLE__DESTINATIONS = eINSTANCE.getJumpTable_Destinations();

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
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__FUNCTION = eINSTANCE.getInvoke_Function();

		/**
		 * The meta object literal for the '<em><b>PList</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVOKE__PLIST = eINSTANCE.getInvoke_PList();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__TO = eINSTANCE.getInvoke_To();

		/**
		 * The meta object literal for the '<em><b>Unwind</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVOKE__UNWIND = eINSTANCE.getInvoke_Unwind();

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
		 * The meta object literal for the '<em><b>Destination</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__DESTINATION = eINSTANCE.getBranch_Destination();

		/**
		 * The meta object literal for the '<em><b>Cond</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__COND = eINSTANCE.getBranch_Cond();

		/**
		 * The meta object literal for the '<em><b>Label True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__LABEL_TRUE = eINSTANCE.getBranch_LabelTrue();

		/**
		 * The meta object literal for the '<em><b>Label False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__LABEL_FALSE = eINSTANCE.getBranch_LabelFalse();

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

	}

} //LlvmPackage
