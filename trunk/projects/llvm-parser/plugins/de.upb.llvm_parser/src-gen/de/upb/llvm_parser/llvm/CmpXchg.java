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
	 * Returns the value of the '<em><b>Adresstype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adresstype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresstype</em>' attribute.
	 * @see #setAdresstype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Adresstype()
	 * @model
	 * @generated
	 */
	String getAdresstype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getAdresstype <em>Adresstype</em>}' attribute.
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Adress()
	 * @model
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

	/**
	 * Returns the value of the '<em><b>Comparetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparetype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparetype</em>' attribute.
	 * @see #setComparetype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Comparetype()
	 * @model
	 * @generated
	 */
	String getComparetype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getComparetype <em>Comparetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparetype</em>' attribute.
	 * @see #getComparetype()
	 * @generated
	 */
	void setComparetype(String value);

	/**
	 * Returns the value of the '<em><b>Comparevalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Comparevalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparevalue</em>' attribute.
	 * @see #setComparevalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Comparevalue()
	 * @model
	 * @generated
	 */
	String getComparevalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getComparevalue <em>Comparevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparevalue</em>' attribute.
	 * @see #getComparevalue()
	 * @generated
	 */
	void setComparevalue(String value);

	/**
	 * Returns the value of the '<em><b>Newtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newtype</em>' attribute.
	 * @see #setNewtype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Newtype()
	 * @model
	 * @generated
	 */
	String getNewtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewtype <em>Newtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newtype</em>' attribute.
	 * @see #getNewtype()
	 * @generated
	 */
	void setNewtype(String value);

	/**
	 * Returns the value of the '<em><b>Newvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Newvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Newvalue</em>' attribute.
	 * @see #setNewvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCmpXchg_Newvalue()
	 * @model
	 * @generated
	 */
	String getNewvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.CmpXchg#getNewvalue <em>Newvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Newvalue</em>' attribute.
	 * @see #getNewvalue()
	 * @generated
	 */
	void setNewvalue(String value);

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
