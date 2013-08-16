/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Select;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getTrueValue <em>True Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getElseValue <em>Else Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectImpl extends InstructionImpl implements Select
{
  /**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
  protected Address result;

  /**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
  protected Parameter condition;

  /**
	 * The cached value of the '{@link #getTrueValue() <em>True Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTrueValue()
	 * @generated
	 * @ordered
	 */
  protected Parameter trueValue;

  /**
	 * The cached value of the '{@link #getElseValue() <em>Else Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElseValue()
	 * @generated
	 * @ordered
	 */
  protected Parameter elseValue;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected SelectImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return LlvmPackage.Literals.SELECT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Address getResult()
  {
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetResult(Address newResult, NotificationChain msgs)
  {
		Address oldResult = result;
		result = newResult;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__RESULT, oldResult, newResult);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setResult(Address newResult)
  {
		if (newResult != result)
		{
			NotificationChain msgs = null;
			if (result != null)
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__RESULT, newResult, newResult));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getCondition()
  {
		return condition;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetCondition(Parameter newCondition, NotificationChain msgs)
  {
		Parameter oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCondition(Parameter newCondition)
  {
		if (newCondition != condition)
		{
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__CONDITION, newCondition, newCondition));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getTrueValue()
  {
		return trueValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTrueValue(Parameter newTrueValue, NotificationChain msgs)
  {
		Parameter oldTrueValue = trueValue;
		trueValue = newTrueValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__TRUE_VALUE, oldTrueValue, newTrueValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTrueValue(Parameter newTrueValue)
  {
		if (newTrueValue != trueValue)
		{
			NotificationChain msgs = null;
			if (trueValue != null)
				msgs = ((InternalEObject)trueValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__TRUE_VALUE, null, msgs);
			if (newTrueValue != null)
				msgs = ((InternalEObject)newTrueValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__TRUE_VALUE, null, msgs);
			msgs = basicSetTrueValue(newTrueValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__TRUE_VALUE, newTrueValue, newTrueValue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getElseValue()
  {
		return elseValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetElseValue(Parameter newElseValue, NotificationChain msgs)
  {
		Parameter oldElseValue = elseValue;
		elseValue = newElseValue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__ELSE_VALUE, oldElseValue, newElseValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setElseValue(Parameter newElseValue)
  {
		if (newElseValue != elseValue)
		{
			NotificationChain msgs = null;
			if (elseValue != null)
				msgs = ((InternalEObject)elseValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__ELSE_VALUE, null, msgs);
			if (newElseValue != null)
				msgs = ((InternalEObject)newElseValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__ELSE_VALUE, null, msgs);
			msgs = basicSetElseValue(newElseValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__ELSE_VALUE, newElseValue, newElseValue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID)
		{
			case LlvmPackage.SELECT__RESULT:
				return basicSetResult(null, msgs);
			case LlvmPackage.SELECT__CONDITION:
				return basicSetCondition(null, msgs);
			case LlvmPackage.SELECT__TRUE_VALUE:
				return basicSetTrueValue(null, msgs);
			case LlvmPackage.SELECT__ELSE_VALUE:
				return basicSetElseValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID)
		{
			case LlvmPackage.SELECT__RESULT:
				return getResult();
			case LlvmPackage.SELECT__CONDITION:
				return getCondition();
			case LlvmPackage.SELECT__TRUE_VALUE:
				return getTrueValue();
			case LlvmPackage.SELECT__ELSE_VALUE:
				return getElseValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID)
		{
			case LlvmPackage.SELECT__RESULT:
				setResult((Address)newValue);
				return;
			case LlvmPackage.SELECT__CONDITION:
				setCondition((Parameter)newValue);
				return;
			case LlvmPackage.SELECT__TRUE_VALUE:
				setTrueValue((Parameter)newValue);
				return;
			case LlvmPackage.SELECT__ELSE_VALUE:
				setElseValue((Parameter)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID)
		{
			case LlvmPackage.SELECT__RESULT:
				setResult((Address)null);
				return;
			case LlvmPackage.SELECT__CONDITION:
				setCondition((Parameter)null);
				return;
			case LlvmPackage.SELECT__TRUE_VALUE:
				setTrueValue((Parameter)null);
				return;
			case LlvmPackage.SELECT__ELSE_VALUE:
				setElseValue((Parameter)null);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID)
		{
			case LlvmPackage.SELECT__RESULT:
				return result != null;
			case LlvmPackage.SELECT__CONDITION:
				return condition != null;
			case LlvmPackage.SELECT__TRUE_VALUE:
				return trueValue != null;
			case LlvmPackage.SELECT__ELSE_VALUE:
				return elseValue != null;
		}
		return super.eIsSet(featureID);
	}

} //SelectImpl
