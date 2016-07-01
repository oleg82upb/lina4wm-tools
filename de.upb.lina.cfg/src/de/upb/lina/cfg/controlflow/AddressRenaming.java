/**
 */
package de.upb.lina.cfg.controlflow;

import de.upb.llvm_parser.llvm.Address;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Address Renaming</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.upb.lina.cfg.controlflow.AddressRenaming#getNewName <em>New Name</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.AddressRenaming#getRenamedAddresses <em>Renamed Addresses</em>}</li>
 *   <li>{@link de.upb.lina.cfg.controlflow.AddressRenaming#getDiagram <em>Diagram</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressRenaming()
 * @model
 * @generated
 */
public interface AddressRenaming extends EObject
{
	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressRenaming_NewName()
	 * @model
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.AddressRenaming#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

	/**
	 * Returns the value of the '<em><b>Renamed Addresses</b></em>' reference list.
	 * The list contents are of type {@link de.upb.llvm_parser.llvm.Address}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Renamed Addresses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Renamed Addresses</em>' reference list.
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressRenaming_RenamedAddresses()
	 * @model
	 * @generated
	 */
	EList<Address> getRenamedAddresses();

	/**
	 * Returns the value of the '<em><b>Diagram</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.upb.lina.cfg.controlflow.ControlFlowDiagram#getAddressRenamings <em>Address Renamings</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram</em>' container reference.
	 * @see #setDiagram(ControlFlowDiagram)
	 * @see de.upb.lina.cfg.controlflow.ControlflowPackage#getAddressRenaming_Diagram()
	 * @see de.upb.lina.cfg.controlflow.ControlFlowDiagram#getAddressRenamings
	 * @model opposite="addressRenamings" transient="false"
	 * @generated
	 */
	ControlFlowDiagram getDiagram();

	/**
	 * Sets the value of the '{@link de.upb.lina.cfg.controlflow.AddressRenaming#getDiagram <em>Diagram</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram</em>' container reference.
	 * @see #getDiagram()
	 * @generated
	 */
	void setDiagram(ControlFlowDiagram value);

} // AddressRenaming
