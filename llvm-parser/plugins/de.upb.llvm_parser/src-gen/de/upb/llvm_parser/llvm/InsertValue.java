/**
 */
package de.upb.llvm_parser.llvm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insert Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getInserttype <em>Inserttype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getInsertvalue <em>Insertvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.InsertValue#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue()
 * @model
 * @generated
 */
public interface InsertValue extends Instruction {
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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Struct()
	 * @model containment="true"
	 * @generated
	 */
	Structure getStruct();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getStruct <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Struct</em>' containment reference.
	 * @see #getStruct()
	 * @generated
	 */
	void setStruct(Structure value);

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
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Inserttype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inserttype</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inserttype</em>' attribute.
	 * @see #setInserttype(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Inserttype()
	 * @model
	 * @generated
	 */
	String getInserttype();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getInserttype <em>Inserttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inserttype</em>' attribute.
	 * @see #getInserttype()
	 * @generated
	 */
	void setInserttype(String value);

	/**
	 * Returns the value of the '<em><b>Insertvalue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insertvalue</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insertvalue</em>' attribute.
	 * @see #setInsertvalue(String)
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Insertvalue()
	 * @model
	 * @generated
	 */
	String getInsertvalue();

	/**
	 * Sets the value of the '{@link de.upb.llvm_parser.llvm.InsertValue#getInsertvalue <em>Insertvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insertvalue</em>' attribute.
	 * @see #getInsertvalue()
	 * @generated
	 */
	void setInsertvalue(String value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' attribute list.
	 * @see de.upb.llvm_parser.llvm.LlvmPackage#getInsertValue_Index()
	 * @model unique="false"
	 * @generated
	 */
	EList<Integer> getIndex();

} // InsertValue
