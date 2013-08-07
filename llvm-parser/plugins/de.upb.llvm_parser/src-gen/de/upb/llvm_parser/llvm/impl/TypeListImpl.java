/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeList;
import de.upb.llvm_parser.llvm.TypeUse;

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
 * An implementation of the model object '<em><b>Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.TypeListImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.TypeListImpl#getTypelists <em>Typelists</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeListImpl extends MinimalEObjectImpl.Container implements TypeList
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
   * The cached value of the '{@link #getTypelists() <em>Typelists</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypelists()
   * @generated
   * @ordered
   */
  protected EList<TypeList> typelists;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeListImpl()
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
    return LlvmPackage.Literals.TYPE_LIST;
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
      types = new EObjectContainmentEList<TypeUse>(TypeUse.class, this, LlvmPackage.TYPE_LIST__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeList> getTypelists()
  {
    if (typelists == null)
    {
      typelists = new EObjectContainmentEList<TypeList>(TypeList.class, this, LlvmPackage.TYPE_LIST__TYPELISTS);
    }
    return typelists;
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
      case LlvmPackage.TYPE_LIST__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case LlvmPackage.TYPE_LIST__TYPELISTS:
        return ((InternalEList<?>)getTypelists()).basicRemove(otherEnd, msgs);
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
      case LlvmPackage.TYPE_LIST__TYPES:
        return getTypes();
      case LlvmPackage.TYPE_LIST__TYPELISTS:
        return getTypelists();
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
      case LlvmPackage.TYPE_LIST__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends TypeUse>)newValue);
        return;
      case LlvmPackage.TYPE_LIST__TYPELISTS:
        getTypelists().clear();
        getTypelists().addAll((Collection<? extends TypeList>)newValue);
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
      case LlvmPackage.TYPE_LIST__TYPES:
        getTypes().clear();
        return;
      case LlvmPackage.TYPE_LIST__TYPELISTS:
        getTypelists().clear();
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
      case LlvmPackage.TYPE_LIST__TYPES:
        return types != null && !types.isEmpty();
      case LlvmPackage.TYPE_LIST__TYPELISTS:
        return typelists != null && !typelists.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TypeListImpl
