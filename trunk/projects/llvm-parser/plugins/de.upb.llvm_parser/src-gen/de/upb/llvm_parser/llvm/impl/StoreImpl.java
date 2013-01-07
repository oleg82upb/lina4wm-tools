/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Store;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getNewtype <em>Newtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getNewvalue <em>Newvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getOrdering <em>Ordering</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StoreImpl extends InstructionImpl implements Store {
	/**
	 * The default value of the '{@link #getNewtype() <em>Newtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewtype()
	 * @generated
	 * @ordered
	 */
	protected static final String NEWTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewtype() <em>Newtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewtype()
	 * @generated
	 * @ordered
	 */
	protected String newtype = NEWTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewvalue() <em>Newvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String NEWVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewvalue() <em>Newvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewvalue()
	 * @generated
	 * @ordered
	 */
	protected String newvalue = NEWVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdresstype() <em>Adresstype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresstype()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresstype() <em>Adresstype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresstype()
	 * @generated
	 * @ordered
	 */
	protected String adresstype = ADRESSTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected String adress = ADRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDERING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrdering() <em>Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrdering()
	 * @generated
	 * @ordered
	 */
	protected String ordering = ORDERING_EDEFAULT;

	/**
	 * The default value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected int index = INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewtype() {
		return newtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewtype(String newNewtype) {
		String oldNewtype = newtype;
		newtype = newNewtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__NEWTYPE, oldNewtype, newtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewvalue() {
		return newvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewvalue(String newNewvalue) {
		String oldNewvalue = newvalue;
		newvalue = newNewvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__NEWVALUE, oldNewvalue, newvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdresstype() {
		return adresstype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresstype(String newAdresstype) {
		String oldAdresstype = adresstype;
		adresstype = newAdresstype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ADRESSTYPE, oldAdresstype, adresstype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAdress() {
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdress(String newAdress) {
		String oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ADRESS, oldAdress, adress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrdering() {
		return ordering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrdering(String newOrdering) {
		String oldOrdering = ordering;
		ordering = newOrdering;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(int newIndex) {
		int oldIndex = index;
		index = newIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__INDEX, oldIndex, index));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.STORE__NEWTYPE:
				return getNewtype();
			case LlvmPackage.STORE__NEWVALUE:
				return getNewvalue();
			case LlvmPackage.STORE__ADRESSTYPE:
				return getAdresstype();
			case LlvmPackage.STORE__ADRESS:
				return getAdress();
			case LlvmPackage.STORE__ORDERING:
				return getOrdering();
			case LlvmPackage.STORE__INDEX:
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
			case LlvmPackage.STORE__NEWTYPE:
				setNewtype((String)newValue);
				return;
			case LlvmPackage.STORE__NEWVALUE:
				setNewvalue((String)newValue);
				return;
			case LlvmPackage.STORE__ADRESSTYPE:
				setAdresstype((String)newValue);
				return;
			case LlvmPackage.STORE__ADRESS:
				setAdress((String)newValue);
				return;
			case LlvmPackage.STORE__ORDERING:
				setOrdering((String)newValue);
				return;
			case LlvmPackage.STORE__INDEX:
				setIndex((Integer)newValue);
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
			case LlvmPackage.STORE__NEWTYPE:
				setNewtype(NEWTYPE_EDEFAULT);
				return;
			case LlvmPackage.STORE__NEWVALUE:
				setNewvalue(NEWVALUE_EDEFAULT);
				return;
			case LlvmPackage.STORE__ADRESSTYPE:
				setAdresstype(ADRESSTYPE_EDEFAULT);
				return;
			case LlvmPackage.STORE__ADRESS:
				setAdress(ADRESS_EDEFAULT);
				return;
			case LlvmPackage.STORE__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
				return;
			case LlvmPackage.STORE__INDEX:
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
			case LlvmPackage.STORE__NEWTYPE:
				return NEWTYPE_EDEFAULT == null ? newtype != null : !NEWTYPE_EDEFAULT.equals(newtype);
			case LlvmPackage.STORE__NEWVALUE:
				return NEWVALUE_EDEFAULT == null ? newvalue != null : !NEWVALUE_EDEFAULT.equals(newvalue);
			case LlvmPackage.STORE__ADRESSTYPE:
				return ADRESSTYPE_EDEFAULT == null ? adresstype != null : !ADRESSTYPE_EDEFAULT.equals(adresstype);
			case LlvmPackage.STORE__ADRESS:
				return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
			case LlvmPackage.STORE__ORDERING:
				return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
			case LlvmPackage.STORE__INDEX:
				return index != INDEX_EDEFAULT;
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
		result.append(" (newtype: ");
		result.append(newtype);
		result.append(", newvalue: ");
		result.append(newvalue);
		result.append(", adresstype: ");
		result.append(adresstype);
		result.append(", adress: ");
		result.append(adress);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //StoreImpl
