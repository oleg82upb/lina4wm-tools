/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.ParameterList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.CallImpl#getPList <em>PList</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CallImpl extends InstructionImpl implements Call {
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
	 * The cached value of the '{@link #getPList() <em>PList</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPList()
	 * @generated
	 * @ordered
	 */
	protected ParameterList pList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.CALL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__ADRESSTYPE, oldAdresstype, adresstype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__ADRESS, oldAdress, adress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterList getPList() {
		return pList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPList(ParameterList newPList, NotificationChain msgs) {
		ParameterList oldPList = pList;
		pList = newPList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__PLIST, oldPList, newPList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPList(ParameterList newPList) {
		if (newPList != pList) {
			NotificationChain msgs = null;
			if (pList != null)
				msgs = ((InternalEObject)pList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__PLIST, null, msgs);
			if (newPList != null)
				msgs = ((InternalEObject)newPList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.CALL__PLIST, null, msgs);
			msgs = basicSetPList(newPList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.CALL__PLIST, newPList, newPList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.CALL__PLIST:
				return basicSetPList(null, msgs);
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
			case LlvmPackage.CALL__ADRESSTYPE:
				return getAdresstype();
			case LlvmPackage.CALL__ADRESS:
				return getAdress();
			case LlvmPackage.CALL__PLIST:
				return getPList();
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
			case LlvmPackage.CALL__ADRESSTYPE:
				setAdresstype((String)newValue);
				return;
			case LlvmPackage.CALL__ADRESS:
				setAdress((String)newValue);
				return;
			case LlvmPackage.CALL__PLIST:
				setPList((ParameterList)newValue);
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
			case LlvmPackage.CALL__ADRESSTYPE:
				setAdresstype(ADRESSTYPE_EDEFAULT);
				return;
			case LlvmPackage.CALL__ADRESS:
				setAdress(ADRESS_EDEFAULT);
				return;
			case LlvmPackage.CALL__PLIST:
				setPList((ParameterList)null);
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
			case LlvmPackage.CALL__ADRESSTYPE:
				return ADRESSTYPE_EDEFAULT == null ? adresstype != null : !ADRESSTYPE_EDEFAULT.equals(adresstype);
			case LlvmPackage.CALL__ADRESS:
				return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
			case LlvmPackage.CALL__PLIST:
				return pList != null;
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
		result.append(')');
		return result.toString();
	}

} //CallImpl
