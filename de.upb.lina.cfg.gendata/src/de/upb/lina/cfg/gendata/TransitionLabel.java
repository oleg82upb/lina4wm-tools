/**
 */
package de.upb.lina.cfg.gendata;

import de.upb.lina.cfg.controlflow.Transition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.gendata.TransitionLabel#getTransition <em>Transition</em>}</li>
 *   <li>{@link de.upb.lina.cfg.gendata.TransitionLabel#getGeneratorData <em>Generator Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.gendata.GendataPackage#getTransitionLabel()
 * @model
 * @generated
 */
public interface TransitionLabel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' reference.
	 * @see #setTransition(Transition)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getTransitionLabel_Transition()
	 * @model
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.TransitionLabel#getTransition <em>Transition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>Generator Data</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.gendata.GeneratorData#getTransitionLabels <em>Transition Labels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Data</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Data</em>' container reference.
	 * @see #setGeneratorData(GeneratorData)
	 * @see de.upb.lina.cfg.gendata.GendataPackage#getTransitionLabel_GeneratorData()
	 * @see de.upb.lina.cfg.gendata.GeneratorData#getTransitionLabels
	 * @model opposite="transitionLabels" transient="false"
	 * @generated
	 */
	GeneratorData getGeneratorData();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.gendata.TransitionLabel#getGeneratorData <em>Generator Data</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Data</em>' container reference.
	 * @see #getGeneratorData()
	 * @generated
	 */
	void setGeneratorData(GeneratorData value);

} // TransitionLabel
