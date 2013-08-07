/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Main Level Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.MainLevelEntity#getMeta <em>Meta</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getMainLevelEntity()
 * @model
 * @generated
 */
public interface MainLevelEntity extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Meta</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Meta</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Meta</em>' attribute list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getMainLevelEntity_Meta()
   * @model unique="false"
   * @generated
   */
  EList<String> getMeta();

} // MainLevelEntity
