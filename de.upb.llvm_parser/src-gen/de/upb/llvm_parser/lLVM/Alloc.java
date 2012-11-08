/**
 */
package de.upb.llvm_parser.lLVM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alloc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.Alloc#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.Alloc#getNumElements <em>Num Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getAlloc()
 * @model
 * @generated
 */
public interface Alloc extends Instruction
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getAlloc_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Alloc#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Num Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Elements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num Elements</em>' containment reference.
   * @see #setNumElements(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getAlloc_NumElements()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getNumElements();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Alloc#getNumElements <em>Num Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num Elements</em>' containment reference.
   * @see #getNumElements()
   * @generated
   */
  void setNumElements(TypeAndValue value);

} // Alloc
