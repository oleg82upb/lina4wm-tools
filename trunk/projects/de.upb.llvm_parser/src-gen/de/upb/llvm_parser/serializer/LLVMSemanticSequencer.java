package de.upb.llvm_parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.upb.llvm_parser.lLVM.AbstractElement;
import de.upb.llvm_parser.lLVM.Alloc;
import de.upb.llvm_parser.lLVM.AtomicRMW;
import de.upb.llvm_parser.lLVM.BasicBlock;
import de.upb.llvm_parser.lLVM.Branch;
import de.upb.llvm_parser.lLVM.Call;
import de.upb.llvm_parser.lLVM.Cast;
import de.upb.llvm_parser.lLVM.Clause;
import de.upb.llvm_parser.lLVM.CmpXchg;
import de.upb.llvm_parser.lLVM.ExtractElement;
import de.upb.llvm_parser.lLVM.ExtractValue;
import de.upb.llvm_parser.lLVM.Fence;
import de.upb.llvm_parser.lLVM.FunctionBody;
import de.upb.llvm_parser.lLVM.FunctionHeader;
import de.upb.llvm_parser.lLVM.GetElementPtr;
import de.upb.llvm_parser.lLVM.GlobalName;
import de.upb.llvm_parser.lLVM.IndirectBranch;
import de.upb.llvm_parser.lLVM.InsertElement;
import de.upb.llvm_parser.lLVM.InsertValue;
import de.upb.llvm_parser.lLVM.Invoke;
import de.upb.llvm_parser.lLVM.JumpTable;
import de.upb.llvm_parser.lLVM.LLVM;
import de.upb.llvm_parser.lLVM.LLVMPackage;
import de.upb.llvm_parser.lLVM.LabelList;
import de.upb.llvm_parser.lLVM.LabelStr;
import de.upb.llvm_parser.lLVM.LandingPad;
import de.upb.llvm_parser.lLVM.Load;
import de.upb.llvm_parser.lLVM.LocalVar;
import de.upb.llvm_parser.lLVM.LocalVarInstruction;
import de.upb.llvm_parser.lLVM.PHI;
import de.upb.llvm_parser.lLVM.ParameterList;
import de.upb.llvm_parser.lLVM.Return;
import de.upb.llvm_parser.lLVM.Select;
import de.upb.llvm_parser.lLVM.ShuffleVector;
import de.upb.llvm_parser.lLVM.Store;
import de.upb.llvm_parser.lLVM.Switch;
import de.upb.llvm_parser.lLVM.TypeAndValue;
import de.upb.llvm_parser.lLVM.UnNammedAddr;
import de.upb.llvm_parser.lLVM.VA_Arg;
import de.upb.llvm_parser.lLVM.ValuePair;
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
		if(semanticObject.eClass().getEPackage() == LLVMPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LLVMPackage.ABSTRACT_ELEMENT:
				if(context == grammarAccess.getAbstractElementRule()) {
					sequence_AbstractElement(context, (AbstractElement) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.ALLOC:
				if(context == grammarAccess.getAllocRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Alloc(context, (Alloc) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.ATOMIC_RMW:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRMW(context, (AtomicRMW) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.BASIC_BLOCK:
				if(context == grammarAccess.getBasicBlockRule()) {
					sequence_BasicBlock(context, (BasicBlock) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.BRANCH:
				if(context == grammarAccess.getBranchRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Branch(context, (Branch) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.CALL:
				if(context == grammarAccess.getCallRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.CAST:
				if(context == grammarAccess.getCastRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Cast(context, (Cast) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.CLAUSE:
				if(context == grammarAccess.getClauseRule()) {
					sequence_Clause(context, (Clause) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.CMP_XCHG:
				if(context == grammarAccess.getCmpXchgRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_CmpXchg(context, (CmpXchg) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.EXTRACT_ELEMENT:
				if(context == grammarAccess.getExtractElementRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ExtractElement(context, (ExtractElement) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.EXTRACT_VALUE:
				if(context == grammarAccess.getExtractValueRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ExtractValue(context, (ExtractValue) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.FENCE:
				if(context == grammarAccess.getFenceRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Fence(context, (Fence) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.FUNCTION_BODY:
				if(context == grammarAccess.getFunctionBodyRule()) {
					sequence_FunctionBody(context, (FunctionBody) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.FUNCTION_HEADER:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFunctionHeaderRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_FunctionHeader(context, (FunctionHeader) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.GET_ELEMENT_PTR:
				if(context == grammarAccess.getGetElementPtrRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_GetElementPtr(context, (GetElementPtr) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.GLOBAL_NAME:
				if(context == grammarAccess.getGlobalNameRule()) {
					sequence_GlobalName(context, (GlobalName) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.INDIRECT_BRANCH:
				if(context == grammarAccess.getIndirectBranchRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_IndirectBranch(context, (IndirectBranch) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.INSERT_ELEMENT:
				if(context == grammarAccess.getInsertElementRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_InsertElement(context, (InsertElement) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.INSERT_VALUE:
				if(context == grammarAccess.getInsertValueRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_InsertValue(context, (InsertValue) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.INVOKE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInvokeRule()) {
					sequence_Invoke(context, (Invoke) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.JUMP_TABLE:
				if(context == grammarAccess.getJumpTableRule()) {
					sequence_JumpTable(context, (JumpTable) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.LLVM:
				if(context == grammarAccess.getLLVMRule()) {
					sequence_LLVM(context, (LLVM) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.LABEL_LIST:
				if(context == grammarAccess.getLabelListRule()) {
					sequence_LabelList(context, (LabelList) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.LABEL_STR:
				if(context == grammarAccess.getLabelStrRule()) {
					sequence_LabelStr(context, (LabelStr) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.LANDING_PAD:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLandingPadRule()) {
					sequence_LandingPad(context, (LandingPad) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.LOAD:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLoadRule()) {
					sequence_Load(context, (Load) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.LOCAL_VAR:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getLocalVarRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_LocalVar(context, (LocalVar) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.LOCAL_VAR_INSTRUCTION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getLocalVarInstructionRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_LocalVarInstruction(context, (LocalVarInstruction) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.PHI:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getPHIRule()) {
					sequence_PHI(context, (PHI) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.PARAMETER_LIST:
				if(context == grammarAccess.getParameterListRule()) {
					sequence_ParameterList(context, (ParameterList) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.RETURN:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReturnRule()) {
					sequence_Return(context, (Return) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.SELECT:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSelectRule()) {
					sequence_Select(context, (Select) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.SHUFFLE_VECTOR:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getShuffleVectorRule()) {
					sequence_ShuffleVector(context, (ShuffleVector) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.STORE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStoreRule()) {
					sequence_Store(context, (Store) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.SWITCH:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSwitchRule()) {
					sequence_Switch(context, (Switch) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.TYPE_AND_VALUE:
				if(context == grammarAccess.getClauseRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getResumeRule() ||
				   context == grammarAccess.getTypeAndValueRule()) {
					sequence_TypeAndValue(context, (TypeAndValue) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.UN_NAMMED_ADDR:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFunctionHeaderRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_FunctionHeader_UnNammedAddr(context, (UnNammedAddr) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getUnNammedAddrRule()) {
					sequence_UnNammedAddr(context, (UnNammedAddr) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.VA_ARG:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getVA_ArgRule()) {
					sequence_VA_Arg(context, (VA_Arg) semanticObject); 
					return; 
				}
				else break;
			case LLVMPackage.VALUE_PAIR:
				if(context == grammarAccess.getArithmeticRule() ||
				   context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLogicalRule() ||
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
	 *     {AbstractElement}
	 */
	protected void sequence_AbstractElement(EObject context, AbstractElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (adress=TypeAndValue value=TypeAndValue ordering=AtomicOrdering)
	 */
	protected void sequence_AtomicRMW(EObject context, AtomicRMW semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.ATOMIC_RMW__ADRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.ATOMIC_RMW__ADRESS));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.ATOMIC_RMW__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.ATOMIC_RMW__VALUE));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.ATOMIC_RMW__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.ATOMIC_RMW__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicRMWAccess().getAdressTypeAndValueParserRuleCall_3_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getValueTypeAndValueParserRuleCall_5_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getOrderingAtomicOrderingParserRuleCall_7_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=LabelStr? instructions+=Instruction*)
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
	 *     (pointer=TypeAndValue plist=ParameterList)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.CALL__POINTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.CALL__POINTER));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.CALL__PLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.CALL__PLIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCallAccess().getPointerTypeAndValueParserRuleCall_4_0(), semanticObject.getPointer());
		feeder.accept(grammarAccess.getCallAccess().getPlistParameterListParserRuleCall_5_0(), semanticObject.getPlist());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=TypeAndValue castto=Type)
	 */
	protected void sequence_Cast(EObject context, Cast semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.CAST__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.CAST__VALUE));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.CAST__CASTTO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.CAST__CASTTO));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCastAccess().getValueTypeAndValueParserRuleCall_1_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getCastAccess().getCasttoTypeParserRuleCall_3_0(), semanticObject.getCastto());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {Clause}
	 */
	protected void sequence_Clause(EObject context, Clause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adress=TypeAndValue compare_val=TypeAndValue new_val=TypeAndValue ordering=AtomicOrdering)
	 */
	protected void sequence_CmpXchg(EObject context, CmpXchg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.CMP_XCHG__ADRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.CMP_XCHG__ADRESS));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.CMP_XCHG__COMPARE_VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.CMP_XCHG__COMPARE_VAL));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.CMP_XCHG__NEW_VAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.CMP_XCHG__NEW_VAL));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.CMP_XCHG__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.CMP_XCHG__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCmpXchgAccess().getAdressTypeAndValueParserRuleCall_2_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getCmpXchgAccess().getCompare_valTypeAndValueParserRuleCall_4_0(), semanticObject.getCompare_val());
		feeder.accept(grammarAccess.getCmpXchgAccess().getNew_valTypeAndValueParserRuleCall_6_0(), semanticObject.getNew_val());
		feeder.accept(grammarAccess.getCmpXchgAccess().getOrderingAtomicOrderingParserRuleCall_8_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (vector=TypeAndValue index=TypeAndValue)
	 */
	protected void sequence_ExtractElement(EObject context, ExtractElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.EXTRACT_ELEMENT__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.EXTRACT_ELEMENT__VECTOR));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.EXTRACT_ELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.EXTRACT_ELEMENT__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtractElementAccess().getVectorTypeAndValueParserRuleCall_1_0(), semanticObject.getVector());
		feeder.accept(grammarAccess.getExtractElementAccess().getIndexTypeAndValueParserRuleCall_3_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (aggregate=TypeAndValue index+=INT+)
	 */
	protected void sequence_ExtractValue(EObject context, ExtractValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ordering=AtomicOrdering
	 */
	protected void sequence_Fence(EObject context, Fence semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.FENCE__ORDERING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.FENCE__ORDERING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFenceAccess().getOrderingAtomicOrderingParserRuleCall_2_0(), semanticObject.getOrdering());
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
	 *     (returnType=Type name=GlobalName pList=ParameterList)
	 */
	protected void sequence_FunctionHeader(EObject context, FunctionHeader semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__RETURN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__RETURN_TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__NAME));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__PLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__PLIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFunctionHeaderAccess().getReturnTypeTypeParserRuleCall_6_0(), semanticObject.getReturnType());
		feeder.accept(grammarAccess.getFunctionHeaderAccess().getNameGlobalNameParserRuleCall_7_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionHeaderAccess().getPListParameterListParserRuleCall_8_0(), semanticObject.getPList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (adress=INT returnType=Type name=GlobalName pList=ParameterList)
	 */
	protected void sequence_FunctionHeader_UnNammedAddr(EObject context, UnNammedAddr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__RETURN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__RETURN_TYPE));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__NAME));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__PLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.FUNCTION_HEADER__PLIST));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.UN_NAMMED_ADDR__ADRESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.UN_NAMMED_ADDR__ADRESS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getUnNammedAddrAccess().getAdressINTTerminalRuleCall_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getFunctionHeaderAccess().getReturnTypeTypeParserRuleCall_6_0(), semanticObject.getReturnType());
		feeder.accept(grammarAccess.getFunctionHeaderAccess().getNameGlobalNameParserRuleCall_7_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getFunctionHeaderAccess().getPListParameterListParserRuleCall_8_0(), semanticObject.getPList());
		feeder.finish();
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
	 *     name=ID
	 */
	protected void sequence_GlobalName(EObject context, GlobalName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.GLOBAL_NAME__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.GLOBAL_NAME__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGlobalNameAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
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
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.INSERT_ELEMENT__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.INSERT_ELEMENT__VECTOR));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.INSERT_ELEMENT__SCALAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.INSERT_ELEMENT__SCALAR));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.INSERT_ELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.INSERT_ELEMENT__INDEX));
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
	 *     (aggregate=TypeAndValue value=TypeAndValue index+=INT+)
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
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.INVOKE__FUNCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.INVOKE__FUNCTION));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.INVOKE__PLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.INVOKE__PLIST));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.INVOKE__TO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.INVOKE__TO));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.INVOKE__UNWIND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.INVOKE__UNWIND));
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
	 *     name=ID
	 */
	protected void sequence_LabelStr(EObject context, LabelStr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.LABEL_STR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.LABEL_STR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLabelStrAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=Type personality=TypeAndValue (clause+=Clause* | clause+=Clause+))
	 */
	protected void sequence_LandingPad(EObject context, LandingPad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((adress=TypeAndValue align=Alignment? index=INT?) | (adress=TypeAndValue ordering=AtomicOrdering index=INT?))
	 */
	protected void sequence_Load(EObject context, Load semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID instruction=Instruction)
	 */
	protected void sequence_LocalVarInstruction(EObject context, LocalVarInstruction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.LOCAL_VAR_INSTRUCTION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.LOCAL_VAR_INSTRUCTION__NAME));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.LOCAL_VAR_INSTRUCTION__INSTRUCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.LOCAL_VAR_INSTRUCTION__INSTRUCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalVarInstructionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getLocalVarInstructionAccess().getInstructionInstructionParserRuleCall_3_0(), semanticObject.getInstruction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=Type
	 */
	protected void sequence_LocalVar(EObject context, LocalVar semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.LOCAL_VAR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.LOCAL_VAR__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLocalVarAccess().getNameTypeParserRuleCall_0_0(), semanticObject.getName());
		feeder.finish();
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
	 *     ((params+=TypeAndValue params+=TypeAndValue*)?)
	 */
	protected void sequence_ParameterList(EObject context, ParameterList semanticObject) {
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
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.SELECT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.SELECT__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.SELECT__VAL1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.SELECT__VAL1));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.SELECT__VAL2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.SELECT__VAL2));
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
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.SHUFFLE_VECTOR__VECTOR1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.SHUFFLE_VECTOR__VECTOR1));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.SHUFFLE_VECTOR__VECTOR2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.SHUFFLE_VECTOR__VECTOR2));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.SHUFFLE_VECTOR__MASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.SHUFFLE_VECTOR__MASK));
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
	 *     ((value=TypeAndValue adress=TypeAndValue) | (value=TypeAndValue adress=TypeAndValue ordering=AtomicOrdering index=INT?))
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
	 *     (type=Type value=VAR_TYPE)
	 */
	protected void sequence_TypeAndValue(EObject context, TypeAndValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     adress=INT
	 */
	protected void sequence_UnNammedAddr(EObject context, UnNammedAddr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (list=TypeAndValue argType=Type)
	 */
	protected void sequence_VA_Arg(EObject context, VA_Arg semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.VA_ARG__LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.VA_ARG__LIST));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.VA_ARG__ARG_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.VA_ARG__ARG_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVA_ArgAccess().getListTypeAndValueParserRuleCall_1_0(), semanticObject.getList());
		feeder.accept(grammarAccess.getVA_ArgAccess().getArgTypeTypeParserRuleCall_3_0(), semanticObject.getArgType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value1=ID value2=ID)
	 */
	protected void sequence_ValuePair(EObject context, ValuePair semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.VALUE_PAIR__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.VALUE_PAIR__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LLVMPackage.Literals.VALUE_PAIR__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LLVMPackage.Literals.VALUE_PAIR__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getValuePairAccess().getValue1IDTerminalRuleCall_1_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getValuePairAccess().getValue2IDTerminalRuleCall_4_0(), semanticObject.getValue2());
		feeder.finish();
	}
}
