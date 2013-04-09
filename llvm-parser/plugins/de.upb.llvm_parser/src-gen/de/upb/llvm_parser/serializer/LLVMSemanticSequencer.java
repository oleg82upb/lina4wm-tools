package de.upb.llvm_parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.AliasDefinition;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperation;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.AtomicRMW;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.Clause;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.Compare;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.ExtractElement;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.GlobalDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.InstructionUse;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.MainLevelEntity;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.NonConstantValue;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.Resume;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Select;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.TopLevelEntity;
import de.upb.llvm_parser.llvm.TypeDefinition;
import de.upb.llvm_parser.llvm.TypeList;
import de.upb.llvm_parser.llvm.Unreachable;
import de.upb.llvm_parser.llvm.Value;
import de.upb.llvm_parser.llvm.ValueStruct;
import de.upb.llvm_parser.llvm.VariableAttributeAccess;
import de.upb.llvm_parser.llvm.Vector;
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
				   context == grammarAccess.getTypeUseRule()) {
					sequence_AddressUse(context, (AddressUse) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ALIAS_DEFINITION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getAliasDefinitionRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_AliasDefinition(context, (AliasDefinition) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ALLOC:
				if(context == grammarAccess.getAllocRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_Alloc(context, (Alloc) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_ArithmeticOperation(context, (ArithmeticOperation) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARRAY:
				if(context == grammarAccess.getAggregate_TypesRule() ||
				   context == grammarAccess.getArrayRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
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
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReturnInstructionRule()) {
					sequence_Branch(context, (Branch) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.CALL:
				if(context == grammarAccess.getCallRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_Call(context, (Call) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.CAST:
				if(context == grammarAccess.getCastRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule() ||
				   context == grammarAccess.getValueRule()) {
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
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_CmpXchg(context, (CmpXchg) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.COMPARE:
				if(context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_Compare(context, (Compare) semanticObject); 
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
			case LlvmPackage.EXTRACT_ELEMENT:
				if(context == grammarAccess.getExtractElementRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_ExtractElement(context, (ExtractElement) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.EXTRACT_VALUE:
				if(context == grammarAccess.getExtractValueRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_ExtractValue(context, (ExtractValue) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.FENCE:
				if(context == grammarAccess.getFenceRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
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
			case LlvmPackage.FUNCTION_DEFINITION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFunctionDefinitionRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_FunctionDefinition(context, (FunctionDefinition) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.GET_ELEMENT_PTR:
				if(context == grammarAccess.getGetElementPtrRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_GetElementPtr(context, (GetElementPtr) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.GLOBAL_DEFINITION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getGlobalDefinitionRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_GlobalDefinition(context, (GlobalDefinition) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.INDIRECT_BRANCH:
				if(context == grammarAccess.getIndirectBranchRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReturnInstructionRule()) {
					sequence_IndirectBranch(context, (IndirectBranch) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.INSERT_ELEMENT:
				if(context == grammarAccess.getInsertElementRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_InsertElement(context, (InsertElement) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.INSERT_VALUE:
				if(context == grammarAccess.getInsertValueRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_InsertValue(context, (InsertValue) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.INSTRUCTION_USE:
				if(context == grammarAccess.getInstructionUseRule()) {
					sequence_InstructionUse(context, (InstructionUse) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.INVOKE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInvokeRule() ||
				   context == grammarAccess.getReturnInstructionRule()) {
					sequence_Invoke(context, (Invoke) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LLVM:
				if(context == grammarAccess.getLLVMRule()) {
					sequence_LLVM(context, (LLVM) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LANDING_PAD:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLandingPadRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_LandingPad(context, (LandingPad) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LOAD:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLoadRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_Load(context, (Load) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.LOGIC_OPERATION:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLogicOperationRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_LogicOperation(context, (LogicOperation) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.MAIN_LEVEL_ENTITY:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_MainLevelEntity(context, (MainLevelEntity) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.NESTED_GET_ELEMENT_PTR:
				if(context == grammarAccess.getNestedGetElementPtrRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NestedGetElementPtr(context, (NestedGetElementPtr) semanticObject); 
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
			case LlvmPackage.PHI:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getPhiRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_Phi(context, (Phi) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.PREDEFINED:
				if(context == grammarAccess.getPredefinedRule() ||
				   context == grammarAccess.getTypeUseRule()) {
					sequence_Predefined(context, (Predefined) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.RESUME:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getResumeRule() ||
				   context == grammarAccess.getReturnInstructionRule()) {
					sequence_Resume(context, (Resume) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.RETURN:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReturnRule() ||
				   context == grammarAccess.getReturnInstructionRule()) {
					sequence_Return(context, (Return) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.SELECT:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSelectRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_Select(context, (Select) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.SHUFFLE_VECTOR:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getShuffleVectorRule() ||
				   context == grammarAccess.getStandartInstructionRule()) {
					sequence_ShuffleVector(context, (ShuffleVector) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.STORE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule() ||
				   context == grammarAccess.getStoreRule()) {
					sequence_Store(context, (Store) semanticObject); 
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
			case LlvmPackage.SWITCH:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReturnInstructionRule() ||
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
			case LlvmPackage.UNREACHABLE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getReturnInstructionRule() ||
				   context == grammarAccess.getUnreachableRule()) {
					sequence_Unreachable(context, (Unreachable) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.VALUE:
				if(context == grammarAccess.getValueRule()) {
					sequence_Value(context, (Value) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.VALUE_STRUCT:
				if(context == grammarAccess.getValueStructRule()) {
					sequence_ValueStruct(context, (ValueStruct) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getStandartInstructionRule() ||
				   context == grammarAccess.getVariableAttributeAccessRule()) {
					sequence_VariableAttributeAccess(context, (VariableAttributeAccess) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.VECTOR:
				if(context == grammarAccess.getAggregate_TypesRule() ||
				   context == grammarAccess.getVectorRule()) {
					sequence_Vector(context, (Vector) semanticObject); 
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
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeUse typelist=TypeList? (numelementstype=TypeUse numelementsvalue=Value)?)
	 */
	protected void sequence_Alloc(EObject context, Alloc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperation(EObject context, ArithmeticOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationAccess().getOptypeTypeUseParserRuleCall_2_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationAccess().getValue1ValueParserRuleCall_3_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationAccess().getValue2ValueParserRuleCall_5_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeUse?)
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adresstype=TypeUse adress=Value optype=TypeUse opvalue=Value ordering=ATOMIC_ORDERING)
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
		feeder.accept(grammarAccess.getAtomicRMWAccess().getAdresstypeTypeUseParserRuleCall_3_0(), semanticObject.getAdresstype());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getAdressValueParserRuleCall_4_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getOptypeTypeUseParserRuleCall_6_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getOpvalueValueParserRuleCall_7_0(), semanticObject.getOpvalue());
		feeder.accept(grammarAccess.getAtomicRMWAccess().getOrderingATOMIC_ORDERINGParserRuleCall_9_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=ID_FQN (instructions+=InstructionUse | instructions+=StandartInstruction)* retadr=VALID_ID? terminator=ReturnInstruction)
	 */
	protected void sequence_BasicBlock(EObject context, BasicBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (destination=Value | (condvalue=Value labelTruetype=TypeUse labelTrue=Value labelFalsetype=TypeUse labelFalse=Value))
	 */
	protected void sequence_Branch(EObject context, Branch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adresstype=TypeUse adress=Value? pList=ParameterList)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((from=TypeUse | from=Aggregate_Types) value=Value to=TypeUse) | ((from=TypeUse | from=Aggregate_Types) value=Value to=TypeUse))
	 */
	protected void sequence_Cast(EObject context, Cast semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type=TypeUse value=Value) | (filterarray=Array constant=Value))
	 */
	protected void sequence_Clause(EObject context, Clause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         adresstype=TypeUse 
	 *         adress=Value 
	 *         comparetype=TypeUse 
	 *         comparevalue=Value 
	 *         newtype=TypeUse 
	 *         newvalue=Value 
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
		feeder.accept(grammarAccess.getCmpXchgAccess().getAdresstypeTypeUseParserRuleCall_2_0(), semanticObject.getAdresstype());
		feeder.accept(grammarAccess.getCmpXchgAccess().getAdressValueParserRuleCall_3_0(), semanticObject.getAdress());
		feeder.accept(grammarAccess.getCmpXchgAccess().getComparetypeTypeUseParserRuleCall_5_0(), semanticObject.getComparetype());
		feeder.accept(grammarAccess.getCmpXchgAccess().getComparevalueValueParserRuleCall_6_0(), semanticObject.getComparevalue());
		feeder.accept(grammarAccess.getCmpXchgAccess().getNewtypeTypeUseParserRuleCall_8_0(), semanticObject.getNewtype());
		feeder.accept(grammarAccess.getCmpXchgAccess().getNewvalueValueParserRuleCall_9_0(), semanticObject.getNewvalue());
		feeder.accept(grammarAccess.getCmpXchgAccess().getOrderingATOMIC_ORDERINGParserRuleCall_11_0(), semanticObject.getOrdering());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((comptype=TypeUse value1=Value value2=Value) | (comptype=TypeUse value1=Value value2=Value))
	 */
	protected void sequence_Compare(EObject context, Compare semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (vectortype=TypeUse vectorvalue=Value indextype=TypeUse index=Value)
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
		feeder.accept(grammarAccess.getExtractElementAccess().getVectortypeTypeUseParserRuleCall_1_0(), semanticObject.getVectortype());
		feeder.accept(grammarAccess.getExtractElementAccess().getVectorvalueValueParserRuleCall_2_0(), semanticObject.getVectorvalue());
		feeder.accept(grammarAccess.getExtractElementAccess().getIndextypeTypeUseParserRuleCall_4_0(), semanticObject.getIndextype());
		feeder.accept(grammarAccess.getExtractElementAccess().getIndexValueParserRuleCall_5_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((array=Array | struct=Structure) value=Value index+=INT+)
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
	 *     (meta+=MetadataValue* blocks+=BasicBlock+)
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
	 *     ((aggregate=TypeUse | aggregate=Array) aggregatename=Value (indTypes+=TypeUse indizies+=Value)*)
	 */
	protected void sequence_GetElementPtr(EObject context, GetElementPtr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adress=Address (type=TypeUse | type=Aggregate_Types) (value=ValueStruct | value=Value)?)
	 */
	protected void sequence_GlobalDefinition(EObject context, GlobalDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (adresstype=TypeUse adress=Value (labeltype+=TypeUse labels+=Value (labeltype+=TypeUse labels+=Value)*)?)
	 */
	protected void sequence_IndirectBranch(EObject context, IndirectBranch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         vectortype=TypeUse 
	 *         vectorvalue=Value 
	 *         scalartype=TypeUse 
	 *         scalarvalue=Value 
	 *         indextype=TypeUse 
	 *         index=Value
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
		feeder.accept(grammarAccess.getInsertElementAccess().getVectortypeTypeUseParserRuleCall_1_0(), semanticObject.getVectortype());
		feeder.accept(grammarAccess.getInsertElementAccess().getVectorvalueValueParserRuleCall_2_0(), semanticObject.getVectorvalue());
		feeder.accept(grammarAccess.getInsertElementAccess().getScalartypeTypeUseParserRuleCall_4_0(), semanticObject.getScalartype());
		feeder.accept(grammarAccess.getInsertElementAccess().getScalarvalueValueParserRuleCall_5_0(), semanticObject.getScalarvalue());
		feeder.accept(grammarAccess.getInsertElementAccess().getIndextypeTypeUseParserRuleCall_7_0(), semanticObject.getIndextype());
		feeder.accept(grammarAccess.getInsertElementAccess().getIndexValueParserRuleCall_8_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (struct=Structure value=Value inserttype=TypeUse insertvalue=Value index+=INT+)
	 */
	protected void sequence_InsertValue(EObject context, InsertValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reg_or_var=VALID_ID instruction=StandartInstruction)
	 */
	protected void sequence_InstructionUse(EObject context, InstructionUse semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSTRUCTION_USE__REG_OR_VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSTRUCTION_USE__REG_OR_VAR));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSTRUCTION_USE__INSTRUCTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSTRUCTION_USE__INSTRUCTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstructionUseAccess().getReg_or_varVALID_IDTerminalRuleCall_0_0(), semanticObject.getReg_or_var());
		feeder.accept(grammarAccess.getInstructionUseAccess().getInstructionStandartInstructionParserRuleCall_2_0(), semanticObject.getInstruction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         functiontype=TypeUse 
	 *         name=Address 
	 *         pList=ParameterList 
	 *         totype=TypeUse 
	 *         tovalue=Value 
	 *         unwindtype=TypeUse 
	 *         unwindvalue=Value
	 *     )
	 */
	protected void sequence_Invoke(EObject context, Invoke semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__FUNCTIONTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__FUNCTIONTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__NAME));
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
		feeder.accept(grammarAccess.getInvokeAccess().getFunctiontypeTypeUseParserRuleCall_3_0(), semanticObject.getFunctiontype());
		feeder.accept(grammarAccess.getInvokeAccess().getNameAddressParserRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_5_0(), semanticObject.getPList());
		feeder.accept(grammarAccess.getInvokeAccess().getTotypeTypeUseParserRuleCall_8_0(), semanticObject.getTotype());
		feeder.accept(grammarAccess.getInvokeAccess().getTovalueValueParserRuleCall_9_0(), semanticObject.getTovalue());
		feeder.accept(grammarAccess.getInvokeAccess().getUnwindtypeTypeUseParserRuleCall_11_0(), semanticObject.getUnwindtype());
		feeder.accept(grammarAccess.getInvokeAccess().getUnwindvalueValueParserRuleCall_12_0(), semanticObject.getUnwindvalue());
		feeder.finish();
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
	 *     (struct=Structure personalitytype=TypeUse personalityvalue=Value (clause+=Clause* | clause+=Clause+))
	 */
	protected void sequence_LandingPad(EObject context, LandingPad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((adresstype=TypeUse types=TypeList? adress=Value) | (adresstype=TypeUse adress=Value types=TypeList? ordering=ATOMIC_ORDERING index=INT?))
	 */
	protected void sequence_Load(EObject context, Load semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_LogicOperation(EObject context, LogicOperation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.LOGIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.LOGIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.LOGIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.LOGIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.LOGIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.LOGIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLogicOperationAccess().getOptypeTypeUseParserRuleCall_1_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getLogicOperationAccess().getValue1ValueParserRuleCall_2_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getLogicOperationAccess().getValue2ValueParserRuleCall_4_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     meta+=MetadataValue
	 */
	protected void sequence_MainLevelEntity(EObject context, MainLevelEntity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((aggregate=TypeUse | aggregate=Array) aggregatename=Value (indTypes+=TypeUse indizies+=Value)*)
	 */
	protected void sequence_NestedGetElementPtr(EObject context, NestedGetElementPtr semanticObject) {
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
	 *     (type=TypeUse firstclass+=Value values+=Value (firstclass+=Value values+=Value)*)
	 */
	protected void sequence_Phi(EObject context, Phi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=PredefinedType pointer=POINTER?)
	 */
	protected void sequence_Predefined(EObject context, Predefined semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (resumestruct=Structure resumevalue=Value)
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
		feeder.accept(grammarAccess.getResumeAccess().getResumevalueValueParserRuleCall_2_0(), semanticObject.getResumevalue());
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
	 *         conditiontype=TypeUse 
	 *         conditionvalue=Value 
	 *         val1type=TypeUse 
	 *         val1value=Value 
	 *         val2type=TypeUse 
	 *         val2value=Value
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
		feeder.accept(grammarAccess.getSelectAccess().getConditiontypeTypeUseParserRuleCall_1_0(), semanticObject.getConditiontype());
		feeder.accept(grammarAccess.getSelectAccess().getConditionvalueValueParserRuleCall_2_0(), semanticObject.getConditionvalue());
		feeder.accept(grammarAccess.getSelectAccess().getVal1typeTypeUseParserRuleCall_4_0(), semanticObject.getVal1type());
		feeder.accept(grammarAccess.getSelectAccess().getVal1valueValueParserRuleCall_5_0(), semanticObject.getVal1value());
		feeder.accept(grammarAccess.getSelectAccess().getVal2typeTypeUseParserRuleCall_7_0(), semanticObject.getVal2type());
		feeder.accept(grammarAccess.getSelectAccess().getVal2valueValueParserRuleCall_8_0(), semanticObject.getVal2value());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         val1type=TypeUse 
	 *         val1value=Value 
	 *         val2type=TypeUse 
	 *         val2value=Value 
	 *         masktype=TypeUse 
	 *         maskvalue=Value
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
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVal1typeTypeUseParserRuleCall_1_0(), semanticObject.getVal1type());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVal1valueValueParserRuleCall_2_0(), semanticObject.getVal1value());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVal2typeTypeUseParserRuleCall_4_0(), semanticObject.getVal2type());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getVal2valueValueParserRuleCall_5_0(), semanticObject.getVal2value());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getMasktypeTypeUseParserRuleCall_7_0(), semanticObject.getMasktype());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getMaskvalueValueParserRuleCall_8_0(), semanticObject.getMaskvalue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             newtype=TypeUse 
	 *             types+=TypeList? 
	 *             newvalue=Value 
	 *             adresstype=TypeUse 
	 *             types+=TypeList? 
	 *             adress=Value
	 *         ) | 
	 *         (
	 *             newtype=TypeUse 
	 *             types+=TypeList? 
	 *             newvalue=Value 
	 *             adresstype=TypeUse 
	 *             types+=TypeList? 
	 *             adress=Value 
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
	 *     ((types+=TypeUse (types+=TypeUse | types+=Aggregate_Types)*)?)
	 */
	protected void sequence_Structure(EObject context, Structure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         comptype=TypeUse 
	 *         compvalue=Value 
	 *         defaulttype=TypeUse 
	 *         defaultvalue=Value 
	 *         (jtypes+=TypeUse jvalues+=Value destinationtypes+=TypeUse destinations+=Value)+
	 *     )
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
	
	
	/**
	 * Constraint:
	 *     {Unreachable}
	 */
	protected void sequence_Unreachable(EObject context, Unreachable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (types+=TypeUse value+=Value (types+=TypeUse value+=Value)*)
	 */
	protected void sequence_ValueStruct(EObject context, ValueStruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Value}
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (listtype=TypeUse listvalue=Value argType=TypeUse)
	 */
	protected void sequence_VariableAttributeAccess(EObject context, VariableAttributeAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__LISTTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__LISTVALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__ARG_TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAttributeAccessAccess().getListtypeTypeUseParserRuleCall_1_0(), semanticObject.getListtype());
		feeder.accept(grammarAccess.getVariableAttributeAccessAccess().getListvalueValueParserRuleCall_2_0(), semanticObject.getListvalue());
		feeder.accept(grammarAccess.getVariableAttributeAccessAccess().getArgTypeTypeUseParserRuleCall_4_0(), semanticObject.getArgType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type=TypeUse
	 */
	protected void sequence_Vector(EObject context, Vector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VECTOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VECTOR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVectorAccess().getTypeTypeUseParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
}
