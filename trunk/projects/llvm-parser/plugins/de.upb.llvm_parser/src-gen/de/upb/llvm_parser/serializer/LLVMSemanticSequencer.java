package de.upb.llvm_parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.upb.llvm_parser.llvm.Aggregate;
import de.upb.llvm_parser.llvm.Alias;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.Clause;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.ExtractElement;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionHeader;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.JumpTable;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LabelList;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LocalVar;
import de.upb.llvm_parser.llvm.PHI;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Select;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.TopLevelEntity;
import de.upb.llvm_parser.llvm.TypeAndValue;
import de.upb.llvm_parser.llvm.TypeList;
import de.upb.llvm_parser.llvm.Unreachable;
import de.upb.llvm_parser.llvm.VA_Arg;
import de.upb.llvm_parser.llvm.ValuePair;
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
			case LlvmPackage.AGGREGATE:
				if(context == grammarAccess.getAggregateRule()) {
					sequence_Aggregate(context, (Aggregate) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ALIAS:
				if(context == grammarAccess.getAliasRule()) {
					sequence_Alias(context, (Alias) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ALLOC:
				if(context == grammarAccess.getAllocRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Alloc(context, (Alloc) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRMW(context, (AtomicRMW) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.BASIC_BLOCK:
				if(context == grammarAccess.getBasicBlockRule()) {
					sequence_BasicBlock(context, (BasicBlock) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.BRANCH:
				if(context == grammarAccess.getBranchRule() ||
				   context == grammarAccess.getRet_InstrRule()) {
					sequence_Branch(context, (Branch) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.CALL:
				if(context == grammarAccess.getCallRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.CAST:
				if(context == grammarAccess.getCastRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Cast(context, (Cast) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.CLAUSE:
				if(context == grammarAccess.getClauseRule()) {
					sequence_Clause(context, (Clause) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.CMP_XCHG:
				if(context == grammarAccess.getCmpXchgRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_CmpXchg(context, (CmpXchg) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.EXTRACT_ELEMENT:
				if(context == grammarAccess.getExtractElementRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ExtractElement(context, (ExtractElement) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.EXTRACT_VALUE:
				if(context == grammarAccess.getExtractValueRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ExtractValue(context, (ExtractValue) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.FENCE:
				if(context == grammarAccess.getFenceRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Fence(context, (Fence) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.FUNCTION_BODY:
				if(context == grammarAccess.getFunctionBodyRule()) {
					sequence_FunctionBody(context, (FunctionBody) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.FUNCTION_HEADER:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFunctionHeaderRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_FunctionHeader(context, (FunctionHeader) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.GET_ELEMENT_PTR:
				if(context == grammarAccess.getGetElementPtrRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_GetElementPtr(context, (GetElementPtr) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.INDIRECT_BRANCH:
				if(context == grammarAccess.getIndirectBranchRule() ||
				   context == grammarAccess.getRet_InstrRule()) {
					sequence_IndirectBranch(context, (IndirectBranch) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.INSERT_ELEMENT:
				if(context == grammarAccess.getInsertElementRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_InsertElement(context, (InsertElement) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.INSERT_VALUE:
				if(context == grammarAccess.getInsertValueRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_InsertValue(context, (InsertValue) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.INVOKE:
				if(context == grammarAccess.getInvokeRule() ||
				   context == grammarAccess.getRet_InstrRule()) {
					sequence_Invoke(context, (Invoke) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.JUMP_TABLE:
				if(context == grammarAccess.getJumpTableRule()) {
					sequence_JumpTable(context, (JumpTable) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LLVM:
				if(context == grammarAccess.getLLVMRule()) {
					sequence_LLVM(context, (LLVM) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LABEL_LIST:
				if(context == grammarAccess.getLabelListRule()) {
					sequence_LabelList(context, (LabelList) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LANDING_PAD:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLandingPadRule()) {
					sequence_LandingPad(context, (LandingPad) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LOAD:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLoadRule()) {
					sequence_Load(context, (Load) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LOCAL_VAR:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLocalVarRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_LocalVar(context, (LocalVar) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.PHI:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getPHIRule()) {
					sequence_PHI(context, (PHI) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.RETURN:
				if(context == grammarAccess.getRet_InstrRule() ||
				   context == grammarAccess.getReturnRule()) {
					sequence_Return(context, (Return) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.SELECT:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSelectRule()) {
					sequence_Select(context, (Select) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.SHUFFLE_VECTOR:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getShuffleVectorRule()) {
					sequence_ShuffleVector(context, (ShuffleVector) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.STORE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStoreRule()) {
					sequence_Store(context, (Store) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.SWITCH:
				if(context == grammarAccess.getRet_InstrRule() ||
				   context == grammarAccess.getSwitchRule()) {
					sequence_Switch(context, (Switch) semanticObject); 
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
			case LlvmPackage.TYPE_AND_VALUE:
				if(context == grammarAccess.getClauseRule() ||
				   context == grammarAccess.getResumeRule() ||
				   context == grammarAccess.getRet_InstrRule() ||
				   context == grammarAccess.getTypeAndValueRule()) {
					sequence_TypeAndValue(context, (TypeAndValue) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.TYPE_LIST:
				if(context == grammarAccess.getTypeListRule()) {
					sequence_TypeList(context, (TypeList) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.UNREACHABLE:
				if(context == grammarAccess.getRet_InstrRule() ||
				   context == grammarAccess.getUnreachableRule()) {
					sequence_Unreachable(context, (Unreachable) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.VA_ARG:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getVA_ArgRule()) {
					sequence_VA_Arg(context, (VA_Arg) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.VALUE_PAIR:
				if(context == grammarAccess.getARITHMETIC_OPRule() ||
				   context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLOGICAL_OPRule() ||
				   context == grammarAccess.getValuePairRule()) {
					sequence_ValuePair(context, (ValuePair) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (agg+=Type agg+=Type)
	 */
	protected void sequence_Aggregate(EObject context, Aggregate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeAndValue aliasee=Type)
	 */
	protected void sequence_Alias(EObject context, Alias semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ALIAS__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ALIAS__TYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ALIAS__ALIASEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ALIAS__ALIASEE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAliasAccess().getTypeTypeAndValueParserRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getAliasAccess().getAliaseeTypeParserRuleCall_4_0(), semanticObject.getAliasee());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type numElements=TypeAndValue?)
	 */
	protected void sequence_Alloc(EObject context, Alloc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adress=TypeAndValue value=TypeAndValue ordering=ATOMIC_ORDERING)
	 */
	protected void sequence_AtomicRMW(EObject context, AtomicRMW semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ADRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ADRESS));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicRMWAccess().getAdressTypeAndValueParserRuleCall_3_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getValueTypeAndValueParserRuleCall_5_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getOrderingATOMIC_ORDERINGParserRuleCall_7_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=DOTS? instructions+=Instruction* terminator=Ret_Instr)
	 */
	protected void sequence_BasicBlock(EObject context, BasicBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (destination=TypeAndValue | (cond=TypeAndValue labelTrue=TypeAndValue labelFalse=TypeAndValue))
	 */
	protected void sequence_Branch(EObject context, Branch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pointer=TypeAndValue pList=ParameterList)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CALL__POINTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CALL__POINTER));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CALL__PLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CALL__PLIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCallAccess().getPointerTypeAndValueParserRuleCall_4_0(), semanticObject.getPointer());
		feeder.accept(grammarAccess.getCallAccess().getPListParameterListParserRuleCall_5_0(), semanticObject.getPList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=TypeAndValue castto=Type)
	 */
	protected void sequence_Cast(EObject context, Cast semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CAST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CAST__VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CAST__CASTTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CAST__CASTTO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCastAccess().getValueTypeAndValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getCastAccess().getCasttoTypeParserRuleCall_3_0(), semanticObject.getCastto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (filter+=TypeAndValue filter+=TypeAndValue*)
	 */
	protected void sequence_Clause(EObject context, Clause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adress=TypeAndValue compare_val=TypeAndValue new_val=TypeAndValue ordering=ATOMIC_ORDERING)
	 */
	protected void sequence_CmpXchg(EObject context, CmpXchg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__ADRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__ADRESS));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__COMPARE_VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__COMPARE_VAL));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__NEW_VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__NEW_VAL));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCmpXchgAccess().getAdressTypeAndValueParserRuleCall_2_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getCmpXchgAccess().getCompare_valTypeAndValueParserRuleCall_4_0(), semanticObject.getCompare_val());
		feeder.accept(grammarAccess.getCmpXchgAccess().getNew_valTypeAndValueParserRuleCall_6_0(), semanticObject.getNew_val());
		feeder.accept(grammarAccess.getCmpXchgAccess().getOrderingATOMIC_ORDERINGParserRuleCall_8_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (vector=TypeAndValue index=TypeAndValue)
	 */
	protected void sequence_ExtractElement(EObject context, ExtractElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__VECTOR));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtractElementAccess().getVectorTypeAndValueParserRuleCall_1_0(), semanticObject.getVector());
		feeder.accept(grammarAccess.getExtractElementAccess().getIndexTypeAndValueParserRuleCall_3_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (aggregate=Aggregate type=Type index+=INT+)
	 */
	protected void sequence_ExtractValue(EObject context, ExtractValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ordering=ATOMIC_ORDERING
	 */
	protected void sequence_Fence(EObject context, Fence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.FENCE__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.FENCE__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFenceAccess().getOrderingATOMIC_ORDERINGParserRuleCall_2_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (meta+=MetadataValue* blocks+=BasicBlock+ meta+=MetadataValue*)
	 */
	protected void sequence_FunctionBody(EObject context, FunctionBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((returnType=Type name=VAR_TYPE pl=ParameterList body=FunctionBody) | (returnType=Type name=VAR_TYPE tList=TypeList?))
	 */
	protected void sequence_FunctionHeader(EObject context, FunctionHeader semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pointer+=TypeAndValue params+=TypeAndValue*)
	 */
	protected void sequence_GetElementPtr(EObject context, GetElementPtr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adress=TypeAndValue lList=LabelList?)
	 */
	protected void sequence_IndirectBranch(EObject context, IndirectBranch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (vector=TypeAndValue scalar=TypeAndValue index=TypeAndValue)
	 */
	protected void sequence_InsertElement(EObject context, InsertElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VECTOR));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__SCALAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__SCALAR));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInsertElementAccess().getVectorTypeAndValueParserRuleCall_1_0(), semanticObject.getVector());
		feeder.accept(grammarAccess.getInsertElementAccess().getScalarTypeAndValueParserRuleCall_3_0(), semanticObject.getScalar());
		feeder.accept(grammarAccess.getInsertElementAccess().getIndexTypeAndValueParserRuleCall_5_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (aggregate=Aggregate type=Type value=TypeAndValue index+=INT+)
	 */
	protected void sequence_InsertValue(EObject context, InsertValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (function=TypeAndValue pList=ParameterList to=TypeAndValue unwind=TypeAndValue)
	 */
	protected void sequence_Invoke(EObject context, Invoke semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__FUNCTION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__PLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__PLIST));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__TO));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__UNWIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__UNWIND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInvokeAccess().getFunctionTypeAndValueParserRuleCall_3_0(), semanticObject.getFunction());
		feeder.accept(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_4_0(), semanticObject.getPList());
		feeder.accept(grammarAccess.getInvokeAccess().getToTypeAndValueParserRuleCall_7_0(), semanticObject.getTo());
		feeder.accept(grammarAccess.getInvokeAccess().getUnwindTypeAndValueParserRuleCall_9_0(), semanticObject.getUnwind());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (values+=TypeAndValue destinations+=TypeAndValue)+
	 */
	protected void sequence_JumpTable(EObject context, JumpTable semanticObject) {
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
	 *     labels+=TypeAndValue+
	 */
	protected void sequence_LabelList(EObject context, LabelList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (type=Type personality=TypeAndValue (clause+=Clause* | clause+=Clause+)) | 
	 *         (
	 *             type=Type 
	 *             personalitytype=Type 
	 *             personalityfunction=CAST_TYPE 
	 *             value=Type 
	 *             castto=Type 
	 *             (clause+=Clause* | clause+=Clause+)
	 *         )
	 *     )
	 */
	protected void sequence_LandingPad(EObject context, LandingPad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adress=TypeAndValue | (adress=TypeAndValue ordering=ATOMIC_ORDERING index=INT?))
	 */
	protected void sequence_Load(EObject context, Load semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Type (type=Type | instr=Instruction | alias=Alias))
	 */
	protected void sequence_LocalVar(EObject context, LocalVar semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=ValuePair values+=ValuePair*)
	 */
	protected void sequence_PHI(EObject context, PHI semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Return}
	 */
	protected void sequence_Return(EObject context, Return semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=TypeAndValue val1=TypeAndValue val2=TypeAndValue)
	 */
	protected void sequence_Select(EObject context, Select semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__VAL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__VAL1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__VAL2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__VAL2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectAccess().getConditionTypeAndValueParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getSelectAccess().getVal1TypeAndValueParserRuleCall_3_0(), semanticObject.getVal1());
		feeder.accept(grammarAccess.getSelectAccess().getVal2TypeAndValueParserRuleCall_5_0(), semanticObject.getVal2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (vector1=TypeAndValue vector2=TypeAndValue mask=TypeAndValue)
	 */
	protected void sequence_ShuffleVector(EObject context, ShuffleVector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VECTOR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VECTOR1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VECTOR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VECTOR2));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__MASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__MASK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVector1TypeAndValueParserRuleCall_1_0(), semanticObject.getVector1());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVector2TypeAndValueParserRuleCall_3_0(), semanticObject.getVector2());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getMaskTypeAndValueParserRuleCall_5_0(), semanticObject.getMask());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((value=TypeAndValue adress=TypeAndValue) | (value=TypeAndValue adress=TypeAndValue ordering=ATOMIC_ORDERING index=INT?))
	 */
	protected void sequence_Store(EObject context, Store semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=TypeAndValue default=TypeAndValue jTable=JumpTable?)
	 */
	protected void sequence_Switch(EObject context, Switch semanticObject) {
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
	 *     (((type=VAR_TYPE | type=B_TYPE) value=Type) | (aggregate=Aggregate value=Type))
	 */
	protected void sequence_TypeAndValue(EObject context, TypeAndValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((types+=Type types+=Type*)?)
	 */
	protected void sequence_TypeList(EObject context, TypeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Unreachable}
	 */
	protected void sequence_Unreachable(EObject context, Unreachable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=TypeAndValue argType=Type)
	 */
	protected void sequence_VA_Arg(EObject context, VA_Arg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VA_ARG__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VA_ARG__LIST));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VA_ARG__ARG_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VA_ARG__ARG_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVA_ArgAccess().getListTypeAndValueParserRuleCall_1_0(), semanticObject.getList());
		feeder.accept(grammarAccess.getVA_ArgAccess().getArgTypeTypeParserRuleCall_3_0(), semanticObject.getArgType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value1=Type value2=Type)
	 */
	protected void sequence_ValuePair(EObject context, ValuePair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VALUE_PAIR__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VALUE_PAIR__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VALUE_PAIR__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VALUE_PAIR__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValuePairAccess().getValue1TypeParserRuleCall_0_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getValuePairAccess().getValue2TypeParserRuleCall_2_0(), semanticObject.getValue2());
		feeder.finish();
	}
}
