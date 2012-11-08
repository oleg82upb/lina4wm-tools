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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_VAR_TYPE", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'type'", "'int'", "'long'", "'double'", "'float'", "'bool'", "'sbyte'", "'short'", "'ulong'", "'label'", "'void'", "'ubyte'", "'ushort'", "'uint'", "'*'", "'addrspace'", "'('", "')'", "'{'", "'}'", "','", "'<'", "'>'", "'getelementptr'", "'inbounds'", "'extractvalue'", "'insertvalue'", "'fence'", "'singlethread'", "'unordered'", "'monotonic'", "'aquire'", "'release'", "'acq_rel'", "'seq_cst'", "'cmpxchg'", "'volatile'", "'atomicrmw'", "'xchg'", "'add'", "'sub'", "'and'", "'nand'", "'or'", "'xor'", "'max'", "'min'", "'umax'", "'umin'", "'load'", "'!nontemporal'", "'!'", "'atomic'", "'align'", "'store'", "'tail'", "'call'", "'zeroext'", "'signext'", "'inreg'", "'byval'", "'sret'", "'noalias'", "'nocapture'", "'nest'", "'alloca'", "'ccc'", "'fastcc'", "'coldcc'", "'x86_stdcallcc'", "'x86_fastcallcc'", "'x86_thiscallcc'", "'arm_apcscc'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", "'msp430_intrcc'", "'ptx_kernel'", "'ptx_device'", "'spir_func'", "'spir_kernel'", "'cc <'", "'address_safety'", "'alignstack(<n>)'", "'alwaysinline'", "'nonlazybind'", "'inlinehint'", "'naked'", "'noimplicitfloat'", "'noinline'", "'noredzone'", "'noreturn'", "'nounwind'", "'optsize'", "'readnone'", "'readonly'", "'returns_twice'", "'ssp'", "'sspreq'", "'uwtable'", "'phi'", "'['", "']'", "'%'", "'landingpad'", "'personality'", "'cleanup'", "'catch'", "'filter'", "'select'", "'va_arg'", "'extractelement'", "'insertelement'", "'shufflevector'", "'to'", "'trunc'", "'zext'", "'sext'", "'fptrunc'", "'fpext'", "'fptoui'", "'fptosi'", "'uitofp'", "'sitofp'", "'ptrtoint'", "'inttoptr'", "'bitcast'", "'icmp'", "'fcmp'", "'eq'", "'ne'", "'ugt'", "'uge'", "'ult'", "'ule'", "'sgt'", "'sge'", "'slt'", "'sle'", "'false'", "'oeq'", "'ogt'", "'oge'", "'olt'", "'ole'", "'one'", "'ord'", "'ueq'", "'une'", "'uno'", "'true'", "'fadd'", "'fsub'", "'mul'", "'fmul'", "'udiv'", "'sdiv'", "'fdiv'", "'urem'", "'srem'", "'frem'", "'shl'", "'lshr'", "'ashr'", "'indirectbr'", "'switch'", "'invoke'", "'unwind'", "'resume'", "'ret'", "'!dbg'", "'br'", "':'", "'declare'", "'define'", "'section '", "'@'", "'default'", "'hidden'", "'protected'", "'private'", "'linker_private'", "'linker_private_weak'", "'available_externally'", "'linkonce'", "'common'", "'appending'", "'extern_weak'", "'linkonce_odr'", "'linkonce_odr_auto_hide'", "'dllimport'", "'dllexport'", "'external'", "'internal'", "'weak'", "'weak_odr'", "'module'", "'asm'", "'target'", "'triple'", "'datalayout'", "'deplibs'"
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
    public static final int T__213=213;
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
    public static final int T__202=202;
    public static final int T__203=203;
    public static final int T__204=204;
    public static final int T__205=205;
    public static final int T__206=206;
    public static final int T__207=207;
    public static final int T__208=208;
    public static final int T__209=209;
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
    public static final int T__210=210;
    public static final int T__212=212;
    public static final int T__211=211;
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
    public static final int T__200=200;
    public static final int T__201=201;
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

                if ( (LA1_0==RULE_VAR_TYPE||(LA1_0>=14 && LA1_0<=26)||LA1_0==31||LA1_0==34||LA1_0==115||(LA1_0>=185 && LA1_0<=186)||LA1_0==208||LA1_0==210||LA1_0==213) ) {
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

            if ( (LA4_0==208||LA4_0==210||LA4_0==213) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_VAR_TYPE||(LA4_0>=14 && LA4_0<=26)||LA4_0==31||LA4_0==34||LA4_0==115||(LA4_0>=185 && LA4_0<=186)) ) {
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:168:1: ruleTypeAndValue returns [EObject current=null] : ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= RULE_VAR_TYPE ) ) ) ;
    public final EObject ruleTypeAndValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_type_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:171:28: ( ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= RULE_VAR_TYPE ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:172:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= RULE_VAR_TYPE ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:172:1: ( ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= RULE_VAR_TYPE ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:172:2: ( (lv_type_0_0= ruleType ) ) ( (lv_value_1_0= RULE_VAR_TYPE ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:172:2: ( (lv_type_0_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:173:1: (lv_type_0_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:173:1: (lv_type_0_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:174:3: lv_type_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getTypeTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleTypeAndValue374);
            lv_type_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getTypeAndValueRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:190:2: ( (lv_value_1_0= RULE_VAR_TYPE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:191:1: (lv_value_1_0= RULE_VAR_TYPE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:191:1: (lv_value_1_0= RULE_VAR_TYPE )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:192:3: lv_value_1_0= RULE_VAR_TYPE
            {
            lv_value_1_0=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleTypeAndValue391); 

            			newLeafNode(lv_value_1_0, grammarAccess.getTypeAndValueAccess().getValueVAR_TYPETerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTypeAndValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"VAR_TYPE");
            	    

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:225:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BasicType_0= ruleBasicType | this_StructType_1= ruleStructType | this_Pointer_2= rulePointer | this_VAR_TYPE_3= RULE_VAR_TYPE ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_TYPE_3=null;
        AntlrDatatypeRuleToken this_BasicType_0 = null;

        AntlrDatatypeRuleToken this_StructType_1 = null;

        AntlrDatatypeRuleToken this_Pointer_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:228:28: ( (this_BasicType_0= ruleBasicType | this_StructType_1= ruleStructType | this_Pointer_2= rulePointer | this_VAR_TYPE_3= RULE_VAR_TYPE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:229:1: (this_BasicType_0= ruleBasicType | this_StructType_1= ruleStructType | this_Pointer_2= rulePointer | this_VAR_TYPE_3= RULE_VAR_TYPE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:229:1: (this_BasicType_0= ruleBasicType | this_StructType_1= ruleStructType | this_Pointer_2= rulePointer | this_VAR_TYPE_3= RULE_VAR_TYPE )
            int alt5=4;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:5: this_BasicType_0= ruleBasicType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getBasicTypeParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleType491);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    		current.merge(this_BasicType_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:242:5: this_StructType_1= ruleStructType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleStructType_in_ruleType524);
                    this_StructType_1=ruleStructType();

                    state._fsp--;


                    		current.merge(this_StructType_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:254:5: this_Pointer_2= rulePointer
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPointerParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_rulePointer_in_ruleType557);
                    this_Pointer_2=rulePointer();

                    state._fsp--;


                    		current.merge(this_Pointer_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:265:10: this_VAR_TYPE_3= RULE_VAR_TYPE
                    {
                    this_VAR_TYPE_3=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleType583); 

                    		current.merge(this_VAR_TYPE_3);
                        
                     
                        newLeafNode(this_VAR_TYPE_3, grammarAccess.getTypeAccess().getVAR_TYPETerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleLocalVar"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:280:1: entryRuleLocalVar returns [EObject current=null] : iv_ruleLocalVar= ruleLocalVar EOF ;
    public final EObject entryRuleLocalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVar = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:281:2: (iv_ruleLocalVar= ruleLocalVar EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:282:2: iv_ruleLocalVar= ruleLocalVar EOF
            {
             newCompositeNode(grammarAccess.getLocalVarRule()); 
            pushFollow(FOLLOW_ruleLocalVar_in_entryRuleLocalVar628);
            iv_ruleLocalVar=ruleLocalVar();

            state._fsp--;

             current =iv_ruleLocalVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVar638); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:289:1: ruleLocalVar returns [EObject current=null] : ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' otherlv_2= 'type' ruleType ) ;
    public final EObject ruleLocalVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:292:28: ( ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' otherlv_2= 'type' ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:293:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' otherlv_2= 'type' ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:293:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' otherlv_2= 'type' ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:293:2: ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' otherlv_2= 'type' ruleType
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:293:2: ( (lv_name_0_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:294:1: (lv_name_0_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:294:1: (lv_name_0_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:295:3: lv_name_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLocalVarAccess().getNameTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLocalVar684);
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

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleLocalVar696); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalVarAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleLocalVar708); 

                	newLeafNode(otherlv_2, grammarAccess.getLocalVarAccess().getTypeKeyword_2());
                
             
                    newCompositeNode(grammarAccess.getLocalVarAccess().getTypeParserRuleCall_3()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleLocalVar724);
            ruleType();

            state._fsp--;

             
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
    // $ANTLR end "ruleLocalVar"


    // $ANTLR start "entryRuleBasicType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:335:1: entryRuleBasicType returns [String current=null] : iv_ruleBasicType= ruleBasicType EOF ;
    public final String entryRuleBasicType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBasicType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:336:2: (iv_ruleBasicType= ruleBasicType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:337:2: iv_ruleBasicType= ruleBasicType EOF
            {
             newCompositeNode(grammarAccess.getBasicTypeRule()); 
            pushFollow(FOLLOW_ruleBasicType_in_entryRuleBasicType760);
            iv_ruleBasicType=ruleBasicType();

            state._fsp--;

             current =iv_ruleBasicType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicType771); 

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
    // $ANTLR end "entryRuleBasicType"


    // $ANTLR start "ruleBasicType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:344:1: ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'bool' | kw= 'sbyte' | kw= 'short' | kw= 'ulong' | kw= 'label' | kw= 'void' | kw= 'ubyte' | kw= 'ushort' | kw= 'uint' ) ;
    public final AntlrDatatypeRuleToken ruleBasicType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:28: ( (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'bool' | kw= 'sbyte' | kw= 'short' | kw= 'ulong' | kw= 'label' | kw= 'void' | kw= 'ubyte' | kw= 'ushort' | kw= 'uint' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:348:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'bool' | kw= 'sbyte' | kw= 'short' | kw= 'ulong' | kw= 'label' | kw= 'void' | kw= 'ubyte' | kw= 'ushort' | kw= 'uint' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:348:1: (kw= 'int' | kw= 'long' | kw= 'double' | kw= 'float' | kw= 'bool' | kw= 'sbyte' | kw= 'short' | kw= 'ulong' | kw= 'label' | kw= 'void' | kw= 'ubyte' | kw= 'ushort' | kw= 'uint' )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
                {
                alt6=3;
                }
                break;
            case 17:
                {
                alt6=4;
                }
                break;
            case 18:
                {
                alt6=5;
                }
                break;
            case 19:
                {
                alt6=6;
                }
                break;
            case 20:
                {
                alt6=7;
                }
                break;
            case 21:
                {
                alt6=8;
                }
                break;
            case 22:
                {
                alt6=9;
                }
                break;
            case 23:
                {
                alt6=10;
                }
                break;
            case 24:
                {
                alt6=11;
                }
                break;
            case 25:
                {
                alt6=12;
                }
                break;
            case 26:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:349:2: kw= 'int'
                    {
                    kw=(Token)match(input,14,FOLLOW_14_in_ruleBasicType809); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getIntKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:356:2: kw= 'long'
                    {
                    kw=(Token)match(input,15,FOLLOW_15_in_ruleBasicType828); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getLongKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:363:2: kw= 'double'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleBasicType847); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getDoubleKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:370:2: kw= 'float'
                    {
                    kw=(Token)match(input,17,FOLLOW_17_in_ruleBasicType866); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getFloatKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:377:2: kw= 'bool'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleBasicType885); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getBoolKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:384:2: kw= 'sbyte'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleBasicType904); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getSbyteKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:391:2: kw= 'short'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleBasicType923); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getShortKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:398:2: kw= 'ulong'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleBasicType942); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getUlongKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:405:2: kw= 'label'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleBasicType961); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getLabelKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:412:2: kw= 'void'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleBasicType980); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getVoidKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:419:2: kw= 'ubyte'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleBasicType999); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getUbyteKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:426:2: kw= 'ushort'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleBasicType1018); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getUshortKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:433:2: kw= 'uint'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleBasicType1037); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBasicTypeAccess().getUintKeyword_12()); 
                        

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
    // $ANTLR end "ruleBasicType"


    // $ANTLR start "entryRulePointer"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:446:1: entryRulePointer returns [String current=null] : iv_rulePointer= rulePointer EOF ;
    public final String entryRulePointer() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePointer = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:447:2: (iv_rulePointer= rulePointer EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:448:2: iv_rulePointer= rulePointer EOF
            {
             newCompositeNode(grammarAccess.getPointerRule()); 
            pushFollow(FOLLOW_rulePointer_in_entryRulePointer1078);
            iv_rulePointer=rulePointer();

            state._fsp--;

             current =iv_rulePointer.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePointer1089); 

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
    // $ANTLR end "entryRulePointer"


    // $ANTLR start "rulePointer"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:455:1: rulePointer returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_BasicType_0= ruleBasicType (kw= '*' )+ ) | (this_BasicType_2= ruleBasicType kw= 'addrspace' kw= '(' this_INT_5= RULE_INT kw= ')' kw= '*' ) ) ;
    public final AntlrDatatypeRuleToken rulePointer() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_5=null;
        AntlrDatatypeRuleToken this_BasicType_0 = null;

        AntlrDatatypeRuleToken this_BasicType_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:458:28: ( ( (this_BasicType_0= ruleBasicType (kw= '*' )+ ) | (this_BasicType_2= ruleBasicType kw= 'addrspace' kw= '(' this_INT_5= RULE_INT kw= ')' kw= '*' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:459:1: ( (this_BasicType_0= ruleBasicType (kw= '*' )+ ) | (this_BasicType_2= ruleBasicType kw= 'addrspace' kw= '(' this_INT_5= RULE_INT kw= ')' kw= '*' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:459:1: ( (this_BasicType_0= ruleBasicType (kw= '*' )+ ) | (this_BasicType_2= ruleBasicType kw= 'addrspace' kw= '(' this_INT_5= RULE_INT kw= ')' kw= '*' ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:459:2: (this_BasicType_0= ruleBasicType (kw= '*' )+ )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:459:2: (this_BasicType_0= ruleBasicType (kw= '*' )+ )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:460:5: this_BasicType_0= ruleBasicType (kw= '*' )+
                    {
                     
                            newCompositeNode(grammarAccess.getPointerAccess().getBasicTypeParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_rulePointer1137);
                    this_BasicType_0=ruleBasicType();

                    state._fsp--;


                    		current.merge(this_BasicType_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:470:1: (kw= '*' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==27) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:471:2: kw= '*'
                    	    {
                    	    kw=(Token)match(input,27,FOLLOW_27_in_rulePointer1156); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getPointerAccess().getAsteriskKeyword_0_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:477:6: (this_BasicType_2= ruleBasicType kw= 'addrspace' kw= '(' this_INT_5= RULE_INT kw= ')' kw= '*' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:477:6: (this_BasicType_2= ruleBasicType kw= 'addrspace' kw= '(' this_INT_5= RULE_INT kw= ')' kw= '*' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:478:5: this_BasicType_2= ruleBasicType kw= 'addrspace' kw= '(' this_INT_5= RULE_INT kw= ')' kw= '*'
                    {
                     
                            newCompositeNode(grammarAccess.getPointerAccess().getBasicTypeParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_rulePointer1188);
                    this_BasicType_2=ruleBasicType();

                    state._fsp--;


                    		current.merge(this_BasicType_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,28,FOLLOW_28_in_rulePointer1206); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPointerAccess().getAddrspaceKeyword_1_1()); 
                        
                    kw=(Token)match(input,29,FOLLOW_29_in_rulePointer1219); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPointerAccess().getLeftParenthesisKeyword_1_2()); 
                        
                    this_INT_5=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePointer1234); 

                    		current.merge(this_INT_5);
                        
                     
                        newLeafNode(this_INT_5, grammarAccess.getPointerAccess().getINTTerminalRuleCall_1_3()); 
                        
                    kw=(Token)match(input,30,FOLLOW_30_in_rulePointer1252); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPointerAccess().getRightParenthesisKeyword_1_4()); 
                        
                    kw=(Token)match(input,27,FOLLOW_27_in_rulePointer1265); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPointerAccess().getAsteriskKeyword_1_5()); 
                        

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
    // $ANTLR end "rulePointer"


    // $ANTLR start "entryRuleStructType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:527:1: entryRuleStructType returns [String current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final String entryRuleStructType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:528:2: (iv_ruleStructType= ruleStructType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:529:2: iv_ruleStructType= ruleStructType EOF
            {
             newCompositeNode(grammarAccess.getStructTypeRule()); 
            pushFollow(FOLLOW_ruleStructType_in_entryRuleStructType1307);
            iv_ruleStructType=ruleStructType();

            state._fsp--;

             current =iv_ruleStructType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructType1318); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:536:1: ruleStructType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' kw= '}' ) | (kw= '{' this_BasicType_3= ruleBasicType (kw= ',' this_BasicType_5= ruleBasicType )* kw= '}' ) | (kw= '<' kw= '{' kw= '}' kw= '>' ) | (kw= '<' kw= '{' this_BasicType_13= ruleBasicType (kw= ',' this_BasicType_15= ruleBasicType )* kw= '}' kw= '>' ) ) ;
    public final AntlrDatatypeRuleToken ruleStructType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_BasicType_3 = null;

        AntlrDatatypeRuleToken this_BasicType_5 = null;

        AntlrDatatypeRuleToken this_BasicType_13 = null;

        AntlrDatatypeRuleToken this_BasicType_15 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:539:28: ( ( (kw= '{' kw= '}' ) | (kw= '{' this_BasicType_3= ruleBasicType (kw= ',' this_BasicType_5= ruleBasicType )* kw= '}' ) | (kw= '<' kw= '{' kw= '}' kw= '>' ) | (kw= '<' kw= '{' this_BasicType_13= ruleBasicType (kw= ',' this_BasicType_15= ruleBasicType )* kw= '}' kw= '>' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:540:1: ( (kw= '{' kw= '}' ) | (kw= '{' this_BasicType_3= ruleBasicType (kw= ',' this_BasicType_5= ruleBasicType )* kw= '}' ) | (kw= '<' kw= '{' kw= '}' kw= '>' ) | (kw= '<' kw= '{' this_BasicType_13= ruleBasicType (kw= ',' this_BasicType_15= ruleBasicType )* kw= '}' kw= '>' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:540:1: ( (kw= '{' kw= '}' ) | (kw= '{' this_BasicType_3= ruleBasicType (kw= ',' this_BasicType_5= ruleBasicType )* kw= '}' ) | (kw= '<' kw= '{' kw= '}' kw= '>' ) | (kw= '<' kw= '{' this_BasicType_13= ruleBasicType (kw= ',' this_BasicType_15= ruleBasicType )* kw= '}' kw= '>' ) )
            int alt11=4;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==32) ) {
                    alt11=1;
                }
                else if ( ((LA11_1>=14 && LA11_1<=26)) ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA11_0==34) ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2==31) ) {
                    int LA11_5 = input.LA(3);

                    if ( (LA11_5==32) ) {
                        alt11=3;
                    }
                    else if ( ((LA11_5>=14 && LA11_5<=26)) ) {
                        alt11=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 5, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:540:2: (kw= '{' kw= '}' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:540:2: (kw= '{' kw= '}' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:541:2: kw= '{' kw= '}'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleStructType1357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_0_0()); 
                        
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleStructType1370); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:553:6: (kw= '{' this_BasicType_3= ruleBasicType (kw= ',' this_BasicType_5= ruleBasicType )* kw= '}' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:553:6: (kw= '{' this_BasicType_3= ruleBasicType (kw= ',' this_BasicType_5= ruleBasicType )* kw= '}' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:554:2: kw= '{' this_BasicType_3= ruleBasicType (kw= ',' this_BasicType_5= ruleBasicType )* kw= '}'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleStructType1391); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getStructTypeAccess().getBasicTypeParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleStructType1413);
                    this_BasicType_3=ruleBasicType();

                    state._fsp--;


                    		current.merge(this_BasicType_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:570:1: (kw= ',' this_BasicType_5= ruleBasicType )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==33) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:571:2: kw= ',' this_BasicType_5= ruleBasicType
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_33_in_ruleStructType1432); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getStructTypeAccess().getCommaKeyword_1_2_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getStructTypeAccess().getBasicTypeParserRuleCall_1_2_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleBasicType_in_ruleStructType1454);
                    	    this_BasicType_5=ruleBasicType();

                    	    state._fsp--;


                    	    		current.merge(this_BasicType_5);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    kw=(Token)match(input,32,FOLLOW_32_in_ruleStructType1474); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_1_3()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:594:6: (kw= '<' kw= '{' kw= '}' kw= '>' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:594:6: (kw= '<' kw= '{' kw= '}' kw= '>' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:595:2: kw= '<' kw= '{' kw= '}' kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleStructType1495); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLessThanSignKeyword_2_0()); 
                        
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleStructType1508); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_2_1()); 
                        
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleStructType1521); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_2_2()); 
                        
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleStructType1534); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_2_3()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:619:6: (kw= '<' kw= '{' this_BasicType_13= ruleBasicType (kw= ',' this_BasicType_15= ruleBasicType )* kw= '}' kw= '>' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:619:6: (kw= '<' kw= '{' this_BasicType_13= ruleBasicType (kw= ',' this_BasicType_15= ruleBasicType )* kw= '}' kw= '>' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:620:2: kw= '<' kw= '{' this_BasicType_13= ruleBasicType (kw= ',' this_BasicType_15= ruleBasicType )* kw= '}' kw= '>'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleStructType1555); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLessThanSignKeyword_3_0()); 
                        
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleStructType1568); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_3_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getStructTypeAccess().getBasicTypeParserRuleCall_3_2()); 
                        
                    pushFollow(FOLLOW_ruleBasicType_in_ruleStructType1590);
                    this_BasicType_13=ruleBasicType();

                    state._fsp--;


                    		current.merge(this_BasicType_13);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:642:1: (kw= ',' this_BasicType_15= ruleBasicType )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==33) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:643:2: kw= ',' this_BasicType_15= ruleBasicType
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_33_in_ruleStructType1609); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getStructTypeAccess().getCommaKeyword_3_3_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getStructTypeAccess().getBasicTypeParserRuleCall_3_3_1()); 
                    	        
                    	    pushFollow(FOLLOW_ruleBasicType_in_ruleStructType1631);
                    	    this_BasicType_15=ruleBasicType();

                    	    state._fsp--;


                    	    		current.merge(this_BasicType_15);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    kw=(Token)match(input,32,FOLLOW_32_in_ruleStructType1651); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_3_4()); 
                        
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleStructType1664); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getGreaterThanSignKeyword_3_5()); 
                        

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:679:1: entryRuleGetElementPtr returns [EObject current=null] : iv_ruleGetElementPtr= ruleGetElementPtr EOF ;
    public final EObject entryRuleGetElementPtr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetElementPtr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:680:2: (iv_ruleGetElementPtr= ruleGetElementPtr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:681:2: iv_ruleGetElementPtr= ruleGetElementPtr EOF
            {
             newCompositeNode(grammarAccess.getGetElementPtrRule()); 
            pushFollow(FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr1705);
            iv_ruleGetElementPtr=ruleGetElementPtr();

            state._fsp--;

             current =iv_ruleGetElementPtr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetElementPtr1715); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:688:1: ruleGetElementPtr returns [EObject current=null] : (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* ) ;
    public final EObject ruleGetElementPtr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pointer_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:691:28: ( (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:692:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:692:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:692:3: otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleGetElementPtr1752); 

                	newLeafNode(otherlv_0, grammarAccess.getGetElementPtrAccess().getGetelementptrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:696:1: (otherlv_1= 'inbounds' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:696:3: otherlv_1= 'inbounds'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleGetElementPtr1765); 

                        	newLeafNode(otherlv_1, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:700:3: ( (lv_pointer_2_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:701:1: (lv_pointer_2_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:701:1: (lv_pointer_2_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:702:3: lv_pointer_2_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getPointerTypeAndValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr1788);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:718:2: (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:718:4: otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) )
            	    {
            	    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleGetElementPtr1801); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGetElementPtrAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:722:1: ( (lv_params_4_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:723:1: (lv_params_4_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:723:1: (lv_params_4_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:724:3: lv_params_4_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getParamsTypeAndValueParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr1822);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:748:1: entryRuleExtractValue returns [EObject current=null] : iv_ruleExtractValue= ruleExtractValue EOF ;
    public final EObject entryRuleExtractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:749:2: (iv_ruleExtractValue= ruleExtractValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:750:2: iv_ruleExtractValue= ruleExtractValue EOF
            {
             newCompositeNode(grammarAccess.getExtractValueRule()); 
            pushFollow(FOLLOW_ruleExtractValue_in_entryRuleExtractValue1860);
            iv_ruleExtractValue=ruleExtractValue();

            state._fsp--;

             current =iv_ruleExtractValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractValue1870); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:757:1: ruleExtractValue returns [EObject current=null] : (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleExtractValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token lv_index_3_0=null;
        EObject lv_aggregate_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:760:28: ( (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:761:1: (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:761:1: (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:761:3: otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleExtractValue1907); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractValueAccess().getExtractvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:765:1: ( (lv_aggregate_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:766:1: (lv_aggregate_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:766:1: (lv_aggregate_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:767:3: lv_aggregate_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getAggregateTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractValue1928);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:783:2: (otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:783:4: otherlv_2= ',' ( (lv_index_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleExtractValue1941); 

            	        	newLeafNode(otherlv_2, grammarAccess.getExtractValueAccess().getCommaKeyword_2_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:787:1: ( (lv_index_3_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:788:1: (lv_index_3_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:788:1: (lv_index_3_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:789:3: lv_index_3_0= RULE_INT
            	    {
            	    lv_index_3_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExtractValue1958); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:813:1: entryRuleInsertValue returns [EObject current=null] : iv_ruleInsertValue= ruleInsertValue EOF ;
    public final EObject entryRuleInsertValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:814:2: (iv_ruleInsertValue= ruleInsertValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:815:2: iv_ruleInsertValue= ruleInsertValue EOF
            {
             newCompositeNode(grammarAccess.getInsertValueRule()); 
            pushFollow(FOLLOW_ruleInsertValue_in_entryRuleInsertValue2001);
            iv_ruleInsertValue=ruleInsertValue();

            state._fsp--;

             current =iv_ruleInsertValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertValue2011); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:822:1: ruleInsertValue returns [EObject current=null] : (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:825:28: ( (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:826:1: (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:826:1: (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:826:3: otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_value_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleInsertValue2048); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertValueAccess().getInsertvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:830:1: ( (lv_aggregate_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:831:1: (lv_aggregate_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:831:1: (lv_aggregate_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:832:3: lv_aggregate_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getAggregateTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertValue2069);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInsertValue2081); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertValueAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:852:1: ( (lv_value_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:853:1: (lv_value_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:853:1: (lv_value_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:854:3: lv_value_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getValueTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertValue2102);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:870:2: (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==33) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:870:4: otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) )
            	    {
            	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleInsertValue2115); 

            	        	newLeafNode(otherlv_4, grammarAccess.getInsertValueAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:874:1: ( (lv_index_5_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:875:1: (lv_index_5_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:875:1: (lv_index_5_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:876:3: lv_index_5_0= RULE_INT
            	    {
            	    lv_index_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInsertValue2132); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:900:1: entryRuleFence returns [EObject current=null] : iv_ruleFence= ruleFence EOF ;
    public final EObject entryRuleFence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFence = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:901:2: (iv_ruleFence= ruleFence EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:902:2: iv_ruleFence= ruleFence EOF
            {
             newCompositeNode(grammarAccess.getFenceRule()); 
            pushFollow(FOLLOW_ruleFence_in_entryRuleFence2175);
            iv_ruleFence=ruleFence();

            state._fsp--;

             current =iv_ruleFence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFence2185); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:909:1: ruleFence returns [EObject current=null] : (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) ) ) ;
    public final EObject ruleFence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ordering_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:912:28: ( (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:913:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:913:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:913:3: otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleAtomicOrdering ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleFence2222); 

                	newLeafNode(otherlv_0, grammarAccess.getFenceAccess().getFenceKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:917:1: (otherlv_1= 'singlethread' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==41) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:917:3: otherlv_1= 'singlethread'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleFence2235); 

                        	newLeafNode(otherlv_1, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:921:3: ( (lv_ordering_2_0= ruleAtomicOrdering ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:922:1: (lv_ordering_2_0= ruleAtomicOrdering )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:922:1: (lv_ordering_2_0= ruleAtomicOrdering )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:923:3: lv_ordering_2_0= ruleAtomicOrdering
            {
             
            	        newCompositeNode(grammarAccess.getFenceAccess().getOrderingAtomicOrderingParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleFence2258);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:947:1: entryRuleAtomicOrdering returns [String current=null] : iv_ruleAtomicOrdering= ruleAtomicOrdering EOF ;
    public final String entryRuleAtomicOrdering() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAtomicOrdering = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:948:2: (iv_ruleAtomicOrdering= ruleAtomicOrdering EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:949:2: iv_ruleAtomicOrdering= ruleAtomicOrdering EOF
            {
             newCompositeNode(grammarAccess.getAtomicOrderingRule()); 
            pushFollow(FOLLOW_ruleAtomicOrdering_in_entryRuleAtomicOrdering2295);
            iv_ruleAtomicOrdering=ruleAtomicOrdering();

            state._fsp--;

             current =iv_ruleAtomicOrdering.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicOrdering2306); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:956:1: ruleAtomicOrdering returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) ;
    public final AntlrDatatypeRuleToken ruleAtomicOrdering() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:959:28: ( (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:960:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:960:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt17=1;
                }
                break;
            case 43:
                {
                alt17=2;
                }
                break;
            case 44:
                {
                alt17=3;
                }
                break;
            case 45:
                {
                alt17=4;
                }
                break;
            case 46:
                {
                alt17=5;
                }
                break;
            case 47:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:961:2: kw= 'unordered'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleAtomicOrdering2344); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getUnorderedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:968:2: kw= 'monotonic'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleAtomicOrdering2363); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getMonotonicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:975:2: kw= 'aquire'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleAtomicOrdering2382); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getAquireKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:982:2: kw= 'release'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleAtomicOrdering2401); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getReleaseKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:989:2: kw= 'acq_rel'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleAtomicOrdering2420); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAtomicOrderingAccess().getAcq_relKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:996:2: kw= 'seq_cst'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleAtomicOrdering2439); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1009:1: entryRuleCmpXchg returns [EObject current=null] : iv_ruleCmpXchg= ruleCmpXchg EOF ;
    public final EObject entryRuleCmpXchg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpXchg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1010:2: (iv_ruleCmpXchg= ruleCmpXchg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1011:2: iv_ruleCmpXchg= ruleCmpXchg EOF
            {
             newCompositeNode(grammarAccess.getCmpXchgRule()); 
            pushFollow(FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg2479);
            iv_ruleCmpXchg=ruleCmpXchg();

            state._fsp--;

             current =iv_ruleCmpXchg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmpXchg2489); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1018:1: ruleCmpXchg returns [EObject current=null] : (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1021:28: ( (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1022:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1022:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1022:3: otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleAtomicOrdering ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleCmpXchg2526); 

                	newLeafNode(otherlv_0, grammarAccess.getCmpXchgAccess().getCmpxchgKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1026:1: (otherlv_1= 'volatile' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==49) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1026:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleCmpXchg2539); 

                        	newLeafNode(otherlv_1, grammarAccess.getCmpXchgAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1030:3: ( (lv_adress_2_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1031:1: (lv_adress_2_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1031:1: (lv_adress_2_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1032:3: lv_adress_2_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getAdressTypeAndValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg2562);
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

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleCmpXchg2574); 

                	newLeafNode(otherlv_3, grammarAccess.getCmpXchgAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1052:1: ( (lv_compare_val_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1053:1: (lv_compare_val_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1053:1: (lv_compare_val_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1054:3: lv_compare_val_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getCompare_valTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg2595);
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

            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleCmpXchg2607); 

                	newLeafNode(otherlv_5, grammarAccess.getCmpXchgAccess().getCommaKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1074:1: ( (lv_new_val_6_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1075:1: (lv_new_val_6_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1075:1: (lv_new_val_6_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1076:3: lv_new_val_6_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getNew_valTypeAndValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg2628);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1092:2: (otherlv_7= 'singlethread' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==41) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1092:4: otherlv_7= 'singlethread'
                    {
                    otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleCmpXchg2641); 

                        	newLeafNode(otherlv_7, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_7());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1096:3: ( (lv_ordering_8_0= ruleAtomicOrdering ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1097:1: (lv_ordering_8_0= ruleAtomicOrdering )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1097:1: (lv_ordering_8_0= ruleAtomicOrdering )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1098:3: lv_ordering_8_0= ruleAtomicOrdering
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getOrderingAtomicOrderingParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleCmpXchg2664);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1122:1: entryRuleAtomicRMW returns [EObject current=null] : iv_ruleAtomicRMW= ruleAtomicRMW EOF ;
    public final EObject entryRuleAtomicRMW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRMW = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1123:2: (iv_ruleAtomicRMW= ruleAtomicRMW EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1124:2: iv_ruleAtomicRMW= ruleAtomicRMW EOF
            {
             newCompositeNode(grammarAccess.getAtomicRMWRule()); 
            pushFollow(FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW2700);
            iv_ruleAtomicRMW=ruleAtomicRMW();

            state._fsp--;

             current =iv_ruleAtomicRMW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRMW2710); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1131:1: ruleAtomicRMW returns [EObject current=null] : (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1134:28: ( (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1135:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1135:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1135:3: otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBinOp ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleAtomicOrdering ) )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleAtomicRMW2747); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRMWAccess().getAtomicrmwKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1139:1: (otherlv_1= 'volatile' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1139:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleAtomicRMW2760); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicRMWAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getAtomicRMWAccess().getBinOpParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleBinOp_in_ruleAtomicRMW2778);
            ruleBinOp();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1151:1: ( (lv_adress_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1152:1: (lv_adress_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1152:1: (lv_adress_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1153:3: lv_adress_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getAdressTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW2798);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleAtomicRMW2810); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRMWAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1173:1: ( (lv_value_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1174:1: (lv_value_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1174:1: (lv_value_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1175:3: lv_value_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getValueTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW2831);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1191:2: (otherlv_6= 'singlethread' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==41) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1191:4: otherlv_6= 'singlethread'
                    {
                    otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleAtomicRMW2844); 

                        	newLeafNode(otherlv_6, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_6());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1195:3: ( (lv_ordering_7_0= ruleAtomicOrdering ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1196:1: (lv_ordering_7_0= ruleAtomicOrdering )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1196:1: (lv_ordering_7_0= ruleAtomicOrdering )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1197:3: lv_ordering_7_0= ruleAtomicOrdering
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getOrderingAtomicOrderingParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleAtomicRMW2867);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1221:1: entryRuleBinOp returns [String current=null] : iv_ruleBinOp= ruleBinOp EOF ;
    public final String entryRuleBinOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBinOp = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1222:2: (iv_ruleBinOp= ruleBinOp EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1223:2: iv_ruleBinOp= ruleBinOp EOF
            {
             newCompositeNode(grammarAccess.getBinOpRule()); 
            pushFollow(FOLLOW_ruleBinOp_in_entryRuleBinOp2904);
            iv_ruleBinOp=ruleBinOp();

            state._fsp--;

             current =iv_ruleBinOp.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinOp2915); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1230:1: ruleBinOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) ;
    public final AntlrDatatypeRuleToken ruleBinOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1233:28: ( (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1234:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1234:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            int alt22=11;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt22=1;
                }
                break;
            case 52:
                {
                alt22=2;
                }
                break;
            case 53:
                {
                alt22=3;
                }
                break;
            case 54:
                {
                alt22=4;
                }
                break;
            case 55:
                {
                alt22=5;
                }
                break;
            case 56:
                {
                alt22=6;
                }
                break;
            case 57:
                {
                alt22=7;
                }
                break;
            case 58:
                {
                alt22=8;
                }
                break;
            case 59:
                {
                alt22=9;
                }
                break;
            case 60:
                {
                alt22=10;
                }
                break;
            case 61:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1235:2: kw= 'xchg'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleBinOp2953); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getXchgKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1242:2: kw= 'add'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleBinOp2972); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getAddKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1249:2: kw= 'sub'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleBinOp2991); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getSubKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1256:2: kw= 'and'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleBinOp3010); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getAndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1263:2: kw= 'nand'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleBinOp3029); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getNandKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1270:2: kw= 'or'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleBinOp3048); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getOrKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1277:2: kw= 'xor'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleBinOp3067); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getXorKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1284:2: kw= 'max'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleBinOp3086); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getMaxKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1291:2: kw= 'min'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleBinOp3105); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getMinKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1298:2: kw= 'umax'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleBinOp3124); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBinOpAccess().getUmaxKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1305:2: kw= 'umin'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleBinOp3143); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1318:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1319:2: (iv_ruleLoad= ruleLoad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1320:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_ruleLoad_in_entryRuleLoad3183);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoad3193); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1327:1: ruleLoad returns [EObject current=null] : ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? ) | (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1330:28: ( ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? ) | (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1331:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? ) | (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1331:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? ) | (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62) ) {
                int LA29_1 = input.LA(2);

                if ( (LA29_1==65) ) {
                    alt29=2;
                }
                else if ( (LA29_1==RULE_VAR_TYPE||(LA29_1>=14 && LA29_1<=26)||LA29_1==31||LA29_1==34||LA29_1==49) ) {
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1331:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1331:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1331:4: otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )? (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )?
                    {
                    otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleLoad3231); 

                        	newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1335:1: (otherlv_1= 'volatile' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==49) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1335:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleLoad3244); 

                                	newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:3: ( (lv_adress_2_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1340:1: (lv_adress_2_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1340:1: (lv_adress_2_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1341:3: lv_adress_2_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeAndValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLoad3267);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1357:2: (otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==33) ) {
                        int LA24_1 = input.LA(2);

                        if ( (LA24_1==66) ) {
                            alt24=1;
                        }
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1357:4: otherlv_3= ',' ( (lv_align_4_0= ruleAlignment ) )
                            {
                            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleLoad3280); 

                                	newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getCommaKeyword_0_3_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1361:1: ( (lv_align_4_0= ruleAlignment ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1362:1: (lv_align_4_0= ruleAlignment )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1362:1: (lv_align_4_0= ruleAlignment )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1363:3: lv_align_4_0= ruleAlignment
                            {
                             
                            	        newCompositeNode(grammarAccess.getLoadAccess().getAlignAlignmentParserRuleCall_0_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAlignment_in_ruleLoad3301);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1379:4: (otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==33) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1379:6: otherlv_5= ',' otherlv_6= '!nontemporal' otherlv_7= '!' ( (lv_index_8_0= RULE_INT ) )
                            {
                            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleLoad3316); 

                                	newLeafNode(otherlv_5, grammarAccess.getLoadAccess().getCommaKeyword_0_4_0());
                                
                            otherlv_6=(Token)match(input,63,FOLLOW_63_in_ruleLoad3328); 

                                	newLeafNode(otherlv_6, grammarAccess.getLoadAccess().getNontemporalKeyword_0_4_1());
                                
                            otherlv_7=(Token)match(input,64,FOLLOW_64_in_ruleLoad3340); 

                                	newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getExclamationMarkKeyword_0_4_2());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1391:1: ( (lv_index_8_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1392:1: (lv_index_8_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1392:1: (lv_index_8_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1393:3: lv_index_8_0= RULE_INT
                            {
                            lv_index_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoad3357); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1410:6: (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1410:6: (otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1410:8: otherlv_9= 'load' otherlv_10= 'atomic' (otherlv_11= 'volatile' )? ( (lv_adress_12_0= ruleTypeAndValue ) ) (otherlv_13= 'singlethread' )? ( (lv_ordering_14_0= ruleAtomicOrdering ) ) (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )?
                    {
                    otherlv_9=(Token)match(input,62,FOLLOW_62_in_ruleLoad3384); 

                        	newLeafNode(otherlv_9, grammarAccess.getLoadAccess().getLoadKeyword_1_0());
                        
                    otherlv_10=(Token)match(input,65,FOLLOW_65_in_ruleLoad3396); 

                        	newLeafNode(otherlv_10, grammarAccess.getLoadAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1418:1: (otherlv_11= 'volatile' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==49) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1418:3: otherlv_11= 'volatile'
                            {
                            otherlv_11=(Token)match(input,49,FOLLOW_49_in_ruleLoad3409); 

                                	newLeafNode(otherlv_11, grammarAccess.getLoadAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1422:3: ( (lv_adress_12_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1423:1: (lv_adress_12_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1423:1: (lv_adress_12_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1424:3: lv_adress_12_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLoad3432);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:2: (otherlv_13= 'singlethread' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==41) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:4: otherlv_13= 'singlethread'
                            {
                            otherlv_13=(Token)match(input,41,FOLLOW_41_in_ruleLoad3445); 

                                	newLeafNode(otherlv_13, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_4());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1444:3: ( (lv_ordering_14_0= ruleAtomicOrdering ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1445:1: (lv_ordering_14_0= ruleAtomicOrdering )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1445:1: (lv_ordering_14_0= ruleAtomicOrdering )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1446:3: lv_ordering_14_0= ruleAtomicOrdering
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getOrderingAtomicOrderingParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleLoad3468);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1462:2: (otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==33) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1462:4: otherlv_15= ',' otherlv_16= 'align' ( (lv_index_17_0= RULE_INT ) )
                            {
                            otherlv_15=(Token)match(input,33,FOLLOW_33_in_ruleLoad3481); 

                                	newLeafNode(otherlv_15, grammarAccess.getLoadAccess().getCommaKeyword_1_6_0());
                                
                            otherlv_16=(Token)match(input,66,FOLLOW_66_in_ruleLoad3493); 

                                	newLeafNode(otherlv_16, grammarAccess.getLoadAccess().getAlignKeyword_1_6_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1470:1: ( (lv_index_17_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1471:1: (lv_index_17_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1471:1: (lv_index_17_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1472:3: lv_index_17_0= RULE_INT
                            {
                            lv_index_17_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoad3510); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1496:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1497:2: (iv_ruleStore= ruleStore EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1498:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore3554);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore3564); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1505:1: ruleStore returns [EObject current=null] : ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1508:28: ( ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1509:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1509:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==67) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_VAR_TYPE||(LA35_1>=14 && LA35_1<=26)||LA35_1==31||LA35_1==34||LA35_1==49) ) {
                    alt35=1;
                }
                else if ( (LA35_1==65) ) {
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1509:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1509:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1509:4: otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )?
                    {
                    otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleStore3602); 

                        	newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1513:1: (otherlv_1= 'volatile' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==49) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1513:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleStore3615); 

                                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1517:3: ( (lv_value_2_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1518:1: (lv_value_2_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1518:1: (lv_value_2_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1519:3: lv_value_2_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueTypeAndValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore3638);
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

                    otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleStore3650); 

                        	newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getCommaKeyword_0_3());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1539:1: ( (lv_adress_4_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1540:1: (lv_adress_4_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1540:1: (lv_adress_4_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1541:3: lv_adress_4_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeAndValueParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore3671);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1557:2: (otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==33) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1557:4: otherlv_5= ',' otherlv_6= 'align' this_INT_7= RULE_INT
                            {
                            otherlv_5=(Token)match(input,33,FOLLOW_33_in_ruleStore3684); 

                                	newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getCommaKeyword_0_5_0());
                                
                            otherlv_6=(Token)match(input,66,FOLLOW_66_in_ruleStore3696); 

                                	newLeafNode(otherlv_6, grammarAccess.getStoreAccess().getAlignKeyword_0_5_1());
                                
                            this_INT_7=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStore3707); 
                             
                                newLeafNode(this_INT_7, grammarAccess.getStoreAccess().getINTTerminalRuleCall_0_5_2()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1570:6: (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1570:6: (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1570:8: otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleAtomicOrdering ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )?
                    {
                    otherlv_8=(Token)match(input,67,FOLLOW_67_in_ruleStore3728); 

                        	newLeafNode(otherlv_8, grammarAccess.getStoreAccess().getStoreKeyword_1_0());
                        
                    otherlv_9=(Token)match(input,65,FOLLOW_65_in_ruleStore3740); 

                        	newLeafNode(otherlv_9, grammarAccess.getStoreAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1578:1: (otherlv_10= 'volatile' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==49) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1578:3: otherlv_10= 'volatile'
                            {
                            otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleStore3753); 

                                	newLeafNode(otherlv_10, grammarAccess.getStoreAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1582:3: ( (lv_value_11_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1583:1: (lv_value_11_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1583:1: (lv_value_11_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1584:3: lv_value_11_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore3776);
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

                    otherlv_12=(Token)match(input,33,FOLLOW_33_in_ruleStore3788); 

                        	newLeafNode(otherlv_12, grammarAccess.getStoreAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1604:1: ( (lv_adress_13_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1605:1: (lv_adress_13_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1605:1: (lv_adress_13_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1606:3: lv_adress_13_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeAndValueParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore3809);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1622:2: (otherlv_14= 'singlethread' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==41) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1622:4: otherlv_14= 'singlethread'
                            {
                            otherlv_14=(Token)match(input,41,FOLLOW_41_in_ruleStore3822); 

                                	newLeafNode(otherlv_14, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1626:3: ( (lv_ordering_15_0= ruleAtomicOrdering ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1627:1: (lv_ordering_15_0= ruleAtomicOrdering )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1627:1: (lv_ordering_15_0= ruleAtomicOrdering )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1628:3: lv_ordering_15_0= ruleAtomicOrdering
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getOrderingAtomicOrderingParserRuleCall_1_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAtomicOrdering_in_ruleStore3845);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1644:2: (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==33) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1644:4: otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) )
                            {
                            otherlv_16=(Token)match(input,33,FOLLOW_33_in_ruleStore3858); 

                                	newLeafNode(otherlv_16, grammarAccess.getStoreAccess().getCommaKeyword_1_8_0());
                                
                            otherlv_17=(Token)match(input,66,FOLLOW_66_in_ruleStore3870); 

                                	newLeafNode(otherlv_17, grammarAccess.getStoreAccess().getAlignKeyword_1_8_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1652:1: ( (lv_index_18_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1653:1: (lv_index_18_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1653:1: (lv_index_18_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1654:3: lv_index_18_0= RULE_INT
                            {
                            lv_index_18_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStore3887); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1678:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1679:2: (iv_ruleCall= ruleCall EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1680:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall3931);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall3941); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1687:1: ruleCall returns [EObject current=null] : ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )? ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pointer_4_0 = null;

        EObject lv_plist_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1690:28: ( ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1691:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1691:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1691:2: (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_plist_5_0= ruleParameterList ) ) ( ruleFunctionAttributes )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1691:2: (otherlv_0= 'tail' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==68) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1691:4: otherlv_0= 'tail'
                    {
                    otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleCall3979); 

                        	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getTailKeyword_0());
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleCall3993); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getCallKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1699:1: ( ruleCallingConv )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_INT||(LA37_0>=79 && LA37_0<=93)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1700:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getCallingConvParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleCall4010);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1707:3: ( ruleReturnAttributes )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=70 && LA38_0<=77)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1708:5: ruleReturnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getReturnAttributesParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleReturnAttributes_in_ruleCall4028);
                    ruleReturnAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1715:3: ( (lv_pointer_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1716:1: (lv_pointer_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1716:1: (lv_pointer_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1717:3: lv_pointer_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPointerTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCall4050);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1733:2: ( (lv_plist_5_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1734:1: (lv_plist_5_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1734:1: (lv_plist_5_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1735:3: lv_plist_5_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPlistParameterListParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleCall4071);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1751:2: ( ruleFunctionAttributes )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=94 && LA39_0<=111)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1752:5: ruleFunctionAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getFunctionAttributesParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFunctionAttributes_in_ruleCall4088);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1767:1: entryRuleReturnAttributes returns [String current=null] : iv_ruleReturnAttributes= ruleReturnAttributes EOF ;
    public final String entryRuleReturnAttributes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReturnAttributes = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1768:2: (iv_ruleReturnAttributes= ruleReturnAttributes EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1769:2: iv_ruleReturnAttributes= ruleReturnAttributes EOF
            {
             newCompositeNode(grammarAccess.getReturnAttributesRule()); 
            pushFollow(FOLLOW_ruleReturnAttributes_in_entryRuleReturnAttributes4126);
            iv_ruleReturnAttributes=ruleReturnAttributes();

            state._fsp--;

             current =iv_ruleReturnAttributes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturnAttributes4137); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1776:1: ruleReturnAttributes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) ;
    public final AntlrDatatypeRuleToken ruleReturnAttributes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1779:28: ( (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1780:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1780:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            int alt40=8;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt40=1;
                }
                break;
            case 71:
                {
                alt40=2;
                }
                break;
            case 72:
                {
                alt40=3;
                }
                break;
            case 73:
                {
                alt40=4;
                }
                break;
            case 74:
                {
                alt40=5;
                }
                break;
            case 75:
                {
                alt40=6;
                }
                break;
            case 76:
                {
                alt40=7;
                }
                break;
            case 77:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1781:2: kw= 'zeroext'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleReturnAttributes4175); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getZeroextKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1788:2: kw= 'signext'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleReturnAttributes4194); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getSignextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1795:2: kw= 'inreg'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleReturnAttributes4213); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getInregKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1802:2: kw= 'byval'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleReturnAttributes4232); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getByvalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1809:2: kw= 'sret'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleReturnAttributes4251); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getSretKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1816:2: kw= 'noalias'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleReturnAttributes4270); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getNoaliasKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1823:2: kw= 'nocapture'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleReturnAttributes4289); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getReturnAttributesAccess().getNocaptureKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1830:2: kw= 'nest'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleReturnAttributes4308); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1843:1: entryRuleAlloc returns [EObject current=null] : iv_ruleAlloc= ruleAlloc EOF ;
    public final EObject entryRuleAlloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlloc = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1844:2: (iv_ruleAlloc= ruleAlloc EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1845:2: iv_ruleAlloc= ruleAlloc EOF
            {
             newCompositeNode(grammarAccess.getAllocRule()); 
            pushFollow(FOLLOW_ruleAlloc_in_entryRuleAlloc4348);
            iv_ruleAlloc=ruleAlloc();

            state._fsp--;

             current =iv_ruleAlloc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlloc4358); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1852:1: ruleAlloc returns [EObject current=null] : (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )? ) ;
    public final EObject ruleAlloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_numElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1855:28: ( (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1856:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1856:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1856:3: otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleAlignment )?
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleAlloc4395); 

                	newLeafNode(otherlv_0, grammarAccess.getAllocAccess().getAllocaKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1860:1: ( (lv_type_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1861:1: (lv_type_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1861:1: (lv_type_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1862:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAllocAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlloc4416);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1878:2: (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==33) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==RULE_VAR_TYPE||(LA41_1>=14 && LA41_1<=26)||LA41_1==31||LA41_1==34) ) {
                    alt41=1;
                }
            }
            switch (alt41) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1878:4: otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleAlloc4429); 

                        	newLeafNode(otherlv_2, grammarAccess.getAllocAccess().getCommaKeyword_2_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1882:1: ( (lv_numElements_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1883:1: (lv_numElements_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1883:1: (lv_numElements_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1884:3: lv_numElements_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getNumElementsTypeAndValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAlloc4450);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1900:4: (otherlv_4= ',' ruleAlignment )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==33) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1900:6: otherlv_4= ',' ruleAlignment
                    {
                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleAlloc4465); 

                        	newLeafNode(otherlv_4, grammarAccess.getAllocAccess().getCommaKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getAllocAccess().getAlignmentParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleAlignment_in_ruleAlloc4481);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1920:1: entryRuleCallingConv returns [String current=null] : iv_ruleCallingConv= ruleCallingConv EOF ;
    public final String entryRuleCallingConv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCallingConv = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1921:2: (iv_ruleCallingConv= ruleCallingConv EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1922:2: iv_ruleCallingConv= ruleCallingConv EOF
            {
             newCompositeNode(grammarAccess.getCallingConvRule()); 
            pushFollow(FOLLOW_ruleCallingConv_in_entryRuleCallingConv4519);
            iv_ruleCallingConv=ruleCallingConv();

            state._fsp--;

             current =iv_ruleCallingConv.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallingConv4530); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1929:1: ruleCallingConv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc <' this_INT_15= RULE_INT kw= '>' ) | this_INT_17= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleCallingConv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_15=null;
        Token this_INT_17=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1932:28: ( (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc <' this_INT_15= RULE_INT kw= '>' ) | this_INT_17= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1933:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc <' this_INT_15= RULE_INT kw= '>' ) | this_INT_17= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1933:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc <' this_INT_15= RULE_INT kw= '>' ) | this_INT_17= RULE_INT )
            int alt43=16;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt43=1;
                }
                break;
            case 80:
                {
                alt43=2;
                }
                break;
            case 81:
                {
                alt43=3;
                }
                break;
            case 82:
                {
                alt43=4;
                }
                break;
            case 83:
                {
                alt43=5;
                }
                break;
            case 84:
                {
                alt43=6;
                }
                break;
            case 85:
                {
                alt43=7;
                }
                break;
            case 86:
                {
                alt43=8;
                }
                break;
            case 87:
                {
                alt43=9;
                }
                break;
            case 88:
                {
                alt43=10;
                }
                break;
            case 89:
                {
                alt43=11;
                }
                break;
            case 90:
                {
                alt43=12;
                }
                break;
            case 91:
                {
                alt43=13;
                }
                break;
            case 92:
                {
                alt43=14;
                }
                break;
            case 93:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1934:2: kw= 'ccc'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleCallingConv4568); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCccKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1941:2: kw= 'fastcc'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleCallingConv4587); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getFastccKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1948:2: kw= 'coldcc'
                    {
                    kw=(Token)match(input,81,FOLLOW_81_in_ruleCallingConv4606); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getColdccKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1955:2: kw= 'x86_stdcallcc'
                    {
                    kw=(Token)match(input,82,FOLLOW_82_in_ruleCallingConv4625); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_stdcallccKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1962:2: kw= 'x86_fastcallcc'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleCallingConv4644); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_fastcallccKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1969:2: kw= 'x86_thiscallcc'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleCallingConv4663); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_thiscallccKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1976:2: kw= 'arm_apcscc'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleCallingConv4682); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_apcsccKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1983:2: kw= 'arm_aapcscc'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleCallingConv4701); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcsccKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1990:2: kw= 'arm_aapcs_vfpcc'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleCallingConv4720); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcs_vfpccKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1997:2: kw= 'msp430_intrcc'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleCallingConv4739); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getMsp430_intrccKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2004:2: kw= 'ptx_kernel'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleCallingConv4758); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_kernelKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2011:2: kw= 'ptx_device'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleCallingConv4777); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_deviceKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2018:2: kw= 'spir_func'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleCallingConv4796); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_funcKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2025:2: kw= 'spir_kernel'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleCallingConv4815); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_kernelKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2031:6: (kw= 'cc <' this_INT_15= RULE_INT kw= '>' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2031:6: (kw= 'cc <' this_INT_15= RULE_INT kw= '>' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2032:2: kw= 'cc <' this_INT_15= RULE_INT kw= '>'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleCallingConv4835); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCcKeyword_14_0()); 
                        
                    this_INT_15=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv4850); 

                    		current.merge(this_INT_15);
                        
                     
                        newLeafNode(this_INT_15, grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_1()); 
                        
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleCallingConv4868); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getGreaterThanSignKeyword_14_2()); 
                        

                    }


                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2051:10: this_INT_17= RULE_INT
                    {
                    this_INT_17=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv4890); 

                    		current.merge(this_INT_17);
                        
                     
                        newLeafNode(this_INT_17, grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_15()); 
                        

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2066:1: entryRuleFunctionAttributes returns [String current=null] : iv_ruleFunctionAttributes= ruleFunctionAttributes EOF ;
    public final String entryRuleFunctionAttributes() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionAttributes = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2067:2: (iv_ruleFunctionAttributes= ruleFunctionAttributes EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2068:2: iv_ruleFunctionAttributes= ruleFunctionAttributes EOF
            {
             newCompositeNode(grammarAccess.getFunctionAttributesRule()); 
            pushFollow(FOLLOW_ruleFunctionAttributes_in_entryRuleFunctionAttributes4936);
            iv_ruleFunctionAttributes=ruleFunctionAttributes();

            state._fsp--;

             current =iv_ruleFunctionAttributes.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionAttributes4947); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2075:1: ruleFunctionAttributes returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'address_safety' | kw= 'alignstack(<n>)' | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) ;
    public final AntlrDatatypeRuleToken ruleFunctionAttributes() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2078:28: ( (kw= 'address_safety' | kw= 'alignstack(<n>)' | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2079:1: (kw= 'address_safety' | kw= 'alignstack(<n>)' | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2079:1: (kw= 'address_safety' | kw= 'alignstack(<n>)' | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            int alt44=18;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt44=1;
                }
                break;
            case 95:
                {
                alt44=2;
                }
                break;
            case 96:
                {
                alt44=3;
                }
                break;
            case 97:
                {
                alt44=4;
                }
                break;
            case 98:
                {
                alt44=5;
                }
                break;
            case 99:
                {
                alt44=6;
                }
                break;
            case 100:
                {
                alt44=7;
                }
                break;
            case 101:
                {
                alt44=8;
                }
                break;
            case 102:
                {
                alt44=9;
                }
                break;
            case 103:
                {
                alt44=10;
                }
                break;
            case 104:
                {
                alt44=11;
                }
                break;
            case 105:
                {
                alt44=12;
                }
                break;
            case 106:
                {
                alt44=13;
                }
                break;
            case 107:
                {
                alt44=14;
                }
                break;
            case 108:
                {
                alt44=15;
                }
                break;
            case 109:
                {
                alt44=16;
                }
                break;
            case 110:
                {
                alt44=17;
                }
                break;
            case 111:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2080:2: kw= 'address_safety'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleFunctionAttributes4985); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getAddress_safetyKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2087:2: kw= 'alignstack(<n>)'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleFunctionAttributes5004); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getAlignstackNKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2094:2: kw= 'alwaysinline'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleFunctionAttributes5023); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getAlwaysinlineKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2101:2: kw= 'nonlazybind'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleFunctionAttributes5042); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNonlazybindKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2108:2: kw= 'inlinehint'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleFunctionAttributes5061); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getInlinehintKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2115:2: kw= 'naked'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleFunctionAttributes5080); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNakedKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2122:2: kw= 'noimplicitfloat'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleFunctionAttributes5099); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNoimplicitfloatKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2129:2: kw= 'noinline'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleFunctionAttributes5118); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNoinlineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2136:2: kw= 'noredzone'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleFunctionAttributes5137); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNoredzoneKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2143:2: kw= 'noreturn'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleFunctionAttributes5156); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNoreturnKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2150:2: kw= 'nounwind'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleFunctionAttributes5175); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getNounwindKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2157:2: kw= 'optsize'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleFunctionAttributes5194); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getOptsizeKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2164:2: kw= 'readnone'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleFunctionAttributes5213); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getReadnoneKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2171:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleFunctionAttributes5232); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getReadonlyKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2178:2: kw= 'returns_twice'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleFunctionAttributes5251); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getReturns_twiceKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2185:2: kw= 'ssp'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleFunctionAttributes5270); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getSspKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2192:2: kw= 'sspreq'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleFunctionAttributes5289); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFunctionAttributesAccess().getSspreqKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2199:2: kw= 'uwtable'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleFunctionAttributes5308); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2212:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2213:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2214:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList5348);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList5358); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2221:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2224:28: ( ( () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2225:1: ( () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2225:1: ( () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2225:2: () otherlv_1= '(' (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2225:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2226:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterListAccess().getParameterListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleParameterList5404); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2235:1: (otherlv_2= ')' | ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_VAR_TYPE||(LA46_0>=14 && LA46_0<=26)||LA46_0==31||LA46_0==34) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2235:3: otherlv_2= ')'
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_30_in_ruleParameterList5417); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_2_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2240:6: ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2240:6: ( ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2240:7: ( (lv_params_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )* otherlv_6= ')'
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2240:7: ( (lv_params_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2241:1: (lv_params_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2241:1: (lv_params_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2242:3: lv_params_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsTypeAndValueParserRuleCall_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleParameterList5445);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2258:2: (otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==33) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2258:4: otherlv_4= ',' ( (lv_params_5_0= ruleTypeAndValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleParameterList5458); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_1_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2262:1: ( (lv_params_5_0= ruleTypeAndValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2263:1: (lv_params_5_0= ruleTypeAndValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2263:1: (lv_params_5_0= ruleTypeAndValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2264:3: lv_params_5_0= ruleTypeAndValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsTypeAndValueParserRuleCall_2_1_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleParameterList5479);
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

                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleParameterList5493); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2292:1: entryRulePHI returns [EObject current=null] : iv_rulePHI= rulePHI EOF ;
    public final EObject entryRulePHI() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePHI = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2293:2: (iv_rulePHI= rulePHI EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2294:2: iv_rulePHI= rulePHI EOF
            {
             newCompositeNode(grammarAccess.getPHIRule()); 
            pushFollow(FOLLOW_rulePHI_in_entryRulePHI5531);
            iv_rulePHI=rulePHI();

            state._fsp--;

             current =iv_rulePHI; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePHI5541); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2301:1: rulePHI returns [EObject current=null] : (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2304:28: ( (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2305:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2305:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2305:3: otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            {
            otherlv_0=(Token)match(input,112,FOLLOW_112_in_rulePHI5578); 

                	newLeafNode(otherlv_0, grammarAccess.getPHIAccess().getPhiKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPHIAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_rulePHI5594);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,113,FOLLOW_113_in_rulePHI5605); 

                	newLeafNode(otherlv_2, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2321:1: ( (lv_values_3_0= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2322:1: (lv_values_3_0= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2322:1: (lv_values_3_0= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2323:3: lv_values_3_0= ruleValuePair
            {
             
            	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValuePair_in_rulePHI5626);
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

            otherlv_4=(Token)match(input,114,FOLLOW_114_in_rulePHI5638); 

                	newLeafNode(otherlv_4, grammarAccess.getPHIAccess().getRightSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2343:1: (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==33) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2343:3: otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']'
            	    {
            	    otherlv_5=(Token)match(input,33,FOLLOW_33_in_rulePHI5651); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPHIAccess().getCommaKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,113,FOLLOW_113_in_rulePHI5663); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_5_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2351:1: ( (lv_values_7_0= ruleValuePair ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2352:1: (lv_values_7_0= ruleValuePair )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2352:1: (lv_values_7_0= ruleValuePair )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2353:3: lv_values_7_0= ruleValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValuePair_in_rulePHI5684);
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

            	    otherlv_8=(Token)match(input,114,FOLLOW_114_in_rulePHI5696); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2381:1: entryRuleValuePair returns [EObject current=null] : iv_ruleValuePair= ruleValuePair EOF ;
    public final EObject entryRuleValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuePair = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2382:2: (iv_ruleValuePair= ruleValuePair EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2383:2: iv_ruleValuePair= ruleValuePair EOF
            {
             newCompositeNode(grammarAccess.getValuePairRule()); 
            pushFollow(FOLLOW_ruleValuePair_in_entryRuleValuePair5734);
            iv_ruleValuePair=ruleValuePair();

            state._fsp--;

             current =iv_ruleValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuePair5744); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2390:1: ruleValuePair returns [EObject current=null] : ( (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) ) ) ;
    public final EObject ruleValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value1_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_value2_4_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2393:28: ( ( (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2394:1: ( (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2394:1: ( (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2394:2: (otherlv_0= '%' )? ( (lv_value1_1_0= RULE_ID ) ) otherlv_2= ',' (otherlv_3= '%' )? ( (lv_value2_4_0= RULE_ID ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2394:2: (otherlv_0= '%' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==115) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2394:4: otherlv_0= '%'
                    {
                    otherlv_0=(Token)match(input,115,FOLLOW_115_in_ruleValuePair5782); 

                        	newLeafNode(otherlv_0, grammarAccess.getValuePairAccess().getPercentSignKeyword_0());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2398:3: ( (lv_value1_1_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2399:1: (lv_value1_1_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2399:1: (lv_value1_1_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2400:3: lv_value1_1_0= RULE_ID
            {
            lv_value1_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuePair5801); 

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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleValuePair5818); 

                	newLeafNode(otherlv_2, grammarAccess.getValuePairAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2420:1: (otherlv_3= '%' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==115) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2420:3: otherlv_3= '%'
                    {
                    otherlv_3=(Token)match(input,115,FOLLOW_115_in_ruleValuePair5831); 

                        	newLeafNode(otherlv_3, grammarAccess.getValuePairAccess().getPercentSignKeyword_3());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2424:3: ( (lv_value2_4_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2425:1: (lv_value2_4_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2425:1: (lv_value2_4_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2426:3: lv_value2_4_0= RULE_ID
            {
            lv_value2_4_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleValuePair5850); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2450:1: entryRuleLandingPad returns [EObject current=null] : iv_ruleLandingPad= ruleLandingPad EOF ;
    public final EObject entryRuleLandingPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingPad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2451:2: (iv_ruleLandingPad= ruleLandingPad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2452:2: iv_ruleLandingPad= ruleLandingPad EOF
            {
             newCompositeNode(grammarAccess.getLandingPadRule()); 
            pushFollow(FOLLOW_ruleLandingPad_in_entryRuleLandingPad5891);
            iv_ruleLandingPad=ruleLandingPad();

            state._fsp--;

             current =iv_ruleLandingPad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLandingPad5901); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2459:1: ruleLandingPad returns [EObject current=null] : (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2462:28: ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2463:1: (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2463:1: (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2463:3: otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ )
            {
            otherlv_0=(Token)match(input,116,FOLLOW_116_in_ruleLandingPad5938); 

                	newLeafNode(otherlv_0, grammarAccess.getLandingPadAccess().getLandingpadKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2467:1: ( (lv_type_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2468:1: (lv_type_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2468:1: (lv_type_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2469:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLandingPad5959);
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

            otherlv_2=(Token)match(input,117,FOLLOW_117_in_ruleLandingPad5971); 

                	newLeafNode(otherlv_2, grammarAccess.getLandingPadAccess().getPersonalityKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2489:1: ( (lv_personality_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2490:1: (lv_personality_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2490:1: (lv_personality_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2491:3: lv_personality_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLandingPad5992);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2507:2: ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==118) ) {
                alt52=1;
            }
            else if ( ((LA52_0>=119 && LA52_0<=120)) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2507:3: (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2507:3: (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2507:5: otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )*
                    {
                    otherlv_4=(Token)match(input,118,FOLLOW_118_in_ruleLandingPad6006); 

                        	newLeafNode(otherlv_4, grammarAccess.getLandingPadAccess().getCleanupKeyword_4_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2511:1: ( (lv_clause_5_0= ruleClause ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=119 && LA50_0<=120)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2512:1: (lv_clause_5_0= ruleClause )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2512:1: (lv_clause_5_0= ruleClause )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2513:3: lv_clause_5_0= ruleClause
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_4_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad6027);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2530:6: ( (lv_clause_6_0= ruleClause ) )+
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2530:6: ( (lv_clause_6_0= ruleClause ) )+
                    int cnt51=0;
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( ((LA51_0>=119 && LA51_0<=120)) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2531:1: (lv_clause_6_0= ruleClause )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2531:1: (lv_clause_6_0= ruleClause )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2532:3: lv_clause_6_0= ruleClause
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad6056);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2556:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2557:2: (iv_ruleClause= ruleClause EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2558:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause6094);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause6104); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2565:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | ( () otherlv_3= 'filter' ) | (otherlv_4= 'filter' ( (lv_filter_5_0= ruleTypeAndValue ) ) (otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) ) )* ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_TypeAndValue_1 = null;

        EObject lv_filter_5_0 = null;

        EObject lv_filter_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2568:28: ( ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | ( () otherlv_3= 'filter' ) | (otherlv_4= 'filter' ( (lv_filter_5_0= ruleTypeAndValue ) ) (otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) ) )* ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2569:1: ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | ( () otherlv_3= 'filter' ) | (otherlv_4= 'filter' ( (lv_filter_5_0= ruleTypeAndValue ) ) (otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) ) )* ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2569:1: ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | ( () otherlv_3= 'filter' ) | (otherlv_4= 'filter' ( (lv_filter_5_0= ruleTypeAndValue ) ) (otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) ) )* ) )
            int alt54=3;
            alt54 = dfa54.predict(input);
            switch (alt54) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2569:2: (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2569:2: (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2569:4: otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue
                    {
                    otherlv_0=(Token)match(input,119,FOLLOW_119_in_ruleClause6142); 

                        	newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getCatchKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getClauseAccess().getTypeAndValueParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause6164);
                    this_TypeAndValue_1=ruleTypeAndValue();

                    state._fsp--;

                     
                            current = this_TypeAndValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2583:6: ( () otherlv_3= 'filter' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2583:6: ( () otherlv_3= 'filter' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2583:7: () otherlv_3= 'filter'
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2583:7: ()
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2584:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getClauseAccess().getClauseAction_1_0(),
                                current);
                        

                    }

                    otherlv_3=(Token)match(input,120,FOLLOW_120_in_ruleClause6192); 

                        	newLeafNode(otherlv_3, grammarAccess.getClauseAccess().getFilterKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2594:6: (otherlv_4= 'filter' ( (lv_filter_5_0= ruleTypeAndValue ) ) (otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2594:6: (otherlv_4= 'filter' ( (lv_filter_5_0= ruleTypeAndValue ) ) (otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2594:8: otherlv_4= 'filter' ( (lv_filter_5_0= ruleTypeAndValue ) ) (otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) ) )*
                    {
                    otherlv_4=(Token)match(input,120,FOLLOW_120_in_ruleClause6212); 

                        	newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getFilterKeyword_2_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2598:1: ( (lv_filter_5_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2599:1: (lv_filter_5_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2599:1: (lv_filter_5_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2600:3: lv_filter_5_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterTypeAndValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause6233);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2616:2: (otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==33) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2616:4: otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) )
                    	    {
                    	    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleClause6246); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getClauseAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2620:1: ( (lv_filter_7_0= ruleTypeAndValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2621:1: (lv_filter_7_0= ruleTypeAndValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2621:1: (lv_filter_7_0= ruleTypeAndValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2622:3: lv_filter_7_0= ruleTypeAndValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterTypeAndValueParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause6267);
                    	    lv_filter_7_0=ruleTypeAndValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"filter",
                    	            		lv_filter_7_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2646:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2647:2: (iv_ruleSelect= ruleSelect EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2648:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect6306);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect6316); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2655:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2658:28: ( (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2659:1: (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2659:1: (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2659:3: otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,121,FOLLOW_121_in_ruleSelect6353); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2663:1: ( (lv_condition_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2664:1: (lv_condition_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2664:1: (lv_condition_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2665:3: lv_condition_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getConditionTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect6374);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSelect6386); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2685:1: ( (lv_val1_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2686:1: (lv_val1_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2686:1: (lv_val1_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2687:3: lv_val1_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal1TypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect6407);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleSelect6419); 

                	newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2707:1: ( (lv_val2_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2708:1: (lv_val2_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2708:1: (lv_val2_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2709:3: lv_val2_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal2TypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect6440);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2733:1: entryRuleVA_Arg returns [EObject current=null] : iv_ruleVA_Arg= ruleVA_Arg EOF ;
    public final EObject entryRuleVA_Arg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVA_Arg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2734:2: (iv_ruleVA_Arg= ruleVA_Arg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2735:2: iv_ruleVA_Arg= ruleVA_Arg EOF
            {
             newCompositeNode(grammarAccess.getVA_ArgRule()); 
            pushFollow(FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg6476);
            iv_ruleVA_Arg=ruleVA_Arg();

            state._fsp--;

             current =iv_ruleVA_Arg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVA_Arg6486); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2742:1: ruleVA_Arg returns [EObject current=null] : (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) ) ;
    public final EObject ruleVA_Arg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;

        AntlrDatatypeRuleToken lv_argType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2745:28: ( (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2746:1: (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2746:1: (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2746:3: otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,122,FOLLOW_122_in_ruleVA_Arg6523); 

                	newLeafNode(otherlv_0, grammarAccess.getVA_ArgAccess().getVa_argKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2750:1: ( (lv_list_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2751:1: (lv_list_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2751:1: (lv_list_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2752:3: lv_list_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getListTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleVA_Arg6544);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleVA_Arg6556); 

                	newLeafNode(otherlv_2, grammarAccess.getVA_ArgAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2772:1: ( (lv_argType_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2773:1: (lv_argType_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2773:1: (lv_argType_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2774:3: lv_argType_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getArgTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVA_Arg6577);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2798:1: entryRuleExtractElement returns [EObject current=null] : iv_ruleExtractElement= ruleExtractElement EOF ;
    public final EObject entryRuleExtractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2799:2: (iv_ruleExtractElement= ruleExtractElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2800:2: iv_ruleExtractElement= ruleExtractElement EOF
            {
             newCompositeNode(grammarAccess.getExtractElementRule()); 
            pushFollow(FOLLOW_ruleExtractElement_in_entryRuleExtractElement6613);
            iv_ruleExtractElement=ruleExtractElement();

            state._fsp--;

             current =iv_ruleExtractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractElement6623); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2807:1: ruleExtractElement returns [EObject current=null] : (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) ) ;
    public final EObject ruleExtractElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_vector_1_0 = null;

        EObject lv_index_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2810:28: ( (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2811:1: (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2811:1: (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2811:3: otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,123,FOLLOW_123_in_ruleExtractElement6660); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractElementAccess().getExtractelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2815:1: ( (lv_vector_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2816:1: (lv_vector_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2816:1: (lv_vector_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2817:3: lv_vector_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getVectorTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractElement6681);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleExtractElement6693); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractElementAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2837:1: ( (lv_index_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2838:1: (lv_index_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2838:1: (lv_index_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2839:3: lv_index_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getIndexTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractElement6714);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2863:1: entryRuleInsertElement returns [EObject current=null] : iv_ruleInsertElement= ruleInsertElement EOF ;
    public final EObject entryRuleInsertElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2864:2: (iv_ruleInsertElement= ruleInsertElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2865:2: iv_ruleInsertElement= ruleInsertElement EOF
            {
             newCompositeNode(grammarAccess.getInsertElementRule()); 
            pushFollow(FOLLOW_ruleInsertElement_in_entryRuleInsertElement6750);
            iv_ruleInsertElement=ruleInsertElement();

            state._fsp--;

             current =iv_ruleInsertElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertElement6760); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2872:1: ruleInsertElement returns [EObject current=null] : (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2875:28: ( (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2876:1: (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2876:1: (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2876:3: otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,124,FOLLOW_124_in_ruleInsertElement6797); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertElementAccess().getInsertelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2880:1: ( (lv_vector_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2881:1: (lv_vector_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2881:1: (lv_vector_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2882:3: lv_vector_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getVectorTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement6818);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleInsertElement6830); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertElementAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2902:1: ( (lv_scalar_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2903:1: (lv_scalar_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2903:1: (lv_scalar_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2904:3: lv_scalar_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getScalarTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement6851);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleInsertElement6863); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertElementAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2924:1: ( (lv_index_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2925:1: (lv_index_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2925:1: (lv_index_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2926:3: lv_index_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getIndexTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement6884);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2950:1: entryRuleShuffleVector returns [EObject current=null] : iv_ruleShuffleVector= ruleShuffleVector EOF ;
    public final EObject entryRuleShuffleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2951:2: (iv_ruleShuffleVector= ruleShuffleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2952:2: iv_ruleShuffleVector= ruleShuffleVector EOF
            {
             newCompositeNode(grammarAccess.getShuffleVectorRule()); 
            pushFollow(FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector6920);
            iv_ruleShuffleVector=ruleShuffleVector();

            state._fsp--;

             current =iv_ruleShuffleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShuffleVector6930); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2959:1: ruleShuffleVector returns [EObject current=null] : (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2962:28: ( (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2963:1: (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2963:1: (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2963:3: otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,125,FOLLOW_125_in_ruleShuffleVector6967); 

                	newLeafNode(otherlv_0, grammarAccess.getShuffleVectorAccess().getShufflevectorKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2967:1: ( (lv_vector1_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2968:1: (lv_vector1_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2968:1: (lv_vector1_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2969:3: lv_vector1_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVector1TypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector6988);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleShuffleVector7000); 

                	newLeafNode(otherlv_2, grammarAccess.getShuffleVectorAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2989:1: ( (lv_vector2_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2990:1: (lv_vector2_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2990:1: (lv_vector2_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2991:3: lv_vector2_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVector2TypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector7021);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleShuffleVector7033); 

                	newLeafNode(otherlv_4, grammarAccess.getShuffleVectorAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3011:1: ( (lv_mask_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3012:1: (lv_mask_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3012:1: (lv_mask_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3013:3: lv_mask_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getMaskTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector7054);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3037:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3038:2: (iv_ruleCast= ruleCast EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3039:2: iv_ruleCast= ruleCast EOF
            {
             newCompositeNode(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast7090);
            iv_ruleCast=ruleCast();

            state._fsp--;

             current =iv_ruleCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast7100); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3046:1: ruleCast returns [EObject current=null] : ( ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_castto_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3049:28: ( ( ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3050:1: ( ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3050:1: ( ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3051:5: ruleCastType ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) )
            {
             
                    newCompositeNode(grammarAccess.getCastAccess().getCastTypeParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCastType_in_ruleCast7141);
            ruleCastType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3058:1: ( (lv_value_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3059:1: (lv_value_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3059:1: (lv_value_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3060:3: lv_value_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getValueTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCast7161);
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

            otherlv_2=(Token)match(input,126,FOLLOW_126_in_ruleCast7173); 

                	newLeafNode(otherlv_2, grammarAccess.getCastAccess().getToKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3080:1: ( (lv_castto_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3081:1: (lv_castto_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3081:1: (lv_castto_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3082:3: lv_castto_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getCasttoTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCast7194);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3106:1: entryRuleCastType returns [String current=null] : iv_ruleCastType= ruleCastType EOF ;
    public final String entryRuleCastType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCastType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3107:2: (iv_ruleCastType= ruleCastType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3108:2: iv_ruleCastType= ruleCastType EOF
            {
             newCompositeNode(grammarAccess.getCastTypeRule()); 
            pushFollow(FOLLOW_ruleCastType_in_entryRuleCastType7231);
            iv_ruleCastType=ruleCastType();

            state._fsp--;

             current =iv_ruleCastType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCastType7242); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3115:1: ruleCastType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) ;
    public final AntlrDatatypeRuleToken ruleCastType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3118:28: ( (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3119:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3119:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            int alt55=12;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt55=1;
                }
                break;
            case 128:
                {
                alt55=2;
                }
                break;
            case 129:
                {
                alt55=3;
                }
                break;
            case 130:
                {
                alt55=4;
                }
                break;
            case 131:
                {
                alt55=5;
                }
                break;
            case 132:
                {
                alt55=6;
                }
                break;
            case 133:
                {
                alt55=7;
                }
                break;
            case 134:
                {
                alt55=8;
                }
                break;
            case 135:
                {
                alt55=9;
                }
                break;
            case 136:
                {
                alt55=10;
                }
                break;
            case 137:
                {
                alt55=11;
                }
                break;
            case 138:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3120:2: kw= 'trunc'
                    {
                    kw=(Token)match(input,127,FOLLOW_127_in_ruleCastType7280); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getTruncKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3127:2: kw= 'zext'
                    {
                    kw=(Token)match(input,128,FOLLOW_128_in_ruleCastType7299); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getZextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3134:2: kw= 'sext'
                    {
                    kw=(Token)match(input,129,FOLLOW_129_in_ruleCastType7318); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getSextKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3141:2: kw= 'fptrunc'
                    {
                    kw=(Token)match(input,130,FOLLOW_130_in_ruleCastType7337); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getFptruncKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3148:2: kw= 'fpext'
                    {
                    kw=(Token)match(input,131,FOLLOW_131_in_ruleCastType7356); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getFpextKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3155:2: kw= 'fptoui'
                    {
                    kw=(Token)match(input,132,FOLLOW_132_in_ruleCastType7375); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getFptouiKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3162:2: kw= 'fptosi'
                    {
                    kw=(Token)match(input,133,FOLLOW_133_in_ruleCastType7394); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getFptosiKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3169:2: kw= 'uitofp'
                    {
                    kw=(Token)match(input,134,FOLLOW_134_in_ruleCastType7413); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getUitofpKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3176:2: kw= 'sitofp'
                    {
                    kw=(Token)match(input,135,FOLLOW_135_in_ruleCastType7432); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getSitofpKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3183:2: kw= 'ptrtoint'
                    {
                    kw=(Token)match(input,136,FOLLOW_136_in_ruleCastType7451); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getPtrtointKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3190:2: kw= 'inttoptr'
                    {
                    kw=(Token)match(input,137,FOLLOW_137_in_ruleCastType7470); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCastTypeAccess().getInttoptrKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3197:2: kw= 'bitcast'
                    {
                    kw=(Token)match(input,138,FOLLOW_138_in_ruleCastType7489); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3210:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3211:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3212:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare7529);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare7539); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3219:1: ruleCompare returns [EObject current=null] : ( (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_ValuePair_3 = null;

        EObject this_ValuePair_7 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3222:28: ( ( (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3223:1: ( (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3223:1: ( (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==139) ) {
                alt56=1;
            }
            else if ( (LA56_0==140) ) {
                alt56=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3223:2: (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3223:2: (otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3223:4: otherlv_0= 'icmp' ruleIPredicates ruleType this_ValuePair_3= ruleValuePair
                    {
                    otherlv_0=(Token)match(input,139,FOLLOW_139_in_ruleCompare7577); 

                        	newLeafNode(otherlv_0, grammarAccess.getCompareAccess().getIcmpKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getIPredicatesParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleIPredicates_in_ruleCompare7593);
                    ruleIPredicates();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getTypeParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCompare7608);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getValuePairParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleValuePair_in_ruleCompare7629);
                    this_ValuePair_3=ruleValuePair();

                    state._fsp--;

                     
                            current = this_ValuePair_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3253:6: (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3253:6: (otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3253:8: otherlv_4= 'fcmp' ruleFPredicates ruleType this_ValuePair_7= ruleValuePair
                    {
                    otherlv_4=(Token)match(input,140,FOLLOW_140_in_ruleCompare7648); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getFcmpKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getFPredicatesParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleFPredicates_in_ruleCompare7664);
                    ruleFPredicates();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getTypeParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCompare7679);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getValuePairParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleValuePair_in_ruleCompare7700);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3290:1: entryRuleIPredicates returns [String current=null] : iv_ruleIPredicates= ruleIPredicates EOF ;
    public final String entryRuleIPredicates() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIPredicates = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3291:2: (iv_ruleIPredicates= ruleIPredicates EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3292:2: iv_ruleIPredicates= ruleIPredicates EOF
            {
             newCompositeNode(grammarAccess.getIPredicatesRule()); 
            pushFollow(FOLLOW_ruleIPredicates_in_entryRuleIPredicates7737);
            iv_ruleIPredicates=ruleIPredicates();

            state._fsp--;

             current =iv_ruleIPredicates.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIPredicates7748); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3299:1: ruleIPredicates returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) ;
    public final AntlrDatatypeRuleToken ruleIPredicates() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3302:28: ( (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3303:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3303:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            int alt57=10;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt57=1;
                }
                break;
            case 142:
                {
                alt57=2;
                }
                break;
            case 143:
                {
                alt57=3;
                }
                break;
            case 144:
                {
                alt57=4;
                }
                break;
            case 145:
                {
                alt57=5;
                }
                break;
            case 146:
                {
                alt57=6;
                }
                break;
            case 147:
                {
                alt57=7;
                }
                break;
            case 148:
                {
                alt57=8;
                }
                break;
            case 149:
                {
                alt57=9;
                }
                break;
            case 150:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3304:2: kw= 'eq'
                    {
                    kw=(Token)match(input,141,FOLLOW_141_in_ruleIPredicates7786); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getEqKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3311:2: kw= 'ne'
                    {
                    kw=(Token)match(input,142,FOLLOW_142_in_ruleIPredicates7805); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getNeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3318:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,143,FOLLOW_143_in_ruleIPredicates7824); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getUgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3325:2: kw= 'uge'
                    {
                    kw=(Token)match(input,144,FOLLOW_144_in_ruleIPredicates7843); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getUgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3332:2: kw= 'ult'
                    {
                    kw=(Token)match(input,145,FOLLOW_145_in_ruleIPredicates7862); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getUltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3339:2: kw= 'ule'
                    {
                    kw=(Token)match(input,146,FOLLOW_146_in_ruleIPredicates7881); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getUleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3346:2: kw= 'sgt'
                    {
                    kw=(Token)match(input,147,FOLLOW_147_in_ruleIPredicates7900); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getSgtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3353:2: kw= 'sge'
                    {
                    kw=(Token)match(input,148,FOLLOW_148_in_ruleIPredicates7919); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getSgeKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3360:2: kw= 'slt'
                    {
                    kw=(Token)match(input,149,FOLLOW_149_in_ruleIPredicates7938); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIPredicatesAccess().getSltKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3367:2: kw= 'sle'
                    {
                    kw=(Token)match(input,150,FOLLOW_150_in_ruleIPredicates7957); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3380:1: entryRuleFPredicates returns [String current=null] : iv_ruleFPredicates= ruleFPredicates EOF ;
    public final String entryRuleFPredicates() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFPredicates = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3381:2: (iv_ruleFPredicates= ruleFPredicates EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3382:2: iv_ruleFPredicates= ruleFPredicates EOF
            {
             newCompositeNode(grammarAccess.getFPredicatesRule()); 
            pushFollow(FOLLOW_ruleFPredicates_in_entryRuleFPredicates7998);
            iv_ruleFPredicates=ruleFPredicates();

            state._fsp--;

             current =iv_ruleFPredicates.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFPredicates8009); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3389:1: ruleFPredicates returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleFPredicates() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3392:28: ( (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3393:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3393:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            int alt58=16;
            switch ( input.LA(1) ) {
            case 151:
                {
                alt58=1;
                }
                break;
            case 152:
                {
                alt58=2;
                }
                break;
            case 153:
                {
                alt58=3;
                }
                break;
            case 154:
                {
                alt58=4;
                }
                break;
            case 155:
                {
                alt58=5;
                }
                break;
            case 156:
                {
                alt58=6;
                }
                break;
            case 157:
                {
                alt58=7;
                }
                break;
            case 158:
                {
                alt58=8;
                }
                break;
            case 159:
                {
                alt58=9;
                }
                break;
            case 143:
                {
                alt58=10;
                }
                break;
            case 144:
                {
                alt58=11;
                }
                break;
            case 145:
                {
                alt58=12;
                }
                break;
            case 146:
                {
                alt58=13;
                }
                break;
            case 160:
                {
                alt58=14;
                }
                break;
            case 161:
                {
                alt58=15;
                }
                break;
            case 162:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3394:2: kw= 'false'
                    {
                    kw=(Token)match(input,151,FOLLOW_151_in_ruleFPredicates8047); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getFalseKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3401:2: kw= 'oeq'
                    {
                    kw=(Token)match(input,152,FOLLOW_152_in_ruleFPredicates8066); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOeqKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3408:2: kw= 'ogt'
                    {
                    kw=(Token)match(input,153,FOLLOW_153_in_ruleFPredicates8085); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3415:2: kw= 'oge'
                    {
                    kw=(Token)match(input,154,FOLLOW_154_in_ruleFPredicates8104); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3422:2: kw= 'olt'
                    {
                    kw=(Token)match(input,155,FOLLOW_155_in_ruleFPredicates8123); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3429:2: kw= 'ole'
                    {
                    kw=(Token)match(input,156,FOLLOW_156_in_ruleFPredicates8142); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3436:2: kw= 'one'
                    {
                    kw=(Token)match(input,157,FOLLOW_157_in_ruleFPredicates8161); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOneKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3443:2: kw= 'ord'
                    {
                    kw=(Token)match(input,158,FOLLOW_158_in_ruleFPredicates8180); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getOrdKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3450:2: kw= 'ueq'
                    {
                    kw=(Token)match(input,159,FOLLOW_159_in_ruleFPredicates8199); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUeqKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3457:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,143,FOLLOW_143_in_ruleFPredicates8218); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUgtKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3464:2: kw= 'uge'
                    {
                    kw=(Token)match(input,144,FOLLOW_144_in_ruleFPredicates8237); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUgeKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3471:2: kw= 'ult'
                    {
                    kw=(Token)match(input,145,FOLLOW_145_in_ruleFPredicates8256); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUltKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3478:2: kw= 'ule'
                    {
                    kw=(Token)match(input,146,FOLLOW_146_in_ruleFPredicates8275); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUleKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3485:2: kw= 'une'
                    {
                    kw=(Token)match(input,160,FOLLOW_160_in_ruleFPredicates8294); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUneKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3492:2: kw= 'uno'
                    {
                    kw=(Token)match(input,161,FOLLOW_161_in_ruleFPredicates8313); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFPredicatesAccess().getUnoKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3499:2: kw= 'true'
                    {
                    kw=(Token)match(input,162,FOLLOW_162_in_ruleFPredicates8332); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3512:1: entryRuleArithmeticOP returns [String current=null] : iv_ruleArithmeticOP= ruleArithmeticOP EOF ;
    public final String entryRuleArithmeticOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleArithmeticOP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3513:2: (iv_ruleArithmeticOP= ruleArithmeticOP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3514:2: iv_ruleArithmeticOP= ruleArithmeticOP EOF
            {
             newCompositeNode(grammarAccess.getArithmeticOPRule()); 
            pushFollow(FOLLOW_ruleArithmeticOP_in_entryRuleArithmeticOP8373);
            iv_ruleArithmeticOP=ruleArithmeticOP();

            state._fsp--;

             current =iv_ruleArithmeticOP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticOP8384); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3521:1: ruleArithmeticOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'add' | kw= 'fadd' | kw= 'sub' | kw= 'fsub' | kw= 'mul' | kw= 'fmul' | kw= 'udiv' | kw= 'sdiv' | kw= 'fdiv' | kw= 'urem' | kw= 'srem' | kw= 'frem' ) ;
    public final AntlrDatatypeRuleToken ruleArithmeticOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3524:28: ( (kw= 'add' | kw= 'fadd' | kw= 'sub' | kw= 'fsub' | kw= 'mul' | kw= 'fmul' | kw= 'udiv' | kw= 'sdiv' | kw= 'fdiv' | kw= 'urem' | kw= 'srem' | kw= 'frem' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3525:1: (kw= 'add' | kw= 'fadd' | kw= 'sub' | kw= 'fsub' | kw= 'mul' | kw= 'fmul' | kw= 'udiv' | kw= 'sdiv' | kw= 'fdiv' | kw= 'urem' | kw= 'srem' | kw= 'frem' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3525:1: (kw= 'add' | kw= 'fadd' | kw= 'sub' | kw= 'fsub' | kw= 'mul' | kw= 'fmul' | kw= 'udiv' | kw= 'sdiv' | kw= 'fdiv' | kw= 'urem' | kw= 'srem' | kw= 'frem' )
            int alt59=12;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt59=1;
                }
                break;
            case 163:
                {
                alt59=2;
                }
                break;
            case 53:
                {
                alt59=3;
                }
                break;
            case 164:
                {
                alt59=4;
                }
                break;
            case 165:
                {
                alt59=5;
                }
                break;
            case 166:
                {
                alt59=6;
                }
                break;
            case 167:
                {
                alt59=7;
                }
                break;
            case 168:
                {
                alt59=8;
                }
                break;
            case 169:
                {
                alt59=9;
                }
                break;
            case 170:
                {
                alt59=10;
                }
                break;
            case 171:
                {
                alt59=11;
                }
                break;
            case 172:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3526:2: kw= 'add'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleArithmeticOP8422); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getAddKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3533:2: kw= 'fadd'
                    {
                    kw=(Token)match(input,163,FOLLOW_163_in_ruleArithmeticOP8441); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getFaddKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3540:2: kw= 'sub'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleArithmeticOP8460); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getSubKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3547:2: kw= 'fsub'
                    {
                    kw=(Token)match(input,164,FOLLOW_164_in_ruleArithmeticOP8479); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getFsubKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3554:2: kw= 'mul'
                    {
                    kw=(Token)match(input,165,FOLLOW_165_in_ruleArithmeticOP8498); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getMulKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3561:2: kw= 'fmul'
                    {
                    kw=(Token)match(input,166,FOLLOW_166_in_ruleArithmeticOP8517); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getFmulKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3568:2: kw= 'udiv'
                    {
                    kw=(Token)match(input,167,FOLLOW_167_in_ruleArithmeticOP8536); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getUdivKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3575:2: kw= 'sdiv'
                    {
                    kw=(Token)match(input,168,FOLLOW_168_in_ruleArithmeticOP8555); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getSdivKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3582:2: kw= 'fdiv'
                    {
                    kw=(Token)match(input,169,FOLLOW_169_in_ruleArithmeticOP8574); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getFdivKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3589:2: kw= 'urem'
                    {
                    kw=(Token)match(input,170,FOLLOW_170_in_ruleArithmeticOP8593); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getUremKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3596:2: kw= 'srem'
                    {
                    kw=(Token)match(input,171,FOLLOW_171_in_ruleArithmeticOP8612); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getArithmeticOPAccess().getSremKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3603:2: kw= 'frem'
                    {
                    kw=(Token)match(input,172,FOLLOW_172_in_ruleArithmeticOP8631); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3616:1: entryRuleLogicalOP returns [String current=null] : iv_ruleLogicalOP= ruleLogicalOP EOF ;
    public final String entryRuleLogicalOP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLogicalOP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3617:2: (iv_ruleLogicalOP= ruleLogicalOP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3618:2: iv_ruleLogicalOP= ruleLogicalOP EOF
            {
             newCompositeNode(grammarAccess.getLogicalOPRule()); 
            pushFollow(FOLLOW_ruleLogicalOP_in_entryRuleLogicalOP8672);
            iv_ruleLogicalOP=ruleLogicalOP();

            state._fsp--;

             current =iv_ruleLogicalOP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicalOP8683); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3625:1: ruleLogicalOP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'shl' | kw= 'lshr' | kw= 'ashr' | kw= 'and' | kw= 'or' | kw= 'xor' ) ;
    public final AntlrDatatypeRuleToken ruleLogicalOP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3628:28: ( (kw= 'shl' | kw= 'lshr' | kw= 'ashr' | kw= 'and' | kw= 'or' | kw= 'xor' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3629:1: (kw= 'shl' | kw= 'lshr' | kw= 'ashr' | kw= 'and' | kw= 'or' | kw= 'xor' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3629:1: (kw= 'shl' | kw= 'lshr' | kw= 'ashr' | kw= 'and' | kw= 'or' | kw= 'xor' )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 173:
                {
                alt60=1;
                }
                break;
            case 174:
                {
                alt60=2;
                }
                break;
            case 175:
                {
                alt60=3;
                }
                break;
            case 54:
                {
                alt60=4;
                }
                break;
            case 56:
                {
                alt60=5;
                }
                break;
            case 57:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3630:2: kw= 'shl'
                    {
                    kw=(Token)match(input,173,FOLLOW_173_in_ruleLogicalOP8721); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getShlKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3637:2: kw= 'lshr'
                    {
                    kw=(Token)match(input,174,FOLLOW_174_in_ruleLogicalOP8740); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getLshrKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3644:2: kw= 'ashr'
                    {
                    kw=(Token)match(input,175,FOLLOW_175_in_ruleLogicalOP8759); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getAshrKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3651:2: kw= 'and'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleLogicalOP8778); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getAndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3658:2: kw= 'or'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleLogicalOP8797); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogicalOPAccess().getOrKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3665:2: kw= 'xor'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleLogicalOP8816); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3678:1: entryRuleArithmetic returns [EObject current=null] : iv_ruleArithmetic= ruleArithmetic EOF ;
    public final EObject entryRuleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmetic = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3679:2: (iv_ruleArithmetic= ruleArithmetic EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3680:2: iv_ruleArithmetic= ruleArithmetic EOF
            {
             newCompositeNode(grammarAccess.getArithmeticRule()); 
            pushFollow(FOLLOW_ruleArithmetic_in_entryRuleArithmetic8856);
            iv_ruleArithmetic=ruleArithmetic();

            state._fsp--;

             current =iv_ruleArithmetic; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmetic8866); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3687:1: ruleArithmetic returns [EObject current=null] : ( ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair ) ;
    public final EObject ruleArithmetic() throws RecognitionException {
        EObject current = null;

        EObject this_ValuePair_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3690:28: ( ( ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3691:1: ( ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3691:1: ( ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3692:5: ruleArithmeticOP ruleType this_ValuePair_2= ruleValuePair
            {
             
                    newCompositeNode(grammarAccess.getArithmeticAccess().getArithmeticOPParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleArithmeticOP_in_ruleArithmetic8907);
            ruleArithmeticOP();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getArithmeticAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleArithmetic8922);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getArithmeticAccess().getValuePairParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleValuePair_in_ruleArithmetic8943);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3724:1: entryRuleLogical returns [EObject current=null] : iv_ruleLogical= ruleLogical EOF ;
    public final EObject entryRuleLogical() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogical = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3725:2: (iv_ruleLogical= ruleLogical EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3726:2: iv_ruleLogical= ruleLogical EOF
            {
             newCompositeNode(grammarAccess.getLogicalRule()); 
            pushFollow(FOLLOW_ruleLogical_in_entryRuleLogical8978);
            iv_ruleLogical=ruleLogical();

            state._fsp--;

             current =iv_ruleLogical; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogical8988); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3733:1: ruleLogical returns [EObject current=null] : ( ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair ) ;
    public final EObject ruleLogical() throws RecognitionException {
        EObject current = null;

        EObject this_ValuePair_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3736:28: ( ( ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3737:1: ( ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3737:1: ( ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3738:5: ruleLogicalOP ruleType this_ValuePair_2= ruleValuePair
            {
             
                    newCompositeNode(grammarAccess.getLogicalAccess().getLogicalOPParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleLogicalOP_in_ruleLogical9029);
            ruleLogicalOP();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getLogicalAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleLogical9044);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getLogicalAccess().getValuePairParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleValuePair_in_ruleLogical9065);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3770:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3771:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3772:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction9100);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction9110); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3779:1: ruleInstruction returns [EObject current=null] : (this_Switch_0= ruleSwitch | this_IndirectBranch_1= ruleIndirectBranch | this_Branch_2= ruleBranch | this_Return_3= ruleReturn | this_Load_4= ruleLoad | this_Store_5= ruleStore | this_Fence_6= ruleFence | this_GetElementPtr_7= ruleGetElementPtr | this_Logical_8= ruleLogical | this_Arithmetic_9= ruleArithmetic | this_Compare_10= ruleCompare | this_Cast_11= ruleCast | this_ShuffleVector_12= ruleShuffleVector | this_InsertElement_13= ruleInsertElement | this_ExtractElement_14= ruleExtractElement | this_Invoke_15= ruleInvoke | this_Resume_16= ruleResume | this_InsertValue_17= ruleInsertValue | this_ExtractValue_18= ruleExtractValue | this_Alloc_19= ruleAlloc | this_CmpXchg_20= ruleCmpXchg | this_AtomicRMW_21= ruleAtomicRMW | this_PHI_22= rulePHI | this_Select_23= ruleSelect | this_Call_24= ruleCall | this_VA_Arg_25= ruleVA_Arg | this_LandingPad_26= ruleLandingPad ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3782:28: ( (this_Switch_0= ruleSwitch | this_IndirectBranch_1= ruleIndirectBranch | this_Branch_2= ruleBranch | this_Return_3= ruleReturn | this_Load_4= ruleLoad | this_Store_5= ruleStore | this_Fence_6= ruleFence | this_GetElementPtr_7= ruleGetElementPtr | this_Logical_8= ruleLogical | this_Arithmetic_9= ruleArithmetic | this_Compare_10= ruleCompare | this_Cast_11= ruleCast | this_ShuffleVector_12= ruleShuffleVector | this_InsertElement_13= ruleInsertElement | this_ExtractElement_14= ruleExtractElement | this_Invoke_15= ruleInvoke | this_Resume_16= ruleResume | this_InsertValue_17= ruleInsertValue | this_ExtractValue_18= ruleExtractValue | this_Alloc_19= ruleAlloc | this_CmpXchg_20= ruleCmpXchg | this_AtomicRMW_21= ruleAtomicRMW | this_PHI_22= rulePHI | this_Select_23= ruleSelect | this_Call_24= ruleCall | this_VA_Arg_25= ruleVA_Arg | this_LandingPad_26= ruleLandingPad ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3783:1: (this_Switch_0= ruleSwitch | this_IndirectBranch_1= ruleIndirectBranch | this_Branch_2= ruleBranch | this_Return_3= ruleReturn | this_Load_4= ruleLoad | this_Store_5= ruleStore | this_Fence_6= ruleFence | this_GetElementPtr_7= ruleGetElementPtr | this_Logical_8= ruleLogical | this_Arithmetic_9= ruleArithmetic | this_Compare_10= ruleCompare | this_Cast_11= ruleCast | this_ShuffleVector_12= ruleShuffleVector | this_InsertElement_13= ruleInsertElement | this_ExtractElement_14= ruleExtractElement | this_Invoke_15= ruleInvoke | this_Resume_16= ruleResume | this_InsertValue_17= ruleInsertValue | this_ExtractValue_18= ruleExtractValue | this_Alloc_19= ruleAlloc | this_CmpXchg_20= ruleCmpXchg | this_AtomicRMW_21= ruleAtomicRMW | this_PHI_22= rulePHI | this_Select_23= ruleSelect | this_Call_24= ruleCall | this_VA_Arg_25= ruleVA_Arg | this_LandingPad_26= ruleLandingPad )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3783:1: (this_Switch_0= ruleSwitch | this_IndirectBranch_1= ruleIndirectBranch | this_Branch_2= ruleBranch | this_Return_3= ruleReturn | this_Load_4= ruleLoad | this_Store_5= ruleStore | this_Fence_6= ruleFence | this_GetElementPtr_7= ruleGetElementPtr | this_Logical_8= ruleLogical | this_Arithmetic_9= ruleArithmetic | this_Compare_10= ruleCompare | this_Cast_11= ruleCast | this_ShuffleVector_12= ruleShuffleVector | this_InsertElement_13= ruleInsertElement | this_ExtractElement_14= ruleExtractElement | this_Invoke_15= ruleInvoke | this_Resume_16= ruleResume | this_InsertValue_17= ruleInsertValue | this_ExtractValue_18= ruleExtractValue | this_Alloc_19= ruleAlloc | this_CmpXchg_20= ruleCmpXchg | this_AtomicRMW_21= ruleAtomicRMW | this_PHI_22= rulePHI | this_Select_23= ruleSelect | this_Call_24= ruleCall | this_VA_Arg_25= ruleVA_Arg | this_LandingPad_26= ruleLandingPad )
            int alt61=27;
            switch ( input.LA(1) ) {
            case 177:
                {
                alt61=1;
                }
                break;
            case 176:
                {
                alt61=2;
                }
                break;
            case 183:
                {
                alt61=3;
                }
                break;
            case 181:
                {
                alt61=4;
                }
                break;
            case 62:
                {
                alt61=5;
                }
                break;
            case 67:
                {
                alt61=6;
                }
                break;
            case 40:
                {
                alt61=7;
                }
                break;
            case 36:
                {
                alt61=8;
                }
                break;
            case 54:
            case 56:
            case 57:
            case 173:
            case 174:
            case 175:
                {
                alt61=9;
                }
                break;
            case 52:
            case 53:
            case 163:
            case 164:
            case 165:
            case 166:
            case 167:
            case 168:
            case 169:
            case 170:
            case 171:
            case 172:
                {
                alt61=10;
                }
                break;
            case 139:
            case 140:
                {
                alt61=11;
                }
                break;
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
                {
                alt61=12;
                }
                break;
            case 125:
                {
                alt61=13;
                }
                break;
            case 124:
                {
                alt61=14;
                }
                break;
            case 123:
                {
                alt61=15;
                }
                break;
            case 178:
                {
                alt61=16;
                }
                break;
            case 180:
                {
                alt61=17;
                }
                break;
            case 39:
                {
                alt61=18;
                }
                break;
            case 38:
                {
                alt61=19;
                }
                break;
            case 78:
                {
                alt61=20;
                }
                break;
            case 48:
                {
                alt61=21;
                }
                break;
            case 50:
                {
                alt61=22;
                }
                break;
            case 112:
                {
                alt61=23;
                }
                break;
            case 121:
                {
                alt61=24;
                }
                break;
            case 68:
            case 69:
                {
                alt61=25;
                }
                break;
            case 122:
                {
                alt61=26;
                }
                break;
            case 116:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3784:5: this_Switch_0= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleInstruction9157);
                    this_Switch_0=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3794:5: this_IndirectBranch_1= ruleIndirectBranch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getIndirectBranchParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleIndirectBranch_in_ruleInstruction9184);
                    this_IndirectBranch_1=ruleIndirectBranch();

                    state._fsp--;

                     
                            current = this_IndirectBranch_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3804:5: this_Branch_2= ruleBranch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getBranchParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBranch_in_ruleInstruction9211);
                    this_Branch_2=ruleBranch();

                    state._fsp--;

                     
                            current = this_Branch_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3814:5: this_Return_3= ruleReturn
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getReturnParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleReturn_in_ruleInstruction9238);
                    this_Return_3=ruleReturn();

                    state._fsp--;

                     
                            current = this_Return_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3824:5: this_Load_4= ruleLoad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLoad_in_ruleInstruction9265);
                    this_Load_4=ruleLoad();

                    state._fsp--;

                     
                            current = this_Load_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3834:5: this_Store_5= ruleStore
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getStoreParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleStore_in_ruleInstruction9292);
                    this_Store_5=ruleStore();

                    state._fsp--;

                     
                            current = this_Store_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3844:5: this_Fence_6= ruleFence
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFenceParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFence_in_ruleInstruction9319);
                    this_Fence_6=ruleFence();

                    state._fsp--;

                     
                            current = this_Fence_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3854:5: this_GetElementPtr_7= ruleGetElementPtr
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGetElementPtrParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleGetElementPtr_in_ruleInstruction9346);
                    this_GetElementPtr_7=ruleGetElementPtr();

                    state._fsp--;

                     
                            current = this_GetElementPtr_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3864:5: this_Logical_8= ruleLogical
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLogicalParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleLogical_in_ruleInstruction9373);
                    this_Logical_8=ruleLogical();

                    state._fsp--;

                     
                            current = this_Logical_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3874:5: this_Arithmetic_9= ruleArithmetic
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getArithmeticParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleArithmetic_in_ruleInstruction9400);
                    this_Arithmetic_9=ruleArithmetic();

                    state._fsp--;

                     
                            current = this_Arithmetic_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3884:5: this_Compare_10= ruleCompare
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCompareParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleCompare_in_ruleInstruction9427);
                    this_Compare_10=ruleCompare();

                    state._fsp--;

                     
                            current = this_Compare_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3894:5: this_Cast_11= ruleCast
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCastParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleCast_in_ruleInstruction9454);
                    this_Cast_11=ruleCast();

                    state._fsp--;

                     
                            current = this_Cast_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3904:5: this_ShuffleVector_12= ruleShuffleVector
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getShuffleVectorParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleShuffleVector_in_ruleInstruction9481);
                    this_ShuffleVector_12=ruleShuffleVector();

                    state._fsp--;

                     
                            current = this_ShuffleVector_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3914:5: this_InsertElement_13= ruleInsertElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertElementParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleInsertElement_in_ruleInstruction9508);
                    this_InsertElement_13=ruleInsertElement();

                    state._fsp--;

                     
                            current = this_InsertElement_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3924:5: this_ExtractElement_14= ruleExtractElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractElementParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleExtractElement_in_ruleInstruction9535);
                    this_ExtractElement_14=ruleExtractElement();

                    state._fsp--;

                     
                            current = this_ExtractElement_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3934:5: this_Invoke_15= ruleInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInvokeParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleInvoke_in_ruleInstruction9562);
                    this_Invoke_15=ruleInvoke();

                    state._fsp--;

                     
                            current = this_Invoke_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3944:5: this_Resume_16= ruleResume
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getResumeParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleResume_in_ruleInstruction9589);
                    this_Resume_16=ruleResume();

                    state._fsp--;

                     
                            current = this_Resume_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3954:5: this_InsertValue_17= ruleInsertValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertValueParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleInsertValue_in_ruleInstruction9616);
                    this_InsertValue_17=ruleInsertValue();

                    state._fsp--;

                     
                            current = this_InsertValue_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3964:5: this_ExtractValue_18= ruleExtractValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractValueParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleExtractValue_in_ruleInstruction9643);
                    this_ExtractValue_18=ruleExtractValue();

                    state._fsp--;

                     
                            current = this_ExtractValue_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3974:5: this_Alloc_19= ruleAlloc
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAllocParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleAlloc_in_ruleInstruction9670);
                    this_Alloc_19=ruleAlloc();

                    state._fsp--;

                     
                            current = this_Alloc_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3984:5: this_CmpXchg_20= ruleCmpXchg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCmpXchgParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleCmpXchg_in_ruleInstruction9697);
                    this_CmpXchg_20=ruleCmpXchg();

                    state._fsp--;

                     
                            current = this_CmpXchg_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3994:5: this_AtomicRMW_21= ruleAtomicRMW
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAtomicRMWParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRMW_in_ruleInstruction9724);
                    this_AtomicRMW_21=ruleAtomicRMW();

                    state._fsp--;

                     
                            current = this_AtomicRMW_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4004:5: this_PHI_22= rulePHI
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPHIParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_rulePHI_in_ruleInstruction9751);
                    this_PHI_22=rulePHI();

                    state._fsp--;

                     
                            current = this_PHI_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4014:5: this_Select_23= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSelectParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleInstruction9778);
                    this_Select_23=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4024:5: this_Call_24= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleInstruction9805);
                    this_Call_24=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4034:5: this_VA_Arg_25= ruleVA_Arg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getVA_ArgParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleVA_Arg_in_ruleInstruction9832);
                    this_VA_Arg_25=ruleVA_Arg();

                    state._fsp--;

                     
                            current = this_VA_Arg_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4044:5: this_LandingPad_26= ruleLandingPad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLandingPadParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleLandingPad_in_ruleInstruction9859);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4060:1: entryRuleIndirectBranch returns [EObject current=null] : iv_ruleIndirectBranch= ruleIndirectBranch EOF ;
    public final EObject entryRuleIndirectBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4061:2: (iv_ruleIndirectBranch= ruleIndirectBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4062:2: iv_ruleIndirectBranch= ruleIndirectBranch EOF
            {
             newCompositeNode(grammarAccess.getIndirectBranchRule()); 
            pushFollow(FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch9894);
            iv_ruleIndirectBranch=ruleIndirectBranch();

            state._fsp--;

             current =iv_ruleIndirectBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndirectBranch9904); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4069:1: ruleIndirectBranch returns [EObject current=null] : (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4072:28: ( (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4073:1: (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4073:1: (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4073:3: otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,176,FOLLOW_176_in_ruleIndirectBranch9941); 

                	newLeafNode(otherlv_0, grammarAccess.getIndirectBranchAccess().getIndirectbrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4077:1: ( (lv_adress_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4078:1: (lv_adress_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4078:1: (lv_adress_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4079:3: lv_adress_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getAdressTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleIndirectBranch9962);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleIndirectBranch9974); 

                	newLeafNode(otherlv_2, grammarAccess.getIndirectBranchAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,113,FOLLOW_113_in_ruleIndirectBranch9986); 

                	newLeafNode(otherlv_3, grammarAccess.getIndirectBranchAccess().getLeftSquareBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4103:1: ( (lv_lList_4_0= ruleLabelList ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_VAR_TYPE||(LA62_0>=14 && LA62_0<=26)||LA62_0==31||LA62_0==34) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4104:1: (lv_lList_4_0= ruleLabelList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4104:1: (lv_lList_4_0= ruleLabelList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4105:3: lv_lList_4_0= ruleLabelList
                    {
                     
                    	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getLListLabelListParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelList_in_ruleIndirectBranch10007);
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

            otherlv_5=(Token)match(input,114,FOLLOW_114_in_ruleIndirectBranch10020); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4133:1: entryRuleLabelList returns [EObject current=null] : iv_ruleLabelList= ruleLabelList EOF ;
    public final EObject entryRuleLabelList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4134:2: (iv_ruleLabelList= ruleLabelList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4135:2: iv_ruleLabelList= ruleLabelList EOF
            {
             newCompositeNode(grammarAccess.getLabelListRule()); 
            pushFollow(FOLLOW_ruleLabelList_in_entryRuleLabelList10056);
            iv_ruleLabelList=ruleLabelList();

            state._fsp--;

             current =iv_ruleLabelList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelList10066); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4142:1: ruleLabelList returns [EObject current=null] : ( (lv_labels_0_0= ruleTypeAndValue ) )+ ;
    public final EObject ruleLabelList() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4145:28: ( ( (lv_labels_0_0= ruleTypeAndValue ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4146:1: ( (lv_labels_0_0= ruleTypeAndValue ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4146:1: ( (lv_labels_0_0= ruleTypeAndValue ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_VAR_TYPE||(LA63_0>=14 && LA63_0<=26)||LA63_0==31||LA63_0==34) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4147:1: (lv_labels_0_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4147:1: (lv_labels_0_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4148:3: lv_labels_0_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelListAccess().getLabelsTypeAndValueParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLabelList10111);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4172:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4173:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4174:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch10147);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch10157); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4181:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4184:28: ( (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4185:1: (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4185:1: (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4185:3: otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,177,FOLLOW_177_in_ruleSwitch10194); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4189:1: ( (lv_value_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4190:1: (lv_value_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4190:1: (lv_value_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4191:3: lv_value_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getValueTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSwitch10215);
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

            otherlv_2=(Token)match(input,33,FOLLOW_33_in_ruleSwitch10227); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4211:1: ( (lv_default_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4212:1: (lv_default_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4212:1: (lv_default_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4213:3: lv_default_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSwitch10248);
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

            otherlv_4=(Token)match(input,113,FOLLOW_113_in_ruleSwitch10260); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4233:1: ( (lv_jTable_5_0= ruleJumpTable ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_VAR_TYPE||(LA64_0>=14 && LA64_0<=26)||LA64_0==31||LA64_0==34) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4234:1: (lv_jTable_5_0= ruleJumpTable )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4234:1: (lv_jTable_5_0= ruleJumpTable )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4235:3: lv_jTable_5_0= ruleJumpTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getSwitchAccess().getJTableJumpTableParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJumpTable_in_ruleSwitch10281);
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

            otherlv_6=(Token)match(input,114,FOLLOW_114_in_ruleSwitch10294); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4263:1: entryRuleJumpTable returns [EObject current=null] : iv_ruleJumpTable= ruleJumpTable EOF ;
    public final EObject entryRuleJumpTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpTable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4264:2: (iv_ruleJumpTable= ruleJumpTable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4265:2: iv_ruleJumpTable= ruleJumpTable EOF
            {
             newCompositeNode(grammarAccess.getJumpTableRule()); 
            pushFollow(FOLLOW_ruleJumpTable_in_entryRuleJumpTable10330);
            iv_ruleJumpTable=ruleJumpTable();

            state._fsp--;

             current =iv_ruleJumpTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJumpTable10340); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4272:1: ruleJumpTable returns [EObject current=null] : ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+ ;
    public final EObject ruleJumpTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_destinations_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4275:28: ( ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4276:1: ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4276:1: ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+
            int cnt65=0;
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_VAR_TYPE||(LA65_0>=14 && LA65_0<=26)||LA65_0==31||LA65_0==34) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4276:2: ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4276:2: ( (lv_values_0_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4277:1: (lv_values_0_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4277:1: (lv_values_0_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4278:3: lv_values_0_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getValuesTypeAndValueParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleJumpTable10386);
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

            	    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleJumpTable10398); 

            	        	newLeafNode(otherlv_1, grammarAccess.getJumpTableAccess().getCommaKeyword_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4298:1: ( (lv_destinations_2_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4299:1: (lv_destinations_2_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4299:1: (lv_destinations_2_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4300:3: lv_destinations_2_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getDestinationsTypeAndValueParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleJumpTable10419);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4324:1: entryRuleInvoke returns [EObject current=null] : iv_ruleInvoke= ruleInvoke EOF ;
    public final EObject entryRuleInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoke = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4325:2: (iv_ruleInvoke= ruleInvoke EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4326:2: iv_ruleInvoke= ruleInvoke EOF
            {
             newCompositeNode(grammarAccess.getInvokeRule()); 
            pushFollow(FOLLOW_ruleInvoke_in_entryRuleInvoke10456);
            iv_ruleInvoke=ruleInvoke();

            state._fsp--;

             current =iv_ruleInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvoke10466); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4333:1: ruleInvoke returns [EObject current=null] : (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4336:28: ( (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4337:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4337:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4337:3: otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleReturnAttributes )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFunctionAttributes )? otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,178,FOLLOW_178_in_ruleInvoke10503); 

                	newLeafNode(otherlv_0, grammarAccess.getInvokeAccess().getInvokeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4341:1: ( ruleCallingConv )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_INT||(LA66_0>=79 && LA66_0<=93)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4342:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleInvoke10520);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4349:3: ( ruleReturnAttributes )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=70 && LA67_0<=77)) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4350:5: ruleReturnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getReturnAttributesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleReturnAttributes_in_ruleInvoke10538);
                    ruleReturnAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4357:3: ( (lv_function_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4358:1: (lv_function_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4358:1: (lv_function_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4359:3: lv_function_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getFunctionTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke10560);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4375:2: ( (lv_pList_4_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4376:1: (lv_pList_4_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4376:1: (lv_pList_4_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4377:3: lv_pList_4_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleInvoke10581);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4393:2: ( ruleFunctionAttributes )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( ((LA68_0>=94 && LA68_0<=111)) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4394:5: ruleFunctionAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getFunctionAttributesParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleFunctionAttributes_in_ruleInvoke10598);
                    ruleFunctionAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            otherlv_6=(Token)match(input,126,FOLLOW_126_in_ruleInvoke10611); 

                	newLeafNode(otherlv_6, grammarAccess.getInvokeAccess().getToKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4405:1: ( (lv_to_7_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4406:1: (lv_to_7_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4406:1: (lv_to_7_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4407:3: lv_to_7_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getToTypeAndValueParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke10632);
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

            otherlv_8=(Token)match(input,179,FOLLOW_179_in_ruleInvoke10644); 

                	newLeafNode(otherlv_8, grammarAccess.getInvokeAccess().getUnwindKeyword_8());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4427:1: ( (lv_unwind_9_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4428:1: (lv_unwind_9_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4428:1: (lv_unwind_9_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4429:3: lv_unwind_9_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getUnwindTypeAndValueParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke10665);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4453:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4454:2: (iv_ruleResume= ruleResume EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4455:2: iv_ruleResume= ruleResume EOF
            {
             newCompositeNode(grammarAccess.getResumeRule()); 
            pushFollow(FOLLOW_ruleResume_in_entryRuleResume10701);
            iv_ruleResume=ruleResume();

            state._fsp--;

             current =iv_ruleResume; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResume10711); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4462:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TypeAndValue_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4465:28: ( (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4466:1: (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4466:1: (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4466:3: otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue
            {
            otherlv_0=(Token)match(input,180,FOLLOW_180_in_ruleResume10748); 

                	newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getResumeAccess().getTypeAndValueParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleResume10770);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4487:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4488:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4489:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn10805);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn10815); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4496:1: ruleReturn returns [EObject current=null] : ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4499:28: ( ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4500:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4500:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==181) ) {
                int LA71_1 = input.LA(2);

                if ( (LA71_1==23) ) {
                    switch ( input.LA(3) ) {
                    case 27:
                    case 28:
                        {
                        alt71=2;
                        }
                        break;
                    case RULE_VAR_TYPE:
                        {
                        int LA71_4 = input.LA(4);

                        if ( (LA71_4==12) ) {
                            alt71=1;
                        }
                        else if ( (LA71_4==EOF||(LA71_4>=RULE_SL_COMMENT && LA71_4<=RULE_VAR_TYPE)||(LA71_4>=14 && LA71_4<=26)||LA71_4==31||(LA71_4>=33 && LA71_4<=34)||LA71_4==36||(LA71_4>=38 && LA71_4<=40)||LA71_4==48||LA71_4==50||(LA71_4>=52 && LA71_4<=54)||(LA71_4>=56 && LA71_4<=57)||LA71_4==62||(LA71_4>=67 && LA71_4<=69)||LA71_4==78||LA71_4==112||(LA71_4>=115 && LA71_4<=116)||(LA71_4>=121 && LA71_4<=125)||(LA71_4>=127 && LA71_4<=140)||(LA71_4>=163 && LA71_4<=178)||(LA71_4>=180 && LA71_4<=181)||LA71_4==183||(LA71_4>=185 && LA71_4<=186)||LA71_4==208||LA71_4==210||LA71_4==213) ) {
                            alt71=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 71, 4, input);

                            throw nvae;
                        }
                        }
                        break;
                    case EOF:
                    case RULE_SL_COMMENT:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 31:
                    case 33:
                    case 34:
                    case 36:
                    case 38:
                    case 39:
                    case 40:
                    case 48:
                    case 50:
                    case 52:
                    case 53:
                    case 54:
                    case 56:
                    case 57:
                    case 62:
                    case 67:
                    case 68:
                    case 69:
                    case 78:
                    case 112:
                    case 115:
                    case 116:
                    case 121:
                    case 122:
                    case 123:
                    case 124:
                    case 125:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                    case 131:
                    case 132:
                    case 133:
                    case 134:
                    case 135:
                    case 136:
                    case 137:
                    case 138:
                    case 139:
                    case 140:
                    case 163:
                    case 164:
                    case 165:
                    case 166:
                    case 167:
                    case 168:
                    case 169:
                    case 170:
                    case 171:
                    case 172:
                    case 173:
                    case 174:
                    case 175:
                    case 176:
                    case 177:
                    case 178:
                    case 180:
                    case 181:
                    case 183:
                    case 185:
                    case 186:
                    case 208:
                    case 210:
                    case 213:
                        {
                        alt71=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 71, 2, input);

                        throw nvae;
                    }

                }
                else if ( (LA71_1==RULE_VAR_TYPE||(LA71_1>=14 && LA71_1<=22)||(LA71_1>=24 && LA71_1<=26)||LA71_1==31||LA71_1==34) ) {
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4500:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4500:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4500:3: () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4500:3: ()
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4501:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getReturnAccess().getReturnAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,181,FOLLOW_181_in_ruleReturn10862); 

                        	newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getRetKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleReturn10874); 

                        	newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getVoidKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4514:1: (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==33) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4514:3: otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT
                            {
                            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleReturn10887); 

                                	newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getCommaKeyword_0_3_0());
                                
                            otherlv_4=(Token)match(input,182,FOLLOW_182_in_ruleReturn10899); 

                                	newLeafNode(otherlv_4, grammarAccess.getReturnAccess().getDbgKeyword_0_3_1());
                                
                            otherlv_5=(Token)match(input,64,FOLLOW_64_in_ruleReturn10911); 

                                	newLeafNode(otherlv_5, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_3_2());
                                
                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn10922); 
                             
                                newLeafNode(this_INT_6, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_3_3()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4531:6: (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4531:6: (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4531:8: otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )?
                    {
                    otherlv_7=(Token)match(input,181,FOLLOW_181_in_ruleReturn10943); 

                        	newLeafNode(otherlv_7, grammarAccess.getReturnAccess().getRetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4535:1: ( (lv_value_8_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4536:1: (lv_value_8_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4536:1: (lv_value_8_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4537:3: lv_value_8_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getReturnAccess().getValueTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleReturn10964);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4553:2: (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==33) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4553:4: otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT
                            {
                            otherlv_9=(Token)match(input,33,FOLLOW_33_in_ruleReturn10977); 

                                	newLeafNode(otherlv_9, grammarAccess.getReturnAccess().getCommaKeyword_1_2_0());
                                
                            otherlv_10=(Token)match(input,182,FOLLOW_182_in_ruleReturn10989); 

                                	newLeafNode(otherlv_10, grammarAccess.getReturnAccess().getDbgKeyword_1_2_1());
                                
                            otherlv_11=(Token)match(input,64,FOLLOW_64_in_ruleReturn11001); 

                                	newLeafNode(otherlv_11, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_2_2());
                                
                            this_INT_12=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn11012); 
                             
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4577:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4578:2: (iv_ruleBranch= ruleBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4579:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_ruleBranch_in_entryRuleBranch11050);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranch11060); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4586:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4589:28: ( ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4590:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4590:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )
            int alt72=2;
            alt72 = dfa72.predict(input);
            switch (alt72) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4590:2: (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4590:2: (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4590:4: otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) )
                    {
                    otherlv_0=(Token)match(input,183,FOLLOW_183_in_ruleBranch11098); 

                        	newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBrKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4594:1: ( (lv_destination_1_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4595:1: (lv_destination_1_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4595:1: (lv_destination_1_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4596:3: lv_destination_1_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getDestinationTypeAndValueParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch11119);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4613:6: (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4613:6: (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4613:8: otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) )
                    {
                    otherlv_2=(Token)match(input,183,FOLLOW_183_in_ruleBranch11139); 

                        	newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getBrKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4617:1: ( (lv_cond_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4618:1: (lv_cond_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4618:1: (lv_cond_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4619:3: lv_cond_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getCondTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch11160);
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

                    otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleBranch11172); 

                        	newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getCommaKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4639:1: ( (lv_labelTrue_5_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4640:1: (lv_labelTrue_5_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4640:1: (lv_labelTrue_5_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4641:3: lv_labelTrue_5_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelTrueTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch11193);
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

                    otherlv_6=(Token)match(input,33,FOLLOW_33_in_ruleBranch11205); 

                        	newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4661:1: ( (lv_labelFalse_7_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4662:1: (lv_labelFalse_7_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4662:1: (lv_labelFalse_7_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4663:3: lv_labelFalse_7_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelFalseTypeAndValueParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch11226);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4689:1: entryRuleBasicBlock returns [EObject current=null] : iv_ruleBasicBlock= ruleBasicBlock EOF ;
    public final EObject entryRuleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBlock = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4690:2: (iv_ruleBasicBlock= ruleBasicBlock EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4691:2: iv_ruleBasicBlock= ruleBasicBlock EOF
            {
             newCompositeNode(grammarAccess.getBasicBlockRule()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock11265);
            iv_ruleBasicBlock=ruleBasicBlock();

            state._fsp--;

             current =iv_ruleBasicBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicBlock11275); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4698:1: ruleBasicBlock returns [EObject current=null] : ( () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )* ) ;
    public final EObject ruleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_name_1_0 = null;

        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4701:28: ( ( () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4702:1: ( () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4702:1: ( () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4702:2: () ( (lv_name_1_0= ruleLabelStr ) )? ( (lv_instructions_2_0= ruleInstruction ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4702:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4703:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getBasicBlockAccess().getBasicBlockAction_0(),
                        current);
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4708:2: ( (lv_name_1_0= ruleLabelStr ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4709:1: (lv_name_1_0= ruleLabelStr )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4709:1: (lv_name_1_0= ruleLabelStr )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4710:3: lv_name_1_0= ruleLabelStr
                    {
                     
                    	        newCompositeNode(grammarAccess.getBasicBlockAccess().getNameLabelStrParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelStr_in_ruleBasicBlock11330);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4726:3: ( (lv_instructions_2_0= ruleInstruction ) )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==36||(LA74_0>=38 && LA74_0<=40)||LA74_0==48||LA74_0==50||(LA74_0>=52 && LA74_0<=54)||(LA74_0>=56 && LA74_0<=57)||LA74_0==62||(LA74_0>=67 && LA74_0<=69)||LA74_0==78||LA74_0==112||LA74_0==116||(LA74_0>=121 && LA74_0<=125)||(LA74_0>=127 && LA74_0<=140)||(LA74_0>=163 && LA74_0<=178)||(LA74_0>=180 && LA74_0<=181)||LA74_0==183) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4727:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4727:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4728:3: lv_instructions_2_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBasicBlockAccess().getInstructionsInstructionParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBasicBlock11352);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4752:1: entryRuleLabelStr returns [EObject current=null] : iv_ruleLabelStr= ruleLabelStr EOF ;
    public final EObject entryRuleLabelStr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelStr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4753:2: (iv_ruleLabelStr= ruleLabelStr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4754:2: iv_ruleLabelStr= ruleLabelStr EOF
            {
             newCompositeNode(grammarAccess.getLabelStrRule()); 
            pushFollow(FOLLOW_ruleLabelStr_in_entryRuleLabelStr11389);
            iv_ruleLabelStr=ruleLabelStr();

            state._fsp--;

             current =iv_ruleLabelStr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelStr11399); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4761:1: ruleLabelStr returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) ;
    public final EObject ruleLabelStr() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4764:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4765:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4765:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4765:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4765:2: ( (lv_name_0_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4766:1: (lv_name_0_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4766:1: (lv_name_0_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4767:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLabelStr11441); 

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

            otherlv_1=(Token)match(input,184,FOLLOW_184_in_ruleLabelStr11458); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4795:1: entryRuleFunctionHeader returns [EObject current=null] : iv_ruleFunctionHeader= ruleFunctionHeader EOF ;
    public final EObject entryRuleFunctionHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionHeader = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4796:2: (iv_ruleFunctionHeader= ruleFunctionHeader EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4797:2: iv_ruleFunctionHeader= ruleFunctionHeader EOF
            {
             newCompositeNode(grammarAccess.getFunctionHeaderRule()); 
            pushFollow(FOLLOW_ruleFunctionHeader_in_entryRuleFunctionHeader11494);
            iv_ruleFunctionHeader=ruleFunctionHeader();

            state._fsp--;

             current =iv_ruleFunctionHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionHeader11504); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4804:1: ruleFunctionHeader returns [EObject current=null] : ( (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )? ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4807:28: ( ( (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4808:1: ( (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4808:1: ( (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4808:2: (otherlv_0= 'declare' | otherlv_1= 'define' ) ( ruleLinkage )? ( ruleVisibility )? ( ruleCallingConv )? ( ruleReturnAttributes )? (this_UnNammedAddr_6= ruleUnNammedAddr )? ( (lv_returnType_7_0= ruleType ) ) ( (lv_name_8_0= ruleGlobalName ) ) ( (lv_pList_9_0= ruleParameterList ) ) ( ruleFunctionAttributes )? (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? ( ruleAlignment )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4808:2: (otherlv_0= 'declare' | otherlv_1= 'define' )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==185) ) {
                alt75=1;
            }
            else if ( (LA75_0==186) ) {
                alt75=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4808:4: otherlv_0= 'declare'
                    {
                    otherlv_0=(Token)match(input,185,FOLLOW_185_in_ruleFunctionHeader11542); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionHeaderAccess().getDeclareKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4813:7: otherlv_1= 'define'
                    {
                    otherlv_1=(Token)match(input,186,FOLLOW_186_in_ruleFunctionHeader11560); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionHeaderAccess().getDefineKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4817:2: ( ruleLinkage )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( ((LA76_0>=192 && LA76_0<=207)) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4818:5: ruleLinkage
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getLinkageParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLinkage_in_ruleFunctionHeader11578);
                    ruleLinkage();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4825:3: ( ruleVisibility )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( ((LA77_0>=189 && LA77_0<=191)) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4826:5: ruleVisibility
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getVisibilityParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVisibility_in_ruleFunctionHeader11596);
                    ruleVisibility();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4833:3: ( ruleCallingConv )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( ((LA78_0>=79 && LA78_0<=93)) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_INT) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4834:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionHeader11614);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4841:3: ( ruleReturnAttributes )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( ((LA79_0>=70 && LA79_0<=77)) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4842:5: ruleReturnAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getReturnAttributesParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleReturnAttributes_in_ruleFunctionHeader11632);
                    ruleReturnAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4849:3: (this_UnNammedAddr_6= ruleUnNammedAddr )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==RULE_INT) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4850:5: this_UnNammedAddr_6= ruleUnNammedAddr
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getUnNammedAddrParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleUnNammedAddr_in_ruleFunctionHeader11656);
                    this_UnNammedAddr_6=ruleUnNammedAddr();

                    state._fsp--;

                     
                            current = this_UnNammedAddr_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4858:3: ( (lv_returnType_7_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4859:1: (lv_returnType_7_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4859:1: (lv_returnType_7_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4860:3: lv_returnType_7_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getReturnTypeTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleFunctionHeader11678);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4876:2: ( (lv_name_8_0= ruleGlobalName ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4877:1: (lv_name_8_0= ruleGlobalName )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4877:1: (lv_name_8_0= ruleGlobalName )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4878:3: lv_name_8_0= ruleGlobalName
            {
             
            	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getNameGlobalNameParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleGlobalName_in_ruleFunctionHeader11699);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4894:2: ( (lv_pList_9_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4895:1: (lv_pList_9_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4895:1: (lv_pList_9_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4896:3: lv_pList_9_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getPListParameterListParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleFunctionHeader11720);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4912:2: ( ruleFunctionAttributes )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( ((LA81_0>=94 && LA81_0<=111)) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4913:5: ruleFunctionAttributes
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getFunctionAttributesParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleFunctionAttributes_in_ruleFunctionHeader11737);
                    ruleFunctionAttributes();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4920:3: (otherlv_11= 'section ' this_STRING_12= RULE_STRING )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==187) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4920:5: otherlv_11= 'section ' this_STRING_12= RULE_STRING
                    {
                    otherlv_11=(Token)match(input,187,FOLLOW_187_in_ruleFunctionHeader11751); 

                        	newLeafNode(otherlv_11, grammarAccess.getFunctionHeaderAccess().getSectionKeyword_10_0());
                        
                    this_STRING_12=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionHeader11762); 
                     
                        newLeafNode(this_STRING_12, grammarAccess.getFunctionHeaderAccess().getSTRINGTerminalRuleCall_10_1()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4928:3: ( ruleAlignment )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==66) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4929:5: ruleAlignment
                    {
                     
                            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getAlignmentParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleAlignment_in_ruleFunctionHeader11780);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4944:1: entryRuleGlobalName returns [EObject current=null] : iv_ruleGlobalName= ruleGlobalName EOF ;
    public final EObject entryRuleGlobalName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalName = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4945:2: (iv_ruleGlobalName= ruleGlobalName EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4946:2: iv_ruleGlobalName= ruleGlobalName EOF
            {
             newCompositeNode(grammarAccess.getGlobalNameRule()); 
            pushFollow(FOLLOW_ruleGlobalName_in_entryRuleGlobalName11817);
            iv_ruleGlobalName=ruleGlobalName();

            state._fsp--;

             current =iv_ruleGlobalName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalName11827); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4953:1: ruleGlobalName returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleGlobalName() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4956:28: ( (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4957:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4957:1: (otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4957:3: otherlv_0= '@' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,188,FOLLOW_188_in_ruleGlobalName11864); 

                	newLeafNode(otherlv_0, grammarAccess.getGlobalNameAccess().getCommercialAtKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4961:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4962:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4962:1: (lv_name_1_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4963:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGlobalName11881); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4987:1: entryRuleUnNammedAddr returns [EObject current=null] : iv_ruleUnNammedAddr= ruleUnNammedAddr EOF ;
    public final EObject entryRuleUnNammedAddr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnNammedAddr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4988:2: (iv_ruleUnNammedAddr= ruleUnNammedAddr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4989:2: iv_ruleUnNammedAddr= ruleUnNammedAddr EOF
            {
             newCompositeNode(grammarAccess.getUnNammedAddrRule()); 
            pushFollow(FOLLOW_ruleUnNammedAddr_in_entryRuleUnNammedAddr11922);
            iv_ruleUnNammedAddr=ruleUnNammedAddr();

            state._fsp--;

             current =iv_ruleUnNammedAddr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnNammedAddr11932); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4996:1: ruleUnNammedAddr returns [EObject current=null] : ( (lv_adress_0_0= RULE_INT ) ) ;
    public final EObject ruleUnNammedAddr() throws RecognitionException {
        EObject current = null;

        Token lv_adress_0_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4999:28: ( ( (lv_adress_0_0= RULE_INT ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5000:1: ( (lv_adress_0_0= RULE_INT ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5000:1: ( (lv_adress_0_0= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5001:1: (lv_adress_0_0= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5001:1: (lv_adress_0_0= RULE_INT )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5002:3: lv_adress_0_0= RULE_INT
            {
            lv_adress_0_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleUnNammedAddr11973); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5026:1: entryRuleVisibility returns [String current=null] : iv_ruleVisibility= ruleVisibility EOF ;
    public final String entryRuleVisibility() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVisibility = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5027:2: (iv_ruleVisibility= ruleVisibility EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5028:2: iv_ruleVisibility= ruleVisibility EOF
            {
             newCompositeNode(grammarAccess.getVisibilityRule()); 
            pushFollow(FOLLOW_ruleVisibility_in_entryRuleVisibility12014);
            iv_ruleVisibility=ruleVisibility();

            state._fsp--;

             current =iv_ruleVisibility.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVisibility12025); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5035:1: ruleVisibility returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'default' | kw= 'hidden' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleVisibility() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5038:28: ( (kw= 'default' | kw= 'hidden' | kw= 'protected' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5039:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5039:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            int alt84=3;
            switch ( input.LA(1) ) {
            case 189:
                {
                alt84=1;
                }
                break;
            case 190:
                {
                alt84=2;
                }
                break;
            case 191:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5040:2: kw= 'default'
                    {
                    kw=(Token)match(input,189,FOLLOW_189_in_ruleVisibility12063); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisibilityAccess().getDefaultKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5047:2: kw= 'hidden'
                    {
                    kw=(Token)match(input,190,FOLLOW_190_in_ruleVisibility12082); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVisibilityAccess().getHiddenKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5054:2: kw= 'protected'
                    {
                    kw=(Token)match(input,191,FOLLOW_191_in_ruleVisibility12101); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5067:1: entryRuleLinkage returns [String current=null] : iv_ruleLinkage= ruleLinkage EOF ;
    public final String entryRuleLinkage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLinkage = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5068:2: (iv_ruleLinkage= ruleLinkage EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5069:2: iv_ruleLinkage= ruleLinkage EOF
            {
             newCompositeNode(grammarAccess.getLinkageRule()); 
            pushFollow(FOLLOW_ruleLinkage_in_entryRuleLinkage12142);
            iv_ruleLinkage=ruleLinkage();

            state._fsp--;

             current =iv_ruleLinkage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLinkage12153); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5076:1: ruleLinkage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_AliasLinkage_12= ruleAliasLinkage ) ;
    public final AntlrDatatypeRuleToken ruleLinkage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_AliasLinkage_12 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5079:28: ( (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_AliasLinkage_12= ruleAliasLinkage ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5080:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_AliasLinkage_12= ruleAliasLinkage )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5080:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_AliasLinkage_12= ruleAliasLinkage )
            int alt85=13;
            switch ( input.LA(1) ) {
            case 192:
                {
                alt85=1;
                }
                break;
            case 193:
                {
                alt85=2;
                }
                break;
            case 194:
                {
                alt85=3;
                }
                break;
            case 195:
                {
                alt85=4;
                }
                break;
            case 196:
                {
                alt85=5;
                }
                break;
            case 197:
                {
                alt85=6;
                }
                break;
            case 198:
                {
                alt85=7;
                }
                break;
            case 199:
                {
                alt85=8;
                }
                break;
            case 200:
                {
                alt85=9;
                }
                break;
            case 201:
                {
                alt85=10;
                }
                break;
            case 202:
                {
                alt85=11;
                }
                break;
            case 203:
                {
                alt85=12;
                }
                break;
            case 204:
            case 205:
            case 206:
            case 207:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5081:2: kw= 'private'
                    {
                    kw=(Token)match(input,192,FOLLOW_192_in_ruleLinkage12191); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5088:2: kw= 'linker_private'
                    {
                    kw=(Token)match(input,193,FOLLOW_193_in_ruleLinkage12210); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinker_privateKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5095:2: kw= 'linker_private_weak'
                    {
                    kw=(Token)match(input,194,FOLLOW_194_in_ruleLinkage12229); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinker_private_weakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5102:2: kw= 'available_externally'
                    {
                    kw=(Token)match(input,195,FOLLOW_195_in_ruleLinkage12248); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getAvailable_externallyKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5109:2: kw= 'linkonce'
                    {
                    kw=(Token)match(input,196,FOLLOW_196_in_ruleLinkage12267); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinkonceKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5116:2: kw= 'common'
                    {
                    kw=(Token)match(input,197,FOLLOW_197_in_ruleLinkage12286); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getCommonKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5123:2: kw= 'appending'
                    {
                    kw=(Token)match(input,198,FOLLOW_198_in_ruleLinkage12305); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getAppendingKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5130:2: kw= 'extern_weak'
                    {
                    kw=(Token)match(input,199,FOLLOW_199_in_ruleLinkage12324); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getExtern_weakKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5137:2: kw= 'linkonce_odr'
                    {
                    kw=(Token)match(input,200,FOLLOW_200_in_ruleLinkage12343); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinkonce_odrKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5144:2: kw= 'linkonce_odr_auto_hide'
                    {
                    kw=(Token)match(input,201,FOLLOW_201_in_ruleLinkage12362); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getLinkonce_odr_auto_hideKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5151:2: kw= 'dllimport'
                    {
                    kw=(Token)match(input,202,FOLLOW_202_in_ruleLinkage12381); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getDllimportKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5158:2: kw= 'dllexport'
                    {
                    kw=(Token)match(input,203,FOLLOW_203_in_ruleLinkage12400); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLinkageAccess().getDllexportKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5165:5: this_AliasLinkage_12= ruleAliasLinkage
                    {
                     
                            newCompositeNode(grammarAccess.getLinkageAccess().getAliasLinkageParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleAliasLinkage_in_ruleLinkage12428);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5183:1: entryRuleAliasLinkage returns [String current=null] : iv_ruleAliasLinkage= ruleAliasLinkage EOF ;
    public final String entryRuleAliasLinkage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAliasLinkage = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5184:2: (iv_ruleAliasLinkage= ruleAliasLinkage EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5185:2: iv_ruleAliasLinkage= ruleAliasLinkage EOF
            {
             newCompositeNode(grammarAccess.getAliasLinkageRule()); 
            pushFollow(FOLLOW_ruleAliasLinkage_in_entryRuleAliasLinkage12474);
            iv_ruleAliasLinkage=ruleAliasLinkage();

            state._fsp--;

             current =iv_ruleAliasLinkage.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasLinkage12485); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5192:1: ruleAliasLinkage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) ;
    public final AntlrDatatypeRuleToken ruleAliasLinkage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5195:28: ( (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5196:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5196:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            int alt86=4;
            switch ( input.LA(1) ) {
            case 204:
                {
                alt86=1;
                }
                break;
            case 205:
                {
                alt86=2;
                }
                break;
            case 206:
                {
                alt86=3;
                }
                break;
            case 207:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5197:2: kw= 'external'
                    {
                    kw=(Token)match(input,204,FOLLOW_204_in_ruleAliasLinkage12523); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAliasLinkageAccess().getExternalKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5204:2: kw= 'internal'
                    {
                    kw=(Token)match(input,205,FOLLOW_205_in_ruleAliasLinkage12542); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAliasLinkageAccess().getInternalKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5211:2: kw= 'weak'
                    {
                    kw=(Token)match(input,206,FOLLOW_206_in_ruleAliasLinkage12561); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAliasLinkageAccess().getWeakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5218:2: kw= 'weak_odr'
                    {
                    kw=(Token)match(input,207,FOLLOW_207_in_ruleAliasLinkage12580); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5233:1: entryRuleTopLevelEntity returns [String current=null] : iv_ruleTopLevelEntity= ruleTopLevelEntity EOF ;
    public final String entryRuleTopLevelEntity() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTopLevelEntity = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5234:2: (iv_ruleTopLevelEntity= ruleTopLevelEntity EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5235:2: iv_ruleTopLevelEntity= ruleTopLevelEntity EOF
            {
             newCompositeNode(grammarAccess.getTopLevelEntityRule()); 
            pushFollow(FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity12623);
            iv_ruleTopLevelEntity=ruleTopLevelEntity();

            state._fsp--;

             current =iv_ruleTopLevelEntity.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelEntity12634); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5242:1: ruleTopLevelEntity returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5245:28: ( ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5246:1: ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5246:1: ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) )
            int alt88=5;
            alt88 = dfa88.predict(input);
            switch (alt88) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5246:2: (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5246:2: (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5247:2: kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING
                    {
                    kw=(Token)match(input,208,FOLLOW_208_in_ruleTopLevelEntity12673); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getModuleKeyword_0_0()); 
                        
                    kw=(Token)match(input,209,FOLLOW_209_in_ruleTopLevelEntity12686); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getAsmKeyword_0_1()); 
                        
                    this_STRING_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12701); 

                    		current.merge(this_STRING_2);
                        
                     
                        newLeafNode(this_STRING_2, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5266:6: (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5266:6: (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5267:2: kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING
                    {
                    kw=(Token)match(input,210,FOLLOW_210_in_ruleTopLevelEntity12727); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getTargetKeyword_1_0()); 
                        
                    kw=(Token)match(input,211,FOLLOW_211_in_ruleTopLevelEntity12740); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleTopLevelEntity12753); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_1_2()); 
                        
                    this_STRING_6=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12768); 

                    		current.merge(this_STRING_6);
                        
                     
                        newLeafNode(this_STRING_6, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_1_3()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5292:6: (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5292:6: (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5293:2: kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING
                    {
                    kw=(Token)match(input,210,FOLLOW_210_in_ruleTopLevelEntity12794); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getTargetKeyword_2_0()); 
                        
                    kw=(Token)match(input,212,FOLLOW_212_in_ruleTopLevelEntity12807); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_2_1()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleTopLevelEntity12820); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_2_2()); 
                        
                    this_STRING_10=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12835); 

                    		current.merge(this_STRING_10);
                        
                     
                        newLeafNode(this_STRING_10, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_2_3()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5318:6: (kw= 'deplibs' kw= '=' kw= '[' kw= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5318:6: (kw= 'deplibs' kw= '=' kw= '[' kw= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5319:2: kw= 'deplibs' kw= '=' kw= '[' kw= ']'
                    {
                    kw=(Token)match(input,213,FOLLOW_213_in_ruleTopLevelEntity12861); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_3_0()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleTopLevelEntity12874); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_3_1()); 
                        
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleTopLevelEntity12887); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getLeftSquareBracketKeyword_3_2()); 
                        
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleTopLevelEntity12900); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getRightSquareBracketKeyword_3_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5343:6: (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5343:6: (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5344:2: kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']'
                    {
                    kw=(Token)match(input,213,FOLLOW_213_in_ruleTopLevelEntity12921); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_4_0()); 
                        
                    kw=(Token)match(input,12,FOLLOW_12_in_ruleTopLevelEntity12934); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_4_1()); 
                        
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleTopLevelEntity12947); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getLeftSquareBracketKeyword_4_2()); 
                        
                    this_STRING_18=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12962); 

                    		current.merge(this_STRING_18);
                        
                     
                        newLeafNode(this_STRING_18, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_4_3()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5368:1: (kw= ',' this_STRING_20= RULE_STRING )*
                    loop87:
                    do {
                        int alt87=2;
                        int LA87_0 = input.LA(1);

                        if ( (LA87_0==33) ) {
                            alt87=1;
                        }


                        switch (alt87) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5369:2: kw= ',' this_STRING_20= RULE_STRING
                    	    {
                    	    kw=(Token)match(input,33,FOLLOW_33_in_ruleTopLevelEntity12981); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getTopLevelEntityAccess().getCommaKeyword_4_4_0()); 
                    	        
                    	    this_STRING_20=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity12996); 

                    	    		current.merge(this_STRING_20);
                    	        
                    	     
                    	        newLeafNode(this_STRING_20, grammarAccess.getTopLevelEntityAccess().getSTRINGTerminalRuleCall_4_4_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop87;
                        }
                    } while (true);

                    kw=(Token)match(input,114,FOLLOW_114_in_ruleTopLevelEntity13016); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5395:1: entryRuleMainLevelEntity returns [EObject current=null] : iv_ruleMainLevelEntity= ruleMainLevelEntity EOF ;
    public final EObject entryRuleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainLevelEntity = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5396:2: (iv_ruleMainLevelEntity= ruleMainLevelEntity EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5397:2: iv_ruleMainLevelEntity= ruleMainLevelEntity EOF
            {
             newCompositeNode(grammarAccess.getMainLevelEntityRule()); 
            pushFollow(FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity13057);
            iv_ruleMainLevelEntity=ruleMainLevelEntity();

            state._fsp--;

             current =iv_ruleMainLevelEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainLevelEntity13067); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5404:1: ruleMainLevelEntity returns [EObject current=null] : (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVarInstruction_1= ruleLocalVarInstruction | this_LocalVar_2= ruleLocalVar ) ;
    public final EObject ruleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionHeader_0 = null;

        EObject this_LocalVarInstruction_1 = null;

        EObject this_LocalVar_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5407:28: ( (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVarInstruction_1= ruleLocalVarInstruction | this_LocalVar_2= ruleLocalVar ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5408:1: (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVarInstruction_1= ruleLocalVarInstruction | this_LocalVar_2= ruleLocalVar )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5408:1: (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVarInstruction_1= ruleLocalVarInstruction | this_LocalVar_2= ruleLocalVar )
            int alt89=3;
            switch ( input.LA(1) ) {
            case 185:
            case 186:
                {
                alt89=1;
                }
                break;
            case 115:
                {
                alt89=2;
                }
                break;
            case RULE_VAR_TYPE:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 31:
            case 34:
                {
                alt89=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5409:5: this_FunctionHeader_0= ruleFunctionHeader
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getFunctionHeaderParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionHeader_in_ruleMainLevelEntity13114);
                    this_FunctionHeader_0=ruleFunctionHeader();

                    state._fsp--;

                     
                            current = this_FunctionHeader_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5419:5: this_LocalVarInstruction_1= ruleLocalVarInstruction
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getLocalVarInstructionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLocalVarInstruction_in_ruleMainLevelEntity13141);
                    this_LocalVarInstruction_1=ruleLocalVarInstruction();

                    state._fsp--;

                     
                            current = this_LocalVarInstruction_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5429:5: this_LocalVar_2= ruleLocalVar
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getLocalVarParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleLocalVar_in_ruleMainLevelEntity13168);
                    this_LocalVar_2=ruleLocalVar();

                    state._fsp--;

                     
                            current = this_LocalVar_2; 
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


    // $ANTLR start "entryRuleLocalVarInstruction"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5445:1: entryRuleLocalVarInstruction returns [EObject current=null] : iv_ruleLocalVarInstruction= ruleLocalVarInstruction EOF ;
    public final EObject entryRuleLocalVarInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVarInstruction = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5446:2: (iv_ruleLocalVarInstruction= ruleLocalVarInstruction EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5447:2: iv_ruleLocalVarInstruction= ruleLocalVarInstruction EOF
            {
             newCompositeNode(grammarAccess.getLocalVarInstructionRule()); 
            pushFollow(FOLLOW_ruleLocalVarInstruction_in_entryRuleLocalVarInstruction13203);
            iv_ruleLocalVarInstruction=ruleLocalVarInstruction();

            state._fsp--;

             current =iv_ruleLocalVarInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVarInstruction13213); 

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
    // $ANTLR end "entryRuleLocalVarInstruction"


    // $ANTLR start "ruleLocalVarInstruction"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5454:1: ruleLocalVarInstruction returns [EObject current=null] : (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_instruction_3_0= ruleInstruction ) ) ) ;
    public final EObject ruleLocalVarInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_instruction_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5457:28: ( (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_instruction_3_0= ruleInstruction ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5458:1: (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_instruction_3_0= ruleInstruction ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5458:1: (otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_instruction_3_0= ruleInstruction ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5458:3: otherlv_0= '%' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_instruction_3_0= ruleInstruction ) )
            {
            otherlv_0=(Token)match(input,115,FOLLOW_115_in_ruleLocalVarInstruction13250); 

                	newLeafNode(otherlv_0, grammarAccess.getLocalVarInstructionAccess().getPercentSignKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5462:1: ( (lv_name_1_0= RULE_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5463:1: (lv_name_1_0= RULE_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5463:1: (lv_name_1_0= RULE_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5464:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLocalVarInstruction13267); 

            			newLeafNode(lv_name_1_0, grammarAccess.getLocalVarInstructionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getLocalVarInstructionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleLocalVarInstruction13284); 

                	newLeafNode(otherlv_2, grammarAccess.getLocalVarInstructionAccess().getEqualsSignKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5484:1: ( (lv_instruction_3_0= ruleInstruction ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5485:1: (lv_instruction_3_0= ruleInstruction )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5485:1: (lv_instruction_3_0= ruleInstruction )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5486:3: lv_instruction_3_0= ruleInstruction
            {
             
            	        newCompositeNode(grammarAccess.getLocalVarInstructionAccess().getInstructionInstructionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleInstruction_in_ruleLocalVarInstruction13305);
            lv_instruction_3_0=ruleInstruction();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalVarInstructionRule());
            	        }
                   		set(
                   			current, 
                   			"instruction",
                    		lv_instruction_3_0, 
                    		"Instruction");
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
    // $ANTLR end "ruleLocalVarInstruction"


    // $ANTLR start "entryRuleAlignment"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5510:1: entryRuleAlignment returns [String current=null] : iv_ruleAlignment= ruleAlignment EOF ;
    public final String entryRuleAlignment() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlignment = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5511:2: (iv_ruleAlignment= ruleAlignment EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5512:2: iv_ruleAlignment= ruleAlignment EOF
            {
             newCompositeNode(grammarAccess.getAlignmentRule()); 
            pushFollow(FOLLOW_ruleAlignment_in_entryRuleAlignment13342);
            iv_ruleAlignment=ruleAlignment();

            state._fsp--;

             current =iv_ruleAlignment.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlignment13353); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5519:1: ruleAlignment returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'align' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleAlignment() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5522:28: ( (kw= 'align' this_INT_1= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5523:1: (kw= 'align' this_INT_1= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5523:1: (kw= 'align' this_INT_1= RULE_INT )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5524:2: kw= 'align' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,66,FOLLOW_66_in_ruleAlignment13391); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAlignmentAccess().getAlignKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAlignment13406); 

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


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA72 dfa72 = new DFA72(this);
    protected DFA88 dfa88 = new DFA88(this);
    static final String DFA5_eotS =
        "\22\uffff";
    static final String DFA5_eofS =
        "\1\uffff\15\21\4\uffff";
    static final String DFA5_minS =
        "\1\5\15\4\4\uffff";
    static final String DFA5_maxS =
        "\1\42\15\u00d5\4\uffff";
    static final String DFA5_acceptS =
        "\16\uffff\1\2\1\4\1\3\1\1";
    static final String DFA5_specialS =
        "\22\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\17\10\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\4\uffff\1\16\2\uffff\1\16",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "\2\21\1\uffff\1\21\4\uffff\1\21\1\uffff\15\21\2\20\2\uffff"+
            "\1\21\1\uffff\2\21\1\uffff\1\21\1\uffff\3\21\7\uffff\1\21\1"+
            "\uffff\1\21\1\uffff\3\21\1\uffff\2\21\4\uffff\1\21\4\uffff\3"+
            "\21\10\uffff\1\21\41\uffff\2\21\1\uffff\3\21\3\uffff\5\21\1"+
            "\uffff\16\21\26\uffff\20\21\1\uffff\2\21\1\uffff\1\21\1\uffff"+
            "\2\21\1\uffff\1\21\23\uffff\1\21\1\uffff\1\21\2\uffff\1\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "229:1: (this_BasicType_0= ruleBasicType | this_StructType_1= ruleStructType | this_Pointer_2= rulePointer | this_VAR_TYPE_3= RULE_VAR_TYPE )";
        }
    }
    static final String DFA8_eotS =
        "\20\uffff";
    static final String DFA8_eofS =
        "\20\uffff";
    static final String DFA8_minS =
        "\1\16\15\33\2\uffff";
    static final String DFA8_maxS =
        "\1\32\15\34\2\uffff";
    static final String DFA8_acceptS =
        "\16\uffff\1\2\1\1";
    static final String DFA8_specialS =
        "\20\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "\1\17\1\16",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "459:1: ( (this_BasicType_0= ruleBasicType (kw= '*' )+ ) | (this_BasicType_2= ruleBasicType kw= 'addrspace' kw= '(' this_INT_5= RULE_INT kw= ')' kw= '*' ) )";
        }
    }
    static final String DFA54_eotS =
        "\130\uffff";
    static final String DFA54_eofS =
        "\2\uffff\1\23\125\uffff";
    static final String DFA54_minS =
        "\1\167\1\uffff\1\4\15\5\1\16\1\37\1\5\1\uffff\1\35\1\uffff\2\5"+
        "\15\40\1\16\1\6\1\16\1\5\15\40\1\43\1\36\15\40\1\16\1\43\1\5\1\33"+
        "\15\40\2\5";
    static final String DFA54_maxS =
        "\1\170\1\uffff\1\u00d5\15\34\1\40\1\37\1\14\1\uffff\1\35\1\uffff"+
        "\1\33\1\14\15\41\1\40\1\6\1\32\1\14\15\41\1\43\1\36\15\41\1\32\1"+
        "\43\1\14\1\33\15\41\2\14";
    static final String DFA54_acceptS =
        "\1\uffff\1\1\21\uffff\1\2\1\uffff\1\3\102\uffff";
    static final String DFA54_specialS =
        "\130\uffff}>";
    static final String[] DFA54_transitionS = {
            "\1\1\1\2",
            "",
            "\1\23\1\22\10\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
            "\1\14\1\15\1\16\1\17\4\uffff\1\20\2\uffff\1\21\1\uffff\1\23"+
            "\1\uffff\3\23\7\uffff\1\23\1\uffff\1\23\1\uffff\3\23\1\uffff"+
            "\2\23\4\uffff\1\23\4\uffff\3\23\10\uffff\1\23\41\uffff\1\23"+
            "\2\uffff\2\23\2\uffff\7\23\1\uffff\16\23\26\uffff\20\23\1\uffff"+
            "\2\23\1\uffff\1\23\1\uffff\2\23\25\uffff\1\23\1\uffff\1\23\2"+
            "\uffff\1\23",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\25\6\uffff\1\23\16\uffff\1\26\1\24",
            "\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1"+
            "\43\1\44\5\uffff\1\27",
            "\1\45",
            "\1\25\6\uffff\1\23",
            "",
            "\1\46",
            "",
            "\1\25\6\uffff\1\23\16\uffff\1\26",
            "\1\25\6\uffff\1\23",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1"+
            "\64\1\65\5\uffff\1\66",
            "\1\67",
            "\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
            "\1\103\1\104",
            "\1\25\6\uffff\1\23",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\107",
            "\1\110",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
            "\1\123\1\124\1\125",
            "\1\126",
            "\1\25\6\uffff\1\23",
            "\1\127",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\106\1\105",
            "\1\25\6\uffff\1\23",
            "\1\25\6\uffff\1\23"
    };

    static final short[] DFA54_eot = DFA.unpackEncodedString(DFA54_eotS);
    static final short[] DFA54_eof = DFA.unpackEncodedString(DFA54_eofS);
    static final char[] DFA54_min = DFA.unpackEncodedStringToUnsignedChars(DFA54_minS);
    static final char[] DFA54_max = DFA.unpackEncodedStringToUnsignedChars(DFA54_maxS);
    static final short[] DFA54_accept = DFA.unpackEncodedString(DFA54_acceptS);
    static final short[] DFA54_special = DFA.unpackEncodedString(DFA54_specialS);
    static final short[][] DFA54_transition;

    static {
        int numStates = DFA54_transitionS.length;
        DFA54_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA54_transition[i] = DFA.unpackEncodedString(DFA54_transitionS[i]);
        }
    }

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = DFA54_eot;
            this.eof = DFA54_eof;
            this.min = DFA54_min;
            this.max = DFA54_max;
            this.accept = DFA54_accept;
            this.special = DFA54_special;
            this.transition = DFA54_transition;
        }
        public String getDescription() {
            return "2569:1: ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | ( () otherlv_3= 'filter' ) | (otherlv_4= 'filter' ( (lv_filter_5_0= ruleTypeAndValue ) ) (otherlv_6= ',' ( (lv_filter_7_0= ruleTypeAndValue ) ) )* ) )";
        }
    }
    static final String DFA72_eotS =
        "\130\uffff";
    static final String DFA72_eofS =
        "\24\uffff\1\46\103\uffff";
    static final String DFA72_minS =
        "\1\u00b7\16\5\1\16\1\37\1\5\1\35\1\5\1\4\15\40\1\5\1\16\1\6\2\uffff"+
        "\1\16\1\5\1\43\15\40\1\36\15\40\1\5\1\16\1\43\1\33\15\40\2\5";
    static final String DFA72_maxS =
        "\1\u00b7\1\42\15\34\1\40\1\37\1\5\1\35\1\33\1\u00d5\15\41\1\5\1"+
        "\40\1\6\2\uffff\1\32\1\5\1\43\15\41\1\36\15\41\1\5\1\32\1\43\1\33"+
        "\15\41\2\5";
    static final String DFA72_acceptS =
        "\45\uffff\1\2\1\1\61\uffff";
    static final String DFA72_specialS =
        "\130\uffff}>";
    static final String[] DFA72_transitionS = {
            "\1\1",
            "\1\21\10\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13"+
            "\1\14\1\15\1\16\4\uffff\1\17\2\uffff\1\20",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\24\25\uffff\1\23\1\22",
            "\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1"+
            "\40\1\41\5\uffff\1\42",
            "\1\43",
            "\1\24",
            "\1\44",
            "\1\24\25\uffff\1\23",
            "\2\46\10\uffff\15\46\4\uffff\1\46\1\uffff\1\45\1\46\1\uffff"+
            "\1\46\1\uffff\3\46\7\uffff\1\46\1\uffff\1\46\1\uffff\3\46\1"+
            "\uffff\2\46\4\uffff\1\46\4\uffff\3\46\10\uffff\1\46\41\uffff"+
            "\1\46\2\uffff\2\46\4\uffff\5\46\1\uffff\16\46\26\uffff\20\46"+
            "\1\uffff\2\46\1\uffff\1\46\1\uffff\2\46\25\uffff\1\46\1\uffff"+
            "\1\46\2\uffff\1\46",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\24",
            "\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62\1\63\1\64\1"+
            "\65\1\66\5\uffff\1\51",
            "\1\67",
            "",
            "",
            "\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\100\1\101\1\102"+
            "\1\103\1\104",
            "\1\24",
            "\1\105",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\110",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\50\1\47",
            "\1\24",
            "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122"+
            "\1\123\1\124\1\125",
            "\1\126",
            "\1\127",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\107\1\106",
            "\1\24",
            "\1\24"
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
            return "4590:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )";
        }
    }
    static final String DFA88_eotS =
        "\12\uffff";
    static final String DFA88_eofS =
        "\12\uffff";
    static final String DFA88_minS =
        "\1\u00d0\1\uffff\1\u00d3\1\14\2\uffff\1\161\1\10\2\uffff";
    static final String DFA88_maxS =
        "\1\u00d5\1\uffff\1\u00d4\1\14\2\uffff\1\161\1\162\2\uffff";
    static final String DFA88_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\2\uffff\1\5\1\4";
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
            "\1\10\151\uffff\1\11",
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
            return "5246:1: ( (kw= 'module' kw= 'asm' this_STRING_2= RULE_STRING ) | (kw= 'target' kw= 'triple' kw= '=' this_STRING_6= RULE_STRING ) | (kw= 'target' kw= 'datalayout' kw= '=' this_STRING_10= RULE_STRING ) | (kw= 'deplibs' kw= '=' kw= '[' kw= ']' ) | (kw= 'deplibs' kw= '=' kw= '[' this_STRING_18= RULE_STRING (kw= ',' this_STRING_20= RULE_STRING )* kw= ']' ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLLVM_in_entryRuleLLVM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLVM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleLLVM130 = new BitSet(new long[]{0x0000000487FFC022L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement227 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement269 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_entryRuleTypeAndValue318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeAndValue328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeAndValue374 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleTypeAndValue391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleType491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_ruleType524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointer_in_ruleType557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleType583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVar_in_entryRuleLocalVar628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVar638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLocalVar684 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLocalVar696 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleLocalVar708 = new BitSet(new long[]{0x0000000487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_ruleLocalVar724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_entryRuleBasicType760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicType771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleBasicType809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleBasicType828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleBasicType847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleBasicType866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleBasicType885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBasicType904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleBasicType923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleBasicType942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleBasicType961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleBasicType980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleBasicType999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleBasicType1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleBasicType1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePointer_in_entryRulePointer1078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePointer1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rulePointer1137 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePointer1156 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_rulePointer1188 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePointer1206 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePointer1219 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePointer1234 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePointer1252 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePointer1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_entryRuleStructType1307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructType1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStructType1357 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleStructType1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleStructType1391 = new BitSet(new long[]{0x0000000007FFC000L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleStructType1413 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleStructType1432 = new BitSet(new long[]{0x0000000007FFC000L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleStructType1454 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleStructType1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStructType1495 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleStructType1508 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleStructType1521 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleStructType1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleStructType1555 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleStructType1568 = new BitSet(new long[]{0x0000000007FFC000L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleStructType1590 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_33_in_ruleStructType1609 = new BitSet(new long[]{0x0000000007FFC000L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleStructType1631 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_32_in_ruleStructType1651 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleStructType1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr1705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetElementPtr1715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleGetElementPtr1752 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_37_in_ruleGetElementPtr1765 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr1788 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleGetElementPtr1801 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr1822 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_entryRuleExtractValue1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractValue1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleExtractValue1907 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractValue1928 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleExtractValue1941 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExtractValue1958 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_entryRuleInsertValue2001 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertValue2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleInsertValue2048 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertValue2069 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInsertValue2081 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertValue2102 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInsertValue2115 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInsertValue2132 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleFence_in_entryRuleFence2175 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFence2185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleFence2222 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_41_in_ruleFence2235 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleFence2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_entryRuleAtomicOrdering2295 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicOrdering2306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAtomicOrdering2344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleAtomicOrdering2363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleAtomicOrdering2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleAtomicOrdering2401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleAtomicOrdering2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleAtomicOrdering2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg2479 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmpXchg2489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleCmpXchg2526 = new BitSet(new long[]{0x0002002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_49_in_ruleCmpXchg2539 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg2562 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCmpXchg2574 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg2595 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleCmpXchg2607 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg2628 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_41_in_ruleCmpXchg2641 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleCmpXchg2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW2700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRMW2710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAtomicRMW2747 = new BitSet(new long[]{0x3FFA000000000000L});
    public static final BitSet FOLLOW_49_in_ruleAtomicRMW2760 = new BitSet(new long[]{0x3FFA000000000000L});
    public static final BitSet FOLLOW_ruleBinOp_in_ruleAtomicRMW2778 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW2798 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAtomicRMW2810 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW2831 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_41_in_ruleAtomicRMW2844 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleAtomicRMW2867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinOp_in_entryRuleBinOp2904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinOp2915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBinOp2953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleBinOp2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBinOp2991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleBinOp3010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleBinOp3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleBinOp3048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleBinOp3067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleBinOp3086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleBinOp3105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleBinOp3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleBinOp3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_entryRuleLoad3183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoad3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLoad3231 = new BitSet(new long[]{0x0002002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_49_in_ruleLoad3244 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLoad3267 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleLoad3280 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleAlignment_in_ruleLoad3301 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleLoad3316 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_ruleLoad3328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleLoad3340 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoad3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLoad3384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleLoad3396 = new BitSet(new long[]{0x0002002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_49_in_ruleLoad3409 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLoad3432 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_41_in_ruleLoad3445 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleLoad3468 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleLoad3481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleLoad3493 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoad3510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore3554 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleStore3602 = new BitSet(new long[]{0x0002002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_49_in_ruleStore3615 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore3638 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStore3650 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore3671 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleStore3684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleStore3696 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStore3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleStore3728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleStore3740 = new BitSet(new long[]{0x0002002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_49_in_ruleStore3753 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore3776 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStore3788 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore3809 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_41_in_ruleStore3822 = new BitSet(new long[]{0x0000FE0000000000L});
    public static final BitSet FOLLOW_ruleAtomicOrdering_in_ruleStore3845 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleStore3858 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_ruleStore3870 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStore3887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall3931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCall3979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_ruleCall3993 = new BitSet(new long[]{0x0000002487FFC060L,0x000800003FFFBFC0L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleCall4010 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000003FC0L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleReturnAttributes_in_ruleCall4028 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCall4050 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleCall4071 = new BitSet(new long[]{0x0000000000000002L,0x0000FFFFC0000000L});
    public static final BitSet FOLLOW_ruleFunctionAttributes_in_ruleCall4088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturnAttributes_in_entryRuleReturnAttributes4126 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturnAttributes4137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleReturnAttributes4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleReturnAttributes4194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleReturnAttributes4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleReturnAttributes4232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleReturnAttributes4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleReturnAttributes4270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleReturnAttributes4289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleReturnAttributes4308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_entryRuleAlloc4348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlloc4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleAlloc4395 = new BitSet(new long[]{0x0000000687FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlloc4416 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAlloc4429 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAlloc4450 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleAlloc4465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleAlignment_in_ruleAlloc4481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_entryRuleCallingConv4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallingConv4530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleCallingConv4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleCallingConv4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleCallingConv4606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleCallingConv4625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleCallingConv4644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleCallingConv4663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleCallingConv4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleCallingConv4701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleCallingConv4720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleCallingConv4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleCallingConv4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleCallingConv4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleCallingConv4796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleCallingConv4815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCallingConv4835 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv4850 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCallingConv4868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv4890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionAttributes_in_entryRuleFunctionAttributes4936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionAttributes4947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleFunctionAttributes4985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleFunctionAttributes5004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleFunctionAttributes5023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleFunctionAttributes5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleFunctionAttributes5061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleFunctionAttributes5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleFunctionAttributes5099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleFunctionAttributes5118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleFunctionAttributes5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleFunctionAttributes5156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleFunctionAttributes5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleFunctionAttributes5194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleFunctionAttributes5213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleFunctionAttributes5232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleFunctionAttributes5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleFunctionAttributes5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleFunctionAttributes5289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleFunctionAttributes5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList5348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleParameterList5404 = new BitSet(new long[]{0x00000024C7FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_30_in_ruleParameterList5417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleParameterList5445 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_33_in_ruleParameterList5458 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleParameterList5479 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_30_in_ruleParameterList5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_entryRulePHI5531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePHI5541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_rulePHI5578 = new BitSet(new long[]{0x0000000487FFC020L,0x000A000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_rulePHI5594 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_rulePHI5605 = new BitSet(new long[]{0x0000000000000080L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI5626 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_rulePHI5638 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rulePHI5651 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_rulePHI5663 = new BitSet(new long[]{0x0000000000000080L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI5684 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_rulePHI5696 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleValuePair_in_entryRuleValuePair5734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuePair5744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleValuePair5782 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuePair5801 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleValuePair5818 = new BitSet(new long[]{0x0000000000000080L,0x0008000000000000L});
    public static final BitSet FOLLOW_115_in_ruleValuePair5831 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleValuePair5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_entryRuleLandingPad5891 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLandingPad5901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleLandingPad5938 = new BitSet(new long[]{0x0000000487FFC020L,0x0028000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad5959 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_117_in_ruleLandingPad5971 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLandingPad5992 = new BitSet(new long[]{0x0000000000000000L,0x01C0000000000000L});
    public static final BitSet FOLLOW_118_in_ruleLandingPad6006 = new BitSet(new long[]{0x0000000000000002L,0x01C0000000000000L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad6027 = new BitSet(new long[]{0x0000000000000002L,0x01C0000000000000L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad6056 = new BitSet(new long[]{0x0000000000000002L,0x01C0000000000000L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause6094 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause6104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleClause6142 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause6164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleClause6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleClause6212 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause6233 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleClause6246 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause6267 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect6306 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect6316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleSelect6353 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect6374 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSelect6386 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect6407 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSelect6419 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg6476 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVA_Arg6486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleVA_Arg6523 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleVA_Arg6544 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVA_Arg6556 = new BitSet(new long[]{0x0000000487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_ruleVA_Arg6577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_entryRuleExtractElement6613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractElement6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleExtractElement6660 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractElement6681 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleExtractElement6693 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractElement6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_entryRuleInsertElement6750 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertElement6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleInsertElement6797 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement6818 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInsertElement6830 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement6851 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleInsertElement6863 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector6920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShuffleVector6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleShuffleVector6967 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector6988 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleShuffleVector7000 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector7021 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleShuffleVector7033 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector7054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast7090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastType_in_ruleCast7141 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCast7161 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleCast7173 = new BitSet(new long[]{0x0000000487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCastType_in_entryRuleCastType7231 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCastType7242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleCastType7280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleCastType7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleCastType7318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleCastType7337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleCastType7356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleCastType7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleCastType7394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleCastType7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleCastType7432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleCastType7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleCastType7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleCastType7489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare7529 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare7539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleCompare7577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000007FE000L});
    public static final BitSet FOLLOW_ruleIPredicates_in_ruleCompare7593 = new BitSet(new long[]{0x0000000487FFC0A0L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare7608 = new BitSet(new long[]{0x0000000000000080L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleCompare7629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleCompare7648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000007FF878000L});
    public static final BitSet FOLLOW_ruleFPredicates_in_ruleCompare7664 = new BitSet(new long[]{0x0000000487FFC0A0L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare7679 = new BitSet(new long[]{0x0000000000000080L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleCompare7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIPredicates_in_entryRuleIPredicates7737 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIPredicates7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleIPredicates7786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleIPredicates7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleIPredicates7824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleIPredicates7843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleIPredicates7862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleIPredicates7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleIPredicates7900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleIPredicates7919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleIPredicates7938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleIPredicates7957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFPredicates_in_entryRuleFPredicates7998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFPredicates8009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ruleFPredicates8047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ruleFPredicates8066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleFPredicates8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleFPredicates8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleFPredicates8123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleFPredicates8142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleFPredicates8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ruleFPredicates8180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ruleFPredicates8199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleFPredicates8218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleFPredicates8237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleFPredicates8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleFPredicates8275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleFPredicates8294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_ruleFPredicates8313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_ruleFPredicates8332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOP_in_entryRuleArithmeticOP8373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticOP8384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleArithmeticOP8422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_ruleArithmeticOP8441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleArithmeticOP8460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_ruleArithmeticOP8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_ruleArithmeticOP8498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_ruleArithmeticOP8517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_ruleArithmeticOP8536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_ruleArithmeticOP8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleArithmeticOP8574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_ruleArithmeticOP8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_ruleArithmeticOP8612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_ruleArithmeticOP8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOP_in_entryRuleLogicalOP8672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicalOP8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_ruleLogicalOP8721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_ruleLogicalOP8740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_175_in_ruleLogicalOP8759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleLogicalOP8778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLogicalOP8797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleLogicalOP8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmetic_in_entryRuleArithmetic8856 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmetic8866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOP_in_ruleArithmetic8907 = new BitSet(new long[]{0x0000000487FFC0A0L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_ruleArithmetic8922 = new BitSet(new long[]{0x0000000000000080L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleArithmetic8943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_entryRuleLogical8978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogical8988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicalOP_in_ruleLogical9029 = new BitSet(new long[]{0x0000000487FFC0A0L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleType_in_ruleLogical9044 = new BitSet(new long[]{0x0000000000000080L,0x0008000000000000L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleLogical9065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction9100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction9110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleInstruction9157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_ruleInstruction9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_ruleInstruction9211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleInstruction9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_ruleInstruction9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_ruleInstruction9292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_ruleInstruction9319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_ruleInstruction9346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogical_in_ruleInstruction9373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmetic_in_ruleInstruction9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleInstruction9427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleInstruction9454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_ruleInstruction9481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_ruleInstruction9508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_ruleInstruction9535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_ruleInstruction9562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_ruleInstruction9589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_ruleInstruction9616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_ruleInstruction9643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_ruleInstruction9670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_ruleInstruction9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_ruleInstruction9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_ruleInstruction9751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleInstruction9778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleInstruction9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_ruleInstruction9832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_ruleInstruction9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch9894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndirectBranch9904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_176_in_ruleIndirectBranch9941 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleIndirectBranch9962 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleIndirectBranch9974 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleIndirectBranch9986 = new BitSet(new long[]{0x0000002487FFC020L,0x000C000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleLabelList_in_ruleIndirectBranch10007 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleIndirectBranch10020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelList_in_entryRuleLabelList10056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelList10066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLabelList10111 = new BitSet(new long[]{0x0000002487FFC022L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch10147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch10157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_177_in_ruleSwitch10194 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSwitch10215 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleSwitch10227 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSwitch10248 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleSwitch10260 = new BitSet(new long[]{0x0000002487FFC020L,0x000C000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleJumpTable_in_ruleSwitch10281 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleSwitch10294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpTable_in_entryRuleJumpTable10330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJumpTable10340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleJumpTable10386 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleJumpTable10398 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleJumpTable10419 = new BitSet(new long[]{0x0000002487FFC022L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleInvoke_in_entryRuleInvoke10456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvoke10466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_178_in_ruleInvoke10503 = new BitSet(new long[]{0x0000002487FFC060L,0x000800003FFFBFC0L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleInvoke10520 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000003FC0L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleReturnAttributes_in_ruleInvoke10538 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke10560 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleInvoke10581 = new BitSet(new long[]{0x0000000000000000L,0x4000FFFFC0000000L});
    public static final BitSet FOLLOW_ruleFunctionAttributes_in_ruleInvoke10598 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleInvoke10611 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke10632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_179_in_ruleInvoke10644 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke10665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_entryRuleResume10701 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResume10711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_180_in_ruleResume10748 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleResume10770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn10805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn10815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_ruleReturn10862 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleReturn10874 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleReturn10887 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_ruleReturn10899 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleReturn10911 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn10922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_181_in_ruleReturn10943 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleReturn10964 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_ruleReturn10977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_182_in_ruleReturn10989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_ruleReturn11001 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_entryRuleBranch11050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranch11060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_ruleBranch11098 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch11119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_183_in_ruleBranch11139 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch11160 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBranch11172 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch11193 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleBranch11205 = new BitSet(new long[]{0x0000002487FFC020L,0x0008000000000000L,0x0600000000000000L,0x0000000000250000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch11226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock11265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicBlock11275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelStr_in_ruleBasicBlock11330 = new BitSet(new long[]{0x437501D000000002L,0xBE11000000004038L,0x00B7FFF800001FFFL});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBasicBlock11352 = new BitSet(new long[]{0x437501D000000002L,0xBE11000000004038L,0x00B7FFF800001FFFL});
    public static final BitSet FOLLOW_ruleLabelStr_in_entryRuleLabelStr11389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelStr11399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLabelStr11441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_184_in_ruleLabelStr11458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_entryRuleFunctionHeader11494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionHeader11504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_ruleFunctionHeader11542 = new BitSet(new long[]{0x0000000487FFC060L,0x000800003FFFBFC0L,0xF600000000000000L,0x000000000025FFFFL});
    public static final BitSet FOLLOW_186_in_ruleFunctionHeader11560 = new BitSet(new long[]{0x0000000487FFC060L,0x000800003FFFBFC0L,0xF600000000000000L,0x000000000025FFFFL});
    public static final BitSet FOLLOW_ruleLinkage_in_ruleFunctionHeader11578 = new BitSet(new long[]{0x0000000487FFC060L,0x000800003FFFBFC0L,0xF600000000000000L,0x000000000025FFFFL});
    public static final BitSet FOLLOW_ruleVisibility_in_ruleFunctionHeader11596 = new BitSet(new long[]{0x0000000487FFC060L,0x000800003FFFBFC0L,0xF600000000000000L,0x000000000025FFFFL});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionHeader11614 = new BitSet(new long[]{0x0000000487FFC060L,0x000800003FFFBFC0L,0xF600000000000000L,0x000000000025FFFFL});
    public static final BitSet FOLLOW_ruleReturnAttributes_in_ruleFunctionHeader11632 = new BitSet(new long[]{0x0000000487FFC060L,0x000800003FFFBFC0L,0xF600000000000000L,0x000000000025FFFFL});
    public static final BitSet FOLLOW_ruleUnNammedAddr_in_ruleFunctionHeader11656 = new BitSet(new long[]{0x0000000487FFC060L,0x000800003FFFBFC0L,0xF600000000000000L,0x000000000025FFFFL});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionHeader11678 = new BitSet(new long[]{0x0000000487FFC060L,0x000800003FFFBFC0L,0xF600000000000000L,0x000000000025FFFFL});
    public static final BitSet FOLLOW_ruleGlobalName_in_ruleFunctionHeader11699 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleFunctionHeader11720 = new BitSet(new long[]{0x0000000000000002L,0x0000FFFFC0000004L,0x0800000000000000L});
    public static final BitSet FOLLOW_ruleFunctionAttributes_in_ruleFunctionHeader11737 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L,0x0800000000000000L});
    public static final BitSet FOLLOW_187_in_ruleFunctionHeader11751 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionHeader11762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleAlignment_in_ruleFunctionHeader11780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalName_in_entryRuleGlobalName11817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalName11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_ruleGlobalName11864 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGlobalName11881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnNammedAddr_in_entryRuleUnNammedAddr11922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnNammedAddr11932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleUnNammedAddr11973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVisibility_in_entryRuleVisibility12014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVisibility12025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_ruleVisibility12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_ruleVisibility12082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_ruleVisibility12101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkage_in_entryRuleLinkage12142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLinkage12153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_ruleLinkage12191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleLinkage12210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleLinkage12229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_ruleLinkage12248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_ruleLinkage12267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_ruleLinkage12286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_ruleLinkage12305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_ruleLinkage12324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_ruleLinkage12343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_ruleLinkage12362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_ruleLinkage12381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_ruleLinkage12400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasLinkage_in_ruleLinkage12428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasLinkage_in_entryRuleAliasLinkage12474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasLinkage12485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_ruleAliasLinkage12523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_ruleAliasLinkage12542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_ruleAliasLinkage12561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_ruleAliasLinkage12580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity12623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelEntity12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_ruleTopLevelEntity12673 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_209_in_ruleTopLevelEntity12686 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_ruleTopLevelEntity12727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_211_in_ruleTopLevelEntity12740 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTopLevelEntity12753 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_ruleTopLevelEntity12794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_212_in_ruleTopLevelEntity12807 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTopLevelEntity12820 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_ruleTopLevelEntity12861 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTopLevelEntity12874 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleTopLevelEntity12887 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleTopLevelEntity12900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_ruleTopLevelEntity12921 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTopLevelEntity12934 = new BitSet(new long[]{0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_113_in_ruleTopLevelEntity12947 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12962 = new BitSet(new long[]{0x0000000200000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_33_in_ruleTopLevelEntity12981 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity12996 = new BitSet(new long[]{0x0000000200000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_114_in_ruleTopLevelEntity13016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity13057 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainLevelEntity13067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_ruleMainLevelEntity13114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVarInstruction_in_ruleMainLevelEntity13141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVar_in_ruleMainLevelEntity13168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVarInstruction_in_entryRuleLocalVarInstruction13203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVarInstruction13213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleLocalVarInstruction13250 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLocalVarInstruction13267 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleLocalVarInstruction13284 = new BitSet(new long[]{0x437501D000000000L,0xBE11000000004038L,0x00B7FFF800001FFFL});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleLocalVarInstruction13305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlignment_in_entryRuleAlignment13342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlignment13353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleAlignment13391 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAlignment13406 = new BitSet(new long[]{0x0000000000000002L});

}