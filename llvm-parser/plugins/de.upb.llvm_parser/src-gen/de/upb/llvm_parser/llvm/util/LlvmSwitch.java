/**
 */
package de.upb.llvm_parser.llvm.util;

import de.upb.llvm_parser.llvm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.upb.llvm_parser.llvm.LlvmPackage
 * @generated
 */
public class LlvmSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LlvmPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LlvmSwitch() {
		if (modelPackage == null) {
			modelPackage = LlvmPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case LlvmPackage.LLVM: {
				LLVM llvm = (LLVM)theEObject;
				T result = caseLLVM(llvm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.ABSTRACT_ELEMENT: {
				AbstractElement abstractElement = (AbstractElement)theEObject;
				T result = caseAbstractElement(abstractElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.TOP_LEVEL_ENTITY: {
				TopLevelEntity topLevelEntity = (TopLevelEntity)theEObject;
				T result = caseTopLevelEntity(topLevelEntity);
				if (result == null) result = caseAbstractElement(topLevelEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.MAIN_LEVEL_ENTITY: {
				MainLevelEntity mainLevelEntity = (MainLevelEntity)theEObject;
				T result = caseMainLevelEntity(mainLevelEntity);
				if (result == null) result = caseAbstractElement(mainLevelEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.FUNCTION_HEADER: {
				FunctionHeader functionHeader = (FunctionHeader)theEObject;
				T result = caseFunctionHeader(functionHeader);
				if (result == null) result = caseMainLevelEntity(functionHeader);
				if (result == null) result = caseAbstractElement(functionHeader);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.LOCAL_VAR: {
				LocalVar localVar = (LocalVar)theEObject;
				T result = caseLocalVar(localVar);
				if (result == null) result = caseMainLevelEntity(localVar);
				if (result == null) result = caseAbstractElement(localVar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.LOCAL_TYPE: {
				LocalType localType = (LocalType)theEObject;
				T result = caseLocalType(localType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.LOCAL_INSTRUCTION: {
				LocalInstruction localInstruction = (LocalInstruction)theEObject;
				T result = caseLocalInstruction(localInstruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.LOCAL_ALIAS: {
				LocalAlias localAlias = (LocalAlias)theEObject;
				T result = caseLocalAlias(localAlias);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.TYPE_AND_VALUE: {
				TypeAndValue typeAndValue = (TypeAndValue)theEObject;
				T result = caseTypeAndValue(typeAndValue);
				if (result == null) result = caseClause(typeAndValue);
				if (result == null) result = caseResume(typeAndValue);
				if (result == null) result = caseInstruction(typeAndValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.GET_ELEMENT_PTR: {
				GetElementPtr getElementPtr = (GetElementPtr)theEObject;
				T result = caseGetElementPtr(getElementPtr);
				if (result == null) result = caseInstruction(getElementPtr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.EXTRACT_VALUE: {
				ExtractValue extractValue = (ExtractValue)theEObject;
				T result = caseExtractValue(extractValue);
				if (result == null) result = caseInstruction(extractValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.INSERT_VALUE: {
				InsertValue insertValue = (InsertValue)theEObject;
				T result = caseInsertValue(insertValue);
				if (result == null) result = caseInstruction(insertValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.FENCE: {
				Fence fence = (Fence)theEObject;
				T result = caseFence(fence);
				if (result == null) result = caseInstruction(fence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.CMP_XCHG: {
				CmpXchg cmpXchg = (CmpXchg)theEObject;
				T result = caseCmpXchg(cmpXchg);
				if (result == null) result = caseInstruction(cmpXchg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.ATOMIC_RMW: {
				AtomicRMW atomicRMW = (AtomicRMW)theEObject;
				T result = caseAtomicRMW(atomicRMW);
				if (result == null) result = caseInstruction(atomicRMW);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.LOAD: {
				Load load = (Load)theEObject;
				T result = caseLoad(load);
				if (result == null) result = caseInstruction(load);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.STORE: {
				Store store = (Store)theEObject;
				T result = caseStore(store);
				if (result == null) result = caseInstruction(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.CALL: {
				Call call = (Call)theEObject;
				T result = caseCall(call);
				if (result == null) result = caseInstruction(call);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.ALLOC: {
				Alloc alloc = (Alloc)theEObject;
				T result = caseAlloc(alloc);
				if (result == null) result = caseInstruction(alloc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.PARAMETER_LIST: {
				ParameterList parameterList = (ParameterList)theEObject;
				T result = caseParameterList(parameterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.PHI: {
				PHI phi = (PHI)theEObject;
				T result = casePHI(phi);
				if (result == null) result = caseInstruction(phi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.VALUE_PAIR: {
				ValuePair valuePair = (ValuePair)theEObject;
				T result = caseValuePair(valuePair);
				if (result == null) result = caseCompare(valuePair);
				if (result == null) result = caseArithmetic(valuePair);
				if (result == null) result = caseLogical(valuePair);
				if (result == null) result = caseInstruction(valuePair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.LANDING_PAD: {
				LandingPad landingPad = (LandingPad)theEObject;
				T result = caseLandingPad(landingPad);
				if (result == null) result = caseInstruction(landingPad);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.CLAUSE: {
				Clause clause = (Clause)theEObject;
				T result = caseClause(clause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.SELECT: {
				Select select = (Select)theEObject;
				T result = caseSelect(select);
				if (result == null) result = caseInstruction(select);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.VA_ARG: {
				VA_Arg vA_Arg = (VA_Arg)theEObject;
				T result = caseVA_Arg(vA_Arg);
				if (result == null) result = caseInstruction(vA_Arg);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.EXTRACT_ELEMENT: {
				ExtractElement extractElement = (ExtractElement)theEObject;
				T result = caseExtractElement(extractElement);
				if (result == null) result = caseInstruction(extractElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.INSERT_ELEMENT: {
				InsertElement insertElement = (InsertElement)theEObject;
				T result = caseInsertElement(insertElement);
				if (result == null) result = caseInstruction(insertElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.SHUFFLE_VECTOR: {
				ShuffleVector shuffleVector = (ShuffleVector)theEObject;
				T result = caseShuffleVector(shuffleVector);
				if (result == null) result = caseInstruction(shuffleVector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.CAST: {
				Cast cast = (Cast)theEObject;
				T result = caseCast(cast);
				if (result == null) result = caseInstruction(cast);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.COMPARE: {
				Compare compare = (Compare)theEObject;
				T result = caseCompare(compare);
				if (result == null) result = caseInstruction(compare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.ARITHMETIC: {
				Arithmetic arithmetic = (Arithmetic)theEObject;
				T result = caseArithmetic(arithmetic);
				if (result == null) result = caseInstruction(arithmetic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.LOGICAL: {
				Logical logical = (Logical)theEObject;
				T result = caseLogical(logical);
				if (result == null) result = caseInstruction(logical);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.INSTRUCTION: {
				Instruction instruction = (Instruction)theEObject;
				T result = caseInstruction(instruction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.INDIRECT_BRANCH: {
				IndirectBranch indirectBranch = (IndirectBranch)theEObject;
				T result = caseIndirectBranch(indirectBranch);
				if (result == null) result = caseInstruction(indirectBranch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.LABEL_LIST: {
				LabelList labelList = (LabelList)theEObject;
				T result = caseLabelList(labelList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.SWITCH: {
				de.upb.llvm_parser.llvm.Switch switch_ = (de.upb.llvm_parser.llvm.Switch)theEObject;
				T result = caseSwitch(switch_);
				if (result == null) result = caseInstruction(switch_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.JUMP_TABLE: {
				JumpTable jumpTable = (JumpTable)theEObject;
				T result = caseJumpTable(jumpTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.INVOKE: {
				Invoke invoke = (Invoke)theEObject;
				T result = caseInvoke(invoke);
				if (result == null) result = caseInstruction(invoke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.RESUME: {
				Resume resume = (Resume)theEObject;
				T result = caseResume(resume);
				if (result == null) result = caseInstruction(resume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.RETURN: {
				Return return_ = (Return)theEObject;
				T result = caseReturn(return_);
				if (result == null) result = caseInstruction(return_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.BRANCH: {
				Branch branch = (Branch)theEObject;
				T result = caseBranch(branch);
				if (result == null) result = caseInstruction(branch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.FUNCTION_BODY: {
				FunctionBody functionBody = (FunctionBody)theEObject;
				T result = caseFunctionBody(functionBody);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case LlvmPackage.BASIC_BLOCK: {
				BasicBlock basicBlock = (BasicBlock)theEObject;
				T result = caseBasicBlock(basicBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>LLVM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>LLVM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLLVM(LLVM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractElement(AbstractElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Top Level Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Top Level Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTopLevelEntity(TopLevelEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Main Level Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Main Level Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainLevelEntity(MainLevelEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionHeader(FunctionHeader object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Var</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Var</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalVar(LocalVar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalType(LocalType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalInstruction(LocalInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Alias</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Alias</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalAlias(LocalAlias object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type And Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type And Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeAndValue(TypeAndValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Element Ptr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Element Ptr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetElementPtr(GetElementPtr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extract Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extract Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractValue(ExtractValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertValue(InsertValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFence(Fence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmp Xchg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmp Xchg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmpXchg(CmpXchg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Atomic RMW</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Atomic RMW</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtomicRMW(AtomicRMW object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Load</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Load</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoad(Load object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStore(Store object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCall(Call object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alloc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alloc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlloc(Alloc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterList(ParameterList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PHI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PHI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePHI(PHI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValuePair(ValuePair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Landing Pad</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Landing Pad</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLandingPad(LandingPad object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClause(Clause object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelect(Select object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>VA Arg</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>VA Arg</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVA_Arg(VA_Arg object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extract Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extract Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtractElement(ExtractElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insert Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insert Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsertElement(InsertElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shuffle Vector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shuffle Vector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShuffleVector(ShuffleVector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cast</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cast</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCast(Cast object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compare</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compare</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompare(Compare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmetic(Arithmetic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogical(Logical object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Indirect Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Indirect Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIndirectBranch(IndirectBranch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelList(LabelList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitch(de.upb.llvm_parser.llvm.Switch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jump Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jump Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJumpTable(JumpTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Invoke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Invoke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInvoke(Invoke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResume(Resume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturn(Return object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Branch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBranch(Branch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Body</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Body</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionBody(FunctionBody object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicBlock(BasicBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LlvmSwitch
