/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

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
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getPList <em>PList</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends StandartInstructionImpl implements Call
{
  /**
   * The cached value of the '{@link #getAdresstype() <em>Adresstype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdresstype()
   * @generated
   * @ordered
   */
  protected TypeUse adresstype;

  /**
   * The cached value of the '{@link #getAdress() <em>Adress</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdress()
   * @generated
   * @ordered
   */
  protected Value adress;

  /**
   * The cached value of the '{@link #getPList() <em>PList</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPList()
   * @generated
   * @ordered
   */
  protected ParameterList pList;

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
  public TypeUse getAdresstype()
  {
    return adresstype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdresstype(TypeUse newAdresstype, NotificationChain msgs)
  {
    TypeUse oldAdresstype = adresstype;
    adresstype = newAdresstype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__ADRESSTYPE, oldAdresstype, newAdresstype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdresstype(TypeUse newAdresstype)
  {
    if (newAdresstype != adresstype)
    {
      NotificationChain msgs = null;
      if (adresstype != null)
        msgs = ((InternalEObject)adresstype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__ADRESSTYPE, null, msgs);
      if (newAdresstype != null)
        msgs = ((InternalEObject)newAdresstype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__ADRESSTYPE, null, msgs);
      msgs = basicSetAdresstype(newAdresstype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__ADRESSTYPE, newAdresstype, newAdresstype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getAdress()
  {
    return adress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdress(Value newAdress, NotificationChain msgs)
  {
    Value oldAdress = adress;
    adress = newAdress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__ADRESS, oldAdress, newAdress);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdress(Value newAdress)
  {
    if (newAdress != adress)
    {
      NotificationChain msgs = null;
      if (adress != null)
        msgs = ((InternalEObject)adress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__ADRESS, null, msgs);
      if (newAdress != null)
        msgs = ((InternalEObject)newAdress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__ADRESS, null, msgs);
      msgs = basicSetAdress(newAdress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__ADRESS, newAdress, newAdress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterList getPList()
  {
    return pList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPList(ParameterList newPList, NotificationChain msgs)
  {
    ParameterList oldPList = pList;
    pList = newPList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__PLIST, oldPList, newPList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPList(ParameterList newPList)
  {
    if (newPList != pList)
    {
      NotificationChain msgs = null;
      if (pList != null)
        msgs = ((InternalEObject)pList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__PLIST, null, msgs);
      if (newPList != null)
        msgs = ((InternalEObject)newPList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__PLIST, null, msgs);
      msgs = basicSetPList(newPList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__PLIST, newPList, newPList));
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
      case LlvmPackage.CALL__ADRESSTYPE:
        return basicSetAdresstype(null, msgs);
      case LlvmPackage.CALL__ADRESS:
        return basicSetAdress(null, msgs);
      case LlvmPackage.CALL__PLIST:
        return basicSetPList(null, msgs);
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
      case LlvmPackage.CALL__ADRESSTYPE:
        return getAdresstype();
      case LlvmPackage.CALL__ADRESS:
        return getAdress();
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
      case LlvmPackage.CALL__ADRESSTYPE:
        setAdresstype((TypeUse)newValue);
        return;
      case LlvmPackage.CALL__ADRESS:
        setAdress((Value)newValue);
        return;
      case LlvmPackage.CALL__PLIST:
        setPList((ParameterList)newValue);
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
      case LlvmPackage.CALL__ADRESSTYPE:
        setAdresstype((TypeUse)null);
        return;
      case LlvmPackage.CALL__ADRESS:
        setAdress((Value)null);
        return;
      case LlvmPackage.CALL__PLIST:
        setPList((ParameterList)null);
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
      case LlvmPackage.CALL__ADRESSTYPE:
        return adresstype != null;
      case LlvmPackage.CALL__ADRESS:
        return adress != null;
      case LlvmPackage.CALL__PLIST:
        return pList != null;
    }
    return super.eIsSet(featureID);
  }

} //CallImpl
