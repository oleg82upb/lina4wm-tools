/**
 */
package de.upb.llvm_parser.llvm.tests;

import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Variable Attribute Access</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VariableAttributeAccessTest extends StandartInstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VariableAttributeAccessTest.class);
	}

	/**
	 * Constructs a new Variable Attribute Access test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableAttributeAccessTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Variable Attribute Access test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected VariableAttributeAccess getFixture() {
		return (VariableAttributeAccess)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LlvmFactory.eINSTANCE.createVariableAttributeAccess());
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

} //VariableAttributeAccessTest
