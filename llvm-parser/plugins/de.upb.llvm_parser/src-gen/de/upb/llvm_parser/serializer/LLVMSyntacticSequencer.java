package de.upb.llvm_parser.serializer;

import com.google.inject.Inject;
import de.upb.llvm_parser.services.LLVMGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LLVMSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LLVMGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q;
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_AliasDefinition_ALIAS_LINKAGETerminalRuleCall_3_q;
	protected AbstractElementAlias match_AliasDefinition_VISIBILITYTerminalRuleCall_4_q;
	protected AbstractElementAlias match_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_or_NuwKeyword_3_1_0__q__q;
	protected AbstractElementAlias match_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_q_or_NuwKeyword_3_1_0_q____q;
	protected AbstractElementAlias match_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__;
	protected AbstractElementAlias match_Array_POINTERTerminalRuleCall_2_q;
	protected AbstractElementAlias match_AtomicRMW_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_Call_CallingConvParserRuleCall_3_q;
	protected AbstractElementAlias match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a;
	protected AbstractElementAlias match_Call_RETURN_ATTRIBUTESTerminalRuleCall_4_q;
	protected AbstractElementAlias match_Call_TailKeyword_1_q;
	protected AbstractElementAlias match_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_NUMBERParserRuleCall_8_3__a;
	protected AbstractElementAlias match_CmpXchg_SinglethreadKeyword_9_q;
	protected AbstractElementAlias match_Compare_FcmpKeyword_2_0_1_or_IcmpKeyword_2_0_0;
	protected AbstractElementAlias match_Fence_SinglethreadKeyword_1_q;
	protected AbstractElementAlias match_FunctionDefinition_CallingConvParserRuleCall_0_3_q;
	protected AbstractElementAlias match_FunctionDefinition_CallingConvParserRuleCall_1_3_q;
	protected AbstractElementAlias match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a;
	protected AbstractElementAlias match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a;
	protected AbstractElementAlias match_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_0_4_q;
	protected AbstractElementAlias match_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_1_4_q;
	protected AbstractElementAlias match_FunctionDefinition_Unnamed_addrKeyword_0_8_q;
	protected AbstractElementAlias match_FunctionDefinition_Unnamed_addrKeyword_1_8_q;
	protected AbstractElementAlias match_FunctionDefinition_VISIBILITYTerminalRuleCall_0_2_q;
	protected AbstractElementAlias match_FunctionDefinition_VISIBILITYTerminalRuleCall_1_2_q;
	protected AbstractElementAlias match_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_0_1_1_or_LINKAGETerminalRuleCall_0_1_0__q;
	protected AbstractElementAlias match_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_1_1_1_or_LINKAGETerminalRuleCall_1_1_0__q;
	protected AbstractElementAlias match_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q;
	protected AbstractElementAlias match_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q;
	protected AbstractElementAlias match_FunctionParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__;
	protected AbstractElementAlias match_FunctionParameter_RETURN_ATTRIBUTESTerminalRuleCall_1_a;
	protected AbstractElementAlias match_GetElementPtr_InboundsKeyword_3_q;
	protected AbstractElementAlias match_GlobalDefinition___ALIAS_LINKAGETerminalRuleCall_2_1_or_ConstantKeyword_2_4_or_GlobalKeyword_2_2_or_LINKAGETerminalRuleCall_2_0_or_Unnamed_addrKeyword_2_3__a;
	protected AbstractElementAlias match_Invoke_CallingConvParserRuleCall_1_q;
	protected AbstractElementAlias match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a;
	protected AbstractElementAlias match_Invoke_RETURN_ATTRIBUTESTerminalRuleCall_2_q;
	protected AbstractElementAlias match_Load_SinglethreadKeyword_1_6_q;
	protected AbstractElementAlias match_MetadataValue_ExclamationMarkLeftCurlyBracketKeyword_3_1_or___ExclamationMarkKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__;
	protected AbstractElementAlias match_MetadataValue_MetadataKeyword_2_q;
	protected AbstractElementAlias match_NestedGetElementPtr_InboundsKeyword_1_q;
	protected AbstractElementAlias match_ParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__;
	protected AbstractElementAlias match_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_0_0_p;
	protected AbstractElementAlias match_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_1_1_a;
	protected AbstractElementAlias match_Return___CommaKeyword_2_0_DbgKeyword_2_1_ExclamationMarkKeyword_2_2_NUMBERParserRuleCall_2_3__q;
	protected AbstractElementAlias match_Store_SinglethreadKeyword_1_6_q;
	protected AbstractElementAlias match_Structure_POINTERTerminalRuleCall_4_q;
	protected AbstractElementAlias match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LLVMGrammarAccess) access;
		match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1());
		match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1());
		match_AliasDefinition_ALIAS_LINKAGETerminalRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getAliasDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_3());
		match_AliasDefinition_VISIBILITYTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getAliasDefinitionAccess().getVISIBILITYTerminalRuleCall_4());
		match_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_or_NuwKeyword_3_1_0__q__q = new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getArithmeticOperationAccess().getNswKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getArithmeticOperationAccess().getNuwKeyword_3_0_1())), new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getArithmeticOperationAccess().getNswKeyword_3_1_1()), new TokenAlias(false, false, grammarAccess.getArithmeticOperationAccess().getNuwKeyword_3_1_0())));
		match_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_q_or_NuwKeyword_3_1_0_q____q = new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getArithmeticOperationAccess().getNswKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getArithmeticOperationAccess().getNuwKeyword_3_0_1())), new AlternativeAlias(false, false, new TokenAlias(false, true, grammarAccess.getArithmeticOperationAccess().getNswKeyword_3_1_1()), new TokenAlias(false, true, grammarAccess.getArithmeticOperationAccess().getNuwKeyword_3_1_0())));
		match_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_1_2_1())), new TokenAlias(false, false, grammarAccess.getArrayAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1()));
		match_Array_POINTERTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getArrayAccess().getPOINTERTerminalRuleCall_2());
		match_AtomicRMW_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_8());
		match_Call_CallingConvParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getCallingConvParserRuleCall_3());
		match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a = new TokenAlias(true, true, grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_7());
		match_Call_RETURN_ATTRIBUTESTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getRETURN_ATTRIBUTESTerminalRuleCall_4());
		match_Call_TailKeyword_1_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getTailKeyword_1());
		match_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_NUMBERParserRuleCall_8_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCallAccess().getCommaKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getCallAccess().getSrclocKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getCallAccess().getExclamationMarkKeyword_8_2()), new TokenAlias(false, false, grammarAccess.getCallAccess().getNUMBERParserRuleCall_8_3()));
		match_CmpXchg_SinglethreadKeyword_9_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_9());
		match_Compare_FcmpKeyword_2_0_1_or_IcmpKeyword_2_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompareAccess().getFcmpKeyword_2_0_1()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getIcmpKeyword_2_0_0()));
		match_Fence_SinglethreadKeyword_1_q = new TokenAlias(false, true, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
		match_FunctionDefinition_CallingConvParserRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_0_3());
		match_FunctionDefinition_CallingConvParserRuleCall_1_3_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_1_3());
		match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9());
		match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9());
		match_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_0_4_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESTerminalRuleCall_0_4());
		match_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_1_4_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1_4());
		match_FunctionDefinition_Unnamed_addrKeyword_0_8_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_0_8());
		match_FunctionDefinition_Unnamed_addrKeyword_1_8_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_1_8());
		match_FunctionDefinition_VISIBILITYTerminalRuleCall_0_2_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getVISIBILITYTerminalRuleCall_0_2());
		match_FunctionDefinition_VISIBILITYTerminalRuleCall_1_2_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getVISIBILITYTerminalRuleCall_1_2());
		match_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_0_1_1_or_LINKAGETerminalRuleCall_0_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_0_1_1()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLINKAGETerminalRuleCall_0_1_0()));
		match_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_1_1_1_or_LINKAGETerminalRuleCall_1_1_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLINKAGETerminalRuleCall_1_1_0()));
		match_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_0_10_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_0_10_1()));
		match_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_1_10_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_1_10_1()));
		match_FunctionParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionParameterListAccess().getLeftParenthesisKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getFunctionParameterListAccess().getRightParenthesisKeyword_1_1_2())), new TokenAlias(false, false, grammarAccess.getFunctionParameterListAccess().getLeftParenthesisRightParenthesisKeyword_1_0()));
		match_FunctionParameter_RETURN_ATTRIBUTESTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFunctionParameterAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1());
		match_GetElementPtr_InboundsKeyword_3_q = new TokenAlias(false, true, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_3());
		match_GlobalDefinition___ALIAS_LINKAGETerminalRuleCall_2_1_or_ConstantKeyword_2_4_or_GlobalKeyword_2_2_or_LINKAGETerminalRuleCall_2_0_or_Unnamed_addrKeyword_2_3__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getConstantKeyword_2_4()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getGlobalKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getLINKAGETerminalRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getUnnamed_addrKeyword_2_3()));
		match_Invoke_CallingConvParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1());
		match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6());
		match_Invoke_RETURN_ATTRIBUTESTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getRETURN_ATTRIBUTESTerminalRuleCall_2());
		match_Load_SinglethreadKeyword_1_6_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_6());
		match_MetadataValue_ExclamationMarkLeftCurlyBracketKeyword_3_1_or___ExclamationMarkKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getMetadataValueAccess().getLeftCurlyBracketKeyword_3_0_1())), new TokenAlias(false, false, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_3_1()));
		match_MetadataValue_MetadataKeyword_2_q = new TokenAlias(false, true, grammarAccess.getMetadataValueAccess().getMetadataKeyword_2());
		match_NestedGetElementPtr_InboundsKeyword_1_q = new TokenAlias(false, true, grammarAccess.getNestedGetElementPtrAccess().getInboundsKeyword_1());
		match_ParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_1_1_2())), new TokenAlias(false, false, grammarAccess.getParameterListAccess().getLeftParenthesisRightParenthesisKeyword_1_0()));
		match_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_0_0_p = new TokenAlias(true, false, grammarAccess.getParameterAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1_0_0());
		match_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_1_1_a = new TokenAlias(true, true, grammarAccess.getParameterAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1_1_1());
		match_Return___CommaKeyword_2_0_DbgKeyword_2_1_ExclamationMarkKeyword_2_2_NUMBERParserRuleCall_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getNUMBERParserRuleCall_2_3()));
		match_Store_SinglethreadKeyword_1_6_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
		match_Structure_POINTERTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getStructureAccess().getPOINTERTerminalRuleCall_4());
		match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getALIAS_LINKAGERule())
			return getALIAS_LINKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCallingConvRule())
			return getCallingConvToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFUNCTION_ATTRIBUTESRule())
			return getFUNCTION_ATTRIBUTESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINT_TYPERule())
			return getINT_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLINKAGERule())
			return getLINKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getNUMBERRule())
			return getNUMBERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPOINTERRule())
			return getPOINTERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRETURN_ATTRIBUTESRule())
			return getRETURN_ATTRIBUTESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVISIBILITYRule())
			return getVISIBILITYToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ALIAS_LINKAGE:
	 * 	'external' | 'internal' | 'weak' | 'weak_odr';
	 */
	protected String getALIAS_LINKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "external";
	}
	
	/**
	 * CallingConv:
	 * 	'ccc' | 'fastcc' | 'coldcc' | 'x86_stdcallcc' | 'x86_fastcallcc' | 'x86_thiscallcc' | 'arm_apcscc' | 'arm_aapcscc' |
	 * 	'arm_aapcs_vfpcc' | 'msp430_intrcc' | 'ptx_kernel' | 'ptx_device' | 'spir_func' | 'spir_kernel' | 'cc' '<' NUMBER '>'
	 * 	NUMBER;
	 */
	protected String getCallingConvToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ccc";
	}
	
	/**
	 * FUNCTION_ATTRIBUTES:
	 * 	'address_safety' | 'alignstack' '(' '<' NUMBER '>' ')' | 'alwaysinline' | 'nonlazybind' | 'inlinehint' | 'naked' |
	 * 	'noimplicitfloat' | 'noinline' | 'noredzone' | 'noreturn' | 'nounwind' | 'optsize' | 'readnone' | 'readonly' |
	 * 	'returns_twice' | 'ssp' | 'sspreq' | 'uwtable';
	 */
	protected String getFUNCTION_ATTRIBUTESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "address_safety";
	}
	
	/**
	 * terminal INT_TYPE:
	 * 	'i' ('0'..'9')+ POINTER?;
	 */
	protected String getINT_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "i";
	}
	
	/**
	 * terminal LINKAGE:
	 * 	'private' | 'linker_private' | 'linker_private_weak' | 'available_externally' | 'linkonce' | 'common' | 'appending' |
	 * 	'extern_weak' | 'linkonce_odr' | 'linkonce_odr_auto_hide' | 'dllimport' | 'dllexport' ;
	 */
	protected String getLINKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "private";
	}
	
	/**
	 * NUMBER returns EBigDecimal:
	 * 	'-'? INT ('.' INT)?;
	 */
	protected String getNUMBERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	/**
	 * terminal POINTER:
	 * 	'*'+;
	 */
	protected String getPOINTERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	/**
	 * terminal RETURN_ATTRIBUTES:
	 * 	'zeroext' | 'signext' | 'inreg' | 'byval' | 'sret' | 'noalias' | 'nocapture' | 'nest';
	 */
	protected String getRETURN_ATTRIBUTESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "zeroext";
	}
	
	/**
	 * terminal SL_COMMENT:
	 * 	';' !('\n' | '\r')* ('\r'? '\n')?;
	 */
	protected String getSL_COMMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ";";
	}
	
	/**
	 * terminal STRING:
	 * 	'c'?'"' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '0' | '"' | "'" | '\\') | !('\\' | '"'))* '"' |
	 * 	'c'?"'" ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '0' | '"' | "'" | '\\') | !('\\' | "'"))* "'";
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * terminal VISIBILITY:
	 * 	'default' | 'hidden' | 'protected';
	 */
	protected String getVISIBILITYToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "default";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AliasDefinition_ALIAS_LINKAGETerminalRuleCall_3_q.equals(syntax))
				emit_AliasDefinition_ALIAS_LINKAGETerminalRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AliasDefinition_VISIBILITYTerminalRuleCall_4_q.equals(syntax))
				emit_AliasDefinition_VISIBILITYTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_or_NuwKeyword_3_1_0__q__q.equals(syntax))
				emit_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_or_NuwKeyword_3_1_0__q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_q_or_NuwKeyword_3_1_0_q____q.equals(syntax))
				emit_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_q_or_NuwKeyword_3_1_0_q____q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__.equals(syntax))
				emit_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Array_POINTERTerminalRuleCall_2_q.equals(syntax))
				emit_Array_POINTERTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRMW_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRMW_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_CallingConvParserRuleCall_3_q.equals(syntax))
				emit_Call_CallingConvParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a.equals(syntax))
				emit_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_RETURN_ATTRIBUTESTerminalRuleCall_4_q.equals(syntax))
				emit_Call_RETURN_ATTRIBUTESTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_TailKeyword_1_q.equals(syntax))
				emit_Call_TailKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_NUMBERParserRuleCall_8_3__a.equals(syntax))
				emit_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_NUMBERParserRuleCall_8_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_SinglethreadKeyword_9_q.equals(syntax))
				emit_CmpXchg_SinglethreadKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Compare_FcmpKeyword_2_0_1_or_IcmpKeyword_2_0_0.equals(syntax))
				emit_Compare_FcmpKeyword_2_0_1_or_IcmpKeyword_2_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Fence_SinglethreadKeyword_1_q.equals(syntax))
				emit_Fence_SinglethreadKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_CallingConvParserRuleCall_0_3_q.equals(syntax))
				emit_FunctionDefinition_CallingConvParserRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_CallingConvParserRuleCall_1_3_q.equals(syntax))
				emit_FunctionDefinition_CallingConvParserRuleCall_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a.equals(syntax))
				emit_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a.equals(syntax))
				emit_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_0_4_q.equals(syntax))
				emit_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_0_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_1_4_q.equals(syntax))
				emit_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_Unnamed_addrKeyword_0_8_q.equals(syntax))
				emit_FunctionDefinition_Unnamed_addrKeyword_0_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_Unnamed_addrKeyword_1_8_q.equals(syntax))
				emit_FunctionDefinition_Unnamed_addrKeyword_1_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_VISIBILITYTerminalRuleCall_0_2_q.equals(syntax))
				emit_FunctionDefinition_VISIBILITYTerminalRuleCall_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_VISIBILITYTerminalRuleCall_1_2_q.equals(syntax))
				emit_FunctionDefinition_VISIBILITYTerminalRuleCall_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_0_1_1_or_LINKAGETerminalRuleCall_0_1_0__q.equals(syntax))
				emit_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_0_1_1_or_LINKAGETerminalRuleCall_0_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_1_1_1_or_LINKAGETerminalRuleCall_1_1_0__q.equals(syntax))
				emit_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_1_1_1_or_LINKAGETerminalRuleCall_1_1_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q.equals(syntax))
				emit_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q.equals(syntax))
				emit_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__.equals(syntax))
				emit_FunctionParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionParameter_RETURN_ATTRIBUTESTerminalRuleCall_1_a.equals(syntax))
				emit_FunctionParameter_RETURN_ATTRIBUTESTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GetElementPtr_InboundsKeyword_3_q.equals(syntax))
				emit_GetElementPtr_InboundsKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GlobalDefinition___ALIAS_LINKAGETerminalRuleCall_2_1_or_ConstantKeyword_2_4_or_GlobalKeyword_2_2_or_LINKAGETerminalRuleCall_2_0_or_Unnamed_addrKeyword_2_3__a.equals(syntax))
				emit_GlobalDefinition___ALIAS_LINKAGETerminalRuleCall_2_1_or_ConstantKeyword_2_4_or_GlobalKeyword_2_2_or_LINKAGETerminalRuleCall_2_0_or_Unnamed_addrKeyword_2_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_CallingConvParserRuleCall_1_q.equals(syntax))
				emit_Invoke_CallingConvParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a.equals(syntax))
				emit_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_RETURN_ATTRIBUTESTerminalRuleCall_2_q.equals(syntax))
				emit_Invoke_RETURN_ATTRIBUTESTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_SinglethreadKeyword_1_6_q.equals(syntax))
				emit_Load_SinglethreadKeyword_1_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetadataValue_ExclamationMarkLeftCurlyBracketKeyword_3_1_or___ExclamationMarkKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__.equals(syntax))
				emit_MetadataValue_ExclamationMarkLeftCurlyBracketKeyword_3_1_or___ExclamationMarkKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetadataValue_MetadataKeyword_2_q.equals(syntax))
				emit_MetadataValue_MetadataKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NestedGetElementPtr_InboundsKeyword_1_q.equals(syntax))
				emit_NestedGetElementPtr_InboundsKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__.equals(syntax))
				emit_ParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_0_0_p.equals(syntax))
				emit_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_0_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_1_1_a.equals(syntax))
				emit_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_1_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return___CommaKeyword_2_0_DbgKeyword_2_1_ExclamationMarkKeyword_2_2_NUMBERParserRuleCall_2_3__q.equals(syntax))
				emit_Return___CommaKeyword_2_0_DbgKeyword_2_1_ExclamationMarkKeyword_2_2_NUMBERParserRuleCall_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_SinglethreadKeyword_1_6_q.equals(syntax))
				emit_Store_SinglethreadKeyword_1_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_POINTERTerminalRuleCall_4_q.equals(syntax))
				emit_Structure_POINTERTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1.equals(syntax))
				emit_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ALIAS_LINKAGE?
	 */
	protected void emit_AliasDefinition_ALIAS_LINKAGETerminalRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VISIBILITY?
	 */
	protected void emit_AliasDefinition_VISIBILITYTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('nsw' | 'nuw') ('nuw' | 'nsw')?)?
	 */
	protected void emit_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_or_NuwKeyword_3_1_0__q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('nsw' | 'nuw') ('nuw'? | 'nsw'?))?
	 */
	protected void emit_ArithmeticOperation_____NswKeyword_3_0_0_or_NuwKeyword_3_0_1_____NswKeyword_3_1_1_q_or_NuwKeyword_3_1_0_q____q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '[]' | ('[' ']')
	 */
	protected void emit_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     POINTER?
	 */
	protected void emit_Array_POINTERTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRMW_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CallingConv?
	 */
	protected void emit_Call_CallingConvParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FUNCTION_ATTRIBUTES*
	 */
	protected void emit_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_Call_RETURN_ATTRIBUTESTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'tail'?
	 */
	protected void emit_Call_TailKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' '!srcloc' '!' NUMBER)*
	 */
	protected void emit_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_NUMBERParserRuleCall_8_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_CmpXchg_SinglethreadKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'fcmp' | 'icmp'
	 */
	protected void emit_Compare_FcmpKeyword_2_0_1_or_IcmpKeyword_2_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Fence_SinglethreadKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CallingConv?
	 */
	protected void emit_FunctionDefinition_CallingConvParserRuleCall_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CallingConv?
	 */
	protected void emit_FunctionDefinition_CallingConvParserRuleCall_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FUNCTION_ATTRIBUTES*
	 */
	protected void emit_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FUNCTION_ATTRIBUTES*
	 */
	protected void emit_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_0_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_FunctionDefinition_RETURN_ATTRIBUTESTerminalRuleCall_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'unnamed_addr'?
	 */
	protected void emit_FunctionDefinition_Unnamed_addrKeyword_0_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'unnamed_addr'?
	 */
	protected void emit_FunctionDefinition_Unnamed_addrKeyword_1_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VISIBILITY?
	 */
	protected void emit_FunctionDefinition_VISIBILITYTerminalRuleCall_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VISIBILITY?
	 */
	protected void emit_FunctionDefinition_VISIBILITYTerminalRuleCall_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (LINKAGE | ALIAS_LINKAGE)?
	 */
	protected void emit_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_0_1_1_or_LINKAGETerminalRuleCall_0_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ALIAS_LINKAGE | LINKAGE)?
	 */
	protected void emit_FunctionDefinition___ALIAS_LINKAGETerminalRuleCall_1_1_1_or_LINKAGETerminalRuleCall_1_1_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('section ' STRING)?
	 */
	protected void emit_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('section ' STRING)?
	 */
	protected void emit_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')') | '()'
	 */
	protected void emit_FunctionParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES*
	 */
	protected void emit_FunctionParameter_RETURN_ATTRIBUTESTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inbounds'?
	 */
	protected void emit_GetElementPtr_InboundsKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (ALIAS_LINKAGE | 'global' | 'unnamed_addr' | 'constant' | LINKAGE)*
	 */
	protected void emit_GlobalDefinition___ALIAS_LINKAGETerminalRuleCall_2_1_or_ConstantKeyword_2_4_or_GlobalKeyword_2_2_or_LINKAGETerminalRuleCall_2_0_or_Unnamed_addrKeyword_2_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CallingConv?
	 */
	protected void emit_Invoke_CallingConvParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FUNCTION_ATTRIBUTES*
	 */
	protected void emit_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_Invoke_RETURN_ATTRIBUTESTerminalRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Load_SinglethreadKeyword_1_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('!' '{') | '!{'
	 */
	protected void emit_MetadataValue_ExclamationMarkLeftCurlyBracketKeyword_3_1_or___ExclamationMarkKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'metadata'?
	 */
	protected void emit_MetadataValue_MetadataKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inbounds'?
	 */
	protected void emit_NestedGetElementPtr_InboundsKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')') | '()'
	 */
	protected void emit_ParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES+
	 */
	protected void emit_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_0_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES*
	 */
	protected void emit_Parameter_RETURN_ATTRIBUTESTerminalRuleCall_1_1_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' '!dbg' '!' NUMBER)?
	 */
	protected void emit_Return___CommaKeyword_2_0_DbgKeyword_2_1_ExclamationMarkKeyword_2_2_NUMBERParserRuleCall_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Store_SinglethreadKeyword_1_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     POINTER?
	 */
	protected void emit_Structure_POINTERTerminalRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'triple' | 'datalayout'
	 */
	protected void emit_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
