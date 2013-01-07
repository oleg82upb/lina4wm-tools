/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.LlvmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insert Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getVectortype <em>Vectortype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getVectorvalue <em>Vectorvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getScalartype <em>Scalartype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getScalarvalue <em>Scalarvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getIndextype <em>Indextype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.InsertElementImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsertElementImpl extends InstructionImpl implements InsertElement {
	/**
	 * The default value of the '{@link #getVectortype() <em>Vectortype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectortype()
	 * @generated
	 * @ordered
	 */
	protected static final String VECTORTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVectortype() <em>Vectortype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectortype()
	 * @generated
	 * @ordered
	 */
	protected String vectortype = VECTORTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVectorvalue() <em>Vectorvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String VECTORVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVectorvalue() <em>Vectorvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVectorvalue()
	 * @generated
	 * @ordered
	 */
	protected String vectorvalue = VECTORVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalartype() <em>Scalartype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalartype()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALARTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalartype() <em>Scalartype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalartype()
	 * @generated
	 * @ordered
	 */
	protected String scalartype = SCALARTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScalarvalue() <em>Scalarvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String SCALARVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScalarvalue() <em>Scalarvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScalarvalue()
	 * @generated
	 * @ordered
	 */
	protected String scalarvalue = SCALARVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndextype() <em>Indextype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndextype()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEXTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndextype() <em>Indextype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndextype()
	 * @generated
	 * @ordered
	 */
	protected String indextype = INDEXTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final String INDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected String index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.INSERT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVectortype() {
		return vectortype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectortype(String newVectortype) {
		String oldVectortype = vectortype;
		vectortype = newVectortype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__VECTORTYPE, oldVectortype, vectortype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVectorvalue() {
		return vectorvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVectorvalue(String newVectorvalue) {
		String oldVectorvalue = vectorvalue;
		vectorvalue = newVectorvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__VECTORVALUE, oldVectorvalue, vectorvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalartype() {
		return scalartype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalartype(String newScalartype) {
		String oldScalartype = scalartype;
		scalartype = newScalartype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__SCALARTYPE, oldScalartype, scalartype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScalarvalue() {
		return scalarvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScalarvalue(String newScalarvalue) {
		String oldScalarvalue = scalarvalue;
		scalarvalue = newScalarvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__SCALARVALUE, oldScalarvalue, scalarvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndextype() {
		return indextype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndextype(String newIndextype) {
		String oldIndextype = indextype;
		indextype = newIndextype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__INDEXTYPE, oldIndextype, indextype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(String newIndex) {
		String oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INSERT_ELEMENT__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.INSERT_ELEMENT__VECTORTYPE:
				return getVectortype();
			case LlvmPackage.INSERT_ELEMENT__VECTORVALUE:
				return getVectorvalue();
			case LlvmPackage.INSERT_ELEMENT__SCALARTYPE:
				return getScalartype();
			case LlvmPackage.INSERT_ELEMENT__SCALARVALUE:
				return getScalarvalue();
			case LlvmPackage.INSERT_ELEMENT__INDEXTYPE:
				return getIndextype();
			case LlvmPackage.INSERT_ELEMENT__INDEX:
				return getIndex();
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
			case LlvmPackage.INSERT_ELEMENT__VECTORTYPE:
				setVectortype((String)newValue);
				return;
			case LlvmPackage.INSERT_ELEMENT__VECTORVALUE:
				setVectorvalue((String)newValue);
				return;
			case LlvmPackage.INSERT_ELEMENT__SCALARTYPE:
				setScalartype((String)newValue);
				return;
			case LlvmPackage.INSERT_ELEMENT__SCALARVALUE:
				setScalarvalue((String)newValue);
				return;
			case LlvmPackage.INSERT_ELEMENT__INDEXTYPE:
				setIndextype((String)newValue);
				return;
			case LlvmPackage.INSERT_ELEMENT__INDEX:
				setIndex((String)newValue);
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
			case LlvmPackage.INSERT_ELEMENT__VECTORTYPE:
				setVectortype(VECTORTYPE_EDEFAULT);
				return;
			case LlvmPackage.INSERT_ELEMENT__VECTORVALUE:
				setVectorvalue(VECTORVALUE_EDEFAULT);
				return;
			case LlvmPackage.INSERT_ELEMENT__SCALARTYPE:
				setScalartype(SCALARTYPE_EDEFAULT);
				return;
			case LlvmPackage.INSERT_ELEMENT__SCALARVALUE:
				setScalarvalue(SCALARVALUE_EDEFAULT);
				return;
			case LlvmPackage.INSERT_ELEMENT__INDEXTYPE:
				setIndextype(INDEXTYPE_EDEFAULT);
				return;
			case LlvmPackage.INSERT_ELEMENT__INDEX:
				setIndex(INDEX_EDEFAULT);
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
			case LlvmPackage.INSERT_ELEMENT__VECTORTYPE:
				return VECTORTYPE_EDEFAULT == null ? vectortype != null : !VECTORTYPE_EDEFAULT.equals(vectortype);
			case LlvmPackage.INSERT_ELEMENT__VECTORVALUE:
				return VECTORVALUE_EDEFAULT == null ? vectorvalue != null : !VECTORVALUE_EDEFAULT.equals(vectorvalue);
			case LlvmPackage.INSERT_ELEMENT__SCALARTYPE:
				return SCALARTYPE_EDEFAULT == null ? scalartype != null : !SCALARTYPE_EDEFAULT.equals(scalartype);
			case LlvmPackage.INSERT_ELEMENT__SCALARVALUE:
				return SCALARVALUE_EDEFAULT == null ? scalarvalue != null : !SCALARVALUE_EDEFAULT.equals(scalarvalue);
			case LlvmPackage.INSERT_ELEMENT__INDEXTYPE:
				return INDEXTYPE_EDEFAULT == null ? indextype != null : !INDEXTYPE_EDEFAULT.equals(indextype);
			case LlvmPackage.INSERT_ELEMENT__INDEX:
				return INDEX_EDEFAULT == null ? index != null : !INDEX_EDEFAULT.equals(index);
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
		result.append(" (vectortype: ");
		result.append(vectortype);
		result.append(", vectorvalue: ");
		result.append(vectorvalue);
		result.append(", scalartype: ");
		result.append(scalartype);
		result.append(", scalarvalue: ");
		result.append(scalarvalue);
		result.append(", indextype: ");
		result.append(indextype);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //InsertElementImpl
