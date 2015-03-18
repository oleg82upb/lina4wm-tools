/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getVector <em>Vector</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertElementImpl extends InstructionImpl implements InsertElement
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
   * The cached value of the '{@link #getVector() <em>Vector</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVector()
   * @generated
   * @ordered
   */
  protected Parameter vector;

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
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected Parameter index;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InsertElementImpl()
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
    return LlvmPackage.Literals.INSERT_ELEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__RESULT, oldResult, newResult);
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
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_ELEMENT__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_ELEMENT__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getVector()
  {
    return vector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVector(Parameter newVector, NotificationChain msgs)
  {
    Parameter oldVector = vector;
    vector = newVector;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__VECTOR, oldVector, newVector);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVector(Parameter newVector)
  {
    if (newVector != vector)
    {
      NotificationChain msgs = null;
      if (vector != null)
        msgs = ((InternalEObject)vector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_ELEMENT__VECTOR, null, msgs);
      if (newVector != null)
        msgs = ((InternalEObject)newVector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_ELEMENT__VECTOR, null, msgs);
      msgs = basicSetVector(newVector, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__VECTOR, newVector, newVector));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_ELEMENT__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_ELEMENT__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(Parameter newIndex, NotificationChain msgs)
  {
    Parameter oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIndex(Parameter newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_ELEMENT__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_ELEMENT__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__INDEX, newIndex, newIndex));
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
      case LlvmPackage.INSERT_ELEMENT__RESULT:
        return basicSetResult(null, msgs);
      case LlvmPackage.INSERT_ELEMENT__VECTOR:
        return basicSetVector(null, msgs);
      case LlvmPackage.INSERT_ELEMENT__VALUE:
        return basicSetValue(null, msgs);
      case LlvmPackage.INSERT_ELEMENT__INDEX:
        return basicSetIndex(null, msgs);
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
      case LlvmPackage.INSERT_ELEMENT__RESULT:
        return getResult();
      case LlvmPackage.INSERT_ELEMENT__VECTOR:
        return getVector();
      case LlvmPackage.INSERT_ELEMENT__VALUE:
        return getValue();
      case LlvmPackage.INSERT_ELEMENT__INDEX:
        return getIndex();
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
      case LlvmPackage.INSERT_ELEMENT__RESULT:
        setResult((Address)newValue);
        return;
      case LlvmPackage.INSERT_ELEMENT__VECTOR:
        setVector((Parameter)newValue);
        return;
      case LlvmPackage.INSERT_ELEMENT__VALUE:
        setValue((Parameter)newValue);
        return;
      case LlvmPackage.INSERT_ELEMENT__INDEX:
        setIndex((Parameter)newValue);
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
      case LlvmPackage.INSERT_ELEMENT__RESULT:
        setResult((Address)null);
        return;
      case LlvmPackage.INSERT_ELEMENT__VECTOR:
        setVector((Parameter)null);
        return;
      case LlvmPackage.INSERT_ELEMENT__VALUE:
        setValue((Parameter)null);
        return;
      case LlvmPackage.INSERT_ELEMENT__INDEX:
        setIndex((Parameter)null);
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
      case LlvmPackage.INSERT_ELEMENT__RESULT:
        return result != null;
      case LlvmPackage.INSERT_ELEMENT__VECTOR:
        return vector != null;
      case LlvmPackage.INSERT_ELEMENT__VALUE:
        return value != null;
      case LlvmPackage.INSERT_ELEMENT__INDEX:
        return index != null;
    }
    return super.eIsSet(featureID);
  }

} //InsertElementImpl
