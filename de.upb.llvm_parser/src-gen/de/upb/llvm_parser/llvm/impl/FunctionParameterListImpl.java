/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.FunctionParameter;
import de.upb.llvm_parser.llvm.FunctionParameterList;
import de.upb.llvm_parser.llvm.LlvmPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionParameterListImpl#getParams <em>Params</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionParameterListImpl#isIsNumberOfParametersUnknown <em>Is Number Of Parameters Unknown</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionParameterListImpl extends MinimalEObjectImpl.Container implements FunctionParameterList
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<FunctionParameter> params;

  /**
   * The default value of the '{@link #isIsNumberOfParametersUnknown() <em>Is Number Of Parameters Unknown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNumberOfParametersUnknown()
   * @generated
   * @ordered
   */
  protected static final boolean IS_NUMBER_OF_PARAMETERS_UNKNOWN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsNumberOfParametersUnknown() <em>Is Number Of Parameters Unknown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsNumberOfParametersUnknown()
   * @generated
   * @ordered
   */
  protected boolean isNumberOfParametersUnknown = IS_NUMBER_OF_PARAMETERS_UNKNOWN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionParameterListImpl()
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
    return LlvmPackage.Literals.FUNCTION_PARAMETER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FunctionParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<FunctionParameter>(FunctionParameter.class, this, LlvmPackage.FUNCTION_PARAMETER_LIST__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsNumberOfParametersUnknown()
  {
    return isNumberOfParametersUnknown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsNumberOfParametersUnknown(boolean newIsNumberOfParametersUnknown)
  {
    boolean oldIsNumberOfParametersUnknown = isNumberOfParametersUnknown;
    isNumberOfParametersUnknown = newIsNumberOfParametersUnknown;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_PARAMETER_LIST__IS_NUMBER_OF_PARAMETERS_UNKNOWN, oldIsNumberOfParametersUnknown, isNumberOfParametersUnknown));
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
      case LlvmPackage.FUNCTION_PARAMETER_LIST__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
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
      case LlvmPackage.FUNCTION_PARAMETER_LIST__PARAMS:
        return getParams();
      case LlvmPackage.FUNCTION_PARAMETER_LIST__IS_NUMBER_OF_PARAMETERS_UNKNOWN:
        return isIsNumberOfParametersUnknown();
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
      case LlvmPackage.FUNCTION_PARAMETER_LIST__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends FunctionParameter>)newValue);
        return;
      case LlvmPackage.FUNCTION_PARAMETER_LIST__IS_NUMBER_OF_PARAMETERS_UNKNOWN:
        setIsNumberOfParametersUnknown((Boolean)newValue);
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
      case LlvmPackage.FUNCTION_PARAMETER_LIST__PARAMS:
        getParams().clear();
        return;
      case LlvmPackage.FUNCTION_PARAMETER_LIST__IS_NUMBER_OF_PARAMETERS_UNKNOWN:
        setIsNumberOfParametersUnknown(IS_NUMBER_OF_PARAMETERS_UNKNOWN_EDEFAULT);
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
      case LlvmPackage.FUNCTION_PARAMETER_LIST__PARAMS:
        return params != null && !params.isEmpty();
      case LlvmPackage.FUNCTION_PARAMETER_LIST__IS_NUMBER_OF_PARAMETERS_UNKNOWN:
        return isNumberOfParametersUnknown != IS_NUMBER_OF_PARAMETERS_UNKNOWN_EDEFAULT;
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
    result.append(" (isNumberOfParametersUnknown: ");
    result.append(isNumberOfParametersUnknown);
    result.append(')');
    return result.toString();
  }

} //FunctionParameterListImpl
