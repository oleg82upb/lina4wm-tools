/**
 */
package helpermodel.impl;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;

import helpermodel.HelpermodelPackage;
import helpermodel.Label;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link helpermodel.impl.LabelImpl#getName <em>Name</em>}</li>
 *   <li>{@link helpermodel.impl.LabelImpl#getControlFlowLocation <em>Control Flow Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelImpl extends MinimalEObjectImpl.Container implements Label {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getControlFlowLocation() <em>Control Flow Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFlowLocation()
	 * @generated
	 * @ordered
	 */
	protected ControlFlowLocation controlFlowLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HelpermodelPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HelpermodelPackage.LABEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation getControlFlowLocation() {
		if (controlFlowLocation != null && controlFlowLocation.eIsProxy()) {
			InternalEObject oldControlFlowLocation = (InternalEObject)controlFlowLocation;
			controlFlowLocation = (ControlFlowLocation)eResolveProxy(oldControlFlowLocation);
			if (controlFlowLocation != oldControlFlowLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, HelpermodelPackage.LABEL__CONTROL_FLOW_LOCATION, oldControlFlowLocation, controlFlowLocation));
			}
		}
		return controlFlowLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation basicGetControlFlowLocation() {
		return controlFlowLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlFlowLocation(ControlFlowLocation newControlFlowLocation) {
		ControlFlowLocation oldControlFlowLocation = controlFlowLocation;
		controlFlowLocation = newControlFlowLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HelpermodelPackage.LABEL__CONTROL_FLOW_LOCATION, oldControlFlowLocation, controlFlowLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HelpermodelPackage.LABEL__NAME:
				return getName();
			case HelpermodelPackage.LABEL__CONTROL_FLOW_LOCATION:
				if (resolve) return getControlFlowLocation();
				return basicGetControlFlowLocation();
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
			case HelpermodelPackage.LABEL__NAME:
				setName((String)newValue);
				return;
			case HelpermodelPackage.LABEL__CONTROL_FLOW_LOCATION:
				setControlFlowLocation((ControlFlowLocation)newValue);
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
			case HelpermodelPackage.LABEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case HelpermodelPackage.LABEL__CONTROL_FLOW_LOCATION:
				setControlFlowLocation((ControlFlowLocation)null);
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
			case HelpermodelPackage.LABEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case HelpermodelPackage.LABEL__CONTROL_FLOW_LOCATION:
				return controlFlowLocation != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
