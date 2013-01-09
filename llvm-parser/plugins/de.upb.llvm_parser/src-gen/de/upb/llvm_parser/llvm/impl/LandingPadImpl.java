/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Clause;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Structure;

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
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getPersonalitytype <em>Personalitytype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getPersonalityvalue <em>Personalityvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getPersonalityfunction <em>Personalityfunction</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getCastto <em>Castto</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.LandingPadImpl#getClause <em>Clause</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LandingPadImpl extends InstructionImpl implements LandingPad {
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
	 * The default value of the '{@link #getPersonalityvalue() <em>Personalityvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalityvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSONALITYVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersonalityvalue() <em>Personalityvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonalityvalue()
	 * @generated
	 * @ordered
	 */
	protected String personalityvalue = PERSONALITYVALUE_EDEFAULT;

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
	protected LandingPadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.LANDING_PAD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getStruct() {
		return struct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStruct(Structure newStruct, NotificationChain msgs) {
		Structure oldStruct = struct;
		struct = newStruct;
		if (eNotificationRequired()) {
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
	public void setStruct(Structure newStruct) {
		if (newStruct != struct) {
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
	public String getPersonalitytype() {
		return personalitytype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalitytype(String newPersonalitytype) {
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
	public String getPersonalityvalue() {
		return personalityvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalityvalue(String newPersonalityvalue) {
		String oldPersonalityvalue = personalityvalue;
		personalityvalue = newPersonalityvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.LANDING_PAD__PERSONALITYVALUE, oldPersonalityvalue, personalityvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersonalityfunction() {
		return personalityfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonalityfunction(String newPersonalityfunction) {
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
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
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
	public String getCastto() {
		return castto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastto(String newCastto) {
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
	public EList<Clause> getClause() {
		if (clause == null) {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.LANDING_PAD__STRUCT:
				return basicSetStruct(null, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.LANDING_PAD__STRUCT:
				return getStruct();
			case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
				return getPersonalitytype();
			case LlvmPackage.LANDING_PAD__PERSONALITYVALUE:
				return getPersonalityvalue();
			case LlvmPackage.LANDING_PAD__PERSONALITYFUNCTION:
				return getPersonalityfunction();
			case LlvmPackage.LANDING_PAD__VALUE:
				return getValue();
			case LlvmPackage.LANDING_PAD__CASTTO:
				return getCastto();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LlvmPackage.LANDING_PAD__STRUCT:
				setStruct((Structure)newValue);
				return;
			case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
				setPersonalitytype((String)newValue);
				return;
			case LlvmPackage.LANDING_PAD__PERSONALITYVALUE:
				setPersonalityvalue((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LlvmPackage.LANDING_PAD__STRUCT:
				setStruct((Structure)null);
				return;
			case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
				setPersonalitytype(PERSONALITYTYPE_EDEFAULT);
				return;
			case LlvmPackage.LANDING_PAD__PERSONALITYVALUE:
				setPersonalityvalue(PERSONALITYVALUE_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LlvmPackage.LANDING_PAD__STRUCT:
				return struct != null;
			case LlvmPackage.LANDING_PAD__PERSONALITYTYPE:
				return PERSONALITYTYPE_EDEFAULT == null ? personalitytype != null : !PERSONALITYTYPE_EDEFAULT.equals(personalitytype);
			case LlvmPackage.LANDING_PAD__PERSONALITYVALUE:
				return PERSONALITYVALUE_EDEFAULT == null ? personalityvalue != null : !PERSONALITYVALUE_EDEFAULT.equals(personalityvalue);
			case LlvmPackage.LANDING_PAD__PERSONALITYFUNCTION:
				return PERSONALITYFUNCTION_EDEFAULT == null ? personalityfunction != null : !PERSONALITYFUNCTION_EDEFAULT.equals(personalityfunction);
			case LlvmPackage.LANDING_PAD__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case LlvmPackage.LANDING_PAD__CASTTO:
				return CASTTO_EDEFAULT == null ? castto != null : !CASTTO_EDEFAULT.equals(castto);
			case LlvmPackage.LANDING_PAD__CLAUSE:
				return clause != null && !clause.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (personalitytype: ");
		result.append(personalitytype);
		result.append(", personalityvalue: ");
		result.append(personalityvalue);
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
