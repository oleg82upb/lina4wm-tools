/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Alloc#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Alloc#getTypelist <em>Typelist</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Alloc#getNumelementstype <em>Numelementstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Alloc#getNumelementsvalue <em>Numelementsvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc()
 * @model
 * @generated
 */
public interface Alloc extends StandartInstruction {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getType();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alloc#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Typelist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typelist</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typelist</em>' containment reference.
	 * @see #setTypelist(TypeList)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc_Typelist()
	 * @model containment="true"
	 * @generated
	 */
	TypeList getTypelist();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alloc#getTypelist <em>Typelist</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typelist</em>' containment reference.
	 * @see #getTypelist()
	 * @generated
	 */
	void setTypelist(TypeList value);

	/**
	 * Returns the value of the '<em><b>Numelementstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numelementstype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numelementstype</em>' containment reference.
	 * @see #setNumelementstype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc_Numelementstype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getNumelementstype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alloc#getNumelementstype <em>Numelementstype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numelementstype</em>' containment reference.
	 * @see #getNumelementstype()
	 * @generated
	 */
	void setNumelementstype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Numelementsvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numelementsvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numelementsvalue</em>' containment reference.
	 * @see #setNumelementsvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc_Numelementsvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getNumelementsvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alloc#getNumelementsvalue <em>Numelementsvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numelementsvalue</em>' containment reference.
	 * @see #getNumelementsvalue()
	 * @generated
	 */
	void setNumelementsvalue(Value value);

} // Alloc
