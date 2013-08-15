/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowLocationImpl#getPc <em>Pc</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowLocationImpl#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowLocationImpl#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowLocationImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlFlowLocationImpl extends EObjectImpl implements ControlFlowLocation {
	/**
	 * The default value of the '{@link #getPc() <em>Pc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPc()
	 * @generated
	 * @ordered
	 */
	protected static final int PC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPc() <em>Pc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPc()
	 * @generated
	 * @ordered
	 */
	protected int pc = PC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncoming() <em>Incoming</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncoming()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> incoming;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> outgoing;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.CONTROL_FLOW_LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPc() {
		return pc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPc(int newPc) {
		int oldPc = pc;
		pc = newPc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROL_FLOW_LOCATION__PC, oldPc, pc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowDiagram getDiagram() {
		if (eContainerFeatureID() != ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM) return null;
		return (ControlFlowDiagram)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(ControlFlowDiagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(ControlFlowDiagram newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM && newDiagram != null))
		{
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS, ControlFlowDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getIncoming() {
		if (incoming == null)
		{
			incoming = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING, ControlflowPackage.TRANSITION__TARGET);
		}
		return incoming;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getOutgoing() {
		if (outgoing == null)
		{
			outgoing = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING, ControlflowPackage.TRANSITION__SOURCE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((ControlFlowDiagram)otherEnd, msgs);
			case ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncoming()).basicAdd(otherEnd, msgs);
			case ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoing()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID)
		{
			case ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM:
				return basicSetDiagram(null, msgs);
			case ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING:
				return ((InternalEList<?>)getIncoming()).basicRemove(otherEnd, msgs);
			case ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING:
				return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID())
		{
			case ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS, ControlFlowDiagram.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID)
		{
			case ControlflowPackage.CONTROL_FLOW_LOCATION__PC:
				return getPc();
			case ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM:
				return getDiagram();
			case ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING:
				return getIncoming();
			case ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING:
				return getOutgoing();
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
		switch (featureID)
		{
			case ControlflowPackage.CONTROL_FLOW_LOCATION__PC:
				setPc((Integer)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM:
				setDiagram((ControlFlowDiagram)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING:
				getIncoming().clear();
				getIncoming().addAll((Collection<? extends Transition>)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING:
				getOutgoing().clear();
				getOutgoing().addAll((Collection<? extends Transition>)newValue);
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
		switch (featureID)
		{
			case ControlflowPackage.CONTROL_FLOW_LOCATION__PC:
				setPc(PC_EDEFAULT);
				return;
			case ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM:
				setDiagram((ControlFlowDiagram)null);
				return;
			case ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING:
				getIncoming().clear();
				return;
			case ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING:
				getOutgoing().clear();
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
		switch (featureID)
		{
			case ControlflowPackage.CONTROL_FLOW_LOCATION__PC:
				return pc != PC_EDEFAULT;
			case ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM:
				return getDiagram() != null;
			case ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING:
				return incoming != null && !incoming.isEmpty();
			case ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING:
				return outgoing != null && !outgoing.isEmpty();
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
		result.append(" (pc: ");
		result.append(pc);
		result.append(')');
		return result.toString();
	}

} //ControlFlowLocationImpl
