/**
 */
package helpermodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see helpermodel.HelpermodelPackage
 * @generated
 */
public interface HelpermodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	HelpermodelFactory eINSTANCE = helpermodel.impl.HelpermodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local Variables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variables</em>'.
	 * @generated
	 */
	LocalVariables createLocalVariables();

	/**
	 * Returns a new object of class '<em>Helper Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Helper Model</em>'.
	 * @generated
	 */
	HelperModel createHelperModel();

	/**
	 * Returns a new object of class '<em>Adress Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adress Mapping</em>'.
	 * @generated
	 */
	AdressMapping createAdressMapping();

	/**
	 * Returns a new object of class '<em>Adress</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adress</em>'.
	 * @generated
	 */
	Adress createAdress();

	/**
	 * Returns a new object of class '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Label</em>'.
	 * @generated
	 */
	Label createLabel();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	HelpermodelPackage getHelpermodelPackage();

} //HelpermodelFactory
