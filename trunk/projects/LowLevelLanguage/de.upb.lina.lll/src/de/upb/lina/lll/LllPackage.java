/**
 */
package de.upb.lina.lll;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.lina.lll.LllFactory
 * @model kind="package"
 * @generated
 */
public interface LllPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "lll";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.upb.de/lina/lll";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.upb.lina";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LllPackage eINSTANCE = de.upb.lina.lll.impl.LllPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.ProgramImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Global Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__GLOBAL_VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.FunctionImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PROGRAM = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Local Variables Or Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LOCAL_VARIABLES_OR_VALUES = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__LABELS = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INSTRUCTIONS = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Input Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INPUT_PARAMETERS = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.LabelImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 2;

	/**
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__EANNOTATIONS = EcorePackage.ENAMED_ELEMENT__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__NAME = EcorePackage.ENAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FUNCTION = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__INSTRUCTION = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = EcorePackage.ENAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.InstructionImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 3;

	/**
	 * The feature id for the '<em><b>Instruction Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__INSTRUCTION_RESULT = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION__PARAMETERS = 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.FunctionCallImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 4;

	/**
	 * The feature id for the '<em><b>Instruction Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__INSTRUCTION_RESULT = INSTRUCTION__INSTRUCTION_RESULT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNCTION = INSTRUCTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__PARAMETERS = INSTRUCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Invoked Function</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__INVOKED_FUNCTION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.GotoImpl <em>Goto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.GotoImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getGoto()
	 * @generated
	 */
	int GOTO = 6;

	/**
	 * The feature id for the '<em><b>Instruction Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__INSTRUCTION_RESULT = INSTRUCTION__INSTRUCTION_RESULT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__FUNCTION = INSTRUCTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__PARAMETERS = INSTRUCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO__TARGET = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Goto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GOTO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.ConditionalBranchImpl <em>Conditional Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.ConditionalBranchImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getConditionalBranch()
	 * @generated
	 */
	int CONDITIONAL_BRANCH = 5;

	/**
	 * The feature id for the '<em><b>Instruction Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH__INSTRUCTION_RESULT = GOTO__INSTRUCTION_RESULT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH__FUNCTION = GOTO__FUNCTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH__PARAMETERS = GOTO__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH__TARGET = GOTO__TARGET;

	/**
	 * The feature id for the '<em><b>Else Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH__ELSE_TARGET = GOTO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH__CONDITION = GOTO_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conditional Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH_FEATURE_COUNT = GOTO_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.VariableOrValueImpl <em>Variable Or Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.VariableOrValueImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getVariableOrValue()
	 * @generated
	 */
	int VARIABLE_OR_VALUE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_VALUE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_VALUE__FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Variable Or Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OR_VALUE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.ConstantImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = VARIABLE_OR_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__FUNCTION = VARIABLE_OR_VALUE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__VALUE = VARIABLE_OR_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = VARIABLE_OR_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.VariableImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = VARIABLE_OR_VALUE__TYPE;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FUNCTION = VARIABLE_OR_VALUE__FUNCTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = VARIABLE_OR_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Program</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__PROGRAM = VARIABLE_OR_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = VARIABLE_OR_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.TypeImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 10;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.SimpleTypeImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getSimpleType()
	 * @generated
	 */
	int SIMPLE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE__TYPE = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.ComplexTypeImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getComplexType()
	 * @generated
	 */
	int COMPLEX_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE__NAME = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.LocalComputationImpl <em>Local Computation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.LocalComputationImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getLocalComputation()
	 * @generated
	 */
	int LOCAL_COMPUTATION = 13;

	/**
	 * The feature id for the '<em><b>Instruction Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPUTATION__INSTRUCTION_RESULT = INSTRUCTION__INSTRUCTION_RESULT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPUTATION__FUNCTION = INSTRUCTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPUTATION__PARAMETERS = INSTRUCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPUTATION__EXPRESSION = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Computation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_COMPUTATION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.impl.MemoryInstructionImpl <em>Memory Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.impl.MemoryInstructionImpl
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getMemoryInstruction()
	 * @generated
	 */
	int MEMORY_INSTRUCTION = 14;

	/**
	 * The feature id for the '<em><b>Instruction Result</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTRUCTION__INSTRUCTION_RESULT = INSTRUCTION__INSTRUCTION_RESULT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTRUCTION__FUNCTION = INSTRUCTION__FUNCTION;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTRUCTION__PARAMETERS = INSTRUCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Instruction Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTRUCTION__INSTRUCTION_TYPE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Memory Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMORY_INSTRUCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.MemoryInstructionType <em>Memory Instruction Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.MemoryInstructionType
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getMemoryInstructionType()
	 * @generated
	 */
	int MEMORY_INSTRUCTION_TYPE = 15;

	/**
	 * The meta object id for the '{@link de.upb.lina.lll.PrimitiveType <em>Primitive Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.lll.PrimitiveType
	 * @see de.upb.lina.lll.impl.LllPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 16;


	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see de.upb.lina.lll.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.lll.Program#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see de.upb.lina.lll.Program#getFunctions()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.lll.Program#getGlobalVariables <em>Global Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Global Variables</em>'.
	 * @see de.upb.lina.lll.Program#getGlobalVariables()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_GlobalVariables();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see de.upb.lina.lll.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.lina.lll.Function#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see de.upb.lina.lll.Function#getProgram()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Program();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.lll.Function#getLocalVariablesOrValues <em>Local Variables Or Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Local Variables Or Values</em>'.
	 * @see de.upb.lina.lll.Function#getLocalVariablesOrValues()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_LocalVariablesOrValues();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.lll.Function#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see de.upb.lina.lll.Function#getLabels()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Labels();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.lll.Function#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see de.upb.lina.lll.Function#getInstructions()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Instructions();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.lina.lll.Function#getInputParameters <em>Input Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input Parameters</em>'.
	 * @see de.upb.lina.lll.Function#getInputParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_InputParameters();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see de.upb.lina.lll.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.lina.lll.Label#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Function</em>'.
	 * @see de.upb.lina.lll.Label#getFunction()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Function();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.lll.Label#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction</em>'.
	 * @see de.upb.lina.lll.Label#getInstruction()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Instruction();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see de.upb.lina.lll.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.lll.Instruction#getInstructionResult <em>Instruction Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction Result</em>'.
	 * @see de.upb.lina.lll.Instruction#getInstructionResult()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_InstructionResult();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.lina.lll.Instruction#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Function</em>'.
	 * @see de.upb.lina.lll.Instruction#getFunction()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Function();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.lina.lll.Instruction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see de.upb.lina.lll.Instruction#getParameters()
	 * @see #getInstruction()
	 * @generated
	 */
	EReference getInstruction_Parameters();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see de.upb.lina.lll.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.lll.FunctionCall#getInvokedFunction <em>Invoked Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invoked Function</em>'.
	 * @see de.upb.lina.lll.FunctionCall#getInvokedFunction()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_InvokedFunction();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.ConditionalBranch <em>Conditional Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Branch</em>'.
	 * @see de.upb.lina.lll.ConditionalBranch
	 * @generated
	 */
	EClass getConditionalBranch();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.lll.ConditionalBranch#getElseTarget <em>Else Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Else Target</em>'.
	 * @see de.upb.lina.lll.ConditionalBranch#getElseTarget()
	 * @see #getConditionalBranch()
	 * @generated
	 */
	EReference getConditionalBranch_ElseTarget();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.lll.ConditionalBranch#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see de.upb.lina.lll.ConditionalBranch#getCondition()
	 * @see #getConditionalBranch()
	 * @generated
	 */
	EReference getConditionalBranch_Condition();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.Goto <em>Goto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Goto</em>'.
	 * @see de.upb.lina.lll.Goto
	 * @generated
	 */
	EClass getGoto();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.lll.Goto#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.upb.lina.lll.Goto#getTarget()
	 * @see #getGoto()
	 * @generated
	 */
	EReference getGoto_Target();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.VariableOrValue <em>Variable Or Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Or Value</em>'.
	 * @see de.upb.lina.lll.VariableOrValue
	 * @generated
	 */
	EClass getVariableOrValue();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.lll.VariableOrValue#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see de.upb.lina.lll.VariableOrValue#getType()
	 * @see #getVariableOrValue()
	 * @generated
	 */
	EReference getVariableOrValue_Type();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.lina.lll.VariableOrValue#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Function</em>'.
	 * @see de.upb.lina.lll.VariableOrValue#getFunction()
	 * @see #getVariableOrValue()
	 * @generated
	 */
	EReference getVariableOrValue_Function();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see de.upb.lina.lll.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.lll.Constant#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.upb.lina.lll.Constant#getValue()
	 * @see #getConstant()
	 * @generated
	 */
	EAttribute getConstant_Value();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see de.upb.lina.lll.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.lll.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.lina.lll.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.lina.lll.Variable#getProgram <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Program</em>'.
	 * @see de.upb.lina.lll.Variable#getProgram()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Program();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see de.upb.lina.lll.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.SimpleType <em>Simple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Type</em>'.
	 * @see de.upb.lina.lll.SimpleType
	 * @generated
	 */
	EClass getSimpleType();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.lll.SimpleType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.upb.lina.lll.SimpleType#getType()
	 * @see #getSimpleType()
	 * @generated
	 */
	EAttribute getSimpleType_Type();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.ComplexType <em>Complex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type</em>'.
	 * @see de.upb.lina.lll.ComplexType
	 * @generated
	 */
	EClass getComplexType();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.lll.ComplexType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.lina.lll.ComplexType#getName()
	 * @see #getComplexType()
	 * @generated
	 */
	EAttribute getComplexType_Name();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.LocalComputation <em>Local Computation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Computation</em>'.
	 * @see de.upb.lina.lll.LocalComputation
	 * @generated
	 */
	EClass getLocalComputation();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.lll.LocalComputation#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expression</em>'.
	 * @see de.upb.lina.lll.LocalComputation#getExpression()
	 * @see #getLocalComputation()
	 * @generated
	 */
	EReference getLocalComputation_Expression();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.lll.MemoryInstruction <em>Memory Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memory Instruction</em>'.
	 * @see de.upb.lina.lll.MemoryInstruction
	 * @generated
	 */
	EClass getMemoryInstruction();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.lll.MemoryInstruction#getInstructionType <em>Instruction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instruction Type</em>'.
	 * @see de.upb.lina.lll.MemoryInstruction#getInstructionType()
	 * @see #getMemoryInstruction()
	 * @generated
	 */
	EAttribute getMemoryInstruction_InstructionType();

	/**
	 * Returns the meta object for enum '{@link de.upb.lina.lll.MemoryInstructionType <em>Memory Instruction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Memory Instruction Type</em>'.
	 * @see de.upb.lina.lll.MemoryInstructionType
	 * @generated
	 */
	EEnum getMemoryInstructionType();

	/**
	 * Returns the meta object for enum '{@link de.upb.lina.lll.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Primitive Type</em>'.
	 * @see de.upb.lina.lll.PrimitiveType
	 * @generated
	 */
	EEnum getPrimitiveType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LllFactory getLllFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.ProgramImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FUNCTIONS = eINSTANCE.getProgram_Functions();

		/**
		 * The meta object literal for the '<em><b>Global Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__GLOBAL_VARIABLES = eINSTANCE.getProgram_GlobalVariables();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.FunctionImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PROGRAM = eINSTANCE.getFunction_Program();

		/**
		 * The meta object literal for the '<em><b>Local Variables Or Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__LOCAL_VARIABLES_OR_VALUES = eINSTANCE.getFunction_LocalVariablesOrValues();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__LABELS = eINSTANCE.getFunction_Labels();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INSTRUCTIONS = eINSTANCE.getFunction_Instructions();

		/**
		 * The meta object literal for the '<em><b>Input Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__INPUT_PARAMETERS = eINSTANCE.getFunction_InputParameters();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.LabelImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__FUNCTION = eINSTANCE.getLabel_Function();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__INSTRUCTION = eINSTANCE.getLabel_Instruction();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.InstructionImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '<em><b>Instruction Result</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__INSTRUCTION_RESULT = eINSTANCE.getInstruction_InstructionResult();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__FUNCTION = eINSTANCE.getInstruction_Function();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTION__PARAMETERS = eINSTANCE.getInstruction_Parameters();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.FunctionCallImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Invoked Function</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__INVOKED_FUNCTION = eINSTANCE.getFunctionCall_InvokedFunction();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.ConditionalBranchImpl <em>Conditional Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.ConditionalBranchImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getConditionalBranch()
		 * @generated
		 */
		EClass CONDITIONAL_BRANCH = eINSTANCE.getConditionalBranch();

		/**
		 * The meta object literal for the '<em><b>Else Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_BRANCH__ELSE_TARGET = eINSTANCE.getConditionalBranch_ElseTarget();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_BRANCH__CONDITION = eINSTANCE.getConditionalBranch_Condition();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.GotoImpl <em>Goto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.GotoImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getGoto()
		 * @generated
		 */
		EClass GOTO = eINSTANCE.getGoto();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GOTO__TARGET = eINSTANCE.getGoto_Target();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.VariableOrValueImpl <em>Variable Or Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.VariableOrValueImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getVariableOrValue()
		 * @generated
		 */
		EClass VARIABLE_OR_VALUE = eINSTANCE.getVariableOrValue();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_OR_VALUE__TYPE = eINSTANCE.getVariableOrValue_Type();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_OR_VALUE__FUNCTION = eINSTANCE.getVariableOrValue_Function();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.ConstantImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANT__VALUE = eINSTANCE.getConstant_Value();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.VariableImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Program</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__PROGRAM = eINSTANCE.getVariable_Program();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.TypeImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.SimpleTypeImpl <em>Simple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.SimpleTypeImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getSimpleType()
		 * @generated
		 */
		EClass SIMPLE_TYPE = eINSTANCE.getSimpleType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_TYPE__TYPE = eINSTANCE.getSimpleType_Type();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.ComplexTypeImpl <em>Complex Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.ComplexTypeImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getComplexType()
		 * @generated
		 */
		EClass COMPLEX_TYPE = eINSTANCE.getComplexType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLEX_TYPE__NAME = eINSTANCE.getComplexType_Name();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.LocalComputationImpl <em>Local Computation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.LocalComputationImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getLocalComputation()
		 * @generated
		 */
		EClass LOCAL_COMPUTATION = eINSTANCE.getLocalComputation();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCAL_COMPUTATION__EXPRESSION = eINSTANCE.getLocalComputation_Expression();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.impl.MemoryInstructionImpl <em>Memory Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.impl.MemoryInstructionImpl
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getMemoryInstruction()
		 * @generated
		 */
		EClass MEMORY_INSTRUCTION = eINSTANCE.getMemoryInstruction();

		/**
		 * The meta object literal for the '<em><b>Instruction Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEMORY_INSTRUCTION__INSTRUCTION_TYPE = eINSTANCE.getMemoryInstruction_InstructionType();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.MemoryInstructionType <em>Memory Instruction Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.MemoryInstructionType
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getMemoryInstructionType()
		 * @generated
		 */
		EEnum MEMORY_INSTRUCTION_TYPE = eINSTANCE.getMemoryInstructionType();

		/**
		 * The meta object literal for the '{@link de.upb.lina.lll.PrimitiveType <em>Primitive Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.lll.PrimitiveType
		 * @see de.upb.lina.lll.impl.LllPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

	}

} //LllPackage
