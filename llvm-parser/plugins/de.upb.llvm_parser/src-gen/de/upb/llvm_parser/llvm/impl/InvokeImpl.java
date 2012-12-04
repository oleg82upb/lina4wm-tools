/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeAndValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Invoke</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getPList <em>PList</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getTo <em>To</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InvokeImpl#getUnwind <em>Unwind</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InvokeImpl extends Ret_InstrImpl implements Invoke
{
  /**
   * The cached value of the '{@link #getFunction() <em>Function</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction()
   * @generated
   * @ordered
   */
  protected TypeAndValue function;

  /**
   * The default value of the '{@link #getPList() <em>PList</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPList()
   * @generated
   * @ordered
   */
  protected static final String PLIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPList() <em>PList</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPList()
   * @generated
   * @ordered
   */
  protected String pList = PLIST_EDEFAULT;

  /**
   * The cached value of the '{@link #getTo() <em>To</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTo()
   * @generated
   * @ordered
   */
  protected TypeAndValue to;

  /**
   * The cached value of the '{@link #getUnwind() <em>Unwind</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnwind()
   * @generated
   * @ordered
   */
  protected TypeAndValue unwind;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InvokeImpl()
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
    return LlvmPackage.Literals.INVOKE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getFunction()
  {
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction(TypeAndValue newFunction, NotificationChain msgs)
  {
    TypeAndValue oldFunction = function;
    function = newFunction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__FUNCTION, oldFunction, newFunction);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction(TypeAndValue newFunction)
  {
    if (newFunction != function)
    {
      NotificationChain msgs = null;
      if (function != null)
        msgs = ((InternalEObject)function).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__FUNCTION, null, msgs);
      if (newFunction != null)
        msgs = ((InternalEObject)newFunction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__FUNCTION, null, msgs);
      msgs = basicSetFunction(newFunction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__FUNCTION, newFunction, newFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPList()
  {
    return pList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPList(String newPList)
  {
    String oldPList = pList;
    pList = newPList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__PLIST, oldPList, pList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getTo()
  {
    return to;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTo(TypeAndValue newTo, NotificationChain msgs)
  {
    TypeAndValue oldTo = to;
    to = newTo;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TO, oldTo, newTo);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTo(TypeAndValue newTo)
  {
    if (newTo != to)
    {
      NotificationChain msgs = null;
      if (to != null)
        msgs = ((InternalEObject)to).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__TO, null, msgs);
      if (newTo != null)
        msgs = ((InternalEObject)newTo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__TO, null, msgs);
      msgs = basicSetTo(newTo, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__TO, newTo, newTo));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getUnwind()
  {
    return unwind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnwind(TypeAndValue newUnwind, NotificationChain msgs)
  {
    TypeAndValue oldUnwind = unwind;
    unwind = newUnwind;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWIND, oldUnwind, newUnwind);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnwind(TypeAndValue newUnwind)
  {
    if (newUnwind != unwind)
    {
      NotificationChain msgs = null;
      if (unwind != null)
        msgs = ((InternalEObject)unwind).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__UNWIND, null, msgs);
      if (newUnwind != null)
        msgs = ((InternalEObject)newUnwind).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INVOKE__UNWIND, null, msgs);
      msgs = basicSetUnwind(newUnwind, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INVOKE__UNWIND, newUnwind, newUnwind));
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
      case LlvmPackage.INVOKE__FUNCTION:
        return basicSetFunction(null, msgs);
      case LlvmPackage.INVOKE__TO:
        return basicSetTo(null, msgs);
      case LlvmPackage.INVOKE__UNWIND:
        return basicSetUnwind(null, msgs);
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
      case LlvmPackage.INVOKE__FUNCTION:
        return getFunction();
      case LlvmPackage.INVOKE__PLIST:
        return getPList();
      case LlvmPackage.INVOKE__TO:
        return getTo();
      case LlvmPackage.INVOKE__UNWIND:
        return getUnwind();
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
      case LlvmPackage.INVOKE__FUNCTION:
        setFunction((TypeAndValue)newValue);
        return;
      case LlvmPackage.INVOKE__PLIST:
        setPList((String)newValue);
        return;
      case LlvmPackage.INVOKE__TO:
        setTo((TypeAndValue)newValue);
        return;
      case LlvmPackage.INVOKE__UNWIND:
        setUnwind((TypeAndValue)newValue);
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
      case LlvmPackage.INVOKE__FUNCTION:
        setFunction((TypeAndValue)null);
        return;
      case LlvmPackage.INVOKE__PLIST:
        setPList(PLIST_EDEFAULT);
        return;
      case LlvmPackage.INVOKE__TO:
        setTo((TypeAndValue)null);
        return;
      case LlvmPackage.INVOKE__UNWIND:
        setUnwind((TypeAndValue)null);
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
      case LlvmPackage.INVOKE__FUNCTION:
        return function != null;
      case LlvmPackage.INVOKE__PLIST:
        return PLIST_EDEFAULT == null ? pList != null : !PLIST_EDEFAULT.equals(pList);
      case LlvmPackage.INVOKE__TO:
        return to != null;
      case LlvmPackage.INVOKE__UNWIND:
        return unwind != null;
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
    result.append(" (pList: ");
    result.append(pList);
    result.append(')');
    return result.toString();
  }

} //InvokeImpl
