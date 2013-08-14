/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.AddressUse#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAddressUse()
 * @model
 * @generated
 */
public interface AddressUse extends TypeUse, Value
{
  /**
	 * Returns the value of the '<em><b>Address</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Address</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' reference.
	 * @see #setAddress(Address)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAddressUse_Address()
	 * @model
	 * @generated
	 */
  Address getAddress();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AddressUse#getAddress <em>Address</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' reference.
	 * @see #getAddress()
	 * @generated
	 */
  void setAddress(Address value);

} // AddressUse
