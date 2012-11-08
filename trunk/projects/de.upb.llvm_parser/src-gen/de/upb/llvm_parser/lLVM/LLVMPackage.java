/**
 */
package de.upb.llvm_parser.lLVM;

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
 * @see de.upb.llvm_parser.lLVM.LLVMFactory
 * @model kind="package"
 * @generated
 */
public interface LLVMPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lLVM";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.upb.de/llvm_parser/LLVM";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lLVM";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LLVMPackage eINSTANCE = de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl.init();

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.LLVMImpl <em>LLVM</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.LLVMImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLLVM()
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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.AbstractElementImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getAbstractElement()
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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.ClauseImpl <em>Clause</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.ClauseImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getClause()
   * @generated
   */
  int CLAUSE = 18;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.TypeAndValueImpl <em>Type And Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.TypeAndValueImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getTypeAndValue()
   * @generated
   */
  int TYPE_AND_VALUE = 2;

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
   * The number of structural features of the '<em>Type And Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_AND_VALUE_FEATURE_COUNT = CLAUSE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.MainLevelEntityImpl <em>Main Level Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.MainLevelEntityImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getMainLevelEntity()
   * @generated
   */
  int MAIN_LEVEL_ENTITY = 43;

  /**
   * The number of structural features of the '<em>Main Level Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAIN_LEVEL_ENTITY_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.LocalVarImpl <em>Local Var</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.LocalVarImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLocalVar()
   * @generated
   */
  int LOCAL_VAR = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR__NAME = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR__INSTR = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Var</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VAR_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.InstructionImpl <em>Instruction</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.InstructionImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getInstruction()
   * @generated
   */
  int INSTRUCTION = 28;

  /**
   * The number of structural features of the '<em>Instruction</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.GetElementPtrImpl <em>Get Element Ptr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.GetElementPtrImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getGetElementPtr()
   * @generated
   */
  int GET_ELEMENT_PTR = 4;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.ExtractValueImpl <em>Extract Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.ExtractValueImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getExtractValue()
   * @generated
   */
  int EXTRACT_VALUE = 5;

  /**
   * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_VALUE__AGGREGATE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_VALUE__INDEX = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extract Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTRACT_VALUE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.InsertValueImpl <em>Insert Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.InsertValueImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getInsertValue()
   * @generated
   */
  int INSERT_VALUE = 6;

  /**
   * The feature id for the '<em><b>Aggregate</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_VALUE__AGGREGATE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_VALUE__VALUE = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_VALUE__INDEX = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Insert Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSERT_VALUE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.FenceImpl <em>Fence</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.FenceImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getFence()
   * @generated
   */
  int FENCE = 7;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.CmpXchgImpl <em>Cmp Xchg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.CmpXchgImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getCmpXchg()
   * @generated
   */
  int CMP_XCHG = 8;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.AtomicRMWImpl <em>Atomic RMW</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.AtomicRMWImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getAtomicRMW()
   * @generated
   */
  int ATOMIC_RMW = 9;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.LoadImpl <em>Load</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.LoadImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLoad()
   * @generated
   */
  int LOAD = 10;

  /**
   * The feature id for the '<em><b>Adress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__ADRESS = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__ALIGN = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__INDEX = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ordering</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD__ORDERING = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Load</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.StoreImpl <em>Store</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.StoreImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getStore()
   * @generated
   */
  int STORE = 11;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.CallImpl <em>Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.CallImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getCall()
   * @generated
   */
  int CALL = 12;

  /**
   * The feature id for the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL__POINTER = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Plist</b></em>' containment reference.
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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.AllocImpl <em>Alloc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.AllocImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getAlloc()
   * @generated
   */
  int ALLOC = 13;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.ParameterListImpl <em>Parameter List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.ParameterListImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getParameterList()
   * @generated
   */
  int PARAMETER_LIST = 14;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.PHIImpl <em>PHI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.PHIImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getPHI()
   * @generated
   */
  int PHI = 15;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.CompareImpl <em>Compare</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.CompareImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getCompare()
   * @generated
   */
  int COMPARE = 25;

  /**
   * The number of structural features of the '<em>Compare</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.ValuePairImpl <em>Value Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.ValuePairImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getValuePair()
   * @generated
   */
  int VALUE_PAIR = 16;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.LandingPadImpl <em>Landing Pad</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.LandingPadImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLandingPad()
   * @generated
   */
  int LANDING_PAD = 17;

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
   * The number of structural features of the '<em>Landing Pad</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANDING_PAD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.SelectImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 19;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.VA_ArgImpl <em>VA Arg</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.VA_ArgImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getVA_Arg()
   * @generated
   */
  int VA_ARG = 20;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.ExtractElementImpl <em>Extract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.ExtractElementImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getExtractElement()
   * @generated
   */
  int EXTRACT_ELEMENT = 21;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.InsertElementImpl <em>Insert Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.InsertElementImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getInsertElement()
   * @generated
   */
  int INSERT_ELEMENT = 22;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.ShuffleVectorImpl <em>Shuffle Vector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.ShuffleVectorImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getShuffleVector()
   * @generated
   */
  int SHUFFLE_VECTOR = 23;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.CastImpl <em>Cast</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.CastImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getCast()
   * @generated
   */
  int CAST = 24;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.ArithmeticImpl <em>Arithmetic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.ArithmeticImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getArithmetic()
   * @generated
   */
  int ARITHMETIC = 26;

  /**
   * The number of structural features of the '<em>Arithmetic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARITHMETIC_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.LogicalImpl <em>Logical</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.LogicalImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLogical()
   * @generated
   */
  int LOGICAL = 27;

  /**
   * The number of structural features of the '<em>Logical</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOGICAL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.IndirectBranchImpl <em>Indirect Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.IndirectBranchImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getIndirectBranch()
   * @generated
   */
  int INDIRECT_BRANCH = 29;

  /**
   * The feature id for the '<em><b>Adress</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_BRANCH__ADRESS = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>LList</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_BRANCH__LLIST = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Indirect Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INDIRECT_BRANCH_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.LabelListImpl <em>Label List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.LabelListImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLabelList()
   * @generated
   */
  int LABEL_LIST = 30;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.SwitchImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 31;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__DEFAULT = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>JTable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__JTABLE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.JumpTableImpl <em>Jump Table</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.JumpTableImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getJumpTable()
   * @generated
   */
  int JUMP_TABLE = 32;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.InvokeImpl <em>Invoke</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.InvokeImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getInvoke()
   * @generated
   */
  int INVOKE = 33;

  /**
   * The feature id for the '<em><b>Function</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__FUNCTION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>PList</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__PLIST = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>To</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__TO = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Unwind</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE__UNWIND = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Invoke</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INVOKE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.ResumeImpl <em>Resume</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.ResumeImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getResume()
   * @generated
   */
  int RESUME = 34;

  /**
   * The number of structural features of the '<em>Resume</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RESUME_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.ReturnImpl <em>Return</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.ReturnImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getReturn()
   * @generated
   */
  int RETURN = 35;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.BranchImpl <em>Branch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.BranchImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getBranch()
   * @generated
   */
  int BRANCH = 36;

  /**
   * The feature id for the '<em><b>Destination</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__DESTINATION = INSTRUCTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cond</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__COND = INSTRUCTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Label True</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__LABEL_TRUE = INSTRUCTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Label False</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH__LABEL_FALSE = INSTRUCTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Branch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BRANCH_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.FunctionBodyImpl <em>Function Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.FunctionBodyImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getFunctionBody()
   * @generated
   */
  int FUNCTION_BODY = 37;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.BasicBlockImpl <em>Basic Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.BasicBlockImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getBasicBlock()
   * @generated
   */
  int BASIC_BLOCK = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BASIC_BLOCK__NAME = 0;

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
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.LabelStrImpl <em>Label Str</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.LabelStrImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLabelStr()
   * @generated
   */
  int LABEL_STR = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_STR__NAME = 0;

  /**
   * The number of structural features of the '<em>Label Str</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_STR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.FunctionHeaderImpl <em>Function Header</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.FunctionHeaderImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getFunctionHeader()
   * @generated
   */
  int FUNCTION_HEADER = 40;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__RETURN_TYPE = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__NAME = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>PList</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER__PLIST = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Function Header</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_HEADER_FEATURE_COUNT = MAIN_LEVEL_ENTITY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.GlobalNameImpl <em>Global Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.GlobalNameImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getGlobalName()
   * @generated
   */
  int GLOBAL_NAME = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Global Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GLOBAL_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link de.upb.llvm_parser.lLVM.impl.UnNammedAddrImpl <em>Un Nammed Addr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.upb.llvm_parser.lLVM.impl.UnNammedAddrImpl
   * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getUnNammedAddr()
   * @generated
   */
  int UN_NAMMED_ADDR = 42;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_NAMMED_ADDR__RETURN_TYPE = FUNCTION_HEADER__RETURN_TYPE;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_NAMMED_ADDR__NAME = FUNCTION_HEADER__NAME;

  /**
   * The feature id for the '<em><b>PList</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_NAMMED_ADDR__PLIST = FUNCTION_HEADER__PLIST;

  /**
   * The feature id for the '<em><b>Adress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_NAMMED_ADDR__ADRESS = FUNCTION_HEADER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Un Nammed Addr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UN_NAMMED_ADDR_FEATURE_COUNT = FUNCTION_HEADER_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.LLVM <em>LLVM</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>LLVM</em>'.
   * @see de.upb.llvm_parser.lLVM.LLVM
   * @generated
   */
  EClass getLLVM();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.LLVM#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see de.upb.llvm_parser.lLVM.LLVM#getElements()
   * @see #getLLVM()
   * @generated
   */
  EReference getLLVM_Elements();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see de.upb.llvm_parser.lLVM.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.TypeAndValue <em>Type And Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type And Value</em>'.
   * @see de.upb.llvm_parser.lLVM.TypeAndValue
   * @generated
   */
  EClass getTypeAndValue();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.TypeAndValue#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.upb.llvm_parser.lLVM.TypeAndValue#getType()
   * @see #getTypeAndValue()
   * @generated
   */
  EAttribute getTypeAndValue_Type();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.TypeAndValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see de.upb.llvm_parser.lLVM.TypeAndValue#getValue()
   * @see #getTypeAndValue()
   * @generated
   */
  EAttribute getTypeAndValue_Value();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.LocalVar <em>Local Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Var</em>'.
   * @see de.upb.llvm_parser.lLVM.LocalVar
   * @generated
   */
  EClass getLocalVar();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.LocalVar#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.upb.llvm_parser.lLVM.LocalVar#getName()
   * @see #getLocalVar()
   * @generated
   */
  EAttribute getLocalVar_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.LocalVar#getInstr <em>Instr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Instr</em>'.
   * @see de.upb.llvm_parser.lLVM.LocalVar#getInstr()
   * @see #getLocalVar()
   * @generated
   */
  EReference getLocalVar_Instr();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.GetElementPtr <em>Get Element Ptr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Element Ptr</em>'.
   * @see de.upb.llvm_parser.lLVM.GetElementPtr
   * @generated
   */
  EClass getGetElementPtr();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.GetElementPtr#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pointer</em>'.
   * @see de.upb.llvm_parser.lLVM.GetElementPtr#getPointer()
   * @see #getGetElementPtr()
   * @generated
   */
  EReference getGetElementPtr_Pointer();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.GetElementPtr#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.upb.llvm_parser.lLVM.GetElementPtr#getParams()
   * @see #getGetElementPtr()
   * @generated
   */
  EReference getGetElementPtr_Params();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.ExtractValue <em>Extract Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extract Value</em>'.
   * @see de.upb.llvm_parser.lLVM.ExtractValue
   * @generated
   */
  EClass getExtractValue();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.ExtractValue#getAggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aggregate</em>'.
   * @see de.upb.llvm_parser.lLVM.ExtractValue#getAggregate()
   * @see #getExtractValue()
   * @generated
   */
  EReference getExtractValue_Aggregate();

  /**
   * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.lLVM.ExtractValue#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Index</em>'.
   * @see de.upb.llvm_parser.lLVM.ExtractValue#getIndex()
   * @see #getExtractValue()
   * @generated
   */
  EAttribute getExtractValue_Index();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.InsertValue <em>Insert Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Value</em>'.
   * @see de.upb.llvm_parser.lLVM.InsertValue
   * @generated
   */
  EClass getInsertValue();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.InsertValue#getAggregate <em>Aggregate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Aggregate</em>'.
   * @see de.upb.llvm_parser.lLVM.InsertValue#getAggregate()
   * @see #getInsertValue()
   * @generated
   */
  EReference getInsertValue_Aggregate();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.InsertValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.lLVM.InsertValue#getValue()
   * @see #getInsertValue()
   * @generated
   */
  EReference getInsertValue_Value();

  /**
   * Returns the meta object for the attribute list '{@link de.upb.llvm_parser.lLVM.InsertValue#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Index</em>'.
   * @see de.upb.llvm_parser.lLVM.InsertValue#getIndex()
   * @see #getInsertValue()
   * @generated
   */
  EAttribute getInsertValue_Index();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Fence <em>Fence</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fence</em>'.
   * @see de.upb.llvm_parser.lLVM.Fence
   * @generated
   */
  EClass getFence();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.Fence#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see de.upb.llvm_parser.lLVM.Fence#getOrdering()
   * @see #getFence()
   * @generated
   */
  EAttribute getFence_Ordering();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.CmpXchg <em>Cmp Xchg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cmp Xchg</em>'.
   * @see de.upb.llvm_parser.lLVM.CmpXchg
   * @generated
   */
  EClass getCmpXchg();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.CmpXchg#getAdress <em>Adress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adress</em>'.
   * @see de.upb.llvm_parser.lLVM.CmpXchg#getAdress()
   * @see #getCmpXchg()
   * @generated
   */
  EReference getCmpXchg_Adress();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.CmpXchg#getCompare_val <em>Compare val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compare val</em>'.
   * @see de.upb.llvm_parser.lLVM.CmpXchg#getCompare_val()
   * @see #getCmpXchg()
   * @generated
   */
  EReference getCmpXchg_Compare_val();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.CmpXchg#getNew_val <em>New val</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>New val</em>'.
   * @see de.upb.llvm_parser.lLVM.CmpXchg#getNew_val()
   * @see #getCmpXchg()
   * @generated
   */
  EReference getCmpXchg_New_val();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.CmpXchg#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see de.upb.llvm_parser.lLVM.CmpXchg#getOrdering()
   * @see #getCmpXchg()
   * @generated
   */
  EAttribute getCmpXchg_Ordering();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.AtomicRMW <em>Atomic RMW</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic RMW</em>'.
   * @see de.upb.llvm_parser.lLVM.AtomicRMW
   * @generated
   */
  EClass getAtomicRMW();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.AtomicRMW#getAdress <em>Adress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adress</em>'.
   * @see de.upb.llvm_parser.lLVM.AtomicRMW#getAdress()
   * @see #getAtomicRMW()
   * @generated
   */
  EReference getAtomicRMW_Adress();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.AtomicRMW#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.lLVM.AtomicRMW#getValue()
   * @see #getAtomicRMW()
   * @generated
   */
  EReference getAtomicRMW_Value();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.AtomicRMW#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see de.upb.llvm_parser.lLVM.AtomicRMW#getOrdering()
   * @see #getAtomicRMW()
   * @generated
   */
  EAttribute getAtomicRMW_Ordering();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Load <em>Load</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load</em>'.
   * @see de.upb.llvm_parser.lLVM.Load
   * @generated
   */
  EClass getLoad();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Load#getAdress <em>Adress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adress</em>'.
   * @see de.upb.llvm_parser.lLVM.Load#getAdress()
   * @see #getLoad()
   * @generated
   */
  EReference getLoad_Adress();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.Load#getAlign <em>Align</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Align</em>'.
   * @see de.upb.llvm_parser.lLVM.Load#getAlign()
   * @see #getLoad()
   * @generated
   */
  EAttribute getLoad_Align();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.Load#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see de.upb.llvm_parser.lLVM.Load#getIndex()
   * @see #getLoad()
   * @generated
   */
  EAttribute getLoad_Index();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.Load#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see de.upb.llvm_parser.lLVM.Load#getOrdering()
   * @see #getLoad()
   * @generated
   */
  EAttribute getLoad_Ordering();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Store</em>'.
   * @see de.upb.llvm_parser.lLVM.Store
   * @generated
   */
  EClass getStore();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Store#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.lLVM.Store#getValue()
   * @see #getStore()
   * @generated
   */
  EReference getStore_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Store#getAdress <em>Adress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adress</em>'.
   * @see de.upb.llvm_parser.lLVM.Store#getAdress()
   * @see #getStore()
   * @generated
   */
  EReference getStore_Adress();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.Store#getOrdering <em>Ordering</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Ordering</em>'.
   * @see de.upb.llvm_parser.lLVM.Store#getOrdering()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Ordering();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.Store#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Index</em>'.
   * @see de.upb.llvm_parser.lLVM.Store#getIndex()
   * @see #getStore()
   * @generated
   */
  EAttribute getStore_Index();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call</em>'.
   * @see de.upb.llvm_parser.lLVM.Call
   * @generated
   */
  EClass getCall();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Call#getPointer <em>Pointer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pointer</em>'.
   * @see de.upb.llvm_parser.lLVM.Call#getPointer()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Pointer();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Call#getPlist <em>Plist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Plist</em>'.
   * @see de.upb.llvm_parser.lLVM.Call#getPlist()
   * @see #getCall()
   * @generated
   */
  EReference getCall_Plist();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Alloc <em>Alloc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alloc</em>'.
   * @see de.upb.llvm_parser.lLVM.Alloc
   * @generated
   */
  EClass getAlloc();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.Alloc#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.upb.llvm_parser.lLVM.Alloc#getType()
   * @see #getAlloc()
   * @generated
   */
  EAttribute getAlloc_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Alloc#getNumElements <em>Num Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Num Elements</em>'.
   * @see de.upb.llvm_parser.lLVM.Alloc#getNumElements()
   * @see #getAlloc()
   * @generated
   */
  EReference getAlloc_NumElements();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter List</em>'.
   * @see de.upb.llvm_parser.lLVM.ParameterList
   * @generated
   */
  EClass getParameterList();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.ParameterList#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see de.upb.llvm_parser.lLVM.ParameterList#getParams()
   * @see #getParameterList()
   * @generated
   */
  EReference getParameterList_Params();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.PHI <em>PHI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>PHI</em>'.
   * @see de.upb.llvm_parser.lLVM.PHI
   * @generated
   */
  EClass getPHI();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.PHI#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see de.upb.llvm_parser.lLVM.PHI#getValues()
   * @see #getPHI()
   * @generated
   */
  EReference getPHI_Values();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.ValuePair <em>Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Value Pair</em>'.
   * @see de.upb.llvm_parser.lLVM.ValuePair
   * @generated
   */
  EClass getValuePair();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.ValuePair#getValue1 <em>Value1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value1</em>'.
   * @see de.upb.llvm_parser.lLVM.ValuePair#getValue1()
   * @see #getValuePair()
   * @generated
   */
  EAttribute getValuePair_Value1();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.ValuePair#getValue2 <em>Value2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value2</em>'.
   * @see de.upb.llvm_parser.lLVM.ValuePair#getValue2()
   * @see #getValuePair()
   * @generated
   */
  EAttribute getValuePair_Value2();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.LandingPad <em>Landing Pad</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Landing Pad</em>'.
   * @see de.upb.llvm_parser.lLVM.LandingPad
   * @generated
   */
  EClass getLandingPad();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.LandingPad#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see de.upb.llvm_parser.lLVM.LandingPad#getType()
   * @see #getLandingPad()
   * @generated
   */
  EAttribute getLandingPad_Type();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.LandingPad#getPersonality <em>Personality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Personality</em>'.
   * @see de.upb.llvm_parser.lLVM.LandingPad#getPersonality()
   * @see #getLandingPad()
   * @generated
   */
  EReference getLandingPad_Personality();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.LandingPad#getClause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Clause</em>'.
   * @see de.upb.llvm_parser.lLVM.LandingPad#getClause()
   * @see #getLandingPad()
   * @generated
   */
  EReference getLandingPad_Clause();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Clause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clause</em>'.
   * @see de.upb.llvm_parser.lLVM.Clause
   * @generated
   */
  EClass getClause();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.Clause#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Filter</em>'.
   * @see de.upb.llvm_parser.lLVM.Clause#getFilter()
   * @see #getClause()
   * @generated
   */
  EReference getClause_Filter();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see de.upb.llvm_parser.lLVM.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Select#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see de.upb.llvm_parser.lLVM.Select#getCondition()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Condition();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Select#getVal1 <em>Val1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val1</em>'.
   * @see de.upb.llvm_parser.lLVM.Select#getVal1()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Val1();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Select#getVal2 <em>Val2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Val2</em>'.
   * @see de.upb.llvm_parser.lLVM.Select#getVal2()
   * @see #getSelect()
   * @generated
   */
  EReference getSelect_Val2();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.VA_Arg <em>VA Arg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>VA Arg</em>'.
   * @see de.upb.llvm_parser.lLVM.VA_Arg
   * @generated
   */
  EClass getVA_Arg();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.VA_Arg#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>List</em>'.
   * @see de.upb.llvm_parser.lLVM.VA_Arg#getList()
   * @see #getVA_Arg()
   * @generated
   */
  EReference getVA_Arg_List();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.VA_Arg#getArgType <em>Arg Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Arg Type</em>'.
   * @see de.upb.llvm_parser.lLVM.VA_Arg#getArgType()
   * @see #getVA_Arg()
   * @generated
   */
  EAttribute getVA_Arg_ArgType();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.ExtractElement <em>Extract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extract Element</em>'.
   * @see de.upb.llvm_parser.lLVM.ExtractElement
   * @generated
   */
  EClass getExtractElement();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.ExtractElement#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector</em>'.
   * @see de.upb.llvm_parser.lLVM.ExtractElement#getVector()
   * @see #getExtractElement()
   * @generated
   */
  EReference getExtractElement_Vector();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.ExtractElement#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see de.upb.llvm_parser.lLVM.ExtractElement#getIndex()
   * @see #getExtractElement()
   * @generated
   */
  EReference getExtractElement_Index();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.InsertElement <em>Insert Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Insert Element</em>'.
   * @see de.upb.llvm_parser.lLVM.InsertElement
   * @generated
   */
  EClass getInsertElement();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.InsertElement#getVector <em>Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector</em>'.
   * @see de.upb.llvm_parser.lLVM.InsertElement#getVector()
   * @see #getInsertElement()
   * @generated
   */
  EReference getInsertElement_Vector();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.InsertElement#getScalar <em>Scalar</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Scalar</em>'.
   * @see de.upb.llvm_parser.lLVM.InsertElement#getScalar()
   * @see #getInsertElement()
   * @generated
   */
  EReference getInsertElement_Scalar();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.InsertElement#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see de.upb.llvm_parser.lLVM.InsertElement#getIndex()
   * @see #getInsertElement()
   * @generated
   */
  EReference getInsertElement_Index();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.ShuffleVector <em>Shuffle Vector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shuffle Vector</em>'.
   * @see de.upb.llvm_parser.lLVM.ShuffleVector
   * @generated
   */
  EClass getShuffleVector();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.ShuffleVector#getVector1 <em>Vector1</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector1</em>'.
   * @see de.upb.llvm_parser.lLVM.ShuffleVector#getVector1()
   * @see #getShuffleVector()
   * @generated
   */
  EReference getShuffleVector_Vector1();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.ShuffleVector#getVector2 <em>Vector2</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Vector2</em>'.
   * @see de.upb.llvm_parser.lLVM.ShuffleVector#getVector2()
   * @see #getShuffleVector()
   * @generated
   */
  EReference getShuffleVector_Vector2();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.ShuffleVector#getMask <em>Mask</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mask</em>'.
   * @see de.upb.llvm_parser.lLVM.ShuffleVector#getMask()
   * @see #getShuffleVector()
   * @generated
   */
  EReference getShuffleVector_Mask();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Cast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast</em>'.
   * @see de.upb.llvm_parser.lLVM.Cast
   * @generated
   */
  EClass getCast();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Cast#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.lLVM.Cast#getValue()
   * @see #getCast()
   * @generated
   */
  EReference getCast_Value();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.Cast#getCastto <em>Castto</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Castto</em>'.
   * @see de.upb.llvm_parser.lLVM.Cast#getCastto()
   * @see #getCast()
   * @generated
   */
  EAttribute getCast_Castto();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Compare <em>Compare</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Compare</em>'.
   * @see de.upb.llvm_parser.lLVM.Compare
   * @generated
   */
  EClass getCompare();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Arithmetic <em>Arithmetic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Arithmetic</em>'.
   * @see de.upb.llvm_parser.lLVM.Arithmetic
   * @generated
   */
  EClass getArithmetic();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Logical <em>Logical</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Logical</em>'.
   * @see de.upb.llvm_parser.lLVM.Logical
   * @generated
   */
  EClass getLogical();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instruction</em>'.
   * @see de.upb.llvm_parser.lLVM.Instruction
   * @generated
   */
  EClass getInstruction();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.IndirectBranch <em>Indirect Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Indirect Branch</em>'.
   * @see de.upb.llvm_parser.lLVM.IndirectBranch
   * @generated
   */
  EClass getIndirectBranch();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.IndirectBranch#getAdress <em>Adress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Adress</em>'.
   * @see de.upb.llvm_parser.lLVM.IndirectBranch#getAdress()
   * @see #getIndirectBranch()
   * @generated
   */
  EReference getIndirectBranch_Adress();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.IndirectBranch#getLList <em>LList</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>LList</em>'.
   * @see de.upb.llvm_parser.lLVM.IndirectBranch#getLList()
   * @see #getIndirectBranch()
   * @generated
   */
  EReference getIndirectBranch_LList();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.LabelList <em>Label List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label List</em>'.
   * @see de.upb.llvm_parser.lLVM.LabelList
   * @generated
   */
  EClass getLabelList();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.LabelList#getLabels <em>Labels</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Labels</em>'.
   * @see de.upb.llvm_parser.lLVM.LabelList#getLabels()
   * @see #getLabelList()
   * @generated
   */
  EReference getLabelList_Labels();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see de.upb.llvm_parser.lLVM.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Switch#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.lLVM.Switch#getValue()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Value();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Switch#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default</em>'.
   * @see de.upb.llvm_parser.lLVM.Switch#getDefault()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_Default();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Switch#getJTable <em>JTable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>JTable</em>'.
   * @see de.upb.llvm_parser.lLVM.Switch#getJTable()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_JTable();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.JumpTable <em>Jump Table</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Jump Table</em>'.
   * @see de.upb.llvm_parser.lLVM.JumpTable
   * @generated
   */
  EClass getJumpTable();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.JumpTable#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see de.upb.llvm_parser.lLVM.JumpTable#getValues()
   * @see #getJumpTable()
   * @generated
   */
  EReference getJumpTable_Values();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.JumpTable#getDestinations <em>Destinations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Destinations</em>'.
   * @see de.upb.llvm_parser.lLVM.JumpTable#getDestinations()
   * @see #getJumpTable()
   * @generated
   */
  EReference getJumpTable_Destinations();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Invoke <em>Invoke</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Invoke</em>'.
   * @see de.upb.llvm_parser.lLVM.Invoke
   * @generated
   */
  EClass getInvoke();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Invoke#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Function</em>'.
   * @see de.upb.llvm_parser.lLVM.Invoke#getFunction()
   * @see #getInvoke()
   * @generated
   */
  EReference getInvoke_Function();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Invoke#getPList <em>PList</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>PList</em>'.
   * @see de.upb.llvm_parser.lLVM.Invoke#getPList()
   * @see #getInvoke()
   * @generated
   */
  EReference getInvoke_PList();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Invoke#getTo <em>To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>To</em>'.
   * @see de.upb.llvm_parser.lLVM.Invoke#getTo()
   * @see #getInvoke()
   * @generated
   */
  EReference getInvoke_To();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Invoke#getUnwind <em>Unwind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Unwind</em>'.
   * @see de.upb.llvm_parser.lLVM.Invoke#getUnwind()
   * @see #getInvoke()
   * @generated
   */
  EReference getInvoke_Unwind();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Resume <em>Resume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Resume</em>'.
   * @see de.upb.llvm_parser.lLVM.Resume
   * @generated
   */
  EClass getResume();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return</em>'.
   * @see de.upb.llvm_parser.lLVM.Return
   * @generated
   */
  EClass getReturn();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Return#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see de.upb.llvm_parser.lLVM.Return#getValue()
   * @see #getReturn()
   * @generated
   */
  EReference getReturn_Value();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.Branch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Branch</em>'.
   * @see de.upb.llvm_parser.lLVM.Branch
   * @generated
   */
  EClass getBranch();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Branch#getDestination <em>Destination</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Destination</em>'.
   * @see de.upb.llvm_parser.lLVM.Branch#getDestination()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Destination();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Branch#getCond <em>Cond</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond</em>'.
   * @see de.upb.llvm_parser.lLVM.Branch#getCond()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_Cond();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Branch#getLabelTrue <em>Label True</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label True</em>'.
   * @see de.upb.llvm_parser.lLVM.Branch#getLabelTrue()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_LabelTrue();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.Branch#getLabelFalse <em>Label False</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Label False</em>'.
   * @see de.upb.llvm_parser.lLVM.Branch#getLabelFalse()
   * @see #getBranch()
   * @generated
   */
  EReference getBranch_LabelFalse();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.FunctionBody <em>Function Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Body</em>'.
   * @see de.upb.llvm_parser.lLVM.FunctionBody
   * @generated
   */
  EClass getFunctionBody();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.FunctionBody#getBlocks <em>Blocks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Blocks</em>'.
   * @see de.upb.llvm_parser.lLVM.FunctionBody#getBlocks()
   * @see #getFunctionBody()
   * @generated
   */
  EReference getFunctionBody_Blocks();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.BasicBlock <em>Basic Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Basic Block</em>'.
   * @see de.upb.llvm_parser.lLVM.BasicBlock
   * @generated
   */
  EClass getBasicBlock();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.BasicBlock#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.upb.llvm_parser.lLVM.BasicBlock#getName()
   * @see #getBasicBlock()
   * @generated
   */
  EReference getBasicBlock_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.upb.llvm_parser.lLVM.BasicBlock#getInstructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instructions</em>'.
   * @see de.upb.llvm_parser.lLVM.BasicBlock#getInstructions()
   * @see #getBasicBlock()
   * @generated
   */
  EReference getBasicBlock_Instructions();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.LabelStr <em>Label Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label Str</em>'.
   * @see de.upb.llvm_parser.lLVM.LabelStr
   * @generated
   */
  EClass getLabelStr();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.LabelStr#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.upb.llvm_parser.lLVM.LabelStr#getName()
   * @see #getLabelStr()
   * @generated
   */
  EAttribute getLabelStr_Name();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.FunctionHeader <em>Function Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Header</em>'.
   * @see de.upb.llvm_parser.lLVM.FunctionHeader
   * @generated
   */
  EClass getFunctionHeader();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.FunctionHeader#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Return Type</em>'.
   * @see de.upb.llvm_parser.lLVM.FunctionHeader#getReturnType()
   * @see #getFunctionHeader()
   * @generated
   */
  EAttribute getFunctionHeader_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.FunctionHeader#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see de.upb.llvm_parser.lLVM.FunctionHeader#getName()
   * @see #getFunctionHeader()
   * @generated
   */
  EReference getFunctionHeader_Name();

  /**
   * Returns the meta object for the containment reference '{@link de.upb.llvm_parser.lLVM.FunctionHeader#getPList <em>PList</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>PList</em>'.
   * @see de.upb.llvm_parser.lLVM.FunctionHeader#getPList()
   * @see #getFunctionHeader()
   * @generated
   */
  EReference getFunctionHeader_PList();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.GlobalName <em>Global Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Global Name</em>'.
   * @see de.upb.llvm_parser.lLVM.GlobalName
   * @generated
   */
  EClass getGlobalName();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.GlobalName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.upb.llvm_parser.lLVM.GlobalName#getName()
   * @see #getGlobalName()
   * @generated
   */
  EAttribute getGlobalName_Name();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.UnNammedAddr <em>Un Nammed Addr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Un Nammed Addr</em>'.
   * @see de.upb.llvm_parser.lLVM.UnNammedAddr
   * @generated
   */
  EClass getUnNammedAddr();

  /**
   * Returns the meta object for the attribute '{@link de.upb.llvm_parser.lLVM.UnNammedAddr#getAdress <em>Adress</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Adress</em>'.
   * @see de.upb.llvm_parser.lLVM.UnNammedAddr#getAdress()
   * @see #getUnNammedAddr()
   * @generated
   */
  EAttribute getUnNammedAddr_Adress();

  /**
   * Returns the meta object for class '{@link de.upb.llvm_parser.lLVM.MainLevelEntity <em>Main Level Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Main Level Entity</em>'.
   * @see de.upb.llvm_parser.lLVM.MainLevelEntity
   * @generated
   */
  EClass getMainLevelEntity();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LLVMFactory getLLVMFactory();

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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.LLVMImpl <em>LLVM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.LLVMImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLLVM()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.AbstractElementImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.TypeAndValueImpl <em>Type And Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.TypeAndValueImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getTypeAndValue()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.LocalVarImpl <em>Local Var</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.LocalVarImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLocalVar()
     * @generated
     */
    EClass LOCAL_VAR = eINSTANCE.getLocalVar();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VAR__NAME = eINSTANCE.getLocalVar_Name();

    /**
     * The meta object literal for the '<em><b>Instr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VAR__INSTR = eINSTANCE.getLocalVar_Instr();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.GetElementPtrImpl <em>Get Element Ptr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.GetElementPtrImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getGetElementPtr()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.ExtractValueImpl <em>Extract Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.ExtractValueImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getExtractValue()
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
     * The meta object literal for the '<em><b>Index</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTRACT_VALUE__INDEX = eINSTANCE.getExtractValue_Index();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.InsertValueImpl <em>Insert Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.InsertValueImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getInsertValue()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.FenceImpl <em>Fence</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.FenceImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getFence()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.CmpXchgImpl <em>Cmp Xchg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.CmpXchgImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getCmpXchg()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.AtomicRMWImpl <em>Atomic RMW</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.AtomicRMWImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getAtomicRMW()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.LoadImpl <em>Load</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.LoadImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLoad()
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
     * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD__ALIGN = eINSTANCE.getLoad_Align();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD__INDEX = eINSTANCE.getLoad_Index();

    /**
     * The meta object literal for the '<em><b>Ordering</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD__ORDERING = eINSTANCE.getLoad_Ordering();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.StoreImpl <em>Store</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.StoreImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getStore()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.CallImpl <em>Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.CallImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getCall()
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
     * The meta object literal for the '<em><b>Plist</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALL__PLIST = eINSTANCE.getCall_Plist();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.AllocImpl <em>Alloc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.AllocImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getAlloc()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.ParameterListImpl <em>Parameter List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.ParameterListImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getParameterList()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.PHIImpl <em>PHI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.PHIImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getPHI()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.ValuePairImpl <em>Value Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.ValuePairImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getValuePair()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.LandingPadImpl <em>Landing Pad</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.LandingPadImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLandingPad()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.ClauseImpl <em>Clause</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.ClauseImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getClause()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.SelectImpl <em>Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.SelectImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getSelect()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.VA_ArgImpl <em>VA Arg</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.VA_ArgImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getVA_Arg()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.ExtractElementImpl <em>Extract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.ExtractElementImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getExtractElement()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.InsertElementImpl <em>Insert Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.InsertElementImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getInsertElement()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.ShuffleVectorImpl <em>Shuffle Vector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.ShuffleVectorImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getShuffleVector()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.CastImpl <em>Cast</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.CastImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getCast()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.CompareImpl <em>Compare</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.CompareImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getCompare()
     * @generated
     */
    EClass COMPARE = eINSTANCE.getCompare();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.ArithmeticImpl <em>Arithmetic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.ArithmeticImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getArithmetic()
     * @generated
     */
    EClass ARITHMETIC = eINSTANCE.getArithmetic();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.LogicalImpl <em>Logical</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.LogicalImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLogical()
     * @generated
     */
    EClass LOGICAL = eINSTANCE.getLogical();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.InstructionImpl <em>Instruction</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.InstructionImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getInstruction()
     * @generated
     */
    EClass INSTRUCTION = eINSTANCE.getInstruction();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.IndirectBranchImpl <em>Indirect Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.IndirectBranchImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getIndirectBranch()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.LabelListImpl <em>Label List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.LabelListImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLabelList()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.SwitchImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getSwitch()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.JumpTableImpl <em>Jump Table</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.JumpTableImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getJumpTable()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.InvokeImpl <em>Invoke</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.InvokeImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getInvoke()
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
     * The meta object literal for the '<em><b>PList</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INVOKE__PLIST = eINSTANCE.getInvoke_PList();

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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.ResumeImpl <em>Resume</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.ResumeImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getResume()
     * @generated
     */
    EClass RESUME = eINSTANCE.getResume();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.ReturnImpl <em>Return</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.ReturnImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getReturn()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.BranchImpl <em>Branch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.BranchImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getBranch()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.FunctionBodyImpl <em>Function Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.FunctionBodyImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getFunctionBody()
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
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.BasicBlockImpl <em>Basic Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.BasicBlockImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getBasicBlock()
     * @generated
     */
    EClass BASIC_BLOCK = eINSTANCE.getBasicBlock();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_BLOCK__NAME = eINSTANCE.getBasicBlock_Name();

    /**
     * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BASIC_BLOCK__INSTRUCTIONS = eINSTANCE.getBasicBlock_Instructions();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.LabelStrImpl <em>Label Str</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.LabelStrImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getLabelStr()
     * @generated
     */
    EClass LABEL_STR = eINSTANCE.getLabelStr();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL_STR__NAME = eINSTANCE.getLabelStr_Name();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.FunctionHeaderImpl <em>Function Header</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.FunctionHeaderImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getFunctionHeader()
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
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_HEADER__NAME = eINSTANCE.getFunctionHeader_Name();

    /**
     * The meta object literal for the '<em><b>PList</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_HEADER__PLIST = eINSTANCE.getFunctionHeader_PList();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.GlobalNameImpl <em>Global Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.GlobalNameImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getGlobalName()
     * @generated
     */
    EClass GLOBAL_NAME = eINSTANCE.getGlobalName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GLOBAL_NAME__NAME = eINSTANCE.getGlobalName_Name();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.UnNammedAddrImpl <em>Un Nammed Addr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.UnNammedAddrImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getUnNammedAddr()
     * @generated
     */
    EClass UN_NAMMED_ADDR = eINSTANCE.getUnNammedAddr();

    /**
     * The meta object literal for the '<em><b>Adress</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UN_NAMMED_ADDR__ADRESS = eINSTANCE.getUnNammedAddr_Adress();

    /**
     * The meta object literal for the '{@link de.upb.llvm_parser.lLVM.impl.MainLevelEntityImpl <em>Main Level Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.upb.llvm_parser.lLVM.impl.MainLevelEntityImpl
     * @see de.upb.llvm_parser.lLVM.impl.LLVMPackageImpl#getMainLevelEntity()
     * @generated
     */
    EClass MAIN_LEVEL_ENTITY = eINSTANCE.getMainLevelEntity();

  }

} //LLVMPackage
