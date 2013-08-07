/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.TypeList;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

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
 * An implementation of the model object '<em><b>Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ParameterListImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ParameterListImpl#getLists <em>Lists</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.ParameterListImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterListImpl extends MinimalEObjectImpl.Container implements ParameterList
{
  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<TypeUse> types;

  /**
   * The cached value of the '{@link #getLists() <em>Lists</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLists()
   * @generated
   * @ordered
   */
  protected EList<TypeList> lists;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Value> variables;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterListImpl()
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
    return LlvmPackage.Literals.PARAMETER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeUse> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<TypeUse>(TypeUse.class, this, LlvmPackage.PARAMETER_LIST__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeList> getLists()
  {
    if (lists == null)
    {
      lists = new EObjectContainmentEList<TypeList>(TypeList.class, this, LlvmPackage.PARAMETER_LIST__LISTS);
    }
    return lists;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Value>(Value.class, this, LlvmPackage.PARAMETER_LIST__VARIABLES);
    }
    return variables;
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
      case LlvmPackage.PARAMETER_LIST__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case LlvmPackage.PARAMETER_LIST__LISTS:
        return ((InternalEList<?>)getLists()).basicRemove(otherEnd, msgs);
      case LlvmPackage.PARAMETER_LIST__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
      case LlvmPackage.PARAMETER_LIST__TYPES:
        return getTypes();
      case LlvmPackage.PARAMETER_LIST__LISTS:
        return getLists();
      case LlvmPackage.PARAMETER_LIST__VARIABLES:
        return getVariables();
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
      case LlvmPackage.PARAMETER_LIST__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends TypeUse>)newValue);
        return;
      case LlvmPackage.PARAMETER_LIST__LISTS:
        getLists().clear();
        getLists().addAll((Collection<? extends TypeList>)newValue);
        return;
      case LlvmPackage.PARAMETER_LIST__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Value>)newValue);
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
      case LlvmPackage.PARAMETER_LIST__TYPES:
        getTypes().clear();
        return;
      case LlvmPackage.PARAMETER_LIST__LISTS:
        getLists().clear();
        return;
      case LlvmPackage.PARAMETER_LIST__VARIABLES:
        getVariables().clear();
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
      case LlvmPackage.PARAMETER_LIST__TYPES:
        return types != null && !types.isEmpty();
      case LlvmPackage.PARAMETER_LIST__LISTS:
        return lists != null && !lists.isEmpty();
      case LlvmPackage.PARAMETER_LIST__VARIABLES:
        return variables != null && !variables.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ParameterListImpl
