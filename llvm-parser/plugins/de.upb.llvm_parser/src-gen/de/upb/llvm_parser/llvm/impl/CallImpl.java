/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeAndValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getPList <em>PList</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends InstructionImpl implements Call
{
  /**
   * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer()
   * @generated
   * @ordered
   */
  protected TypeAndValue pointer;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CallImpl()
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
    return LlvmPackage.Literals.CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getPointer()
  {
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointer(TypeAndValue newPointer, NotificationChain msgs)
  {
    TypeAndValue oldPointer = pointer;
    pointer = newPointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__POINTER, oldPointer, newPointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointer(TypeAndValue newPointer)
  {
    if (newPointer != pointer)
    {
      NotificationChain msgs = null;
      if (pointer != null)
        msgs = ((InternalEObject)pointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__POINTER, null, msgs);
      if (newPointer != null)
        msgs = ((InternalEObject)newPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__POINTER, null, msgs);
      msgs = basicSetPointer(newPointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__POINTER, newPointer, newPointer));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__PLIST, oldPList, pList));
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
      case LlvmPackage.CALL__POINTER:
        return basicSetPointer(null, msgs);
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
      case LlvmPackage.CALL__POINTER:
        return getPointer();
      case LlvmPackage.CALL__PLIST:
        return getPList();
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
      case LlvmPackage.CALL__POINTER:
        setPointer((TypeAndValue)newValue);
        return;
      case LlvmPackage.CALL__PLIST:
        setPList((String)newValue);
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
      case LlvmPackage.CALL__POINTER:
        setPointer((TypeAndValue)null);
        return;
      case LlvmPackage.CALL__PLIST:
        setPList(PLIST_EDEFAULT);
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
      case LlvmPackage.CALL__POINTER:
        return pointer != null;
      case LlvmPackage.CALL__PLIST:
        return PLIST_EDEFAULT == null ? pList != null : !PLIST_EDEFAULT.equals(pList);
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

} //CallImpl
