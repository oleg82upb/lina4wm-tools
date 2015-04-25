/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;

import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.Label;

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
 *   <li>{@link de.upb.lina.cfg.gendata.impl.LabelImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.LabelImpl#getControlFlowLocation <em>Control Flow Location</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.LabelImpl#getControlFlowDiagram <em>Control Flow Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LabelImpl extends MinimalEObjectImpl.Container implements Label
{
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
	 * The cached value of the '{@link #getControlFlowDiagram() <em>Control Flow Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControlFlowDiagram()
	 * @generated
	 * @ordered
	 */
	protected ControlFlowDiagram controlFlowDiagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return GendataPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.LABEL__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation getControlFlowLocation()
	{
		if (controlFlowLocation != null && controlFlowLocation.eIsProxy()) {
			InternalEObject oldControlFlowLocation = (InternalEObject)controlFlowLocation;
			controlFlowLocation = (ControlFlowLocation)eResolveProxy(oldControlFlowLocation);
			if (controlFlowLocation != oldControlFlowLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.LABEL__CONTROL_FLOW_LOCATION, oldControlFlowLocation, controlFlowLocation));
			}
		}
		return controlFlowLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation basicGetControlFlowLocation()
	{
		return controlFlowLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlFlowLocation(ControlFlowLocation newControlFlowLocation)
	{
		ControlFlowLocation oldControlFlowLocation = controlFlowLocation;
		controlFlowLocation = newControlFlowLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.LABEL__CONTROL_FLOW_LOCATION, oldControlFlowLocation, controlFlowLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowDiagram getControlFlowDiagram() {
		if (controlFlowDiagram != null && controlFlowDiagram.eIsProxy()) {
			InternalEObject oldControlFlowDiagram = (InternalEObject)controlFlowDiagram;
			controlFlowDiagram = (ControlFlowDiagram)eResolveProxy(oldControlFlowDiagram);
			if (controlFlowDiagram != oldControlFlowDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.LABEL__CONTROL_FLOW_DIAGRAM, oldControlFlowDiagram, controlFlowDiagram));
			}
		}
		return controlFlowDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowDiagram basicGetControlFlowDiagram() {
		return controlFlowDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setControlFlowDiagram(ControlFlowDiagram newControlFlowDiagram) {
		ControlFlowDiagram oldControlFlowDiagram = controlFlowDiagram;
		controlFlowDiagram = newControlFlowDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.LABEL__CONTROL_FLOW_DIAGRAM, oldControlFlowDiagram, controlFlowDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case GendataPackage.LABEL__NAME:
				return getName();
			case GendataPackage.LABEL__CONTROL_FLOW_LOCATION:
				if (resolve) return getControlFlowLocation();
				return basicGetControlFlowLocation();
			case GendataPackage.LABEL__CONTROL_FLOW_DIAGRAM:
				if (resolve) return getControlFlowDiagram();
				return basicGetControlFlowDiagram();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case GendataPackage.LABEL__NAME:
				setName((String)newValue);
				return;
			case GendataPackage.LABEL__CONTROL_FLOW_LOCATION:
				setControlFlowLocation((ControlFlowLocation)newValue);
				return;
			case GendataPackage.LABEL__CONTROL_FLOW_DIAGRAM:
				setControlFlowDiagram((ControlFlowDiagram)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case GendataPackage.LABEL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GendataPackage.LABEL__CONTROL_FLOW_LOCATION:
				setControlFlowLocation((ControlFlowLocation)null);
				return;
			case GendataPackage.LABEL__CONTROL_FLOW_DIAGRAM:
				setControlFlowDiagram((ControlFlowDiagram)null);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case GendataPackage.LABEL__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GendataPackage.LABEL__CONTROL_FLOW_LOCATION:
				return controlFlowLocation != null;
			case GendataPackage.LABEL__CONTROL_FLOW_DIAGRAM:
				return controlFlowDiagram != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LabelImpl
