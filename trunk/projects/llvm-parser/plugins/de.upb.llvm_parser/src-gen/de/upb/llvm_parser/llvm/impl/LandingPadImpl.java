/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Clause;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeAndValue;

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
 * An implementation of the model object '<em><b>Landing Pad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getPersonality <em>Personality</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getPersonalitytype <em>Personalitytype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getPersonalityfunction <em>Personalityfunction</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getCastto <em>Castto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandingPadImpl extends InstructionImpl implements LandingPad
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getPersonality() <em>Personality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonality()
   * @generated
   * @ordered
   */
  protected TypeAndValue personality;

  /**
   * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClause()
   * @generated
   * @ordered
   */
  protected EList<Clause> clause;

  /**
   * The default value of the '{@link #getPersonalitytype() <em>Personalitytype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonalitytype()
   * @generated
   * @ordered
   */
  protected static final String PERSONALITYTYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPersonalitytype() <em>Personalitytype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonalitytype()
   * @generated
   * @ordered
   */
  protected String personalitytype = PERSONALITYTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getPersonalityfunction() <em>Personalityfunction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonalityfunction()
   * @generated
   * @ordered
   */
  protected static final String PERSONALITYFUNCTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPersonalityfunction() <em>Personalityfunction</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPersonalityfunction()
   * @generated
   * @ordered
   */
  protected String personalityfunction = PERSONALITYFUNCTION_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getCastto() <em>Castto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastto()
   * @generated
   * @ordered
   */
  protected static final String CASTTO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCastto() <em>Castto</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCastto()
   * @generated
   * @ordered
   */
  protected String castto = CASTTO_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LandingPadImpl()
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
    return LlvmPackage.Literals.LANDING_PAD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeAndValue getPersonality()
  {
    return personality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPersonality(TypeAndValue newPersonality, NotificationChain msgs)
  {
    TypeAndValue oldPersonality = personality;
    personality = newPersonality;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__PERSONALITY, oldPersonality, newPersonality);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonality(TypeAndValue newPersonality)
  {
    if (newPersonality != personality)
    {
      NotificationChain msgs = null;
      if (personality != null)
        msgs = ((InternalEObject)personality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__PERSONALITY, null, msgs);
      if (newPersonality != null)
        msgs = ((InternalEObject)newPersonality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__PERSONALITY, null, msgs);
      msgs = basicSetPersonality(newPersonality, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__PERSONALITY, newPersonality, newPersonality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Clause> getClause()
  {
    if (clause == null)
    {
      clause = new EObjectContainmentEList<Clause>(Clause.class, this, LlvmPackage.LANDING_PAD__CLAUSE);
    }
    return clause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPersonalitytype()
  {
    return personalitytype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonalitytype(String newPersonalitytype)
  {
    String oldPersonalitytype = personalitytype;
    personalitytype = newPersonalitytype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__PERSONALITYTYPE, oldPersonalitytype, personalitytype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPersonalityfunction()
  {
    return personalityfunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPersonalityfunction(String newPersonalityfunction)
  {
    String oldPersonalityfunction = personalityfunction;
    personalityfunction = newPersonalityfunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__PERSONALITYFUNCTION, oldPersonalityfunction, personalityfunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCastto()
  {
    return castto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCastto(String newCastto)
  {
    String oldCastto = castto;
    castto = newCastto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__CASTTO, oldCastto, castto));
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
      case LlvmPackage.LANDING_PAD__PERSONALITY:
        return basicSetPersonality(null, msgs);
      case LlvmPackage.LANDING_PAD__CLAUSE:
        return ((InternalEList<?>)getClause()).basicRemove(otherEnd, msgs);
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
      case LlvmPackage.LANDING_PAD__TYPE:
        return getType();
      case LlvmPackage.LANDING_PAD__PERSONALITY:
        return getPersonality();
      case LlvmPackage.LANDING_PAD__CLAUSE:
        return getClause();
      case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
        return getPersonalitytype();
      case LlvmPackage.LANDING_PAD__PERSONALITYFUNCTION:
        return getPersonalityfunction();
      case LlvmPackage.LANDING_PAD__VALUE:
        return getValue();
      case LlvmPackage.LANDING_PAD__CASTTO:
        return getCastto();
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
      case LlvmPackage.LANDING_PAD__TYPE:
        setType((String)newValue);
        return;
      case LlvmPackage.LANDING_PAD__PERSONALITY:
        setPersonality((TypeAndValue)newValue);
        return;
      case LlvmPackage.LANDING_PAD__CLAUSE:
        getClause().clear();
        getClause().addAll((Collection<? extends Clause>)newValue);
        return;
      case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
        setPersonalitytype((String)newValue);
        return;
      case LlvmPackage.LANDING_PAD__PERSONALITYFUNCTION:
        setPersonalityfunction((String)newValue);
        return;
      case LlvmPackage.LANDING_PAD__VALUE:
        setValue((String)newValue);
        return;
      case LlvmPackage.LANDING_PAD__CASTTO:
        setCastto((String)newValue);
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
      case LlvmPackage.LANDING_PAD__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case LlvmPackage.LANDING_PAD__PERSONALITY:
        setPersonality((TypeAndValue)null);
        return;
      case LlvmPackage.LANDING_PAD__CLAUSE:
        getClause().clear();
        return;
      case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
        setPersonalitytype(PERSONALITYTYPE_EDEFAULT);
        return;
      case LlvmPackage.LANDING_PAD__PERSONALITYFUNCTION:
        setPersonalityfunction(PERSONALITYFUNCTION_EDEFAULT);
        return;
      case LlvmPackage.LANDING_PAD__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case LlvmPackage.LANDING_PAD__CASTTO:
        setCastto(CASTTO_EDEFAULT);
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
      case LlvmPackage.LANDING_PAD__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case LlvmPackage.LANDING_PAD__PERSONALITY:
        return personality != null;
      case LlvmPackage.LANDING_PAD__CLAUSE:
        return clause != null && !clause.isEmpty();
      case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
        return PERSONALITYTYPE_EDEFAULT == null ? personalitytype != null : !PERSONALITYTYPE_EDEFAULT.equals(personalitytype);
      case LlvmPackage.LANDING_PAD__PERSONALITYFUNCTION:
        return PERSONALITYFUNCTION_EDEFAULT == null ? personalityfunction != null : !PERSONALITYFUNCTION_EDEFAULT.equals(personalityfunction);
      case LlvmPackage.LANDING_PAD__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case LlvmPackage.LANDING_PAD__CASTTO:
        return CASTTO_EDEFAULT == null ? castto != null : !CASTTO_EDEFAULT.equals(castto);
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
    result.append(" (type: ");
    result.append(type);
    result.append(", personalitytype: ");
    result.append(personalitytype);
    result.append(", personalityfunction: ");
    result.append(personalityfunction);
    result.append(", value: ");
    result.append(value);
    result.append(", castto: ");
    result.append(castto);
    result.append(')');
    return result.toString();
  }

} //LandingPadImpl
