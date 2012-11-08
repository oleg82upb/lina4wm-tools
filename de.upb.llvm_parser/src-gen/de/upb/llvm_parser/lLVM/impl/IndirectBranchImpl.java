/**
 */
package de.upb.llvm_parser.lLVM.impl;

import de.upb.llvm_parser.lLVM.IndirectBranch;
import de.upb.llvm_parser.lLVM.LLVMPackage;
import de.upb.llvm_parser.lLVM.LabelList;
import de.upb.llvm_parser.lLVM.TypeAndValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indirect Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.IndirectBranchImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.IndirectBranchImpl#getLList <em>LList</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndirectBranchImpl extends InstructionImpl implements IndirectBranch
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
   * The cached value of the '{@link #getLList() <em>LList</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLList()
   * @generated
   * @ordered
   */
  protected LabelList lList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndirectBranchImpl()
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
    return LLVMPackage.Literals.INDIRECT_BRANCH;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.INDIRECT_BRANCH__ADRESS, oldAdress, newAdress);
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
        msgs = ((InternalEObject)adress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.INDIRECT_BRANCH__ADRESS, null, msgs);
      if (newAdress != null)
        msgs = ((InternalEObject)newAdress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.INDIRECT_BRANCH__ADRESS, null, msgs);
      msgs = basicSetAdress(newAdress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.INDIRECT_BRANCH__ADRESS, newAdress, newAdress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabelList getLList()
  {
    return lList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLList(LabelList newLList, NotificationChain msgs)
  {
    LabelList oldLList = lList;
    lList = newLList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LLVMPackage.INDIRECT_BRANCH__LLIST, oldLList, newLList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLList(LabelList newLList)
  {
    if (newLList != lList)
    {
      NotificationChain msgs = null;
      if (lList != null)
        msgs = ((InternalEObject)lList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.INDIRECT_BRANCH__LLIST, null, msgs);
      if (newLList != null)
        msgs = ((InternalEObject)newLList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LLVMPackage.INDIRECT_BRANCH__LLIST, null, msgs);
      msgs = basicSetLList(newLList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LLVMPackage.INDIRECT_BRANCH__LLIST, newLList, newLList));
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
      case LLVMPackage.INDIRECT_BRANCH__ADRESS:
        return basicSetAdress(null, msgs);
      case LLVMPackage.INDIRECT_BRANCH__LLIST:
        return basicSetLList(null, msgs);
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
      case LLVMPackage.INDIRECT_BRANCH__ADRESS:
        return getAdress();
      case LLVMPackage.INDIRECT_BRANCH__LLIST:
        return getLList();
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
      case LLVMPackage.INDIRECT_BRANCH__ADRESS:
        setAdress((TypeAndValue)newValue);
        return;
      case LLVMPackage.INDIRECT_BRANCH__LLIST:
        setLList((LabelList)newValue);
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
      case LLVMPackage.INDIRECT_BRANCH__ADRESS:
        setAdress((TypeAndValue)null);
        return;
      case LLVMPackage.INDIRECT_BRANCH__LLIST:
        setLList((LabelList)null);
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
      case LLVMPackage.INDIRECT_BRANCH__ADRESS:
        return adress != null;
      case LLVMPackage.INDIRECT_BRANCH__LLIST:
        return lList != null;
    }
    return super.eIsSet(featureID);
  }

} //IndirectBranchImpl
