/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shuffle Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getValue1 <em>Value1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getValue2 <em>Value2</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector()
 * @model
 * @generated
 */
public interface ShuffleVector extends Instruction
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Result()
	 * @model containment="true"
	 * @generated
	 */
  Address getResult();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getResult <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' containment reference.
	 * @see #getResult()
	 * @generated
	 */
  void setResult(Address value);

  /**
	 * Returns the value of the '<em><b>Value1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value1</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value1</em>' containment reference.
	 * @see #setValue1(Parameter)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Value1()
	 * @model containment="true"
	 * @generated
	 */
  Parameter getValue1();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getValue1 <em>Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value1</em>' containment reference.
	 * @see #getValue1()
	 * @generated
	 */
  void setValue1(Parameter value);

  /**
	 * Returns the value of the '<em><b>Value2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value2</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value2</em>' containment reference.
	 * @see #setValue2(Parameter)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Value2()
	 * @model containment="true"
	 * @generated
	 */
  Parameter getValue2();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getValue2 <em>Value2</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value2</em>' containment reference.
	 * @see #getValue2()
	 * @generated
	 */
  void setValue2(Parameter value);

  /**
	 * Returns the value of the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mask</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' containment reference.
	 * @see #setMask(Parameter)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Mask()
	 * @model containment="true"
	 * @generated
	 */
  Parameter getMask();

  /**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMask <em>Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' containment reference.
	 * @see #getMask()
	 * @generated
	 */
  void setMask(Parameter value);

} // ShuffleVector
