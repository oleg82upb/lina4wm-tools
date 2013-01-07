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
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractElement#getVectortype <em>Vectortype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractElement#getVectorvalue <em>Vectorvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractElement#getIndextype <em>Indextype</em>}</li>
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
	 * Returns the value of the '<em><b>Vectortype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vectortype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vectortype</em>' attribute.
	 * @see #setVectortype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement_Vectortype()
	 * @model
	 * @generated
	 */
	String getVectortype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractElement#getVectortype <em>Vectortype</em>}' attribute.
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement_Vectorvalue()
	 * @model
	 * @generated
	 */
	String getVectorvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractElement#getVectorvalue <em>Vectorvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vectorvalue</em>' attribute.
	 * @see #getVectorvalue()
	 * @generated
	 */
	void setVectorvalue(String value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement_Indextype()
	 * @model
	 * @generated
	 */
	String getIndextype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractElement#getIndextype <em>Indextype</em>}' attribute.
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement_Index()
	 * @model
	 * @generated
	 */
	String getIndex();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractElement#getIndex <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' attribute.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(String value);

} // ExtractElement
