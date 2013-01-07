/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.LlvmPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getDestinationtype <em>Destinationtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getCondtype <em>Condtype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getCondvalue <em>Condvalue</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getLabelTruetype <em>Label Truetype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getLabelTrue <em>Label True</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getLabelFalsetype <em>Label Falsetype</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getLabelFalse <em>Label False</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BranchImpl extends Ret_InstrImpl implements Branch {
	/**
	 * The default value of the '{@link #getDestinationtype() <em>Destinationtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationtype()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATIONTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestinationtype() <em>Destinationtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinationtype()
	 * @generated
	 * @ordered
	 */
	protected String destinationtype = DESTINATIONTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondtype() <em>Condtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondtype()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDTYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondtype() <em>Condtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondtype()
	 * @generated
	 * @ordered
	 */
	protected String condtype = CONDTYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCondvalue() <em>Condvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondvalue()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondvalue() <em>Condvalue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondvalue()
	 * @generated
	 * @ordered
	 */
	protected String condvalue = CONDVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelTruetype() <em>Label Truetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelTruetype()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_TRUETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelTruetype() <em>Label Truetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelTruetype()
	 * @generated
	 * @ordered
	 */
	protected String labelTruetype = LABEL_TRUETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelTrue() <em>Label True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelTrue()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_TRUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelTrue() <em>Label True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelTrue()
	 * @generated
	 * @ordered
	 */
	protected String labelTrue = LABEL_TRUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelFalsetype() <em>Label Falsetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFalsetype()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_FALSETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelFalsetype() <em>Label Falsetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFalsetype()
	 * @generated
	 * @ordered
	 */
	protected String labelFalsetype = LABEL_FALSETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabelFalse() <em>Label False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFalse()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_FALSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelFalse() <em>Label False</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFalse()
	 * @generated
	 * @ordered
	 */
	protected String labelFalse = LABEL_FALSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestinationtype() {
		return destinationtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinationtype(String newDestinationtype) {
		String oldDestinationtype = destinationtype;
		destinationtype = newDestinationtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__DESTINATIONTYPE, oldDestinationtype, destinationtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondtype() {
		return condtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondtype(String newCondtype) {
		String oldCondtype = condtype;
		condtype = newCondtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__CONDTYPE, oldCondtype, condtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondvalue() {
		return condvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondvalue(String newCondvalue) {
		String oldCondvalue = condvalue;
		condvalue = newCondvalue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__CONDVALUE, oldCondvalue, condvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelTruetype() {
		return labelTruetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelTruetype(String newLabelTruetype) {
		String oldLabelTruetype = labelTruetype;
		labelTruetype = newLabelTruetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_TRUETYPE, oldLabelTruetype, labelTruetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelTrue() {
		return labelTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelTrue(String newLabelTrue) {
		String oldLabelTrue = labelTrue;
		labelTrue = newLabelTrue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_TRUE, oldLabelTrue, labelTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelFalsetype() {
		return labelFalsetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFalsetype(String newLabelFalsetype) {
		String oldLabelFalsetype = labelFalsetype;
		labelFalsetype = newLabelFalsetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_FALSETYPE, oldLabelFalsetype, labelFalsetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabelFalse() {
		return labelFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFalse(String newLabelFalse) {
		String oldLabelFalse = labelFalse;
		labelFalse = newLabelFalse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_FALSE, oldLabelFalse, labelFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LlvmPackage.BRANCH__DESTINATIONTYPE:
				return getDestinationtype();
			case LlvmPackage.BRANCH__DESTINATION:
				return getDestination();
			case LlvmPackage.BRANCH__CONDTYPE:
				return getCondtype();
			case LlvmPackage.BRANCH__CONDVALUE:
				return getCondvalue();
			case LlvmPackage.BRANCH__LABEL_TRUETYPE:
				return getLabelTruetype();
			case LlvmPackage.BRANCH__LABEL_TRUE:
				return getLabelTrue();
			case LlvmPackage.BRANCH__LABEL_FALSETYPE:
				return getLabelFalsetype();
			case LlvmPackage.BRANCH__LABEL_FALSE:
				return getLabelFalse();
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
			case LlvmPackage.BRANCH__DESTINATIONTYPE:
				setDestinationtype((String)newValue);
				return;
			case LlvmPackage.BRANCH__DESTINATION:
				setDestination((String)newValue);
				return;
			case LlvmPackage.BRANCH__CONDTYPE:
				setCondtype((String)newValue);
				return;
			case LlvmPackage.BRANCH__CONDVALUE:
				setCondvalue((String)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUETYPE:
				setLabelTruetype((String)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUE:
				setLabelTrue((String)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSETYPE:
				setLabelFalsetype((String)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSE:
				setLabelFalse((String)newValue);
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
			case LlvmPackage.BRANCH__DESTINATIONTYPE:
				setDestinationtype(DESTINATIONTYPE_EDEFAULT);
				return;
			case LlvmPackage.BRANCH__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case LlvmPackage.BRANCH__CONDTYPE:
				setCondtype(CONDTYPE_EDEFAULT);
				return;
			case LlvmPackage.BRANCH__CONDVALUE:
				setCondvalue(CONDVALUE_EDEFAULT);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUETYPE:
				setLabelTruetype(LABEL_TRUETYPE_EDEFAULT);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUE:
				setLabelTrue(LABEL_TRUE_EDEFAULT);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSETYPE:
				setLabelFalsetype(LABEL_FALSETYPE_EDEFAULT);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSE:
				setLabelFalse(LABEL_FALSE_EDEFAULT);
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
			case LlvmPackage.BRANCH__DESTINATIONTYPE:
				return DESTINATIONTYPE_EDEFAULT == null ? destinationtype != null : !DESTINATIONTYPE_EDEFAULT.equals(destinationtype);
			case LlvmPackage.BRANCH__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case LlvmPackage.BRANCH__CONDTYPE:
				return CONDTYPE_EDEFAULT == null ? condtype != null : !CONDTYPE_EDEFAULT.equals(condtype);
			case LlvmPackage.BRANCH__CONDVALUE:
				return CONDVALUE_EDEFAULT == null ? condvalue != null : !CONDVALUE_EDEFAULT.equals(condvalue);
			case LlvmPackage.BRANCH__LABEL_TRUETYPE:
				return LABEL_TRUETYPE_EDEFAULT == null ? labelTruetype != null : !LABEL_TRUETYPE_EDEFAULT.equals(labelTruetype);
			case LlvmPackage.BRANCH__LABEL_TRUE:
				return LABEL_TRUE_EDEFAULT == null ? labelTrue != null : !LABEL_TRUE_EDEFAULT.equals(labelTrue);
			case LlvmPackage.BRANCH__LABEL_FALSETYPE:
				return LABEL_FALSETYPE_EDEFAULT == null ? labelFalsetype != null : !LABEL_FALSETYPE_EDEFAULT.equals(labelFalsetype);
			case LlvmPackage.BRANCH__LABEL_FALSE:
				return LABEL_FALSE_EDEFAULT == null ? labelFalse != null : !LABEL_FALSE_EDEFAULT.equals(labelFalse);
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
		result.append(" (destinationtype: ");
		result.append(destinationtype);
		result.append(", destination: ");
		result.append(destination);
		result.append(", condtype: ");
		result.append(condtype);
		result.append(", condvalue: ");
		result.append(condvalue);
		result.append(", labelTruetype: ");
		result.append(labelTruetype);
		result.append(", labelTrue: ");
		result.append(labelTrue);
		result.append(", labelFalsetype: ");
		result.append(labelFalsetype);
		result.append(", labelFalse: ");
		result.append(labelFalse);
		result.append(')');
		return result.toString();
	}

} //BranchImpl
