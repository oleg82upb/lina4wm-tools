/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.TypeList;
import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

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
 * An implementation of the model object '<em><b>Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getNewtype <em>Newtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.StoreImpl#getTypes <em>Types</em>}</li>
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
public class StoreImpl extends StandartInstructionImpl implements Store {
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
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeList> types;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__NEWTYPE, oldNewtype, newNewtype);
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
				msgs = ((InternalEObject)newtype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__NEWTYPE, null, msgs);
			if (newNewtype != null)
				msgs = ((InternalEObject)newNewtype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__NEWTYPE, null, msgs);
			msgs = basicSetNewtype(newNewtype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__NEWTYPE, newNewtype, newNewtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeList> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<TypeList>(TypeList.class, this, LlvmPackage.STORE__TYPES);
		}
		return types;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__NEWVALUE, oldNewvalue, newNewvalue);
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
				msgs = ((InternalEObject)newvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__NEWVALUE, null, msgs);
			if (newNewvalue != null)
				msgs = ((InternalEObject)newNewvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__NEWVALUE, null, msgs);
			msgs = basicSetNewvalue(newNewvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__NEWVALUE, newNewvalue, newNewvalue));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ADRESSTYPE, oldAdresstype, newAdresstype);
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
				msgs = ((InternalEObject)adresstype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__ADRESSTYPE, null, msgs);
			if (newAdresstype != null)
				msgs = ((InternalEObject)newAdresstype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__ADRESSTYPE, null, msgs);
			msgs = basicSetAdresstype(newAdresstype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ADRESSTYPE, newAdresstype, newAdresstype));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ADRESS, oldAdress, newAdress);
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
				msgs = ((InternalEObject)adress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__ADRESS, null, msgs);
			if (newAdress != null)
				msgs = ((InternalEObject)newAdress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.STORE__ADRESS, null, msgs);
			msgs = basicSetAdress(newAdress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.STORE__ADRESS, newAdress, newAdress));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.STORE__NEWTYPE:
				return basicSetNewtype(null, msgs);
			case LlvmPackage.STORE__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case LlvmPackage.STORE__NEWVALUE:
				return basicSetNewvalue(null, msgs);
			case LlvmPackage.STORE__ADRESSTYPE:
				return basicSetAdresstype(null, msgs);
			case LlvmPackage.STORE__ADRESS:
				return basicSetAdress(null, msgs);
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
			case LlvmPackage.STORE__NEWTYPE:
				return getNewtype();
			case LlvmPackage.STORE__TYPES:
				return getTypes();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LlvmPackage.STORE__NEWTYPE:
				setNewtype((TypeUse)newValue);
				return;
			case LlvmPackage.STORE__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends TypeList>)newValue);
				return;
			case LlvmPackage.STORE__NEWVALUE:
				setNewvalue((Value)newValue);
				return;
			case LlvmPackage.STORE__ADRESSTYPE:
				setAdresstype((TypeUse)newValue);
				return;
			case LlvmPackage.STORE__ADRESS:
				setAdress((Value)newValue);
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
				setNewtype((TypeUse)null);
				return;
			case LlvmPackage.STORE__TYPES:
				getTypes().clear();
				return;
			case LlvmPackage.STORE__NEWVALUE:
				setNewvalue((Value)null);
				return;
			case LlvmPackage.STORE__ADRESSTYPE:
				setAdresstype((TypeUse)null);
				return;
			case LlvmPackage.STORE__ADRESS:
				setAdress((Value)null);
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
				return newtype != null;
			case LlvmPackage.STORE__TYPES:
				return types != null && !types.isEmpty();
			case LlvmPackage.STORE__NEWVALUE:
				return newvalue != null;
			case LlvmPackage.STORE__ADRESSTYPE:
				return adresstype != null;
			case LlvmPackage.STORE__ADRESS:
				return adress != null;
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
		result.append(" (ordering: ");
		result.append(ordering);
		result.append(", index: ");
		result.append(index);
		result.append(')');
		return result.toString();
	}

} //StoreImpl
