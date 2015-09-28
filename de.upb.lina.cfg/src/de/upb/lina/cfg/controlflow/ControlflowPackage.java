/**
 */
package de.upb.lina.cfg.controlflow;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.upb.lina.cfg.controlflow.ControlflowFactory
 * @model kind="package"
 * @generated
 */
public interface ControlflowPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "controlflow";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.upb.de/lina/cfg/controlflow";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "controlflow";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ControlflowPackage eINSTANCE = de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl <em>Control Flow Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getControlFlowDiagram()
	 * @generated
	 */
	int CONTROL_FLOW_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_DIAGRAM__LOCATIONS = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_DIAGRAM__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_DIAGRAM__START = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_DIAGRAM__NAME = 3;

	/**
	 * The feature id for the '<em><b>Variable Copies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES = 4;

	/**
	 * The feature id for the '<em><b>Variable Copy Params</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_DIAGRAM__VARIABLE_COPY_PARAMS = 5;

	/**
	 * The feature id for the '<em><b>Memory Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_DIAGRAM__MEMORY_MODEL = 6;

	/**
	 * The number of structural features of the '<em>Control Flow Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_DIAGRAM_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.ControlFlowLocationImpl <em>Control Flow Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.ControlFlowLocationImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getControlFlowLocation()
	 * @generated
	 */
	int CONTROL_FLOW_LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Pc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_LOCATION__PC = 0;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_LOCATION__DIAGRAM = 1;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_LOCATION__INCOMING = 2;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_LOCATION__OUTGOING = 3;

	/**
	 * The feature id for the '<em><b>Buffer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_LOCATION__BUFFER = 4;

	/**
	 * The number of structural features of the '<em>Control Flow Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROL_FLOW_LOCATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.TransitionImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__INSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DIAGRAM = 3;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.WriteDefChainTransitionImpl <em>Write Def Chain Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.WriteDefChainTransitionImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getWriteDefChainTransition()
	 * @generated
	 */
	int WRITE_DEF_CHAIN_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DEF_CHAIN_TRANSITION__INSTRUCTION = TRANSITION__INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DEF_CHAIN_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DEF_CHAIN_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DEF_CHAIN_TRANSITION__DIAGRAM = TRANSITION__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Copy Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DEF_CHAIN_TRANSITION__COPY_ADDRESS = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copy Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DEF_CHAIN_TRANSITION__COPY_VALUE = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Write Def Chain Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_DEF_CHAIN_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.EarlyReadTransitionImpl <em>Early Read Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.EarlyReadTransitionImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getEarlyReadTransition()
	 * @generated
	 */
	int EARLY_READ_TRANSITION = 4;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_READ_TRANSITION__INSTRUCTION = TRANSITION__INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_READ_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_READ_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_READ_TRANSITION__DIAGRAM = TRANSITION__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Assignment Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_READ_TRANSITION__ASSIGNMENT_EXPRESSION = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Early Read Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EARLY_READ_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.GuardedTransitionImpl <em>Guarded Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.GuardedTransitionImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getGuardedTransition()
	 * @generated
	 */
	int GUARDED_TRANSITION = 5;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__INSTRUCTION = TRANSITION__INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__DIAGRAM = TRANSITION__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION__CONDITION = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Guarded Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARDED_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.MultiTransitionImpl <em>Multi Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.MultiTransitionImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getMultiTransition()
	 * @generated
	 */
	int MULTI_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRANSITION__INSTRUCTION = TRANSITION__INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRANSITION__DIAGRAM = TRANSITION__DIAGRAM;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRANSITION__INSTRUCTIONS = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Multi Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.FlushTransitionImpl <em>Flush Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.FlushTransitionImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getFlushTransition()
	 * @generated
	 */
	int FLUSH_TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUSH_TRANSITION__INSTRUCTION = TRANSITION__INSTRUCTION;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUSH_TRANSITION__SOURCE = TRANSITION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUSH_TRANSITION__TARGET = TRANSITION__TARGET;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUSH_TRANSITION__DIAGRAM = TRANSITION__DIAGRAM;

	/**
	 * The number of structural features of the '<em>Flush Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLUSH_TRANSITION_FEATURE_COUNT = TRANSITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.AddressValuePairImpl <em>Address Value Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.AddressValuePairImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getAddressValuePair()
	 * @generated
	 */
	int ADDRESS_VALUE_PAIR = 8;

	/**
	 * The feature id for the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_VALUE_PAIR__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_VALUE_PAIR__VALUES = 1;

	/**
	 * The feature id for the '<em><b>Store Buffer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_VALUE_PAIR__STORE_BUFFER = 2;

	/**
	 * The number of structural features of the '<em>Address Value Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_VALUE_PAIR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link de.upb.lina.cfg.controlflow.impl.StoreBufferImpl <em>Store Buffer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.upb.lina.cfg.controlflow.impl.StoreBufferImpl
	 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getStoreBuffer()
	 * @generated
	 */
	int STORE_BUFFER = 9;

	/**
	 * The feature id for the '<em><b>Address Value Pairs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_BUFFER__ADDRESS_VALUE_PAIRS = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_BUFFER__LOCATION = 1;

	/**
	 * The number of structural features of the '<em>Store Buffer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_BUFFER_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram <em>Control Flow Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Diagram</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram
	 * @generated
	 */
	EClass getControlFlowDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getLocations()
	 * @see #getControlFlowDiagram()
	 * @generated
	 */
	EReference getControlFlowDiagram_Locations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getTransitions()
	 * @see #getControlFlowDiagram()
	 * @generated
	 */
	EReference getControlFlowDiagram_Transitions();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getStart()
	 * @see #getControlFlowDiagram()
	 * @generated
	 */
	EReference getControlFlowDiagram_Start();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getName()
	 * @see #getControlFlowDiagram()
	 * @generated
	 */
	EAttribute getControlFlowDiagram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getVariableCopies <em>Variable Copies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Copies</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getVariableCopies()
	 * @see #getControlFlowDiagram()
	 * @generated
	 */
	EReference getControlFlowDiagram_VariableCopies();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getVariableCopyParams <em>Variable Copy Params</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable Copy Params</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getVariableCopyParams()
	 * @see #getControlFlowDiagram()
	 * @generated
	 */
	EReference getControlFlowDiagram_VariableCopyParams();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getMemoryModel <em>Memory Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory Model</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getMemoryModel()
	 * @see #getControlFlowDiagram()
	 * @generated
	 */
	EAttribute getControlFlowDiagram_MemoryModel();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation <em>Control Flow Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Control Flow Location</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowLocation
	 * @generated
	 */
	EClass getControlFlowLocation();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getPc <em>Pc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pc</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowLocation#getPc()
	 * @see #getControlFlowLocation()
	 * @generated
	 */
	EAttribute getControlFlowLocation_Pc();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowLocation#getDiagram()
	 * @see #getControlFlowLocation()
	 * @generated
	 */
	EReference getControlFlowLocation_Diagram();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowLocation#getIncoming()
	 * @see #getControlFlowLocation()
	 * @generated
	 */
	EReference getControlFlowLocation_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowLocation#getOutgoing()
	 * @see #getControlFlowLocation()
	 * @generated
	 */
	EReference getControlFlowLocation_Outgoing();

	/**
	 * Returns the meta object for the containment reference '{@link de.upb.lina.cfg.controlflow.ControlFlowLocation#getBuffer <em>Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Buffer</em>'.
	 * @see de.upb.lina.cfg.controlflow.ControlFlowLocation#getBuffer()
	 * @see #getControlFlowLocation()
	 * @generated
	 */
	EReference getControlFlowLocation_Buffer();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see de.upb.lina.cfg.controlflow.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.controlflow.Transition#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Instruction</em>'.
	 * @see de.upb.lina.cfg.controlflow.Transition#getInstruction()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Instruction();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.controlflow.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see de.upb.lina.cfg.controlflow.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.controlflow.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see de.upb.lina.cfg.controlflow.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.lina.cfg.controlflow.Transition#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Diagram</em>'.
	 * @see de.upb.lina.cfg.controlflow.Transition#getDiagram()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Diagram();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.WriteDefChainTransition <em>Write Def Chain Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Def Chain Transition</em>'.
	 * @see de.upb.lina.cfg.controlflow.WriteDefChainTransition
	 * @generated
	 */
	EClass getWriteDefChainTransition();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.controlflow.WriteDefChainTransition#getCopyAddress <em>Copy Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copy Address</em>'.
	 * @see de.upb.lina.cfg.controlflow.WriteDefChainTransition#getCopyAddress()
	 * @see #getWriteDefChainTransition()
	 * @generated
	 */
	EReference getWriteDefChainTransition_CopyAddress();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.controlflow.WriteDefChainTransition#getCopyValue <em>Copy Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Copy Value</em>'.
	 * @see de.upb.lina.cfg.controlflow.WriteDefChainTransition#getCopyValue()
	 * @see #getWriteDefChainTransition()
	 * @generated
	 */
	EReference getWriteDefChainTransition_CopyValue();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.EarlyReadTransition <em>Early Read Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Early Read Transition</em>'.
	 * @see de.upb.lina.cfg.controlflow.EarlyReadTransition
	 * @generated
	 */
	EClass getEarlyReadTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.controlflow.EarlyReadTransition#getAssignmentExpression <em>Assignment Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assignment Expression</em>'.
	 * @see de.upb.lina.cfg.controlflow.EarlyReadTransition#getAssignmentExpression()
	 * @see #getEarlyReadTransition()
	 * @generated
	 */
	EAttribute getEarlyReadTransition_AssignmentExpression();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.GuardedTransition <em>Guarded Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guarded Transition</em>'.
	 * @see de.upb.lina.cfg.controlflow.GuardedTransition
	 * @generated
	 */
	EClass getGuardedTransition();

	/**
	 * Returns the meta object for the attribute '{@link de.upb.lina.cfg.controlflow.GuardedTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see de.upb.lina.cfg.controlflow.GuardedTransition#getCondition()
	 * @see #getGuardedTransition()
	 * @generated
	 */
	EAttribute getGuardedTransition_Condition();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.MultiTransition <em>Multi Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Transition</em>'.
	 * @see de.upb.lina.cfg.controlflow.MultiTransition
	 * @generated
	 */
	EClass getMultiTransition();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.lina.cfg.controlflow.MultiTransition#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instructions</em>'.
	 * @see de.upb.lina.cfg.controlflow.MultiTransition#getInstructions()
	 * @see #getMultiTransition()
	 * @generated
	 */
	EReference getMultiTransition_Instructions();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.FlushTransition <em>Flush Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flush Transition</em>'.
	 * @see de.upb.lina.cfg.controlflow.FlushTransition
	 * @generated
	 */
	EClass getFlushTransition();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.AddressValuePair <em>Address Value Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Value Pair</em>'.
	 * @see de.upb.lina.cfg.controlflow.AddressValuePair
	 * @generated
	 */
	EClass getAddressValuePair();

	/**
	 * Returns the meta object for the reference '{@link de.upb.lina.cfg.controlflow.AddressValuePair#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Address</em>'.
	 * @see de.upb.lina.cfg.controlflow.AddressValuePair#getAddress()
	 * @see #getAddressValuePair()
	 * @generated
	 */
	EReference getAddressValuePair_Address();

	/**
	 * Returns the meta object for the reference list '{@link de.upb.lina.cfg.controlflow.AddressValuePair#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see de.upb.lina.cfg.controlflow.AddressValuePair#getValues()
	 * @see #getAddressValuePair()
	 * @generated
	 */
	EReference getAddressValuePair_Values();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.lina.cfg.controlflow.AddressValuePair#getStoreBuffer <em>Store Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Store Buffer</em>'.
	 * @see de.upb.lina.cfg.controlflow.AddressValuePair#getStoreBuffer()
	 * @see #getAddressValuePair()
	 * @generated
	 */
	EReference getAddressValuePair_StoreBuffer();

	/**
	 * Returns the meta object for class '{@link de.upb.lina.cfg.controlflow.StoreBuffer <em>Store Buffer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Store Buffer</em>'.
	 * @see de.upb.lina.cfg.controlflow.StoreBuffer
	 * @generated
	 */
	EClass getStoreBuffer();

	/**
	 * Returns the meta object for the containment reference list '{@link de.upb.lina.cfg.controlflow.StoreBuffer#getAddressValuePairs <em>Address Value Pairs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address Value Pairs</em>'.
	 * @see de.upb.lina.cfg.controlflow.StoreBuffer#getAddressValuePairs()
	 * @see #getStoreBuffer()
	 * @generated
	 */
	EReference getStoreBuffer_AddressValuePairs();

	/**
	 * Returns the meta object for the container reference '{@link de.upb.lina.cfg.controlflow.StoreBuffer#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Location</em>'.
	 * @see de.upb.lina.cfg.controlflow.StoreBuffer#getLocation()
	 * @see #getStoreBuffer()
	 * @generated
	 */
	EReference getStoreBuffer_Location();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ControlflowFactory getControlflowFactory();

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
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl <em>Control Flow Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getControlFlowDiagram()
		 * @generated
		 */
		EClass CONTROL_FLOW_DIAGRAM = eINSTANCE.getControlFlowDiagram();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_DIAGRAM__LOCATIONS = eINSTANCE.getControlFlowDiagram_Locations();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_DIAGRAM__TRANSITIONS = eINSTANCE.getControlFlowDiagram_Transitions();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_DIAGRAM__START = eINSTANCE.getControlFlowDiagram_Start();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW_DIAGRAM__NAME = eINSTANCE.getControlFlowDiagram_Name();

		/**
		 * The meta object literal for the '<em><b>Variable Copies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES = eINSTANCE.getControlFlowDiagram_VariableCopies();

		/**
		 * The meta object literal for the '<em><b>Variable Copy Params</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_DIAGRAM__VARIABLE_COPY_PARAMS = eINSTANCE.getControlFlowDiagram_VariableCopyParams();

		/**
		 * The meta object literal for the '<em><b>Memory Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW_DIAGRAM__MEMORY_MODEL = eINSTANCE.getControlFlowDiagram_MemoryModel();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.ControlFlowLocationImpl <em>Control Flow Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.ControlFlowLocationImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getControlFlowLocation()
		 * @generated
		 */
		EClass CONTROL_FLOW_LOCATION = eINSTANCE.getControlFlowLocation();

		/**
		 * The meta object literal for the '<em><b>Pc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTROL_FLOW_LOCATION__PC = eINSTANCE.getControlFlowLocation_Pc();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_LOCATION__DIAGRAM = eINSTANCE.getControlFlowLocation_Diagram();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_LOCATION__INCOMING = eINSTANCE.getControlFlowLocation_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_LOCATION__OUTGOING = eINSTANCE.getControlFlowLocation_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Buffer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROL_FLOW_LOCATION__BUFFER = eINSTANCE.getControlFlowLocation_Buffer();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.TransitionImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__INSTRUCTION = eINSTANCE.getTransition_Instruction();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__DIAGRAM = eINSTANCE.getTransition_Diagram();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.WriteDefChainTransitionImpl <em>Write Def Chain Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.WriteDefChainTransitionImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getWriteDefChainTransition()
		 * @generated
		 */
		EClass WRITE_DEF_CHAIN_TRANSITION = eINSTANCE.getWriteDefChainTransition();

		/**
		 * The meta object literal for the '<em><b>Copy Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_DEF_CHAIN_TRANSITION__COPY_ADDRESS = eINSTANCE.getWriteDefChainTransition_CopyAddress();

		/**
		 * The meta object literal for the '<em><b>Copy Value</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WRITE_DEF_CHAIN_TRANSITION__COPY_VALUE = eINSTANCE.getWriteDefChainTransition_CopyValue();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.EarlyReadTransitionImpl <em>Early Read Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.EarlyReadTransitionImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getEarlyReadTransition()
		 * @generated
		 */
		EClass EARLY_READ_TRANSITION = eINSTANCE.getEarlyReadTransition();

		/**
		 * The meta object literal for the '<em><b>Assignment Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EARLY_READ_TRANSITION__ASSIGNMENT_EXPRESSION = eINSTANCE.getEarlyReadTransition_AssignmentExpression();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.GuardedTransitionImpl <em>Guarded Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.GuardedTransitionImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getGuardedTransition()
		 * @generated
		 */
		EClass GUARDED_TRANSITION = eINSTANCE.getGuardedTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARDED_TRANSITION__CONDITION = eINSTANCE.getGuardedTransition_Condition();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.MultiTransitionImpl <em>Multi Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.MultiTransitionImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getMultiTransition()
		 * @generated
		 */
		EClass MULTI_TRANSITION = eINSTANCE.getMultiTransition();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_TRANSITION__INSTRUCTIONS = eINSTANCE.getMultiTransition_Instructions();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.FlushTransitionImpl <em>Flush Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.FlushTransitionImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getFlushTransition()
		 * @generated
		 */
		EClass FLUSH_TRANSITION = eINSTANCE.getFlushTransition();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.AddressValuePairImpl <em>Address Value Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.AddressValuePairImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getAddressValuePair()
		 * @generated
		 */
		EClass ADDRESS_VALUE_PAIR = eINSTANCE.getAddressValuePair();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_VALUE_PAIR__ADDRESS = eINSTANCE.getAddressValuePair_Address();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_VALUE_PAIR__VALUES = eINSTANCE.getAddressValuePair_Values();

		/**
		 * The meta object literal for the '<em><b>Store Buffer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_VALUE_PAIR__STORE_BUFFER = eINSTANCE.getAddressValuePair_StoreBuffer();

		/**
		 * The meta object literal for the '{@link de.upb.lina.cfg.controlflow.impl.StoreBufferImpl <em>Store Buffer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.upb.lina.cfg.controlflow.impl.StoreBufferImpl
		 * @see de.upb.lina.cfg.controlflow.impl.ControlflowPackageImpl#getStoreBuffer()
		 * @generated
		 */
		EClass STORE_BUFFER = eINSTANCE.getStoreBuffer();

		/**
		 * The meta object literal for the '<em><b>Address Value Pairs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_BUFFER__ADDRESS_VALUE_PAIRS = eINSTANCE.getStoreBuffer_AddressValuePairs();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORE_BUFFER__LOCATION = eINSTANCE.getStoreBuffer_Location();

	}

} //ControlflowPackage
