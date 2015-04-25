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
	String eNS_PREFIX = "de.upb.lina.cfg";

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
	 * The number of structural features of the '<em>Generator Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_DATA_FEATURE_COUNT = 4;

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
	 * The number of structural features of the '<em>Address Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_MAPPING_FEATURE_COUNT = 2;

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

	}

} //GendataPackage
