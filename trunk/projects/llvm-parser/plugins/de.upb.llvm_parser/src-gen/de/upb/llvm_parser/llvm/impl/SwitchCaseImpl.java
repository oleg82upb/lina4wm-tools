/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.SwitchCase;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchCaseImpl#getCaseValue <em>Case Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchCaseImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchCaseImpl extends MinimalEObjectImpl.Container implements SwitchCase
{
  /**
   * The cached value of the '{@link #getCaseValue() <em>Case Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseValue()
   * @generated
   * @ordered
   */
  protected Parameter caseValue;

  /**
   * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected static final String DESTINATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected String destination = DESTINATION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchCaseImpl()
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
    return LlvmPackage.Literals.SWITCH_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getCaseValue()
  {
    return caseValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseValue(Parameter newCaseValue, NotificationChain msgs)
  {
    Parameter oldCaseValue = caseValue;
    caseValue = newCaseValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH_CASE__CASE_VALUE, oldCaseValue, newCaseValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCaseValue(Parameter newCaseValue)
  {
    if (newCaseValue != caseValue)
    {
      NotificationChain msgs = null;
      if (caseValue != null)
        msgs = ((InternalEObject)caseValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH_CASE__CASE_VALUE, null, msgs);
      if (newCaseValue != null)
        msgs = ((InternalEObject)newCaseValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH_CASE__CASE_VALUE, null, msgs);
      msgs = basicSetCaseValue(newCaseValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH_CASE__CASE_VALUE, newCaseValue, newCaseValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(String newDestination)
  {
    String oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH_CASE__DESTINATION, oldDestination, destination));
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
      case LlvmPackage.SWITCH_CASE__CASE_VALUE:
        return basicSetCaseValue(null, msgs);
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
      case LlvmPackage.SWITCH_CASE__CASE_VALUE:
        return getCaseValue();
      case LlvmPackage.SWITCH_CASE__DESTINATION:
        return getDestination();
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
      case LlvmPackage.SWITCH_CASE__CASE_VALUE:
        setCaseValue((Parameter)newValue);
        return;
      case LlvmPackage.SWITCH_CASE__DESTINATION:
        setDestination((String)newValue);
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
      case LlvmPackage.SWITCH_CASE__CASE_VALUE:
        setCaseValue((Parameter)null);
        return;
      case LlvmPackage.SWITCH_CASE__DESTINATION:
        setDestination(DESTINATION_EDEFAULT);
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
      case LlvmPackage.SWITCH_CASE__CASE_VALUE:
        return caseValue != null;
      case LlvmPackage.SWITCH_CASE__DESTINATION:
        return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
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
    result.append(" (destination: ");
    result.append(destination);
    result.append(')');
    return result.toString();
  }

} //SwitchCaseImpl
