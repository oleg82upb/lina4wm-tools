/**
 */
package de.upb.lina.lll;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.SimpleType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.LllPackage#getSimpleType()
 * @model
 * @generated
 */
public interface SimpleType extends Type {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.upb.lina.lll.PrimitiveType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.upb.lina.lll.PrimitiveType
	 * @see #setType(PrimitiveType)
	 * @see de.upb.lina.lll.LllPackage#getSimpleType_Type()
	 * @model
	 * @generated
	 */
	PrimitiveType getType();

	/**
	 * Sets the value of the '{@link de.upb.lina.lll.SimpleType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.upb.lina.lll.PrimitiveType
	 * @see #getType()
	 * @generated
	 */
	void setType(PrimitiveType value);

} // SimpleType
