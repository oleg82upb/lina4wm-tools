/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.LlvmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getCastfrom <em>Castfrom</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getCastto <em>Castto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CastImpl extends InstructionImpl implements Cast {
	/**
	 * The default value of the '{@link #getCastfrom() <em>Castfrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastfrom()
	 * @generated
	 * @ordered
	 */
	protected static final String CASTFROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCastfrom() <em>Castfrom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCastfrom()
	 * @generated
	 * @ordered
	 */
	protected String castfrom = CASTFROM_EDEFAULT;

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
	protected CastImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.CAST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCastfrom() {
		return castfrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCastfrom(String newCastfrom) {
		String oldCastfrom = castfrom;
		castfrom = newCastfrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CAST__CASTFROM, oldCastfrom, castfrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CAST__VALUE, oldValue, value));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CAST__CASTTO, oldCastto, castto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.CAST__CASTFROM:
				return getCastfrom();
			case LlvmPackage.CAST__VALUE:
				return getValue();
			case LlvmPackage.CAST__CASTTO:
				return getCastto();
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
			case LlvmPackage.CAST__CASTFROM:
				setCastfrom((String)newValue);
				return;
			case LlvmPackage.CAST__VALUE:
				setValue((String)newValue);
				return;
			case LlvmPackage.CAST__CASTTO:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case LlvmPackage.CAST__CASTFROM:
				setCastfrom(CASTFROM_EDEFAULT);
				return;
			case LlvmPackage.CAST__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case LlvmPackage.CAST__CASTTO:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LlvmPackage.CAST__CASTFROM:
				return CASTFROM_EDEFAULT == null ? castfrom != null : !CASTFROM_EDEFAULT.equals(castfrom);
			case LlvmPackage.CAST__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case LlvmPackage.CAST__CASTTO:
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (castfrom: ");
		result.append(castfrom);
		result.append(", value: ");
		result.append(value);
		result.append(", castto: ");
		result.append(castto);
		result.append(')');
		return result.toString();
	}

} //CastImpl
