/**
 */
package de.upb.llvm_parser.lLVM.impl;

import de.upb.llvm_parser.lLVM.CmpXchg;
import de.upb.llvm_parser.lLVM.LLVMPackage;
import de.upb.llvm_parser.lLVM.TypeAndValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmp Xchg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.CmpXchgImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.CmpXchgImpl#getCompare_val <em>Compare val</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.CmpXchgImpl#getNew_val <em>New val</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.CmpXchgImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CmpXchgImpl extends InstructionImpl implements CmpXchg
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
   * The cached value of the '{@link #getCompare_val() <em>Compare val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompare_val()
   * @generated
   * @ordered
   */
  protected TypeAndValue compare_val;

  /**
   * The cached value of the '{@link #getNew_val() <em>New val</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNew_val()
   * @generated
   * @ordered
   */
  protected TypeAndValue new_val;

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
  protected CmpXchgImpl()
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
    return LLVMPackage.Literals.CMP_XCHG;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.CMP_XCHG__ADRESS, oldAdress, newAdress);
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
        msgs = ((InternalEObject)adress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.CMP_XCHG__ADRESS, null, msgs);
      if (newAdress != null)
        msgs = ((InternalEObject)newAdress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.CMP_XCHG__ADRESS, null, msgs);
      msgs = basicSetAdress(newAdress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.CMP_XCHG__ADRESS, newAdress, newAdress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getCompare_val()
  {
    return compare_val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompare_val(TypeAndValue newCompare_val, NotificationChain msgs)
  {
    TypeAndValue oldCompare_val = compare_val;
    compare_val = newCompare_val;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.CMP_XCHG__COMPARE_VAL, oldCompare_val, newCompare_val);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompare_val(TypeAndValue newCompare_val)
  {
    if (newCompare_val != compare_val)
    {
      NotificationChain msgs = null;
      if (compare_val != null)
        msgs = ((InternalEObject)compare_val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.CMP_XCHG__COMPARE_VAL, null, msgs);
      if (newCompare_val != null)
        msgs = ((InternalEObject)newCompare_val).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.CMP_XCHG__COMPARE_VAL, null, msgs);
      msgs = basicSetCompare_val(newCompare_val, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.CMP_XCHG__COMPARE_VAL, newCompare_val, newCompare_val));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getNew_val()
  {
    return new_val;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNew_val(TypeAndValue newNew_val, NotificationChain msgs)
  {
    TypeAndValue oldNew_val = new_val;
    new_val = newNew_val;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.CMP_XCHG__NEW_VAL, oldNew_val, newNew_val);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNew_val(TypeAndValue newNew_val)
  {
    if (newNew_val != new_val)
    {
      NotificationChain msgs = null;
      if (new_val != null)
        msgs = ((InternalEObject)new_val).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.CMP_XCHG__NEW_VAL, null, msgs);
      if (newNew_val != null)
        msgs = ((InternalEObject)newNew_val).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.CMP_XCHG__NEW_VAL, null, msgs);
      msgs = basicSetNew_val(newNew_val, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.CMP_XCHG__NEW_VAL, newNew_val, newNew_val));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.CMP_XCHG__ORDERING, oldOrdering, ordering));
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
      case LLVMPackage.CMP_XCHG__ADRESS:
        return basicSetAdress(null, msgs);
      case LLVMPackage.CMP_XCHG__COMPARE_VAL:
        return basicSetCompare_val(null, msgs);
      case LLVMPackage.CMP_XCHG__NEW_VAL:
        return basicSetNew_val(null, msgs);
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
      case LLVMPackage.CMP_XCHG__ADRESS:
        return getAdress();
      case LLVMPackage.CMP_XCHG__COMPARE_VAL:
        return getCompare_val();
      case LLVMPackage.CMP_XCHG__NEW_VAL:
        return getNew_val();
      case LLVMPackage.CMP_XCHG__ORDERING:
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
      case LLVMPackage.CMP_XCHG__ADRESS:
        setAdress((TypeAndValue)newValue);
        return;
      case LLVMPackage.CMP_XCHG__COMPARE_VAL:
        setCompare_val((TypeAndValue)newValue);
        return;
      case LLVMPackage.CMP_XCHG__NEW_VAL:
        setNew_val((TypeAndValue)newValue);
        return;
      case LLVMPackage.CMP_XCHG__ORDERING:
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
      case LLVMPackage.CMP_XCHG__ADRESS:
        setAdress((TypeAndValue)null);
        return;
      case LLVMPackage.CMP_XCHG__COMPARE_VAL:
        setCompare_val((TypeAndValue)null);
        return;
      case LLVMPackage.CMP_XCHG__NEW_VAL:
        setNew_val((TypeAndValue)null);
        return;
      case LLVMPackage.CMP_XCHG__ORDERING:
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
      case LLVMPackage.CMP_XCHG__ADRESS:
        return adress != null;
      case LLVMPackage.CMP_XCHG__COMPARE_VAL:
        return compare_val != null;
      case LLVMPackage.CMP_XCHG__NEW_VAL:
        return new_val != null;
      case LLVMPackage.CMP_XCHG__ORDERING:
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

} //CmpXchgImpl
