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
public interface AtomicRMW extends Instruction {
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Adresstype()
	 * @model
	 * @generated
	 */
	String getAdresstype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdresstype <em>Adresstype</em>}' attribute.
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Adress()
	 * @model
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>Optype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optype</em>' attribute.
	 * @see #setOptype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Optype()
	 * @model
	 * @generated
	 */
	String getOptype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOptype <em>Optype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optype</em>' attribute.
	 * @see #getOptype()
	 * @generated
	 */
	void setOptype(String value);

	/**
	 * Returns the value of the '<em><b>Opvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Opvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opvalue</em>' attribute.
	 * @see #setOpvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAtomicRMW_Opvalue()
	 * @model
	 * @generated
	 */
	String getOpvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.AtomicRMW#getOpvalue <em>Opvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opvalue</em>' attribute.
	 * @see #getOpvalue()
	 * @generated
	 */
	void setOpvalue(String value);

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
