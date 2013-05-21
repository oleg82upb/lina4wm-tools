/**
 */
package de.upb.lina.lll.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imply</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.lll.expressions.Imply#getLeft <em>Left</em>}</li>
 *   <li>{@link de.upb.lina.lll.expressions.Imply#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.lll.expressions.ExpressionsPackage#getImply()
 * @model
 * @generated
 */
public interface Imply extends LExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(LExpression)
   * @see de.upb.lina.lll.expressions.ExpressionsPackage#getImply_Left()
   * @model containment="true"
   * @generated
   */
  LExpression getLeft();

  /**
   * Sets the value of the '{@link de.upb.lina.lll.expressions.Imply#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(LExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(LExpression)
   * @see de.upb.lina.lll.expressions.ExpressionsPackage#getImply_Right()
   * @model containment="true"
   * @generated
   */
  LExpression getRight();

  /**
   * Sets the value of the '{@link de.upb.lina.lll.expressions.Imply#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(LExpression value);

} // Imply
