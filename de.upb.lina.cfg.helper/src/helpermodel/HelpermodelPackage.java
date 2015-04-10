/**
 */
package helpermodel;

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
 * @see helpermodel.HelpermodelFactory
 * @model kind="package"
 * @generated
 */
public interface HelpermodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "helpermodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.upb.de/lina/cfg/helper";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "helpermodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelpermodelPackage eINSTANCE = helpermodel.impl.HelpermodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link helpermodel.impl.LocalVariablesImpl <em>Local Variables</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see helpermodel.impl.LocalVariablesImpl
	 * @see helpermodel.impl.HelpermodelPackageImpl#getLocalVariables()
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
	 * The meta object id for the '{@link helpermodel.impl.HelperModelImpl <em>Helper Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see helpermodel.impl.HelperModelImpl
	 * @see helpermodel.impl.HelpermodelPackageImpl#getHelperModel()
	 * @generated
	 */
	int HELPER_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Local Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_MODEL__LOCAL_VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Labels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_MODEL__LABELS = 1;

	/**
	 * The number of structural features of the '<em>Helper Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Helper Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HELPER_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link helpermodel.impl.AdressMappingImpl <em>Adress Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see helpermodel.impl.AdressMappingImpl
	 * @see helpermodel.impl.HelpermodelPackageImpl#getAdressMapping()
	 * @generated
	 */
	int ADRESS_MAPPING = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_MAPPING__NAME = 0;

	/**
	 * The feature id for the '<em><b>Adresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_MAPPING__ADRESSES = 1;

	/**
	 * The number of structural features of the '<em>Adress Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Adress Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link helpermodel.impl.AdressImpl <em>Adress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see helpermodel.impl.AdressImpl
	 * @see helpermodel.impl.HelpermodelPackageImpl#getAdress()
	 * @generated
	 */
	int ADRESS = 3;

	/**
	 * The feature id for the '<em><b>Ast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__AST = 0;

	/**
	 * The feature id for the '<em><b>Cfg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__CFG = 1;

	/**
	 * The number of structural features of the '<em>Adress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Adress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link helpermodel.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see helpermodel.impl.LabelImpl
	 * @see helpermodel.impl.HelpermodelPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 4;

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
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link helpermodel.LocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Variables</em>'.
	 * @see helpermodel.LocalVariables
	 * @generated
	 */
	EClass getLocalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link helpermodel.LocalVariables#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see helpermodel.LocalVariables#getVariables()
	 * @see #getLocalVariables()
	 * @generated
	 */
	EReference getLocalVariables_Variables();

	/**
	 * Returns the meta object for class '{@link helpermodel.HelperModel <em>Helper Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Helper Model</em>'.
	 * @see helpermodel.HelperModel
	 * @generated
	 */
	EClass getHelperModel();

	/**
	 * Returns the meta object for the containment reference '{@link helpermodel.HelperModel#getLocalVariables <em>Local Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Local Variables</em>'.
	 * @see helpermodel.HelperModel#getLocalVariables()
	 * @see #getHelperModel()
	 * @generated
	 */
	EReference getHelperModel_LocalVariables();

	/**
	 * Returns the meta object for the containment reference list '{@link helpermodel.HelperModel#getLabels <em>Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Labels</em>'.
	 * @see helpermodel.HelperModel#getLabels()
	 * @see #getHelperModel()
	 * @generated
	 */
	EReference getHelperModel_Labels();

	/**
	 * Returns the meta object for class '{@link helpermodel.AdressMapping <em>Adress Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adress Mapping</em>'.
	 * @see helpermodel.AdressMapping
	 * @generated
	 */
	EClass getAdressMapping();

	/**
	 * Returns the meta object for the attribute '{@link helpermodel.AdressMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see helpermodel.AdressMapping#getName()
	 * @see #getAdressMapping()
	 * @generated
	 */
	EAttribute getAdressMapping_Name();

	/**
	 * Returns the meta object for the reference list '{@link helpermodel.AdressMapping#getAdresses <em>Adresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Adresses</em>'.
	 * @see helpermodel.AdressMapping#getAdresses()
	 * @see #getAdressMapping()
	 * @generated
	 */
	EReference getAdressMapping_Adresses();

	/**
	 * Returns the meta object for class '{@link helpermodel.Adress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adress</em>'.
	 * @see helpermodel.Adress
	 * @generated
	 */
	EClass getAdress();

	/**
	 * Returns the meta object for the containment reference '{@link helpermodel.Adress#getAst <em>Ast</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ast</em>'.
	 * @see helpermodel.Adress#getAst()
	 * @see #getAdress()
	 * @generated
	 */
	EReference getAdress_Ast();

	/**
	 * Returns the meta object for the containment reference '{@link helpermodel.Adress#getCfg <em>Cfg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cfg</em>'.
	 * @see helpermodel.Adress#getCfg()
	 * @see #getAdress()
	 * @generated
	 */
	EReference getAdress_Cfg();

	/**
	 * Returns the meta object for class '{@link helpermodel.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see helpermodel.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link helpermodel.Label#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see helpermodel.Label#getName()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Name();

	/**
	 * Returns the meta object for the reference '{@link helpermodel.Label#getControlFlowLocation <em>Control Flow Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Control Flow Location</em>'.
	 * @see helpermodel.Label#getControlFlowLocation()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_ControlFlowLocation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	HelpermodelFactory getHelpermodelFactory();

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
	interface Literals {
		/**
		 * The meta object literal for the '{@link helpermodel.impl.LocalVariablesImpl <em>Local Variables</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see helpermodel.impl.LocalVariablesImpl
		 * @see helpermodel.impl.HelpermodelPackageImpl#getLocalVariables()
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
		 * The meta object literal for the '{@link helpermodel.impl.HelperModelImpl <em>Helper Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see helpermodel.impl.HelperModelImpl
		 * @see helpermodel.impl.HelpermodelPackageImpl#getHelperModel()
		 * @generated
		 */
		EClass HELPER_MODEL = eINSTANCE.getHelperModel();

		/**
		 * The meta object literal for the '<em><b>Local Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_MODEL__LOCAL_VARIABLES = eINSTANCE.getHelperModel_LocalVariables();

		/**
		 * The meta object literal for the '<em><b>Labels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HELPER_MODEL__LABELS = eINSTANCE.getHelperModel_Labels();

		/**
		 * The meta object literal for the '{@link helpermodel.impl.AdressMappingImpl <em>Adress Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see helpermodel.impl.AdressMappingImpl
		 * @see helpermodel.impl.HelpermodelPackageImpl#getAdressMapping()
		 * @generated
		 */
		EClass ADRESS_MAPPING = eINSTANCE.getAdressMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESS_MAPPING__NAME = eINSTANCE.getAdressMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Adresses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADRESS_MAPPING__ADRESSES = eINSTANCE.getAdressMapping_Adresses();

		/**
		 * The meta object literal for the '{@link helpermodel.impl.AdressImpl <em>Adress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see helpermodel.impl.AdressImpl
		 * @see helpermodel.impl.HelpermodelPackageImpl#getAdress()
		 * @generated
		 */
		EClass ADRESS = eINSTANCE.getAdress();

		/**
		 * The meta object literal for the '<em><b>Ast</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADRESS__AST = eINSTANCE.getAdress_Ast();

		/**
		 * The meta object literal for the '<em><b>Cfg</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADRESS__CFG = eINSTANCE.getAdress_Cfg();

		/**
		 * The meta object literal for the '{@link helpermodel.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see helpermodel.impl.LabelImpl
		 * @see helpermodel.impl.HelpermodelPackageImpl#getLabel()
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

	}

} //HelpermodelPackage
