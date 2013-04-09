/**
 */
package de.upb.llvm_parser.llvm.tests;

import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.LlvmFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GetElementPtrTest extends StandartInstructionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GetElementPtrTest.class);
	}

	/**
	 * Constructs a new Get Element Ptr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetElementPtrTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Get Element Ptr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GetElementPtr getFixture() {
		return (GetElementPtr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LlvmFactory.eINSTANCE.createGetElementPtr());
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

} //GetElementPtrTest
