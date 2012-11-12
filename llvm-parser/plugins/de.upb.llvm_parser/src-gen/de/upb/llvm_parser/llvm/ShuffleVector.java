/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shuffle Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getVector1 <em>Vector1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getVector2 <em>Vector2</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector()
 * @model
 * @generated
 */
public interface ShuffleVector extends Instruction
{
  /**
   * Returns the value of the '<em><b>Vector1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vector1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector1</em>' containment reference.
   * @see #setVector1(TypeAndValue)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Vector1()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getVector1();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVector1 <em>Vector1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector1</em>' containment reference.
   * @see #getVector1()
   * @generated
   */
  void setVector1(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Vector2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Vector2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vector2</em>' containment reference.
   * @see #setVector2(TypeAndValue)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Vector2()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getVector2();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVector2 <em>Vector2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Vector2</em>' containment reference.
   * @see #getVector2()
   * @generated
   */
  void setVector2(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Mask</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mask</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mask</em>' containment reference.
   * @see #setMask(TypeAndValue)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Mask()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getMask();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMask <em>Mask</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mask</em>' containment reference.
   * @see #getMask()
   * @generated
   */
  void setMask(TypeAndValue value);

} // ShuffleVector
