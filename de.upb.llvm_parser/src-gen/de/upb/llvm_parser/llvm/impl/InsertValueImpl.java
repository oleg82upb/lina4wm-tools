/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getAggerate <em>Aggerate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertValueImpl extends InstructionImpl implements InsertValue
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
   * The cached value of the '{@link #getAggerate() <em>Aggerate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggerate()
   * @generated
   * @ordered
   */
  protected Parameter aggerate;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected Parameter value;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected EList<Integer> index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsertValueImpl()
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
    return LlvmPackage.Literals.INSERT_VALUE;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__RESULT, oldResult, newResult);
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
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getAggerate()
  {
    return aggerate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAggerate(Parameter newAggerate, NotificationChain msgs)
  {
    Parameter oldAggerate = aggerate;
    aggerate = newAggerate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__AGGERATE, oldAggerate, newAggerate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggerate(Parameter newAggerate)
  {
    if (newAggerate != aggerate)
    {
      NotificationChain msgs = null;
      if (aggerate != null)
        msgs = ((InternalEObject)aggerate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__AGGERATE, null, msgs);
      if (newAggerate != null)
        msgs = ((InternalEObject)newAggerate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__AGGERATE, null, msgs);
      msgs = basicSetAggerate(newAggerate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__AGGERATE, newAggerate, newAggerate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(Parameter newValue, NotificationChain msgs)
  {
    Parameter oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(Parameter newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Integer> getIndex()
  {
    if (index == null)
    {
      index = new EDataTypeEList<Integer>(Integer.class, this, LlvmPackage.INSERT_VALUE__INDEX);
    }
    return index;
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
      case LlvmPackage.INSERT_VALUE__RESULT:
        return basicSetResult(null, msgs);
      case LlvmPackage.INSERT_VALUE__AGGERATE:
        return basicSetAggerate(null, msgs);
      case LlvmPackage.INSERT_VALUE__VALUE:
        return basicSetValue(null, msgs);
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
      case LlvmPackage.INSERT_VALUE__RESULT:
        return getResult();
      case LlvmPackage.INSERT_VALUE__AGGERATE:
        return getAggerate();
      case LlvmPackage.INSERT_VALUE__VALUE:
        return getValue();
      case LlvmPackage.INSERT_VALUE__INDEX:
        return getIndex();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LlvmPackage.INSERT_VALUE__RESULT:
        setResult((Address)newValue);
        return;
      case LlvmPackage.INSERT_VALUE__AGGERATE:
        setAggerate((Parameter)newValue);
        return;
      case LlvmPackage.INSERT_VALUE__VALUE:
        setValue((Parameter)newValue);
        return;
      case LlvmPackage.INSERT_VALUE__INDEX:
        getIndex().clear();
        getIndex().addAll((Collection<? extends Integer>)newValue);
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
      case LlvmPackage.INSERT_VALUE__RESULT:
        setResult((Address)null);
        return;
      case LlvmPackage.INSERT_VALUE__AGGERATE:
        setAggerate((Parameter)null);
        return;
      case LlvmPackage.INSERT_VALUE__VALUE:
        setValue((Parameter)null);
        return;
      case LlvmPackage.INSERT_VALUE__INDEX:
        getIndex().clear();
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
      case LlvmPackage.INSERT_VALUE__RESULT:
        return result != null;
      case LlvmPackage.INSERT_VALUE__AGGERATE:
        return aggerate != null;
      case LlvmPackage.INSERT_VALUE__VALUE:
        return value != null;
      case LlvmPackage.INSERT_VALUE__INDEX:
        return index != null && !index.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (index: ");
    result.append(index);
    result.append(')');
    return result.toString();
  }

} //InsertValueImpl
