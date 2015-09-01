/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.MetaArgValue;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Store;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#isVolatile <em>Volatile</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getTargetAddress <em>Target Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#isAtomic <em>Atomic</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoreImpl extends InstructionImpl implements Store
{
  /**
   * The default value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVolatile()
   * @generated
   * @ordered
   */
  protected static final boolean VOLATILE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isVolatile() <em>Volatile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isVolatile()
   * @generated
   * @ordered
   */
  protected boolean volatile_ = VOLATILE_EDEFAULT;

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
   * The cached value of the '{@link #getTargetAddress() <em>Target Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTargetAddress()
   * @generated
   * @ordered
   */
  protected Parameter targetAddress;

  /**
   * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlign()
   * @generated
   * @ordered
   */
  protected static final int ALIGN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlign()
   * @generated
   * @ordered
   */
  protected int align = ALIGN_EDEFAULT;

  /**
   * The cached value of the '{@link #getMeta() <em>Meta</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMeta()
   * @generated
   * @ordered
   */
  protected EList<MetaArgValue> meta;

  /**
   * The default value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAtomic()
   * @generated
   * @ordered
   */
  protected static final boolean ATOMIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isAtomic() <em>Atomic</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isAtomic()
   * @generated
   * @ordered
   */
  protected boolean atomic = ATOMIC_EDEFAULT;

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
  protected StoreImpl()
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
    return LlvmPackage.Literals.STORE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isVolatile()
  {
    return volatile_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVolatile(boolean newVolatile)
  {
    boolean oldVolatile = volatile_;
    volatile_ = newVolatile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__VOLATILE, oldVolatile, volatile_));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__VALUE, oldValue, newValue);
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
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getTargetAddress()
  {
    return targetAddress;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTargetAddress(Parameter newTargetAddress, NotificationChain msgs)
  {
    Parameter oldTargetAddress = targetAddress;
    targetAddress = newTargetAddress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__TARGET_ADDRESS, oldTargetAddress, newTargetAddress);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTargetAddress(Parameter newTargetAddress)
  {
    if (newTargetAddress != targetAddress)
    {
      NotificationChain msgs = null;
      if (targetAddress != null)
        msgs = ((InternalEObject)targetAddress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__TARGET_ADDRESS, null, msgs);
      if (newTargetAddress != null)
        msgs = ((InternalEObject)newTargetAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__TARGET_ADDRESS, null, msgs);
      msgs = basicSetTargetAddress(newTargetAddress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__TARGET_ADDRESS, newTargetAddress, newTargetAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAlign()
  {
    return align;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlign(int newAlign)
  {
    int oldAlign = align;
    align = newAlign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ALIGN, oldAlign, align));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MetaArgValue> getMeta()
  {
    if (meta == null)
    {
      meta = new EObjectContainmentEList<MetaArgValue>(MetaArgValue.class, this, LlvmPackage.STORE__META);
    }
    return meta;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isAtomic()
  {
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtomic(boolean newAtomic)
  {
    boolean oldAtomic = atomic;
    atomic = newAtomic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ATOMIC, oldAtomic, atomic));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ORDERING, oldOrdering, ordering));
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
      case LlvmPackage.STORE__VALUE:
        return basicSetValue(null, msgs);
      case LlvmPackage.STORE__TARGET_ADDRESS:
        return basicSetTargetAddress(null, msgs);
      case LlvmPackage.STORE__META:
        return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
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
      case LlvmPackage.STORE__VOLATILE:
        return isVolatile();
      case LlvmPackage.STORE__VALUE:
        return getValue();
      case LlvmPackage.STORE__TARGET_ADDRESS:
        return getTargetAddress();
      case LlvmPackage.STORE__ALIGN:
        return getAlign();
      case LlvmPackage.STORE__META:
        return getMeta();
      case LlvmPackage.STORE__ATOMIC:
        return isAtomic();
      case LlvmPackage.STORE__ORDERING:
        return getOrdering();
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
      case LlvmPackage.STORE__VOLATILE:
        setVolatile((Boolean)newValue);
        return;
      case LlvmPackage.STORE__VALUE:
        setValue((Parameter)newValue);
        return;
      case LlvmPackage.STORE__TARGET_ADDRESS:
        setTargetAddress((Parameter)newValue);
        return;
      case LlvmPackage.STORE__ALIGN:
        setAlign((Integer)newValue);
        return;
      case LlvmPackage.STORE__META:
        getMeta().clear();
        getMeta().addAll((Collection<? extends MetaArgValue>)newValue);
        return;
      case LlvmPackage.STORE__ATOMIC:
        setAtomic((Boolean)newValue);
        return;
      case LlvmPackage.STORE__ORDERING:
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
      case LlvmPackage.STORE__VOLATILE:
        setVolatile(VOLATILE_EDEFAULT);
        return;
      case LlvmPackage.STORE__VALUE:
        setValue((Parameter)null);
        return;
      case LlvmPackage.STORE__TARGET_ADDRESS:
        setTargetAddress((Parameter)null);
        return;
      case LlvmPackage.STORE__ALIGN:
        setAlign(ALIGN_EDEFAULT);
        return;
      case LlvmPackage.STORE__META:
        getMeta().clear();
        return;
      case LlvmPackage.STORE__ATOMIC:
        setAtomic(ATOMIC_EDEFAULT);
        return;
      case LlvmPackage.STORE__ORDERING:
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
      case LlvmPackage.STORE__VOLATILE:
        return volatile_ != VOLATILE_EDEFAULT;
      case LlvmPackage.STORE__VALUE:
        return value != null;
      case LlvmPackage.STORE__TARGET_ADDRESS:
        return targetAddress != null;
      case LlvmPackage.STORE__ALIGN:
        return align != ALIGN_EDEFAULT;
      case LlvmPackage.STORE__META:
        return meta != null && !meta.isEmpty();
      case LlvmPackage.STORE__ATOMIC:
        return atomic != ATOMIC_EDEFAULT;
      case LlvmPackage.STORE__ORDERING:
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
    result.append(" (volatile: ");
    result.append(volatile_);
    result.append(", align: ");
    result.append(align);
    result.append(", atomic: ");
    result.append(atomic);
    result.append(", ordering: ");
    result.append(ordering);
    result.append(')');
    return result.toString();
  }

} //StoreImpl
