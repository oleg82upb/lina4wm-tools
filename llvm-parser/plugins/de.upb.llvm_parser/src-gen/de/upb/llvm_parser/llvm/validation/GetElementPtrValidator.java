/**
 *
 * $Id$
 */
package de.upb.llvm_parser.llvm.validation;

import de.upb.llvm_parser.llvm.TypeUse;
import de.upb.llvm_parser.llvm.Value;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * A sample validator interface for {@link de.upb.llvm_parser.llvm.GetElementPtr}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface GetElementPtrValidator {
	boolean validate();

	boolean validateAggregate(EObject value);
	boolean validateAggregatename(Value value);
	boolean validateIndTypes(EList<TypeUse> value);
	boolean validateIndizies(EList<Value> value);
}
