/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Select;
import de.upb.llvm_parser.llvm.TypeAndValue;

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
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getVal1 <em>Val1</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SelectImpl#getVal2 <em>Val2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectImpl extends InstructionImpl implements Select
{
  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected TypeAndValue condition;

  /**
   * The cached value of the '{@link #getVal1() <em>Val1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal1()
   * @generated
   * @ordered
   */
  protected TypeAndValue val1;

  /**
   * The cached value of the '{@link #getVal2() <em>Val2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVal2()
   * @generated
   * @ordered
   */
  protected TypeAndValue val2;

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
  public TypeAndValue getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(TypeAndValue newCondition, NotificationChain msgs)
  {
    TypeAndValue oldCondition = condition;
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
  public void setCondition(TypeAndValue newCondition)
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
  public TypeAndValue getVal1()
  {
    return val1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal1(TypeAndValue newVal1, NotificationChain msgs)
  {
    TypeAndValue oldVal1 = val1;
    val1 = newVal1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__VAL1, oldVal1, newVal1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal1(TypeAndValue newVal1)
  {
    if (newVal1 != val1)
    {
      NotificationChain msgs = null;
      if (val1 != null)
        msgs = ((InternalEObject)val1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__VAL1, null, msgs);
      if (newVal1 != null)
        msgs = ((InternalEObject)newVal1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__VAL1, null, msgs);
      msgs = basicSetVal1(newVal1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__VAL1, newVal1, newVal1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getVal2()
  {
    return val2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVal2(TypeAndValue newVal2, NotificationChain msgs)
  {
    TypeAndValue oldVal2 = val2;
    val2 = newVal2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__VAL2, oldVal2, newVal2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVal2(TypeAndValue newVal2)
  {
    if (newVal2 != val2)
    {
      NotificationChain msgs = null;
      if (val2 != null)
        msgs = ((InternalEObject)val2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__VAL2, null, msgs);
      if (newVal2 != null)
        msgs = ((InternalEObject)newVal2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SELECT__VAL2, null, msgs);
      msgs = basicSetVal2(newVal2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SELECT__VAL2, newVal2, newVal2));
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
      case LlvmPackage.SELECT__CONDITION:
        return basicSetCondition(null, msgs);
      case LlvmPackage.SELECT__VAL1:
        return basicSetVal1(null, msgs);
      case LlvmPackage.SELECT__VAL2:
        return basicSetVal2(null, msgs);
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
      case LlvmPackage.SELECT__CONDITION:
        return getCondition();
      case LlvmPackage.SELECT__VAL1:
        return getVal1();
      case LlvmPackage.SELECT__VAL2:
        return getVal2();
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
      case LlvmPackage.SELECT__CONDITION:
        setCondition((TypeAndValue)newValue);
        return;
      case LlvmPackage.SELECT__VAL1:
        setVal1((TypeAndValue)newValue);
        return;
      case LlvmPackage.SELECT__VAL2:
        setVal2((TypeAndValue)newValue);
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
      case LlvmPackage.SELECT__CONDITION:
        setCondition((TypeAndValue)null);
        return;
      case LlvmPackage.SELECT__VAL1:
        setVal1((TypeAndValue)null);
        return;
      case LlvmPackage.SELECT__VAL2:
        setVal2((TypeAndValue)null);
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
      case LlvmPackage.SELECT__CONDITION:
        return condition != null;
      case LlvmPackage.SELECT__VAL1:
        return val1 != null;
      case LlvmPackage.SELECT__VAL2:
        return val2 != null;
    }
    return super.eIsSet(featureID);
  }

} //SelectImpl
