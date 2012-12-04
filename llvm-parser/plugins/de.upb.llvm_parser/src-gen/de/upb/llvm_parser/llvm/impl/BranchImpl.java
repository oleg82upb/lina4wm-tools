/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeAndValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getCond <em>Cond</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getLabelTrue <em>Label True</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getLabelFalse <em>Label False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends Ret_InstrImpl implements Branch
{
  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected TypeAndValue destination;

  /**
   * The cached value of the '{@link #getCond() <em>Cond</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCond()
   * @generated
   * @ordered
   */
  protected TypeAndValue cond;

  /**
   * The cached value of the '{@link #getLabelTrue() <em>Label True</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelTrue()
   * @generated
   * @ordered
   */
  protected TypeAndValue labelTrue;

  /**
   * The cached value of the '{@link #getLabelFalse() <em>Label False</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabelFalse()
   * @generated
   * @ordered
   */
  protected TypeAndValue labelFalse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BranchImpl()
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
    return LlvmPackage.Literals.BRANCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestination(TypeAndValue newDestination, NotificationChain msgs)
  {
    TypeAndValue oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__DESTINATION, oldDestination, newDestination);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(TypeAndValue newDestination)
  {
    if (newDestination != destination)
    {
      NotificationChain msgs = null;
      if (destination != null)
        msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__DESTINATION, null, msgs);
      if (newDestination != null)
        msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__DESTINATION, null, msgs);
      msgs = basicSetDestination(newDestination, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__DESTINATION, newDestination, newDestination));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getCond()
  {
    return cond;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCond(TypeAndValue newCond, NotificationChain msgs)
  {
    TypeAndValue oldCond = cond;
    cond = newCond;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__COND, oldCond, newCond);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCond(TypeAndValue newCond)
  {
    if (newCond != cond)
    {
      NotificationChain msgs = null;
      if (cond != null)
        msgs = ((InternalEObject)cond).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__COND, null, msgs);
      if (newCond != null)
        msgs = ((InternalEObject)newCond).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__COND, null, msgs);
      msgs = basicSetCond(newCond, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__COND, newCond, newCond));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getLabelTrue()
  {
    return labelTrue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabelTrue(TypeAndValue newLabelTrue, NotificationChain msgs)
  {
    TypeAndValue oldLabelTrue = labelTrue;
    labelTrue = newLabelTrue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_TRUE, oldLabelTrue, newLabelTrue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelTrue(TypeAndValue newLabelTrue)
  {
    if (newLabelTrue != labelTrue)
    {
      NotificationChain msgs = null;
      if (labelTrue != null)
        msgs = ((InternalEObject)labelTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_TRUE, null, msgs);
      if (newLabelTrue != null)
        msgs = ((InternalEObject)newLabelTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_TRUE, null, msgs);
      msgs = basicSetLabelTrue(newLabelTrue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_TRUE, newLabelTrue, newLabelTrue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getLabelFalse()
  {
    return labelFalse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabelFalse(TypeAndValue newLabelFalse, NotificationChain msgs)
  {
    TypeAndValue oldLabelFalse = labelFalse;
    labelFalse = newLabelFalse;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_FALSE, oldLabelFalse, newLabelFalse);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabelFalse(TypeAndValue newLabelFalse)
  {
    if (newLabelFalse != labelFalse)
    {
      NotificationChain msgs = null;
      if (labelFalse != null)
        msgs = ((InternalEObject)labelFalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_FALSE, null, msgs);
      if (newLabelFalse != null)
        msgs = ((InternalEObject)newLabelFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_FALSE, null, msgs);
      msgs = basicSetLabelFalse(newLabelFalse, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_FALSE, newLabelFalse, newLabelFalse));
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
      case LlvmPackage.BRANCH__DESTINATION:
        return basicSetDestination(null, msgs);
      case LlvmPackage.BRANCH__COND:
        return basicSetCond(null, msgs);
      case LlvmPackage.BRANCH__LABEL_TRUE:
        return basicSetLabelTrue(null, msgs);
      case LlvmPackage.BRANCH__LABEL_FALSE:
        return basicSetLabelFalse(null, msgs);
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
      case LlvmPackage.BRANCH__DESTINATION:
        return getDestination();
      case LlvmPackage.BRANCH__COND:
        return getCond();
      case LlvmPackage.BRANCH__LABEL_TRUE:
        return getLabelTrue();
      case LlvmPackage.BRANCH__LABEL_FALSE:
        return getLabelFalse();
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
      case LlvmPackage.BRANCH__DESTINATION:
        setDestination((TypeAndValue)newValue);
        return;
      case LlvmPackage.BRANCH__COND:
        setCond((TypeAndValue)newValue);
        return;
      case LlvmPackage.BRANCH__LABEL_TRUE:
        setLabelTrue((TypeAndValue)newValue);
        return;
      case LlvmPackage.BRANCH__LABEL_FALSE:
        setLabelFalse((TypeAndValue)newValue);
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
      case LlvmPackage.BRANCH__DESTINATION:
        setDestination((TypeAndValue)null);
        return;
      case LlvmPackage.BRANCH__COND:
        setCond((TypeAndValue)null);
        return;
      case LlvmPackage.BRANCH__LABEL_TRUE:
        setLabelTrue((TypeAndValue)null);
        return;
      case LlvmPackage.BRANCH__LABEL_FALSE:
        setLabelFalse((TypeAndValue)null);
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
      case LlvmPackage.BRANCH__DESTINATION:
        return destination != null;
      case LlvmPackage.BRANCH__COND:
        return cond != null;
      case LlvmPackage.BRANCH__LABEL_TRUE:
        return labelTrue != null;
      case LlvmPackage.BRANCH__LABEL_FALSE:
        return labelFalse != null;
    }
    return super.eIsSet(featureID);
  }

} //BranchImpl
