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
	protected AbstractElementAlias match_ARRAY_F_POINTTerminalRuleCall_4_3_or_INTEGERTerminalRuleCall_4_0_or_VAR_TYPETerminalRuleCall_4_1;
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q;
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_Alias_ALIAS_LINKAGEParserRuleCall_1_q;
	protected AbstractElementAlias match_Alias_VISIBILITYParserRuleCall_2_q;
	protected AbstractElementAlias match_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q;
	protected AbstractElementAlias match_AtomicRMW_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRMW_VolatileKeyword_1_q;
	protected AbstractElementAlias match_Call_CallingConvParserRuleCall_2_q;
	protected AbstractElementAlias match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a;
	protected AbstractElementAlias match_Call_RETURN_ATTRIBUTESParserRuleCall_3_q;
	protected AbstractElementAlias match_Call_TailKeyword_0_q;
	protected AbstractElementAlias match_CastStructure_ARRAYLTerminalRuleCall_0_1_or_LeftCurlyBracketKeyword_0_0;
	protected AbstractElementAlias match_CastStructure_ARRAYRTerminalRuleCall_2_1_or_RightCurlyBracketKeyword_2_0;
	protected AbstractElementAlias match_CastStructure_INTEGERTerminalRuleCall_1_1_3_or_INTTerminalRuleCall_1_1_2_or_PrimitiveParserRuleCall_1_1_1;
	protected AbstractElementAlias match_CastStructure_INTEGERTerminalRuleCall_1_2_1_2_2_or_INTTerminalRuleCall_1_2_1_2_1_or_PrimitiveParserRuleCall_1_2_1_2_0;
	protected AbstractElementAlias match_CastStructure_INTEGERTerminalRuleCall_1_3_3_1_2_2_or_INTTerminalRuleCall_1_3_3_1_2_1_or_PrimitiveParserRuleCall_1_3_3_1_2_0;
	protected AbstractElementAlias match_CastStructure_RightParenthesisKeyword_1_2_0_a;
	protected AbstractElementAlias match_CastStructure_RightParenthesisKeyword_1_2_0_p;
	protected AbstractElementAlias match_CastStructure_RightParenthesisKeyword_1_3_3_0_a;
	protected AbstractElementAlias match_CastStructure_RightParenthesisKeyword_1_3_3_0_p;
	protected AbstractElementAlias match_Cast_LeftParenthesisKeyword_1_q;
	protected AbstractElementAlias match_Cast_LeftParenthesisKeyword_3_a;
	protected AbstractElementAlias match_Cast_LeftParenthesisRightParenthesisAsteriskKeyword_2_0_1_q;
	protected AbstractElementAlias match_Cast_RightParenthesisKeyword_6_a;
	protected AbstractElementAlias match_CmpXchg_SinglethreadKeyword_10_q;
	protected AbstractElementAlias match_CmpXchg_VolatileKeyword_1_q;
	protected AbstractElementAlias match_Fence_SinglethreadKeyword_1_q;
	protected AbstractElementAlias match_FunctionHeader_ALIGNMENTParserRuleCall_0_11_q;
	protected AbstractElementAlias match_FunctionHeader_ALIGNMENTParserRuleCall_1_11_q;
	protected AbstractElementAlias match_FunctionHeader_CallingConvParserRuleCall_0_3_q;
	protected AbstractElementAlias match_FunctionHeader_CallingConvParserRuleCall_1_3_q;
	protected AbstractElementAlias match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a;
	protected AbstractElementAlias match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a;
	protected AbstractElementAlias match_FunctionHeader_LINKAGEParserRuleCall_0_1_q;
	protected AbstractElementAlias match_FunctionHeader_LINKAGEParserRuleCall_1_1_q;
	protected AbstractElementAlias match_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_0_4_q;
	protected AbstractElementAlias match_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_1_4_q;
	protected AbstractElementAlias match_FunctionHeader_Unnamed_addrKeyword_0_8_q;
	protected AbstractElementAlias match_FunctionHeader_Unnamed_addrKeyword_1_8_q;
	protected AbstractElementAlias match_FunctionHeader_VISIBILITYParserRuleCall_0_2_q;
	protected AbstractElementAlias match_FunctionHeader_VISIBILITYParserRuleCall_1_2_q;
	protected AbstractElementAlias match_FunctionHeader___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q;
	protected AbstractElementAlias match_FunctionHeader___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q;
	protected AbstractElementAlias match_GetElementPtr_InboundsKeyword_1_q;
	protected AbstractElementAlias match_GetElementPtr_LeftParenthesisKeyword_2_q;
	protected AbstractElementAlias match_Instruction_VolatileKeyword_0_0_q;
	protected AbstractElementAlias match_Instruction_VolatileKeyword_1_0_q;
	protected AbstractElementAlias match_Invoke_CallingConvParserRuleCall_1_q;
	protected AbstractElementAlias match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a;
	protected AbstractElementAlias match_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q;
	protected AbstractElementAlias match_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5;
	protected AbstractElementAlias match_Load_SinglethreadKeyword_1_5_q;
	protected AbstractElementAlias match_Load_VolatileKeyword_0_1_q;
	protected AbstractElementAlias match_Load_VolatileKeyword_1_2_q;
	protected AbstractElementAlias match_Load___CommaKeyword_0_4_0___ALIGNMENTParserRuleCall_0_4_1_0_or_MetadataValueParserRuleCall_0_4_1_1_p____a;
	protected AbstractElementAlias match_NamedType_INTTerminalRuleCall_3_5_1_q;
	protected AbstractElementAlias match_NamedType___CSTRINGTerminalRuleCall_3_2_1_1_0___NullKeyword_3_2_1_1_1_1_or_ZeroinitializerKeyword_3_2_1_1_1_0__a___CommaKeyword_3_2_1_1_2_0_ALIGNMENTParserRuleCall_3_2_1_1_2_1__q__q;
	protected AbstractElementAlias match_NamedType___CommaKeyword_3_5_3_0_ALIGNMENTParserRuleCall_3_5_3_1__q;
	protected AbstractElementAlias match_NamedType___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a;
	protected AbstractElementAlias match_NamedType___NullKeyword_3_5_2_1_or_ZeroinitializerKeyword_3_5_2_0__a;
	protected AbstractElementAlias match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q;
	protected AbstractElementAlias match_Return___CommaKeyword_1_3_0_DbgKeyword_1_3_1_ExclamationMarkKeyword_1_3_2_INTTerminalRuleCall_1_3_3__q;
	protected AbstractElementAlias match_Store_SinglethreadKeyword_1_8_q;
	protected AbstractElementAlias match_Store_VolatileKeyword_0_1_q;
	protected AbstractElementAlias match_Store_VolatileKeyword_1_2_q;
	protected AbstractElementAlias match_Store___CommaKeyword_0_7_0___ALIGNMENTParserRuleCall_0_7_1_0_or_MetadataValueParserRuleCall_0_7_1_1_p____a;
	protected AbstractElementAlias match_Structure_AsteriskKeyword_0_4_a;
	protected AbstractElementAlias match_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_0_0_1_q;
	protected AbstractElementAlias match_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_3_1_0_1_q;
	protected AbstractElementAlias match_Structure_ORESTTerminalRuleCall_0_2_1_q;
	protected AbstractElementAlias match_Structure_ORESTTerminalRuleCall_0_2_3_2_q;
	protected AbstractElementAlias match_Structure_ORESTTerminalRuleCall_1_3_1_q;
	protected AbstractElementAlias match_Structure_ORESTTerminalRuleCall_1_3_3_2_q;
	protected AbstractElementAlias match_Structure___LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3_AsteriskKeyword_0_4_a___or___LessThanSignKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4_GreaterThanSignKeyword_1_5__;
	protected AbstractElementAlias match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1;
	protected AbstractElementAlias match_TypeList_RightParenthesisAsteriskKeyword_3_1_or___RightParenthesisKeyword_3_0_0_AsteriskKeyword_3_0_1_q__;
	protected AbstractElementAlias match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_2_q;
	protected AbstractElementAlias match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_4_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LLVMGrammarAccess) access;
		match_ARITHMETIC_OP_AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getAddKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFaddKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFdivKeyword_0_8()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFmulKeyword_0_5()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFremKeyword_0_11()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFsubKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getMulKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSdivKeyword_0_7()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSremKeyword_0_10()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSubKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getUdivKeyword_0_6()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getUremKeyword_0_9()));
		match_ARRAY_F_POINTTerminalRuleCall_4_3_or_INTEGERTerminalRuleCall_4_0_or_VAR_TYPETerminalRuleCall_4_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getARRAYAccess().getF_POINTTerminalRuleCall_4_3()), new TokenAlias(false, false, grammarAccess.getARRAYAccess().getINTEGERTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getARRAYAccess().getVAR_TYPETerminalRuleCall_4_1()));
		match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1());
		match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1());
		match_Alias_ALIAS_LINKAGEParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getAliasAccess().getALIAS_LINKAGEParserRuleCall_1());
		match_Alias_VISIBILITYParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getAliasAccess().getVISIBILITYParserRuleCall_2());
		match_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAllocAccess().getCommaKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAllocAccess().getALIGNMENTParserRuleCall_3_1()));
		match_AtomicRMW_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_8());
		match_AtomicRMW_VolatileKeyword_1_q = new TokenAlias(false, true, grammarAccess.getAtomicRMWAccess().getVolatileKeyword_1());
		match_Call_CallingConvParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getCallingConvParserRuleCall_2());
		match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a = new TokenAlias(true, true, grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_7());
		match_Call_RETURN_ATTRIBUTESParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getRETURN_ATTRIBUTESParserRuleCall_3());
		match_Call_TailKeyword_0_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getTailKeyword_0());
		match_CastStructure_ARRAYLTerminalRuleCall_0_1_or_LeftCurlyBracketKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getARRAYLTerminalRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getLeftCurlyBracketKeyword_0_0()));
		match_CastStructure_ARRAYRTerminalRuleCall_2_1_or_RightCurlyBracketKeyword_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getARRAYRTerminalRuleCall_2_1()), new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getRightCurlyBracketKeyword_2_0()));
		match_CastStructure_INTEGERTerminalRuleCall_1_1_3_or_INTTerminalRuleCall_1_1_2_or_PrimitiveParserRuleCall_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getINTEGERTerminalRuleCall_1_1_3()), new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getINTTerminalRuleCall_1_1_2()), new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getPrimitiveParserRuleCall_1_1_1()));
		match_CastStructure_INTEGERTerminalRuleCall_1_2_1_2_2_or_INTTerminalRuleCall_1_2_1_2_1_or_PrimitiveParserRuleCall_1_2_1_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getINTEGERTerminalRuleCall_1_2_1_2_2()), new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getINTTerminalRuleCall_1_2_1_2_1()), new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getPrimitiveParserRuleCall_1_2_1_2_0()));
		match_CastStructure_INTEGERTerminalRuleCall_1_3_3_1_2_2_or_INTTerminalRuleCall_1_3_3_1_2_1_or_PrimitiveParserRuleCall_1_3_3_1_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getINTEGERTerminalRuleCall_1_3_3_1_2_2()), new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getINTTerminalRuleCall_1_3_3_1_2_1()), new TokenAlias(false, false, grammarAccess.getCastStructureAccess().getPrimitiveParserRuleCall_1_3_3_1_2_0()));
		match_CastStructure_RightParenthesisKeyword_1_2_0_a = new TokenAlias(true, true, grammarAccess.getCastStructureAccess().getRightParenthesisKeyword_1_2_0());
		match_CastStructure_RightParenthesisKeyword_1_2_0_p = new TokenAlias(true, false, grammarAccess.getCastStructureAccess().getRightParenthesisKeyword_1_2_0());
		match_CastStructure_RightParenthesisKeyword_1_3_3_0_a = new TokenAlias(true, true, grammarAccess.getCastStructureAccess().getRightParenthesisKeyword_1_3_3_0());
		match_CastStructure_RightParenthesisKeyword_1_3_3_0_p = new TokenAlias(true, false, grammarAccess.getCastStructureAccess().getRightParenthesisKeyword_1_3_3_0());
		match_Cast_LeftParenthesisKeyword_1_q = new TokenAlias(false, true, grammarAccess.getCastAccess().getLeftParenthesisKeyword_1());
		match_Cast_LeftParenthesisKeyword_3_a = new TokenAlias(true, true, grammarAccess.getCastAccess().getLeftParenthesisKeyword_3());
		match_Cast_LeftParenthesisRightParenthesisAsteriskKeyword_2_0_1_q = new TokenAlias(false, true, grammarAccess.getCastAccess().getLeftParenthesisRightParenthesisAsteriskKeyword_2_0_1());
		match_Cast_RightParenthesisKeyword_6_a = new TokenAlias(true, true, grammarAccess.getCastAccess().getRightParenthesisKeyword_6());
		match_CmpXchg_SinglethreadKeyword_10_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_10());
		match_CmpXchg_VolatileKeyword_1_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getVolatileKeyword_1());
		match_Fence_SinglethreadKeyword_1_q = new TokenAlias(false, true, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
		match_FunctionHeader_ALIGNMENTParserRuleCall_0_11_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getALIGNMENTParserRuleCall_0_11());
		match_FunctionHeader_ALIGNMENTParserRuleCall_1_11_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getALIGNMENTParserRuleCall_1_11());
		match_FunctionHeader_CallingConvParserRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_0_3());
		match_FunctionHeader_CallingConvParserRuleCall_1_3_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_1_3());
		match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a = new TokenAlias(true, true, grammarAccess.getFunctionHeaderAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9());
		match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a = new TokenAlias(true, true, grammarAccess.getFunctionHeaderAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9());
		match_FunctionHeader_LINKAGEParserRuleCall_0_1_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getLINKAGEParserRuleCall_0_1());
		match_FunctionHeader_LINKAGEParserRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getLINKAGEParserRuleCall_1_1());
		match_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_0_4_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getRETURN_ATTRIBUTESParserRuleCall_0_4());
		match_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_1_4_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getRETURN_ATTRIBUTESParserRuleCall_1_4());
		match_FunctionHeader_Unnamed_addrKeyword_0_8_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getUnnamed_addrKeyword_0_8());
		match_FunctionHeader_Unnamed_addrKeyword_1_8_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getUnnamed_addrKeyword_1_8());
		match_FunctionHeader_VISIBILITYParserRuleCall_0_2_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getVISIBILITYParserRuleCall_0_2());
		match_FunctionHeader_VISIBILITYParserRuleCall_1_2_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getVISIBILITYParserRuleCall_1_2());
		match_FunctionHeader___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getSectionKeyword_0_10_0()), new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getSTRINGTerminalRuleCall_0_10_1()));
		match_FunctionHeader___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getSectionKeyword_1_10_0()), new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getSTRINGTerminalRuleCall_1_10_1()));
		match_GetElementPtr_InboundsKeyword_1_q = new TokenAlias(false, true, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_1());
		match_GetElementPtr_LeftParenthesisKeyword_2_q = new TokenAlias(false, true, grammarAccess.getGetElementPtrAccess().getLeftParenthesisKeyword_2());
		match_Instruction_VolatileKeyword_0_0_q = new TokenAlias(false, true, grammarAccess.getInstructionAccess().getVolatileKeyword_0_0());
		match_Instruction_VolatileKeyword_1_0_q = new TokenAlias(false, true, grammarAccess.getInstructionAccess().getVolatileKeyword_1_0());
		match_Invoke_CallingConvParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1());
		match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6());
		match_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getRETURN_ATTRIBUTESParserRuleCall_2());
		match_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getAndKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getAshrKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getLshrKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getOrKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getShlKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getXorKeyword_0_5()));
		match_Load_SinglethreadKeyword_1_5_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_5());
		match_Load_VolatileKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getVolatileKeyword_0_1());
		match_Load_VolatileKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getVolatileKeyword_1_2());
		match_Load___CommaKeyword_0_4_0___ALIGNMENTParserRuleCall_0_4_1_0_or_MetadataValueParserRuleCall_0_4_1_1_p____a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getLoadAccess().getCommaKeyword_0_4_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLoadAccess().getALIGNMENTParserRuleCall_0_4_1_0()), new TokenAlias(true, false, grammarAccess.getLoadAccess().getMetadataValueParserRuleCall_0_4_1_1())));
		match_NamedType_INTTerminalRuleCall_3_5_1_q = new TokenAlias(false, true, grammarAccess.getNamedTypeAccess().getINTTerminalRuleCall_3_5_1());
		match_NamedType___CSTRINGTerminalRuleCall_3_2_1_1_0___NullKeyword_3_2_1_1_1_1_or_ZeroinitializerKeyword_3_2_1_1_1_0__a___CommaKeyword_3_2_1_1_2_0_ALIGNMENTParserRuleCall_3_2_1_1_2_1__q__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getCSTRINGTerminalRuleCall_3_2_1_1_0()), new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getNullKeyword_3_2_1_1_1_1()), new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getZeroinitializerKeyword_3_2_1_1_1_0())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getCommaKeyword_3_2_1_1_2_0()), new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getALIGNMENTParserRuleCall_3_2_1_1_2_1())));
		match_NamedType___CommaKeyword_3_5_3_0_ALIGNMENTParserRuleCall_3_5_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getCommaKeyword_3_5_3_0()), new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getALIGNMENTParserRuleCall_3_5_3_1()));
		match_NamedType___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getConstantKeyword_2_3()), new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getGlobalKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getLINKAGEParserRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getUnnamed_addrKeyword_2_2()));
		match_NamedType___NullKeyword_3_5_2_1_or_ZeroinitializerKeyword_3_5_2_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getNullKeyword_3_5_2_1()), new TokenAlias(false, false, grammarAccess.getNamedTypeAccess().getZeroinitializerKeyword_3_5_2_0()));
		match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_0_3_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_0_3_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_3_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_3_3()));
		match_Return___CommaKeyword_1_3_0_DbgKeyword_1_3_1_ExclamationMarkKeyword_1_3_2_INTTerminalRuleCall_1_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_1_3_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_1_3_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_3_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_1_3_3()));
		match_Store_SinglethreadKeyword_1_8_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_8());
		match_Store_VolatileKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getVolatileKeyword_0_1());
		match_Store_VolatileKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getVolatileKeyword_1_2());
		match_Store___CommaKeyword_0_7_0___ALIGNMENTParserRuleCall_0_7_1_0_or_MetadataValueParserRuleCall_0_7_1_1_p____a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStoreAccess().getCommaKeyword_0_7_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getStoreAccess().getALIGNMENTParserRuleCall_0_7_1_0()), new TokenAlias(true, false, grammarAccess.getStoreAccess().getMetadataValueParserRuleCall_0_7_1_1())));
		match_Structure_AsteriskKeyword_0_4_a = new TokenAlias(true, true, grammarAccess.getStructureAccess().getAsteriskKeyword_0_4());
		match_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_0_0_1_q = new TokenAlias(false, true, grammarAccess.getStructureAccess().getLeftParenthesisRightParenthesisAsteriskKeyword_0_2_0_0_1());
		match_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_3_1_0_1_q = new TokenAlias(false, true, grammarAccess.getStructureAccess().getLeftParenthesisRightParenthesisAsteriskKeyword_0_2_3_1_0_1());
		match_Structure_ORESTTerminalRuleCall_0_2_1_q = new TokenAlias(false, true, grammarAccess.getStructureAccess().getORESTTerminalRuleCall_0_2_1());
		match_Structure_ORESTTerminalRuleCall_0_2_3_2_q = new TokenAlias(false, true, grammarAccess.getStructureAccess().getORESTTerminalRuleCall_0_2_3_2());
		match_Structure_ORESTTerminalRuleCall_1_3_1_q = new TokenAlias(false, true, grammarAccess.getStructureAccess().getORESTTerminalRuleCall_1_3_1());
		match_Structure_ORESTTerminalRuleCall_1_3_3_2_q = new TokenAlias(false, true, grammarAccess.getStructureAccess().getORESTTerminalRuleCall_1_3_3_2());
		match_Structure___LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3_AsteriskKeyword_0_4_a___or___LessThanSignKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4_GreaterThanSignKeyword_1_5__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_0_3()), new TokenAlias(true, true, grammarAccess.getStructureAccess().getAsteriskKeyword_0_4())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStructureAccess().getLessThanSignKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getStructureAccess().getGreaterThanSignKeyword_1_5())));
		match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1()));
		match_TypeList_RightParenthesisAsteriskKeyword_3_1_or___RightParenthesisKeyword_3_0_0_AsteriskKeyword_3_0_1_q__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisKeyword_3_0_0()), new TokenAlias(false, true, grammarAccess.getTypeListAccess().getAsteriskKeyword_3_0_1())), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskKeyword_3_1()));
		match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_2_q = new TokenAlias(false, true, grammarAccess.getValueStructAccess().getLeftParenthesisRightParenthesisAsteriskKeyword_2());
		match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_4_2_q = new TokenAlias(false, true, grammarAccess.getValueStructAccess().getLeftParenthesisRightParenthesisAsteriskKeyword_4_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getALIAS_LINKAGERule())
			return getALIAS_LINKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getALIGNMENTRule())
			return getALIGNMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getARRAYLRule())
			return getARRAYLToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getARRAYRRule())
			return getARRAYRToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBIN_OPRule())
			return getBIN_OPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCAST_TYPERule())
			return getCAST_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCSTRINGRule())
			return getCSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCallingConvRule())
			return getCallingConvToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFUNCTION_ATTRIBUTESRule())
			return getFUNCTION_ATTRIBUTESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getF_POINTRule())
			return getF_POINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getF_PREDICATESRule())
			return getF_PREDICATESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTEGERRule())
			return getINTEGERToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getI_PREDICATESRule())
			return getI_PREDICATESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLINKAGERule())
			return getLINKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getMetadataValueRule())
			return getMetadataValueToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getORESTRule())
			return getORESTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpaqueRule())
			return getOpaqueToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPrimitiveRule())
			return getPrimitiveToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getRETURN_ATTRIBUTESRule())
			return getRETURN_ATTRIBUTESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTypeRule())
			return getTypeToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVAR_TYPERule())
			return getVAR_TYPEToken(semanticObject, ruleCall, node);
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
	 * terminal ARRAYL:
	 * 	'[';
	 */
	protected String getARRAYLToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * terminal ARRAYR:
	 * 	']' '*'*;
	 */
	protected String getARRAYRToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * BIN_OP:
	 * 	'xchg' | 'add' | 'sub' | 'and' | 'nand' | 'or' | 'xor' | 'max' | 'min' | 'umax' | 'umin';
	 */
	protected String getBIN_OPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "xchg";
	}
	
	/**
	 * CAST_TYPE:
	 * 	'trunc' | 'zext' | 'sext' | 'fptrunc' | 'fpext' | 'fptoui' | 'fptosi' | 'uitofp' | 'sitofp' | 'ptrtoint' | 'inttoptr'
	 * 	| 'bitcast';
	 */
	protected String getCAST_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "trunc";
	}
	
	/**
	 * terminal CSTRING:
	 * 	'c' STRING;
	 */
	protected String getCSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "c\"\"";
	}
	
	/**
	 * CallingConv:
	 * 	'ccc' | 'fastcc' | 'coldcc' | 'x86_stdcallcc' | 'x86_fastcallcc' | 'x86_thiscallcc' | 'arm_apcscc' |
	 * 	'arm_aapcscc' | 'arm_aapcs_vfpcc' | 'msp430_intrcc' | 'ptx_kernel' | 'ptx_device' | 'spir_func' | 'spir_kernel' |
	 * 	'cc' '<' INT '>' INT;
	 */
	protected String getCallingConvToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ccc";
	}
	
	/**
	 * FUNCTION_ATTRIBUTES:
	 * 	'address_safety' | 'alignstack' '(' '<' INT '>' ')' | 'alwaysinline' | 'nonlazybind' | 'inlinehint' | 'naked' |
	 * 	'noimplicitfloat' |
	 * 	'noinline' |
	 * 	'noredzone' | 'noreturn' | 'nounwind' | 'optsize' | 'readnone' | 'readonly' | 'returns_twice' | 'ssp' | 'sspreq' |
	 * 	'uwtable';
	 */
	protected String getFUNCTION_ATTRIBUTESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "address_safety";
	}
	
	/**
	 * terminal F_POINT:
	 * 	'half' | 'float' | 'double' | 'x86_fp80' | 'fp128' | 'ppc_fp128';
	 */
	protected String getF_POINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "half";
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
	 * terminal INTEGER:
	 * 	'i' ('0'..'9')+ '*'*;
	 */
	protected String getINTEGERToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
	 * LINKAGE:
	 * 	'private' | 'linker_private' | 'linker_private_weak' | 'available_externally' | 'linkonce' | 'common' |
	 * 	'appending' | 'extern_weak' | 'linkonce_odr' | 'linkonce_odr_auto_hide' | 'dllimport' | 'dllexport' | ALIAS_LINKAGE;
	 */
	protected String getLINKAGEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "private";
	}
	
	/**
	 * MetadataValue:
	 * 	(('!' INT) | ('!{' NOBRACKET '}') | ("!" NOBRACKET))
	 * 	('='
	 * 	(('!' INT) |
	 * 	('!{' NOBRACKET '}') |
	 * 	("!" NOBRACKET) |
	 * 	'metadata' (('!' '{' | '!{') 'metadata' '!' STRING ',' ('metadata' '!' INT) '}')?))?;
	 */
	protected String getMetadataValueToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!";
	}
	
	/**
	 * terminal OREST:
	 * 	'(...)' '*'*;
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
	 * Primitive:
	 * 	'void' | 'null' | 'label' | 'undef' | 'true' | 'false';
	 */
	protected String getPrimitiveToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
	 * 	'"' ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '0' | '"' | "'" | '\\') | !('\\' | '"'))* '"' |
	 * 	"'" ('\\' ('b' | 't' | 'n' | 'f' | 'r' | 'u' | '0' | '"' | "'" | '\\') | !('\\' | "'"))* "'";
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * Type:
	 * 	VAR_TYPE | INT | INTEGER | Primitive;
	 */
	protected String getTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	
	/**
	 * terminal VAR_TYPE:
	 * 	(((('%' | '@') '.'*) (NOBRACKET | '(' NOBRACKET ')' | INT | STRING) '*'*) |
	 * 	'('+ (('%' | '@') '.'*) (NOBRACKET | '(' NOBRACKET ')' | INT | STRING) '*'* ')'+ '*'*);
	 */
	protected String getVAR_TYPEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
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
			else if(match_ARRAY_F_POINTTerminalRuleCall_4_3_or_INTEGERTerminalRuleCall_4_0_or_VAR_TYPETerminalRuleCall_4_1.equals(syntax))
				emit_ARRAY_F_POINTTerminalRuleCall_4_3_or_INTEGERTerminalRuleCall_4_0_or_VAR_TYPETerminalRuleCall_4_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Alias_ALIAS_LINKAGEParserRuleCall_1_q.equals(syntax))
				emit_Alias_ALIAS_LINKAGEParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Alias_VISIBILITYParserRuleCall_2_q.equals(syntax))
				emit_Alias_VISIBILITYParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q.equals(syntax))
				emit_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
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
			else if(match_Call_TailKeyword_0_q.equals(syntax))
				emit_Call_TailKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CastStructure_ARRAYLTerminalRuleCall_0_1_or_LeftCurlyBracketKeyword_0_0.equals(syntax))
				emit_CastStructure_ARRAYLTerminalRuleCall_0_1_or_LeftCurlyBracketKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CastStructure_ARRAYRTerminalRuleCall_2_1_or_RightCurlyBracketKeyword_2_0.equals(syntax))
				emit_CastStructure_ARRAYRTerminalRuleCall_2_1_or_RightCurlyBracketKeyword_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CastStructure_INTEGERTerminalRuleCall_1_1_3_or_INTTerminalRuleCall_1_1_2_or_PrimitiveParserRuleCall_1_1_1.equals(syntax))
				emit_CastStructure_INTEGERTerminalRuleCall_1_1_3_or_INTTerminalRuleCall_1_1_2_or_PrimitiveParserRuleCall_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CastStructure_INTEGERTerminalRuleCall_1_2_1_2_2_or_INTTerminalRuleCall_1_2_1_2_1_or_PrimitiveParserRuleCall_1_2_1_2_0.equals(syntax))
				emit_CastStructure_INTEGERTerminalRuleCall_1_2_1_2_2_or_INTTerminalRuleCall_1_2_1_2_1_or_PrimitiveParserRuleCall_1_2_1_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CastStructure_INTEGERTerminalRuleCall_1_3_3_1_2_2_or_INTTerminalRuleCall_1_3_3_1_2_1_or_PrimitiveParserRuleCall_1_3_3_1_2_0.equals(syntax))
				emit_CastStructure_INTEGERTerminalRuleCall_1_3_3_1_2_2_or_INTTerminalRuleCall_1_3_3_1_2_1_or_PrimitiveParserRuleCall_1_3_3_1_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CastStructure_RightParenthesisKeyword_1_2_0_a.equals(syntax))
				emit_CastStructure_RightParenthesisKeyword_1_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CastStructure_RightParenthesisKeyword_1_2_0_p.equals(syntax))
				emit_CastStructure_RightParenthesisKeyword_1_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CastStructure_RightParenthesisKeyword_1_3_3_0_a.equals(syntax))
				emit_CastStructure_RightParenthesisKeyword_1_3_3_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CastStructure_RightParenthesisKeyword_1_3_3_0_p.equals(syntax))
				emit_CastStructure_RightParenthesisKeyword_1_3_3_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Cast_LeftParenthesisKeyword_1_q.equals(syntax))
				emit_Cast_LeftParenthesisKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Cast_LeftParenthesisKeyword_3_a.equals(syntax))
				emit_Cast_LeftParenthesisKeyword_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Cast_LeftParenthesisRightParenthesisAsteriskKeyword_2_0_1_q.equals(syntax))
				emit_Cast_LeftParenthesisRightParenthesisAsteriskKeyword_2_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Cast_RightParenthesisKeyword_6_a.equals(syntax))
				emit_Cast_RightParenthesisKeyword_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_SinglethreadKeyword_10_q.equals(syntax))
				emit_CmpXchg_SinglethreadKeyword_10_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_VolatileKeyword_1_q.equals(syntax))
				emit_CmpXchg_VolatileKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Fence_SinglethreadKeyword_1_q.equals(syntax))
				emit_Fence_SinglethreadKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_ALIGNMENTParserRuleCall_0_11_q.equals(syntax))
				emit_FunctionHeader_ALIGNMENTParserRuleCall_0_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_ALIGNMENTParserRuleCall_1_11_q.equals(syntax))
				emit_FunctionHeader_ALIGNMENTParserRuleCall_1_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_CallingConvParserRuleCall_0_3_q.equals(syntax))
				emit_FunctionHeader_CallingConvParserRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_CallingConvParserRuleCall_1_3_q.equals(syntax))
				emit_FunctionHeader_CallingConvParserRuleCall_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a.equals(syntax))
				emit_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a.equals(syntax))
				emit_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_LINKAGEParserRuleCall_0_1_q.equals(syntax))
				emit_FunctionHeader_LINKAGEParserRuleCall_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_LINKAGEParserRuleCall_1_1_q.equals(syntax))
				emit_FunctionHeader_LINKAGEParserRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_0_4_q.equals(syntax))
				emit_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_0_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_1_4_q.equals(syntax))
				emit_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_Unnamed_addrKeyword_0_8_q.equals(syntax))
				emit_FunctionHeader_Unnamed_addrKeyword_0_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_Unnamed_addrKeyword_1_8_q.equals(syntax))
				emit_FunctionHeader_Unnamed_addrKeyword_1_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_VISIBILITYParserRuleCall_0_2_q.equals(syntax))
				emit_FunctionHeader_VISIBILITYParserRuleCall_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_VISIBILITYParserRuleCall_1_2_q.equals(syntax))
				emit_FunctionHeader_VISIBILITYParserRuleCall_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q.equals(syntax))
				emit_FunctionHeader___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q.equals(syntax))
				emit_FunctionHeader___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GetElementPtr_InboundsKeyword_1_q.equals(syntax))
				emit_GetElementPtr_InboundsKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GetElementPtr_LeftParenthesisKeyword_2_q.equals(syntax))
				emit_GetElementPtr_LeftParenthesisKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
			else if(match_Load_SinglethreadKeyword_1_5_q.equals(syntax))
				emit_Load_SinglethreadKeyword_1_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_VolatileKeyword_0_1_q.equals(syntax))
				emit_Load_VolatileKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_VolatileKeyword_1_2_q.equals(syntax))
				emit_Load_VolatileKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load___CommaKeyword_0_4_0___ALIGNMENTParserRuleCall_0_4_1_0_or_MetadataValueParserRuleCall_0_4_1_1_p____a.equals(syntax))
				emit_Load___CommaKeyword_0_4_0___ALIGNMENTParserRuleCall_0_4_1_0_or_MetadataValueParserRuleCall_0_4_1_1_p____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamedType_INTTerminalRuleCall_3_5_1_q.equals(syntax))
				emit_NamedType_INTTerminalRuleCall_3_5_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamedType___CSTRINGTerminalRuleCall_3_2_1_1_0___NullKeyword_3_2_1_1_1_1_or_ZeroinitializerKeyword_3_2_1_1_1_0__a___CommaKeyword_3_2_1_1_2_0_ALIGNMENTParserRuleCall_3_2_1_1_2_1__q__q.equals(syntax))
				emit_NamedType___CSTRINGTerminalRuleCall_3_2_1_1_0___NullKeyword_3_2_1_1_1_1_or_ZeroinitializerKeyword_3_2_1_1_1_0__a___CommaKeyword_3_2_1_1_2_0_ALIGNMENTParserRuleCall_3_2_1_1_2_1__q__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamedType___CommaKeyword_3_5_3_0_ALIGNMENTParserRuleCall_3_5_3_1__q.equals(syntax))
				emit_NamedType___CommaKeyword_3_5_3_0_ALIGNMENTParserRuleCall_3_5_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamedType___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a.equals(syntax))
				emit_NamedType___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NamedType___NullKeyword_3_5_2_1_or_ZeroinitializerKeyword_3_5_2_0__a.equals(syntax))
				emit_NamedType___NullKeyword_3_5_2_1_or_ZeroinitializerKeyword_3_5_2_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q.equals(syntax))
				emit_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return___CommaKeyword_1_3_0_DbgKeyword_1_3_1_ExclamationMarkKeyword_1_3_2_INTTerminalRuleCall_1_3_3__q.equals(syntax))
				emit_Return___CommaKeyword_1_3_0_DbgKeyword_1_3_1_ExclamationMarkKeyword_1_3_2_INTTerminalRuleCall_1_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_SinglethreadKeyword_1_8_q.equals(syntax))
				emit_Store_SinglethreadKeyword_1_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_VolatileKeyword_0_1_q.equals(syntax))
				emit_Store_VolatileKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_VolatileKeyword_1_2_q.equals(syntax))
				emit_Store_VolatileKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store___CommaKeyword_0_7_0___ALIGNMENTParserRuleCall_0_7_1_0_or_MetadataValueParserRuleCall_0_7_1_1_p____a.equals(syntax))
				emit_Store___CommaKeyword_0_7_0___ALIGNMENTParserRuleCall_0_7_1_0_or_MetadataValueParserRuleCall_0_7_1_1_p____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_AsteriskKeyword_0_4_a.equals(syntax))
				emit_Structure_AsteriskKeyword_0_4_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_0_0_1_q.equals(syntax))
				emit_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_0_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_3_1_0_1_q.equals(syntax))
				emit_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_3_1_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_ORESTTerminalRuleCall_0_2_1_q.equals(syntax))
				emit_Structure_ORESTTerminalRuleCall_0_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_ORESTTerminalRuleCall_0_2_3_2_q.equals(syntax))
				emit_Structure_ORESTTerminalRuleCall_0_2_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_ORESTTerminalRuleCall_1_3_1_q.equals(syntax))
				emit_Structure_ORESTTerminalRuleCall_1_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_ORESTTerminalRuleCall_1_3_3_2_q.equals(syntax))
				emit_Structure_ORESTTerminalRuleCall_1_3_3_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure___LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3_AsteriskKeyword_0_4_a___or___LessThanSignKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4_GreaterThanSignKeyword_1_5__.equals(syntax))
				emit_Structure___LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3_AsteriskKeyword_0_4_a___or___LessThanSignKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4_GreaterThanSignKeyword_1_5__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1.equals(syntax))
				emit_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeList_RightParenthesisAsteriskKeyword_3_1_or___RightParenthesisKeyword_3_0_0_AsteriskKeyword_3_0_1_q__.equals(syntax))
				emit_TypeList_RightParenthesisAsteriskKeyword_3_1_or___RightParenthesisKeyword_3_0_0_AsteriskKeyword_3_0_1_q__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_2_q.equals(syntax))
				emit_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_4_2_q.equals(syntax))
				emit_ValueStruct_LeftParenthesisRightParenthesisAsteriskKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (
	     'frem' | 
	     'fsub' | 
	     'udiv' | 
	     'fadd' | 
	     'srem' | 
	     'fdiv' | 
	     'add' | 
	     'sub' | 
	     'sdiv' | 
	     'mul' | 
	     'urem' | 
	     'fmul'
	 )
	 */
	protected void emit_ARITHMETIC_OP_AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VAR_TYPE | INTEGER | F_POINT
	 */
	protected void emit_ARRAY_F_POINTTerminalRuleCall_4_3_or_INTEGERTerminalRuleCall_4_0_or_VAR_TYPETerminalRuleCall_4_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Alias_ALIAS_LINKAGEParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VISIBILITY?
	 */
	protected void emit_Alias_VISIBILITYParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'tail'?
	 */
	protected void emit_Call_TailKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ARRAYL | '{'
	 */
	protected void emit_CastStructure_ARRAYLTerminalRuleCall_0_1_or_LeftCurlyBracketKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ARRAYR | '}'
	 */
	protected void emit_CastStructure_ARRAYRTerminalRuleCall_2_1_or_RightCurlyBracketKeyword_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     INTEGER | INT | Primitive
	 */
	protected void emit_CastStructure_INTEGERTerminalRuleCall_1_1_3_or_INTTerminalRuleCall_1_1_2_or_PrimitiveParserRuleCall_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     INTEGER | INT | Primitive
	 */
	protected void emit_CastStructure_INTEGERTerminalRuleCall_1_2_1_2_2_or_INTTerminalRuleCall_1_2_1_2_1_or_PrimitiveParserRuleCall_1_2_1_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     INTEGER | Primitive | INT
	 */
	protected void emit_CastStructure_INTEGERTerminalRuleCall_1_3_3_1_2_2_or_INTTerminalRuleCall_1_3_3_1_2_1_or_PrimitiveParserRuleCall_1_3_3_1_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'*
	 */
	protected void emit_CastStructure_RightParenthesisKeyword_1_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'+
	 */
	protected void emit_CastStructure_RightParenthesisKeyword_1_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'*
	 */
	protected void emit_CastStructure_RightParenthesisKeyword_1_3_3_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'+
	 */
	protected void emit_CastStructure_RightParenthesisKeyword_1_3_3_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('?
	 */
	protected void emit_Cast_LeftParenthesisKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_Cast_LeftParenthesisKeyword_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()*'?
	 */
	protected void emit_Cast_LeftParenthesisRightParenthesisAsteriskKeyword_2_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ')'*
	 */
	protected void emit_Cast_RightParenthesisKeyword_6_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_FunctionHeader_ALIGNMENTParserRuleCall_0_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ALIGNMENT?
	 */
	protected void emit_FunctionHeader_ALIGNMENTParserRuleCall_1_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CallingConv?
	 */
	protected void emit_FunctionHeader_CallingConvParserRuleCall_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CallingConv?
	 */
	protected void emit_FunctionHeader_CallingConvParserRuleCall_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FUNCTION_ATTRIBUTES*
	 */
	protected void emit_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FUNCTION_ATTRIBUTES*
	 */
	protected void emit_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LINKAGE?
	 */
	protected void emit_FunctionHeader_LINKAGEParserRuleCall_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     LINKAGE?
	 */
	protected void emit_FunctionHeader_LINKAGEParserRuleCall_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_0_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES?
	 */
	protected void emit_FunctionHeader_RETURN_ATTRIBUTESParserRuleCall_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'unnamed_addr'?
	 */
	protected void emit_FunctionHeader_Unnamed_addrKeyword_0_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'unnamed_addr'?
	 */
	protected void emit_FunctionHeader_Unnamed_addrKeyword_1_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VISIBILITY?
	 */
	protected void emit_FunctionHeader_VISIBILITYParserRuleCall_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     VISIBILITY?
	 */
	protected void emit_FunctionHeader_VISIBILITYParserRuleCall_1_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('section ' STRING)?
	 */
	protected void emit_FunctionHeader___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('section ' STRING)?
	 */
	protected void emit_FunctionHeader___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'inbounds'?
	 */
	protected void emit_GetElementPtr_InboundsKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('?
	 */
	protected void emit_GetElementPtr_LeftParenthesisKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	     'lshr' | 
	     'ashr' | 
	     'shl' | 
	     'and' | 
	     'xor' | 
	     'or'
	 )
	 */
	protected void emit_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Load_SinglethreadKeyword_1_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (',' (MetadataValue+ | ALIGNMENT))*
	 */
	protected void emit_Load___CommaKeyword_0_4_0___ALIGNMENTParserRuleCall_0_4_1_0_or_MetadataValueParserRuleCall_0_4_1_1_p____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     INT?
	 */
	protected void emit_NamedType_INTTerminalRuleCall_3_5_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (CSTRING ('null' | 'zeroinitializer')* (',' ALIGNMENT)?)?
	 */
	protected void emit_NamedType___CSTRINGTerminalRuleCall_3_2_1_1_0___NullKeyword_3_2_1_1_1_1_or_ZeroinitializerKeyword_3_2_1_1_1_0__a___CommaKeyword_3_2_1_1_2_0_ALIGNMENTParserRuleCall_3_2_1_1_2_1__q__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' ALIGNMENT)?
	 */
	protected void emit_NamedType___CommaKeyword_3_5_3_0_ALIGNMENTParserRuleCall_3_5_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('constant' | 'unnamed_addr' | 'global' | LINKAGE)*
	 */
	protected void emit_NamedType___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('zeroinitializer' | 'null')*
	 */
	protected void emit_NamedType___NullKeyword_3_5_2_1_or_ZeroinitializerKeyword_3_5_2_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Store_SinglethreadKeyword_1_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_Store___CommaKeyword_0_7_0___ALIGNMENTParserRuleCall_0_7_1_0_or_MetadataValueParserRuleCall_0_7_1_1_p____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '*'*
	 */
	protected void emit_Structure_AsteriskKeyword_0_4_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()*'?
	 */
	protected void emit_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_0_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()*'?
	 */
	protected void emit_Structure_LeftParenthesisRightParenthesisAsteriskKeyword_0_2_3_1_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     OREST?
	 */
	protected void emit_Structure_ORESTTerminalRuleCall_0_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     OREST?
	 */
	protected void emit_Structure_ORESTTerminalRuleCall_0_2_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     OREST?
	 */
	protected void emit_Structure_ORESTTerminalRuleCall_1_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     OREST?
	 */
	protected void emit_Structure_ORESTTerminalRuleCall_1_3_3_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('{' '}' '*'*) | ('<' '{' '}' '>')
	 */
	protected void emit_Structure___LeftCurlyBracketKeyword_0_1_RightCurlyBracketKeyword_0_3_AsteriskKeyword_0_4_a___or___LessThanSignKeyword_1_1_LeftCurlyBracketKeyword_1_2_RightCurlyBracketKeyword_1_4_GreaterThanSignKeyword_1_5__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ')*' | (')' '*'?)
	 */
	protected void emit_TypeList_RightParenthesisAsteriskKeyword_3_1_or___RightParenthesisKeyword_3_0_0_AsteriskKeyword_3_0_1_q__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	
}
