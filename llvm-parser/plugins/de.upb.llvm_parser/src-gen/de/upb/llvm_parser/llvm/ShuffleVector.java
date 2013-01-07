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
public interface ShuffleVector extends Instruction {
	/**
	 * Returns the value of the '<em><b>Val1type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1type</em>' attribute.
	 * @see #setVal1type(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Val1type()
	 * @model
	 * @generated
	 */
	String getVal1type();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1type <em>Val1type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1type</em>' attribute.
	 * @see #getVal1type()
	 * @generated
	 */
	void setVal1type(String value);

	/**
	 * Returns the value of the '<em><b>Val1value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val1value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val1value</em>' attribute.
	 * @see #setVal1value(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Val1value()
	 * @model
	 * @generated
	 */
	String getVal1value();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal1value <em>Val1value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val1value</em>' attribute.
	 * @see #getVal1value()
	 * @generated
	 */
	void setVal1value(String value);

	/**
	 * Returns the value of the '<em><b>Val2type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val2type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val2type</em>' attribute.
	 * @see #setVal2type(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Val2type()
	 * @model
	 * @generated
	 */
	String getVal2type();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2type <em>Val2type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val2type</em>' attribute.
	 * @see #getVal2type()
	 * @generated
	 */
	void setVal2type(String value);

	/**
	 * Returns the value of the '<em><b>Val2value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val2value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val2value</em>' attribute.
	 * @see #setVal2value(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Val2value()
	 * @model
	 * @generated
	 */
	String getVal2value();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getVal2value <em>Val2value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val2value</em>' attribute.
	 * @see #getVal2value()
	 * @generated
	 */
	void setVal2value(String value);

	/**
	 * Returns the value of the '<em><b>Masktype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Masktype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Masktype</em>' attribute.
	 * @see #setMasktype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Masktype()
	 * @model
	 * @generated
	 */
	String getMasktype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMasktype <em>Masktype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Masktype</em>' attribute.
	 * @see #getMasktype()
	 * @generated
	 */
	void setMasktype(String value);

	/**
	 * Returns the value of the '<em><b>Maskvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maskvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maskvalue</em>' attribute.
	 * @see #setMaskvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getShuffleVector_Maskvalue()
	 * @model
	 * @generated
	 */
	String getMaskvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ShuffleVector#getMaskvalue <em>Maskvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maskvalue</em>' attribute.
	 * @see #getMaskvalue()
	 * @generated
	 */
	void setMaskvalue(String value);

} // ShuffleVector
