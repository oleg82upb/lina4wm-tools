/**
 */
package de.upb.llvm_parser.lLVM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Un Nammed Addr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.UnNammedAddr#getAdress <em>Adress</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getUnNammedAddr()
 * @model
 * @generated
 */
public interface UnNammedAddr extends FunctionHeader
{
  /**
   * Returns the value of the '<em><b>Adress</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Adress</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Adress</em>' attribute.
   * @see #setAdress(int)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getUnNammedAddr_Adress()
   * @model
   * @generated
   */
  int getAdress();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.UnNammedAddr#getAdress <em>Adress</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Adress</em>' attribute.
   * @see #getAdress()
   * @generated
   */
  void setAdress(int value);

} // UnNammedAddr
