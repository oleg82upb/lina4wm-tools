/**
 */
package de.upb.lina.cfg.gendata;

import de.upb.lina.cfg.controlflow.ControlFlowLocation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.LocationLabel#getControlFlowLocation <em>Control Flow Location</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.LocationLabel#getGeneratorData <em>Generator Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getLocationLabel()
 * @model
 * @generated
 */
public interface LocationLabel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Control Flow Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Control Flow Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Control Flow Location</em>' reference.
	 * @see #setControlFlowLocation(ControlFlowLocation)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getLocationLabel_ControlFlowLocation()
	 * @model
	 * @generated
	 */
	ControlFlowLocation getControlFlowLocation();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.LocationLabel#getControlFlowLocation <em>Control Flow Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Control Flow Location</em>' reference.
	 * @see #getControlFlowLocation()
	 * @generated
	 */
	void setControlFlowLocation(ControlFlowLocation value);

	/**
	 * Returns the value of the '<em><b>Generator Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.gendata.GeneratorData#getLocationLabels <em>Location Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Data</em>' container reference.
	 * @see #setGeneratorData(GeneratorData)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getLocationLabel_GeneratorData()
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getLocationLabels
	 * @model opposite="locationLabels" transient="false"
	 * @generated
	 */
	GeneratorData getGeneratorData();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.LocationLabel#getGeneratorData <em>Generator Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Data</em>' container reference.
	 * @see #getGeneratorData()
	 * @generated
	 */
	void setGeneratorData(GeneratorData value);

} // LocationLabel
