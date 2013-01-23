package de.upb.llvm_parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.AliasDefinition;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.NonConstantValue;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.TopLevelEntity;
import de.upb.llvm_parser.llvm.TypeDefinition;
import de.upb.llvm_parser.llvm.TypeList;
import de.upb.llvm_parser.services.LLVMGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LLVMSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LLVMGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LlvmPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LlvmPackage.ADDRESS:
				if(context == grammarAccess.getAddressRule()) {
					sequence_Address(context, (Address) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ADDRESS_USE:
				if(context == grammarAccess.getAddressUseRule() ||
				   context == grammarAccess.getAggregate_TypesRule() ||
				   context == grammarAccess.getArrayRule() ||
				   context == grammarAccess.getTypeUseRule() ||
				   context == grammarAccess.getVectorRule()) {
					sequence_AddressUse(context, (AddressUse) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ALIAS_DEFINITION:
				if(context == grammarAccess.getAliasDefinitionRule()) {
					sequence_AliasDefinition(context, (AliasDefinition) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.BASIC_BLOCK:
				if(context == grammarAccess.getBasicBlockRule()) {
					sequence_BasicBlock(context, (BasicBlock) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.CONSTANT:
				if(context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.FUNCTION_BODY:
				if(context == grammarAccess.getFunctionBodyRule()) {
					sequence_FunctionBody(context, (FunctionBody) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.FUNCTION_DEFINITION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFunctionDefinitionRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_FunctionDefinition(context, (FunctionDefinition) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LLVM:
				if(context == grammarAccess.getLLVMRule()) {
					sequence_LLVM(context, (LLVM) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.NON_CONSTANT_VALUE:
				if(context == grammarAccess.getNonConstantValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NonConstantValue(context, (NonConstantValue) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.PARAMETER_LIST:
				if(context == grammarAccess.getParameterListRule()) {
					sequence_ParameterList(context, (ParameterList) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.PREDEFINED:
				if(context == grammarAccess.getAggregate_TypesRule() ||
				   context == grammarAccess.getArrayRule() ||
				   context == grammarAccess.getPredefinedRule() ||
				   context == grammarAccess.getTypeUseRule() ||
				   context == grammarAccess.getVectorRule()) {
					sequence_Predefined(context, (Predefined) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.STRUCTURE:
				if(context == grammarAccess.getAggregate_TypesRule() ||
				   context == grammarAccess.getStructureRule()) {
					sequence_Structure(context, (Structure) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.TOP_LEVEL_ENTITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getTopLevelEntityRule()) {
					sequence_TopLevelEntity(context, (TopLevelEntity) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.TYPE_DEFINITION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getMainLevelEntityRule() ||
				   context == grammarAccess.getTypeDefinitionRule()) {
					sequence_TypeDefinition(context, (TypeDefinition) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.TYPE_LIST:
				if(context == grammarAccess.getTypeListRule()) {
					sequence_TypeList(context, (TypeList) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (address=[Address|VALID_ID] pointer=POINTER?)
	 */
	protected void sequence_AddressUse(EObject context, AddressUse semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=VALID_ID
	 */
	protected void sequence_Address(EObject context, Address semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ADDRESS__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ADDRESS__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddressAccess().getNameVALID_IDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (address=Address aliastype=TypeUse aliasvalue=Value aliasee=TypeUse)
	 */
	protected void sequence_AliasDefinition(EObject context, AliasDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ALIAS_DEFINITION__ADDRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ALIAS_DEFINITION__ADDRESS));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ALIAS_DEFINITION__ALIASTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ALIAS_DEFINITION__ALIASTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ALIAS_DEFINITION__ALIASVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ALIAS_DEFINITION__ALIASVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ALIAS_DEFINITION__ALIASEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ALIAS_DEFINITION__ALIASEE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAliasDefinitionAccess().getAddressAddressParserRuleCall_0_0(), semanticObject.getAddress());
		feeder.accept(grammarAccess.getAliasDefinitionAccess().getAliastypeTypeUseParserRuleCall_5_0(), semanticObject.getAliastype());
		feeder.accept(grammarAccess.getAliasDefinitionAccess().getAliasvalueValueParserRuleCall_6_0(), semanticObject.getAliasvalue());
		feeder.accept(grammarAccess.getAliasDefinitionAccess().getAliaseeTypeUseParserRuleCall_7_0(), semanticObject.getAliasee());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     label=ID
	 */
	protected void sequence_BasicBlock(EObject context, BasicBlock semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.BASIC_BLOCK__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.BASIC_BLOCK__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBasicBlockAccess().getLabelIDTerminalRuleCall_0_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     blocks+=BasicBlock+
	 */
	protected void sequence_FunctionBody(EObject context, FunctionBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((returnType=TypeUse address=Address pl=ParameterList body=FunctionBody) | (returnType=TypeUse address=Address tList=TypeList?))
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement*
	 */
	protected void sequence_LLVM(EObject context, LLVM semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=VALID_ID pointer=POINTER?)
	 */
	protected void sequence_NonConstantValue(EObject context, NonConstantValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((types+=TypeUse Lists+=TypeList? variables+=Value (types+=TypeUse Lists+=TypeList? variables+=Value)*)?)
	 */
	protected void sequence_ParameterList(EObject context, ParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Predefined_Types pointer=POINTER?)
	 */
	protected void sequence_Predefined(EObject context, Predefined semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((types+=TypeUse types+=TypeUse*)?)
	 */
	protected void sequence_Structure(EObject context, Structure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (module=STRING | target=STRING | (libs+=STRING libs+=STRING*))
	 */
	protected void sequence_TopLevelEntity(EObject context, TopLevelEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (address=Address struct=Structure?)
	 */
	protected void sequence_TypeDefinition(EObject context, TypeDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((types+=TypeUse typelists+=TypeList? (types+=TypeUse typelists+=TypeList?)*)?)
	 */
	protected void sequence_TypeList(EObject context, TypeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
