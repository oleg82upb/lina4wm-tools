/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.Transition;

import de.upb.llvm_parser.llvm.Instruction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.TransitionImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.TransitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.TransitionImpl#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends EObjectImpl implements Transition {
	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected Instruction instruction;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected ControlFlowLocation source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected ControlFlowLocation target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction getInstruction() {
		if (instruction != null && instruction.eIsProxy()) {
			InternalEObject oldInstruction = (InternalEObject)instruction;
			instruction = (Instruction)eResolveProxy(oldInstruction);
			if (instruction != oldInstruction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.TRANSITION__INSTRUCTION, oldInstruction, instruction));
			}
		}
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction basicGetInstruction() {
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstruction(Instruction newInstruction) {
		Instruction oldInstruction = instruction;
		instruction = newInstruction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.TRANSITION__INSTRUCTION, oldInstruction, instruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (ControlFlowLocation)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(ControlFlowLocation newSource, NotificationChain msgs)
	{
		ControlFlowLocation oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(ControlFlowLocation newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING, ControlFlowLocation.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING, ControlFlowLocation.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (ControlFlowLocation)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(ControlFlowLocation newTarget, NotificationChain msgs)
	{
		ControlFlowLocation oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ControlflowPackage.TRANSITION__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(ControlFlowLocation newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING, ControlFlowLocation.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING, ControlFlowLocation.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.TRANSITION__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowDiagram getDiagram() {
		if (eContainerFeatureID() != ControlflowPackage.TRANSITION__DIAGRAM) return null;
		return (ControlFlowDiagram)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiagram(ControlFlowDiagram newDiagram, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDiagram, ControlflowPackage.TRANSITION__DIAGRAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(ControlFlowDiagram newDiagram) {
		if (newDiagram != eInternalContainer() || (eContainerFeatureID() != ControlflowPackage.TRANSITION__DIAGRAM && newDiagram != null)) {
			if (EcoreUtil.isAncestor(this, newDiagram))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDiagram != null)
				msgs = ((InternalEObject)newDiagram).eInverseAdd(this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS, ControlFlowDiagram.class, msgs);
			msgs = basicSetDiagram(newDiagram, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.TRANSITION__DIAGRAM, newDiagram, newDiagram));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ControlflowPackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, ControlflowPackage.CONTROL_FLOW_LOCATION__OUTGOING, ControlFlowLocation.class, msgs);
				return basicSetSource((ControlFlowLocation)otherEnd, msgs);
			case ControlflowPackage.TRANSITION__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, ControlflowPackage.CONTROL_FLOW_LOCATION__INCOMING, ControlFlowLocation.class, msgs);
				return basicSetTarget((ControlFlowLocation)otherEnd, msgs);
			case ControlflowPackage.TRANSITION__DIAGRAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDiagram((ControlFlowDiagram)otherEnd, msgs);
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
		switch (featureID) {
			case ControlflowPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case ControlflowPackage.TRANSITION__TARGET:
				return basicSetTarget(null, msgs);
			case ControlflowPackage.TRANSITION__DIAGRAM:
				return basicSetDiagram(null, msgs);
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
		switch (eContainerFeatureID()) {
			case ControlflowPackage.TRANSITION__DIAGRAM:
				return eInternalContainer().eInverseRemove(this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS, ControlFlowDiagram.class, msgs);
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
		switch (featureID) {
			case ControlflowPackage.TRANSITION__INSTRUCTION:
				if (resolve) return getInstruction();
				return basicGetInstruction();
			case ControlflowPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case ControlflowPackage.TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case ControlflowPackage.TRANSITION__DIAGRAM:
				return getDiagram();
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
			case ControlflowPackage.TRANSITION__INSTRUCTION:
				setInstruction((Instruction)newValue);
				return;
			case ControlflowPackage.TRANSITION__SOURCE:
				setSource((ControlFlowLocation)newValue);
				return;
			case ControlflowPackage.TRANSITION__TARGET:
				setTarget((ControlFlowLocation)newValue);
				return;
			case ControlflowPackage.TRANSITION__DIAGRAM:
				setDiagram((ControlFlowDiagram)newValue);
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
			case ControlflowPackage.TRANSITION__INSTRUCTION:
				setInstruction((Instruction)null);
				return;
			case ControlflowPackage.TRANSITION__SOURCE:
				setSource((ControlFlowLocation)null);
				return;
			case ControlflowPackage.TRANSITION__TARGET:
				setTarget((ControlFlowLocation)null);
				return;
			case ControlflowPackage.TRANSITION__DIAGRAM:
				setDiagram((ControlFlowDiagram)null);
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
			case ControlflowPackage.TRANSITION__INSTRUCTION:
				return instruction != null;
			case ControlflowPackage.TRANSITION__SOURCE:
				return source != null;
			case ControlflowPackage.TRANSITION__TARGET:
				return target != null;
			case ControlflowPackage.TRANSITION__DIAGRAM:
				return getDiagram() != null;
		}
		return super.eIsSet(featureID);
	}

} //TransitionImpl
