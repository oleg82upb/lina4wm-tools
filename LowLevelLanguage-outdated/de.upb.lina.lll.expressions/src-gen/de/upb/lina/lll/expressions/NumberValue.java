/**
 */
package de.upb.lina.lll.expressions;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.expressions.NumberValue#getNumValue <em>Num Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.expressions.ExpressionsPackage#getNumberValue()
 * @model
 * @generated
 */
public interface NumberValue extends AExpression
{
  /**
	 * Returns the value of the '<em><b>Num Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Num Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Value</em>' attribute.
	 * @see #setNumValue(BigDecimal)
	 * @see de.upb.lina.lll.expressions.ExpressionsPackage#getNumberValue_NumValue()
	 * @model
	 * @generated
	 */
  BigDecimal getNumValue();

  /**
	 * Sets the value of the '{@link de.upb.lina.lll.expressions.NumberValue#getNumValue <em>Num Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Value</em>' attribute.
	 * @see #getNumValue()
	 * @generated
	 */
  void setNumValue(BigDecimal value);

} // NumberValue
