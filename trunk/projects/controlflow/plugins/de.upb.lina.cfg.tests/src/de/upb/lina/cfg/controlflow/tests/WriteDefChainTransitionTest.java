/**
 */
package de.upb.lina.cfg.controlflow.tests;

import de.upb.lina.cfg.controlflow.ControlflowFactory;
import de.upb.lina.cfg.controlflow.WriteDefChainTransition;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Write Def Chain Transition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WriteDefChainTransitionTest extends TransitionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WriteDefChainTransitionTest.class);
	}

	/**
	 * Constructs a new Write Def Chain Transition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteDefChainTransitionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Write Def Chain Transition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected WriteDefChainTransition getFixture() {
		return (WriteDefChainTransition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ControlflowFactory.eINSTANCE.createWriteDefChainTransition());
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

} //WriteDefChainTransitionTest
