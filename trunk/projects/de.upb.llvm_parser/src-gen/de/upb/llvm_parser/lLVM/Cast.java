/**
 */
package de.upb.llvm_parser.lLVM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.Cast#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.Cast#getCastto <em>Castto</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCast()
 * @model
 * @generated
 */
public interface Cast extends Instruction
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(TypeAndValue)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCast_Value()
   * @model containment="true"
   * @generated
   */
  TypeAndValue getValue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Cast#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(TypeAndValue value);

  /**
   * Returns the value of the '<em><b>Castto</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Castto</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Castto</em>' attribute.
   * @see #setCastto(String)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getCast_Castto()
   * @model
   * @generated
   */
  String getCastto();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.Cast#getCastto <em>Castto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Castto</em>' attribute.
   * @see #getCastto()
   * @generated
   */
  void setCastto(String value);

} // Cast
