/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Top Level Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.TopLevelEntity#getModule <em>Module</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.TopLevelEntity#getTarget <em>Target</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.TopLevelEntity#getLibs <em>Libs</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getTopLevelEntity()
 * @model
 * @generated
 */
public interface TopLevelEntity extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Module</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Module</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module</em>' attribute.
   * @see #setModule(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getTopLevelEntity_Module()
   * @model
   * @generated
   */
  String getModule();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.TopLevelEntity#getModule <em>Module</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module</em>' attribute.
   * @see #getModule()
   * @generated
   */
  void setModule(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getTopLevelEntity_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.TopLevelEntity#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

  /**
   * Returns the value of the '<em><b>Libs</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Libs</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Libs</em>' attribute list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getTopLevelEntity_Libs()
   * @model unique="false"
   * @generated
   */
  EList<String> getLibs();

} // TopLevelEntity
