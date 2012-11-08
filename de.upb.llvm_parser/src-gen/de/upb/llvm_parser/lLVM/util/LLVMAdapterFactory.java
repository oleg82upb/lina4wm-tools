/**
 */
package de.upb.llvm_parser.lLVM.util;

import de.upb.llvm_parser.lLVM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.llvm_parser.lLVM.LLVMPackage
 * @generated
 */
public class LLVMAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static LLVMPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LLVMAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = LLVMPackage.eINSTANCE;
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
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
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
  protected LLVMSwitch<Adapter> modelSwitch =
    new LLVMSwitch<Adapter>()
    {
      @Override
      public Adapter caseLLVM(LLVM object)
      {
        return createLLVMAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter caseTypeAndValue(TypeAndValue object)
      {
        return createTypeAndValueAdapter();
      }
      @Override
      public Adapter caseLocalVar(LocalVar object)
      {
        return createLocalVarAdapter();
      }
      @Override
      public Adapter caseGetElementPtr(GetElementPtr object)
      {
        return createGetElementPtrAdapter();
      }
      @Override
      public Adapter caseExtractValue(ExtractValue object)
      {
        return createExtractValueAdapter();
      }
      @Override
      public Adapter caseInsertValue(InsertValue object)
      {
        return createInsertValueAdapter();
      }
      @Override
      public Adapter caseFence(Fence object)
      {
        return createFenceAdapter();
      }
      @Override
      public Adapter caseCmpXchg(CmpXchg object)
      {
        return createCmpXchgAdapter();
      }
      @Override
      public Adapter caseAtomicRMW(AtomicRMW object)
      {
        return createAtomicRMWAdapter();
      }
      @Override
      public Adapter caseLoad(Load object)
      {
        return createLoadAdapter();
      }
      @Override
      public Adapter caseStore(Store object)
      {
        return createStoreAdapter();
      }
      @Override
      public Adapter caseCall(Call object)
      {
        return createCallAdapter();
      }
      @Override
      public Adapter caseAlloc(Alloc object)
      {
        return createAllocAdapter();
      }
      @Override
      public Adapter caseParameterList(ParameterList object)
      {
        return createParameterListAdapter();
      }
      @Override
      public Adapter casePHI(PHI object)
      {
        return createPHIAdapter();
      }
      @Override
      public Adapter caseValuePair(ValuePair object)
      {
        return createValuePairAdapter();
      }
      @Override
      public Adapter caseLandingPad(LandingPad object)
      {
        return createLandingPadAdapter();
      }
      @Override
      public Adapter caseClause(Clause object)
      {
        return createClauseAdapter();
      }
      @Override
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
      }
      @Override
      public Adapter caseVA_Arg(VA_Arg object)
      {
        return createVA_ArgAdapter();
      }
      @Override
      public Adapter caseExtractElement(ExtractElement object)
      {
        return createExtractElementAdapter();
      }
      @Override
      public Adapter caseInsertElement(InsertElement object)
      {
        return createInsertElementAdapter();
      }
      @Override
      public Adapter caseShuffleVector(ShuffleVector object)
      {
        return createShuffleVectorAdapter();
      }
      @Override
      public Adapter caseCast(Cast object)
      {
        return createCastAdapter();
      }
      @Override
      public Adapter caseCompare(Compare object)
      {
        return createCompareAdapter();
      }
      @Override
      public Adapter caseArithmetic(Arithmetic object)
      {
        return createArithmeticAdapter();
      }
      @Override
      public Adapter caseLogical(Logical object)
      {
        return createLogicalAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseIndirectBranch(IndirectBranch object)
      {
        return createIndirectBranchAdapter();
      }
      @Override
      public Adapter caseLabelList(LabelList object)
      {
        return createLabelListAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter caseJumpTable(JumpTable object)
      {
        return createJumpTableAdapter();
      }
      @Override
      public Adapter caseInvoke(Invoke object)
      {
        return createInvokeAdapter();
      }
      @Override
      public Adapter caseResume(Resume object)
      {
        return createResumeAdapter();
      }
      @Override
      public Adapter caseReturn(Return object)
      {
        return createReturnAdapter();
      }
      @Override
      public Adapter caseBranch(Branch object)
      {
        return createBranchAdapter();
      }
      @Override
      public Adapter caseFunctionBody(FunctionBody object)
      {
        return createFunctionBodyAdapter();
      }
      @Override
      public Adapter caseBasicBlock(BasicBlock object)
      {
        return createBasicBlockAdapter();
      }
      @Override
      public Adapter caseLabelStr(LabelStr object)
      {
        return createLabelStrAdapter();
      }
      @Override
      public Adapter caseFunctionHeader(FunctionHeader object)
      {
        return createFunctionHeaderAdapter();
      }
      @Override
      public Adapter caseGlobalName(GlobalName object)
      {
        return createGlobalNameAdapter();
      }
      @Override
      public Adapter caseUnNammedAddr(UnNammedAddr object)
      {
        return createUnNammedAddrAdapter();
      }
      @Override
      public Adapter caseMainLevelEntity(MainLevelEntity object)
      {
        return createMainLevelEntityAdapter();
      }
      @Override
      public Adapter caseLocalVarInstruction(LocalVarInstruction object)
      {
        return createLocalVarInstructionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
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
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.LLVM <em>LLVM</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.LLVM
   * @generated
   */
  public Adapter createLLVMAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.TypeAndValue <em>Type And Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.TypeAndValue
   * @generated
   */
  public Adapter createTypeAndValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.LocalVar <em>Local Var</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.LocalVar
   * @generated
   */
  public Adapter createLocalVarAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.GetElementPtr <em>Get Element Ptr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.GetElementPtr
   * @generated
   */
  public Adapter createGetElementPtrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.ExtractValue <em>Extract Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.ExtractValue
   * @generated
   */
  public Adapter createExtractValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.InsertValue <em>Insert Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.InsertValue
   * @generated
   */
  public Adapter createInsertValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Fence <em>Fence</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Fence
   * @generated
   */
  public Adapter createFenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.CmpXchg <em>Cmp Xchg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.CmpXchg
   * @generated
   */
  public Adapter createCmpXchgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.AtomicRMW <em>Atomic RMW</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.AtomicRMW
   * @generated
   */
  public Adapter createAtomicRMWAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Load <em>Load</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Load
   * @generated
   */
  public Adapter createLoadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Store <em>Store</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Store
   * @generated
   */
  public Adapter createStoreAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Call <em>Call</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Call
   * @generated
   */
  public Adapter createCallAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Alloc <em>Alloc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Alloc
   * @generated
   */
  public Adapter createAllocAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.ParameterList <em>Parameter List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.ParameterList
   * @generated
   */
  public Adapter createParameterListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.PHI <em>PHI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.PHI
   * @generated
   */
  public Adapter createPHIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.ValuePair <em>Value Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.ValuePair
   * @generated
   */
  public Adapter createValuePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.LandingPad <em>Landing Pad</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.LandingPad
   * @generated
   */
  public Adapter createLandingPadAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Clause <em>Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Clause
   * @generated
   */
  public Adapter createClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Select
   * @generated
   */
  public Adapter createSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.VA_Arg <em>VA Arg</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.VA_Arg
   * @generated
   */
  public Adapter createVA_ArgAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.ExtractElement <em>Extract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.ExtractElement
   * @generated
   */
  public Adapter createExtractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.InsertElement <em>Insert Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.InsertElement
   * @generated
   */
  public Adapter createInsertElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.ShuffleVector <em>Shuffle Vector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.ShuffleVector
   * @generated
   */
  public Adapter createShuffleVectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Cast <em>Cast</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Cast
   * @generated
   */
  public Adapter createCastAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Compare <em>Compare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Compare
   * @generated
   */
  public Adapter createCompareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Arithmetic <em>Arithmetic</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Arithmetic
   * @generated
   */
  public Adapter createArithmeticAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Logical <em>Logical</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Logical
   * @generated
   */
  public Adapter createLogicalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.IndirectBranch <em>Indirect Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.IndirectBranch
   * @generated
   */
  public Adapter createIndirectBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.LabelList <em>Label List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.LabelList
   * @generated
   */
  public Adapter createLabelListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.JumpTable <em>Jump Table</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.JumpTable
   * @generated
   */
  public Adapter createJumpTableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Invoke <em>Invoke</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Invoke
   * @generated
   */
  public Adapter createInvokeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Resume <em>Resume</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Resume
   * @generated
   */
  public Adapter createResumeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Return <em>Return</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Return
   * @generated
   */
  public Adapter createReturnAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.Branch <em>Branch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.Branch
   * @generated
   */
  public Adapter createBranchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.FunctionBody <em>Function Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.FunctionBody
   * @generated
   */
  public Adapter createFunctionBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.BasicBlock <em>Basic Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.BasicBlock
   * @generated
   */
  public Adapter createBasicBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.LabelStr <em>Label Str</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.LabelStr
   * @generated
   */
  public Adapter createLabelStrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.FunctionHeader <em>Function Header</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.FunctionHeader
   * @generated
   */
  public Adapter createFunctionHeaderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.GlobalName <em>Global Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.GlobalName
   * @generated
   */
  public Adapter createGlobalNameAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.UnNammedAddr <em>Un Nammed Addr</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.UnNammedAddr
   * @generated
   */
  public Adapter createUnNammedAddrAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.MainLevelEntity <em>Main Level Entity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.MainLevelEntity
   * @generated
   */
  public Adapter createMainLevelEntityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link de.upb.llvm_parser.lLVM.LocalVarInstruction <em>Local Var Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see de.upb.llvm_parser.lLVM.LocalVarInstruction
   * @generated
   */
  public Adapter createLocalVarInstructionAdapter()
  {
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
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //LLVMAdapterFactory
