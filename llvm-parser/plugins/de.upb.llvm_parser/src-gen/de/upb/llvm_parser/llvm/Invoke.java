/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getFunctiontype <em>Functiontype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getFunctionvalue <em>Functionvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getPList <em>PList</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getTotype <em>Totype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getTovalue <em>Tovalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getUnwindtype <em>Unwindtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getUnwindvalue <em>Unwindvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke()
 * @model
 * @generated
 */
public interface Invoke extends Ret_Instr {
	/**
	 * Returns the value of the '<em><b>Functiontype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functiontype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functiontype</em>' attribute.
	 * @see #setFunctiontype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Functiontype()
	 * @model
	 * @generated
	 */
	String getFunctiontype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getFunctiontype <em>Functiontype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functiontype</em>' attribute.
	 * @see #getFunctiontype()
	 * @generated
	 */
	void setFunctiontype(String value);

	/**
	 * Returns the value of the '<em><b>Functionvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functionvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functionvalue</em>' attribute.
	 * @see #setFunctionvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Functionvalue()
	 * @model
	 * @generated
	 */
	String getFunctionvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getFunctionvalue <em>Functionvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functionvalue</em>' attribute.
	 * @see #getFunctionvalue()
	 * @generated
	 */
	void setFunctionvalue(String value);

	/**
	 * Returns the value of the '<em><b>PList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>PList</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PList</em>' containment reference.
	 * @see #setPList(ParameterList)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_PList()
	 * @model containment="true"
	 * @generated
	 */
	ParameterList getPList();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getPList <em>PList</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PList</em>' containment reference.
	 * @see #getPList()
	 * @generated
	 */
	void setPList(ParameterList value);

	/**
	 * Returns the value of the '<em><b>Totype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Totype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totype</em>' attribute.
	 * @see #setTotype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Totype()
	 * @model
	 * @generated
	 */
	String getTotype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getTotype <em>Totype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totype</em>' attribute.
	 * @see #getTotype()
	 * @generated
	 */
	void setTotype(String value);

	/**
	 * Returns the value of the '<em><b>Tovalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tovalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tovalue</em>' attribute.
	 * @see #setTovalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Tovalue()
	 * @model
	 * @generated
	 */
	String getTovalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getTovalue <em>Tovalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tovalue</em>' attribute.
	 * @see #getTovalue()
	 * @generated
	 */
	void setTovalue(String value);

	/**
	 * Returns the value of the '<em><b>Unwindtype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unwindtype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unwindtype</em>' attribute.
	 * @see #setUnwindtype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Unwindtype()
	 * @model
	 * @generated
	 */
	String getUnwindtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindtype <em>Unwindtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unwindtype</em>' attribute.
	 * @see #getUnwindtype()
	 * @generated
	 */
	void setUnwindtype(String value);

	/**
	 * Returns the value of the '<em><b>Unwindvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unwindvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unwindvalue</em>' attribute.
	 * @see #setUnwindvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Unwindvalue()
	 * @model
	 * @generated
	 */
	String getUnwindvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindvalue <em>Unwindvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unwindvalue</em>' attribute.
	 * @see #getUnwindvalue()
	 * @generated
	 */
	void setUnwindvalue(String value);

} // Invoke
