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
	protected AbstractElementAlias match_AliasDefinition_DefaultKeyword_4_0_q_or_HiddenKeyword_4_1_q_or_ProtectedKeyword_4_2_q;
	protected AbstractElementAlias match_AliasDefinition___ExternalKeyword_3_0_or_InternalKeyword_3_1_or_WeakKeyword_3_2_or_Weak_odrKeyword_3_3__q;
	protected AbstractElementAlias match_ArithmeticOperationAdd_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationAdd_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationFadd_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationFadd_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationFdiv_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationFdiv_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationFmul_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationFmul_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationFrem_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationFrem_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationFsub_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationFsub_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationMul_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationMul_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationSdiv_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationSdiv_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationSrem_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationSrem_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationSub_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationSub_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationUdiv_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationUdiv_NuwKeyword_3_q;
	protected AbstractElementAlias match_ArithmeticOperationUrem_NswKeyword_4_q;
	protected AbstractElementAlias match_ArithmeticOperationUrem_NuwKeyword_3_q;
	protected AbstractElementAlias match_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__;
	protected AbstractElementAlias match_AtomicRmwAdd_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwAnd_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwMax_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwMin_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwNand_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwOr_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwSub_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwUmax_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwUmin_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwXchg_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_AtomicRmwXor_SinglethreadKeyword_8_q;
	protected AbstractElementAlias match_Call_CALLING_CONVParserRuleCall_3_q;
	protected AbstractElementAlias match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a;
	protected AbstractElementAlias match_Call_TailKeyword_1_q;
	protected AbstractElementAlias match_Call___ByvalKeyword_4_3_or_InregKeyword_4_2_or_NestKeyword_4_7_or_NoaliasKeyword_4_5_or_NocaptureKeyword_4_6_or_SignextKeyword_4_1_or_SretKeyword_4_4_or_ZeroextKeyword_4_0__q;
	protected AbstractElementAlias match_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_INTTerminalRuleCall_8_3__a;
	protected AbstractElementAlias match_CmpXchg_SinglethreadKeyword_9_q;
	protected AbstractElementAlias match_Fence_SinglethreadKeyword_1_q;
	protected AbstractElementAlias match_FunctionDefinition_CALLING_CONVParserRuleCall_0_3_q;
	protected AbstractElementAlias match_FunctionDefinition_CALLING_CONVParserRuleCall_1_3_q;
	protected AbstractElementAlias match_FunctionDefinition_DefaultKeyword_0_2_0_q_or_HiddenKeyword_0_2_1_q_or_ProtectedKeyword_0_2_2_q;
	protected AbstractElementAlias match_FunctionDefinition_DefaultKeyword_1_2_0_q_or_HiddenKeyword_1_2_1_q_or_ProtectedKeyword_1_2_2_q;
	protected AbstractElementAlias match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a;
	protected AbstractElementAlias match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a;
	protected AbstractElementAlias match_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_0_7_0_or___LeftParenthesisKeyword_0_7_1_0_RightParenthesisKeyword_0_7_1_2__;
	protected AbstractElementAlias match_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_1_7_0_or___LeftParenthesisKeyword_1_7_1_0_RightParenthesisKeyword_1_7_1_2__;
	protected AbstractElementAlias match_FunctionDefinition_Unnamed_addrKeyword_0_8_q;
	protected AbstractElementAlias match_FunctionDefinition_Unnamed_addrKeyword_1_8_q;
	protected AbstractElementAlias match_FunctionDefinition___AppendingKeyword_0_1_6_or_Available_externallyKeyword_0_1_3_or_CommonKeyword_0_1_5_or_DllexportKeyword_0_1_11_or_DllimportKeyword_0_1_10_or_Extern_weakKeyword_0_1_7_or_ExternalKeyword_0_1_12_or_InternalKeyword_0_1_13_or_Linker_privateKeyword_0_1_1_or_Linker_private_weakKeyword_0_1_2_or_LinkonceKeyword_0_1_4_or_Linkonce_odrKeyword_0_1_8_or_Linkonce_odr_auto_hideKeyword_0_1_9_or_PrivateKeyword_0_1_0_or_WeakKeyword_0_1_14_or_Weak_odrKeyword_0_1_15__q;
	protected AbstractElementAlias match_FunctionDefinition___AppendingKeyword_1_1_6_or_Available_externallyKeyword_1_1_3_or_CommonKeyword_1_1_5_or_DllexportKeyword_1_1_11_or_DllimportKeyword_1_1_10_or_Extern_weakKeyword_1_1_7_or_ExternalKeyword_1_1_12_or_InternalKeyword_1_1_13_or_Linker_privateKeyword_1_1_1_or_Linker_private_weakKeyword_1_1_2_or_LinkonceKeyword_1_1_4_or_Linkonce_odrKeyword_1_1_8_or_Linkonce_odr_auto_hideKeyword_1_1_9_or_PrivateKeyword_1_1_0_or_WeakKeyword_1_1_14_or_Weak_odrKeyword_1_1_15__q;
	protected AbstractElementAlias match_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q;
	protected AbstractElementAlias match_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q;
	protected AbstractElementAlias match_FunctionParameter___ByvalKeyword_1_3_or_InregKeyword_1_2_or_NestKeyword_1_7_or_NoaliasKeyword_1_5_or_NocaptureKeyword_1_6_or_SignextKeyword_1_1_or_SretKeyword_1_4_or_ZeroextKeyword_1_0__a;
	protected AbstractElementAlias match_GetElementPtr_InboundsKeyword_3_q;
	protected AbstractElementAlias match_GlobalDefinition___AppendingKeyword_2_6_or_Available_externallyKeyword_2_3_or_CommonKeyword_2_5_or_ConstantKeyword_2_18_or_DllexportKeyword_2_11_or_DllimportKeyword_2_10_or_Extern_weakKeyword_2_7_or_ExternalKeyword_2_12_or_GlobalKeyword_2_16_or_InternalKeyword_2_13_or_Linker_privateKeyword_2_1_or_Linker_private_weakKeyword_2_2_or_LinkonceKeyword_2_4_or_Linkonce_odrKeyword_2_8_or_Linkonce_odr_auto_hideKeyword_2_9_or_PrivateKeyword_2_0_or_Unnamed_addrKeyword_2_17_or_WeakKeyword_2_14_or_Weak_odrKeyword_2_15__a;
	protected AbstractElementAlias match_Invoke_CALLING_CONVParserRuleCall_1_q;
	protected AbstractElementAlias match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a;
	protected AbstractElementAlias match_Invoke___ByvalKeyword_2_3_or_InregKeyword_2_2_or_NestKeyword_2_7_or_NoaliasKeyword_2_5_or_NocaptureKeyword_2_6_or_SignextKeyword_2_1_or_SretKeyword_2_4_or_ZeroextKeyword_2_0__q;
	protected AbstractElementAlias match_Load_SinglethreadKeyword_1_6_q;
	protected AbstractElementAlias match_MetadataValue_ExclamationMarkLeftCurlyBracketKeyword_3_1_or___ExclamationMarkKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__;
	protected AbstractElementAlias match_MetadataValue_MetadataKeyword_2_q;
	protected AbstractElementAlias match_NestedGetElementPtr_InboundsKeyword_1_q;
	protected AbstractElementAlias match_Return___CommaKeyword_0_2_0_DbgKeyword_0_2_1_ExclamationMarkKeyword_0_2_2_INTTerminalRuleCall_0_2_3__q;
	protected AbstractElementAlias match_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q;
	protected AbstractElementAlias match_Store_SinglethreadKeyword_1_6_q;
	protected AbstractElementAlias match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LLVMGrammarAccess) access;
		match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1());
		match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1());
		match_AliasDefinition_DefaultKeyword_4_0_q_or_HiddenKeyword_4_1_q_or_ProtectedKeyword_4_2_q = new AlternativeAlias(false, false, new TokenAlias(false, true, grammarAccess.getAliasDefinitionAccess().getDefaultKeyword_4_0()), new TokenAlias(false, true, grammarAccess.getAliasDefinitionAccess().getHiddenKeyword_4_1()), new TokenAlias(false, true, grammarAccess.getAliasDefinitionAccess().getProtectedKeyword_4_2()));
		match_AliasDefinition___ExternalKeyword_3_0_or_InternalKeyword_3_1_or_WeakKeyword_3_2_or_Weak_odrKeyword_3_3__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getAliasDefinitionAccess().getExternalKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAliasDefinitionAccess().getInternalKeyword_3_1()), new TokenAlias(false, false, grammarAccess.getAliasDefinitionAccess().getWeakKeyword_3_2()), new TokenAlias(false, false, grammarAccess.getAliasDefinitionAccess().getWeak_odrKeyword_3_3()));
		match_ArithmeticOperationAdd_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationAddAccess().getNswKeyword_4());
		match_ArithmeticOperationAdd_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationAddAccess().getNuwKeyword_3());
		match_ArithmeticOperationFadd_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFaddAccess().getNswKeyword_4());
		match_ArithmeticOperationFadd_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFaddAccess().getNuwKeyword_3());
		match_ArithmeticOperationFdiv_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFdivAccess().getNswKeyword_4());
		match_ArithmeticOperationFdiv_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFdivAccess().getNuwKeyword_3());
		match_ArithmeticOperationFmul_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFmulAccess().getNswKeyword_4());
		match_ArithmeticOperationFmul_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFmulAccess().getNuwKeyword_3());
		match_ArithmeticOperationFrem_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFremAccess().getNswKeyword_4());
		match_ArithmeticOperationFrem_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFremAccess().getNuwKeyword_3());
		match_ArithmeticOperationFsub_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFsubAccess().getNswKeyword_4());
		match_ArithmeticOperationFsub_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationFsubAccess().getNuwKeyword_3());
		match_ArithmeticOperationMul_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationMulAccess().getNswKeyword_4());
		match_ArithmeticOperationMul_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationMulAccess().getNuwKeyword_3());
		match_ArithmeticOperationSdiv_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationSdivAccess().getNswKeyword_4());
		match_ArithmeticOperationSdiv_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationSdivAccess().getNuwKeyword_3());
		match_ArithmeticOperationSrem_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationSremAccess().getNswKeyword_4());
		match_ArithmeticOperationSrem_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationSremAccess().getNuwKeyword_3());
		match_ArithmeticOperationSub_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationSubAccess().getNswKeyword_4());
		match_ArithmeticOperationSub_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationSubAccess().getNuwKeyword_3());
		match_ArithmeticOperationUdiv_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationUdivAccess().getNswKeyword_4());
		match_ArithmeticOperationUdiv_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationUdivAccess().getNuwKeyword_3());
		match_ArithmeticOperationUrem_NswKeyword_4_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationUremAccess().getNswKeyword_4());
		match_ArithmeticOperationUrem_NuwKeyword_3_q = new TokenAlias(false, true, grammarAccess.getArithmeticOperationUremAccess().getNuwKeyword_3());
		match_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_1_2_1())), new TokenAlias(false, false, grammarAccess.getArrayAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1()));
		match_AtomicRmwAdd_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwAddAccess().getSinglethreadKeyword_8());
		match_AtomicRmwAnd_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwAndAccess().getSinglethreadKeyword_8());
		match_AtomicRmwMax_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwMaxAccess().getSinglethreadKeyword_8());
		match_AtomicRmwMin_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwMinAccess().getSinglethreadKeyword_8());
		match_AtomicRmwNand_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwNandAccess().getSinglethreadKeyword_8());
		match_AtomicRmwOr_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwOrAccess().getSinglethreadKeyword_8());
		match_AtomicRmwSub_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwSubAccess().getSinglethreadKeyword_8());
		match_AtomicRmwUmax_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwUmaxAccess().getSinglethreadKeyword_8());
		match_AtomicRmwUmin_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwUminAccess().getSinglethreadKeyword_8());
		match_AtomicRmwXchg_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwXchgAccess().getSinglethreadKeyword_8());
		match_AtomicRmwXor_SinglethreadKeyword_8_q = new TokenAlias(false, true, grammarAccess.getAtomicRmwXorAccess().getSinglethreadKeyword_8());
		match_Call_CALLING_CONVParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getCALLING_CONVParserRuleCall_3());
		match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a = new TokenAlias(true, true, grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_7());
		match_Call_TailKeyword_1_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getTailKeyword_1());
		match_Call___ByvalKeyword_4_3_or_InregKeyword_4_2_or_NestKeyword_4_7_or_NoaliasKeyword_4_5_or_NocaptureKeyword_4_6_or_SignextKeyword_4_1_or_SretKeyword_4_4_or_ZeroextKeyword_4_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getCallAccess().getByvalKeyword_4_3()), new TokenAlias(false, false, grammarAccess.getCallAccess().getInregKeyword_4_2()), new TokenAlias(false, false, grammarAccess.getCallAccess().getNestKeyword_4_7()), new TokenAlias(false, false, grammarAccess.getCallAccess().getNoaliasKeyword_4_5()), new TokenAlias(false, false, grammarAccess.getCallAccess().getNocaptureKeyword_4_6()), new TokenAlias(false, false, grammarAccess.getCallAccess().getSignextKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getCallAccess().getSretKeyword_4_4()), new TokenAlias(false, false, grammarAccess.getCallAccess().getZeroextKeyword_4_0()));
		match_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_INTTerminalRuleCall_8_3__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getCallAccess().getCommaKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getCallAccess().getSrclocKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getCallAccess().getExclamationMarkKeyword_8_2()), new TokenAlias(false, false, grammarAccess.getCallAccess().getINTTerminalRuleCall_8_3()));
		match_CmpXchg_SinglethreadKeyword_9_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_9());
		match_Fence_SinglethreadKeyword_1_q = new TokenAlias(false, true, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
		match_FunctionDefinition_CALLING_CONVParserRuleCall_0_3_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getCALLING_CONVParserRuleCall_0_3());
		match_FunctionDefinition_CALLING_CONVParserRuleCall_1_3_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getCALLING_CONVParserRuleCall_1_3());
		match_FunctionDefinition_DefaultKeyword_0_2_0_q_or_HiddenKeyword_0_2_1_q_or_ProtectedKeyword_0_2_2_q = new AlternativeAlias(false, false, new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getDefaultKeyword_0_2_0()), new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getHiddenKeyword_0_2_1()), new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getProtectedKeyword_0_2_2()));
		match_FunctionDefinition_DefaultKeyword_1_2_0_q_or_HiddenKeyword_1_2_1_q_or_ProtectedKeyword_1_2_2_q = new AlternativeAlias(false, false, new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getDefaultKeyword_1_2_0()), new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getHiddenKeyword_1_2_1()), new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getProtectedKeyword_1_2_2()));
		match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9());
		match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a = new TokenAlias(true, true, grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9());
		match_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_0_7_0_or___LeftParenthesisKeyword_0_7_1_0_RightParenthesisKeyword_0_7_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_0_7_1_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_0_7_1_2())), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisRightParenthesisKeyword_0_7_0()));
		match_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_1_7_0_or___LeftParenthesisKeyword_1_7_1_0_RightParenthesisKeyword_1_7_1_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisKeyword_1_7_1_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getRightParenthesisKeyword_1_7_1_2())), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLeftParenthesisRightParenthesisKeyword_1_7_0()));
		match_FunctionDefinition_Unnamed_addrKeyword_0_8_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_0_8());
		match_FunctionDefinition_Unnamed_addrKeyword_1_8_q = new TokenAlias(false, true, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_1_8());
		match_FunctionDefinition___AppendingKeyword_0_1_6_or_Available_externallyKeyword_0_1_3_or_CommonKeyword_0_1_5_or_DllexportKeyword_0_1_11_or_DllimportKeyword_0_1_10_or_Extern_weakKeyword_0_1_7_or_ExternalKeyword_0_1_12_or_InternalKeyword_0_1_13_or_Linker_privateKeyword_0_1_1_or_Linker_private_weakKeyword_0_1_2_or_LinkonceKeyword_0_1_4_or_Linkonce_odrKeyword_0_1_8_or_Linkonce_odr_auto_hideKeyword_0_1_9_or_PrivateKeyword_0_1_0_or_WeakKeyword_0_1_14_or_Weak_odrKeyword_0_1_15__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getAppendingKeyword_0_1_6()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getAvailable_externallyKeyword_0_1_3()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getCommonKeyword_0_1_5()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getDllexportKeyword_0_1_11()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getDllimportKeyword_0_1_10()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getExtern_weakKeyword_0_1_7()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getExternalKeyword_0_1_12()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getInternalKeyword_0_1_13()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinker_privateKeyword_0_1_1()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinker_private_weakKeyword_0_1_2()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinkonceKeyword_0_1_4()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinkonce_odrKeyword_0_1_8()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinkonce_odr_auto_hideKeyword_0_1_9()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getPrivateKeyword_0_1_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getWeakKeyword_0_1_14()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getWeak_odrKeyword_0_1_15()));
		match_FunctionDefinition___AppendingKeyword_1_1_6_or_Available_externallyKeyword_1_1_3_or_CommonKeyword_1_1_5_or_DllexportKeyword_1_1_11_or_DllimportKeyword_1_1_10_or_Extern_weakKeyword_1_1_7_or_ExternalKeyword_1_1_12_or_InternalKeyword_1_1_13_or_Linker_privateKeyword_1_1_1_or_Linker_private_weakKeyword_1_1_2_or_LinkonceKeyword_1_1_4_or_Linkonce_odrKeyword_1_1_8_or_Linkonce_odr_auto_hideKeyword_1_1_9_or_PrivateKeyword_1_1_0_or_WeakKeyword_1_1_14_or_Weak_odrKeyword_1_1_15__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getAppendingKeyword_1_1_6()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getAvailable_externallyKeyword_1_1_3()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getCommonKeyword_1_1_5()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getDllexportKeyword_1_1_11()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getDllimportKeyword_1_1_10()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getExtern_weakKeyword_1_1_7()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getExternalKeyword_1_1_12()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getInternalKeyword_1_1_13()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinker_privateKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinker_private_weakKeyword_1_1_2()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinkonceKeyword_1_1_4()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinkonce_odrKeyword_1_1_8()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getLinkonce_odr_auto_hideKeyword_1_1_9()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getPrivateKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getWeakKeyword_1_1_14()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getWeak_odrKeyword_1_1_15()));
		match_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_0_10_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_0_10_1()));
		match_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_1_10_0()), new TokenAlias(false, false, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_1_10_1()));
		match_FunctionParameter___ByvalKeyword_1_3_or_InregKeyword_1_2_or_NestKeyword_1_7_or_NoaliasKeyword_1_5_or_NocaptureKeyword_1_6_or_SignextKeyword_1_1_or_SretKeyword_1_4_or_ZeroextKeyword_1_0__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getFunctionParameterAccess().getByvalKeyword_1_3()), new TokenAlias(false, false, grammarAccess.getFunctionParameterAccess().getInregKeyword_1_2()), new TokenAlias(false, false, grammarAccess.getFunctionParameterAccess().getNestKeyword_1_7()), new TokenAlias(false, false, grammarAccess.getFunctionParameterAccess().getNoaliasKeyword_1_5()), new TokenAlias(false, false, grammarAccess.getFunctionParameterAccess().getNocaptureKeyword_1_6()), new TokenAlias(false, false, grammarAccess.getFunctionParameterAccess().getSignextKeyword_1_1()), new TokenAlias(false, false, grammarAccess.getFunctionParameterAccess().getSretKeyword_1_4()), new TokenAlias(false, false, grammarAccess.getFunctionParameterAccess().getZeroextKeyword_1_0()));
		match_GetElementPtr_InboundsKeyword_3_q = new TokenAlias(false, true, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_3());
		match_GlobalDefinition___AppendingKeyword_2_6_or_Available_externallyKeyword_2_3_or_CommonKeyword_2_5_or_ConstantKeyword_2_18_or_DllexportKeyword_2_11_or_DllimportKeyword_2_10_or_Extern_weakKeyword_2_7_or_ExternalKeyword_2_12_or_GlobalKeyword_2_16_or_InternalKeyword_2_13_or_Linker_privateKeyword_2_1_or_Linker_private_weakKeyword_2_2_or_LinkonceKeyword_2_4_or_Linkonce_odrKeyword_2_8_or_Linkonce_odr_auto_hideKeyword_2_9_or_PrivateKeyword_2_0_or_Unnamed_addrKeyword_2_17_or_WeakKeyword_2_14_or_Weak_odrKeyword_2_15__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getAppendingKeyword_2_6()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getAvailable_externallyKeyword_2_3()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getCommonKeyword_2_5()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getConstantKeyword_2_18()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getDllexportKeyword_2_11()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getDllimportKeyword_2_10()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getExtern_weakKeyword_2_7()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getExternalKeyword_2_12()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getGlobalKeyword_2_16()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getInternalKeyword_2_13()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getLinker_privateKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getLinker_private_weakKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getLinkonceKeyword_2_4()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getLinkonce_odrKeyword_2_8()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getLinkonce_odr_auto_hideKeyword_2_9()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getPrivateKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getUnnamed_addrKeyword_2_17()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getWeakKeyword_2_14()), new TokenAlias(false, false, grammarAccess.getGlobalDefinitionAccess().getWeak_odrKeyword_2_15()));
		match_Invoke_CALLING_CONVParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getCALLING_CONVParserRuleCall_1());
		match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a = new TokenAlias(true, true, grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6());
		match_Invoke___ByvalKeyword_2_3_or_InregKeyword_2_2_or_NestKeyword_2_7_or_NoaliasKeyword_2_5_or_NocaptureKeyword_2_6_or_SignextKeyword_2_1_or_SretKeyword_2_4_or_ZeroextKeyword_2_0__q = new AlternativeAlias(false, true, new TokenAlias(false, false, grammarAccess.getInvokeAccess().getByvalKeyword_2_3()), new TokenAlias(false, false, grammarAccess.getInvokeAccess().getInregKeyword_2_2()), new TokenAlias(false, false, grammarAccess.getInvokeAccess().getNestKeyword_2_7()), new TokenAlias(false, false, grammarAccess.getInvokeAccess().getNoaliasKeyword_2_5()), new TokenAlias(false, false, grammarAccess.getInvokeAccess().getNocaptureKeyword_2_6()), new TokenAlias(false, false, grammarAccess.getInvokeAccess().getSignextKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getInvokeAccess().getSretKeyword_2_4()), new TokenAlias(false, false, grammarAccess.getInvokeAccess().getZeroextKeyword_2_0()));
		match_Load_SinglethreadKeyword_1_6_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_6());
		match_MetadataValue_ExclamationMarkLeftCurlyBracketKeyword_3_1_or___ExclamationMarkKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_3_0_0()), new TokenAlias(false, false, grammarAccess.getMetadataValueAccess().getLeftCurlyBracketKeyword_3_0_1())), new TokenAlias(false, false, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_3_1()));
		match_MetadataValue_MetadataKeyword_2_q = new TokenAlias(false, true, grammarAccess.getMetadataValueAccess().getMetadataKeyword_2());
		match_NestedGetElementPtr_InboundsKeyword_1_q = new TokenAlias(false, true, grammarAccess.getNestedGetElementPtrAccess().getInboundsKeyword_1());
		match_Return___CommaKeyword_0_2_0_DbgKeyword_0_2_1_ExclamationMarkKeyword_0_2_2_INTTerminalRuleCall_0_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_0_2_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_0_2_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_2_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_2_3()));
		match_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_1_2_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_2_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_1_2_3()));
		match_Store_SinglethreadKeyword_1_6_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
		match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCALLING_CONVRule())
			return getCALLING_CONVToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFUNCTION_ATTRIBUTESRule())
			return getFUNCTION_ATTRIBUTESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINT_TYPERule())
			return getINT_TYPEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * CALLING_CONV:
	 * 	'ccc' | 'fastcc' | 'coldcc' | 'x86_stdcallcc' | 'x86_fastcallcc' | 'x86_thiscallcc' 
	 * 	| 'arm_apcscc' | 'arm_aapcscc' | 'arm_aapcs_vfpcc' | 'msp430_intrcc' | 'ptx_kernel' 
	 * 	| 'ptx_device' | 'spir_func' | 'spir_kernel' | 'cc' '<' INT '>' INT;
	 */
	protected String getCALLING_CONVToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ccc";
	}
	
	/**
	 * FUNCTION_ATTRIBUTES:
	 * 	'address_safety' | 'alignstack' '(' '<' INT '>' ')' | 'alwaysinline' | 'nonlazybind' 
	 * 	| 'inlinehint' | 'naked' | 'noimplicitfloat' | 'noinline' | 'noredzone' | 'noreturn' 
	 * 	| 'nounwind' | 'optsize' | 'readnone' | 'readonly' | 'returns_twice' | 'ssp' | 'sspreq' | 'uwtable';
	 */
	protected String getFUNCTION_ATTRIBUTESToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "address_safety";
	}
	
	/**
	 * terminal INT returns EInt: '-'?('0'..'9')+;
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
			else if(match_AliasDefinition_DefaultKeyword_4_0_q_or_HiddenKeyword_4_1_q_or_ProtectedKeyword_4_2_q.equals(syntax))
				emit_AliasDefinition_DefaultKeyword_4_0_q_or_HiddenKeyword_4_1_q_or_ProtectedKeyword_4_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AliasDefinition___ExternalKeyword_3_0_or_InternalKeyword_3_1_or_WeakKeyword_3_2_or_Weak_odrKeyword_3_3__q.equals(syntax))
				emit_AliasDefinition___ExternalKeyword_3_0_or_InternalKeyword_3_1_or_WeakKeyword_3_2_or_Weak_odrKeyword_3_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationAdd_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationAdd_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationAdd_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationAdd_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFadd_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationFadd_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFadd_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationFadd_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFdiv_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationFdiv_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFdiv_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationFdiv_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFmul_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationFmul_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFmul_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationFmul_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFrem_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationFrem_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFrem_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationFrem_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFsub_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationFsub_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationFsub_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationFsub_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationMul_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationMul_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationMul_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationMul_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationSdiv_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationSdiv_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationSdiv_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationSdiv_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationSrem_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationSrem_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationSrem_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationSrem_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationSub_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationSub_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationSub_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationSub_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationUdiv_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationUdiv_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationUdiv_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationUdiv_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationUrem_NswKeyword_4_q.equals(syntax))
				emit_ArithmeticOperationUrem_NswKeyword_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ArithmeticOperationUrem_NuwKeyword_3_q.equals(syntax))
				emit_ArithmeticOperationUrem_NuwKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__.equals(syntax))
				emit_Array_LeftSquareBracketRightSquareBracketKeyword_1_1_or___LeftSquareBracketKeyword_1_2_0_RightSquareBracketKeyword_1_2_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwAdd_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwAdd_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwAnd_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwAnd_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwMax_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwMax_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwMin_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwMin_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwNand_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwNand_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwOr_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwOr_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwSub_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwSub_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwUmax_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwUmax_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwUmin_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwUmin_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwXchg_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwXchg_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRmwXor_SinglethreadKeyword_8_q.equals(syntax))
				emit_AtomicRmwXor_SinglethreadKeyword_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_CALLING_CONVParserRuleCall_3_q.equals(syntax))
				emit_Call_CALLING_CONVParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a.equals(syntax))
				emit_Call_FUNCTION_ATTRIBUTESParserRuleCall_7_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_TailKeyword_1_q.equals(syntax))
				emit_Call_TailKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call___ByvalKeyword_4_3_or_InregKeyword_4_2_or_NestKeyword_4_7_or_NoaliasKeyword_4_5_or_NocaptureKeyword_4_6_or_SignextKeyword_4_1_or_SretKeyword_4_4_or_ZeroextKeyword_4_0__q.equals(syntax))
				emit_Call___ByvalKeyword_4_3_or_InregKeyword_4_2_or_NestKeyword_4_7_or_NoaliasKeyword_4_5_or_NocaptureKeyword_4_6_or_SignextKeyword_4_1_or_SretKeyword_4_4_or_ZeroextKeyword_4_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_INTTerminalRuleCall_8_3__a.equals(syntax))
				emit_Call___CommaKeyword_8_0_SrclocKeyword_8_1_ExclamationMarkKeyword_8_2_INTTerminalRuleCall_8_3__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_SinglethreadKeyword_9_q.equals(syntax))
				emit_CmpXchg_SinglethreadKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Fence_SinglethreadKeyword_1_q.equals(syntax))
				emit_Fence_SinglethreadKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_CALLING_CONVParserRuleCall_0_3_q.equals(syntax))
				emit_FunctionDefinition_CALLING_CONVParserRuleCall_0_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_CALLING_CONVParserRuleCall_1_3_q.equals(syntax))
				emit_FunctionDefinition_CALLING_CONVParserRuleCall_1_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_DefaultKeyword_0_2_0_q_or_HiddenKeyword_0_2_1_q_or_ProtectedKeyword_0_2_2_q.equals(syntax))
				emit_FunctionDefinition_DefaultKeyword_0_2_0_q_or_HiddenKeyword_0_2_1_q_or_ProtectedKeyword_0_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_DefaultKeyword_1_2_0_q_or_HiddenKeyword_1_2_1_q_or_ProtectedKeyword_1_2_2_q.equals(syntax))
				emit_FunctionDefinition_DefaultKeyword_1_2_0_q_or_HiddenKeyword_1_2_1_q_or_ProtectedKeyword_1_2_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a.equals(syntax))
				emit_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_0_9_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a.equals(syntax))
				emit_FunctionDefinition_FUNCTION_ATTRIBUTESParserRuleCall_1_9_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_0_7_0_or___LeftParenthesisKeyword_0_7_1_0_RightParenthesisKeyword_0_7_1_2__.equals(syntax))
				emit_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_0_7_0_or___LeftParenthesisKeyword_0_7_1_0_RightParenthesisKeyword_0_7_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_1_7_0_or___LeftParenthesisKeyword_1_7_1_0_RightParenthesisKeyword_1_7_1_2__.equals(syntax))
				emit_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_1_7_0_or___LeftParenthesisKeyword_1_7_1_0_RightParenthesisKeyword_1_7_1_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_Unnamed_addrKeyword_0_8_q.equals(syntax))
				emit_FunctionDefinition_Unnamed_addrKeyword_0_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition_Unnamed_addrKeyword_1_8_q.equals(syntax))
				emit_FunctionDefinition_Unnamed_addrKeyword_1_8_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___AppendingKeyword_0_1_6_or_Available_externallyKeyword_0_1_3_or_CommonKeyword_0_1_5_or_DllexportKeyword_0_1_11_or_DllimportKeyword_0_1_10_or_Extern_weakKeyword_0_1_7_or_ExternalKeyword_0_1_12_or_InternalKeyword_0_1_13_or_Linker_privateKeyword_0_1_1_or_Linker_private_weakKeyword_0_1_2_or_LinkonceKeyword_0_1_4_or_Linkonce_odrKeyword_0_1_8_or_Linkonce_odr_auto_hideKeyword_0_1_9_or_PrivateKeyword_0_1_0_or_WeakKeyword_0_1_14_or_Weak_odrKeyword_0_1_15__q.equals(syntax))
				emit_FunctionDefinition___AppendingKeyword_0_1_6_or_Available_externallyKeyword_0_1_3_or_CommonKeyword_0_1_5_or_DllexportKeyword_0_1_11_or_DllimportKeyword_0_1_10_or_Extern_weakKeyword_0_1_7_or_ExternalKeyword_0_1_12_or_InternalKeyword_0_1_13_or_Linker_privateKeyword_0_1_1_or_Linker_private_weakKeyword_0_1_2_or_LinkonceKeyword_0_1_4_or_Linkonce_odrKeyword_0_1_8_or_Linkonce_odr_auto_hideKeyword_0_1_9_or_PrivateKeyword_0_1_0_or_WeakKeyword_0_1_14_or_Weak_odrKeyword_0_1_15__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___AppendingKeyword_1_1_6_or_Available_externallyKeyword_1_1_3_or_CommonKeyword_1_1_5_or_DllexportKeyword_1_1_11_or_DllimportKeyword_1_1_10_or_Extern_weakKeyword_1_1_7_or_ExternalKeyword_1_1_12_or_InternalKeyword_1_1_13_or_Linker_privateKeyword_1_1_1_or_Linker_private_weakKeyword_1_1_2_or_LinkonceKeyword_1_1_4_or_Linkonce_odrKeyword_1_1_8_or_Linkonce_odr_auto_hideKeyword_1_1_9_or_PrivateKeyword_1_1_0_or_WeakKeyword_1_1_14_or_Weak_odrKeyword_1_1_15__q.equals(syntax))
				emit_FunctionDefinition___AppendingKeyword_1_1_6_or_Available_externallyKeyword_1_1_3_or_CommonKeyword_1_1_5_or_DllexportKeyword_1_1_11_or_DllimportKeyword_1_1_10_or_Extern_weakKeyword_1_1_7_or_ExternalKeyword_1_1_12_or_InternalKeyword_1_1_13_or_Linker_privateKeyword_1_1_1_or_Linker_private_weakKeyword_1_1_2_or_LinkonceKeyword_1_1_4_or_Linkonce_odrKeyword_1_1_8_or_Linkonce_odr_auto_hideKeyword_1_1_9_or_PrivateKeyword_1_1_0_or_WeakKeyword_1_1_14_or_Weak_odrKeyword_1_1_15__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q.equals(syntax))
				emit_FunctionDefinition___SectionKeyword_0_10_0_STRINGTerminalRuleCall_0_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q.equals(syntax))
				emit_FunctionDefinition___SectionKeyword_1_10_0_STRINGTerminalRuleCall_1_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionParameter___ByvalKeyword_1_3_or_InregKeyword_1_2_or_NestKeyword_1_7_or_NoaliasKeyword_1_5_or_NocaptureKeyword_1_6_or_SignextKeyword_1_1_or_SretKeyword_1_4_or_ZeroextKeyword_1_0__a.equals(syntax))
				emit_FunctionParameter___ByvalKeyword_1_3_or_InregKeyword_1_2_or_NestKeyword_1_7_or_NoaliasKeyword_1_5_or_NocaptureKeyword_1_6_or_SignextKeyword_1_1_or_SretKeyword_1_4_or_ZeroextKeyword_1_0__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GetElementPtr_InboundsKeyword_3_q.equals(syntax))
				emit_GetElementPtr_InboundsKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GlobalDefinition___AppendingKeyword_2_6_or_Available_externallyKeyword_2_3_or_CommonKeyword_2_5_or_ConstantKeyword_2_18_or_DllexportKeyword_2_11_or_DllimportKeyword_2_10_or_Extern_weakKeyword_2_7_or_ExternalKeyword_2_12_or_GlobalKeyword_2_16_or_InternalKeyword_2_13_or_Linker_privateKeyword_2_1_or_Linker_private_weakKeyword_2_2_or_LinkonceKeyword_2_4_or_Linkonce_odrKeyword_2_8_or_Linkonce_odr_auto_hideKeyword_2_9_or_PrivateKeyword_2_0_or_Unnamed_addrKeyword_2_17_or_WeakKeyword_2_14_or_Weak_odrKeyword_2_15__a.equals(syntax))
				emit_GlobalDefinition___AppendingKeyword_2_6_or_Available_externallyKeyword_2_3_or_CommonKeyword_2_5_or_ConstantKeyword_2_18_or_DllexportKeyword_2_11_or_DllimportKeyword_2_10_or_Extern_weakKeyword_2_7_or_ExternalKeyword_2_12_or_GlobalKeyword_2_16_or_InternalKeyword_2_13_or_Linker_privateKeyword_2_1_or_Linker_private_weakKeyword_2_2_or_LinkonceKeyword_2_4_or_Linkonce_odrKeyword_2_8_or_Linkonce_odr_auto_hideKeyword_2_9_or_PrivateKeyword_2_0_or_Unnamed_addrKeyword_2_17_or_WeakKeyword_2_14_or_Weak_odrKeyword_2_15__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_CALLING_CONVParserRuleCall_1_q.equals(syntax))
				emit_Invoke_CALLING_CONVParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a.equals(syntax))
				emit_Invoke_FUNCTION_ATTRIBUTESParserRuleCall_6_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke___ByvalKeyword_2_3_or_InregKeyword_2_2_or_NestKeyword_2_7_or_NoaliasKeyword_2_5_or_NocaptureKeyword_2_6_or_SignextKeyword_2_1_or_SretKeyword_2_4_or_ZeroextKeyword_2_0__q.equals(syntax))
				emit_Invoke___ByvalKeyword_2_3_or_InregKeyword_2_2_or_NestKeyword_2_7_or_NoaliasKeyword_2_5_or_NocaptureKeyword_2_6_or_SignextKeyword_2_1_or_SretKeyword_2_4_or_ZeroextKeyword_2_0__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Load_SinglethreadKeyword_1_6_q.equals(syntax))
				emit_Load_SinglethreadKeyword_1_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetadataValue_ExclamationMarkLeftCurlyBracketKeyword_3_1_or___ExclamationMarkKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__.equals(syntax))
				emit_MetadataValue_ExclamationMarkLeftCurlyBracketKeyword_3_1_or___ExclamationMarkKeyword_3_0_0_LeftCurlyBracketKeyword_3_0_1__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_MetadataValue_MetadataKeyword_2_q.equals(syntax))
				emit_MetadataValue_MetadataKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_NestedGetElementPtr_InboundsKeyword_1_q.equals(syntax))
				emit_NestedGetElementPtr_InboundsKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return___CommaKeyword_0_2_0_DbgKeyword_0_2_1_ExclamationMarkKeyword_0_2_2_INTTerminalRuleCall_0_2_3__q.equals(syntax))
				emit_Return___CommaKeyword_0_2_0_DbgKeyword_0_2_1_ExclamationMarkKeyword_0_2_2_INTTerminalRuleCall_0_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q.equals(syntax))
				emit_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Store_SinglethreadKeyword_1_6_q.equals(syntax))
				emit_Store_SinglethreadKeyword_1_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     'default'? | 'hidden'? | 'protected'?
	 */
	protected void emit_AliasDefinition_DefaultKeyword_4_0_q_or_HiddenKeyword_4_1_q_or_ProtectedKeyword_4_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('external' | 'internal' | 'weak' | 'weak_odr')?
	 */
	protected void emit_AliasDefinition___ExternalKeyword_3_0_or_InternalKeyword_3_1_or_WeakKeyword_3_2_or_Weak_odrKeyword_3_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationAdd_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationAdd_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationFadd_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationFadd_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationFdiv_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationFdiv_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationFmul_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationFmul_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationFrem_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationFrem_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationFsub_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationFsub_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationMul_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationMul_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationSdiv_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationSdiv_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationSrem_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationSrem_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationSub_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationSub_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationUdiv_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationUdiv_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nsw'?
	 */
	protected void emit_ArithmeticOperationUrem_NswKeyword_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'nuw'?
	 */
	protected void emit_ArithmeticOperationUrem_NuwKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwAdd_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwAnd_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwMax_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwMin_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwNand_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwOr_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwSub_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwUmax_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwUmin_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwXchg_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'singlethread'?
	 */
	protected void emit_AtomicRmwXor_SinglethreadKeyword_8_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CALLING_CONV?
	 */
	protected void emit_Call_CALLING_CONVParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'tail'?
	 */
	protected void emit_Call_TailKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     'zeroext' | 
	     'signext' | 
	     'inreg' | 
	     'byval' | 
	     'sret' | 
	     'noalias' | 
	     'nocapture' | 
	     'nest'
	 )?
	 */
	protected void emit_Call___ByvalKeyword_4_3_or_InregKeyword_4_2_or_NestKeyword_4_7_or_NoaliasKeyword_4_5_or_NocaptureKeyword_4_6_or_SignextKeyword_4_1_or_SretKeyword_4_4_or_ZeroextKeyword_4_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	protected void emit_CmpXchg_SinglethreadKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     CALLING_CONV?
	 */
	protected void emit_FunctionDefinition_CALLING_CONVParserRuleCall_0_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CALLING_CONV?
	 */
	protected void emit_FunctionDefinition_CALLING_CONVParserRuleCall_1_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'default'? | 'hidden'? | 'protected'?
	 */
	protected void emit_FunctionDefinition_DefaultKeyword_0_2_0_q_or_HiddenKeyword_0_2_1_q_or_ProtectedKeyword_0_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'default'? | 'hidden'? | 'protected'?
	 */
	protected void emit_FunctionDefinition_DefaultKeyword_1_2_0_q_or_HiddenKeyword_1_2_1_q_or_ProtectedKeyword_1_2_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '()' | ('(' ')')
	 */
	protected void emit_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_0_7_0_or___LeftParenthesisKeyword_0_7_1_0_RightParenthesisKeyword_0_7_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '()' | ('(' ')')
	 */
	protected void emit_FunctionDefinition_LeftParenthesisRightParenthesisKeyword_1_7_0_or___LeftParenthesisKeyword_1_7_1_0_RightParenthesisKeyword_1_7_1_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (
	     'private' | 
	     'linker_private' | 
	     'linker_private_weak' | 
	     'available_externally' | 
	     'linkonce' | 
	     'common' | 
	     'appending' | 
	     'extern_weak' | 
	     'linkonce_odr' | 
	     'linkonce_odr_auto_hide' | 
	     'dllimport' | 
	     'dllexport' | 
	     'external' | 
	     'internal' | 
	     'weak' | 
	     'weak_odr'
	 )?
	 */
	protected void emit_FunctionDefinition___AppendingKeyword_0_1_6_or_Available_externallyKeyword_0_1_3_or_CommonKeyword_0_1_5_or_DllexportKeyword_0_1_11_or_DllimportKeyword_0_1_10_or_Extern_weakKeyword_0_1_7_or_ExternalKeyword_0_1_12_or_InternalKeyword_0_1_13_or_Linker_privateKeyword_0_1_1_or_Linker_private_weakKeyword_0_1_2_or_LinkonceKeyword_0_1_4_or_Linkonce_odrKeyword_0_1_8_or_Linkonce_odr_auto_hideKeyword_0_1_9_or_PrivateKeyword_0_1_0_or_WeakKeyword_0_1_14_or_Weak_odrKeyword_0_1_15__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     'private' | 
	     'linker_private' | 
	     'linker_private_weak' | 
	     'available_externally' | 
	     'linkonce' | 
	     'common' | 
	     'appending' | 
	     'extern_weak' | 
	     'linkonce_odr' | 
	     'linkonce_odr_auto_hide' | 
	     'dllimport' | 
	     'dllexport' | 
	     'external' | 
	     'internal' | 
	     'weak' | 
	     'weak_odr'
	 )?
	 */
	protected void emit_FunctionDefinition___AppendingKeyword_1_1_6_or_Available_externallyKeyword_1_1_3_or_CommonKeyword_1_1_5_or_DllexportKeyword_1_1_11_or_DllimportKeyword_1_1_10_or_Extern_weakKeyword_1_1_7_or_ExternalKeyword_1_1_12_or_InternalKeyword_1_1_13_or_Linker_privateKeyword_1_1_1_or_Linker_private_weakKeyword_1_1_2_or_LinkonceKeyword_1_1_4_or_Linkonce_odrKeyword_1_1_8_or_Linkonce_odr_auto_hideKeyword_1_1_9_or_PrivateKeyword_1_1_0_or_WeakKeyword_1_1_14_or_Weak_odrKeyword_1_1_15__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (
	     'zeroext' | 
	     'signext' | 
	     'inreg' | 
	     'byval' | 
	     'sret' | 
	     'noalias' | 
	     'nocapture' | 
	     'nest'
	 )*
	 */
	protected void emit_FunctionParameter___ByvalKeyword_1_3_or_InregKeyword_1_2_or_NestKeyword_1_7_or_NoaliasKeyword_1_5_or_NocaptureKeyword_1_6_or_SignextKeyword_1_1_or_SretKeyword_1_4_or_ZeroextKeyword_1_0__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (
	     'private' | 
	     'linker_private' | 
	     'linker_private_weak' | 
	     'available_externally' | 
	     'linkonce' | 
	     'common' | 
	     'appending' | 
	     'extern_weak' | 
	     'linkonce_odr' | 
	     'linkonce_odr_auto_hide' | 
	     'dllimport' | 
	     'dllexport' | 
	     'external' | 
	     'internal' | 
	     'weak' | 
	     'weak_odr' | 
	     'global' | 
	     'unnamed_addr' | 
	     'constant'
	 )*
	 */
	protected void emit_GlobalDefinition___AppendingKeyword_2_6_or_Available_externallyKeyword_2_3_or_CommonKeyword_2_5_or_ConstantKeyword_2_18_or_DllexportKeyword_2_11_or_DllimportKeyword_2_10_or_Extern_weakKeyword_2_7_or_ExternalKeyword_2_12_or_GlobalKeyword_2_16_or_InternalKeyword_2_13_or_Linker_privateKeyword_2_1_or_Linker_private_weakKeyword_2_2_or_LinkonceKeyword_2_4_or_Linkonce_odrKeyword_2_8_or_Linkonce_odr_auto_hideKeyword_2_9_or_PrivateKeyword_2_0_or_Unnamed_addrKeyword_2_17_or_WeakKeyword_2_14_or_Weak_odrKeyword_2_15__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CALLING_CONV?
	 */
	protected void emit_Invoke_CALLING_CONVParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (
	     'zeroext' | 
	     'signext' | 
	     'inreg' | 
	     'byval' | 
	     'sret' | 
	     'noalias' | 
	     'nocapture' | 
	     'nest'
	 )?
	 */
	protected void emit_Invoke___ByvalKeyword_2_3_or_InregKeyword_2_2_or_NestKeyword_2_7_or_NoaliasKeyword_2_5_or_NocaptureKeyword_2_6_or_SignextKeyword_2_1_or_SretKeyword_2_4_or_ZeroextKeyword_2_0__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '!{' | ('!' '{')
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
	 *     (',' '!dbg' '!' INT)?
	 */
	protected void emit_Return___CommaKeyword_0_2_0_DbgKeyword_0_2_1_ExclamationMarkKeyword_0_2_2_INTTerminalRuleCall_0_2_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'datalayout' | 'triple'
	 */
	protected void emit_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
