/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ARRAY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.ARRAY#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ARRAY#getLstruct <em>Lstruct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.ARRAY#getRstruct <em>Rstruct</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getARRAY()
 * @model
 * @generated
 */
public interface ARRAY extends EObject {
	/**
	 * Returns the value of the '<em><b>Struct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Struct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Struct</em>' containment reference.
	 * @see #setStruct(Structure)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getARRAY_Struct()
	 * @model containment="true"
	 * @generated
	 */
	Structure getStruct();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ARRAY#getStruct <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' containment reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Structure value);

	/**
	 * Returns the value of the '<em><b>Lstruct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lstruct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lstruct</em>' containment reference.
	 * @see #setLstruct(Structure)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getARRAY_Lstruct()
	 * @model containment="true"
	 * @generated
	 */
	Structure getLstruct();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ARRAY#getLstruct <em>Lstruct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lstruct</em>' containment reference.
	 * @see #getLstruct()
	 * @generated
	 */
	void setLstruct(Structure value);

	/**
	 * Returns the value of the '<em><b>Rstruct</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rstruct</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rstruct</em>' containment reference.
	 * @see #setRstruct(ValueStruct)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getARRAY_Rstruct()
	 * @model containment="true"
	 * @generated
	 */
	ValueStruct getRstruct();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.ARRAY#getRstruct <em>Rstruct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rstruct</em>' containment reference.
	 * @see #getRstruct()
	 * @generated
	 */
	void setRstruct(ValueStruct value);

} // ARRAY
