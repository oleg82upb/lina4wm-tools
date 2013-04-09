/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertElement#getVectortype <em>Vectortype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertElement#getVectorvalue <em>Vectorvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertElement#getScalartype <em>Scalartype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertElement#getScalarvalue <em>Scalarvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertElement#getIndextype <em>Indextype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertElement#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement()
 * @model
 * @generated
 */
public interface InsertElement extends StandartInstruction {
	/**
	 * Returns the value of the '<em><b>Vectortype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vectortype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vectortype</em>' containment reference.
	 * @see #setVectortype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Vectortype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getVectortype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getVectortype <em>Vectortype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vectortype</em>' containment reference.
	 * @see #getVectortype()
	 * @generated
	 */
	void setVectortype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Vectorvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vectorvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vectorvalue</em>' containment reference.
	 * @see #setVectorvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Vectorvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getVectorvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getVectorvalue <em>Vectorvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vectorvalue</em>' containment reference.
	 * @see #getVectorvalue()
	 * @generated
	 */
	void setVectorvalue(Value value);

	/**
	 * Returns the value of the '<em><b>Scalartype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalartype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalartype</em>' containment reference.
	 * @see #setScalartype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Scalartype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getScalartype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getScalartype <em>Scalartype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalartype</em>' containment reference.
	 * @see #getScalartype()
	 * @generated
	 */
	void setScalartype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Scalarvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalarvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalarvalue</em>' containment reference.
	 * @see #setScalarvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Scalarvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getScalarvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getScalarvalue <em>Scalarvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalarvalue</em>' containment reference.
	 * @see #getScalarvalue()
	 * @generated
	 */
	void setScalarvalue(Value value);

	/**
	 * Returns the value of the '<em><b>Indextype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indextype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indextype</em>' containment reference.
	 * @see #setIndextype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Indextype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getIndextype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getIndextype <em>Indextype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indextype</em>' containment reference.
	 * @see #getIndextype()
	 * @generated
	 */
	void setIndextype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Index()
	 * @model containment="true"
	 * @generated
	 */
	Value getIndex();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(Value value);

} // InsertElement
