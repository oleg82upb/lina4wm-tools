/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.llvm_parser.llvm.LlvmPackage
 * @generated
 */
public interface LlvmFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LlvmFactory eINSTANCE = de.upb.llvm_parser.llvm.impl.LlvmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>LLVM</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>LLVM</em>'.
   * @generated
   */
  LLVM createLLVM();

  /**
   * Returns a new object of class '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Element</em>'.
   * @generated
   */
  AbstractElement createAbstractElement();

  /**
   * Returns a new object of class '<em>Top Level Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Top Level Entity</em>'.
   * @generated
   */
  TopLevelEntity createTopLevelEntity();

  /**
   * Returns a new object of class '<em>Main Level Entity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Main Level Entity</em>'.
   * @generated
   */
  MainLevelEntity createMainLevelEntity();

  /**
   * Returns a new object of class '<em>Function Header</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Header</em>'.
   * @generated
   */
  FunctionHeader createFunctionHeader();

  /**
   * Returns a new object of class '<em>Type List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type List</em>'.
   * @generated
   */
  TypeList createTypeList();

  /**
   * Returns a new object of class '<em>Aggregate</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aggregate</em>'.
   * @generated
   */
  Aggregate createAggregate();

  /**
   * Returns a new object of class '<em>Local Var</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Var</em>'.
   * @generated
   */
  LocalVar createLocalVar();

  /**
   * Returns a new object of class '<em>Local Type</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Type</em>'.
   * @generated
   */
  LocalType createLocalType();

  /**
   * Returns a new object of class '<em>Local Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Instruction</em>'.
   * @generated
   */
  LocalInstruction createLocalInstruction();

  /**
   * Returns a new object of class '<em>Local Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Local Alias</em>'.
   * @generated
   */
  LocalAlias createLocalAlias();

  /**
   * Returns a new object of class '<em>Type And Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type And Value</em>'.
   * @generated
   */
  TypeAndValue createTypeAndValue();

  /**
   * Returns a new object of class '<em>Get Element Ptr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Get Element Ptr</em>'.
   * @generated
   */
  GetElementPtr createGetElementPtr();

  /**
   * Returns a new object of class '<em>Extract Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extract Value</em>'.
   * @generated
   */
  ExtractValue createExtractValue();

  /**
   * Returns a new object of class '<em>Insert Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Value</em>'.
   * @generated
   */
  InsertValue createInsertValue();

  /**
   * Returns a new object of class '<em>Fence</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fence</em>'.
   * @generated
   */
  Fence createFence();

  /**
   * Returns a new object of class '<em>Cmp Xchg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cmp Xchg</em>'.
   * @generated
   */
  CmpXchg createCmpXchg();

  /**
   * Returns a new object of class '<em>Atomic RMW</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Atomic RMW</em>'.
   * @generated
   */
  AtomicRMW createAtomicRMW();

  /**
   * Returns a new object of class '<em>Load</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load</em>'.
   * @generated
   */
  Load createLoad();

  /**
   * Returns a new object of class '<em>Store</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Store</em>'.
   * @generated
   */
  Store createStore();

  /**
   * Returns a new object of class '<em>Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Call</em>'.
   * @generated
   */
  Call createCall();

  /**
   * Returns a new object of class '<em>Alloc</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Alloc</em>'.
   * @generated
   */
  Alloc createAlloc();

  /**
   * Returns a new object of class '<em>Parameter List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter List</em>'.
   * @generated
   */
  ParameterList createParameterList();

  /**
   * Returns a new object of class '<em>PHI</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>PHI</em>'.
   * @generated
   */
  PHI createPHI();

  /**
   * Returns a new object of class '<em>Value Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Value Pair</em>'.
   * @generated
   */
  ValuePair createValuePair();

  /**
   * Returns a new object of class '<em>Landing Pad</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Landing Pad</em>'.
   * @generated
   */
  LandingPad createLandingPad();

  /**
   * Returns a new object of class '<em>Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clause</em>'.
   * @generated
   */
  Clause createClause();

  /**
   * Returns a new object of class '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select</em>'.
   * @generated
   */
  Select createSelect();

  /**
   * Returns a new object of class '<em>VA Arg</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>VA Arg</em>'.
   * @generated
   */
  VA_Arg createVA_Arg();

  /**
   * Returns a new object of class '<em>Extract Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extract Element</em>'.
   * @generated
   */
  ExtractElement createExtractElement();

  /**
   * Returns a new object of class '<em>Insert Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Insert Element</em>'.
   * @generated
   */
  InsertElement createInsertElement();

  /**
   * Returns a new object of class '<em>Shuffle Vector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shuffle Vector</em>'.
   * @generated
   */
  ShuffleVector createShuffleVector();

  /**
   * Returns a new object of class '<em>Cast</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cast</em>'.
   * @generated
   */
  Cast createCast();

  /**
   * Returns a new object of class '<em>Compare</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Compare</em>'.
   * @generated
   */
  Compare createCompare();

  /**
   * Returns a new object of class '<em>Arithmetic</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Arithmetic</em>'.
   * @generated
   */
  Arithmetic createArithmetic();

  /**
   * Returns a new object of class '<em>Logical</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical</em>'.
   * @generated
   */
  Logical createLogical();

  /**
   * Returns a new object of class '<em>Instruction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instruction</em>'.
   * @generated
   */
  Instruction createInstruction();

  /**
   * Returns a new object of class '<em>Indirect Branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Indirect Branch</em>'.
   * @generated
   */
  IndirectBranch createIndirectBranch();

  /**
   * Returns a new object of class '<em>Label List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label List</em>'.
   * @generated
   */
  LabelList createLabelList();

  /**
   * Returns a new object of class '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Switch</em>'.
   * @generated
   */
  Switch createSwitch();

  /**
   * Returns a new object of class '<em>Jump Table</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jump Table</em>'.
   * @generated
   */
  JumpTable createJumpTable();

  /**
   * Returns a new object of class '<em>Invoke</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Invoke</em>'.
   * @generated
   */
  Invoke createInvoke();

  /**
   * Returns a new object of class '<em>Resume</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Resume</em>'.
   * @generated
   */
  Resume createResume();

  /**
   * Returns a new object of class '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return</em>'.
   * @generated
   */
  Return createReturn();

  /**
   * Returns a new object of class '<em>Branch</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Branch</em>'.
   * @generated
   */
  Branch createBranch();

  /**
   * Returns a new object of class '<em>Function Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Body</em>'.
   * @generated
   */
  FunctionBody createFunctionBody();

  /**
   * Returns a new object of class '<em>Basic Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Basic Block</em>'.
   * @generated
   */
  BasicBlock createBasicBlock();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  LlvmPackage getLlvmPackage();

} //LlvmFactory
