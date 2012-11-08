/**
 */
package de.upb.llvm_parser.lLVM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.Call#getPointer <em>Pointer</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.Call#getPlist <em>Plist</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCall()
 * @model
 * @generated
 */
public interface Call extends Instruction
{
  /**
   * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer</em>' containment reference.
   * @see #setPointer(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCall_Pointer()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getPointer();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Call#getPointer <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer</em>' containment reference.
   * @see #getPointer()
   * @generated
   */
  void setPointer(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Plist</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plist</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plist</em>' containment reference.
   * @see #setPlist(ParameterList)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCall_Plist()
   * @model containment="true"
   * @generated
   */
  ParameterList getPlist();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Call#getPlist <em>Plist</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plist</em>' containment reference.
   * @see #getPlist()
   * @generated
   */
  void setPlist(ParameterList value);

} // Call
