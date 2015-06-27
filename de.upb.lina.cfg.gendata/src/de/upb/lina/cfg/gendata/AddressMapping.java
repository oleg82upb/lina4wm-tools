/**
 */
package de.upb.lina.cfg.gendata;

import de.upb.llvm_parser.llvm.Address;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.AddressMapping#getAdresses <em>Adresses</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.AddressMapping#getOldNames <em>Old Names</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.AddressMapping#getGeneratorData <em>Generator Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getAddressMapping()
 * @model
 * @generated
 */
public interface AddressMapping extends NamedElement
{
	/**
	 * Returns the value of the '<em><b>Adresses</b></em>' reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresses</em>' reference list.
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getAddressMapping_Adresses()
	 * @model
	 * @generated
	 */
	EList<Address> getAdresses();

	/**
	 * Returns the value of the '<em><b>Old Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Names</em>' attribute list.
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getAddressMapping_OldNames()
	 * @model default=""
	 * @generated
	 */
	EList<String> getOldNames();

	/**
	 * Returns the value of the '<em><b>Generator Data</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.gendata.GeneratorData#getAddressMappings <em>Address Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Data</em>' reference.
	 * @see #setGeneratorData(GeneratorData)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getAddressMapping_GeneratorData()
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getAddressMappings
	 * @model opposite="addressMappings"
	 * @generated
	 */
	GeneratorData getGeneratorData();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.AddressMapping#getGeneratorData <em>Generator Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Data</em>' reference.
	 * @see #getGeneratorData()
	 * @generated
	 */
	void setGeneratorData(GeneratorData value);

} // AddressMapping
