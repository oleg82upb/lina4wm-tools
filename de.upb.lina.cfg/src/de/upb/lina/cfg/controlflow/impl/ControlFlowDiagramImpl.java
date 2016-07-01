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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.upb.lina.cfg.controlflow.AddressRenaming;
import de.upb.lina.cfg.controlflow.ControlFlowDiagram;
import de.upb.lina.cfg.controlflow.ControlFlowLocation;
import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.Transition;
import de.upb.lina.cfg.controlflow.Variable;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.FunctionDefinition;
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
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getFunctionDefinition <em>Function Definition</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getLabelPrefix <em>Label Prefix</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getReturnVariable <em>Return Variable</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getParameterVariables <em>Parameter Variables</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.ControlFlowDiagramImpl#getLocalVariables <em>Local Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ControlFlowDiagramImpl extends AbstractLabeledElementImpl implements ControlFlowDiagram {
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
	 * The cached value of the '{@link #getFunctionDefinition() <em>Function Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionDefinition()
	 * @generated
	 * @ordered
	 */
	protected FunctionDefinition functionDefinition;

	/**
	 * The default value of the '{@link #getLabelPrefix() <em>Label Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabelPrefix() <em>Label Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelPrefix()
	 * @generated
	 * @ordered
	 */
	protected String labelPrefix = LABEL_PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReturnVariable() <em>Return Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable returnVariable;

	/**
	 * The cached value of the '{@link #getParameterVariables() <em>Parameter Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> parameterVariables;

	/**
	 * The cached value of the '{@link #getLocalVariables() <em>Local Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> localVariables;

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
	@Override
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
	@Override
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
	@Override
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
	@Override
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
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
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
	@Override
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
	@Override
	public int getMemoryModel()
	{
		return memoryModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	@Override
	public FunctionDefinition getFunctionDefinition()
	{
		if (functionDefinition != null && functionDefinition.eIsProxy())
		{
			InternalEObject oldFunctionDefinition = (InternalEObject)functionDefinition;
			functionDefinition = (FunctionDefinition)eResolveProxy(oldFunctionDefinition);
			if (functionDefinition != oldFunctionDefinition)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.CONTROL_FLOW_DIAGRAM__FUNCTION_DEFINITION, oldFunctionDefinition, functionDefinition));
			}
		}
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionDefinition basicGetFunctionDefinition()
	{
		return functionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFunctionDefinition(FunctionDefinition newFunctionDefinition)
	{
		FunctionDefinition oldFunctionDefinition = functionDefinition;
		functionDefinition = newFunctionDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROL_FLOW_DIAGRAM__FUNCTION_DEFINITION, oldFunctionDefinition, functionDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabelPrefix()
	{
		return labelPrefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabelPrefix(String newLabelPrefix)
	{
		String oldLabelPrefix = labelPrefix;
		labelPrefix = newLabelPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROL_FLOW_DIAGRAM__LABEL_PREFIX, oldLabelPrefix, labelPrefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getReturnVariable()
	{
		if (returnVariable != null && returnVariable.eIsProxy())
		{
			InternalEObject oldReturnVariable = (InternalEObject)returnVariable;
			returnVariable = (Variable)eResolveProxy(oldReturnVariable);
			if (returnVariable != oldReturnVariable)
			{
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ControlflowPackage.CONTROL_FLOW_DIAGRAM__RETURN_VARIABLE, oldReturnVariable, returnVariable));
			}
		}
		return returnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetReturnVariable()
	{
		return returnVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnVariable(Variable newReturnVariable)
	{
		Variable oldReturnVariable = returnVariable;
		returnVariable = newReturnVariable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.CONTROL_FLOW_DIAGRAM__RETURN_VARIABLE, oldReturnVariable, returnVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getParameterVariables()
	{
		if (parameterVariables == null)
		{
			parameterVariables = new EObjectResolvingEList<Variable>(Variable.class, this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__PARAMETER_VARIABLES);
		}
		return parameterVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getLocalVariables()
	{
		if (localVariables == null)
		{
			localVariables = new EObjectResolvingEList<Variable>(Variable.class, this, ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCAL_VARIABLES);
		}
		return localVariables;
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
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__FUNCTION_DEFINITION:
				if (resolve) return getFunctionDefinition();
				return basicGetFunctionDefinition();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LABEL_PREFIX:
				return getLabelPrefix();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__RETURN_VARIABLE:
				if (resolve) return getReturnVariable();
				return basicGetReturnVariable();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__PARAMETER_VARIABLES:
				return getParameterVariables();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCAL_VARIABLES:
				return getLocalVariables();
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
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__FUNCTION_DEFINITION:
				setFunctionDefinition((FunctionDefinition)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LABEL_PREFIX:
				setLabelPrefix((String)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__RETURN_VARIABLE:
				setReturnVariable((Variable)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__PARAMETER_VARIABLES:
				getParameterVariables().clear();
				getParameterVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCAL_VARIABLES:
				getLocalVariables().clear();
				getLocalVariables().addAll((Collection<? extends Variable>)newValue);
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
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__FUNCTION_DEFINITION:
				setFunctionDefinition((FunctionDefinition)null);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LABEL_PREFIX:
				setLabelPrefix(LABEL_PREFIX_EDEFAULT);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__RETURN_VARIABLE:
				setReturnVariable((Variable)null);
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__PARAMETER_VARIABLES:
				getParameterVariables().clear();
				return;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCAL_VARIABLES:
				getLocalVariables().clear();
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
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__FUNCTION_DEFINITION:
				return functionDefinition != null;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LABEL_PREFIX:
				return LABEL_PREFIX_EDEFAULT == null ? labelPrefix != null : !LABEL_PREFIX_EDEFAULT.equals(labelPrefix);
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__RETURN_VARIABLE:
				return returnVariable != null;
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__PARAMETER_VARIABLES:
				return parameterVariables != null && !parameterVariables.isEmpty();
			case ControlflowPackage.CONTROL_FLOW_DIAGRAM__LOCAL_VARIABLES:
				return localVariables != null && !localVariables.isEmpty();
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
		result.append(", labelPrefix: ");
		result.append(labelPrefix);
		result.append(')');
		return result.toString();
	}

} //ControlFlowDiagramImpl
