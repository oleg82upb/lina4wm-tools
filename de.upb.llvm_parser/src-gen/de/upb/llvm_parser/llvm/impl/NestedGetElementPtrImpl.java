/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.Parameter;

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
 * An implementation of the model object '<em><b>Nested Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.NestedGetElementPtrImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.NestedGetElementPtrImpl#getIndices <em>Indices</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NestedGetElementPtrImpl extends ValueImpl implements NestedGetElementPtr
{
  /**
   * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregate()
   * @generated
   * @ordered
   */
  protected Parameter aggregate;

  /**
   * The cached value of the '{@link #getIndices() <em>Indices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndices()
   * @generated
   * @ordered
   */
  protected EList<Parameter> indices;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NestedGetElementPtrImpl()
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
    return LlvmPackage.Literals.NESTED_GET_ELEMENT_PTR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter getAggregate()
  {
    return aggregate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAggregate(Parameter newAggregate, NotificationChain msgs)
  {
    Parameter oldAggregate = aggregate;
    aggregate = newAggregate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.NESTED_GET_ELEMENT_PTR__AGGREGATE, oldAggregate, newAggregate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregate(Parameter newAggregate)
  {
    if (newAggregate != aggregate)
    {
      NotificationChain msgs = null;
      if (aggregate != null)
        msgs = ((InternalEObject)aggregate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NESTED_GET_ELEMENT_PTR__AGGREGATE, null, msgs);
      if (newAggregate != null)
        msgs = ((InternalEObject)newAggregate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NESTED_GET_ELEMENT_PTR__AGGREGATE, null, msgs);
      msgs = basicSetAggregate(newAggregate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.NESTED_GET_ELEMENT_PTR__AGGREGATE, newAggregate, newAggregate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getIndices()
  {
    if (indices == null)
    {
      indices = new EObjectContainmentEList<Parameter>(Parameter.class, this, LlvmPackage.NESTED_GET_ELEMENT_PTR__INDICES);
    }
    return indices;
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
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__AGGREGATE:
        return basicSetAggregate(null, msgs);
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__INDICES:
        return ((InternalEList<?>)getIndices()).basicRemove(otherEnd, msgs);
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
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__AGGREGATE:
        return getAggregate();
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__INDICES:
        return getIndices();
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
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__AGGREGATE:
        setAggregate((Parameter)newValue);
        return;
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__INDICES:
        getIndices().clear();
        getIndices().addAll((Collection<? extends Parameter>)newValue);
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
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__AGGREGATE:
        setAggregate((Parameter)null);
        return;
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__INDICES:
        getIndices().clear();
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
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__AGGREGATE:
        return aggregate != null;
      case LlvmPackage.NESTED_GET_ELEMENT_PTR__INDICES:
        return indices != null && !indices.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NestedGetElementPtrImpl
