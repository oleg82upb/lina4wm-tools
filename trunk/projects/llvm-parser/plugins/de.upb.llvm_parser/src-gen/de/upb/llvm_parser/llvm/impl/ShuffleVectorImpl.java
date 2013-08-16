/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.ShuffleVector;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shuffle Vector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getValue1 <em>Value1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getValue2 <em>Value2</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ShuffleVectorImpl#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ShuffleVectorImpl extends InstructionImpl implements ShuffleVector
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
	 * The cached value of the '{@link #getValue1() <em>Value1</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValue1()
	 * @generated
	 * @ordered
	 */
  protected Parameter value1;

  /**
	 * The cached value of the '{@link #getValue2() <em>Value2</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValue2()
	 * @generated
	 * @ordered
	 */
  protected Parameter value2;

  /**
	 * The cached value of the '{@link #getMask() <em>Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMask()
	 * @generated
	 * @ordered
	 */
  protected Parameter mask;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ShuffleVectorImpl()
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
		return LlvmPackage.Literals.SHUFFLE_VECTOR;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__RESULT, oldResult, newResult);
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
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__RESULT, newResult, newResult));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getValue1()
  {
		return value1;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValue1(Parameter newValue1, NotificationChain msgs)
  {
		Parameter oldValue1 = value1;
		value1 = newValue1;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VALUE1, oldValue1, newValue1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValue1(Parameter newValue1)
  {
		if (newValue1 != value1)
		{
			NotificationChain msgs = null;
			if (value1 != null)
				msgs = ((InternalEObject)value1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VALUE1, null, msgs);
			if (newValue1 != null)
				msgs = ((InternalEObject)newValue1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VALUE1, null, msgs);
			msgs = basicSetValue1(newValue1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VALUE1, newValue1, newValue1));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getValue2()
  {
		return value2;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValue2(Parameter newValue2, NotificationChain msgs)
  {
		Parameter oldValue2 = value2;
		value2 = newValue2;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VALUE2, oldValue2, newValue2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValue2(Parameter newValue2)
  {
		if (newValue2 != value2)
		{
			NotificationChain msgs = null;
			if (value2 != null)
				msgs = ((InternalEObject)value2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VALUE2, null, msgs);
			if (newValue2 != null)
				msgs = ((InternalEObject)newValue2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__VALUE2, null, msgs);
			msgs = basicSetValue2(newValue2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__VALUE2, newValue2, newValue2));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Parameter getMask()
  {
		return mask;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetMask(Parameter newMask, NotificationChain msgs)
  {
		Parameter oldMask = mask;
		mask = newMask;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__MASK, oldMask, newMask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMask(Parameter newMask)
  {
		if (newMask != mask)
		{
			NotificationChain msgs = null;
			if (mask != null)
				msgs = ((InternalEObject)mask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__MASK, null, msgs);
			if (newMask != null)
				msgs = ((InternalEObject)newMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SHUFFLE_VECTOR__MASK, null, msgs);
			msgs = basicSetMask(newMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SHUFFLE_VECTOR__MASK, newMask, newMask));
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
			case LlvmPackage.SHUFFLE_VECTOR__RESULT:
				return basicSetResult(null, msgs);
			case LlvmPackage.SHUFFLE_VECTOR__VALUE1:
				return basicSetValue1(null, msgs);
			case LlvmPackage.SHUFFLE_VECTOR__VALUE2:
				return basicSetValue2(null, msgs);
			case LlvmPackage.SHUFFLE_VECTOR__MASK:
				return basicSetMask(null, msgs);
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
			case LlvmPackage.SHUFFLE_VECTOR__RESULT:
				return getResult();
			case LlvmPackage.SHUFFLE_VECTOR__VALUE1:
				return getValue1();
			case LlvmPackage.SHUFFLE_VECTOR__VALUE2:
				return getValue2();
			case LlvmPackage.SHUFFLE_VECTOR__MASK:
				return getMask();
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
			case LlvmPackage.SHUFFLE_VECTOR__RESULT:
				setResult((Address)newValue);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VALUE1:
				setValue1((Parameter)newValue);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VALUE2:
				setValue2((Parameter)newValue);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__MASK:
				setMask((Parameter)newValue);
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
			case LlvmPackage.SHUFFLE_VECTOR__RESULT:
				setResult((Address)null);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VALUE1:
				setValue1((Parameter)null);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__VALUE2:
				setValue2((Parameter)null);
				return;
			case LlvmPackage.SHUFFLE_VECTOR__MASK:
				setMask((Parameter)null);
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
			case LlvmPackage.SHUFFLE_VECTOR__RESULT:
				return result != null;
			case LlvmPackage.SHUFFLE_VECTOR__VALUE1:
				return value1 != null;
			case LlvmPackage.SHUFFLE_VECTOR__VALUE2:
				return value2 != null;
			case LlvmPackage.SHUFFLE_VECTOR__MASK:
				return mask != null;
		}
		return super.eIsSet(featureID);
	}

} //ShuffleVectorImpl
