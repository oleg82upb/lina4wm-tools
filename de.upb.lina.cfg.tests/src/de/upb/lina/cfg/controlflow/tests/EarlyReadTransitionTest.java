/**
 */
package de.upb.lina.cfg.controlflow.tests;

import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.EarlyReadTransition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Early Read Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EarlyReadTransitionTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EarlyReadTransitionTest.class);
	}

	/**
	 * Constructs a new Early Read Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarlyReadTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Early Read Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EarlyReadTransition getFixture() {
		return (EarlyReadTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ControlflowFactory.eINSTANCE.createEarlyReadTransition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //EarlyReadTransitionTest
