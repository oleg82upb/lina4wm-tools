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
public class LlvmFactoryImpl extends EFactoryImpl implements LlvmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LlvmFactory init() {
		try {
			LlvmFactory theLlvmFactory = (LlvmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.upb.de/llvm_parser/llvm"); 
			if (theLlvmFactory != null) {
				return theLlvmFactory;
			}
		}
		catch (Exception exception) {
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
	public LlvmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LlvmPackage.LLVM: return createLLVM();
			case LlvmPackage.ABSTRACT_ELEMENT: return createAbstractElement();
			case LlvmPackage.TOP_LEVEL_ENTITY: return createTopLevelEntity();
			case LlvmPackage.MAIN_LEVEL_ENTITY: return createMainLevelEntity();
			case LlvmPackage.NAMED_TYPE: return createNamedType();
			case LlvmPackage.CAST_STRUCTURE: return createCastStructure();
			case LlvmPackage.ARRAY: return createARRAY();
			case LlvmPackage.VALUE_STRUCT: return createValueStruct();
			case LlvmPackage.STRUCTURE: return createStructure();
			case LlvmPackage.ALIAS: return createAlias();
			case LlvmPackage.FUNCTION_HEADER: return createFunctionHeader();
			case LlvmPackage.PARAMETER_LIST: return createParameterList();
			case LlvmPackage.FUNCTION_BODY: return createFunctionBody();
			case LlvmPackage.BASIC_BLOCK: return createBasicBlock();
			case LlvmPackage.RET_INSTR: return createRet_Instr();
			case LlvmPackage.TYPE_LIST: return createTypeList();
			case LlvmPackage.INSTRUCTION: return createInstruction();
			case LlvmPackage.GET_ELEMENT_PTR: return createGetElementPtr();
			case LlvmPackage.EXTRACT_VALUE: return createExtractValue();
			case LlvmPackage.INSERT_VALUE: return createInsertValue();
			case LlvmPackage.FENCE: return createFence();
			case LlvmPackage.CMP_XCHG: return createCmpXchg();
			case LlvmPackage.ATOMIC_RMW: return createAtomicRMW();
			case LlvmPackage.LOAD: return createLoad();
			case LlvmPackage.STORE: return createStore();
			case LlvmPackage.CALL: return createCall();
			case LlvmPackage.ALLOC: return createAlloc();
			case LlvmPackage.PHI: return createPHI();
			case LlvmPackage.VALUE_PAIR: return createValuePair();
			case LlvmPackage.LANDING_PAD: return createLandingPad();
			case LlvmPackage.CLAUSE: return createClause();
			case LlvmPackage.SELECT: return createSelect();
			case LlvmPackage.VA_ARG: return createVA_Arg();
			case LlvmPackage.EXTRACT_ELEMENT: return createExtractElement();
			case LlvmPackage.INSERT_ELEMENT: return createInsertElement();
			case LlvmPackage.SHUFFLE_VECTOR: return createShuffleVector();
			case LlvmPackage.CAST: return createCast();
			case LlvmPackage.COMPARE: return createCompare();
			case LlvmPackage.ARITHMETIC_OP: return createARITHMETIC_OP();
			case LlvmPackage.LOGICAL_OP: return createLOGICAL_OP();
			case LlvmPackage.INDIRECT_BRANCH: return createIndirectBranch();
			case LlvmPackage.LABEL_LIST: return createLabelList();
			case LlvmPackage.SWITCH: return createSwitch();
			case LlvmPackage.JUMP_TABLE: return createJumpTable();
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
	public LLVM createLLVM() {
		LLVMImpl llvm = new LLVMImpl();
		return llvm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractElement createAbstractElement() {
		AbstractElementImpl abstractElement = new AbstractElementImpl();
		return abstractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopLevelEntity createTopLevelEntity() {
		TopLevelEntityImpl topLevelEntity = new TopLevelEntityImpl();
		return topLevelEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MainLevelEntity createMainLevelEntity() {
		MainLevelEntityImpl mainLevelEntity = new MainLevelEntityImpl();
		return mainLevelEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedType createNamedType() {
		NamedTypeImpl namedType = new NamedTypeImpl();
		return namedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastStructure createCastStructure() {
		CastStructureImpl castStructure = new CastStructureImpl();
		return castStructure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAY createARRAY() {
		ARRAYImpl array = new ARRAYImpl();
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueStruct createValueStruct() {
		ValueStructImpl valueStruct = new ValueStructImpl();
		return valueStruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure createStructure() {
		StructureImpl structure = new StructureImpl();
		return structure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alias createAlias() {
		AliasImpl alias = new AliasImpl();
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionHeader createFunctionHeader() {
		FunctionHeaderImpl functionHeader = new FunctionHeaderImpl();
		return functionHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList createParameterList() {
		ParameterListImpl parameterList = new ParameterListImpl();
		return parameterList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionBody createFunctionBody() {
		FunctionBodyImpl functionBody = new FunctionBodyImpl();
		return functionBody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicBlock createBasicBlock() {
		BasicBlockImpl basicBlock = new BasicBlockImpl();
		return basicBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ret_Instr createRet_Instr() {
		Ret_InstrImpl ret_Instr = new Ret_InstrImpl();
		return ret_Instr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeList createTypeList() {
		TypeListImpl typeList = new TypeListImpl();
		return typeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetElementPtr createGetElementPtr() {
		GetElementPtrImpl getElementPtr = new GetElementPtrImpl();
		return getElementPtr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractValue createExtractValue() {
		ExtractValueImpl extractValue = new ExtractValueImpl();
		return extractValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertValue createInsertValue() {
		InsertValueImpl insertValue = new InsertValueImpl();
		return insertValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fence createFence() {
		FenceImpl fence = new FenceImpl();
		return fence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmpXchg createCmpXchg() {
		CmpXchgImpl cmpXchg = new CmpXchgImpl();
		return cmpXchg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicRMW createAtomicRMW() {
		AtomicRMWImpl atomicRMW = new AtomicRMWImpl();
		return atomicRMW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Store createStore() {
		StoreImpl store = new StoreImpl();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Call createCall() {
		CallImpl call = new CallImpl();
		return call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alloc createAlloc() {
		AllocImpl alloc = new AllocImpl();
		return alloc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PHI createPHI() {
		PHIImpl phi = new PHIImpl();
		return phi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuePair createValuePair() {
		ValuePairImpl valuePair = new ValuePairImpl();
		return valuePair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LandingPad createLandingPad() {
		LandingPadImpl landingPad = new LandingPadImpl();
		return landingPad;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clause createClause() {
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Select createSelect() {
		SelectImpl select = new SelectImpl();
		return select;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VA_Arg createVA_Arg() {
		VA_ArgImpl vA_Arg = new VA_ArgImpl();
		return vA_Arg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtractElement createExtractElement() {
		ExtractElementImpl extractElement = new ExtractElementImpl();
		return extractElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsertElement createInsertElement() {
		InsertElementImpl insertElement = new InsertElementImpl();
		return insertElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShuffleVector createShuffleVector() {
		ShuffleVectorImpl shuffleVector = new ShuffleVectorImpl();
		return shuffleVector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cast createCast() {
		CastImpl cast = new CastImpl();
		return cast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compare createCompare() {
		CompareImpl compare = new CompareImpl();
		return compare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARITHMETIC_OP createARITHMETIC_OP() {
		ARITHMETIC_OPImpl arithmetiC_OP = new ARITHMETIC_OPImpl();
		return arithmetiC_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LOGICAL_OP createLOGICAL_OP() {
		LOGICAL_OPImpl logicaL_OP = new LOGICAL_OPImpl();
		return logicaL_OP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndirectBranch createIndirectBranch() {
		IndirectBranchImpl indirectBranch = new IndirectBranchImpl();
		return indirectBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelList createLabelList() {
		LabelListImpl labelList = new LabelListImpl();
		return labelList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch createSwitch() {
		SwitchImpl switch_ = new SwitchImpl();
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JumpTable createJumpTable() {
		JumpTableImpl jumpTable = new JumpTableImpl();
		return jumpTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Invoke createInvoke() {
		InvokeImpl invoke = new InvokeImpl();
		return invoke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Resume createResume() {
		ResumeImpl resume = new ResumeImpl();
		return resume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unreachable createUnreachable() {
		UnreachableImpl unreachable = new UnreachableImpl();
		return unreachable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LlvmPackage getLlvmPackage() {
		return (LlvmPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LlvmPackage getPackage() {
		return LlvmPackage.eINSTANCE;
	}

} //LlvmFactoryImpl
