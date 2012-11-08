/**
 */
package de.upb.llvm_parser.lLVM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.BasicBlock#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.BasicBlock#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.lLVM.LLVMPackage#getBasicBlock()
 * @model
 * @generated
 */
public interface BasicBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' containment reference.
   * @see #setName(LabelStr)
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getBasicBlock_Name()
   * @model containment="true"
   * @generated
   */
  LabelStr getName();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.lLVM.BasicBlock#getName <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' containment reference.
   * @see #getName()
   * @generated
   */
  void setName(LabelStr value);

  /**
   * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
   * The list contents are of type {@link de.upb.llvm_parser.lLVM.Instruction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instructions</em>' containment reference list.
   * @see de.upb.llvm_parser.lLVM.LLVMPackage#getBasicBlock_Instructions()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getInstructions();

} // BasicBlock
