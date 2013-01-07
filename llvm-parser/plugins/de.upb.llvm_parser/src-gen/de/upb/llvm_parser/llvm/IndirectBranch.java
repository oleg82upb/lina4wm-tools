/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Indirect Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.IndirectBranch#getLList <em>LList</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch()
 * @model
 * @generated
 */
public interface IndirectBranch extends Ret_Instr {
	/**
	 * Returns the value of the '<em><b>Adresstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresstype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresstype</em>' attribute.
	 * @see #setAdresstype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch_Adresstype()
	 * @model
	 * @generated
	 */
	String getAdresstype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdresstype <em>Adresstype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresstype</em>' attribute.
	 * @see #getAdresstype()
	 * @generated
	 */
	void setAdresstype(String value);

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' attribute.
	 * @see #setAdress(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch_Adress()
	 * @model
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.IndirectBranch#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>LList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LList</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LList</em>' containment reference.
	 * @see #setLList(LabelList)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getIndirectBranch_LList()
	 * @model containment="true"
	 * @generated
	 */
	LabelList getLList();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.IndirectBranch#getLList <em>LList</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LList</em>' containment reference.
	 * @see #getLList()
	 * @generated
	 */
	void setLList(LabelList value);

} // IndirectBranch
