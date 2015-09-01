/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.FunctionParameterList;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeUse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getReturnAttribute <em>Return Attribute</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.FunctionDefinitionImpl#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends MainLevelEntityImpl implements FunctionDefinition
{
  /**
   * The default value of the '{@link #getReturnAttribute() <em>Return Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnAttribute()
   * @generated
   * @ordered
   */
  protected static final String RETURN_ATTRIBUTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReturnAttribute() <em>Return Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnAttribute()
   * @generated
   * @ordered
   */
  protected String returnAttribute = RETURN_ATTRIBUTE_EDEFAULT;

  /**
   * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturnType()
   * @generated
   * @ordered
   */
  protected TypeUse returnType;

  /**
   * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddress()
   * @generated
   * @ordered
   */
  protected Address address;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected FunctionParameterList parameter;

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
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected FunctionBody body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FunctionDefinitionImpl()
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
    return LlvmPackage.Literals.FUNCTION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReturnAttribute()
  {
    return returnAttribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnAttribute(String newReturnAttribute)
  {
    String oldReturnAttribute = returnAttribute;
    returnAttribute = newReturnAttribute;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__RETURN_ATTRIBUTE, oldReturnAttribute, returnAttribute));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getReturnType()
  {
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturnType(TypeUse newReturnType, NotificationChain msgs)
  {
    TypeUse oldReturnType = returnType;
    returnType = newReturnType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE, oldReturnType, newReturnType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnType(TypeUse newReturnType)
  {
    if (newReturnType != returnType)
    {
      NotificationChain msgs = null;
      if (returnType != null)
        msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
      if (newReturnType != null)
        msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE, null, msgs);
      msgs = basicSetReturnType(newReturnType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE, newReturnType, newReturnType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Address getAddress()
  {
    return address;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddress(Address newAddress, NotificationChain msgs)
  {
    Address oldAddress = address;
    address = newAddress;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__ADDRESS, oldAddress, newAddress);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddress(Address newAddress)
  {
    if (newAddress != address)
    {
      NotificationChain msgs = null;
      if (address != null)
        msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__ADDRESS, null, msgs);
      if (newAddress != null)
        msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__ADDRESS, null, msgs);
      msgs = basicSetAddress(newAddress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__ADDRESS, newAddress, newAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionParameterList getParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameter(FunctionParameterList newParameter, NotificationChain msgs)
  {
    FunctionParameterList oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__PARAMETER, oldParameter, newParameter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameter(FunctionParameterList newParameter)
  {
    if (newParameter != parameter)
    {
      NotificationChain msgs = null;
      if (parameter != null)
        msgs = ((InternalEObject)parameter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__PARAMETER, null, msgs);
      if (newParameter != null)
        msgs = ((InternalEObject)newParameter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__PARAMETER, null, msgs);
      msgs = basicSetParameter(newParameter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__PARAMETER, newParameter, newParameter));
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
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__ALIGN, oldAlign, align));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FunctionBody getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(FunctionBody newBody, NotificationChain msgs)
  {
    FunctionBody oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(FunctionBody newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.FUNCTION_DEFINITION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.FUNCTION_DEFINITION__BODY, newBody, newBody));
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
      case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        return basicSetReturnType(null, msgs);
      case LlvmPackage.FUNCTION_DEFINITION__ADDRESS:
        return basicSetAddress(null, msgs);
      case LlvmPackage.FUNCTION_DEFINITION__PARAMETER:
        return basicSetParameter(null, msgs);
      case LlvmPackage.FUNCTION_DEFINITION__BODY:
        return basicSetBody(null, msgs);
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
      case LlvmPackage.FUNCTION_DEFINITION__RETURN_ATTRIBUTE:
        return getReturnAttribute();
      case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        return getReturnType();
      case LlvmPackage.FUNCTION_DEFINITION__ADDRESS:
        return getAddress();
      case LlvmPackage.FUNCTION_DEFINITION__PARAMETER:
        return getParameter();
      case LlvmPackage.FUNCTION_DEFINITION__ALIGN:
        return getAlign();
      case LlvmPackage.FUNCTION_DEFINITION__BODY:
        return getBody();
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
      case LlvmPackage.FUNCTION_DEFINITION__RETURN_ATTRIBUTE:
        setReturnAttribute((String)newValue);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        setReturnType((TypeUse)newValue);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__ADDRESS:
        setAddress((Address)newValue);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__PARAMETER:
        setParameter((FunctionParameterList)newValue);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__ALIGN:
        setAlign((Integer)newValue);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__BODY:
        setBody((FunctionBody)newValue);
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
      case LlvmPackage.FUNCTION_DEFINITION__RETURN_ATTRIBUTE:
        setReturnAttribute(RETURN_ATTRIBUTE_EDEFAULT);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        setReturnType((TypeUse)null);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__ADDRESS:
        setAddress((Address)null);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__PARAMETER:
        setParameter((FunctionParameterList)null);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__ALIGN:
        setAlign(ALIGN_EDEFAULT);
        return;
      case LlvmPackage.FUNCTION_DEFINITION__BODY:
        setBody((FunctionBody)null);
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
      case LlvmPackage.FUNCTION_DEFINITION__RETURN_ATTRIBUTE:
        return RETURN_ATTRIBUTE_EDEFAULT == null ? returnAttribute != null : !RETURN_ATTRIBUTE_EDEFAULT.equals(returnAttribute);
      case LlvmPackage.FUNCTION_DEFINITION__RETURN_TYPE:
        return returnType != null;
      case LlvmPackage.FUNCTION_DEFINITION__ADDRESS:
        return address != null;
      case LlvmPackage.FUNCTION_DEFINITION__PARAMETER:
        return parameter != null;
      case LlvmPackage.FUNCTION_DEFINITION__ALIGN:
        return align != ALIGN_EDEFAULT;
      case LlvmPackage.FUNCTION_DEFINITION__BODY:
        return body != null;
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
    result.append(" (returnAttribute: ");
    result.append(returnAttribute);
    result.append(", align: ");
    result.append(align);
    result.append(')');
    return result.toString();
  }

} //FunctionDefinitionImpl
