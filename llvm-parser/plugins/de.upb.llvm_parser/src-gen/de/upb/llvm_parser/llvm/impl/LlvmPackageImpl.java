/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.AbstractElement;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.Aggregate_Types;
import de.upb.llvm_parser.llvm.AliasDefinition;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.Clause;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.ExtractElement;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.GlobalDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.InstructionUse;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.MainLevelEntity;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.NonConstantValue;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.Resume;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.ReturnInstruction;
import de.upb.llvm_parser.llvm.Select;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.StandartInstruction;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.TopLevelEntity;
import de.upb.llvm_parser.llvm.TypeDefinition;
import de.upb.llvm_parser.llvm.TypeList;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Unreachable;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.ValueStruct;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;
import de.upb.llvm_parser.llvm.Vector;

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
public class LlvmPackageImpl extends EPackageImpl implements LlvmPackage {
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
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aliasDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregate_TypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonConstantValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueStructEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass structureEClass = null;

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
	private EClass typeListEClass = null;

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
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicBlockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionUseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass returnInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standartInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arithmeticOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logicOperationEClass = null;

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
	private EClass getElementPtrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedGetElementPtrEClass = null;

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
	private EClass phiEClass = null;

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
	private EClass variableAttributeAccessEClass = null;

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
	private EClass compareEClass = null;

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
	private EClass switchEClass = null;

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
	private LlvmPackageImpl() {
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
	public static LlvmPackage init() {
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
	public EClass getLLVM() {
		return llvmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLLVM_Elements() {
		return (EReference)llvmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractElement() {
		return abstractElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTopLevelEntity() {
		return topLevelEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopLevelEntity_Module() {
		return (EAttribute)topLevelEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopLevelEntity_Target() {
		return (EAttribute)topLevelEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTopLevelEntity_Libs() {
		return (EAttribute)topLevelEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainLevelEntity() {
		return mainLevelEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainLevelEntity_Meta() {
		return (EAttribute)mainLevelEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_Address() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeDefinition_Struct() {
		return (EReference)typeDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalDefinition() {
		return globalDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalDefinition_Adress() {
		return (EReference)globalDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalDefinition_Type() {
		return (EReference)globalDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalDefinition_Value() {
		return (EReference)globalDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionDefinition() {
		return functionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_ReturnType() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Address() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Pl() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_Body() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionDefinition_TList() {
		return (EReference)functionDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAliasDefinition() {
		return aliasDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasDefinition_Address() {
		return (EReference)aliasDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasDefinition_Aliastype() {
		return (EReference)aliasDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasDefinition_Aliasvalue() {
		return (EReference)aliasDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAliasDefinition_Aliasee() {
		return (EReference)aliasDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeUse() {
		return typeUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeUse_Pointer() {
		return (EAttribute)typeUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressUse() {
		return addressUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressUse_Address() {
		return (EReference)addressUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddress_Name() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredefined() {
		return predefinedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredefined_Type() {
		return (EAttribute)predefinedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVector() {
		return vectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVector_Type() {
		return (EReference)vectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArray() {
		return arrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArray_Type() {
		return (EReference)arrayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregate_Types() {
		return aggregate_TypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_Value() {
		return (EAttribute)constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonConstantValue() {
		return nonConstantValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonConstantValue_Pointer() {
		return (EAttribute)nonConstantValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValue() {
		return valueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValue_Name() {
		return (EAttribute)valueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueStruct() {
		return valueStructEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueStruct_Types() {
		return (EReference)valueStructEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValueStruct_Value() {
		return (EReference)valueStructEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStructure() {
		return structureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStructure_Types() {
		return (EReference)structureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterList() {
		return parameterListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterList_Types() {
		return (EReference)parameterListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterList_Lists() {
		return (EReference)parameterListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterList_Variables() {
		return (EReference)parameterListEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeList() {
		return typeListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeList_Types() {
		return (EReference)typeListEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeList_Typelists() {
		return (EReference)typeListEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionBody() {
		return functionBodyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionBody_Meta() {
		return (EAttribute)functionBodyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFunctionBody_Blocks() {
		return (EReference)functionBodyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicBlock() {
		return basicBlockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicBlock_Label() {
		return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicBlock_Instructions() {
		return (EReference)basicBlockEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicBlock_Retadr() {
		return (EAttribute)basicBlockEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicBlock_Terminator() {
		return (EReference)basicBlockEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstructionUse() {
		return instructionUseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstructionUse_Reg_or_var() {
		return (EAttribute)instructionUseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstructionUse_Instruction() {
		return (EReference)instructionUseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturnInstruction() {
		return returnInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandartInstruction() {
		return standartInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArithmeticOperation() {
		return arithmeticOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticOperation_Optype() {
		return (EReference)arithmeticOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticOperation_Value1() {
		return (EReference)arithmeticOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArithmeticOperation_Value2() {
		return (EReference)arithmeticOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogicOperation() {
		return logicOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicOperation_Optype() {
		return (EReference)logicOperationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicOperation_Value1() {
		return (EReference)logicOperationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogicOperation_Value2() {
		return (EReference)logicOperationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCast() {
		return castEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCast_From() {
		return (EReference)castEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCast_Value() {
		return (EReference)castEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCast_To() {
		return (EReference)castEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetElementPtr() {
		return getElementPtrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetElementPtr_Aggregate() {
		return (EReference)getElementPtrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetElementPtr_Aggregatename() {
		return (EReference)getElementPtrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetElementPtr_IndTypes() {
		return (EReference)getElementPtrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetElementPtr_Indizies() {
		return (EReference)getElementPtrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedGetElementPtr() {
		return nestedGetElementPtrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedGetElementPtr_Aggregate() {
		return (EReference)nestedGetElementPtrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedGetElementPtr_Aggregatename() {
		return (EReference)nestedGetElementPtrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedGetElementPtr_IndTypes() {
		return (EReference)nestedGetElementPtrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedGetElementPtr_Indizies() {
		return (EReference)nestedGetElementPtrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractValue() {
		return extractValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractValue_Array() {
		return (EReference)extractValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractValue_Struct() {
		return (EReference)extractValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractValue_Value() {
		return (EReference)extractValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtractValue_Index() {
		return (EAttribute)extractValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertValue() {
		return insertValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertValue_Struct() {
		return (EReference)insertValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertValue_Value() {
		return (EReference)insertValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertValue_Inserttype() {
		return (EReference)insertValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertValue_Insertvalue() {
		return (EReference)insertValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertValue_Index() {
		return (EAttribute)insertValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFence() {
		return fenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFence_Ordering() {
		return (EAttribute)fenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmpXchg() {
		return cmpXchgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpXchg_Adresstype() {
		return (EReference)cmpXchgEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpXchg_Adress() {
		return (EReference)cmpXchgEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpXchg_Comparetype() {
		return (EReference)cmpXchgEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpXchg_Comparevalue() {
		return (EReference)cmpXchgEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpXchg_Newtype() {
		return (EReference)cmpXchgEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmpXchg_Newvalue() {
		return (EReference)cmpXchgEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCmpXchg_Ordering() {
		return (EAttribute)cmpXchgEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtomicRMW() {
		return atomicRMWEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicRMW_Adresstype() {
		return (EReference)atomicRMWEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicRMW_Adress() {
		return (EReference)atomicRMWEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicRMW_Optype() {
		return (EReference)atomicRMWEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtomicRMW_Opvalue() {
		return (EReference)atomicRMWEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtomicRMW_Ordering() {
		return (EAttribute)atomicRMWEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoad_Adresstype() {
		return (EReference)loadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoad_Types() {
		return (EReference)loadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoad_Adress() {
		return (EReference)loadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Ordering() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLoad_Index() {
		return (EAttribute)loadEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStore() {
		return storeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Newtype() {
		return (EReference)storeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Types() {
		return (EReference)storeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Newvalue() {
		return (EReference)storeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Adresstype() {
		return (EReference)storeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStore_Adress() {
		return (EReference)storeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_Ordering() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStore_Index() {
		return (EAttribute)storeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCall() {
		return callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Adresstype() {
		return (EReference)callEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_Adress() {
		return (EReference)callEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCall_PList() {
		return (EReference)callEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlloc() {
		return allocEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlloc_Type() {
		return (EReference)allocEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlloc_Typelist() {
		return (EReference)allocEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlloc_Numelementstype() {
		return (EReference)allocEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlloc_Numelementsvalue() {
		return (EReference)allocEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhi() {
		return phiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhi_Type() {
		return (EReference)phiEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhi_Firstclass() {
		return (EReference)phiEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPhi_Values() {
		return (EReference)phiEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLandingPad() {
		return landingPadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandingPad_Struct() {
		return (EReference)landingPadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandingPad_Personalitytype() {
		return (EReference)landingPadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandingPad_Personalityvalue() {
		return (EReference)landingPadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLandingPad_Clause() {
		return (EReference)landingPadEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClause() {
		return clauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Type() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Value() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Filterarray() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClause_Constant() {
		return (EReference)clauseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelect() {
		return selectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Conditiontype() {
		return (EReference)selectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Conditionvalue() {
		return (EReference)selectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Val1type() {
		return (EReference)selectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Val1value() {
		return (EReference)selectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Val2type() {
		return (EReference)selectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelect_Val2value() {
		return (EReference)selectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableAttributeAccess() {
		return variableAttributeAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAttributeAccess_Listtype() {
		return (EReference)variableAttributeAccessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAttributeAccess_Listvalue() {
		return (EReference)variableAttributeAccessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableAttributeAccess_ArgType() {
		return (EReference)variableAttributeAccessEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtractElement() {
		return extractElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractElement_Vectortype() {
		return (EReference)extractElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractElement_Vectorvalue() {
		return (EReference)extractElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractElement_Indextype() {
		return (EReference)extractElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtractElement_Index() {
		return (EReference)extractElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsertElement() {
		return insertElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertElement_Vectortype() {
		return (EReference)insertElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertElement_Vectorvalue() {
		return (EReference)insertElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertElement_Scalartype() {
		return (EReference)insertElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertElement_Scalarvalue() {
		return (EReference)insertElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertElement_Indextype() {
		return (EReference)insertElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsertElement_Index() {
		return (EReference)insertElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShuffleVector() {
		return shuffleVectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShuffleVector_Val1type() {
		return (EReference)shuffleVectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShuffleVector_Val1value() {
		return (EReference)shuffleVectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShuffleVector_Val2type() {
		return (EReference)shuffleVectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShuffleVector_Val2value() {
		return (EReference)shuffleVectorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShuffleVector_Masktype() {
		return (EReference)shuffleVectorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getShuffleVector_Maskvalue() {
		return (EReference)shuffleVectorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompare() {
		return compareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompare_Comptype() {
		return (EReference)compareEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompare_Value1() {
		return (EReference)compareEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompare_Value2() {
		return (EReference)compareEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIndirectBranch() {
		return indirectBranchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndirectBranch_Adresstype() {
		return (EReference)indirectBranchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndirectBranch_Adress() {
		return (EReference)indirectBranchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndirectBranch_Labeltype() {
		return (EReference)indirectBranchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIndirectBranch_Labels() {
		return (EReference)indirectBranchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitch() {
		return switchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Comptype() {
		return (EReference)switchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Compvalue() {
		return (EReference)switchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Defaulttype() {
		return (EReference)switchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Defaultvalue() {
		return (EReference)switchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Jtypes() {
		return (EReference)switchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Jvalues() {
		return (EReference)switchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Destinationtypes() {
		return (EReference)switchEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitch_Destinations() {
		return (EReference)switchEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInvoke() {
		return invokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoke_Functiontype() {
		return (EReference)invokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoke_Name() {
		return (EReference)invokeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoke_PList() {
		return (EReference)invokeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoke_Totype() {
		return (EReference)invokeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoke_Tovalue() {
		return (EReference)invokeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoke_Unwindtype() {
		return (EReference)invokeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInvoke_Unwindvalue() {
		return (EReference)invokeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResume() {
		return resumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResume_Resumestruct() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResume_Resumevalue() {
		return (EReference)resumeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnreachable() {
		return unreachableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReturn() {
		return returnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_Returntype() {
		return (EReference)returnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReturn_Returnvalue() {
		return (EReference)returnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBranch() {
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Destination() {
		return (EReference)branchEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_Condvalue() {
		return (EReference)branchEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_LabelTruetype() {
		return (EReference)branchEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_LabelTrue() {
		return (EReference)branchEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_LabelFalsetype() {
		return (EReference)branchEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBranch_LabelFalse() {
		return (EReference)branchEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LlvmFactory getLlvmFactory() {
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
	public void createPackageContents() {
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
		createEAttribute(mainLevelEntityEClass, MAIN_LEVEL_ENTITY__META);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__ADDRESS);
		createEReference(typeDefinitionEClass, TYPE_DEFINITION__STRUCT);

		globalDefinitionEClass = createEClass(GLOBAL_DEFINITION);
		createEReference(globalDefinitionEClass, GLOBAL_DEFINITION__ADRESS);
		createEReference(globalDefinitionEClass, GLOBAL_DEFINITION__TYPE);
		createEReference(globalDefinitionEClass, GLOBAL_DEFINITION__VALUE);

		functionDefinitionEClass = createEClass(FUNCTION_DEFINITION);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__RETURN_TYPE);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__ADDRESS);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__PL);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__BODY);
		createEReference(functionDefinitionEClass, FUNCTION_DEFINITION__TLIST);

		aliasDefinitionEClass = createEClass(ALIAS_DEFINITION);
		createEReference(aliasDefinitionEClass, ALIAS_DEFINITION__ADDRESS);
		createEReference(aliasDefinitionEClass, ALIAS_DEFINITION__ALIASTYPE);
		createEReference(aliasDefinitionEClass, ALIAS_DEFINITION__ALIASVALUE);
		createEReference(aliasDefinitionEClass, ALIAS_DEFINITION__ALIASEE);

		typeUseEClass = createEClass(TYPE_USE);
		createEAttribute(typeUseEClass, TYPE_USE__POINTER);

		addressUseEClass = createEClass(ADDRESS_USE);
		createEReference(addressUseEClass, ADDRESS_USE__ADDRESS);

		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__NAME);

		predefinedEClass = createEClass(PREDEFINED);
		createEAttribute(predefinedEClass, PREDEFINED__TYPE);

		vectorEClass = createEClass(VECTOR);
		createEReference(vectorEClass, VECTOR__TYPE);

		arrayEClass = createEClass(ARRAY);
		createEReference(arrayEClass, ARRAY__TYPE);

		aggregate_TypesEClass = createEClass(AGGREGATE_TYPES);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__VALUE);

		nonConstantValueEClass = createEClass(NON_CONSTANT_VALUE);
		createEAttribute(nonConstantValueEClass, NON_CONSTANT_VALUE__POINTER);

		valueEClass = createEClass(VALUE);
		createEAttribute(valueEClass, VALUE__NAME);

		valueStructEClass = createEClass(VALUE_STRUCT);
		createEReference(valueStructEClass, VALUE_STRUCT__TYPES);
		createEReference(valueStructEClass, VALUE_STRUCT__VALUE);

		structureEClass = createEClass(STRUCTURE);
		createEReference(structureEClass, STRUCTURE__TYPES);

		parameterListEClass = createEClass(PARAMETER_LIST);
		createEReference(parameterListEClass, PARAMETER_LIST__TYPES);
		createEReference(parameterListEClass, PARAMETER_LIST__LISTS);
		createEReference(parameterListEClass, PARAMETER_LIST__VARIABLES);

		typeListEClass = createEClass(TYPE_LIST);
		createEReference(typeListEClass, TYPE_LIST__TYPES);
		createEReference(typeListEClass, TYPE_LIST__TYPELISTS);

		functionBodyEClass = createEClass(FUNCTION_BODY);
		createEAttribute(functionBodyEClass, FUNCTION_BODY__META);
		createEReference(functionBodyEClass, FUNCTION_BODY__BLOCKS);

		instructionEClass = createEClass(INSTRUCTION);

		basicBlockEClass = createEClass(BASIC_BLOCK);
		createEAttribute(basicBlockEClass, BASIC_BLOCK__LABEL);
		createEReference(basicBlockEClass, BASIC_BLOCK__INSTRUCTIONS);
		createEAttribute(basicBlockEClass, BASIC_BLOCK__RETADR);
		createEReference(basicBlockEClass, BASIC_BLOCK__TERMINATOR);

		instructionUseEClass = createEClass(INSTRUCTION_USE);
		createEAttribute(instructionUseEClass, INSTRUCTION_USE__REG_OR_VAR);
		createEReference(instructionUseEClass, INSTRUCTION_USE__INSTRUCTION);

		returnInstructionEClass = createEClass(RETURN_INSTRUCTION);

		standartInstructionEClass = createEClass(STANDART_INSTRUCTION);

		arithmeticOperationEClass = createEClass(ARITHMETIC_OPERATION);
		createEReference(arithmeticOperationEClass, ARITHMETIC_OPERATION__OPTYPE);
		createEReference(arithmeticOperationEClass, ARITHMETIC_OPERATION__VALUE1);
		createEReference(arithmeticOperationEClass, ARITHMETIC_OPERATION__VALUE2);

		logicOperationEClass = createEClass(LOGIC_OPERATION);
		createEReference(logicOperationEClass, LOGIC_OPERATION__OPTYPE);
		createEReference(logicOperationEClass, LOGIC_OPERATION__VALUE1);
		createEReference(logicOperationEClass, LOGIC_OPERATION__VALUE2);

		castEClass = createEClass(CAST);
		createEReference(castEClass, CAST__FROM);
		createEReference(castEClass, CAST__VALUE);
		createEReference(castEClass, CAST__TO);

		getElementPtrEClass = createEClass(GET_ELEMENT_PTR);
		createEReference(getElementPtrEClass, GET_ELEMENT_PTR__AGGREGATE);
		createEReference(getElementPtrEClass, GET_ELEMENT_PTR__AGGREGATENAME);
		createEReference(getElementPtrEClass, GET_ELEMENT_PTR__IND_TYPES);
		createEReference(getElementPtrEClass, GET_ELEMENT_PTR__INDIZIES);

		nestedGetElementPtrEClass = createEClass(NESTED_GET_ELEMENT_PTR);
		createEReference(nestedGetElementPtrEClass, NESTED_GET_ELEMENT_PTR__AGGREGATE);
		createEReference(nestedGetElementPtrEClass, NESTED_GET_ELEMENT_PTR__AGGREGATENAME);
		createEReference(nestedGetElementPtrEClass, NESTED_GET_ELEMENT_PTR__IND_TYPES);
		createEReference(nestedGetElementPtrEClass, NESTED_GET_ELEMENT_PTR__INDIZIES);

		extractValueEClass = createEClass(EXTRACT_VALUE);
		createEReference(extractValueEClass, EXTRACT_VALUE__ARRAY);
		createEReference(extractValueEClass, EXTRACT_VALUE__STRUCT);
		createEReference(extractValueEClass, EXTRACT_VALUE__VALUE);
		createEAttribute(extractValueEClass, EXTRACT_VALUE__INDEX);

		insertValueEClass = createEClass(INSERT_VALUE);
		createEReference(insertValueEClass, INSERT_VALUE__STRUCT);
		createEReference(insertValueEClass, INSERT_VALUE__VALUE);
		createEReference(insertValueEClass, INSERT_VALUE__INSERTTYPE);
		createEReference(insertValueEClass, INSERT_VALUE__INSERTVALUE);
		createEAttribute(insertValueEClass, INSERT_VALUE__INDEX);

		fenceEClass = createEClass(FENCE);
		createEAttribute(fenceEClass, FENCE__ORDERING);

		cmpXchgEClass = createEClass(CMP_XCHG);
		createEReference(cmpXchgEClass, CMP_XCHG__ADRESSTYPE);
		createEReference(cmpXchgEClass, CMP_XCHG__ADRESS);
		createEReference(cmpXchgEClass, CMP_XCHG__COMPARETYPE);
		createEReference(cmpXchgEClass, CMP_XCHG__COMPAREVALUE);
		createEReference(cmpXchgEClass, CMP_XCHG__NEWTYPE);
		createEReference(cmpXchgEClass, CMP_XCHG__NEWVALUE);
		createEAttribute(cmpXchgEClass, CMP_XCHG__ORDERING);

		atomicRMWEClass = createEClass(ATOMIC_RMW);
		createEReference(atomicRMWEClass, ATOMIC_RMW__ADRESSTYPE);
		createEReference(atomicRMWEClass, ATOMIC_RMW__ADRESS);
		createEReference(atomicRMWEClass, ATOMIC_RMW__OPTYPE);
		createEReference(atomicRMWEClass, ATOMIC_RMW__OPVALUE);
		createEAttribute(atomicRMWEClass, ATOMIC_RMW__ORDERING);

		loadEClass = createEClass(LOAD);
		createEReference(loadEClass, LOAD__ADRESSTYPE);
		createEReference(loadEClass, LOAD__TYPES);
		createEReference(loadEClass, LOAD__ADRESS);
		createEAttribute(loadEClass, LOAD__ORDERING);
		createEAttribute(loadEClass, LOAD__INDEX);

		storeEClass = createEClass(STORE);
		createEReference(storeEClass, STORE__NEWTYPE);
		createEReference(storeEClass, STORE__TYPES);
		createEReference(storeEClass, STORE__NEWVALUE);
		createEReference(storeEClass, STORE__ADRESSTYPE);
		createEReference(storeEClass, STORE__ADRESS);
		createEAttribute(storeEClass, STORE__ORDERING);
		createEAttribute(storeEClass, STORE__INDEX);

		callEClass = createEClass(CALL);
		createEReference(callEClass, CALL__ADRESSTYPE);
		createEReference(callEClass, CALL__ADRESS);
		createEReference(callEClass, CALL__PLIST);

		allocEClass = createEClass(ALLOC);
		createEReference(allocEClass, ALLOC__TYPE);
		createEReference(allocEClass, ALLOC__TYPELIST);
		createEReference(allocEClass, ALLOC__NUMELEMENTSTYPE);
		createEReference(allocEClass, ALLOC__NUMELEMENTSVALUE);

		phiEClass = createEClass(PHI);
		createEReference(phiEClass, PHI__TYPE);
		createEReference(phiEClass, PHI__FIRSTCLASS);
		createEReference(phiEClass, PHI__VALUES);

		landingPadEClass = createEClass(LANDING_PAD);
		createEReference(landingPadEClass, LANDING_PAD__STRUCT);
		createEReference(landingPadEClass, LANDING_PAD__PERSONALITYTYPE);
		createEReference(landingPadEClass, LANDING_PAD__PERSONALITYVALUE);
		createEReference(landingPadEClass, LANDING_PAD__CLAUSE);

		clauseEClass = createEClass(CLAUSE);
		createEReference(clauseEClass, CLAUSE__TYPE);
		createEReference(clauseEClass, CLAUSE__VALUE);
		createEReference(clauseEClass, CLAUSE__FILTERARRAY);
		createEReference(clauseEClass, CLAUSE__CONSTANT);

		selectEClass = createEClass(SELECT);
		createEReference(selectEClass, SELECT__CONDITIONTYPE);
		createEReference(selectEClass, SELECT__CONDITIONVALUE);
		createEReference(selectEClass, SELECT__VAL1TYPE);
		createEReference(selectEClass, SELECT__VAL1VALUE);
		createEReference(selectEClass, SELECT__VAL2TYPE);
		createEReference(selectEClass, SELECT__VAL2VALUE);

		variableAttributeAccessEClass = createEClass(VARIABLE_ATTRIBUTE_ACCESS);
		createEReference(variableAttributeAccessEClass, VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE);
		createEReference(variableAttributeAccessEClass, VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE);
		createEReference(variableAttributeAccessEClass, VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE);

		extractElementEClass = createEClass(EXTRACT_ELEMENT);
		createEReference(extractElementEClass, EXTRACT_ELEMENT__VECTORTYPE);
		createEReference(extractElementEClass, EXTRACT_ELEMENT__VECTORVALUE);
		createEReference(extractElementEClass, EXTRACT_ELEMENT__INDEXTYPE);
		createEReference(extractElementEClass, EXTRACT_ELEMENT__INDEX);

		insertElementEClass = createEClass(INSERT_ELEMENT);
		createEReference(insertElementEClass, INSERT_ELEMENT__VECTORTYPE);
		createEReference(insertElementEClass, INSERT_ELEMENT__VECTORVALUE);
		createEReference(insertElementEClass, INSERT_ELEMENT__SCALARTYPE);
		createEReference(insertElementEClass, INSERT_ELEMENT__SCALARVALUE);
		createEReference(insertElementEClass, INSERT_ELEMENT__INDEXTYPE);
		createEReference(insertElementEClass, INSERT_ELEMENT__INDEX);

		shuffleVectorEClass = createEClass(SHUFFLE_VECTOR);
		createEReference(shuffleVectorEClass, SHUFFLE_VECTOR__VAL1TYPE);
		createEReference(shuffleVectorEClass, SHUFFLE_VECTOR__VAL1VALUE);
		createEReference(shuffleVectorEClass, SHUFFLE_VECTOR__VAL2TYPE);
		createEReference(shuffleVectorEClass, SHUFFLE_VECTOR__VAL2VALUE);
		createEReference(shuffleVectorEClass, SHUFFLE_VECTOR__MASKTYPE);
		createEReference(shuffleVectorEClass, SHUFFLE_VECTOR__MASKVALUE);

		compareEClass = createEClass(COMPARE);
		createEReference(compareEClass, COMPARE__COMPTYPE);
		createEReference(compareEClass, COMPARE__VALUE1);
		createEReference(compareEClass, COMPARE__VALUE2);

		indirectBranchEClass = createEClass(INDIRECT_BRANCH);
		createEReference(indirectBranchEClass, INDIRECT_BRANCH__ADRESSTYPE);
		createEReference(indirectBranchEClass, INDIRECT_BRANCH__ADRESS);
		createEReference(indirectBranchEClass, INDIRECT_BRANCH__LABELTYPE);
		createEReference(indirectBranchEClass, INDIRECT_BRANCH__LABELS);

		switchEClass = createEClass(SWITCH);
		createEReference(switchEClass, SWITCH__COMPTYPE);
		createEReference(switchEClass, SWITCH__COMPVALUE);
		createEReference(switchEClass, SWITCH__DEFAULTTYPE);
		createEReference(switchEClass, SWITCH__DEFAULTVALUE);
		createEReference(switchEClass, SWITCH__JTYPES);
		createEReference(switchEClass, SWITCH__JVALUES);
		createEReference(switchEClass, SWITCH__DESTINATIONTYPES);
		createEReference(switchEClass, SWITCH__DESTINATIONS);

		invokeEClass = createEClass(INVOKE);
		createEReference(invokeEClass, INVOKE__FUNCTIONTYPE);
		createEReference(invokeEClass, INVOKE__NAME);
		createEReference(invokeEClass, INVOKE__PLIST);
		createEReference(invokeEClass, INVOKE__TOTYPE);
		createEReference(invokeEClass, INVOKE__TOVALUE);
		createEReference(invokeEClass, INVOKE__UNWINDTYPE);
		createEReference(invokeEClass, INVOKE__UNWINDVALUE);

		resumeEClass = createEClass(RESUME);
		createEReference(resumeEClass, RESUME__RESUMESTRUCT);
		createEReference(resumeEClass, RESUME__RESUMEVALUE);

		unreachableEClass = createEClass(UNREACHABLE);

		returnEClass = createEClass(RETURN);
		createEReference(returnEClass, RETURN__RETURNTYPE);
		createEReference(returnEClass, RETURN__RETURNVALUE);

		branchEClass = createEClass(BRANCH);
		createEReference(branchEClass, BRANCH__DESTINATION);
		createEReference(branchEClass, BRANCH__CONDVALUE);
		createEReference(branchEClass, BRANCH__LABEL_TRUETYPE);
		createEReference(branchEClass, BRANCH__LABEL_TRUE);
		createEReference(branchEClass, BRANCH__LABEL_FALSETYPE);
		createEReference(branchEClass, BRANCH__LABEL_FALSE);
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
	public void initializePackageContents() {
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
		typeDefinitionEClass.getESuperTypes().add(this.getMainLevelEntity());
		globalDefinitionEClass.getESuperTypes().add(this.getMainLevelEntity());
		functionDefinitionEClass.getESuperTypes().add(this.getMainLevelEntity());
		aliasDefinitionEClass.getESuperTypes().add(this.getMainLevelEntity());
		addressUseEClass.getESuperTypes().add(this.getTypeUse());
		predefinedEClass.getESuperTypes().add(this.getTypeUse());
		vectorEClass.getESuperTypes().add(this.getAggregate_Types());
		arrayEClass.getESuperTypes().add(this.getAggregate_Types());
		constantEClass.getESuperTypes().add(this.getValue());
		nonConstantValueEClass.getESuperTypes().add(this.getValue());
		structureEClass.getESuperTypes().add(this.getAggregate_Types());
		returnInstructionEClass.getESuperTypes().add(this.getInstruction());
		standartInstructionEClass.getESuperTypes().add(this.getInstruction());
		arithmeticOperationEClass.getESuperTypes().add(this.getStandartInstruction());
		logicOperationEClass.getESuperTypes().add(this.getStandartInstruction());
		castEClass.getESuperTypes().add(this.getValue());
		castEClass.getESuperTypes().add(this.getStandartInstruction());
		getElementPtrEClass.getESuperTypes().add(this.getStandartInstruction());
		nestedGetElementPtrEClass.getESuperTypes().add(this.getValue());
		extractValueEClass.getESuperTypes().add(this.getStandartInstruction());
		insertValueEClass.getESuperTypes().add(this.getStandartInstruction());
		fenceEClass.getESuperTypes().add(this.getStandartInstruction());
		cmpXchgEClass.getESuperTypes().add(this.getStandartInstruction());
		atomicRMWEClass.getESuperTypes().add(this.getStandartInstruction());
		loadEClass.getESuperTypes().add(this.getStandartInstruction());
		storeEClass.getESuperTypes().add(this.getStandartInstruction());
		callEClass.getESuperTypes().add(this.getStandartInstruction());
		allocEClass.getESuperTypes().add(this.getStandartInstruction());
		phiEClass.getESuperTypes().add(this.getStandartInstruction());
		landingPadEClass.getESuperTypes().add(this.getStandartInstruction());
		selectEClass.getESuperTypes().add(this.getStandartInstruction());
		variableAttributeAccessEClass.getESuperTypes().add(this.getStandartInstruction());
		extractElementEClass.getESuperTypes().add(this.getStandartInstruction());
		insertElementEClass.getESuperTypes().add(this.getStandartInstruction());
		shuffleVectorEClass.getESuperTypes().add(this.getStandartInstruction());
		compareEClass.getESuperTypes().add(this.getStandartInstruction());
		indirectBranchEClass.getESuperTypes().add(this.getReturnInstruction());
		switchEClass.getESuperTypes().add(this.getReturnInstruction());
		invokeEClass.getESuperTypes().add(this.getReturnInstruction());
		resumeEClass.getESuperTypes().add(this.getReturnInstruction());
		unreachableEClass.getESuperTypes().add(this.getReturnInstruction());
		returnEClass.getESuperTypes().add(this.getReturnInstruction());
		branchEClass.getESuperTypes().add(this.getReturnInstruction());

		// Initialize classes and features; add operations and parameters
		initEClass(llvmEClass, de.upb.llvm_parser.llvm.LLVM.class, "LLVM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLLVM_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, de.upb.llvm_parser.llvm.LLVM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(topLevelEntityEClass, TopLevelEntity.class, "TopLevelEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTopLevelEntity_Module(), ecorePackage.getEString(), "module", null, 0, 1, TopLevelEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopLevelEntity_Target(), ecorePackage.getEString(), "target", null, 0, 1, TopLevelEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTopLevelEntity_Libs(), ecorePackage.getEString(), "libs", null, 0, -1, TopLevelEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mainLevelEntityEClass, MainLevelEntity.class, "MainLevelEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainLevelEntity_Meta(), ecorePackage.getEString(), "meta", null, 0, -1, MainLevelEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeDefinition_Address(), this.getAddress(), null, "address", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeDefinition_Struct(), this.getStructure(), null, "struct", null, 0, 1, TypeDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalDefinitionEClass, GlobalDefinition.class, "GlobalDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobalDefinition_Adress(), this.getAddress(), null, "adress", null, 0, 1, GlobalDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalDefinition_Type(), ecorePackage.getEObject(), null, "type", null, 0, 1, GlobalDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGlobalDefinition_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, GlobalDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionDefinitionEClass, FunctionDefinition.class, "FunctionDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionDefinition_ReturnType(), this.getTypeUse(), null, "returnType", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDefinition_Address(), this.getAddress(), null, "address", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDefinition_Pl(), this.getParameterList(), null, "pl", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDefinition_Body(), this.getFunctionBody(), null, "body", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionDefinition_TList(), this.getTypeList(), null, "tList", null, 0, 1, FunctionDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aliasDefinitionEClass, AliasDefinition.class, "AliasDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAliasDefinition_Address(), this.getAddress(), null, "address", null, 0, 1, AliasDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAliasDefinition_Aliastype(), this.getTypeUse(), null, "aliastype", null, 0, 1, AliasDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAliasDefinition_Aliasvalue(), this.getValue(), null, "aliasvalue", null, 0, 1, AliasDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAliasDefinition_Aliasee(), this.getTypeUse(), null, "aliasee", null, 0, 1, AliasDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeUseEClass, TypeUse.class, "TypeUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeUse_Pointer(), ecorePackage.getEString(), "pointer", null, 0, 1, TypeUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressUseEClass, AddressUse.class, "AddressUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAddressUse_Address(), this.getAddress(), null, "address", null, 0, 1, AddressUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Name(), ecorePackage.getEString(), "name", null, 0, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predefinedEClass, Predefined.class, "Predefined", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredefined_Type(), ecorePackage.getEString(), "type", null, 0, 1, Predefined.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vectorEClass, Vector.class, "Vector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVector_Type(), this.getTypeUse(), null, "type", null, 0, 1, Vector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayEClass, Array.class, "Array", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArray_Type(), this.getTypeUse(), null, "type", null, 0, 1, Array.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aggregate_TypesEClass, Aggregate_Types.class, "Aggregate_Types", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Constant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonConstantValueEClass, NonConstantValue.class, "NonConstantValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNonConstantValue_Pointer(), ecorePackage.getEString(), "pointer", null, 0, 1, NonConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueEClass, Value.class, "Value", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getValue_Name(), ecorePackage.getEString(), "name", null, 0, 1, Value.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(valueStructEClass, ValueStruct.class, "ValueStruct", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValueStruct_Types(), this.getTypeUse(), null, "types", null, 0, -1, ValueStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getValueStruct_Value(), this.getValue(), null, "value", null, 0, -1, ValueStruct.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(structureEClass, Structure.class, "Structure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStructure_Types(), ecorePackage.getEObject(), null, "types", null, 0, -1, Structure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterListEClass, ParameterList.class, "ParameterList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterList_Types(), this.getTypeUse(), null, "types", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterList_Lists(), this.getTypeList(), null, "Lists", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterList_Variables(), this.getValue(), null, "variables", null, 0, -1, ParameterList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeListEClass, TypeList.class, "TypeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeList_Types(), this.getTypeUse(), null, "types", null, 0, -1, TypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeList_Typelists(), this.getTypeList(), null, "typelists", null, 0, -1, TypeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionBodyEClass, FunctionBody.class, "FunctionBody", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionBody_Meta(), ecorePackage.getEString(), "meta", null, 0, -1, FunctionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionBody_Blocks(), this.getBasicBlock(), null, "blocks", null, 0, -1, FunctionBody.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basicBlockEClass, BasicBlock.class, "BasicBlock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicBlock_Label(), ecorePackage.getEString(), "label", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicBlock_Instructions(), ecorePackage.getEObject(), null, "instructions", null, 0, -1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicBlock_Retadr(), ecorePackage.getEString(), "retadr", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicBlock_Terminator(), this.getReturnInstruction(), null, "terminator", null, 0, 1, BasicBlock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionUseEClass, InstructionUse.class, "InstructionUse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstructionUse_Reg_or_var(), ecorePackage.getEString(), "reg_or_var", null, 0, 1, InstructionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInstructionUse_Instruction(), this.getStandartInstruction(), null, "instruction", null, 0, 1, InstructionUse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(returnInstructionEClass, ReturnInstruction.class, "ReturnInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(standartInstructionEClass, StandartInstruction.class, "StandartInstruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(arithmeticOperationEClass, ArithmeticOperation.class, "ArithmeticOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArithmeticOperation_Optype(), this.getTypeUse(), null, "optype", null, 0, 1, ArithmeticOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticOperation_Value1(), this.getValue(), null, "value1", null, 0, 1, ArithmeticOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArithmeticOperation_Value2(), this.getValue(), null, "value2", null, 0, 1, ArithmeticOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(logicOperationEClass, LogicOperation.class, "LogicOperation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogicOperation_Optype(), this.getTypeUse(), null, "optype", null, 0, 1, LogicOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicOperation_Value1(), this.getValue(), null, "value1", null, 0, 1, LogicOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogicOperation_Value2(), this.getValue(), null, "value2", null, 0, 1, LogicOperation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(castEClass, Cast.class, "Cast", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCast_From(), ecorePackage.getEObject(), null, "from", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCast_Value(), this.getValue(), null, "value", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCast_To(), this.getTypeUse(), null, "to", null, 0, 1, Cast.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(getElementPtrEClass, GetElementPtr.class, "GetElementPtr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetElementPtr_Aggregate(), ecorePackage.getEObject(), null, "aggregate", null, 0, 1, GetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetElementPtr_Aggregatename(), this.getValue(), null, "aggregatename", null, 0, 1, GetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetElementPtr_IndTypes(), this.getTypeUse(), null, "indTypes", null, 0, -1, GetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGetElementPtr_Indizies(), this.getValue(), null, "indizies", null, 0, -1, GetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nestedGetElementPtrEClass, NestedGetElementPtr.class, "NestedGetElementPtr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNestedGetElementPtr_Aggregate(), ecorePackage.getEObject(), null, "aggregate", null, 0, 1, NestedGetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNestedGetElementPtr_Aggregatename(), this.getValue(), null, "aggregatename", null, 0, 1, NestedGetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNestedGetElementPtr_IndTypes(), this.getTypeUse(), null, "indTypes", null, 0, -1, NestedGetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNestedGetElementPtr_Indizies(), this.getValue(), null, "indizies", null, 0, -1, NestedGetElementPtr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractValueEClass, ExtractValue.class, "ExtractValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtractValue_Array(), this.getArray(), null, "array", null, 0, 1, ExtractValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtractValue_Struct(), this.getStructure(), null, "struct", null, 0, 1, ExtractValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtractValue_Value(), this.getValue(), null, "value", null, 0, 1, ExtractValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtractValue_Index(), ecorePackage.getEInt(), "index", null, 0, -1, ExtractValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertValueEClass, InsertValue.class, "InsertValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInsertValue_Struct(), this.getStructure(), null, "struct", null, 0, 1, InsertValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertValue_Value(), this.getValue(), null, "value", null, 0, 1, InsertValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertValue_Inserttype(), this.getTypeUse(), null, "inserttype", null, 0, 1, InsertValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertValue_Insertvalue(), this.getValue(), null, "insertvalue", null, 0, 1, InsertValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInsertValue_Index(), ecorePackage.getEInt(), "index", null, 0, -1, InsertValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fenceEClass, Fence.class, "Fence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFence_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Fence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmpXchgEClass, CmpXchg.class, "CmpXchg", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCmpXchg_Adresstype(), this.getTypeUse(), null, "adresstype", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmpXchg_Adress(), this.getValue(), null, "adress", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmpXchg_Comparetype(), this.getTypeUse(), null, "comparetype", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmpXchg_Comparevalue(), this.getValue(), null, "comparevalue", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmpXchg_Newtype(), this.getTypeUse(), null, "newtype", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmpXchg_Newvalue(), this.getValue(), null, "newvalue", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCmpXchg_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, CmpXchg.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atomicRMWEClass, AtomicRMW.class, "AtomicRMW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtomicRMW_Adresstype(), this.getTypeUse(), null, "adresstype", null, 0, 1, AtomicRMW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicRMW_Adress(), this.getValue(), null, "adress", null, 0, 1, AtomicRMW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicRMW_Optype(), this.getTypeUse(), null, "optype", null, 0, 1, AtomicRMW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAtomicRMW_Opvalue(), this.getValue(), null, "opvalue", null, 0, 1, AtomicRMW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAtomicRMW_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, AtomicRMW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoad_Adresstype(), this.getTypeUse(), null, "adresstype", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoad_Types(), this.getTypeList(), null, "types", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoad_Adress(), this.getValue(), null, "adress", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLoad_Index(), ecorePackage.getEInt(), "index", null, 0, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(storeEClass, Store.class, "Store", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStore_Newtype(), this.getTypeUse(), null, "newtype", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStore_Types(), this.getTypeList(), null, "types", null, 0, -1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStore_Newvalue(), this.getValue(), null, "newvalue", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStore_Adresstype(), this.getTypeUse(), null, "adresstype", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStore_Adress(), this.getValue(), null, "adress", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_Ordering(), ecorePackage.getEString(), "ordering", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStore_Index(), ecorePackage.getEInt(), "index", null, 0, 1, Store.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callEClass, Call.class, "Call", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCall_Adresstype(), this.getTypeUse(), null, "adresstype", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_Adress(), this.getValue(), null, "adress", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCall_PList(), this.getParameterList(), null, "pList", null, 0, 1, Call.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocEClass, Alloc.class, "Alloc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAlloc_Type(), this.getTypeUse(), null, "type", null, 0, 1, Alloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlloc_Typelist(), this.getTypeList(), null, "typelist", null, 0, 1, Alloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlloc_Numelementstype(), this.getTypeUse(), null, "numelementstype", null, 0, 1, Alloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAlloc_Numelementsvalue(), this.getValue(), null, "numelementsvalue", null, 0, 1, Alloc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phiEClass, Phi.class, "Phi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPhi_Type(), this.getTypeUse(), null, "type", null, 0, 1, Phi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhi_Firstclass(), this.getValue(), null, "firstclass", null, 0, -1, Phi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhi_Values(), this.getValue(), null, "values", null, 0, -1, Phi.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(landingPadEClass, LandingPad.class, "LandingPad", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLandingPad_Struct(), this.getStructure(), null, "struct", null, 0, 1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLandingPad_Personalitytype(), this.getTypeUse(), null, "personalitytype", null, 0, 1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLandingPad_Personalityvalue(), this.getValue(), null, "personalityvalue", null, 0, 1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLandingPad_Clause(), this.getClause(), null, "clause", null, 0, -1, LandingPad.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(clauseEClass, Clause.class, "Clause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getClause_Type(), this.getTypeUse(), null, "type", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClause_Value(), this.getValue(), null, "value", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClause_Filterarray(), this.getArray(), null, "filterarray", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClause_Constant(), this.getValue(), null, "constant", null, 0, 1, Clause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelect_Conditiontype(), this.getTypeUse(), null, "conditiontype", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Conditionvalue(), this.getValue(), null, "conditionvalue", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Val1type(), this.getTypeUse(), null, "val1type", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Val1value(), this.getValue(), null, "val1value", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Val2type(), this.getTypeUse(), null, "val2type", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSelect_Val2value(), this.getValue(), null, "val2value", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableAttributeAccessEClass, VariableAttributeAccess.class, "VariableAttributeAccess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableAttributeAccess_Listtype(), this.getTypeUse(), null, "listtype", null, 0, 1, VariableAttributeAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAttributeAccess_Listvalue(), this.getValue(), null, "listvalue", null, 0, 1, VariableAttributeAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableAttributeAccess_ArgType(), this.getTypeUse(), null, "argType", null, 0, 1, VariableAttributeAccess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extractElementEClass, ExtractElement.class, "ExtractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExtractElement_Vectortype(), this.getTypeUse(), null, "vectortype", null, 0, 1, ExtractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtractElement_Vectorvalue(), this.getValue(), null, "vectorvalue", null, 0, 1, ExtractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtractElement_Indextype(), this.getTypeUse(), null, "indextype", null, 0, 1, ExtractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtractElement_Index(), this.getValue(), null, "index", null, 0, 1, ExtractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(insertElementEClass, InsertElement.class, "InsertElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInsertElement_Vectortype(), this.getTypeUse(), null, "vectortype", null, 0, 1, InsertElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertElement_Vectorvalue(), this.getValue(), null, "vectorvalue", null, 0, 1, InsertElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertElement_Scalartype(), this.getTypeUse(), null, "scalartype", null, 0, 1, InsertElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertElement_Scalarvalue(), this.getValue(), null, "scalarvalue", null, 0, 1, InsertElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertElement_Indextype(), this.getTypeUse(), null, "indextype", null, 0, 1, InsertElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInsertElement_Index(), this.getValue(), null, "index", null, 0, 1, InsertElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shuffleVectorEClass, ShuffleVector.class, "ShuffleVector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShuffleVector_Val1type(), this.getTypeUse(), null, "val1type", null, 0, 1, ShuffleVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShuffleVector_Val1value(), this.getValue(), null, "val1value", null, 0, 1, ShuffleVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShuffleVector_Val2type(), this.getTypeUse(), null, "val2type", null, 0, 1, ShuffleVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShuffleVector_Val2value(), this.getValue(), null, "val2value", null, 0, 1, ShuffleVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShuffleVector_Masktype(), this.getTypeUse(), null, "masktype", null, 0, 1, ShuffleVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShuffleVector_Maskvalue(), this.getValue(), null, "maskvalue", null, 0, 1, ShuffleVector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compareEClass, Compare.class, "Compare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompare_Comptype(), this.getTypeUse(), null, "comptype", null, 0, 1, Compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompare_Value1(), this.getValue(), null, "value1", null, 0, 1, Compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompare_Value2(), this.getValue(), null, "value2", null, 0, 1, Compare.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(indirectBranchEClass, IndirectBranch.class, "IndirectBranch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIndirectBranch_Adresstype(), this.getTypeUse(), null, "adresstype", null, 0, 1, IndirectBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndirectBranch_Adress(), this.getValue(), null, "adress", null, 0, 1, IndirectBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndirectBranch_Labeltype(), this.getTypeUse(), null, "labeltype", null, 0, -1, IndirectBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIndirectBranch_Labels(), this.getValue(), null, "labels", null, 0, -1, IndirectBranch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSwitch_Comptype(), this.getTypeUse(), null, "comptype", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_Compvalue(), this.getValue(), null, "compvalue", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_Defaulttype(), this.getTypeUse(), null, "defaulttype", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_Defaultvalue(), this.getValue(), null, "defaultvalue", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_Jtypes(), this.getTypeUse(), null, "jtypes", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_Jvalues(), this.getValue(), null, "jvalues", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_Destinationtypes(), this.getTypeUse(), null, "destinationtypes", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSwitch_Destinations(), this.getValue(), null, "destinations", null, 0, -1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(invokeEClass, Invoke.class, "Invoke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInvoke_Functiontype(), this.getTypeUse(), null, "functiontype", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoke_Name(), this.getAddress(), null, "name", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoke_PList(), this.getParameterList(), null, "pList", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoke_Totype(), this.getTypeUse(), null, "totype", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoke_Tovalue(), this.getValue(), null, "tovalue", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoke_Unwindtype(), this.getTypeUse(), null, "unwindtype", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInvoke_Unwindvalue(), this.getValue(), null, "unwindvalue", null, 0, 1, Invoke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resumeEClass, Resume.class, "Resume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResume_Resumestruct(), this.getStructure(), null, "resumestruct", null, 0, 1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResume_Resumevalue(), this.getValue(), null, "resumevalue", null, 0, 1, Resume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(unreachableEClass, Unreachable.class, "Unreachable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(returnEClass, Return.class, "Return", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReturn_Returntype(), this.getTypeUse(), null, "returntype", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReturn_Returnvalue(), this.getValue(), null, "returnvalue", null, 0, 1, Return.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(branchEClass, Branch.class, "Branch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBranch_Destination(), this.getValue(), null, "destination", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_Condvalue(), this.getValue(), null, "condvalue", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_LabelTruetype(), this.getTypeUse(), null, "labelTruetype", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_LabelTrue(), this.getValue(), null, "labelTrue", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_LabelFalsetype(), this.getTypeUse(), null, "labelFalsetype", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBranch_LabelFalse(), this.getValue(), null, "labelFalse", null, 0, 1, Branch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //LlvmPackageImpl
