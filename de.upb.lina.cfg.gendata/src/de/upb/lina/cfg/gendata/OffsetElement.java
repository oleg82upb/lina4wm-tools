/**
 */
package de.upb.lina.cfg.gendata;

import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Offset Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.OffsetElement#getFactor <em>Factor</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.OffsetElement#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.OffsetElement#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.OffsetElement#isConstant <em>Constant</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.OffsetElement#getMemorySizeMapping <em>Memory Size Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getOffsetElement()
 * @model
 * @generated
 */
public interface OffsetElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(int)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getOffsetElement_Factor()
	 * @model
	 * @generated
	 */
	int getFactor();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.OffsetElement#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(int value);

	/**
	 * Returns the value of the '<em><b>Variable Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Value</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Value</em>' reference.
	 * @see #setVariableValue(Value)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getOffsetElement_VariableValue()
	 * @model
	 * @generated
	 */
	Value getVariableValue();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.OffsetElement#getVariableValue <em>Variable Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Value</em>' reference.
	 * @see #getVariableValue()
	 * @generated
	 */
	void setVariableValue(Value value);

	/**
	 * Returns the value of the '<em><b>Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int Value</em>' attribute.
	 * @see #setIntValue(int)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getOffsetElement_IntValue()
	 * @model
	 * @generated
	 */
	int getIntValue();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.OffsetElement#getIntValue <em>Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int Value</em>' attribute.
	 * @see #getIntValue()
	 * @generated
	 */
	void setIntValue(int value);

	/**
	 * Returns the value of the '<em><b>Constant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constant</em>' attribute.
	 * @see #setConstant(boolean)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getOffsetElement_Constant()
	 * @model
	 * @generated
	 */
	boolean isConstant();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.OffsetElement#isConstant <em>Constant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constant</em>' attribute.
	 * @see #isConstant()
	 * @generated
	 */
	void setConstant(boolean value);

	/**
	 * Returns the value of the '<em><b>Memory Size Mapping</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.gendata.MemorySizeMapping#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory Size Mapping</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory Size Mapping</em>' container reference.
	 * @see #setMemorySizeMapping(MemorySizeMapping)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getOffsetElement_MemorySizeMapping()
	 * @see de.upb.lina.cfg.gendata.MemorySizeMapping#getOffset
	 * @model opposite="offset" transient="false"
	 * @generated
	 */
	MemorySizeMapping getMemorySizeMapping();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.OffsetElement#getMemorySizeMapping <em>Memory Size Mapping</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory Size Mapping</em>' container reference.
	 * @see #getMemorySizeMapping()
	 * @generated
	 */
	void setMemorySizeMapping(MemorySizeMapping value);

} // OffsetElement
