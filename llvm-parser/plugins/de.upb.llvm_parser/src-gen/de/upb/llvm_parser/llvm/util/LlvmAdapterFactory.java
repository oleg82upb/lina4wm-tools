/**
 */
package de.upb.llvm_parser.llvm.util;

import de.upb.llvm_parser.llvm.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.llvm_parser.llvm.LlvmPackage
 * @generated
 */
public class LlvmAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LlvmPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LlvmAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LlvmPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LlvmSwitch<Adapter> modelSwitch =
		new LlvmSwitch<Adapter>() {
			@Override
			public Adapter caseLLVM(LLVM object) {
				return createLLVMAdapter();
			}
			@Override
			public Adapter caseAbstractElement(AbstractElement object) {
				return createAbstractElementAdapter();
			}
			@Override
			public Adapter caseTopLevelEntity(TopLevelEntity object) {
				return createTopLevelEntityAdapter();
			}
			@Override
			public Adapter caseMainLevelEntity(MainLevelEntity object) {
				return createMainLevelEntityAdapter();
			}
			@Override
			public Adapter caseTypeDefinition(TypeDefinition object) {
				return createTypeDefinitionAdapter();
			}
			@Override
			public Adapter caseGlobalDefinition(GlobalDefinition object) {
				return createGlobalDefinitionAdapter();
			}
			@Override
			public Adapter caseFunctionDefinition(FunctionDefinition object) {
				return createFunctionDefinitionAdapter();
			}
			@Override
			public Adapter caseAliasDefinition(AliasDefinition object) {
				return createAliasDefinitionAdapter();
			}
			@Override
			public Adapter caseTypeUse(TypeUse object) {
				return createTypeUseAdapter();
			}
			@Override
			public Adapter caseAddressUse(AddressUse object) {
				return createAddressUseAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter casePredefined(Predefined object) {
				return createPredefinedAdapter();
			}
			@Override
			public Adapter caseVector(Vector object) {
				return createVectorAdapter();
			}
			@Override
			public Adapter caseArray(Array object) {
				return createArrayAdapter();
			}
			@Override
			public Adapter caseAggregate_Types(Aggregate_Types object) {
				return createAggregate_TypesAdapter();
			}
			@Override
			public Adapter caseConstant(Constant object) {
				return createConstantAdapter();
			}
			@Override
			public Adapter caseNonConstantValue(NonConstantValue object) {
				return createNonConstantValueAdapter();
			}
			@Override
			public Adapter caseValue(Value object) {
				return createValueAdapter();
			}
			@Override
			public Adapter caseValueStruct(ValueStruct object) {
				return createValueStructAdapter();
			}
			@Override
			public Adapter caseStructure(Structure object) {
				return createStructureAdapter();
			}
			@Override
			public Adapter caseParameterList(ParameterList object) {
				return createParameterListAdapter();
			}
			@Override
			public Adapter caseTypeList(TypeList object) {
				return createTypeListAdapter();
			}
			@Override
			public Adapter caseFunctionBody(FunctionBody object) {
				return createFunctionBodyAdapter();
			}
			@Override
			public Adapter caseBasicBlock(BasicBlock object) {
				return createBasicBlockAdapter();
			}
			@Override
			public Adapter caseInstructionUse(InstructionUse object) {
				return createInstructionUseAdapter();
			}
			@Override
			public Adapter caseRet_Instr(Ret_Instr object) {
				return createRet_InstrAdapter();
			}
			@Override
			public Adapter caseInstruction(Instruction object) {
				return createInstructionAdapter();
			}
			@Override
			public Adapter caseARITHMETIC_OP(ARITHMETIC_OP object) {
				return createARITHMETIC_OPAdapter();
			}
			@Override
			public Adapter caseLOGICAL_OP(LOGICAL_OP object) {
				return createLOGICAL_OPAdapter();
			}
			@Override
			public Adapter caseCast(Cast object) {
				return createCastAdapter();
			}
			@Override
			public Adapter caseGetElementPtr(GetElementPtr object) {
				return createGetElementPtrAdapter();
			}
			@Override
			public Adapter caseExtractValue(ExtractValue object) {
				return createExtractValueAdapter();
			}
			@Override
			public Adapter caseInsertValue(InsertValue object) {
				return createInsertValueAdapter();
			}
			@Override
			public Adapter caseFence(Fence object) {
				return createFenceAdapter();
			}
			@Override
			public Adapter caseCmpXchg(CmpXchg object) {
				return createCmpXchgAdapter();
			}
			@Override
			public Adapter caseAtomicRMW(AtomicRMW object) {
				return createAtomicRMWAdapter();
			}
			@Override
			public Adapter caseLoad(Load object) {
				return createLoadAdapter();
			}
			@Override
			public Adapter caseStore(Store object) {
				return createStoreAdapter();
			}
			@Override
			public Adapter caseCall(Call object) {
				return createCallAdapter();
			}
			@Override
			public Adapter caseAlloc(Alloc object) {
				return createAllocAdapter();
			}
			@Override
			public Adapter casePHI(PHI object) {
				return createPHIAdapter();
			}
			@Override
			public Adapter caseValuePair(ValuePair object) {
				return createValuePairAdapter();
			}
			@Override
			public Adapter caseLandingPad(LandingPad object) {
				return createLandingPadAdapter();
			}
			@Override
			public Adapter caseClause(Clause object) {
				return createClauseAdapter();
			}
			@Override
			public Adapter caseSelect(Select object) {
				return createSelectAdapter();
			}
			@Override
			public Adapter caseVA_Arg(VA_Arg object) {
				return createVA_ArgAdapter();
			}
			@Override
			public Adapter caseExtractElement(ExtractElement object) {
				return createExtractElementAdapter();
			}
			@Override
			public Adapter caseInsertElement(InsertElement object) {
				return createInsertElementAdapter();
			}
			@Override
			public Adapter caseShuffleVector(ShuffleVector object) {
				return createShuffleVectorAdapter();
			}
			@Override
			public Adapter caseCompare(Compare object) {
				return createCompareAdapter();
			}
			@Override
			public Adapter caseIndirectBranch(IndirectBranch object) {
				return createIndirectBranchAdapter();
			}
			@Override
			public Adapter caseLabelList(LabelList object) {
				return createLabelListAdapter();
			}
			@Override
			public Adapter caseSwitch(Switch object) {
				return createSwitchAdapter();
			}
			@Override
			public Adapter caseJumpTable(JumpTable object) {
				return createJumpTableAdapter();
			}
			@Override
			public Adapter caseInvoke(Invoke object) {
				return createInvokeAdapter();
			}
			@Override
			public Adapter caseResume(Resume object) {
				return createResumeAdapter();
			}
			@Override
			public Adapter caseUnreachable(Unreachable object) {
				return createUnreachableAdapter();
			}
			@Override
			public Adapter caseReturn(Return object) {
				return createReturnAdapter();
			}
			@Override
			public Adapter caseBranch(Branch object) {
				return createBranchAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.LLVM <em>LLVM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.LLVM
	 * @generated
	 */
	public Adapter createLLVMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.AbstractElement <em>Abstract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.AbstractElement
	 * @generated
	 */
	public Adapter createAbstractElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.TopLevelEntity <em>Top Level Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.TopLevelEntity
	 * @generated
	 */
	public Adapter createTopLevelEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.MainLevelEntity <em>Main Level Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.MainLevelEntity
	 * @generated
	 */
	public Adapter createMainLevelEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.TypeDefinition
	 * @generated
	 */
	public Adapter createTypeDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.GlobalDefinition <em>Global Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.GlobalDefinition
	 * @generated
	 */
	public Adapter createGlobalDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.FunctionDefinition
	 * @generated
	 */
	public Adapter createFunctionDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.AliasDefinition <em>Alias Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.AliasDefinition
	 * @generated
	 */
	public Adapter createAliasDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.TypeUse <em>Type Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.TypeUse
	 * @generated
	 */
	public Adapter createTypeUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.AddressUse <em>Address Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.AddressUse
	 * @generated
	 */
	public Adapter createAddressUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Predefined <em>Predefined</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Predefined
	 * @generated
	 */
	public Adapter createPredefinedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Vector <em>Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Vector
	 * @generated
	 */
	public Adapter createVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Array <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Array
	 * @generated
	 */
	public Adapter createArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Aggregate_Types <em>Aggregate Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Aggregate_Types
	 * @generated
	 */
	public Adapter createAggregate_TypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Constant
	 * @generated
	 */
	public Adapter createConstantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.NonConstantValue <em>Non Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.NonConstantValue
	 * @generated
	 */
	public Adapter createNonConstantValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.ValueStruct <em>Value Struct</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.ValueStruct
	 * @generated
	 */
	public Adapter createValueStructAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Structure <em>Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Structure
	 * @generated
	 */
	public Adapter createStructureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.ParameterList <em>Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.ParameterList
	 * @generated
	 */
	public Adapter createParameterListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.TypeList <em>Type List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.TypeList
	 * @generated
	 */
	public Adapter createTypeListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.FunctionBody <em>Function Body</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.FunctionBody
	 * @generated
	 */
	public Adapter createFunctionBodyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.BasicBlock <em>Basic Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.BasicBlock
	 * @generated
	 */
	public Adapter createBasicBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.InstructionUse <em>Instruction Use</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.InstructionUse
	 * @generated
	 */
	public Adapter createInstructionUseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Ret_Instr <em>Ret Instr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Ret_Instr
	 * @generated
	 */
	public Adapter createRet_InstrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.ARITHMETIC_OP <em>ARITHMETIC OP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.ARITHMETIC_OP
	 * @generated
	 */
	public Adapter createARITHMETIC_OPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.LOGICAL_OP <em>LOGICAL OP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.LOGICAL_OP
	 * @generated
	 */
	public Adapter createLOGICAL_OPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Cast <em>Cast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Cast
	 * @generated
	 */
	public Adapter createCastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.GetElementPtr <em>Get Element Ptr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.GetElementPtr
	 * @generated
	 */
	public Adapter createGetElementPtrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.ExtractValue <em>Extract Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.ExtractValue
	 * @generated
	 */
	public Adapter createExtractValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.InsertValue <em>Insert Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.InsertValue
	 * @generated
	 */
	public Adapter createInsertValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Fence <em>Fence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Fence
	 * @generated
	 */
	public Adapter createFenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.CmpXchg <em>Cmp Xchg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.CmpXchg
	 * @generated
	 */
	public Adapter createCmpXchgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.AtomicRMW <em>Atomic RMW</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.AtomicRMW
	 * @generated
	 */
	public Adapter createAtomicRMWAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Load
	 * @generated
	 */
	public Adapter createLoadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Store <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Store
	 * @generated
	 */
	public Adapter createStoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Call <em>Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Call
	 * @generated
	 */
	public Adapter createCallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Alloc <em>Alloc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Alloc
	 * @generated
	 */
	public Adapter createAllocAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.PHI <em>PHI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.PHI
	 * @generated
	 */
	public Adapter createPHIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.ValuePair <em>Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.ValuePair
	 * @generated
	 */
	public Adapter createValuePairAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.LandingPad <em>Landing Pad</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.LandingPad
	 * @generated
	 */
	public Adapter createLandingPadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Select <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Select
	 * @generated
	 */
	public Adapter createSelectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.VA_Arg <em>VA Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.VA_Arg
	 * @generated
	 */
	public Adapter createVA_ArgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.ExtractElement <em>Extract Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.ExtractElement
	 * @generated
	 */
	public Adapter createExtractElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.InsertElement <em>Insert Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.InsertElement
	 * @generated
	 */
	public Adapter createInsertElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.ShuffleVector <em>Shuffle Vector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.ShuffleVector
	 * @generated
	 */
	public Adapter createShuffleVectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Compare <em>Compare</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Compare
	 * @generated
	 */
	public Adapter createCompareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.IndirectBranch <em>Indirect Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.IndirectBranch
	 * @generated
	 */
	public Adapter createIndirectBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.LabelList <em>Label List</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.LabelList
	 * @generated
	 */
	public Adapter createLabelListAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Switch <em>Switch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Switch
	 * @generated
	 */
	public Adapter createSwitchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.JumpTable <em>Jump Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.JumpTable
	 * @generated
	 */
	public Adapter createJumpTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Invoke <em>Invoke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Invoke
	 * @generated
	 */
	public Adapter createInvokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Resume <em>Resume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Resume
	 * @generated
	 */
	public Adapter createResumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Unreachable <em>Unreachable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Unreachable
	 * @generated
	 */
	public Adapter createUnreachableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Return
	 * @generated
	 */
	public Adapter createReturnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.llvm.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.upb.llvm_parser.llvm.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LlvmAdapterFactory
