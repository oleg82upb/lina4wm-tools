/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.ARRAY;
import de.upb.llvm_parser.llvm.Alias;
import de.upb.llvm_parser.llvm.CastStructure;
import de.upb.llvm_parser.llvm.Instruction;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.NamedType;
import de.upb.llvm_parser.llvm.Structure;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Named Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.NamedTypeImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.NamedTypeImpl#getInstr <em>Instr</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.NamedTypeImpl#getArray <em>Array</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.NamedTypeImpl#getCaststruct <em>Caststruct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.NamedTypeImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.NamedTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NamedTypeImpl extends MainLevelEntityImpl implements NamedType {
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
	 * The cached value of the '{@link #getInstr() <em>Instr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstr()
	 * @generated
	 * @ordered
	 */
	protected Instruction instr;

	/**
	 * The cached value of the '{@link #getArray() <em>Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArray()
	 * @generated
	 * @ordered
	 */
	protected ARRAY array;

	/**
	 * The cached value of the '{@link #getCaststruct() <em>Caststruct</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCaststruct()
	 * @generated
	 * @ordered
	 */
	protected CastStructure caststruct;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected Alias alias;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamedTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.NAMED_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__STRUCT, oldStruct, newStruct);
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
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__STRUCT, newStruct, newStruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getInstr() {
		return instr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInstr(Instruction newInstr, NotificationChain msgs) {
		Instruction oldInstr = instr;
		instr = newInstr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__INSTR, oldInstr, newInstr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstr(Instruction newInstr) {
		if (newInstr != instr) {
			NotificationChain msgs = null;
			if (instr != null)
				msgs = ((InternalEObject)instr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__INSTR, null, msgs);
			if (newInstr != null)
				msgs = ((InternalEObject)newInstr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__INSTR, null, msgs);
			msgs = basicSetInstr(newInstr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__INSTR, newInstr, newInstr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARRAY getArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArray(ARRAY newArray, NotificationChain msgs) {
		ARRAY oldArray = array;
		array = newArray;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__ARRAY, oldArray, newArray);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(ARRAY newArray) {
		if (newArray != array) {
			NotificationChain msgs = null;
			if (array != null)
				msgs = ((InternalEObject)array).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__ARRAY, null, msgs);
			if (newArray != null)
				msgs = ((InternalEObject)newArray).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__ARRAY, null, msgs);
			msgs = basicSetArray(newArray, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__ARRAY, newArray, newArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CastStructure getCaststruct() {
		return caststruct;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCaststruct(CastStructure newCaststruct, NotificationChain msgs) {
		CastStructure oldCaststruct = caststruct;
		caststruct = newCaststruct;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__CASTSTRUCT, oldCaststruct, newCaststruct);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCaststruct(CastStructure newCaststruct) {
		if (newCaststruct != caststruct) {
			NotificationChain msgs = null;
			if (caststruct != null)
				msgs = ((InternalEObject)caststruct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__CASTSTRUCT, null, msgs);
			if (newCaststruct != null)
				msgs = ((InternalEObject)newCaststruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__CASTSTRUCT, null, msgs);
			msgs = basicSetCaststruct(newCaststruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__CASTSTRUCT, newCaststruct, newCaststruct));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Alias getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlias(Alias newAlias, NotificationChain msgs) {
		Alias oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__ALIAS, oldAlias, newAlias);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(Alias newAlias) {
		if (newAlias != alias) {
			NotificationChain msgs = null;
			if (alias != null)
				msgs = ((InternalEObject)alias).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__ALIAS, null, msgs);
			if (newAlias != null)
				msgs = ((InternalEObject)newAlias).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.NAMED_TYPE__ALIAS, null, msgs);
			msgs = basicSetAlias(newAlias, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__ALIAS, newAlias, newAlias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.NAMED_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.NAMED_TYPE__STRUCT:
				return basicSetStruct(null, msgs);
			case LlvmPackage.NAMED_TYPE__INSTR:
				return basicSetInstr(null, msgs);
			case LlvmPackage.NAMED_TYPE__ARRAY:
				return basicSetArray(null, msgs);
			case LlvmPackage.NAMED_TYPE__CASTSTRUCT:
				return basicSetCaststruct(null, msgs);
			case LlvmPackage.NAMED_TYPE__ALIAS:
				return basicSetAlias(null, msgs);
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
			case LlvmPackage.NAMED_TYPE__STRUCT:
				return getStruct();
			case LlvmPackage.NAMED_TYPE__INSTR:
				return getInstr();
			case LlvmPackage.NAMED_TYPE__ARRAY:
				return getArray();
			case LlvmPackage.NAMED_TYPE__CASTSTRUCT:
				return getCaststruct();
			case LlvmPackage.NAMED_TYPE__ALIAS:
				return getAlias();
			case LlvmPackage.NAMED_TYPE__TYPE:
				return getType();
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
			case LlvmPackage.NAMED_TYPE__STRUCT:
				setStruct((Structure)newValue);
				return;
			case LlvmPackage.NAMED_TYPE__INSTR:
				setInstr((Instruction)newValue);
				return;
			case LlvmPackage.NAMED_TYPE__ARRAY:
				setArray((ARRAY)newValue);
				return;
			case LlvmPackage.NAMED_TYPE__CASTSTRUCT:
				setCaststruct((CastStructure)newValue);
				return;
			case LlvmPackage.NAMED_TYPE__ALIAS:
				setAlias((Alias)newValue);
				return;
			case LlvmPackage.NAMED_TYPE__TYPE:
				setType((String)newValue);
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
			case LlvmPackage.NAMED_TYPE__STRUCT:
				setStruct((Structure)null);
				return;
			case LlvmPackage.NAMED_TYPE__INSTR:
				setInstr((Instruction)null);
				return;
			case LlvmPackage.NAMED_TYPE__ARRAY:
				setArray((ARRAY)null);
				return;
			case LlvmPackage.NAMED_TYPE__CASTSTRUCT:
				setCaststruct((CastStructure)null);
				return;
			case LlvmPackage.NAMED_TYPE__ALIAS:
				setAlias((Alias)null);
				return;
			case LlvmPackage.NAMED_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case LlvmPackage.NAMED_TYPE__STRUCT:
				return struct != null;
			case LlvmPackage.NAMED_TYPE__INSTR:
				return instr != null;
			case LlvmPackage.NAMED_TYPE__ARRAY:
				return array != null;
			case LlvmPackage.NAMED_TYPE__CASTSTRUCT:
				return caststruct != null;
			case LlvmPackage.NAMED_TYPE__ALIAS:
				return alias != null;
			case LlvmPackage.NAMED_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //NamedTypeImpl
