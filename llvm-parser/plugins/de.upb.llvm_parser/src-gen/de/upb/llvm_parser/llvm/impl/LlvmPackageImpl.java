/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.Aggregate;
import de.upb.llvm_parser.llvm.Alias;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.Clause;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.ExtractElement;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionHeader;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.JumpTable;
import de.upb.llvm_parser.llvm.LabelList;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LocalVar;
import de.upb.llvm_parser.llvm.MainLevelEntity;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Resume;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Select;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.TopLevelEntity;
import de.upb.llvm_parser.llvm.TypeAndValue;
import de.upb.llvm_parser.llvm.TypeList;
import de.upb.llvm_parser.llvm.Unreachable;
import de.upb.llvm_parser.llvm.VA_Arg;
import de.upb.llvm_parser.llvm.ValuePair;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LlvmPackageImpl extends EPackageImpl implements LlvmPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass llvmEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass topLevelEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mainLevelEntityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionHeaderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aggregateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass localVarEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeAndValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getElementPtrEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extractValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cmpXchgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass atomicRMWEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass loadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass storeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass allocEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass phiEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass valuePairEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass landingPadEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass vA_ArgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass extractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass insertElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass shuffleVectorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass castEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass compareEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass arithmetiC_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass logicaL_OPEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass indirectBranchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass jumpTableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass invokeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass resumeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass unreachableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returnEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass branchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionBodyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass basicBlockEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see de.upb.llvm_parser.llvm.LlvmPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private LlvmPackageImpl()
  {
    super(eNS_URI, LlvmFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link LlvmPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static LlvmPackage init()
  {
    if (isInited) return (LlvmPackage)EPackage.Registry.INSTANCE.getEPackage(LlvmPackage.eNS_URI);

    // Obtain or create and register package
    LlvmPackageImpl theLlvmPackage = (LlvmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof LlvmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new LlvmPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theLlvmPackage.createPackageContents();

    // Initialize created meta-data
    theLlvmPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theLlvmPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(LlvmPackage.eNS_URI, theLlvmPackage);
    return theLlvmPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLLVM()
  {
    return llvmEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLLVM_Elements()
  {
    return (EReference)llvmEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTopLevelEntity()
  {
    return topLevelEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopLevelEntity_Module()
  {
    return (EAttribute)topLevelEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopLevelEntity_Target()
  {
    return (EAttribute)topLevelEntityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTopLevelEntity_Libs()
  {
    return (EAttribute)topLevelEntityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMainLevelEntity()
  {
    return mainLevelEntityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMainLevelEntity_Name()
  {
    return (EAttribute)mainLevelEntityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionHeader()
  {
    return functionHeaderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunctionHeader_ReturnType()
  {
    return (EAttribute)functionHeaderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionHeader_PList()
  {
    return (EReference)functionHeaderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionHeader_Body()
  {
    return (EReference)functionHeaderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionHeader_TList()
  {
    return (EReference)functionHeaderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeList()
  {
    return typeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeList_Types()
  {
    return (EAttribute)typeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAggregate()
  {
    return aggregateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAggregate_Agg()
  {
    return (EAttribute)aggregateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLocalVar()
  {
    return localVarEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLocalVar_Type()
  {
    return (EAttribute)localVarEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVar_Instr()
  {
    return (EReference)localVarEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLocalVar_Alias()
  {
    return (EReference)localVarEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlias()
  {
    return aliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlias_Type()
  {
    return (EReference)aliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlias_Aliasee()
  {
    return (EAttribute)aliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeAndValue()
  {
    return typeAndValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeAndValue_Type()
  {
    return (EAttribute)typeAndValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getTypeAndValue_Value()
  {
    return (EAttribute)typeAndValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypeAndValue_Aggregate()
  {
    return (EReference)typeAndValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetElementPtr()
  {
    return getElementPtrEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGetElementPtr_Pointer()
  {
    return (EReference)getElementPtrEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGetElementPtr_Params()
  {
    return (EReference)getElementPtrEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtractValue()
  {
    return extractValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractValue_Aggregate()
  {
    return (EReference)extractValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtractValue_Type()
  {
    return (EAttribute)extractValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExtractValue_Index()
  {
    return (EAttribute)extractValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertValue()
  {
    return insertValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertValue_Aggregate()
  {
    return (EReference)insertValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertValue_Type()
  {
    return (EAttribute)insertValueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertValue_Value()
  {
    return (EReference)insertValueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getInsertValue_Index()
  {
    return (EAttribute)insertValueEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFence()
  {
    return fenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFence_Ordering()
  {
    return (EAttribute)fenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCmpXchg()
  {
    return cmpXchgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCmpXchg_Adress()
  {
    return (EReference)cmpXchgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCmpXchg_Compare_val()
  {
    return (EReference)cmpXchgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCmpXchg_New_val()
  {
    return (EReference)cmpXchgEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCmpXchg_Ordering()
  {
    return (EAttribute)cmpXchgEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAtomicRMW()
  {
    return atomicRMWEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicRMW_Adress()
  {
    return (EReference)atomicRMWEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAtomicRMW_Value()
  {
    return (EReference)atomicRMWEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAtomicRMW_Ordering()
  {
    return (EAttribute)atomicRMWEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLoad()
  {
    return loadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLoad_Adress()
  {
    return (EReference)loadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoad_Align()
  {
    return (EAttribute)loadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoad_Index()
  {
    return (EAttribute)loadEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLoad_Ordering()
  {
    return (EAttribute)loadEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStore()
  {
    return storeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStore_Value()
  {
    return (EReference)storeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getStore_Adress()
  {
    return (EReference)storeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStore_Ordering()
  {
    return (EAttribute)storeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStore_Index()
  {
    return (EAttribute)storeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCall()
  {
    return callEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCall_Pointer()
  {
    return (EReference)callEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCall_Plist()
  {
    return (EReference)callEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlloc()
  {
    return allocEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlloc_Type()
  {
    return (EAttribute)allocEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlloc_NumElements()
  {
    return (EReference)allocEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterList()
  {
    return parameterListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParameterList_Params()
  {
    return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPHI()
  {
    return phiEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPHI_Values()
  {
    return (EReference)phiEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getValuePair()
  {
    return valuePairEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuePair_Value1()
  {
    return (EAttribute)valuePairEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getValuePair_Value2()
  {
    return (EAttribute)valuePairEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLandingPad()
  {
    return landingPadEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLandingPad_Type()
  {
    return (EAttribute)landingPadEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLandingPad_Personality()
  {
    return (EReference)landingPadEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLandingPad_Clause()
  {
    return (EReference)landingPadEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLandingPad_Personalitytype()
  {
    return (EAttribute)landingPadEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLandingPad_Personalityfunction()
  {
    return (EAttribute)landingPadEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLandingPad_Value()
  {
    return (EAttribute)landingPadEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLandingPad_Castto()
  {
    return (EAttribute)landingPadEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClause()
  {
    return clauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getClause_Filter()
  {
    return (EReference)clauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelect()
  {
    return selectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelect_Condition()
  {
    return (EReference)selectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelect_Val1()
  {
    return (EReference)selectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSelect_Val2()
  {
    return (EReference)selectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVA_Arg()
  {
    return vA_ArgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVA_Arg_List()
  {
    return (EReference)vA_ArgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVA_Arg_ArgType()
  {
    return (EAttribute)vA_ArgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExtractElement()
  {
    return extractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractElement_Vector()
  {
    return (EReference)extractElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExtractElement_Index()
  {
    return (EReference)extractElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInsertElement()
  {
    return insertElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertElement_Vector()
  {
    return (EReference)insertElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertElement_Scalar()
  {
    return (EReference)insertElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInsertElement_Index()
  {
    return (EReference)insertElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getShuffleVector()
  {
    return shuffleVectorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShuffleVector_Vector1()
  {
    return (EReference)shuffleVectorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShuffleVector_Vector2()
  {
    return (EReference)shuffleVectorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getShuffleVector_Mask()
  {
    return (EReference)shuffleVectorEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCast()
  {
    return castEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCast_Value()
  {
    return (EReference)castEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCast_Castto()
  {
    return (EAttribute)castEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCompare()
  {
    return compareEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getARITHMETIC_OP()
  {
    return arithmetiC_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLOGICAL_OP()
  {
    return logicaL_OPEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIndirectBranch()
  {
    return indirectBranchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndirectBranch_Adress()
  {
    return (EReference)indirectBranchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIndirectBranch_LList()
  {
    return (EReference)indirectBranchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabelList()
  {
    return labelListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLabelList_Labels()
  {
    return (EReference)labelListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitch()
  {
    return switchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_Value()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_Default()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_JTable()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJumpTable()
  {
    return jumpTableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJumpTable_Values()
  {
    return (EReference)jumpTableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJumpTable_Destinations()
  {
    return (EReference)jumpTableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInvoke()
  {
    return invokeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvoke_Function()
  {
    return (EReference)invokeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvoke_PList()
  {
    return (EReference)invokeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvoke_To()
  {
    return (EReference)invokeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInvoke_Unwind()
  {
    return (EReference)invokeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getResume()
  {
    return resumeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getUnreachable()
  {
    return unreachableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturn()
  {
    return returnEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getReturn_Value()
  {
    return (EReference)returnEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBranch()
  {
    return branchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranch_Destination()
  {
    return (EReference)branchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranch_Cond()
  {
    return (EReference)branchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranch_LabelTrue()
  {
    return (EReference)branchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBranch_LabelFalse()
  {
    return (EReference)branchEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunctionBody()
  {
    return functionBodyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFunctionBody_Blocks()
  {
    return (EReference)functionBodyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBasicBlock()
  {
    return basicBlockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getBasicBlock_Label()
  {
    return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getBasicBlock_Instructions()
  {
    return (EReference)basicBlockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LlvmFactory getLlvmFactory()
  {
    return (LlvmFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    llvmEClass = createEClass(LLVM);
    createEReference(llvmEClass, LLVM__ELEMENTS);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);

    topLevelEntityEClass = createEClass(TOP_LEVEL_ENTITY);
    createEAttribute(topLevelEntityEClass, TOP_LEVEL_ENTITY__MODULE);
    createEAttribute(topLevelEntityEClass, TOP_LEVEL_ENTITY__TARGET);
    createEAttribute(topLevelEntityEClass, TOP_LEVEL_ENTITY__LIBS);

    mainLevelEntityEClass = createEClass(MAIN_LEVEL_ENTITY);
    createEAttribute(mainLevelEntityEClass, MAIN_LEVEL_ENTITY__NAME);

    functionHeaderEClass = createEClass(FUNCTION_HEADER);
    createEAttribute(functionHeaderEClass, FUNCTION_HEADER__RETURN_TYPE);
    createEReference(functionHeaderEClass, FUNCTION_HEADER__PLIST);
    createEReference(functionHeaderEClass, FUNCTION_HEADER__BODY);
    createEReference(functionHeaderEClass, FUNCTION_HEADER__TLIST);

    typeListEClass = createEClass(TYPE_LIST);
    createEAttribute(typeListEClass, TYPE_LIST__TYPES);

    aggregateEClass = createEClass(AGGREGATE);
    createEAttribute(aggregateEClass, AGGREGATE__AGG);

    localVarEClass = createEClass(LOCAL_VAR);
    createEAttribute(localVarEClass, LOCAL_VAR__TYPE);
    createEReference(localVarEClass, LOCAL_VAR__INSTR);
    createEReference(localVarEClass, LOCAL_VAR__ALIAS);

    aliasEClass = createEClass(ALIAS);
    createEReference(aliasEClass, ALIAS__TYPE);
    createEAttribute(aliasEClass, ALIAS__ALIASEE);

    typeAndValueEClass = createEClass(TYPE_AND_VALUE);
    createEAttribute(typeAndValueEClass, TYPE_AND_VALUE__TYPE);
    createEAttribute(typeAndValueEClass, TYPE_AND_VALUE__VALUE);
    createEReference(typeAndValueEClass, TYPE_AND_VALUE__AGGREGATE);

    getElementPtrEClass = createEClass(GET_ELEMENT_PTR);
    createEReference(getElementPtrEClass, GET_ELEMENT_PTR__POINTER);
    createEReference(getElementPtrEClass, GET_ELEMENT_PTR__PARAMS);

    extractValueEClass = createEClass(EXTRACT_VALUE);
    createEReference(extractValueEClass, EXTRACT_VALUE__AGGREGATE);
    createEAttribute(extractValueEClass, EXTRACT_VALUE__TYPE);
    createEAttribute(extractValueEClass, EXTRACT_VALUE__INDEX);

    insertValueEClass = createEClass(INSERT_VALUE);
    createEReference(insertValueEClass, INSERT_VALUE__AGGREGATE);
    createEAttribute(insertValueEClass, INSERT_VALUE__TYPE);
    createEReference(insertValueEClass, INSERT_VALUE__VALUE);
    createEAttribute(insertValueEClass, INSERT_VALUE__INDEX);

    fenceEClass = createEClass(FENCE);
    createEAttribute(fenceEClass, FENCE__ORDERING);

    cmpXchgEClass = createEClass(CMP_XCHG);
    createEReference(cmpXchgEClass, CMP_XCHG__ADRESS);
    createEReference(cmpXchgEClass, CMP_XCHG__COMPARE_VAL);
    createEReference(cmpXchgEClass, CMP_XCHG__NEW_VAL);
    createEAttribute(cmpXchgEClass, CMP_XCHG__ORDERING);

    atomicRMWEClass = createEClass(ATOMIC_RMW);
    createEReference(atomicRMWEClass, ATOMIC_RMW__ADRESS);
    createEReference(atomicRMWEClass, ATOMIC_RMW__VALUE);
    createEAttribute(atomicRMWEClass, ATOMIC_RMW__ORDERING);

    loadEClass = createEClass(LOAD);
    createEReference(loadEClass, LOAD__ADRESS);
    createEAttribute(loadEClass, LOAD__ALIGN);
    createEAttribute(loadEClass, LOAD__INDEX);
    createEAttribute(loadEClass, LOAD__ORDERING);

    storeEClass = createEClass(STORE);
    createEReference(storeEClass, STORE__VALUE);
    createEReference(storeEClass, STORE__ADRESS);
    createEAttribute(storeEClass, STORE__ORDERING);
    createEAttribute(storeEClass, STORE__INDEX);

    callEClass = createEClass(CALL);
    createEReference(callEClass, CALL__POINTER);
    createEReference(callEClass, CALL__PLIST);

    allocEClass = createEClass(ALLOC);
    createEAttribute(allocEClass, ALLOC__TYPE);
    createEReference(allocEClass, ALLOC__NUM_ELEMENTS);

    parameterListEClass = createEClass(PARAMETER_LIST);
    createEReference(parameterListEClass, PARAMETER_LIST__PARAMS);

    phiEClass = createEClass(PHI);
    createEReference(phiEClass, PHI__VALUES);

    valuePairEClass = createEClass(VALUE_PAIR);
    createEAttribute(valuePairEClass, VALUE_PAIR__VALUE1);
    createEAttribute(valuePairEClass, VALUE_PAIR__VALUE2);

    landingPadEClass = createEClass(LANDING_PAD);
    createEAttribute(landingPadEClass, LANDING_PAD__TYPE);
    createEReference(landingPadEClass, LANDING_PAD__PERSONALITY);
    createEReference(landingPadEClass, LANDING_PAD__CLAUSE);
    createEAttribute(landingPadEClass, LANDING_PAD__PERSONALITYTYPE);
    createEAttribute(landingPadEClass, LANDING_PAD__PERSONALITYFUNCTION);
    createEAttribute(landingPadEClass, LANDING_PAD__VALUE);
    createEAttribute(landingPadEClass, LANDING_PAD__CASTTO);

    clauseEClass = createEClass(CLAUSE);
    createEReference(clauseEClass, CLAUSE__FILTER);

    selectEClass = createEClass(SELECT);
    createEReference(selectEClass, SELECT__CONDITION);
    createEReference(selectEClass, SELECT__VAL1);
    createEReference(selectEClass, SELECT__VAL2);

    vA_ArgEClass = createEClass(VA_ARG);
    createEReference(vA_ArgEClass, VA_ARG__LIST);
    createEAttribute(vA_ArgEClass, VA_ARG__ARG_TYPE);

    extractElementEClass = createEClass(EXTRACT_ELEMENT);
    createEReference(extractElementEClass, EXTRACT_ELEMENT__VECTOR);
    createEReference(extractElementEClass, EXTRACT_ELEMENT__INDEX);

    insertElementEClass = createEClass(INSERT_ELEMENT);
    createEReference(insertElementEClass, INSERT_ELEMENT__VECTOR);
    createEReference(insertElementEClass, INSERT_ELEMENT__SCALAR);
    createEReference(insertElementEClass, INSERT_ELEMENT__INDEX);

    shuffleVectorEClass = createEClass(SHUFFLE_VECTOR);
    createEReference(shuffleVectorEClass, SHUFFLE_VECTOR__VECTOR1);
    createEReference(shuffleVectorEClass, SHUFFLE_VECTOR__VECTOR2);
    createEReference(shuffleVectorEClass, SHUFFLE_VECTOR__MASK);

    castEClass = createEClass(CAST);
    createEReference(castEClass, CAST__VALUE);
    createEAttribute(castEClass, CAST__CASTTO);

    compareEClass = createEClass(COMPARE);

    arithmetiC_OPEClass = createEClass(ARITHMETIC_OP);

    logicaL_OPEClass = createEClass(LOGICAL_OP);

    instructionEClass = createEClass(INSTRUCTION);

    indirectBranchEClass = createEClass(INDIRECT_BRANCH);
    createEReference(indirectBranchEClass, INDIRECT_BRANCH__ADRESS);
    createEReference(indirectBranchEClass, INDIRECT_BRANCH__LLIST);

    labelListEClass = createEClass(LABEL_LIST);
    createEReference(labelListEClass, LABEL_LIST__LABELS);

    switchEClass = createEClass(SWITCH);
    createEReference(switchEClass, SWITCH__VALUE);
    createEReference(switchEClass, SWITCH__DEFAULT);
    createEReference(switchEClass, SWITCH__JTABLE);

    jumpTableEClass = createEClass(JUMP_TABLE);
    createEReference(jumpTableEClass, JUMP_TABLE__VALUES);
    createEReference(jumpTableEClass, JUMP_TABLE__DESTINATIONS);

    invokeEClass = createEClass(INVOKE);
    createEReference(invokeEClass, INVOKE__FUNCTION);
    createEReference(invokeEClass, INVOKE__PLIST);
    createEReference(invokeEClass, INVOKE__TO);
    createEReference(invokeEClass, INVOKE__UNWIND);

    resumeEClass = createEClass(RESUME);

    unreachableEClass = createEClass(UNREACHABLE);

    returnEClass = createEClass(RETURN);
    createEReference(returnEClass, RETURN__VALUE);

    branchEClass = createEClass(BRANCH);
    createEReference(branchEClass, BRANCH__DESTINATION);
    createEReference(branchEClass, BRANCH__COND);
    createEReference(branchEClass, BRANCH__LABEL_TRUE);
    createEReference(branchEClass, BRANCH__LABEL_FALSE);

    functionBodyEClass = createEClass(FUNCTION_BODY);
    createEReference(functionBodyEClass, FUNCTION_BODY__BLOCKS);

    basicBlockEClass = createEClass(BASIC_BLOCK);
    createEAttribute(basicBlockEClass, BASIC_BLOCK__LABEL);
    createEReference(basicBlockEClass, BASIC_BLOCK__INSTRUCTIONS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    topLevelEntityEClass.getESuperTypes().add(this.getAbstractElement());
    mainLevelEntityEClass.getESuperTypes().add(this.getAbstractElement());
    functionHeaderEClass.getESuperTypes().add(this.getMainLevelEntity());
    localVarEClass.getESuperTypes().add(this.getMainLevelEntity());
    localVarEClass.getESuperTypes().add(this.getInstruction());
    typeAndValueEClass.getESuperTypes().add(this.getClause());
    typeAndValueEClass.getESuperTypes().add(this.getResume());
    getElementPtrEClass.getESuperTypes().add(this.getInstruction());
    extractValueEClass.getESuperTypes().add(this.getInstruction());
    insertValueEClass.getESuperTypes().add(this.getInstruction());
    fenceEClass.getESuperTypes().add(this.getInstruction());
    cmpXchgEClass.getESuperTypes().add(this.getInstruction());
    atomicRMWEClass.getESuperTypes().add(this.getInstruction());
    loadEClass.getESuperTypes().add(this.getInstruction());
    storeEClass.getESuperTypes().add(this.getInstruction());
    callEClass.getESuperTypes().add(this.getInstruction());
    allocEClass.getESuperTypes().add(this.getInstruction());
    phiEClass.getESuperTypes().add(this.getInstruction());
    valuePairEClass.getESuperTypes().add(this.getCompare());
    valuePairEClass.getESuperTypes().add(this.getARITHMETIC_OP());
    valuePairEClass.getESuperTypes().add(this.getLOGICAL_OP());
    landingPadEClass.getESuperTypes().add(this.getInstruction());
    selectEClass.getESuperTypes().add(this.getInstruction());
    vA_ArgEClass.getESuperTypes().add(this.getInstruction());
    extractElementEClass.getESuperTypes().add(this.getInstruction());
    insertElementEClass.getESuperTypes().add(this.getInstruction());
    shuffleVectorEClass.getESuperTypes().add(this.getInstruction());
    castEClass.getESuperTypes().add(this.getInstruction());
    compareEClass.getESuperTypes().add(this.getInstruction());
    arithmetiC_OPEClass.getESuperTypes().add(this.getInstruction());
    logicaL_OPEClass.getESuperTypes().add(this.getInstruction());
    indirectBranchEClass.getESuperTypes().add(this.getInstruction());
    switchEClass.getESuperTypes().add(this.getInstruction());
    invokeEClass.getESuperTypes().add(this.getInstruction());
    resumeEClass.getESuperTypes().add(this.getInstruction());
    unreachableEClass.getESuperTypes().add(this.getInstruction());
    returnEClass.getESuperTypes().add(this.getInstruction());
    branchEClass.getESuperTypes().add(this.getInstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(llvmEClass, de.upb.llvm_parser.llvm.LLVM.class, "LLVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLLVM_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, de.upb.llvm_parser.llvm.LLVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(topLevelEntityEClass, TopLevelEntity.class, "TopLevelEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTopLevelEntity_Module(), ecorePackage.getEString(), "module", null, 0, 1, TopLevelEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTopLevelEntity_Target(), ecorePackage.getEString(), "target", null, 0, 1, TopLevelEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTopLevelEntity_Libs(), ecorePackage.getEString(), "libs", null, 0, -1, TopLevelEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(mainLevelEntityEClass, MainLevelEntity.class, "MainLevelEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMainLevelEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, MainLevelEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionHeaderEClass, FunctionHeader.class, "FunctionHeader", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunctionHeader_ReturnType(), ecorePackage.getEString(), "returnType", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionHeader_PList(), this.getParameterList(), null, "pList", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionHeader_Body(), this.getFunctionBody(), null, "body", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFunctionHeader_TList(), this.getTypeList(), null, "tList", null, 0, 1, FunctionHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeListEClass, TypeList.class, "TypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeList_Types(), ecorePackage.getEString(), "types", null, 0, -1, TypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aggregateEClass, Aggregate.class, "Aggregate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAggregate_Agg(), ecorePackage.getEString(), "agg", null, 0, -1, Aggregate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(localVarEClass, LocalVar.class, "LocalVar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLocalVar_Type(), ecorePackage.getEString(), "type", null, 0, 1, LocalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalVar_Instr(), this.getInstruction(), null, "instr", null, 0, 1, LocalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLocalVar_Alias(), this.getAlias(), null, "alias", null, 0, 1, LocalVar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aliasEClass, Alias.class, "Alias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAlias_Type(), this.getTypeAndValue(), null, "type", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAlias_Aliasee(), ecorePackage.getEString(), "aliasee", null, 0, 1, Alias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeAndValueEClass, TypeAndValue.class, "TypeAndValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeAndValue_Type(), ecorePackage.getEString(), "type", null, 0, 1, TypeAndValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypeAndValue_Value(), ecorePackage.getEString(), "value", null, 0, 1, TypeAndValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypeAndValue_Aggregate(), this.getAggregate(), null, "aggregate", null, 0, 1, TypeAndValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(getElementPtrEClass, GetElementPtr.class, "GetElementPtr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getGetElementPtr_Pointer(), this.getTypeAndValue(), null, "pointer", null, 0, -1, GetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGetElementPtr_Params(), this.getTypeAndValue(), null, "params", null, 0, -1, GetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extractValueEClass, ExtractValue.class, "ExtractValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtractValue_Aggregate(), this.getAggregate(), null, "aggregate", null, 0, 1, ExtractValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtractValue_Type(), ecorePackage.getEString(), "type", null, 0, 1, ExtractValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExtractValue_Index(), ecorePackage.getEInt(), "index", null, 0, -1, ExtractValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insertValueEClass, InsertValue.class, "InsertValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInsertValue_Aggregate(), this.getAggregate(), null, "aggregate", null, 0, 1, InsertValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInsertValue_Type(), ecorePackage.getEString(), "type", null, 0, 1, InsertValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertValue_Value(), this.getTypeAndValue(), null, "value", null, 0, 1, InsertValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getInsertValue_Index(), ecorePackage.getEInt(), "index", null, 0, -1, InsertValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(fenceEClass, Fence.class, "Fence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFence_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Fence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cmpXchgEClass, CmpXchg.class, "CmpXchg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCmpXchg_Adress(), this.getTypeAndValue(), null, "adress", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCmpXchg_Compare_val(), this.getTypeAndValue(), null, "compare_val", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCmpXchg_New_val(), this.getTypeAndValue(), null, "new_val", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCmpXchg_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(atomicRMWEClass, AtomicRMW.class, "AtomicRMW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAtomicRMW_Adress(), this.getTypeAndValue(), null, "adress", null, 0, 1, AtomicRMW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAtomicRMW_Value(), this.getTypeAndValue(), null, "value", null, 0, 1, AtomicRMW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAtomicRMW_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, AtomicRMW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLoad_Adress(), this.getTypeAndValue(), null, "adress", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoad_Align(), ecorePackage.getEString(), "align", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoad_Index(), ecorePackage.getEInt(), "index", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLoad_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStore_Value(), this.getTypeAndValue(), null, "value", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getStore_Adress(), this.getTypeAndValue(), null, "adress", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStore_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStore_Index(), ecorePackage.getEInt(), "index", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCall_Pointer(), this.getTypeAndValue(), null, "pointer", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCall_Plist(), this.getParameterList(), null, "plist", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(allocEClass, Alloc.class, "Alloc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlloc_Type(), ecorePackage.getEString(), "type", null, 0, 1, Alloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlloc_NumElements(), this.getTypeAndValue(), null, "numElements", null, 0, 1, Alloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParameterList_Params(), this.getTypeAndValue(), null, "params", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(phiEClass, de.upb.llvm_parser.llvm.PHI.class, "PHI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPHI_Values(), this.getValuePair(), null, "values", null, 0, -1, de.upb.llvm_parser.llvm.PHI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(valuePairEClass, ValuePair.class, "ValuePair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getValuePair_Value1(), ecorePackage.getEString(), "value1", null, 0, 1, ValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getValuePair_Value2(), ecorePackage.getEString(), "value2", null, 0, 1, ValuePair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(landingPadEClass, LandingPad.class, "LandingPad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLandingPad_Type(), ecorePackage.getEString(), "type", null, 0, 1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLandingPad_Personality(), this.getTypeAndValue(), null, "personality", null, 0, 1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLandingPad_Clause(), this.getClause(), null, "clause", null, 0, -1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLandingPad_Personalitytype(), ecorePackage.getEString(), "personalitytype", null, 0, 1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLandingPad_Personalityfunction(), ecorePackage.getEString(), "personalityfunction", null, 0, 1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLandingPad_Value(), ecorePackage.getEString(), "value", null, 0, 1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLandingPad_Castto(), ecorePackage.getEString(), "castto", null, 0, 1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getClause_Filter(), this.getTypeAndValue(), null, "filter", null, 0, -1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSelect_Condition(), this.getTypeAndValue(), null, "condition", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelect_Val1(), this.getTypeAndValue(), null, "val1", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSelect_Val2(), this.getTypeAndValue(), null, "val2", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(vA_ArgEClass, VA_Arg.class, "VA_Arg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVA_Arg_List(), this.getTypeAndValue(), null, "list", null, 0, 1, VA_Arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVA_Arg_ArgType(), ecorePackage.getEString(), "argType", null, 0, 1, VA_Arg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(extractElementEClass, ExtractElement.class, "ExtractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExtractElement_Vector(), this.getTypeAndValue(), null, "vector", null, 0, 1, ExtractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExtractElement_Index(), this.getTypeAndValue(), null, "index", null, 0, 1, ExtractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(insertElementEClass, InsertElement.class, "InsertElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInsertElement_Vector(), this.getTypeAndValue(), null, "vector", null, 0, 1, InsertElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertElement_Scalar(), this.getTypeAndValue(), null, "scalar", null, 0, 1, InsertElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInsertElement_Index(), this.getTypeAndValue(), null, "index", null, 0, 1, InsertElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(shuffleVectorEClass, ShuffleVector.class, "ShuffleVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getShuffleVector_Vector1(), this.getTypeAndValue(), null, "vector1", null, 0, 1, ShuffleVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShuffleVector_Vector2(), this.getTypeAndValue(), null, "vector2", null, 0, 1, ShuffleVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getShuffleVector_Mask(), this.getTypeAndValue(), null, "mask", null, 0, 1, ShuffleVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(castEClass, Cast.class, "Cast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCast_Value(), this.getTypeAndValue(), null, "value", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCast_Castto(), ecorePackage.getEString(), "castto", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(compareEClass, Compare.class, "Compare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(arithmetiC_OPEClass, de.upb.llvm_parser.llvm.ARITHMETIC_OP.class, "ARITHMETIC_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(logicaL_OPEClass, de.upb.llvm_parser.llvm.LOGICAL_OP.class, "LOGICAL_OP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(indirectBranchEClass, IndirectBranch.class, "IndirectBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIndirectBranch_Adress(), this.getTypeAndValue(), null, "adress", null, 0, 1, IndirectBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIndirectBranch_LList(), this.getLabelList(), null, "lList", null, 0, 1, IndirectBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelListEClass, LabelList.class, "LabelList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLabelList_Labels(), this.getTypeAndValue(), null, "labels", null, 0, -1, LabelList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSwitch_Value(), this.getTypeAndValue(), null, "value", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_Default(), this.getTypeAndValue(), null, "default", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_JTable(), this.getJumpTable(), null, "jTable", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(jumpTableEClass, JumpTable.class, "JumpTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJumpTable_Values(), this.getTypeAndValue(), null, "values", null, 0, -1, JumpTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJumpTable_Destinations(), this.getTypeAndValue(), null, "destinations", null, 0, -1, JumpTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(invokeEClass, Invoke.class, "Invoke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInvoke_Function(), this.getTypeAndValue(), null, "function", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvoke_PList(), this.getParameterList(), null, "pList", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvoke_To(), this.getTypeAndValue(), null, "to", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInvoke_Unwind(), this.getTypeAndValue(), null, "unwind", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(resumeEClass, Resume.class, "Resume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(unreachableEClass, Unreachable.class, "Unreachable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getReturn_Value(), this.getTypeAndValue(), null, "value", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getBranch_Destination(), this.getTypeAndValue(), null, "destination", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBranch_Cond(), this.getTypeAndValue(), null, "cond", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBranch_LabelTrue(), this.getTypeAndValue(), null, "labelTrue", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBranch_LabelFalse(), this.getTypeAndValue(), null, "labelFalse", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionBodyEClass, FunctionBody.class, "FunctionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFunctionBody_Blocks(), this.getBasicBlock(), null, "blocks", null, 0, -1, FunctionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(basicBlockEClass, BasicBlock.class, "BasicBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBasicBlock_Label(), ecorePackage.getEString(), "label", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getBasicBlock_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //LlvmPackageImpl
