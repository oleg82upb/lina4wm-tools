/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.TypeList;

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
 * An implementation of the model object '<em><b>Cast</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getCastfrom <em>Castfrom</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getCaststruct <em>Caststruct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getDual <em>Dual</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getOp <em>Op</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CastImpl#getGlobal <em>Global</em>}</li>
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
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeList> types;

	/**
	 * The cached value of the '{@link #getCaststruct() <em>Caststruct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaststruct()
	 * @generated
	 * @ordered
	 */
	protected Structure caststruct;

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
	 * The default value of the '{@link #getDual() <em>Dual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDual()
	 * @generated
	 * @ordered
	 */
	protected static final String DUAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDual() <em>Dual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDual()
	 * @generated
	 * @ordered
	 */
	protected String dual = DUAL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOp() <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOp()
	 * @generated
	 * @ordered
	 */
	protected GetElementPtr op;

	/**
	 * The default value of the '{@link #getGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobal() <em>Global</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobal()
	 * @generated
	 * @ordered
	 */
	protected String global = GLOBAL_EDEFAULT;

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
	public EList<TypeList> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<TypeList>(TypeList.class, this, LlvmPackage.CAST__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Structure getCaststruct() {
		return caststruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaststruct(Structure newCaststruct, NotificationChain msgs) {
		Structure oldCaststruct = caststruct;
		caststruct = newCaststruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CAST__CASTSTRUCT, oldCaststruct, newCaststruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaststruct(Structure newCaststruct) {
		if (newCaststruct != caststruct) {
			NotificationChain msgs = null;
			if (caststruct != null)
				msgs = ((InternalEObject)caststruct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CAST__CASTSTRUCT, null, msgs);
			if (newCaststruct != null)
				msgs = ((InternalEObject)newCaststruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CAST__CASTSTRUCT, null, msgs);
			msgs = basicSetCaststruct(newCaststruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CAST__CASTSTRUCT, newCaststruct, newCaststruct));
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
	public String getDual() {
		return dual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDual(String newDual) {
		String oldDual = dual;
		dual = newDual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CAST__DUAL, oldDual, dual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetElementPtr getOp() {
		return op;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOp(GetElementPtr newOp, NotificationChain msgs) {
		GetElementPtr oldOp = op;
		op = newOp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CAST__OP, oldOp, newOp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOp(GetElementPtr newOp) {
		if (newOp != op) {
			NotificationChain msgs = null;
			if (op != null)
				msgs = ((InternalEObject)op).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CAST__OP, null, msgs);
			if (newOp != null)
				msgs = ((InternalEObject)newOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CAST__OP, null, msgs);
			msgs = basicSetOp(newOp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CAST__OP, newOp, newOp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobal() {
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobal(String newGlobal) {
		String oldGlobal = global;
		global = newGlobal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CAST__GLOBAL, oldGlobal, global));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.CAST__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case LlvmPackage.CAST__CASTSTRUCT:
				return basicSetCaststruct(null, msgs);
			case LlvmPackage.CAST__OP:
				return basicSetOp(null, msgs);
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
			case LlvmPackage.CAST__CASTFROM:
				return getCastfrom();
			case LlvmPackage.CAST__TYPES:
				return getTypes();
			case LlvmPackage.CAST__CASTSTRUCT:
				return getCaststruct();
			case LlvmPackage.CAST__VALUE:
				return getValue();
			case LlvmPackage.CAST__DUAL:
				return getDual();
			case LlvmPackage.CAST__OP:
				return getOp();
			case LlvmPackage.CAST__GLOBAL:
				return getGlobal();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LlvmPackage.CAST__CASTFROM:
				setCastfrom((String)newValue);
				return;
			case LlvmPackage.CAST__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends TypeList>)newValue);
				return;
			case LlvmPackage.CAST__CASTSTRUCT:
				setCaststruct((Structure)newValue);
				return;
			case LlvmPackage.CAST__VALUE:
				setValue((String)newValue);
				return;
			case LlvmPackage.CAST__DUAL:
				setDual((String)newValue);
				return;
			case LlvmPackage.CAST__OP:
				setOp((GetElementPtr)newValue);
				return;
			case LlvmPackage.CAST__GLOBAL:
				setGlobal((String)newValue);
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
			case LlvmPackage.CAST__TYPES:
				getTypes().clear();
				return;
			case LlvmPackage.CAST__CASTSTRUCT:
				setCaststruct((Structure)null);
				return;
			case LlvmPackage.CAST__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case LlvmPackage.CAST__DUAL:
				setDual(DUAL_EDEFAULT);
				return;
			case LlvmPackage.CAST__OP:
				setOp((GetElementPtr)null);
				return;
			case LlvmPackage.CAST__GLOBAL:
				setGlobal(GLOBAL_EDEFAULT);
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
			case LlvmPackage.CAST__TYPES:
				return types != null && !types.isEmpty();
			case LlvmPackage.CAST__CASTSTRUCT:
				return caststruct != null;
			case LlvmPackage.CAST__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case LlvmPackage.CAST__DUAL:
				return DUAL_EDEFAULT == null ? dual != null : !DUAL_EDEFAULT.equals(dual);
			case LlvmPackage.CAST__OP:
				return op != null;
			case LlvmPackage.CAST__GLOBAL:
				return GLOBAL_EDEFAULT == null ? global != null : !GLOBAL_EDEFAULT.equals(global);
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
		result.append(", dual: ");
		result.append(dual);
		result.append(", global: ");
		result.append(global);
		result.append(", castto: ");
		result.append(castto);
		result.append(')');
		return result.toString();
	}

} //CastImpl
