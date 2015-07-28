package de.upb.llvm_parser.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.upb.llvm_parser.llvm.Address;
import de.upb.llvm_parser.llvm.AddressUse;
import de.upb.llvm_parser.llvm.AliasDefinition;
import de.upb.llvm_parser.llvm.Alloc;
import de.upb.llvm_parser.llvm.ArithmeticOperationAdd;
import de.upb.llvm_parser.llvm.ArithmeticOperationFadd;
import de.upb.llvm_parser.llvm.ArithmeticOperationFdiv;
import de.upb.llvm_parser.llvm.ArithmeticOperationFmul;
import de.upb.llvm_parser.llvm.ArithmeticOperationFrem;
import de.upb.llvm_parser.llvm.ArithmeticOperationFsub;
import de.upb.llvm_parser.llvm.ArithmeticOperationMul;
import de.upb.llvm_parser.llvm.ArithmeticOperationSdiv;
import de.upb.llvm_parser.llvm.ArithmeticOperationSrem;
import de.upb.llvm_parser.llvm.ArithmeticOperationSub;
import de.upb.llvm_parser.llvm.ArithmeticOperationUdiv;
import de.upb.llvm_parser.llvm.ArithmeticOperationUrem;
import de.upb.llvm_parser.llvm.Array;
import de.upb.llvm_parser.llvm.AtomicRmwAdd;
import de.upb.llvm_parser.llvm.AtomicRmwAnd;
import de.upb.llvm_parser.llvm.AtomicRmwMax;
import de.upb.llvm_parser.llvm.AtomicRmwMin;
import de.upb.llvm_parser.llvm.AtomicRmwNand;
import de.upb.llvm_parser.llvm.AtomicRmwOr;
import de.upb.llvm_parser.llvm.AtomicRmwSub;
import de.upb.llvm_parser.llvm.AtomicRmwUmax;
import de.upb.llvm_parser.llvm.AtomicRmwUmin;
import de.upb.llvm_parser.llvm.AtomicRmwXchg;
import de.upb.llvm_parser.llvm.AtomicRmwXor;
import de.upb.llvm_parser.llvm.BasicBlock;
import de.upb.llvm_parser.llvm.Branch;
import de.upb.llvm_parser.llvm.Call;
import de.upb.llvm_parser.llvm.Cast;
import de.upb.llvm_parser.llvm.Clause;
import de.upb.llvm_parser.llvm.CmpXchg;
import de.upb.llvm_parser.llvm.CompareFloat;
import de.upb.llvm_parser.llvm.CompareInt;
import de.upb.llvm_parser.llvm.Constant;
import de.upb.llvm_parser.llvm.ExtractElement;
import de.upb.llvm_parser.llvm.ExtractValue;
import de.upb.llvm_parser.llvm.Fence;
import de.upb.llvm_parser.llvm.FunctionBody;
import de.upb.llvm_parser.llvm.FunctionDefinition;
import de.upb.llvm_parser.llvm.FunctionParameter;
import de.upb.llvm_parser.llvm.FunctionParameterList;
import de.upb.llvm_parser.llvm.GetElementPtr;
import de.upb.llvm_parser.llvm.GlobalDefinition;
import de.upb.llvm_parser.llvm.IndirectBranch;
import de.upb.llvm_parser.llvm.InsertElement;
import de.upb.llvm_parser.llvm.InsertValue;
import de.upb.llvm_parser.llvm.Invoke;
import de.upb.llvm_parser.llvm.LLVM;
import de.upb.llvm_parser.llvm.LandingPad;
import de.upb.llvm_parser.llvm.LlvmPackage;
import de.upb.llvm_parser.llvm.Load;
import de.upb.llvm_parser.llvm.LogicOperation;
import de.upb.llvm_parser.llvm.Meta;
import de.upb.llvm_parser.llvm.MetaArgValue;
import de.upb.llvm_parser.llvm.MetadataValue;
import de.upb.llvm_parser.llvm.NestedCast;
import de.upb.llvm_parser.llvm.NestedGetElementPtr;
import de.upb.llvm_parser.llvm.Parameter;
import de.upb.llvm_parser.llvm.ParameterList;
import de.upb.llvm_parser.llvm.Phi;
import de.upb.llvm_parser.llvm.PhiCase;
import de.upb.llvm_parser.llvm.Predefined;
import de.upb.llvm_parser.llvm.PrimitiveValue;
import de.upb.llvm_parser.llvm.Resume;
import de.upb.llvm_parser.llvm.Return;
import de.upb.llvm_parser.llvm.Select;
import de.upb.llvm_parser.llvm.ShuffleVector;
import de.upb.llvm_parser.llvm.Store;
import de.upb.llvm_parser.llvm.Structure;
import de.upb.llvm_parser.llvm.Switch;
import de.upb.llvm_parser.llvm.SwitchCase;
import de.upb.llvm_parser.llvm.TopLevelEntity;
import de.upb.llvm_parser.llvm.TypeDefinition;
import de.upb.llvm_parser.llvm.Unreachable;
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
				   context == grammarAccess.getValueRule()) {
					sequence_AddressUse(context, (AddressUse) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeUseRule()) {
					sequence_AddressUse_TypeUse(context, (AddressUse) semanticObject); 
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
				   context == grammarAccess.getInstructionRule()) {
					sequence_Alloc(context, (Alloc) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_ADD:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationAddRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationAdd(context, (ArithmeticOperationAdd) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_FADD:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationFaddRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationFadd(context, (ArithmeticOperationFadd) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_FDIV:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationFdivRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationFdiv(context, (ArithmeticOperationFdiv) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_FMUL:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationFmulRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationFmul(context, (ArithmeticOperationFmul) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_FREM:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationFremRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationFrem(context, (ArithmeticOperationFrem) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_FSUB:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationFsubRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationFsub(context, (ArithmeticOperationFsub) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_MUL:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationMulRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationMul(context, (ArithmeticOperationMul) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_SDIV:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationSdivRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationSdiv(context, (ArithmeticOperationSdiv) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_SREM:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationSremRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationSrem(context, (ArithmeticOperationSrem) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_SUB:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationSubRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationSub(context, (ArithmeticOperationSub) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_UDIV:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationUdivRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationUdiv(context, (ArithmeticOperationUdiv) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARITHMETIC_OPERATION_UREM:
				if(context == grammarAccess.getArithmeticOperationRule() ||
				   context == grammarAccess.getArithmeticOperationUremRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_ArithmeticOperationUrem(context, (ArithmeticOperationUrem) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ARRAY:
				if(context == grammarAccess.getAggregate_TypeRule() ||
				   context == grammarAccess.getArrayRule()) {
					sequence_Array(context, (Array) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_ADD:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwAddRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwAdd(context, (AtomicRmwAdd) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_AND:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwAndRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwAnd(context, (AtomicRmwAnd) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_MAX:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwMaxRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwMax(context, (AtomicRmwMax) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_MIN:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwMinRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwMin(context, (AtomicRmwMin) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_NAND:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwNandRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwNand(context, (AtomicRmwNand) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_OR:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwOrRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwOr(context, (AtomicRmwOr) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_SUB:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwSubRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwSub(context, (AtomicRmwSub) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_UMAX:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwUmaxRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwUmax(context, (AtomicRmwUmax) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_UMIN:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwUminRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwUmin(context, (AtomicRmwUmin) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_XCHG:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwXchgRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwXchg(context, (AtomicRmwXchg) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.ATOMIC_RMW_XOR:
				if(context == grammarAccess.getAtomicRMWRule() ||
				   context == grammarAccess.getAtomicRmwXorRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_AtomicRmwXor(context, (AtomicRmwXor) semanticObject); 
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
				   context == grammarAccess.getInstructionRule()) {
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
			case LlvmPackage.COMPARE_FLOAT:
				if(context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getCompareFloatRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_CompareFloat(context, (CompareFloat) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.COMPARE_INT:
				if(context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getCompareIntRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_CompareInt(context, (CompareInt) semanticObject); 
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
			case LlvmPackage.FUNCTION_DEFINITION:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getFunctionDefinitionRule() ||
				   context == grammarAccess.getMainLevelEntityRule()) {
					sequence_FunctionDefinition(context, (FunctionDefinition) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.FUNCTION_PARAMETER:
				if(context == grammarAccess.getFunctionParameterRule()) {
					sequence_FunctionParameter(context, (FunctionParameter) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.FUNCTION_PARAMETER_LIST:
				if(context == grammarAccess.getFunctionParameterListRule()) {
					sequence_FunctionParameterList(context, (FunctionParameterList) semanticObject); 
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
				   context == grammarAccess.getInstructionRule()) {
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
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getInvokeRule()) {
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
			case LlvmPackage.LOGIC_OPERATION:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLogicOperationRule()) {
					sequence_LogicOperation(context, (LogicOperation) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.META:
				if(context == grammarAccess.getMetaRule()) {
					sequence_Meta(context, (Meta) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.META_ARG_VALUE:
				if(context == grammarAccess.getMetaArgValueRule()) {
					sequence_MetaArgValue(context, (MetaArgValue) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.METADATA_VALUE:
				if(context == grammarAccess.getAbstractElementRule() ||
				   context == grammarAccess.getMainLevelEntityRule() ||
				   context == grammarAccess.getMetadataValueRule()) {
					sequence_MetadataValue(context, (MetadataValue) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.NESTED_CAST:
				if(context == grammarAccess.getNestedCastRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_NestedCast(context, (NestedCast) semanticObject); 
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
			case LlvmPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
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
				   context == grammarAccess.getPhiRule()) {
					sequence_Phi(context, (Phi) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.PHI_CASE:
				if(context == grammarAccess.getPhiCaseRule()) {
					sequence_PhiCase(context, (PhiCase) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.PREDEFINED:
				if(context == grammarAccess.getPredefinedRule()) {
					sequence_Predefined(context, (Predefined) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getTypeUseRule()) {
					sequence_Predefined_TypeUse(context, (Predefined) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.PRIMITIVE_VALUE:
				if(context == grammarAccess.getPrimitiveValueRule() ||
				   context == grammarAccess.getValueRule()) {
					sequence_PrimitiveValue(context, (PrimitiveValue) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.RESUME:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getResumeRule()) {
					sequence_Resume(context, (Resume) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.RETURN:
				if(context == grammarAccess.getInstructionRule() ||
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
				if(context == grammarAccess.getAggregate_TypeRule() ||
				   context == grammarAccess.getStructureRule()) {
					sequence_Structure(context, (Structure) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.SWITCH:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getSwitchRule()) {
					sequence_Switch(context, (Switch) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.SWITCH_CASE:
				if(context == grammarAccess.getSwitchCaseRule()) {
					sequence_SwitchCase(context, (SwitchCase) semanticObject); 
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
			case LlvmPackage.UNREACHABLE:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getUnreachableRule()) {
					sequence_Unreachable(context, (Unreachable) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.VALUE_STRUCT:
				if(context == grammarAccess.getValueRule() ||
				   context == grammarAccess.getValueStructRule()) {
					sequence_ValueStruct(context, (ValueStruct) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.VARIABLE_ATTRIBUTE_ACCESS:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getVariableAttributeAccessRule()) {
					sequence_VariableAttributeAccess(context, (VariableAttributeAccess) semanticObject); 
					return; 
				}
				else break;
			case LlvmPackage.VECTOR:
				if(context == grammarAccess.getAggregate_TypeRule() ||
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
	 *     (address=[Address|VALID_ID] pointer=POINTER? functionInput=UNKNOWN_TYPE?)
	 */
	protected void sequence_AddressUse_TypeUse(EObject context, AddressUse semanticObject) {
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
	 *     (result=Address type=TypeUse numOfElements=Parameter? align=NUMBER?)
	 */
	protected void sequence_Alloc(EObject context, Alloc semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='add' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationAdd(EObject context, ArithmeticOperationAdd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationAddAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationAddAccess().getOperationAddKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationAddAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationAddAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationAddAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='fadd' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationFadd(EObject context, ArithmeticOperationFadd semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationFaddAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationFaddAccess().getOperationFaddKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationFaddAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationFaddAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationFaddAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='fdiv' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationFdiv(EObject context, ArithmeticOperationFdiv semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationFdivAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationFdivAccess().getOperationFdivKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationFdivAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationFdivAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationFdivAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='fmul' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationFmul(EObject context, ArithmeticOperationFmul semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationFmulAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationFmulAccess().getOperationFmulKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationFmulAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationFmulAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationFmulAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='frem' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationFrem(EObject context, ArithmeticOperationFrem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationFremAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationFremAccess().getOperationFremKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationFremAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationFremAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationFremAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='fsub' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationFsub(EObject context, ArithmeticOperationFsub semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationFsubAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationFsubAccess().getOperationFsubKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationFsubAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationFsubAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationFsubAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='mul' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationMul(EObject context, ArithmeticOperationMul semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationMulAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationMulAccess().getOperationMulKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationMulAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationMulAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationMulAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='sdiv' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationSdiv(EObject context, ArithmeticOperationSdiv semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationSdivAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationSdivAccess().getOperationSdivKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationSdivAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationSdivAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationSdivAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='srem' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationSrem(EObject context, ArithmeticOperationSrem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationSremAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationSremAccess().getOperationSremKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationSremAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationSremAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationSremAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='sub' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationSub(EObject context, ArithmeticOperationSub semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationSubAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationSubAccess().getOperationSubKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationSubAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationSubAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationSubAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='udiv' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationUdiv(EObject context, ArithmeticOperationUdiv semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationUdivAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationUdivAccess().getOperationUdivKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationUdivAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationUdivAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationUdivAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address operation='urem' optype=TypeUse value1=Value value2=Value)
	 */
	protected void sequence_ArithmeticOperationUrem(EObject context, ArithmeticOperationUrem semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPERATION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__OPTYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.ARITHMETIC_OPERATION__VALUE2));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArithmeticOperationUremAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getArithmeticOperationUremAccess().getOperationUremKeyword_2_0(), semanticObject.getOperation());
		feeder.accept(grammarAccess.getArithmeticOperationUremAccess().getOptypeTypeUseParserRuleCall_5_0(), semanticObject.getOptype());
		feeder.accept(grammarAccess.getArithmeticOperationUremAccess().getValue1ValueParserRuleCall_6_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getArithmeticOperationUremAccess().getValue2ValueParserRuleCall_8_0(), semanticObject.getValue2());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((length=NUMBER (type=TypeUse | type=Aggregate_Type))?)
	 */
	protected void sequence_Array(EObject context, Array semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='add' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwAdd(EObject context, AtomicRmwAdd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='and' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwAnd(EObject context, AtomicRmwAnd semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='max' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwMax(EObject context, AtomicRmwMax semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='min' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwMin(EObject context, AtomicRmwMin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='nand' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwNand(EObject context, AtomicRmwNand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='or' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwOr(EObject context, AtomicRmwOr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='sub' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwSub(EObject context, AtomicRmwSub semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='umax' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwUmax(EObject context, AtomicRmwUmax semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='umin' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwUmin(EObject context, AtomicRmwUmin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='xchg' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwXchg(EObject context, AtomicRmwXchg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         operation='xor' 
	 *         address=Parameter 
	 *         argument=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_AtomicRmwXor(EObject context, AtomicRmwXor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=LABEL_ID instructions+=Instruction+)
	 */
	protected void sequence_BasicBlock(EObject context, BasicBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (destination=VALID_ID | (condition=Value destination=VALID_ID elseDestination=VALID_ID))
	 */
	protected void sequence_Branch(EObject context, Branch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address? function=Parameter pList=ParameterList)
	 */
	protected void sequence_Call(EObject context, Call semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         (
	 *             operation='trunc' | 
	 *             operation='zext' | 
	 *             operation='sext' | 
	 *             operation='fptrunc' | 
	 *             operation='fpext' | 
	 *             operation='fptoui' | 
	 *             operation='fptosi' | 
	 *             operation='uitofp' | 
	 *             operation='sitofp' | 
	 *             operation='ptrtoint' | 
	 *             operation='inttoptr' | 
	 *             operation='bitcast'
	 *         ) 
	 *         (from=TypeUse | from=Aggregate_Type) 
	 *         value=Value 
	 *         to=TypeUse
	 *     )
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
	 *         result=Address 
	 *         volatile?='volatile'? 
	 *         address=Parameter 
	 *         value=Parameter 
	 *         newValue=Parameter 
	 *         (
	 *             ordering='unordered' | 
	 *             ordering='monotonic' | 
	 *             ordering='aquire' | 
	 *             ordering='release' | 
	 *             ordering='acq_rel' | 
	 *             ordering='seq_cst'
	 *         )
	 *     )
	 */
	protected void sequence_CmpXchg(EObject context, CmpXchg semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         (
	 *             cond='oeq' | 
	 *             cond='ogt' | 
	 *             cond='oge' | 
	 *             cond='olt' | 
	 *             cond='ole' | 
	 *             cond='one' | 
	 *             cond='ord' | 
	 *             cond='ueq' | 
	 *             cond='ugt' | 
	 *             cond='uge' | 
	 *             cond='ult' | 
	 *             cond='ule' | 
	 *             cond='une' | 
	 *             cond='uno'
	 *         ) 
	 *         opType=TypeUse 
	 *         operand1=Value 
	 *         operand2=Value
	 *     )
	 */
	protected void sequence_CompareFloat(EObject context, CompareFloat semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         (
	 *             cond='eq' | 
	 *             cond='ne' | 
	 *             cond='ugt' | 
	 *             cond='uge' | 
	 *             cond='ult' | 
	 *             cond='ule' | 
	 *             cond='sgt' | 
	 *             cond='sge' | 
	 *             cond='slt' | 
	 *             cond='sle'
	 *         ) 
	 *         opType=TypeUse 
	 *         operand1=Value 
	 *         operand2=Value
	 *     )
	 */
	protected void sequence_CompareInt(EObject context, CompareInt semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=NUMBER
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getValueNUMBERParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address vector=Parameter index=Parameter)
	 */
	protected void sequence_ExtractElement(EObject context, ExtractElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__VECTOR));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.EXTRACT_ELEMENT__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExtractElementAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getExtractElementAccess().getVectorParameterParserRuleCall_3_0(), semanticObject.getVector());
		feeder.accept(grammarAccess.getExtractElementAccess().getIndexParameterParserRuleCall_5_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address aggerate=Parameter index+=NUMBER+)
	 */
	protected void sequence_ExtractValue(EObject context, ExtractValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ordering='unordered' | 
	 *         ordering='monotonic' | 
	 *         ordering='aquire' | 
	 *         ordering='release' | 
	 *         ordering='acq_rel' | 
	 *         ordering='seq_cst'
	 *     )
	 */
	protected void sequence_Fence(EObject context, Fence semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (
	 *         (returnType=TypeUse address=Address parameter=FunctionParameterList? align=NUMBER? body=FunctionBody) | 
	 *         (returnType=TypeUse address=Address parameter=FunctionParameterList? align=NUMBER?)
	 *     )
	 */
	protected void sequence_FunctionDefinition(EObject context, FunctionDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (params+=FunctionParameter params+=FunctionParameter*)
	 */
	protected void sequence_FunctionParameterList(EObject context, FunctionParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=TypeUse value=Address?)
	 */
	protected void sequence_FunctionParameter(EObject context, FunctionParameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address aggregate=Parameter indices+=Parameter*)
	 */
	protected void sequence_GetElementPtr(EObject context, GetElementPtr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (address=Address value=Parameter align=NUMBER?)
	 */
	protected void sequence_GlobalDefinition(EObject context, GlobalDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (target=Parameter (potTargetLabels+=VALID_ID potTargetLabels+=VALID_ID*)?)
	 */
	protected void sequence_IndirectBranch(EObject context, IndirectBranch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address vector=Parameter value=Parameter index=Parameter)
	 */
	protected void sequence_InsertElement(EObject context, InsertElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VECTOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VECTOR));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INSERT_ELEMENT__INDEX));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInsertElementAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getInsertElementAccess().getVectorParameterParserRuleCall_3_0(), semanticObject.getVector());
		feeder.accept(grammarAccess.getInsertElementAccess().getValueParameterParserRuleCall_5_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getInsertElementAccess().getIndexParameterParserRuleCall_7_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address aggerate=Parameter value=Parameter index+=NUMBER+)
	 */
	protected void sequence_InsertValue(EObject context, InsertValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (returnType=TypeUse name=Address pList=ParameterList targetLabel=VALID_ID unwindTargetLabel=VALID_ID)
	 */
	protected void sequence_Invoke(EObject context, Invoke semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__RETURN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__RETURN_TYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__NAME));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__PLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__PLIST));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__TARGET_LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__TARGET_LABEL));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.INVOKE__UNWIND_TARGET_LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.INVOKE__UNWIND_TARGET_LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInvokeAccess().getReturnTypeTypeUseParserRuleCall_3_0(), semanticObject.getReturnType());
		feeder.accept(grammarAccess.getInvokeAccess().getNameAddressParserRuleCall_4_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_5_0(), semanticObject.getPList());
		feeder.accept(grammarAccess.getInvokeAccess().getTargetLabelVALID_IDTerminalRuleCall_9_0(), semanticObject.getTargetLabel());
		feeder.accept(grammarAccess.getInvokeAccess().getUnwindTargetLabelVALID_IDTerminalRuleCall_12_0(), semanticObject.getUnwindTargetLabel());
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
	 *     (result=Address struct=Structure personalitytype=TypeUse personalityvalue=Value (clause+=Clause* | clause+=Clause+))
	 */
	protected void sequence_LandingPad(EObject context, LandingPad semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (result=Address (volatile?='volatile' | volatile?='volatile'?) address=Parameter align=NUMBER? meta+=MetaArgValue*) | 
	 *         (
	 *             result=Address 
	 *             atomic?='atomic' 
	 *             volatile?='volatile'? 
	 *             address=Parameter 
	 *             (
	 *                 ordering='unordered' | 
	 *                 ordering='monotonic' | 
	 *                 ordering='aquire' | 
	 *                 ordering='release' | 
	 *                 ordering='acq_rel' | 
	 *                 ordering='seq_cst'
	 *             ) 
	 *             align=NUMBER?
	 *         )
	 *     )
	 */
	protected void sequence_Load(EObject context, Load semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         result=Address 
	 *         (
	 *             operation='shl' | 
	 *             operation='lshr' | 
	 *             operation='ashr' | 
	 *             operation='and' | 
	 *             operation='or' | 
	 *             operation='xor'
	 *         ) 
	 *         optype=TypeUse 
	 *         value1=Value 
	 *         value2=Value
	 *     )
	 */
	protected void sequence_LogicOperation(EObject context, LogicOperation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (arg=METADATA (value=METADATA | value=STRING))
	 */
	protected void sequence_MetaArgValue(EObject context, MetaArgValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (meta=METADATA | (arg=Predefined? value=Value))
	 */
	protected void sequence_Meta(EObject context, Meta semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (nodeId=METADATA values+=Meta values+=Meta*)
	 */
	protected void sequence_MetadataValue(EObject context, MetadataValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             operation='trunc' | 
	 *             operation='zext' | 
	 *             operation='sext' | 
	 *             operation='fptrunc' | 
	 *             operation='fpext' | 
	 *             operation='fptoui' | 
	 *             operation='fptosi' | 
	 *             operation='uitofp' | 
	 *             operation='sitofp' | 
	 *             operation='ptrtoint' | 
	 *             operation='inttoptr' | 
	 *             operation='bitcast'
	 *         ) 
	 *         (from=TypeUse | from=Aggregate_Type) 
	 *         value=Value 
	 *         to=TypeUse
	 *     )
	 */
	protected void sequence_NestedCast(EObject context, NestedCast semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (aggregate=Parameter indices+=Parameter*)
	 */
	protected void sequence_NestedGetElementPtr(EObject context, NestedGetElementPtr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((params+=Parameter params+=Parameter*)?)
	 */
	protected void sequence_ParameterList(EObject context, ParameterList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((type=TypeUse | type=Aggregate_Type) (value=Value | value=Value?))
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=Value label=VALID_ID)
	 */
	protected void sequence_PhiCase(EObject context, PhiCase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.PHI_CASE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.PHI_CASE__VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.PHI_CASE__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.PHI_CASE__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPhiCaseAccess().getValueValueParserRuleCall_0_0(), semanticObject.getValue());
		feeder.accept(grammarAccess.getPhiCaseAccess().getLabelVALID_IDTerminalRuleCall_2_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address type=TypeUse cases+=PhiCase cases+=PhiCase*)
	 */
	protected void sequence_Phi(EObject context, Phi semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             type='void' | 
	 *             type='null' | 
	 *             type='label' | 
	 *             type='undef' | 
	 *             type='...' | 
	 *             type=INT_TYPE | 
	 *             type=FLOATING_POINT_TYPE
	 *         ) 
	 *         pointer=POINTER?
	 *     )
	 */
	protected void sequence_Predefined(EObject context, Predefined semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             type='void' | 
	 *             type='null' | 
	 *             type='label' | 
	 *             type='undef' | 
	 *             type='...' | 
	 *             type=INT_TYPE | 
	 *             type=FLOATING_POINT_TYPE
	 *         ) 
	 *         pointer=POINTER? 
	 *         functionInput=UNKNOWN_TYPE?
	 *     )
	 */
	protected void sequence_Predefined_TypeUse(EObject context, Predefined semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=STRING | 
	 *         value='void' | 
	 *         value='null' | 
	 *         value='label' | 
	 *         value='undef' | 
	 *         value='...' | 
	 *         value=BOOL | 
	 *         value='zeroinitializer'
	 *     )
	 */
	protected void sequence_PrimitiveValue(EObject context, PrimitiveValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type=Structure value=Value)
	 */
	protected void sequence_Resume(EObject context, Resume semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.RESUME__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.RESUME__TYPE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.RESUME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.RESUME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getResumeAccess().getTypeStructureParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getResumeAccess().getValueValueParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=Parameter
	 */
	protected void sequence_Return(EObject context, Return semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.RETURN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.RETURN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReturnAccess().getValueParameterParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address condition=Parameter trueValue=Parameter elseValue=Parameter)
	 */
	protected void sequence_Select(EObject context, Select semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__TRUE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__TRUE_VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SELECT__ELSE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SELECT__ELSE_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getSelectAccess().getConditionParameterParserRuleCall_3_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getSelectAccess().getTrueValueParameterParserRuleCall_5_0(), semanticObject.getTrueValue());
		feeder.accept(grammarAccess.getSelectAccess().getElseValueParameterParserRuleCall_7_0(), semanticObject.getElseValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address value1=Parameter value2=Parameter mask=Parameter)
	 */
	protected void sequence_ShuffleVector(EObject context, ShuffleVector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VALUE1) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VALUE1));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VALUE2) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__VALUE2));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__MASK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SHUFFLE_VECTOR__MASK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getShuffleVectorAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getValue1ParameterParserRuleCall_3_0(), semanticObject.getValue1());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getValue2ParameterParserRuleCall_5_0(), semanticObject.getValue2());
		feeder.accept(grammarAccess.getShuffleVectorAccess().getMaskParameterParserRuleCall_7_0(), semanticObject.getMask());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         ((volatile?='volatile' | volatile?='volatile'?) value=Parameter targetAddress=Parameter align=NUMBER? meta+=MetaArgValue*) | 
	 *         (
	 *             atomic?='atomic' 
	 *             volatile?='volatile'? 
	 *             value=Parameter 
	 *             targetAddress=Parameter 
	 *             (
	 *                 ordering='unordered' | 
	 *                 ordering='monotonic' | 
	 *                 ordering='aquire' | 
	 *                 ordering='release' | 
	 *                 ordering='acq_rel' | 
	 *                 ordering='seq_cst'
	 *             ) 
	 *             align=NUMBER?
	 *         )
	 *     )
	 */
	protected void sequence_Store(EObject context, Store semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((types+=TypeUse | types+=Aggregate_Type) (types+=TypeUse | types+=Aggregate_Type)*)?)
	 */
	protected void sequence_Structure(EObject context, Structure semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (caseValue=Parameter destination=VALID_ID)
	 */
	protected void sequence_SwitchCase(EObject context, SwitchCase semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SWITCH_CASE__CASE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SWITCH_CASE__CASE_VALUE));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.SWITCH_CASE__DESTINATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.SWITCH_CASE__DESTINATION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSwitchCaseAccess().getCaseValueParameterParserRuleCall_0_0(), semanticObject.getCaseValue());
		feeder.accept(grammarAccess.getSwitchCaseAccess().getDestinationVALID_IDTerminalRuleCall_3_0(), semanticObject.getDestination());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (caseValue=Parameter defaultCase=VALID_ID cases+=SwitchCase*)
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
	 *     {Unreachable}
	 */
	protected void sequence_Unreachable(EObject context, Unreachable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=Parameter values+=Parameter*)
	 */
	protected void sequence_ValueStruct(EObject context, ValueStruct semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (result=Address vaList=Parameter aType=TypeUse)
	 */
	protected void sequence_VariableAttributeAccess(EObject context, VariableAttributeAccess semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__RESULT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__RESULT));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__VA_LIST));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__ATYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VARIABLE_ATTRIBUTE_ACCESS__ATYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAttributeAccessAccess().getResultAddressParserRuleCall_0_0(), semanticObject.getResult());
		feeder.accept(grammarAccess.getVariableAttributeAccessAccess().getVaListParameterParserRuleCall_3_0(), semanticObject.getVaList());
		feeder.accept(grammarAccess.getVariableAttributeAccessAccess().getATypeTypeUseParserRuleCall_5_0(), semanticObject.getAType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (length=NUMBER type=TypeUse)
	 */
	protected void sequence_Vector(EObject context, Vector semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VECTOR__LENGTH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VECTOR__LENGTH));
			if(transientValues.isValueTransient(semanticObject, LlvmPackage.Literals.VECTOR__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LlvmPackage.Literals.VECTOR__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVectorAccess().getLengthNUMBERParserRuleCall_1_0(), semanticObject.getLength());
		feeder.accept(grammarAccess.getVectorAccess().getTypeTypeUseParserRuleCall_3_0(), semanticObject.getType());
		feeder.finish();
	}
}
