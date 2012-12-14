/**
 */
package de.upb.llvm_parser.llvm.impl;

import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Ret_Instr;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BasicBlockImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BasicBlockImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link de.upb.llvm_parser.llvm.impl.BasicBlockImpl#getTerminator <em>Terminator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicBlockImpl extends MinimalEObjectImpl.Container implements BasicBlock {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> instructions;

	/**
	 * The cached value of the '{@link #getTerminator() <em>Terminator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminator()
	 * @generated
	 * @ordered
	 */
	protected Ret_Instr terminator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LlvmPackage.Literals.BASIC_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BASIC_BLOCK__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<EObject>(EObject.class, this, LlvmPackage.BASIC_BLOCK__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ret_Instr getTerminator() {
		return terminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTerminator(Ret_Instr newTerminator, NotificationChain msgs) {
		Ret_Instr oldTerminator = terminator;
		terminator = newTerminator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LlvmPackage.BASIC_BLOCK__TERMINATOR, oldTerminator, newTerminator);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminator(Ret_Instr newTerminator) {
		if (newTerminator != terminator) {
			NotificationChain msgs = null;
			if (terminator != null)
				msgs = ((InternalEObject)terminator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BASIC_BLOCK__TERMINATOR, null, msgs);
			if (newTerminator != null)
				msgs = ((InternalEObject)newTerminator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LlvmPackage.BASIC_BLOCK__TERMINATOR, null, msgs);
			msgs = basicSetTerminator(newTerminator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LlvmPackage.BASIC_BLOCK__TERMINATOR, newTerminator, newTerminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LlvmPackage.BASIC_BLOCK__INSTRUCTIONS:
				return ((InternalEList<?>)getInstructions()).basicRemove(otherEnd, msgs);
			case LlvmPackage.BASIC_BLOCK__TERMINATOR:
				return basicSetTerminator(null, msgs);
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
			case LlvmPackage.BASIC_BLOCK__LABEL:
				return getLabel();
			case LlvmPackage.BASIC_BLOCK__INSTRUCTIONS:
				return getInstructions();
			case LlvmPackage.BASIC_BLOCK__TERMINATOR:
				return getTerminator();
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
		switch (featureID) {
			case LlvmPackage.BASIC_BLOCK__LABEL:
				setLabel((String)newValue);
				return;
			case LlvmPackage.BASIC_BLOCK__INSTRUCTIONS:
				getInstructions().clear();
				getInstructions().addAll((Collection<? extends EObject>)newValue);
				return;
			case LlvmPackage.BASIC_BLOCK__TERMINATOR:
				setTerminator((Ret_Instr)newValue);
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
			case LlvmPackage.BASIC_BLOCK__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case LlvmPackage.BASIC_BLOCK__INSTRUCTIONS:
				getInstructions().clear();
				return;
			case LlvmPackage.BASIC_BLOCK__TERMINATOR:
				setTerminator((Ret_Instr)null);
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
			case LlvmPackage.BASIC_BLOCK__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case LlvmPackage.BASIC_BLOCK__INSTRUCTIONS:
				return instructions != null && !instructions.isEmpty();
			case LlvmPackage.BASIC_BLOCK__TERMINATOR:
				return terminator != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //BasicBlockImpl
