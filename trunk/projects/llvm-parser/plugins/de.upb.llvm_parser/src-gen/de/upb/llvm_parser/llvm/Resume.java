/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Resume#getResumestruct <em>Resumestruct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Resume#getResumevalue <em>Resumevalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getResume()
 * @model
 * @generated
 */
public interface Resume extends ReturnInstruction
{
  /**
   * Returns the value of the '<em><b>Resumestruct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resumestruct</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resumestruct</em>' containment reference.
   * @see #setResumestruct(Structure)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getResume_Resumestruct()
   * @model containment="true"
   * @generated
   */
  Structure getResumestruct();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Resume#getResumestruct <em>Resumestruct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resumestruct</em>' containment reference.
   * @see #getResumestruct()
   * @generated
   */
  void setResumestruct(Structure value);

  /**
   * Returns the value of the '<em><b>Resumevalue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Resumevalue</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Resumevalue</em>' containment reference.
   * @see #setResumevalue(Value)
   * @see de.upb.llvm_parser.llvm.LlvmPackage#getResume_Resumevalue()
   * @model containment="true"
   * @generated
   */
  Value getResumevalue();

  /**
   * Sets the value of the '{@link de.upb.llvm_parser.llvm.Resume#getResumevalue <em>Resumevalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Resumevalue</em>' containment reference.
   * @see #getResumevalue()
   * @generated
   */
  void setResumevalue(Value value);

} // Resume
