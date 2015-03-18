package de.upb.lina.lll.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import de.upb.lina.lll.expressions.And;
import de.upb.lina.lll.expressions.Approx;
import de.upb.lina.lll.expressions.BooleanValue;
import de.upb.lina.lll.expressions.Div;
import de.upb.lina.lll.expressions.Equal;
import de.upb.lina.lll.expressions.Equivalent;
import de.upb.lina.lll.expressions.ExpressionsPackage;
import de.upb.lina.lll.expressions.Greater;
import de.upb.lina.lll.expressions.GreaterOrEqual;
import de.upb.lina.lll.expressions.Imply;
import de.upb.lina.lll.expressions.Less;
import de.upb.lina.lll.expressions.LessOrEqual;
import de.upb.lina.lll.expressions.Minus;
import de.upb.lina.lll.expressions.Mod;
import de.upb.lina.lll.expressions.Multi;
import de.upb.lina.lll.expressions.Not;
import de.upb.lina.lll.expressions.NumberValue;
import de.upb.lina.lll.expressions.Or;
import de.upb.lina.lll.expressions.Plus;
import de.upb.lina.lll.expressions.Pow;
import de.upb.lina.lll.expressions.StringValue;
import de.upb.lina.lll.expressions.Unequal;
import de.upb.lina.lll.expressions.Variable;
import de.upb.lina.lll.expressions.Xor;
import de.upb.lina.lll.services.ExpressionsGrammarAccess;
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
public class ExpressionsSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ExpressionsGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ExpressionsPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ExpressionsPackage.AND:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Conjunction(context, (And) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.APPROX:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Compare(context, (Approx) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.BOOLEAN_VALUE:
				if(context == grammarAccess.getBooleanValueRule() ||
				   context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getSomeValueRule()) {
					sequence_BooleanValue(context, (BooleanValue) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.DIV:
				if(context == grammarAccess.getAExpressionRule() ||
				   context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPowerRule() ||
				   context == grammarAccess.getPowerAccess().getPowLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSomeValueRule()) {
					sequence_Multiplication(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.EQUAL:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Compare(context, (Equal) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.EQUIVALENT:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Equivalent(context, (Equivalent) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.GREATER:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Compare(context, (Greater) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.GREATER_OR_EQUAL:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Compare(context, (GreaterOrEqual) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.IMPLY:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Implication(context, (Imply) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.LESS:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Compare(context, (Less) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.LESS_OR_EQUAL:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Compare(context, (LessOrEqual) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.MINUS:
				if(context == grammarAccess.getAExpressionRule() ||
				   context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPowerRule() ||
				   context == grammarAccess.getPowerAccess().getPowLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSomeValueRule()) {
					sequence_Addition(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.MOD:
				if(context == grammarAccess.getAExpressionRule() ||
				   context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPowerRule() ||
				   context == grammarAccess.getPowerAccess().getPowLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSomeValueRule()) {
					sequence_Multiplication(context, (Mod) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.MULTI:
				if(context == grammarAccess.getAExpressionRule() ||
				   context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPowerRule() ||
				   context == grammarAccess.getPowerAccess().getPowLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSomeValueRule()) {
					sequence_Multiplication(context, (Multi) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.NOT:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegatedRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Negated(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.NUMBER_VALUE:
				if(context == grammarAccess.getAExpressionRule() ||
				   context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNumberValueRule() ||
				   context == grammarAccess.getPowerRule() ||
				   context == grammarAccess.getPowerAccess().getPowLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSomeValueRule()) {
					sequence_NumberValue(context, (NumberValue) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.OR:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Disjunction(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.PLUS:
				if(context == grammarAccess.getAExpressionRule() ||
				   context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPowerRule() ||
				   context == grammarAccess.getPowerAccess().getPowLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSomeValueRule()) {
					sequence_Addition(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.POW:
				if(context == grammarAccess.getAExpressionRule() ||
				   context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPowerRule() ||
				   context == grammarAccess.getPowerAccess().getPowLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSomeValueRule()) {
					sequence_Power(context, (Pow) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.STRING_VALUE:
				if(context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getSomeValueRule() ||
				   context == grammarAccess.getStringValueRule()) {
					sequence_StringValue(context, (StringValue) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.UNEQUAL:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getCompareRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Compare(context, (Unequal) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.VARIABLE:
				if(context == grammarAccess.getAExpressionRule() ||
				   context == grammarAccess.getAdditionRule() ||
				   context == grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0() ||
				   context == grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0() ||
				   context == grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0() ||
				   context == grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0() ||
				   context == grammarAccess.getCompareAccess().getLessLeftAction_1_1_0() ||
				   context == grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getMultiplicationRule() ||
				   context == grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0() ||
				   context == grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0() ||
				   context == grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0() ||
				   context == grammarAccess.getNegationRule() ||
				   context == grammarAccess.getPowerRule() ||
				   context == grammarAccess.getPowerAccess().getPowLeftAction_1_0_0() ||
				   context == grammarAccess.getPrimaryExpressionRule() ||
				   context == grammarAccess.getSomeValueRule() ||
				   context == grammarAccess.getVariableRule()) {
					sequence_Variable(context, (Variable) semanticObject); 
					return; 
				}
				else break;
			case ExpressionsPackage.XOR:
				if(context == grammarAccess.getCExpressionRule() ||
				   context == grammarAccess.getConjunctionRule() ||
				   context == grammarAccess.getConjunctionAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getDisjunctionRule() ||
				   context == grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0() ||
				   context == grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0() ||
				   context == grammarAccess.getEquivalentRule() ||
				   context == grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getImplicationRule() ||
				   context == grammarAccess.getImplicationAccess().getImplyLeftAction_1_0() ||
				   context == grammarAccess.getLExpressionRule() ||
				   context == grammarAccess.getNegationRule()) {
					sequence_Disjunction(context, (Xor) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=Addition_Minus_1_0_1_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MINUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MINUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MINUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MINUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Addition_Plus_1_0_0_0 right=Multiplication)
	 */
	protected void sequence_Addition(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.PLUS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.PLUS__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.PLUS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.PLUS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=BOOLEAN
	 */
	protected void sequence_BooleanValue(EObject context, BooleanValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.BOOLEAN_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.BOOLEAN_VALUE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Compare_Approx_1_6_0 right=SomeValue)
	 */
	protected void sequence_Compare(EObject context, Approx semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.APPROX__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.APPROX__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.APPROX__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.APPROX__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Compare_Equal_1_4_0 right=SomeValue)
	 */
	protected void sequence_Compare(EObject context, Equal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Compare_Greater_1_3_0 right=SomeValue)
	 */
	protected void sequence_Compare(EObject context, Greater semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.GREATER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.GREATER__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.GREATER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.GREATER__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Compare_GreaterOrEqual_1_2_0 right=SomeValue)
	 */
	protected void sequence_Compare(EObject context, GreaterOrEqual semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.GREATER_OR_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.GREATER_OR_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.GREATER_OR_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.GREATER_OR_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Compare_Less_1_1_0 right=SomeValue)
	 */
	protected void sequence_Compare(EObject context, Less semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.LESS__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.LESS__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.LESS__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.LESS__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Compare_LessOrEqual_1_0_0 right=SomeValue)
	 */
	protected void sequence_Compare(EObject context, LessOrEqual semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.LESS_OR_EQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.LESS_OR_EQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.LESS_OR_EQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.LESS_OR_EQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Compare_Unequal_1_5_0 right=SomeValue)
	 */
	protected void sequence_Compare(EObject context, Unequal semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.UNEQUAL__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.UNEQUAL__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.UNEQUAL__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.UNEQUAL__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Conjunction_And_1_0 right=Conjunction)
	 */
	protected void sequence_Conjunction(EObject context, And semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.AND__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.AND__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Disjunction_Or_1_0_0_0 right=Disjunction)
	 */
	protected void sequence_Disjunction(EObject context, Or semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Disjunction_Xor_1_0_1_0 right=Disjunction)
	 */
	protected void sequence_Disjunction(EObject context, Xor semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.XOR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.XOR__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.XOR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.XOR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equivalent_Equivalent_1_0 right=Equivalent)
	 */
	protected void sequence_Equivalent(EObject context, Equivalent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.EQUIVALENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.EQUIVALENT__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.EQUIVALENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.EQUIVALENT__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Implication_Imply_1_0 right=Implication)
	 */
	protected void sequence_Implication(EObject context, Imply semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.IMPLY__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.IMPLY__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.IMPLY__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.IMPLY__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Div_1_0_1_0 right=Power)
	 */
	protected void sequence_Multiplication(EObject context, Div semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.DIV__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.DIV__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.DIV__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.DIV__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Mod_1_0_2_0 right=Power)
	 */
	protected void sequence_Multiplication(EObject context, Mod semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MOD__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MOD__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MOD__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MOD__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Multiplication_Multi_1_0_0_0 right=Power)
	 */
	protected void sequence_Multiplication(EObject context, Multi semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MULTI__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MULTI__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.MULTI__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.MULTI__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     not=CExpression
	 */
	protected void sequence_Negated(EObject context, Not semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.NOT__NOT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.NOT__NOT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0(), semanticObject.getNot());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     numValue=NUMBER
	 */
	protected void sequence_NumberValue(EObject context, NumberValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.NUMBER_VALUE__NUM_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.NUMBER_VALUE__NUM_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0(), semanticObject.getNumValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=Power_Pow_1_0_0 right=PrimaryExpression)
	 */
	protected void sequence_Power(EObject context, Pow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.POW__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.POW__LEFT));
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.POW__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.POW__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     strValue=STRING
	 */
	protected void sequence_StringValue(EObject context, StringValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.STRING_VALUE__STR_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.STRING_VALUE__STR_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0(), semanticObject.getStrValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     varName=VARIABLE_VALUE
	 */
	protected void sequence_Variable(EObject context, Variable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ExpressionsPackage.Literals.VARIABLE__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ExpressionsPackage.Literals.VARIABLE__VAR_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0(), semanticObject.getVarName());
		feeder.finish();
	}
}
