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
public class LlvmFactoryImpl extends EFactoryImpl implements LlvmFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LlvmFactory init()
  {
    try
    {
      LlvmFactory theLlvmFactory = (LlvmFactory)EPackage.Registry.INSTANCE.getEFactory(LlvmPackage.eNS_URI);
      if (theLlvmFactory != null)
      {
        return theLlvmFactory;
      }
    }
    catch (Exception exception)
    {
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
  public LlvmFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LlvmPackage.LLVM: return createLLVM();
      case LlvmPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case LlvmPackage.TOP_LEVEL_ENTITY: return createTopLevelEntity();
      case LlvmPackage.MAIN_LEVEL_ENTITY: return createMainLevelEntity();
      case LlvmPackage.TYPE_DEFINITION: return createTypeDefinition();
      case LlvmPackage.GLOBAL_DEFINITION: return createGlobalDefinition();
      case LlvmPackage.FUNCTION_DEFINITION: return createFunctionDefinition();
      case LlvmPackage.ALIAS_DEFINITION: return createAliasDefinition();
      case LlvmPackage.TYPE_USE: return createTypeUse();
      case LlvmPackage.ADDRESS_USE: return createAddressUse();
      case LlvmPackage.ADDRESS: return createAddress();
      case LlvmPackage.PREDEFINED: return createPredefined();
      case LlvmPackage.VECTOR: return createVector();
      case LlvmPackage.ARRAY: return createArray();
      case LlvmPackage.AGGREGATE_TYPE: return createAggregate_Type();
      case LlvmPackage.CONSTANT: return createConstant();
      case LlvmPackage.PRIMITIVE_VALUE: return createPrimitiveValue();
      case LlvmPackage.VALUE: return createValue();
      case LlvmPackage.VALUE_STRUCT: return createValueStruct();
      case LlvmPackage.STRUCTURE: return createStructure();
      case LlvmPackage.PARAMETER: return createParameter();
      case LlvmPackage.PARAMETER_LIST: return createParameterList();
      case LlvmPackage.FUNCTION_PARAMETER: return createFunctionParameter();
      case LlvmPackage.FUNCTION_PARAMETER_LIST: return createFunctionParameterList();
      case LlvmPackage.FUNCTION_BODY: return createFunctionBody();
      case LlvmPackage.INSTRUCTION: return createInstruction();
      case LlvmPackage.BASIC_BLOCK: return createBasicBlock();
      case LlvmPackage.ARITHMETIC_OPERATION: return createArithmeticOperation();
      case LlvmPackage.LOGIC_OPERATION: return createLogicOperation();
      case LlvmPackage.CAST: return createCast();
      case LlvmPackage.NESTED_CAST: return createNestedCast();
      case LlvmPackage.META_ARG_VALUE: return createMetaArgValue();
      case LlvmPackage.META: return createMeta();
      case LlvmPackage.METADATA_VALUE: return createMetadataValue();
      case LlvmPackage.GET_ELEMENT_PTR: return createGetElementPtr();
      case LlvmPackage.NESTED_GET_ELEMENT_PTR: return createNestedGetElementPtr();
      case LlvmPackage.FENCE: return createFence();
      case LlvmPackage.CMP_XCHG: return createCmpXchg();
      case LlvmPackage.ATOMIC_RMW: return createAtomicRMW();
      case LlvmPackage.LOAD: return createLoad();
      case LlvmPackage.STORE: return createStore();
      case LlvmPackage.CALL: return createCall();
      case LlvmPackage.ALLOC: return createAlloc();
      case LlvmPackage.PHI_CASE: return createPhiCase();
      case LlvmPackage.PHI: return createPhi();
      case LlvmPackage.LANDING_PAD: return createLandingPad();
      case LlvmPackage.CLAUSE: return createClause();
      case LlvmPackage.SELECT: return createSelect();
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS: return createVariableAttributeAccess();
      case LlvmPackage.EXTRACT_VALUE: return createExtractValue();
      case LlvmPackage.INSERT_VALUE: return createInsertValue();
      case LlvmPackage.EXTRACT_ELEMENT: return createExtractElement();
      case LlvmPackage.INSERT_ELEMENT: return createInsertElement();
      case LlvmPackage.SHUFFLE_VECTOR: return createShuffleVector();
      case LlvmPackage.COMPARE: return createCompare();
      case LlvmPackage.INDIRECT_BRANCH: return createIndirectBranch();
      case LlvmPackage.SWITCH: return createSwitch();
      case LlvmPackage.SWITCH_CASE: return createSwitchCase();
      case LlvmPackage.INVOKE: return createInvoke();
      case LlvmPackage.RESUME: return createResume();
      case LlvmPackage.UNREACHABLE: return createUnreachable();
      case LlvmPackage.RETURN: return createReturn();
      case LlvmPackage.BRANCH: return createBranch();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVM createLLVM()
  {
    LLVMImpl llvm = new LLVMImpl();
    return llvm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TopLevelEntity createTopLevelEntity()
  {
    TopLevelEntityImpl topLevelEntity = new TopLevelEntityImpl();
    return topLevelEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MainLevelEntity createMainLevelEntity()
  {
    MainLevelEntityImpl mainLevelEntity = new MainLevelEntityImpl();
    return mainLevelEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeDefinition createTypeDefinition()
  {
    TypeDefinitionImpl typeDefinition = new TypeDefinitionImpl();
    return typeDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalDefinition createGlobalDefinition()
  {
    GlobalDefinitionImpl globalDefinition = new GlobalDefinitionImpl();
    return globalDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionDefinition createFunctionDefinition()
  {
    FunctionDefinitionImpl functionDefinition = new FunctionDefinitionImpl();
    return functionDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AliasDefinition createAliasDefinition()
  {
    AliasDefinitionImpl aliasDefinition = new AliasDefinitionImpl();
    return aliasDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse createTypeUse()
  {
    TypeUseImpl typeUse = new TypeUseImpl();
    return typeUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AddressUse createAddressUse()
  {
    AddressUseImpl addressUse = new AddressUseImpl();
    return addressUse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Address createAddress()
  {
    AddressImpl address = new AddressImpl();
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Predefined createPredefined()
  {
    PredefinedImpl predefined = new PredefinedImpl();
    return predefined;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Vector createVector()
  {
    VectorImpl vector = new VectorImpl();
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Array createArray()
  {
    ArrayImpl array = new ArrayImpl();
    return array;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aggregate_Type createAggregate_Type()
  {
    Aggregate_TypeImpl aggregate_Type = new Aggregate_TypeImpl();
    return aggregate_Type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Constant createConstant()
  {
    ConstantImpl constant = new ConstantImpl();
    return constant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveValue createPrimitiveValue()
  {
    PrimitiveValueImpl primitiveValue = new PrimitiveValueImpl();
    return primitiveValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value createValue()
  {
    ValueImpl value = new ValueImpl();
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValueStruct createValueStruct()
  {
    ValueStructImpl valueStruct = new ValueStructImpl();
    return valueStruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Structure createStructure()
  {
    StructureImpl structure = new StructureImpl();
    return structure;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList createParameterList()
  {
    ParameterListImpl parameterList = new ParameterListImpl();
    return parameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionParameter createFunctionParameter()
  {
    FunctionParameterImpl functionParameter = new FunctionParameterImpl();
    return functionParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionParameterList createFunctionParameterList()
  {
    FunctionParameterListImpl functionParameterList = new FunctionParameterListImpl();
    return functionParameterList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBody createFunctionBody()
  {
    FunctionBodyImpl functionBody = new FunctionBodyImpl();
    return functionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instruction createInstruction()
  {
    InstructionImpl instruction = new InstructionImpl();
    return instruction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicBlock createBasicBlock()
  {
    BasicBlockImpl basicBlock = new BasicBlockImpl();
    return basicBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArithmeticOperation createArithmeticOperation()
  {
    ArithmeticOperationImpl arithmeticOperation = new ArithmeticOperationImpl();
    return arithmeticOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogicOperation createLogicOperation()
  {
    LogicOperationImpl logicOperation = new LogicOperationImpl();
    return logicOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cast createCast()
  {
    CastImpl cast = new CastImpl();
    return cast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedCast createNestedCast()
  {
    NestedCastImpl nestedCast = new NestedCastImpl();
    return nestedCast;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaArgValue createMetaArgValue()
  {
    MetaArgValueImpl metaArgValue = new MetaArgValueImpl();
    return metaArgValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Meta createMeta()
  {
    MetaImpl meta = new MetaImpl();
    return meta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetadataValue createMetadataValue()
  {
    MetadataValueImpl metadataValue = new MetadataValueImpl();
    return metadataValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GetElementPtr createGetElementPtr()
  {
    GetElementPtrImpl getElementPtr = new GetElementPtrImpl();
    return getElementPtr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NestedGetElementPtr createNestedGetElementPtr()
  {
    NestedGetElementPtrImpl nestedGetElementPtr = new NestedGetElementPtrImpl();
    return nestedGetElementPtr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fence createFence()
  {
    FenceImpl fence = new FenceImpl();
    return fence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CmpXchg createCmpXchg()
  {
    CmpXchgImpl cmpXchg = new CmpXchgImpl();
    return cmpXchg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtomicRMW createAtomicRMW()
  {
    AtomicRMWImpl atomicRMW = new AtomicRMWImpl();
    return atomicRMW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Load createLoad()
  {
    LoadImpl load = new LoadImpl();
    return load;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Store createStore()
  {
    StoreImpl store = new StoreImpl();
    return store;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Call createCall()
  {
    CallImpl call = new CallImpl();
    return call;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alloc createAlloc()
  {
    AllocImpl alloc = new AllocImpl();
    return alloc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PhiCase createPhiCase()
  {
    PhiCaseImpl phiCase = new PhiCaseImpl();
    return phiCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Phi createPhi()
  {
    PhiImpl phi = new PhiImpl();
    return phi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LandingPad createLandingPad()
  {
    LandingPadImpl landingPad = new LandingPadImpl();
    return landingPad;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clause createClause()
  {
    ClauseImpl clause = new ClauseImpl();
    return clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableAttributeAccess createVariableAttributeAccess()
  {
    VariableAttributeAccessImpl variableAttributeAccess = new VariableAttributeAccessImpl();
    return variableAttributeAccess;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtractValue createExtractValue()
  {
    ExtractValueImpl extractValue = new ExtractValueImpl();
    return extractValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertValue createInsertValue()
  {
    InsertValueImpl insertValue = new InsertValueImpl();
    return insertValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExtractElement createExtractElement()
  {
    ExtractElementImpl extractElement = new ExtractElementImpl();
    return extractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertElement createInsertElement()
  {
    InsertElementImpl insertElement = new InsertElementImpl();
    return insertElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ShuffleVector createShuffleVector()
  {
    ShuffleVectorImpl shuffleVector = new ShuffleVectorImpl();
    return shuffleVector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Compare createCompare()
  {
    CompareImpl compare = new CompareImpl();
    return compare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndirectBranch createIndirectBranch()
  {
    IndirectBranchImpl indirectBranch = new IndirectBranchImpl();
    return indirectBranch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch createSwitch()
  {
    SwitchImpl switch_ = new SwitchImpl();
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SwitchCase createSwitchCase()
  {
    SwitchCaseImpl switchCase = new SwitchCaseImpl();
    return switchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Invoke createInvoke()
  {
    InvokeImpl invoke = new InvokeImpl();
    return invoke;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Resume createResume()
  {
    ResumeImpl resume = new ResumeImpl();
    return resume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Unreachable createUnreachable()
  {
    UnreachableImpl unreachable = new UnreachableImpl();
    return unreachable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Branch createBranch()
  {
    BranchImpl branch = new BranchImpl();
    return branch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LlvmPackage getLlvmPackage()
  {
    return (LlvmPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LlvmPackage getPackage()
  {
    return LlvmPackage.eINSTANCE;
  }

} //LlvmFactoryImpl
