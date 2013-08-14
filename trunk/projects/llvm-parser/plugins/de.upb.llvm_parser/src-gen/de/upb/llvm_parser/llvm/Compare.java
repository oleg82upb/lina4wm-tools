/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compare</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getPred <em>Pred</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getComptype <em>Comptype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getValue1 <em>Value1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Compare#getValue2 <em>Value2</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare()
 * @model
 * @generated
 */
public interface Compare extends Instruction
{
  /**
	 * Returns the value of the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Result</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Result</em>' containment reference.
	 * @see #setResult(Address)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Result()
	 * @model containment="true"
	 * @generated
	 */
  Address getResult();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
  void setResult(Address value);

  /**
	 * Returns the value of the '<em><b>Pred</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pred</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred</em>' attribute.
	 * @see #setPred(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Pred()
	 * @model
	 * @generated
	 */
  String getPred();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getPred <em>Pred</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pred</em>' attribute.
	 * @see #getPred()
	 * @generated
	 */
  void setPred(String value);

  /**
	 * Returns the value of the '<em><b>Comptype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comptype</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Comptype</em>' containment reference.
	 * @see #setComptype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Comptype()
	 * @model containment="true"
	 * @generated
	 */
  TypeUse getComptype();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getComptype <em>Comptype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comptype</em>' containment reference.
	 * @see #getComptype()
	 * @generated
	 */
  void setComptype(TypeUse value);

  /**
	 * Returns the value of the '<em><b>Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' containment reference.
	 * @see #setValue1(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Value1()
	 * @model containment="true"
	 * @generated
	 */
  Value getValue1();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getValue1 <em>Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' containment reference.
	 * @see #getValue1()
	 * @generated
	 */
  void setValue1(Value value);

  /**
	 * Returns the value of the '<em><b>Value2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2</em>' containment reference.
	 * @see #setValue2(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCompare_Value2()
	 * @model containment="true"
	 * @generated
	 */
  Value getValue2();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Compare#getValue2 <em>Value2</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' containment reference.
	 * @see #getValue2()
	 * @generated
	 */
  void setValue2(Value value);

} // Compare
