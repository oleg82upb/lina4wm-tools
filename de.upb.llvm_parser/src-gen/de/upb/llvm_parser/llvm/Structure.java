/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Structure#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Structure#getPointer <em>Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getStructure()
 * @model
 * @generated
 */
public interface Structure extends Aggregate_Type
{
  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getStructure_Types()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getTypes();

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
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getStructure_Pointer()
   * @model
   * @generated
   */
  String getPointer();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Structure#getPointer <em>Pointer</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer</em>' attribute.
   * @see #getPointer()
   * @generated
   */
  void setPointer(String value);

} // Structure
