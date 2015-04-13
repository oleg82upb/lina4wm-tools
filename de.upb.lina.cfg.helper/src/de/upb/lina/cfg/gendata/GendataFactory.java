/**
 */
package de.upb.lina.cfg.gendata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.upb.lina.cfg.gendata.GendataPackage
 * @generated
 */
public interface GendataFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GendataFactory eINSTANCE = de.upb.lina.cfg.gendata.impl.GendataFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Local Variables</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Variables</em>'.
	 * @generated
	 */
	LocalVariables createLocalVariables();

	/**
	 * Returns a new object of class '<em>Generator Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Data</em>'.
	 * @generated
	 */
	GeneratorData createGeneratorData();

	/**
	 * Returns a new object of class '<em>Address Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address Mapping</em>'.
	 * @generated
	 */
	AddressMapping createAddressMapping();

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
	GendataPackage getGendataPackage();

} //GendataFactory
