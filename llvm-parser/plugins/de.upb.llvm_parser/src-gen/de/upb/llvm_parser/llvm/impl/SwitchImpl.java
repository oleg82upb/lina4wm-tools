/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Switch;
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
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getComptype <em>Comptype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getCompvalue <em>Compvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getDefaulttype <em>Defaulttype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getDefaultvalue <em>Defaultvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getJtypes <em>Jtypes</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getJvalues <em>Jvalues</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getDestinationtypes <em>Destinationtypes</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.SwitchImpl#getDestinations <em>Destinations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SwitchImpl extends ReturnInstructionImpl implements Switch
{
  /**
   * The cached value of the '{@link #getComptype() <em>Comptype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComptype()
   * @generated
   * @ordered
   */
  protected TypeUse comptype;

  /**
   * The cached value of the '{@link #getCompvalue() <em>Compvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompvalue()
   * @generated
   * @ordered
   */
  protected Value compvalue;

  /**
   * The cached value of the '{@link #getDefaulttype() <em>Defaulttype</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaulttype()
   * @generated
   * @ordered
   */
  protected TypeUse defaulttype;

  /**
   * The cached value of the '{@link #getDefaultvalue() <em>Defaultvalue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefaultvalue()
   * @generated
   * @ordered
   */
  protected Value defaultvalue;

  /**
   * The cached value of the '{@link #getJtypes() <em>Jtypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJtypes()
   * @generated
   * @ordered
   */
  protected EList<TypeUse> jtypes;

  /**
   * The cached value of the '{@link #getJvalues() <em>Jvalues</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJvalues()
   * @generated
   * @ordered
   */
  protected EList<Value> jvalues;

  /**
   * The cached value of the '{@link #getDestinationtypes() <em>Destinationtypes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinationtypes()
   * @generated
   * @ordered
   */
  protected EList<TypeUse> destinationtypes;

  /**
   * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestinations()
   * @generated
   * @ordered
   */
  protected EList<Value> destinations;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchImpl()
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
    return LlvmPackage.Literals.SWITCH;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getComptype()
  {
    return comptype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComptype(TypeUse newComptype, NotificationChain msgs)
  {
    TypeUse oldComptype = comptype;
    comptype = newComptype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPTYPE, oldComptype, newComptype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComptype(TypeUse newComptype)
  {
    if (newComptype != comptype)
    {
      NotificationChain msgs = null;
      if (comptype != null)
        msgs = ((InternalEObject)comptype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__COMPTYPE, null, msgs);
      if (newComptype != null)
        msgs = ((InternalEObject)newComptype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__COMPTYPE, null, msgs);
      msgs = basicSetComptype(newComptype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPTYPE, newComptype, newComptype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getCompvalue()
  {
    return compvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompvalue(Value newCompvalue, NotificationChain msgs)
  {
    Value oldCompvalue = compvalue;
    compvalue = newCompvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPVALUE, oldCompvalue, newCompvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompvalue(Value newCompvalue)
  {
    if (newCompvalue != compvalue)
    {
      NotificationChain msgs = null;
      if (compvalue != null)
        msgs = ((InternalEObject)compvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__COMPVALUE, null, msgs);
      if (newCompvalue != null)
        msgs = ((InternalEObject)newCompvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__COMPVALUE, null, msgs);
      msgs = basicSetCompvalue(newCompvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__COMPVALUE, newCompvalue, newCompvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeUse getDefaulttype()
  {
    return defaulttype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaulttype(TypeUse newDefaulttype, NotificationChain msgs)
  {
    TypeUse oldDefaulttype = defaulttype;
    defaulttype = newDefaulttype;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTTYPE, oldDefaulttype, newDefaulttype);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaulttype(TypeUse newDefaulttype)
  {
    if (newDefaulttype != defaulttype)
    {
      NotificationChain msgs = null;
      if (defaulttype != null)
        msgs = ((InternalEObject)defaulttype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__DEFAULTTYPE, null, msgs);
      if (newDefaulttype != null)
        msgs = ((InternalEObject)newDefaulttype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__DEFAULTTYPE, null, msgs);
      msgs = basicSetDefaulttype(newDefaulttype, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTTYPE, newDefaulttype, newDefaulttype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Value getDefaultvalue()
  {
    return defaultvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefaultvalue(Value newDefaultvalue, NotificationChain msgs)
  {
    Value oldDefaultvalue = defaultvalue;
    defaultvalue = newDefaultvalue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTVALUE, oldDefaultvalue, newDefaultvalue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefaultvalue(Value newDefaultvalue)
  {
    if (newDefaultvalue != defaultvalue)
    {
      NotificationChain msgs = null;
      if (defaultvalue != null)
        msgs = ((InternalEObject)defaultvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__DEFAULTVALUE, null, msgs);
      if (newDefaultvalue != null)
        msgs = ((InternalEObject)newDefaultvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.SWITCH__DEFAULTVALUE, null, msgs);
      msgs = basicSetDefaultvalue(newDefaultvalue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.SWITCH__DEFAULTVALUE, newDefaultvalue, newDefaultvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeUse> getJtypes()
  {
    if (jtypes == null)
    {
      jtypes = new EObjectContainmentEList<TypeUse>(TypeUse.class, this, LlvmPackage.SWITCH__JTYPES);
    }
    return jtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getJvalues()
  {
    if (jvalues == null)
    {
      jvalues = new EObjectContainmentEList<Value>(Value.class, this, LlvmPackage.SWITCH__JVALUES);
    }
    return jvalues;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeUse> getDestinationtypes()
  {
    if (destinationtypes == null)
    {
      destinationtypes = new EObjectContainmentEList<TypeUse>(TypeUse.class, this, LlvmPackage.SWITCH__DESTINATIONTYPES);
    }
    return destinationtypes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Value> getDestinations()
  {
    if (destinations == null)
    {
      destinations = new EObjectContainmentEList<Value>(Value.class, this, LlvmPackage.SWITCH__DESTINATIONS);
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
      case LlvmPackage.SWITCH__COMPTYPE:
        return basicSetComptype(null, msgs);
      case LlvmPackage.SWITCH__COMPVALUE:
        return basicSetCompvalue(null, msgs);
      case LlvmPackage.SWITCH__DEFAULTTYPE:
        return basicSetDefaulttype(null, msgs);
      case LlvmPackage.SWITCH__DEFAULTVALUE:
        return basicSetDefaultvalue(null, msgs);
      case LlvmPackage.SWITCH__JTYPES:
        return ((InternalEList<?>)getJtypes()).basicRemove(otherEnd, msgs);
      case LlvmPackage.SWITCH__JVALUES:
        return ((InternalEList<?>)getJvalues()).basicRemove(otherEnd, msgs);
      case LlvmPackage.SWITCH__DESTINATIONTYPES:
        return ((InternalEList<?>)getDestinationtypes()).basicRemove(otherEnd, msgs);
      case LlvmPackage.SWITCH__DESTINATIONS:
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
      case LlvmPackage.SWITCH__COMPTYPE:
        return getComptype();
      case LlvmPackage.SWITCH__COMPVALUE:
        return getCompvalue();
      case LlvmPackage.SWITCH__DEFAULTTYPE:
        return getDefaulttype();
      case LlvmPackage.SWITCH__DEFAULTVALUE:
        return getDefaultvalue();
      case LlvmPackage.SWITCH__JTYPES:
        return getJtypes();
      case LlvmPackage.SWITCH__JVALUES:
        return getJvalues();
      case LlvmPackage.SWITCH__DESTINATIONTYPES:
        return getDestinationtypes();
      case LlvmPackage.SWITCH__DESTINATIONS:
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
      case LlvmPackage.SWITCH__COMPTYPE:
        setComptype((TypeUse)newValue);
        return;
      case LlvmPackage.SWITCH__COMPVALUE:
        setCompvalue((Value)newValue);
        return;
      case LlvmPackage.SWITCH__DEFAULTTYPE:
        setDefaulttype((TypeUse)newValue);
        return;
      case LlvmPackage.SWITCH__DEFAULTVALUE:
        setDefaultvalue((Value)newValue);
        return;
      case LlvmPackage.SWITCH__JTYPES:
        getJtypes().clear();
        getJtypes().addAll((Collection<? extends TypeUse>)newValue);
        return;
      case LlvmPackage.SWITCH__JVALUES:
        getJvalues().clear();
        getJvalues().addAll((Collection<? extends Value>)newValue);
        return;
      case LlvmPackage.SWITCH__DESTINATIONTYPES:
        getDestinationtypes().clear();
        getDestinationtypes().addAll((Collection<? extends TypeUse>)newValue);
        return;
      case LlvmPackage.SWITCH__DESTINATIONS:
        getDestinations().clear();
        getDestinations().addAll((Collection<? extends Value>)newValue);
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
      case LlvmPackage.SWITCH__COMPTYPE:
        setComptype((TypeUse)null);
        return;
      case LlvmPackage.SWITCH__COMPVALUE:
        setCompvalue((Value)null);
        return;
      case LlvmPackage.SWITCH__DEFAULTTYPE:
        setDefaulttype((TypeUse)null);
        return;
      case LlvmPackage.SWITCH__DEFAULTVALUE:
        setDefaultvalue((Value)null);
        return;
      case LlvmPackage.SWITCH__JTYPES:
        getJtypes().clear();
        return;
      case LlvmPackage.SWITCH__JVALUES:
        getJvalues().clear();
        return;
      case LlvmPackage.SWITCH__DESTINATIONTYPES:
        getDestinationtypes().clear();
        return;
      case LlvmPackage.SWITCH__DESTINATIONS:
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
      case LlvmPackage.SWITCH__COMPTYPE:
        return comptype != null;
      case LlvmPackage.SWITCH__COMPVALUE:
        return compvalue != null;
      case LlvmPackage.SWITCH__DEFAULTTYPE:
        return defaulttype != null;
      case LlvmPackage.SWITCH__DEFAULTVALUE:
        return defaultvalue != null;
      case LlvmPackage.SWITCH__JTYPES:
        return jtypes != null && !jtypes.isEmpty();
      case LlvmPackage.SWITCH__JVALUES:
        return jvalues != null && !jvalues.isEmpty();
      case LlvmPackage.SWITCH__DESTINATIONTYPES:
        return destinationtypes != null && !destinationtypes.isEmpty();
      case LlvmPackage.SWITCH__DESTINATIONS:
        return destinations != null && !destinations.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //SwitchImpl
