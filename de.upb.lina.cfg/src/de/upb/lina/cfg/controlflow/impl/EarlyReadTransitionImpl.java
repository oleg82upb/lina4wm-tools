/**
 */
package de.upb.lina.cfg.controlflow.impl;


import de.upb.lina.cfg.controlflow.ControlflowPackage;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Early Read Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.EarlyReadTransitionImpl#getAssignmentExpression <em>Assignment Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EarlyReadTransitionImpl extends TransitionImpl implements EarlyReadTransition {
	/**
	 * The default value of the '{@link #getAssignmentExpression() <em>Assignment Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSIGNMENT_EXPRESSION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAssignmentExpression() <em>Assignment Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignmentExpression()
	 * @generated
	 * @ordered
	 */
	protected String assignmentExpression = ASSIGNMENT_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarlyReadTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.EARLY_READ_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAssignmentExpression() {
		return assignmentExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignmentExpression(String newAssignmentExpression) {
		String oldAssignmentExpression = assignmentExpression;
		assignmentExpression = newAssignmentExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ControlflowPackage.EARLY_READ_TRANSITION__ASSIGNMENT_EXPRESSION, oldAssignmentExpression, assignmentExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlflowPackage.EARLY_READ_TRANSITION__ASSIGNMENT_EXPRESSION:
				return getAssignmentExpression();
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
			case ControlflowPackage.EARLY_READ_TRANSITION__ASSIGNMENT_EXPRESSION:
				setAssignmentExpression((String)newValue);
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
			case ControlflowPackage.EARLY_READ_TRANSITION__ASSIGNMENT_EXPRESSION:
				setAssignmentExpression(ASSIGNMENT_EXPRESSION_EDEFAULT);
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
			case ControlflowPackage.EARLY_READ_TRANSITION__ASSIGNMENT_EXPRESSION:
				return ASSIGNMENT_EXPRESSION_EDEFAULT == null ? assignmentExpression != null : !ASSIGNMENT_EXPRESSION_EDEFAULT.equals(assignmentExpression);
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
		result.append(" (assignmentExpression: ");
		result.append(assignmentExpression);
		result.append(')');
		return result.toString();
	}

} //EarlyReadTransitionImpl
