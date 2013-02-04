/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

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
	 * The cached value of the '{@link #getAdresstype() <em>Adresstype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresstype()
	 * @generated
	 * @ordered
	 */
	protected TypeUse adresstype;

	/**
	 * The cached value of the '{@link #getAdress() <em>Adress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdress()
	 * @generated
	 * @ordered
	 */
	protected Value adress;

	/**
	 * The cached value of the '{@link #getComparetype() <em>Comparetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparetype()
	 * @generated
	 * @ordered
	 */
	protected TypeUse comparetype;

	/**
	 * The cached value of the '{@link #getComparevalue() <em>Comparevalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComparevalue()
	 * @generated
	 * @ordered
	 */
	protected Value comparevalue;

	/**
	 * The cached value of the '{@link #getNewtype() <em>Newtype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewtype()
	 * @generated
	 * @ordered
	 */
	protected TypeUse newtype;

	/**
	 * The cached value of the '{@link #getNewvalue() <em>Newvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewvalue()
	 * @generated
	 * @ordered
	 */
	protected Value newvalue;

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
	public TypeUse getAdresstype() {
		return adresstype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdresstype(TypeUse newAdresstype, NotificationChain msgs) {
		TypeUse oldAdresstype = adresstype;
		adresstype = newAdresstype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__ADRESSTYPE, oldAdresstype, newAdresstype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdresstype(TypeUse newAdresstype) {
		if (newAdresstype != adresstype) {
			NotificationChain msgs = null;
			if (adresstype != null)
				msgs = ((InternalEObject)adresstype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__ADRESSTYPE, null, msgs);
			if (newAdresstype != null)
				msgs = ((InternalEObject)newAdresstype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__ADRESSTYPE, null, msgs);
			msgs = basicSetAdresstype(newAdresstype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__ADRESSTYPE, newAdresstype, newAdresstype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getAdress() {
		return adress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdress(Value newAdress, NotificationChain msgs) {
		Value oldAdress = adress;
		adress = newAdress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__ADRESS, oldAdress, newAdress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdress(Value newAdress) {
		if (newAdress != adress) {
			NotificationChain msgs = null;
			if (adress != null)
				msgs = ((InternalEObject)adress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__ADRESS, null, msgs);
			if (newAdress != null)
				msgs = ((InternalEObject)newAdress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__ADRESS, null, msgs);
			msgs = basicSetAdress(newAdress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__ADRESS, newAdress, newAdress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getComparetype() {
		return comparetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparetype(TypeUse newComparetype, NotificationChain msgs) {
		TypeUse oldComparetype = comparetype;
		comparetype = newComparetype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__COMPARETYPE, oldComparetype, newComparetype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparetype(TypeUse newComparetype) {
		if (newComparetype != comparetype) {
			NotificationChain msgs = null;
			if (comparetype != null)
				msgs = ((InternalEObject)comparetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__COMPARETYPE, null, msgs);
			if (newComparetype != null)
				msgs = ((InternalEObject)newComparetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__COMPARETYPE, null, msgs);
			msgs = basicSetComparetype(newComparetype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__COMPARETYPE, newComparetype, newComparetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getComparevalue() {
		return comparevalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComparevalue(Value newComparevalue, NotificationChain msgs) {
		Value oldComparevalue = comparevalue;
		comparevalue = newComparevalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__COMPAREVALUE, oldComparevalue, newComparevalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComparevalue(Value newComparevalue) {
		if (newComparevalue != comparevalue) {
			NotificationChain msgs = null;
			if (comparevalue != null)
				msgs = ((InternalEObject)comparevalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__COMPAREVALUE, null, msgs);
			if (newComparevalue != null)
				msgs = ((InternalEObject)newComparevalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__COMPAREVALUE, null, msgs);
			msgs = basicSetComparevalue(newComparevalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__COMPAREVALUE, newComparevalue, newComparevalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getNewtype() {
		return newtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewtype(TypeUse newNewtype, NotificationChain msgs) {
		TypeUse oldNewtype = newtype;
		newtype = newNewtype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__NEWTYPE, oldNewtype, newNewtype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewtype(TypeUse newNewtype) {
		if (newNewtype != newtype) {
			NotificationChain msgs = null;
			if (newtype != null)
				msgs = ((InternalEObject)newtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__NEWTYPE, null, msgs);
			if (newNewtype != null)
				msgs = ((InternalEObject)newNewtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__NEWTYPE, null, msgs);
			msgs = basicSetNewtype(newNewtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__NEWTYPE, newNewtype, newNewtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getNewvalue() {
		return newvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNewvalue(Value newNewvalue, NotificationChain msgs) {
		Value oldNewvalue = newvalue;
		newvalue = newNewvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__NEWVALUE, oldNewvalue, newNewvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewvalue(Value newNewvalue) {
		if (newNewvalue != newvalue) {
			NotificationChain msgs = null;
			if (newvalue != null)
				msgs = ((InternalEObject)newvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__NEWVALUE, null, msgs);
			if (newNewvalue != null)
				msgs = ((InternalEObject)newNewvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CMP_XCHG__NEWVALUE, null, msgs);
			msgs = basicSetNewvalue(newNewvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CMP_XCHG__NEWVALUE, newNewvalue, newNewvalue));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.CMP_XCHG__ADRESSTYPE:
				return basicSetAdresstype(null, msgs);
			case LlvmPackage.CMP_XCHG__ADRESS:
				return basicSetAdress(null, msgs);
			case LlvmPackage.CMP_XCHG__COMPARETYPE:
				return basicSetComparetype(null, msgs);
			case LlvmPackage.CMP_XCHG__COMPAREVALUE:
				return basicSetComparevalue(null, msgs);
			case LlvmPackage.CMP_XCHG__NEWTYPE:
				return basicSetNewtype(null, msgs);
			case LlvmPackage.CMP_XCHG__NEWVALUE:
				return basicSetNewvalue(null, msgs);
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
				setAdresstype((TypeUse)newValue);
				return;
			case LlvmPackage.CMP_XCHG__ADRESS:
				setAdress((Value)newValue);
				return;
			case LlvmPackage.CMP_XCHG__COMPARETYPE:
				setComparetype((TypeUse)newValue);
				return;
			case LlvmPackage.CMP_XCHG__COMPAREVALUE:
				setComparevalue((Value)newValue);
				return;
			case LlvmPackage.CMP_XCHG__NEWTYPE:
				setNewtype((TypeUse)newValue);
				return;
			case LlvmPackage.CMP_XCHG__NEWVALUE:
				setNewvalue((Value)newValue);
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
				setAdresstype((TypeUse)null);
				return;
			case LlvmPackage.CMP_XCHG__ADRESS:
				setAdress((Value)null);
				return;
			case LlvmPackage.CMP_XCHG__COMPARETYPE:
				setComparetype((TypeUse)null);
				return;
			case LlvmPackage.CMP_XCHG__COMPAREVALUE:
				setComparevalue((Value)null);
				return;
			case LlvmPackage.CMP_XCHG__NEWTYPE:
				setNewtype((TypeUse)null);
				return;
			case LlvmPackage.CMP_XCHG__NEWVALUE:
				setNewvalue((Value)null);
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
				return adresstype != null;
			case LlvmPackage.CMP_XCHG__ADRESS:
				return adress != null;
			case LlvmPackage.CMP_XCHG__COMPARETYPE:
				return comparetype != null;
			case LlvmPackage.CMP_XCHG__COMPAREVALUE:
				return comparevalue != null;
			case LlvmPackage.CMP_XCHG__NEWTYPE:
				return newtype != null;
			case LlvmPackage.CMP_XCHG__NEWVALUE:
				return newvalue != null;
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
		result.append(" (ordering: ");
		result.append(ordering);
		result.append(')');
		return result.toString();
	}

} //CmpXchgImpl
