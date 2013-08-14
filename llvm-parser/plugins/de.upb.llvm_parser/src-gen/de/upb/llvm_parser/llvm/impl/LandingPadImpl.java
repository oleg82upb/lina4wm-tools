/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.Clause;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Structure;
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
 * An implementation of the model object '<em><b>Landing Pad</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getResult <em>Result</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getPersonalitytype <em>Personalitytype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getPersonalityvalue <em>Personalityvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandingPadImpl extends InstructionImpl implements LandingPad
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
	 * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getStruct()
	 * @generated
	 * @ordered
	 */
  protected Structure struct;

  /**
	 * The cached value of the '{@link #getPersonalitytype() <em>Personalitytype</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPersonalitytype()
	 * @generated
	 * @ordered
	 */
  protected TypeUse personalitytype;

  /**
	 * The cached value of the '{@link #getPersonalityvalue() <em>Personalityvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getPersonalityvalue()
	 * @generated
	 * @ordered
	 */
  protected Value personalityvalue;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__RESULT, oldResult, newResult);
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
				msgs = ((InternalEObject)result).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__RESULT, null, msgs);
			if (newResult != null)
				msgs = ((InternalEObject)newResult).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__RESULT, null, msgs);
			msgs = basicSetResult(newResult, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__RESULT, newResult, newResult));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Structure getStruct()
  {
		return struct;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetStruct(Structure newStruct, NotificationChain msgs)
  {
		Structure oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__STRUCT, oldStruct, newStruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setStruct(Structure newStruct)
  {
		if (newStruct != struct)
		{
			NotificationChain msgs = null;
			if (struct != null)
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__STRUCT, newStruct, newStruct));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeUse getPersonalitytype()
  {
		return personalitytype;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPersonalitytype(TypeUse newPersonalitytype, NotificationChain msgs)
  {
		TypeUse oldPersonalitytype = personalitytype;
		personalitytype = newPersonalitytype;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__PERSONALITYTYPE, oldPersonalitytype, newPersonalitytype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPersonalitytype(TypeUse newPersonalitytype)
  {
		if (newPersonalitytype != personalitytype)
		{
			NotificationChain msgs = null;
			if (personalitytype != null)
				msgs = ((InternalEObject)personalitytype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__PERSONALITYTYPE, null, msgs);
			if (newPersonalitytype != null)
				msgs = ((InternalEObject)newPersonalitytype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__PERSONALITYTYPE, null, msgs);
			msgs = basicSetPersonalitytype(newPersonalitytype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__PERSONALITYTYPE, newPersonalitytype, newPersonalitytype));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Value getPersonalityvalue()
  {
		return personalityvalue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetPersonalityvalue(Value newPersonalityvalue, NotificationChain msgs)
  {
		Value oldPersonalityvalue = personalityvalue;
		personalityvalue = newPersonalityvalue;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__PERSONALITYVALUE, oldPersonalityvalue, newPersonalityvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setPersonalityvalue(Value newPersonalityvalue)
  {
		if (newPersonalityvalue != personalityvalue)
		{
			NotificationChain msgs = null;
			if (personalityvalue != null)
				msgs = ((InternalEObject)personalityvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__PERSONALITYVALUE, null, msgs);
			if (newPersonalityvalue != null)
				msgs = ((InternalEObject)newPersonalityvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.LANDING_PAD__PERSONALITYVALUE, null, msgs);
			msgs = basicSetPersonalityvalue(newPersonalityvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__PERSONALITYVALUE, newPersonalityvalue, newPersonalityvalue));
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
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID)
		{
			case LlvmPackage.LANDING_PAD__RESULT:
				return basicSetResult(null, msgs);
			case LlvmPackage.LANDING_PAD__STRUCT:
				return basicSetStruct(null, msgs);
			case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
				return basicSetPersonalitytype(null, msgs);
			case LlvmPackage.LANDING_PAD__PERSONALITYVALUE:
				return basicSetPersonalityvalue(null, msgs);
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
			case LlvmPackage.LANDING_PAD__RESULT:
				return getResult();
			case LlvmPackage.LANDING_PAD__STRUCT:
				return getStruct();
			case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
				return getPersonalitytype();
			case LlvmPackage.LANDING_PAD__PERSONALITYVALUE:
				return getPersonalityvalue();
			case LlvmPackage.LANDING_PAD__CLAUSE:
				return getClause();
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
			case LlvmPackage.LANDING_PAD__RESULT:
				setResult((Address)newValue);
				return;
			case LlvmPackage.LANDING_PAD__STRUCT:
				setStruct((Structure)newValue);
				return;
			case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
				setPersonalitytype((TypeUse)newValue);
				return;
			case LlvmPackage.LANDING_PAD__PERSONALITYVALUE:
				setPersonalityvalue((Value)newValue);
				return;
			case LlvmPackage.LANDING_PAD__CLAUSE:
				getClause().clear();
				getClause().addAll((Collection<? extends Clause>)newValue);
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
			case LlvmPackage.LANDING_PAD__RESULT:
				setResult((Address)null);
				return;
			case LlvmPackage.LANDING_PAD__STRUCT:
				setStruct((Structure)null);
				return;
			case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
				setPersonalitytype((TypeUse)null);
				return;
			case LlvmPackage.LANDING_PAD__PERSONALITYVALUE:
				setPersonalityvalue((Value)null);
				return;
			case LlvmPackage.LANDING_PAD__CLAUSE:
				getClause().clear();
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
			case LlvmPackage.LANDING_PAD__RESULT:
				return result != null;
			case LlvmPackage.LANDING_PAD__STRUCT:
				return struct != null;
			case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
				return personalitytype != null;
			case LlvmPackage.LANDING_PAD__PERSONALITYVALUE:
				return personalityvalue != null;
			case LlvmPackage.LANDING_PAD__CLAUSE:
				return clause != null && !clause.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LandingPadImpl
