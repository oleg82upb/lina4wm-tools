/**
 */
package de.upb.llvm_parser.llvm;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getCastfrom <em>Castfrom</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.Cast#getCastto <em>Castto</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast()
 * @model
 * @generated
 */
public interface Cast extends Instruction {
	/**
	 * Returns the value of the '<em><b>Castfrom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Castfrom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Castfrom</em>' attribute.
	 * @see #setCastfrom(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Castfrom()
	 * @model
	 * @generated
	 */
	String getCastfrom();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getCastfrom <em>Castfrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Castfrom</em>' attribute.
	 * @see #getCastfrom()
	 * @generated
	 */
	void setCastfrom(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Castto</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Castto</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Castto</em>' attribute.
	 * @see #setCastto(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getCast_Castto()
	 * @model
	 * @generated
	 */
	String getCastto();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.Cast#getCastto <em>Castto</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Castto</em>' attribute.
	 * @see #getCastto()
	 * @generated
	 */
	void setCastto(String value);

} // Cast
