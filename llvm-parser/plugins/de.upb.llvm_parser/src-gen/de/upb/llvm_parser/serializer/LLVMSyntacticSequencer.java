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
	protected AbstractElementAlias match_ARITHMETIC_OP_AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9;
	protected AbstractElementAlias match_ARITHMETIC_OP_____NswKeyword_1_0_0_or_NuwKeyword_1_0_1_____NswKeyword_1_1_1_or_NuwKeyword_1_1_0__q__q;
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q;
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_AliasDefinition_ALIAS_LINKAGEParserRuleCall_3_q;
	protected AbstractElementAlias match_AliasDefinition_VISIBILITYParserRuleCall_4_q;
	protected AbstractElementAlias match_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q;
	protected AbstractElementAlias match_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__;
	protected AbstractElementAlias match_Array_POINTERTerminalRuleCall_2_q;
	protected AbstractElementAlias match_AtomicRMW_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRMW_VolatileKeyword_1_q;
	protected AbstractElementAlias match_Call_CallingConvParserRuleCall_2_q;
	protected AbstractElementAlias match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a;
	protected AbstractElementAlias match_Call_RETURN_ATTRIBUTESParserRuleCall_3_q;
	protected AbstractElementAlias match_Call_SideeffectKeyword_5_1_1_q;
	protected AbstractElementAlias match_Call_TailKeyword_0_q;
	protected AbstractElementAlias match_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_INTTerminalRuleCall_8_3__a;
	protected AbstractElementAlias match_CmpXchg_SinglethreadKeyword_10_q;
	protected AbstractElementAlias match_CmpXchg_VolatileKeyword_1_q;
	protected AbstractElementAlias match_Fence_SinglethreadKeyword_1_q;
	protected AbstractElementAlias match_FunctionDefinition_ALIGNMENTParserRuleCall_0_11_q;
	protected AbstractElementAlias match_FunctionDefinition_ALIGNMENTParserRuleCall_1_11_q;
	protected AbstractElementAlias match_FunctionDefinition_CallingConvParserRuleCall_0_3_q;
	protected AbstractElementAlias match_FunctionDefinition_CallingConvParserRuleCall_1_3_q;
	protected AbstractElementAlias match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a;
	protected AbstractElementAlias match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a;
	protected AbstractElementAlias match_FunctionDefinition_LINKAGEParserRuleCall_0_1_q;
	protected AbstractElementAlias match_FunctionDefinition_LINKAGEParserRuleCall_1_1_q;
	protected AbstractElementAlias match_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_0_4_q;
	protected AbstractElementAlias match_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_1_4_q;
	protected AbstractElementAlias match_FunctionDefinition_Unnamed_addrKeyword_0_8_q;
	protected AbstractElementAlias match_FunctionDefinition_Unnamed_addrKeyword_1_8_q;
	protected AbstractElementAlias match_FunctionDefinition_VISIBILITYParserRuleCall_0_2_q;
	protected AbstractElementAlias match_FunctionDefinition_VISIBILITYParserRuleCall_1_2_q;
	protected AbstractElementAlias match_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q;
	protected AbstractElementAlias match_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q;
	protected AbstractElementAlias match_GetElementPtr1_InboundsKeyword_1_q;
	protected AbstractElementAlias match_GetElementPtr2_InboundsKeyword_1_q;
	protected AbstractElementAlias match_GlobalDefinition___CommaKeyword_5_0_ALIGNMENTParserRuleCall_5_1__q;
	protected AbstractElementAlias match_GlobalDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a;
	protected AbstractElementAlias match_Instruction_VolatileKeyword_0_0_q;
	protected AbstractElementAlias match_Instruction_VolatileKeyword_1_0_q;
	protected AbstractElementAlias match_Invoke_CallingConvParserRuleCall_1_q;
	protected AbstractElementAlias match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a;
	protected AbstractElementAlias match_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q;
	protected AbstractElementAlias match_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5;
	protected AbstractElementAlias match_Load_SinglethreadKeyword_1_6_q;
	protected AbstractElementAlias match_Load_VolatileKeyword_0_1_q;
	protected AbstractElementAlias match_Load_VolatileKeyword_1_2_q;
	protected AbstractElementAlias match_Load___CommaKeyword_0_5_0___ALIGNMENTParserRuleCall_0_5_1_0_or_MetadataValueParserRuleCall_0_5_1_1_p____a;
	protected AbstractElementAlias match_ParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__;
	protected AbstractElementAlias match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_a;
	protected AbstractElementAlias match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_4_3_a;
	protected AbstractElementAlias match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q;
	protected AbstractElementAlias match_Return___CommaKeyword_1_3_0_DbgKeyword_1_3_1_ExclamationMarkKeyword_1_3_2_INTTerminalRuleCall_1_3_3__q;
	protected AbstractElementAlias match_Store_SinglethreadKeyword_1_10_q;
	protected AbstractElementAlias match_Store_VolatileKeyword_0_1_q;
	protected AbstractElementAlias match_Store_VolatileKeyword_1_2_q;
	protected AbstractElementAlias match_Store___CommaKeyword_0_9_0___ALIGNMENTParserRuleCall_0_9_1_0_or_MetadataValueParserRuleCall_0_9_1_1_p____a;
	protected AbstractElementAlias match_Structure_POINTERTerminalRuleCall_4_q;
	protected AbstractElementAlias match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1;
	protected AbstractElementAlias match_TypeList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0___RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0____;
	protected AbstractElementAlias match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_q;
	protected AbstractElementAlias match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3_q;
	protected AbstractElementAlias match_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0;
	protected AbstractElementAlias match_TypeUse_ORESTTerminalRuleCall_1_q;
	protected AbstractElementAlias match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_2_q;
	protected AbstractElementAlias match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_4_2_q;
	protected AbstractElementAlias match_Value_InitializersParserRuleCall_0_1_2_or_Primitive_TypeParserRuleCall_0_1_1_or_STRINGTerminalRuleCall_0_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LLVMGrammarAccess) access;
		match_ARITHMETIC_OP_AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getAddKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFaddKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFdivKeyword_0_8()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFmulKeyword_0_5()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFremKeyword_0_11()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFsubKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getMulKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSdivKeyword_0_7()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSremKeyword_0_10()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSubKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getUdivKeyword_0_6()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getUremKeyword_0_9()));
		match_ARITHMETIC_OP_____NswKeyword_1_0_0_or_NuwKeyword_1_0_1_____NswKeyword_1_1_1_or_NuwKeyword_1_1_0__q__q = new GroupAlias(false, true, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getNswKeyword_1_0_0()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getNuwKeyword_1_0_1())), new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getNswKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getNuwKeyword_1_1_0())));
		match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1());
		match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1());
		match_AliasDefinition_ALIAS_LINKAGEParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getAliasDefinitionAccess().getALIAS_LINKAGEParserRuleCall_3());
		match_AliasDefinition_VISIBILITYParserRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getAliasDefinitionAccess().getVISIBILITYParserRuleCall_4());
		match_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAllocAccess().getCommaKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAllocAccess().getALIGNMENTParserRuleCall_3_1()));
		match_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_1_2_1())), new TokenAlias(false, false, grammarAccess.getArrayAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1()));
		match_Array_POINTERTerminalRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getArrayAccess().getPOINTERTerminalRuleCall_2());
		match_AtomicRMW_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_8());
		match_AtomicRMW_VolatileKeyword_1_q = new TokenAlias(false, true, grammarAccess.getAtomicRMWAccess().getVolatileKeyword_1());
		match_Call_CallingConvParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getCallingConvParserRuleCall_2());
		match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a = new TokenAlias(true, true, grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_7());
		match_Call_RETURN_ATTRIBUTESParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getRETURN_ATTRIBUTESParserRuleCall_3());
		match_Call_SideeffectKeyword_5_1_1_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getSideeffectKeyword_5_1_1());
		match_Call_TailKeyword_0_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getTailKeyword_0());
		match_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_INTTerminalRuleCall_8_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCallAccess().getCommaKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getCallAccess().getSrclocKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getCallAccess().getExclamationMarkKeyword_8_2()), new TokenAlias(false, false, grammarAccess.getCallAccess().getINTTerminalRuleCall_8_3()));
		match_CmpXchg_SinglethreadKeyword_10_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_10());
		match_CmpXchg_VolatileKeyword_1_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getVolatileKeyword_1());
		match_Fence_SinglethreadKeyword_1_q = new TokenAlias(false, true, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
		match_FunctionDefinition_ALIGNMENTParserRuleCall_0_11_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getALIGNMENTParserRuleCall_0_11());
		match_FunctionDefinition_ALIGNMENTParserRuleCall_1_11_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getALIGNMENTParserRuleCall_1_11());
		match_FunctionDefinition_CallingConvParserRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_0_3());
		match_FunctionDefinition_CallingConvParserRuleCall_1_3_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_1_3());
		match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9());
		match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9());
		match_FunctionDefinition_LINKAGEParserRuleCall_0_1_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getLINKAGEParserRuleCall_0_1());
		match_FunctionDefinition_LINKAGEParserRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getLINKAGEParserRuleCall_1_1());
		match_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_0_4_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESParserRuleCall_0_4());
		match_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_1_4_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESParserRuleCall_1_4());
		match_FunctionDefinition_Unnamed_addrKeyword_0_8_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_0_8());
		match_FunctionDefinition_Unnamed_addrKeyword_1_8_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_1_8());
		match_FunctionDefinition_VISIBILITYParserRuleCall_0_2_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getVISIBILITYParserRuleCall_0_2());
		match_FunctionDefinition_VISIBILITYParserRuleCall_1_2_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getVISIBILITYParserRuleCall_1_2());
		match_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_0_10_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_0_10_1()));
		match_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_1_10_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_1_10_1()));
		match_GetElementPtr1_InboundsKeyword_1_q = new TokenAlias(false, true, grammarAccess.getGetElementPtr1Access().getInboundsKeyword_1());
		match_GetElementPtr2_InboundsKeyword_1_q = new TokenAlias(false, true, grammarAccess.getGetElementPtr2Access().getInboundsKeyword_1());
		match_GlobalDefinition___CommaKeyword_5_0_ALIGNMENTParserRuleCall_5_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getCommaKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getALIGNMENTParserRuleCall_5_1()));
		match_GlobalDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getConstantKeyword_2_3()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getGlobalKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getLINKAGEParserRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getUnnamed_addrKeyword_2_2()));
		match_Instruction_VolatileKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getInstructionAccess().getVolatileKeyword_0_0());
		match_Instruction_VolatileKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getInstructionAccess().getVolatileKeyword_1_0());
		match_Invoke_CallingConvParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1());
		match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6());
		match_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getRETURN_ATTRIBUTESParserRuleCall_2());
		match_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getAndKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getAshrKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getLshrKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getOrKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getShlKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getXorKeyword_0_5()));
		match_Load_SinglethreadKeyword_1_6_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_6());
		match_Load_VolatileKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getVolatileKeyword_0_1());
		match_Load_VolatileKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getVolatileKeyword_1_2());
		match_Load___CommaKeyword_0_5_0___ALIGNMENTParserRuleCall_0_5_1_0_or_MetadataValueParserRuleCall_0_5_1_1_p____a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLoadAccess().getCommaKeyword_0_5_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadAccess().getALIGNMENTParserRuleCall_0_5_1_0()), new TokenAlias(true, false, grammarAccess.getLoadAccess().getMetadataValueParserRuleCall_0_5_1_1())));
		match_ParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_1_1_2())), new TokenAlias(false, false, grammarAccess.getParameterListAccess().getLeftParenthesisRightParenthesisKeyword_1_0()));
		match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_a = new TokenAlias(true, true, grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_2());
		match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_4_3_a = new TokenAlias(true, true, grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_4_3());
		match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_0_3_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_0_3_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_3_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_3_3()));
		match_Return___CommaKeyword_1_3_0_DbgKeyword_1_3_1_ExclamationMarkKeyword_1_3_2_INTTerminalRuleCall_1_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_1_3_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_1_3_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_3_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_1_3_3()));
		match_Store_SinglethreadKeyword_1_10_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_10());
		match_Store_VolatileKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getVolatileKeyword_0_1());
		match_Store_VolatileKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getVolatileKeyword_1_2());
		match_Store___CommaKeyword_0_9_0___ALIGNMENTParserRuleCall_0_9_1_0_or_MetadataValueParserRuleCall_0_9_1_1_p____a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStoreAccess().getCommaKeyword_0_9_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStoreAccess().getALIGNMENTParserRuleCall_0_9_1_0()), new TokenAlias(true, false, grammarAccess.getStoreAccess().getMetadataValueParserRuleCall_0_9_1_1())));
		match_Structure_POINTERTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getStructureAccess().getPOINTERTerminalRuleCall_4());
		match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1()));
		match_TypeList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0___RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0____ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeListAccess().getLeftParenthesisKeyword_1_1_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskKeyword_1_1_2_2()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskKeyword_1_1_2_1()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisKeyword_1_1_2_0()))), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getLeftParenthesisRightParenthesisKeyword_1_0()));
		match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_q = new TokenAlias(false, true, grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_2());
		match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3_q = new TokenAlias(false, true, grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3());
		match_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskKeyword_1_1_2_2()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskKeyword_1_1_2_1()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisKeyword_1_1_2_0()));
		match_TypeUse_ORESTTerminalRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getTypeUseAccess().getORESTTerminalRuleCall_1());
		match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_2_q = new TokenAlias(false, true, grammarAccess.getValueStructAccess().getLeftParenthesisRightParenthesisAsteriskKeyword_2());
		match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getValueStructAccess().getLeftParenthesisRightParenthesisAsteriskKeyword_4_2());
		match_Value_InitializersParserRuleCall_0_1_2_or_Primitive_TypeParserRuleCall_0_1_1_or_STRINGTerminalRuleCall_0_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getValueAccess().getInitializersParserRuleCall_0_1_2()), new TokenAlias(false, false, grammarAccess.getValueAccess().getPrimitive_TypeParserRuleCall_0_1_1()), new TokenAlias(false, false, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getALIAS_LINKAGERule())
			return getALIAS_LINKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getALIGNMENTRule())
			return getALIGNMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBIN_OPRule())
			return getBIN_OPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCallingConvRule())
			return getCallingConvToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCast_OPRule())
			return getCast_OPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFUNCTION_ATTRIBUTESRule())
			return getFUNCTION_ATTRIBUTESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getF_PREDICATESRule())
			return getF_PREDICATESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINT_TYPERule())
			return getINT_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getI_PREDICATESRule())
			return getI_PREDICATESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getInitializersRule())
			return getInitializersToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLINKAGERule())
			return getLINKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMetadataValueRule())
			return getMetadataValueToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getORESTRule())
			return getORESTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpaqueRule())
			return getOpaqueToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPOINTERRule())
			return getPOINTERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPrimitive_TypeRule())
			return getPrimitive_TypeToken(semanticObject, ruleCall, node);
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
	 * ALIAS_LINKAGE:
	 * 	'external' | 'internal' | 'weak' | 'weak_odr';
	 */
	protected String getALIAS_LINKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "external";
	}
	
	/**
	 * ALIGNMENT:
	 * 	'align' INT ;
	 */
	protected String getALIGNMENTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "align";
	}
	
	/**
	 * BIN_OP:
	 * 	('xchg' | 'add' | 'sub' | 'and' | 'nand' | 'or' | 'xor' | 'max' | 'min' | 'umax' | 'umin');
	 */
	protected String getBIN_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "xchg";
	}
	
	/**
	 * CallingConv:
	 * 	'ccc' | 'fastcc' | 'coldcc' | 'x86_stdcallcc' | 'x86_fastcallcc' | 'x86_thiscallcc' | 'arm_apcscc' | 'arm_aapcscc' |
	 * 	'arm_aapcs_vfpcc' | 'msp430_intrcc' | 'ptx_kernel' | 'ptx_device' | 'spir_func' | 'spir_kernel' | 'cc' '<' INT '>'
	 * 	INT;
	 */
	protected String getCallingConvToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ccc";
	}
	
	/**
	 * Cast_OP:
	 * 	'trunc' | 'zext' | 'sext' | 'fptrunc' | 'fpext' | 'fptoui' | 'fptosi' | 'uitofp' | 'sitofp' | 'ptrtoint' | 'inttoptr'
	 * 	| 'bitcast';
	 */
	protected String getCast_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "trunc";
	}
	
	/**
	 * FUNCTION_ATTRIBUTES:
	 * 	'address_safety' | 'alignstack' '(' '<' INT '>' ')' | 'alwaysinline' | 'nonlazybind' | 'inlinehint' | 'naked' |
	 * 	'noimplicitfloat' | 'noinline' | 'noredzone' | 'noreturn' | 'nounwind' | 'optsize' | 'readnone' | 'readonly' |
	 * 	'returns_twice' | 'ssp' | 'sspreq' | 'uwtable';
	 */
	protected String getFUNCTION_ATTRIBUTESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "address_safety";
	}
	
	/**
	 * F_PREDICATES:
	 * 	'false' | 'oeq' | 'ogt' | 'oge' | 'olt' | 'ole' | 'one' | 'ord' |
	 * 	'ueq' | 'ugt' | 'uge' | 'ult' | 'ule' | 'une' | 'uno' | 'true';
	 */
	protected String getF_PREDICATESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "false";
	}
	
	/**
	 * terminal INT returns ecore::EInt:
	 * 	'-'? ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
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
	 * I_PREDICATES:
	 * 	'eq' | 'ne' | 'ugt' | 'uge' | 'ult' | 'ule' | 'sgt' | 'sge' | 'slt' | 'sle';
	 */
	protected String getI_PREDICATESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "eq";
	}
	
	/**
	 * Initializers:
	 * 	'zeroinitializer';
	 */
	protected String getInitializersToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "zeroinitializer";
	}
	
	/**
	 * LINKAGE:
	 * 	'private' | 'linker_private' | 'linker_private_weak' | 'available_externally' | 'linkonce' | 'common' | 'appending' |
	 * 	'extern_weak' | 'linkonce_odr' | 'linkonce_odr_auto_hide' | 'dllimport' | 'dllexport' | ALIAS_LINKAGE;
	 */
	protected String getLINKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "private";
	}
	
	/**
	 * MetadataValue:
	 * 	(('!' INT) | ('!{' ID_FQN '}') | ('!' ID_FQN))
	 * 	('='
	 * 	(('!' INT) |
	 * 	('!{' ID_FQN '}') |
	 * 	('!' ID_FQN) |
	 * 	'metadata' (('!' '{' | '!{') (('metadata' '!' STRING (',' ('metadata' '!' INT))?)|(INT_TYPE INT ',' INT_TYPE INT)) '}')?))?;
	 */
	protected String getMetadataValueToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!";
	}
	
	/**
	 * terminal OREST:
	 * 	'(...)' POINTER?;
	 */
	protected String getORESTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(...)";
	}
	
	/**
	 * Opaque:
	 * 	'opaque';
	 */
	protected String getOpaqueToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "opaque";
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
	 * Primitive_Type:
	 * 	'void' | 'null' | 'label' | 'undef' | 'true' | 'false';
	 */
	protected String getPrimitive_TypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "void";
	}
	
	/**
	 * RETURN_ATTRIBUTES:
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
	 * VISIBILITY:
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
			if(match_ARITHMETIC_OP_AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9.equals(syntax))
				emit_ARITHMETIC_OP_AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ARITHMETIC_OP_____NswKeyword_1_0_0_or_NuwKeyword_1_0_1_____NswKeyword_1_1_1_or_NuwKeyword_1_1_0__q__q.equals(syntax))
				emit_ARITHMETIC_OP_____NswKeyword_1_0_0_or_NuwKeyword_1_0_1_____NswKeyword_1_1_1_or_NuwKeyword_1_1_0__q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AliasDefinition_ALIAS_LINKAGEParserRuleCall_3_q.equals(syntax))
				emit_AliasDefinition_ALIAS_LINKAGEParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AliasDefinition_VISIBILITYParserRuleCall_4_q.equals(syntax))
				emit_AliasDefinition_VISIBILITYParserRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q.equals(syntax))
				emit_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__.equals(syntax))
				emit_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Array_POINTERTerminalRuleCall_2_q.equals(syntax))
				emit_Array_POINTERTerminalRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRMW_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRMW_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRMW_VolatileKeyword_1_q.equals(syntax))
				emit_AtomicRMW_VolatileKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_CallingConvParserRuleCall_2_q.equals(syntax))
				emit_Call_CallingConvParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a.equals(syntax))
				emit_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_RETURN_ATTRIBUTESParserRuleCall_3_q.equals(syntax))
				emit_Call_RETURN_ATTRIBUTESParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_SideeffectKeyword_5_1_1_q.equals(syntax))
				emit_Call_SideeffectKeyword_5_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_TailKeyword_0_q.equals(syntax))
				emit_Call_TailKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_INTTerminalRuleCall_8_3__a.equals(syntax))
				emit_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_INTTerminalRuleCall_8_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_SinglethreadKeyword_10_q.equals(syntax))
				emit_CmpXchg_SinglethreadKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_VolatileKeyword_1_q.equals(syntax))
				emit_CmpXchg_VolatileKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Fence_SinglethreadKeyword_1_q.equals(syntax))
				emit_Fence_SinglethreadKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_ALIGNMENTParserRuleCall_0_11_q.equals(syntax))
				emit_FunctionDefinition_ALIGNMENTParserRuleCall_0_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_ALIGNMENTParserRuleCall_1_11_q.equals(syntax))
				emit_FunctionDefinition_ALIGNMENTParserRuleCall_1_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_CallingConvParserRuleCall_0_3_q.equals(syntax))
				emit_FunctionDefinition_CallingConvParserRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_CallingConvParserRuleCall_1_3_q.equals(syntax))
				emit_FunctionDefinition_CallingConvParserRuleCall_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a.equals(syntax))
				emit_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a.equals(syntax))
				emit_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_LINKAGEParserRuleCall_0_1_q.equals(syntax))
				emit_FunctionDefinition_LINKAGEParserRuleCall_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_LINKAGEParserRuleCall_1_1_q.equals(syntax))
				emit_FunctionDefinition_LINKAGEParserRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_0_4_q.equals(syntax))
				emit_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_0_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_1_4_q.equals(syntax))
				emit_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_Unnamed_addrKeyword_0_8_q.equals(syntax))
				emit_FunctionDefinition_Unnamed_addrKeyword_0_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_Unnamed_addrKeyword_1_8_q.equals(syntax))
				emit_FunctionDefinition_Unnamed_addrKeyword_1_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_VISIBILITYParserRuleCall_0_2_q.equals(syntax))
				emit_FunctionDefinition_VISIBILITYParserRuleCall_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_VISIBILITYParserRuleCall_1_2_q.equals(syntax))
				emit_FunctionDefinition_VISIBILITYParserRuleCall_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q.equals(syntax))
				emit_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q.equals(syntax))
				emit_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GetElementPtr1_InboundsKeyword_1_q.equals(syntax))
				emit_GetElementPtr1_InboundsKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GetElementPtr2_InboundsKeyword_1_q.equals(syntax))
				emit_GetElementPtr2_InboundsKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GlobalDefinition___CommaKeyword_5_0_ALIGNMENTParserRuleCall_5_1__q.equals(syntax))
				emit_GlobalDefinition___CommaKeyword_5_0_ALIGNMENTParserRuleCall_5_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GlobalDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a.equals(syntax))
				emit_GlobalDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_VolatileKeyword_0_0_q.equals(syntax))
				emit_Instruction_VolatileKeyword_0_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Instruction_VolatileKeyword_1_0_q.equals(syntax))
				emit_Instruction_VolatileKeyword_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_CallingConvParserRuleCall_1_q.equals(syntax))
				emit_Invoke_CallingConvParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a.equals(syntax))
				emit_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q.equals(syntax))
				emit_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5.equals(syntax))
				emit_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_SinglethreadKeyword_1_6_q.equals(syntax))
				emit_Load_SinglethreadKeyword_1_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_VolatileKeyword_0_1_q.equals(syntax))
				emit_Load_VolatileKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_VolatileKeyword_1_2_q.equals(syntax))
				emit_Load_VolatileKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load___CommaKeyword_0_5_0___ALIGNMENTParserRuleCall_0_5_1_0_or_MetadataValueParserRuleCall_0_5_1_1_p____a.equals(syntax))
				emit_Load___CommaKeyword_0_5_0___ALIGNMENTParserRuleCall_0_5_1_0_or_MetadataValueParserRuleCall_0_5_1_1_p____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__.equals(syntax))
				emit_ParameterList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0_RightParenthesisKeyword_1_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_a.equals(syntax))
				emit_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_4_3_a.equals(syntax))
				emit_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_4_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q.equals(syntax))
				emit_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return___CommaKeyword_1_3_0_DbgKeyword_1_3_1_ExclamationMarkKeyword_1_3_2_INTTerminalRuleCall_1_3_3__q.equals(syntax))
				emit_Return___CommaKeyword_1_3_0_DbgKeyword_1_3_1_ExclamationMarkKeyword_1_3_2_INTTerminalRuleCall_1_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_SinglethreadKeyword_1_10_q.equals(syntax))
				emit_Store_SinglethreadKeyword_1_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_VolatileKeyword_0_1_q.equals(syntax))
				emit_Store_VolatileKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_VolatileKeyword_1_2_q.equals(syntax))
				emit_Store_VolatileKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store___CommaKeyword_0_9_0___ALIGNMENTParserRuleCall_0_9_1_0_or_MetadataValueParserRuleCall_0_9_1_1_p____a.equals(syntax))
				emit_Store___CommaKeyword_0_9_0___ALIGNMENTParserRuleCall_0_9_1_0_or_MetadataValueParserRuleCall_0_9_1_1_p____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_POINTERTerminalRuleCall_4_q.equals(syntax))
				emit_Structure_POINTERTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1.equals(syntax))
				emit_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0___RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0____.equals(syntax))
				emit_TypeList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0___RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_q.equals(syntax))
				emit_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3_q.equals(syntax))
				emit_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0.equals(syntax))
				emit_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeUse_ORESTTerminalRuleCall_1_q.equals(syntax))
				emit_TypeUse_ORESTTerminalRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_2_q.equals(syntax))
				emit_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_4_2_q.equals(syntax))
				emit_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Value_InitializersParserRuleCall_0_1_2_or_Primitive_TypeParserRuleCall_0_1_1_or_STRINGTerminalRuleCall_0_1_0.equals(syntax))
				emit_Value_InitializersParserRuleCall_0_1_2_or_Primitive_TypeParserRuleCall_0_1_1_or_STRINGTerminalRuleCall_0_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (
	     'sub' | 
	     'fmul' | 
	     'udiv' | 
	     'fsub' | 
	     'frem' | 
	     'sdiv' | 
	     'srem' | 
	     'add' | 
	     'fadd' | 
	     'mul' | 
	     'fdiv' | 
	     'urem'
	 )
	 */
	protected void emit_ARITHMETIC_OP_AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (('nsw' | 'nuw') ('nuw' | 'nsw')?)?
	 */
	protected void emit_ARITHMETIC_OP_____NswKeyword_1_0_0_or_NuwKeyword_1_0_1_____NswKeyword_1_1_1_or_NuwKeyword_1_1_0__q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
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
	protected void emit_AliasDefinition_ALIAS_LINKAGEParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VISIBILITY?
	 */
	protected void emit_AliasDefinition_VISIBILITYParserRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' ALIGNMENT)?
	 */
	protected void emit_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('[' ']') | '[]'
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
	 *     'volatile'?
	 */
	protected void emit_AtomicRMW_VolatileKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CallingConv?
	 */
	protected void emit_Call_CallingConvParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Call_RETURN_ATTRIBUTESParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'sideeffect'?
	 */
	protected void emit_Call_SideeffectKeyword_5_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'tail'?
	 */
	protected void emit_Call_TailKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' '!srcloc' '!' INT)*
	 */
	protected void emit_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_INTTerminalRuleCall_8_3__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_CmpXchg_SinglethreadKeyword_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_CmpXchg_VolatileKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ALIGNMENT?
	 */
	protected void emit_FunctionDefinition_ALIGNMENTParserRuleCall_0_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ALIGNMENT?
	 */
	protected void emit_FunctionDefinition_ALIGNMENTParserRuleCall_1_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     LINKAGE?
	 */
	protected void emit_FunctionDefinition_LINKAGEParserRuleCall_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LINKAGE?
	 */
	protected void emit_FunctionDefinition_LINKAGEParserRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_0_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_FunctionDefinition_RETURN_ATTRIBUTESParserRuleCall_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_FunctionDefinition_VISIBILITYParserRuleCall_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VISIBILITY?
	 */
	protected void emit_FunctionDefinition_VISIBILITYParserRuleCall_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'inbounds'?
	 */
	protected void emit_GetElementPtr1_InboundsKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inbounds'?
	 */
	protected void emit_GetElementPtr2_InboundsKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' ALIGNMENT)?
	 */
	protected void emit_GlobalDefinition___CommaKeyword_5_0_ALIGNMENTParserRuleCall_5_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('constant' | 'global' | LINKAGE | 'unnamed_addr')*
	 */
	protected void emit_GlobalDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Instruction_VolatileKeyword_0_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Instruction_VolatileKeyword_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     'shl' | 
	     'or' | 
	     'and' | 
	     'lshr' | 
	     'xor' | 
	     'ashr'
	 )
	 */
	protected void emit_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'volatile'?
	 */
	protected void emit_Load_VolatileKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Load_VolatileKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' (ALIGNMENT | MetadataValue+))*
	 */
	protected void emit_Load___CommaKeyword_0_5_0___ALIGNMENTParserRuleCall_0_5_1_0_or_MetadataValueParserRuleCall_0_5_1_1_p____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     RETURN_ATTRIBUTES*
	 */
	protected void emit_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES*
	 */
	protected void emit_ParameterList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_4_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' '!dbg' '!' INT)?
	 */
	protected void emit_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' '!dbg' '!' INT)?
	 */
	protected void emit_Return___CommaKeyword_1_3_0_DbgKeyword_1_3_1_ExclamationMarkKeyword_1_3_2_INTTerminalRuleCall_1_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Store_SinglethreadKeyword_1_10_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Store_VolatileKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'volatile'?
	 */
	protected void emit_Store_VolatileKeyword_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' (ALIGNMENT | MetadataValue+))*
	 */
	protected void emit_Store___CommaKeyword_0_9_0___ALIGNMENTParserRuleCall_0_9_1_0_or_MetadataValueParserRuleCall_0_9_1_1_p____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	
	/**
	 * Syntax:
	 *     (
	     (
	         '(' 
	         (
	             ')' | 
	             ')****' | 
	             ')***' | 
	             ')*' | 
	             ')*****' | 
	             ')**'
	         )
	     ) | 
	     '()'
	 )
	 */
	protected void emit_TypeList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0___RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     ')' | 
	     ')****' | 
	     ')***' | 
	     ')*' | 
	     ')*****' | 
	     ')**'
	 )
	 */
	protected void emit_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     OREST?
	 */
	protected void emit_TypeUse_ORESTTerminalRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()*'?
	 */
	protected void emit_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()*'?
	 */
	protected void emit_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Initializers | Primitive_Type | STRING
	 */
	protected void emit_Value_InitializersParserRuleCall_0_1_2_or_Primitive_TypeParserRuleCall_0_1_1_or_STRINGTerminalRuleCall_0_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
