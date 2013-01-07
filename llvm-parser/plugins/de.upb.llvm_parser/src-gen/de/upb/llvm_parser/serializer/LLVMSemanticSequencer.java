package de.upb.llvm_parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.upb.llvm_parser.llvm.ARITHMETIC_OP;
import de.upb.llvm_parser.llvm.Alias;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.Clause;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
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
import de.upb.llvm_parser.llvm.LOGICAL_OP;
import de.upb.llvm_parser.llvm.LabelList;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.NamedType;
import de.upb.llvm_parser.llvm.PHI;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Resume;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Select;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.TopLevelEntity;
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
			case LlvmPackage.ARITHMETIC_OP:
				if(context == grammarAccess.getARITHMETIC_OPRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ARITHMETIC_OP(context, (ARITHMETIC_OP) semanticObject); 
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
			case LlvmPackage.COMPARE:
				if(context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Compare(context, (Compare) semanticObject); 
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
			case LlvmPackage.LOGICAL_OP:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLOGICAL_OPRule()) {
					sequence_LOGICAL_OP(context, (LOGICAL_OP) semanticObject); 
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
			case LlvmPackage.NAMED_TYPE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getMainLevelEntityRule() ||
				   context == grammarAccess.getNamedTypeRule()) {
					sequence_NamedType(context, (NamedType) semanticObject); 
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
			case LlvmPackage.PARAMETER_LIST:
				if(context == grammarAccess.getParameterListRule()) {
					sequence_ParameterList(context, (ParameterList) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.RESUME:
				if(context == grammarAccess.getResumeRule() ||
				   context == grammarAccess.getRet_InstrRule()) {
					sequence_Resume(context, (Resume) semanticObject); 
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
			case LlvmPackage.STRUCTURE:
				if(context == grammarAccess.getStructureRule()) {
					sequence_Structure(context, (Structure) semanticObject); 
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
				if(context == grammarAccess.getValuePairRule()) {
					sequence_ValuePair(context, (ValuePair) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (optype=Type value1=Type value2=Type)
	 */
	protected void sequence_ARITHMETIC_OP(EObject context, ARITHMETIC_OP semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OP__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OP__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OP__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OP__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OP__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OP__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getARITHMETIC_OPAccess().getOptypeTypeParserRuleCall_1_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getARITHMETIC_OPAccess().getValue1TypeParserRuleCall_2_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getARITHMETIC_OPAccess().getValue2TypeParserRuleCall_4_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (aliastype=Type aliasvalue=Type aliasee=Type)
	 */
	protected void sequence_Alias(EObject context, Alias semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ALIAS__ALIASTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ALIAS__ALIASTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ALIAS__ALIASVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ALIAS__ALIASVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ALIAS__ALIASEE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ALIAS__ALIASEE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAliasAccess().getAliastypeTypeParserRuleCall_3_0(), semanticObject.getAliastype());
		feeder.accept(grammarAccess.getAliasAccess().getAliasvalueTypeParserRuleCall_4_0(), semanticObject.getAliasvalue());
		feeder.accept(grammarAccess.getAliasAccess().getAliaseeTypeParserRuleCall_5_0(), semanticObject.getAliasee());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type (numelementstype=Type numelementsvalue=Type)?)
	 */
	protected void sequence_Alloc(EObject context, Alloc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adresstype=Type adress=Type optype=Type opvalue=Type ordering=ATOMIC_ORDERING)
	 */
	protected void sequence_AtomicRMW(EObject context, AtomicRMW semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ADRESSTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ADRESSTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ADRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ADRESS));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__OPVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__OPVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ATOMIC_RMW__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicRMWAccess().getAdresstypeTypeParserRuleCall_3_0(), semanticObject.getAdresstype());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getAdressTypeParserRuleCall_4_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getOptypeTypeParserRuleCall_6_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getOpvalueTypeParserRuleCall_7_0(), semanticObject.getOpvalue());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getOrderingATOMIC_ORDERINGParserRuleCall_9_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=NOBRACKET? (instructions+=NamedType | instructions+=Instruction)* terminator=Ret_Instr)
	 */
	protected void sequence_BasicBlock(EObject context, BasicBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (destinationtype=Type destination=Type) | 
	 *         (
	 *             condtype=Type 
	 *             condvalue=Type 
	 *             labelTruetype=Type 
	 *             labelTrue=Type 
	 *             labelFalsetype=Type 
	 *             labelFalse=Type
	 *         )
	 *     )
	 */
	protected void sequence_Branch(EObject context, Branch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adresstype=Type adress=Type pList=ParameterList)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CALL__ADRESSTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CALL__ADRESSTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CALL__ADRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CALL__ADRESS));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CALL__PLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CALL__PLIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCallAccess().getAdresstypeTypeParserRuleCall_4_0(), semanticObject.getAdresstype());
		feeder.accept(grammarAccess.getCallAccess().getAdressTypeParserRuleCall_5_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getCallAccess().getPListParameterListParserRuleCall_6_0(), semanticObject.getPList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (castfrom=Type value=Type castto=Type)
	 */
	protected void sequence_Cast(EObject context, Cast semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CAST__CASTFROM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CAST__CASTFROM));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CAST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CAST__VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CAST__CASTTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CAST__CASTTO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCastAccess().getCastfromTypeParserRuleCall_1_0(), semanticObject.getCastfrom());
		feeder.accept(grammarAccess.getCastAccess().getValueTypeParserRuleCall_2_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getCastAccess().getCasttoTypeParserRuleCall_4_0(), semanticObject.getCastto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((type=Type value=Type) | (filtertype+=Type filtervalue+=Type (filtertype+=Type filtervalue+=Type)*))
	 */
	protected void sequence_Clause(EObject context, Clause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         adresstype=Type 
	 *         adress=Type 
	 *         comparetype=Type 
	 *         comparevalue=Type 
	 *         newtype=Type 
	 *         newvalue=Type 
	 *         ordering=ATOMIC_ORDERING
	 *     )
	 */
	protected void sequence_CmpXchg(EObject context, CmpXchg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__ADRESSTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__ADRESSTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__ADRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__ADRESS));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__COMPARETYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__COMPARETYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__COMPAREVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__COMPAREVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__NEWTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__NEWTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__NEWVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__NEWVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CMP_XCHG__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CMP_XCHG__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCmpXchgAccess().getAdresstypeTypeParserRuleCall_2_0(), semanticObject.getAdresstype());
		feeder.accept(grammarAccess.getCmpXchgAccess().getAdressTypeParserRuleCall_3_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getCmpXchgAccess().getComparetypeTypeParserRuleCall_5_0(), semanticObject.getComparetype());
		feeder.accept(grammarAccess.getCmpXchgAccess().getComparevalueTypeParserRuleCall_6_0(), semanticObject.getComparevalue());
		feeder.accept(grammarAccess.getCmpXchgAccess().getNewtypeTypeParserRuleCall_8_0(), semanticObject.getNewtype());
		feeder.accept(grammarAccess.getCmpXchgAccess().getNewvalueTypeParserRuleCall_9_0(), semanticObject.getNewvalue());
		feeder.accept(grammarAccess.getCmpXchgAccess().getOrderingATOMIC_ORDERINGParserRuleCall_11_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((comptype=Type value1=Type value2=Type) | (comptype=Type value1=Type value2=Type))
	 */
	protected void sequence_Compare(EObject context, Compare semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (vectortype=Type vectorvalue=Type indextype=Type index=Type)
	 */
	protected void sequence_ExtractElement(EObject context, ExtractElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__VECTORTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__VECTORTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__VECTORVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__VECTORVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__INDEXTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__INDEXTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtractElementAccess().getVectortypeTypeParserRuleCall_1_0(), semanticObject.getVectortype());
		feeder.accept(grammarAccess.getExtractElementAccess().getVectorvalueTypeParserRuleCall_2_0(), semanticObject.getVectorvalue());
		feeder.accept(grammarAccess.getExtractElementAccess().getIndextypeTypeParserRuleCall_4_0(), semanticObject.getIndextype());
		feeder.accept(grammarAccess.getExtractElementAccess().getIndexTypeParserRuleCall_5_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((array=ARRAY | struct=Structure) type=Type index+=INT+)
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
	 *     (elementtype=Type element=Type (indicetypes+=Type indices+=Type)*)
	 */
	protected void sequence_GetElementPtr(EObject context, GetElementPtr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adresstype=Type adress=Type lList=LabelList?)
	 */
	protected void sequence_IndirectBranch(EObject context, IndirectBranch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         vectortype=Type 
	 *         vectorvalue=Type 
	 *         scalartype=Type 
	 *         scalarvalue=Type 
	 *         indextype=Type 
	 *         index=Type
	 *     )
	 */
	protected void sequence_InsertElement(EObject context, InsertElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VECTORTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VECTORTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VECTORVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VECTORVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__SCALARTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__SCALARTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__SCALARVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__SCALARVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__INDEXTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__INDEXTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInsertElementAccess().getVectortypeTypeParserRuleCall_1_0(), semanticObject.getVectortype());
		feeder.accept(grammarAccess.getInsertElementAccess().getVectorvalueTypeParserRuleCall_2_0(), semanticObject.getVectorvalue());
		feeder.accept(grammarAccess.getInsertElementAccess().getScalartypeTypeParserRuleCall_4_0(), semanticObject.getScalartype());
		feeder.accept(grammarAccess.getInsertElementAccess().getScalarvalueTypeParserRuleCall_5_0(), semanticObject.getScalarvalue());
		feeder.accept(grammarAccess.getInsertElementAccess().getIndextypeTypeParserRuleCall_7_0(), semanticObject.getIndextype());
		feeder.accept(grammarAccess.getInsertElementAccess().getIndexTypeParserRuleCall_8_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (struct=Structure value=Type inserttype=Type insertvalue=Type index+=INT+)
	 */
	protected void sequence_InsertValue(EObject context, InsertValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         functiontype=Type 
	 *         functionvalue=Type 
	 *         pList=ParameterList 
	 *         totype=Type 
	 *         tovalue=Type 
	 *         unwindtype=Type 
	 *         unwindvalue=Type
	 *     )
	 */
	protected void sequence_Invoke(EObject context, Invoke semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__FUNCTIONTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__FUNCTIONTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__FUNCTIONVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__FUNCTIONVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__PLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__PLIST));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__TOTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__TOTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__TOVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__TOVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__UNWINDTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__UNWINDTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__UNWINDVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__UNWINDVALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInvokeAccess().getFunctiontypeTypeParserRuleCall_3_0(), semanticObject.getFunctiontype());
		feeder.accept(grammarAccess.getInvokeAccess().getFunctionvalueTypeParserRuleCall_4_0(), semanticObject.getFunctionvalue());
		feeder.accept(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_5_0(), semanticObject.getPList());
		feeder.accept(grammarAccess.getInvokeAccess().getTotypeTypeParserRuleCall_8_0(), semanticObject.getTotype());
		feeder.accept(grammarAccess.getInvokeAccess().getTovalueTypeParserRuleCall_9_0(), semanticObject.getTovalue());
		feeder.accept(grammarAccess.getInvokeAccess().getUnwindtypeTypeParserRuleCall_11_0(), semanticObject.getUnwindtype());
		feeder.accept(grammarAccess.getInvokeAccess().getUnwindvalueTypeParserRuleCall_12_0(), semanticObject.getUnwindvalue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (jtypes+=Type jvalues+=Type destinationtypes+=Type destinations+=Type)+
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
	 *     (optype=Type value1=Type value2=Type)
	 */
	protected void sequence_LOGICAL_OP(EObject context, LOGICAL_OP semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.LOGICAL_OP__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.LOGICAL_OP__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.LOGICAL_OP__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.LOGICAL_OP__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.LOGICAL_OP__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.LOGICAL_OP__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLOGICAL_OPAccess().getOptypeTypeParserRuleCall_1_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getLOGICAL_OPAccess().getValue1TypeParserRuleCall_2_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getLOGICAL_OPAccess().getValue2TypeParserRuleCall_4_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (labeltype+=Type labels+=Type)+
	 */
	protected void sequence_LabelList(EObject context, LabelList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (struct=Structure personalitytype=Type personalityvalue=Type (clause+=Clause* | clause+=Clause+)) | 
	 *         (
	 *             struct=Structure 
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
	 *     ((adresstype=Type adress=Type) | (adresstype=Type adress=Type ordering=ATOMIC_ORDERING index=INT?))
	 */
	protected void sequence_Load(EObject context, Load semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=Type (struct=Structure? | instr=Instruction | alias=Alias | type=Type)?)
	 */
	protected void sequence_NamedType(EObject context, NamedType semanticObject) {
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
	 *     ((types+=Type variables+=Type (types+=Type variables+=Type)*)?)
	 */
	protected void sequence_ParameterList(EObject context, ParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resumestruct=Structure resumevalue=Type)
	 */
	protected void sequence_Resume(EObject context, Resume semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.RESUME__RESUMESTRUCT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.RESUME__RESUMESTRUCT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.RESUME__RESUMEVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.RESUME__RESUMEVALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResumeAccess().getResumestructStructureParserRuleCall_1_0(), semanticObject.getResumestruct());
		feeder.accept(grammarAccess.getResumeAccess().getResumevalueTypeParserRuleCall_2_0(), semanticObject.getResumevalue());
		feeder.finish();
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
	 *     (
	 *         conditiontype=Type 
	 *         conditionvalue=Type 
	 *         val1type=Type 
	 *         val1value=Type 
	 *         val2type=Type 
	 *         val2value=Type
	 *     )
	 */
	protected void sequence_Select(EObject context, Select semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__CONDITIONTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__CONDITIONTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__CONDITIONVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__CONDITIONVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__VAL1TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__VAL1TYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__VAL1VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__VAL1VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__VAL2TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__VAL2TYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__VAL2VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__VAL2VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectAccess().getConditiontypeTypeParserRuleCall_1_0(), semanticObject.getConditiontype());
		feeder.accept(grammarAccess.getSelectAccess().getConditionvalueTypeParserRuleCall_2_0(), semanticObject.getConditionvalue());
		feeder.accept(grammarAccess.getSelectAccess().getVal1typeTypeParserRuleCall_4_0(), semanticObject.getVal1type());
		feeder.accept(grammarAccess.getSelectAccess().getVal1valueTypeParserRuleCall_5_0(), semanticObject.getVal1value());
		feeder.accept(grammarAccess.getSelectAccess().getVal2typeTypeParserRuleCall_7_0(), semanticObject.getVal2type());
		feeder.accept(grammarAccess.getSelectAccess().getVal2valueTypeParserRuleCall_8_0(), semanticObject.getVal2value());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         val1type=Type 
	 *         val1value=Type 
	 *         val2type=Type 
	 *         val2value=Type 
	 *         masktype=Type 
	 *         maskvalue=Type
	 *     )
	 */
	protected void sequence_ShuffleVector(EObject context, ShuffleVector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VAL1TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VAL1TYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VAL1VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VAL1VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VAL2TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VAL2TYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VAL2VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VAL2VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__MASKTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__MASKTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__MASKVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__MASKVALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVal1typeTypeParserRuleCall_1_0(), semanticObject.getVal1type());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVal1valueTypeParserRuleCall_2_0(), semanticObject.getVal1value());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVal2typeTypeParserRuleCall_4_0(), semanticObject.getVal2type());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVal2valueTypeParserRuleCall_5_0(), semanticObject.getVal2value());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getMasktypeTypeParserRuleCall_7_0(), semanticObject.getMasktype());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getMaskvalueTypeParserRuleCall_8_0(), semanticObject.getMaskvalue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (newtype=Type newvalue=Type adresstype=Type adress=Type) | 
	 *         (
	 *             newtype=Type 
	 *             newvalue=Type 
	 *             adresstype=Type 
	 *             adress=Type 
	 *             ordering=ATOMIC_ORDERING 
	 *             index=INT?
	 *         )
	 *     )
	 */
	protected void sequence_Store(EObject context, Store semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((types+=Type? Lists+=TypeList? (types+=Type? Lists+=TypeList?)*)?) | ((types+=Type? Lists+=TypeList? (types+=Type? Lists+=TypeList?)*)?))
	 */
	protected void sequence_Structure(EObject context, Structure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (comptype=Type compvalue=Type defaulttype=Type defaultvalue=Type jTable=JumpTable?)
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
	 *     (listtype=Type listvalue=Type argType=Type)
	 */
	protected void sequence_VA_Arg(EObject context, VA_Arg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VA_ARG__LISTTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VA_ARG__LISTTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VA_ARG__LISTVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VA_ARG__LISTVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VA_ARG__ARG_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VA_ARG__ARG_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVA_ArgAccess().getListtypeTypeParserRuleCall_1_0(), semanticObject.getListtype());
		feeder.accept(grammarAccess.getVA_ArgAccess().getListvalueTypeParserRuleCall_2_0(), semanticObject.getListvalue());
		feeder.accept(grammarAccess.getVA_ArgAccess().getArgTypeTypeParserRuleCall_4_0(), semanticObject.getArgType());
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
