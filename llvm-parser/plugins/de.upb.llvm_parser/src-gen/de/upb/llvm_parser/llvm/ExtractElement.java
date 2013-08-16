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
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractElement#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractElement#getVector <em>Vector</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ExtractElement#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement()
 * @model
 * @generated
 */
public interface ExtractElement extends Instruction
{
  /**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Address)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement_Result()
	 * @model containment="true"
	 * @generated
	 */
  Address getResult();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractElement#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
  void setResult(Address value);

  /**
	 * Returns the value of the '<em><b>Vector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vector</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Vector</em>' containment reference.
	 * @see #setVector(Parameter)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement_Vector()
	 * @model containment="true"
	 * @generated
	 */
  Parameter getVector();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractElement#getVector <em>Vector</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vector</em>' containment reference.
	 * @see #getVector()
	 * @generated
	 */
  void setVector(Parameter value);

  /**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(Parameter)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getExtractElement_Index()
	 * @model containment="true"
	 * @generated
	 */
  Parameter getIndex();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ExtractElement#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
  void setIndex(Parameter value);

} // ExtractElement
