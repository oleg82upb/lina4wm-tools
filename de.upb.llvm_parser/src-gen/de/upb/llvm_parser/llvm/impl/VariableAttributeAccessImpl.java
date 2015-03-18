/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Attribute Access</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl#getVaList <em>Va List</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.VariableAttributeAccessImpl#getAType <em>AType</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableAttributeAccessImpl extends InstructionImpl implements VariableAttributeAccess
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
   * The cached value of the '{@link #getVaList() <em>Va List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVaList()
   * @generated
   * @ordered
   */
  protected Parameter vaList;

  /**
   * The cached value of the '{@link #getAType() <em>AType</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAType()
   * @generated
   * @ordered
   */
  protected TypeUse aType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableAttributeAccessImpl()
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
    return LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT, oldResult, newResult);
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
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getVaList()
  {
    return vaList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVaList(Parameter newVaList, NotificationChain msgs)
  {
    Parameter oldVaList = vaList;
    vaList = newVaList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST, oldVaList, newVaList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVaList(Parameter newVaList)
  {
    if (newVaList != vaList)
    {
      NotificationChain msgs = null;
      if (vaList != null)
        msgs = ((InternalEObject)vaList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST, null, msgs);
      if (newVaList != null)
        msgs = ((InternalEObject)newVaList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST, null, msgs);
      msgs = basicSetVaList(newVaList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST, newVaList, newVaList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getAType()
  {
    return aType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAType(TypeUse newAType, NotificationChain msgs)
  {
    TypeUse oldAType = aType;
    aType = newAType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ATYPE, oldAType, newAType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAType(TypeUse newAType)
  {
    if (newAType != aType)
    {
      NotificationChain msgs = null;
      if (aType != null)
        msgs = ((InternalEObject)aType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ATYPE, null, msgs);
      if (newAType != null)
        msgs = ((InternalEObject)newAType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ATYPE, null, msgs);
      msgs = basicSetAType(newAType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ATYPE, newAType, newAType));
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
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
        return basicSetResult(null, msgs);
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST:
        return basicSetVaList(null, msgs);
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ATYPE:
        return basicSetAType(null, msgs);
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
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
        return getResult();
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST:
        return getVaList();
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ATYPE:
        return getAType();
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
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
        setResult((Address)newValue);
        return;
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST:
        setVaList((Parameter)newValue);
        return;
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ATYPE:
        setAType((TypeUse)newValue);
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
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
        setResult((Address)null);
        return;
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST:
        setVaList((Parameter)null);
        return;
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ATYPE:
        setAType((TypeUse)null);
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
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__RESULT:
        return result != null;
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST:
        return vaList != null;
      case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS__ATYPE:
        return aType != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableAttributeAccessImpl
