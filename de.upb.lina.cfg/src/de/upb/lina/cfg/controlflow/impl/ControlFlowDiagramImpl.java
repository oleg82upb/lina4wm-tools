/**
 */
package de.upb.lina.cfg.controlflow.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Flow Diagram</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getLocations <em>Locations</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getVariableCopies <em>Variable Copies</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getVariableCopyParams <em>Variable Copy Params</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getMemoryModel <em>Memory Model</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlFlowDiagramImpl extends EObjectImpl implements ControlFlowDiagram {
	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlFlowLocation> locations;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected ControlFlowLocation start;

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
	 * The cached value of the '{@link #getVariableCopies() <em>Variable Copies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCopies()
	 * @generated
	 * @ordered
	 */
	protected EList<Address> variableCopies;

	/**
	 * The cached value of the '{@link #getVariableCopyParams() <em>Variable Copy Params</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableCopyParams()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> variableCopyParams;

	/**
	 * The default value of the '{@link #getMemoryModel() <em>Memory Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryModel()
	 * @generated
	 * @ordered
	 */
	protected static final int MEMORY_MODEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMemoryModel() <em>Memory Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemoryModel()
	 * @generated
	 * @ordered
	 */
	protected int memoryModel = MEMORY_MODEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlFlowDiagramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.CONTROL_FLOW_DIAGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ControlFlowLocation> getLocations() {
		if (locations == null)
		{
			locations = new EObjectContainmentWithInverseEList<ControlFlowLocation>(ControlFlowLocation.class, this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS, ControlflowPackage.CONTROL_FLOW_LOCATION__DIAGRAM);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null)
		{
			transitions = new EObjectContainmentWithInverseEList<Transition>(Transition.class, this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS, ControlflowPackage.TRANSITION__DIAGRAM);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation getStart() {
		if (start != null && start.eIsProxy())
		{
			InternalEObject oldStart = (InternalEObject)start;
			start = (ControlFlowLocation)eResolveProxy(oldStart);
			if (start != oldStart)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.CONTROL_FLOW_DIAGRAM__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlowLocation basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(ControlFlowLocation newStart) {
		ControlFlowLocation oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROL_FLOW_DIAGRAM__START, oldStart, start));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROL_FLOW_DIAGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Address> getVariableCopies() {
		if (variableCopies == null)
		{
			variableCopies = new EObjectContainmentEList<Address>(Address.class, this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES);
		}
		return variableCopies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getVariableCopyParams() {
		if (variableCopyParams == null)
		{
			variableCopyParams = new EObjectContainmentEList<Parameter>(Parameter.class, this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPY_PARAMS);
		}
		return variableCopyParams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMemoryModel()
	{
		return memoryModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemoryModel(int newMemoryModel)
	{
		int oldMemoryModel = memoryModel;
		memoryModel = newMemoryModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROL_FLOW_DIAGRAM__MEMORY_MODEL, oldMemoryModel, memoryModel));
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
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getLocations()).basicAdd(otherEnd, msgs);
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
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
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES:
				return ((InternalEList<?>)getVariableCopies()).basicRemove(otherEnd, msgs);
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPY_PARAMS:
				return ((InternalEList<?>)getVariableCopyParams()).basicRemove(otherEnd, msgs);
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
		switch (featureID)
		{
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS:
				return getLocations();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS:
				return getTransitions();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__START:
				if (resolve) return getStart();
				return basicGetStart();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__NAME:
				return getName();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES:
				return getVariableCopies();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPY_PARAMS:
				return getVariableCopyParams();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__MEMORY_MODEL:
				return getMemoryModel();
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
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends ControlFlowLocation>)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__START:
				setStart((ControlFlowLocation)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__NAME:
				setName((String)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES:
				getVariableCopies().clear();
				getVariableCopies().addAll((Collection<? extends Address>)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPY_PARAMS:
				getVariableCopyParams().clear();
				getVariableCopyParams().addAll((Collection<? extends Parameter>)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__MEMORY_MODEL:
				setMemoryModel((Integer)newValue);
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
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS:
				getLocations().clear();
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS:
				getTransitions().clear();
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__START:
				setStart((ControlFlowLocation)null);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES:
				getVariableCopies().clear();
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPY_PARAMS:
				getVariableCopyParams().clear();
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__MEMORY_MODEL:
				setMemoryModel(MEMORY_MODEL_EDEFAULT);
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
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCATIONS:
				return locations != null && !locations.isEmpty();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__START:
				return start != null;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPIES:
				return variableCopies != null && !variableCopies.isEmpty();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__VARIABLE_COPY_PARAMS:
				return variableCopyParams != null && !variableCopyParams.isEmpty();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__MEMORY_MODEL:
				return memoryModel != MEMORY_MODEL_EDEFAULT;
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
		result.append(", memoryModel: ");
		result.append(memoryModel);
		result.append(')');
		return result.toString();
	}

} //ControlFlowDiagramImpl
