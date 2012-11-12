/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeAndValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.GetElementPtrImpl#getParams <em>Params</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GetElementPtrImpl extends InstructionImpl implements GetElementPtr
{
  /**
   * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer()
   * @generated
   * @ordered
   */
  protected EList<TypeAndValue> pointer;

  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<TypeAndValue> params;

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
  public EList<TypeAndValue> getPointer()
  {
    if (pointer == null)
    {
      pointer = new EObjectContainmentEList<TypeAndValue>(TypeAndValue.class, this, LlvmPackage.GET_ELEMENT_PTR__POINTER);
    }
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeAndValue> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<TypeAndValue>(TypeAndValue.class, this, LlvmPackage.GET_ELEMENT_PTR__PARAMS);
    }
    return params;
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
      case LlvmPackage.GET_ELEMENT_PTR__POINTER:
        return ((InternalEList<?>)getPointer()).basicRemove(otherEnd, msgs);
      case LlvmPackage.GET_ELEMENT_PTR__PARAMS:
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
      case LlvmPackage.GET_ELEMENT_PTR__POINTER:
        return getPointer();
      case LlvmPackage.GET_ELEMENT_PTR__PARAMS:
        return getParams();
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
      case LlvmPackage.GET_ELEMENT_PTR__POINTER:
        getPointer().clear();
        getPointer().addAll((Collection<? extends TypeAndValue>)newValue);
        return;
      case LlvmPackage.GET_ELEMENT_PTR__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends TypeAndValue>)newValue);
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
      case LlvmPackage.GET_ELEMENT_PTR__POINTER:
        getPointer().clear();
        return;
      case LlvmPackage.GET_ELEMENT_PTR__PARAMS:
        getParams().clear();
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
      case LlvmPackage.GET_ELEMENT_PTR__POINTER:
        return pointer != null && !pointer.isEmpty();
      case LlvmPackage.GET_ELEMENT_PTR__PARAMS:
        return params != null && !params.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GetElementPtrImpl
