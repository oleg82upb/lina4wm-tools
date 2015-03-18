package de.upb.lina.lll.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import de.upb.lina.lll.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'equiv'", "'imply'", "'or'", "'xor'", "'and'", "'not'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'='", "'!='", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'.'"
    };
    public static final int RULE_BOOLEAN=6;
    public static final int RULE_ID=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=7;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=10;

    // delegates
    // delegators


        public InternalExpressionsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalExpressionsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalExpressionsParser.tokenNames; }
    public String getGrammarFileName() { return "../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g"; }


     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ExpressionsGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:61:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:62:1: ( ruleExpression EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:63:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression67);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression74); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:70:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:74:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:75:1: ( ( rule__Expression__Alternatives ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:76:1: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:77:1: ( rule__Expression__Alternatives )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:77:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression100);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:89:1: entryRuleLExpression : ruleLExpression EOF ;
    public final void entryRuleLExpression() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:90:1: ( ruleLExpression EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:91:1: ruleLExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLExpression_in_entryRuleLExpression127);
            ruleLExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpression134); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLExpression"


    // $ANTLR start "ruleLExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:98:1: ruleLExpression : ( ruleEquivalent ) ;
    public final void ruleLExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:102:2: ( ( ruleEquivalent ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( ruleEquivalent )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:103:1: ( ruleEquivalent )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:104:1: ruleEquivalent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleEquivalent_in_ruleLExpression160);
            ruleEquivalent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLExpression"


    // $ANTLR start "entryRuleEquivalent"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:117:1: entryRuleEquivalent : ruleEquivalent EOF ;
    public final void entryRuleEquivalent() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:118:1: ( ruleEquivalent EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:119:1: ruleEquivalent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentRule()); 
            }
            pushFollow(FOLLOW_ruleEquivalent_in_entryRuleEquivalent186);
            ruleEquivalent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquivalent193); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEquivalent"


    // $ANTLR start "ruleEquivalent"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:126:1: ruleEquivalent : ( ( rule__Equivalent__Group__0 ) ) ;
    public final void ruleEquivalent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:130:2: ( ( ( rule__Equivalent__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( ( rule__Equivalent__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:131:1: ( ( rule__Equivalent__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:132:1: ( rule__Equivalent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:133:1: ( rule__Equivalent__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:133:2: rule__Equivalent__Group__0
            {
            pushFollow(FOLLOW_rule__Equivalent__Group__0_in_ruleEquivalent219);
            rule__Equivalent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEquivalent"


    // $ANTLR start "entryRuleImplication"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:145:1: entryRuleImplication : ruleImplication EOF ;
    public final void entryRuleImplication() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:146:1: ( ruleImplication EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:147:1: ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication246);
            ruleImplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication253); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:154:1: ruleImplication : ( ( rule__Implication__Group__0 ) ) ;
    public final void ruleImplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:158:2: ( ( ( rule__Implication__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( ( rule__Implication__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:159:1: ( ( rule__Implication__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:160:1: ( rule__Implication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:161:1: ( rule__Implication__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:161:2: rule__Implication__Group__0
            {
            pushFollow(FOLLOW_rule__Implication__Group__0_in_ruleImplication279);
            rule__Implication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:173:1: entryRuleDisjunction : ruleDisjunction EOF ;
    public final void entryRuleDisjunction() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:174:1: ( ruleDisjunction EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:175:1: ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction306);
            ruleDisjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction313); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:182:1: ruleDisjunction : ( ( rule__Disjunction__Group__0 ) ) ;
    public final void ruleDisjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:186:2: ( ( ( rule__Disjunction__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( ( rule__Disjunction__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:187:1: ( ( rule__Disjunction__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:188:1: ( rule__Disjunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:189:1: ( rule__Disjunction__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:189:2: rule__Disjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction339);
            rule__Disjunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:201:1: entryRuleConjunction : ruleConjunction EOF ;
    public final void entryRuleConjunction() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:202:1: ( ruleConjunction EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:203:1: ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction366);
            ruleConjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction373); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:210:1: ruleConjunction : ( ( rule__Conjunction__Group__0 ) ) ;
    public final void ruleConjunction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:214:2: ( ( ( rule__Conjunction__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( ( rule__Conjunction__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:215:1: ( ( rule__Conjunction__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:216:1: ( rule__Conjunction__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:217:1: ( rule__Conjunction__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:217:2: rule__Conjunction__Group__0
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction399);
            rule__Conjunction__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:229:1: entryRuleNegation : ruleNegation EOF ;
    public final void entryRuleNegation() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:230:1: ( ruleNegation EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:231:1: ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation426);
            ruleNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation433); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:238:1: ruleNegation : ( ( rule__Negation__Alternatives ) ) ;
    public final void ruleNegation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:242:2: ( ( ( rule__Negation__Alternatives ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( ( rule__Negation__Alternatives ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:243:1: ( ( rule__Negation__Alternatives ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:244:1: ( rule__Negation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getAlternatives()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:245:1: ( rule__Negation__Alternatives )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:245:2: rule__Negation__Alternatives
            {
            pushFollow(FOLLOW_rule__Negation__Alternatives_in_ruleNegation459);
            rule__Negation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleNegated"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:257:1: entryRuleNegated : ruleNegated EOF ;
    public final void entryRuleNegated() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:258:1: ( ruleNegated EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:259:1: ruleNegated EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedRule()); 
            }
            pushFollow(FOLLOW_ruleNegated_in_entryRuleNegated486);
            ruleNegated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegated493); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNegated"


    // $ANTLR start "ruleNegated"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:266:1: ruleNegated : ( ( rule__Negated__Group__0 ) ) ;
    public final void ruleNegated() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:270:2: ( ( ( rule__Negated__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( ( rule__Negated__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:271:1: ( ( rule__Negated__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:272:1: ( rule__Negated__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:273:1: ( rule__Negated__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:273:2: rule__Negated__Group__0
            {
            pushFollow(FOLLOW_rule__Negated__Group__0_in_ruleNegated519);
            rule__Negated__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNegated"


    // $ANTLR start "entryRuleCExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:285:1: entryRuleCExpression : ruleCExpression EOF ;
    public final void entryRuleCExpression() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:286:1: ( ruleCExpression EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:287:1: ruleCExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCExpression_in_entryRuleCExpression546);
            ruleCExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCExpression553); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCExpression"


    // $ANTLR start "ruleCExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:294:1: ruleCExpression : ( ( rule__CExpression__Alternatives ) ) ;
    public final void ruleCExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:298:2: ( ( ( rule__CExpression__Alternatives ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( ( rule__CExpression__Alternatives ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:299:1: ( ( rule__CExpression__Alternatives ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:300:1: ( rule__CExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getAlternatives()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:301:1: ( rule__CExpression__Alternatives )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:301:2: rule__CExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__CExpression__Alternatives_in_ruleCExpression579);
            rule__CExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCExpression"


    // $ANTLR start "entryRuleCompare"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:313:1: entryRuleCompare : ruleCompare EOF ;
    public final void entryRuleCompare() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:314:1: ( ruleCompare EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:315:1: ruleCompare EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareRule()); 
            }
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare606);
            ruleCompare();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare613); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:322:1: ruleCompare : ( ( rule__Compare__Group__0 ) ) ;
    public final void ruleCompare() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:326:2: ( ( ( rule__Compare__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( ( rule__Compare__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:327:1: ( ( rule__Compare__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:328:1: ( rule__Compare__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:329:1: ( rule__Compare__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:329:2: rule__Compare__Group__0
            {
            pushFollow(FOLLOW_rule__Compare__Group__0_in_ruleCompare639);
            rule__Compare__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleSomeValue"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:341:1: entryRuleSomeValue : ruleSomeValue EOF ;
    public final void entryRuleSomeValue() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:342:1: ( ruleSomeValue EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:343:1: ruleSomeValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSomeValueRule()); 
            }
            pushFollow(FOLLOW_ruleSomeValue_in_entryRuleSomeValue666);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSomeValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeValue673); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSomeValue"


    // $ANTLR start "ruleSomeValue"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:350:1: ruleSomeValue : ( ( rule__SomeValue__Alternatives ) ) ;
    public final void ruleSomeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:354:2: ( ( ( rule__SomeValue__Alternatives ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( ( rule__SomeValue__Alternatives ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:355:1: ( ( rule__SomeValue__Alternatives ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:356:1: ( rule__SomeValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSomeValueAccess().getAlternatives()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:357:1: ( rule__SomeValue__Alternatives )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:357:2: rule__SomeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__SomeValue__Alternatives_in_ruleSomeValue699);
            rule__SomeValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSomeValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSomeValue"


    // $ANTLR start "entryRuleAExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:369:1: entryRuleAExpression : ruleAExpression EOF ;
    public final void entryRuleAExpression() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:370:1: ( ruleAExpression EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:371:1: ruleAExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAExpression_in_entryRuleAExpression726);
            ruleAExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAExpression733); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAExpression"


    // $ANTLR start "ruleAExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:378:1: ruleAExpression : ( ruleAddition ) ;
    public final void ruleAExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:382:2: ( ( ruleAddition ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( ruleAddition )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:383:1: ( ruleAddition )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:384:1: ruleAddition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleAExpression759);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAExpression"


    // $ANTLR start "entryRuleAddition"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:397:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:398:1: ( ruleAddition EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:399:1: ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition785);
            ruleAddition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition792); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:406:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:410:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:411:1: ( ( rule__Addition__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:412:1: ( rule__Addition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:413:1: ( rule__Addition__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:413:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition818);
            rule__Addition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:425:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:426:1: ( ruleMultiplication EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:427:1: ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication845);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication852); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:434:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:438:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:439:1: ( ( rule__Multiplication__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:440:1: ( rule__Multiplication__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:441:1: ( rule__Multiplication__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:441:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication878);
            rule__Multiplication__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePower"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:453:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:454:1: ( rulePower EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:455:1: rulePower EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerRule()); 
            }
            pushFollow(FOLLOW_rulePower_in_entryRulePower905);
            rulePower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePower912); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:462:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:466:2: ( ( ( rule__Power__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: ( ( rule__Power__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:467:1: ( ( rule__Power__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:468:1: ( rule__Power__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:469:1: ( rule__Power__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:469:2: rule__Power__Group__0
            {
            pushFollow(FOLLOW_rule__Power__Group__0_in_rulePower938);
            rule__Power__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:481:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:482:1: ( rulePrimaryExpression EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:483:1: rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression965);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression972); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:490:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:494:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:495:1: ( ( rule__PrimaryExpression__Alternatives ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:496:1: ( rule__PrimaryExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:497:1: ( rule__PrimaryExpression__Alternatives )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:497:2: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression998);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNumberValue"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:509:1: entryRuleNumberValue : ruleNumberValue EOF ;
    public final void entryRuleNumberValue() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:510:1: ( ruleNumberValue EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:511:1: ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue1025);
            ruleNumberValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue1032); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:518:1: ruleNumberValue : ( ( rule__NumberValue__NumValueAssignment ) ) ;
    public final void ruleNumberValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:522:2: ( ( ( rule__NumberValue__NumValueAssignment ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( rule__NumberValue__NumValueAssignment ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:523:1: ( ( rule__NumberValue__NumValueAssignment ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:524:1: ( rule__NumberValue__NumValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getNumValueAssignment()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:525:1: ( rule__NumberValue__NumValueAssignment )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:525:2: rule__NumberValue__NumValueAssignment
            {
            pushFollow(FOLLOW_rule__NumberValue__NumValueAssignment_in_ruleNumberValue1058);
            rule__NumberValue__NumValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getNumValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleNUMBER"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:537:1: entryRuleNUMBER : ruleNUMBER EOF ;
    public final void entryRuleNUMBER() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:538:1: ( ruleNUMBER EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:539:1: ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER1085);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER1092); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:546:1: ruleNUMBER : ( ( rule__NUMBER__Group__0 ) ) ;
    public final void ruleNUMBER() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:550:2: ( ( ( rule__NUMBER__Group__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:551:1: ( ( rule__NUMBER__Group__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:551:1: ( ( rule__NUMBER__Group__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:552:1: ( rule__NUMBER__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:553:1: ( rule__NUMBER__Group__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:553:2: rule__NUMBER__Group__0
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__0_in_ruleNUMBER1118);
            rule__NUMBER__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleBooleanValue"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:565:1: entryRuleBooleanValue : ruleBooleanValue EOF ;
    public final void entryRuleBooleanValue() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:566:1: ( ruleBooleanValue EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:567:1: ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1145);
            ruleBooleanValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue1152); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:574:1: ruleBooleanValue : ( ( rule__BooleanValue__ValueAssignment ) ) ;
    public final void ruleBooleanValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:578:2: ( ( ( rule__BooleanValue__ValueAssignment ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:579:1: ( ( rule__BooleanValue__ValueAssignment ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:579:1: ( ( rule__BooleanValue__ValueAssignment ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:580:1: ( rule__BooleanValue__ValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:581:1: ( rule__BooleanValue__ValueAssignment )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:581:2: rule__BooleanValue__ValueAssignment
            {
            pushFollow(FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1178);
            rule__BooleanValue__ValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleStringValue"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:593:1: entryRuleStringValue : ruleStringValue EOF ;
    public final void entryRuleStringValue() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:594:1: ( ruleStringValue EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:595:1: ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue1205);
            ruleStringValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue1212); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:602:1: ruleStringValue : ( ( rule__StringValue__StrValueAssignment ) ) ;
    public final void ruleStringValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:606:2: ( ( ( rule__StringValue__StrValueAssignment ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:607:1: ( ( rule__StringValue__StrValueAssignment ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:607:1: ( ( rule__StringValue__StrValueAssignment ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:608:1: ( rule__StringValue__StrValueAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getStrValueAssignment()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:609:1: ( rule__StringValue__StrValueAssignment )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:609:2: rule__StringValue__StrValueAssignment
            {
            pushFollow(FOLLOW_rule__StringValue__StrValueAssignment_in_ruleStringValue1238);
            rule__StringValue__StrValueAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getStrValueAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleVariable"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:621:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:622:1: ( ruleVariable EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:623:1: ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable1265);
            ruleVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable1272); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:630:1: ruleVariable : ( ( rule__Variable__VarNameAssignment ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:634:2: ( ( ( rule__Variable__VarNameAssignment ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:635:1: ( ( rule__Variable__VarNameAssignment ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:635:1: ( ( rule__Variable__VarNameAssignment ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:636:1: ( rule__Variable__VarNameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarNameAssignment()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:637:1: ( rule__Variable__VarNameAssignment )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:637:2: rule__Variable__VarNameAssignment
            {
            pushFollow(FOLLOW_rule__Variable__VarNameAssignment_in_ruleVariable1298);
            rule__Variable__VarNameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVarNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVARIABLE_VALUE"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:649:1: entryRuleVARIABLE_VALUE : ruleVARIABLE_VALUE EOF ;
    public final void entryRuleVARIABLE_VALUE() throws RecognitionException {
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:650:1: ( ruleVARIABLE_VALUE EOF )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:651:1: ruleVARIABLE_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUERule()); 
            }
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE1325);
            ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUERule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_VALUE1332); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVARIABLE_VALUE"


    // $ANTLR start "ruleVARIABLE_VALUE"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:658:1: ruleVARIABLE_VALUE : ( ( rule__VARIABLE_VALUE__Alternatives ) ) ;
    public final void ruleVARIABLE_VALUE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:662:2: ( ( ( rule__VARIABLE_VALUE__Alternatives ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:663:1: ( ( rule__VARIABLE_VALUE__Alternatives ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:663:1: ( ( rule__VARIABLE_VALUE__Alternatives ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:664:1: ( rule__VARIABLE_VALUE__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getAlternatives()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:665:1: ( rule__VARIABLE_VALUE__Alternatives )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:665:2: rule__VARIABLE_VALUE__Alternatives
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Alternatives_in_ruleVARIABLE_VALUE1358);
            rule__VARIABLE_VALUE__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVARIABLE_VALUE"


    // $ANTLR start "rule__Expression__Alternatives"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:677:1: rule__Expression__Alternatives : ( ( ruleLExpression ) | ( ruleAExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:681:1: ( ( ruleLExpression ) | ( ruleAExpression ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_BOOLEAN:
            case RULE_STRING:
            case 17:
                {
                alt1=1;
                }
                break;
            case 18:
                {
                int LA1_2 = input.LA(2);

                if ( (synpred1_InternalExpressions()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA1_5 = input.LA(2);

                if ( (synpred1_InternalExpressions()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 5, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA1_6 = input.LA(2);

                if ( (synpred1_InternalExpressions()) ) {
                    alt1=1;
                }
                else if ( (true) ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:682:1: ( ruleLExpression )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:682:1: ( ruleLExpression )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:683:1: ruleLExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getLExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleLExpression_in_rule__Expression__Alternatives1394);
                    ruleLExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getLExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:688:6: ( ruleAExpression )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:688:6: ( ruleAExpression )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:689:1: ruleAExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getAExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleAExpression_in_rule__Expression__Alternatives1411);
                    ruleAExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getAExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Disjunction__Alternatives_1_0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:699:1: rule__Disjunction__Alternatives_1_0 : ( ( ( rule__Disjunction__Group_1_0_0__0 ) ) | ( ( rule__Disjunction__Group_1_0_1__0 ) ) );
    public final void rule__Disjunction__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:703:1: ( ( ( rule__Disjunction__Group_1_0_0__0 ) ) | ( ( rule__Disjunction__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:704:1: ( ( rule__Disjunction__Group_1_0_0__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:704:1: ( ( rule__Disjunction__Group_1_0_0__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:705:1: ( rule__Disjunction__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDisjunctionAccess().getGroup_1_0_0()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:706:1: ( rule__Disjunction__Group_1_0_0__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:706:2: rule__Disjunction__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__0_in_rule__Disjunction__Alternatives_1_01443);
                    rule__Disjunction__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDisjunctionAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:710:6: ( ( rule__Disjunction__Group_1_0_1__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:710:6: ( ( rule__Disjunction__Group_1_0_1__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:711:1: ( rule__Disjunction__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDisjunctionAccess().getGroup_1_0_1()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:712:1: ( rule__Disjunction__Group_1_0_1__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:712:2: rule__Disjunction__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__0_in_rule__Disjunction__Alternatives_1_01461);
                    rule__Disjunction__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDisjunctionAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Alternatives_1_0"


    // $ANTLR start "rule__Negation__Alternatives"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:721:1: rule__Negation__Alternatives : ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleCExpression ) );
    public final void rule__Negation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:725:1: ( ( ( rule__Negation__Group_0__0 ) ) | ( ruleCExpression ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_STRING)||LA3_0==18) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:726:1: ( ( rule__Negation__Group_0__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:726:1: ( ( rule__Negation__Group_0__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:727:1: ( rule__Negation__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegationAccess().getGroup_0()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:728:1: ( rule__Negation__Group_0__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:728:2: rule__Negation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Negation__Group_0__0_in_rule__Negation__Alternatives1494);
                    rule__Negation__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegationAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:732:6: ( ruleCExpression )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:732:6: ( ruleCExpression )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:733:1: ruleCExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCExpression_in_rule__Negation__Alternatives1512);
                    ruleCExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Alternatives"


    // $ANTLR start "rule__CExpression__Alternatives"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:743:1: rule__CExpression__Alternatives : ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) | ( ruleVariable ) );
    public final void rule__CExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:747:1: ( ( ( rule__CExpression__Group_0__0 ) ) | ( ruleCompare ) | ( ruleBooleanValue ) | ( ruleVariable ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA4_1 = input.LA(2);

                if ( (synpred4_InternalExpressions()) ) {
                    alt4=1;
                }
                else if ( (synpred5_InternalExpressions()) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt4=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA4_3 = input.LA(2);

                if ( (synpred5_InternalExpressions()) ) {
                    alt4=2;
                }
                else if ( (synpred6_InternalExpressions()) ) {
                    alt4=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA4_5 = input.LA(2);

                if ( (synpred5_InternalExpressions()) ) {
                    alt4=2;
                }
                else if ( (true) ) {
                    alt4=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( ( rule__CExpression__Group_0__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( ( rule__CExpression__Group_0__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:749:1: ( rule__CExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getGroup_0()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:750:1: ( rule__CExpression__Group_0__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:750:2: rule__CExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__CExpression__Group_0__0_in_rule__CExpression__Alternatives1544);
                    rule__CExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:754:6: ( ruleCompare )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:754:6: ( ruleCompare )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:755:1: ruleCompare
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCompare_in_rule__CExpression__Alternatives1562);
                    ruleCompare();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:760:6: ( ruleBooleanValue )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:760:6: ( ruleBooleanValue )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:761:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__CExpression__Alternatives1579);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:766:6: ( ruleVariable )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:766:6: ( ruleVariable )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:767:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleVariable_in_rule__CExpression__Alternatives1596);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Alternatives"


    // $ANTLR start "rule__Compare__Alternatives_1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:777:1: rule__Compare__Alternatives_1 : ( ( ( rule__Compare__Group_1_0__0 ) ) | ( ( rule__Compare__Group_1_1__0 ) ) | ( ( rule__Compare__Group_1_2__0 ) ) | ( ( rule__Compare__Group_1_3__0 ) ) | ( ( rule__Compare__Group_1_4__0 ) ) | ( ( rule__Compare__Group_1_5__0 ) ) | ( ( rule__Compare__Group_1_6__0 ) ) );
    public final void rule__Compare__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:781:1: ( ( ( rule__Compare__Group_1_0__0 ) ) | ( ( rule__Compare__Group_1_1__0 ) ) | ( ( rule__Compare__Group_1_2__0 ) ) | ( ( rule__Compare__Group_1_3__0 ) ) | ( ( rule__Compare__Group_1_4__0 ) ) | ( ( rule__Compare__Group_1_5__0 ) ) | ( ( rule__Compare__Group_1_6__0 ) ) )
            int alt5=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            case 23:
                {
                alt5=4;
                }
                break;
            case 24:
                {
                alt5=5;
                }
                break;
            case 25:
                {
                alt5=6;
                }
                break;
            case 26:
                {
                alt5=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:782:1: ( ( rule__Compare__Group_1_0__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:782:1: ( ( rule__Compare__Group_1_0__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:783:1: ( rule__Compare__Group_1_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_0()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:784:1: ( rule__Compare__Group_1_0__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:784:2: rule__Compare__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_0__0_in_rule__Compare__Alternatives_11628);
                    rule__Compare__Group_1_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:788:6: ( ( rule__Compare__Group_1_1__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:788:6: ( ( rule__Compare__Group_1_1__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:789:1: ( rule__Compare__Group_1_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_1()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:790:1: ( rule__Compare__Group_1_1__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:790:2: rule__Compare__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_1__0_in_rule__Compare__Alternatives_11646);
                    rule__Compare__Group_1_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:794:6: ( ( rule__Compare__Group_1_2__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:794:6: ( ( rule__Compare__Group_1_2__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:795:1: ( rule__Compare__Group_1_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_2()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:796:1: ( rule__Compare__Group_1_2__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:796:2: rule__Compare__Group_1_2__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_2__0_in_rule__Compare__Alternatives_11664);
                    rule__Compare__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:800:6: ( ( rule__Compare__Group_1_3__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:800:6: ( ( rule__Compare__Group_1_3__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:801:1: ( rule__Compare__Group_1_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_3()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:802:1: ( rule__Compare__Group_1_3__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:802:2: rule__Compare__Group_1_3__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_3__0_in_rule__Compare__Alternatives_11682);
                    rule__Compare__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:806:6: ( ( rule__Compare__Group_1_4__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:806:6: ( ( rule__Compare__Group_1_4__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:807:1: ( rule__Compare__Group_1_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_4()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:808:1: ( rule__Compare__Group_1_4__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:808:2: rule__Compare__Group_1_4__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_4__0_in_rule__Compare__Alternatives_11700);
                    rule__Compare__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:812:6: ( ( rule__Compare__Group_1_5__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:812:6: ( ( rule__Compare__Group_1_5__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:813:1: ( rule__Compare__Group_1_5__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_5()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:814:1: ( rule__Compare__Group_1_5__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:814:2: rule__Compare__Group_1_5__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_5__0_in_rule__Compare__Alternatives_11718);
                    rule__Compare__Group_1_5__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:818:6: ( ( rule__Compare__Group_1_6__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:818:6: ( ( rule__Compare__Group_1_6__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:819:1: ( rule__Compare__Group_1_6__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCompareAccess().getGroup_1_6()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:820:1: ( rule__Compare__Group_1_6__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:820:2: rule__Compare__Group_1_6__0
                    {
                    pushFollow(FOLLOW_rule__Compare__Group_1_6__0_in_rule__Compare__Alternatives_11736);
                    rule__Compare__Group_1_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCompareAccess().getGroup_1_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Alternatives_1"


    // $ANTLR start "rule__SomeValue__Alternatives"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:829:1: rule__SomeValue__Alternatives : ( ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleAExpression ) );
    public final void rule__SomeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:833:1: ( ( ruleStringValue ) | ( ruleBooleanValue ) | ( ruleAExpression ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt6=2;
                }
                break;
            case RULE_ID:
            case RULE_INT:
            case 18:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:834:1: ( ruleStringValue )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:834:1: ( ruleStringValue )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:835:1: ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_rule__SomeValue__Alternatives1769);
                    ruleStringValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:840:6: ( ruleBooleanValue )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:840:6: ( ruleBooleanValue )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:841:1: ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_rule__SomeValue__Alternatives1786);
                    ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:846:6: ( ruleAExpression )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:846:6: ( ruleAExpression )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:847:1: ruleAExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleAExpression_in_rule__SomeValue__Alternatives1803);
                    ruleAExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SomeValue__Alternatives"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:857:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:861:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:862:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:862:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:863:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:864:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:864:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01835);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:868:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:868:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:869:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:870:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:870:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01853);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:879:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:883:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) | ( ( rule__Multiplication__Group_1_0_2__0 ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt8=1;
                }
                break;
            case 30:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:884:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:884:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:885:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:886:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:886:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01886);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:890:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:890:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:891:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:892:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:892:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01904);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:896:6: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:896:6: ( ( rule__Multiplication__Group_1_0_2__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:897:1: ( rule__Multiplication__Group_1_0_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:898:1: ( rule__Multiplication__Group_1_0_2__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:898:2: rule__Multiplication__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__0_in_rule__Multiplication__Alternatives_1_01922);
                    rule__Multiplication__Group_1_0_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMultiplicationAccess().getGroup_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:907:1: rule__PrimaryExpression__Alternatives : ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberValue ) | ( ruleVariable ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:911:1: ( ( ( rule__PrimaryExpression__Group_0__0 ) ) | ( ruleNumberValue ) | ( ruleVariable ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case RULE_INT:
                {
                alt9=2;
                }
                break;
            case RULE_ID:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:912:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:912:1: ( ( rule__PrimaryExpression__Group_0__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:913:1: ( rule__PrimaryExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:914:1: ( rule__PrimaryExpression__Group_0__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:914:2: rule__PrimaryExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1955);
                    rule__PrimaryExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:918:6: ( ruleNumberValue )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:918:6: ( ruleNumberValue )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:919:1: ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_rule__PrimaryExpression__Alternatives1973);
                    ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:924:6: ( ruleVariable )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:924:6: ( ruleVariable )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:925:1: ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleVariable_in_rule__PrimaryExpression__Alternatives1990);
                    ruleVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__VARIABLE_VALUE__Alternatives"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:935:1: rule__VARIABLE_VALUE__Alternatives : ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) );
    public final void rule__VARIABLE_VALUE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:939:1: ( ( RULE_ID ) | ( ( rule__VARIABLE_VALUE__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==33) ) {
                    alt10=2;
                }
                else if ( (LA10_1==EOF||(LA10_1>=12 && LA10_1<=16)||(LA10_1>=19 && LA10_1<=32)) ) {
                    alt10=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:940:1: ( RULE_ID )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:940:1: ( RULE_ID )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:941:1: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Alternatives2022); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:946:6: ( ( rule__VARIABLE_VALUE__Group_1__0 ) )
                    {
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:946:6: ( ( rule__VARIABLE_VALUE__Group_1__0 ) )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:947:1: ( rule__VARIABLE_VALUE__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getVARIABLE_VALUEAccess().getGroup_1()); 
                    }
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:948:1: ( rule__VARIABLE_VALUE__Group_1__0 )
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:948:2: rule__VARIABLE_VALUE__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__0_in_rule__VARIABLE_VALUE__Alternatives2039);
                    rule__VARIABLE_VALUE__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getVARIABLE_VALUEAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Alternatives"


    // $ANTLR start "rule__Equivalent__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:959:1: rule__Equivalent__Group__0 : rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1 ;
    public final void rule__Equivalent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:963:1: ( rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:964:2: rule__Equivalent__Group__0__Impl rule__Equivalent__Group__1
            {
            pushFollow(FOLLOW_rule__Equivalent__Group__0__Impl_in_rule__Equivalent__Group__02070);
            rule__Equivalent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equivalent__Group__1_in_rule__Equivalent__Group__02073);
            rule__Equivalent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group__0"


    // $ANTLR start "rule__Equivalent__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:971:1: rule__Equivalent__Group__0__Impl : ( ruleImplication ) ;
    public final void rule__Equivalent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:975:1: ( ( ruleImplication ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:976:1: ( ruleImplication )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:976:1: ( ruleImplication )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:977:1: ruleImplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_rule__Equivalent__Group__0__Impl2100);
            ruleImplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group__0__Impl"


    // $ANTLR start "rule__Equivalent__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:988:1: rule__Equivalent__Group__1 : rule__Equivalent__Group__1__Impl ;
    public final void rule__Equivalent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:992:1: ( rule__Equivalent__Group__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:993:2: rule__Equivalent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Equivalent__Group__1__Impl_in_rule__Equivalent__Group__12129);
            rule__Equivalent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group__1"


    // $ANTLR start "rule__Equivalent__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:999:1: rule__Equivalent__Group__1__Impl : ( ( rule__Equivalent__Group_1__0 )? ) ;
    public final void rule__Equivalent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1003:1: ( ( ( rule__Equivalent__Group_1__0 )? ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1004:1: ( ( rule__Equivalent__Group_1__0 )? )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1004:1: ( ( rule__Equivalent__Group_1__0 )? )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1005:1: ( rule__Equivalent__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getGroup_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1006:1: ( rule__Equivalent__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==12) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1006:2: rule__Equivalent__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Equivalent__Group_1__0_in_rule__Equivalent__Group__1__Impl2156);
                    rule__Equivalent__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group__1__Impl"


    // $ANTLR start "rule__Equivalent__Group_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1020:1: rule__Equivalent__Group_1__0 : rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1 ;
    public final void rule__Equivalent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1024:1: ( rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1025:2: rule__Equivalent__Group_1__0__Impl rule__Equivalent__Group_1__1
            {
            pushFollow(FOLLOW_rule__Equivalent__Group_1__0__Impl_in_rule__Equivalent__Group_1__02191);
            rule__Equivalent__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equivalent__Group_1__1_in_rule__Equivalent__Group_1__02194);
            rule__Equivalent__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__0"


    // $ANTLR start "rule__Equivalent__Group_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1032:1: rule__Equivalent__Group_1__0__Impl : ( () ) ;
    public final void rule__Equivalent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1036:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1037:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1037:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1038:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1039:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1041:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__0__Impl"


    // $ANTLR start "rule__Equivalent__Group_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1051:1: rule__Equivalent__Group_1__1 : rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2 ;
    public final void rule__Equivalent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1055:1: ( rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1056:2: rule__Equivalent__Group_1__1__Impl rule__Equivalent__Group_1__2
            {
            pushFollow(FOLLOW_rule__Equivalent__Group_1__1__Impl_in_rule__Equivalent__Group_1__12252);
            rule__Equivalent__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Equivalent__Group_1__2_in_rule__Equivalent__Group_1__12255);
            rule__Equivalent__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__1"


    // $ANTLR start "rule__Equivalent__Group_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1063:1: rule__Equivalent__Group_1__1__Impl : ( 'equiv' ) ;
    public final void rule__Equivalent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1067:1: ( ( 'equiv' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1068:1: ( 'equiv' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1068:1: ( 'equiv' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1069:1: 'equiv'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getEquivKeyword_1_1()); 
            }
            match(input,12,FOLLOW_12_in_rule__Equivalent__Group_1__1__Impl2283); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getEquivKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__1__Impl"


    // $ANTLR start "rule__Equivalent__Group_1__2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1082:1: rule__Equivalent__Group_1__2 : rule__Equivalent__Group_1__2__Impl ;
    public final void rule__Equivalent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1086:1: ( rule__Equivalent__Group_1__2__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1087:2: rule__Equivalent__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Equivalent__Group_1__2__Impl_in_rule__Equivalent__Group_1__22314);
            rule__Equivalent__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__2"


    // $ANTLR start "rule__Equivalent__Group_1__2__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1093:1: rule__Equivalent__Group_1__2__Impl : ( ( rule__Equivalent__RightAssignment_1_2 ) ) ;
    public final void rule__Equivalent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1097:1: ( ( ( rule__Equivalent__RightAssignment_1_2 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1098:1: ( ( rule__Equivalent__RightAssignment_1_2 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1098:1: ( ( rule__Equivalent__RightAssignment_1_2 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1099:1: ( rule__Equivalent__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getRightAssignment_1_2()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1100:1: ( rule__Equivalent__RightAssignment_1_2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1100:2: rule__Equivalent__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Equivalent__RightAssignment_1_2_in_rule__Equivalent__Group_1__2__Impl2341);
            rule__Equivalent__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__Group_1__2__Impl"


    // $ANTLR start "rule__Implication__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1116:1: rule__Implication__Group__0 : rule__Implication__Group__0__Impl rule__Implication__Group__1 ;
    public final void rule__Implication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1120:1: ( rule__Implication__Group__0__Impl rule__Implication__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1121:2: rule__Implication__Group__0__Impl rule__Implication__Group__1
            {
            pushFollow(FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__02377);
            rule__Implication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__02380);
            rule__Implication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__0"


    // $ANTLR start "rule__Implication__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1128:1: rule__Implication__Group__0__Impl : ( ruleDisjunction ) ;
    public final void rule__Implication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1132:1: ( ( ruleDisjunction ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1133:1: ( ruleDisjunction )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1133:1: ( ruleDisjunction )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1134:1: ruleDisjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_rule__Implication__Group__0__Impl2407);
            ruleDisjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__0__Impl"


    // $ANTLR start "rule__Implication__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1145:1: rule__Implication__Group__1 : rule__Implication__Group__1__Impl ;
    public final void rule__Implication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1149:1: ( rule__Implication__Group__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1150:2: rule__Implication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__12436);
            rule__Implication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__1"


    // $ANTLR start "rule__Implication__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1156:1: rule__Implication__Group__1__Impl : ( ( rule__Implication__Group_1__0 )? ) ;
    public final void rule__Implication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1160:1: ( ( ( rule__Implication__Group_1__0 )? ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1161:1: ( ( rule__Implication__Group_1__0 )? )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1161:1: ( ( rule__Implication__Group_1__0 )? )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1162:1: ( rule__Implication__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getGroup_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1163:1: ( rule__Implication__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1163:2: rule__Implication__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Implication__Group_1__0_in_rule__Implication__Group__1__Impl2463);
                    rule__Implication__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group__1__Impl"


    // $ANTLR start "rule__Implication__Group_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1177:1: rule__Implication__Group_1__0 : rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1 ;
    public final void rule__Implication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1181:1: ( rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1182:2: rule__Implication__Group_1__0__Impl rule__Implication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Implication__Group_1__0__Impl_in_rule__Implication__Group_1__02498);
            rule__Implication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Implication__Group_1__1_in_rule__Implication__Group_1__02501);
            rule__Implication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__0"


    // $ANTLR start "rule__Implication__Group_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1189:1: rule__Implication__Group_1__0__Impl : ( () ) ;
    public final void rule__Implication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1193:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1194:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1194:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1195:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1196:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1198:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getImplyLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__0__Impl"


    // $ANTLR start "rule__Implication__Group_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1208:1: rule__Implication__Group_1__1 : rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2 ;
    public final void rule__Implication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1212:1: ( rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1213:2: rule__Implication__Group_1__1__Impl rule__Implication__Group_1__2
            {
            pushFollow(FOLLOW_rule__Implication__Group_1__1__Impl_in_rule__Implication__Group_1__12559);
            rule__Implication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Implication__Group_1__2_in_rule__Implication__Group_1__12562);
            rule__Implication__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__1"


    // $ANTLR start "rule__Implication__Group_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1220:1: rule__Implication__Group_1__1__Impl : ( 'imply' ) ;
    public final void rule__Implication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1224:1: ( ( 'imply' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1225:1: ( 'imply' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1225:1: ( 'imply' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1226:1: 'imply'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getImplyKeyword_1_1()); 
            }
            match(input,13,FOLLOW_13_in_rule__Implication__Group_1__1__Impl2590); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getImplyKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__1__Impl"


    // $ANTLR start "rule__Implication__Group_1__2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1239:1: rule__Implication__Group_1__2 : rule__Implication__Group_1__2__Impl ;
    public final void rule__Implication__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1243:1: ( rule__Implication__Group_1__2__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1244:2: rule__Implication__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Implication__Group_1__2__Impl_in_rule__Implication__Group_1__22621);
            rule__Implication__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__2"


    // $ANTLR start "rule__Implication__Group_1__2__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1250:1: rule__Implication__Group_1__2__Impl : ( ( rule__Implication__RightAssignment_1_2 ) ) ;
    public final void rule__Implication__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1254:1: ( ( ( rule__Implication__RightAssignment_1_2 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1255:1: ( ( rule__Implication__RightAssignment_1_2 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1255:1: ( ( rule__Implication__RightAssignment_1_2 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1256:1: ( rule__Implication__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getRightAssignment_1_2()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1257:1: ( rule__Implication__RightAssignment_1_2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1257:2: rule__Implication__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Implication__RightAssignment_1_2_in_rule__Implication__Group_1__2__Impl2648);
            rule__Implication__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__Group_1__2__Impl"


    // $ANTLR start "rule__Disjunction__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1273:1: rule__Disjunction__Group__0 : rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 ;
    public final void rule__Disjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1277:1: ( rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1278:2: rule__Disjunction__Group__0__Impl rule__Disjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__02684);
            rule__Disjunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__02687);
            rule__Disjunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0"


    // $ANTLR start "rule__Disjunction__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1285:1: rule__Disjunction__Group__0__Impl : ( ruleConjunction ) ;
    public final void rule__Disjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1289:1: ( ( ruleConjunction ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1290:1: ( ruleConjunction )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1290:1: ( ruleConjunction )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1291:1: ruleConjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_rule__Disjunction__Group__0__Impl2714);
            ruleConjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__0__Impl"


    // $ANTLR start "rule__Disjunction__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1302:1: rule__Disjunction__Group__1 : rule__Disjunction__Group__1__Impl ;
    public final void rule__Disjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1306:1: ( rule__Disjunction__Group__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1307:2: rule__Disjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__12743);
            rule__Disjunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1"


    // $ANTLR start "rule__Disjunction__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1313:1: rule__Disjunction__Group__1__Impl : ( ( rule__Disjunction__Group_1__0 )? ) ;
    public final void rule__Disjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1317:1: ( ( ( rule__Disjunction__Group_1__0 )? ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1318:1: ( ( rule__Disjunction__Group_1__0 )? )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1318:1: ( ( rule__Disjunction__Group_1__0 )? )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1319:1: ( rule__Disjunction__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getGroup_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1320:1: ( rule__Disjunction__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=14 && LA13_0<=15)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1320:2: rule__Disjunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Disjunction__Group_1__0_in_rule__Disjunction__Group__1__Impl2770);
                    rule__Disjunction__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1334:1: rule__Disjunction__Group_1__0 : rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 ;
    public final void rule__Disjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1338:1: ( rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1339:2: rule__Disjunction__Group_1__0__Impl rule__Disjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1__0__Impl_in_rule__Disjunction__Group_1__02805);
            rule__Disjunction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Disjunction__Group_1__1_in_rule__Disjunction__Group_1__02808);
            rule__Disjunction__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__0"


    // $ANTLR start "rule__Disjunction__Group_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1346:1: rule__Disjunction__Group_1__0__Impl : ( ( rule__Disjunction__Alternatives_1_0 ) ) ;
    public final void rule__Disjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1350:1: ( ( ( rule__Disjunction__Alternatives_1_0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1351:1: ( ( rule__Disjunction__Alternatives_1_0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1351:1: ( ( rule__Disjunction__Alternatives_1_0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1352:1: ( rule__Disjunction__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getAlternatives_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1353:1: ( rule__Disjunction__Alternatives_1_0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1353:2: rule__Disjunction__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Disjunction__Alternatives_1_0_in_rule__Disjunction__Group_1__0__Impl2835);
            rule__Disjunction__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1363:1: rule__Disjunction__Group_1__1 : rule__Disjunction__Group_1__1__Impl ;
    public final void rule__Disjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1367:1: ( rule__Disjunction__Group_1__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1368:2: rule__Disjunction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1__1__Impl_in_rule__Disjunction__Group_1__12865);
            rule__Disjunction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__1"


    // $ANTLR start "rule__Disjunction__Group_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1374:1: rule__Disjunction__Group_1__1__Impl : ( ( rule__Disjunction__RightAssignment_1_1 ) ) ;
    public final void rule__Disjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1378:1: ( ( ( rule__Disjunction__RightAssignment_1_1 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1379:1: ( ( rule__Disjunction__RightAssignment_1_1 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1379:1: ( ( rule__Disjunction__RightAssignment_1_1 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1380:1: ( rule__Disjunction__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getRightAssignment_1_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1381:1: ( rule__Disjunction__RightAssignment_1_1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1381:2: rule__Disjunction__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Disjunction__RightAssignment_1_1_in_rule__Disjunction__Group_1__1__Impl2892);
            rule__Disjunction__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1395:1: rule__Disjunction__Group_1_0_0__0 : rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1 ;
    public final void rule__Disjunction__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1399:1: ( rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1400:2: rule__Disjunction__Group_1_0_0__0__Impl rule__Disjunction__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__0__Impl_in_rule__Disjunction__Group_1_0_0__02926);
            rule__Disjunction__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__1_in_rule__Disjunction__Group_1_0_0__02929);
            rule__Disjunction__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_0__0"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1407:1: rule__Disjunction__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1411:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1412:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1412:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1413:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1414:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1416:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1426:1: rule__Disjunction__Group_1_0_0__1 : rule__Disjunction__Group_1_0_0__1__Impl ;
    public final void rule__Disjunction__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1430:1: ( rule__Disjunction__Group_1_0_0__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1431:2: rule__Disjunction__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_0__1__Impl_in_rule__Disjunction__Group_1_0_0__12987);
            rule__Disjunction__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_0__1"


    // $ANTLR start "rule__Disjunction__Group_1_0_0__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1437:1: rule__Disjunction__Group_1_0_0__1__Impl : ( 'or' ) ;
    public final void rule__Disjunction__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1441:1: ( ( 'or' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1442:1: ( 'or' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1442:1: ( 'or' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1443:1: 'or'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1()); 
            }
            match(input,14,FOLLOW_14_in_rule__Disjunction__Group_1_0_0__1__Impl3015); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1460:1: rule__Disjunction__Group_1_0_1__0 : rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1 ;
    public final void rule__Disjunction__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1464:1: ( rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1465:2: rule__Disjunction__Group_1_0_1__0__Impl rule__Disjunction__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__0__Impl_in_rule__Disjunction__Group_1_0_1__03050);
            rule__Disjunction__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__1_in_rule__Disjunction__Group_1_0_1__03053);
            rule__Disjunction__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_1__0"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1472:1: rule__Disjunction__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Disjunction__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1476:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1477:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1477:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1478:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1479:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1481:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1491:1: rule__Disjunction__Group_1_0_1__1 : rule__Disjunction__Group_1_0_1__1__Impl ;
    public final void rule__Disjunction__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1495:1: ( rule__Disjunction__Group_1_0_1__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1496:2: rule__Disjunction__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Disjunction__Group_1_0_1__1__Impl_in_rule__Disjunction__Group_1_0_1__13111);
            rule__Disjunction__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_1__1"


    // $ANTLR start "rule__Disjunction__Group_1_0_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1502:1: rule__Disjunction__Group_1_0_1__1__Impl : ( 'xor' ) ;
    public final void rule__Disjunction__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1506:1: ( ( 'xor' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1507:1: ( 'xor' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1507:1: ( 'xor' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1508:1: 'xor'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1()); 
            }
            match(input,15,FOLLOW_15_in_rule__Disjunction__Group_1_0_1__1__Impl3139); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Conjunction__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1525:1: rule__Conjunction__Group__0 : rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 ;
    public final void rule__Conjunction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1529:1: ( rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1530:2: rule__Conjunction__Group__0__Impl rule__Conjunction__Group__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__03174);
            rule__Conjunction__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__03177);
            rule__Conjunction__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0"


    // $ANTLR start "rule__Conjunction__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1537:1: rule__Conjunction__Group__0__Impl : ( ruleNegation ) ;
    public final void rule__Conjunction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1541:1: ( ( ruleNegation ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1542:1: ( ruleNegation )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1542:1: ( ruleNegation )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1543:1: ruleNegation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_rule__Conjunction__Group__0__Impl3204);
            ruleNegation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__0__Impl"


    // $ANTLR start "rule__Conjunction__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1554:1: rule__Conjunction__Group__1 : rule__Conjunction__Group__1__Impl ;
    public final void rule__Conjunction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1558:1: ( rule__Conjunction__Group__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1559:2: rule__Conjunction__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__13233);
            rule__Conjunction__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1"


    // $ANTLR start "rule__Conjunction__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1565:1: rule__Conjunction__Group__1__Impl : ( ( rule__Conjunction__Group_1__0 )? ) ;
    public final void rule__Conjunction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1569:1: ( ( ( rule__Conjunction__Group_1__0 )? ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1570:1: ( ( rule__Conjunction__Group_1__0 )? )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1570:1: ( ( rule__Conjunction__Group_1__0 )? )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1571:1: ( rule__Conjunction__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getGroup_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1572:1: ( rule__Conjunction__Group_1__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==16) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1572:2: rule__Conjunction__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl3260);
                    rule__Conjunction__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1586:1: rule__Conjunction__Group_1__0 : rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 ;
    public final void rule__Conjunction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1590:1: ( rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1591:2: rule__Conjunction__Group_1__0__Impl rule__Conjunction__Group_1__1
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__03295);
            rule__Conjunction__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__03298);
            rule__Conjunction__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0"


    // $ANTLR start "rule__Conjunction__Group_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1598:1: rule__Conjunction__Group_1__0__Impl : ( () ) ;
    public final void rule__Conjunction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1602:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1603:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1603:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1604:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1605:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1607:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getAndLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__0__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1617:1: rule__Conjunction__Group_1__1 : rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 ;
    public final void rule__Conjunction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1621:1: ( rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1622:2: rule__Conjunction__Group_1__1__Impl rule__Conjunction__Group_1__2
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__13356);
            rule__Conjunction__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__13359);
            rule__Conjunction__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1"


    // $ANTLR start "rule__Conjunction__Group_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1629:1: rule__Conjunction__Group_1__1__Impl : ( 'and' ) ;
    public final void rule__Conjunction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1633:1: ( ( 'and' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1634:1: ( 'and' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1634:1: ( 'and' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1635:1: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getAndKeyword_1_1()); 
            }
            match(input,16,FOLLOW_16_in_rule__Conjunction__Group_1__1__Impl3387); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getAndKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__1__Impl"


    // $ANTLR start "rule__Conjunction__Group_1__2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1648:1: rule__Conjunction__Group_1__2 : rule__Conjunction__Group_1__2__Impl ;
    public final void rule__Conjunction__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1652:1: ( rule__Conjunction__Group_1__2__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1653:2: rule__Conjunction__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__23418);
            rule__Conjunction__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__2"


    // $ANTLR start "rule__Conjunction__Group_1__2__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1659:1: rule__Conjunction__Group_1__2__Impl : ( ( rule__Conjunction__RightAssignment_1_2 ) ) ;
    public final void rule__Conjunction__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1663:1: ( ( ( rule__Conjunction__RightAssignment_1_2 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1664:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1664:1: ( ( rule__Conjunction__RightAssignment_1_2 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1665:1: ( rule__Conjunction__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1666:1: ( rule__Conjunction__RightAssignment_1_2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1666:2: rule__Conjunction__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__Conjunction__RightAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl3445);
            rule__Conjunction__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__Group_1__2__Impl"


    // $ANTLR start "rule__Negation__Group_0__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1682:1: rule__Negation__Group_0__0 : rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 ;
    public final void rule__Negation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1686:1: ( rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1687:2: rule__Negation__Group_0__0__Impl rule__Negation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Negation__Group_0__0__Impl_in_rule__Negation__Group_0__03481);
            rule__Negation__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Negation__Group_0__1_in_rule__Negation__Group_0__03484);
            rule__Negation__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__0"


    // $ANTLR start "rule__Negation__Group_0__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1694:1: rule__Negation__Group_0__0__Impl : ( 'not' ) ;
    public final void rule__Negation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1698:1: ( ( 'not' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1699:1: ( 'not' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1699:1: ( 'not' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1700:1: 'not'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getNotKeyword_0_0()); 
            }
            match(input,17,FOLLOW_17_in_rule__Negation__Group_0__0__Impl3512); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getNotKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__0__Impl"


    // $ANTLR start "rule__Negation__Group_0__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1713:1: rule__Negation__Group_0__1 : rule__Negation__Group_0__1__Impl ;
    public final void rule__Negation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1717:1: ( rule__Negation__Group_0__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1718:2: rule__Negation__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Negation__Group_0__1__Impl_in_rule__Negation__Group_0__13543);
            rule__Negation__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__1"


    // $ANTLR start "rule__Negation__Group_0__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1724:1: rule__Negation__Group_0__1__Impl : ( ruleNegated ) ;
    public final void rule__Negation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1728:1: ( ( ruleNegated ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1729:1: ( ruleNegated )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1729:1: ( ruleNegated )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1730:1: ruleNegated
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleNegated_in_rule__Negation__Group_0__1__Impl3570);
            ruleNegated();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negation__Group_0__1__Impl"


    // $ANTLR start "rule__Negated__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1745:1: rule__Negated__Group__0 : rule__Negated__Group__0__Impl rule__Negated__Group__1 ;
    public final void rule__Negated__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1749:1: ( rule__Negated__Group__0__Impl rule__Negated__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1750:2: rule__Negated__Group__0__Impl rule__Negated__Group__1
            {
            pushFollow(FOLLOW_rule__Negated__Group__0__Impl_in_rule__Negated__Group__03603);
            rule__Negated__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Negated__Group__1_in_rule__Negated__Group__03606);
            rule__Negated__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negated__Group__0"


    // $ANTLR start "rule__Negated__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1757:1: rule__Negated__Group__0__Impl : ( () ) ;
    public final void rule__Negated__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1761:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1762:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1762:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1763:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getNotAction_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1764:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1766:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getNotAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negated__Group__0__Impl"


    // $ANTLR start "rule__Negated__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1776:1: rule__Negated__Group__1 : rule__Negated__Group__1__Impl ;
    public final void rule__Negated__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1780:1: ( rule__Negated__Group__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1781:2: rule__Negated__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Negated__Group__1__Impl_in_rule__Negated__Group__13664);
            rule__Negated__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negated__Group__1"


    // $ANTLR start "rule__Negated__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1787:1: rule__Negated__Group__1__Impl : ( ( rule__Negated__NotAssignment_1 ) ) ;
    public final void rule__Negated__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1791:1: ( ( ( rule__Negated__NotAssignment_1 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1792:1: ( ( rule__Negated__NotAssignment_1 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1792:1: ( ( rule__Negated__NotAssignment_1 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1793:1: ( rule__Negated__NotAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getNotAssignment_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1794:1: ( rule__Negated__NotAssignment_1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1794:2: rule__Negated__NotAssignment_1
            {
            pushFollow(FOLLOW_rule__Negated__NotAssignment_1_in_rule__Negated__Group__1__Impl3691);
            rule__Negated__NotAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getNotAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negated__Group__1__Impl"


    // $ANTLR start "rule__CExpression__Group_0__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1808:1: rule__CExpression__Group_0__0 : rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1 ;
    public final void rule__CExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1812:1: ( rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1813:2: rule__CExpression__Group_0__0__Impl rule__CExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__CExpression__Group_0__0__Impl_in_rule__CExpression__Group_0__03725);
            rule__CExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CExpression__Group_0__1_in_rule__CExpression__Group_0__03728);
            rule__CExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Group_0__0"


    // $ANTLR start "rule__CExpression__Group_0__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1820:1: rule__CExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__CExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1824:1: ( ( '(' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1825:1: ( '(' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1825:1: ( '(' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1826:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__CExpression__Group_0__0__Impl3756); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Group_0__0__Impl"


    // $ANTLR start "rule__CExpression__Group_0__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1839:1: rule__CExpression__Group_0__1 : rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2 ;
    public final void rule__CExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1843:1: ( rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1844:2: rule__CExpression__Group_0__1__Impl rule__CExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__CExpression__Group_0__1__Impl_in_rule__CExpression__Group_0__13787);
            rule__CExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__CExpression__Group_0__2_in_rule__CExpression__Group_0__13790);
            rule__CExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Group_0__1"


    // $ANTLR start "rule__CExpression__Group_0__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1851:1: rule__CExpression__Group_0__1__Impl : ( ruleLExpression ) ;
    public final void rule__CExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1855:1: ( ( ruleLExpression ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1856:1: ( ruleLExpression )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1856:1: ( ruleLExpression )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1857:1: ruleLExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleLExpression_in_rule__CExpression__Group_0__1__Impl3817);
            ruleLExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Group_0__1__Impl"


    // $ANTLR start "rule__CExpression__Group_0__2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1868:1: rule__CExpression__Group_0__2 : rule__CExpression__Group_0__2__Impl ;
    public final void rule__CExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1872:1: ( rule__CExpression__Group_0__2__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1873:2: rule__CExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__CExpression__Group_0__2__Impl_in_rule__CExpression__Group_0__23846);
            rule__CExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Group_0__2"


    // $ANTLR start "rule__CExpression__Group_0__2__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1879:1: rule__CExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__CExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1883:1: ( ( ')' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1884:1: ( ')' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1884:1: ( ')' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1885:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__CExpression__Group_0__2__Impl3874); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CExpression__Group_0__2__Impl"


    // $ANTLR start "rule__Compare__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1904:1: rule__Compare__Group__0 : rule__Compare__Group__0__Impl rule__Compare__Group__1 ;
    public final void rule__Compare__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1908:1: ( rule__Compare__Group__0__Impl rule__Compare__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1909:2: rule__Compare__Group__0__Impl rule__Compare__Group__1
            {
            pushFollow(FOLLOW_rule__Compare__Group__0__Impl_in_rule__Compare__Group__03911);
            rule__Compare__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group__1_in_rule__Compare__Group__03914);
            rule__Compare__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__0"


    // $ANTLR start "rule__Compare__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1916:1: rule__Compare__Group__0__Impl : ( ruleSomeValue ) ;
    public final void rule__Compare__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1920:1: ( ( ruleSomeValue ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1921:1: ( ruleSomeValue )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1921:1: ( ruleSomeValue )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1922:1: ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSomeValue_in_rule__Compare__Group__0__Impl3941);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__0__Impl"


    // $ANTLR start "rule__Compare__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1933:1: rule__Compare__Group__1 : rule__Compare__Group__1__Impl rule__Compare__Group__2 ;
    public final void rule__Compare__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1937:1: ( rule__Compare__Group__1__Impl rule__Compare__Group__2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1938:2: rule__Compare__Group__1__Impl rule__Compare__Group__2
            {
            pushFollow(FOLLOW_rule__Compare__Group__1__Impl_in_rule__Compare__Group__13970);
            rule__Compare__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group__2_in_rule__Compare__Group__13973);
            rule__Compare__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__1"


    // $ANTLR start "rule__Compare__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1945:1: rule__Compare__Group__1__Impl : ( ( rule__Compare__Alternatives_1 ) ) ;
    public final void rule__Compare__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1949:1: ( ( ( rule__Compare__Alternatives_1 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1950:1: ( ( rule__Compare__Alternatives_1 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1950:1: ( ( rule__Compare__Alternatives_1 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1951:1: ( rule__Compare__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getAlternatives_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1952:1: ( rule__Compare__Alternatives_1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1952:2: rule__Compare__Alternatives_1
            {
            pushFollow(FOLLOW_rule__Compare__Alternatives_1_in_rule__Compare__Group__1__Impl4000);
            rule__Compare__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__1__Impl"


    // $ANTLR start "rule__Compare__Group__2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1962:1: rule__Compare__Group__2 : rule__Compare__Group__2__Impl ;
    public final void rule__Compare__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1966:1: ( rule__Compare__Group__2__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1967:2: rule__Compare__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group__2__Impl_in_rule__Compare__Group__24030);
            rule__Compare__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__2"


    // $ANTLR start "rule__Compare__Group__2__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1973:1: rule__Compare__Group__2__Impl : ( ( rule__Compare__RightAssignment_2 ) ) ;
    public final void rule__Compare__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1977:1: ( ( ( rule__Compare__RightAssignment_2 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1978:1: ( ( rule__Compare__RightAssignment_2 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1978:1: ( ( rule__Compare__RightAssignment_2 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1979:1: ( rule__Compare__RightAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getRightAssignment_2()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1980:1: ( rule__Compare__RightAssignment_2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1980:2: rule__Compare__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__Compare__RightAssignment_2_in_rule__Compare__Group__2__Impl4057);
            rule__Compare__RightAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getRightAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group__2__Impl"


    // $ANTLR start "rule__Compare__Group_1_0__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:1996:1: rule__Compare__Group_1_0__0 : rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1 ;
    public final void rule__Compare__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2000:1: ( rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2001:2: rule__Compare__Group_1_0__0__Impl rule__Compare__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_0__0__Impl_in_rule__Compare__Group_1_0__04093);
            rule__Compare__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_0__1_in_rule__Compare__Group_1_0__04096);
            rule__Compare__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0__0"


    // $ANTLR start "rule__Compare__Group_1_0__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2008:1: rule__Compare__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2012:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2013:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2013:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2014:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2015:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2017:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_0__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2027:1: rule__Compare__Group_1_0__1 : rule__Compare__Group_1_0__1__Impl ;
    public final void rule__Compare__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2031:1: ( rule__Compare__Group_1_0__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2032:2: rule__Compare__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_0__1__Impl_in_rule__Compare__Group_1_0__14154);
            rule__Compare__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0__1"


    // $ANTLR start "rule__Compare__Group_1_0__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2038:1: rule__Compare__Group_1_0__1__Impl : ( '<=' ) ;
    public final void rule__Compare__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2042:1: ( ( '<=' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2043:1: ( '<=' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2043:1: ( '<=' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2044:1: '<='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1()); 
            }
            match(input,20,FOLLOW_20_in_rule__Compare__Group_1_0__1__Impl4182); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_0__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2061:1: rule__Compare__Group_1_1__0 : rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1 ;
    public final void rule__Compare__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2065:1: ( rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2066:2: rule__Compare__Group_1_1__0__Impl rule__Compare__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_1__0__Impl_in_rule__Compare__Group_1_1__04217);
            rule__Compare__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_1__1_in_rule__Compare__Group_1_1__04220);
            rule__Compare__Group_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_1__0"


    // $ANTLR start "rule__Compare__Group_1_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2073:1: rule__Compare__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2077:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2078:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2078:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2079:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2080:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2082:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessLeftAction_1_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_1__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2092:1: rule__Compare__Group_1_1__1 : rule__Compare__Group_1_1__1__Impl ;
    public final void rule__Compare__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2096:1: ( rule__Compare__Group_1_1__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2097:2: rule__Compare__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_1__1__Impl_in_rule__Compare__Group_1_1__14278);
            rule__Compare__Group_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_1__1"


    // $ANTLR start "rule__Compare__Group_1_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2103:1: rule__Compare__Group_1_1__1__Impl : ( '<' ) ;
    public final void rule__Compare__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2107:1: ( ( '<' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2108:1: ( '<' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2108:1: ( '<' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2109:1: '<'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1()); 
            }
            match(input,21,FOLLOW_21_in_rule__Compare__Group_1_1__1__Impl4306); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_1__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_2__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2126:1: rule__Compare__Group_1_2__0 : rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1 ;
    public final void rule__Compare__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2130:1: ( rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2131:2: rule__Compare__Group_1_2__0__Impl rule__Compare__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_2__0__Impl_in_rule__Compare__Group_1_2__04341);
            rule__Compare__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_2__1_in_rule__Compare__Group_1_2__04344);
            rule__Compare__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_2__0"


    // $ANTLR start "rule__Compare__Group_1_2__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2138:1: rule__Compare__Group_1_2__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2142:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2143:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2143:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2144:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2145:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2147:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_2__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_2__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2157:1: rule__Compare__Group_1_2__1 : rule__Compare__Group_1_2__1__Impl ;
    public final void rule__Compare__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2161:1: ( rule__Compare__Group_1_2__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2162:2: rule__Compare__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_2__1__Impl_in_rule__Compare__Group_1_2__14402);
            rule__Compare__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_2__1"


    // $ANTLR start "rule__Compare__Group_1_2__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2168:1: rule__Compare__Group_1_2__1__Impl : ( '>=' ) ;
    public final void rule__Compare__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2172:1: ( ( '>=' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2173:1: ( '>=' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2173:1: ( '>=' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2174:1: '>='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            }
            match(input,22,FOLLOW_22_in_rule__Compare__Group_1_2__1__Impl4430); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_2__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_3__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2191:1: rule__Compare__Group_1_3__0 : rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1 ;
    public final void rule__Compare__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2195:1: ( rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2196:2: rule__Compare__Group_1_3__0__Impl rule__Compare__Group_1_3__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_3__0__Impl_in_rule__Compare__Group_1_3__04465);
            rule__Compare__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_3__1_in_rule__Compare__Group_1_3__04468);
            rule__Compare__Group_1_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_3__0"


    // $ANTLR start "rule__Compare__Group_1_3__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2203:1: rule__Compare__Group_1_3__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2207:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2208:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2208:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2209:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2210:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2212:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_3__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_3__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2222:1: rule__Compare__Group_1_3__1 : rule__Compare__Group_1_3__1__Impl ;
    public final void rule__Compare__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2226:1: ( rule__Compare__Group_1_3__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2227:2: rule__Compare__Group_1_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_3__1__Impl_in_rule__Compare__Group_1_3__14526);
            rule__Compare__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_3__1"


    // $ANTLR start "rule__Compare__Group_1_3__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2233:1: rule__Compare__Group_1_3__1__Impl : ( '>' ) ;
    public final void rule__Compare__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2237:1: ( ( '>' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2238:1: ( '>' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2238:1: ( '>' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2239:1: '>'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1()); 
            }
            match(input,23,FOLLOW_23_in_rule__Compare__Group_1_3__1__Impl4554); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_3__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_4__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2256:1: rule__Compare__Group_1_4__0 : rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1 ;
    public final void rule__Compare__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2260:1: ( rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2261:2: rule__Compare__Group_1_4__0__Impl rule__Compare__Group_1_4__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_4__0__Impl_in_rule__Compare__Group_1_4__04589);
            rule__Compare__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_4__1_in_rule__Compare__Group_1_4__04592);
            rule__Compare__Group_1_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_4__0"


    // $ANTLR start "rule__Compare__Group_1_4__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2268:1: rule__Compare__Group_1_4__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2272:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2273:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2273:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2274:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2275:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2277:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_4__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_4__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2287:1: rule__Compare__Group_1_4__1 : rule__Compare__Group_1_4__1__Impl ;
    public final void rule__Compare__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2291:1: ( rule__Compare__Group_1_4__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2292:2: rule__Compare__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_4__1__Impl_in_rule__Compare__Group_1_4__14650);
            rule__Compare__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_4__1"


    // $ANTLR start "rule__Compare__Group_1_4__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2298:1: rule__Compare__Group_1_4__1__Impl : ( '=' ) ;
    public final void rule__Compare__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2302:1: ( ( '=' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2303:1: ( '=' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2303:1: ( '=' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2304:1: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1()); 
            }
            match(input,24,FOLLOW_24_in_rule__Compare__Group_1_4__1__Impl4678); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_4__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_5__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2321:1: rule__Compare__Group_1_5__0 : rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1 ;
    public final void rule__Compare__Group_1_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2325:1: ( rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2326:2: rule__Compare__Group_1_5__0__Impl rule__Compare__Group_1_5__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_5__0__Impl_in_rule__Compare__Group_1_5__04713);
            rule__Compare__Group_1_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_5__1_in_rule__Compare__Group_1_5__04716);
            rule__Compare__Group_1_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_5__0"


    // $ANTLR start "rule__Compare__Group_1_5__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2333:1: rule__Compare__Group_1_5__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2337:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2338:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2338:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2339:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2340:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2342:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_5__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_5__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2352:1: rule__Compare__Group_1_5__1 : rule__Compare__Group_1_5__1__Impl ;
    public final void rule__Compare__Group_1_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2356:1: ( rule__Compare__Group_1_5__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2357:2: rule__Compare__Group_1_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_5__1__Impl_in_rule__Compare__Group_1_5__14774);
            rule__Compare__Group_1_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_5__1"


    // $ANTLR start "rule__Compare__Group_1_5__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2363:1: rule__Compare__Group_1_5__1__Impl : ( '!=' ) ;
    public final void rule__Compare__Group_1_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2367:1: ( ( '!=' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2368:1: ( '!=' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2368:1: ( '!=' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2369:1: '!='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1()); 
            }
            match(input,25,FOLLOW_25_in_rule__Compare__Group_1_5__1__Impl4802); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_5__1__Impl"


    // $ANTLR start "rule__Compare__Group_1_6__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2386:1: rule__Compare__Group_1_6__0 : rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1 ;
    public final void rule__Compare__Group_1_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2390:1: ( rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2391:2: rule__Compare__Group_1_6__0__Impl rule__Compare__Group_1_6__1
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_6__0__Impl_in_rule__Compare__Group_1_6__04837);
            rule__Compare__Group_1_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Compare__Group_1_6__1_in_rule__Compare__Group_1_6__04840);
            rule__Compare__Group_1_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_6__0"


    // $ANTLR start "rule__Compare__Group_1_6__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2398:1: rule__Compare__Group_1_6__0__Impl : ( () ) ;
    public final void rule__Compare__Group_1_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2402:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2403:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2403:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2404:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2405:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2407:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_6__0__Impl"


    // $ANTLR start "rule__Compare__Group_1_6__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2417:1: rule__Compare__Group_1_6__1 : rule__Compare__Group_1_6__1__Impl ;
    public final void rule__Compare__Group_1_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2421:1: ( rule__Compare__Group_1_6__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2422:2: rule__Compare__Group_1_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Compare__Group_1_6__1__Impl_in_rule__Compare__Group_1_6__14898);
            rule__Compare__Group_1_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_6__1"


    // $ANTLR start "rule__Compare__Group_1_6__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2428:1: rule__Compare__Group_1_6__1__Impl : ( '~' ) ;
    public final void rule__Compare__Group_1_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2432:1: ( ( '~' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2433:1: ( '~' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2433:1: ( '~' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2434:1: '~'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getTildeKeyword_1_6_1()); 
            }
            match(input,26,FOLLOW_26_in_rule__Compare__Group_1_6__1__Impl4926); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getTildeKeyword_1_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__Group_1_6__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2451:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2455:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2456:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04961);
            rule__Addition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04964);
            rule__Addition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2463:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2467:1: ( ( ruleMultiplication ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2468:1: ( ruleMultiplication )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2468:1: ( ruleMultiplication )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2469:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4991);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2480:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2484:1: ( rule__Addition__Group__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2485:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__15020);
            rule__Addition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2491:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2495:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2496:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2496:1: ( ( rule__Addition__Group_1__0 )* )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2497:1: ( rule__Addition__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getGroup_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2498:1: ( rule__Addition__Group_1__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=27 && LA15_0<=28)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2498:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl5047);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2512:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2516:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2517:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__05082);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__05085);
            rule__Addition__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2524:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2528:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2529:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2529:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2530:1: ( rule__Addition__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2531:1: ( rule__Addition__Alternatives_1_0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2531:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl5112);
            rule__Addition__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2541:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2545:1: ( rule__Addition__Group_1__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2546:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__15142);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2552:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2556:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2557:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2557:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2558:1: ( rule__Addition__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2559:1: ( rule__Addition__RightAssignment_1_1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2559:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl5169);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2573:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2577:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2578:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__05203);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__05206);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2585:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2589:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2590:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2590:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2591:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2592:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2594:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2604:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2608:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2609:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__15264);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2615:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2619:1: ( ( '+' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2620:1: ( '+' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2620:1: ( '+' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2621:1: '+'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }
            match(input,27,FOLLOW_27_in_rule__Addition__Group_1_0_0__1__Impl5292); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2638:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2642:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2643:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__05327);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__05330);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2650:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2654:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2655:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2655:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2656:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2657:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2659:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2669:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2673:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2674:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15388);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2680:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2684:1: ( ( '-' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2685:1: ( '-' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2685:1: ( '-' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2686:1: '-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }
            match(input,28,FOLLOW_28_in_rule__Addition__Group_1_0_1__1__Impl5416); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2703:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2707:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2708:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05451);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05454);
            rule__Multiplication__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2715:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2719:1: ( ( rulePower ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2720:1: ( rulePower )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2720:1: ( rulePower )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2721:1: rulePower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl5481);
            rulePower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2732:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2736:1: ( rule__Multiplication__Group__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2737:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15510);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2743:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2747:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2748:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2748:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2749:1: ( rule__Multiplication__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2750:1: ( rule__Multiplication__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=29 && LA16_0<=31)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2750:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5537);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2764:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2768:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2769:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05572);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05575);
            rule__Multiplication__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2776:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2780:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2781:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2781:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2782:1: ( rule__Multiplication__Alternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2783:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2783:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5602);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2793:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2797:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2798:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15632);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2804:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2808:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2809:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2809:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2810:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2811:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2811:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5659);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2825:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2829:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2830:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05693);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05696);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2837:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2841:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2842:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2842:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2843:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2844:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2846:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2856:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2860:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2861:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15754);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2867:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2871:1: ( ( '*' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2872:1: ( '*' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2872:1: ( '*' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2873:1: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }
            match(input,29,FOLLOW_29_in_rule__Multiplication__Group_1_0_0__1__Impl5782); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2890:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2894:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2895:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05817);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05820);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2902:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2906:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2907:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2907:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2908:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2909:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2911:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2921:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2925:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2926:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15878);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2932:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2936:1: ( ( '/' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2937:1: ( '/' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2937:1: ( '/' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2938:1: '/'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }
            match(input,30,FOLLOW_30_in_rule__Multiplication__Group_1_0_1__1__Impl5906); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2955:1: rule__Multiplication__Group_1_0_2__0 : rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 ;
    public final void rule__Multiplication__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2959:1: ( rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2960:2: rule__Multiplication__Group_1_0_2__0__Impl rule__Multiplication__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__0__Impl_in_rule__Multiplication__Group_1_0_2__05941);
            rule__Multiplication__Group_1_0_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__1_in_rule__Multiplication__Group_1_0_2__05944);
            rule__Multiplication__Group_1_0_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2967:1: rule__Multiplication__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2971:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2972:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2972:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2973:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2974:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2976:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2986:1: rule__Multiplication__Group_1_0_2__1 : rule__Multiplication__Group_1_0_2__1__Impl ;
    public final void rule__Multiplication__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2990:1: ( rule__Multiplication__Group_1_0_2__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2991:2: rule__Multiplication__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_2__1__Impl_in_rule__Multiplication__Group_1_0_2__16002);
            rule__Multiplication__Group_1_0_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_2__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:2997:1: rule__Multiplication__Group_1_0_2__1__Impl : ( '%' ) ;
    public final void rule__Multiplication__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3001:1: ( ( '%' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3002:1: ( '%' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3002:1: ( '%' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3003:1: '%'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1()); 
            }
            match(input,31,FOLLOW_31_in_rule__Multiplication__Group_1_0_2__1__Impl6030); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Power__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3020:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3024:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3025:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__06065);
            rule__Power__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Power__Group__1_in_rule__Power__Group__06068);
            rule__Power__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0"


    // $ANTLR start "rule__Power__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3032:1: rule__Power__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3036:1: ( ( rulePrimaryExpression ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3037:1: ( rulePrimaryExpression )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3037:1: ( rulePrimaryExpression )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3038:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Power__Group__0__Impl6095);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0__Impl"


    // $ANTLR start "rule__Power__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3049:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3053:1: ( rule__Power__Group__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3054:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__16124);
            rule__Power__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1"


    // $ANTLR start "rule__Power__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3060:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3064:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3065:1: ( ( rule__Power__Group_1__0 )* )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3065:1: ( ( rule__Power__Group_1__0 )* )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3066:1: ( rule__Power__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getGroup_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3067:1: ( rule__Power__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3067:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl6151);
            	    rule__Power__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1__Impl"


    // $ANTLR start "rule__Power__Group_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3081:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3085:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3086:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__06186);
            rule__Power__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__06189);
            rule__Power__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1__0"


    // $ANTLR start "rule__Power__Group_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3093:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3097:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3098:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3098:1: ( ( rule__Power__Group_1_0__0 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3099:1: ( rule__Power__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3100:1: ( rule__Power__Group_1_0__0 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3100:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl6216);
            rule__Power__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1__0__Impl"


    // $ANTLR start "rule__Power__Group_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3110:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3114:1: ( rule__Power__Group_1__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3115:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__16246);
            rule__Power__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1__1"


    // $ANTLR start "rule__Power__Group_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3121:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3125:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3126:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3126:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3127:1: ( rule__Power__RightAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3128:1: ( rule__Power__RightAssignment_1_1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3128:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl6273);
            rule__Power__RightAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1__1__Impl"


    // $ANTLR start "rule__Power__Group_1_0__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3142:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3146:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3147:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__06307);
            rule__Power__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__06310);
            rule__Power__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__0"


    // $ANTLR start "rule__Power__Group_1_0__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3154:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3158:1: ( ( () ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3159:1: ( () )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3159:1: ( () )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3160:1: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3161:1: ()
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3163:1: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__0__Impl"


    // $ANTLR start "rule__Power__Group_1_0__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3173:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3177:1: ( rule__Power__Group_1_0__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3178:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__16368);
            rule__Power__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__1"


    // $ANTLR start "rule__Power__Group_1_0__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3184:1: rule__Power__Group_1_0__1__Impl : ( '^' ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3188:1: ( ( '^' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3189:1: ( '^' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3189:1: ( '^' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3190:1: '^'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            }
            match(input,32,FOLLOW_32_in_rule__Power__Group_1_0__1__Impl6396); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3207:1: rule__PrimaryExpression__Group_0__0 : rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 ;
    public final void rule__PrimaryExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3211:1: ( rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3212:2: rule__PrimaryExpression__Group_0__0__Impl rule__PrimaryExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__06431);
            rule__PrimaryExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__06434);
            rule__PrimaryExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0"


    // $ANTLR start "rule__PrimaryExpression__Group_0__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3219:1: rule__PrimaryExpression__Group_0__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3223:1: ( ( '(' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3224:1: ( '(' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3224:1: ( '(' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3225:1: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }
            match(input,18,FOLLOW_18_in_rule__PrimaryExpression__Group_0__0__Impl6462); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3238:1: rule__PrimaryExpression__Group_0__1 : rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 ;
    public final void rule__PrimaryExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3242:1: ( rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3243:2: rule__PrimaryExpression__Group_0__1__Impl rule__PrimaryExpression__Group_0__2
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__16493);
            rule__PrimaryExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__16496);
            rule__PrimaryExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1"


    // $ANTLR start "rule__PrimaryExpression__Group_0__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3250:1: rule__PrimaryExpression__Group_0__1__Impl : ( ruleAExpression ) ;
    public final void rule__PrimaryExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3254:1: ( ( ruleAExpression ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3255:1: ( ruleAExpression )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3255:1: ( ruleAExpression )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3256:1: ruleAExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_ruleAExpression_in_rule__PrimaryExpression__Group_0__1__Impl6523);
            ruleAExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3267:1: rule__PrimaryExpression__Group_0__2 : rule__PrimaryExpression__Group_0__2__Impl ;
    public final void rule__PrimaryExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3271:1: ( rule__PrimaryExpression__Group_0__2__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3272:2: rule__PrimaryExpression__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__26552);
            rule__PrimaryExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2"


    // $ANTLR start "rule__PrimaryExpression__Group_0__2__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3278:1: rule__PrimaryExpression__Group_0__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3282:1: ( ( ')' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3283:1: ( ')' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3283:1: ( ')' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3284:1: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }
            match(input,19,FOLLOW_19_in_rule__PrimaryExpression__Group_0__2__Impl6580); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_0__2__Impl"


    // $ANTLR start "rule__NUMBER__Group__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3303:1: rule__NUMBER__Group__0 : rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 ;
    public final void rule__NUMBER__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3307:1: ( rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3308:2: rule__NUMBER__Group__0__Impl rule__NUMBER__Group__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__0__Impl_in_rule__NUMBER__Group__06617);
            rule__NUMBER__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NUMBER__Group__1_in_rule__NUMBER__Group__06620);
            rule__NUMBER__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__0"


    // $ANTLR start "rule__NUMBER__Group__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3315:1: rule__NUMBER__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3319:1: ( ( RULE_INT ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3320:1: ( RULE_INT )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3320:1: ( RULE_INT )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3321:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group__0__Impl6647); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__0__Impl"


    // $ANTLR start "rule__NUMBER__Group__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3332:1: rule__NUMBER__Group__1 : rule__NUMBER__Group__1__Impl ;
    public final void rule__NUMBER__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3336:1: ( rule__NUMBER__Group__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3337:2: rule__NUMBER__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group__1__Impl_in_rule__NUMBER__Group__16676);
            rule__NUMBER__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__1"


    // $ANTLR start "rule__NUMBER__Group__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3343:1: rule__NUMBER__Group__1__Impl : ( ( rule__NUMBER__Group_1__0 )? ) ;
    public final void rule__NUMBER__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3347:1: ( ( ( rule__NUMBER__Group_1__0 )? ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3348:1: ( ( rule__NUMBER__Group_1__0 )? )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3348:1: ( ( rule__NUMBER__Group_1__0 )? )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3349:1: ( rule__NUMBER__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getGroup_1()); 
            }
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3350:1: ( rule__NUMBER__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3350:2: rule__NUMBER__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__NUMBER__Group_1__0_in_rule__NUMBER__Group__1__Impl6703);
                    rule__NUMBER__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group__1__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3364:1: rule__NUMBER__Group_1__0 : rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 ;
    public final void rule__NUMBER__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3368:1: ( rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3369:2: rule__NUMBER__Group_1__0__Impl rule__NUMBER__Group_1__1
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_1__0__Impl_in_rule__NUMBER__Group_1__06738);
            rule__NUMBER__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__NUMBER__Group_1__1_in_rule__NUMBER__Group_1__06741);
            rule__NUMBER__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__0"


    // $ANTLR start "rule__NUMBER__Group_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3376:1: rule__NUMBER__Group_1__0__Impl : ( '.' ) ;
    public final void rule__NUMBER__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3380:1: ( ( '.' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3381:1: ( '.' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3381:1: ( '.' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3382:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
            }
            match(input,33,FOLLOW_33_in_rule__NUMBER__Group_1__0__Impl6769); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__0__Impl"


    // $ANTLR start "rule__NUMBER__Group_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3395:1: rule__NUMBER__Group_1__1 : rule__NUMBER__Group_1__1__Impl ;
    public final void rule__NUMBER__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3399:1: ( rule__NUMBER__Group_1__1__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3400:2: rule__NUMBER__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__NUMBER__Group_1__1__Impl_in_rule__NUMBER__Group_1__16800);
            rule__NUMBER__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__1"


    // $ANTLR start "rule__NUMBER__Group_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3406:1: rule__NUMBER__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__NUMBER__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3410:1: ( ( RULE_INT ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3411:1: ( RULE_INT )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3411:1: ( RULE_INT )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3412:1: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__1__Impl6827); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NUMBER__Group_1__1__Impl"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__0"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3427:1: rule__VARIABLE_VALUE__Group_1__0 : rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1 ;
    public final void rule__VARIABLE_VALUE__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3431:1: ( rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3432:2: rule__VARIABLE_VALUE__Group_1__0__Impl rule__VARIABLE_VALUE__Group_1__1
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__0__Impl_in_rule__VARIABLE_VALUE__Group_1__06860);
            rule__VARIABLE_VALUE__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__1_in_rule__VARIABLE_VALUE__Group_1__06863);
            rule__VARIABLE_VALUE__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__0"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__0__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3439:1: rule__VARIABLE_VALUE__Group_1__0__Impl : ( RULE_ID ) ;
    public final void rule__VARIABLE_VALUE__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3443:1: ( ( RULE_ID ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3444:1: ( RULE_ID )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3444:1: ( RULE_ID )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3445:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__0__Impl6890); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__0__Impl"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3456:1: rule__VARIABLE_VALUE__Group_1__1 : rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2 ;
    public final void rule__VARIABLE_VALUE__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3460:1: ( rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2 )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3461:2: rule__VARIABLE_VALUE__Group_1__1__Impl rule__VARIABLE_VALUE__Group_1__2
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__1__Impl_in_rule__VARIABLE_VALUE__Group_1__16919);
            rule__VARIABLE_VALUE__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__2_in_rule__VARIABLE_VALUE__Group_1__16922);
            rule__VARIABLE_VALUE__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__1"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__1__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3468:1: rule__VARIABLE_VALUE__Group_1__1__Impl : ( '.' ) ;
    public final void rule__VARIABLE_VALUE__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3472:1: ( ( '.' ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3473:1: ( '.' )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3473:1: ( '.' )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3474:1: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
            }
            match(input,33,FOLLOW_33_in_rule__VARIABLE_VALUE__Group_1__1__Impl6950); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__1__Impl"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3487:1: rule__VARIABLE_VALUE__Group_1__2 : rule__VARIABLE_VALUE__Group_1__2__Impl ;
    public final void rule__VARIABLE_VALUE__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3491:1: ( rule__VARIABLE_VALUE__Group_1__2__Impl )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3492:2: rule__VARIABLE_VALUE__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__VARIABLE_VALUE__Group_1__2__Impl_in_rule__VARIABLE_VALUE__Group_1__26981);
            rule__VARIABLE_VALUE__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__2"


    // $ANTLR start "rule__VARIABLE_VALUE__Group_1__2__Impl"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3498:1: rule__VARIABLE_VALUE__Group_1__2__Impl : ( RULE_ID ) ;
    public final void rule__VARIABLE_VALUE__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3502:1: ( ( RULE_ID ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3503:1: ( RULE_ID )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3503:1: ( RULE_ID )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3504:1: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__2__Impl7008); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VARIABLE_VALUE__Group_1__2__Impl"


    // $ANTLR start "rule__Equivalent__RightAssignment_1_2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3522:1: rule__Equivalent__RightAssignment_1_2 : ( ruleEquivalent ) ;
    public final void rule__Equivalent__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3526:1: ( ( ruleEquivalent ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3527:1: ( ruleEquivalent )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3527:1: ( ruleEquivalent )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3528:1: ruleEquivalent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleEquivalent_in_rule__Equivalent__RightAssignment_1_27048);
            ruleEquivalent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Equivalent__RightAssignment_1_2"


    // $ANTLR start "rule__Implication__RightAssignment_1_2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3537:1: rule__Implication__RightAssignment_1_2 : ( ruleImplication ) ;
    public final void rule__Implication__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3541:1: ( ( ruleImplication ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3542:1: ( ruleImplication )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3542:1: ( ruleImplication )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3543:1: ruleImplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_rule__Implication__RightAssignment_1_27079);
            ruleImplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Implication__RightAssignment_1_2"


    // $ANTLR start "rule__Disjunction__RightAssignment_1_1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3552:1: rule__Disjunction__RightAssignment_1_1 : ( ruleDisjunction ) ;
    public final void rule__Disjunction__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3556:1: ( ( ruleDisjunction ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3557:1: ( ruleDisjunction )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3557:1: ( ruleDisjunction )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3558:1: ruleDisjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_rule__Disjunction__RightAssignment_1_17110);
            ruleDisjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Disjunction__RightAssignment_1_1"


    // $ANTLR start "rule__Conjunction__RightAssignment_1_2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3567:1: rule__Conjunction__RightAssignment_1_2 : ( ruleConjunction ) ;
    public final void rule__Conjunction__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3571:1: ( ( ruleConjunction ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3572:1: ( ruleConjunction )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3572:1: ( ruleConjunction )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3573:1: ruleConjunction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_rule__Conjunction__RightAssignment_1_27141);
            ruleConjunction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conjunction__RightAssignment_1_2"


    // $ANTLR start "rule__Negated__NotAssignment_1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3582:1: rule__Negated__NotAssignment_1 : ( ruleCExpression ) ;
    public final void rule__Negated__NotAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3586:1: ( ( ruleCExpression ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3587:1: ( ruleCExpression )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3587:1: ( ruleCExpression )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3588:1: ruleCExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleCExpression_in_rule__Negated__NotAssignment_17172);
            ruleCExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Negated__NotAssignment_1"


    // $ANTLR start "rule__Compare__RightAssignment_2"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3597:1: rule__Compare__RightAssignment_2 : ( ruleSomeValue ) ;
    public final void rule__Compare__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3601:1: ( ( ruleSomeValue ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3602:1: ( ruleSomeValue )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3602:1: ( ruleSomeValue )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3603:1: ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleSomeValue_in_rule__Compare__RightAssignment_27203);
            ruleSomeValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Compare__RightAssignment_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3612:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3616:1: ( ( ruleMultiplication ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3617:1: ( ruleMultiplication )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3617:1: ( ruleMultiplication )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3618:1: ruleMultiplication
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_17234);
            ruleMultiplication();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3627:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3631:1: ( ( rulePower ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3632:1: ( rulePower )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3632:1: ( rulePower )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3633:1: rulePower
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_17265);
            rulePower();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__Power__RightAssignment_1_1"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3642:1: rule__Power__RightAssignment_1_1 : ( rulePrimaryExpression ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3646:1: ( ( rulePrimaryExpression ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3647:1: ( rulePrimaryExpression )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3647:1: ( rulePrimaryExpression )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3648:1: rulePrimaryExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rule__Power__RightAssignment_1_17296);
            rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__RightAssignment_1_1"


    // $ANTLR start "rule__NumberValue__NumValueAssignment"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3657:1: rule__NumberValue__NumValueAssignment : ( ruleNUMBER ) ;
    public final void rule__NumberValue__NumValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3661:1: ( ( ruleNUMBER ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3662:1: ( ruleNUMBER )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3662:1: ( ruleNUMBER )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3663:1: ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_rule__NumberValue__NumValueAssignment7327);
            ruleNUMBER();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NumberValue__NumValueAssignment"


    // $ANTLR start "rule__BooleanValue__ValueAssignment"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3672:1: rule__BooleanValue__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanValue__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3676:1: ( ( RULE_BOOLEAN ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3677:1: ( RULE_BOOLEAN )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3677:1: ( RULE_BOOLEAN )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3678:1: RULE_BOOLEAN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7358); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValue__ValueAssignment"


    // $ANTLR start "rule__StringValue__StrValueAssignment"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3687:1: rule__StringValue__StrValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringValue__StrValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3691:1: ( ( RULE_STRING ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3692:1: ( RULE_STRING )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3692:1: ( RULE_STRING )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3693:1: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__StringValue__StrValueAssignment7389); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValue__StrValueAssignment"


    // $ANTLR start "rule__Variable__VarNameAssignment"
    // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3702:1: rule__Variable__VarNameAssignment : ( ruleVARIABLE_VALUE ) ;
    public final void rule__Variable__VarNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3706:1: ( ( ruleVARIABLE_VALUE ) )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3707:1: ( ruleVARIABLE_VALUE )
            {
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3707:1: ( ruleVARIABLE_VALUE )
            // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:3708:1: ruleVARIABLE_VALUE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_rule__Variable__VarNameAssignment7420);
            ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variable__VarNameAssignment"

    // $ANTLR start synpred1_InternalExpressions
    public final void synpred1_InternalExpressions_fragment() throws RecognitionException {   
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:682:1: ( ( ruleLExpression ) )
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:682:1: ( ruleLExpression )
        {
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:682:1: ( ruleLExpression )
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:683:1: ruleLExpression
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getLExpressionParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleLExpression_in_synpred1_InternalExpressions1394);
        ruleLExpression();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred1_InternalExpressions

    // $ANTLR start synpred4_InternalExpressions
    public final void synpred4_InternalExpressions_fragment() throws RecognitionException {   
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( ( ( rule__CExpression__Group_0__0 ) ) )
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( ( rule__CExpression__Group_0__0 ) )
        {
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:748:1: ( ( rule__CExpression__Group_0__0 ) )
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:749:1: ( rule__CExpression__Group_0__0 )
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCExpressionAccess().getGroup_0()); 
        }
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:750:1: ( rule__CExpression__Group_0__0 )
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:750:2: rule__CExpression__Group_0__0
        {
        pushFollow(FOLLOW_rule__CExpression__Group_0__0_in_synpred4_InternalExpressions1544);
        rule__CExpression__Group_0__0();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalExpressions

    // $ANTLR start synpred5_InternalExpressions
    public final void synpred5_InternalExpressions_fragment() throws RecognitionException {   
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:754:6: ( ( ruleCompare ) )
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:754:6: ( ruleCompare )
        {
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:754:6: ( ruleCompare )
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:755:1: ruleCompare
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
        }
        pushFollow(FOLLOW_ruleCompare_in_synpred5_InternalExpressions1562);
        ruleCompare();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalExpressions

    // $ANTLR start synpred6_InternalExpressions
    public final void synpred6_InternalExpressions_fragment() throws RecognitionException {   
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:760:6: ( ( ruleBooleanValue ) )
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:760:6: ( ruleBooleanValue )
        {
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:760:6: ( ruleBooleanValue )
        // ../de.upb.lina.lll.expressions.ui/src-gen/de/upb/lina/lll/ui/contentassist/antlr/internal/InternalExpressions.g:761:1: ruleBooleanValue
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
        }
        pushFollow(FOLLOW_ruleBooleanValue_in_synpred6_InternalExpressions1579);
        ruleBooleanValue();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalExpressions

    // Delegated rules

    public final boolean synpred4_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpression_in_entryRuleLExpression127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpression134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_ruleLExpression160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_entryRuleEquivalent186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquivalent193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__0_in_ruleEquivalent219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication246 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0_in_ruleImplication279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0_in_ruleDisjunction339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0_in_ruleConjunction399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Alternatives_in_ruleNegation459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegated_in_entryRuleNegated486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegated493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__Group__0_in_ruleNegated519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_entryRuleCExpression546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCExpression553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Alternatives_in_ruleCExpression579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__0_in_ruleCompare639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_entryRuleSomeValue666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeValue673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SomeValue__Alternatives_in_ruleSomeValue699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_entryRuleAExpression726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAExpression733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAExpression759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0_in_rulePower938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Alternatives_in_rulePrimaryExpression998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue1025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NumberValue__NumValueAssignment_in_ruleNumberValue1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER1085 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__0_in_ruleNUMBER1118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue1145 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BooleanValue__ValueAssignment_in_ruleBooleanValue1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue1205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue1212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__StringValue__StrValueAssignment_in_ruleStringValue1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Variable__VarNameAssignment_in_ruleVariable1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_VALUE1332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Alternatives_in_ruleVARIABLE_VALUE1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpression_in_rule__Expression__Alternatives1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_rule__Expression__Alternatives1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__0_in_rule__Disjunction__Alternatives_1_01443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__0_in_rule__Disjunction__Alternatives_1_01461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__0_in_rule__Negation__Alternatives1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_rule__Negation__Alternatives1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__0_in_rule__CExpression__Alternatives1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_rule__CExpression__Alternatives1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__CExpression__Alternatives1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__CExpression__Alternatives1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__0_in_rule__Compare__Alternatives_11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__0_in_rule__Compare__Alternatives_11646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__0_in_rule__Compare__Alternatives_11664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__0_in_rule__Compare__Alternatives_11682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__0_in_rule__Compare__Alternatives_11700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__0_in_rule__Compare__Alternatives_11718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__0_in_rule__Compare__Alternatives_11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_rule__SomeValue__Alternatives1769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_rule__SomeValue__Alternatives1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_rule__SomeValue__Alternatives1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_01835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_01853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_01886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_01904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__0_in_rule__Multiplication__Alternatives_1_01922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0_in_rule__PrimaryExpression__Alternatives1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rule__PrimaryExpression__Alternatives1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rule__PrimaryExpression__Alternatives1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Alternatives2022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__0_in_rule__VARIABLE_VALUE__Alternatives2039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__0__Impl_in_rule__Equivalent__Group__02070 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__1_in_rule__Equivalent__Group__02073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__Equivalent__Group__0__Impl2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group__1__Impl_in_rule__Equivalent__Group__12129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__0_in_rule__Equivalent__Group__1__Impl2156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__0__Impl_in_rule__Equivalent__Group_1__02191 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__1_in_rule__Equivalent__Group_1__02194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__1__Impl_in_rule__Equivalent__Group_1__12252 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__2_in_rule__Equivalent__Group_1__12255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Equivalent__Group_1__1__Impl2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__Group_1__2__Impl_in_rule__Equivalent__Group_1__22314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Equivalent__RightAssignment_1_2_in_rule__Equivalent__Group_1__2__Impl2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__0__Impl_in_rule__Implication__Group__02377 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Implication__Group__1_in_rule__Implication__Group__02380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Implication__Group__0__Impl2407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group__1__Impl_in_rule__Implication__Group__12436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__0_in_rule__Implication__Group__1__Impl2463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__0__Impl_in_rule__Implication__Group_1__02498 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__1_in_rule__Implication__Group_1__02501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__1__Impl_in_rule__Implication__Group_1__12559 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__2_in_rule__Implication__Group_1__12562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Implication__Group_1__1__Impl2590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__Group_1__2__Impl_in_rule__Implication__Group_1__22621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Implication__RightAssignment_1_2_in_rule__Implication__Group_1__2__Impl2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__0__Impl_in_rule__Disjunction__Group__02684 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1_in_rule__Disjunction__Group__02687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Disjunction__Group__0__Impl2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group__1__Impl_in_rule__Disjunction__Group__12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__0_in_rule__Disjunction__Group__1__Impl2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__0__Impl_in_rule__Disjunction__Group_1__02805 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__1_in_rule__Disjunction__Group_1__02808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Alternatives_1_0_in_rule__Disjunction__Group_1__0__Impl2835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1__1__Impl_in_rule__Disjunction__Group_1__12865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__RightAssignment_1_1_in_rule__Disjunction__Group_1__1__Impl2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__0__Impl_in_rule__Disjunction__Group_1_0_0__02926 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__1_in_rule__Disjunction__Group_1_0_0__02929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_0__1__Impl_in_rule__Disjunction__Group_1_0_0__12987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Disjunction__Group_1_0_0__1__Impl3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__0__Impl_in_rule__Disjunction__Group_1_0_1__03050 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__1_in_rule__Disjunction__Group_1_0_1__03053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Disjunction__Group_1_0_1__1__Impl_in_rule__Disjunction__Group_1_0_1__13111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Disjunction__Group_1_0_1__1__Impl3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__0__Impl_in_rule__Conjunction__Group__03174 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1_in_rule__Conjunction__Group__03177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_rule__Conjunction__Group__0__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group__1__Impl_in_rule__Conjunction__Group__13233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0_in_rule__Conjunction__Group__1__Impl3260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__0__Impl_in_rule__Conjunction__Group_1__03295 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1_in_rule__Conjunction__Group_1__03298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__1__Impl_in_rule__Conjunction__Group_1__13356 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2_in_rule__Conjunction__Group_1__13359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Conjunction__Group_1__1__Impl3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__Group_1__2__Impl_in_rule__Conjunction__Group_1__23418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Conjunction__RightAssignment_1_2_in_rule__Conjunction__Group_1__2__Impl3445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__0__Impl_in_rule__Negation__Group_0__03481 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__1_in_rule__Negation__Group_0__03484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Negation__Group_0__0__Impl3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negation__Group_0__1__Impl_in_rule__Negation__Group_0__13543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegated_in_rule__Negation__Group_0__1__Impl3570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__Group__0__Impl_in_rule__Negated__Group__03603 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__Negated__Group__1_in_rule__Negated__Group__03606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__Group__1__Impl_in_rule__Negated__Group__13664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Negated__NotAssignment_1_in_rule__Negated__Group__1__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__0__Impl_in_rule__CExpression__Group_0__03725 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__1_in_rule__CExpression__Group_0__03728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__CExpression__Group_0__0__Impl3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__1__Impl_in_rule__CExpression__Group_0__13787 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__2_in_rule__CExpression__Group_0__13790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpression_in_rule__CExpression__Group_0__1__Impl3817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__2__Impl_in_rule__CExpression__Group_0__23846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__CExpression__Group_0__2__Impl3874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__0__Impl_in_rule__Compare__Group__03911 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__Compare__Group__1_in_rule__Compare__Group__03914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_rule__Compare__Group__0__Impl3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__1__Impl_in_rule__Compare__Group__13970 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__Compare__Group__2_in_rule__Compare__Group__13973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Alternatives_1_in_rule__Compare__Group__1__Impl4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group__2__Impl_in_rule__Compare__Group__24030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__RightAssignment_2_in_rule__Compare__Group__2__Impl4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__0__Impl_in_rule__Compare__Group_1_0__04093 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__1_in_rule__Compare__Group_1_0__04096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_0__1__Impl_in_rule__Compare__Group_1_0__14154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Compare__Group_1_0__1__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__0__Impl_in_rule__Compare__Group_1_1__04217 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__1_in_rule__Compare__Group_1_1__04220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_1__1__Impl_in_rule__Compare__Group_1_1__14278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Compare__Group_1_1__1__Impl4306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__0__Impl_in_rule__Compare__Group_1_2__04341 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__1_in_rule__Compare__Group_1_2__04344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_2__1__Impl_in_rule__Compare__Group_1_2__14402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Compare__Group_1_2__1__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__0__Impl_in_rule__Compare__Group_1_3__04465 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__1_in_rule__Compare__Group_1_3__04468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_3__1__Impl_in_rule__Compare__Group_1_3__14526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Compare__Group_1_3__1__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__0__Impl_in_rule__Compare__Group_1_4__04589 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__1_in_rule__Compare__Group_1_4__04592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_4__1__Impl_in_rule__Compare__Group_1_4__14650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Compare__Group_1_4__1__Impl4678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__0__Impl_in_rule__Compare__Group_1_5__04713 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__1_in_rule__Compare__Group_1_5__04716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_5__1__Impl_in_rule__Compare__Group_1_5__14774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Compare__Group_1_5__1__Impl4802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__0__Impl_in_rule__Compare__Group_1_6__04837 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__1_in_rule__Compare__Group_1_6__04840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Compare__Group_1_6__1__Impl_in_rule__Compare__Group_1_6__14898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Compare__Group_1_6__1__Impl4926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__04961 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__04964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl4991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__15020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl5047 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__05082 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__05085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl5112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__15142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__05203 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__05206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__15264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Addition__Group_1_0_0__1__Impl5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__05327 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__05330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__15388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Addition__Group_1_0_1__1__Impl5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__05451 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__05454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__15510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl5537 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__05572 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__05575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl5602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__15632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl5659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__05693 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__05696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__15754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Multiplication__Group_1_0_0__1__Impl5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__05817 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__05820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__15878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Multiplication__Group_1_0_1__1__Impl5906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__0__Impl_in_rule__Multiplication__Group_1_0_2__05941 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__1_in_rule__Multiplication__Group_1_0_2__05944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_2__1__Impl_in_rule__Multiplication__Group_1_0_2__16002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Multiplication__Group_1_0_2__1__Impl6030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__06065 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Power__Group__1_in_rule__Power__Group__06068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Power__Group__0__Impl6095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__16124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl6151 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__06186 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__06189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__16246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__06307 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__06310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__16368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Power__Group_1_0__1__Impl6396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__0__Impl_in_rule__PrimaryExpression__Group_0__06431 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1_in_rule__PrimaryExpression__Group_0__06434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PrimaryExpression__Group_0__0__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__1__Impl_in_rule__PrimaryExpression__Group_0__16493 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2_in_rule__PrimaryExpression__Group_0__16496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_rule__PrimaryExpression__Group_0__1__Impl6523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrimaryExpression__Group_0__2__Impl_in_rule__PrimaryExpression__Group_0__26552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PrimaryExpression__Group_0__2__Impl6580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__0__Impl_in_rule__NUMBER__Group__06617 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__1_in_rule__NUMBER__Group__06620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group__0__Impl6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group__1__Impl_in_rule__NUMBER__Group__16676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__0_in_rule__NUMBER__Group__1__Impl6703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__0__Impl_in_rule__NUMBER__Group_1__06738 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__1_in_rule__NUMBER__Group_1__06741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NUMBER__Group_1__0__Impl6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NUMBER__Group_1__1__Impl_in_rule__NUMBER__Group_1__16800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__NUMBER__Group_1__1__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__0__Impl_in_rule__VARIABLE_VALUE__Group_1__06860 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__1_in_rule__VARIABLE_VALUE__Group_1__06863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__0__Impl6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__1__Impl_in_rule__VARIABLE_VALUE__Group_1__16919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__2_in_rule__VARIABLE_VALUE__Group_1__16922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__VARIABLE_VALUE__Group_1__1__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VARIABLE_VALUE__Group_1__2__Impl_in_rule__VARIABLE_VALUE__Group_1__26981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VARIABLE_VALUE__Group_1__2__Impl7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_rule__Equivalent__RightAssignment_1_27048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_rule__Implication__RightAssignment_1_27079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_rule__Disjunction__RightAssignment_1_17110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_rule__Conjunction__RightAssignment_1_27141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_rule__Negated__NotAssignment_17172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_rule__Compare__RightAssignment_27203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_17234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_17265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rule__Power__RightAssignment_1_17296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_rule__NumberValue__NumValueAssignment7327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__BooleanValue__ValueAssignment7358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__StringValue__StrValueAssignment7389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_rule__Variable__VarNameAssignment7420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpression_in_synpred1_InternalExpressions1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__CExpression__Group_0__0_in_synpred4_InternalExpressions1544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_synpred5_InternalExpressions1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_synpred6_InternalExpressions1579 = new BitSet(new long[]{0x0000000000000002L});

}