/**
 *
 * $Id$
 */
package de.upb.llvm_parser.llvm.validation;

import de.upb.llvm_parser.llvm.TypeUse;

/**
 * A sample validator interface for {@link de.upb.llvm_parser.llvm.Array}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ArrayValidator {
	boolean validate();

	boolean validateType(TypeUse value);
}
