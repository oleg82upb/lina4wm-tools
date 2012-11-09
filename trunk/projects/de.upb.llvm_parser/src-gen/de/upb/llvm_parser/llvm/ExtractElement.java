/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Extract Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractElement#getVector <em>Vector</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractElement#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement()
 * @model
 * @generated
 */
public interface ExtractElement extends Instruction {
	/**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement_Vector()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getVector();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractElement#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
	void setVector(TypeAndValue value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(TypeAndValue)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement_Index()
	 * @model containment="true"
	 * @generated
	 */
	TypeAndValue getIndex();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractElement#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(TypeAndValue value);

} // ExtractElement
