/**
 */
package de.upb.llvm_parser.lLVM.impl;

import de.upb.llvm_parser.lLVM.JumpTable;
import de.upb.llvm_parser.lLVM.LLVMPackage;
import de.upb.llvm_parser.lLVM.TypeAndValue;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jump Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.JumpTableImpl#getValues <em>Values</em>}</li>
 *   <li>{@link de.upb.llvm_parser.lLVM.impl.JumpTableImpl#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JumpTableImpl extends MinimalEObjectImpl.Container implements JumpTable
{
  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected EList<TypeAndValue> values;

  /**
   * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinations()
   * @generated
   * @ordered
   */
  protected EList<TypeAndValue> destinations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JumpTableImpl()
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
    return LLVMPackage.Literals.JUMP_TABLE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeAndValue> getValues()
  {
    if (values == null)
    {
      values = new EObjectContainmentEList<TypeAndValue>(TypeAndValue.class, this, LLVMPackage.JUMP_TABLE__VALUES);
    }
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeAndValue> getDestinations()
  {
    if (destinations == null)
    {
      destinations = new EObjectContainmentEList<TypeAndValue>(TypeAndValue.class, this, LLVMPackage.JUMP_TABLE__DESTINATIONS);
    }
    return destinations;
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
      case LLVMPackage.JUMP_TABLE__VALUES:
        return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
      case LLVMPackage.JUMP_TABLE__DESTINATIONS:
        return ((InternalEList<?>)getDestinations()).basicRemove(otherEnd, msgs);
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
      case LLVMPackage.JUMP_TABLE__VALUES:
        return getValues();
      case LLVMPackage.JUMP_TABLE__DESTINATIONS:
        return getDestinations();
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
      case LLVMPackage.JUMP_TABLE__VALUES:
        getValues().clear();
        getValues().addAll((Collection<? extends TypeAndValue>)newValue);
        return;
      case LLVMPackage.JUMP_TABLE__DESTINATIONS:
        getDestinations().clear();
        getDestinations().addAll((Collection<? extends TypeAndValue>)newValue);
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
      case LLVMPackage.JUMP_TABLE__VALUES:
        getValues().clear();
        return;
      case LLVMPackage.JUMP_TABLE__DESTINATIONS:
        getDestinations().clear();
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
      case LLVMPackage.JUMP_TABLE__VALUES:
        return values != null && !values.isEmpty();
      case LLVMPackage.JUMP_TABLE__DESTINATIONS:
        return destinations != null && !destinations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //JumpTableImpl
