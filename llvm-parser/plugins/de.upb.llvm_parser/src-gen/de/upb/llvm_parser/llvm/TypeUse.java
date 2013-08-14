/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.TypeUse#getFunctionInput <em>Function Input</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.TypeUse#getPointer <em>Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getTypeUse()
 * @model
 * @generated
 */
public interface TypeUse extends EObject
{
  /**
	 * Returns the value of the '<em><b>Function Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Input</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Input</em>' attribute.
	 * @see #setFunctionInput(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getTypeUse_FunctionInput()
	 * @model
	 * @generated
	 */
  String getFunctionInput();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.TypeUse#getFunctionInput <em>Function Input</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function Input</em>' attribute.
	 * @see #getFunctionInput()
	 * @generated
	 */
  void setFunctionInput(String value);

  /**
	 * Returns the value of the '<em><b>Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pointer</em>' attribute.
	 * @see #setPointer(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getTypeUse_Pointer()
	 * @model
	 * @generated
	 */
  String getPointer();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.TypeUse#getPointer <em>Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointer</em>' attribute.
	 * @see #getPointer()
	 * @generated
	 */
  void setPointer(String value);

} // TypeUse
