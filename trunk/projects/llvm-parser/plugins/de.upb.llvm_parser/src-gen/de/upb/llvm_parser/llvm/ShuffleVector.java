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
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1type <em>Val1type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1value <em>Val1value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2type <em>Val2type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2value <em>Val2value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getMasktype <em>Masktype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ShuffleVector#getMaskvalue <em>Maskvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector()
 * @model
 * @generated
 */
public interface ShuffleVector extends Std_Instr {
	/**
	 * Returns the value of the '<em><b>Val1type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1type</em>' containment reference.
	 * @see #setVal1type(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Val1type()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getVal1type();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1type <em>Val1type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1type</em>' containment reference.
	 * @see #getVal1type()
	 * @generated
	 */
	void setVal1type(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Val1value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1value</em>' containment reference.
	 * @see #setVal1value(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Val1value()
	 * @model containment="true"
	 * @generated
	 */
	Value getVal1value();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1value <em>Val1value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1value</em>' containment reference.
	 * @see #getVal1value()
	 * @generated
	 */
	void setVal1value(Value value);

	/**
	 * Returns the value of the '<em><b>Val2type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val2type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val2type</em>' containment reference.
	 * @see #setVal2type(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Val2type()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getVal2type();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2type <em>Val2type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val2type</em>' containment reference.
	 * @see #getVal2type()
	 * @generated
	 */
	void setVal2type(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Val2value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val2value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val2value</em>' containment reference.
	 * @see #setVal2value(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Val2value()
	 * @model containment="true"
	 * @generated
	 */
	Value getVal2value();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2value <em>Val2value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val2value</em>' containment reference.
	 * @see #getVal2value()
	 * @generated
	 */
	void setVal2value(Value value);

	/**
	 * Returns the value of the '<em><b>Masktype</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Masktype</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Masktype</em>' containment reference.
	 * @see #setMasktype(TypeUse)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Masktype()
	 * @model containment="true"
	 * @generated
	 */
	TypeUse getMasktype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMasktype <em>Masktype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masktype</em>' containment reference.
	 * @see #getMasktype()
	 * @generated
	 */
	void setMasktype(TypeUse value);

	/**
	 * Returns the value of the '<em><b>Maskvalue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maskvalue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maskvalue</em>' containment reference.
	 * @see #setMaskvalue(Value)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Maskvalue()
	 * @model containment="true"
	 * @generated
	 */
	Value getMaskvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMaskvalue <em>Maskvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maskvalue</em>' containment reference.
	 * @see #getMaskvalue()
	 * @generated
	 */
	void setMaskvalue(Value value);

} // ShuffleVector
