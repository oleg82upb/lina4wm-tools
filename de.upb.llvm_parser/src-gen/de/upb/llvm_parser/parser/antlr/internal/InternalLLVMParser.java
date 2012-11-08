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

public class InternalLLVMParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_VAR_TYPE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'type'", "'{'", "','", "'}'", "'<'", "'>'", "'getelementptr'", "'inbounds'", "'extractvalue'", "'insertvalue'", "'fence'", "'singlethread'", "'unordered'", "'monotonic'", "'aquire'", "'release'", "'acq_rel'", "'seq_cst'", "'cmpxchg'", "'volatile'", "'atomicrmw'", "'xchg'", "'add'", "'sub'", "'and'", "'nand'", "'or'", "'xor'", "'max'", "'min'", "'umax'", "'umin'", "'load'", "'!nontemporal'", "'!'", "'atomic'", "'align'", "'store'", "'tail'", "'call'", "'zeroext'", "'signext'", "'inreg'", "'byval'", "'sret'", "'noalias'", "'nocapture'", "'nest'", "'alloca'", "'ccc'", "'fastcc'", "'coldcc'", "'x86_stdcallcc'", "'x86_fastcallcc'", "'x86_thiscallcc'", "'arm_apcscc'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", "'msp430_intrcc'", "'ptx_kernel'", "'ptx_device'", "'spir_func'", "'spir_kernel'", "'cc'", "'address_safety'", "'alignstack'", "'('", "')'", "'alwaysinline'", "'nonlazybind'", "'inlinehint'", "'naked'", "'noimplicitfloat'", "'noinline'", "'noredzone'", "'noreturn'", "'nounwind'", "'optsize'", "'readnone'", "'readonly'", "'returns_twice'", "'ssp'", "'sspreq'", "'uwtable'", "'phi'", "'['", "']'", "'%'", "'landingpad'", "'personality'", "'cleanup'", "'catch'", "'filter'", "'select'", "'va_arg'", "'extractelement'", "'insertelement'", "'shufflevector'", "'to'", "'trunc'", "'zext'", "'sext'", "'fptrunc'", "'fpext'", "'fptoui'", "'fptosi'", "'uitofp'", "'sitofp'", "'ptrtoint'", "'inttoptr'", "'bitcast'", "'icmp'", "'fcmp'", "'eq'", "'ne'", "'ugt'", "'uge'", "'ult'", "'ule'", "'sgt'", "'sge'", "'slt'", "'sle'", "'false'", "'oeq'", "'ogt'", "'oge'", "'olt'", "'ole'", "'one'", "'ord'", "'ueq'", "'une'", "'uno'", "'true'", "'fadd'", "'fsub'", "'mul'", "'fmul'", "'udiv'", "'sdiv'", "'fdiv'", "'urem'", "'srem'", "'frem'", "'shl'", "'lshr'", "'ashr'", "'indirectbr'", "'switch'", "'invoke'", "'unwind'", "'resume'", "'ret'", "'void'", "'!dbg'", "'br'", "':'", "'declare'", "'define'", "'section '", "'@'", "'default'", "'hidden'", "'protected'", "'private'", "'linker_private'", "'linker_private_weak'", "'available_externally'", "'linkonce'", "'common'", "'appending'", "'extern_weak'", "'linkonce_odr'", "'linkonce_odr_auto_hide'", "'dllimport'", "'dllexport'", "'external'", "'internal'", "'weak'", "'weak_odr'", "'module'", "'asm'", "'target'", "'triple'", "'datalayout'", "'deplibs'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_VAR_TYPE=5;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__160=160;
    public static final int T__167=167;
    public static final int EOF=-1;
    public static final int T__168=168;
    public static final int T__165=165;
    public static final int T__166=166;
    public static final int T__163=163;
    public static final int T__164=164;
    public static final int T__161=161;
    public static final int T__162=162;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__90=90;
    public static final int T__147=147;
    public static final int T__149=149;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__157=157;
    public static final int T__98=98;
    public static final int T__150=150;
    public static final int T__97=97;
    public static final int T__151=151;
    public static final int T__96=96;
    public static final int T__152=152;
    public static final int T__95=95;
    public static final int T__153=153;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__141=141;
    public static final int T__84=84;
    public static final int T__142=142;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__140=140;
    public static final int T__89=89;
    public static final int T__145=145;
    public static final int T__88=88;
    public static final int T__146=146;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=8;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__129=129;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__130=130;
    public static final int T__73=73;
    public static final int T__131=131;
    public static final int T__132=132;
    public static final int T__79=79;
    public static final int T__133=133;
    public static final int T__78=78;
    public static final int T__134=134;
    public static final int T__77=77;
    public static final int T__135=135;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int T__113=113;
    public static final int T__112=112;
    public static final int T__102=102;
    public static final int T__101=101;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=4;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__199=199;
    public static final int T__57=57;
    public static final int T__198=198;
    public static final int T__58=58;
    public static final int T__197=197;
    public static final int T__51=51;
    public static final int T__196=196;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__195=195;
    public static final int T__54=54;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__59=59;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__184=184;
    public static final int T__43=43;
    public static final int T__183=183;
    public static final int T__40=40;
    public static final int T__186=186;
    public static final int T__41=41;
    public static final int T__185=185;
    public static final int T__46=46;
    public static final int T__188=188;
    public static final int T__47=47;
    public static final int T__187=187;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__189=189;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__180=180;
    public static final int T__182=182;
    public static final int T__181=181;
    public static final int T__175=175;
    public static final int T__30=30;
    public static final int T__174=174;
    public static final int T__31=31;
    public static final int T__173=173;
    public static final int T__32=32;
    public static final int T__172=172;
    public static final int T__33=33;
    public static final int T__179=179;
    public static final int T__34=34;
    public static final int T__178=178;
    public static final int T__35=35;
    public static final int T__177=177;
    public static final int T__36=36;
    public static final int T__176=176;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__171=171;
    public static final int T__170=170;
    public static final int RULE_WS=10;
    public static final int T__169=169;

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

                if ( (LA1_0==RULE_VAR_TYPE||LA1_0==14||LA1_0==17||(LA1_0>=171 && LA1_0<=172)||LA1_0==194||LA1_0==196||LA1_0==199) ) {
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:115:1: ruleAbstractElement returns [EObject current=null] : ( ( () ruleTopLevelEntity (this_SL_COMMENT_2= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_3= ruleMainLevelEntity (this_SL_COMMENT_4= RULE_SL_COMMENT )? ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_2=null;
        Token this_SL_COMMENT_4=null;
        EObject this_MainLevelEntity_3 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:118:28: ( ( ( () ruleTopLevelEntity (this_SL_COMMENT_2= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_3= ruleMainLevelEntity (this_SL_COMMENT_4= RULE_SL_COMMENT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:1: ( ( () ruleTopLevelEntity (this_SL_COMMENT_2= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_3= ruleMainLevelEntity (this_SL_COMMENT_4= RULE_SL_COMMENT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:1: ( ( () ruleTopLevelEntity (this_SL_COMMENT_2= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_3= ruleMainLevelEntity (this_SL_COMMENT_4= RULE_SL_COMMENT )? ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==194||LA4_0==196||LA4_0==199) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_VAR_TYPE||LA4_0==14||LA4_0==17||(LA4_0>=171 && LA4_0<=172)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:2: ( () ruleTopLevelEntity (this_SL_COMMENT_2= RULE_SL_COMMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:2: ( () ruleTopLevelEntity (this_SL_COMMENT_2= RULE_SL_COMMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:3: () ruleTopLevelEntity (this_SL_COMMENT_2= RULE_SL_COMMENT )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:3: ()
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:120:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAbstractElementAccess().getAbstractElementAction_0_0(),
                                current);
                        

                    }

                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTopLevelEntityParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement227);
                    ruleTopLevelEntity();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:133:1: (this_SL_COMMENT_2= RULE_SL_COMMENT )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_SL_COMMENT) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:133:2: this_SL_COMMENT_2= RULE_SL_COMMENT
                            {
                            this_SL_COMMENT_2=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement238); 
                             
                                newLeafNode(this_SL_COMMENT_2, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_2()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:138:6: (this_MainLevelEntity_3= ruleMainLevelEntity (this_SL_COMMENT_4= RULE_SL_COMMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:138:6: (this_MainLevelEntity_3= ruleMainLevelEntity (this_SL_COMMENT_4= RULE_SL_COMMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:139:5: this_MainLevelEntity_3= ruleMainLevelEntity (this_SL_COMMENT_4= RULE_SL_COMMENT )?
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getMainLevelEntityParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement269);
                    this_MainLevelEntity_3=ruleMainLevelEntity();

                    state._fsp--;

                     
                            current = this_MainLevelEntity_3; 
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:147:1: (this_SL_COMMENT_4= RULE_SL_COMMENT )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==RULE_SL_COMMENT) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:147:2: this_SL_COMMENT_4= RULE_SL_COMMENT
                            {
                            this_SL_COMMENT_4=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement280); 
                             
                                newLeafNode(this_SL_COMMENT_4, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_1_1()); 
                                

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


    // $ANTLR start "entryRuleTypeAndValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:159:1: entryRuleTypeAndValue returns [EObject current=null] : iv_ruleTypeAndValue= ruleTypeAndValue EOF ;
    public final EObject entryRuleTypeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAndValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:160:2: (iv_ruleTypeAndValue= ruleTypeAndValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:161:2: iv_ruleTypeAndValue= ruleTypeAndValue EOF
            {
             newCompositeNode(grammarAccess.getTypeAndValueRule()); 
            pushFollow(FOLLOW_ruleTypeAndValue_in_entryRuleTypeAndValue318);
            iv_ruleTypeAndValue=ruleTypeAndValue();

            state._fsp--;

             current =iv_ruleTypeAndValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeAndValue328); 

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
    // $ANTLR end "entryRuleTypeAndValue"


    // $ANTLR start "ruleTypeAndValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:168:1: ruleTypeAndValue returns [EObject current=null] : ( ( (lv_type_0_0= RULE_VAR_TYPE ) ) ( (lv_value_1_0= ruleType ) ) ) ;
    public final EObject ruleTypeAndValue() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_0=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:171:28: ( ( ( (lv_type_0_0= RULE_VAR_TYPE ) ) ( (lv_value_1_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:172:1: ( ( (lv_type_0_0= RULE_VAR_TYPE ) ) ( (lv_value_1_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:172:1: ( ( (lv_type_0_0= RULE_VAR_TYPE ) ) ( (lv_value_1_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:172:2: ( (lv_type_0_0= RULE_VAR_TYPE ) ) ( (lv_value_1_0= ruleType ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:172:2: ( (lv_type_0_0= RULE_VAR_TYPE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:173:1: (lv_type_0_0= RULE_VAR_TYPE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:173:1: (lv_type_0_0= RULE_VAR_TYPE )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:174:3: lv_type_0_0= RULE_VAR_TYPE
            {
            lv_type_0_0=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleTypeAndValue370); 

            			newLeafNode(lv_type_0_0, grammarAccess.getTypeAndValueAccess().getTypeVAR_TYPETerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeAndValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"VAR_TYPE");
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:190:2: ( (lv_value_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:191:1: (lv_value_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:191:1: (lv_value_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:192:3: lv_value_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getValueTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeAndValue396);
            lv_value_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeAndValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleTypeAndValue"


    // $ANTLR start "entryRuleType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:216:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:217:2: (iv_ruleType= ruleType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:218:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType433);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType444); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:225:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE )+ ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_TYPE_1=null;
        AntlrDatatypeRuleToken this_StructType_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:228:28: ( (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:229:1: (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:229:1: (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE )+
            int cnt5=0;
            loop5:
            do {
                int alt5=3;
                switch ( input.LA(1) ) {
                case 14:
                    {
                    alt5=1;
                    }
                    break;
                case 17:
                    {
                    alt5=1;
                    }
                    break;
                case RULE_VAR_TYPE:
                    {
                    alt5=2;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:5: this_StructType_0= ruleStructType
            	    {
            	     
            	            newCompositeNode(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_0()); 
            	        
            	    pushFollow(FOLLOW_ruleStructType_in_ruleType491);
            	    this_StructType_0=ruleStructType();

            	    state._fsp--;


            	    		current.merge(this_StructType_0);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:241:10: this_VAR_TYPE_1= RULE_VAR_TYPE
            	    {
            	    this_VAR_TYPE_1=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleType517); 

            	    		current.merge(this_VAR_TYPE_1);
            	        
            	     
            	        newLeafNode(this_VAR_TYPE_1, grammarAccess.getTypeAccess().getVAR_TYPETerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLocalVar"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:256:1: entryRuleLocalVar returns [EObject current=null] : iv_ruleLocalVar= ruleLocalVar EOF ;
    public final EObject entryRuleLocalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVar = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:257:2: (iv_ruleLocalVar= ruleLocalVar EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:258:2: iv_ruleLocalVar= ruleLocalVar EOF
            {
             newCompositeNode(grammarAccess.getLocalVarRule()); 
            pushFollow(FOLLOW_ruleLocalVar_in_entryRuleLocalVar563);
            iv_ruleLocalVar=ruleLocalVar();

            state._fsp--;

             current =iv_ruleLocalVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVar573); 

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
    // $ANTLR end "entryRuleLocalVar"


    // $ANTLR start "ruleLocalVar"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:265:1: ruleLocalVar returns [EObject current=null] : ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ruleType ) | ( (lv_instr_4_0= ruleInstruction ) ) ) ) ;
    public final EObject ruleLocalVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_instr_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:268:28: ( ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ruleType ) | ( (lv_instr_4_0= ruleInstruction ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:269:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ruleType ) | ( (lv_instr_4_0= ruleInstruction ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:269:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ruleType ) | ( (lv_instr_4_0= ruleInstruction ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:269:2: ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ruleType ) | ( (lv_instr_4_0= ruleInstruction ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:269:2: ( (lv_name_0_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:270:1: (lv_name_0_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:270:1: (lv_name_0_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:271:3: lv_name_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLocalVarAccess().getNameTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLocalVar619);
            lv_name_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalVarRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleLocalVar631); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalVarAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:291:1: ( (otherlv_2= 'type' ruleType ) | ( (lv_instr_4_0= ruleInstruction ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==19||(LA6_0>=21 && LA6_0<=23)||LA6_0==31||LA6_0==33||(LA6_0>=35 && LA6_0<=37)||(LA6_0>=39 && LA6_0<=40)||LA6_0==45||(LA6_0>=50 && LA6_0<=52)||LA6_0==61||LA6_0==97||LA6_0==101||(LA6_0>=106 && LA6_0<=110)||(LA6_0>=112 && LA6_0<=125)||(LA6_0>=148 && LA6_0<=163)||(LA6_0>=165 && LA6_0<=166)||LA6_0==169) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:291:2: (otherlv_2= 'type' ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:291:2: (otherlv_2= 'type' ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:291:4: otherlv_2= 'type' ruleType
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLocalVar645); 

                        	newLeafNode(otherlv_2, grammarAccess.getLocalVarAccess().getTypeKeyword_2_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getLocalVarAccess().getTypeParserRuleCall_2_0_1()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleLocalVar661);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:304:6: ( (lv_instr_4_0= ruleInstruction ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:304:6: ( (lv_instr_4_0= ruleInstruction ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:305:1: (lv_instr_4_0= ruleInstruction )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:305:1: (lv_instr_4_0= ruleInstruction )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:306:3: lv_instr_4_0= ruleInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVarAccess().getInstrInstructionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstruction_in_ruleLocalVar688);
                    lv_instr_4_0=ruleInstruction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVarRule());
                    	        }
                           		set(
                           			current, 
                           			"instr",
                            		lv_instr_4_0, 
                            		"Instruction");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleLocalVar"


    // $ANTLR start "entryRuleStructType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:330:1: entryRuleStructType returns [String current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final String entryRuleStructType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:331:2: (iv_ruleStructType= ruleStructType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:332:2: iv_ruleStructType= ruleStructType EOF
            {
             newCompositeNode(grammarAccess.getStructTypeRule()); 
            pushFollow(FOLLOW_ruleStructType_in_entryRuleStructType726);
            iv_ruleStructType=ruleStructType();

            state._fsp--;

             current =iv_ruleStructType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructType737); 

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
    // $ANTLR end "entryRuleStructType"


    // $ANTLR start "ruleStructType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:339:1: ruleStructType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' (this_VAR_TYPE_1= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )* )? kw= '}' ) | (kw= '<' kw= '{' (this_VAR_TYPE_7= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )* )? kw= '}' kw= '>' ) ) ;
    public final AntlrDatatypeRuleToken ruleStructType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VAR_TYPE_1=null;
        Token this_VAR_TYPE_3=null;
        Token this_VAR_TYPE_7=null;
        Token this_VAR_TYPE_9=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:342:28: ( ( (kw= '{' (this_VAR_TYPE_1= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )* )? kw= '}' ) | (kw= '<' kw= '{' (this_VAR_TYPE_7= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )* )? kw= '}' kw= '>' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:343:1: ( (kw= '{' (this_VAR_TYPE_1= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )* )? kw= '}' ) | (kw= '<' kw= '{' (this_VAR_TYPE_7= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )* )? kw= '}' kw= '>' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:343:1: ( (kw= '{' (this_VAR_TYPE_1= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )* )? kw= '}' ) | (kw= '<' kw= '{' (this_VAR_TYPE_7= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )* )? kw= '}' kw= '>' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            else if ( (LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:343:2: (kw= '{' (this_VAR_TYPE_1= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )* )? kw= '}' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:343:2: (kw= '{' (this_VAR_TYPE_1= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )* )? kw= '}' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:344:2: kw= '{' (this_VAR_TYPE_1= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )* )? kw= '}'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleStructType776); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_0_0()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:349:1: (this_VAR_TYPE_1= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )* )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( (LA8_0==RULE_VAR_TYPE) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:349:6: this_VAR_TYPE_1= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )*
                            {
                            this_VAR_TYPE_1=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType792); 

                            		current.merge(this_VAR_TYPE_1);
                                
                             
                                newLeafNode(this_VAR_TYPE_1, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_0_1_0()); 
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:356:1: (kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE )*
                            loop7:
                            do {
                                int alt7=2;
                                int LA7_0 = input.LA(1);

                                if ( (LA7_0==15) ) {
                                    alt7=1;
                                }


                                switch (alt7) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:357:2: kw= ',' this_VAR_TYPE_3= RULE_VAR_TYPE
                            	    {
                            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleStructType811); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getStructTypeAccess().getCommaKeyword_0_1_1_0()); 
                            	        
                            	    this_VAR_TYPE_3=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType826); 

                            	    		current.merge(this_VAR_TYPE_3);
                            	        
                            	     
                            	        newLeafNode(this_VAR_TYPE_3, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_0_1_1_1()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop7;
                                }
                            } while (true);


                            }
                            break;

                    }

                    kw=(Token)match(input,16,FOLLOW_16_in_ruleStructType848); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:376:6: (kw= '<' kw= '{' (this_VAR_TYPE_7= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )* )? kw= '}' kw= '>' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:376:6: (kw= '<' kw= '{' (this_VAR_TYPE_7= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )* )? kw= '}' kw= '>' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:377:2: kw= '<' kw= '{' (this_VAR_TYPE_7= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )* )? kw= '}' kw= '>'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleStructType869); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLessThanSignKeyword_1_0()); 
                        
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleStructType882); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1_1()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:388:1: (this_VAR_TYPE_7= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_VAR_TYPE) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:388:6: this_VAR_TYPE_7= RULE_VAR_TYPE (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )*
                            {
                            this_VAR_TYPE_7=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType898); 

                            		current.merge(this_VAR_TYPE_7);
                                
                             
                                newLeafNode(this_VAR_TYPE_7, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_1_2_0()); 
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:395:1: (kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==15) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:396:2: kw= ',' this_VAR_TYPE_9= RULE_VAR_TYPE
                            	    {
                            	    kw=(Token)match(input,15,FOLLOW_15_in_ruleStructType917); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getStructTypeAccess().getCommaKeyword_1_2_1_0()); 
                            	        
                            	    this_VAR_TYPE_9=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType932); 

                            	    		current.merge(this_VAR_TYPE_9);
                            	        
                            	     
                            	        newLeafNode(this_VAR_TYPE_9, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_1_2_1_1()); 
                            	        

                            	    }
                            	    break;

                            	default :
                            	    break loop9;
                                }
                            } while (true);


                            }
                            break;

                    }

                    kw=(Token)match(input,16,FOLLOW_16_in_ruleStructType954); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_1_3()); 
                        
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleStructType967); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_1_4()); 
                        

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
    // $ANTLR end "ruleStructType"


    // $ANTLR start "entryRuleGetElementPtr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:428:1: entryRuleGetElementPtr returns [EObject current=null] : iv_ruleGetElementPtr= ruleGetElementPtr EOF ;
    public final EObject entryRuleGetElementPtr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetElementPtr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:429:2: (iv_ruleGetElementPtr= ruleGetElementPtr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:430:2: iv_ruleGetElementPtr= ruleGetElementPtr EOF
            {
             newCompositeNode(grammarAccess.getGetElementPtrRule()); 
            pushFollow(FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr1008);
            iv_ruleGetElementPtr=ruleGetElementPtr();

            state._fsp--;

             current =iv_ruleGetElementPtr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetElementPtr1018); 

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
    // $ANTLR end "entryRuleGetElementPtr"


    // $ANTLR start "ruleGetElementPtr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:437:1: ruleGetElementPtr returns [EObject current=null] : (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* ) ;
    public final EObject ruleGetElementPtr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pointer_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:440:28: ( (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:441:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:441:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:441:3: otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleGetElementPtr1055); 

                	newLeafNode(otherlv_0, grammarAccess.getGetElementPtrAccess().getGetelementptrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:445:1: (otherlv_1= 'inbounds' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:445:3: otherlv_1= 'inbounds'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleGetElementPtr1068); 

                        	newLeafNode(otherlv_1, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:449:3: ( (lv_pointer_2_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:450:1: (lv_pointer_2_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:450:1: (lv_pointer_2_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:451:3: lv_pointer_2_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getPointerTypeAndValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr1091);
            lv_pointer_2_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	        }
                   		add(
                   			current, 
                   			"pointer",
                    		lv_pointer_2_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:467:2: (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:467:4: otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) )
            	    {
            	    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleGetElementPtr1104); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGetElementPtrAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:471:1: ( (lv_params_4_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:472:1: (lv_params_4_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:472:1: (lv_params_4_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:473:3: lv_params_4_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getParamsTypeAndValueParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr1125);
            	    lv_params_4_0=ruleTypeAndValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"params",
            	            		lv_params_4_0, 
            	            		"TypeAndValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


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
    // $ANTLR end "ruleGetElementPtr"


    // $ANTLR start "entryRuleExtractValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:497:1: entryRuleExtractValue returns [EObject current=null] : iv_ruleExtractValue= ruleExtractValue EOF ;
    public final EObject entryRuleExtractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:498:2: (iv_ruleExtractValue= ruleExtractValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:499:2: iv_ruleExtractValue= ruleExtractValue EOF
            {
             newCompositeNode(grammarAccess.getExtractValueRule()); 
            pushFollow(FOLLOW_ruleExtractValue_in_entryRuleExtractValue1163);
            iv_ruleExtractValue=ruleExtractValue();

            state._fsp--;

             current =iv_ruleExtractValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractValue1173); 

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
    // $ANTLR end "entryRuleExtractValue"


    // $ANTLR start "ruleExtractValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:506:1: ruleExtractValue returns [EObject current=null] : (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleExtractValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_index_3_0=null;
        EObject lv_aggregate_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:509:28: ( (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:510:1: (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:510:1: (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:510:3: otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleExtractValue1210); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractValueAccess().getExtractvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:514:1: ( (lv_aggregate_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:515:1: (lv_aggregate_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:515:1: (lv_aggregate_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:516:3: lv_aggregate_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getAggregateTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractValue1231);
            lv_aggregate_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractValueRule());
            	        }
                   		set(
                   			current, 
                   			"aggregate",
                    		lv_aggregate_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:532:2: (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:532:4: otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExtractValue1244); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExtractValueAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:536:1: ( (lv_index_3_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:537:1: (lv_index_3_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:537:1: (lv_index_3_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:538:3: lv_index_3_0= RULE_INT
            	    {
            	    lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExtractValue1261); 

            	    			newLeafNode(lv_index_3_0, grammarAccess.getExtractValueAccess().getIndexINTTerminalRuleCall_2_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtractValueRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"index",
            	            		lv_index_3_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


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
    // $ANTLR end "ruleExtractValue"


    // $ANTLR start "entryRuleInsertValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:562:1: entryRuleInsertValue returns [EObject current=null] : iv_ruleInsertValue= ruleInsertValue EOF ;
    public final EObject entryRuleInsertValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:563:2: (iv_ruleInsertValue= ruleInsertValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:564:2: iv_ruleInsertValue= ruleInsertValue EOF
            {
             newCompositeNode(grammarAccess.getInsertValueRule()); 
            pushFollow(FOLLOW_ruleInsertValue_in_entryRuleInsertValue1304);
            iv_ruleInsertValue=ruleInsertValue();

            state._fsp--;

             current =iv_ruleInsertValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertValue1314); 

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
    // $ANTLR end "entryRuleInsertValue"


    // $ANTLR start "ruleInsertValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:571:1: ruleInsertValue returns [EObject current=null] : (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleInsertValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token lv_index_5_0=null;
        EObject lv_aggregate_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:574:28: ( (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:575:1: (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:575:1: (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:575:3: otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleInsertValue1351); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertValueAccess().getInsertvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:579:1: ( (lv_aggregate_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:580:1: (lv_aggregate_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:580:1: (lv_aggregate_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:581:3: lv_aggregate_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getAggregateTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertValue1372);
            lv_aggregate_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"aggregate",
                    		lv_aggregate_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInsertValue1384); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertValueAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:601:1: ( (lv_value_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:602:1: (lv_value_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:602:1: (lv_value_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:603:3: lv_value_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getValueTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertValue1405);
            lv_value_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:619:2: (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==15) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:619:4: otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) )
            	    {
            	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleInsertValue1418); 

            	        	newLeafNode(otherlv_4, grammarAccess.getInsertValueAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:623:1: ( (lv_index_5_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:624:1: (lv_index_5_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:624:1: (lv_index_5_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:625:3: lv_index_5_0= RULE_INT
            	    {
            	    lv_index_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInsertValue1435); 

            	    			newLeafNode(lv_index_5_0, grammarAccess.getInsertValueAccess().getIndexINTTerminalRuleCall_4_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInsertValueRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"index",
            	            		lv_index_5_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


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
    // $ANTLR end "ruleInsertValue"


    // $ANTLR start "entryRuleFence"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:649:1: entryRuleFence returns [EObject current=null] : iv_ruleFence= ruleFence EOF ;
    public final EObject entryRuleFence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFence = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:650:2: (iv_ruleFence= ruleFence EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:651:2: iv_ruleFence= ruleFence EOF
            {
             newCompositeNode(grammarAccess.getFenceRule()); 
            pushFollow(FOLLOW_ruleFence_in_entryRuleFence1478);
            iv_ruleFence=ruleFence();

            state._fsp--;

             current =iv_ruleFence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFence1488); 

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
    // $ANTLR end "entryRuleFence"


    // $ANTLR start "ruleFence"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:658:1: ruleFence returns [EObject current=null] : (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) ) ) ;
    public final EObject ruleFence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ordering_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:661:28: ( (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:662:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:662:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:662:3: otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleFence1525); 

                	newLeafNode(otherlv_0, grammarAccess.getFenceAccess().getFenceKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:666:1: (otherlv_1= 'singlethread' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:666:3: otherlv_1= 'singlethread'
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleFence1538); 

                        	newLeafNode(otherlv_1, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:670:3: ( (lv_ordering_2_0= ruleAtomicOrdering ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:671:1: (lv_ordering_2_0= ruleAtomicOrdering )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:671:1: (lv_ordering_2_0= ruleAtomicOrdering )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:672:3: lv_ordering_2_0= ruleAtomicOrdering
            {
             
            	        newCompositeNode(grammarAccess.getFenceAccess().getOrderingAtomicOrderingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleFence1561);
            lv_ordering_2_0=ruleAtomicOrdering();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFenceRule());
            	        }
                   		set(
                   			current, 
                   			"ordering",
                    		lv_ordering_2_0, 
                    		"AtomicOrdering");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleFence"


    // $ANTLR start "entryRuleAtomicOrdering"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:696:1: entryRuleAtomicOrdering returns [String current=null] : iv_ruleAtomicOrdering= ruleAtomicOrdering EOF ;
    public final String entryRuleAtomicOrdering() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtomicOrdering = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:697:2: (iv_ruleAtomicOrdering= ruleAtomicOrdering EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:698:2: iv_ruleAtomicOrdering= ruleAtomicOrdering EOF
            {
             newCompositeNode(grammarAccess.getAtomicOrderingRule()); 
            pushFollow(FOLLOW_ruleAtomicOrdering_in_entryRuleAtomicOrdering1598);
            iv_ruleAtomicOrdering=ruleAtomicOrdering();

            state._fsp--;

             current =iv_ruleAtomicOrdering.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicOrdering1609); 

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
    // $ANTLR end "entryRuleAtomicOrdering"


    // $ANTLR start "ruleAtomicOrdering"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:705:1: ruleAtomicOrdering returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) ;
    public final AntlrDatatypeRuleToken ruleAtomicOrdering() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:708:28: ( (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:709:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:709:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt17=1;
                }
                break;
            case 26:
                {
                alt17=2;
                }
                break;
            case 27:
                {
                alt17=3;
                }
                break;
            case 28:
                {
                alt17=4;
                }
                break;
            case 29:
                {
                alt17=5;
                }
                break;
            case 30:
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:710:2: kw= 'unordered'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleAtomicOrdering1647); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getUnorderedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:717:2: kw= 'monotonic'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleAtomicOrdering1666); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getMonotonicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:724:2: kw= 'aquire'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleAtomicOrdering1685); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getAquireKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:731:2: kw= 'release'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleAtomicOrdering1704); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getReleaseKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:738:2: kw= 'acq_rel'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleAtomicOrdering1723); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getAcq_relKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:745:2: kw= 'seq_cst'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleAtomicOrdering1742); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getSeq_cstKeyword_5()); 
                        

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
    // $ANTLR end "ruleAtomicOrdering"


    // $ANTLR start "entryRuleCmpXchg"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:758:1: entryRuleCmpXchg returns [EObject current=null] : iv_ruleCmpXchg= ruleCmpXchg EOF ;
    public final EObject entryRuleCmpXchg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpXchg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:759:2: (iv_ruleCmpXchg= ruleCmpXchg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:760:2: iv_ruleCmpXchg= ruleCmpXchg EOF
            {
             newCompositeNode(grammarAccess.getCmpXchgRule()); 
            pushFollow(FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg1782);
            iv_ruleCmpXchg=ruleCmpXchg();

            state._fsp--;

             current =iv_ruleCmpXchg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmpXchg1792); 

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
    // $ANTLR end "entryRuleCmpXchg"


    // $ANTLR start "ruleCmpXchg"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:767:1: ruleCmpXchg returns [EObject current=null] : (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) ) ) ;
    public final EObject ruleCmpXchg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_adress_2_0 = null;

        EObject lv_compare_val_4_0 = null;

        EObject lv_new_val_6_0 = null;

        AntlrDatatypeRuleToken lv_ordering_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:770:28: ( (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:771:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:771:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:771:3: otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) )
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleCmpXchg1829); 

                	newLeafNode(otherlv_0, grammarAccess.getCmpXchgAccess().getCmpxchgKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:775:1: (otherlv_1= 'volatile' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==32) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:775:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleCmpXchg1842); 

                        	newLeafNode(otherlv_1, grammarAccess.getCmpXchgAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:779:3: ( (lv_adress_2_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:780:1: (lv_adress_2_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:780:1: (lv_adress_2_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:781:3: lv_adress_2_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getAdressTypeAndValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg1865);
            lv_adress_2_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"adress",
                    		lv_adress_2_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleCmpXchg1877); 

                	newLeafNode(otherlv_3, grammarAccess.getCmpXchgAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:801:1: ( (lv_compare_val_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:802:1: (lv_compare_val_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:802:1: (lv_compare_val_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:803:3: lv_compare_val_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getCompare_valTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg1898);
            lv_compare_val_4_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"compare_val",
                    		lv_compare_val_4_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleCmpXchg1910); 

                	newLeafNode(otherlv_5, grammarAccess.getCmpXchgAccess().getCommaKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:823:1: ( (lv_new_val_6_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:824:1: (lv_new_val_6_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:824:1: (lv_new_val_6_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:825:3: lv_new_val_6_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getNew_valTypeAndValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg1931);
            lv_new_val_6_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"new_val",
                    		lv_new_val_6_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:841:2: (otherlv_7= 'singlethread' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:841:4: otherlv_7= 'singlethread'
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleCmpXchg1944); 

                        	newLeafNode(otherlv_7, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_7());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:845:3: ( (lv_ordering_8_0= ruleAtomicOrdering ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:846:1: (lv_ordering_8_0= ruleAtomicOrdering )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:846:1: (lv_ordering_8_0= ruleAtomicOrdering )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:847:3: lv_ordering_8_0= ruleAtomicOrdering
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getOrderingAtomicOrderingParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleCmpXchg1967);
            lv_ordering_8_0=ruleAtomicOrdering();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"ordering",
                    		lv_ordering_8_0, 
                    		"AtomicOrdering");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleCmpXchg"


    // $ANTLR start "entryRuleAtomicRMW"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:871:1: entryRuleAtomicRMW returns [EObject current=null] : iv_ruleAtomicRMW= ruleAtomicRMW EOF ;
    public final EObject entryRuleAtomicRMW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRMW = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:872:2: (iv_ruleAtomicRMW= ruleAtomicRMW EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:873:2: iv_ruleAtomicRMW= ruleAtomicRMW EOF
            {
             newCompositeNode(grammarAccess.getAtomicRMWRule()); 
            pushFollow(FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW2003);
            iv_ruleAtomicRMW=ruleAtomicRMW();

            state._fsp--;

             current =iv_ruleAtomicRMW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRMW2013); 

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
    // $ANTLR end "entryRuleAtomicRMW"


    // $ANTLR start "ruleAtomicRMW"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:880:1: ruleAtomicRMW returns [EObject current=null] : (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) ) ) ;
    public final EObject ruleAtomicRMW() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_adress_3_0 = null;

        EObject lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_ordering_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:883:28: ( (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:884:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:884:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:884:3: otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) )
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleAtomicRMW2050); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRMWAccess().getAtomicrmwKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:888:1: (otherlv_1= 'volatile' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:888:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleAtomicRMW2063); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicRMWAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getAtomicRMWAccess().getBinOpParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleBinOp_in_ruleAtomicRMW2081);
            ruleBinOp();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:900:1: ( (lv_adress_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:901:1: (lv_adress_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:901:1: (lv_adress_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:902:3: lv_adress_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getAdressTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW2101);
            lv_adress_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"adress",
                    		lv_adress_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAtomicRMW2113); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRMWAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:922:1: ( (lv_value_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:923:1: (lv_value_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:923:1: (lv_value_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:924:3: lv_value_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getValueTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW2134);
            lv_value_5_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:940:2: (otherlv_6= 'singlethread' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:940:4: otherlv_6= 'singlethread'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleAtomicRMW2147); 

                        	newLeafNode(otherlv_6, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_6());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:944:3: ( (lv_ordering_7_0= ruleAtomicOrdering ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:945:1: (lv_ordering_7_0= ruleAtomicOrdering )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:945:1: (lv_ordering_7_0= ruleAtomicOrdering )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:946:3: lv_ordering_7_0= ruleAtomicOrdering
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getOrderingAtomicOrderingParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleAtomicRMW2170);
            lv_ordering_7_0=ruleAtomicOrdering();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"ordering",
                    		lv_ordering_7_0, 
                    		"AtomicOrdering");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleAtomicRMW"


    // $ANTLR start "entryRuleBinOp"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:970:1: entryRuleBinOp returns [String current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final String entryRuleBinOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinOp = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:971:2: (iv_ruleBinOp= ruleBinOp EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:972:2: iv_ruleBinOp= ruleBinOp EOF
            {
             newCompositeNode(grammarAccess.getBinOpRule()); 
            pushFollow(FOLLOW_ruleBinOp_in_entryRuleBinOp2207);
            iv_ruleBinOp=ruleBinOp();

            state._fsp--;

             current =iv_ruleBinOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinOp2218); 

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
    // $ANTLR end "entryRuleBinOp"


    // $ANTLR start "ruleBinOp"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:979:1: ruleBinOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) ;
    public final AntlrDatatypeRuleToken ruleBinOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:982:28: ( (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:983:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:983:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            int alt22=11;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt22=1;
                }
                break;
            case 35:
                {
                alt22=2;
                }
                break;
            case 36:
                {
                alt22=3;
                }
                break;
            case 37:
                {
                alt22=4;
                }
                break;
            case 38:
                {
                alt22=5;
                }
                break;
            case 39:
                {
                alt22=6;
                }
                break;
            case 40:
                {
                alt22=7;
                }
                break;
            case 41:
                {
                alt22=8;
                }
                break;
            case 42:
                {
                alt22=9;
                }
                break;
            case 43:
                {
                alt22=10;
                }
                break;
            case 44:
                {
                alt22=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:984:2: kw= 'xchg'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleBinOp2256); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getXchgKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:991:2: kw= 'add'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleBinOp2275); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getAddKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:998:2: kw= 'sub'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleBinOp2294); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getSubKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1005:2: kw= 'and'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleBinOp2313); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getAndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1012:2: kw= 'nand'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleBinOp2332); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getNandKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1019:2: kw= 'or'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleBinOp2351); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getOrKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1026:2: kw= 'xor'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleBinOp2370); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getXorKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1033:2: kw= 'max'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleBinOp2389); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getMaxKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1040:2: kw= 'min'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleBinOp2408); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getMinKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1047:2: kw= 'umax'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBinOp2427); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getUmaxKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1054:2: kw= 'umin'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleBinOp2446); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getUminKeyword_10()); 
                        

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
    // $ANTLR end "ruleBinOp"


    // $ANTLR start "entryRuleLoad"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1067:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1068:2: (iv_ruleLoad= ruleLoad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1069:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_ruleLoad_in_entryRuleLoad2486);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoad2496); 

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
    // $ANTLR end "entryRuleLoad"


    // $ANTLR start "ruleLoad"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1076:1: ruleLoad returns [EObject current=null] : ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? ) | (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_index_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_index_17_0=null;
        EObject lv_adress_2_0 = null;

        AntlrDatatypeRuleToken lv_align_4_0 = null;

        EObject lv_adress_12_0 = null;

        AntlrDatatypeRuleToken lv_ordering_14_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1079:28: ( ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? ) | (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1080:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? ) | (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1080:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? ) | (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==45) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==48) ) {
                    alt29=2;
                }
                else if ( (LA29_1==RULE_VAR_TYPE||LA29_1==32) ) {
                    alt29=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1080:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1080:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1080:4: otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )?
                    {
                    otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleLoad2534); 

                        	newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1084:1: (otherlv_1= 'volatile' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==32) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1084:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleLoad2547); 

                                	newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1088:3: ( (lv_adress_2_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1089:1: (lv_adress_2_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1089:1: (lv_adress_2_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1090:3: lv_adress_2_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeAndValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLoad2570);
                    lv_adress_2_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"adress",
                            		lv_adress_2_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1106:2: (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==15) ) {
                        int LA24_1 = input.LA(2);

                        if ( (LA24_1==49) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1106:4: otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) )
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleLoad2583); 

                                	newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getCommaKeyword_0_3_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1110:1: ( (lv_align_4_0= ruleAlignment ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1111:1: (lv_align_4_0= ruleAlignment )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1111:1: (lv_align_4_0= ruleAlignment )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1112:3: lv_align_4_0= ruleAlignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getLoadAccess().getAlignAlignmentParserRuleCall_0_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAlignment_in_ruleLoad2604);
                            lv_align_4_0=ruleAlignment();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLoadRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"align",
                                    		lv_align_4_0, 
                                    		"Alignment");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1128:4: (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==15) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1128:6: otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) )
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleLoad2619); 

                                	newLeafNode(otherlv_5, grammarAccess.getLoadAccess().getCommaKeyword_0_4_0());
                                
                            otherlv_6=(Token)match(input,46,FOLLOW_46_in_ruleLoad2631); 

                                	newLeafNode(otherlv_6, grammarAccess.getLoadAccess().getNontemporalKeyword_0_4_1());
                                
                            otherlv_7=(Token)match(input,47,FOLLOW_47_in_ruleLoad2643); 

                                	newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getExclamationMarkKeyword_0_4_2());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1140:1: ( (lv_index_8_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1141:1: (lv_index_8_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1141:1: (lv_index_8_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1142:3: lv_index_8_0= RULE_INT
                            {
                            lv_index_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoad2660); 

                            			newLeafNode(lv_index_8_0, grammarAccess.getLoadAccess().getIndexINTTerminalRuleCall_0_4_3_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLoadRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"index",
                                    		lv_index_8_0, 
                                    		"INT");
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1159:6: (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1159:6: (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1159:8: otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )?
                    {
                    otherlv_9=(Token)match(input,45,FOLLOW_45_in_ruleLoad2687); 

                        	newLeafNode(otherlv_9, grammarAccess.getLoadAccess().getLoadKeyword_1_0());
                        
                    otherlv_10=(Token)match(input,48,FOLLOW_48_in_ruleLoad2699); 

                        	newLeafNode(otherlv_10, grammarAccess.getLoadAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1167:1: (otherlv_11= 'volatile' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==32) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1167:3: otherlv_11= 'volatile'
                            {
                            otherlv_11=(Token)match(input,32,FOLLOW_32_in_ruleLoad2712); 

                                	newLeafNode(otherlv_11, grammarAccess.getLoadAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1171:3: ( (lv_adress_12_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1172:1: (lv_adress_12_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1172:1: (lv_adress_12_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1173:3: lv_adress_12_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLoad2735);
                    lv_adress_12_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"adress",
                            		lv_adress_12_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1189:2: (otherlv_13= 'singlethread' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==24) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1189:4: otherlv_13= 'singlethread'
                            {
                            otherlv_13=(Token)match(input,24,FOLLOW_24_in_ruleLoad2748); 

                                	newLeafNode(otherlv_13, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_4());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1193:3: ( (lv_ordering_14_0= ruleAtomicOrdering ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1194:1: (lv_ordering_14_0= ruleAtomicOrdering )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1194:1: (lv_ordering_14_0= ruleAtomicOrdering )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1195:3: lv_ordering_14_0= ruleAtomicOrdering
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getOrderingAtomicOrderingParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleLoad2771);
                    lv_ordering_14_0=ruleAtomicOrdering();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"ordering",
                            		lv_ordering_14_0, 
                            		"AtomicOrdering");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1211:2: (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==15) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1211:4: otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) )
                            {
                            otherlv_15=(Token)match(input,15,FOLLOW_15_in_ruleLoad2784); 

                                	newLeafNode(otherlv_15, grammarAccess.getLoadAccess().getCommaKeyword_1_6_0());
                                
                            otherlv_16=(Token)match(input,49,FOLLOW_49_in_ruleLoad2796); 

                                	newLeafNode(otherlv_16, grammarAccess.getLoadAccess().getAlignKeyword_1_6_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1219:1: ( (lv_index_17_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1220:1: (lv_index_17_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1220:1: (lv_index_17_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1221:3: lv_index_17_0= RULE_INT
                            {
                            lv_index_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoad2813); 

                            			newLeafNode(lv_index_17_0, grammarAccess.getLoadAccess().getIndexINTTerminalRuleCall_1_6_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLoadRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"index",
                                    		lv_index_17_0, 
                                    		"INT");
                            	    

                            }


                            }


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
    // $ANTLR end "ruleLoad"


    // $ANTLR start "entryRuleStore"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1245:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1246:2: (iv_ruleStore= ruleStore EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1247:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore2857);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore2867); 

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
    // $ANTLR end "entryRuleStore"


    // $ANTLR start "ruleStore"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1254:1: ruleStore returns [EObject current=null] : ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_INT_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_index_18_0=null;
        EObject lv_value_2_0 = null;

        EObject lv_adress_4_0 = null;

        EObject lv_value_11_0 = null;

        EObject lv_adress_13_0 = null;

        AntlrDatatypeRuleToken lv_ordering_15_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1257:28: ( ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1258:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1258:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==50) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_VAR_TYPE||LA35_1==32) ) {
                    alt35=1;
                }
                else if ( (LA35_1==48) ) {
                    alt35=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1258:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1258:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1258:4: otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )?
                    {
                    otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleStore2905); 

                        	newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1262:1: (otherlv_1= 'volatile' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==32) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1262:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleStore2918); 

                                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1266:3: ( (lv_value_2_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1267:1: (lv_value_2_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1267:1: (lv_value_2_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1268:3: lv_value_2_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueTypeAndValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore2941);
                    lv_value_2_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleStore2953); 

                        	newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getCommaKeyword_0_3());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1288:1: ( (lv_adress_4_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1289:1: (lv_adress_4_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1289:1: (lv_adress_4_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1290:3: lv_adress_4_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeAndValueParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore2974);
                    lv_adress_4_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"adress",
                            		lv_adress_4_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1306:2: (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==15) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1306:4: otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT
                            {
                            otherlv_5=(Token)match(input,15,FOLLOW_15_in_ruleStore2987); 

                                	newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getCommaKeyword_0_5_0());
                                
                            otherlv_6=(Token)match(input,49,FOLLOW_49_in_ruleStore2999); 

                                	newLeafNode(otherlv_6, grammarAccess.getStoreAccess().getAlignKeyword_0_5_1());
                                
                            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStore3010); 
                             
                                newLeafNode(this_INT_7, grammarAccess.getStoreAccess().getINTTerminalRuleCall_0_5_2()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1319:6: (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1319:6: (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1319:8: otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )?
                    {
                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleStore3031); 

                        	newLeafNode(otherlv_8, grammarAccess.getStoreAccess().getStoreKeyword_1_0());
                        
                    otherlv_9=(Token)match(input,48,FOLLOW_48_in_ruleStore3043); 

                        	newLeafNode(otherlv_9, grammarAccess.getStoreAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1327:1: (otherlv_10= 'volatile' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==32) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1327:3: otherlv_10= 'volatile'
                            {
                            otherlv_10=(Token)match(input,32,FOLLOW_32_in_ruleStore3056); 

                                	newLeafNode(otherlv_10, grammarAccess.getStoreAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1331:3: ( (lv_value_11_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1332:1: (lv_value_11_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1332:1: (lv_value_11_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1333:3: lv_value_11_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore3079);
                    lv_value_11_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_11_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,15,FOLLOW_15_in_ruleStore3091); 

                        	newLeafNode(otherlv_12, grammarAccess.getStoreAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1353:1: ( (lv_adress_13_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1354:1: (lv_adress_13_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1354:1: (lv_adress_13_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1355:3: lv_adress_13_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeAndValueParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore3112);
                    lv_adress_13_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"adress",
                            		lv_adress_13_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1371:2: (otherlv_14= 'singlethread' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==24) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1371:4: otherlv_14= 'singlethread'
                            {
                            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleStore3125); 

                                	newLeafNode(otherlv_14, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1375:3: ( (lv_ordering_15_0= ruleAtomicOrdering ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1376:1: (lv_ordering_15_0= ruleAtomicOrdering )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1376:1: (lv_ordering_15_0= ruleAtomicOrdering )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1377:3: lv_ordering_15_0= ruleAtomicOrdering
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getOrderingAtomicOrderingParserRuleCall_1_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleStore3148);
                    lv_ordering_15_0=ruleAtomicOrdering();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"ordering",
                            		lv_ordering_15_0, 
                            		"AtomicOrdering");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1393:2: (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==15) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1393:4: otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) )
                            {
                            otherlv_16=(Token)match(input,15,FOLLOW_15_in_ruleStore3161); 

                                	newLeafNode(otherlv_16, grammarAccess.getStoreAccess().getCommaKeyword_1_8_0());
                                
                            otherlv_17=(Token)match(input,49,FOLLOW_49_in_ruleStore3173); 

                                	newLeafNode(otherlv_17, grammarAccess.getStoreAccess().getAlignKeyword_1_8_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1401:1: ( (lv_index_18_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1402:1: (lv_index_18_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1402:1: (lv_index_18_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1403:3: lv_index_18_0= RULE_INT
                            {
                            lv_index_18_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStore3190); 

                            			newLeafNode(lv_index_18_0, grammarAccess.getStoreAccess().getIndexINTTerminalRuleCall_1_8_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStoreRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"index",
                                    		lv_index_18_0, 
                                    		"INT");
                            	    

                            }


                            }


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
    // $ANTLR end "ruleStore"


    // $ANTLR start "entryRuleCall"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1427:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1428:2: (iv_ruleCall= ruleCall EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1429:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall3234);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall3244); 

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
    // $ANTLR end "entryRuleCall"


    // $ANTLR start "ruleCall"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1436:1: ruleCall returns [EObject current=null] : ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )? ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pointer_4_0 = null;

        EObject lv_plist_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1439:28: ( ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:2: (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:2: (otherlv_0= 'tail' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==51) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:4: otherlv_0= 'tail'
                    {
                    otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleCall3282); 

                        	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getTailKeyword_0());
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleCall3296); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getCallKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1448:1: ( ruleCallingConv )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT||(LA37_0>=62 && LA37_0<=76)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1449:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getCallingConvParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleCall3313);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1456:3: ( ruleReturnAttributes )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=53 && LA38_0<=60)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1457:5: ruleReturnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getReturnAttributesParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleReturnAttributes_in_ruleCall3331);
                    ruleReturnAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1464:3: ( (lv_pointer_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1465:1: (lv_pointer_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1465:1: (lv_pointer_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1466:3: lv_pointer_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPointerTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCall3353);
            lv_pointer_4_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"pointer",
                    		lv_pointer_4_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1482:2: ( (lv_plist_5_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1483:1: (lv_plist_5_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1483:1: (lv_plist_5_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1484:3: lv_plist_5_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPlistParameterListParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleCall3374);
            lv_plist_5_0=ruleParameterList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"plist",
                    		lv_plist_5_0, 
                    		"ParameterList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1500:2: ( ruleFunctionAttributes )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=77 && LA39_0<=78)||(LA39_0>=81 && LA39_0<=96)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1501:5: ruleFunctionAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getFunctionAttributesParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFunctionAttributes_in_ruleCall3391);
                    ruleFunctionAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleReturnAttributes"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1516:1: entryRuleReturnAttributes returns [String current=null] : iv_ruleReturnAttributes= ruleReturnAttributes EOF ;
    public final String entryRuleReturnAttributes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnAttributes = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1517:2: (iv_ruleReturnAttributes= ruleReturnAttributes EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1518:2: iv_ruleReturnAttributes= ruleReturnAttributes EOF
            {
             newCompositeNode(grammarAccess.getReturnAttributesRule()); 
            pushFollow(FOLLOW_ruleReturnAttributes_in_entryRuleReturnAttributes3429);
            iv_ruleReturnAttributes=ruleReturnAttributes();

            state._fsp--;

             current =iv_ruleReturnAttributes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnAttributes3440); 

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
    // $ANTLR end "entryRuleReturnAttributes"


    // $ANTLR start "ruleReturnAttributes"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1525:1: ruleReturnAttributes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) ;
    public final AntlrDatatypeRuleToken ruleReturnAttributes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1528:28: ( (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1529:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1529:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            int alt40=8;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt40=1;
                }
                break;
            case 54:
                {
                alt40=2;
                }
                break;
            case 55:
                {
                alt40=3;
                }
                break;
            case 56:
                {
                alt40=4;
                }
                break;
            case 57:
                {
                alt40=5;
                }
                break;
            case 58:
                {
                alt40=6;
                }
                break;
            case 59:
                {
                alt40=7;
                }
                break;
            case 60:
                {
                alt40=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1530:2: kw= 'zeroext'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleReturnAttributes3478); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getZeroextKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1537:2: kw= 'signext'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleReturnAttributes3497); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getSignextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1544:2: kw= 'inreg'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleReturnAttributes3516); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getInregKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1551:2: kw= 'byval'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleReturnAttributes3535); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getByvalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1558:2: kw= 'sret'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleReturnAttributes3554); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getSretKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1565:2: kw= 'noalias'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleReturnAttributes3573); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getNoaliasKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1572:2: kw= 'nocapture'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleReturnAttributes3592); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getNocaptureKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1579:2: kw= 'nest'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleReturnAttributes3611); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getNestKeyword_7()); 
                        

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
    // $ANTLR end "ruleReturnAttributes"


    // $ANTLR start "entryRuleAlloc"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1592:1: entryRuleAlloc returns [EObject current=null] : iv_ruleAlloc= ruleAlloc EOF ;
    public final EObject entryRuleAlloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlloc = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1593:2: (iv_ruleAlloc= ruleAlloc EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1594:2: iv_ruleAlloc= ruleAlloc EOF
            {
             newCompositeNode(grammarAccess.getAllocRule()); 
            pushFollow(FOLLOW_ruleAlloc_in_entryRuleAlloc3651);
            iv_ruleAlloc=ruleAlloc();

            state._fsp--;

             current =iv_ruleAlloc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlloc3661); 

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
    // $ANTLR end "entryRuleAlloc"


    // $ANTLR start "ruleAlloc"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1601:1: ruleAlloc returns [EObject current=null] : (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )? ) ;
    public final EObject ruleAlloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_numElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1604:28: ( (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1605:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1605:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1605:3: otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )?
            {
            otherlv_0=(Token)match(input,61,FOLLOW_61_in_ruleAlloc3698); 

                	newLeafNode(otherlv_0, grammarAccess.getAllocAccess().getAllocaKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1609:1: ( (lv_type_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1610:1: (lv_type_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1610:1: (lv_type_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1611:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAllocAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlloc3719);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAllocRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1627:2: (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==15) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_VAR_TYPE) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1627:4: otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) )
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleAlloc3732); 

                        	newLeafNode(otherlv_2, grammarAccess.getAllocAccess().getCommaKeyword_2_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1631:1: ( (lv_numElements_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1632:1: (lv_numElements_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1632:1: (lv_numElements_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1633:3: lv_numElements_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getNumElementsTypeAndValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAlloc3753);
                    lv_numElements_3_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAllocRule());
                    	        }
                           		set(
                           			current, 
                           			"numElements",
                            		lv_numElements_3_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1649:4: (otherlv_4= ',' ruleAlignment )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==15) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1649:6: otherlv_4= ',' ruleAlignment
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleAlloc3768); 

                        	newLeafNode(otherlv_4, grammarAccess.getAllocAccess().getCommaKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getAllocAccess().getAlignmentParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleAlignment_in_ruleAlloc3784);
                    ruleAlignment();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleAlloc"


    // $ANTLR start "entryRuleCallingConv"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1669:1: entryRuleCallingConv returns [String current=null] : iv_ruleCallingConv= ruleCallingConv EOF ;
    public final String entryRuleCallingConv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCallingConv = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1670:2: (iv_ruleCallingConv= ruleCallingConv EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1671:2: iv_ruleCallingConv= ruleCallingConv EOF
            {
             newCompositeNode(grammarAccess.getCallingConvRule()); 
            pushFollow(FOLLOW_ruleCallingConv_in_entryRuleCallingConv3822);
            iv_ruleCallingConv=ruleCallingConv();

            state._fsp--;

             current =iv_ruleCallingConv.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallingConv3833); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1678:1: ruleCallingConv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' ) | this_INT_18= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCallingConv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_16=null;
        Token this_INT_18=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1681:28: ( (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' ) | this_INT_18= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1682:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' ) | this_INT_18= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1682:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' ) | this_INT_18= RULE_INT )
            int alt43=16;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt43=1;
                }
                break;
            case 63:
                {
                alt43=2;
                }
                break;
            case 64:
                {
                alt43=3;
                }
                break;
            case 65:
                {
                alt43=4;
                }
                break;
            case 66:
                {
                alt43=5;
                }
                break;
            case 67:
                {
                alt43=6;
                }
                break;
            case 68:
                {
                alt43=7;
                }
                break;
            case 69:
                {
                alt43=8;
                }
                break;
            case 70:
                {
                alt43=9;
                }
                break;
            case 71:
                {
                alt43=10;
                }
                break;
            case 72:
                {
                alt43=11;
                }
                break;
            case 73:
                {
                alt43=12;
                }
                break;
            case 74:
                {
                alt43=13;
                }
                break;
            case 75:
                {
                alt43=14;
                }
                break;
            case 76:
                {
                alt43=15;
                }
                break;
            case RULE_INT:
                {
                alt43=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }

            switch (alt43) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1683:2: kw= 'ccc'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleCallingConv3871); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCccKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1690:2: kw= 'fastcc'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleCallingConv3890); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getFastccKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1697:2: kw= 'coldcc'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleCallingConv3909); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getColdccKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1704:2: kw= 'x86_stdcallcc'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleCallingConv3928); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_stdcallccKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1711:2: kw= 'x86_fastcallcc'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleCallingConv3947); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_fastcallccKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1718:2: kw= 'x86_thiscallcc'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleCallingConv3966); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_thiscallccKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1725:2: kw= 'arm_apcscc'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleCallingConv3985); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_apcsccKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1732:2: kw= 'arm_aapcscc'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleCallingConv4004); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcsccKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1739:2: kw= 'arm_aapcs_vfpcc'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleCallingConv4023); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcs_vfpccKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1746:2: kw= 'msp430_intrcc'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleCallingConv4042); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getMsp430_intrccKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1753:2: kw= 'ptx_kernel'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleCallingConv4061); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_kernelKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1760:2: kw= 'ptx_device'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleCallingConv4080); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_deviceKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1767:2: kw= 'spir_func'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleCallingConv4099); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_funcKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1774:2: kw= 'spir_kernel'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleCallingConv4118); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_kernelKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1780:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1780:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1781:2: kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleCallingConv4138); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCcKeyword_14_0()); 
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleCallingConv4151); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getLessThanSignKeyword_14_1()); 
                        
                    this_INT_16=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv4166); 

                    		current.merge(this_INT_16);
                        
                     
                        newLeafNode(this_INT_16, grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_2()); 
                        
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleCallingConv4184); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getGreaterThanSignKeyword_14_3()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1806:10: this_INT_18= RULE_INT
                    {
                    this_INT_18=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv4206); 

                    		current.merge(this_INT_18);
                        
                     
                        newLeafNode(this_INT_18, grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_15()); 
                        

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


    // $ANTLR start "entryRuleFunctionAttributes"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1821:1: entryRuleFunctionAttributes returns [String current=null] : iv_ruleFunctionAttributes= ruleFunctionAttributes EOF ;
    public final String entryRuleFunctionAttributes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionAttributes = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1822:2: (iv_ruleFunctionAttributes= ruleFunctionAttributes EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1823:2: iv_ruleFunctionAttributes= ruleFunctionAttributes EOF
            {
             newCompositeNode(grammarAccess.getFunctionAttributesRule()); 
            pushFollow(FOLLOW_ruleFunctionAttributes_in_entryRuleFunctionAttributes4252);
            iv_ruleFunctionAttributes=ruleFunctionAttributes();

            state._fsp--;

             current =iv_ruleFunctionAttributes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionAttributes4263); 

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
    // $ANTLR end "entryRuleFunctionAttributes"


    // $ANTLR start "ruleFunctionAttributes"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1830:1: ruleFunctionAttributes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionAttributes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1833:28: ( (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1834:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1834:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            int alt44=18;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt44=1;
                }
                break;
            case 78:
                {
                alt44=2;
                }
                break;
            case 81:
                {
                alt44=3;
                }
                break;
            case 82:
                {
                alt44=4;
                }
                break;
            case 83:
                {
                alt44=5;
                }
                break;
            case 84:
                {
                alt44=6;
                }
                break;
            case 85:
                {
                alt44=7;
                }
                break;
            case 86:
                {
                alt44=8;
                }
                break;
            case 87:
                {
                alt44=9;
                }
                break;
            case 88:
                {
                alt44=10;
                }
                break;
            case 89:
                {
                alt44=11;
                }
                break;
            case 90:
                {
                alt44=12;
                }
                break;
            case 91:
                {
                alt44=13;
                }
                break;
            case 92:
                {
                alt44=14;
                }
                break;
            case 93:
                {
                alt44=15;
                }
                break;
            case 94:
                {
                alt44=16;
                }
                break;
            case 95:
                {
                alt44=17;
                }
                break;
            case 96:
                {
                alt44=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1835:2: kw= 'address_safety'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleFunctionAttributes4301); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getAddress_safetyKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1841:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1841:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1842:2: kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleFunctionAttributes4321); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getAlignstackKeyword_1_0()); 
                        
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleFunctionAttributes4334); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getLeftParenthesisKeyword_1_1()); 
                        
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleFunctionAttributes4347); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getLessThanSignKeyword_1_2()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFunctionAttributes4362); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getFunctionAttributesAccess().getINTTerminalRuleCall_1_3()); 
                        
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleFunctionAttributes4380); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getGreaterThanSignKeyword_1_4()); 
                        
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleFunctionAttributes4393); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getRightParenthesisKeyword_1_5()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1880:2: kw= 'alwaysinline'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleFunctionAttributes4413); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getAlwaysinlineKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1887:2: kw= 'nonlazybind'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleFunctionAttributes4432); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNonlazybindKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1894:2: kw= 'inlinehint'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleFunctionAttributes4451); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getInlinehintKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1901:2: kw= 'naked'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleFunctionAttributes4470); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNakedKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1908:2: kw= 'noimplicitfloat'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleFunctionAttributes4489); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNoimplicitfloatKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1915:2: kw= 'noinline'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleFunctionAttributes4508); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNoinlineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1922:2: kw= 'noredzone'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleFunctionAttributes4527); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNoredzoneKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1929:2: kw= 'noreturn'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleFunctionAttributes4546); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNoreturnKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1936:2: kw= 'nounwind'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleFunctionAttributes4565); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNounwindKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1943:2: kw= 'optsize'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleFunctionAttributes4584); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getOptsizeKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1950:2: kw= 'readnone'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleFunctionAttributes4603); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getReadnoneKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1957:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleFunctionAttributes4622); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getReadonlyKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1964:2: kw= 'returns_twice'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleFunctionAttributes4641); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getReturns_twiceKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1971:2: kw= 'ssp'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleFunctionAttributes4660); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getSspKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1978:2: kw= 'sspreq'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleFunctionAttributes4679); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getSspreqKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1985:2: kw= 'uwtable'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleFunctionAttributes4698); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getUwtableKeyword_17()); 
                        

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
    // $ANTLR end "ruleFunctionAttributes"


    // $ANTLR start "entryRuleParameterList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1998:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1999:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2000:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList4738);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList4748); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2007:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) ) ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2010:28: ( ( () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2011:1: ( () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2011:1: ( () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2011:2: () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2011:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2012:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterListAccess().getParameterListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleParameterList4794); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2021:1: (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==80) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_VAR_TYPE) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2021:3: otherlv_2= ')'
                    {
                    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleParameterList4807); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2026:6: ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2026:6: ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2026:7: ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')'
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2026:7: ( (lv_params_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2027:1: (lv_params_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2027:1: (lv_params_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2028:3: lv_params_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsTypeAndValueParserRuleCall_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleParameterList4835);
                    lv_params_3_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_3_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2044:2: (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==15) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2044:4: otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleParameterList4848); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_1_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2048:1: ( (lv_params_5_0= ruleTypeAndValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2049:1: (lv_params_5_0= ruleTypeAndValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2049:1: (lv_params_5_0= ruleTypeAndValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2050:3: lv_params_5_0= ruleTypeAndValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsTypeAndValueParserRuleCall_2_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleParameterList4869);
                    	    lv_params_5_0=ruleTypeAndValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"params",
                    	            		lv_params_5_0, 
                    	            		"TypeAndValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleParameterList4883); 

                        	newLeafNode(otherlv_6, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_2_1_2());
                        

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
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRulePHI"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2078:1: entryRulePHI returns [EObject current=null] : iv_rulePHI= rulePHI EOF ;
    public final EObject entryRulePHI() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePHI = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2079:2: (iv_rulePHI= rulePHI EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2080:2: iv_rulePHI= rulePHI EOF
            {
             newCompositeNode(grammarAccess.getPHIRule()); 
            pushFollow(FOLLOW_rulePHI_in_entryRulePHI4921);
            iv_rulePHI=rulePHI();

            state._fsp--;

             current =iv_rulePHI; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePHI4931); 

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
    // $ANTLR end "entryRulePHI"


    // $ANTLR start "rulePHI"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2087:1: rulePHI returns [EObject current=null] : (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) ;
    public final EObject rulePHI() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_values_3_0 = null;

        EObject lv_values_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2090:28: ( (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2091:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2091:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2091:3: otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            {
            otherlv_0=(Token)match(input,97,FOLLOW_97_in_rulePHI4968); 

                	newLeafNode(otherlv_0, grammarAccess.getPHIAccess().getPhiKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPHIAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_rulePHI4984);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,98,FOLLOW_98_in_rulePHI4995); 

                	newLeafNode(otherlv_2, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2107:1: ( (lv_values_3_0= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2108:1: (lv_values_3_0= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2108:1: (lv_values_3_0= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2109:3: lv_values_3_0= ruleValuePair
            {
             
            	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValuePair_in_rulePHI5016);
            lv_values_3_0=ruleValuePair();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPHIRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_3_0, 
                    		"ValuePair");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,99,FOLLOW_99_in_rulePHI5028); 

                	newLeafNode(otherlv_4, grammarAccess.getPHIAccess().getRightSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2129:1: (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==15) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2129:3: otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']'
            	    {
            	    otherlv_5=(Token)match(input,15,FOLLOW_15_in_rulePHI5041); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPHIAccess().getCommaKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,98,FOLLOW_98_in_rulePHI5053); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_5_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2137:1: ( (lv_values_7_0= ruleValuePair ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2138:1: (lv_values_7_0= ruleValuePair )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2138:1: (lv_values_7_0= ruleValuePair )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2139:3: lv_values_7_0= ruleValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValuePair_in_rulePHI5074);
            	    lv_values_7_0=ruleValuePair();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPHIRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_7_0, 
            	            		"ValuePair");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_8=(Token)match(input,99,FOLLOW_99_in_rulePHI5086); 

            	        	newLeafNode(otherlv_8, grammarAccess.getPHIAccess().getRightSquareBracketKeyword_5_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


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
    // $ANTLR end "rulePHI"


    // $ANTLR start "entryRuleValuePair"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2167:1: entryRuleValuePair returns [EObject current=null] : iv_ruleValuePair= ruleValuePair EOF ;
    public final EObject entryRuleValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuePair = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2168:2: (iv_ruleValuePair= ruleValuePair EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2169:2: iv_ruleValuePair= ruleValuePair EOF
            {
             newCompositeNode(grammarAccess.getValuePairRule()); 
            pushFollow(FOLLOW_ruleValuePair_in_entryRuleValuePair5124);
            iv_ruleValuePair=ruleValuePair();

            state._fsp--;

             current =iv_ruleValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuePair5134); 

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
    // $ANTLR end "entryRuleValuePair"


    // $ANTLR start "ruleValuePair"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2176:1: ruleValuePair returns [EObject current=null] : ( (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) ) ) ;
    public final EObject ruleValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value1_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value2_4_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2179:28: ( ( (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2180:1: ( (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2180:1: ( (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2180:2: (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2180:2: (otherlv_0= '%' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==100) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2180:4: otherlv_0= '%'
                    {
                    otherlv_0=(Token)match(input,100,FOLLOW_100_in_ruleValuePair5172); 

                        	newLeafNode(otherlv_0, grammarAccess.getValuePairAccess().getPercentSignKeyword_0());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2184:3: ( (lv_value1_1_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2185:1: (lv_value1_1_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2185:1: (lv_value1_1_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2186:3: lv_value1_1_0= RULE_ID
            {
            lv_value1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuePair5191); 

            			newLeafNode(lv_value1_1_0, grammarAccess.getValuePairAccess().getValue1IDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValuePairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value1",
                    		lv_value1_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleValuePair5208); 

                	newLeafNode(otherlv_2, grammarAccess.getValuePairAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2206:1: (otherlv_3= '%' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==100) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2206:3: otherlv_3= '%'
                    {
                    otherlv_3=(Token)match(input,100,FOLLOW_100_in_ruleValuePair5221); 

                        	newLeafNode(otherlv_3, grammarAccess.getValuePairAccess().getPercentSignKeyword_3());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2210:3: ( (lv_value2_4_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2211:1: (lv_value2_4_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2211:1: (lv_value2_4_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2212:3: lv_value2_4_0= RULE_ID
            {
            lv_value2_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuePair5240); 

            			newLeafNode(lv_value2_4_0, grammarAccess.getValuePairAccess().getValue2IDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getValuePairRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value2",
                    		lv_value2_4_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleValuePair"


    // $ANTLR start "entryRuleLandingPad"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2236:1: entryRuleLandingPad returns [EObject current=null] : iv_ruleLandingPad= ruleLandingPad EOF ;
    public final EObject entryRuleLandingPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingPad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2237:2: (iv_ruleLandingPad= ruleLandingPad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2238:2: iv_ruleLandingPad= ruleLandingPad EOF
            {
             newCompositeNode(grammarAccess.getLandingPadRule()); 
            pushFollow(FOLLOW_ruleLandingPad_in_entryRuleLandingPad5281);
            iv_ruleLandingPad=ruleLandingPad();

            state._fsp--;

             current =iv_ruleLandingPad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLandingPad5291); 

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
    // $ANTLR end "entryRuleLandingPad"


    // $ANTLR start "ruleLandingPad"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2245:1: ruleLandingPad returns [EObject current=null] : (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) ;
    public final EObject ruleLandingPad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_personality_3_0 = null;

        EObject lv_clause_5_0 = null;

        EObject lv_clause_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2248:28: ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2249:1: (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2249:1: (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2249:3: otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ )
            {
            otherlv_0=(Token)match(input,101,FOLLOW_101_in_ruleLandingPad5328); 

                	newLeafNode(otherlv_0, grammarAccess.getLandingPadAccess().getLandingpadKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2253:1: ( (lv_type_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2254:1: (lv_type_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2254:1: (lv_type_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2255:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLandingPad5349);
            lv_type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,102,FOLLOW_102_in_ruleLandingPad5361); 

                	newLeafNode(otherlv_2, grammarAccess.getLandingPadAccess().getPersonalityKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2275:1: ( (lv_personality_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2276:1: (lv_personality_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2276:1: (lv_personality_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2277:3: lv_personality_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLandingPad5382);
            lv_personality_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
            	        }
                   		set(
                   			current, 
                   			"personality",
                    		lv_personality_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2293:2: ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==103) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=104 && LA52_0<=105)) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2293:3: (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2293:3: (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2293:5: otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )*
                    {
                    otherlv_4=(Token)match(input,103,FOLLOW_103_in_ruleLandingPad5396); 

                        	newLeafNode(otherlv_4, grammarAccess.getLandingPadAccess().getCleanupKeyword_4_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2297:1: ( (lv_clause_5_0= ruleClause ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=104 && LA50_0<=105)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2298:1: (lv_clause_5_0= ruleClause )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2298:1: (lv_clause_5_0= ruleClause )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2299:3: lv_clause_5_0= ruleClause
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_4_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad5417);
                    	    lv_clause_5_0=ruleClause();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"clause",
                    	            		lv_clause_5_0, 
                    	            		"Clause");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2316:6: ( (lv_clause_6_0= ruleClause ) )+
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2316:6: ( (lv_clause_6_0= ruleClause ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=104 && LA51_0<=105)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2317:1: (lv_clause_6_0= ruleClause )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2317:1: (lv_clause_6_0= ruleClause )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2318:3: lv_clause_6_0= ruleClause
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad5446);
                    	    lv_clause_6_0=ruleClause();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"clause",
                    	            		lv_clause_6_0, 
                    	            		"Clause");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt51 >= 1 ) break loop51;
                                EarlyExitException eee =
                                    new EarlyExitException(51, input);
                                throw eee;
                        }
                        cnt51++;
                    } while (true);


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
    // $ANTLR end "ruleLandingPad"


    // $ANTLR start "entryRuleClause"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2342:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2343:2: (iv_ruleClause= ruleClause EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2344:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause5484);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause5494); 

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
    // $ANTLR end "entryRuleClause"


    // $ANTLR start "ruleClause"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2351:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_TypeAndValue_1 = null;

        EObject lv_filter_3_0 = null;

        EObject lv_filter_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2354:28: ( ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2355:1: ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2355:1: ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==104) ) {
                alt54=1;
            }
            else if ( (LA54_0==105) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2355:2: (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2355:2: (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2355:4: otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue
                    {
                    otherlv_0=(Token)match(input,104,FOLLOW_104_in_ruleClause5532); 

                        	newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getCatchKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getClauseAccess().getTypeAndValueParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause5554);
                    this_TypeAndValue_1=ruleTypeAndValue();

                    state._fsp--;

                     
                            current = this_TypeAndValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2369:6: (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2369:6: (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2369:8: otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )*
                    {
                    otherlv_2=(Token)match(input,105,FOLLOW_105_in_ruleClause5573); 

                        	newLeafNode(otherlv_2, grammarAccess.getClauseAccess().getFilterKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2373:1: ( (lv_filter_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2374:1: (lv_filter_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2374:1: (lv_filter_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2375:3: lv_filter_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause5594);
                    lv_filter_3_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		add(
                           			current, 
                           			"filter",
                            		lv_filter_3_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2391:2: (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==15) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2391:4: otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleClause5607); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2395:1: ( (lv_filter_5_0= ruleTypeAndValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2396:1: (lv_filter_5_0= ruleTypeAndValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2396:1: (lv_filter_5_0= ruleTypeAndValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2397:3: lv_filter_5_0= ruleTypeAndValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterTypeAndValueParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause5628);
                    	    lv_filter_5_0=ruleTypeAndValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"filter",
                    	            		lv_filter_5_0, 
                    	            		"TypeAndValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


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
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleSelect"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2421:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2422:2: (iv_ruleSelect= ruleSelect EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2423:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect5667);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect5677); 

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
    // $ANTLR end "entryRuleSelect"


    // $ANTLR start "ruleSelect"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2430:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_condition_1_0 = null;

        EObject lv_val1_3_0 = null;

        EObject lv_val2_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2433:28: ( (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2434:1: (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2434:1: (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2434:3: otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_106_in_ruleSelect5714); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2438:1: ( (lv_condition_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2439:1: (lv_condition_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2439:1: (lv_condition_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2440:3: lv_condition_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getConditionTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect5735);
            lv_condition_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSelect5747); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2460:1: ( (lv_val1_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2461:1: (lv_val1_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2461:1: (lv_val1_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2462:3: lv_val1_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal1TypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect5768);
            lv_val1_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"val1",
                    		lv_val1_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleSelect5780); 

                	newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2482:1: ( (lv_val2_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2483:1: (lv_val2_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2483:1: (lv_val2_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2484:3: lv_val2_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal2TypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect5801);
            lv_val2_5_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"val2",
                    		lv_val2_5_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVA_Arg"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2508:1: entryRuleVA_Arg returns [EObject current=null] : iv_ruleVA_Arg= ruleVA_Arg EOF ;
    public final EObject entryRuleVA_Arg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVA_Arg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2509:2: (iv_ruleVA_Arg= ruleVA_Arg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2510:2: iv_ruleVA_Arg= ruleVA_Arg EOF
            {
             newCompositeNode(grammarAccess.getVA_ArgRule()); 
            pushFollow(FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg5837);
            iv_ruleVA_Arg=ruleVA_Arg();

            state._fsp--;

             current =iv_ruleVA_Arg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVA_Arg5847); 

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
    // $ANTLR end "entryRuleVA_Arg"


    // $ANTLR start "ruleVA_Arg"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2517:1: ruleVA_Arg returns [EObject current=null] : (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) ) ;
    public final EObject ruleVA_Arg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;

        AntlrDatatypeRuleToken lv_argType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2520:28: ( (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2521:1: (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2521:1: (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2521:3: otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_107_in_ruleVA_Arg5884); 

                	newLeafNode(otherlv_0, grammarAccess.getVA_ArgAccess().getVa_argKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2525:1: ( (lv_list_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2526:1: (lv_list_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2526:1: (lv_list_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2527:3: lv_list_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getListTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleVA_Arg5905);
            lv_list_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVA_ArgRule());
            	        }
                   		set(
                   			current, 
                   			"list",
                    		lv_list_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleVA_Arg5917); 

                	newLeafNode(otherlv_2, grammarAccess.getVA_ArgAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2547:1: ( (lv_argType_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2548:1: (lv_argType_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2548:1: (lv_argType_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2549:3: lv_argType_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getArgTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVA_Arg5938);
            lv_argType_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVA_ArgRule());
            	        }
                   		set(
                   			current, 
                   			"argType",
                    		lv_argType_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleVA_Arg"


    // $ANTLR start "entryRuleExtractElement"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2573:1: entryRuleExtractElement returns [EObject current=null] : iv_ruleExtractElement= ruleExtractElement EOF ;
    public final EObject entryRuleExtractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2574:2: (iv_ruleExtractElement= ruleExtractElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2575:2: iv_ruleExtractElement= ruleExtractElement EOF
            {
             newCompositeNode(grammarAccess.getExtractElementRule()); 
            pushFollow(FOLLOW_ruleExtractElement_in_entryRuleExtractElement5974);
            iv_ruleExtractElement=ruleExtractElement();

            state._fsp--;

             current =iv_ruleExtractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractElement5984); 

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
    // $ANTLR end "entryRuleExtractElement"


    // $ANTLR start "ruleExtractElement"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2582:1: ruleExtractElement returns [EObject current=null] : (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) ) ;
    public final EObject ruleExtractElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_vector_1_0 = null;

        EObject lv_index_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2585:28: ( (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2586:1: (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2586:1: (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2586:3: otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_108_in_ruleExtractElement6021); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractElementAccess().getExtractelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2590:1: ( (lv_vector_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2591:1: (lv_vector_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2591:1: (lv_vector_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2592:3: lv_vector_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getVectorTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractElement6042);
            lv_vector_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractElementRule());
            	        }
                   		set(
                   			current, 
                   			"vector",
                    		lv_vector_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleExtractElement6054); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractElementAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2612:1: ( (lv_index_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2613:1: (lv_index_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2613:1: (lv_index_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2614:3: lv_index_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getIndexTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractElement6075);
            lv_index_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractElementRule());
            	        }
                   		set(
                   			current, 
                   			"index",
                    		lv_index_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleExtractElement"


    // $ANTLR start "entryRuleInsertElement"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2638:1: entryRuleInsertElement returns [EObject current=null] : iv_ruleInsertElement= ruleInsertElement EOF ;
    public final EObject entryRuleInsertElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2639:2: (iv_ruleInsertElement= ruleInsertElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2640:2: iv_ruleInsertElement= ruleInsertElement EOF
            {
             newCompositeNode(grammarAccess.getInsertElementRule()); 
            pushFollow(FOLLOW_ruleInsertElement_in_entryRuleInsertElement6111);
            iv_ruleInsertElement=ruleInsertElement();

            state._fsp--;

             current =iv_ruleInsertElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertElement6121); 

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
    // $ANTLR end "entryRuleInsertElement"


    // $ANTLR start "ruleInsertElement"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2647:1: ruleInsertElement returns [EObject current=null] : (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) ) ;
    public final EObject ruleInsertElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_vector_1_0 = null;

        EObject lv_scalar_3_0 = null;

        EObject lv_index_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2650:28: ( (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2651:1: (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2651:1: (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2651:3: otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,109,FOLLOW_109_in_ruleInsertElement6158); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertElementAccess().getInsertelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2655:1: ( (lv_vector_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2656:1: (lv_vector_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2656:1: (lv_vector_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2657:3: lv_vector_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getVectorTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement6179);
            lv_vector_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"vector",
                    		lv_vector_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleInsertElement6191); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertElementAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2677:1: ( (lv_scalar_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2678:1: (lv_scalar_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2678:1: (lv_scalar_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2679:3: lv_scalar_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getScalarTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement6212);
            lv_scalar_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"scalar",
                    		lv_scalar_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleInsertElement6224); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertElementAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2699:1: ( (lv_index_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2700:1: (lv_index_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2700:1: (lv_index_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2701:3: lv_index_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getIndexTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement6245);
            lv_index_5_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"index",
                    		lv_index_5_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleInsertElement"


    // $ANTLR start "entryRuleShuffleVector"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2725:1: entryRuleShuffleVector returns [EObject current=null] : iv_ruleShuffleVector= ruleShuffleVector EOF ;
    public final EObject entryRuleShuffleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2726:2: (iv_ruleShuffleVector= ruleShuffleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2727:2: iv_ruleShuffleVector= ruleShuffleVector EOF
            {
             newCompositeNode(grammarAccess.getShuffleVectorRule()); 
            pushFollow(FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector6281);
            iv_ruleShuffleVector=ruleShuffleVector();

            state._fsp--;

             current =iv_ruleShuffleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShuffleVector6291); 

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
    // $ANTLR end "entryRuleShuffleVector"


    // $ANTLR start "ruleShuffleVector"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2734:1: ruleShuffleVector returns [EObject current=null] : (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) ) ;
    public final EObject ruleShuffleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_vector1_1_0 = null;

        EObject lv_vector2_3_0 = null;

        EObject lv_mask_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2737:28: ( (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2738:1: (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2738:1: (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2738:3: otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_110_in_ruleShuffleVector6328); 

                	newLeafNode(otherlv_0, grammarAccess.getShuffleVectorAccess().getShufflevectorKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2742:1: ( (lv_vector1_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2743:1: (lv_vector1_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2743:1: (lv_vector1_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2744:3: lv_vector1_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVector1TypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector6349);
            lv_vector1_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"vector1",
                    		lv_vector1_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleShuffleVector6361); 

                	newLeafNode(otherlv_2, grammarAccess.getShuffleVectorAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2764:1: ( (lv_vector2_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2765:1: (lv_vector2_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2765:1: (lv_vector2_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2766:3: lv_vector2_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVector2TypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector6382);
            lv_vector2_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"vector2",
                    		lv_vector2_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleShuffleVector6394); 

                	newLeafNode(otherlv_4, grammarAccess.getShuffleVectorAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2786:1: ( (lv_mask_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2787:1: (lv_mask_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2787:1: (lv_mask_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2788:3: lv_mask_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getMaskTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector6415);
            lv_mask_5_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"mask",
                    		lv_mask_5_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleShuffleVector"


    // $ANTLR start "entryRuleCast"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2812:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2813:2: (iv_ruleCast= ruleCast EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2814:2: iv_ruleCast= ruleCast EOF
            {
             newCompositeNode(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast6451);
            iv_ruleCast=ruleCast();

            state._fsp--;

             current =iv_ruleCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast6461); 

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
    // $ANTLR end "entryRuleCast"


    // $ANTLR start "ruleCast"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2821:1: ruleCast returns [EObject current=null] : ( ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_castto_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2824:28: ( ( ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2825:1: ( ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2825:1: ( ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2826:5: ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) )
            {
             
                    newCompositeNode(grammarAccess.getCastAccess().getCastTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCastType_in_ruleCast6502);
            ruleCastType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2833:1: ( (lv_value_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2834:1: (lv_value_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2834:1: (lv_value_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2835:3: lv_value_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getValueTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCast6522);
            lv_value_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,111,FOLLOW_111_in_ruleCast6534); 

                	newLeafNode(otherlv_2, grammarAccess.getCastAccess().getToKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2855:1: ( (lv_castto_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2856:1: (lv_castto_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2856:1: (lv_castto_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2857:3: lv_castto_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getCasttoTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCast6555);
            lv_castto_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastRule());
            	        }
                   		set(
                   			current, 
                   			"castto",
                    		lv_castto_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleCast"


    // $ANTLR start "entryRuleCastType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2881:1: entryRuleCastType returns [String current=null] : iv_ruleCastType= ruleCastType EOF ;
    public final String entryRuleCastType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCastType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2882:2: (iv_ruleCastType= ruleCastType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2883:2: iv_ruleCastType= ruleCastType EOF
            {
             newCompositeNode(grammarAccess.getCastTypeRule()); 
            pushFollow(FOLLOW_ruleCastType_in_entryRuleCastType6592);
            iv_ruleCastType=ruleCastType();

            state._fsp--;

             current =iv_ruleCastType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastType6603); 

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
    // $ANTLR end "entryRuleCastType"


    // $ANTLR start "ruleCastType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2890:1: ruleCastType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) ;
    public final AntlrDatatypeRuleToken ruleCastType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2893:28: ( (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2894:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2894:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            int alt55=12;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt55=1;
                }
                break;
            case 113:
                {
                alt55=2;
                }
                break;
            case 114:
                {
                alt55=3;
                }
                break;
            case 115:
                {
                alt55=4;
                }
                break;
            case 116:
                {
                alt55=5;
                }
                break;
            case 117:
                {
                alt55=6;
                }
                break;
            case 118:
                {
                alt55=7;
                }
                break;
            case 119:
                {
                alt55=8;
                }
                break;
            case 120:
                {
                alt55=9;
                }
                break;
            case 121:
                {
                alt55=10;
                }
                break;
            case 122:
                {
                alt55=11;
                }
                break;
            case 123:
                {
                alt55=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2895:2: kw= 'trunc'
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleCastType6641); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getTruncKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2902:2: kw= 'zext'
                    {
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleCastType6660); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getZextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2909:2: kw= 'sext'
                    {
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleCastType6679); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getSextKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2916:2: kw= 'fptrunc'
                    {
                    kw=(Token)match(input,115,FOLLOW_115_in_ruleCastType6698); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getFptruncKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2923:2: kw= 'fpext'
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleCastType6717); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getFpextKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2930:2: kw= 'fptoui'
                    {
                    kw=(Token)match(input,117,FOLLOW_117_in_ruleCastType6736); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getFptouiKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2937:2: kw= 'fptosi'
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_ruleCastType6755); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getFptosiKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2944:2: kw= 'uitofp'
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_ruleCastType6774); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getUitofpKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2951:2: kw= 'sitofp'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_ruleCastType6793); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getSitofpKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2958:2: kw= 'ptrtoint'
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_ruleCastType6812); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getPtrtointKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2965:2: kw= 'inttoptr'
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleCastType6831); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getInttoptrKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2972:2: kw= 'bitcast'
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleCastType6850); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getBitcastKeyword_11()); 
                        

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
    // $ANTLR end "ruleCastType"


    // $ANTLR start "entryRuleCompare"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2985:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2986:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2987:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare6890);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare6900); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2994:1: ruleCompare returns [EObject current=null] : ( (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_ValuePair_3 = null;

        EObject this_ValuePair_7 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2997:28: ( ( (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2998:1: ( (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2998:1: ( (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==124) ) {
                alt56=1;
            }
            else if ( (LA56_0==125) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2998:2: (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2998:2: (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2998:4: otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair
                    {
                    otherlv_0=(Token)match(input,124,FOLLOW_124_in_ruleCompare6938); 

                        	newLeafNode(otherlv_0, grammarAccess.getCompareAccess().getIcmpKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getIPredicatesParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleIPredicates_in_ruleCompare6954);
                    ruleIPredicates();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getTypeParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCompare6969);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getValuePairParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleValuePair_in_ruleCompare6990);
                    this_ValuePair_3=ruleValuePair();

                    state._fsp--;

                     
                            current = this_ValuePair_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3028:6: (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3028:6: (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3028:8: otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair
                    {
                    otherlv_4=(Token)match(input,125,FOLLOW_125_in_ruleCompare7009); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getFcmpKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getFPredicatesParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleFPredicates_in_ruleCompare7025);
                    ruleFPredicates();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getTypeParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCompare7040);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getValuePairParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleValuePair_in_ruleCompare7061);
                    this_ValuePair_7=ruleValuePair();

                    state._fsp--;

                     
                            current = this_ValuePair_7; 
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleIPredicates"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3065:1: entryRuleIPredicates returns [String current=null] : iv_ruleIPredicates= ruleIPredicates EOF ;
    public final String entryRuleIPredicates() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIPredicates = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3066:2: (iv_ruleIPredicates= ruleIPredicates EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3067:2: iv_ruleIPredicates= ruleIPredicates EOF
            {
             newCompositeNode(grammarAccess.getIPredicatesRule()); 
            pushFollow(FOLLOW_ruleIPredicates_in_entryRuleIPredicates7098);
            iv_ruleIPredicates=ruleIPredicates();

            state._fsp--;

             current =iv_ruleIPredicates.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIPredicates7109); 

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
    // $ANTLR end "entryRuleIPredicates"


    // $ANTLR start "ruleIPredicates"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3074:1: ruleIPredicates returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) ;
    public final AntlrDatatypeRuleToken ruleIPredicates() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3077:28: ( (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3078:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3078:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            int alt57=10;
            switch ( input.LA(1) ) {
            case 126:
                {
                alt57=1;
                }
                break;
            case 127:
                {
                alt57=2;
                }
                break;
            case 128:
                {
                alt57=3;
                }
                break;
            case 129:
                {
                alt57=4;
                }
                break;
            case 130:
                {
                alt57=5;
                }
                break;
            case 131:
                {
                alt57=6;
                }
                break;
            case 132:
                {
                alt57=7;
                }
                break;
            case 133:
                {
                alt57=8;
                }
                break;
            case 134:
                {
                alt57=9;
                }
                break;
            case 135:
                {
                alt57=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3079:2: kw= 'eq'
                    {
                    kw=(Token)match(input,126,FOLLOW_126_in_ruleIPredicates7147); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getEqKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3086:2: kw= 'ne'
                    {
                    kw=(Token)match(input,127,FOLLOW_127_in_ruleIPredicates7166); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getNeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3093:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,128,FOLLOW_128_in_ruleIPredicates7185); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getUgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3100:2: kw= 'uge'
                    {
                    kw=(Token)match(input,129,FOLLOW_129_in_ruleIPredicates7204); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getUgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3107:2: kw= 'ult'
                    {
                    kw=(Token)match(input,130,FOLLOW_130_in_ruleIPredicates7223); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getUltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3114:2: kw= 'ule'
                    {
                    kw=(Token)match(input,131,FOLLOW_131_in_ruleIPredicates7242); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getUleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3121:2: kw= 'sgt'
                    {
                    kw=(Token)match(input,132,FOLLOW_132_in_ruleIPredicates7261); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getSgtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3128:2: kw= 'sge'
                    {
                    kw=(Token)match(input,133,FOLLOW_133_in_ruleIPredicates7280); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getSgeKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3135:2: kw= 'slt'
                    {
                    kw=(Token)match(input,134,FOLLOW_134_in_ruleIPredicates7299); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getSltKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3142:2: kw= 'sle'
                    {
                    kw=(Token)match(input,135,FOLLOW_135_in_ruleIPredicates7318); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getSleKeyword_9()); 
                        

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
    // $ANTLR end "ruleIPredicates"


    // $ANTLR start "entryRuleFPredicates"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3155:1: entryRuleFPredicates returns [String current=null] : iv_ruleFPredicates= ruleFPredicates EOF ;
    public final String entryRuleFPredicates() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFPredicates = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3156:2: (iv_ruleFPredicates= ruleFPredicates EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3157:2: iv_ruleFPredicates= ruleFPredicates EOF
            {
             newCompositeNode(grammarAccess.getFPredicatesRule()); 
            pushFollow(FOLLOW_ruleFPredicates_in_entryRuleFPredicates7359);
            iv_ruleFPredicates=ruleFPredicates();

            state._fsp--;

             current =iv_ruleFPredicates.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFPredicates7370); 

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
    // $ANTLR end "entryRuleFPredicates"


    // $ANTLR start "ruleFPredicates"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3164:1: ruleFPredicates returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleFPredicates() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3167:28: ( (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3168:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3168:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            int alt58=16;
            switch ( input.LA(1) ) {
            case 136:
                {
                alt58=1;
                }
                break;
            case 137:
                {
                alt58=2;
                }
                break;
            case 138:
                {
                alt58=3;
                }
                break;
            case 139:
                {
                alt58=4;
                }
                break;
            case 140:
                {
                alt58=5;
                }
                break;
            case 141:
                {
                alt58=6;
                }
                break;
            case 142:
                {
                alt58=7;
                }
                break;
            case 143:
                {
                alt58=8;
                }
                break;
            case 144:
                {
                alt58=9;
                }
                break;
            case 128:
                {
                alt58=10;
                }
                break;
            case 129:
                {
                alt58=11;
                }
                break;
            case 130:
                {
                alt58=12;
                }
                break;
            case 131:
                {
                alt58=13;
                }
                break;
            case 145:
                {
                alt58=14;
                }
                break;
            case 146:
                {
                alt58=15;
                }
                break;
            case 147:
                {
                alt58=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3169:2: kw= 'false'
                    {
                    kw=(Token)match(input,136,FOLLOW_136_in_ruleFPredicates7408); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getFalseKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3176:2: kw= 'oeq'
                    {
                    kw=(Token)match(input,137,FOLLOW_137_in_ruleFPredicates7427); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOeqKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3183:2: kw= 'ogt'
                    {
                    kw=(Token)match(input,138,FOLLOW_138_in_ruleFPredicates7446); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3190:2: kw= 'oge'
                    {
                    kw=(Token)match(input,139,FOLLOW_139_in_ruleFPredicates7465); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3197:2: kw= 'olt'
                    {
                    kw=(Token)match(input,140,FOLLOW_140_in_ruleFPredicates7484); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3204:2: kw= 'ole'
                    {
                    kw=(Token)match(input,141,FOLLOW_141_in_ruleFPredicates7503); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3211:2: kw= 'one'
                    {
                    kw=(Token)match(input,142,FOLLOW_142_in_ruleFPredicates7522); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOneKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3218:2: kw= 'ord'
                    {
                    kw=(Token)match(input,143,FOLLOW_143_in_ruleFPredicates7541); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOrdKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3225:2: kw= 'ueq'
                    {
                    kw=(Token)match(input,144,FOLLOW_144_in_ruleFPredicates7560); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUeqKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3232:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,128,FOLLOW_128_in_ruleFPredicates7579); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUgtKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3239:2: kw= 'uge'
                    {
                    kw=(Token)match(input,129,FOLLOW_129_in_ruleFPredicates7598); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUgeKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3246:2: kw= 'ult'
                    {
                    kw=(Token)match(input,130,FOLLOW_130_in_ruleFPredicates7617); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUltKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3253:2: kw= 'ule'
                    {
                    kw=(Token)match(input,131,FOLLOW_131_in_ruleFPredicates7636); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUleKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3260:2: kw= 'une'
                    {
                    kw=(Token)match(input,145,FOLLOW_145_in_ruleFPredicates7655); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUneKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3267:2: kw= 'uno'
                    {
                    kw=(Token)match(input,146,FOLLOW_146_in_ruleFPredicates7674); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUnoKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3274:2: kw= 'true'
                    {
                    kw=(Token)match(input,147,FOLLOW_147_in_ruleFPredicates7693); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getTrueKeyword_15()); 
                        

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
    // $ANTLR end "ruleFPredicates"


    // $ANTLR start "entryRuleArithmeticOP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3287:1: entryRuleArithmeticOP returns [String current=null] : iv_ruleArithmeticOP= ruleArithmeticOP EOF ;
    public final String entryRuleArithmeticOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArithmeticOP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3288:2: (iv_ruleArithmeticOP= ruleArithmeticOP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3289:2: iv_ruleArithmeticOP= ruleArithmeticOP EOF
            {
             newCompositeNode(grammarAccess.getArithmeticOPRule()); 
            pushFollow(FOLLOW_ruleArithmeticOP_in_entryRuleArithmeticOP7734);
            iv_ruleArithmeticOP=ruleArithmeticOP();

            state._fsp--;

             current =iv_ruleArithmeticOP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticOP7745); 

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
    // $ANTLR end "entryRuleArithmeticOP"


    // $ANTLR start "ruleArithmeticOP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3296:1: ruleArithmeticOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'add' | kw= 'fadd' | kw= 'sub' | kw= 'fsub' | kw= 'mul' | kw= 'fmul' | kw= 'udiv' | kw= 'sdiv' | kw= 'fdiv' | kw= 'urem' | kw= 'srem' | kw= 'frem' ) ;
    public final AntlrDatatypeRuleToken ruleArithmeticOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3299:28: ( (kw= 'add' | kw= 'fadd' | kw= 'sub' | kw= 'fsub' | kw= 'mul' | kw= 'fmul' | kw= 'udiv' | kw= 'sdiv' | kw= 'fdiv' | kw= 'urem' | kw= 'srem' | kw= 'frem' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3300:1: (kw= 'add' | kw= 'fadd' | kw= 'sub' | kw= 'fsub' | kw= 'mul' | kw= 'fmul' | kw= 'udiv' | kw= 'sdiv' | kw= 'fdiv' | kw= 'urem' | kw= 'srem' | kw= 'frem' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3300:1: (kw= 'add' | kw= 'fadd' | kw= 'sub' | kw= 'fsub' | kw= 'mul' | kw= 'fmul' | kw= 'udiv' | kw= 'sdiv' | kw= 'fdiv' | kw= 'urem' | kw= 'srem' | kw= 'frem' )
            int alt59=12;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt59=1;
                }
                break;
            case 148:
                {
                alt59=2;
                }
                break;
            case 36:
                {
                alt59=3;
                }
                break;
            case 149:
                {
                alt59=4;
                }
                break;
            case 150:
                {
                alt59=5;
                }
                break;
            case 151:
                {
                alt59=6;
                }
                break;
            case 152:
                {
                alt59=7;
                }
                break;
            case 153:
                {
                alt59=8;
                }
                break;
            case 154:
                {
                alt59=9;
                }
                break;
            case 155:
                {
                alt59=10;
                }
                break;
            case 156:
                {
                alt59=11;
                }
                break;
            case 157:
                {
                alt59=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3301:2: kw= 'add'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleArithmeticOP7783); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getAddKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3308:2: kw= 'fadd'
                    {
                    kw=(Token)match(input,148,FOLLOW_148_in_ruleArithmeticOP7802); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getFaddKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3315:2: kw= 'sub'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleArithmeticOP7821); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getSubKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3322:2: kw= 'fsub'
                    {
                    kw=(Token)match(input,149,FOLLOW_149_in_ruleArithmeticOP7840); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getFsubKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3329:2: kw= 'mul'
                    {
                    kw=(Token)match(input,150,FOLLOW_150_in_ruleArithmeticOP7859); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getMulKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3336:2: kw= 'fmul'
                    {
                    kw=(Token)match(input,151,FOLLOW_151_in_ruleArithmeticOP7878); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getFmulKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3343:2: kw= 'udiv'
                    {
                    kw=(Token)match(input,152,FOLLOW_152_in_ruleArithmeticOP7897); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getUdivKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3350:2: kw= 'sdiv'
                    {
                    kw=(Token)match(input,153,FOLLOW_153_in_ruleArithmeticOP7916); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getSdivKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3357:2: kw= 'fdiv'
                    {
                    kw=(Token)match(input,154,FOLLOW_154_in_ruleArithmeticOP7935); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getFdivKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3364:2: kw= 'urem'
                    {
                    kw=(Token)match(input,155,FOLLOW_155_in_ruleArithmeticOP7954); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getUremKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3371:2: kw= 'srem'
                    {
                    kw=(Token)match(input,156,FOLLOW_156_in_ruleArithmeticOP7973); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getSremKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3378:2: kw= 'frem'
                    {
                    kw=(Token)match(input,157,FOLLOW_157_in_ruleArithmeticOP7992); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getFremKeyword_11()); 
                        

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
    // $ANTLR end "ruleArithmeticOP"


    // $ANTLR start "entryRuleLogicalOP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3391:1: entryRuleLogicalOP returns [String current=null] : iv_ruleLogicalOP= ruleLogicalOP EOF ;
    public final String entryRuleLogicalOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3392:2: (iv_ruleLogicalOP= ruleLogicalOP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3393:2: iv_ruleLogicalOP= ruleLogicalOP EOF
            {
             newCompositeNode(grammarAccess.getLogicalOPRule()); 
            pushFollow(FOLLOW_ruleLogicalOP_in_entryRuleLogicalOP8033);
            iv_ruleLogicalOP=ruleLogicalOP();

            state._fsp--;

             current =iv_ruleLogicalOP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOP8044); 

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
    // $ANTLR end "entryRuleLogicalOP"


    // $ANTLR start "ruleLogicalOP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3400:1: ruleLogicalOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'shl' | kw= 'lshr' | kw= 'ashr' | kw= 'and' | kw= 'or' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3403:28: ( (kw= 'shl' | kw= 'lshr' | kw= 'ashr' | kw= 'and' | kw= 'or' | kw= 'xor' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3404:1: (kw= 'shl' | kw= 'lshr' | kw= 'ashr' | kw= 'and' | kw= 'or' | kw= 'xor' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3404:1: (kw= 'shl' | kw= 'lshr' | kw= 'ashr' | kw= 'and' | kw= 'or' | kw= 'xor' )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 158:
                {
                alt60=1;
                }
                break;
            case 159:
                {
                alt60=2;
                }
                break;
            case 160:
                {
                alt60=3;
                }
                break;
            case 37:
                {
                alt60=4;
                }
                break;
            case 39:
                {
                alt60=5;
                }
                break;
            case 40:
                {
                alt60=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3405:2: kw= 'shl'
                    {
                    kw=(Token)match(input,158,FOLLOW_158_in_ruleLogicalOP8082); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getShlKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3412:2: kw= 'lshr'
                    {
                    kw=(Token)match(input,159,FOLLOW_159_in_ruleLogicalOP8101); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getLshrKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3419:2: kw= 'ashr'
                    {
                    kw=(Token)match(input,160,FOLLOW_160_in_ruleLogicalOP8120); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getAshrKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3426:2: kw= 'and'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleLogicalOP8139); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getAndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3433:2: kw= 'or'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleLogicalOP8158); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getOrKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3440:2: kw= 'xor'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleLogicalOP8177); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getXorKeyword_5()); 
                        

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
    // $ANTLR end "ruleLogicalOP"


    // $ANTLR start "entryRuleArithmetic"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3453:1: entryRuleArithmetic returns [EObject current=null] : iv_ruleArithmetic= ruleArithmetic EOF ;
    public final EObject entryRuleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmetic = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3454:2: (iv_ruleArithmetic= ruleArithmetic EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3455:2: iv_ruleArithmetic= ruleArithmetic EOF
            {
             newCompositeNode(grammarAccess.getArithmeticRule()); 
            pushFollow(FOLLOW_ruleArithmetic_in_entryRuleArithmetic8217);
            iv_ruleArithmetic=ruleArithmetic();

            state._fsp--;

             current =iv_ruleArithmetic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmetic8227); 

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
    // $ANTLR end "entryRuleArithmetic"


    // $ANTLR start "ruleArithmetic"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3462:1: ruleArithmetic returns [EObject current=null] : ( ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair ) ;
    public final EObject ruleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject this_ValuePair_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3465:28: ( ( ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3466:1: ( ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3466:1: ( ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3467:5: ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair
            {
             
                    newCompositeNode(grammarAccess.getArithmeticAccess().getArithmeticOPParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleArithmeticOP_in_ruleArithmetic8268);
            ruleArithmeticOP();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getArithmeticAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleArithmetic8283);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getArithmeticAccess().getValuePairParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleValuePair_in_ruleArithmetic8304);
            this_ValuePair_2=ruleValuePair();

            state._fsp--;

             
                    current = this_ValuePair_2; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleArithmetic"


    // $ANTLR start "entryRuleLogical"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3499:1: entryRuleLogical returns [EObject current=null] : iv_ruleLogical= ruleLogical EOF ;
    public final EObject entryRuleLogical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3500:2: (iv_ruleLogical= ruleLogical EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3501:2: iv_ruleLogical= ruleLogical EOF
            {
             newCompositeNode(grammarAccess.getLogicalRule()); 
            pushFollow(FOLLOW_ruleLogical_in_entryRuleLogical8339);
            iv_ruleLogical=ruleLogical();

            state._fsp--;

             current =iv_ruleLogical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical8349); 

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
    // $ANTLR end "entryRuleLogical"


    // $ANTLR start "ruleLogical"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3508:1: ruleLogical returns [EObject current=null] : ( ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair ) ;
    public final EObject ruleLogical() throws RecognitionException {
        EObject current = null;

        EObject this_ValuePair_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3511:28: ( ( ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3512:1: ( ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3512:1: ( ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3513:5: ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair
            {
             
                    newCompositeNode(grammarAccess.getLogicalAccess().getLogicalOPParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLogicalOP_in_ruleLogical8390);
            ruleLogicalOP();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getLogicalAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleLogical8405);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getLogicalAccess().getValuePairParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleValuePair_in_ruleLogical8426);
            this_ValuePair_2=ruleValuePair();

            state._fsp--;

             
                    current = this_ValuePair_2; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleLogical"


    // $ANTLR start "entryRuleInstruction"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3545:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3546:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3547:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction8461);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction8471); 

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
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3554:1: ruleInstruction returns [EObject current=null] : (this_Switch_0= ruleSwitch | this_IndirectBranch_1= ruleIndirectBranch | this_Branch_2= ruleBranch | this_Return_3= ruleReturn | this_Load_4= ruleLoad | this_Store_5= ruleStore | this_Fence_6= ruleFence | this_GetElementPtr_7= ruleGetElementPtr | this_Logical_8= ruleLogical | this_Arithmetic_9= ruleArithmetic | this_Compare_10= ruleCompare | this_Cast_11= ruleCast | this_ShuffleVector_12= ruleShuffleVector | this_InsertElement_13= ruleInsertElement | this_ExtractElement_14= ruleExtractElement | this_Invoke_15= ruleInvoke | this_Resume_16= ruleResume | this_InsertValue_17= ruleInsertValue | this_ExtractValue_18= ruleExtractValue | this_Alloc_19= ruleAlloc | this_CmpXchg_20= ruleCmpXchg | this_AtomicRMW_21= ruleAtomicRMW | this_PHI_22= rulePHI | this_Select_23= ruleSelect | this_Call_24= ruleCall | this_VA_Arg_25= ruleVA_Arg | this_LandingPad_26= ruleLandingPad ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Switch_0 = null;

        EObject this_IndirectBranch_1 = null;

        EObject this_Branch_2 = null;

        EObject this_Return_3 = null;

        EObject this_Load_4 = null;

        EObject this_Store_5 = null;

        EObject this_Fence_6 = null;

        EObject this_GetElementPtr_7 = null;

        EObject this_Logical_8 = null;

        EObject this_Arithmetic_9 = null;

        EObject this_Compare_10 = null;

        EObject this_Cast_11 = null;

        EObject this_ShuffleVector_12 = null;

        EObject this_InsertElement_13 = null;

        EObject this_ExtractElement_14 = null;

        EObject this_Invoke_15 = null;

        EObject this_Resume_16 = null;

        EObject this_InsertValue_17 = null;

        EObject this_ExtractValue_18 = null;

        EObject this_Alloc_19 = null;

        EObject this_CmpXchg_20 = null;

        EObject this_AtomicRMW_21 = null;

        EObject this_PHI_22 = null;

        EObject this_Select_23 = null;

        EObject this_Call_24 = null;

        EObject this_VA_Arg_25 = null;

        EObject this_LandingPad_26 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3557:28: ( (this_Switch_0= ruleSwitch | this_IndirectBranch_1= ruleIndirectBranch | this_Branch_2= ruleBranch | this_Return_3= ruleReturn | this_Load_4= ruleLoad | this_Store_5= ruleStore | this_Fence_6= ruleFence | this_GetElementPtr_7= ruleGetElementPtr | this_Logical_8= ruleLogical | this_Arithmetic_9= ruleArithmetic | this_Compare_10= ruleCompare | this_Cast_11= ruleCast | this_ShuffleVector_12= ruleShuffleVector | this_InsertElement_13= ruleInsertElement | this_ExtractElement_14= ruleExtractElement | this_Invoke_15= ruleInvoke | this_Resume_16= ruleResume | this_InsertValue_17= ruleInsertValue | this_ExtractValue_18= ruleExtractValue | this_Alloc_19= ruleAlloc | this_CmpXchg_20= ruleCmpXchg | this_AtomicRMW_21= ruleAtomicRMW | this_PHI_22= rulePHI | this_Select_23= ruleSelect | this_Call_24= ruleCall | this_VA_Arg_25= ruleVA_Arg | this_LandingPad_26= ruleLandingPad ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3558:1: (this_Switch_0= ruleSwitch | this_IndirectBranch_1= ruleIndirectBranch | this_Branch_2= ruleBranch | this_Return_3= ruleReturn | this_Load_4= ruleLoad | this_Store_5= ruleStore | this_Fence_6= ruleFence | this_GetElementPtr_7= ruleGetElementPtr | this_Logical_8= ruleLogical | this_Arithmetic_9= ruleArithmetic | this_Compare_10= ruleCompare | this_Cast_11= ruleCast | this_ShuffleVector_12= ruleShuffleVector | this_InsertElement_13= ruleInsertElement | this_ExtractElement_14= ruleExtractElement | this_Invoke_15= ruleInvoke | this_Resume_16= ruleResume | this_InsertValue_17= ruleInsertValue | this_ExtractValue_18= ruleExtractValue | this_Alloc_19= ruleAlloc | this_CmpXchg_20= ruleCmpXchg | this_AtomicRMW_21= ruleAtomicRMW | this_PHI_22= rulePHI | this_Select_23= ruleSelect | this_Call_24= ruleCall | this_VA_Arg_25= ruleVA_Arg | this_LandingPad_26= ruleLandingPad )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3558:1: (this_Switch_0= ruleSwitch | this_IndirectBranch_1= ruleIndirectBranch | this_Branch_2= ruleBranch | this_Return_3= ruleReturn | this_Load_4= ruleLoad | this_Store_5= ruleStore | this_Fence_6= ruleFence | this_GetElementPtr_7= ruleGetElementPtr | this_Logical_8= ruleLogical | this_Arithmetic_9= ruleArithmetic | this_Compare_10= ruleCompare | this_Cast_11= ruleCast | this_ShuffleVector_12= ruleShuffleVector | this_InsertElement_13= ruleInsertElement | this_ExtractElement_14= ruleExtractElement | this_Invoke_15= ruleInvoke | this_Resume_16= ruleResume | this_InsertValue_17= ruleInsertValue | this_ExtractValue_18= ruleExtractValue | this_Alloc_19= ruleAlloc | this_CmpXchg_20= ruleCmpXchg | this_AtomicRMW_21= ruleAtomicRMW | this_PHI_22= rulePHI | this_Select_23= ruleSelect | this_Call_24= ruleCall | this_VA_Arg_25= ruleVA_Arg | this_LandingPad_26= ruleLandingPad )
            int alt61=27;
            switch ( input.LA(1) ) {
            case 162:
                {
                alt61=1;
                }
                break;
            case 161:
                {
                alt61=2;
                }
                break;
            case 169:
                {
                alt61=3;
                }
                break;
            case 166:
                {
                alt61=4;
                }
                break;
            case 45:
                {
                alt61=5;
                }
                break;
            case 50:
                {
                alt61=6;
                }
                break;
            case 23:
                {
                alt61=7;
                }
                break;
            case 19:
                {
                alt61=8;
                }
                break;
            case 37:
            case 39:
            case 40:
            case 158:
            case 159:
            case 160:
                {
                alt61=9;
                }
                break;
            case 35:
            case 36:
            case 148:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 156:
            case 157:
                {
                alt61=10;
                }
                break;
            case 124:
            case 125:
                {
                alt61=11;
                }
                break;
            case 112:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
                {
                alt61=12;
                }
                break;
            case 110:
                {
                alt61=13;
                }
                break;
            case 109:
                {
                alt61=14;
                }
                break;
            case 108:
                {
                alt61=15;
                }
                break;
            case 163:
                {
                alt61=16;
                }
                break;
            case 165:
                {
                alt61=17;
                }
                break;
            case 22:
                {
                alt61=18;
                }
                break;
            case 21:
                {
                alt61=19;
                }
                break;
            case 61:
                {
                alt61=20;
                }
                break;
            case 31:
                {
                alt61=21;
                }
                break;
            case 33:
                {
                alt61=22;
                }
                break;
            case 97:
                {
                alt61=23;
                }
                break;
            case 106:
                {
                alt61=24;
                }
                break;
            case 51:
            case 52:
                {
                alt61=25;
                }
                break;
            case 107:
                {
                alt61=26;
                }
                break;
            case 101:
                {
                alt61=27;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3559:5: this_Switch_0= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleInstruction8518);
                    this_Switch_0=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3569:5: this_IndirectBranch_1= ruleIndirectBranch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getIndirectBranchParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIndirectBranch_in_ruleInstruction8545);
                    this_IndirectBranch_1=ruleIndirectBranch();

                    state._fsp--;

                     
                            current = this_IndirectBranch_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3579:5: this_Branch_2= ruleBranch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getBranchParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBranch_in_ruleInstruction8572);
                    this_Branch_2=ruleBranch();

                    state._fsp--;

                     
                            current = this_Branch_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3589:5: this_Return_3= ruleReturn
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getReturnParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleReturn_in_ruleInstruction8599);
                    this_Return_3=ruleReturn();

                    state._fsp--;

                     
                            current = this_Return_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3599:5: this_Load_4= ruleLoad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLoad_in_ruleInstruction8626);
                    this_Load_4=ruleLoad();

                    state._fsp--;

                     
                            current = this_Load_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3609:5: this_Store_5= ruleStore
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getStoreParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleStore_in_ruleInstruction8653);
                    this_Store_5=ruleStore();

                    state._fsp--;

                     
                            current = this_Store_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3619:5: this_Fence_6= ruleFence
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFenceParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFence_in_ruleInstruction8680);
                    this_Fence_6=ruleFence();

                    state._fsp--;

                     
                            current = this_Fence_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3629:5: this_GetElementPtr_7= ruleGetElementPtr
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGetElementPtrParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleGetElementPtr_in_ruleInstruction8707);
                    this_GetElementPtr_7=ruleGetElementPtr();

                    state._fsp--;

                     
                            current = this_GetElementPtr_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3639:5: this_Logical_8= ruleLogical
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLogicalParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleLogical_in_ruleInstruction8734);
                    this_Logical_8=ruleLogical();

                    state._fsp--;

                     
                            current = this_Logical_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3649:5: this_Arithmetic_9= ruleArithmetic
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getArithmeticParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleArithmetic_in_ruleInstruction8761);
                    this_Arithmetic_9=ruleArithmetic();

                    state._fsp--;

                     
                            current = this_Arithmetic_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3659:5: this_Compare_10= ruleCompare
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCompareParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleCompare_in_ruleInstruction8788);
                    this_Compare_10=ruleCompare();

                    state._fsp--;

                     
                            current = this_Compare_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3669:5: this_Cast_11= ruleCast
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCastParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleCast_in_ruleInstruction8815);
                    this_Cast_11=ruleCast();

                    state._fsp--;

                     
                            current = this_Cast_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3679:5: this_ShuffleVector_12= ruleShuffleVector
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getShuffleVectorParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleShuffleVector_in_ruleInstruction8842);
                    this_ShuffleVector_12=ruleShuffleVector();

                    state._fsp--;

                     
                            current = this_ShuffleVector_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3689:5: this_InsertElement_13= ruleInsertElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertElementParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleInsertElement_in_ruleInstruction8869);
                    this_InsertElement_13=ruleInsertElement();

                    state._fsp--;

                     
                            current = this_InsertElement_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3699:5: this_ExtractElement_14= ruleExtractElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractElementParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleExtractElement_in_ruleInstruction8896);
                    this_ExtractElement_14=ruleExtractElement();

                    state._fsp--;

                     
                            current = this_ExtractElement_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3709:5: this_Invoke_15= ruleInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInvokeParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleInvoke_in_ruleInstruction8923);
                    this_Invoke_15=ruleInvoke();

                    state._fsp--;

                     
                            current = this_Invoke_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3719:5: this_Resume_16= ruleResume
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getResumeParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleResume_in_ruleInstruction8950);
                    this_Resume_16=ruleResume();

                    state._fsp--;

                     
                            current = this_Resume_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3729:5: this_InsertValue_17= ruleInsertValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertValueParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleInsertValue_in_ruleInstruction8977);
                    this_InsertValue_17=ruleInsertValue();

                    state._fsp--;

                     
                            current = this_InsertValue_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3739:5: this_ExtractValue_18= ruleExtractValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractValueParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleExtractValue_in_ruleInstruction9004);
                    this_ExtractValue_18=ruleExtractValue();

                    state._fsp--;

                     
                            current = this_ExtractValue_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3749:5: this_Alloc_19= ruleAlloc
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAllocParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleAlloc_in_ruleInstruction9031);
                    this_Alloc_19=ruleAlloc();

                    state._fsp--;

                     
                            current = this_Alloc_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3759:5: this_CmpXchg_20= ruleCmpXchg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCmpXchgParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleCmpXchg_in_ruleInstruction9058);
                    this_CmpXchg_20=ruleCmpXchg();

                    state._fsp--;

                     
                            current = this_CmpXchg_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3769:5: this_AtomicRMW_21= ruleAtomicRMW
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAtomicRMWParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRMW_in_ruleInstruction9085);
                    this_AtomicRMW_21=ruleAtomicRMW();

                    state._fsp--;

                     
                            current = this_AtomicRMW_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3779:5: this_PHI_22= rulePHI
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPHIParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_rulePHI_in_ruleInstruction9112);
                    this_PHI_22=rulePHI();

                    state._fsp--;

                     
                            current = this_PHI_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3789:5: this_Select_23= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSelectParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleInstruction9139);
                    this_Select_23=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3799:5: this_Call_24= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleInstruction9166);
                    this_Call_24=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3809:5: this_VA_Arg_25= ruleVA_Arg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getVA_ArgParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleVA_Arg_in_ruleInstruction9193);
                    this_VA_Arg_25=ruleVA_Arg();

                    state._fsp--;

                     
                            current = this_VA_Arg_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3819:5: this_LandingPad_26= ruleLandingPad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLandingPadParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleLandingPad_in_ruleInstruction9220);
                    this_LandingPad_26=ruleLandingPad();

                    state._fsp--;

                     
                            current = this_LandingPad_26; 
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
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleIndirectBranch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3835:1: entryRuleIndirectBranch returns [EObject current=null] : iv_ruleIndirectBranch= ruleIndirectBranch EOF ;
    public final EObject entryRuleIndirectBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3836:2: (iv_ruleIndirectBranch= ruleIndirectBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3837:2: iv_ruleIndirectBranch= ruleIndirectBranch EOF
            {
             newCompositeNode(grammarAccess.getIndirectBranchRule()); 
            pushFollow(FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch9255);
            iv_ruleIndirectBranch=ruleIndirectBranch();

            state._fsp--;

             current =iv_ruleIndirectBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndirectBranch9265); 

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
    // $ANTLR end "entryRuleIndirectBranch"


    // $ANTLR start "ruleIndirectBranch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3844:1: ruleIndirectBranch returns [EObject current=null] : (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' ) ;
    public final EObject ruleIndirectBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_adress_1_0 = null;

        EObject lv_lList_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3847:28: ( (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3848:1: (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3848:1: (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3848:3: otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,161,FOLLOW_161_in_ruleIndirectBranch9302); 

                	newLeafNode(otherlv_0, grammarAccess.getIndirectBranchAccess().getIndirectbrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3852:1: ( (lv_adress_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3853:1: (lv_adress_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3853:1: (lv_adress_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3854:3: lv_adress_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getAdressTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleIndirectBranch9323);
            lv_adress_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIndirectBranchRule());
            	        }
                   		set(
                   			current, 
                   			"adress",
                    		lv_adress_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleIndirectBranch9335); 

                	newLeafNode(otherlv_2, grammarAccess.getIndirectBranchAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,98,FOLLOW_98_in_ruleIndirectBranch9347); 

                	newLeafNode(otherlv_3, grammarAccess.getIndirectBranchAccess().getLeftSquareBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3878:1: ( (lv_lList_4_0= ruleLabelList ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_VAR_TYPE) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3879:1: (lv_lList_4_0= ruleLabelList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3879:1: (lv_lList_4_0= ruleLabelList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3880:3: lv_lList_4_0= ruleLabelList
                    {
                     
                    	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getLListLabelListParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelList_in_ruleIndirectBranch9368);
                    lv_lList_4_0=ruleLabelList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIndirectBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"lList",
                            		lv_lList_4_0, 
                            		"LabelList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,99,FOLLOW_99_in_ruleIndirectBranch9381); 

                	newLeafNode(otherlv_5, grammarAccess.getIndirectBranchAccess().getRightSquareBracketKeyword_5());
                

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
    // $ANTLR end "ruleIndirectBranch"


    // $ANTLR start "entryRuleLabelList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3908:1: entryRuleLabelList returns [EObject current=null] : iv_ruleLabelList= ruleLabelList EOF ;
    public final EObject entryRuleLabelList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3909:2: (iv_ruleLabelList= ruleLabelList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3910:2: iv_ruleLabelList= ruleLabelList EOF
            {
             newCompositeNode(grammarAccess.getLabelListRule()); 
            pushFollow(FOLLOW_ruleLabelList_in_entryRuleLabelList9417);
            iv_ruleLabelList=ruleLabelList();

            state._fsp--;

             current =iv_ruleLabelList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelList9427); 

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
    // $ANTLR end "entryRuleLabelList"


    // $ANTLR start "ruleLabelList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3917:1: ruleLabelList returns [EObject current=null] : ( (lv_labels_0_0= ruleTypeAndValue ) )+ ;
    public final EObject ruleLabelList() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3920:28: ( ( (lv_labels_0_0= ruleTypeAndValue ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3921:1: ( (lv_labels_0_0= ruleTypeAndValue ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3921:1: ( (lv_labels_0_0= ruleTypeAndValue ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_VAR_TYPE) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3922:1: (lv_labels_0_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3922:1: (lv_labels_0_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3923:3: lv_labels_0_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelListAccess().getLabelsTypeAndValueParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLabelList9472);
            	    lv_labels_0_0=ruleTypeAndValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"labels",
            	            		lv_labels_0_0, 
            	            		"TypeAndValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // $ANTLR end "ruleLabelList"


    // $ANTLR start "entryRuleSwitch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3947:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3948:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3949:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch9508);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch9518); 

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
    // $ANTLR end "entryRuleSwitch"


    // $ANTLR start "ruleSwitch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3956:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_value_1_0 = null;

        EObject lv_default_3_0 = null;

        EObject lv_jTable_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3959:28: ( (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3960:1: (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3960:1: (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3960:3: otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,162,FOLLOW_162_in_ruleSwitch9555); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3964:1: ( (lv_value_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3965:1: (lv_value_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3965:1: (lv_value_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3966:3: lv_value_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getValueTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSwitch9576);
            lv_value_1_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleSwitch9588); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3986:1: ( (lv_default_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3987:1: (lv_default_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3987:1: (lv_default_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3988:3: lv_default_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSwitch9609);
            lv_default_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"default",
                    		lv_default_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,98,FOLLOW_98_in_ruleSwitch9621); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4008:1: ( (lv_jTable_5_0= ruleJumpTable ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_VAR_TYPE) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4009:1: (lv_jTable_5_0= ruleJumpTable )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4009:1: (lv_jTable_5_0= ruleJumpTable )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4010:3: lv_jTable_5_0= ruleJumpTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getSwitchAccess().getJTableJumpTableParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJumpTable_in_ruleSwitch9642);
                    lv_jTable_5_0=ruleJumpTable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSwitchRule());
                    	        }
                           		set(
                           			current, 
                           			"jTable",
                            		lv_jTable_5_0, 
                            		"JumpTable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,99,FOLLOW_99_in_ruleSwitch9655); 

                	newLeafNode(otherlv_6, grammarAccess.getSwitchAccess().getRightSquareBracketKeyword_6());
                

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
    // $ANTLR end "ruleSwitch"


    // $ANTLR start "entryRuleJumpTable"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4038:1: entryRuleJumpTable returns [EObject current=null] : iv_ruleJumpTable= ruleJumpTable EOF ;
    public final EObject entryRuleJumpTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpTable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4039:2: (iv_ruleJumpTable= ruleJumpTable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4040:2: iv_ruleJumpTable= ruleJumpTable EOF
            {
             newCompositeNode(grammarAccess.getJumpTableRule()); 
            pushFollow(FOLLOW_ruleJumpTable_in_entryRuleJumpTable9691);
            iv_ruleJumpTable=ruleJumpTable();

            state._fsp--;

             current =iv_ruleJumpTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJumpTable9701); 

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
    // $ANTLR end "entryRuleJumpTable"


    // $ANTLR start "ruleJumpTable"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4047:1: ruleJumpTable returns [EObject current=null] : ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+ ;
    public final EObject ruleJumpTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_destinations_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4050:28: ( ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4051:1: ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4051:1: ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_VAR_TYPE) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4051:2: ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4051:2: ( (lv_values_0_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4052:1: (lv_values_0_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4052:1: (lv_values_0_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4053:3: lv_values_0_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getValuesTypeAndValueParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleJumpTable9747);
            	    lv_values_0_0=ruleTypeAndValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJumpTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_0_0, 
            	            		"TypeAndValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleJumpTable9759); 

            	        	newLeafNode(otherlv_1, grammarAccess.getJumpTableAccess().getCommaKeyword_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4073:1: ( (lv_destinations_2_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4074:1: (lv_destinations_2_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4074:1: (lv_destinations_2_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4075:3: lv_destinations_2_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getDestinationsTypeAndValueParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleJumpTable9780);
            	    lv_destinations_2_0=ruleTypeAndValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJumpTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"destinations",
            	            		lv_destinations_2_0, 
            	            		"TypeAndValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
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
    // $ANTLR end "ruleJumpTable"


    // $ANTLR start "entryRuleInvoke"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4099:1: entryRuleInvoke returns [EObject current=null] : iv_ruleInvoke= ruleInvoke EOF ;
    public final EObject entryRuleInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoke = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4100:2: (iv_ruleInvoke= ruleInvoke EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4101:2: iv_ruleInvoke= ruleInvoke EOF
            {
             newCompositeNode(grammarAccess.getInvokeRule()); 
            pushFollow(FOLLOW_ruleInvoke_in_entryRuleInvoke9817);
            iv_ruleInvoke=ruleInvoke();

            state._fsp--;

             current =iv_ruleInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvoke9827); 

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
    // $ANTLR end "entryRuleInvoke"


    // $ANTLR start "ruleInvoke"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4108:1: ruleInvoke returns [EObject current=null] : (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) ) ;
    public final EObject ruleInvoke() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_function_3_0 = null;

        EObject lv_pList_4_0 = null;

        EObject lv_to_7_0 = null;

        EObject lv_unwind_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4111:28: ( (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4112:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4112:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4112:3: otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,163,FOLLOW_163_in_ruleInvoke9864); 

                	newLeafNode(otherlv_0, grammarAccess.getInvokeAccess().getInvokeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4116:1: ( ruleCallingConv )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_INT||(LA66_0>=62 && LA66_0<=76)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4117:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleInvoke9881);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4124:3: ( ruleReturnAttributes )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=53 && LA67_0<=60)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4125:5: ruleReturnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getReturnAttributesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReturnAttributes_in_ruleInvoke9899);
                    ruleReturnAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4132:3: ( (lv_function_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4133:1: (lv_function_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4133:1: (lv_function_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4134:3: lv_function_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getFunctionTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke9921);
            lv_function_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"function",
                    		lv_function_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4150:2: ( (lv_pList_4_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4151:1: (lv_pList_4_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4151:1: (lv_pList_4_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4152:3: lv_pList_4_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleInvoke9942);
            lv_pList_4_0=ruleParameterList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"pList",
                    		lv_pList_4_0, 
                    		"ParameterList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4168:2: ( ruleFunctionAttributes )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=77 && LA68_0<=78)||(LA68_0>=81 && LA68_0<=96)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4169:5: ruleFunctionAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getFunctionAttributesParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFunctionAttributes_in_ruleInvoke9959);
                    ruleFunctionAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,111,FOLLOW_111_in_ruleInvoke9972); 

                	newLeafNode(otherlv_6, grammarAccess.getInvokeAccess().getToKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4180:1: ( (lv_to_7_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4181:1: (lv_to_7_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4181:1: (lv_to_7_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4182:3: lv_to_7_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getToTypeAndValueParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke9993);
            lv_to_7_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_7_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,164,FOLLOW_164_in_ruleInvoke10005); 

                	newLeafNode(otherlv_8, grammarAccess.getInvokeAccess().getUnwindKeyword_8());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4202:1: ( (lv_unwind_9_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4203:1: (lv_unwind_9_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4203:1: (lv_unwind_9_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4204:3: lv_unwind_9_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getUnwindTypeAndValueParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke10026);
            lv_unwind_9_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"unwind",
                    		lv_unwind_9_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

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
    // $ANTLR end "ruleInvoke"


    // $ANTLR start "entryRuleResume"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4228:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4229:2: (iv_ruleResume= ruleResume EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4230:2: iv_ruleResume= ruleResume EOF
            {
             newCompositeNode(grammarAccess.getResumeRule()); 
            pushFollow(FOLLOW_ruleResume_in_entryRuleResume10062);
            iv_ruleResume=ruleResume();

            state._fsp--;

             current =iv_ruleResume; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResume10072); 

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
    // $ANTLR end "entryRuleResume"


    // $ANTLR start "ruleResume"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4237:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TypeAndValue_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4240:28: ( (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4241:1: (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4241:1: (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4241:3: otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue
            {
            otherlv_0=(Token)match(input,165,FOLLOW_165_in_ruleResume10109); 

                	newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getResumeAccess().getTypeAndValueParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleResume10131);
            this_TypeAndValue_1=ruleTypeAndValue();

            state._fsp--;

             
                    current = this_TypeAndValue_1; 
                    afterParserOrEnumRuleCall();
                

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
    // $ANTLR end "ruleResume"


    // $ANTLR start "entryRuleReturn"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4262:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4263:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4264:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn10166);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn10176); 

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
    // $ANTLR end "entryRuleReturn"


    // $ANTLR start "ruleReturn"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4271:1: ruleReturn returns [EObject current=null] : ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_INT_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token this_INT_12=null;
        EObject lv_value_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4274:28: ( ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4275:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4275:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==166) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==167) ) {
                    alt71=1;
                }
                else if ( (LA71_1==RULE_VAR_TYPE) ) {
                    alt71=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 71, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4275:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4275:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4275:3: () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4275:3: ()
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4276:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getReturnAccess().getReturnAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,166,FOLLOW_166_in_ruleReturn10223); 

                        	newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getRetKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,167,FOLLOW_167_in_ruleReturn10235); 

                        	newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getVoidKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4289:1: (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==15) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4289:3: otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleReturn10248); 

                                	newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getCommaKeyword_0_3_0());
                                
                            otherlv_4=(Token)match(input,168,FOLLOW_168_in_ruleReturn10260); 

                                	newLeafNode(otherlv_4, grammarAccess.getReturnAccess().getDbgKeyword_0_3_1());
                                
                            otherlv_5=(Token)match(input,47,FOLLOW_47_in_ruleReturn10272); 

                                	newLeafNode(otherlv_5, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_3_2());
                                
                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn10283); 
                             
                                newLeafNode(this_INT_6, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_3_3()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4306:6: (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4306:6: (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4306:8: otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )?
                    {
                    otherlv_7=(Token)match(input,166,FOLLOW_166_in_ruleReturn10304); 

                        	newLeafNode(otherlv_7, grammarAccess.getReturnAccess().getRetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4310:1: ( (lv_value_8_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4311:1: (lv_value_8_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4311:1: (lv_value_8_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4312:3: lv_value_8_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getReturnAccess().getValueTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleReturn10325);
                    lv_value_8_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReturnRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_8_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4328:2: (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==15) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4328:4: otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT
                            {
                            otherlv_9=(Token)match(input,15,FOLLOW_15_in_ruleReturn10338); 

                                	newLeafNode(otherlv_9, grammarAccess.getReturnAccess().getCommaKeyword_1_2_0());
                                
                            otherlv_10=(Token)match(input,168,FOLLOW_168_in_ruleReturn10350); 

                                	newLeafNode(otherlv_10, grammarAccess.getReturnAccess().getDbgKeyword_1_2_1());
                                
                            otherlv_11=(Token)match(input,47,FOLLOW_47_in_ruleReturn10362); 

                                	newLeafNode(otherlv_11, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_2_2());
                                
                            this_INT_12=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn10373); 
                             
                                newLeafNode(this_INT_12, grammarAccess.getReturnAccess().getINTTerminalRuleCall_1_2_3()); 
                                

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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleBranch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4352:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4353:2: (iv_ruleBranch= ruleBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4354:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_ruleBranch_in_entryRuleBranch10411);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranch10421); 

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
    // $ANTLR end "entryRuleBranch"


    // $ANTLR start "ruleBranch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4361:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_destination_1_0 = null;

        EObject lv_cond_3_0 = null;

        EObject lv_labelTrue_5_0 = null;

        EObject lv_labelFalse_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4364:28: ( ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4365:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4365:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4365:2: (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4365:2: (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4365:4: otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) )
                    {
                    otherlv_0=(Token)match(input,169,FOLLOW_169_in_ruleBranch10459); 

                        	newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBrKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4369:1: ( (lv_destination_1_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4370:1: (lv_destination_1_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4370:1: (lv_destination_1_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4371:3: lv_destination_1_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getDestinationTypeAndValueParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch10480);
                    lv_destination_1_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"destination",
                            		lv_destination_1_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4388:6: (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4388:6: (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4388:8: otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) )
                    {
                    otherlv_2=(Token)match(input,169,FOLLOW_169_in_ruleBranch10500); 

                        	newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getBrKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4392:1: ( (lv_cond_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4393:1: (lv_cond_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4393:1: (lv_cond_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4394:3: lv_cond_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getCondTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch10521);
                    lv_cond_3_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"cond",
                            		lv_cond_3_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_15_in_ruleBranch10533); 

                        	newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getCommaKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4414:1: ( (lv_labelTrue_5_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4415:1: (lv_labelTrue_5_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4415:1: (lv_labelTrue_5_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4416:3: lv_labelTrue_5_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelTrueTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch10554);
                    lv_labelTrue_5_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"labelTrue",
                            		lv_labelTrue_5_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_15_in_ruleBranch10566); 

                        	newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4436:1: ( (lv_labelFalse_7_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4437:1: (lv_labelFalse_7_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4437:1: (lv_labelFalse_7_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4438:3: lv_labelFalse_7_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelFalseTypeAndValueParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch10587);
                    lv_labelFalse_7_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"labelFalse",
                            		lv_labelFalse_7_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


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
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleBasicBlock"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4464:1: entryRuleBasicBlock returns [EObject current=null] : iv_ruleBasicBlock= ruleBasicBlock EOF ;
    public final EObject entryRuleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBlock = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4465:2: (iv_ruleBasicBlock= ruleBasicBlock EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4466:2: iv_ruleBasicBlock= ruleBasicBlock EOF
            {
             newCompositeNode(grammarAccess.getBasicBlockRule()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock10626);
            iv_ruleBasicBlock=ruleBasicBlock();

            state._fsp--;

             current =iv_ruleBasicBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicBlock10636); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4473:1: ruleBasicBlock returns [EObject current=null] : ( () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )* ) ;
    public final EObject ruleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_name_1_0 = null;

        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4476:28: ( ( () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4477:1: ( () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4477:1: ( () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4477:2: () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4477:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4478:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBasicBlockAccess().getBasicBlockAction_0(),
                        current);
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4483:2: ( (lv_name_1_0= ruleLabelStr ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4484:1: (lv_name_1_0= ruleLabelStr )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4484:1: (lv_name_1_0= ruleLabelStr )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4485:3: lv_name_1_0= ruleLabelStr
                    {
                     
                    	        newCompositeNode(grammarAccess.getBasicBlockAccess().getNameLabelStrParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelStr_in_ruleBasicBlock10691);
                    lv_name_1_0=ruleLabelStr();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBasicBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_1_0, 
                            		"LabelStr");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4501:3: ( (lv_instructions_2_0= ruleInstruction ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==19||(LA74_0>=21 && LA74_0<=23)||LA74_0==31||LA74_0==33||(LA74_0>=35 && LA74_0<=37)||(LA74_0>=39 && LA74_0<=40)||LA74_0==45||(LA74_0>=50 && LA74_0<=52)||LA74_0==61||LA74_0==97||LA74_0==101||(LA74_0>=106 && LA74_0<=110)||(LA74_0>=112 && LA74_0<=125)||(LA74_0>=148 && LA74_0<=163)||(LA74_0>=165 && LA74_0<=166)||LA74_0==169) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4502:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4502:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4503:3: lv_instructions_2_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBasicBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBasicBlock10713);
            	    lv_instructions_2_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBasicBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_2_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


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


    // $ANTLR start "entryRuleLabelStr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4527:1: entryRuleLabelStr returns [EObject current=null] : iv_ruleLabelStr= ruleLabelStr EOF ;
    public final EObject entryRuleLabelStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelStr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4528:2: (iv_ruleLabelStr= ruleLabelStr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4529:2: iv_ruleLabelStr= ruleLabelStr EOF
            {
             newCompositeNode(grammarAccess.getLabelStrRule()); 
            pushFollow(FOLLOW_ruleLabelStr_in_entryRuleLabelStr10750);
            iv_ruleLabelStr=ruleLabelStr();

            state._fsp--;

             current =iv_ruleLabelStr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelStr10760); 

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
    // $ANTLR end "entryRuleLabelStr"


    // $ANTLR start "ruleLabelStr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4536:1: ruleLabelStr returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleLabelStr() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4539:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4540:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4540:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4540:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4540:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4541:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4541:1: (lv_name_0_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4542:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabelStr10802); 

            			newLeafNode(lv_name_0_0, grammarAccess.getLabelStrAccess().getNameIDTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLabelStrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"ID");
            	    

            }


            }

            otherlv_1=(Token)match(input,170,FOLLOW_170_in_ruleLabelStr10819); 

                	newLeafNode(otherlv_1, grammarAccess.getLabelStrAccess().getColonKeyword_1());
                

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
    // $ANTLR end "ruleLabelStr"


    // $ANTLR start "entryRuleFunctionHeader"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4570:1: entryRuleFunctionHeader returns [EObject current=null] : iv_ruleFunctionHeader= ruleFunctionHeader EOF ;
    public final EObject entryRuleFunctionHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionHeader = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4571:2: (iv_ruleFunctionHeader= ruleFunctionHeader EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4572:2: iv_ruleFunctionHeader= ruleFunctionHeader EOF
            {
             newCompositeNode(grammarAccess.getFunctionHeaderRule()); 
            pushFollow(FOLLOW_ruleFunctionHeader_in_entryRuleFunctionHeader10855);
            iv_ruleFunctionHeader=ruleFunctionHeader();

            state._fsp--;

             current =iv_ruleFunctionHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionHeader10865); 

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
    // $ANTLR end "entryRuleFunctionHeader"


    // $ANTLR start "ruleFunctionHeader"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4579:1: ruleFunctionHeader returns [EObject current=null] : ( (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )? ) ;
    public final EObject ruleFunctionHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_11=null;
        Token this_STRING_12=null;
        EObject this_UnNammedAddr_6 = null;

        AntlrDatatypeRuleToken lv_returnType_7_0 = null;

        EObject lv_name_8_0 = null;

        EObject lv_pList_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4582:28: ( ( (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4583:1: ( (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4583:1: ( (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4583:2: (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4583:2: (otherlv_0= 'declare' | otherlv_1= 'define' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==171) ) {
                alt75=1;
            }
            else if ( (LA75_0==172) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4583:4: otherlv_0= 'declare'
                    {
                    otherlv_0=(Token)match(input,171,FOLLOW_171_in_ruleFunctionHeader10903); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionHeaderAccess().getDeclareKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4588:7: otherlv_1= 'define'
                    {
                    otherlv_1=(Token)match(input,172,FOLLOW_172_in_ruleFunctionHeader10921); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionHeaderAccess().getDefineKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4592:2: ( ruleLinkage )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=178 && LA76_0<=193)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4593:5: ruleLinkage
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getLinkageParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLinkage_in_ruleFunctionHeader10939);
                    ruleLinkage();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4600:3: ( ruleVisibility )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=175 && LA77_0<=177)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4601:5: ruleVisibility
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getVisibilityParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVisibility_in_ruleFunctionHeader10957);
                    ruleVisibility();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4608:3: ( ruleCallingConv )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=62 && LA78_0<=76)) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_INT) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4609:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionHeader10975);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4616:3: ( ruleReturnAttributes )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=53 && LA79_0<=60)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4617:5: ruleReturnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getReturnAttributesParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleReturnAttributes_in_ruleFunctionHeader10993);
                    ruleReturnAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4624:3: (this_UnNammedAddr_6= ruleUnNammedAddr )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4625:5: this_UnNammedAddr_6= ruleUnNammedAddr
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getUnNammedAddrParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleUnNammedAddr_in_ruleFunctionHeader11017);
                    this_UnNammedAddr_6=ruleUnNammedAddr();

                    state._fsp--;

                     
                            current = this_UnNammedAddr_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4633:3: ( (lv_returnType_7_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4634:1: (lv_returnType_7_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4634:1: (lv_returnType_7_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4635:3: lv_returnType_7_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getReturnTypeTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFunctionHeader11039);
            lv_returnType_7_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
            	        }
                   		set(
                   			current, 
                   			"returnType",
                    		lv_returnType_7_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4651:2: ( (lv_name_8_0= ruleGlobalName ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4652:1: (lv_name_8_0= ruleGlobalName )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4652:1: (lv_name_8_0= ruleGlobalName )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4653:3: lv_name_8_0= ruleGlobalName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getNameGlobalNameParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalName_in_ruleFunctionHeader11060);
            lv_name_8_0=ruleGlobalName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_8_0, 
                    		"GlobalName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4669:2: ( (lv_pList_9_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4670:1: (lv_pList_9_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4670:1: (lv_pList_9_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4671:3: lv_pList_9_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getPListParameterListParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleFunctionHeader11081);
            lv_pList_9_0=ruleParameterList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
            	        }
                   		set(
                   			current, 
                   			"pList",
                    		lv_pList_9_0, 
                    		"ParameterList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4687:2: ( ruleFunctionAttributes )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=77 && LA81_0<=78)||(LA81_0>=81 && LA81_0<=96)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4688:5: ruleFunctionAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getFunctionAttributesParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleFunctionAttributes_in_ruleFunctionHeader11098);
                    ruleFunctionAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4695:3: (otherlv_11= 'section ' this_STRING_12= RULE_STRING )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==173) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4695:5: otherlv_11= 'section ' this_STRING_12= RULE_STRING
                    {
                    otherlv_11=(Token)match(input,173,FOLLOW_173_in_ruleFunctionHeader11112); 

                        	newLeafNode(otherlv_11, grammarAccess.getFunctionHeaderAccess().getSectionKeyword_10_0());
                        
                    this_STRING_12=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionHeader11123); 
                     
                        newLeafNode(this_STRING_12, grammarAccess.getFunctionHeaderAccess().getSTRINGTerminalRuleCall_10_1()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4703:3: ( ruleAlignment )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==49) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4704:5: ruleAlignment
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getAlignmentParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleAlignment_in_ruleFunctionHeader11141);
                    ruleAlignment();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

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
    // $ANTLR end "ruleFunctionHeader"


    // $ANTLR start "entryRuleGlobalName"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4719:1: entryRuleGlobalName returns [EObject current=null] : iv_ruleGlobalName= ruleGlobalName EOF ;
    public final EObject entryRuleGlobalName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalName = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4720:2: (iv_ruleGlobalName= ruleGlobalName EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4721:2: iv_ruleGlobalName= ruleGlobalName EOF
            {
             newCompositeNode(grammarAccess.getGlobalNameRule()); 
            pushFollow(FOLLOW_ruleGlobalName_in_entryRuleGlobalName11178);
            iv_ruleGlobalName=ruleGlobalName();

            state._fsp--;

             current =iv_ruleGlobalName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalName11188); 

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
    // $ANTLR end "entryRuleGlobalName"


    // $ANTLR start "ruleGlobalName"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4728:1: ruleGlobalName returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGlobalName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4731:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4732:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4732:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4732:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,174,FOLLOW_174_in_ruleGlobalName11225); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalNameAccess().getCommercialAtKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4736:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4737:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4737:1: (lv_name_1_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4738:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalName11242); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGlobalNameAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGlobalNameRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleGlobalName"


    // $ANTLR start "entryRuleUnNammedAddr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4762:1: entryRuleUnNammedAddr returns [EObject current=null] : iv_ruleUnNammedAddr= ruleUnNammedAddr EOF ;
    public final EObject entryRuleUnNammedAddr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNammedAddr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4763:2: (iv_ruleUnNammedAddr= ruleUnNammedAddr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4764:2: iv_ruleUnNammedAddr= ruleUnNammedAddr EOF
            {
             newCompositeNode(grammarAccess.getUnNammedAddrRule()); 
            pushFollow(FOLLOW_ruleUnNammedAddr_in_entryRuleUnNammedAddr11283);
            iv_ruleUnNammedAddr=ruleUnNammedAddr();

            state._fsp--;

             current =iv_ruleUnNammedAddr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnNammedAddr11293); 

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
    // $ANTLR end "entryRuleUnNammedAddr"


    // $ANTLR start "ruleUnNammedAddr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4771:1: ruleUnNammedAddr returns [EObject current=null] : ( (lv_adress_0_0= RULE_INT ) ) ;
    public final EObject ruleUnNammedAddr() throws RecognitionException {
        EObject current = null;

        Token lv_adress_0_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4774:28: ( ( (lv_adress_0_0= RULE_INT ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4775:1: ( (lv_adress_0_0= RULE_INT ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4775:1: ( (lv_adress_0_0= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4776:1: (lv_adress_0_0= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4776:1: (lv_adress_0_0= RULE_INT )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4777:3: lv_adress_0_0= RULE_INT
            {
            lv_adress_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUnNammedAddr11334); 

            			newLeafNode(lv_adress_0_0, grammarAccess.getUnNammedAddrAccess().getAdressINTTerminalRuleCall_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getUnNammedAddrRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"adress",
                    		lv_adress_0_0, 
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
    // $ANTLR end "ruleUnNammedAddr"


    // $ANTLR start "entryRuleVisibility"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4801:1: entryRuleVisibility returns [String current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final String entryRuleVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibility = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4802:2: (iv_ruleVisibility= ruleVisibility EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4803:2: iv_ruleVisibility= ruleVisibility EOF
            {
             newCompositeNode(grammarAccess.getVisibilityRule()); 
            pushFollow(FOLLOW_ruleVisibility_in_entryRuleVisibility11375);
            iv_ruleVisibility=ruleVisibility();

            state._fsp--;

             current =iv_ruleVisibility.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibility11386); 

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
    // $ANTLR end "entryRuleVisibility"


    // $ANTLR start "ruleVisibility"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4810:1: ruleVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'default' | kw= 'hidden' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4813:28: ( (kw= 'default' | kw= 'hidden' | kw= 'protected' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4814:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4814:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            int alt84=3;
            switch ( input.LA(1) ) {
            case 175:
                {
                alt84=1;
                }
                break;
            case 176:
                {
                alt84=2;
                }
                break;
            case 177:
                {
                alt84=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4815:2: kw= 'default'
                    {
                    kw=(Token)match(input,175,FOLLOW_175_in_ruleVisibility11424); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisibilityAccess().getDefaultKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4822:2: kw= 'hidden'
                    {
                    kw=(Token)match(input,176,FOLLOW_176_in_ruleVisibility11443); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisibilityAccess().getHiddenKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4829:2: kw= 'protected'
                    {
                    kw=(Token)match(input,177,FOLLOW_177_in_ruleVisibility11462); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisibilityAccess().getProtectedKeyword_2()); 
                        

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
    // $ANTLR end "ruleVisibility"


    // $ANTLR start "entryRuleLinkage"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4842:1: entryRuleLinkage returns [String current=null] : iv_ruleLinkage= ruleLinkage EOF ;
    public final String entryRuleLinkage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinkage = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4843:2: (iv_ruleLinkage= ruleLinkage EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4844:2: iv_ruleLinkage= ruleLinkage EOF
            {
             newCompositeNode(grammarAccess.getLinkageRule()); 
            pushFollow(FOLLOW_ruleLinkage_in_entryRuleLinkage11503);
            iv_ruleLinkage=ruleLinkage();

            state._fsp--;

             current =iv_ruleLinkage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkage11514); 

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
    // $ANTLR end "entryRuleLinkage"


    // $ANTLR start "ruleLinkage"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4851:1: ruleLinkage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_AliasLinkage_12= ruleAliasLinkage ) ;
    public final AntlrDatatypeRuleToken ruleLinkage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AliasLinkage_12 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4854:28: ( (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_AliasLinkage_12= ruleAliasLinkage ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4855:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_AliasLinkage_12= ruleAliasLinkage )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4855:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_AliasLinkage_12= ruleAliasLinkage )
            int alt85=13;
            switch ( input.LA(1) ) {
            case 178:
                {
                alt85=1;
                }
                break;
            case 179:
                {
                alt85=2;
                }
                break;
            case 180:
                {
                alt85=3;
                }
                break;
            case 181:
                {
                alt85=4;
                }
                break;
            case 182:
                {
                alt85=5;
                }
                break;
            case 183:
                {
                alt85=6;
                }
                break;
            case 184:
                {
                alt85=7;
                }
                break;
            case 185:
                {
                alt85=8;
                }
                break;
            case 186:
                {
                alt85=9;
                }
                break;
            case 187:
                {
                alt85=10;
                }
                break;
            case 188:
                {
                alt85=11;
                }
                break;
            case 189:
                {
                alt85=12;
                }
                break;
            case 190:
            case 191:
            case 192:
            case 193:
                {
                alt85=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }

            switch (alt85) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4856:2: kw= 'private'
                    {
                    kw=(Token)match(input,178,FOLLOW_178_in_ruleLinkage11552); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4863:2: kw= 'linker_private'
                    {
                    kw=(Token)match(input,179,FOLLOW_179_in_ruleLinkage11571); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinker_privateKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4870:2: kw= 'linker_private_weak'
                    {
                    kw=(Token)match(input,180,FOLLOW_180_in_ruleLinkage11590); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinker_private_weakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4877:2: kw= 'available_externally'
                    {
                    kw=(Token)match(input,181,FOLLOW_181_in_ruleLinkage11609); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getAvailable_externallyKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4884:2: kw= 'linkonce'
                    {
                    kw=(Token)match(input,182,FOLLOW_182_in_ruleLinkage11628); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinkonceKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4891:2: kw= 'common'
                    {
                    kw=(Token)match(input,183,FOLLOW_183_in_ruleLinkage11647); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getCommonKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4898:2: kw= 'appending'
                    {
                    kw=(Token)match(input,184,FOLLOW_184_in_ruleLinkage11666); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getAppendingKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4905:2: kw= 'extern_weak'
                    {
                    kw=(Token)match(input,185,FOLLOW_185_in_ruleLinkage11685); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getExtern_weakKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4912:2: kw= 'linkonce_odr'
                    {
                    kw=(Token)match(input,186,FOLLOW_186_in_ruleLinkage11704); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinkonce_odrKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4919:2: kw= 'linkonce_odr_auto_hide'
                    {
                    kw=(Token)match(input,187,FOLLOW_187_in_ruleLinkage11723); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinkonce_odr_auto_hideKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4926:2: kw= 'dllimport'
                    {
                    kw=(Token)match(input,188,FOLLOW_188_in_ruleLinkage11742); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getDllimportKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4933:2: kw= 'dllexport'
                    {
                    kw=(Token)match(input,189,FOLLOW_189_in_ruleLinkage11761); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getDllexportKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4940:5: this_AliasLinkage_12= ruleAliasLinkage
                    {
                     
                            newCompositeNode(grammarAccess.getLinkageAccess().getAliasLinkageParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleAliasLinkage_in_ruleLinkage11789);
                    this_AliasLinkage_12=ruleAliasLinkage();

                    state._fsp--;


                    		current.merge(this_AliasLinkage_12);
                        
                     
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
    // $ANTLR end "ruleLinkage"


    // $ANTLR start "entryRuleAliasLinkage"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4958:1: entryRuleAliasLinkage returns [String current=null] : iv_ruleAliasLinkage= ruleAliasLinkage EOF ;
    public final String entryRuleAliasLinkage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasLinkage = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4959:2: (iv_ruleAliasLinkage= ruleAliasLinkage EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4960:2: iv_ruleAliasLinkage= ruleAliasLinkage EOF
            {
             newCompositeNode(grammarAccess.getAliasLinkageRule()); 
            pushFollow(FOLLOW_ruleAliasLinkage_in_entryRuleAliasLinkage11835);
            iv_ruleAliasLinkage=ruleAliasLinkage();

            state._fsp--;

             current =iv_ruleAliasLinkage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasLinkage11846); 

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
    // $ANTLR end "entryRuleAliasLinkage"


    // $ANTLR start "ruleAliasLinkage"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4967:1: ruleAliasLinkage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) ;
    public final AntlrDatatypeRuleToken ruleAliasLinkage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4970:28: ( (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4971:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4971:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            int alt86=4;
            switch ( input.LA(1) ) {
            case 190:
                {
                alt86=1;
                }
                break;
            case 191:
                {
                alt86=2;
                }
                break;
            case 192:
                {
                alt86=3;
                }
                break;
            case 193:
                {
                alt86=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4972:2: kw= 'external'
                    {
                    kw=(Token)match(input,190,FOLLOW_190_in_ruleAliasLinkage11884); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAliasLinkageAccess().getExternalKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4979:2: kw= 'internal'
                    {
                    kw=(Token)match(input,191,FOLLOW_191_in_ruleAliasLinkage11903); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAliasLinkageAccess().getInternalKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4986:2: kw= 'weak'
                    {
                    kw=(Token)match(input,192,FOLLOW_192_in_ruleAliasLinkage11922); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAliasLinkageAccess().getWeakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4993:2: kw= 'weak_odr'
                    {
                    kw=(Token)match(input,193,FOLLOW_193_in_ruleAliasLinkage11941); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAliasLinkageAccess().getWeak_odrKeyword_3()); 
                        

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
    // $ANTLR end "ruleAliasLinkage"


    // $ANTLR start "entryRuleTopLevelEntity"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5008:1: entryRuleTopLevelEntity returns [String current=null] : iv_ruleTopLevelEntity= ruleTopLevelEntity EOF ;
    public final String entryRuleTopLevelEntity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTopLevelEntity = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5009:2: (iv_ruleTopLevelEntity= ruleTopLevelEntity EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5010:2: iv_ruleTopLevelEntity= ruleTopLevelEntity EOF
            {
             newCompositeNode(grammarAccess.getTopLevelEntityRule()); 
            pushFollow(FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity11984);
            iv_ruleTopLevelEntity=ruleTopLevelEntity();

            state._fsp--;

             current =iv_ruleTopLevelEntity.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelEntity11995); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5017:1: ruleTopLevelEntity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) ) ;
    public final AntlrDatatypeRuleToken ruleTopLevelEntity() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_STRING_2=null;
        Token this_STRING_6=null;
        Token this_STRING_10=null;
        Token this_STRING_18=null;
        Token this_STRING_20=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5020:28: ( ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5021:1: ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5021:1: ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) )
            int alt88=5;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5021:2: (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5021:2: (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5022:2: kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING
                    {
                    kw=(Token)match(input,194,FOLLOW_194_in_ruleTopLevelEntity12034); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getModuleKeyword_0_0()); 
                        
                    kw=(Token)match(input,195,FOLLOW_195_in_ruleTopLevelEntity12047); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getAsmKeyword_0_1()); 
                        
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12062); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5041:6: (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5041:6: (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5042:2: kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING
                    {
                    kw=(Token)match(input,196,FOLLOW_196_in_ruleTopLevelEntity12088); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getTargetKeyword_1_0()); 
                        
                    kw=(Token)match(input,197,FOLLOW_197_in_ruleTopLevelEntity12101); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleTopLevelEntity12114); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_1_2()); 
                        
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12129); 

                    		current.merge(this_STRING_6);
                        
                     
                        newLeafNode(this_STRING_6, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_1_3()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5067:6: (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5067:6: (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5068:2: kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING
                    {
                    kw=(Token)match(input,196,FOLLOW_196_in_ruleTopLevelEntity12155); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getTargetKeyword_2_0()); 
                        
                    kw=(Token)match(input,198,FOLLOW_198_in_ruleTopLevelEntity12168); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_2_1()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleTopLevelEntity12181); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_2_2()); 
                        
                    this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12196); 

                    		current.merge(this_STRING_10);
                        
                     
                        newLeafNode(this_STRING_10, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_2_3()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5093:6: (kw= 'deplibs' kw= '=' kw= '[' kw= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5093:6: (kw= 'deplibs' kw= '=' kw= '[' kw= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5094:2: kw= 'deplibs' kw= '=' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,199,FOLLOW_199_in_ruleTopLevelEntity12222); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_3_0()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleTopLevelEntity12235); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_3_1()); 
                        
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleTopLevelEntity12248); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getLeftSquareBracketKeyword_3_2()); 
                        
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleTopLevelEntity12261); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getRightSquareBracketKeyword_3_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5118:6: (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5118:6: (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5119:2: kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']'
                    {
                    kw=(Token)match(input,199,FOLLOW_199_in_ruleTopLevelEntity12282); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_4_0()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleTopLevelEntity12295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_4_1()); 
                        
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleTopLevelEntity12308); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getLeftSquareBracketKeyword_4_2()); 
                        
                    this_STRING_18=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12323); 

                    		current.merge(this_STRING_18);
                        
                     
                        newLeafNode(this_STRING_18, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_4_3()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5143:1: (kw= ',' this_STRING_20= RULE_STRING )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==15) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5144:2: kw= ',' this_STRING_20= RULE_STRING
                    	    {
                    	    kw=(Token)match(input,15,FOLLOW_15_in_ruleTopLevelEntity12342); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getCommaKeyword_4_4_0()); 
                    	        
                    	    this_STRING_20=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12357); 

                    	    		current.merge(this_STRING_20);
                    	        
                    	     
                    	        newLeafNode(this_STRING_20, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_4_4_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    kw=(Token)match(input,99,FOLLOW_99_in_ruleTopLevelEntity12377); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getRightSquareBracketKeyword_4_5()); 
                        

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5170:1: entryRuleMainLevelEntity returns [EObject current=null] : iv_ruleMainLevelEntity= ruleMainLevelEntity EOF ;
    public final EObject entryRuleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainLevelEntity = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5171:2: (iv_ruleMainLevelEntity= ruleMainLevelEntity EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5172:2: iv_ruleMainLevelEntity= ruleMainLevelEntity EOF
            {
             newCompositeNode(grammarAccess.getMainLevelEntityRule()); 
            pushFollow(FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity12418);
            iv_ruleMainLevelEntity=ruleMainLevelEntity();

            state._fsp--;

             current =iv_ruleMainLevelEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainLevelEntity12428); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5179:1: ruleMainLevelEntity returns [EObject current=null] : (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVar_1= ruleLocalVar ) ;
    public final EObject ruleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionHeader_0 = null;

        EObject this_LocalVar_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5182:28: ( (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVar_1= ruleLocalVar ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5183:1: (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVar_1= ruleLocalVar )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5183:1: (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVar_1= ruleLocalVar )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=171 && LA89_0<=172)) ) {
                alt89=1;
            }
            else if ( (LA89_0==RULE_VAR_TYPE||LA89_0==14||LA89_0==17) ) {
                alt89=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5184:5: this_FunctionHeader_0= ruleFunctionHeader
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getFunctionHeaderParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionHeader_in_ruleMainLevelEntity12475);
                    this_FunctionHeader_0=ruleFunctionHeader();

                    state._fsp--;

                     
                            current = this_FunctionHeader_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5194:5: this_LocalVar_1= ruleLocalVar
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getLocalVarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLocalVar_in_ruleMainLevelEntity12502);
                    this_LocalVar_1=ruleLocalVar();

                    state._fsp--;

                     
                            current = this_LocalVar_1; 
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


    // $ANTLR start "entryRuleAlignment"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5210:1: entryRuleAlignment returns [String current=null] : iv_ruleAlignment= ruleAlignment EOF ;
    public final String entryRuleAlignment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlignment = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5211:2: (iv_ruleAlignment= ruleAlignment EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5212:2: iv_ruleAlignment= ruleAlignment EOF
            {
             newCompositeNode(grammarAccess.getAlignmentRule()); 
            pushFollow(FOLLOW_ruleAlignment_in_entryRuleAlignment12538);
            iv_ruleAlignment=ruleAlignment();

            state._fsp--;

             current =iv_ruleAlignment.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlignment12549); 

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
    // $ANTLR end "entryRuleAlignment"


    // $ANTLR start "ruleAlignment"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5219:1: ruleAlignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'align' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleAlignment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5222:28: ( (kw= 'align' this_INT_1= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5223:1: (kw= 'align' this_INT_1= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5223:1: (kw= 'align' this_INT_1= RULE_INT )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5224:2: kw= 'align' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,49,FOLLOW_49_in_ruleAlignment12587); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAlignmentAccess().getAlignKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAlignment12602); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getAlignmentAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleAlignment"

    // Delegated rules


    protected DFA72 dfa72 = new DFA72(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA72_eotS =
        "\37\uffff";
    static final String DFA72_eofS =
        "\5\uffff\1\11\1\uffff\1\11\4\uffff\1\11\5\uffff\1\11\3\uffff\1"+
        "\11\6\uffff\1\11\1\uffff";
    static final String DFA72_minS =
        "\1\u00a9\3\5\1\16\1\4\1\17\1\4\1\5\1\uffff\1\5\1\16\1\4\1\uffff"+
        "\1\5\1\17\1\22\1\17\1\4\1\5\1\17\1\5\1\4\1\5\1\17\1\22\2\17\1\5"+
        "\1\4\1\17";
    static final String DFA72_maxS =
        "\1\u00a9\1\5\1\21\1\20\1\16\1\u00c7\1\20\1\u00c7\1\20\1\uffff\1"+
        "\20\1\16\1\u00c7\1\uffff\1\5\1\20\1\22\1\20\1\u00c7\2\20\1\5\1\u00c7"+
        "\1\5\1\20\1\22\2\20\1\5\1\u00c7\1\20";
    static final String DFA72_acceptS =
        "\11\uffff\1\1\3\uffff\1\2\21\uffff";
    static final String DFA72_specialS =
        "\37\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1",
            "\1\2",
            "\1\5\10\uffff\1\3\2\uffff\1\4",
            "\1\6\12\uffff\1\7",
            "\1\10",
            "\1\11\1\14\10\uffff\1\12\1\15\1\uffff\1\13\1\uffff\1\11\1"+
            "\uffff\3\11\7\uffff\1\11\1\uffff\1\11\1\uffff\3\11\1\uffff\2"+
            "\11\4\uffff\1\11\4\uffff\3\11\10\uffff\1\11\43\uffff\1\11\3"+
            "\uffff\1\11\4\uffff\5\11\1\uffff\16\11\26\uffff\20\11\1\uffff"+
            "\2\11\2\uffff\1\11\1\uffff\2\11\25\uffff\1\11\1\uffff\1\11\2"+
            "\uffff\1\11",
            "\1\16\1\7",
            "\1\11\1\14\10\uffff\1\12\1\15\1\uffff\1\13\1\uffff\1\11\1"+
            "\uffff\3\11\7\uffff\1\11\1\uffff\1\11\1\uffff\3\11\1\uffff\2"+
            "\11\4\uffff\1\11\4\uffff\3\11\10\uffff\1\11\43\uffff\1\11\3"+
            "\uffff\1\11\4\uffff\5\11\1\uffff\16\11\26\uffff\20\11\1\uffff"+
            "\2\11\2\uffff\1\11\1\uffff\2\11\25\uffff\1\11\1\uffff\1\11\2"+
            "\uffff\1\11",
            "\1\17\12\uffff\1\20",
            "",
            "\1\21\12\uffff\1\22",
            "\1\23",
            "\1\11\1\14\6\uffff\1\11\1\uffff\1\12\1\15\1\uffff\1\13\1\uffff"+
            "\1\11\1\uffff\3\11\7\uffff\1\11\1\uffff\1\11\1\uffff\3\11\1"+
            "\uffff\2\11\4\uffff\1\11\4\uffff\3\11\10\uffff\1\11\43\uffff"+
            "\1\11\3\uffff\1\11\4\uffff\5\11\1\uffff\16\11\26\uffff\20\11"+
            "\1\uffff\2\11\2\uffff\1\11\1\uffff\2\11\25\uffff\1\11\1\uffff"+
            "\1\11\2\uffff\1\11",
            "",
            "\1\24",
            "\1\25\1\20",
            "\1\26",
            "\1\27\1\22",
            "\1\11\1\14\6\uffff\1\11\1\uffff\1\12\1\15\1\uffff\1\13\1\uffff"+
            "\1\11\1\uffff\3\11\7\uffff\1\11\1\uffff\1\11\1\uffff\3\11\1"+
            "\uffff\2\11\4\uffff\1\11\4\uffff\3\11\10\uffff\1\11\43\uffff"+
            "\1\11\3\uffff\1\11\4\uffff\5\11\1\uffff\16\11\26\uffff\20\11"+
            "\1\uffff\2\11\2\uffff\1\11\1\uffff\2\11\25\uffff\1\11\1\uffff"+
            "\1\11\2\uffff\1\11",
            "\1\30\12\uffff\1\31",
            "\1\16\1\7",
            "\1\32",
            "\1\11\1\14\10\uffff\1\12\1\15\1\uffff\1\13\1\uffff\1\11\1"+
            "\uffff\3\11\7\uffff\1\11\1\uffff\1\11\1\uffff\3\11\1\uffff\2"+
            "\11\4\uffff\1\11\4\uffff\3\11\10\uffff\1\11\43\uffff\1\11\3"+
            "\uffff\1\11\4\uffff\5\11\1\uffff\16\11\26\uffff\20\11\1\uffff"+
            "\2\11\2\uffff\1\11\1\uffff\2\11\25\uffff\1\11\1\uffff\1\11\2"+
            "\uffff\1\11",
            "\1\33",
            "\1\34\1\31",
            "\1\35",
            "\1\25\1\20",
            "\1\27\1\22",
            "\1\36",
            "\1\11\1\14\6\uffff\1\11\1\uffff\1\12\1\15\1\uffff\1\13\1\uffff"+
            "\1\11\1\uffff\3\11\7\uffff\1\11\1\uffff\1\11\1\uffff\3\11\1"+
            "\uffff\2\11\4\uffff\1\11\4\uffff\3\11\10\uffff\1\11\43\uffff"+
            "\1\11\3\uffff\1\11\4\uffff\5\11\1\uffff\16\11\26\uffff\20\11"+
            "\1\uffff\2\11\2\uffff\1\11\1\uffff\2\11\25\uffff\1\11\1\uffff"+
            "\1\11\2\uffff\1\11",
            "\1\34\1\31"
    };

    static final short[] DFA72_eot = DFA.unpackEncodedString(DFA72_eotS);
    static final short[] DFA72_eof = DFA.unpackEncodedString(DFA72_eofS);
    static final char[] DFA72_min = DFA.unpackEncodedStringToUnsignedChars(DFA72_minS);
    static final char[] DFA72_max = DFA.unpackEncodedStringToUnsignedChars(DFA72_maxS);
    static final short[] DFA72_accept = DFA.unpackEncodedString(DFA72_acceptS);
    static final short[] DFA72_special = DFA.unpackEncodedString(DFA72_specialS);
    static final short[][] DFA72_transition;

    static {
        int numStates = DFA72_transitionS.length;
        DFA72_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA72_transition[i] = DFA.unpackEncodedString(DFA72_transitionS[i]);
        }
    }

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = DFA72_eot;
            this.eof = DFA72_eof;
            this.min = DFA72_min;
            this.max = DFA72_max;
            this.accept = DFA72_accept;
            this.special = DFA72_special;
            this.transition = DFA72_transition;
        }
        public String getDescription() {
            return "4365:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )";
        }
    }
    static final String DFA88_eotS =
        "\12\uffff";
    static final String DFA88_eofS =
        "\12\uffff";
    static final String DFA88_minS =
        "\1\u00c2\1\uffff\1\u00c5\1\14\2\uffff\1\142\1\10\2\uffff";
    static final String DFA88_maxS =
        "\1\u00c7\1\uffff\1\u00c6\1\14\2\uffff\1\142\1\143\2\uffff";
    static final String DFA88_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\2\uffff\1\4\1\5";
    static final String DFA88_specialS =
        "\12\uffff}>";
    static final String[] DFA88_transitionS = {
            "\1\1\1\uffff\1\2\2\uffff\1\3",
            "",
            "\1\4\1\5",
            "\1\6",
            "",
            "",
            "\1\7",
            "\1\11\132\uffff\1\10",
            "",
            ""
    };

    static final short[] DFA88_eot = DFA.unpackEncodedString(DFA88_eotS);
    static final short[] DFA88_eof = DFA.unpackEncodedString(DFA88_eofS);
    static final char[] DFA88_min = DFA.unpackEncodedStringToUnsignedChars(DFA88_minS);
    static final char[] DFA88_max = DFA.unpackEncodedStringToUnsignedChars(DFA88_maxS);
    static final short[] DFA88_accept = DFA.unpackEncodedString(DFA88_acceptS);
    static final short[] DFA88_special = DFA.unpackEncodedString(DFA88_specialS);
    static final short[][] DFA88_transition;

    static {
        int numStates = DFA88_transitionS.length;
        DFA88_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA88_transition[i] = DFA.unpackEncodedString(DFA88_transitionS[i]);
        }
    }

    class DFA88 extends DFA {

        public DFA88(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 88;
            this.eot = DFA88_eot;
            this.eof = DFA88_eof;
            this.min = DFA88_min;
            this.max = DFA88_max;
            this.accept = DFA88_accept;
            this.special = DFA88_special;
            this.transition = DFA88_transition;
        }
        public String getDescription() {
            return "5021:1: ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLLVM_in_entryRuleLLVM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLVM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleLLVM130 = new BitSet(new long[]{0x0000000000024022L,0x0000000000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement227 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement269 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_entryRuleTypeAndValue318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeAndValue328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleTypeAndValue370 = new BitSet(new long[]{0x0000000000024020L,0x0000000000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeAndValue396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_ruleType491 = new BitSet(new long[]{0x0000000000024022L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleType517 = new BitSet(new long[]{0x0000000000024022L});
    public static final BitSet FOLLOW_ruleLocalVar_in_entryRuleLocalVar563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVar573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLocalVar619 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLocalVar631 = new BitSet(new long[]{0x201C21BA80E82000L,0x3FFF7C2200000000L,0x0000026FFFF00000L});
    public static final BitSet FOLLOW_13_in_ruleLocalVar645 = new BitSet(new long[]{0x0000000000024020L,0x0000000000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleLocalVar661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleLocalVar688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_entryRuleStructType726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructType737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStructType776 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType792 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleStructType811 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType826 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleStructType848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleStructType869 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleStructType882 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType898 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleStructType917 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType932 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_16_in_ruleStructType954 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleStructType967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr1008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetElementPtr1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleGetElementPtr1055 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_20_in_ruleGetElementPtr1068 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr1091 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleGetElementPtr1104 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr1125 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_entryRuleExtractValue1163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractValue1173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleExtractValue1210 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractValue1231 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExtractValue1244 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExtractValue1261 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_entryRuleInsertValue1304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertValue1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleInsertValue1351 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertValue1372 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInsertValue1384 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertValue1405 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInsertValue1418 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInsertValue1435 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleFence_in_entryRuleFence1478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFence1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleFence1525 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_24_in_ruleFence1538 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleFence1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_entryRuleAtomicOrdering1598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicOrdering1609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAtomicOrdering1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAtomicOrdering1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAtomicOrdering1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAtomicOrdering1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAtomicOrdering1723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAtomicOrdering1742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmpXchg1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCmpXchg1829 = new BitSet(new long[]{0x0000000100100020L});
    public static final BitSet FOLLOW_32_in_ruleCmpXchg1842 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg1865 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCmpXchg1877 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg1898 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleCmpXchg1910 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg1931 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_24_in_ruleCmpXchg1944 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleCmpXchg1967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW2003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRMW2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAtomicRMW2050 = new BitSet(new long[]{0x00001FFD00000000L});
    public static final BitSet FOLLOW_32_in_ruleAtomicRMW2063 = new BitSet(new long[]{0x00001FFD00000000L});
    public static final BitSet FOLLOW_ruleBinOp_in_ruleAtomicRMW2081 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW2101 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleAtomicRMW2113 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW2134 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicRMW2147 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleAtomicRMW2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_entryRuleBinOp2207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinOp2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBinOp2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBinOp2275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBinOp2294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBinOp2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBinOp2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBinOp2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBinOp2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBinOp2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBinOp2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBinOp2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBinOp2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_entryRuleLoad2486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoad2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLoad2534 = new BitSet(new long[]{0x0000000100100020L});
    public static final BitSet FOLLOW_32_in_ruleLoad2547 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLoad2570 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLoad2583 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleAlignment_in_ruleLoad2604 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLoad2619 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleLoad2631 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleLoad2643 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoad2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleLoad2687 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleLoad2699 = new BitSet(new long[]{0x0000000100100020L});
    public static final BitSet FOLLOW_32_in_ruleLoad2712 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLoad2735 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_24_in_ruleLoad2748 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleLoad2771 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleLoad2784 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleLoad2796 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoad2813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore2857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleStore2905 = new BitSet(new long[]{0x0000000100100020L});
    public static final BitSet FOLLOW_32_in_ruleStore2918 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore2941 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStore2953 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore2974 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleStore2987 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleStore2999 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStore3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleStore3031 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleStore3043 = new BitSet(new long[]{0x0000000100100020L});
    public static final BitSet FOLLOW_32_in_ruleStore3056 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore3079 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleStore3091 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore3112 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_24_in_ruleStore3125 = new BitSet(new long[]{0x000000007F000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleStore3148 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleStore3161 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleStore3173 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStore3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall3234 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleCall3282 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleCall3296 = new BitSet(new long[]{0xDFE0000000100060L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleCall3313 = new BitSet(new long[]{0x1FE0000000100020L});
    public static final BitSet FOLLOW_ruleReturnAttributes_in_ruleCall3331 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCall3353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleCall3374 = new BitSet(new long[]{0x0000000000000002L,0x00000001FFFE6000L});
    public static final BitSet FOLLOW_ruleFunctionAttributes_in_ruleCall3391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnAttributes_in_entryRuleReturnAttributes3429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnAttributes3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleReturnAttributes3478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleReturnAttributes3497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleReturnAttributes3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleReturnAttributes3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleReturnAttributes3554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleReturnAttributes3573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleReturnAttributes3592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleReturnAttributes3611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_entryRuleAlloc3651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlloc3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAlloc3698 = new BitSet(new long[]{0x000000000002C020L,0x0000000000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlloc3719 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAlloc3732 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAlloc3753 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleAlloc3768 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ruleAlignment_in_ruleAlloc3784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_entryRuleCallingConv3822 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallingConv3833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleCallingConv3871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCallingConv3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCallingConv3909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleCallingConv3928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleCallingConv3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleCallingConv3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCallingConv3985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleCallingConv4004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleCallingConv4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleCallingConv4042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleCallingConv4061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleCallingConv4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleCallingConv4099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCallingConv4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCallingConv4138 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCallingConv4151 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv4166 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCallingConv4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionAttributes_in_entryRuleFunctionAttributes4252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionAttributes4263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleFunctionAttributes4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleFunctionAttributes4321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleFunctionAttributes4334 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleFunctionAttributes4347 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFunctionAttributes4362 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleFunctionAttributes4380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleFunctionAttributes4393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleFunctionAttributes4413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleFunctionAttributes4432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleFunctionAttributes4451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleFunctionAttributes4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleFunctionAttributes4489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleFunctionAttributes4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleFunctionAttributes4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleFunctionAttributes4546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleFunctionAttributes4565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleFunctionAttributes4584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleFunctionAttributes4603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleFunctionAttributes4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleFunctionAttributes4641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleFunctionAttributes4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleFunctionAttributes4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleFunctionAttributes4698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList4738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList4748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleParameterList4794 = new BitSet(new long[]{0x0000000000100020L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleParameterList4807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleParameterList4835 = new BitSet(new long[]{0x0000000000008000L,0x0000000000010000L});
    public static final BitSet FOLLOW_15_in_ruleParameterList4848 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleParameterList4869 = new BitSet(new long[]{0x0000000000008000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleParameterList4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_entryRulePHI4921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePHI4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_rulePHI4968 = new BitSet(new long[]{0x0000000000024020L,0x0000000400000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_rulePHI4984 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_rulePHI4995 = new BitSet(new long[]{0x0000000000000080L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI5016 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_rulePHI5028 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_rulePHI5041 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_rulePHI5053 = new BitSet(new long[]{0x0000000000000080L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI5074 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_rulePHI5086 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleValuePair_in_entryRuleValuePair5124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuePair5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleValuePair5172 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuePair5191 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleValuePair5208 = new BitSet(new long[]{0x0000000000000080L,0x0000001000000000L});
    public static final BitSet FOLLOW_100_in_ruleValuePair5221 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuePair5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_entryRuleLandingPad5281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLandingPad5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleLandingPad5328 = new BitSet(new long[]{0x0000000000024020L,0x0000004000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad5349 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_102_in_ruleLandingPad5361 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLandingPad5382 = new BitSet(new long[]{0x0000000000000000L,0x0000038000000000L});
    public static final BitSet FOLLOW_103_in_ruleLandingPad5396 = new BitSet(new long[]{0x0000000000000002L,0x0000038000000000L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad5417 = new BitSet(new long[]{0x0000000000000002L,0x0000038000000000L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad5446 = new BitSet(new long[]{0x0000000000000002L,0x0000038000000000L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause5484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause5494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleClause5532 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause5554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleClause5573 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause5594 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleClause5607 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause5628 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect5667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect5677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleSelect5714 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect5735 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSelect5747 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect5768 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSelect5780 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg5837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVA_Arg5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleVA_Arg5884 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleVA_Arg5905 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleVA_Arg5917 = new BitSet(new long[]{0x0000000000024020L,0x0000000000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleVA_Arg5938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_entryRuleExtractElement5974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractElement5984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleExtractElement6021 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractElement6042 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleExtractElement6054 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractElement6075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_entryRuleInsertElement6111 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertElement6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleInsertElement6158 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement6179 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInsertElement6191 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement6212 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleInsertElement6224 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector6281 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShuffleVector6291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleShuffleVector6328 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector6349 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleShuffleVector6361 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector6382 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleShuffleVector6394 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast6451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast6461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastType_in_ruleCast6502 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCast6522 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleCast6534 = new BitSet(new long[]{0x0000000000024020L,0x0000000000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast6555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastType_in_entryRuleCastType6592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastType6603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleCastType6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleCastType6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleCastType6679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleCastType6698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleCastType6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleCastType6736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleCastType6755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleCastType6774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleCastType6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleCastType6812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleCastType6831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleCastType6850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare6890 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare6900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleCompare6938 = new BitSet(new long[]{0x0000000000000000L,0xC000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_ruleIPredicates_in_ruleCompare6954 = new BitSet(new long[]{0x00000000000240A0L,0x0000001000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare6969 = new BitSet(new long[]{0x0000000000000080L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleCompare6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleCompare7009 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000FFF0FL});
    public static final BitSet FOLLOW_ruleFPredicates_in_ruleCompare7025 = new BitSet(new long[]{0x00000000000240A0L,0x0000001000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare7040 = new BitSet(new long[]{0x0000000000000080L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleCompare7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPredicates_in_entryRuleIPredicates7098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIPredicates7109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleIPredicates7147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleIPredicates7166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleIPredicates7185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleIPredicates7204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleIPredicates7223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleIPredicates7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleIPredicates7261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleIPredicates7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleIPredicates7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleIPredicates7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFPredicates_in_entryRuleFPredicates7359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFPredicates7370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleFPredicates7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleFPredicates7427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleFPredicates7446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleFPredicates7465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleFPredicates7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleFPredicates7503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleFPredicates7522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleFPredicates7541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleFPredicates7560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleFPredicates7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleFPredicates7598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleFPredicates7617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleFPredicates7636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleFPredicates7655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleFPredicates7674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleFPredicates7693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOP_in_entryRuleArithmeticOP7734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticOP7745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleArithmeticOP7783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleArithmeticOP7802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleArithmeticOP7821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleArithmeticOP7840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleArithmeticOP7859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ruleArithmeticOP7878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ruleArithmeticOP7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleArithmeticOP7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleArithmeticOP7935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleArithmeticOP7954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleArithmeticOP7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleArithmeticOP7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOP_in_entryRuleLogicalOP8033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOP8044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ruleLogicalOP8082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ruleLogicalOP8101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleLogicalOP8120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleLogicalOP8139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleLogicalOP8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleLogicalOP8177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmetic_in_entryRuleArithmetic8217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmetic8227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOP_in_ruleArithmetic8268 = new BitSet(new long[]{0x00000000000240A0L,0x0000001000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleArithmetic8283 = new BitSet(new long[]{0x0000000000000080L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleArithmetic8304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_entryRuleLogical8339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical8349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOP_in_ruleLogical8390 = new BitSet(new long[]{0x00000000000240A0L,0x0000001000000000L,0x0000180000000000L,0x0000000000000094L});
    public static final BitSet FOLLOW_ruleType_in_ruleLogical8405 = new BitSet(new long[]{0x0000000000000080L,0x0000001000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleLogical8426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction8461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction8471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleInstruction8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_ruleInstruction8545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_ruleInstruction8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleInstruction8599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_ruleInstruction8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_ruleInstruction8653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_ruleInstruction8680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_ruleInstruction8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_ruleInstruction8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmetic_in_ruleInstruction8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleInstruction8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleInstruction8815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_ruleInstruction8842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_ruleInstruction8869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_ruleInstruction8896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_ruleInstruction8923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_ruleInstruction8950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_ruleInstruction8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_ruleInstruction9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_ruleInstruction9031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_ruleInstruction9058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_ruleInstruction9085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_ruleInstruction9112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleInstruction9139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleInstruction9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_ruleInstruction9193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_ruleInstruction9220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch9255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndirectBranch9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_ruleIndirectBranch9302 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleIndirectBranch9323 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleIndirectBranch9335 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleIndirectBranch9347 = new BitSet(new long[]{0x0000000000100020L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleLabelList_in_ruleIndirectBranch9368 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleIndirectBranch9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelList_in_entryRuleLabelList9417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelList9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLabelList9472 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch9508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch9518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_ruleSwitch9555 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSwitch9576 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleSwitch9588 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSwitch9609 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleSwitch9621 = new BitSet(new long[]{0x0000000000100020L,0x0000000800000000L});
    public static final BitSet FOLLOW_ruleJumpTable_in_ruleSwitch9642 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleSwitch9655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpTable_in_entryRuleJumpTable9691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJumpTable9701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleJumpTable9747 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleJumpTable9759 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleJumpTable9780 = new BitSet(new long[]{0x0000000000100022L});
    public static final BitSet FOLLOW_ruleInvoke_in_entryRuleInvoke9817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvoke9827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_ruleInvoke9864 = new BitSet(new long[]{0xDFE0000000100060L,0x0000000000001FFFL});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleInvoke9881 = new BitSet(new long[]{0x1FE0000000100020L});
    public static final BitSet FOLLOW_ruleReturnAttributes_in_ruleInvoke9899 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke9921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleInvoke9942 = new BitSet(new long[]{0x0000000000000000L,0x00008001FFFE6000L});
    public static final BitSet FOLLOW_ruleFunctionAttributes_in_ruleInvoke9959 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_111_in_ruleInvoke9972 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke9993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_164_in_ruleInvoke10005 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_entryRuleResume10062 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResume10072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_ruleResume10109 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleResume10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn10166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn10176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_ruleReturn10223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_167_in_ruleReturn10235 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleReturn10248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_ruleReturn10260 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleReturn10272 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn10283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_ruleReturn10304 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleReturn10325 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_15_in_ruleReturn10338 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_168_in_ruleReturn10350 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleReturn10362 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn10373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_entryRuleBranch10411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranch10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleBranch10459 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch10480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleBranch10500 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch10521 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBranch10533 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch10554 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleBranch10566 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch10587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock10626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicBlock10636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStr_in_ruleBasicBlock10691 = new BitSet(new long[]{0x201C21BA80E82002L,0x3FFF7C2200000000L,0x0000026FFFF00000L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBasicBlock10713 = new BitSet(new long[]{0x201C21BA80E82002L,0x3FFF7C2200000000L,0x0000026FFFF00000L});
    public static final BitSet FOLLOW_ruleLabelStr_in_entryRuleLabelStr10750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelStr10760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabelStr10802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_170_in_ruleLabelStr10819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_entryRuleFunctionHeader10855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionHeader10865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_ruleFunctionHeader10903 = new BitSet(new long[]{0xDFE0000000024060L,0x0000000000001FFFL,0xFFFFD80000000000L,0x0000000000000097L});
    public static final BitSet FOLLOW_172_in_ruleFunctionHeader10921 = new BitSet(new long[]{0xDFE0000000024060L,0x0000000000001FFFL,0xFFFFD80000000000L,0x0000000000000097L});
    public static final BitSet FOLLOW_ruleLinkage_in_ruleFunctionHeader10939 = new BitSet(new long[]{0xDFE0000000024060L,0x0000000000001FFFL,0xFFFFD80000000000L,0x0000000000000097L});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleFunctionHeader10957 = new BitSet(new long[]{0xDFE0000000024060L,0x0000000000001FFFL,0xFFFFD80000000000L,0x0000000000000097L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionHeader10975 = new BitSet(new long[]{0xDFE0000000024060L,0x0000000000001FFFL,0xFFFFD80000000000L,0x0000000000000097L});
    public static final BitSet FOLLOW_ruleReturnAttributes_in_ruleFunctionHeader10993 = new BitSet(new long[]{0xDFE0000000024060L,0x0000000000001FFFL,0xFFFFD80000000000L,0x0000000000000097L});
    public static final BitSet FOLLOW_ruleUnNammedAddr_in_ruleFunctionHeader11017 = new BitSet(new long[]{0xDFE0000000024060L,0x0000000000001FFFL,0xFFFFD80000000000L,0x0000000000000097L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionHeader11039 = new BitSet(new long[]{0xDFE0000000024060L,0x0000000000001FFFL,0xFFFFD80000000000L,0x0000000000000097L});
    public static final BitSet FOLLOW_ruleGlobalName_in_ruleFunctionHeader11060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleFunctionHeader11081 = new BitSet(new long[]{0x0002000000000002L,0x00000001FFFE6000L,0x0000200000000000L});
    public static final BitSet FOLLOW_ruleFunctionAttributes_in_ruleFunctionHeader11098 = new BitSet(new long[]{0x0002000000000002L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_173_in_ruleFunctionHeader11112 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionHeader11123 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_ruleAlignment_in_ruleFunctionHeader11141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalName_in_entryRuleGlobalName11178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalName11188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_ruleGlobalName11225 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalName11242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNammedAddr_in_entryRuleUnNammedAddr11283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnNammedAddr11293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUnNammedAddr11334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_entryRuleVisibility11375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibility11386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_ruleVisibility11424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_ruleVisibility11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_ruleVisibility11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkage_in_entryRuleLinkage11503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkage11514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_ruleLinkage11552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_179_in_ruleLinkage11571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_ruleLinkage11590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_ruleLinkage11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_ruleLinkage11628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_ruleLinkage11647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_184_in_ruleLinkage11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_ruleLinkage11685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_ruleLinkage11704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_ruleLinkage11723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_ruleLinkage11742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_ruleLinkage11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasLinkage_in_ruleLinkage11789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasLinkage_in_entryRuleAliasLinkage11835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasLinkage11846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_ruleAliasLinkage11884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_ruleAliasLinkage11903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_ruleAliasLinkage11922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleAliasLinkage11941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity11984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelEntity11995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleTopLevelEntity12034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_ruleTopLevelEntity12047 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_ruleTopLevelEntity12088 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_197_in_ruleTopLevelEntity12101 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTopLevelEntity12114 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_ruleTopLevelEntity12155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_198_in_ruleTopLevelEntity12168 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTopLevelEntity12181 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_ruleTopLevelEntity12222 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTopLevelEntity12235 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleTopLevelEntity12248 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleTopLevelEntity12261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_ruleTopLevelEntity12282 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTopLevelEntity12295 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_98_in_ruleTopLevelEntity12308 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12323 = new BitSet(new long[]{0x0000000000008000L,0x0000000800000000L});
    public static final BitSet FOLLOW_15_in_ruleTopLevelEntity12342 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12357 = new BitSet(new long[]{0x0000000000008000L,0x0000000800000000L});
    public static final BitSet FOLLOW_99_in_ruleTopLevelEntity12377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity12418 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainLevelEntity12428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_ruleMainLevelEntity12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVar_in_ruleMainLevelEntity12502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignment_in_entryRuleAlignment12538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignment12549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleAlignment12587 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAlignment12602 = new BitSet(new long[]{0x0000000000000002L});

}