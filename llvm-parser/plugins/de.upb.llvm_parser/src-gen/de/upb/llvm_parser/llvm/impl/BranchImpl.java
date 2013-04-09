/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.Branch;
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
 * An implementation of the model object '<em><b>Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BranchImpl#getDestination <em>Destination</em>}</li>
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
public class BranchImpl extends ReturnInstructionImpl implements Branch {
	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Value destination;

	/**
	 * The cached value of the '{@link #getCondvalue() <em>Condvalue</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondvalue()
	 * @generated
	 * @ordered
	 */
	protected Value condvalue;

	/**
	 * The cached value of the '{@link #getLabelTruetype() <em>Label Truetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelTruetype()
	 * @generated
	 * @ordered
	 */
	protected TypeUse labelTruetype;

	/**
	 * The cached value of the '{@link #getLabelTrue() <em>Label True</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelTrue()
	 * @generated
	 * @ordered
	 */
	protected Value labelTrue;

	/**
	 * The cached value of the '{@link #getLabelFalsetype() <em>Label Falsetype</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFalsetype()
	 * @generated
	 * @ordered
	 */
	protected TypeUse labelFalsetype;

	/**
	 * The cached value of the '{@link #getLabelFalse() <em>Label False</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFalse()
	 * @generated
	 * @ordered
	 */
	protected Value labelFalse;

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
	public Value getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Value newDestination, NotificationChain msgs) {
		Value oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Value newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__DESTINATION, null, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__DESTINATION, null, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getCondvalue() {
		return condvalue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondvalue(Value newCondvalue, NotificationChain msgs) {
		Value oldCondvalue = condvalue;
		condvalue = newCondvalue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__CONDVALUE, oldCondvalue, newCondvalue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondvalue(Value newCondvalue) {
		if (newCondvalue != condvalue) {
			NotificationChain msgs = null;
			if (condvalue != null)
				msgs = ((InternalEObject)condvalue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__CONDVALUE, null, msgs);
			if (newCondvalue != null)
				msgs = ((InternalEObject)newCondvalue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__CONDVALUE, null, msgs);
			msgs = basicSetCondvalue(newCondvalue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__CONDVALUE, newCondvalue, newCondvalue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getLabelTruetype() {
		return labelTruetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelTruetype(TypeUse newLabelTruetype, NotificationChain msgs) {
		TypeUse oldLabelTruetype = labelTruetype;
		labelTruetype = newLabelTruetype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_TRUETYPE, oldLabelTruetype, newLabelTruetype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelTruetype(TypeUse newLabelTruetype) {
		if (newLabelTruetype != labelTruetype) {
			NotificationChain msgs = null;
			if (labelTruetype != null)
				msgs = ((InternalEObject)labelTruetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_TRUETYPE, null, msgs);
			if (newLabelTruetype != null)
				msgs = ((InternalEObject)newLabelTruetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_TRUETYPE, null, msgs);
			msgs = basicSetLabelTruetype(newLabelTruetype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_TRUETYPE, newLabelTruetype, newLabelTruetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getLabelTrue() {
		return labelTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelTrue(Value newLabelTrue, NotificationChain msgs) {
		Value oldLabelTrue = labelTrue;
		labelTrue = newLabelTrue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_TRUE, oldLabelTrue, newLabelTrue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelTrue(Value newLabelTrue) {
		if (newLabelTrue != labelTrue) {
			NotificationChain msgs = null;
			if (labelTrue != null)
				msgs = ((InternalEObject)labelTrue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_TRUE, null, msgs);
			if (newLabelTrue != null)
				msgs = ((InternalEObject)newLabelTrue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_TRUE, null, msgs);
			msgs = basicSetLabelTrue(newLabelTrue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_TRUE, newLabelTrue, newLabelTrue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeUse getLabelFalsetype() {
		return labelFalsetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelFalsetype(TypeUse newLabelFalsetype, NotificationChain msgs) {
		TypeUse oldLabelFalsetype = labelFalsetype;
		labelFalsetype = newLabelFalsetype;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_FALSETYPE, oldLabelFalsetype, newLabelFalsetype);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFalsetype(TypeUse newLabelFalsetype) {
		if (newLabelFalsetype != labelFalsetype) {
			NotificationChain msgs = null;
			if (labelFalsetype != null)
				msgs = ((InternalEObject)labelFalsetype).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_FALSETYPE, null, msgs);
			if (newLabelFalsetype != null)
				msgs = ((InternalEObject)newLabelFalsetype).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_FALSETYPE, null, msgs);
			msgs = basicSetLabelFalsetype(newLabelFalsetype, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_FALSETYPE, newLabelFalsetype, newLabelFalsetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Value getLabelFalse() {
		return labelFalse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelFalse(Value newLabelFalse, NotificationChain msgs) {
		Value oldLabelFalse = labelFalse;
		labelFalse = newLabelFalse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_FALSE, oldLabelFalse, newLabelFalse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFalse(Value newLabelFalse) {
		if (newLabelFalse != labelFalse) {
			NotificationChain msgs = null;
			if (labelFalse != null)
				msgs = ((InternalEObject)labelFalse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_FALSE, null, msgs);
			if (newLabelFalse != null)
				msgs = ((InternalEObject)newLabelFalse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BRANCH__LABEL_FALSE, null, msgs);
			msgs = basicSetLabelFalse(newLabelFalse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BRANCH__LABEL_FALSE, newLabelFalse, newLabelFalse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.BRANCH__DESTINATION:
				return basicSetDestination(null, msgs);
			case LlvmPackage.BRANCH__CONDVALUE:
				return basicSetCondvalue(null, msgs);
			case LlvmPackage.BRANCH__LABEL_TRUETYPE:
				return basicSetLabelTruetype(null, msgs);
			case LlvmPackage.BRANCH__LABEL_TRUE:
				return basicSetLabelTrue(null, msgs);
			case LlvmPackage.BRANCH__LABEL_FALSETYPE:
				return basicSetLabelFalsetype(null, msgs);
			case LlvmPackage.BRANCH__LABEL_FALSE:
				return basicSetLabelFalse(null, msgs);
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
			case LlvmPackage.BRANCH__DESTINATION:
				return getDestination();
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
			case LlvmPackage.BRANCH__DESTINATION:
				setDestination((Value)newValue);
				return;
			case LlvmPackage.BRANCH__CONDVALUE:
				setCondvalue((Value)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUETYPE:
				setLabelTruetype((TypeUse)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUE:
				setLabelTrue((Value)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSETYPE:
				setLabelFalsetype((TypeUse)newValue);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSE:
				setLabelFalse((Value)newValue);
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
			case LlvmPackage.BRANCH__DESTINATION:
				setDestination((Value)null);
				return;
			case LlvmPackage.BRANCH__CONDVALUE:
				setCondvalue((Value)null);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUETYPE:
				setLabelTruetype((TypeUse)null);
				return;
			case LlvmPackage.BRANCH__LABEL_TRUE:
				setLabelTrue((Value)null);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSETYPE:
				setLabelFalsetype((TypeUse)null);
				return;
			case LlvmPackage.BRANCH__LABEL_FALSE:
				setLabelFalse((Value)null);
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
			case LlvmPackage.BRANCH__DESTINATION:
				return destination != null;
			case LlvmPackage.BRANCH__CONDVALUE:
				return condvalue != null;
			case LlvmPackage.BRANCH__LABEL_TRUETYPE:
				return labelTruetype != null;
			case LlvmPackage.BRANCH__LABEL_TRUE:
				return labelTrue != null;
			case LlvmPackage.BRANCH__LABEL_FALSETYPE:
				return labelFalsetype != null;
			case LlvmPackage.BRANCH__LABEL_FALSE:
				return labelFalse != null;
		}
		return super.eIsSet(featureID);
	}

} //BranchImpl
