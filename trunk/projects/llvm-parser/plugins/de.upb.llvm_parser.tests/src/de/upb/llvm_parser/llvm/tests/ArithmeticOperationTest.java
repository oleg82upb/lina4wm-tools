/**
 */
package de.upb.llvm_parser.llvm.tests;

import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.LlvmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Arithmetic Operation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArithmeticOperationTest extends StandartInstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ArithmeticOperationTest.class);
	}

	/**
	 * Constructs a new Arithmetic Operation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArithmeticOperationTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Arithmetic Operation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ArithmeticOperation getFixture() {
		return (ArithmeticOperation)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LlvmFactory.eINSTANCE.createArithmeticOperation());
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

} //ArithmeticOperationTest
