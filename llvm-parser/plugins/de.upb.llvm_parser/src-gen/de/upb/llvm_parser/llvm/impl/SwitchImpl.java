/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.SwitchCase;

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
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getCaseValue <em>Case Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getDefaultCase <em>Default Case</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getCases <em>Cases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends InstructionImpl implements Switch
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
   * The default value of the '{@link #getDefaultCase() <em>Default Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultCase()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_CASE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefaultCase() <em>Default Case</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultCase()
   * @generated
   * @ordered
   */
  protected String defaultCase = DEFAULT_CASE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<SwitchCase> cases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchImpl()
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
    return LlvmPackage.Literals.SWITCH;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__CASE_VALUE, oldCaseValue, newCaseValue);
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
        msgs = ((InternalEObject)caseValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__CASE_VALUE, null, msgs);
      if (newCaseValue != null)
        msgs = ((InternalEObject)newCaseValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__CASE_VALUE, null, msgs);
      msgs = basicSetCaseValue(newCaseValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__CASE_VALUE, newCaseValue, newCaseValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefaultCase()
  {
    return defaultCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultCase(String newDefaultCase)
  {
    String oldDefaultCase = defaultCase;
    defaultCase = newDefaultCase;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULT_CASE, oldDefaultCase, defaultCase));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SwitchCase> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<SwitchCase>(SwitchCase.class, this, LlvmPackage.SWITCH__CASES);
    }
    return cases;
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
      case LlvmPackage.SWITCH__CASE_VALUE:
        return basicSetCaseValue(null, msgs);
      case LlvmPackage.SWITCH__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
      case LlvmPackage.SWITCH__CASE_VALUE:
        return getCaseValue();
      case LlvmPackage.SWITCH__DEFAULT_CASE:
        return getDefaultCase();
      case LlvmPackage.SWITCH__CASES:
        return getCases();
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
      case LlvmPackage.SWITCH__CASE_VALUE:
        setCaseValue((Parameter)newValue);
        return;
      case LlvmPackage.SWITCH__DEFAULT_CASE:
        setDefaultCase((String)newValue);
        return;
      case LlvmPackage.SWITCH__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends SwitchCase>)newValue);
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
      case LlvmPackage.SWITCH__CASE_VALUE:
        setCaseValue((Parameter)null);
        return;
      case LlvmPackage.SWITCH__DEFAULT_CASE:
        setDefaultCase(DEFAULT_CASE_EDEFAULT);
        return;
      case LlvmPackage.SWITCH__CASES:
        getCases().clear();
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
      case LlvmPackage.SWITCH__CASE_VALUE:
        return caseValue != null;
      case LlvmPackage.SWITCH__DEFAULT_CASE:
        return DEFAULT_CASE_EDEFAULT == null ? defaultCase != null : !DEFAULT_CASE_EDEFAULT.equals(defaultCase);
      case LlvmPackage.SWITCH__CASES:
        return cases != null && !cases.isEmpty();
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
    result.append(" (defaultCase: ");
    result.append(defaultCase);
    result.append(')');
    return result.toString();
  }

} //SwitchImpl
