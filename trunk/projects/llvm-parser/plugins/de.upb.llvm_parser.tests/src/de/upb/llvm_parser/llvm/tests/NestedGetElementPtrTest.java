/**
 */
package de.upb.llvm_parser.llvm.tests;

import de.upb.llvm_parser.llvm.LlvmFactory;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Nested Get Element Ptr</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NestedGetElementPtrTest extends ValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NestedGetElementPtrTest.class);
	}

	/**
	 * Constructs a new Nested Get Element Ptr test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedGetElementPtrTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Nested Get Element Ptr test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NestedGetElementPtr getFixture() {
		return (NestedGetElementPtr)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(LlvmFactory.eINSTANCE.createNestedGetElementPtr());
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

} //NestedGetElementPtrTest
