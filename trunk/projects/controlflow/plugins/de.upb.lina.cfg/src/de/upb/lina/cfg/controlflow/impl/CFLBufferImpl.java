/**
 */
package de.upb.lina.cfg.controlflow.impl;

import de.upb.lina.cfg.controlflow.CFLBuffer;
import de.upb.lina.cfg.controlflow.ControlflowPackage;

import de.upb.llvm_parser.llvm.Instruction;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CFL Buffer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.impl.CFLBufferImpl#getBufferedInstructions <em>Buffered Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CFLBufferImpl extends EObjectImpl implements CFLBuffer {
	/**
	 * The cached value of the '{@link #getBufferedInstructions() <em>Buffered Instructions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBufferedInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> bufferedInstructions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFLBufferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ControlflowPackage.Literals.CFL_BUFFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getBufferedInstructions() {
		if (bufferedInstructions == null) {
			bufferedInstructions = new EObjectResolvingEList<Instruction>(Instruction.class, this, ControlflowPackage.CFL_BUFFER__BUFFERED_INSTRUCTIONS);
		}
		return bufferedInstructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ControlflowPackage.CFL_BUFFER__BUFFERED_INSTRUCTIONS:
				return getBufferedInstructions();
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
			case ControlflowPackage.CFL_BUFFER__BUFFERED_INSTRUCTIONS:
				getBufferedInstructions().clear();
				getBufferedInstructions().addAll((Collection<? extends Instruction>)newValue);
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
			case ControlflowPackage.CFL_BUFFER__BUFFERED_INSTRUCTIONS:
				getBufferedInstructions().clear();
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
			case ControlflowPackage.CFL_BUFFER__BUFFERED_INSTRUCTIONS:
				return bufferedInstructions != null && !bufferedInstructions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CFLBufferImpl
