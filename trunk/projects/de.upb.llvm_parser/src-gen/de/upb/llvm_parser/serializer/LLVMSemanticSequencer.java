package de.upb.llvm_parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.upb.llvm_parser.lLVM.LLVM;
import de.upb.llvm_parser.lLVM.LLVMPackage;
import de.upb.llvm_parser.services.LLVMGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class LLVMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LLVMGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LLVMPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LLVMPackage.LLVM:
				if(context == grammarAccess.getLLVMRule()) {
					sequence_LLVM(context, (LLVM) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     elements+=toplevelentity*
	 */
	protected void sequence_LLVM(EObject context, LLVM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
