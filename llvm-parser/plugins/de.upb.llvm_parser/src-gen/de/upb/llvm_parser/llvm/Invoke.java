/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getFunctiontype <em>Functiontype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getPList <em>PList</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getToTarget <em>To Target</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Invoke#getUnwindCase <em>Unwind Case</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke()
 * @model
 * @generated
 */
public interface Invoke extends Instruction
{
  /**
	 * Returns the value of the '<em><b>Functiontype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functiontype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Functiontype</em>' containment reference.
	 * @see #setFunctiontype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Functiontype()
	 * @model containment="true"
	 * @generated
	 */
  TypeUse getFunctiontype();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getFunctiontype <em>Functiontype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functiontype</em>' containment reference.
	 * @see #getFunctiontype()
	 * @generated
	 */
  void setFunctiontype(TypeUse value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(Address)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_Name()
	 * @model containment="true"
	 * @generated
	 */
  Address getName();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
  void setName(Address value);

  /**
	 * Returns the value of the '<em><b>PList</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>PList</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>PList</em>' containment reference.
	 * @see #setPList(ParameterList)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_PList()
	 * @model containment="true"
	 * @generated
	 */
  ParameterList getPList();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getPList <em>PList</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PList</em>' containment reference.
	 * @see #getPList()
	 * @generated
	 */
  void setPList(ParameterList value);

  /**
	 * Returns the value of the '<em><b>To Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>To Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>To Target</em>' attribute.
	 * @see #setToTarget(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_ToTarget()
	 * @model
	 * @generated
	 */
  String getToTarget();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getToTarget <em>To Target</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Target</em>' attribute.
	 * @see #getToTarget()
	 * @generated
	 */
  void setToTarget(String value);

  /**
	 * Returns the value of the '<em><b>Unwind Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unwind Case</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Unwind Case</em>' attribute.
	 * @see #setUnwindCase(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInvoke_UnwindCase()
	 * @model
	 * @generated
	 */
  String getUnwindCase();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Invoke#getUnwindCase <em>Unwind Case</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unwind Case</em>' attribute.
	 * @see #getUnwindCase()
	 * @generated
	 */
  void setUnwindCase(String value);

} // Invoke
