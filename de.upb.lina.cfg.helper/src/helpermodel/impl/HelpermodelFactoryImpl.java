/**
 */
package helpermodel.impl;

import helpermodel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class HelpermodelFactoryImpl extends EFactoryImpl implements HelpermodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HelpermodelFactory init() {
		try {
			HelpermodelFactory theHelpermodelFactory = (HelpermodelFactory)EPackage.Registry.INSTANCE.getEFactory(HelpermodelPackage.eNS_URI);
			if (theHelpermodelFactory != null) {
				return theHelpermodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new HelpermodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpermodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case HelpermodelPackage.LOCAL_VARIABLES: return createLocalVariables();
			case HelpermodelPackage.HELPER_MODEL: return createHelperModel();
			case HelpermodelPackage.ADRESS_MAPPING: return createAdressMapping();
			case HelpermodelPackage.ADRESS: return createAdress();
			case HelpermodelPackage.LABEL: return createLabel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalVariables createLocalVariables() {
		LocalVariablesImpl localVariables = new LocalVariablesImpl();
		return localVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelperModel createHelperModel() {
		HelperModelImpl helperModel = new HelperModelImpl();
		return helperModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdressMapping createAdressMapping() {
		AdressMappingImpl adressMapping = new AdressMappingImpl();
		return adressMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adress createAdress() {
		AdressImpl adress = new AdressImpl();
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpermodelPackage getHelpermodelPackage() {
		return (HelpermodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static HelpermodelPackage getPackage() {
		return HelpermodelPackage.eINSTANCE;
	}

} //HelpermodelFactoryImpl
