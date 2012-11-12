/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeAndValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Atomic RMW</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AtomicRMWImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtomicRMWImpl extends InstructionImpl implements AtomicRMW
{
  /**
   * The cached value of the '{@link #getAdress() <em>Adress</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdress()
   * @generated
   * @ordered
   */
  protected TypeAndValue adress;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected TypeAndValue value;

  /**
   * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdering()
   * @generated
   * @ordered
   */
  protected static final String ORDERING_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrdering()
   * @generated
   * @ordered
   */
  protected String ordering = ORDERING_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtomicRMWImpl()
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
    return LlvmPackage.Literals.ATOMIC_RMW;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getAdress()
  {
    return adress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdress(TypeAndValue newAdress, NotificationChain msgs)
  {
    TypeAndValue oldAdress = adress;
    adress = newAdress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__ADRESS, oldAdress, newAdress);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdress(TypeAndValue newAdress)
  {
    if (newAdress != adress)
    {
      NotificationChain msgs = null;
      if (adress != null)
        msgs = ((InternalEObject)adress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__ADRESS, null, msgs);
      if (newAdress != null)
        msgs = ((InternalEObject)newAdress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__ADRESS, null, msgs);
      msgs = basicSetAdress(newAdress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__ADRESS, newAdress, newAdress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(TypeAndValue newValue, NotificationChain msgs)
  {
    TypeAndValue oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(TypeAndValue newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ATOMIC_RMW__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOrdering()
  {
    return ordering;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrdering(String newOrdering)
  {
    String oldOrdering = ordering;
    ordering = newOrdering;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ATOMIC_RMW__ORDERING, oldOrdering, ordering));
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
      case LlvmPackage.ATOMIC_RMW__ADRESS:
        return basicSetAdress(null, msgs);
      case LlvmPackage.ATOMIC_RMW__VALUE:
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
      case LlvmPackage.ATOMIC_RMW__ADRESS:
        return getAdress();
      case LlvmPackage.ATOMIC_RMW__VALUE:
        return getValue();
      case LlvmPackage.ATOMIC_RMW__ORDERING:
        return getOrdering();
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
      case LlvmPackage.ATOMIC_RMW__ADRESS:
        setAdress((TypeAndValue)newValue);
        return;
      case LlvmPackage.ATOMIC_RMW__VALUE:
        setValue((TypeAndValue)newValue);
        return;
      case LlvmPackage.ATOMIC_RMW__ORDERING:
        setOrdering((String)newValue);
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
      case LlvmPackage.ATOMIC_RMW__ADRESS:
        setAdress((TypeAndValue)null);
        return;
      case LlvmPackage.ATOMIC_RMW__VALUE:
        setValue((TypeAndValue)null);
        return;
      case LlvmPackage.ATOMIC_RMW__ORDERING:
        setOrdering(ORDERING_EDEFAULT);
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
      case LlvmPackage.ATOMIC_RMW__ADRESS:
        return adress != null;
      case LlvmPackage.ATOMIC_RMW__VALUE:
        return value != null;
      case LlvmPackage.ATOMIC_RMW__ORDERING:
        return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
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
    result.append(" (ordering: ");
    result.append(ordering);
    result.append(')');
    return result.toString();
  }

} //AtomicRMWImpl
