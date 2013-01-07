/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.LabelList;
import de.upb.llvm_parser.llvm.LlvmPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indirect Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl#getAdresstype <em>Adresstype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl#getAdress <em>Adress</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.IndirectBranchImpl#getLList <em>LList</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndirectBranchImpl extends Ret_InstrImpl implements IndirectBranch {
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
	 * The cached value of the '{@link #getLList() <em>LList</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLList()
	 * @generated
	 * @ordered
	 */
	protected LabelList lList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndirectBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.INDIRECT_BRANCH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE, oldAdresstype, adresstype));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INDIRECT_BRANCH__ADRESS, oldAdress, adress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelList getLList() {
		return lList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLList(LabelList newLList, NotificationChain msgs) {
		LabelList oldLList = lList;
		lList = newLList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.INDIRECT_BRANCH__LLIST, oldLList, newLList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLList(LabelList newLList) {
		if (newLList != lList) {
			NotificationChain msgs = null;
			if (lList != null)
				msgs = ((InternalEObject)lList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INDIRECT_BRANCH__LLIST, null, msgs);
			if (newLList != null)
				msgs = ((InternalEObject)newLList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.INDIRECT_BRANCH__LLIST, null, msgs);
			msgs = basicSetLList(newLList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.INDIRECT_BRANCH__LLIST, newLList, newLList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.INDIRECT_BRANCH__LLIST:
				return basicSetLList(null, msgs);
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
			case LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE:
				return getAdresstype();
			case LlvmPackage.INDIRECT_BRANCH__ADRESS:
				return getAdress();
			case LlvmPackage.INDIRECT_BRANCH__LLIST:
				return getLList();
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
			case LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE:
				setAdresstype((String)newValue);
				return;
			case LlvmPackage.INDIRECT_BRANCH__ADRESS:
				setAdress((String)newValue);
				return;
			case LlvmPackage.INDIRECT_BRANCH__LLIST:
				setLList((LabelList)newValue);
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
			case LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE:
				setAdresstype(ADRESSTYPE_EDEFAULT);
				return;
			case LlvmPackage.INDIRECT_BRANCH__ADRESS:
				setAdress(ADRESS_EDEFAULT);
				return;
			case LlvmPackage.INDIRECT_BRANCH__LLIST:
				setLList((LabelList)null);
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
			case LlvmPackage.INDIRECT_BRANCH__ADRESSTYPE:
				return ADRESSTYPE_EDEFAULT == null ? adresstype != null : !ADRESSTYPE_EDEFAULT.equals(adresstype);
			case LlvmPackage.INDIRECT_BRANCH__ADRESS:
				return ADRESS_EDEFAULT == null ? adress != null : !ADRESS_EDEFAULT.equals(adress);
			case LlvmPackage.INDIRECT_BRANCH__LLIST:
				return lList != null;
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

} //IndirectBranchImpl
