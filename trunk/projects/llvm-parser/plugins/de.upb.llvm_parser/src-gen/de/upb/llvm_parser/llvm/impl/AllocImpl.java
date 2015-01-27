/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.TypeUse;

import java.math.BigDecimal;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alloc</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getNumOfElements <em>Num Of Elements</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AllocImpl#getAlign <em>Align</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocImpl extends InstructionImpl implements Alloc
{
  /**
   * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResult()
   * @generated
   * @ordered
   */
  protected Address result;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected TypeUse type;

  /**
   * The cached value of the '{@link #getNumOfElements() <em>Num Of Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNumOfElements()
   * @generated
   * @ordered
   */
  protected Parameter numOfElements;

  /**
   * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlign()
   * @generated
   * @ordered
   */
  protected static final BigDecimal ALIGN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlign()
   * @generated
   * @ordered
   */
  protected BigDecimal align = ALIGN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AllocImpl()
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
    return LlvmPackage.Literals.ALLOC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Address getResult()
  {
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetResult(Address newResult, NotificationChain msgs)
  {
    Address oldResult = result;
    result = newResult;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__RESULT, oldResult, newResult);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setResult(Address newResult)
  {
    if (newResult != result)
    {
      NotificationChain msgs = null;
      if (result != null)
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(TypeUse newType, NotificationChain msgs)
  {
    TypeUse oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(TypeUse newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getNumOfElements()
  {
    return numOfElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNumOfElements(Parameter newNumOfElements, NotificationChain msgs)
  {
    Parameter oldNumOfElements = numOfElements;
    numOfElements = newNumOfElements;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__NUM_OF_ELEMENTS, oldNumOfElements, newNumOfElements);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNumOfElements(Parameter newNumOfElements)
  {
    if (newNumOfElements != numOfElements)
    {
      NotificationChain msgs = null;
      if (numOfElements != null)
        msgs = ((InternalEObject)numOfElements).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__NUM_OF_ELEMENTS, null, msgs);
      if (newNumOfElements != null)
        msgs = ((InternalEObject)newNumOfElements).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALLOC__NUM_OF_ELEMENTS, null, msgs);
      msgs = basicSetNumOfElements(newNumOfElements, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__NUM_OF_ELEMENTS, newNumOfElements, newNumOfElements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getAlign()
  {
    return align;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlign(BigDecimal newAlign)
  {
    BigDecimal oldAlign = align;
    align = newAlign;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALLOC__ALIGN, oldAlign, align));
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
      case LlvmPackage.ALLOC__RESULT:
        return basicSetResult(null, msgs);
      case LlvmPackage.ALLOC__TYPE:
        return basicSetType(null, msgs);
      case LlvmPackage.ALLOC__NUM_OF_ELEMENTS:
        return basicSetNumOfElements(null, msgs);
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
      case LlvmPackage.ALLOC__RESULT:
        return getResult();
      case LlvmPackage.ALLOC__TYPE:
        return getType();
      case LlvmPackage.ALLOC__NUM_OF_ELEMENTS:
        return getNumOfElements();
      case LlvmPackage.ALLOC__ALIGN:
        return getAlign();
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
      case LlvmPackage.ALLOC__RESULT:
        setResult((Address)newValue);
        return;
      case LlvmPackage.ALLOC__TYPE:
        setType((TypeUse)newValue);
        return;
      case LlvmPackage.ALLOC__NUM_OF_ELEMENTS:
        setNumOfElements((Parameter)newValue);
        return;
      case LlvmPackage.ALLOC__ALIGN:
        setAlign((BigDecimal)newValue);
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
      case LlvmPackage.ALLOC__RESULT:
        setResult((Address)null);
        return;
      case LlvmPackage.ALLOC__TYPE:
        setType((TypeUse)null);
        return;
      case LlvmPackage.ALLOC__NUM_OF_ELEMENTS:
        setNumOfElements((Parameter)null);
        return;
      case LlvmPackage.ALLOC__ALIGN:
        setAlign(ALIGN_EDEFAULT);
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
      case LlvmPackage.ALLOC__RESULT:
        return result != null;
      case LlvmPackage.ALLOC__TYPE:
        return type != null;
      case LlvmPackage.ALLOC__NUM_OF_ELEMENTS:
        return numOfElements != null;
      case LlvmPackage.ALLOC__ALIGN:
        return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
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
    result.append(" (align: ");
    result.append(align);
    result.append(')');
    return result.toString();
  }

} //AllocImpl
