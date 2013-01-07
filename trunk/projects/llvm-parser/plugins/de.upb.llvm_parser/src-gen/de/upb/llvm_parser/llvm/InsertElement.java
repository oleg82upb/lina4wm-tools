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
public interface InsertElement extends Instruction {
	/**
	 * Returns the value of the '<em><b>Vectortype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vectortype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vectortype</em>' attribute.
	 * @see #setVectortype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Vectortype()
	 * @model
	 * @generated
	 */
	String getVectortype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getVectortype <em>Vectortype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vectortype</em>' attribute.
	 * @see #getVectortype()
	 * @generated
	 */
	void setVectortype(String value);

	/**
	 * Returns the value of the '<em><b>Vectorvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vectorvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vectorvalue</em>' attribute.
	 * @see #setVectorvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Vectorvalue()
	 * @model
	 * @generated
	 */
	String getVectorvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getVectorvalue <em>Vectorvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vectorvalue</em>' attribute.
	 * @see #getVectorvalue()
	 * @generated
	 */
	void setVectorvalue(String value);

	/**
	 * Returns the value of the '<em><b>Scalartype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalartype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalartype</em>' attribute.
	 * @see #setScalartype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Scalartype()
	 * @model
	 * @generated
	 */
	String getScalartype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getScalartype <em>Scalartype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalartype</em>' attribute.
	 * @see #getScalartype()
	 * @generated
	 */
	void setScalartype(String value);

	/**
	 * Returns the value of the '<em><b>Scalarvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scalarvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scalarvalue</em>' attribute.
	 * @see #setScalarvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Scalarvalue()
	 * @model
	 * @generated
	 */
	String getScalarvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getScalarvalue <em>Scalarvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scalarvalue</em>' attribute.
	 * @see #getScalarvalue()
	 * @generated
	 */
	void setScalarvalue(String value);

	/**
	 * Returns the value of the '<em><b>Indextype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indextype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indextype</em>' attribute.
	 * @see #setIndextype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Indextype()
	 * @model
	 * @generated
	 */
	String getIndextype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getIndextype <em>Indextype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Indextype</em>' attribute.
	 * @see #getIndextype()
	 * @generated
	 */
	void setIndextype(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute.
	 * @see #setIndex(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

} // InsertElement
