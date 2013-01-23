package de.upb.llvm_parser.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import de.upb.llvm_parser.services.LLVMGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLLVMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ARRAYL", "RULE_ARRAYR", "RULE_OREST", "RULE_VALID_ID", "RULE_POINTER", "RULE_INT_TYPE", "RULE_INT", "RULE_ID", "RULE_CSTRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'asm'", "'target'", "'datalayout'", "'triple'", "'='", "'deplibs'", "','", "'global'", "'unnamed_addr'", "'constant'", "'type'", "'define'", "'section '", "'declare'", "'void'", "'null'", "'label'", "'undef'", "'true'", "'false'", "'half'", "'float'", "'double'", "'x86_fp80'", "'fp128'", "'ppc_fp128'", "'<'", "'x'", "'>'", "'{'", "'}'", "'opaque'", "'('", "')'", "':'", "'()'", "')*'", "')**'", "')***'", "')****'", "')*****'", "'zeroext'", "'signext'", "'inreg'", "'byval'", "'sret'", "'noalias'", "'nocapture'", "'nest'", "'ccc'", "'fastcc'", "'coldcc'", "'x86_stdcallcc'", "'x86_fastcallcc'", "'x86_thiscallcc'", "'arm_apcscc'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", "'msp430_intrcc'", "'ptx_kernel'", "'ptx_device'", "'spir_func'", "'spir_kernel'", "'cc'", "'address_safety'", "'alignstack'", "'alwaysinline'", "'nonlazybind'", "'inlinehint'", "'naked'", "'noimplicitfloat'", "'noinline'", "'noredzone'", "'noreturn'", "'nounwind'", "'optsize'", "'readnone'", "'readonly'", "'returns_twice'", "'ssp'", "'sspreq'", "'uwtable'", "'default'", "'hidden'", "'protected'", "'private'", "'linker_private'", "'linker_private_weak'", "'available_externally'", "'linkonce'", "'common'", "'appending'", "'extern_weak'", "'linkonce_odr'", "'linkonce_odr_auto_hide'", "'dllimport'", "'dllexport'", "'external'", "'internal'", "'weak'", "'weak_odr'", "'align'"
    };
    public static final int RULE_ID=13;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=15;
    public static final int RULE_STRING=5;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int RULE_POINTER=10;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int RULE_ARRAYL=6;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int RULE_ARRAYR=7;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_INT=12;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int RULE_CSTRING=14;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int RULE_VALID_ID=9;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=4;
    public static final int RULE_INT_TYPE=11;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_OREST=8;
    public static final int RULE_WS=16;

    // delegates
    // delegators


        public InternalLLVMParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLLVMParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLLVMParser.tokenNames; }
    public String getGrammarFileName() { return "../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g"; }



     	private LLVMGrammarAccess grammarAccess;
     	
        public InternalLLVMParser(TokenStream input, LLVMGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LLVM";	
       	}
       	
       	@Override
       	protected LLVMGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLLVM"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:67:1: entryRuleLLVM returns [EObject current=null] : iv_ruleLLVM= ruleLLVM EOF ;
    public final EObject entryRuleLLVM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLLVM = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:68:2: (iv_ruleLLVM= ruleLLVM EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:69:2: iv_ruleLLVM= ruleLLVM EOF
            {
             newCompositeNode(grammarAccess.getLLVMRule()); 
            pushFollow(FOLLOW_ruleLLVM_in_entryRuleLLVM75);
            iv_ruleLLVM=ruleLLVM();

            state._fsp--;

             current =iv_ruleLLVM; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLLVM85); 

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
    // $ANTLR end "entryRuleLLVM"


    // $ANTLR start "ruleLLVM"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:76:1: ruleLLVM returns [EObject current=null] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final EObject ruleLLVM() throws RecognitionException {
        EObject current = null;

        EObject lv_elements_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:79:28: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:80:1: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_VALID_ID||LA1_0==18||LA1_0==20||LA1_0==24||LA1_0==30||LA1_0==32) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:81:1: (lv_elements_0_0= ruleAbstractElement )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:82:3: lv_elements_0_0= ruleAbstractElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLLVMAccess().getElementsAbstractElementParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAbstractElement_in_ruleLLVM130);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLLVMRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_0_0, 
            	            		"AbstractElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLLVM"


    // $ANTLR start "entryRuleAbstractElement"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:106:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:107:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:108:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement176); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:115:1: ruleAbstractElement returns [EObject current=null] : ( (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_1=null;
        Token this_SL_COMMENT_3=null;
        EObject this_TopLevelEntity_0 = null;

        EObject this_MainLevelEntity_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:118:28: ( ( (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:1: ( (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:1: ( (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18||LA4_0==20||LA4_0==24) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_VALID_ID||LA4_0==30||LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:2: (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:2: (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:120:5: this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )?
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTopLevelEntityParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement224);
                    this_TopLevelEntity_0=ruleTopLevelEntity();

                    state._fsp--;

                     
                            current = this_TopLevelEntity_0; 
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:128:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_SL_COMMENT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:128:2: this_SL_COMMENT_1= RULE_SL_COMMENT
                            {
                            this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement235); 
                             
                                newLeafNode(this_SL_COMMENT_1, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:133:6: (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:133:6: (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:134:5: this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )?
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getMainLevelEntityParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement266);
                    this_MainLevelEntity_2=ruleMainLevelEntity();

                    state._fsp--;

                     
                            current = this_MainLevelEntity_2; 
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:142:1: (this_SL_COMMENT_3= RULE_SL_COMMENT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_SL_COMMENT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:142:2: this_SL_COMMENT_3= RULE_SL_COMMENT
                            {
                            this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement277); 
                             
                                newLeafNode(this_SL_COMMENT_3, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleTopLevelEntity"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:154:1: entryRuleTopLevelEntity returns [EObject current=null] : iv_ruleTopLevelEntity= ruleTopLevelEntity EOF ;
    public final EObject entryRuleTopLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelEntity = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:155:2: (iv_ruleTopLevelEntity= ruleTopLevelEntity EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:156:2: iv_ruleTopLevelEntity= ruleTopLevelEntity EOF
            {
             newCompositeNode(grammarAccess.getTopLevelEntityRule()); 
            pushFollow(FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity315);
            iv_ruleTopLevelEntity=ruleTopLevelEntity();

            state._fsp--;

             current =iv_ruleTopLevelEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelEntity325); 

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
    // $ANTLR end "entryRuleTopLevelEntity"


    // $ANTLR start "ruleTopLevelEntity"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:163:1: ruleTopLevelEntity returns [EObject current=null] : ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' this_ARRAYL_10= RULE_ARRAYL ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* this_ARRAYR_14= RULE_ARRAYR ) ) ;
    public final EObject ruleTopLevelEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_module_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_target_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token this_ARRAYL_10=null;
        Token lv_libs_11_0=null;
        Token otherlv_12=null;
        Token lv_libs_13_0=null;
        Token this_ARRAYR_14=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:166:28: ( ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' this_ARRAYL_10= RULE_ARRAYL ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* this_ARRAYR_14= RULE_ARRAYR ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:167:1: ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' this_ARRAYL_10= RULE_ARRAYL ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* this_ARRAYR_14= RULE_ARRAYR ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:167:1: ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' this_ARRAYL_10= RULE_ARRAYL ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* this_ARRAYR_14= RULE_ARRAYR ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 24:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:167:2: (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:167:2: (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:167:4: otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleTopLevelEntity363); 

                        	newLeafNode(otherlv_0, grammarAccess.getTopLevelEntityAccess().getModuleKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,19,FOLLOW_19_in_ruleTopLevelEntity375); 

                        	newLeafNode(otherlv_1, grammarAccess.getTopLevelEntityAccess().getAsmKeyword_0_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:175:1: ( (lv_module_2_0= RULE_STRING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:176:1: (lv_module_2_0= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:176:1: (lv_module_2_0= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:177:3: lv_module_2_0= RULE_STRING
                    {
                    lv_module_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity392); 

                    			newLeafNode(lv_module_2_0, grammarAccess.getTopLevelEntityAccess().getModuleSTRINGTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTopLevelEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"module",
                            		lv_module_2_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:194:6: (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:194:6: (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:194:8: otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTopLevelEntity417); 

                        	newLeafNode(otherlv_3, grammarAccess.getTopLevelEntityAccess().getTargetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:198:1: (otherlv_4= 'datalayout' | otherlv_5= 'triple' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==21) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==22) ) {
                        alt5=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;
                    }
                    switch (alt5) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:198:3: otherlv_4= 'datalayout'
                            {
                            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleTopLevelEntity430); 

                                	newLeafNode(otherlv_4, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:203:7: otherlv_5= 'triple'
                            {
                            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleTopLevelEntity448); 

                                	newLeafNode(otherlv_5, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1());
                                

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleTopLevelEntity461); 

                        	newLeafNode(otherlv_6, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:211:1: ( (lv_target_7_0= RULE_STRING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:212:1: (lv_target_7_0= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:212:1: (lv_target_7_0= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:213:3: lv_target_7_0= RULE_STRING
                    {
                    lv_target_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity478); 

                    			newLeafNode(lv_target_7_0, grammarAccess.getTopLevelEntityAccess().getTargetSTRINGTerminalRuleCall_1_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTopLevelEntityRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"target",
                            		lv_target_7_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:6: (otherlv_8= 'deplibs' otherlv_9= '=' this_ARRAYL_10= RULE_ARRAYL ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* this_ARRAYR_14= RULE_ARRAYR )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:6: (otherlv_8= 'deplibs' otherlv_9= '=' this_ARRAYL_10= RULE_ARRAYL ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* this_ARRAYR_14= RULE_ARRAYR )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:8: otherlv_8= 'deplibs' otherlv_9= '=' this_ARRAYL_10= RULE_ARRAYL ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* this_ARRAYR_14= RULE_ARRAYR
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_24_in_ruleTopLevelEntity503); 

                        	newLeafNode(otherlv_8, grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_2_0());
                        
                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleTopLevelEntity515); 

                        	newLeafNode(otherlv_9, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_2_1());
                        
                    this_ARRAYL_10=(Token)match(input,RULE_ARRAYL,FOLLOW_RULE_ARRAYL_in_ruleTopLevelEntity526); 
                     
                        newLeafNode(this_ARRAYL_10, grammarAccess.getTopLevelEntityAccess().getARRAYLTerminalRuleCall_2_2()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:242:1: ( (lv_libs_11_0= RULE_STRING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:243:1: (lv_libs_11_0= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:243:1: (lv_libs_11_0= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:244:3: lv_libs_11_0= RULE_STRING
                    {
                    lv_libs_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity542); 

                    			newLeafNode(lv_libs_11_0, grammarAccess.getTopLevelEntityAccess().getLibsSTRINGTerminalRuleCall_2_3_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTopLevelEntityRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"libs",
                            		lv_libs_11_0, 
                            		"STRING");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:260:2: (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:260:4: otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) )
                    	    {
                    	    otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleTopLevelEntity560); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTopLevelEntityAccess().getCommaKeyword_2_4_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:264:1: ( (lv_libs_13_0= RULE_STRING ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:265:1: (lv_libs_13_0= RULE_STRING )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:265:1: (lv_libs_13_0= RULE_STRING )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:266:3: lv_libs_13_0= RULE_STRING
                    	    {
                    	    lv_libs_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity577); 

                    	    			newLeafNode(lv_libs_13_0, grammarAccess.getTopLevelEntityAccess().getLibsSTRINGTerminalRuleCall_2_4_1_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getTopLevelEntityRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"libs",
                    	            		lv_libs_13_0, 
                    	            		"STRING");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    this_ARRAYR_14=(Token)match(input,RULE_ARRAYR,FOLLOW_RULE_ARRAYR_in_ruleTopLevelEntity595); 
                     
                        newLeafNode(this_ARRAYR_14, grammarAccess.getTopLevelEntityAccess().getARRAYRTerminalRuleCall_2_5()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTopLevelEntity"


    // $ANTLR start "entryRuleMainLevelEntity"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:294:1: entryRuleMainLevelEntity returns [EObject current=null] : iv_ruleMainLevelEntity= ruleMainLevelEntity EOF ;
    public final EObject entryRuleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainLevelEntity = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:295:2: (iv_ruleMainLevelEntity= ruleMainLevelEntity EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:296:2: iv_ruleMainLevelEntity= ruleMainLevelEntity EOF
            {
             newCompositeNode(grammarAccess.getMainLevelEntityRule()); 
            pushFollow(FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity631);
            iv_ruleMainLevelEntity=ruleMainLevelEntity();

            state._fsp--;

             current =iv_ruleMainLevelEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainLevelEntity641); 

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
    // $ANTLR end "entryRuleMainLevelEntity"


    // $ANTLR start "ruleMainLevelEntity"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:303:1: ruleMainLevelEntity returns [EObject current=null] : (this_TypeDefinition_0= ruleTypeDefinition | this_FunctionDefinition_1= ruleFunctionDefinition ) ;
    public final EObject ruleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDefinition_0 = null;

        EObject this_FunctionDefinition_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:306:28: ( (this_TypeDefinition_0= ruleTypeDefinition | this_FunctionDefinition_1= ruleFunctionDefinition ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:307:1: (this_TypeDefinition_0= ruleTypeDefinition | this_FunctionDefinition_1= ruleFunctionDefinition )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:307:1: (this_TypeDefinition_0= ruleTypeDefinition | this_FunctionDefinition_1= ruleFunctionDefinition )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_VALID_ID) ) {
                alt8=1;
            }
            else if ( (LA8_0==30||LA8_0==32) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:308:5: this_TypeDefinition_0= ruleTypeDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getTypeDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleMainLevelEntity688);
                    this_TypeDefinition_0=ruleTypeDefinition();

                    state._fsp--;

                     
                            current = this_TypeDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:318:5: this_FunctionDefinition_1= ruleFunctionDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getFunctionDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleMainLevelEntity715);
                    this_FunctionDefinition_1=ruleFunctionDefinition();

                    state._fsp--;

                     
                            current = this_FunctionDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMainLevelEntity"


    // $ANTLR start "entryRuleTypeDefinition"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:334:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:335:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:336:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition750);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition760); 

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
    // $ANTLR end "entryRuleTypeDefinition"


    // $ANTLR start "ruleTypeDefinition"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:343:1: ruleTypeDefinition returns [EObject current=null] : ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_address_0_0 = null;

        EObject lv_struct_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:346:28: ( ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:2: ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:2: ( (lv_address_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:348:1: (lv_address_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:348:1: (lv_address_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:349:3: lv_address_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getAddressAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleTypeDefinition806);
            lv_address_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"address",
                    		lv_address_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleTypeDefinition818); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeDefinitionAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:369:1: ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )*
            loop9:
            do {
                int alt9=5;
                switch ( input.LA(1) ) {
                case 104:
                case 105:
                case 106:
                case 107:
                case 108:
                case 109:
                case 110:
                case 111:
                case 112:
                case 113:
                case 114:
                case 115:
                case 116:
                case 117:
                case 118:
                case 119:
                    {
                    alt9=1;
                    }
                    break;
                case 26:
                    {
                    alt9=2;
                    }
                    break;
                case 27:
                    {
                    alt9=3;
                    }
                    break;
                case 28:
                    {
                    alt9=4;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:370:5: ruleLINKAGE
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTypeDefinitionAccess().getLINKAGEParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleLINKAGE_in_ruleTypeDefinition835);
            	    ruleLINKAGE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:378:7: otherlv_3= 'global'
            	    {
            	    otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleTypeDefinition852); 

            	        	newLeafNode(otherlv_3, grammarAccess.getTypeDefinitionAccess().getGlobalKeyword_2_1());
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:383:7: otherlv_4= 'unnamed_addr'
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleTypeDefinition870); 

            	        	newLeafNode(otherlv_4, grammarAccess.getTypeDefinitionAccess().getUnnamed_addrKeyword_2_2());
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:388:7: otherlv_5= 'constant'
            	    {
            	    otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleTypeDefinition888); 

            	        	newLeafNode(otherlv_5, grammarAccess.getTypeDefinitionAccess().getConstantKeyword_2_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:392:3: (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:392:5: otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque )
            {
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleTypeDefinition903); 

                	newLeafNode(otherlv_6, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_3_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:396:1: ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==48) ) {
                alt10=1;
            }
            else if ( (LA10_0==50) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:396:2: ( (lv_struct_7_0= ruleStructure ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:396:2: ( (lv_struct_7_0= ruleStructure ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:397:1: (lv_struct_7_0= ruleStructure )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:397:1: (lv_struct_7_0= ruleStructure )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:398:3: lv_struct_7_0= ruleStructure
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructStructureParserRuleCall_3_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStructure_in_ruleTypeDefinition925);
                    lv_struct_7_0=ruleStructure();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"struct",
                            		lv_struct_7_0, 
                            		"Structure");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:416:5: ruleOpaque
                    {
                     
                            newCompositeNode(grammarAccess.getTypeDefinitionAccess().getOpaqueParserRuleCall_3_1_1()); 
                        
                    pushFollow(FOLLOW_ruleOpaque_in_ruleTypeDefinition947);
                    ruleOpaque();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDefinition"


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:431:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:432:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:433:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition984);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition994); 

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
    // $ANTLR end "entryRuleFunctionDefinition"


    // $ANTLR start "ruleFunctionDefinition"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:440:1: ruleFunctionDefinition returns [EObject current=null] : ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleTypeUse ) ) ( (lv_address_6_0= ruleAddress ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleTypeUse ) ) ( (lv_address_20_0= ruleAddress ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_STRING_11=null;
        Token otherlv_14=null;
        Token this_OREST_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token this_STRING_26=null;
        EObject lv_returnType_5_0 = null;

        EObject lv_address_6_0 = null;

        EObject lv_pl_7_0 = null;

        EObject lv_body_13_0 = null;

        EObject lv_returnType_19_0 = null;

        EObject lv_address_20_0 = null;

        EObject lv_tList_21_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:443:28: ( ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleTypeUse ) ) ( (lv_address_6_0= ruleAddress ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleTypeUse ) ) ( (lv_address_20_0= ruleAddress ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:444:1: ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleTypeUse ) ) ( (lv_address_6_0= ruleAddress ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleTypeUse ) ) ( (lv_address_20_0= ruleAddress ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:444:1: ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleTypeUse ) ) ( (lv_address_6_0= ruleAddress ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleTypeUse ) ) ( (lv_address_20_0= ruleAddress ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            else if ( (LA28_0==32) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:444:2: (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleTypeUse ) ) ( (lv_address_6_0= ruleAddress ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:444:2: (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleTypeUse ) ) ( (lv_address_6_0= ruleAddress ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:444:4: otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleTypeUse ) ) ( (lv_address_6_0= ruleAddress ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) )
                    {
                    otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleFunctionDefinition1032); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:448:1: ( ruleLINKAGE )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=104 && LA11_0<=119)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:449:5: ruleLINKAGE
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getLINKAGEParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_ruleLINKAGE_in_ruleFunctionDefinition1049);
                            ruleLINKAGE();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:456:3: ( ruleVISIBILITY )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=101 && LA12_0<=103)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:457:5: ruleVISIBILITY
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getVISIBILITYParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleVISIBILITY_in_ruleFunctionDefinition1067);
                            ruleVISIBILITY();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:464:3: ( ruleCallingConv )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=68 && LA13_0<=82)) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:465:5: ruleCallingConv
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_0_3()); 
                                
                            pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionDefinition1085);
                            ruleCallingConv();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:472:3: ( ruleRETURN_ATTRIBUTES )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( ((LA14_0>=60 && LA14_0<=67)) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:473:5: ruleRETURN_ATTRIBUTES
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESParserRuleCall_0_4()); 
                                
                            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionDefinition1103);
                            ruleRETURN_ATTRIBUTES();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:480:3: ( (lv_returnType_5_0= ruleTypeUse ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:481:1: (lv_returnType_5_0= ruleTypeUse )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:481:1: (lv_returnType_5_0= ruleTypeUse )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:482:3: lv_returnType_5_0= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeUseParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleFunctionDefinition1125);
                    lv_returnType_5_0=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_5_0, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:498:2: ( (lv_address_6_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:499:1: (lv_address_6_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:499:1: (lv_address_6_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:500:3: lv_address_6_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAddressAddressParserRuleCall_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleFunctionDefinition1146);
                    lv_address_6_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_6_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:516:2: ( (lv_pl_7_0= ruleParameterList ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:517:1: (lv_pl_7_0= ruleParameterList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:517:1: (lv_pl_7_0= ruleParameterList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:518:3: lv_pl_7_0= ruleParameterList
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getPlParameterListParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_ruleFunctionDefinition1167);
                    lv_pl_7_0=ruleParameterList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"pl",
                            		lv_pl_7_0, 
                            		"ParameterList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:534:2: (otherlv_8= 'unnamed_addr' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==27) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:534:4: otherlv_8= 'unnamed_addr'
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleFunctionDefinition1180); 

                                	newLeafNode(otherlv_8, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_0_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:538:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>=83 && LA16_0<=100)) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:539:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition1199);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:546:3: (otherlv_10= 'section ' this_STRING_11= RULE_STRING )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==31) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:546:5: otherlv_10= 'section ' this_STRING_11= RULE_STRING
                            {
                            otherlv_10=(Token)match(input,31,FOLLOW_31_in_ruleFunctionDefinition1213); 

                                	newLeafNode(otherlv_10, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_0_10_0());
                                
                            this_STRING_11=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionDefinition1224); 
                             
                                newLeafNode(this_STRING_11, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_0_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:554:3: ( ruleALIGNMENT )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==120) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:555:5: ruleALIGNMENT
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getALIGNMENTParserRuleCall_0_11()); 
                                
                            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleFunctionDefinition1242);
                            ruleALIGNMENT();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:562:3: ( (lv_body_13_0= ruleFunctionBody ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:563:1: (lv_body_13_0= ruleFunctionBody )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:563:1: (lv_body_13_0= ruleFunctionBody )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:564:3: lv_body_13_0= ruleFunctionBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBodyFunctionBodyParserRuleCall_0_12_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionDefinition1264);
                    lv_body_13_0=ruleFunctionBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_13_0, 
                            		"FunctionBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:581:6: (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleTypeUse ) ) ( (lv_address_20_0= ruleAddress ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:581:6: (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleTypeUse ) ) ( (lv_address_20_0= ruleAddress ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:581:8: otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleTypeUse ) ) ( (lv_address_20_0= ruleAddress ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )?
                    {
                    otherlv_14=(Token)match(input,32,FOLLOW_32_in_ruleFunctionDefinition1284); 

                        	newLeafNode(otherlv_14, grammarAccess.getFunctionDefinitionAccess().getDeclareKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:585:1: ( ruleLINKAGE )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=104 && LA19_0<=119)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:586:5: ruleLINKAGE
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getLINKAGEParserRuleCall_1_1()); 
                                
                            pushFollow(FOLLOW_ruleLINKAGE_in_ruleFunctionDefinition1301);
                            ruleLINKAGE();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:593:3: ( ruleVISIBILITY )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=101 && LA20_0<=103)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:594:5: ruleVISIBILITY
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getVISIBILITYParserRuleCall_1_2()); 
                                
                            pushFollow(FOLLOW_ruleVISIBILITY_in_ruleFunctionDefinition1319);
                            ruleVISIBILITY();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:601:3: ( ruleCallingConv )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( ((LA21_0>=68 && LA21_0<=82)) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:602:5: ruleCallingConv
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_1_3()); 
                                
                            pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionDefinition1337);
                            ruleCallingConv();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:609:3: ( ruleRETURN_ATTRIBUTES )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=60 && LA22_0<=67)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:610:5: ruleRETURN_ATTRIBUTES
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESParserRuleCall_1_4()); 
                                
                            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionDefinition1355);
                            ruleRETURN_ATTRIBUTES();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:617:3: ( (lv_returnType_19_0= ruleTypeUse ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:618:1: (lv_returnType_19_0= ruleTypeUse )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:618:1: (lv_returnType_19_0= ruleTypeUse )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:619:3: lv_returnType_19_0= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeUseParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleFunctionDefinition1377);
                    lv_returnType_19_0=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_19_0, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:635:2: ( (lv_address_20_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:636:1: (lv_address_20_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:636:1: (lv_address_20_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:637:3: lv_address_20_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAddressAddressParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleFunctionDefinition1398);
                    lv_address_20_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_20_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:653:2: ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==51||LA23_0==54) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==RULE_OREST) ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:653:3: ( (lv_tList_21_0= ruleTypeList ) )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:653:3: ( (lv_tList_21_0= ruleTypeList ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:654:1: (lv_tList_21_0= ruleTypeList )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:654:1: (lv_tList_21_0= ruleTypeList )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:655:3: lv_tList_21_0= ruleTypeList
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getTListTypeListParserRuleCall_1_7_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeList_in_ruleFunctionDefinition1420);
                            lv_tList_21_0=ruleTypeList();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"tList",
                                    		lv_tList_21_0, 
                                    		"TypeList");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:672:6: this_OREST_22= RULE_OREST
                            {
                            this_OREST_22=(Token)match(input,RULE_OREST,FOLLOW_RULE_OREST_in_ruleFunctionDefinition1437); 
                             
                                newLeafNode(this_OREST_22, grammarAccess.getFunctionDefinitionAccess().getORESTTerminalRuleCall_1_7_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:676:2: (otherlv_23= 'unnamed_addr' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==27) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:676:4: otherlv_23= 'unnamed_addr'
                            {
                            otherlv_23=(Token)match(input,27,FOLLOW_27_in_ruleFunctionDefinition1450); 

                                	newLeafNode(otherlv_23, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_1_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:680:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=83 && LA25_0<=100)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:681:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition1469);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:688:3: (otherlv_25= 'section ' this_STRING_26= RULE_STRING )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==31) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:688:5: otherlv_25= 'section ' this_STRING_26= RULE_STRING
                            {
                            otherlv_25=(Token)match(input,31,FOLLOW_31_in_ruleFunctionDefinition1483); 

                                	newLeafNode(otherlv_25, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_1_10_0());
                                
                            this_STRING_26=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionDefinition1494); 
                             
                                newLeafNode(this_STRING_26, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_1_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:696:3: ( ruleALIGNMENT )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==120) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:697:5: ruleALIGNMENT
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getALIGNMENTParserRuleCall_1_11()); 
                                
                            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleFunctionDefinition1512);
                            ruleALIGNMENT();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleTypeUse"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:714:1: entryRuleTypeUse returns [EObject current=null] : iv_ruleTypeUse= ruleTypeUse EOF ;
    public final EObject entryRuleTypeUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeUse = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:715:2: (iv_ruleTypeUse= ruleTypeUse EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:716:2: iv_ruleTypeUse= ruleTypeUse EOF
            {
             newCompositeNode(grammarAccess.getTypeUseRule()); 
            pushFollow(FOLLOW_ruleTypeUse_in_entryRuleTypeUse1552);
            iv_ruleTypeUse=ruleTypeUse();

            state._fsp--;

             current =iv_ruleTypeUse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeUse1562); 

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
    // $ANTLR end "entryRuleTypeUse"


    // $ANTLR start "ruleTypeUse"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:723:1: ruleTypeUse returns [EObject current=null] : (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ;
    public final EObject ruleTypeUse() throws RecognitionException {
        EObject current = null;

        EObject this_Predefined_0 = null;

        EObject this_AddressUse_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:726:28: ( (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:727:1: (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:727:1: (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT_TYPE||(LA29_0>=33 && LA29_0<=44)) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_VALID_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:728:5: this_Predefined_0= rulePredefined
                    {
                     
                            newCompositeNode(grammarAccess.getTypeUseAccess().getPredefinedParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePredefined_in_ruleTypeUse1609);
                    this_Predefined_0=rulePredefined();

                    state._fsp--;

                     
                            current = this_Predefined_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:738:5: this_AddressUse_1= ruleAddressUse
                    {
                     
                            newCompositeNode(grammarAccess.getTypeUseAccess().getAddressUseParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressUse_in_ruleTypeUse1636);
                    this_AddressUse_1=ruleAddressUse();

                    state._fsp--;

                     
                            current = this_AddressUse_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeUse"


    // $ANTLR start "entryRuleAddressUse"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:754:1: entryRuleAddressUse returns [EObject current=null] : iv_ruleAddressUse= ruleAddressUse EOF ;
    public final EObject entryRuleAddressUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressUse = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:755:2: (iv_ruleAddressUse= ruleAddressUse EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:756:2: iv_ruleAddressUse= ruleAddressUse EOF
            {
             newCompositeNode(grammarAccess.getAddressUseRule()); 
            pushFollow(FOLLOW_ruleAddressUse_in_entryRuleAddressUse1671);
            iv_ruleAddressUse=ruleAddressUse();

            state._fsp--;

             current =iv_ruleAddressUse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressUse1681); 

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
    // $ANTLR end "entryRuleAddressUse"


    // $ANTLR start "ruleAddressUse"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:763:1: ruleAddressUse returns [EObject current=null] : ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) ;
    public final EObject ruleAddressUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pointer_1_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:766:28: ( ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:767:1: ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:767:1: ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:767:2: ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:767:2: ( (otherlv_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:768:1: (otherlv_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:768:1: (otherlv_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:769:3: otherlv_0= RULE_VALID_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressUseRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleAddressUse1726); 

            		newLeafNode(otherlv_0, grammarAccess.getAddressUseAccess().getAddressAddressCrossReference_0_0()); 
            	

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:780:2: ( (lv_pointer_1_0= RULE_POINTER ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_POINTER) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:781:1: (lv_pointer_1_0= RULE_POINTER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:781:1: (lv_pointer_1_0= RULE_POINTER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:782:3: lv_pointer_1_0= RULE_POINTER
                    {
                    lv_pointer_1_0=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_ruleAddressUse1743); 

                    			newLeafNode(lv_pointer_1_0, grammarAccess.getAddressUseAccess().getPointerPOINTERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAddressUseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pointer",
                            		lv_pointer_1_0, 
                            		"POINTER");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddressUse"


    // $ANTLR start "entryRuleAddress"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:806:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:807:2: (iv_ruleAddress= ruleAddress EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:808:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_ruleAddress_in_entryRuleAddress1785);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddress1795); 

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
    // $ANTLR end "entryRuleAddress"


    // $ANTLR start "ruleAddress"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:815:1: ruleAddress returns [EObject current=null] : ( (lv_name_0_0= RULE_VALID_ID ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:818:28: ( ( (lv_name_0_0= RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:819:1: ( (lv_name_0_0= RULE_VALID_ID ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:819:1: ( (lv_name_0_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:820:1: (lv_name_0_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:820:1: (lv_name_0_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:821:3: lv_name_0_0= RULE_VALID_ID
            {
            lv_name_0_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleAddress1836); 

            			newLeafNode(lv_name_0_0, grammarAccess.getAddressAccess().getNameVALID_IDTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"VALID_ID");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAddress"


    // $ANTLR start "entryRulePredefined"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:845:1: entryRulePredefined returns [EObject current=null] : iv_rulePredefined= rulePredefined EOF ;
    public final EObject entryRulePredefined() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefined = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:846:2: (iv_rulePredefined= rulePredefined EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:847:2: iv_rulePredefined= rulePredefined EOF
            {
             newCompositeNode(grammarAccess.getPredefinedRule()); 
            pushFollow(FOLLOW_rulePredefined_in_entryRulePredefined1876);
            iv_rulePredefined=rulePredefined();

            state._fsp--;

             current =iv_rulePredefined; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredefined1886); 

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
    // $ANTLR end "entryRulePredefined"


    // $ANTLR start "rulePredefined"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:854:1: rulePredefined returns [EObject current=null] : ( ( (lv_type_0_0= rulePredefined_Types ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) ;
    public final EObject rulePredefined() throws RecognitionException {
        EObject current = null;

        Token lv_pointer_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:857:28: ( ( ( (lv_type_0_0= rulePredefined_Types ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:858:1: ( ( (lv_type_0_0= rulePredefined_Types ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:858:1: ( ( (lv_type_0_0= rulePredefined_Types ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:858:2: ( (lv_type_0_0= rulePredefined_Types ) ) ( (lv_pointer_1_0= RULE_POINTER ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:858:2: ( (lv_type_0_0= rulePredefined_Types ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:859:1: (lv_type_0_0= rulePredefined_Types )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:859:1: (lv_type_0_0= rulePredefined_Types )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:860:3: lv_type_0_0= rulePredefined_Types
            {
             
            	        newCompositeNode(grammarAccess.getPredefinedAccess().getTypePredefined_TypesParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_rulePredefined_Types_in_rulePredefined1932);
            lv_type_0_0=rulePredefined_Types();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPredefinedRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Predefined_Types");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:876:2: ( (lv_pointer_1_0= RULE_POINTER ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_POINTER) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:877:1: (lv_pointer_1_0= RULE_POINTER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:877:1: (lv_pointer_1_0= RULE_POINTER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:878:3: lv_pointer_1_0= RULE_POINTER
                    {
                    lv_pointer_1_0=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_rulePredefined1949); 

                    			newLeafNode(lv_pointer_1_0, grammarAccess.getPredefinedAccess().getPointerPOINTERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredefinedRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pointer",
                            		lv_pointer_1_0, 
                            		"POINTER");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredefined"


    // $ANTLR start "entryRulePrimitive_Type"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:902:1: entryRulePrimitive_Type returns [String current=null] : iv_rulePrimitive_Type= rulePrimitive_Type EOF ;
    public final String entryRulePrimitive_Type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitive_Type = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:903:2: (iv_rulePrimitive_Type= rulePrimitive_Type EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:904:2: iv_rulePrimitive_Type= rulePrimitive_Type EOF
            {
             newCompositeNode(grammarAccess.getPrimitive_TypeRule()); 
            pushFollow(FOLLOW_rulePrimitive_Type_in_entryRulePrimitive_Type1992);
            iv_rulePrimitive_Type=rulePrimitive_Type();

            state._fsp--;

             current =iv_rulePrimitive_Type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive_Type2003); 

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
    // $ANTLR end "entryRulePrimitive_Type"


    // $ANTLR start "rulePrimitive_Type"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:911:1: rulePrimitive_Type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken rulePrimitive_Type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:914:28: ( (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:915:1: (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:915:1: (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' )
            int alt32=6;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt32=1;
                }
                break;
            case 34:
                {
                alt32=2;
                }
                break;
            case 35:
                {
                alt32=3;
                }
                break;
            case 36:
                {
                alt32=4;
                }
                break;
            case 37:
                {
                alt32=5;
                }
                break;
            case 38:
                {
                alt32=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:916:2: kw= 'void'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_rulePrimitive_Type2041); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitive_TypeAccess().getVoidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:923:2: kw= 'null'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulePrimitive_Type2060); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitive_TypeAccess().getNullKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:930:2: kw= 'label'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_rulePrimitive_Type2079); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitive_TypeAccess().getLabelKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:937:2: kw= 'undef'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_rulePrimitive_Type2098); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitive_TypeAccess().getUndefKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:944:2: kw= 'true'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_rulePrimitive_Type2117); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitive_TypeAccess().getTrueKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:951:2: kw= 'false'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_rulePrimitive_Type2136); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitive_TypeAccess().getFalseKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitive_Type"


    // $ANTLR start "entryRuleFloatingPoint_Type"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:964:1: entryRuleFloatingPoint_Type returns [String current=null] : iv_ruleFloatingPoint_Type= ruleFloatingPoint_Type EOF ;
    public final String entryRuleFloatingPoint_Type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloatingPoint_Type = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:965:2: (iv_ruleFloatingPoint_Type= ruleFloatingPoint_Type EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:966:2: iv_ruleFloatingPoint_Type= ruleFloatingPoint_Type EOF
            {
             newCompositeNode(grammarAccess.getFloatingPoint_TypeRule()); 
            pushFollow(FOLLOW_ruleFloatingPoint_Type_in_entryRuleFloatingPoint_Type2177);
            iv_ruleFloatingPoint_Type=ruleFloatingPoint_Type();

            state._fsp--;

             current =iv_ruleFloatingPoint_Type.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFloatingPoint_Type2188); 

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
    // $ANTLR end "entryRuleFloatingPoint_Type"


    // $ANTLR start "ruleFloatingPoint_Type"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:973:1: ruleFloatingPoint_Type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' ) ;
    public final AntlrDatatypeRuleToken ruleFloatingPoint_Type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:976:28: ( (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:977:1: (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:977:1: (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' )
            int alt33=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt33=1;
                }
                break;
            case 40:
                {
                alt33=2;
                }
                break;
            case 41:
                {
                alt33=3;
                }
                break;
            case 42:
                {
                alt33=4;
                }
                break;
            case 43:
                {
                alt33=5;
                }
                break;
            case 44:
                {
                alt33=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:978:2: kw= 'half'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleFloatingPoint_Type2226); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatingPoint_TypeAccess().getHalfKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:985:2: kw= 'float'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleFloatingPoint_Type2245); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatingPoint_TypeAccess().getFloatKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:992:2: kw= 'double'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleFloatingPoint_Type2264); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatingPoint_TypeAccess().getDoubleKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:999:2: kw= 'x86_fp80'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleFloatingPoint_Type2283); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatingPoint_TypeAccess().getX86_fp80Keyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1006:2: kw= 'fp128'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleFloatingPoint_Type2302); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatingPoint_TypeAccess().getFp128Keyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1013:2: kw= 'ppc_fp128'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleFloatingPoint_Type2321); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFloatingPoint_TypeAccess().getPpc_fp128Keyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFloatingPoint_Type"


    // $ANTLR start "entryRulePredefined_Types"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1026:1: entryRulePredefined_Types returns [String current=null] : iv_rulePredefined_Types= rulePredefined_Types EOF ;
    public final String entryRulePredefined_Types() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePredefined_Types = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1027:2: (iv_rulePredefined_Types= rulePredefined_Types EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1028:2: iv_rulePredefined_Types= rulePredefined_Types EOF
            {
             newCompositeNode(grammarAccess.getPredefined_TypesRule()); 
            pushFollow(FOLLOW_rulePredefined_Types_in_entryRulePredefined_Types2362);
            iv_rulePredefined_Types=rulePredefined_Types();

            state._fsp--;

             current =iv_rulePredefined_Types.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredefined_Types2373); 

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
    // $ANTLR end "entryRulePredefined_Types"


    // $ANTLR start "rulePredefined_Types"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1035:1: rulePredefined_Types returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Primitive_Type_0= rulePrimitive_Type | this_INT_TYPE_1= RULE_INT_TYPE | this_FloatingPoint_Type_2= ruleFloatingPoint_Type ) ;
    public final AntlrDatatypeRuleToken rulePredefined_Types() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_TYPE_1=null;
        AntlrDatatypeRuleToken this_Primitive_Type_0 = null;

        AntlrDatatypeRuleToken this_FloatingPoint_Type_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1038:28: ( (this_Primitive_Type_0= rulePrimitive_Type | this_INT_TYPE_1= RULE_INT_TYPE | this_FloatingPoint_Type_2= ruleFloatingPoint_Type ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1039:1: (this_Primitive_Type_0= rulePrimitive_Type | this_INT_TYPE_1= RULE_INT_TYPE | this_FloatingPoint_Type_2= ruleFloatingPoint_Type )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1039:1: (this_Primitive_Type_0= rulePrimitive_Type | this_INT_TYPE_1= RULE_INT_TYPE | this_FloatingPoint_Type_2= ruleFloatingPoint_Type )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
                {
                alt34=1;
                }
                break;
            case RULE_INT_TYPE:
                {
                alt34=2;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1040:5: this_Primitive_Type_0= rulePrimitive_Type
                    {
                     
                            newCompositeNode(grammarAccess.getPredefined_TypesAccess().getPrimitive_TypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_rulePrimitive_Type_in_rulePredefined_Types2420);
                    this_Primitive_Type_0=rulePrimitive_Type();

                    state._fsp--;


                    		current.merge(this_Primitive_Type_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1051:10: this_INT_TYPE_1= RULE_INT_TYPE
                    {
                    this_INT_TYPE_1=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rulePredefined_Types2446); 

                    		current.merge(this_INT_TYPE_1);
                        
                     
                        newLeafNode(this_INT_TYPE_1, grammarAccess.getPredefined_TypesAccess().getINT_TYPETerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1060:5: this_FloatingPoint_Type_2= ruleFloatingPoint_Type
                    {
                     
                            newCompositeNode(grammarAccess.getPredefined_TypesAccess().getFloatingPoint_TypeParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFloatingPoint_Type_in_rulePredefined_Types2479);
                    this_FloatingPoint_Type_2=ruleFloatingPoint_Type();

                    state._fsp--;


                    		current.merge(this_FloatingPoint_Type_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredefined_Types"


    // $ANTLR start "entryRuleVector"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1078:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1079:2: (iv_ruleVector= ruleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1080:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector2524);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector2534); 

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
    // $ANTLR end "entryRuleVector"


    // $ANTLR start "ruleVector"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1087:1: ruleVector returns [EObject current=null] : (otherlv_0= '<' this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse otherlv_4= '>' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_INT_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_TypeUse_3 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1090:28: ( (otherlv_0= '<' this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse otherlv_4= '>' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1091:1: (otherlv_0= '<' this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse otherlv_4= '>' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1091:1: (otherlv_0= '<' this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse otherlv_4= '>' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1091:3: otherlv_0= '<' this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleVector2571); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLessThanSignKeyword_0());
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleVector2582); 
             
                newLeafNode(this_INT_1, grammarAccess.getVectorAccess().getINTTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleVector2593); 

                	newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getXKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getVectorAccess().getTypeUseParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleTypeUse_in_ruleVector2615);
            this_TypeUse_3=ruleTypeUse();

            state._fsp--;

             
                    current = this_TypeUse_3; 
                    afterParserOrEnumRuleCall();
                
            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleVector2626); 

                	newLeafNode(otherlv_4, grammarAccess.getVectorAccess().getGreaterThanSignKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVector"


    // $ANTLR start "entryRuleArray"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1124:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1125:2: (iv_ruleArray= ruleArray EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1126:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray2662);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray2672); 

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
    // $ANTLR end "entryRuleArray"


    // $ANTLR start "ruleArray"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1133:1: ruleArray returns [EObject current=null] : (this_ARRAYL_0= RULE_ARRAYL this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse this_ARRAYR_4= RULE_ARRAYR ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token this_ARRAYL_0=null;
        Token this_INT_1=null;
        Token otherlv_2=null;
        Token this_ARRAYR_4=null;
        EObject this_TypeUse_3 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1136:28: ( (this_ARRAYL_0= RULE_ARRAYL this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse this_ARRAYR_4= RULE_ARRAYR ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1137:1: (this_ARRAYL_0= RULE_ARRAYL this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse this_ARRAYR_4= RULE_ARRAYR )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1137:1: (this_ARRAYL_0= RULE_ARRAYL this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse this_ARRAYR_4= RULE_ARRAYR )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1137:2: this_ARRAYL_0= RULE_ARRAYL this_INT_1= RULE_INT otherlv_2= 'x' this_TypeUse_3= ruleTypeUse this_ARRAYR_4= RULE_ARRAYR
            {
            this_ARRAYL_0=(Token)match(input,RULE_ARRAYL,FOLLOW_RULE_ARRAYL_in_ruleArray2708); 
             
                newLeafNode(this_ARRAYL_0, grammarAccess.getArrayAccess().getARRAYLTerminalRuleCall_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArray2718); 
             
                newLeafNode(this_INT_1, grammarAccess.getArrayAccess().getINTTerminalRuleCall_1()); 
                
            otherlv_2=(Token)match(input,46,FOLLOW_46_in_ruleArray2729); 

                	newLeafNode(otherlv_2, grammarAccess.getArrayAccess().getXKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getArrayAccess().getTypeUseParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleTypeUse_in_ruleArray2751);
            this_TypeUse_3=ruleTypeUse();

            state._fsp--;

             
                    current = this_TypeUse_3; 
                    afterParserOrEnumRuleCall();
                
            this_ARRAYR_4=(Token)match(input,RULE_ARRAYR,FOLLOW_RULE_ARRAYR_in_ruleArray2761); 
             
                newLeafNode(this_ARRAYR_4, grammarAccess.getArrayAccess().getARRAYRTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleConstant"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1174:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1175:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1176:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant2800);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant2810); 

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
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1183:1: ruleConstant returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1186:28: ( ( (lv_value_0_0= RULE_INT ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1187:1: ( (lv_value_0_0= RULE_INT ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1187:1: ( (lv_value_0_0= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1188:1: (lv_value_0_0= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1188:1: (lv_value_0_0= RULE_INT )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1189:3: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleConstant2851); 

            			newLeafNode(lv_value_0_0, grammarAccess.getConstantAccess().getValueINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getConstantRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"INT");
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNonConstantValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1213:1: entryRuleNonConstantValue returns [EObject current=null] : iv_ruleNonConstantValue= ruleNonConstantValue EOF ;
    public final EObject entryRuleNonConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonConstantValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1214:2: (iv_ruleNonConstantValue= ruleNonConstantValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1215:2: iv_ruleNonConstantValue= ruleNonConstantValue EOF
            {
             newCompositeNode(grammarAccess.getNonConstantValueRule()); 
            pushFollow(FOLLOW_ruleNonConstantValue_in_entryRuleNonConstantValue2891);
            iv_ruleNonConstantValue=ruleNonConstantValue();

            state._fsp--;

             current =iv_ruleNonConstantValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNonConstantValue2901); 

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
    // $ANTLR end "entryRuleNonConstantValue"


    // $ANTLR start "ruleNonConstantValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1222:1: ruleNonConstantValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) ;
    public final EObject ruleNonConstantValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_pointer_1_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1225:28: ( ( ( (lv_name_0_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1226:1: ( ( (lv_name_0_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1226:1: ( ( (lv_name_0_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1226:2: ( (lv_name_0_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1226:2: ( (lv_name_0_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1227:1: (lv_name_0_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1227:1: (lv_name_0_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1228:3: lv_name_0_0= RULE_VALID_ID
            {
            lv_name_0_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleNonConstantValue2943); 

            			newLeafNode(lv_name_0_0, grammarAccess.getNonConstantValueAccess().getNameVALID_IDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNonConstantValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"VALID_ID");
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1244:2: ( (lv_pointer_1_0= RULE_POINTER ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_POINTER) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1245:1: (lv_pointer_1_0= RULE_POINTER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1245:1: (lv_pointer_1_0= RULE_POINTER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1246:3: lv_pointer_1_0= RULE_POINTER
                    {
                    lv_pointer_1_0=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_ruleNonConstantValue2965); 

                    			newLeafNode(lv_pointer_1_0, grammarAccess.getNonConstantValueAccess().getPointerPOINTERTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getNonConstantValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"pointer",
                            		lv_pointer_1_0, 
                            		"POINTER");
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonConstantValue"


    // $ANTLR start "entryRuleValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1270:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1271:2: (iv_ruleValue= ruleValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1272:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue3007);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue3017); 

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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1279:1: ruleValue returns [EObject current=null] : (this_Constant_0= ruleConstant | this_NonConstantValue_1= ruleNonConstantValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Constant_0 = null;

        EObject this_NonConstantValue_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1282:28: ( (this_Constant_0= ruleConstant | this_NonConstantValue_1= ruleNonConstantValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1283:1: (this_Constant_0= ruleConstant | this_NonConstantValue_1= ruleNonConstantValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1283:1: (this_Constant_0= ruleConstant | this_NonConstantValue_1= ruleNonConstantValue )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_VALID_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1284:5: this_Constant_0= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getConstantParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleValue3064);
                    this_Constant_0=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1294:5: this_NonConstantValue_1= ruleNonConstantValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNonConstantValueParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNonConstantValue_in_ruleValue3091);
                    this_NonConstantValue_1=ruleNonConstantValue();

                    state._fsp--;

                     
                            current = this_NonConstantValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleStructure"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1310:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1311:2: (iv_ruleStructure= ruleStructure EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1312:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure3126);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure3136); 

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
    // $ANTLR end "entryRuleStructure"


    // $ANTLR start "ruleStructure"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1319:1: ruleStructure returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_types_2_0= ruleTypeUse ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeUse ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_POINTER_6=null;
        EObject lv_types_2_0 = null;

        EObject lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1322:28: ( ( () otherlv_1= '{' ( ( (lv_types_2_0= ruleTypeUse ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeUse ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1323:1: ( () otherlv_1= '{' ( ( (lv_types_2_0= ruleTypeUse ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeUse ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1323:1: ( () otherlv_1= '{' ( ( (lv_types_2_0= ruleTypeUse ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeUse ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1323:2: () otherlv_1= '{' ( ( (lv_types_2_0= ruleTypeUse ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeUse ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1323:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1324:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructureAccess().getStructureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleStructure3182); 

                	newLeafNode(otherlv_1, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1333:1: ( ( (lv_types_2_0= ruleTypeUse ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeUse ) ) )* )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_VALID_ID||LA38_0==RULE_INT_TYPE||(LA38_0>=33 && LA38_0<=44)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1333:2: ( (lv_types_2_0= ruleTypeUse ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleTypeUse ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1333:2: ( (lv_types_2_0= ruleTypeUse ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1334:1: (lv_types_2_0= ruleTypeUse )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1334:1: (lv_types_2_0= ruleTypeUse )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1335:3: lv_types_2_0= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleStructure3204);
                    lv_types_2_0=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_2_0, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1351:2: (otherlv_3= ',' ( (lv_types_4_0= ruleTypeUse ) ) )*
                    loop37:
                    do {
                        int alt37=2;
                        int LA37_0 = input.LA(1);

                        if ( (LA37_0==25) ) {
                            alt37=1;
                        }


                        switch (alt37) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1351:4: otherlv_3= ',' ( (lv_types_4_0= ruleTypeUse ) )
                    	    {
                    	    otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleStructure3217); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getStructureAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1355:1: ( (lv_types_4_0= ruleTypeUse ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1356:1: (lv_types_4_0= ruleTypeUse )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1356:1: (lv_types_4_0= ruleTypeUse )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1357:3: lv_types_4_0= ruleTypeUse
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeUse_in_ruleStructure3238);
                    	    lv_types_4_0=ruleTypeUse();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_4_0, 
                    	            		"TypeUse");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop37;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,49,FOLLOW_49_in_ruleStructure3254); 

                	newLeafNode(otherlv_5, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1377:1: (this_POINTER_6= RULE_POINTER )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_POINTER) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1377:2: this_POINTER_6= RULE_POINTER
                    {
                    this_POINTER_6=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_ruleStructure3266); 
                     
                        newLeafNode(this_POINTER_6, grammarAccess.getStructureAccess().getPOINTERTerminalRuleCall_4()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleOpaque"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1389:1: entryRuleOpaque returns [String current=null] : iv_ruleOpaque= ruleOpaque EOF ;
    public final String entryRuleOpaque() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpaque = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1390:2: (iv_ruleOpaque= ruleOpaque EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1391:2: iv_ruleOpaque= ruleOpaque EOF
            {
             newCompositeNode(grammarAccess.getOpaqueRule()); 
            pushFollow(FOLLOW_ruleOpaque_in_entryRuleOpaque3304);
            iv_ruleOpaque=ruleOpaque();

            state._fsp--;

             current =iv_ruleOpaque.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpaque3315); 

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
    // $ANTLR end "entryRuleOpaque"


    // $ANTLR start "ruleOpaque"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1398:1: ruleOpaque returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'opaque' ;
    public final AntlrDatatypeRuleToken ruleOpaque() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1401:28: (kw= 'opaque' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1403:2: kw= 'opaque'
            {
            kw=(Token)match(input,50,FOLLOW_50_in_ruleOpaque3352); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOpaqueAccess().getOpaqueKeyword()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOpaque"


    // $ANTLR start "entryRuleParameterList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1416:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1417:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1418:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList3391);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList3401); 

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1425:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleTypeUse ) ) ( (lv_Lists_3_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_Lists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_10_0= ruleValue ) ) )* )? otherlv_11= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_6=null;
        Token otherlv_11=null;
        EObject lv_types_2_0 = null;

        EObject lv_Lists_3_0 = null;

        EObject lv_variables_5_0 = null;

        EObject lv_types_7_0 = null;

        EObject lv_Lists_8_0 = null;

        EObject lv_variables_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1428:28: ( ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleTypeUse ) ) ( (lv_Lists_3_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_Lists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_10_0= ruleValue ) ) )* )? otherlv_11= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1429:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleTypeUse ) ) ( (lv_Lists_3_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_Lists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_10_0= ruleValue ) ) )* )? otherlv_11= ')' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1429:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleTypeUse ) ) ( (lv_Lists_3_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_Lists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_10_0= ruleValue ) ) )* )? otherlv_11= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1429:2: () otherlv_1= '(' ( ( (lv_types_2_0= ruleTypeUse ) ) ( (lv_Lists_3_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_Lists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_10_0= ruleValue ) ) )* )? otherlv_11= ')'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1429:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1430:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterListAccess().getParameterListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleParameterList3447); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1439:1: ( ( (lv_types_2_0= ruleTypeUse ) ) ( (lv_Lists_3_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_Lists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_10_0= ruleValue ) ) )* )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_VALID_ID||LA45_0==RULE_INT_TYPE||(LA45_0>=33 && LA45_0<=44)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1439:2: ( (lv_types_2_0= ruleTypeUse ) ) ( (lv_Lists_3_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_5_0= ruleValue ) ) (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_Lists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_10_0= ruleValue ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1439:2: ( (lv_types_2_0= ruleTypeUse ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:1: (lv_types_2_0= ruleTypeUse )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:1: (lv_types_2_0= ruleTypeUse )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1441:3: lv_types_2_0= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterListAccess().getTypesTypeUseParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleParameterList3469);
                    lv_types_2_0=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_2_0, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1457:2: ( (lv_Lists_3_0= ruleTypeList ) )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==51||LA40_0==54) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1458:1: (lv_Lists_3_0= ruleTypeList )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1458:1: (lv_Lists_3_0= ruleTypeList )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1459:3: lv_Lists_3_0= ruleTypeList
                            {
                             
                            	        newCompositeNode(grammarAccess.getParameterListAccess().getListsTypeListParserRuleCall_2_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeList_in_ruleParameterList3490);
                            lv_Lists_3_0=ruleTypeList();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"Lists",
                                    		lv_Lists_3_0, 
                                    		"TypeList");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1475:3: ( ruleRETURN_ATTRIBUTES )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=60 && LA41_0<=67)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1476:5: ruleRETURN_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_2_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleParameterList3508);
                    	    ruleRETURN_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1483:3: ( (lv_variables_5_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1484:1: (lv_variables_5_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1484:1: (lv_variables_5_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1485:3: lv_variables_5_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterListAccess().getVariablesValueParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleParameterList3530);
                    lv_variables_5_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_5_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1501:2: (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_Lists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_10_0= ruleValue ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==25) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1501:4: otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_Lists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )* ( (lv_variables_10_0= ruleValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleParameterList3543); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getParameterListAccess().getCommaKeyword_2_4_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1505:1: ( (lv_types_7_0= ruleTypeUse ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1506:1: (lv_types_7_0= ruleTypeUse )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1506:1: (lv_types_7_0= ruleTypeUse )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1507:3: lv_types_7_0= ruleTypeUse
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterListAccess().getTypesTypeUseParserRuleCall_2_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeUse_in_ruleParameterList3564);
                    	    lv_types_7_0=ruleTypeUse();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_7_0, 
                    	            		"TypeUse");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1523:2: ( (lv_Lists_8_0= ruleTypeList ) )?
                    	    int alt42=2;
                    	    int LA42_0 = input.LA(1);

                    	    if ( (LA42_0==51||LA42_0==54) ) {
                    	        alt42=1;
                    	    }
                    	    switch (alt42) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:1: (lv_Lists_8_0= ruleTypeList )
                    	            {
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:1: (lv_Lists_8_0= ruleTypeList )
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1525:3: lv_Lists_8_0= ruleTypeList
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getParameterListAccess().getListsTypeListParserRuleCall_2_4_2_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTypeList_in_ruleParameterList3585);
                    	            lv_Lists_8_0=ruleTypeList();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"Lists",
                    	                    		lv_Lists_8_0, 
                    	                    		"TypeList");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }


                    	            }
                    	            break;

                    	    }

                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1541:3: ( ruleRETURN_ATTRIBUTES )*
                    	    loop43:
                    	    do {
                    	        int alt43=2;
                    	        int LA43_0 = input.LA(1);

                    	        if ( ((LA43_0>=60 && LA43_0<=67)) ) {
                    	            alt43=1;
                    	        }


                    	        switch (alt43) {
                    	    	case 1 :
                    	    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1542:5: ruleRETURN_ATTRIBUTES
                    	    	    {
                    	    	     
                    	    	            newCompositeNode(grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_2_4_3()); 
                    	    	        
                    	    	    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleParameterList3603);
                    	    	    ruleRETURN_ATTRIBUTES();

                    	    	    state._fsp--;

                    	    	     
                    	    	            afterParserOrEnumRuleCall();
                    	    	        

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop43;
                    	        }
                    	    } while (true);

                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1549:3: ( (lv_variables_10_0= ruleValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1550:1: (lv_variables_10_0= ruleValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1550:1: (lv_variables_10_0= ruleValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1551:3: lv_variables_10_0= ruleValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterListAccess().getVariablesValueParserRuleCall_2_4_4_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValue_in_ruleParameterList3625);
                    	    lv_variables_10_0=ruleValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_10_0, 
                    	            		"Value");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,52,FOLLOW_52_in_ruleParameterList3641); 

                	newLeafNode(otherlv_11, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleFunctionBody"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1579:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBody = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1580:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1581:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody3677);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody3687); 

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
    // $ANTLR end "entryRuleFunctionBody"


    // $ANTLR start "ruleFunctionBody"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1588:1: ruleFunctionBody returns [EObject current=null] : (otherlv_0= '{' ( (lv_blocks_1_0= ruleBasicBlock ) )+ otherlv_2= '}' ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_blocks_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1591:28: ( (otherlv_0= '{' ( (lv_blocks_1_0= ruleBasicBlock ) )+ otherlv_2= '}' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1592:1: (otherlv_0= '{' ( (lv_blocks_1_0= ruleBasicBlock ) )+ otherlv_2= '}' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1592:1: (otherlv_0= '{' ( (lv_blocks_1_0= ruleBasicBlock ) )+ otherlv_2= '}' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1592:3: otherlv_0= '{' ( (lv_blocks_1_0= ruleBasicBlock ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleFunctionBody3724); 

                	newLeafNode(otherlv_0, grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1596:1: ( (lv_blocks_1_0= ruleBasicBlock ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_ID) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1597:1: (lv_blocks_1_0= ruleBasicBlock )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1597:1: (lv_blocks_1_0= ruleBasicBlock )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1598:3: lv_blocks_1_0= ruleBasicBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getBlocksBasicBlockParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBasicBlock_in_ruleFunctionBody3745);
            	    lv_blocks_1_0=ruleBasicBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_1_0, 
            	            		"BasicBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt46 >= 1 ) break loop46;
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
            } while (true);

            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleFunctionBody3758); 

                	newLeafNode(otherlv_2, grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_2());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleBasicBlock"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1626:1: entryRuleBasicBlock returns [EObject current=null] : iv_ruleBasicBlock= ruleBasicBlock EOF ;
    public final EObject entryRuleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBlock = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1627:2: (iv_ruleBasicBlock= ruleBasicBlock EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1628:2: iv_ruleBasicBlock= ruleBasicBlock EOF
            {
             newCompositeNode(grammarAccess.getBasicBlockRule()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock3794);
            iv_ruleBasicBlock=ruleBasicBlock();

            state._fsp--;

             current =iv_ruleBasicBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicBlock3804); 

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
    // $ANTLR end "entryRuleBasicBlock"


    // $ANTLR start "ruleBasicBlock"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1635:1: ruleBasicBlock returns [EObject current=null] : ( ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleBasicBlock() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1638:28: ( ( ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1639:1: ( ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1639:1: ( ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1639:2: ( (lv_label_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1639:2: ( (lv_label_0_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1640:1: (lv_label_0_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1640:1: (lv_label_0_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1641:3: lv_label_0_0= RULE_ID
            {
            lv_label_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleBasicBlock3846); 

            			newLeafNode(lv_label_0_0, grammarAccess.getBasicBlockAccess().getLabelIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getBasicBlockRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleBasicBlock3863); 

                	newLeafNode(otherlv_1, grammarAccess.getBasicBlockAccess().getColonKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBasicBlock"


    // $ANTLR start "entryRuleTypeList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1669:1: entryRuleTypeList returns [EObject current=null] : iv_ruleTypeList= ruleTypeList EOF ;
    public final EObject entryRuleTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1670:2: (iv_ruleTypeList= ruleTypeList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1671:2: iv_ruleTypeList= ruleTypeList EOF
            {
             newCompositeNode(grammarAccess.getTypeListRule()); 
            pushFollow(FOLLOW_ruleTypeList_in_entryRuleTypeList3899);
            iv_ruleTypeList=ruleTypeList();

            state._fsp--;

             current =iv_ruleTypeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeList3909); 

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
    // $ANTLR end "entryRuleTypeList"


    // $ANTLR start "ruleTypeList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1678:1: ruleTypeList returns [EObject current=null] : ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )? (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' ) ) ) ) ;
    public final EObject ruleTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_types_3_0 = null;

        EObject lv_typelists_4_0 = null;

        EObject lv_types_7_0 = null;

        EObject lv_typelists_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1681:28: ( ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )? (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1682:1: ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )? (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1682:1: ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )? (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1682:2: () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )? (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1682:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1683:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeListAccess().getTypeListAction_0(),
                        current);
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1688:2: (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )? (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==54) ) {
                alt54=1;
            }
            else if ( (LA54_0==51) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1688:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleTypeList3956); 

                        	newLeafNode(otherlv_1, grammarAccess.getTypeListAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1693:6: (otherlv_2= '(' ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )? (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1693:6: (otherlv_2= '(' ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )? (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1693:8: otherlv_2= '(' ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )? (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' )
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleTypeList3975); 

                        	newLeafNode(otherlv_2, grammarAccess.getTypeListAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1697:1: ( ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_VALID_ID||LA52_0==RULE_INT_TYPE||(LA52_0>=33 && LA52_0<=44)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1697:2: ( (lv_types_3_0= ruleTypeUse ) ) ( (lv_typelists_4_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1697:2: ( (lv_types_3_0= ruleTypeUse ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1698:1: (lv_types_3_0= ruleTypeUse )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1698:1: (lv_types_3_0= ruleTypeUse )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1699:3: lv_types_3_0= ruleTypeUse
                            {
                             
                            	        newCompositeNode(grammarAccess.getTypeListAccess().getTypesTypeUseParserRuleCall_1_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeUse_in_ruleTypeList3997);
                            lv_types_3_0=ruleTypeUse();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTypeListRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"types",
                                    		lv_types_3_0, 
                                    		"TypeUse");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1715:2: ( (lv_typelists_4_0= ruleTypeList ) )?
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==51||LA47_0==54) ) {
                                alt47=1;
                            }
                            switch (alt47) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1716:1: (lv_typelists_4_0= ruleTypeList )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1716:1: (lv_typelists_4_0= ruleTypeList )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1717:3: lv_typelists_4_0= ruleTypeList
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getTypeListAccess().getTypelistsTypeListParserRuleCall_1_1_1_1_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleTypeList_in_ruleTypeList4018);
                                    lv_typelists_4_0=ruleTypeList();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getTypeListRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"typelists",
                                            		lv_typelists_4_0, 
                                            		"TypeList");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1733:3: ( ruleRETURN_ATTRIBUTES )?
                            int alt48=2;
                            int LA48_0 = input.LA(1);

                            if ( ((LA48_0>=60 && LA48_0<=67)) ) {
                                alt48=1;
                            }
                            switch (alt48) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1734:5: ruleRETURN_ATTRIBUTES
                                    {
                                     
                                            newCompositeNode(grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_2()); 
                                        
                                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleTypeList4036);
                                    ruleRETURN_ATTRIBUTES();

                                    state._fsp--;

                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1741:3: (otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )? )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==25) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1741:5: otherlv_6= ',' ( (lv_types_7_0= ruleTypeUse ) ) ( (lv_typelists_8_0= ruleTypeList ) )? ( ruleRETURN_ATTRIBUTES )?
                            	    {
                            	    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleTypeList4050); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getTypeListAccess().getCommaKeyword_1_1_1_3_0());
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1745:1: ( (lv_types_7_0= ruleTypeUse ) )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1746:1: (lv_types_7_0= ruleTypeUse )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1746:1: (lv_types_7_0= ruleTypeUse )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1747:3: lv_types_7_0= ruleTypeUse
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getTypeListAccess().getTypesTypeUseParserRuleCall_1_1_1_3_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleTypeUse_in_ruleTypeList4071);
                            	    lv_types_7_0=ruleTypeUse();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getTypeListRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"types",
                            	            		lv_types_7_0, 
                            	            		"TypeUse");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }

                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1763:2: ( (lv_typelists_8_0= ruleTypeList ) )?
                            	    int alt49=2;
                            	    int LA49_0 = input.LA(1);

                            	    if ( (LA49_0==51||LA49_0==54) ) {
                            	        alt49=1;
                            	    }
                            	    switch (alt49) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1764:1: (lv_typelists_8_0= ruleTypeList )
                            	            {
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1764:1: (lv_typelists_8_0= ruleTypeList )
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1765:3: lv_typelists_8_0= ruleTypeList
                            	            {
                            	             
                            	            	        newCompositeNode(grammarAccess.getTypeListAccess().getTypelistsTypeListParserRuleCall_1_1_1_3_2_0()); 
                            	            	    
                            	            pushFollow(FOLLOW_ruleTypeList_in_ruleTypeList4092);
                            	            lv_typelists_8_0=ruleTypeList();

                            	            state._fsp--;


                            	            	        if (current==null) {
                            	            	            current = createModelElementForParent(grammarAccess.getTypeListRule());
                            	            	        }
                            	                   		add(
                            	                   			current, 
                            	                   			"typelists",
                            	                    		lv_typelists_8_0, 
                            	                    		"TypeList");
                            	            	        afterParserOrEnumRuleCall();
                            	            	    

                            	            }


                            	            }
                            	            break;

                            	    }

                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1781:3: ( ruleRETURN_ATTRIBUTES )?
                            	    int alt50=2;
                            	    int LA50_0 = input.LA(1);

                            	    if ( ((LA50_0>=60 && LA50_0<=67)) ) {
                            	        alt50=1;
                            	    }
                            	    switch (alt50) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1782:5: ruleRETURN_ATTRIBUTES
                            	            {
                            	             
                            	                    newCompositeNode(grammarAccess.getTypeListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_3_3()); 
                            	                
                            	            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleTypeList4110);
                            	            ruleRETURN_ATTRIBUTES();

                            	            state._fsp--;

                            	             
                            	                    afterParserOrEnumRuleCall();
                            	                

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop51;
                                }
                            } while (true);


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:7: (otherlv_10= ')' | otherlv_11= ')*' | otherlv_12= ')**' | otherlv_13= ')***' | otherlv_14= ')****' | otherlv_15= ')*****' )
                    int alt53=6;
                    switch ( input.LA(1) ) {
                    case 52:
                        {
                        alt53=1;
                        }
                        break;
                    case 55:
                        {
                        alt53=2;
                        }
                        break;
                    case 56:
                        {
                        alt53=3;
                        }
                        break;
                    case 57:
                        {
                        alt53=4;
                        }
                        break;
                    case 58:
                        {
                        alt53=5;
                        }
                        break;
                    case 59:
                        {
                        alt53=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 0, input);

                        throw nvae;
                    }

                    switch (alt53) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:9: otherlv_10= ')'
                            {
                            otherlv_10=(Token)match(input,52,FOLLOW_52_in_ruleTypeList4128); 

                                	newLeafNode(otherlv_10, grammarAccess.getTypeListAccess().getRightParenthesisKeyword_1_1_2_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1794:7: otherlv_11= ')*'
                            {
                            otherlv_11=(Token)match(input,55,FOLLOW_55_in_ruleTypeList4146); 

                                	newLeafNode(otherlv_11, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskKeyword_1_1_2_1());
                                

                            }
                            break;
                        case 3 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1799:7: otherlv_12= ')**'
                            {
                            otherlv_12=(Token)match(input,56,FOLLOW_56_in_ruleTypeList4164); 

                                	newLeafNode(otherlv_12, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskKeyword_1_1_2_2());
                                

                            }
                            break;
                        case 4 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1804:7: otherlv_13= ')***'
                            {
                            otherlv_13=(Token)match(input,57,FOLLOW_57_in_ruleTypeList4182); 

                                	newLeafNode(otherlv_13, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskKeyword_1_1_2_3());
                                

                            }
                            break;
                        case 5 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1809:7: otherlv_14= ')****'
                            {
                            otherlv_14=(Token)match(input,58,FOLLOW_58_in_ruleTypeList4200); 

                                	newLeafNode(otherlv_14, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_4());
                                

                            }
                            break;
                        case 6 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1814:7: otherlv_15= ')*****'
                            {
                            otherlv_15=(Token)match(input,59,FOLLOW_59_in_ruleTypeList4218); 

                                	newLeafNode(otherlv_15, grammarAccess.getTypeListAccess().getRightParenthesisAsteriskAsteriskAsteriskAsteriskAsteriskKeyword_1_1_2_5());
                                

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeList"


    // $ANTLR start "entryRuleRETURN_ATTRIBUTES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1826:1: entryRuleRETURN_ATTRIBUTES returns [String current=null] : iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF ;
    public final String entryRuleRETURN_ATTRIBUTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN_ATTRIBUTES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1827:2: (iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1828:2: iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF
            {
             newCompositeNode(grammarAccess.getRETURN_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES4258);
            iv_ruleRETURN_ATTRIBUTES=ruleRETURN_ATTRIBUTES();

            state._fsp--;

             current =iv_ruleRETURN_ATTRIBUTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES4269); 

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
    // $ANTLR end "entryRuleRETURN_ATTRIBUTES"


    // $ANTLR start "ruleRETURN_ATTRIBUTES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1835:1: ruleRETURN_ATTRIBUTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) ;
    public final AntlrDatatypeRuleToken ruleRETURN_ATTRIBUTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1838:28: ( (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1839:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1839:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            int alt55=8;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt55=1;
                }
                break;
            case 61:
                {
                alt55=2;
                }
                break;
            case 62:
                {
                alt55=3;
                }
                break;
            case 63:
                {
                alt55=4;
                }
                break;
            case 64:
                {
                alt55=5;
                }
                break;
            case 65:
                {
                alt55=6;
                }
                break;
            case 66:
                {
                alt55=7;
                }
                break;
            case 67:
                {
                alt55=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1840:2: kw= 'zeroext'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleRETURN_ATTRIBUTES4307); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getZeroextKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1847:2: kw= 'signext'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleRETURN_ATTRIBUTES4326); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getSignextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1854:2: kw= 'inreg'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleRETURN_ATTRIBUTES4345); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getInregKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1861:2: kw= 'byval'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleRETURN_ATTRIBUTES4364); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getByvalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1868:2: kw= 'sret'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleRETURN_ATTRIBUTES4383); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getSretKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1875:2: kw= 'noalias'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleRETURN_ATTRIBUTES4402); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getNoaliasKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1882:2: kw= 'nocapture'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleRETURN_ATTRIBUTES4421); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getNocaptureKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1889:2: kw= 'nest'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleRETURN_ATTRIBUTES4440); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getNestKeyword_7()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRETURN_ATTRIBUTES"


    // $ANTLR start "entryRuleCallingConv"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1902:1: entryRuleCallingConv returns [String current=null] : iv_ruleCallingConv= ruleCallingConv EOF ;
    public final String entryRuleCallingConv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCallingConv = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1903:2: (iv_ruleCallingConv= ruleCallingConv EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1904:2: iv_ruleCallingConv= ruleCallingConv EOF
            {
             newCompositeNode(grammarAccess.getCallingConvRule()); 
            pushFollow(FOLLOW_ruleCallingConv_in_entryRuleCallingConv4481);
            iv_ruleCallingConv=ruleCallingConv();

            state._fsp--;

             current =iv_ruleCallingConv.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallingConv4492); 

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
    // $ANTLR end "entryRuleCallingConv"


    // $ANTLR start "ruleCallingConv"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1911:1: ruleCallingConv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleCallingConv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_16=null;
        Token this_INT_18=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1914:28: ( (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1915:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1915:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) )
            int alt56=15;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt56=1;
                }
                break;
            case 69:
                {
                alt56=2;
                }
                break;
            case 70:
                {
                alt56=3;
                }
                break;
            case 71:
                {
                alt56=4;
                }
                break;
            case 72:
                {
                alt56=5;
                }
                break;
            case 73:
                {
                alt56=6;
                }
                break;
            case 74:
                {
                alt56=7;
                }
                break;
            case 75:
                {
                alt56=8;
                }
                break;
            case 76:
                {
                alt56=9;
                }
                break;
            case 77:
                {
                alt56=10;
                }
                break;
            case 78:
                {
                alt56=11;
                }
                break;
            case 79:
                {
                alt56=12;
                }
                break;
            case 80:
                {
                alt56=13;
                }
                break;
            case 81:
                {
                alt56=14;
                }
                break;
            case 82:
                {
                alt56=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1916:2: kw= 'ccc'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleCallingConv4530); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCccKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1923:2: kw= 'fastcc'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleCallingConv4549); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getFastccKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1930:2: kw= 'coldcc'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleCallingConv4568); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getColdccKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1937:2: kw= 'x86_stdcallcc'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleCallingConv4587); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_stdcallccKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1944:2: kw= 'x86_fastcallcc'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleCallingConv4606); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_fastcallccKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1951:2: kw= 'x86_thiscallcc'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleCallingConv4625); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_thiscallccKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1958:2: kw= 'arm_apcscc'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleCallingConv4644); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_apcsccKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1965:2: kw= 'arm_aapcscc'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleCallingConv4663); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcsccKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1972:2: kw= 'arm_aapcs_vfpcc'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleCallingConv4682); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcs_vfpccKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1979:2: kw= 'msp430_intrcc'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleCallingConv4701); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getMsp430_intrccKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1986:2: kw= 'ptx_kernel'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleCallingConv4720); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_kernelKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1993:2: kw= 'ptx_device'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleCallingConv4739); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_deviceKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2000:2: kw= 'spir_func'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleCallingConv4758); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_funcKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2007:2: kw= 'spir_kernel'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleCallingConv4777); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_kernelKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2013:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2013:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2014:2: kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleCallingConv4797); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCcKeyword_14_0()); 
                        
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleCallingConv4810); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getLessThanSignKeyword_14_1()); 
                        
                    this_INT_16=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv4825); 

                    		current.merge(this_INT_16);
                        
                     
                        newLeafNode(this_INT_16, grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_2()); 
                        
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleCallingConv4843); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getGreaterThanSignKeyword_14_3()); 
                        
                    this_INT_18=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv4858); 

                    		current.merge(this_INT_18);
                        
                     
                        newLeafNode(this_INT_18, grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_4()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCallingConv"


    // $ANTLR start "entryRuleFUNCTION_ATTRIBUTES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2053:1: entryRuleFUNCTION_ATTRIBUTES returns [String current=null] : iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF ;
    public final String entryRuleFUNCTION_ATTRIBUTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNCTION_ATTRIBUTES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2054:2: (iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2055:2: iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF
            {
             newCompositeNode(grammarAccess.getFUNCTION_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES4905);
            iv_ruleFUNCTION_ATTRIBUTES=ruleFUNCTION_ATTRIBUTES();

            state._fsp--;

             current =iv_ruleFUNCTION_ATTRIBUTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES4916); 

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
    // $ANTLR end "entryRuleFUNCTION_ATTRIBUTES"


    // $ANTLR start "ruleFUNCTION_ATTRIBUTES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2062:1: ruleFUNCTION_ATTRIBUTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) ;
    public final AntlrDatatypeRuleToken ruleFUNCTION_ATTRIBUTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2065:28: ( (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2066:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2066:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            int alt57=18;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt57=1;
                }
                break;
            case 84:
                {
                alt57=2;
                }
                break;
            case 85:
                {
                alt57=3;
                }
                break;
            case 86:
                {
                alt57=4;
                }
                break;
            case 87:
                {
                alt57=5;
                }
                break;
            case 88:
                {
                alt57=6;
                }
                break;
            case 89:
                {
                alt57=7;
                }
                break;
            case 90:
                {
                alt57=8;
                }
                break;
            case 91:
                {
                alt57=9;
                }
                break;
            case 92:
                {
                alt57=10;
                }
                break;
            case 93:
                {
                alt57=11;
                }
                break;
            case 94:
                {
                alt57=12;
                }
                break;
            case 95:
                {
                alt57=13;
                }
                break;
            case 96:
                {
                alt57=14;
                }
                break;
            case 97:
                {
                alt57=15;
                }
                break;
            case 98:
                {
                alt57=16;
                }
                break;
            case 99:
                {
                alt57=17;
                }
                break;
            case 100:
                {
                alt57=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2067:2: kw= 'address_safety'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleFUNCTION_ATTRIBUTES4954); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAddress_safetyKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2073:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2073:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2074:2: kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleFUNCTION_ATTRIBUTES4974); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlignstackKeyword_1_0()); 
                        
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleFUNCTION_ATTRIBUTES4987); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLeftParenthesisKeyword_1_1()); 
                        
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleFUNCTION_ATTRIBUTES5000); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLessThanSignKeyword_1_2()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFUNCTION_ATTRIBUTES5015); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getINTTerminalRuleCall_1_3()); 
                        
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleFUNCTION_ATTRIBUTES5033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getGreaterThanSignKeyword_1_4()); 
                        
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleFUNCTION_ATTRIBUTES5046); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getRightParenthesisKeyword_1_5()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2112:2: kw= 'alwaysinline'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleFUNCTION_ATTRIBUTES5066); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlwaysinlineKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2119:2: kw= 'nonlazybind'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleFUNCTION_ATTRIBUTES5085); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNonlazybindKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2126:2: kw= 'inlinehint'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleFUNCTION_ATTRIBUTES5104); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getInlinehintKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2133:2: kw= 'naked'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleFUNCTION_ATTRIBUTES5123); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNakedKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2140:2: kw= 'noimplicitfloat'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleFUNCTION_ATTRIBUTES5142); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoimplicitfloatKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2147:2: kw= 'noinline'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleFUNCTION_ATTRIBUTES5161); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoinlineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2154:2: kw= 'noredzone'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleFUNCTION_ATTRIBUTES5180); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoredzoneKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2161:2: kw= 'noreturn'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleFUNCTION_ATTRIBUTES5199); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoreturnKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2168:2: kw= 'nounwind'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleFUNCTION_ATTRIBUTES5218); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNounwindKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2175:2: kw= 'optsize'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleFUNCTION_ATTRIBUTES5237); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getOptsizeKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2182:2: kw= 'readnone'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleFUNCTION_ATTRIBUTES5256); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadnoneKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2189:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleFUNCTION_ATTRIBUTES5275); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadonlyKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2196:2: kw= 'returns_twice'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleFUNCTION_ATTRIBUTES5294); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReturns_twiceKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2203:2: kw= 'ssp'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleFUNCTION_ATTRIBUTES5313); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2210:2: kw= 'sspreq'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleFUNCTION_ATTRIBUTES5332); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspreqKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2217:2: kw= 'uwtable'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleFUNCTION_ATTRIBUTES5351); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getUwtableKeyword_17()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFUNCTION_ATTRIBUTES"


    // $ANTLR start "entryRuleVISIBILITY"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2230:1: entryRuleVISIBILITY returns [String current=null] : iv_ruleVISIBILITY= ruleVISIBILITY EOF ;
    public final String entryRuleVISIBILITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVISIBILITY = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2231:2: (iv_ruleVISIBILITY= ruleVISIBILITY EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2232:2: iv_ruleVISIBILITY= ruleVISIBILITY EOF
            {
             newCompositeNode(grammarAccess.getVISIBILITYRule()); 
            pushFollow(FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY5392);
            iv_ruleVISIBILITY=ruleVISIBILITY();

            state._fsp--;

             current =iv_ruleVISIBILITY.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVISIBILITY5403); 

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
    // $ANTLR end "entryRuleVISIBILITY"


    // $ANTLR start "ruleVISIBILITY"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2239:1: ruleVISIBILITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'default' | kw= 'hidden' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleVISIBILITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2242:28: ( (kw= 'default' | kw= 'hidden' | kw= 'protected' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2243:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2243:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            int alt58=3;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt58=1;
                }
                break;
            case 102:
                {
                alt58=2;
                }
                break;
            case 103:
                {
                alt58=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2244:2: kw= 'default'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleVISIBILITY5441); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVISIBILITYAccess().getDefaultKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2251:2: kw= 'hidden'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleVISIBILITY5460); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVISIBILITYAccess().getHiddenKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2258:2: kw= 'protected'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleVISIBILITY5479); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVISIBILITYAccess().getProtectedKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVISIBILITY"


    // $ANTLR start "entryRuleLINKAGE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2271:1: entryRuleLINKAGE returns [String current=null] : iv_ruleLINKAGE= ruleLINKAGE EOF ;
    public final String entryRuleLINKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLINKAGE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2272:2: (iv_ruleLINKAGE= ruleLINKAGE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2273:2: iv_ruleLINKAGE= ruleLINKAGE EOF
            {
             newCompositeNode(grammarAccess.getLINKAGERule()); 
            pushFollow(FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE5520);
            iv_ruleLINKAGE=ruleLINKAGE();

            state._fsp--;

             current =iv_ruleLINKAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLINKAGE5531); 

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
    // $ANTLR end "entryRuleLINKAGE"


    // $ANTLR start "ruleLINKAGE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2280:1: ruleLINKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE ) ;
    public final AntlrDatatypeRuleToken ruleLINKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ALIAS_LINKAGE_12 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2283:28: ( (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2284:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2284:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE )
            int alt59=13;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt59=1;
                }
                break;
            case 105:
                {
                alt59=2;
                }
                break;
            case 106:
                {
                alt59=3;
                }
                break;
            case 107:
                {
                alt59=4;
                }
                break;
            case 108:
                {
                alt59=5;
                }
                break;
            case 109:
                {
                alt59=6;
                }
                break;
            case 110:
                {
                alt59=7;
                }
                break;
            case 111:
                {
                alt59=8;
                }
                break;
            case 112:
                {
                alt59=9;
                }
                break;
            case 113:
                {
                alt59=10;
                }
                break;
            case 114:
                {
                alt59=11;
                }
                break;
            case 115:
                {
                alt59=12;
                }
                break;
            case 116:
            case 117:
            case 118:
            case 119:
                {
                alt59=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2285:2: kw= 'private'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleLINKAGE5569); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2292:2: kw= 'linker_private'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleLINKAGE5588); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinker_privateKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2299:2: kw= 'linker_private_weak'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleLINKAGE5607); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinker_private_weakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2306:2: kw= 'available_externally'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleLINKAGE5626); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getAvailable_externallyKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2313:2: kw= 'linkonce'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleLINKAGE5645); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonceKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2320:2: kw= 'common'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleLINKAGE5664); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getCommonKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2327:2: kw= 'appending'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleLINKAGE5683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getAppendingKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2334:2: kw= 'extern_weak'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleLINKAGE5702); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getExtern_weakKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2341:2: kw= 'linkonce_odr'
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleLINKAGE5721); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonce_odrKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2348:2: kw= 'linkonce_odr_auto_hide'
                    {
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleLINKAGE5740); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonce_odr_auto_hideKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2355:2: kw= 'dllimport'
                    {
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleLINKAGE5759); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getDllimportKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2362:2: kw= 'dllexport'
                    {
                    kw=(Token)match(input,115,FOLLOW_115_in_ruleLINKAGE5778); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getDllexportKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2369:5: this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE
                    {
                     
                            newCompositeNode(grammarAccess.getLINKAGEAccess().getALIAS_LINKAGEParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_ruleLINKAGE5806);
                    this_ALIAS_LINKAGE_12=ruleALIAS_LINKAGE();

                    state._fsp--;


                    		current.merge(this_ALIAS_LINKAGE_12);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLINKAGE"


    // $ANTLR start "entryRuleALIAS_LINKAGE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2387:1: entryRuleALIAS_LINKAGE returns [String current=null] : iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF ;
    public final String entryRuleALIAS_LINKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALIAS_LINKAGE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2388:2: (iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2389:2: iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF
            {
             newCompositeNode(grammarAccess.getALIAS_LINKAGERule()); 
            pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE5852);
            iv_ruleALIAS_LINKAGE=ruleALIAS_LINKAGE();

            state._fsp--;

             current =iv_ruleALIAS_LINKAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIAS_LINKAGE5863); 

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
    // $ANTLR end "entryRuleALIAS_LINKAGE"


    // $ANTLR start "ruleALIAS_LINKAGE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2396:1: ruleALIAS_LINKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) ;
    public final AntlrDatatypeRuleToken ruleALIAS_LINKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2399:28: ( (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2400:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2400:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            int alt60=4;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt60=1;
                }
                break;
            case 117:
                {
                alt60=2;
                }
                break;
            case 118:
                {
                alt60=3;
                }
                break;
            case 119:
                {
                alt60=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2401:2: kw= 'external'
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleALIAS_LINKAGE5901); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getExternalKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2408:2: kw= 'internal'
                    {
                    kw=(Token)match(input,117,FOLLOW_117_in_ruleALIAS_LINKAGE5920); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getInternalKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2415:2: kw= 'weak'
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_ruleALIAS_LINKAGE5939); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getWeakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2422:2: kw= 'weak_odr'
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_ruleALIAS_LINKAGE5958); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getWeak_odrKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleALIAS_LINKAGE"


    // $ANTLR start "entryRuleALIGNMENT"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2435:1: entryRuleALIGNMENT returns [String current=null] : iv_ruleALIGNMENT= ruleALIGNMENT EOF ;
    public final String entryRuleALIGNMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALIGNMENT = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2436:2: (iv_ruleALIGNMENT= ruleALIGNMENT EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2437:2: iv_ruleALIGNMENT= ruleALIGNMENT EOF
            {
             newCompositeNode(grammarAccess.getALIGNMENTRule()); 
            pushFollow(FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT5999);
            iv_ruleALIGNMENT=ruleALIGNMENT();

            state._fsp--;

             current =iv_ruleALIGNMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIGNMENT6010); 

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
    // $ANTLR end "entryRuleALIGNMENT"


    // $ANTLR start "ruleALIGNMENT"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2444:1: ruleALIGNMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'align' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleALIGNMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2447:28: ( (kw= 'align' this_INT_1= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2448:1: (kw= 'align' this_INT_1= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2448:1: (kw= 'align' this_INT_1= RULE_INT )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2449:2: kw= 'align' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,120,FOLLOW_120_in_ruleALIGNMENT6048); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getALIGNMENTAccess().getAlignKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleALIGNMENT6063); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getALIGNMENTAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleALIGNMENT"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLLVM_in_entryRuleLLVM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLVM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleLLVM130 = new BitSet(new long[]{0x0000000141140202L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement224 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement266 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelEntity325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTopLevelEntity363 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleTopLevelEntity375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleTopLevelEntity417 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleTopLevelEntity430 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22_in_ruleTopLevelEntity448 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTopLevelEntity461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleTopLevelEntity503 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTopLevelEntity515 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ARRAYL_in_ruleTopLevelEntity526 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity542 = new BitSet(new long[]{0x0000000002000080L});
    public static final BitSet FOLLOW_25_in_ruleTopLevelEntity560 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity577 = new BitSet(new long[]{0x0000000002000080L});
    public static final BitSet FOLLOW_RULE_ARRAYR_in_ruleTopLevelEntity595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainLevelEntity641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleMainLevelEntity688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleMainLevelEntity715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleTypeDefinition806 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTypeDefinition818 = new BitSet(new long[]{0x000000003C000000L,0x00FFFF0000000000L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleTypeDefinition835 = new BitSet(new long[]{0x000000003C000000L,0x00FFFF0000000000L});
    public static final BitSet FOLLOW_26_in_ruleTypeDefinition852 = new BitSet(new long[]{0x000000003C000000L,0x00FFFF0000000000L});
    public static final BitSet FOLLOW_27_in_ruleTypeDefinition870 = new BitSet(new long[]{0x000000003C000000L,0x00FFFF0000000000L});
    public static final BitSet FOLLOW_28_in_ruleTypeDefinition888 = new BitSet(new long[]{0x000000003C000000L,0x00FFFF0000000000L});
    public static final BitSet FOLLOW_29_in_ruleTypeDefinition903 = new BitSet(new long[]{0x0005000000000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleTypeDefinition925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpaque_in_ruleTypeDefinition947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleFunctionDefinition1032 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleFunctionDefinition1049 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleFunctionDefinition1067 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionDefinition1085 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionDefinition1103 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleFunctionDefinition1125 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleFunctionDefinition1146 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleFunctionDefinition1167 = new BitSet(new long[]{0x0001000088000000L,0x0100001FFFF80000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionDefinition1180 = new BitSet(new long[]{0x0001000088000000L,0x0100001FFFF80000L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition1199 = new BitSet(new long[]{0x0001000088000000L,0x0100001FFFF80000L});
    public static final BitSet FOLLOW_31_in_ruleFunctionDefinition1213 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionDefinition1224 = new BitSet(new long[]{0x0001000088000000L,0x0100001FFFF80000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleFunctionDefinition1242 = new BitSet(new long[]{0x0001000088000000L,0x0100001FFFF80000L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionDefinition1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleFunctionDefinition1284 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleFunctionDefinition1301 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleFunctionDefinition1319 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionDefinition1337 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionDefinition1355 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleFunctionDefinition1377 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleFunctionDefinition1398 = new BitSet(new long[]{0x0048000000000100L});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleFunctionDefinition1420 = new BitSet(new long[]{0x0000000088000002L,0x0100001FFFF80000L});
    public static final BitSet FOLLOW_RULE_OREST_in_ruleFunctionDefinition1437 = new BitSet(new long[]{0x0000000088000002L,0x0100001FFFF80000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionDefinition1450 = new BitSet(new long[]{0x0000000080000002L,0x0100001FFFF80000L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition1469 = new BitSet(new long[]{0x0000000080000002L,0x0100001FFFF80000L});
    public static final BitSet FOLLOW_31_in_ruleFunctionDefinition1483 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionDefinition1494 = new BitSet(new long[]{0x0000000000000002L,0x0100000000000000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleFunctionDefinition1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_entryRuleTypeUse1552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeUse1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_ruleTypeUse1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_ruleTypeUse1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_entryRuleAddressUse1671 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressUse1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleAddressUse1726 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_POINTER_in_ruleAddressUse1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress1785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddress1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleAddress1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_entryRulePredefined1876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredefined1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_Types_in_rulePredefined1932 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_POINTER_in_rulePredefined1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_Type_in_entryRulePrimitive_Type1992 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive_Type2003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rulePrimitive_Type2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrimitive_Type2060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rulePrimitive_Type2079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rulePrimitive_Type2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rulePrimitive_Type2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePrimitive_Type2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPoint_Type_in_entryRuleFloatingPoint_Type2177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFloatingPoint_Type2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleFloatingPoint_Type2226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFloatingPoint_Type2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleFloatingPoint_Type2264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleFloatingPoint_Type2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleFloatingPoint_Type2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleFloatingPoint_Type2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_Types_in_entryRulePredefined_Types2362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredefined_Types2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_Type_in_rulePredefined_Types2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rulePredefined_Types2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFloatingPoint_Type_in_rulePredefined_Types2479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector2524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVector2571 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleVector2582 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleVector2593 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleVector2615 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleVector2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray2662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAYL_in_ruleArray2708 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArray2718 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleArray2729 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleArray2751 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ARRAYR_in_ruleArray2761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant2800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleConstant2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonConstantValue_in_entryRuleNonConstantValue2891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNonConstantValue2901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleNonConstantValue2943 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_POINTER_in_ruleNonConstantValue2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue3007 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue3017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleValue3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNonConstantValue_in_ruleValue3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure3126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure3136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleStructure3182 = new BitSet(new long[]{0xF0021FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleStructure3204 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_25_in_ruleStructure3217 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleStructure3238 = new BitSet(new long[]{0x0002000002000000L});
    public static final BitSet FOLLOW_49_in_ruleStructure3254 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_RULE_POINTER_in_ruleStructure3266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpaque_in_entryRuleOpaque3304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpaque3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleOpaque3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList3391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleParameterList3447 = new BitSet(new long[]{0xF0101FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleParameterList3469 = new BitSet(new long[]{0xF048000000001200L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleParameterList3490 = new BitSet(new long[]{0xF048000000001200L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleParameterList3508 = new BitSet(new long[]{0xF048000000001200L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameterList3530 = new BitSet(new long[]{0x0010000002000000L});
    public static final BitSet FOLLOW_25_in_ruleParameterList3543 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleParameterList3564 = new BitSet(new long[]{0xF048000000001200L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleParameterList3585 = new BitSet(new long[]{0xF048000000001200L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleParameterList3603 = new BitSet(new long[]{0xF048000000001200L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameterList3625 = new BitSet(new long[]{0x0010000002000000L});
    public static final BitSet FOLLOW_52_in_ruleParameterList3641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody3677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody3687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFunctionBody3724 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_ruleFunctionBody3745 = new BitSet(new long[]{0x0002000000002000L});
    public static final BitSet FOLLOW_49_in_ruleFunctionBody3758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock3794 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicBlock3804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleBasicBlock3846 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleBasicBlock3863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_entryRuleTypeList3899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeList3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeList3956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeList3975 = new BitSet(new long[]{0xFF901FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleTypeList3997 = new BitSet(new long[]{0xFFD8000002000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleTypeList4018 = new BitSet(new long[]{0xFF90000002000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleTypeList4036 = new BitSet(new long[]{0x0F90000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTypeList4050 = new BitSet(new long[]{0xF0001FFE00000A00L,0x00FFFFE00007FFFFL});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleTypeList4071 = new BitSet(new long[]{0xFFD8000002000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleTypeList4092 = new BitSet(new long[]{0xFF90000002000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleTypeList4110 = new BitSet(new long[]{0x0F90000002000000L});
    public static final BitSet FOLLOW_52_in_ruleTypeList4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleTypeList4146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleTypeList4164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleTypeList4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleTypeList4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleTypeList4218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES4258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES4269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleRETURN_ATTRIBUTES4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleRETURN_ATTRIBUTES4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleRETURN_ATTRIBUTES4345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleRETURN_ATTRIBUTES4364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleRETURN_ATTRIBUTES4383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleRETURN_ATTRIBUTES4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleRETURN_ATTRIBUTES4421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleRETURN_ATTRIBUTES4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_entryRuleCallingConv4481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallingConv4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCallingConv4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCallingConv4549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCallingConv4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCallingConv4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCallingConv4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCallingConv4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCallingConv4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCallingConv4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCallingConv4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleCallingConv4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleCallingConv4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleCallingConv4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleCallingConv4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleCallingConv4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleCallingConv4797 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCallingConv4810 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv4825 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCallingConv4843 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES4905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES4916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleFUNCTION_ATTRIBUTES4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleFUNCTION_ATTRIBUTES4974 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleFUNCTION_ATTRIBUTES4987 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleFUNCTION_ATTRIBUTES5000 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFUNCTION_ATTRIBUTES5015 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleFUNCTION_ATTRIBUTES5033 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleFUNCTION_ATTRIBUTES5046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleFUNCTION_ATTRIBUTES5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleFUNCTION_ATTRIBUTES5085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleFUNCTION_ATTRIBUTES5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleFUNCTION_ATTRIBUTES5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleFUNCTION_ATTRIBUTES5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleFUNCTION_ATTRIBUTES5161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleFUNCTION_ATTRIBUTES5180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleFUNCTION_ATTRIBUTES5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleFUNCTION_ATTRIBUTES5218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleFUNCTION_ATTRIBUTES5237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleFUNCTION_ATTRIBUTES5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleFUNCTION_ATTRIBUTES5275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleFUNCTION_ATTRIBUTES5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleFUNCTION_ATTRIBUTES5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleFUNCTION_ATTRIBUTES5332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleFUNCTION_ATTRIBUTES5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY5392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVISIBILITY5403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleVISIBILITY5441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleVISIBILITY5460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleVISIBILITY5479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE5520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLINKAGE5531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleLINKAGE5569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleLINKAGE5588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleLINKAGE5607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleLINKAGE5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleLINKAGE5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleLINKAGE5664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleLINKAGE5683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleLINKAGE5702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleLINKAGE5721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleLINKAGE5740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleLINKAGE5759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleLINKAGE5778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_ruleLINKAGE5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE5852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIAS_LINKAGE5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleALIAS_LINKAGE5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleALIAS_LINKAGE5920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleALIAS_LINKAGE5939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleALIAS_LINKAGE5958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT5999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIGNMENT6010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleALIGNMENT6048 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleALIGNMENT6063 = new BitSet(new long[]{0x0000000000000002L});

}