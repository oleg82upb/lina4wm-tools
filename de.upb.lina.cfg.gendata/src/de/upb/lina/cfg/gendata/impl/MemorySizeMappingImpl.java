/**
 */
package de.upb.lina.cfg.gendata.impl;

import de.upb.lina.cfg.gendata.GendataPackage;
import de.upb.lina.cfg.gendata.GeneratorData;
import de.upb.lina.cfg.gendata.MemorySizeMapping;
import de.upb.llvm_parser.llvm.Instruction;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Size Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.MemorySizeMappingImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.MemorySizeMappingImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.MemorySizeMappingImpl#getGeneratorData <em>Generator Data</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.MemorySizeMappingImpl#getCompleteTypeSize <em>Complete Type Size</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.impl.MemorySizeMappingImpl#getWarning <em>Warning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MemorySizeMappingImpl extends MinimalEObjectImpl.Container implements MemorySizeMapping {
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
	 * The default value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int OFFSET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOffset() <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOffset()
	 * @generated
	 * @ordered
	 */
	protected int offset = OFFSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getCompleteTypeSize() <em>Complete Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteTypeSize()
	 * @generated
	 * @ordered
	 */
	protected static final int COMPLETE_TYPE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCompleteTypeSize() <em>Complete Type Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompleteTypeSize()
	 * @generated
	 * @ordered
	 */
	protected int completeTypeSize = COMPLETE_TYPE_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWarning() <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarning()
	 * @generated
	 * @ordered
	 */
	protected static final String WARNING_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getWarning() <em>Warning</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarning()
	 * @generated
	 * @ordered
	 */
	protected String warning = WARNING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemorySizeMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GendataPackage.Literals.MEMORY_SIZE_MAPPING;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GendataPackage.MEMORY_SIZE_MAPPING__INSTRUCTION, oldInstruction, instruction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.MEMORY_SIZE_MAPPING__INSTRUCTION, oldInstruction, instruction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOffset() {
		return offset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOffset(int newOffset) {
		int oldOffset = offset;
		offset = newOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.MEMORY_SIZE_MAPPING__OFFSET, oldOffset, offset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorData getGeneratorData() {
		if (eContainerFeatureID() != GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA) return null;
		return (GeneratorData)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneratorData(GeneratorData newGeneratorData, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGeneratorData, GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorData(GeneratorData newGeneratorData) {
		if (newGeneratorData != eInternalContainer() || (eContainerFeatureID() != GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA && newGeneratorData != null)) {
			if (EcoreUtil.isAncestor(this, newGeneratorData))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGeneratorData != null)
				msgs = ((InternalEObject)newGeneratorData).eInverseAdd(this, GendataPackage.GENERATOR_DATA__MEMORY_SIZE_MAPPINGS, GeneratorData.class, msgs);
			msgs = basicSetGeneratorData(newGeneratorData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA, newGeneratorData, newGeneratorData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCompleteTypeSize() {
		return completeTypeSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompleteTypeSize(int newCompleteTypeSize) {
		int oldCompleteTypeSize = completeTypeSize;
		completeTypeSize = newCompleteTypeSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.MEMORY_SIZE_MAPPING__COMPLETE_TYPE_SIZE, oldCompleteTypeSize, completeTypeSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWarning() {
		return warning;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarning(String newWarning) {
		String oldWarning = warning;
		warning = newWarning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GendataPackage.MEMORY_SIZE_MAPPING__WARNING, oldWarning, warning));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGeneratorData((GeneratorData)otherEnd, msgs);
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
			case GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA:
				return basicSetGeneratorData(null, msgs);
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
			case GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA:
				return eInternalContainer().eInverseRemove(this, GendataPackage.GENERATOR_DATA__MEMORY_SIZE_MAPPINGS, GeneratorData.class, msgs);
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
			case GendataPackage.MEMORY_SIZE_MAPPING__INSTRUCTION:
				if (resolve) return getInstruction();
				return basicGetInstruction();
			case GendataPackage.MEMORY_SIZE_MAPPING__OFFSET:
				return getOffset();
			case GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA:
				return getGeneratorData();
			case GendataPackage.MEMORY_SIZE_MAPPING__COMPLETE_TYPE_SIZE:
				return getCompleteTypeSize();
			case GendataPackage.MEMORY_SIZE_MAPPING__WARNING:
				return getWarning();
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
			case GendataPackage.MEMORY_SIZE_MAPPING__INSTRUCTION:
				setInstruction((Instruction)newValue);
				return;
			case GendataPackage.MEMORY_SIZE_MAPPING__OFFSET:
				setOffset((Integer)newValue);
				return;
			case GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA:
				setGeneratorData((GeneratorData)newValue);
				return;
			case GendataPackage.MEMORY_SIZE_MAPPING__COMPLETE_TYPE_SIZE:
				setCompleteTypeSize((Integer)newValue);
				return;
			case GendataPackage.MEMORY_SIZE_MAPPING__WARNING:
				setWarning((String)newValue);
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
			case GendataPackage.MEMORY_SIZE_MAPPING__INSTRUCTION:
				setInstruction((Instruction)null);
				return;
			case GendataPackage.MEMORY_SIZE_MAPPING__OFFSET:
				setOffset(OFFSET_EDEFAULT);
				return;
			case GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA:
				setGeneratorData((GeneratorData)null);
				return;
			case GendataPackage.MEMORY_SIZE_MAPPING__COMPLETE_TYPE_SIZE:
				setCompleteTypeSize(COMPLETE_TYPE_SIZE_EDEFAULT);
				return;
			case GendataPackage.MEMORY_SIZE_MAPPING__WARNING:
				setWarning(WARNING_EDEFAULT);
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
			case GendataPackage.MEMORY_SIZE_MAPPING__INSTRUCTION:
				return instruction != null;
			case GendataPackage.MEMORY_SIZE_MAPPING__OFFSET:
				return offset != OFFSET_EDEFAULT;
			case GendataPackage.MEMORY_SIZE_MAPPING__GENERATOR_DATA:
				return getGeneratorData() != null;
			case GendataPackage.MEMORY_SIZE_MAPPING__COMPLETE_TYPE_SIZE:
				return completeTypeSize != COMPLETE_TYPE_SIZE_EDEFAULT;
			case GendataPackage.MEMORY_SIZE_MAPPING__WARNING:
				return WARNING_EDEFAULT == null ? warning != null : !WARNING_EDEFAULT.equals(warning);
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
		result.append(" (offset: ");
		result.append(offset);
		result.append(", completeTypeSize: ");
		result.append(completeTypeSize);
		result.append(", warning: ");
		result.append(warning);
		result.append(')');
		return result.toString();
	}

} //MemorySizeMappingImpl
