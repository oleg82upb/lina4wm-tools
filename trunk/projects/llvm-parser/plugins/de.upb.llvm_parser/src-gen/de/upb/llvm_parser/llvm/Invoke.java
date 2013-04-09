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
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getName <em>Name</em>}</li>
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
public interface Invoke extends ReturnInstruction {
	/**
	 * Returns the value of the '<em><b>Functiontype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functiontype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functiontype</em>' containment reference.
	 * @see #setFunctiontype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Functiontype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getFunctiontype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getFunctiontype <em>Functiontype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functiontype</em>' containment reference.
	 * @see #getFunctiontype()
	 * @generated
	 */
	void setFunctiontype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Address)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Name()
	 * @model containment="true"
	 * @generated
	 */
	Address getName();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(Address value);

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
	 * Returns the value of the '<em><b>Totype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Totype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Totype</em>' containment reference.
	 * @see #setTotype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Totype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getTotype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getTotype <em>Totype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Totype</em>' containment reference.
	 * @see #getTotype()
	 * @generated
	 */
	void setTotype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Tovalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tovalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tovalue</em>' containment reference.
	 * @see #setTovalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Tovalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getTovalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getTovalue <em>Tovalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tovalue</em>' containment reference.
	 * @see #getTovalue()
	 * @generated
	 */
	void setTovalue(Value value);

	/**
	 * Returns the value of the '<em><b>Unwindtype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unwindtype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unwindtype</em>' containment reference.
	 * @see #setUnwindtype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Unwindtype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getUnwindtype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindtype <em>Unwindtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unwindtype</em>' containment reference.
	 * @see #getUnwindtype()
	 * @generated
	 */
	void setUnwindtype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Unwindvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unwindvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unwindvalue</em>' containment reference.
	 * @see #setUnwindvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Unwindvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getUnwindvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindvalue <em>Unwindvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unwindvalue</em>' containment reference.
	 * @see #getUnwindvalue()
	 * @generated
	 */
	void setUnwindvalue(Value value);

} // Invoke
