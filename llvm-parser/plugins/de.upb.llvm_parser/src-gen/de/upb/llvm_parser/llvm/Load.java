/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Load#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad()
 * @model
 * @generated
 */
public interface Load extends Instruction {
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Adresstype()
	 * @model
	 * @generated
	 */
	String getAdresstype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getAdresstype <em>Adresstype</em>}' attribute.
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Adress()
	 * @model
	 * @generated
	 */
	String getAdress();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getAdress <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adress</em>' attribute.
	 * @see #getAdress()
	 * @generated
	 */
	void setAdress(String value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Ordering()
	 * @model
	 * @generated
	 */
	String getOrdering();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getOrdering <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ordering</em>' attribute.
	 * @see #getOrdering()
	 * @generated
	 */
	void setOrdering(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(int)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getLoad_Index()
	 * @model
	 * @generated
	 */
	int getIndex();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Load#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(int value);

} // Load
