/**
 */
package de.upb.llvm_parser.lLVM.impl;

import de.upb.llvm_parser.lLVM.*;

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
public class LLVMFactoryImpl extends EFactoryImpl implements LLVMFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LLVMFactory init()
  {
    try
    {
      LLVMFactory theLLVMFactory = (LLVMFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.upb.de/llvm_parser/LLVM"); 
      if (theLLVMFactory != null)
      {
        return theLLVMFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LLVMFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVMFactoryImpl()
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
      case LLVMPackage.LLVM: return createLLVM();
      case LLVMPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case LLVMPackage.TYPE_AND_VALUE: return createTypeAndValue();
      case LLVMPackage.LOCAL_VAR: return createLocalVar();
      case LLVMPackage.GET_ELEMENT_PTR: return createGetElementPtr();
      case LLVMPackage.EXTRACT_VALUE: return createExtractValue();
      case LLVMPackage.INSERT_VALUE: return createInsertValue();
      case LLVMPackage.FENCE: return createFence();
      case LLVMPackage.CMP_XCHG: return createCmpXchg();
      case LLVMPackage.ATOMIC_RMW: return createAtomicRMW();
      case LLVMPackage.LOAD: return createLoad();
      case LLVMPackage.STORE: return createStore();
      case LLVMPackage.CALL: return createCall();
      case LLVMPackage.ALLOC: return createAlloc();
      case LLVMPackage.PARAMETER_LIST: return createParameterList();
      case LLVMPackage.PHI: return createPHI();
      case LLVMPackage.VALUE_PAIR: return createValuePair();
      case LLVMPackage.LANDING_PAD: return createLandingPad();
      case LLVMPackage.CLAUSE: return createClause();
      case LLVMPackage.SELECT: return createSelect();
      case LLVMPackage.VA_ARG: return createVA_Arg();
      case LLVMPackage.EXTRACT_ELEMENT: return createExtractElement();
      case LLVMPackage.INSERT_ELEMENT: return createInsertElement();
      case LLVMPackage.SHUFFLE_VECTOR: return createShuffleVector();
      case LLVMPackage.CAST: return createCast();
      case LLVMPackage.COMPARE: return createCompare();
      case LLVMPackage.ARITHMETIC: return createArithmetic();
      case LLVMPackage.LOGICAL: return createLogical();
      case LLVMPackage.INSTRUCTION: return createInstruction();
      case LLVMPackage.INDIRECT_BRANCH: return createIndirectBranch();
      case LLVMPackage.LABEL_LIST: return createLabelList();
      case LLVMPackage.SWITCH: return createSwitch();
      case LLVMPackage.JUMP_TABLE: return createJumpTable();
      case LLVMPackage.INVOKE: return createInvoke();
      case LLVMPackage.RESUME: return createResume();
      case LLVMPackage.RETURN: return createReturn();
      case LLVMPackage.BRANCH: return createBranch();
      case LLVMPackage.FUNCTION_BODY: return createFunctionBody();
      case LLVMPackage.BASIC_BLOCK: return createBasicBlock();
      case LLVMPackage.LABEL_STR: return createLabelStr();
      case LLVMPackage.FUNCTION_HEADER: return createFunctionHeader();
      case LLVMPackage.GLOBAL_NAME: return createGlobalName();
      case LLVMPackage.UN_NAMMED_ADDR: return createUnNammedAddr();
      case LLVMPackage.MAIN_LEVEL_ENTITY: return createMainLevelEntity();
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
  public TypeAndValue createTypeAndValue()
  {
    TypeAndValueImpl typeAndValue = new TypeAndValueImpl();
    return typeAndValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVar createLocalVar()
  {
    LocalVarImpl localVar = new LocalVarImpl();
    return localVar;
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
  public PHI createPHI()
  {
    PHIImpl phi = new PHIImpl();
    return phi;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValuePair createValuePair()
  {
    ValuePairImpl valuePair = new ValuePairImpl();
    return valuePair;
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
  public VA_Arg createVA_Arg()
  {
    VA_ArgImpl vA_Arg = new VA_ArgImpl();
    return vA_Arg;
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
  public Arithmetic createArithmetic()
  {
    ArithmeticImpl arithmetic = new ArithmeticImpl();
    return arithmetic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Logical createLogical()
  {
    LogicalImpl logical = new LogicalImpl();
    return logical;
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
  public LabelList createLabelList()
  {
    LabelListImpl labelList = new LabelListImpl();
    return labelList;
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
  public JumpTable createJumpTable()
  {
    JumpTableImpl jumpTable = new JumpTableImpl();
    return jumpTable;
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
  public LabelStr createLabelStr()
  {
    LabelStrImpl labelStr = new LabelStrImpl();
    return labelStr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionHeader createFunctionHeader()
  {
    FunctionHeaderImpl functionHeader = new FunctionHeaderImpl();
    return functionHeader;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GlobalName createGlobalName()
  {
    GlobalNameImpl globalName = new GlobalNameImpl();
    return globalName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnNammedAddr createUnNammedAddr()
  {
    UnNammedAddrImpl unNammedAddr = new UnNammedAddrImpl();
    return unNammedAddr;
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
  public LLVMPackage getLLVMPackage()
  {
    return (LLVMPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LLVMPackage getPackage()
  {
    return LLVMPackage.eINSTANCE;
  }

} //LLVMFactoryImpl
