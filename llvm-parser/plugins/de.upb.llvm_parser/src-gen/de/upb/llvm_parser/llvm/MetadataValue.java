/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.MetadataValue#getNodeId <em>Node Id</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.MetadataValue#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getMetadataValue()
 * @model
 * @generated
 */
public interface MetadataValue extends MainLevelEntity
{
  /**
   * Returns the value of the '<em><b>Node Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Node Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Node Id</em>' attribute.
   * @see #setNodeId(String)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getMetadataValue_NodeId()
   * @model
   * @generated
   */
  String getNodeId();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.MetadataValue#getNodeId <em>Node Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Node Id</em>' attribute.
   * @see #getNodeId()
   * @generated
   */
  void setNodeId(String value);

  /**
   * Returns the value of the '<em><b>Values</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.llvm.Meta}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Values</em>' containment reference list.
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getMetadataValue_Values()
   * @model containment="true"
   * @generated
   */
  EList<Meta> getValues();

} // MetadataValue
