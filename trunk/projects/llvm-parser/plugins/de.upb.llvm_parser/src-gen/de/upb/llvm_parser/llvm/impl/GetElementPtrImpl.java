/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

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
 * An implementation of the model object '<em><b>Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getAggerate <em>Aggerate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getIndTypes <em>Ind Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getIndizies <em>Indizies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetElementPtrImpl extends InstructionImpl implements GetElementPtr
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
   * The cached value of the '{@link #getAggerate() <em>Aggerate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggerate()
   * @generated
   * @ordered
   */
  protected Parameter aggerate;

  /**
   * The cached value of the '{@link #getIndTypes() <em>Ind Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndTypes()
   * @generated
   * @ordered
   */
  protected EList<TypeUse> indTypes;

  /**
   * The cached value of the '{@link #getIndizies() <em>Indizies</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndizies()
   * @generated
   * @ordered
   */
  protected EList<Value> indizies;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GetElementPtrImpl()
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
    return LlvmPackage.Literals.GET_ELEMENT_PTR;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__RESULT, oldResult, newResult);
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
        msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__RESULT, null, msgs);
      if (newResult != null)
        msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__RESULT, null, msgs);
      msgs = basicSetResult(newResult, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__RESULT, newResult, newResult));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getAggerate()
  {
    return aggerate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAggerate(Parameter newAggerate, NotificationChain msgs)
  {
    Parameter oldAggerate = aggerate;
    aggerate = newAggerate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__AGGERATE, oldAggerate, newAggerate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggerate(Parameter newAggerate)
  {
    if (newAggerate != aggerate)
    {
      NotificationChain msgs = null;
      if (aggerate != null)
        msgs = ((InternalEObject)aggerate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__AGGERATE, null, msgs);
      if (newAggerate != null)
        msgs = ((InternalEObject)newAggerate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.GET_ELEMENT_PTR__AGGERATE, null, msgs);
      msgs = basicSetAggerate(newAggerate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.GET_ELEMENT_PTR__AGGERATE, newAggerate, newAggerate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeUse> getIndTypes()
  {
    if (indTypes == null)
    {
      indTypes = new EObjectContainmentEList<TypeUse>(TypeUse.class, this, LlvmPackage.GET_ELEMENT_PTR__IND_TYPES);
    }
    return indTypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getIndizies()
  {
    if (indizies == null)
    {
      indizies = new EObjectContainmentEList<Value>(Value.class, this, LlvmPackage.GET_ELEMENT_PTR__INDIZIES);
    }
    return indizies;
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
      case LlvmPackage.GET_ELEMENT_PTR__RESULT:
        return basicSetResult(null, msgs);
      case LlvmPackage.GET_ELEMENT_PTR__AGGERATE:
        return basicSetAggerate(null, msgs);
      case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
        return ((InternalEList<?>)getIndTypes()).basicRemove(otherEnd, msgs);
      case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
        return ((InternalEList<?>)getIndizies()).basicRemove(otherEnd, msgs);
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
      case LlvmPackage.GET_ELEMENT_PTR__RESULT:
        return getResult();
      case LlvmPackage.GET_ELEMENT_PTR__AGGERATE:
        return getAggerate();
      case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
        return getIndTypes();
      case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
        return getIndizies();
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
      case LlvmPackage.GET_ELEMENT_PTR__RESULT:
        setResult((Address)newValue);
        return;
      case LlvmPackage.GET_ELEMENT_PTR__AGGERATE:
        setAggerate((Parameter)newValue);
        return;
      case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
        getIndTypes().clear();
        getIndTypes().addAll((Collection<? extends TypeUse>)newValue);
        return;
      case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
        getIndizies().clear();
        getIndizies().addAll((Collection<? extends Value>)newValue);
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
      case LlvmPackage.GET_ELEMENT_PTR__RESULT:
        setResult((Address)null);
        return;
      case LlvmPackage.GET_ELEMENT_PTR__AGGERATE:
        setAggerate((Parameter)null);
        return;
      case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
        getIndTypes().clear();
        return;
      case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
        getIndizies().clear();
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
      case LlvmPackage.GET_ELEMENT_PTR__RESULT:
        return result != null;
      case LlvmPackage.GET_ELEMENT_PTR__AGGERATE:
        return aggerate != null;
      case LlvmPackage.GET_ELEMENT_PTR__IND_TYPES:
        return indTypes != null && !indTypes.isEmpty();
      case LlvmPackage.GET_ELEMENT_PTR__INDIZIES:
        return indizies != null && !indizies.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GetElementPtrImpl
