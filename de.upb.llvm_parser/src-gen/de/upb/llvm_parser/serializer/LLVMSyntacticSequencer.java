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
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_0_2_q;
	protected AbstractElementAlias match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q;
	protected AbstractElementAlias match_Alloc___CommaKeyword_3_0_AlignmentParserRuleCall_3_1__q;
	protected AbstractElementAlias match_Arithmetic_Compare_Logical___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2___or_____ArithmeticOPParserRuleCall_0_TypeParserRuleCall_1___or___LogicalOPParserRuleCall_0_TypeParserRuleCall_1____;
	protected AbstractElementAlias match_AtomicRMW_SinglethreadKeyword_6_q;
	protected AbstractElementAlias match_AtomicRMW_VolatileKeyword_1_q;
	protected AbstractElementAlias match_Call_CallingConvParserRuleCall_2_q;
	protected AbstractElementAlias match_Call_FunctionAttributesParserRuleCall_6_q;
	protected AbstractElementAlias match_Call_ReturnAttributesParserRuleCall_3_q;
	protected AbstractElementAlias match_Call_TailKeyword_0_q;
	protected AbstractElementAlias match_CmpXchg_SinglethreadKeyword_7_q;
	protected AbstractElementAlias match_CmpXchg_VolatileKeyword_1_q;
	protected AbstractElementAlias match_Compare___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2__;
	protected AbstractElementAlias match_Fence_SinglethreadKeyword_1_q;
	protected AbstractElementAlias match_FunctionHeader_AlignmentParserRuleCall_11_q;
	protected AbstractElementAlias match_FunctionHeader_CallingConvParserRuleCall_3_q;
	protected AbstractElementAlias match_FunctionHeader_DeclareKeyword_0_0_or_DefineKeyword_0_1;
	protected AbstractElementAlias match_FunctionHeader_FunctionAttributesParserRuleCall_9_q;
	protected AbstractElementAlias match_FunctionHeader_LinkageParserRuleCall_1_q;
	protected AbstractElementAlias match_FunctionHeader_ReturnAttributesParserRuleCall_4_q;
	protected AbstractElementAlias match_FunctionHeader_VisibilityParserRuleCall_2_q;
	protected AbstractElementAlias match_FunctionHeader___SectionKeyword_10_0_STRINGTerminalRuleCall_10_1__q;
	protected AbstractElementAlias match_GetElementPtr_InboundsKeyword_1_q;
	protected AbstractElementAlias match_Invoke_CallingConvParserRuleCall_1_q;
	protected AbstractElementAlias match_Invoke_FunctionAttributesParserRuleCall_5_q;
	protected AbstractElementAlias match_Invoke_ReturnAttributesParserRuleCall_2_q;
	protected AbstractElementAlias match_Load_SinglethreadKeyword_1_4_q;
	protected AbstractElementAlias match_Load_VolatileKeyword_0_1_q;
	protected AbstractElementAlias match_Load_VolatileKeyword_1_2_q;
	protected AbstractElementAlias match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q;
	protected AbstractElementAlias match_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q;
	protected AbstractElementAlias match_Store_SinglethreadKeyword_1_6_q;
	protected AbstractElementAlias match_Store_VolatileKeyword_0_1_q;
	protected AbstractElementAlias match_Store_VolatileKeyword_1_2_q;
	protected AbstractElementAlias match_Store___CommaKeyword_0_5_0_AlignKeyword_0_5_1_INTTerminalRuleCall_0_5_2__q;
	protected AbstractElementAlias match_ValuePair_PercentSignKeyword_0_q;
	protected AbstractElementAlias match_ValuePair_PercentSignKeyword_3_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LLVMGrammarAccess) access;
		match_AbstractElement_SL_COMMENTTerminalRuleCall_0_2_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_2());
		match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1());
		match_Alloc___CommaKeyword_3_0_AlignmentParserRuleCall_3_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAllocAccess().getCommaKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getAllocAccess().getAlignmentParserRuleCall_3_1()));
		match_Arithmetic_Compare_Logical___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2___or_____ArithmeticOPParserRuleCall_0_TypeParserRuleCall_1___or___LogicalOPParserRuleCall_0_TypeParserRuleCall_1____ = new AlternativeAlias(false, false, new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getArithmeticAccess().getArithmeticOPParserRuleCall_0()), new TokenAlias(false, false, grammarAccess.getArithmeticAccess().getTypeParserRuleCall_1())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLogicalAccess().getLogicalOPParserRuleCall_0()), new TokenAlias(false, false, grammarAccess.getLogicalAccess().getTypeParserRuleCall_1()))), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompareAccess().getFcmpKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getFPredicatesParserRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getTypeParserRuleCall_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompareAccess().getIcmpKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getIPredicatesParserRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getTypeParserRuleCall_0_2())));
		match_AtomicRMW_SinglethreadKeyword_6_q = new TokenAlias(false, true, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_6());
		match_AtomicRMW_VolatileKeyword_1_q = new TokenAlias(false, true, grammarAccess.getAtomicRMWAccess().getVolatileKeyword_1());
		match_Call_CallingConvParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getCallingConvParserRuleCall_2());
		match_Call_FunctionAttributesParserRuleCall_6_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getFunctionAttributesParserRuleCall_6());
		match_Call_ReturnAttributesParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getReturnAttributesParserRuleCall_3());
		match_Call_TailKeyword_0_q = new TokenAlias(false, true, grammarAccess.getCallAccess().getTailKeyword_0());
		match_CmpXchg_SinglethreadKeyword_7_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_7());
		match_CmpXchg_VolatileKeyword_1_q = new TokenAlias(false, true, grammarAccess.getCmpXchgAccess().getVolatileKeyword_1());
		match_Compare___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompareAccess().getFcmpKeyword_1_0()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getFPredicatesParserRuleCall_1_1()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getTypeParserRuleCall_1_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getCompareAccess().getIcmpKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getIPredicatesParserRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getCompareAccess().getTypeParserRuleCall_0_2())));
		match_Fence_SinglethreadKeyword_1_q = new TokenAlias(false, true, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
		match_FunctionHeader_AlignmentParserRuleCall_11_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getAlignmentParserRuleCall_11());
		match_FunctionHeader_CallingConvParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_3());
		match_FunctionHeader_DeclareKeyword_0_0_or_DefineKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getDeclareKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getDefineKeyword_0_1()));
		match_FunctionHeader_FunctionAttributesParserRuleCall_9_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getFunctionAttributesParserRuleCall_9());
		match_FunctionHeader_LinkageParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getLinkageParserRuleCall_1());
		match_FunctionHeader_ReturnAttributesParserRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getReturnAttributesParserRuleCall_4());
		match_FunctionHeader_VisibilityParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getFunctionHeaderAccess().getVisibilityParserRuleCall_2());
		match_FunctionHeader___SectionKeyword_10_0_STRINGTerminalRuleCall_10_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getSectionKeyword_10_0()), new TokenAlias(false, false, grammarAccess.getFunctionHeaderAccess().getSTRINGTerminalRuleCall_10_1()));
		match_GetElementPtr_InboundsKeyword_1_q = new TokenAlias(false, true, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_1());
		match_Invoke_CallingConvParserRuleCall_1_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1());
		match_Invoke_FunctionAttributesParserRuleCall_5_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getFunctionAttributesParserRuleCall_5());
		match_Invoke_ReturnAttributesParserRuleCall_2_q = new TokenAlias(false, true, grammarAccess.getInvokeAccess().getReturnAttributesParserRuleCall_2());
		match_Load_SinglethreadKeyword_1_4_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_4());
		match_Load_VolatileKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getVolatileKeyword_0_1());
		match_Load_VolatileKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getLoadAccess().getVolatileKeyword_1_2());
		match_Return___CommaKeyword_0_3_0_DbgKeyword_0_3_1_ExclamationMarkKeyword_0_3_2_INTTerminalRuleCall_0_3_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_0_3_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_0_3_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_3_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_3_3()));
		match_Return___CommaKeyword_1_2_0_DbgKeyword_1_2_1_ExclamationMarkKeyword_1_2_2_INTTerminalRuleCall_1_2_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getReturnAccess().getCommaKeyword_1_2_0()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getDbgKeyword_1_2_1()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_2_2()), new TokenAlias(false, false, grammarAccess.getReturnAccess().getINTTerminalRuleCall_1_2_3()));
		match_Store_SinglethreadKeyword_1_6_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
		match_Store_VolatileKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getVolatileKeyword_0_1());
		match_Store_VolatileKeyword_1_2_q = new TokenAlias(false, true, grammarAccess.getStoreAccess().getVolatileKeyword_1_2());
		match_Store___CommaKeyword_0_5_0_AlignKeyword_0_5_1_INTTerminalRuleCall_0_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStoreAccess().getCommaKeyword_0_5_0()), new TokenAlias(false, false, grammarAccess.getStoreAccess().getAlignKeyword_0_5_1()), new TokenAlias(false, false, grammarAccess.getStoreAccess().getINTTerminalRuleCall_0_5_2()));
		match_ValuePair_PercentSignKeyword_0_q = new TokenAlias(false, true, grammarAccess.getValuePairAccess().getPercentSignKeyword_0());
		match_ValuePair_PercentSignKeyword_3_q = new TokenAlias(false, true, grammarAccess.getValuePairAccess().getPercentSignKeyword_3());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getAlignmentRule())
			return getAlignmentToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getArithmeticOPRule())
			return getArithmeticOPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getBinOpRule())
			return getBinOpToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCallingConvRule())
			return getCallingConvToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCastTypeRule())
			return getCastTypeToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFPredicatesRule())
			return getFPredicatesToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFunctionAttributesRule())
			return getFunctionAttributesToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getIPredicatesRule())
			return getIPredicatesToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLinkageRule())
			return getLinkageToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLogicalOPRule())
			return getLogicalOPToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getReturnAttributesRule())
			return getReturnAttributesToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSL_COMMENTRule())
			return getSL_COMMENTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getSTRINGRule())
			return getSTRINGToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTopLevelEntityRule())
			return getTopLevelEntityToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getTypeRule())
			return getTypeToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getVisibilityRule())
			return getVisibilityToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Alignment:
	 * 	'align' INT ;
	 */
	protected String getAlignmentToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "align";
	}
	
	/**
	 * ArithmeticOP:
	 * 	'add' | 'fadd' | 'sub' | 'fsub' | 'mul' | 'fmul' | 'udiv' | 'sdiv' | 'fdiv' | 'urem' | 'srem' | 'frem';
	 */
	protected String getArithmeticOPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "add";
	}
	
	/**
	 * BinOp:
	 * 	'xchg' | 'add' | 'sub' | 'and' | 'nand' | 'or' | 'xor' | 'max' | 'min' | 'umax' | 'umin';
	 */
	protected String getBinOpToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "xchg";
	}
	
	/**
	 * CallingConv:
	 * 	'ccc' | 'fastcc' | 'coldcc' | 'x86_stdcallcc' | 'x86_fastcallcc' | 'x86_thiscallcc' | 'arm_apcscc' |
	 * 	'arm_aapcscc' | 'arm_aapcs_vfpcc' | 'msp430_intrcc' | 'ptx_kernel' | 'ptx_device' | 'spir_func' | 'spir_kernel' |
	 * 	'cc <' INT '>' | INT;
	 */
	protected String getCallingConvToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ccc";
	}
	
	/**
	 * CastType:
	 * 	'trunc' | 'zext' | 'sext' | 'fptrunc' | 'fpext' | 'fptoui' | 'fptosi' | 'uitofp' | 'sitofp' | 'ptrtoint' | 'inttoptr'
	 * 	| 'bitcast';
	 */
	protected String getCastTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "trunc";
	}
	
	/**
	 * FPredicates:
	 * 	'false' | 'oeq' | 'ogt' | 'oge' | 'olt' | 'ole' | 'one' | 'ord' |
	 * 	'ueq' | 'ugt' | 'uge' | 'ult' | 'ule' | 'une' | 'uno' | 'true';
	 */
	protected String getFPredicatesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "false";
	}
	
	/**
	 * FunctionAttributes:
	 * 	'address_safety' | 'alignstack(<n>)' | 'alwaysinline' | 'nonlazybind' | 'inlinehint' | 'naked' | 'noimplicitfloat' |
	 * 	'noinline' |
	 * 	'noredzone' | 'noreturn' | 'nounwind' | 'optsize' | 'readnone' | 'readonly' | 'returns_twice' | 'ssp' | 'sspreq' |
	 * 	'uwtable';
	 */
	protected String getFunctionAttributesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "address_safety";
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
	 * IPredicates:
	 * 	'eq' | 'ne' | 'ugt' | 'uge' | 'ult' | 'ule' | 'sgt' | 'sge' | 'slt' | 'sle';
	 */
	protected String getIPredicatesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "eq";
	}
	
	/**
	 * Linkage:
	 * 	'private' | 'linker_private' | 'linker_private_weak' | 'available_externally' | 'linkonce' | 'common' |
	 * 	'appending' | 'extern_weak' | 'linkonce_odr' | 'linkonce_odr_auto_hide' | 'dllimport' | 'dllexport' | AliasLinkage;
	 */
	protected String getLinkageToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "private";
	}
	
	/**
	 * LogicalOP:
	 * 	'shl' | 'lshr' | 'ashr' | 'and' | 'or' | 'xor';
	 */
	protected String getLogicalOPToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "shl";
	}
	
	/**
	 * ReturnAttributes:
	 * 	'zeroext' | 'signext' | 'inreg' | 'byval' | 'sret' | 'noalias' | 'nocapture' | 'nest';
	 */
	protected String getReturnAttributesToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
	 * TopLevelEntity:
	 * 	'module' 'asm' STRING |
	 * 	'target' 'triple' '=' STRING |
	 * 	'target' 'datalayout' '=' STRING |
	 * 	'deplibs' '=' '[' ']' |
	 * 	'deplibs' '=' '[' STRING (',' STRING)* ']';
	 */
	protected String getTopLevelEntityToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "moduleasm\"\"";
	}
	
	/**
	 * Type:
	 * 	BasicType | StructType | Pointer | VAR_TYPE;
	 */
	protected String getTypeToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "int";
	}
	
	/**
	 * Visibility:
	 * 	'default' | 'hidden' | 'protected';
	 */
	protected String getVisibilityToken(EObject semanticObject, RuleCall ruleCall, INode node) {
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
			if(match_AbstractElement_SL_COMMENTTerminalRuleCall_0_2_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_0_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Alloc___CommaKeyword_3_0_AlignmentParserRuleCall_3_1__q.equals(syntax))
				emit_Alloc___CommaKeyword_3_0_AlignmentParserRuleCall_3_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Arithmetic_Compare_Logical___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2___or_____ArithmeticOPParserRuleCall_0_TypeParserRuleCall_1___or___LogicalOPParserRuleCall_0_TypeParserRuleCall_1____.equals(syntax))
				emit_Arithmetic_Compare_Logical___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2___or_____ArithmeticOPParserRuleCall_0_TypeParserRuleCall_1___or___LogicalOPParserRuleCall_0_TypeParserRuleCall_1____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRMW_SinglethreadKeyword_6_q.equals(syntax))
				emit_AtomicRMW_SinglethreadKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AtomicRMW_VolatileKeyword_1_q.equals(syntax))
				emit_AtomicRMW_VolatileKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_CallingConvParserRuleCall_2_q.equals(syntax))
				emit_Call_CallingConvParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_FunctionAttributesParserRuleCall_6_q.equals(syntax))
				emit_Call_FunctionAttributesParserRuleCall_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_ReturnAttributesParserRuleCall_3_q.equals(syntax))
				emit_Call_ReturnAttributesParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Call_TailKeyword_0_q.equals(syntax))
				emit_Call_TailKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_SinglethreadKeyword_7_q.equals(syntax))
				emit_CmpXchg_SinglethreadKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_CmpXchg_VolatileKeyword_1_q.equals(syntax))
				emit_CmpXchg_VolatileKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Compare___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2__.equals(syntax))
				emit_Compare___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2__(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Fence_SinglethreadKeyword_1_q.equals(syntax))
				emit_Fence_SinglethreadKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_AlignmentParserRuleCall_11_q.equals(syntax))
				emit_FunctionHeader_AlignmentParserRuleCall_11_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_CallingConvParserRuleCall_3_q.equals(syntax))
				emit_FunctionHeader_CallingConvParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_DeclareKeyword_0_0_or_DefineKeyword_0_1.equals(syntax))
				emit_FunctionHeader_DeclareKeyword_0_0_or_DefineKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_FunctionAttributesParserRuleCall_9_q.equals(syntax))
				emit_FunctionHeader_FunctionAttributesParserRuleCall_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_LinkageParserRuleCall_1_q.equals(syntax))
				emit_FunctionHeader_LinkageParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_ReturnAttributesParserRuleCall_4_q.equals(syntax))
				emit_FunctionHeader_ReturnAttributesParserRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader_VisibilityParserRuleCall_2_q.equals(syntax))
				emit_FunctionHeader_VisibilityParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_FunctionHeader___SectionKeyword_10_0_STRINGTerminalRuleCall_10_1__q.equals(syntax))
				emit_FunctionHeader___SectionKeyword_10_0_STRINGTerminalRuleCall_10_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_GetElementPtr_InboundsKeyword_1_q.equals(syntax))
				emit_GetElementPtr_InboundsKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_CallingConvParserRuleCall_1_q.equals(syntax))
				emit_Invoke_CallingConvParserRuleCall_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_FunctionAttributesParserRuleCall_5_q.equals(syntax))
				emit_Invoke_FunctionAttributesParserRuleCall_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Invoke_ReturnAttributesParserRuleCall_2_q.equals(syntax))
				emit_Invoke_ReturnAttributesParserRuleCall_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
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
			else if(match_ValuePair_PercentSignKeyword_0_q.equals(syntax))
				emit_ValuePair_PercentSignKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ValuePair_PercentSignKeyword_3_q.equals(syntax))
				emit_ValuePair_PercentSignKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     SL_COMMENT?
	 */
	protected void emit_AbstractElement_SL_COMMENTTerminalRuleCall_0_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     (',' Alignment)?
	 */
	protected void emit_Alloc___CommaKeyword_3_0_AlignmentParserRuleCall_3_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('icmp' IPredicates Type) | ('fcmp' FPredicates Type) | ((LogicalOP Type) | (ArithmeticOP Type))
	 */
	protected void emit_Arithmetic_Compare_Logical___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2___or_____ArithmeticOPParserRuleCall_0_TypeParserRuleCall_1___or___LogicalOPParserRuleCall_0_TypeParserRuleCall_1____(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     FunctionAttributes?
	 */
	protected void emit_Call_FunctionAttributesParserRuleCall_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ReturnAttributes?
	 */
	protected void emit_Call_ReturnAttributesParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     ('icmp' IPredicates Type) | ('fcmp' FPredicates Type)
	 */
	protected void emit_Compare___FcmpKeyword_1_0_FPredicatesParserRuleCall_1_1_TypeParserRuleCall_1_2___or___IcmpKeyword_0_0_IPredicatesParserRuleCall_0_1_TypeParserRuleCall_0_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     Alignment?
	 */
	protected void emit_FunctionHeader_AlignmentParserRuleCall_11_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     CallingConv?
	 */
	protected void emit_FunctionHeader_CallingConvParserRuleCall_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'define' | 'declare'
	 */
	protected void emit_FunctionHeader_DeclareKeyword_0_0_or_DefineKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     FunctionAttributes?
	 */
	protected void emit_FunctionHeader_FunctionAttributesParserRuleCall_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Linkage?
	 */
	protected void emit_FunctionHeader_LinkageParserRuleCall_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ReturnAttributes?
	 */
	protected void emit_FunctionHeader_ReturnAttributesParserRuleCall_4_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     Visibility?
	 */
	protected void emit_FunctionHeader_VisibilityParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('section ' STRING)?
	 */
	protected void emit_FunctionHeader___SectionKeyword_10_0_STRINGTerminalRuleCall_10_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     FunctionAttributes?
	 */
	protected void emit_Invoke_FunctionAttributesParserRuleCall_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ReturnAttributes?
	 */
	protected void emit_Invoke_ReturnAttributesParserRuleCall_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     '%'?
	 */
	protected void emit_ValuePair_PercentSignKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '%'?
	 */
	protected void emit_ValuePair_PercentSignKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
