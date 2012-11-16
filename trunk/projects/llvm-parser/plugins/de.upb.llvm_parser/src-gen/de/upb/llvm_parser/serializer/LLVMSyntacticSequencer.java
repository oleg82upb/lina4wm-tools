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
	protected AbstractElementAlias match_ARITHMETIC_OP_Compare_LOGICAL_OP___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2___or_______AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9___TypeParserRuleCall_1___or_____AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5___TypeParserRuleCall_1____;
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q;
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_Alias_ALIAS_LINKAGEParserRuleCall_1_q;
	protected AbstractElementAlias match_Alias_VISIBILITYParserRuleCall_2_q;
	protected AbstractElementAlias match_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q;
	protected AbstractElementAlias match_AtomicRMW_SinglethreadKeyword_6_q;
	protected AbstractElementAlias match_AtomicRMW_VolatileKeyword_1_q;
	protected AbstractElementAlias match_Call_CallingConvParserRuleCall_2_q;
	protected AbstractElementAlias match_Call_FUNCTION_ATTRIBUTESParserRuleCall_6_q;
	protected AbstractElementAlias match_Call_RETURN_ATTRIBUTESParserRuleCall_3_q;
	protected AbstractElementAlias match_Call_TailKeyword_0_q;
	protected AbstractElementAlias match_CmpXchg_SinglethreadKeyword_7_q;
	protected AbstractElementAlias match_CmpXchg_VolatileKeyword_1_q;
	protected AbstractElementAlias match_Compare___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2__;
	protected AbstractElementAlias match_Fence_SinglethreadKeyword_1_q;
	protected AbstractElementAlias match_FunctionHeader_ALIGNMENTParserRuleCall_0_11_q;
	protected AbstractElementAlias match_FunctionHeader_ALIGNMENTParserRuleCall_1_11_q;
	protected AbstractElementAlias match_FunctionHeader_CallingConvParserRuleCall_0_3_q;
	protected AbstractElementAlias match_FunctionHeader_CallingConvParserRuleCall_1_3_q;
	protected AbstractElementAlias match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_q;
	protected AbstractElementAlias match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_q;
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
	protected AbstractElementAlias match_Invoke_CallingConvParserRuleCall_1_q;
	protected AbstractElementAlias match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_5_q;
	protected AbstractElementAlias match_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q;
	protected AbstractElementAlias match_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5;
	protected AbstractElementAlias match_Load_SinglethreadKeyword_1_4_q;
	protected AbstractElementAlias match_Load_VolatileKeyword_0_1_q;
	protected AbstractElementAlias match_Load_VolatileKeyword_1_2_q;
	protected AbstractElementAlias match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q;
	protected AbstractElementAlias match_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q;
	protected AbstractElementAlias match_Store_SinglethreadKeyword_1_6_q;
	protected AbstractElementAlias match_Store_VolatileKeyword_0_1_q;
	protected AbstractElementAlias match_Store_VolatileKeyword_1_2_q;
	protected AbstractElementAlias match_Store___CommaKeyword_0_5_0_AlignKeyword_0_5_1_INTTerminalRuleCall_0_5_2__q;
	protected AbstractElementAlias match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LLVMGrammarAccess) access;
		match_ARITHMETIC_OP_AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getAddKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFaddKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFdivKeyword_0_8()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFmulKeyword_0_5()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFremKeyword_0_11()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFsubKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getMulKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSdivKeyword_0_7()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSremKeyword_0_10()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSubKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getUdivKeyword_0_6()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getUremKeyword_0_9()));
		match_ARITHMETIC_OP_Compare_LOGICAL_OP___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2___or_______AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9___TypeParserRuleCall_1___or_____AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5___TypeParserRuleCall_1____ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getAddKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFaddKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFdivKeyword_0_8()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFmulKeyword_0_5()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFremKeyword_0_11()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getFsubKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getMulKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSdivKeyword_0_7()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSremKeyword_0_10()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getSubKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getUdivKeyword_0_6()), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getUremKeyword_0_9())), new TokenAlias(false, false, grammarAccess.getARITHMETIC_OPAccess().getTypeParserRuleCall_1())), new GroupAlias(false, false, new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getAndKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getAshrKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getLshrKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getOrKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getShlKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getXorKeyword_0_5())), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getTypeParserRuleCall_1()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompareAccess().getFcmpKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getF_PREDICATESParserRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getTypeParserRuleCall_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompareAccess().getIcmpKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getI_PREDICATESParserRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getTypeParserRuleCall_0_2())));
		match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1());
		match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1());
		match_Alias_ALIAS_LINKAGEParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getAliasAccess().getALIAS_LINKAGEParserRuleCall_1());
		match_Alias_VISIBILITYParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getAliasAccess().getVISIBILITYParserRuleCall_2());
		match_Alloc___CommaKeyword_3_0_ALIGNMENTParserRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAllocAccess().getCommaKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAllocAccess().getALIGNMENTParserRuleCall_3_1()));
		match_AtomicRMW_SinglethreadKeyword_6_q = new TokenAlias(false, true, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_6());
		match_AtomicRMW_VolatileKeyword_1_q = new TokenAlias(false, true, grammarAccess.getAtomicRMWAccess().getVolatileKeyword_1());
		match_Call_CallingConvParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getCallingConvParserRuleCall_2());
		match_Call_FUNCTION_ATTRIBUTESParserRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6());
		match_Call_RETURN_ATTRIBUTESParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getRETURN_ATTRIBUTESParserRuleCall_3());
		match_Call_TailKeyword_0_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getTailKeyword_0());
		match_CmpXchg_SinglethreadKeyword_7_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_7());
		match_CmpXchg_VolatileKeyword_1_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getVolatileKeyword_1());
		match_Compare___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompareAccess().getFcmpKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getF_PREDICATESParserRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getTypeParserRuleCall_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompareAccess().getIcmpKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getI_PREDICATESParserRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getTypeParserRuleCall_0_2())));
		match_Fence_SinglethreadKeyword_1_q = new TokenAlias(false, true, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
		match_FunctionHeader_ALIGNMENTParserRuleCall_0_11_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getALIGNMENTParserRuleCall_0_11());
		match_FunctionHeader_ALIGNMENTParserRuleCall_1_11_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getALIGNMENTParserRuleCall_1_11());
		match_FunctionHeader_CallingConvParserRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_0_3());
		match_FunctionHeader_CallingConvParserRuleCall_1_3_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_1_3());
		match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9());
		match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9());
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
		match_Invoke_CallingConvParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1());
		match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_5());
		match_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getRETURN_ATTRIBUTESParserRuleCall_2());
		match_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getAndKeyword_0_3()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getAshrKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getLshrKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getOrKeyword_0_4()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getShlKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getLOGICAL_OPAccess().getXorKeyword_0_5()));
		match_Load_SinglethreadKeyword_1_4_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_4());
		match_Load_VolatileKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getVolatileKeyword_0_1());
		match_Load_VolatileKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getVolatileKeyword_1_2());
		match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_0_3_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_0_3_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_3_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_3_3()));
		match_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_1_2_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_2_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_1_2_3()));
		match_Store_SinglethreadKeyword_1_6_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
		match_Store_VolatileKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getVolatileKeyword_0_1());
		match_Store_VolatileKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getVolatileKeyword_1_2());
		match_Store___CommaKeyword_0_5_0_AlignKeyword_0_5_1_INTTerminalRuleCall_0_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStoreAccess().getCommaKeyword_0_5_0()), new TokenAlias(false, false, grammarAccess.getStoreAccess().getAlignKeyword_0_5_1()), new TokenAlias(false, false, grammarAccess.getStoreAccess().getINTTerminalRuleCall_0_5_2()));
		match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getALIAS_LINKAGERule())
			return getALIAS_LINKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getALIGNMENTRule())
			return getALIGNMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBIN_OPRule())
			return getBIN_OPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCAST_TYPERule())
			return getCAST_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCallingConvRule())
			return getCallingConvToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFUNCTION_ATTRIBUTESRule())
			return getFUNCTION_ATTRIBUTESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getF_PREDICATESRule())
			return getF_PREDICATESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getI_PREDICATESRule())
			return getI_PREDICATESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLINKAGERule())
			return getLINKAGEToken(semanticObject, ruleCall, node);
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
	 * terminal INT returns ecore::EInt: ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
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
	 * terminal STRING	: 
	 * 			'"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|'"') )* '"' |
	 * 			"'" ( '\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\') | !('\\'|"'") )* "'"
	 * 		;
	 */
	protected String getSTRINGToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "\"\"";
	}
	
	/**
	 * Type:
	 * 	(StructType | VAR_TYPE | BType);
	 */
	protected String getTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{}";
	}
	
	/**
	 * terminal VAR_TYPE:
	 * 	((('%' | '@') (NOBRACKET | '(' NOBRACKET ')' | INT) '*'*) | '('+ ('%' | '@') (NOBRACKET | '(' NOBRACKET ')' | '%'
	 * 	INT) '*'* ')'+ '*'*);
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
			else if(match_ARITHMETIC_OP_Compare_LOGICAL_OP___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2___or_______AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9___TypeParserRuleCall_1___or_____AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5___TypeParserRuleCall_1____.equals(syntax))
				emit_ARITHMETIC_OP_Compare_LOGICAL_OP___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2___or_______AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9___TypeParserRuleCall_1___or_____AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5___TypeParserRuleCall_1____(semanticObject, getLastNavigableState(), syntaxNodes);
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
			else if(match_AtomicRMW_SinglethreadKeyword_6_q.equals(syntax))
				emit_AtomicRMW_SinglethreadKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRMW_VolatileKeyword_1_q.equals(syntax))
				emit_AtomicRMW_VolatileKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_CallingConvParserRuleCall_2_q.equals(syntax))
				emit_Call_CallingConvParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_FUNCTION_ATTRIBUTESParserRuleCall_6_q.equals(syntax))
				emit_Call_FUNCTION_ATTRIBUTESParserRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_RETURN_ATTRIBUTESParserRuleCall_3_q.equals(syntax))
				emit_Call_RETURN_ATTRIBUTESParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_TailKeyword_0_q.equals(syntax))
				emit_Call_TailKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_SinglethreadKeyword_7_q.equals(syntax))
				emit_CmpXchg_SinglethreadKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_VolatileKeyword_1_q.equals(syntax))
				emit_CmpXchg_VolatileKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Compare___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2__.equals(syntax))
				emit_Compare___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
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
			else if(match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_q.equals(syntax))
				emit_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_q.equals(syntax))
				emit_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
			else if(match_Invoke_CallingConvParserRuleCall_1_q.equals(syntax))
				emit_Invoke_CallingConvParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_5_q.equals(syntax))
				emit_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q.equals(syntax))
				emit_Invoke_RETURN_ATTRIBUTESParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5.equals(syntax))
				emit_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_SinglethreadKeyword_1_4_q.equals(syntax))
				emit_Load_SinglethreadKeyword_1_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_VolatileKeyword_0_1_q.equals(syntax))
				emit_Load_VolatileKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_VolatileKeyword_1_2_q.equals(syntax))
				emit_Load_VolatileKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q.equals(syntax))
				emit_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q.equals(syntax))
				emit_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_SinglethreadKeyword_1_6_q.equals(syntax))
				emit_Store_SinglethreadKeyword_1_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_VolatileKeyword_0_1_q.equals(syntax))
				emit_Store_VolatileKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_VolatileKeyword_1_2_q.equals(syntax))
				emit_Store_VolatileKeyword_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store___CommaKeyword_0_5_0_AlignKeyword_0_5_1_INTTerminalRuleCall_0_5_2__q.equals(syntax))
				emit_Store___CommaKeyword_0_5_0_AlignKeyword_0_5_1_INTTerminalRuleCall_0_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1.equals(syntax))
				emit_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     (
	     'add' | 
	     'sdiv' | 
	     'frem' | 
	     'fmul' | 
	     'udiv' | 
	     'fdiv' | 
	     'srem' | 
	     'fadd' | 
	     'urem' | 
	     'sub' | 
	     'fsub' | 
	     'mul'
	 )
	 */
	protected void emit_ARITHMETIC_OP_AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     (
	         (
	             (
	                 'add' | 
	                 'sdiv' | 
	                 'frem' | 
	                 'fmul' | 
	                 'udiv' | 
	                 'fdiv' | 
	                 'srem' | 
	                 'urem' | 
	                 'fadd' | 
	                 'sub' | 
	                 'fsub' | 
	                 'mul'
	             ) 
	             Type
	         ) | 
	         (
	             (
	                 'or' | 
	                 'and' | 
	                 'shl' | 
	                 'ashr' | 
	                 'xor' | 
	                 'lshr'
	             ) 
	             Type
	         )
	     ) | 
	     ('fcmp' F_PREDICATES Type) | 
	     ('icmp' I_PREDICATES Type)
	 )
	 */
	protected void emit_ARITHMETIC_OP_Compare_LOGICAL_OP___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2___or_______AddKeyword_0_0_or_FaddKeyword_0_1_or_FdivKeyword_0_8_or_FmulKeyword_0_5_or_FremKeyword_0_11_or_FsubKeyword_0_3_or_MulKeyword_0_4_or_SdivKeyword_0_7_or_SremKeyword_0_10_or_SubKeyword_0_2_or_UdivKeyword_0_6_or_UremKeyword_0_9___TypeParserRuleCall_1___or_____AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5___TypeParserRuleCall_1____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_AtomicRMW_SinglethreadKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     FUNCTION_ATTRIBUTES?
	 */
	protected void emit_Call_FUNCTION_ATTRIBUTESParserRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'singlethread'?
	 */
	protected void emit_CmpXchg_SinglethreadKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('fcmp' F_PREDICATES Type) | ('icmp' I_PREDICATES Type)
	 */
	protected void emit_Compare___FcmpKeyword_1_0_F_PREDICATESParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_I_PREDICATESParserRuleCall_0_1_TypeParserRuleCall_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     FUNCTION_ATTRIBUTES?
	 */
	protected void emit_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_0_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FUNCTION_ATTRIBUTES?
	 */
	protected void emit_FunctionHeader_FUNCTION_ATTRIBUTESParserRuleCall_1_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     CallingConv?
	 */
	protected void emit_Invoke_CallingConvParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FUNCTION_ATTRIBUTES?
	 */
	protected void emit_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	     'or' | 
	     'and' | 
	     'shl' | 
	     'xor' | 
	     'ashr' | 
	     'lshr'
	 )
	 */
	protected void emit_LOGICAL_OP_AndKeyword_0_3_or_AshrKeyword_0_2_or_LshrKeyword_0_1_or_OrKeyword_0_4_or_ShlKeyword_0_0_or_XorKeyword_0_5(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_Load_SinglethreadKeyword_1_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (',' '!dbg' '!' INT)?
	 */
	protected void emit_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (',' '!dbg' '!' INT)?
	 */
	protected void emit_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (',' 'align' INT)?
	 */
	protected void emit_Store___CommaKeyword_0_5_0_AlignKeyword_0_5_1_INTTerminalRuleCall_0_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'datalayout' | 'triple'
	 */
	protected void emit_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
