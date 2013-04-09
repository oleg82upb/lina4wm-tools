/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Atomic RMW</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getOptype <em>Optype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getOpvalue <em>Opvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.AtomicRMW#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW()
 * @model
 * @generated
 */
public interface AtomicRMW extends StandartInstruction {
	/**
	 * Returns the value of the '<em><b>Adresstype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresstype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresstype</em>' containment reference.
	 * @see #setAdresstype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Adresstype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getAdresstype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdresstype <em>Adresstype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresstype</em>' containment reference.
	 * @see #getAdresstype()
	 * @generated
	 */
	void setAdresstype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Adress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adress</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adress</em>' containment reference.
	 * @see #setAdress(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Adress()
	 * @model containment="true"
	 * @generated
	 */
	Value getAdress();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdress <em>Adress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' containment reference.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(Value value);

	/**
	 * Returns the value of the '<em><b>Optype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optype</em>' containment reference.
	 * @see #setOptype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Optype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getOptype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOptype <em>Optype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optype</em>' containment reference.
	 * @see #getOptype()
	 * @generated
	 */
	void setOptype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Opvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opvalue</em>' containment reference.
	 * @see #setOpvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Opvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getOpvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOpvalue <em>Opvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opvalue</em>' containment reference.
	 * @see #getOpvalue()
	 * @generated
	 */
	void setOpvalue(Value value);

	/**
	 * Returns the value of the '<em><b>Ordering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ordering</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ordering</em>' attribute.
	 * @see #setOrdering(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Ordering()
	 * @model
	 * @generated
	 */
	String getOrdering();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(String value);

} // AtomicRMW
