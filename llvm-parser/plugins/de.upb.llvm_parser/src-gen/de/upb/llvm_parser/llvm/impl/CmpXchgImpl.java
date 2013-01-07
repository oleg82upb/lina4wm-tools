/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.LlvmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cmp Xchg</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CmpXchgImpl#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CmpXchgImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CmpXchgImpl#getComparetype <em>Comparetype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CmpXchgImpl#getComparevalue <em>Comparevalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CmpXchgImpl#getNewtype <em>Newtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CmpXchgImpl#getNewvalue <em>Newvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CmpXchgImpl#getOrdering <em>Ordering</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CmpXchgImpl extends InstructionImpl implements CmpXchg {
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
	 * The default value of the '{@link #getComparetype() <em>Comparetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparetype()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPARETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparetype() <em>Comparetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparetype()
	 * @generated
	 * @ordered
	 */
	protected String comparetype = COMPARETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getComparevalue() <em>Comparevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparevalue()
	 * @generated
	 * @ordered
	 */
	protected static final String COMPAREVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComparevalue() <em>Comparevalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparevalue()
	 * @generated
	 * @ordered
	 */
	protected String comparevalue = COMPAREVALUE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CmpXchgImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.CMP_XCHG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__ADRESSTYPE, oldAdresstype, adresstype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__ADRESS, oldAdress, adress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparetype() {
		return comparetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparetype(String newComparetype) {
		String oldComparetype = comparetype;
		comparetype = newComparetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__COMPARETYPE, oldComparetype, comparetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComparevalue() {
		return comparevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparevalue(String newComparevalue) {
		String oldComparevalue = comparevalue;
		comparevalue = newComparevalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__COMPAREVALUE, oldComparevalue, comparevalue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__NEWTYPE, oldNewtype, newtype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__NEWVALUE, oldNewvalue, newvalue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__ORDERING, oldOrdering, ordering));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.CMP_XCHG__ADRESSTYPE:
				return getAdresstype();
			case LlvmPackage.CMP_XCHG__ADRESS:
				return getAdress();
			case LlvmPackage.CMP_XCHG__COMPARETYPE:
				return getComparetype();
			case LlvmPackage.CMP_XCHG__COMPAREVALUE:
				return getComparevalue();
			case LlvmPackage.CMP_XCHG__NEWTYPE:
				return getNewtype();
			case LlvmPackage.CMP_XCHG__NEWVALUE:
				return getNewvalue();
			case LlvmPackage.CMP_XCHG__ORDERING:
				return getOrdering();
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
			case LlvmPackage.CMP_XCHG__ADRESSTYPE:
				setAdresstype((String)newValue);
				return;
			case LlvmPackage.CMP_XCHG__ADRESS:
				setAdress((String)newValue);
				return;
			case LlvmPackage.CMP_XCHG__COMPARETYPE:
				setComparetype((String)newValue);
				return;
			case LlvmPackage.CMP_XCHG__COMPAREVALUE:
				setComparevalue((String)newValue);
				return;
			case LlvmPackage.CMP_XCHG__NEWTYPE:
				setNewtype((String)newValue);
				return;
			case LlvmPackage.CMP_XCHG__NEWVALUE:
				setNewvalue((String)newValue);
				return;
			case LlvmPackage.CMP_XCHG__ORDERING:
				setOrdering((String)newValue);
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
			case LlvmPackage.CMP_XCHG__ADRESSTYPE:
				setAdresstype(ADRESSTYPE_EDEFAULT);
				return;
			case LlvmPackage.CMP_XCHG__ADRESS:
				setAdress(ADRESS_EDEFAULT);
				return;
			case LlvmPackage.CMP_XCHG__COMPARETYPE:
				setComparetype(COMPARETYPE_EDEFAULT);
				return;
			case LlvmPackage.CMP_XCHG__COMPAREVALUE:
				setComparevalue(COMPAREVALUE_EDEFAULT);
				return;
			case LlvmPackage.CMP_XCHG__NEWTYPE:
				setNewtype(NEWTYPE_EDEFAULT);
				return;
			case LlvmPackage.CMP_XCHG__NEWVALUE:
				setNewvalue(NEWVALUE_EDEFAULT);
				return;
			case LlvmPackage.CMP_XCHG__ORDERING:
				setOrdering(ORDERING_EDEFAULT);
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
			case LlvmPackage.CMP_XCHG__ADRESSTYPE:
				return ADRESSTYPE_EDEFAULT == null ? adresstype != null : !ADRESSTYPE_EDEFAULT.equals(adresstype);
			case LlvmPackage.CMP_XCHG__ADRESS:
				return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
			case LlvmPackage.CMP_XCHG__COMPARETYPE:
				return COMPARETYPE_EDEFAULT == null ? comparetype != null : !COMPARETYPE_EDEFAULT.equals(comparetype);
			case LlvmPackage.CMP_XCHG__COMPAREVALUE:
				return COMPAREVALUE_EDEFAULT == null ? comparevalue != null : !COMPAREVALUE_EDEFAULT.equals(comparevalue);
			case LlvmPackage.CMP_XCHG__NEWTYPE:
				return NEWTYPE_EDEFAULT == null ? newtype != null : !NEWTYPE_EDEFAULT.equals(newtype);
			case LlvmPackage.CMP_XCHG__NEWVALUE:
				return NEWVALUE_EDEFAULT == null ? newvalue != null : !NEWVALUE_EDEFAULT.equals(newvalue);
			case LlvmPackage.CMP_XCHG__ORDERING:
				return ORDERING_EDEFAULT == null ? ordering != null : !ORDERING_EDEFAULT.equals(ordering);
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
		result.append(" (adresstype: ");
		result.append(adresstype);
		result.append(", adress: ");
		result.append(adress);
		result.append(", comparetype: ");
		result.append(comparetype);
		result.append(", comparevalue: ");
		result.append(comparevalue);
		result.append(", newtype: ");
		result.append(newtype);
		result.append(", newvalue: ");
		result.append(newvalue);
		result.append(", ordering: ");
		result.append(ordering);
		result.append(')');
		return result.toString();
	}

} //CmpXchgImpl
