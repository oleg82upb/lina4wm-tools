/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Alloc#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Alloc#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Alloc#getNumOfElements <em>Num Of Elements</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Alloc#getAlign <em>Align</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc()
 * @model
 * @generated
 */
public interface Alloc extends Instruction
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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc_Result()
   * @model containment="true"
   * @generated
   */
  Address getResult();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alloc#getResult <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Result</em>' containment reference.
   * @see #getResult()
   * @generated
   */
  void setResult(Address value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeUse)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc_Type()
   * @model containment="true"
   * @generated
   */
  TypeUse getType();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alloc#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeUse value);

  /**
   * Returns the value of the '<em><b>Num Of Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Of Elements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Of Elements</em>' containment reference.
   * @see #setNumOfElements(Parameter)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc_NumOfElements()
   * @model containment="true"
   * @generated
   */
  Parameter getNumOfElements();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alloc#getNumOfElements <em>Num Of Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Of Elements</em>' containment reference.
   * @see #getNumOfElements()
   * @generated
   */
  void setNumOfElements(Parameter value);

  /**
   * Returns the value of the '<em><b>Align</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Align</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Align</em>' attribute.
   * @see #setAlign(int)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getAlloc_Align()
   * @model
   * @generated
   */
  int getAlign();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Alloc#getAlign <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Align</em>' attribute.
   * @see #getAlign()
   * @generated
   */
  void setAlign(int value);

} // Alloc
