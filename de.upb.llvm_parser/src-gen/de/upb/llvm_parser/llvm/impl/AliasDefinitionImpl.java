/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AliasDefinition;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AliasDefinitionImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AliasDefinitionImpl#getAliastype <em>Aliastype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AliasDefinitionImpl#getAliasvalue <em>Aliasvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasDefinitionImpl extends MainLevelEntityImpl implements AliasDefinition
{
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
   * The cached value of the '{@link #getAliastype() <em>Aliastype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliastype()
   * @generated
   * @ordered
   */
  protected TypeUse aliastype;

  /**
   * The cached value of the '{@link #getAliasvalue() <em>Aliasvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliasvalue()
   * @generated
   * @ordered
   */
  protected Value aliasvalue;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AliasDefinitionImpl()
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
    return LlvmPackage.Literals.ALIAS_DEFINITION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ALIAS_DEFINITION__ADDRESS, oldAddress, newAddress);
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
        msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALIAS_DEFINITION__ADDRESS, null, msgs);
      if (newAddress != null)
        msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALIAS_DEFINITION__ADDRESS, null, msgs);
      msgs = basicSetAddress(newAddress, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALIAS_DEFINITION__ADDRESS, newAddress, newAddress));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getAliastype()
  {
    return aliastype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAliastype(TypeUse newAliastype, NotificationChain msgs)
  {
    TypeUse oldAliastype = aliastype;
    aliastype = newAliastype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ALIAS_DEFINITION__ALIASTYPE, oldAliastype, newAliastype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAliastype(TypeUse newAliastype)
  {
    if (newAliastype != aliastype)
    {
      NotificationChain msgs = null;
      if (aliastype != null)
        msgs = ((InternalEObject)aliastype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALIAS_DEFINITION__ALIASTYPE, null, msgs);
      if (newAliastype != null)
        msgs = ((InternalEObject)newAliastype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALIAS_DEFINITION__ALIASTYPE, null, msgs);
      msgs = basicSetAliastype(newAliastype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALIAS_DEFINITION__ALIASTYPE, newAliastype, newAliastype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getAliasvalue()
  {
    return aliasvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAliasvalue(Value newAliasvalue, NotificationChain msgs)
  {
    Value oldAliasvalue = aliasvalue;
    aliasvalue = newAliasvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.ALIAS_DEFINITION__ALIASVALUE, oldAliasvalue, newAliasvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAliasvalue(Value newAliasvalue)
  {
    if (newAliasvalue != aliasvalue)
    {
      NotificationChain msgs = null;
      if (aliasvalue != null)
        msgs = ((InternalEObject)aliasvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALIAS_DEFINITION__ALIASVALUE, null, msgs);
      if (newAliasvalue != null)
        msgs = ((InternalEObject)newAliasvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.ALIAS_DEFINITION__ALIASVALUE, null, msgs);
      msgs = basicSetAliasvalue(newAliasvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALIAS_DEFINITION__ALIASVALUE, newAliasvalue, newAliasvalue));
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
      case LlvmPackage.ALIAS_DEFINITION__ADDRESS:
        return basicSetAddress(null, msgs);
      case LlvmPackage.ALIAS_DEFINITION__ALIASTYPE:
        return basicSetAliastype(null, msgs);
      case LlvmPackage.ALIAS_DEFINITION__ALIASVALUE:
        return basicSetAliasvalue(null, msgs);
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
      case LlvmPackage.ALIAS_DEFINITION__ADDRESS:
        return getAddress();
      case LlvmPackage.ALIAS_DEFINITION__ALIASTYPE:
        return getAliastype();
      case LlvmPackage.ALIAS_DEFINITION__ALIASVALUE:
        return getAliasvalue();
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
      case LlvmPackage.ALIAS_DEFINITION__ADDRESS:
        setAddress((Address)newValue);
        return;
      case LlvmPackage.ALIAS_DEFINITION__ALIASTYPE:
        setAliastype((TypeUse)newValue);
        return;
      case LlvmPackage.ALIAS_DEFINITION__ALIASVALUE:
        setAliasvalue((Value)newValue);
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
      case LlvmPackage.ALIAS_DEFINITION__ADDRESS:
        setAddress((Address)null);
        return;
      case LlvmPackage.ALIAS_DEFINITION__ALIASTYPE:
        setAliastype((TypeUse)null);
        return;
      case LlvmPackage.ALIAS_DEFINITION__ALIASVALUE:
        setAliasvalue((Value)null);
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
      case LlvmPackage.ALIAS_DEFINITION__ADDRESS:
        return address != null;
      case LlvmPackage.ALIAS_DEFINITION__ALIASTYPE:
        return aliastype != null;
      case LlvmPackage.ALIAS_DEFINITION__ALIASVALUE:
        return aliasvalue != null;
    }
    return super.eIsSet(featureID);
  }

} //AliasDefinitionImpl
