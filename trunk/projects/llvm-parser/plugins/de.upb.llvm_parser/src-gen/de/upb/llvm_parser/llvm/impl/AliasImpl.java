/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Alias;
import de.upb.llvm_parser.llvm.LlvmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AliasImpl#getAliastype <em>Aliastype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AliasImpl#getAliasvalue <em>Aliasvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.AliasImpl#getAliasee <em>Aliasee</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasImpl extends MinimalEObjectImpl.Container implements Alias {
	/**
	 * The default value of the '{@link #getAliastype() <em>Aliastype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliastype()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIASTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliastype() <em>Aliastype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliastype()
	 * @generated
	 * @ordered
	 */
	protected String aliastype = ALIASTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAliasvalue() <em>Aliasvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIASVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasvalue() <em>Aliasvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasvalue()
	 * @generated
	 * @ordered
	 */
	protected String aliasvalue = ALIASVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAliasee() <em>Aliasee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasee()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIASEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAliasee() <em>Aliasee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasee()
	 * @generated
	 * @ordered
	 */
	protected String aliasee = ALIASEE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AliasImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.ALIAS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliastype() {
		return aliastype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliastype(String newAliastype) {
		String oldAliastype = aliastype;
		aliastype = newAliastype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALIAS__ALIASTYPE, oldAliastype, aliastype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasvalue() {
		return aliasvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasvalue(String newAliasvalue) {
		String oldAliasvalue = aliasvalue;
		aliasvalue = newAliasvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALIAS__ALIASVALUE, oldAliasvalue, aliasvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAliasee() {
		return aliasee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAliasee(String newAliasee) {
		String oldAliasee = aliasee;
		aliasee = newAliasee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.ALIAS__ALIASEE, oldAliasee, aliasee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.ALIAS__ALIASTYPE:
				return getAliastype();
			case LlvmPackage.ALIAS__ALIASVALUE:
				return getAliasvalue();
			case LlvmPackage.ALIAS__ALIASEE:
				return getAliasee();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LlvmPackage.ALIAS__ALIASTYPE:
				setAliastype((String)newValue);
				return;
			case LlvmPackage.ALIAS__ALIASVALUE:
				setAliasvalue((String)newValue);
				return;
			case LlvmPackage.ALIAS__ALIASEE:
				setAliasee((String)newValue);
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
			case LlvmPackage.ALIAS__ALIASTYPE:
				setAliastype(ALIASTYPE_EDEFAULT);
				return;
			case LlvmPackage.ALIAS__ALIASVALUE:
				setAliasvalue(ALIASVALUE_EDEFAULT);
				return;
			case LlvmPackage.ALIAS__ALIASEE:
				setAliasee(ALIASEE_EDEFAULT);
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
			case LlvmPackage.ALIAS__ALIASTYPE:
				return ALIASTYPE_EDEFAULT == null ? aliastype != null : !ALIASTYPE_EDEFAULT.equals(aliastype);
			case LlvmPackage.ALIAS__ALIASVALUE:
				return ALIASVALUE_EDEFAULT == null ? aliasvalue != null : !ALIASVALUE_EDEFAULT.equals(aliasvalue);
			case LlvmPackage.ALIAS__ALIASEE:
				return ALIASEE_EDEFAULT == null ? aliasee != null : !ALIASEE_EDEFAULT.equals(aliasee);
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
		result.append(" (aliastype: ");
		result.append(aliastype);
		result.append(", aliasvalue: ");
		result.append(aliasvalue);
		result.append(", aliasee: ");
		result.append(aliasee);
		result.append(')');
		return result.toString();
	}

} //AliasImpl
