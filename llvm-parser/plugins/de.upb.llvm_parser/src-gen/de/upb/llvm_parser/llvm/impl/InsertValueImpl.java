/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Structure;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getInserttype <em>Inserttype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getInsertvalue <em>Insertvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertValueImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertValueImpl extends InstructionImpl implements InsertValue {
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
	 * The default value of the '{@link #getInserttype() <em>Inserttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInserttype()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERTTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInserttype() <em>Inserttype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInserttype()
	 * @generated
	 * @ordered
	 */
	protected String inserttype = INSERTTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInsertvalue() <em>Insertvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String INSERTVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInsertvalue() <em>Insertvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertvalue()
	 * @generated
	 * @ordered
	 */
	protected String insertvalue = INSERTVALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> index;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.INSERT_VALUE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__STRUCT, oldStruct, newStruct);
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
				msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__STRUCT, null, msgs);
			if (newStruct != null)
				msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INSERT_VALUE__STRUCT, null, msgs);
			msgs = basicSetStruct(newStruct, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__STRUCT, newStruct, newStruct));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInserttype() {
		return inserttype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInserttype(String newInserttype) {
		String oldInserttype = inserttype;
		inserttype = newInserttype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__INSERTTYPE, oldInserttype, inserttype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInsertvalue() {
		return insertvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertvalue(String newInsertvalue) {
		String oldInsertvalue = insertvalue;
		insertvalue = newInsertvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_VALUE__INSERTVALUE, oldInsertvalue, insertvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getIndex() {
		if (index == null) {
			index = new EDataTypeEList<Integer>(Integer.class, this, LlvmPackage.INSERT_VALUE__INDEX);
		}
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.INSERT_VALUE__STRUCT:
				return basicSetStruct(null, msgs);
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
			case LlvmPackage.INSERT_VALUE__STRUCT:
				return getStruct();
			case LlvmPackage.INSERT_VALUE__VALUE:
				return getValue();
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
				return getInserttype();
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
				return getInsertvalue();
			case LlvmPackage.INSERT_VALUE__INDEX:
				return getIndex();
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
			case LlvmPackage.INSERT_VALUE__STRUCT:
				setStruct((Structure)newValue);
				return;
			case LlvmPackage.INSERT_VALUE__VALUE:
				setValue((String)newValue);
				return;
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
				setInserttype((String)newValue);
				return;
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
				setInsertvalue((String)newValue);
				return;
			case LlvmPackage.INSERT_VALUE__INDEX:
				getIndex().clear();
				getIndex().addAll((Collection<? extends Integer>)newValue);
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
			case LlvmPackage.INSERT_VALUE__STRUCT:
				setStruct((Structure)null);
				return;
			case LlvmPackage.INSERT_VALUE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
				setInserttype(INSERTTYPE_EDEFAULT);
				return;
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
				setInsertvalue(INSERTVALUE_EDEFAULT);
				return;
			case LlvmPackage.INSERT_VALUE__INDEX:
				getIndex().clear();
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
			case LlvmPackage.INSERT_VALUE__STRUCT:
				return struct != null;
			case LlvmPackage.INSERT_VALUE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case LlvmPackage.INSERT_VALUE__INSERTTYPE:
				return INSERTTYPE_EDEFAULT == null ? inserttype != null : !INSERTTYPE_EDEFAULT.equals(inserttype);
			case LlvmPackage.INSERT_VALUE__INSERTVALUE:
				return INSERTVALUE_EDEFAULT == null ? insertvalue != null : !INSERTVALUE_EDEFAULT.equals(insertvalue);
			case LlvmPackage.INSERT_VALUE__INDEX:
				return index != null && !index.isEmpty();
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
		result.append(" (value: ");
		result.append(value);
		result.append(", inserttype: ");
		result.append(inserttype);
		result.append(", insertvalue: ");
		result.append(insertvalue);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //InsertValueImpl
