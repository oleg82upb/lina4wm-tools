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
	 * Returns a new object of class '<em>Type Definition</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Definition</em>'.
	 * @generated
	 */
  TypeDefinition createTypeDefinition();

  /**
	 * Returns a new object of class '<em>Global Definition</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Definition</em>'.
	 * @generated
	 */
  GlobalDefinition createGlobalDefinition();

  /**
	 * Returns a new object of class '<em>Function Definition</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Definition</em>'.
	 * @generated
	 */
  FunctionDefinition createFunctionDefinition();

  /**
	 * Returns a new object of class '<em>Alias Definition</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Alias Definition</em>'.
	 * @generated
	 */
  AliasDefinition createAliasDefinition();

  /**
	 * Returns a new object of class '<em>Type Use</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Use</em>'.
	 * @generated
	 */
  TypeUse createTypeUse();

  /**
	 * Returns a new object of class '<em>Address Use</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Use</em>'.
	 * @generated
	 */
  AddressUse createAddressUse();

  /**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
  Address createAddress();

  /**
	 * Returns a new object of class '<em>Predefined</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predefined</em>'.
	 * @generated
	 */
  Predefined createPredefined();

  /**
	 * Returns a new object of class '<em>Vector</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vector</em>'.
	 * @generated
	 */
  Vector createVector();

  /**
	 * Returns a new object of class '<em>Array</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Array</em>'.
	 * @generated
	 */
  Array createArray();

  /**
	 * Returns a new object of class '<em>Aggregate Types</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Types</em>'.
	 * @generated
	 */
  Aggregate_Types createAggregate_Types();

  /**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
  Constant createConstant();

  /**
	 * Returns a new object of class '<em>Primitive Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Primitive Value</em>'.
	 * @generated
	 */
  PrimitiveValue createPrimitiveValue();

  /**
	 * Returns a new object of class '<em>Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value</em>'.
	 * @generated
	 */
  Value createValue();

  /**
	 * Returns a new object of class '<em>Value Struct</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Value Struct</em>'.
	 * @generated
	 */
  ValueStruct createValueStruct();

  /**
	 * Returns a new object of class '<em>Structure</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Structure</em>'.
	 * @generated
	 */
  Structure createStructure();

  /**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
  Parameter createParameter();

  /**
	 * Returns a new object of class '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter List</em>'.
	 * @generated
	 */
  ParameterList createParameterList();

  /**
	 * Returns a new object of class '<em>Function Parameter</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Parameter</em>'.
	 * @generated
	 */
  FunctionParameter createFunctionParameter();

  /**
	 * Returns a new object of class '<em>Function Parameter List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Parameter List</em>'.
	 * @generated
	 */
  FunctionParameterList createFunctionParameterList();

  /**
	 * Returns a new object of class '<em>Type List</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type List</em>'.
	 * @generated
	 */
  TypeList createTypeList();

  /**
	 * Returns a new object of class '<em>Function Body</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Body</em>'.
	 * @generated
	 */
  FunctionBody createFunctionBody();

  /**
	 * Returns a new object of class '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instruction</em>'.
	 * @generated
	 */
  Instruction createInstruction();

  /**
	 * Returns a new object of class '<em>Basic Block</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Block</em>'.
	 * @generated
	 */
  BasicBlock createBasicBlock();

  /**
	 * Returns a new object of class '<em>Arithmetic Operation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Arithmetic Operation</em>'.
	 * @generated
	 */
  ArithmeticOperation createArithmeticOperation();

  /**
	 * Returns a new object of class '<em>Logic Operation</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logic Operation</em>'.
	 * @generated
	 */
  LogicOperation createLogicOperation();

  /**
	 * Returns a new object of class '<em>Cast</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cast</em>'.
	 * @generated
	 */
  Cast createCast();

  /**
	 * Returns a new object of class '<em>Nested Cast</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Cast</em>'.
	 * @generated
	 */
  NestedCast createNestedCast();

  /**
	 * Returns a new object of class '<em>Meta Arg Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Arg Value</em>'.
	 * @generated
	 */
  MetaArgValue createMetaArgValue();

  /**
	 * Returns a new object of class '<em>Meta</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta</em>'.
	 * @generated
	 */
  Meta createMeta();

  /**
	 * Returns a new object of class '<em>Metadata Value</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata Value</em>'.
	 * @generated
	 */
  MetadataValue createMetadataValue();

  /**
	 * Returns a new object of class '<em>Get Element Ptr</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Element Ptr</em>'.
	 * @generated
	 */
  GetElementPtr createGetElementPtr();

  /**
	 * Returns a new object of class '<em>Nested Get Element Ptr</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Nested Get Element Ptr</em>'.
	 * @generated
	 */
  NestedGetElementPtr createNestedGetElementPtr();

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
	 * Returns a new object of class '<em>Phi Case</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phi Case</em>'.
	 * @generated
	 */
  PhiCase createPhiCase();

  /**
	 * Returns a new object of class '<em>Phi</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Phi</em>'.
	 * @generated
	 */
  Phi createPhi();

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
	 * Returns a new object of class '<em>Variable Attribute Access</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Attribute Access</em>'.
	 * @generated
	 */
  VariableAttributeAccess createVariableAttributeAccess();

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
	 * Returns a new object of class '<em>Compare</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compare</em>'.
	 * @generated
	 */
  Compare createCompare();

  /**
	 * Returns a new object of class '<em>Indirect Branch</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Indirect Branch</em>'.
	 * @generated
	 */
  IndirectBranch createIndirectBranch();

  /**
	 * Returns a new object of class '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Switch</em>'.
	 * @generated
	 */
  Switch createSwitch();

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
	 * Returns a new object of class '<em>Unreachable</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unreachable</em>'.
	 * @generated
	 */
  Unreachable createUnreachable();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  LlvmPackage getLlvmPackage();

} //LlvmFactory
