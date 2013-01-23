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
	protected AbstractElementAlias match_AliasDefinition_ALIAS_LINKAGEParserRuleCall_3_q;
	protected AbstractElementAlias match_AliasDefinition_VISIBILITYParserRuleCall_4_q;
	protected AbstractElementAlias match_Array_Vector___ARRAYLTerminalRuleCall_0_INTTerminalRuleCall_1_XKeyword_2___or___LessThanSignKeyword_0_INTTerminalRuleCall_1_XKeyword_2__;
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
	protected AbstractElementAlias match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_2_a;
	protected AbstractElementAlias match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_4_3_a;
	protected AbstractElementAlias match_Structure_POINTERTerminalRuleCall_4_q;
	protected AbstractElementAlias match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1;
	protected AbstractElementAlias match_TypeDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a;
	protected AbstractElementAlias match_TypeList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0___RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0____;
	protected AbstractElementAlias match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_q;
	protected AbstractElementAlias match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3_q;
	protected AbstractElementAlias match_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LLVMGrammarAccess) access;
		match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1());
		match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q = new TokenAlias(false, true, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1());
		match_AliasDefinition_ALIAS_LINKAGEParserRuleCall_3_q = new TokenAlias(false, true, grammarAccess.getAliasDefinitionAccess().getALIAS_LINKAGEParserRuleCall_3());
		match_AliasDefinition_VISIBILITYParserRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getAliasDefinitionAccess().getVISIBILITYParserRuleCall_4());
		match_Array_Vector___ARRAYLTerminalRuleCall_0_INTTerminalRuleCall_1_XKeyword_2___or___LessThanSignKeyword_0_INTTerminalRuleCall_1_XKeyword_2__ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getArrayAccess().getARRAYLTerminalRuleCall_0()), new TokenAlias(false, false, grammarAccess.getArrayAccess().getINTTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getArrayAccess().getXKeyword_2())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getVectorAccess().getLessThanSignKeyword_0()), new TokenAlias(false, false, grammarAccess.getVectorAccess().getINTTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getVectorAccess().getXKeyword_2())));
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
		match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_2_a = new TokenAlias(true, true, grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_2_2());
		match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_4_3_a = new TokenAlias(true, true, grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_2_4_3());
		match_Structure_POINTERTerminalRuleCall_4_q = new TokenAlias(false, true, grammarAccess.getStructureAccess().getPOINTERTerminalRuleCall_4());
		match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1()));
		match_TypeDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a = new AlternativeAlias(true, true, new TokenAlias(false, false, grammarAccess.getTypeDefinitionAccess().getConstantKeyword_2_3()), new TokenAlias(false, false, grammarAccess.getTypeDefinitionAccess().getGlobalKeyword_2_1()), new TokenAlias(false, false, grammarAccess.getTypeDefinitionAccess().getLINKAGEParserRuleCall_2_0()), new TokenAlias(false, false, grammarAccess.getTypeDefinitionAccess().getUnnamed_addrKeyword_2_2()));
		match_TypeList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0___RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0____ = new AlternativeAlias(false, false, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeListAccess().getLeftParenthesisKeyword_1_1_0()), new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskKeyword_1_1_2_2()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskKeyword_1_1_2_1()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisKeyword_1_1_2_0()))), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getLeftParenthesisRightParenthesisKeyword_1_0()));
		match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_q = new TokenAlias(false, true, grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_2());
		match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3_q = new TokenAlias(false, true, grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3());
		match_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskKeyword_1_1_2_2()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskKeyword_1_1_2_1()), new TokenAlias(false, false, grammarAccess.getTypeListAccess().getRightParenthesisKeyword_1_1_2_0()));
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
		else if(ruleCall.getRule() == grammarAccess.getCallingConvRule())
			return getCallingConvToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getFUNCTION_ATTRIBUTESRule())
			return getFUNCTION_ATTRIBUTESToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getINTRule())
			return getINTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getLINKAGERule())
			return getLINKAGEToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getORESTRule())
			return getORESTToken(semanticObject, ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getOpaqueRule())
			return getOpaqueToken(semanticObject, ruleCall, node);
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
	 * 	']' POINTER?;
	 */
	protected String getARRAYRToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
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
	 * terminal INT returns ecore::EInt:
	 * 	'-'? ('0'..'9')+;
	 */
	protected String getINTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
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
			if(match_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q.equals(syntax))
				emit_AbstractElement_SL_COMMENTTerminalRuleCall_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AliasDefinition_ALIAS_LINKAGEParserRuleCall_3_q.equals(syntax))
				emit_AliasDefinition_ALIAS_LINKAGEParserRuleCall_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_AliasDefinition_VISIBILITYParserRuleCall_4_q.equals(syntax))
				emit_AliasDefinition_VISIBILITYParserRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Array_Vector___ARRAYLTerminalRuleCall_0_INTTerminalRuleCall_1_XKeyword_2___or___LessThanSignKeyword_0_INTTerminalRuleCall_1_XKeyword_2__.equals(syntax))
				emit_Array_Vector___ARRAYLTerminalRuleCall_0_INTTerminalRuleCall_1_XKeyword_2___or___LessThanSignKeyword_0_INTTerminalRuleCall_1_XKeyword_2__(semanticObject, getLastNavigableState(), syntaxNodes);
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
			else if(match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_2_a.equals(syntax))
				emit_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_2_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_4_3_a.equals(syntax))
				emit_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_4_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Structure_POINTERTerminalRuleCall_4_q.equals(syntax))
				emit_Structure_POINTERTerminalRuleCall_4_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1.equals(syntax))
				emit_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a.equals(syntax))
				emit_TypeDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0___RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0____.equals(syntax))
				emit_TypeList_LeftParenthesisRightParenthesisKeyword_1_0_or___LeftParenthesisKeyword_1_1_0___RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0____(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_q.equals(syntax))
				emit_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3_q.equals(syntax))
				emit_TypeList_RETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0.equals(syntax))
				emit_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0(semanticObject, getLastNavigableState(), syntaxNodes);
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
	 *     (ARRAYL INT 'x') | ('<' INT 'x')
	 */
	protected void emit_Array_Vector___ARRAYLTerminalRuleCall_0_INTTerminalRuleCall_1_XKeyword_2___or___LessThanSignKeyword_0_INTTerminalRuleCall_1_XKeyword_2__(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     RETURN_ATTRIBUTES*
	 */
	protected void emit_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_2_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     RETURN_ATTRIBUTES*
	 */
	protected void emit_ParameterList_RETURN_ATTRIBUTESParserRuleCall_2_4_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
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
	 *     'datalayout' | 'triple'
	 */
	protected void emit_TopLevelEntity_DatalayoutKeyword_1_1_0_or_TripleKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('global' | 'unnamed_addr' | 'constant' | LINKAGE)*
	 */
	protected void emit_TypeDefinition___ConstantKeyword_2_3_or_GlobalKeyword_2_1_or_LINKAGEParserRuleCall_2_0_or_Unnamed_addrKeyword_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     (
	     '()' | 
	     (
	         '(' 
	         (
	             ')*' | 
	             ')' | 
	             ')***' | 
	             ')**' | 
	             ')*****' | 
	             ')****'
	         )
	     )
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
	     ')*' | 
	     ')' | 
	     ')***' | 
	     ')**' | 
	     ')*****' | 
	     ')****'
	 )
	 */
	protected void emit_TypeList_RightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5_or_RightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4_or_RightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3_or_RightParenthesisAsteriskAsteriskKeyword_1_1_2_2_or_RightParenthesisAsteriskKeyword_1_1_2_1_or_RightParenthesisKeyword_1_1_2_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
