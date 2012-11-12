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
 *   <li>{@link de.upb.llvm_parser.llvm.InsertElement#getVector <em>Vector</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertElement#getScalar <em>Scalar</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertElement#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement()
 * @model
 * @generated
 */
public interface InsertElement extends Instruction
{
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Vector()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getVector();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getVector <em>Vector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector</em>' containment reference.
   * @see #getVector()
   * @generated
   */
  void setVector(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Scalar</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scalar</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scalar</em>' containment reference.
   * @see #setScalar(TypeAndValue)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Scalar()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getScalar();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getScalar <em>Scalar</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scalar</em>' containment reference.
   * @see #getScalar()
   * @generated
   */
  void setScalar(TypeAndValue value);

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertElement_Index()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getIndex();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertElement#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(TypeAndValue value);

} // InsertElement
