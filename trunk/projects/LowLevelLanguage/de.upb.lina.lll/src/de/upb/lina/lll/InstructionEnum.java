/**
 */
package de.upb.lina.lll;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Instruction Enum</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.upb.lina.lll.LllPackage#getInstructionEnum()
 * @model
 * @generated
 */
public enum InstructionEnum implements Enumerator {
	/**
	 * The '<em><b>Alloca</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALLOCA_VALUE
	 * @generated
	 * @ordered
	 */
	ALLOCA(0, "Alloca", "Alloca"),

	/**
	 * The '<em><b>Return</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETURN_VALUE
	 * @generated
	 * @ordered
	 */
	RETURN(1, "Return", "Return"),

	/**
	 * The '<em><b>Load</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD(2, "Load", "Load"),

	/**
	 * The '<em><b>Store</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORE_VALUE
	 * @generated
	 * @ordered
	 */
	STORE(3, "Store", "Store"),

	/**
	 * The '<em><b>Fence</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FENCE_VALUE
	 * @generated
	 * @ordered
	 */
	FENCE(4, "Fence", "Fence"),

	/**
	 * The '<em><b>Compare And Swap</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPARE_AND_SWAP_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARE_AND_SWAP(5, "CompareAndSwap", "CompareAndSwap"),

	/**
	 * The '<em><b>Get Element Pointer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_ELEMENT_POINTER_VALUE
	 * @generated
	 * @ordered
	 */
	GET_ELEMENT_POINTER(0, "GetElementPointer", "GetElementPointer");

	/**
	 * The '<em><b>Alloca</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Alloca</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALLOCA
	 * @model name="Alloca"
	 * @generated
	 * @ordered
	 */
	public static final int ALLOCA_VALUE = 0;

	/**
	 * The '<em><b>Return</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Return</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETURN
	 * @model name="Return"
	 * @generated
	 * @ordered
	 */
	public static final int RETURN_VALUE = 1;

	/**
	 * The '<em><b>Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD
	 * @model name="Load"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_VALUE = 2;

	/**
	 * The '<em><b>Store</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Store</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORE
	 * @model name="Store"
	 * @generated
	 * @ordered
	 */
	public static final int STORE_VALUE = 3;

	/**
	 * The '<em><b>Fence</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fence</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FENCE
	 * @model name="Fence"
	 * @generated
	 * @ordered
	 */
	public static final int FENCE_VALUE = 4;

	/**
	 * The '<em><b>Compare And Swap</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compare And Swap</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPARE_AND_SWAP
	 * @model name="CompareAndSwap"
	 * @generated
	 * @ordered
	 */
	public static final int COMPARE_AND_SWAP_VALUE = 5;

	/**
	 * The '<em><b>Get Element Pointer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Get Element Pointer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GET_ELEMENT_POINTER
	 * @model name="GetElementPointer"
	 * @generated
	 * @ordered
	 */
	public static final int GET_ELEMENT_POINTER_VALUE = 0;

	/**
	 * An array of all the '<em><b>Instruction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InstructionEnum[] VALUES_ARRAY =
		new InstructionEnum[] {
			ALLOCA,
			RETURN,
			LOAD,
			STORE,
			FENCE,
			COMPARE_AND_SWAP,
			GET_ELEMENT_POINTER,
		};

	/**
	 * A public read-only list of all the '<em><b>Instruction Enum</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InstructionEnum> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Instruction Enum</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstructionEnum get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstructionEnum result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instruction Enum</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstructionEnum getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InstructionEnum result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Instruction Enum</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InstructionEnum get(int value) {
		switch (value) {
			case ALLOCA_VALUE: return ALLOCA;
			case RETURN_VALUE: return RETURN;
			case LOAD_VALUE: return LOAD;
			case STORE_VALUE: return STORE;
			case FENCE_VALUE: return FENCE;
			case COMPARE_AND_SWAP_VALUE: return COMPARE_AND_SWAP;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private InstructionEnum(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //InstructionEnum
