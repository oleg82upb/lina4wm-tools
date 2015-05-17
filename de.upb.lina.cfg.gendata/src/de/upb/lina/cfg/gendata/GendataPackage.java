/**
 */
package de.upb.lina.cfg.gendata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.lina.cfg.gendata.GendataFactory
 * @model kind="package"
 * @generated
 */
public interface GendataPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gendata";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.upb.de/lina/cfg/gendata";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gendata";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GendataPackage eINSTANCE = de.upb.lina.cfg.gendata.impl.GendataPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.gendata.impl.LocalVariablesImpl <em>Local Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.gendata.impl.LocalVariablesImpl
	 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getLocalVariables()
	 * @generated
	 */
	int LOCAL_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLES__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Local Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Local Variables</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_VARIABLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl <em>Generator Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.gendata.impl.GeneratorDataImpl
	 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getGeneratorData()
	 * @generated
	 */
	int GENERATOR_DATA = 1;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA__LOCAL_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA__PROGRAM = 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA__LABELS = 2;

	/**
	 * The feature id for the '<em><b>Cfgs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA__CFGS = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA__CONSTRAINTS = 4;

	/**
	 * The feature id for the '<em><b>Parameter Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA__PARAMETER_MAPPINGS = 5;

	/**
	 * The feature id for the '<em><b>Needs Get Element Ptr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA__NEEDS_GET_ELEMENT_PTR = 6;

	/**
	 * The feature id for the '<em><b>Needs Cas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA__NEEDS_CAS = 7;

	/**
	 * The number of structural features of the '<em>Generator Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Generator Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.gendata.impl.AddressMappingImpl <em>Address Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.gendata.impl.AddressMappingImpl
	 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getAddressMapping()
	 * @generated
	 */
	int ADDRESS_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Adresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MAPPING__ADRESSES = 1;

	/**
	 * The feature id for the '<em><b>Old Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MAPPING__OLD_NAMES = 2;

	/**
	 * The number of structural features of the '<em>Address Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MAPPING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Address Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.gendata.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.gendata.impl.LabelImpl
	 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Control Flow Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CONTROL_FLOW_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Control Flow Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__CONTROL_FLOW_DIAGRAM = 2;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.gendata.impl.ConstraintMappingImpl <em>Constraint Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.gendata.impl.ConstraintMappingImpl
	 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getConstraintMapping()
	 * @generated
	 */
	int CONSTRAINT_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MAPPING__TRANSITION = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MAPPING__CONDITION = 1;

	/**
	 * The number of structural features of the '<em>Constraint Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Constraint Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_MAPPING_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.gendata.impl.FunctionParamsMappingImpl <em>Function Params Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.gendata.impl.FunctionParamsMappingImpl
	 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getFunctionParamsMapping()
	 * @generated
	 */
	int FUNCTION_PARAMS_MAPPING = 5;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMS_MAPPING__FUNCTION = 0;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMS_MAPPING__CFG = 1;

	/**
	 * The feature id for the '<em><b>Needs Return Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMS_MAPPING__NEEDS_RETURN_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Needs Get Element Ptr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMS_MAPPING__NEEDS_GET_ELEMENT_PTR = 3;

	/**
	 * The feature id for the '<em><b>Needs Cas</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMS_MAPPING__NEEDS_CAS = 4;

	/**
	 * The feature id for the '<em><b>Var Names In Function</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMS_MAPPING__VAR_NAMES_IN_FUNCTION = 5;

	/**
	 * The number of structural features of the '<em>Function Params Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMS_MAPPING_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Function Params Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_PARAMS_MAPPING_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.gendata.LocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variables</em>'.
	 * @see de.upb.lina.cfg.gendata.LocalVariables
	 * @generated
	 */
	EClass getLocalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.cfg.gendata.LocalVariables#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see de.upb.lina.cfg.gendata.LocalVariables#getVariables()
	 * @see #getLocalVariables()
	 * @generated
	 */
	EReference getLocalVariables_Variables();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.gendata.GeneratorData <em>Generator Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Data</em>'.
	 * @see de.upb.lina.cfg.gendata.GeneratorData
	 * @generated
	 */
	EClass getGeneratorData();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.lina.cfg.gendata.GeneratorData#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Variables</em>'.
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getLocalVariables()
	 * @see #getGeneratorData()
	 * @generated
	 */
	EReference getGeneratorData_LocalVariables();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.gendata.GeneratorData#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Program</em>'.
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getProgram()
	 * @see #getGeneratorData()
	 * @generated
	 */
	EReference getGeneratorData_Program();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.cfg.gendata.GeneratorData#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getLabels()
	 * @see #getGeneratorData()
	 * @generated
	 */
	EReference getGeneratorData_Labels();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.lina.cfg.gendata.GeneratorData#getCfgs <em>Cfgs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cfgs</em>'.
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getCfgs()
	 * @see #getGeneratorData()
	 * @generated
	 */
	EReference getGeneratorData_Cfgs();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.cfg.gendata.GeneratorData#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getConstraints()
	 * @see #getGeneratorData()
	 * @generated
	 */
	EReference getGeneratorData_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.cfg.gendata.GeneratorData#getParameterMappings <em>Parameter Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Mappings</em>'.
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getParameterMappings()
	 * @see #getGeneratorData()
	 * @generated
	 */
	EReference getGeneratorData_ParameterMappings();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.gendata.GeneratorData#isNeedsGetElementPtr <em>Needs Get Element Ptr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Get Element Ptr</em>'.
	 * @see de.upb.lina.cfg.gendata.GeneratorData#isNeedsGetElementPtr()
	 * @see #getGeneratorData()
	 * @generated
	 */
	EAttribute getGeneratorData_NeedsGetElementPtr();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.gendata.GeneratorData#isNeedsCas <em>Needs Cas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Cas</em>'.
	 * @see de.upb.lina.cfg.gendata.GeneratorData#isNeedsCas()
	 * @see #getGeneratorData()
	 * @generated
	 */
	EAttribute getGeneratorData_NeedsCas();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.gendata.AddressMapping <em>Address Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Mapping</em>'.
	 * @see de.upb.lina.cfg.gendata.AddressMapping
	 * @generated
	 */
	EClass getAddressMapping();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.gendata.AddressMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.lina.cfg.gendata.AddressMapping#getName()
	 * @see #getAddressMapping()
	 * @generated
	 */
	EAttribute getAddressMapping_Name();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.lina.cfg.gendata.AddressMapping#getAdresses <em>Adresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adresses</em>'.
	 * @see de.upb.lina.cfg.gendata.AddressMapping#getAdresses()
	 * @see #getAddressMapping()
	 * @generated
	 */
	EReference getAddressMapping_Adresses();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.lina.cfg.gendata.AddressMapping#getOldNames <em>Old Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Old Names</em>'.
	 * @see de.upb.lina.cfg.gendata.AddressMapping#getOldNames()
	 * @see #getAddressMapping()
	 * @generated
	 */
	EAttribute getAddressMapping_OldNames();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.gendata.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.upb.lina.cfg.gendata.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.gendata.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.lina.cfg.gendata.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.gendata.Label#getControlFlowLocation <em>Control Flow Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Flow Location</em>'.
	 * @see de.upb.lina.cfg.gendata.Label#getControlFlowLocation()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_ControlFlowLocation();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.gendata.Label#getControlFlowDiagram <em>Control Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Flow Diagram</em>'.
	 * @see de.upb.lina.cfg.gendata.Label#getControlFlowDiagram()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_ControlFlowDiagram();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.gendata.ConstraintMapping <em>Constraint Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Mapping</em>'.
	 * @see de.upb.lina.cfg.gendata.ConstraintMapping
	 * @generated
	 */
	EClass getConstraintMapping();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.gendata.ConstraintMapping#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transition</em>'.
	 * @see de.upb.lina.cfg.gendata.ConstraintMapping#getTransition()
	 * @see #getConstraintMapping()
	 * @generated
	 */
	EReference getConstraintMapping_Transition();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.gendata.ConstraintMapping#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.upb.lina.cfg.gendata.ConstraintMapping#getCondition()
	 * @see #getConstraintMapping()
	 * @generated
	 */
	EAttribute getConstraintMapping_Condition();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.gendata.FunctionParamsMapping <em>Function Params Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Params Mapping</em>'.
	 * @see de.upb.lina.cfg.gendata.FunctionParamsMapping
	 * @generated
	 */
	EClass getFunctionParamsMapping();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.gendata.FunctionParamsMapping#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see de.upb.lina.cfg.gendata.FunctionParamsMapping#getFunction()
	 * @see #getFunctionParamsMapping()
	 * @generated
	 */
	EReference getFunctionParamsMapping_Function();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.gendata.FunctionParamsMapping#getCfg <em>Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cfg</em>'.
	 * @see de.upb.lina.cfg.gendata.FunctionParamsMapping#getCfg()
	 * @see #getFunctionParamsMapping()
	 * @generated
	 */
	EReference getFunctionParamsMapping_Cfg();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.gendata.FunctionParamsMapping#isNeedsReturnValue <em>Needs Return Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Return Value</em>'.
	 * @see de.upb.lina.cfg.gendata.FunctionParamsMapping#isNeedsReturnValue()
	 * @see #getFunctionParamsMapping()
	 * @generated
	 */
	EAttribute getFunctionParamsMapping_NeedsReturnValue();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.gendata.FunctionParamsMapping#isNeedsGetElementPtr <em>Needs Get Element Ptr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Get Element Ptr</em>'.
	 * @see de.upb.lina.cfg.gendata.FunctionParamsMapping#isNeedsGetElementPtr()
	 * @see #getFunctionParamsMapping()
	 * @generated
	 */
	EAttribute getFunctionParamsMapping_NeedsGetElementPtr();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.gendata.FunctionParamsMapping#isNeedsCas <em>Needs Cas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Cas</em>'.
	 * @see de.upb.lina.cfg.gendata.FunctionParamsMapping#isNeedsCas()
	 * @see #getFunctionParamsMapping()
	 * @generated
	 */
	EAttribute getFunctionParamsMapping_NeedsCas();

	/**
	 * Returns the meta object for the attribute list '{@link de.upb.lina.cfg.gendata.FunctionParamsMapping#getVarNamesInFunction <em>Var Names In Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Var Names In Function</em>'.
	 * @see de.upb.lina.cfg.gendata.FunctionParamsMapping#getVarNamesInFunction()
	 * @see #getFunctionParamsMapping()
	 * @generated
	 */
	EAttribute getFunctionParamsMapping_VarNamesInFunction();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GendataFactory getGendataFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals
	{
		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.gendata.impl.LocalVariablesImpl <em>Local Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.gendata.impl.LocalVariablesImpl
		 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getLocalVariables()
		 * @generated
		 */
		EClass LOCAL_VARIABLES = eINSTANCE.getLocalVariables();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_VARIABLES__VARIABLES = eINSTANCE.getLocalVariables_Variables();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.gendata.impl.GeneratorDataImpl <em>Generator Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.gendata.impl.GeneratorDataImpl
		 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getGeneratorData()
		 * @generated
		 */
		EClass GENERATOR_DATA = eINSTANCE.getGeneratorData();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_DATA__LOCAL_VARIABLES = eINSTANCE.getGeneratorData_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_DATA__PROGRAM = eINSTANCE.getGeneratorData_Program();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_DATA__LABELS = eINSTANCE.getGeneratorData_Labels();

		/**
		 * The meta object literal for the '<em><b>Cfgs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_DATA__CFGS = eINSTANCE.getGeneratorData_Cfgs();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_DATA__CONSTRAINTS = eINSTANCE.getGeneratorData_Constraints();

		/**
		 * The meta object literal for the '<em><b>Parameter Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_DATA__PARAMETER_MAPPINGS = eINSTANCE.getGeneratorData_ParameterMappings();

		/**
		 * The meta object literal for the '<em><b>Needs Get Element Ptr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_DATA__NEEDS_GET_ELEMENT_PTR = eINSTANCE.getGeneratorData_NeedsGetElementPtr();

		/**
		 * The meta object literal for the '<em><b>Needs Cas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GENERATOR_DATA__NEEDS_CAS = eINSTANCE.getGeneratorData_NeedsCas();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.gendata.impl.AddressMappingImpl <em>Address Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.gendata.impl.AddressMappingImpl
		 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getAddressMapping()
		 * @generated
		 */
		EClass ADDRESS_MAPPING = eINSTANCE.getAddressMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_MAPPING__NAME = eINSTANCE.getAddressMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Adresses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_MAPPING__ADRESSES = eINSTANCE.getAddressMapping_Adresses();

		/**
		 * The meta object literal for the '<em><b>Old Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_MAPPING__OLD_NAMES = eINSTANCE.getAddressMapping_OldNames();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.gendata.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.gendata.impl.LabelImpl
		 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__NAME = eINSTANCE.getLabel_Name();

		/**
		 * The meta object literal for the '<em><b>Control Flow Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__CONTROL_FLOW_LOCATION = eINSTANCE.getLabel_ControlFlowLocation();

		/**
		 * The meta object literal for the '<em><b>Control Flow Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__CONTROL_FLOW_DIAGRAM = eINSTANCE.getLabel_ControlFlowDiagram();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.gendata.impl.ConstraintMappingImpl <em>Constraint Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.gendata.impl.ConstraintMappingImpl
		 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getConstraintMapping()
		 * @generated
		 */
		EClass CONSTRAINT_MAPPING = eINSTANCE.getConstraintMapping();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_MAPPING__TRANSITION = eINSTANCE.getConstraintMapping_Transition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_MAPPING__CONDITION = eINSTANCE.getConstraintMapping_Condition();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.gendata.impl.FunctionParamsMappingImpl <em>Function Params Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.gendata.impl.FunctionParamsMappingImpl
		 * @see de.upb.lina.cfg.gendata.impl.GendataPackageImpl#getFunctionParamsMapping()
		 * @generated
		 */
		EClass FUNCTION_PARAMS_MAPPING = eINSTANCE.getFunctionParamsMapping();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PARAMS_MAPPING__FUNCTION = eINSTANCE.getFunctionParamsMapping_Function();

		/**
		 * The meta object literal for the '<em><b>Cfg</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_PARAMS_MAPPING__CFG = eINSTANCE.getFunctionParamsMapping_Cfg();

		/**
		 * The meta object literal for the '<em><b>Needs Return Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMS_MAPPING__NEEDS_RETURN_VALUE = eINSTANCE.getFunctionParamsMapping_NeedsReturnValue();

		/**
		 * The meta object literal for the '<em><b>Needs Get Element Ptr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMS_MAPPING__NEEDS_GET_ELEMENT_PTR = eINSTANCE.getFunctionParamsMapping_NeedsGetElementPtr();

		/**
		 * The meta object literal for the '<em><b>Needs Cas</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMS_MAPPING__NEEDS_CAS = eINSTANCE.getFunctionParamsMapping_NeedsCas();

		/**
		 * The meta object literal for the '<em><b>Var Names In Function</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_PARAMS_MAPPING__VAR_NAMES_IN_FUNCTION = eINSTANCE.getFunctionParamsMapping_VarNamesInFunction();

	}

} //GendataPackage
