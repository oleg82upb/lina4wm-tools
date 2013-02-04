/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmp Xchg</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getComparetype <em>Comparetype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getComparevalue <em>Comparevalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getNewtype <em>Newtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getNewvalue <em>Newvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.CmpXchg#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg()
 * @model
 * @generated
 */
public interface CmpXchg extends Instruction {
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Adresstype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getAdresstype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getAdresstype <em>Adresstype</em>}' containment reference.
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Adress()
	 * @model containment="true"
	 * @generated
	 */
	Value getAdress();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getAdress <em>Adress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' containment reference.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(Value value);

	/**
	 * Returns the value of the '<em><b>Comparetype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparetype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparetype</em>' containment reference.
	 * @see #setComparetype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Comparetype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getComparetype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getComparetype <em>Comparetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparetype</em>' containment reference.
	 * @see #getComparetype()
	 * @generated
	 */
	void setComparetype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Comparevalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparevalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparevalue</em>' containment reference.
	 * @see #setComparevalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Comparevalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getComparevalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getComparevalue <em>Comparevalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparevalue</em>' containment reference.
	 * @see #getComparevalue()
	 * @generated
	 */
	void setComparevalue(Value value);

	/**
	 * Returns the value of the '<em><b>Newtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newtype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newtype</em>' containment reference.
	 * @see #setNewtype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Newtype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getNewtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewtype <em>Newtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newtype</em>' containment reference.
	 * @see #getNewtype()
	 * @generated
	 */
	void setNewtype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Newvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newvalue</em>' containment reference.
	 * @see #setNewvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Newvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getNewvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewvalue <em>Newvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newvalue</em>' containment reference.
	 * @see #getNewvalue()
	 * @generated
	 */
	void setNewvalue(Value value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Ordering()
	 * @model
	 * @generated
	 */
	String getOrdering();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(String value);

} // CmpXchg
