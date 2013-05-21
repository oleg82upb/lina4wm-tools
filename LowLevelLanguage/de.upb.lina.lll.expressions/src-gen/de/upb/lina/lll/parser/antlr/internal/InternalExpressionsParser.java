package de.upb.lina.lll.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.upb.lina.lll.services.ExpressionsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalExpressionsParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'equiv'", "'imply'", "'or'", "'xor'", "'and'", "'not'", "'('", "')'", "'<='", "'<'", "'>='", "'>'", "'='", "'!='", "'~'", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'.'"
    };
    public static final int RULE_BOOLEAN=5;
    public static final int RULE_ID=7;
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
    public static final int RULE_STRING=6;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=4;
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
    public String getGrammarFileName() { return "../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g"; }



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */
     
     	private ExpressionsGrammarAccess grammarAccess;
     	
        public InternalExpressionsParser(TokenStream input, ExpressionsGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Expression";	
       	}
       	
       	@Override
       	protected ExpressionsGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:73:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:74:2: (iv_ruleExpression= ruleExpression EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:75:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression81);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression91); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:82:1: ruleExpression returns [EObject current=null] : (this_LExpression_0= ruleLExpression | this_AExpression_1= ruleAExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_LExpression_0 = null;

        EObject this_AExpression_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:85:28: ( (this_LExpression_0= ruleLExpression | this_AExpression_1= ruleAExpression ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:86:1: (this_LExpression_0= ruleLExpression | this_AExpression_1= ruleAExpression )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:86:1: (this_LExpression_0= ruleLExpression | this_AExpression_1= ruleAExpression )
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
                    if (state.backtracking>0) {state.failed=true; return current;}
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
                    if (state.backtracking>0) {state.failed=true; return current;}
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
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 6, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:87:2: this_LExpression_0= ruleLExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getLExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLExpression_in_ruleExpression141);
                    this_LExpression_0=ruleLExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:100:2: this_AExpression_1= ruleAExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getExpressionAccess().getAExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAExpression_in_ruleExpression171);
                    this_AExpression_1=ruleAExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleLExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:119:1: entryRuleLExpression returns [EObject current=null] : iv_ruleLExpression= ruleLExpression EOF ;
    public final EObject entryRuleLExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLExpression = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:120:2: (iv_ruleLExpression= ruleLExpression EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:121:2: iv_ruleLExpression= ruleLExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLExpression_in_entryRuleLExpression206);
            iv_ruleLExpression=ruleLExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLExpression216); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLExpression"


    // $ANTLR start "ruleLExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:128:1: ruleLExpression returns [EObject current=null] : this_Equivalent_0= ruleEquivalent ;
    public final EObject ruleLExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Equivalent_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:131:28: (this_Equivalent_0= ruleEquivalent )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:133:2: this_Equivalent_0= ruleEquivalent
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getLExpressionAccess().getEquivalentParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleEquivalent_in_ruleLExpression265);
            this_Equivalent_0=ruleEquivalent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Equivalent_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLExpression"


    // $ANTLR start "entryRuleEquivalent"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:152:1: entryRuleEquivalent returns [EObject current=null] : iv_ruleEquivalent= ruleEquivalent EOF ;
    public final EObject entryRuleEquivalent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquivalent = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:153:2: (iv_ruleEquivalent= ruleEquivalent EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:154:2: iv_ruleEquivalent= ruleEquivalent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEquivalentRule()); 
            }
            pushFollow(FOLLOW_ruleEquivalent_in_entryRuleEquivalent299);
            iv_ruleEquivalent=ruleEquivalent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquivalent; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEquivalent309); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEquivalent"


    // $ANTLR start "ruleEquivalent"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:161:1: ruleEquivalent returns [EObject current=null] : (this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? ) ;
    public final EObject ruleEquivalent() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Implication_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:164:28: ( (this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:165:1: (this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:165:1: (this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )? )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:166:2: this_Implication_0= ruleImplication ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEquivalentAccess().getImplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleEquivalent359);
            this_Implication_0=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Implication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:177:1: ( () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:177:2: () otherlv_2= 'equiv' ( (lv_right_3_0= ruleEquivalent ) )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:177:2: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:178:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getEquivalentAccess().getEquivalentLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleEquivalent383); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getEquivalentAccess().getEquivKeyword_1_1());
                          
                    }
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:190:1: ( (lv_right_3_0= ruleEquivalent ) )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:191:1: (lv_right_3_0= ruleEquivalent )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:191:1: (lv_right_3_0= ruleEquivalent )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:192:3: lv_right_3_0= ruleEquivalent
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEquivalentAccess().getRightEquivalentParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleEquivalent_in_ruleEquivalent404);
                    lv_right_3_0=ruleEquivalent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getEquivalentRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Equivalent");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEquivalent"


    // $ANTLR start "entryRuleImplication"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:216:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:217:2: (iv_ruleImplication= ruleImplication EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:218:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication442);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication452); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:225:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )? ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Disjunction_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:228:28: ( (this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )? ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:229:1: (this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )? )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:229:1: (this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )? )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:230:2: this_Disjunction_0= ruleDisjunction ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication502);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:241:1: ( () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:241:2: () otherlv_2= 'imply' ( (lv_right_3_0= ruleImplication ) )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:241:2: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:242:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImplicationAccess().getImplyLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleImplication526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImplicationAccess().getImplyKeyword_1_1());
                          
                    }
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:254:1: ( (lv_right_3_0= ruleImplication ) )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:255:1: (lv_right_3_0= ruleImplication )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:255:1: (lv_right_3_0= ruleImplication )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:256:3: lv_right_3_0= ruleImplication
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightImplicationParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImplication_in_ruleImplication547);
                    lv_right_3_0=ruleImplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImplicationRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Implication");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:280:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:281:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:282:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction585);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction595); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:289:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Conjunction_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:292:28: ( (this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:293:1: (this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:293:1: (this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )? )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:294:2: this_Conjunction_0= ruleConjunction ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction645);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:305:1: ( ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=14 && LA5_0<=15)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:305:2: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) ) ( (lv_right_5_0= ruleDisjunction ) )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:305:2: ( ( () otherlv_2= 'or' ) | ( () otherlv_4= 'xor' ) )
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==14) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==15) ) {
                        alt4=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 0, input);

                        throw nvae;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:305:3: ( () otherlv_2= 'or' )
                            {
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:305:3: ( () otherlv_2= 'or' )
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:305:4: () otherlv_2= 'or'
                            {
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:305:4: ()
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:306:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getDisjunctionAccess().getOrLeftAction_1_0_0_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_2=(Token)match(input,14,FOLLOW_14_in_ruleDisjunction671); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_2, grammarAccess.getDisjunctionAccess().getOrKeyword_1_0_0_1());
                                  
                            }

                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:319:6: ( () otherlv_4= 'xor' )
                            {
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:319:6: ( () otherlv_4= 'xor' )
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:319:7: () otherlv_4= 'xor'
                            {
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:319:7: ()
                            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:320:2: 
                            {
                            if ( state.backtracking==0 ) {
                               
                              	  /* */ 
                              	
                            }
                            if ( state.backtracking==0 ) {

                                      current = forceCreateModelElementAndSet(
                                          grammarAccess.getDisjunctionAccess().getXorLeftAction_1_0_1_0(),
                                          current);
                                  
                            }

                            }

                            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleDisjunction703); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                                  	newLeafNode(otherlv_4, grammarAccess.getDisjunctionAccess().getXorKeyword_1_0_1_1());
                                  
                            }

                            }


                            }
                            break;

                    }

                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:332:3: ( (lv_right_5_0= ruleDisjunction ) )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:333:1: (lv_right_5_0= ruleDisjunction )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:333:1: (lv_right_5_0= ruleDisjunction )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:334:3: lv_right_5_0= ruleDisjunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightDisjunctionParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDisjunction_in_ruleDisjunction726);
                    lv_right_5_0=ruleDisjunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_5_0, 
                              		"Disjunction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:358:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:359:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:360:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction764);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction774); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:367:1: ruleConjunction returns [EObject current=null] : (this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )? ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Negation_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:370:28: ( (this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )? ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:371:1: (this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )? )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:371:1: (this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )? )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:372:2: this_Negation_0= ruleNegation ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )?
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getNegationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNegation_in_ruleConjunction824);
            this_Negation_0=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Negation_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:383:1: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:383:2: () otherlv_2= 'and' ( (lv_right_3_0= ruleConjunction ) )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:383:2: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:384:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getConjunctionAccess().getAndLeftAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleConjunction848); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getConjunctionAccess().getAndKeyword_1_1());
                          
                    }
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:396:1: ( (lv_right_3_0= ruleConjunction ) )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:397:1: (lv_right_3_0= ruleConjunction )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:397:1: (lv_right_3_0= ruleConjunction )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:398:3: lv_right_3_0= ruleConjunction
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleConjunction_in_ruleConjunction869);
                    lv_right_3_0=ruleConjunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"Conjunction");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleNegation"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:422:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:423:2: (iv_ruleNegation= ruleNegation EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:424:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation907);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation917); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:431:1: ruleNegation returns [EObject current=null] : ( (otherlv_0= 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_Negated_1 = null;

        EObject this_CExpression_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:434:28: ( ( (otherlv_0= 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:435:1: ( (otherlv_0= 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:435:1: ( (otherlv_0= 'not' this_Negated_1= ruleNegated ) | this_CExpression_2= ruleCExpression )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==17) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=RULE_INT && LA7_0<=RULE_ID)||LA7_0==18) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:435:2: (otherlv_0= 'not' this_Negated_1= ruleNegated )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:435:2: (otherlv_0= 'not' this_Negated_1= ruleNegated )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:435:4: otherlv_0= 'not' this_Negated_1= ruleNegated
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleNegation955); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getNegationAccess().getNotKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegationAccess().getNegatedParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegated_in_ruleNegation980);
                    this_Negated_1=ruleNegated();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Negated_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:453:2: this_CExpression_2= ruleCExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNegationAccess().getCExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCExpression_in_ruleNegation1011);
                    this_CExpression_2=ruleCExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleNegated"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:472:1: entryRuleNegated returns [EObject current=null] : iv_ruleNegated= ruleNegated EOF ;
    public final EObject entryRuleNegated() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegated = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:473:2: (iv_ruleNegated= ruleNegated EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:474:2: iv_ruleNegated= ruleNegated EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegatedRule()); 
            }
            pushFollow(FOLLOW_ruleNegated_in_entryRuleNegated1046);
            iv_ruleNegated=ruleNegated();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegated; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegated1056); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNegated"


    // $ANTLR start "ruleNegated"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:481:1: ruleNegated returns [EObject current=null] : ( () ( (lv_not_1_0= ruleCExpression ) ) ) ;
    public final EObject ruleNegated() throws RecognitionException {
        EObject current = null;

        EObject lv_not_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:484:28: ( ( () ( (lv_not_1_0= ruleCExpression ) ) ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:485:1: ( () ( (lv_not_1_0= ruleCExpression ) ) )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:485:1: ( () ( (lv_not_1_0= ruleCExpression ) ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:485:2: () ( (lv_not_1_0= ruleCExpression ) )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:485:2: ()
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:486:2: 
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNegatedAccess().getNotAction_0(),
                          current);
                  
            }

            }

            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:494:2: ( (lv_not_1_0= ruleCExpression ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:495:1: (lv_not_1_0= ruleCExpression )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:495:1: (lv_not_1_0= ruleCExpression )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:496:3: lv_not_1_0= ruleCExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegatedAccess().getNotCExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCExpression_in_ruleNegated1114);
            lv_not_1_0=ruleCExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegatedRule());
              	        }
                     		set(
                     			current, 
                     			"not",
                      		lv_not_1_0, 
                      		"CExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNegated"


    // $ANTLR start "entryRuleCExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:520:1: entryRuleCExpression returns [EObject current=null] : iv_ruleCExpression= ruleCExpression EOF ;
    public final EObject entryRuleCExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCExpression = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:521:2: (iv_ruleCExpression= ruleCExpression EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:522:2: iv_ruleCExpression= ruleCExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleCExpression_in_entryRuleCExpression1150);
            iv_ruleCExpression=ruleCExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCExpression1160); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCExpression"


    // $ANTLR start "ruleCExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:529:1: ruleCExpression returns [EObject current=null] : ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable ) ;
    public final EObject ruleCExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_LExpression_1 = null;

        EObject this_Compare_3 = null;

        EObject this_BooleanValue_4 = null;

        EObject this_Variable_5 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:532:28: ( ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:533:1: ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:533:1: ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) | this_Compare_3= ruleCompare | this_BooleanValue_4= ruleBooleanValue | this_Variable_5= ruleVariable )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                int LA8_1 = input.LA(2);

                if ( (synpred8_InternalExpressions()) ) {
                    alt8=1;
                }
                else if ( (synpred9_InternalExpressions()) ) {
                    alt8=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case RULE_STRING:
                {
                alt8=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                int LA8_3 = input.LA(2);

                if ( (synpred9_InternalExpressions()) ) {
                    alt8=2;
                }
                else if ( (synpred10_InternalExpressions()) ) {
                    alt8=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 3, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA8_5 = input.LA(2);

                if ( (synpred9_InternalExpressions()) ) {
                    alt8=2;
                }
                else if ( (true) ) {
                    alt8=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:533:2: (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:533:2: (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:533:4: otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleCExpression1198); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getCExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCExpressionAccess().getLExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLExpression_in_ruleCExpression1223);
                    this_LExpression_1=ruleLExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleCExpression1234); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:555:2: this_Compare_3= ruleCompare
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCExpressionAccess().getCompareParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompare_in_ruleCExpression1266);
                    this_Compare_3=ruleCompare();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Compare_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:568:2: this_BooleanValue_4= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCExpressionAccess().getBooleanValueParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleCExpression1296);
                    this_BooleanValue_4=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanValue_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:581:2: this_Variable_5= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getCExpressionAccess().getVariableParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_ruleCExpression1326);
                    this_Variable_5=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCExpression"


    // $ANTLR start "entryRuleCompare"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:600:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:601:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:602:2: iv_ruleCompare= ruleCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompareRule()); 
            }
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare1361);
            iv_ruleCompare=ruleCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompare; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare1371); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompare"


    // $ANTLR start "ruleCompare"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:609:1: ruleCompare returns [EObject current=null] : (this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject this_SomeValue_0 = null;

        EObject lv_right_15_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:612:28: ( (this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:613:1: (this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:613:1: (this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:614:2: this_SomeValue_0= ruleSomeValue ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) ) ( (lv_right_15_0= ruleSomeValue ) )
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCompareAccess().getSomeValueParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleSomeValue_in_ruleCompare1421);
            this_SomeValue_0=ruleSomeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_SomeValue_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:625:1: ( ( () otherlv_2= '<=' ) | ( () otherlv_4= '<' ) | ( () otherlv_6= '>=' ) | ( () otherlv_8= '>' ) | ( () otherlv_10= '=' ) | ( () otherlv_12= '!=' ) | ( () otherlv_14= '~' ) )
            int alt9=7;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt9=1;
                }
                break;
            case 21:
                {
                alt9=2;
                }
                break;
            case 22:
                {
                alt9=3;
                }
                break;
            case 23:
                {
                alt9=4;
                }
                break;
            case 24:
                {
                alt9=5;
                }
                break;
            case 25:
                {
                alt9=6;
                }
                break;
            case 26:
                {
                alt9=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:625:2: ( () otherlv_2= '<=' )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:625:2: ( () otherlv_2= '<=' )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:625:3: () otherlv_2= '<='
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:625:3: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:626:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getLessOrEqualLeftAction_1_0_0(),
                                  current);
                          
                    }

                    }

                    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCompare1446); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getLessThanSignEqualsSignKeyword_1_0_1());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:639:6: ( () otherlv_4= '<' )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:639:6: ( () otherlv_4= '<' )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:639:7: () otherlv_4= '<'
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:639:7: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:640:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getLessLeftAction_1_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCompare1478); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getLessThanSignKeyword_1_1_1());
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:653:6: ( () otherlv_6= '>=' )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:653:6: ( () otherlv_6= '>=' )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:653:7: () otherlv_6= '>='
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:653:7: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:654:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getGreaterOrEqualLeftAction_1_2_0(),
                                  current);
                          
                    }

                    }

                    otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleCompare1510); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getCompareAccess().getGreaterThanSignEqualsSignKeyword_1_2_1());
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:667:6: ( () otherlv_8= '>' )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:667:6: ( () otherlv_8= '>' )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:667:7: () otherlv_8= '>'
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:667:7: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:668:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getGreaterLeftAction_1_3_0(),
                                  current);
                          
                    }

                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleCompare1542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getCompareAccess().getGreaterThanSignKeyword_1_3_1());
                          
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:681:6: ( () otherlv_10= '=' )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:681:6: ( () otherlv_10= '=' )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:681:7: () otherlv_10= '='
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:681:7: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:682:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getEqualLeftAction_1_4_0(),
                                  current);
                          
                    }

                    }

                    otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleCompare1574); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getCompareAccess().getEqualsSignKeyword_1_4_1());
                          
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:695:6: ( () otherlv_12= '!=' )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:695:6: ( () otherlv_12= '!=' )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:695:7: () otherlv_12= '!='
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:695:7: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:696:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getUnequalLeftAction_1_5_0(),
                                  current);
                          
                    }

                    }

                    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleCompare1606); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getCompareAccess().getExclamationMarkEqualsSignKeyword_1_5_1());
                          
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:709:6: ( () otherlv_14= '~' )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:709:6: ( () otherlv_14= '~' )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:709:7: () otherlv_14= '~'
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:709:7: ()
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:710:2: 
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getCompareAccess().getApproxLeftAction_1_6_0(),
                                  current);
                          
                    }

                    }

                    otherlv_14=(Token)match(input,26,FOLLOW_26_in_ruleCompare1638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getCompareAccess().getTildeKeyword_1_6_1());
                          
                    }

                    }


                    }
                    break;

            }

            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:722:3: ( (lv_right_15_0= ruleSomeValue ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:723:1: (lv_right_15_0= ruleSomeValue )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:723:1: (lv_right_15_0= ruleSomeValue )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:724:3: lv_right_15_0= ruleSomeValue
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompareAccess().getRightSomeValueParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSomeValue_in_ruleCompare1661);
            lv_right_15_0=ruleSomeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompareRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_15_0, 
                      		"SomeValue");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleSomeValue"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:748:1: entryRuleSomeValue returns [EObject current=null] : iv_ruleSomeValue= ruleSomeValue EOF ;
    public final EObject entryRuleSomeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSomeValue = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:749:2: (iv_ruleSomeValue= ruleSomeValue EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:750:2: iv_ruleSomeValue= ruleSomeValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSomeValueRule()); 
            }
            pushFollow(FOLLOW_ruleSomeValue_in_entryRuleSomeValue1697);
            iv_ruleSomeValue=ruleSomeValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSomeValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSomeValue1707); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSomeValue"


    // $ANTLR start "ruleSomeValue"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:757:1: ruleSomeValue returns [EObject current=null] : (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression ) ;
    public final EObject ruleSomeValue() throws RecognitionException {
        EObject current = null;

        EObject this_StringValue_0 = null;

        EObject this_BooleanValue_1 = null;

        EObject this_AExpression_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:760:28: ( (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:761:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:761:1: (this_StringValue_0= ruleStringValue | this_BooleanValue_1= ruleBooleanValue | this_AExpression_2= ruleAExpression )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt10=1;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt10=2;
                }
                break;
            case RULE_INT:
            case RULE_ID:
            case 18:
                {
                alt10=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:762:2: this_StringValue_0= ruleStringValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSomeValueAccess().getStringValueParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringValue_in_ruleSomeValue1757);
                    this_StringValue_0=ruleStringValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringValue_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:775:2: this_BooleanValue_1= ruleBooleanValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSomeValueAccess().getBooleanValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanValue_in_ruleSomeValue1787);
                    this_BooleanValue_1=ruleBooleanValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanValue_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:788:2: this_AExpression_2= ruleAExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getSomeValueAccess().getAExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAExpression_in_ruleSomeValue1817);
                    this_AExpression_2=ruleAExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSomeValue"


    // $ANTLR start "entryRuleAExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:807:1: entryRuleAExpression returns [EObject current=null] : iv_ruleAExpression= ruleAExpression EOF ;
    public final EObject entryRuleAExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAExpression = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:808:2: (iv_ruleAExpression= ruleAExpression EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:809:2: iv_ruleAExpression= ruleAExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAExpression_in_entryRuleAExpression1852);
            iv_ruleAExpression=ruleAExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAExpression1862); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAExpression"


    // $ANTLR start "ruleAExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:816:1: ruleAExpression returns [EObject current=null] : this_Addition_0= ruleAddition ;
    public final EObject ruleAExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Addition_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:819:28: (this_Addition_0= ruleAddition )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:821:2: this_Addition_0= ruleAddition
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAExpressionAccess().getAdditionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAddition_in_ruleAExpression1911);
            this_Addition_0=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Addition_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAExpression"


    // $ANTLR start "entryRuleAddition"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:840:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:841:2: (iv_ruleAddition= ruleAddition EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:842:2: iv_ruleAddition= ruleAddition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionRule()); 
            }
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1945);
            iv_ruleAddition=ruleAddition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAddition; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1955); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:849:1: ruleAddition returns [EObject current=null] : (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Multiplication_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:852:28: ( (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:853:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:853:1: (this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )* )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:854:2: this_Multiplication_0= ruleMultiplication ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2005);
            this_Multiplication_0=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Multiplication_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:865:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=27 && LA12_0<=28)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:865:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMultiplication ) )
            	    {
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:865:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==27) ) {
            	        alt11=1;
            	    }
            	    else if ( (LA11_0==28) ) {
            	        alt11=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:865:3: ( () otherlv_2= '+' )
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:865:3: ( () otherlv_2= '+' )
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:865:4: () otherlv_2= '+'
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:865:4: ()
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:866:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAddition2031); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:879:6: ( () otherlv_4= '-' )
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:879:6: ( () otherlv_4= '-' )
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:879:7: () otherlv_4= '-'
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:879:7: ()
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:880:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAddition2063); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:892:3: ( (lv_right_5_0= ruleMultiplication ) )
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:893:1: (lv_right_5_0= ruleMultiplication )
            	    {
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:893:1: (lv_right_5_0= ruleMultiplication )
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:894:3: lv_right_5_0= ruleMultiplication
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplication_in_ruleAddition2086);
            	    lv_right_5_0=ruleMultiplication();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_5_0, 
            	              		"Multiplication");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:918:1: entryRuleMultiplication returns [EObject current=null] : iv_ruleMultiplication= ruleMultiplication EOF ;
    public final EObject entryRuleMultiplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplication = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:919:2: (iv_ruleMultiplication= ruleMultiplication EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:920:2: iv_ruleMultiplication= ruleMultiplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication2124);
            iv_ruleMultiplication=ruleMultiplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication2134); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:927:1: ruleMultiplication returns [EObject current=null] : (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )* ) ;
    public final EObject ruleMultiplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_Power_0 = null;

        EObject lv_right_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:930:28: ( (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )* ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:931:1: (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )* )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:931:1: (this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )* )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:932:2: this_Power_0= rulePower ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePower_in_ruleMultiplication2184);
            this_Power_0=rulePower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Power_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:943:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=29 && LA14_0<=31)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:943:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) ) ( (lv_right_7_0= rulePower ) )
            	    {
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:943:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) | ( () otherlv_6= '%' ) )
            	    int alt13=3;
            	    switch ( input.LA(1) ) {
            	    case 29:
            	        {
            	        alt13=1;
            	        }
            	        break;
            	    case 30:
            	        {
            	        alt13=2;
            	        }
            	        break;
            	    case 31:
            	        {
            	        alt13=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt13) {
            	        case 1 :
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:943:3: ( () otherlv_2= '*' )
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:943:3: ( () otherlv_2= '*' )
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:943:4: () otherlv_2= '*'
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:943:4: ()
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:944:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,29,FOLLOW_29_in_ruleMultiplication2210); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:957:6: ( () otherlv_4= '/' )
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:957:6: ( () otherlv_4= '/' )
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:957:7: () otherlv_4= '/'
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:957:7: ()
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:958:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleMultiplication2242); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:971:6: ( () otherlv_6= '%' )
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:971:6: ( () otherlv_6= '%' )
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:971:7: () otherlv_6= '%'
            	            {
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:971:7: ()
            	            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:972:2: 
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	  /* */ 
            	              	
            	            }
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMultiplicationAccess().getModLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleMultiplication2274); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_6, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_0_2_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:984:3: ( (lv_right_7_0= rulePower ) )
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:985:1: (lv_right_7_0= rulePower )
            	    {
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:985:1: (lv_right_7_0= rulePower )
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:986:3: lv_right_7_0= rulePower
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePower_in_ruleMultiplication2297);
            	    lv_right_7_0=rulePower();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_7_0, 
            	              		"Power");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePower"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1010:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1011:2: (iv_rulePower= rulePower EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1012:2: iv_rulePower= rulePower EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPowerRule()); 
            }
            pushFollow(FOLLOW_rulePower_in_entryRulePower2335);
            iv_rulePower=rulePower();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePower; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePower2345); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1019:1: rulePower returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1022:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1023:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1023:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1024:2: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
              	  /* */ 
              	
            }
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getPowerAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_rulePower2395);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1035:1: ( ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1035:2: ( () otherlv_2= '^' ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1035:2: ( () otherlv_2= '^' )
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1035:3: () otherlv_2= '^'
            	    {
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1035:3: ()
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1036:2: 
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	  /* */ 
            	      	
            	    }
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getPowerAccess().getPowLeftAction_1_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,32,FOLLOW_32_in_rulePower2420); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1());
            	          
            	    }

            	    }

            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1048:2: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1049:1: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1049:1: (lv_right_3_0= rulePrimaryExpression )
            	    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1050:3: lv_right_3_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPowerAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePower2442);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPowerRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"PrimaryExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1074:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1075:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1076:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2480);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression2490); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1083:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_AExpression_1 = null;

        EObject this_NumberValue_3 = null;

        EObject this_Variable_4 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1086:28: ( ( (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1087:1: ( (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1087:1: ( (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' ) | this_NumberValue_3= ruleNumberValue | this_Variable_4= ruleVariable )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt16=1;
                }
                break;
            case RULE_INT:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
                {
                alt16=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1087:2: (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1087:2: (otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')' )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1087:4: otherlv_0= '(' this_AExpression_1= ruleAExpression otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_rulePrimaryExpression2528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAExpressionParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAExpression_in_rulePrimaryExpression2553);
                    this_AExpression_1=ruleAExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,19,FOLLOW_19_in_rulePrimaryExpression2564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1109:2: this_NumberValue_3= ruleNumberValue
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getNumberValueParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberValue_in_rulePrimaryExpression2596);
                    this_NumberValue_3=ruleNumberValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberValue_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1122:2: this_Variable_4= ruleVariable
                    {
                    if ( state.backtracking==0 ) {
                       
                      	  /* */ 
                      	
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVariable_in_rulePrimaryExpression2626);
                    this_Variable_4=ruleVariable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Variable_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleNumberValue"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1141:1: entryRuleNumberValue returns [EObject current=null] : iv_ruleNumberValue= ruleNumberValue EOF ;
    public final EObject entryRuleNumberValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberValue = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1142:2: (iv_ruleNumberValue= ruleNumberValue EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1143:2: iv_ruleNumberValue= ruleNumberValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberValueRule()); 
            }
            pushFollow(FOLLOW_ruleNumberValue_in_entryRuleNumberValue2661);
            iv_ruleNumberValue=ruleNumberValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberValue2671); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberValue"


    // $ANTLR start "ruleNumberValue"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1150:1: ruleNumberValue returns [EObject current=null] : ( (lv_numValue_0_0= ruleNUMBER ) ) ;
    public final EObject ruleNumberValue() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_numValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1153:28: ( ( (lv_numValue_0_0= ruleNUMBER ) ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1154:1: ( (lv_numValue_0_0= ruleNUMBER ) )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1154:1: ( (lv_numValue_0_0= ruleNUMBER ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1155:1: (lv_numValue_0_0= ruleNUMBER )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1155:1: (lv_numValue_0_0= ruleNUMBER )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1156:3: lv_numValue_0_0= ruleNUMBER
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberValueAccess().getNumValueNUMBERParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNUMBER_in_ruleNumberValue2716);
            lv_numValue_0_0=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberValueRule());
              	        }
                     		set(
                     			current, 
                     			"numValue",
                      		lv_numValue_0_0, 
                      		"NUMBER");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberValue"


    // $ANTLR start "entryRuleNUMBER"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1180:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1181:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1182:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMBERRule()); 
            }
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER2752);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMBER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER2763); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMBER"


    // $ANTLR start "ruleNUMBER"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1189:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1192:28: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1193:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1193:1: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1193:6: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER2803); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_0, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_0()); 
                  
            }
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1200:1: (kw= '.' this_INT_2= RULE_INT )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1201:2: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleNUMBER2822); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_1_0()); 
                          
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER2837); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_2, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleBooleanValue"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1221:1: entryRuleBooleanValue returns [EObject current=null] : iv_ruleBooleanValue= ruleBooleanValue EOF ;
    public final EObject entryRuleBooleanValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValue = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1222:2: (iv_ruleBooleanValue= ruleBooleanValue EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1223:2: iv_ruleBooleanValue= ruleBooleanValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2884);
            iv_ruleBooleanValue=ruleBooleanValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanValue2894); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValue"


    // $ANTLR start "ruleBooleanValue"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1230:1: ruleBooleanValue returns [EObject current=null] : ( (lv_value_0_0= RULE_BOOLEAN ) ) ;
    public final EObject ruleBooleanValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1233:28: ( ( (lv_value_0_0= RULE_BOOLEAN ) ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1234:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1234:1: ( (lv_value_0_0= RULE_BOOLEAN ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1235:1: (lv_value_0_0= RULE_BOOLEAN )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1235:1: (lv_value_0_0= RULE_BOOLEAN )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1236:3: lv_value_0_0= RULE_BOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue2935); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBooleanValueAccess().getValueBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"BOOLEAN");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValue"


    // $ANTLR start "entryRuleStringValue"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1260:1: entryRuleStringValue returns [EObject current=null] : iv_ruleStringValue= ruleStringValue EOF ;
    public final EObject entryRuleStringValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValue = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1261:2: (iv_ruleStringValue= ruleStringValue EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1262:2: iv_ruleStringValue= ruleStringValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueRule()); 
            }
            pushFollow(FOLLOW_ruleStringValue_in_entryRuleStringValue2975);
            iv_ruleStringValue=ruleStringValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringValue2985); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValue"


    // $ANTLR start "ruleStringValue"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1269:1: ruleStringValue returns [EObject current=null] : ( (lv_strValue_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringValue() throws RecognitionException {
        EObject current = null;

        Token lv_strValue_0_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1272:28: ( ( (lv_strValue_0_0= RULE_STRING ) ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1273:1: ( (lv_strValue_0_0= RULE_STRING ) )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1273:1: ( (lv_strValue_0_0= RULE_STRING ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1274:1: (lv_strValue_0_0= RULE_STRING )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1274:1: (lv_strValue_0_0= RULE_STRING )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1275:3: lv_strValue_0_0= RULE_STRING
            {
            lv_strValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringValue3026); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_strValue_0_0, grammarAccess.getStringValueAccess().getStrValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringValueRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"strValue",
                      		lv_strValue_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValue"


    // $ANTLR start "entryRuleVariable"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1299:1: entryRuleVariable returns [EObject current=null] : iv_ruleVariable= ruleVariable EOF ;
    public final EObject entryRuleVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariable = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1300:2: (iv_ruleVariable= ruleVariable EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1301:2: iv_ruleVariable= ruleVariable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVariableRule()); 
            }
            pushFollow(FOLLOW_ruleVariable_in_entryRuleVariable3066);
            iv_ruleVariable=ruleVariable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVariable; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariable3076); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1308:1: ruleVariable returns [EObject current=null] : ( (lv_varName_0_0= ruleVARIABLE_VALUE ) ) ;
    public final EObject ruleVariable() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_varName_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1311:28: ( ( (lv_varName_0_0= ruleVARIABLE_VALUE ) ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1312:1: ( (lv_varName_0_0= ruleVARIABLE_VALUE ) )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1312:1: ( (lv_varName_0_0= ruleVARIABLE_VALUE ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1313:1: (lv_varName_0_0= ruleVARIABLE_VALUE )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1313:1: (lv_varName_0_0= ruleVARIABLE_VALUE )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1314:3: lv_varName_0_0= ruleVARIABLE_VALUE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVariableAccess().getVarNameVARIABLE_VALUEParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_ruleVariable3121);
            lv_varName_0_0=ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVariableRule());
              	        }
                     		set(
                     			current, 
                     			"varName",
                      		lv_varName_0_0, 
                      		"VARIABLE_VALUE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleVARIABLE_VALUE"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1338:1: entryRuleVARIABLE_VALUE returns [String current=null] : iv_ruleVARIABLE_VALUE= ruleVARIABLE_VALUE EOF ;
    public final String entryRuleVARIABLE_VALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVARIABLE_VALUE = null;


        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1339:2: (iv_ruleVARIABLE_VALUE= ruleVARIABLE_VALUE EOF )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1340:2: iv_ruleVARIABLE_VALUE= ruleVARIABLE_VALUE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVARIABLE_VALUERule()); 
            }
            pushFollow(FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE3157);
            iv_ruleVARIABLE_VALUE=ruleVARIABLE_VALUE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVARIABLE_VALUE.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVARIABLE_VALUE3168); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVARIABLE_VALUE"


    // $ANTLR start "ruleVARIABLE_VALUE"
    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1347:1: ruleVARIABLE_VALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) ) ;
    public final AntlrDatatypeRuleToken ruleVARIABLE_VALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token this_ID_1=null;
        Token kw=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1350:28: ( (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) ) )
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1351:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )
            {
            // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1351:1: (this_ID_0= RULE_ID | (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==33) ) {
                    alt18=2;
                }
                else if ( (LA18_1==EOF||(LA18_1>=12 && LA18_1<=16)||(LA18_1>=19 && LA18_1<=32)) ) {
                    alt18=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1351:6: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3208); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_0, grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1359:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    {
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1359:6: (this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID )
                    // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:1359:11: this_ID_1= RULE_ID kw= '.' this_ID_3= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3235); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_1, grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_0()); 
                          
                    }
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleVARIABLE_VALUE3253); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getVARIABLE_VALUEAccess().getFullStopKeyword_1_1()); 
                          
                    }
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3268); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getVARIABLE_VALUEAccess().getIDTerminalRuleCall_1_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVARIABLE_VALUE"

    // $ANTLR start synpred1_InternalExpressions
    public final void synpred1_InternalExpressions_fragment() throws RecognitionException {   
        EObject this_LExpression_0 = null;


        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:87:2: (this_LExpression_0= ruleLExpression )
        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:87:2: this_LExpression_0= ruleLExpression
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleLExpression_in_synpred1_InternalExpressions141);
        this_LExpression_0=ruleLExpression();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalExpressions

    // $ANTLR start synpred8_InternalExpressions
    public final void synpred8_InternalExpressions_fragment() throws RecognitionException {   
        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_LExpression_1 = null;


        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:533:2: ( (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' ) )
        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:533:2: (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' )
        {
        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:533:2: (otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')' )
        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:533:4: otherlv_0= '(' this_LExpression_1= ruleLExpression otherlv_2= ')'
        {
        otherlv_0=(Token)match(input,18,FOLLOW_18_in_synpred8_InternalExpressions1198); if (state.failed) return ;
        pushFollow(FOLLOW_ruleLExpression_in_synpred8_InternalExpressions1223);
        this_LExpression_1=ruleLExpression();

        state._fsp--;
        if (state.failed) return ;
        otherlv_2=(Token)match(input,19,FOLLOW_19_in_synpred8_InternalExpressions1234); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalExpressions

    // $ANTLR start synpred9_InternalExpressions
    public final void synpred9_InternalExpressions_fragment() throws RecognitionException {   
        EObject this_Compare_3 = null;


        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:555:2: (this_Compare_3= ruleCompare )
        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:555:2: this_Compare_3= ruleCompare
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleCompare_in_synpred9_InternalExpressions1266);
        this_Compare_3=ruleCompare();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred9_InternalExpressions

    // $ANTLR start synpred10_InternalExpressions
    public final void synpred10_InternalExpressions_fragment() throws RecognitionException {   
        EObject this_BooleanValue_4 = null;


        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:568:2: (this_BooleanValue_4= ruleBooleanValue )
        // ../de.upb.lina.lll.expressions/src-gen/de/upb/lina/lll/parser/antlr/internal/InternalExpressions.g:568:2: this_BooleanValue_4= ruleBooleanValue
        {
        if ( state.backtracking==0 ) {
           
          	  /* */ 
          	
        }
        pushFollow(FOLLOW_ruleBooleanValue_in_synpred10_InternalExpressions1296);
        this_BooleanValue_4=ruleBooleanValue();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred10_InternalExpressions

    // Delegated rules

    public final boolean synpred9_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalExpressions_fragment(); // can never throw exception
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
    public final boolean synpred10_InternalExpressions() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_InternalExpressions_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression81 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression91 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpression_in_ruleExpression141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_ruleExpression171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpression_in_entryRuleLExpression206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLExpression216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_ruleLExpression265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEquivalent_in_entryRuleEquivalent299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEquivalent309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleEquivalent359 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_12_in_ruleEquivalent383 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleEquivalent_in_ruleEquivalent404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication502 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_13_in_ruleImplication526 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleImplication547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction645 = new BitSet(new long[]{0x000000000000C002L});
    public static final BitSet FOLLOW_14_in_ruleDisjunction671 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_15_in_ruleDisjunction703 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleDisjunction726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction764 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleConjunction824 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16_in_ruleConjunction848 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleConjunction869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleNegation955 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleNegated_in_ruleNegation980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_ruleNegation1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegated_in_entryRuleNegated1046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegated1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_ruleNegated1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCExpression_in_entryRuleCExpression1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCExpression1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleCExpression1198 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleLExpression_in_ruleCExpression1223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCExpression1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleCExpression1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleCExpression1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_ruleCExpression1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare1361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_ruleCompare1421 = new BitSet(new long[]{0x0000000007F00000L});
    public static final BitSet FOLLOW_20_in_ruleCompare1446 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_21_in_ruleCompare1478 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_22_in_ruleCompare1510 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_23_in_ruleCompare1542 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_24_in_ruleCompare1574 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_25_in_ruleCompare1606 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_26_in_ruleCompare1638 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleSomeValue_in_ruleCompare1661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSomeValue_in_entryRuleSomeValue1697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSomeValue1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_ruleSomeValue1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_ruleSomeValue1787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_ruleSomeValue1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAExpression_in_entryRuleAExpression1852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAExpression1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_ruleAExpression1911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2005 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_27_in_ruleAddition2031 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_28_in_ruleAddition2063 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleMultiplication_in_ruleAddition2086 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication2124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication2134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication2184 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_29_in_ruleMultiplication2210 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_30_in_ruleMultiplication2242 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_31_in_ruleMultiplication2274 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rulePower_in_ruleMultiplication2297 = new BitSet(new long[]{0x00000000E0000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower2335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower2345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePower2395 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_rulePower2420 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePower2442 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression2480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rulePrimaryExpression2528 = new BitSet(new long[]{0x00000000000400F0L});
    public static final BitSet FOLLOW_ruleAExpression_in_rulePrimaryExpression2553 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_rulePrimaryExpression2564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_rulePrimaryExpression2596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_rulePrimaryExpression2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberValue_in_entryRuleNumberValue2661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberValue2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleNumberValue2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER2752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER2763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER2803 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleNUMBER2822 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_entryRuleBooleanValue2884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanValue2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleBooleanValue2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringValue_in_entryRuleStringValue2975 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringValue2985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringValue3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariable_in_entryRuleVariable3066 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariable3076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_ruleVariable3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVARIABLE_VALUE_in_entryRuleVARIABLE_VALUE3157 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVARIABLE_VALUE3168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3235 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVARIABLE_VALUE3253 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVARIABLE_VALUE3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLExpression_in_synpred1_InternalExpressions141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_synpred8_InternalExpressions1198 = new BitSet(new long[]{0x00000000000600F0L});
    public static final BitSet FOLLOW_ruleLExpression_in_synpred8_InternalExpressions1223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_synpred8_InternalExpressions1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_synpred9_InternalExpressions1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanValue_in_synpred10_InternalExpressions1296 = new BitSet(new long[]{0x0000000000000002L});

}