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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_STRING", "RULE_VAR_TYPE", "RULE_INTEGER", "RULE_INT", "RULE_DOTS", "RULE_NOBRACKET", "RULE_POINT", "RULE_ID", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'asm'", "'target'", "'datalayout'", "'triple'", "'='", "'deplibs'", "'['", "','", "']'", "'define'", "'unnamed_addr'", "'section '", "'declare'", "'(...)'", "'('", "')'", "'{'", "'}'", "'type'", "'alias'", "'<'", "'>'", "'void'", "'null'", "'label'", "'undef'", "'true'", "'false'", "'half'", "'float'", "'double'", "'x86_fp80'", "'fp128'", "'ppc_fp128'", "'getelementptr'", "'inbounds'", "'extractvalue'", "'insertvalue'", "'fence'", "'singlethread'", "'unordered'", "'monotonic'", "'aquire'", "'release'", "'acq_rel'", "'seq_cst'", "'cmpxchg'", "'volatile'", "'atomicrmw'", "'xchg'", "'add'", "'sub'", "'and'", "'nand'", "'or'", "'xor'", "'max'", "'min'", "'umax'", "'umin'", "'load'", "'atomic'", "'align'", "'store'", "'tail'", "'call'", "'zeroext'", "'signext'", "'inreg'", "'byval'", "'sret'", "'noalias'", "'nocapture'", "'nest'", "'alloca'", "'ccc'", "'fastcc'", "'coldcc'", "'x86_stdcallcc'", "'x86_fastcallcc'", "'x86_thiscallcc'", "'arm_apcscc'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", "'msp430_intrcc'", "'ptx_kernel'", "'ptx_device'", "'spir_func'", "'spir_kernel'", "'cc'", "'address_safety'", "'alignstack'", "'alwaysinline'", "'nonlazybind'", "'inlinehint'", "'naked'", "'noimplicitfloat'", "'noinline'", "'noredzone'", "'noreturn'", "'nounwind'", "'optsize'", "'readnone'", "'readonly'", "'returns_twice'", "'ssp'", "'sspreq'", "'uwtable'", "'phi'", "'landingpad'", "'personality'", "'cleanup'", "'(...)*'", "'to'", "'catch'", "'filter'", "'select'", "'va_arg'", "'extractelement'", "'insertelement'", "'shufflevector'", "'trunc'", "'zext'", "'sext'", "'fptrunc'", "'fpext'", "'fptoui'", "'fptosi'", "'uitofp'", "'sitofp'", "'ptrtoint'", "'inttoptr'", "'bitcast'", "'icmp'", "'fcmp'", "'eq'", "'ne'", "'ugt'", "'uge'", "'ult'", "'ule'", "'sgt'", "'sge'", "'slt'", "'sle'", "'oeq'", "'ogt'", "'oge'", "'olt'", "'ole'", "'one'", "'ord'", "'ueq'", "'une'", "'uno'", "'fadd'", "'fsub'", "'mul'", "'fmul'", "'udiv'", "'sdiv'", "'fdiv'", "'urem'", "'srem'", "'frem'", "'shl'", "'lshr'", "'ashr'", "'indirectbr'", "'switch'", "'invoke'", "'unwind'", "'resume'", "'unreachable'", "'ret'", "'!dbg'", "'!'", "'br'", "':'", "'default'", "'hidden'", "'protected'", "'private'", "'linker_private'", "'linker_private_weak'", "'available_externally'", "'linkonce'", "'common'", "'appending'", "'extern_weak'", "'linkonce_odr'", "'linkonce_odr_auto_hide'", "'dllimport'", "'dllexport'", "'external'", "'internal'", "'weak'", "'weak_odr'", "'!{'", "'metadata'"
    };
    public static final int RULE_ID=12;
    public static final int RULE_VAR_TYPE=6;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=15;
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
    public static final int RULE_ML_COMMENT=13;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=5;
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
    public static final int T__215=215;
    public static final int T__216=216;
    public static final int T__213=213;
    public static final int T__214=214;
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
    public static final int RULE_NOBRACKET=10;
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
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int RULE_INTEGER=7;
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
    public static final int T__57=57;
    public static final int T__199=199;
    public static final int T__58=58;
    public static final int T__198=198;
    public static final int T__51=51;
    public static final int T__197=197;
    public static final int T__52=52;
    public static final int T__196=196;
    public static final int T__53=53;
    public static final int T__195=195;
    public static final int T__54=54;
    public static final int T__194=194;
    public static final int T__193=193;
    public static final int RULE_POINT=11;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__59=59;
    public static final int RULE_INT=8;
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
    public static final int RULE_DOTS=9;
    public static final int RULE_WS=14;
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

                if ( ((LA1_0>=RULE_VAR_TYPE && LA1_0<=RULE_INT)||LA1_0==16||LA1_0==18||LA1_0==22||LA1_0==26||LA1_0==29||LA1_0==33||LA1_0==37||(LA1_0>=39 && LA1_0<=50)) ) {
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

            if ( (LA4_0==16||LA4_0==18||LA4_0==22) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_VAR_TYPE && LA4_0<=RULE_INT)||LA4_0==26||LA4_0==29||LA4_0==33||LA4_0==37||(LA4_0>=39 && LA4_0<=50)) ) {
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:163:1: ruleTopLevelEntity returns [EObject current=null] : ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' ) ) ;
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
        Token otherlv_10=null;
        Token lv_libs_11_0=null;
        Token otherlv_12=null;
        Token lv_libs_13_0=null;
        Token otherlv_14=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:166:28: ( ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:167:1: ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:167:1: ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 18:
                {
                alt7=2;
                }
                break;
            case 22:
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
                    otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleTopLevelEntity363); 

                        	newLeafNode(otherlv_0, grammarAccess.getTopLevelEntityAccess().getModuleKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleTopLevelEntity375); 

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
                    otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleTopLevelEntity417); 

                        	newLeafNode(otherlv_3, grammarAccess.getTopLevelEntityAccess().getTargetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:198:1: (otherlv_4= 'datalayout' | otherlv_5= 'triple' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==19) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==20) ) {
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
                            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleTopLevelEntity430); 

                                	newLeafNode(otherlv_4, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:203:7: otherlv_5= 'triple'
                            {
                            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleTopLevelEntity448); 

                                	newLeafNode(otherlv_5, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1());
                                

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleTopLevelEntity461); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:6: (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:6: (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:8: otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleTopLevelEntity503); 

                        	newLeafNode(otherlv_8, grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_2_0());
                        
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleTopLevelEntity515); 

                        	newLeafNode(otherlv_9, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_2_1());
                        
                    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleTopLevelEntity527); 

                        	newLeafNode(otherlv_10, grammarAccess.getTopLevelEntityAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:242:1: ( (lv_libs_11_0= RULE_STRING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:243:1: (lv_libs_11_0= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:243:1: (lv_libs_11_0= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:244:3: lv_libs_11_0= RULE_STRING
                    {
                    lv_libs_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity544); 

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

                        if ( (LA6_0==24) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:260:4: otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) )
                    	    {
                    	    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleTopLevelEntity562); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTopLevelEntityAccess().getCommaKeyword_2_4_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:264:1: ( (lv_libs_13_0= RULE_STRING ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:265:1: (lv_libs_13_0= RULE_STRING )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:265:1: (lv_libs_13_0= RULE_STRING )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:266:3: lv_libs_13_0= RULE_STRING
                    	    {
                    	    lv_libs_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity579); 

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

                    otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleTopLevelEntity598); 

                        	newLeafNode(otherlv_14, grammarAccess.getTopLevelEntityAccess().getRightSquareBracketKeyword_2_5());
                        

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
            pushFollow(FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity635);
            iv_ruleMainLevelEntity=ruleMainLevelEntity();

            state._fsp--;

             current =iv_ruleMainLevelEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainLevelEntity645); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:303:1: ruleMainLevelEntity returns [EObject current=null] : (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVar_1= ruleLocalVar ) ;
    public final EObject ruleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionHeader_0 = null;

        EObject this_LocalVar_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:306:28: ( (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVar_1= ruleLocalVar ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:307:1: (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVar_1= ruleLocalVar )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:307:1: (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVar_1= ruleLocalVar )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26||LA8_0==29) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_VAR_TYPE && LA8_0<=RULE_INT)||LA8_0==33||LA8_0==37||(LA8_0>=39 && LA8_0<=50)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:308:5: this_FunctionHeader_0= ruleFunctionHeader
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getFunctionHeaderParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleFunctionHeader_in_ruleMainLevelEntity692);
                    this_FunctionHeader_0=ruleFunctionHeader();

                    state._fsp--;

                     
                            current = this_FunctionHeader_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:318:5: this_LocalVar_1= ruleLocalVar
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getLocalVarParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLocalVar_in_ruleMainLevelEntity719);
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


    // $ANTLR start "entryRuleFunctionHeader"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:334:1: entryRuleFunctionHeader returns [EObject current=null] : iv_ruleFunctionHeader= ruleFunctionHeader EOF ;
    public final EObject entryRuleFunctionHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionHeader = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:335:2: (iv_ruleFunctionHeader= ruleFunctionHeader EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:336:2: iv_ruleFunctionHeader= ruleFunctionHeader EOF
            {
             newCompositeNode(grammarAccess.getFunctionHeaderRule()); 
            pushFollow(FOLLOW_ruleFunctionHeader_in_entryRuleFunctionHeader754);
            iv_ruleFunctionHeader=ruleFunctionHeader();

            state._fsp--;

             current =iv_ruleFunctionHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionHeader764); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:343:1: ruleFunctionHeader returns [EObject current=null] : ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | otherlv_22= '(...)' ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) ) ;
    public final EObject ruleFunctionHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_STRING_11=null;
        Token otherlv_14=null;
        Token lv_name_20_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token this_STRING_26=null;
        AntlrDatatypeRuleToken lv_returnType_5_0 = null;

        AntlrDatatypeRuleToken lv_pl_7_0 = null;

        EObject lv_body_13_0 = null;

        AntlrDatatypeRuleToken lv_returnType_19_0 = null;

        EObject lv_tList_21_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:346:28: ( ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | otherlv_22= '(...)' ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:1: ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | otherlv_22= '(...)' ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:1: ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | otherlv_22= '(...)' ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            else if ( (LA26_0==29) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:2: (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:2: (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:4: otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) )
                    {
                    otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleFunctionHeader802); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionHeaderAccess().getDefineKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:351:1: ( ruleLINKAGE )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=199 && LA9_0<=214)) ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:352:5: ruleLINKAGE
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getLINKAGEParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_ruleLINKAGE_in_ruleFunctionHeader819);
                            ruleLINKAGE();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:359:3: ( ruleVISIBILITY )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( ((LA10_0>=196 && LA10_0<=198)) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:360:5: ruleVISIBILITY
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getVISIBILITYParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader837);
                            ruleVISIBILITY();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:367:3: ( ruleCallingConv )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( ((LA11_0>=92 && LA11_0<=106)) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:368:5: ruleCallingConv
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_0_3()); 
                                
                            pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionHeader855);
                            ruleCallingConv();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:375:3: ( ruleRETURN_ATTRIBUTES )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( ((LA12_0>=83 && LA12_0<=90)) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:376:5: ruleRETURN_ATTRIBUTES
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getRETURN_ATTRIBUTESParserRuleCall_0_4()); 
                                
                            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader873);
                            ruleRETURN_ATTRIBUTES();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:383:3: ( (lv_returnType_5_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:384:1: (lv_returnType_5_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:384:1: (lv_returnType_5_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:385:3: lv_returnType_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getReturnTypeTypeParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleFunctionHeader895);
                    lv_returnType_5_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_5_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:401:2: ( (lv_name_6_0= RULE_VAR_TYPE ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:402:1: (lv_name_6_0= RULE_VAR_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:402:1: (lv_name_6_0= RULE_VAR_TYPE )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:403:3: lv_name_6_0= RULE_VAR_TYPE
                    {
                    lv_name_6_0=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader912); 

                    			newLeafNode(lv_name_6_0, grammarAccess.getFunctionHeaderAccess().getNameVAR_TYPETerminalRuleCall_0_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionHeaderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_6_0, 
                            		"VAR_TYPE");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:419:2: ( (lv_pl_7_0= ruleParameterList ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:420:1: (lv_pl_7_0= ruleParameterList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:420:1: (lv_pl_7_0= ruleParameterList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:421:3: lv_pl_7_0= ruleParameterList
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getPlParameterListParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_ruleFunctionHeader938);
                    lv_pl_7_0=ruleParameterList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"pl",
                            		lv_pl_7_0, 
                            		"ParameterList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:437:2: (otherlv_8= 'unnamed_addr' )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==27) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:437:4: otherlv_8= 'unnamed_addr'
                            {
                            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleFunctionHeader951); 

                                	newLeafNode(otherlv_8, grammarAccess.getFunctionHeaderAccess().getUnnamed_addrKeyword_0_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:441:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( ((LA14_0>=107 && LA14_0<=124)) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:442:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader970);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:449:3: (otherlv_10= 'section ' this_STRING_11= RULE_STRING )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==28) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:449:5: otherlv_10= 'section ' this_STRING_11= RULE_STRING
                            {
                            otherlv_10=(Token)match(input,28,FOLLOW_28_in_ruleFunctionHeader984); 

                                	newLeafNode(otherlv_10, grammarAccess.getFunctionHeaderAccess().getSectionKeyword_0_10_0());
                                
                            this_STRING_11=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionHeader995); 
                             
                                newLeafNode(this_STRING_11, grammarAccess.getFunctionHeaderAccess().getSTRINGTerminalRuleCall_0_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:457:3: ( ruleALIGNMENT )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==79) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:458:5: ruleALIGNMENT
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getALIGNMENTParserRuleCall_0_11()); 
                                
                            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader1013);
                            ruleALIGNMENT();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:465:3: ( (lv_body_13_0= ruleFunctionBody ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:466:1: (lv_body_13_0= ruleFunctionBody )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:466:1: (lv_body_13_0= ruleFunctionBody )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:467:3: lv_body_13_0= ruleFunctionBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getBodyFunctionBodyParserRuleCall_0_12_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionHeader1035);
                    lv_body_13_0=ruleFunctionBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:484:6: (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | otherlv_22= '(...)' ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:484:6: (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | otherlv_22= '(...)' ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:484:8: otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | otherlv_22= '(...)' ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )?
                    {
                    otherlv_14=(Token)match(input,29,FOLLOW_29_in_ruleFunctionHeader1055); 

                        	newLeafNode(otherlv_14, grammarAccess.getFunctionHeaderAccess().getDeclareKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:488:1: ( ruleLINKAGE )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=199 && LA17_0<=214)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:489:5: ruleLINKAGE
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getLINKAGEParserRuleCall_1_1()); 
                                
                            pushFollow(FOLLOW_ruleLINKAGE_in_ruleFunctionHeader1072);
                            ruleLINKAGE();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:496:3: ( ruleVISIBILITY )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( ((LA18_0>=196 && LA18_0<=198)) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:497:5: ruleVISIBILITY
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getVISIBILITYParserRuleCall_1_2()); 
                                
                            pushFollow(FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader1090);
                            ruleVISIBILITY();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:504:3: ( ruleCallingConv )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( ((LA19_0>=92 && LA19_0<=106)) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:505:5: ruleCallingConv
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_1_3()); 
                                
                            pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionHeader1108);
                            ruleCallingConv();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:512:3: ( ruleRETURN_ATTRIBUTES )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( ((LA20_0>=83 && LA20_0<=90)) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:513:5: ruleRETURN_ATTRIBUTES
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getRETURN_ATTRIBUTESParserRuleCall_1_4()); 
                                
                            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader1126);
                            ruleRETURN_ATTRIBUTES();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:520:3: ( (lv_returnType_19_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:521:1: (lv_returnType_19_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:521:1: (lv_returnType_19_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:522:3: lv_returnType_19_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getReturnTypeTypeParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleFunctionHeader1148);
                    lv_returnType_19_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_19_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:538:2: ( (lv_name_20_0= RULE_VAR_TYPE ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:539:1: (lv_name_20_0= RULE_VAR_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:539:1: (lv_name_20_0= RULE_VAR_TYPE )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:540:3: lv_name_20_0= RULE_VAR_TYPE
                    {
                    lv_name_20_0=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader1165); 

                    			newLeafNode(lv_name_20_0, grammarAccess.getFunctionHeaderAccess().getNameVAR_TYPETerminalRuleCall_1_6_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getFunctionHeaderRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"name",
                            		lv_name_20_0, 
                            		"VAR_TYPE");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:556:2: ( ( (lv_tList_21_0= ruleTypeList ) ) | otherlv_22= '(...)' )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==31) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==30) ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:556:3: ( (lv_tList_21_0= ruleTypeList ) )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:556:3: ( (lv_tList_21_0= ruleTypeList ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:557:1: (lv_tList_21_0= ruleTypeList )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:557:1: (lv_tList_21_0= ruleTypeList )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:558:3: lv_tList_21_0= ruleTypeList
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getTListTypeListParserRuleCall_1_7_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeList_in_ruleFunctionHeader1192);
                            lv_tList_21_0=ruleTypeList();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionHeaderRule());
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
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:575:7: otherlv_22= '(...)'
                            {
                            otherlv_22=(Token)match(input,30,FOLLOW_30_in_ruleFunctionHeader1210); 

                                	newLeafNode(otherlv_22, grammarAccess.getFunctionHeaderAccess().getLeftParenthesisFullStopFullStopFullStopRightParenthesisKeyword_1_7_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:579:2: (otherlv_23= 'unnamed_addr' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==27) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:579:4: otherlv_23= 'unnamed_addr'
                            {
                            otherlv_23=(Token)match(input,27,FOLLOW_27_in_ruleFunctionHeader1224); 

                                	newLeafNode(otherlv_23, grammarAccess.getFunctionHeaderAccess().getUnnamed_addrKeyword_1_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:583:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0>=107 && LA23_0<=124)) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:584:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader1243);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:591:3: (otherlv_25= 'section ' this_STRING_26= RULE_STRING )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==28) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:591:5: otherlv_25= 'section ' this_STRING_26= RULE_STRING
                            {
                            otherlv_25=(Token)match(input,28,FOLLOW_28_in_ruleFunctionHeader1257); 

                                	newLeafNode(otherlv_25, grammarAccess.getFunctionHeaderAccess().getSectionKeyword_1_10_0());
                                
                            this_STRING_26=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionHeader1268); 
                             
                                newLeafNode(this_STRING_26, grammarAccess.getFunctionHeaderAccess().getSTRINGTerminalRuleCall_1_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:599:3: ( ruleALIGNMENT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==79) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:600:5: ruleALIGNMENT
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getALIGNMENTParserRuleCall_1_11()); 
                                
                            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader1286);
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
    // $ANTLR end "ruleFunctionHeader"


    // $ANTLR start "entryRuleParameterList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:615:1: entryRuleParameterList returns [String current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final String entryRuleParameterList() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:616:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:617:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList1325);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList1336); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:624:1: ruleParameterList returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '(' ( ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? this_Type_4= ruleType ) (kw= ',' ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType ) )* )? kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleParameterList() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VAR_TYPE_1=null;
        Token this_VAR_TYPE_6=null;
        AntlrDatatypeRuleToken this_B_TYPE_2 = null;

        AntlrDatatypeRuleToken this_RETURN_ATTRIBUTES_3 = null;

        AntlrDatatypeRuleToken this_Type_4 = null;

        AntlrDatatypeRuleToken this_B_TYPE_7 = null;

        AntlrDatatypeRuleToken this_RETURN_ATTRIBUTES_8 = null;

        AntlrDatatypeRuleToken this_Type_9 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:627:28: ( (kw= '(' ( ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? this_Type_4= ruleType ) (kw= ',' ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType ) )* )? kw= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:1: (kw= '(' ( ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? this_Type_4= ruleType ) (kw= ',' ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType ) )* )? kw= ')' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:1: (kw= '(' ( ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? this_Type_4= ruleType ) (kw= ',' ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType ) )* )? kw= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:629:2: kw= '(' ( ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? this_Type_4= ruleType ) (kw= ',' ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType ) )* )? kw= ')'
            {
            kw=(Token)match(input,31,FOLLOW_31_in_ruleParameterList1374); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_0()); 
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:634:1: ( ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? this_Type_4= ruleType ) (kw= ',' ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType ) )* )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_VAR_TYPE && LA32_0<=RULE_INT)||(LA32_0>=39 && LA32_0<=50)) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:634:2: ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? this_Type_4= ruleType ) (kw= ',' ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:634:2: ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? this_Type_4= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:634:3: (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? this_Type_4= ruleType
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:634:3: (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE )
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==RULE_VAR_TYPE) ) {
                        alt27=1;
                    }
                    else if ( ((LA27_0>=RULE_INTEGER && LA27_0<=RULE_INT)||(LA27_0>=39 && LA27_0<=50)) ) {
                        alt27=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 27, 0, input);

                        throw nvae;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:634:8: this_VAR_TYPE_1= RULE_VAR_TYPE
                            {
                            this_VAR_TYPE_1=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleParameterList1392); 

                            		current.merge(this_VAR_TYPE_1);
                                
                             
                                newLeafNode(this_VAR_TYPE_1, grammarAccess.getParameterListAccess().getVAR_TYPETerminalRuleCall_1_0_0_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:643:5: this_B_TYPE_2= ruleB_TYPE
                            {
                             
                                    newCompositeNode(grammarAccess.getParameterListAccess().getB_TYPEParserRuleCall_1_0_0_1()); 
                                
                            pushFollow(FOLLOW_ruleB_TYPE_in_ruleParameterList1425);
                            this_B_TYPE_2=ruleB_TYPE();

                            state._fsp--;


                            		current.merge(this_B_TYPE_2);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:653:2: (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( ((LA28_0>=83 && LA28_0<=90)) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:654:5: this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES
                            {
                             
                                    newCompositeNode(grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_0_1()); 
                                
                            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleParameterList1454);
                            this_RETURN_ATTRIBUTES_3=ruleRETURN_ATTRIBUTES();

                            state._fsp--;


                            		current.merge(this_RETURN_ATTRIBUTES_3);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getParameterListAccess().getTypeParserRuleCall_1_0_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleParameterList1483);
                    this_Type_4=ruleType();

                    state._fsp--;


                    		current.merge(this_Type_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:675:2: (kw= ',' ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType ) )*
                    loop31:
                    do {
                        int alt31=2;
                        int LA31_0 = input.LA(1);

                        if ( (LA31_0==24) ) {
                            alt31=1;
                        }


                        switch (alt31) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:676:2: kw= ',' ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType )
                    	    {
                    	    kw=(Token)match(input,24,FOLLOW_24_in_ruleParameterList1503); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getParameterListAccess().getCommaKeyword_1_1_0()); 
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:681:1: ( (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:681:2: (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )? this_Type_9= ruleType
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:681:2: (this_VAR_TYPE_6= RULE_VAR_TYPE | this_B_TYPE_7= ruleB_TYPE )
                    	    int alt29=2;
                    	    int LA29_0 = input.LA(1);

                    	    if ( (LA29_0==RULE_VAR_TYPE) ) {
                    	        alt29=1;
                    	    }
                    	    else if ( ((LA29_0>=RULE_INTEGER && LA29_0<=RULE_INT)||(LA29_0>=39 && LA29_0<=50)) ) {
                    	        alt29=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 29, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt29) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:681:7: this_VAR_TYPE_6= RULE_VAR_TYPE
                    	            {
                    	            this_VAR_TYPE_6=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleParameterList1520); 

                    	            		current.merge(this_VAR_TYPE_6);
                    	                
                    	             
                    	                newLeafNode(this_VAR_TYPE_6, grammarAccess.getParameterListAccess().getVAR_TYPETerminalRuleCall_1_1_1_0_0()); 
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:690:5: this_B_TYPE_7= ruleB_TYPE
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getParameterListAccess().getB_TYPEParserRuleCall_1_1_1_0_1()); 
                    	                
                    	            pushFollow(FOLLOW_ruleB_TYPE_in_ruleParameterList1553);
                    	            this_B_TYPE_7=ruleB_TYPE();

                    	            state._fsp--;


                    	            		current.merge(this_B_TYPE_7);
                    	                
                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;

                    	    }

                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:700:2: (this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES )?
                    	    int alt30=2;
                    	    int LA30_0 = input.LA(1);

                    	    if ( ((LA30_0>=83 && LA30_0<=90)) ) {
                    	        alt30=1;
                    	    }
                    	    switch (alt30) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:701:5: this_RETURN_ATTRIBUTES_8= ruleRETURN_ATTRIBUTES
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getParameterListAccess().getRETURN_ATTRIBUTESParserRuleCall_1_1_1_1()); 
                    	                
                    	            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleParameterList1582);
                    	            this_RETURN_ATTRIBUTES_8=ruleRETURN_ATTRIBUTES();

                    	            state._fsp--;


                    	            		current.merge(this_RETURN_ATTRIBUTES_8);
                    	                
                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;

                    	    }

                    	     
                    	            newCompositeNode(grammarAccess.getParameterListAccess().getTypeParserRuleCall_1_1_1_2()); 
                    	        
                    	    pushFollow(FOLLOW_ruleType_in_ruleParameterList1611);
                    	    this_Type_9=ruleType();

                    	    state._fsp--;


                    	    		current.merge(this_Type_9);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop31;
                        }
                    } while (true);


                    }
                    break;

            }

            kw=(Token)match(input,32,FOLLOW_32_in_ruleParameterList1634); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_2()); 
                

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


    // $ANTLR start "entryRuleTypeList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:736:1: entryRuleTypeList returns [EObject current=null] : iv_ruleTypeList= ruleTypeList EOF ;
    public final EObject entryRuleTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:737:2: (iv_ruleTypeList= ruleTypeList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:738:2: iv_ruleTypeList= ruleTypeList EOF
            {
             newCompositeNode(grammarAccess.getTypeListRule()); 
            pushFollow(FOLLOW_ruleTypeList_in_entryRuleTypeList1674);
            iv_ruleTypeList=ruleTypeList();

            state._fsp--;

             current =iv_ruleTypeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeList1684); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:745:1: ruleTypeList returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_types_2_0 = null;

        AntlrDatatypeRuleToken lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:748:28: ( ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:749:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:749:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:749:2: () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:749:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:750:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeListAccess().getTypeListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleTypeList1730); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:759:1: ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( ((LA34_0>=RULE_VAR_TYPE && LA34_0<=RULE_INT)||LA34_0==33||LA34_0==37||(LA34_0>=39 && LA34_0<=50)) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:759:2: ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:759:2: ( (lv_types_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:760:1: (lv_types_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:760:1: (lv_types_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:761:3: lv_types_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeListAccess().getTypesTypeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTypeList1752);
                    lv_types_2_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeListRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_2_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:777:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==24) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:777:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleTypeList1765); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTypeListAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:781:1: ( (lv_types_4_0= ruleType ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:782:1: (lv_types_4_0= ruleType )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:782:1: (lv_types_4_0= ruleType )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:783:3: lv_types_4_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeListAccess().getTypesTypeParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleTypeList1786);
                    	    lv_types_4_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getTypeListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_4_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,32,FOLLOW_32_in_ruleTypeList1802); 

                	newLeafNode(otherlv_5, grammarAccess.getTypeListAccess().getRightParenthesisKeyword_3());
                

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


    // $ANTLR start "entryRuleAggregate"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:811:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:812:2: (iv_ruleAggregate= ruleAggregate EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:813:2: iv_ruleAggregate= ruleAggregate EOF
            {
             newCompositeNode(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_ruleAggregate_in_entryRuleAggregate1838);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;

             current =iv_ruleAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregate1848); 

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
    // $ANTLR end "entryRuleAggregate"


    // $ANTLR start "ruleAggregate"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:820:1: ruleAggregate returns [EObject current=null] : (otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_agg_1_0 = null;

        AntlrDatatypeRuleToken lv_agg_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:823:28: ( (otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:824:1: (otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:824:1: (otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:824:3: otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleAggregate1885); 

                	newLeafNode(otherlv_0, grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:828:1: ( (lv_agg_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:829:1: (lv_agg_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:829:1: (lv_agg_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:830:3: lv_agg_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAggregateAccess().getAggTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAggregate1906);
            lv_agg_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	        }
                   		add(
                   			current, 
                   			"agg",
                    		lv_agg_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:846:2: (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:846:4: otherlv_2= ',' ( (lv_agg_3_0= ruleType ) )
            {
            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAggregate1919); 

                	newLeafNode(otherlv_2, grammarAccess.getAggregateAccess().getCommaKeyword_2_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:850:1: ( (lv_agg_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:851:1: (lv_agg_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:851:1: (lv_agg_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:852:3: lv_agg_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAggregateAccess().getAggTypeParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAggregate1940);
            lv_agg_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAggregateRule());
            	        }
                   		add(
                   			current, 
                   			"agg",
                    		lv_agg_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

            otherlv_4=(Token)match(input,34,FOLLOW_34_in_ruleAggregate1953); 

                	newLeafNode(otherlv_4, grammarAccess.getAggregateAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleAggregate"


    // $ANTLR start "entryRuleLocalVar"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:880:1: entryRuleLocalVar returns [EObject current=null] : iv_ruleLocalVar= ruleLocalVar EOF ;
    public final EObject entryRuleLocalVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVar = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:881:2: (iv_ruleLocalVar= ruleLocalVar EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:882:2: iv_ruleLocalVar= ruleLocalVar EOF
            {
             newCompositeNode(grammarAccess.getLocalVarRule()); 
            pushFollow(FOLLOW_ruleLocalVar_in_entryRuleLocalVar1989);
            iv_ruleLocalVar=ruleLocalVar();

            state._fsp--;

             current =iv_ruleLocalVar; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVar1999); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:889:1: ruleLocalVar returns [EObject current=null] : ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) ) ) ;
    public final EObject ruleLocalVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_instr_4_0 = null;

        EObject lv_alias_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:892:28: ( ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:893:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:893:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:893:2: ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:893:2: ( (lv_name_0_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:894:1: (lv_name_0_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:894:1: (lv_name_0_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:895:3: lv_name_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLocalVarAccess().getNameTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLocalVar2045);
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

            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleLocalVar2057); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalVarAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:915:1: ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt35=1;
                }
                break;
            case RULE_VAR_TYPE:
            case RULE_INTEGER:
            case RULE_INT:
            case 33:
            case 37:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 53:
            case 54:
            case 55:
            case 63:
            case 64:
            case 65:
            case 67:
            case 68:
            case 69:
            case 71:
            case 72:
            case 77:
            case 80:
            case 81:
            case 82:
            case 91:
            case 125:
            case 126:
            case 133:
            case 134:
            case 135:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 145:
            case 146:
            case 147:
            case 148:
            case 149:
            case 150:
            case 151:
            case 172:
            case 173:
            case 174:
            case 175:
            case 176:
            case 177:
            case 178:
            case 179:
            case 180:
            case 181:
            case 182:
            case 183:
            case 184:
                {
                alt35=2;
                }
                break;
            case 36:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:915:2: (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:915:2: (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:915:4: otherlv_2= 'type' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleLocalVar2071); 

                        	newLeafNode(otherlv_2, grammarAccess.getLocalVarAccess().getTypeKeyword_2_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:919:1: ( (lv_type_3_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:920:1: (lv_type_3_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:920:1: (lv_type_3_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:921:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVarAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLocalVar2092);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVarRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:938:6: ( (lv_instr_4_0= ruleInstruction ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:938:6: ( (lv_instr_4_0= ruleInstruction ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:939:1: (lv_instr_4_0= ruleInstruction )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:939:1: (lv_instr_4_0= ruleInstruction )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:940:3: lv_instr_4_0= ruleInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVarAccess().getInstrInstructionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstruction_in_ruleLocalVar2120);
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
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:957:6: ( (lv_alias_5_0= ruleAlias ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:957:6: ( (lv_alias_5_0= ruleAlias ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:958:1: (lv_alias_5_0= ruleAlias )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:958:1: (lv_alias_5_0= ruleAlias )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:959:3: lv_alias_5_0= ruleAlias
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVarAccess().getAliasAliasParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAlias_in_ruleLocalVar2147);
                    lv_alias_5_0=ruleAlias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVarRule());
                    	        }
                           		set(
                           			current, 
                           			"alias",
                            		lv_alias_5_0, 
                            		"Alias");
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


    // $ANTLR start "entryRuleAlias"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:983:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:984:2: (iv_ruleAlias= ruleAlias EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:985:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias2184);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias2194); 

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
    // $ANTLR end "entryRuleAlias"


    // $ANTLR start "ruleAlias"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:992:1: ruleAlias returns [EObject current=null] : (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_aliasee_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:995:28: ( (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:996:1: (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:996:1: (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:996:3: otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleAlias2231); 

                	newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getAliasKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1000:1: ( ruleALIAS_LINKAGE )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=211 && LA36_0<=214)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1001:5: ruleALIAS_LINKAGE
                    {
                     
                            newCompositeNode(grammarAccess.getAliasAccess().getALIAS_LINKAGEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_ruleAlias2248);
                    ruleALIAS_LINKAGE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1008:3: ( ruleVISIBILITY )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=196 && LA37_0<=198)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1009:5: ruleVISIBILITY
                    {
                     
                            newCompositeNode(grammarAccess.getAliasAccess().getVISIBILITYParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVISIBILITY_in_ruleAlias2266);
                    ruleVISIBILITY();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1016:3: ( (lv_type_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1017:1: (lv_type_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1017:1: (lv_type_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1018:3: lv_type_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAliasAccess().getTypeTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAlias2288);
            lv_type_3_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAliasRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1034:2: ( (lv_aliasee_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1035:1: (lv_aliasee_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1035:1: (lv_aliasee_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1036:3: lv_aliasee_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAliasAccess().getAliaseeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlias2309);
            lv_aliasee_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAliasRule());
            	        }
                   		set(
                   			current, 
                   			"aliasee",
                    		lv_aliasee_4_0, 
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
    // $ANTLR end "ruleAlias"


    // $ANTLR start "entryRuleType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1060:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1061:2: (iv_ruleType= ruleType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1062:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2346);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2357); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1069:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_TYPE_1=null;
        AntlrDatatypeRuleToken this_StructType_0 = null;

        AntlrDatatypeRuleToken this_B_TYPE_2 = null;

        AntlrDatatypeRuleToken this_RETURN_ATTRIBUTES_3 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1072:28: ( ( (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1073:1: ( (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1073:1: ( (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1073:2: (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1073:2: (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 33:
            case 37:
                {
                alt38=1;
                }
                break;
            case RULE_VAR_TYPE:
                {
                alt38=2;
                }
                break;
            case RULE_INTEGER:
            case RULE_INT:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1074:5: this_StructType_0= ruleStructType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleStructType_in_ruleType2405);
                    this_StructType_0=ruleStructType();

                    state._fsp--;


                    		current.merge(this_StructType_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1085:10: this_VAR_TYPE_1= RULE_VAR_TYPE
                    {
                    this_VAR_TYPE_1=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleType2431); 

                    		current.merge(this_VAR_TYPE_1);
                        
                     
                        newLeafNode(this_VAR_TYPE_1, grammarAccess.getTypeAccess().getVAR_TYPETerminalRuleCall_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1094:5: this_B_TYPE_2= ruleB_TYPE
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getB_TYPEParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleB_TYPE_in_ruleType2464);
                    this_B_TYPE_2=ruleB_TYPE();

                    state._fsp--;


                    		current.merge(this_B_TYPE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1104:2: (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=83 && LA39_0<=90)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1105:5: this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRETURN_ATTRIBUTESParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleType2493);
                    this_RETURN_ATTRIBUTES_3=ruleRETURN_ATTRIBUTES();

                    state._fsp--;


                    		current.merge(this_RETURN_ATTRIBUTES_3);
                        
                     
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleTypeAndValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1123:1: entryRuleTypeAndValue returns [EObject current=null] : iv_ruleTypeAndValue= ruleTypeAndValue EOF ;
    public final EObject entryRuleTypeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAndValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1124:2: (iv_ruleTypeAndValue= ruleTypeAndValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1125:2: iv_ruleTypeAndValue= ruleTypeAndValue EOF
            {
             newCompositeNode(grammarAccess.getTypeAndValueRule()); 
            pushFollow(FOLLOW_ruleTypeAndValue_in_entryRuleTypeAndValue2540);
            iv_ruleTypeAndValue=ruleTypeAndValue();

            state._fsp--;

             current =iv_ruleTypeAndValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeAndValue2550); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1132:1: ruleTypeAndValue returns [EObject current=null] : ( ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) ) | ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) ) ) ;
    public final EObject ruleTypeAndValue() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        AntlrDatatypeRuleToken lv_type_0_2 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_aggregate_3_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1135:28: ( ( ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) ) | ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1136:1: ( ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) ) | ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1136:1: ( ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) ) | ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_VAR_TYPE && LA42_0<=RULE_INT)||(LA42_0>=39 && LA42_0<=50)) ) {
                alt42=1;
            }
            else if ( (LA42_0==33) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1136:2: ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1136:2: ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1136:3: ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1136:3: ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1137:1: ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1137:1: ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1138:1: (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1138:1: (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE )
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==RULE_VAR_TYPE) ) {
                        alt40=1;
                    }
                    else if ( ((LA40_0>=RULE_INTEGER && LA40_0<=RULE_INT)||(LA40_0>=39 && LA40_0<=50)) ) {
                        alt40=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 40, 0, input);

                        throw nvae;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1139:3: lv_type_0_1= RULE_VAR_TYPE
                            {
                            lv_type_0_1=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleTypeAndValue2595); 

                            			newLeafNode(lv_type_0_1, grammarAccess.getTypeAndValueAccess().getTypeVAR_TYPETerminalRuleCall_0_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getTypeAndValueRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"type",
                                    		lv_type_0_1, 
                                    		"VAR_TYPE");
                            	    

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1154:8: lv_type_0_2= ruleB_TYPE
                            {
                             
                            	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getTypeB_TYPEParserRuleCall_0_0_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleB_TYPE_in_ruleTypeAndValue2619);
                            lv_type_0_2=ruleB_TYPE();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getTypeAndValueRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_0_2, 
                                    		"B_TYPE");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1172:2: ( ruleRETURN_ATTRIBUTES )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=83 && LA41_0<=90)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1173:5: ruleRETURN_ATTRIBUTES
                            {
                             
                                    newCompositeNode(grammarAccess.getTypeAndValueAccess().getRETURN_ATTRIBUTESParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleTypeAndValue2639);
                            ruleRETURN_ATTRIBUTES();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1180:3: ( (lv_value_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1181:1: (lv_value_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1181:1: (lv_value_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:3: lv_value_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getValueTypeParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTypeAndValue2661);
                    lv_value_2_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeAndValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1199:6: ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1199:6: ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1199:7: ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1199:7: ( (lv_aggregate_3_0= ruleAggregate ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1200:1: (lv_aggregate_3_0= ruleAggregate )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1200:1: (lv_aggregate_3_0= ruleAggregate )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1201:3: lv_aggregate_3_0= ruleAggregate
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getAggregateAggregateParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAggregate_in_ruleTypeAndValue2690);
                    lv_aggregate_3_0=ruleAggregate();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeAndValueRule());
                    	        }
                           		set(
                           			current, 
                           			"aggregate",
                            		lv_aggregate_3_0, 
                            		"Aggregate");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1217:2: ( (lv_value_4_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1218:1: (lv_value_4_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1218:1: (lv_value_4_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1219:3: lv_value_4_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getValueTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTypeAndValue2711);
                    lv_value_4_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeAndValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_0, 
                            		"Type");
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
    // $ANTLR end "ruleTypeAndValue"


    // $ANTLR start "entryRuleStructType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1243:1: entryRuleStructType returns [String current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final String entryRuleStructType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1244:2: (iv_ruleStructType= ruleStructType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1245:2: iv_ruleStructType= ruleStructType EOF
            {
             newCompositeNode(grammarAccess.getStructTypeRule()); 
            pushFollow(FOLLOW_ruleStructType_in_entryRuleStructType2749);
            iv_ruleStructType=ruleStructType();

            state._fsp--;

             current =iv_ruleStructType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructType2760); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1252:1: ruleStructType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' ) | (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' ) ) ;
    public final AntlrDatatypeRuleToken ruleStructType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_VAR_TYPE_1=null;
        Token this_VAR_TYPE_4=null;
        Token this_VAR_TYPE_9=null;
        Token this_VAR_TYPE_12=null;
        AntlrDatatypeRuleToken this_B_TYPE_2 = null;

        AntlrDatatypeRuleToken this_B_TYPE_5 = null;

        AntlrDatatypeRuleToken this_B_TYPE_10 = null;

        AntlrDatatypeRuleToken this_B_TYPE_13 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1255:28: ( ( (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' ) | (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1256:1: ( (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' ) | (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1256:1: ( (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' ) | (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==33) ) {
                alt51=1;
            }
            else if ( (LA51_0==37) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1256:2: (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1256:2: (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1257:2: kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleStructType2799); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_0_0()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1262:1: ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=RULE_VAR_TYPE && LA46_0<=RULE_INT)||(LA46_0>=39 && LA46_0<=50)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1262:2: (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1262:2: (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE )
                            int alt43=2;
                            int LA43_0 = input.LA(1);

                            if ( (LA43_0==RULE_VAR_TYPE) ) {
                                alt43=1;
                            }
                            else if ( ((LA43_0>=RULE_INTEGER && LA43_0<=RULE_INT)||(LA43_0>=39 && LA43_0<=50)) ) {
                                alt43=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 43, 0, input);

                                throw nvae;
                            }
                            switch (alt43) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1262:7: this_VAR_TYPE_1= RULE_VAR_TYPE
                                    {
                                    this_VAR_TYPE_1=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType2816); 

                                    		current.merge(this_VAR_TYPE_1);
                                        
                                     
                                        newLeafNode(this_VAR_TYPE_1, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_0_1_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1271:5: this_B_TYPE_2= ruleB_TYPE
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStructTypeAccess().getB_TYPEParserRuleCall_0_1_0_1()); 
                                        
                                    pushFollow(FOLLOW_ruleB_TYPE_in_ruleStructType2849);
                                    this_B_TYPE_2=ruleB_TYPE();

                                    state._fsp--;


                                    		current.merge(this_B_TYPE_2);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1281:2: (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )*
                            loop45:
                            do {
                                int alt45=2;
                                int LA45_0 = input.LA(1);

                                if ( (LA45_0==24) ) {
                                    alt45=1;
                                }


                                switch (alt45) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1282:2: kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE )
                            	    {
                            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleStructType2869); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getStructTypeAccess().getCommaKeyword_0_1_1_0()); 
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1287:1: (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE )
                            	    int alt44=2;
                            	    int LA44_0 = input.LA(1);

                            	    if ( (LA44_0==RULE_VAR_TYPE) ) {
                            	        alt44=1;
                            	    }
                            	    else if ( ((LA44_0>=RULE_INTEGER && LA44_0<=RULE_INT)||(LA44_0>=39 && LA44_0<=50)) ) {
                            	        alt44=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 44, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt44) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1287:6: this_VAR_TYPE_4= RULE_VAR_TYPE
                            	            {
                            	            this_VAR_TYPE_4=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType2885); 

                            	            		current.merge(this_VAR_TYPE_4);
                            	                
                            	             
                            	                newLeafNode(this_VAR_TYPE_4, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_0_1_1_1_0()); 
                            	                

                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1296:5: this_B_TYPE_5= ruleB_TYPE
                            	            {
                            	             
                            	                    newCompositeNode(grammarAccess.getStructTypeAccess().getB_TYPEParserRuleCall_0_1_1_1_1()); 
                            	                
                            	            pushFollow(FOLLOW_ruleB_TYPE_in_ruleStructType2918);
                            	            this_B_TYPE_5=ruleB_TYPE();

                            	            state._fsp--;


                            	            		current.merge(this_B_TYPE_5);
                            	                
                            	             
                            	                    afterParserOrEnumRuleCall();
                            	                

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop45;
                                }
                            } while (true);


                            }
                            break;

                    }

                    kw=(Token)match(input,34,FOLLOW_34_in_ruleStructType2941); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1313:6: (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1313:6: (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1314:2: kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleStructType2962); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLessThanSignKeyword_1_0()); 
                        
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleStructType2975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1_1()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1325:1: ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( ((LA50_0>=RULE_VAR_TYPE && LA50_0<=RULE_INT)||(LA50_0>=39 && LA50_0<=50)) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1325:2: (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1325:2: (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE )
                            int alt47=2;
                            int LA47_0 = input.LA(1);

                            if ( (LA47_0==RULE_VAR_TYPE) ) {
                                alt47=1;
                            }
                            else if ( ((LA47_0>=RULE_INTEGER && LA47_0<=RULE_INT)||(LA47_0>=39 && LA47_0<=50)) ) {
                                alt47=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 47, 0, input);

                                throw nvae;
                            }
                            switch (alt47) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1325:7: this_VAR_TYPE_9= RULE_VAR_TYPE
                                    {
                                    this_VAR_TYPE_9=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType2992); 

                                    		current.merge(this_VAR_TYPE_9);
                                        
                                     
                                        newLeafNode(this_VAR_TYPE_9, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_1_2_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1334:5: this_B_TYPE_10= ruleB_TYPE
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStructTypeAccess().getB_TYPEParserRuleCall_1_2_0_1()); 
                                        
                                    pushFollow(FOLLOW_ruleB_TYPE_in_ruleStructType3025);
                                    this_B_TYPE_10=ruleB_TYPE();

                                    state._fsp--;


                                    		current.merge(this_B_TYPE_10);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1344:2: (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==24) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1345:2: kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE )
                            	    {
                            	    kw=(Token)match(input,24,FOLLOW_24_in_ruleStructType3045); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getStructTypeAccess().getCommaKeyword_1_2_1_0()); 
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1350:1: (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE )
                            	    int alt48=2;
                            	    int LA48_0 = input.LA(1);

                            	    if ( (LA48_0==RULE_VAR_TYPE) ) {
                            	        alt48=1;
                            	    }
                            	    else if ( ((LA48_0>=RULE_INTEGER && LA48_0<=RULE_INT)||(LA48_0>=39 && LA48_0<=50)) ) {
                            	        alt48=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 48, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt48) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1350:6: this_VAR_TYPE_12= RULE_VAR_TYPE
                            	            {
                            	            this_VAR_TYPE_12=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType3061); 

                            	            		current.merge(this_VAR_TYPE_12);
                            	                
                            	             
                            	                newLeafNode(this_VAR_TYPE_12, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_1_2_1_1_0()); 
                            	                

                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1359:5: this_B_TYPE_13= ruleB_TYPE
                            	            {
                            	             
                            	                    newCompositeNode(grammarAccess.getStructTypeAccess().getB_TYPEParserRuleCall_1_2_1_1_1()); 
                            	                
                            	            pushFollow(FOLLOW_ruleB_TYPE_in_ruleStructType3094);
                            	            this_B_TYPE_13=ruleB_TYPE();

                            	            state._fsp--;


                            	            		current.merge(this_B_TYPE_13);
                            	                
                            	             
                            	                    afterParserOrEnumRuleCall();
                            	                

                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop49;
                                }
                            } while (true);


                            }
                            break;

                    }

                    kw=(Token)match(input,34,FOLLOW_34_in_ruleStructType3117); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_1_3()); 
                        
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleStructType3130); 

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


    // $ANTLR start "entryRuleB_TYPE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1389:1: entryRuleB_TYPE returns [String current=null] : iv_ruleB_TYPE= ruleB_TYPE EOF ;
    public final String entryRuleB_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleB_TYPE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1390:2: (iv_ruleB_TYPE= ruleB_TYPE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1391:2: iv_ruleB_TYPE= ruleB_TYPE EOF
            {
             newCompositeNode(grammarAccess.getB_TYPERule()); 
            pushFollow(FOLLOW_ruleB_TYPE_in_entryRuleB_TYPE3172);
            iv_ruleB_TYPE=ruleB_TYPE();

            state._fsp--;

             current =iv_ruleB_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleB_TYPE3183); 

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
    // $ANTLR end "entryRuleB_TYPE"


    // $ANTLR start "ruleB_TYPE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1398:1: ruleB_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= RULE_INTEGER | this_F_POINT_1= ruleF_POINT | this_BASIC_TYPE_2= ruleBASIC_TYPE | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleB_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_0=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_F_POINT_1 = null;

        AntlrDatatypeRuleToken this_BASIC_TYPE_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1401:28: ( (this_INTEGER_0= RULE_INTEGER | this_F_POINT_1= ruleF_POINT | this_BASIC_TYPE_2= ruleBASIC_TYPE | this_INT_3= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1402:1: (this_INTEGER_0= RULE_INTEGER | this_F_POINT_1= ruleF_POINT | this_BASIC_TYPE_2= ruleBASIC_TYPE | this_INT_3= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1402:1: (this_INTEGER_0= RULE_INTEGER | this_F_POINT_1= ruleF_POINT | this_BASIC_TYPE_2= ruleBASIC_TYPE | this_INT_3= RULE_INT )
            int alt52=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt52=1;
                }
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                {
                alt52=2;
                }
                break;
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt52=3;
                }
                break;
            case RULE_INT:
                {
                alt52=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }

            switch (alt52) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1402:6: this_INTEGER_0= RULE_INTEGER
                    {
                    this_INTEGER_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleB_TYPE3223); 

                    		current.merge(this_INTEGER_0);
                        
                     
                        newLeafNode(this_INTEGER_0, grammarAccess.getB_TYPEAccess().getINTEGERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1411:5: this_F_POINT_1= ruleF_POINT
                    {
                     
                            newCompositeNode(grammarAccess.getB_TYPEAccess().getF_POINTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleF_POINT_in_ruleB_TYPE3256);
                    this_F_POINT_1=ruleF_POINT();

                    state._fsp--;


                    		current.merge(this_F_POINT_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1423:5: this_BASIC_TYPE_2= ruleBASIC_TYPE
                    {
                     
                            newCompositeNode(grammarAccess.getB_TYPEAccess().getBASIC_TYPEParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBASIC_TYPE_in_ruleB_TYPE3289);
                    this_BASIC_TYPE_2=ruleBASIC_TYPE();

                    state._fsp--;


                    		current.merge(this_BASIC_TYPE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1434:10: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleB_TYPE3315); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getB_TYPEAccess().getINTTerminalRuleCall_3()); 
                        

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
    // $ANTLR end "ruleB_TYPE"


    // $ANTLR start "entryRuleBASIC_TYPE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1449:1: entryRuleBASIC_TYPE returns [String current=null] : iv_ruleBASIC_TYPE= ruleBASIC_TYPE EOF ;
    public final String entryRuleBASIC_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBASIC_TYPE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1450:2: (iv_ruleBASIC_TYPE= ruleBASIC_TYPE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1451:2: iv_ruleBASIC_TYPE= ruleBASIC_TYPE EOF
            {
             newCompositeNode(grammarAccess.getBASIC_TYPERule()); 
            pushFollow(FOLLOW_ruleBASIC_TYPE_in_entryRuleBASIC_TYPE3361);
            iv_ruleBASIC_TYPE=ruleBASIC_TYPE();

            state._fsp--;

             current =iv_ruleBASIC_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBASIC_TYPE3372); 

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
    // $ANTLR end "entryRuleBASIC_TYPE"


    // $ANTLR start "ruleBASIC_TYPE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1458:1: ruleBASIC_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBASIC_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1461:28: ( (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1462:1: (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1462:1: (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' )
            int alt53=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt53=1;
                }
                break;
            case 40:
                {
                alt53=2;
                }
                break;
            case 41:
                {
                alt53=3;
                }
                break;
            case 42:
                {
                alt53=4;
                }
                break;
            case 43:
                {
                alt53=5;
                }
                break;
            case 44:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1463:2: kw= 'void'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleBASIC_TYPE3410); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getVoidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1470:2: kw= 'null'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleBASIC_TYPE3429); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getNullKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1477:2: kw= 'label'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleBASIC_TYPE3448); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getLabelKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1484:2: kw= 'undef'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleBASIC_TYPE3467); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getUndefKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1491:2: kw= 'true'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBASIC_TYPE3486); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getTrueKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1498:2: kw= 'false'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleBASIC_TYPE3505); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getFalseKeyword_5()); 
                        

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
    // $ANTLR end "ruleBASIC_TYPE"


    // $ANTLR start "entryRuleF_POINT"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1511:1: entryRuleF_POINT returns [String current=null] : iv_ruleF_POINT= ruleF_POINT EOF ;
    public final String entryRuleF_POINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleF_POINT = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1512:2: (iv_ruleF_POINT= ruleF_POINT EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1513:2: iv_ruleF_POINT= ruleF_POINT EOF
            {
             newCompositeNode(grammarAccess.getF_POINTRule()); 
            pushFollow(FOLLOW_ruleF_POINT_in_entryRuleF_POINT3546);
            iv_ruleF_POINT=ruleF_POINT();

            state._fsp--;

             current =iv_ruleF_POINT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleF_POINT3557); 

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
    // $ANTLR end "entryRuleF_POINT"


    // $ANTLR start "ruleF_POINT"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1520:1: ruleF_POINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' ) ;
    public final AntlrDatatypeRuleToken ruleF_POINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1523:28: ( (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:1: (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:1: (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' )
            int alt54=6;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt54=1;
                }
                break;
            case 46:
                {
                alt54=2;
                }
                break;
            case 47:
                {
                alt54=3;
                }
                break;
            case 48:
                {
                alt54=4;
                }
                break;
            case 49:
                {
                alt54=5;
                }
                break;
            case 50:
                {
                alt54=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }

            switch (alt54) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1525:2: kw= 'half'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleF_POINT3595); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getHalfKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1532:2: kw= 'float'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleF_POINT3614); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getFloatKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1539:2: kw= 'double'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleF_POINT3633); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getDoubleKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1546:2: kw= 'x86_fp80'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleF_POINT3652); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getX86_fp80Keyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1553:2: kw= 'fp128'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleF_POINT3671); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getFp128Keyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1560:2: kw= 'ppc_fp128'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleF_POINT3690); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getPpc_fp128Keyword_5()); 
                        

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
    // $ANTLR end "ruleF_POINT"


    // $ANTLR start "entryRuleGetElementPtr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1573:1: entryRuleGetElementPtr returns [EObject current=null] : iv_ruleGetElementPtr= ruleGetElementPtr EOF ;
    public final EObject entryRuleGetElementPtr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetElementPtr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1574:2: (iv_ruleGetElementPtr= ruleGetElementPtr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1575:2: iv_ruleGetElementPtr= ruleGetElementPtr EOF
            {
             newCompositeNode(grammarAccess.getGetElementPtrRule()); 
            pushFollow(FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr3730);
            iv_ruleGetElementPtr=ruleGetElementPtr();

            state._fsp--;

             current =iv_ruleGetElementPtr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetElementPtr3740); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1582:1: ruleGetElementPtr returns [EObject current=null] : (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* ) ;
    public final EObject ruleGetElementPtr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pointer_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1585:28: ( (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1586:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1586:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1586:3: otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleGetElementPtr3777); 

                	newLeafNode(otherlv_0, grammarAccess.getGetElementPtrAccess().getGetelementptrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1590:1: (otherlv_1= 'inbounds' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==52) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1590:3: otherlv_1= 'inbounds'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleGetElementPtr3790); 

                        	newLeafNode(otherlv_1, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1594:3: ( (lv_pointer_2_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1595:1: (lv_pointer_2_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1595:1: (lv_pointer_2_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1596:3: lv_pointer_2_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getPointerTypeAndValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr3813);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1612:2: (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==24) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1612:4: otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleGetElementPtr3826); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGetElementPtrAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1616:1: ( (lv_params_4_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1617:1: (lv_params_4_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1617:1: (lv_params_4_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1618:3: lv_params_4_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getParamsTypeAndValueParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr3847);
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
            	    break loop56;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1642:1: entryRuleExtractValue returns [EObject current=null] : iv_ruleExtractValue= ruleExtractValue EOF ;
    public final EObject entryRuleExtractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1643:2: (iv_ruleExtractValue= ruleExtractValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1644:2: iv_ruleExtractValue= ruleExtractValue EOF
            {
             newCompositeNode(grammarAccess.getExtractValueRule()); 
            pushFollow(FOLLOW_ruleExtractValue_in_entryRuleExtractValue3885);
            iv_ruleExtractValue=ruleExtractValue();

            state._fsp--;

             current =iv_ruleExtractValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractValue3895); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1651:1: ruleExtractValue returns [EObject current=null] : (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleExtractValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_index_4_0=null;
        EObject lv_aggregate_1_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1654:28: ( (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1655:1: (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1655:1: (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1655:3: otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleExtractValue3932); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractValueAccess().getExtractvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1659:1: ( (lv_aggregate_1_0= ruleAggregate ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1660:1: (lv_aggregate_1_0= ruleAggregate )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1660:1: (lv_aggregate_1_0= ruleAggregate )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1661:3: lv_aggregate_1_0= ruleAggregate
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getAggregateAggregateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAggregate_in_ruleExtractValue3953);
            lv_aggregate_1_0=ruleAggregate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractValueRule());
            	        }
                   		set(
                   			current, 
                   			"aggregate",
                    		lv_aggregate_1_0, 
                    		"Aggregate");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1677:2: ( (lv_type_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1678:1: (lv_type_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1678:1: (lv_type_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1679:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleExtractValue3974);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractValueRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1695:2: (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+
            int cnt57=0;
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==24) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1695:4: otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleExtractValue3987); 

            	        	newLeafNode(otherlv_3, grammarAccess.getExtractValueAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1699:1: ( (lv_index_4_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1700:1: (lv_index_4_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1700:1: (lv_index_4_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1701:3: lv_index_4_0= RULE_INT
            	    {
            	    lv_index_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExtractValue4004); 

            	    			newLeafNode(lv_index_4_0, grammarAccess.getExtractValueAccess().getIndexINTTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtractValueRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"index",
            	            		lv_index_4_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt57 >= 1 ) break loop57;
                        EarlyExitException eee =
                            new EarlyExitException(57, input);
                        throw eee;
                }
                cnt57++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1725:1: entryRuleInsertValue returns [EObject current=null] : iv_ruleInsertValue= ruleInsertValue EOF ;
    public final EObject entryRuleInsertValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1726:2: (iv_ruleInsertValue= ruleInsertValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1727:2: iv_ruleInsertValue= ruleInsertValue EOF
            {
             newCompositeNode(grammarAccess.getInsertValueRule()); 
            pushFollow(FOLLOW_ruleInsertValue_in_entryRuleInsertValue4047);
            iv_ruleInsertValue=ruleInsertValue();

            state._fsp--;

             current =iv_ruleInsertValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertValue4057); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1734:1: ruleInsertValue returns [EObject current=null] : (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleInsertValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token lv_index_6_0=null;
        EObject lv_aggregate_1_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        EObject lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1737:28: ( (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1738:1: (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1738:1: (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1738:3: otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleInsertValue4094); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertValueAccess().getInsertvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1742:1: ( (lv_aggregate_1_0= ruleAggregate ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1743:1: (lv_aggregate_1_0= ruleAggregate )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1743:1: (lv_aggregate_1_0= ruleAggregate )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1744:3: lv_aggregate_1_0= ruleAggregate
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getAggregateAggregateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAggregate_in_ruleInsertValue4115);
            lv_aggregate_1_0=ruleAggregate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"aggregate",
                    		lv_aggregate_1_0, 
                    		"Aggregate");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1760:2: ( (lv_type_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1761:1: (lv_type_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1761:1: (lv_type_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1762:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertValue4136);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleInsertValue4148); 

                	newLeafNode(otherlv_3, grammarAccess.getInsertValueAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1782:1: ( (lv_value_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1783:1: (lv_value_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1783:1: (lv_value_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1784:3: lv_value_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getValueTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertValue4169);
            lv_value_4_0=ruleTypeAndValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"TypeAndValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1800:2: (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==24) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1800:4: otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleInsertValue4182); 

            	        	newLeafNode(otherlv_5, grammarAccess.getInsertValueAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1804:1: ( (lv_index_6_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1805:1: (lv_index_6_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1805:1: (lv_index_6_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1806:3: lv_index_6_0= RULE_INT
            	    {
            	    lv_index_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInsertValue4199); 

            	    			newLeafNode(lv_index_6_0, grammarAccess.getInsertValueAccess().getIndexINTTerminalRuleCall_5_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInsertValueRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"index",
            	            		lv_index_6_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1830:1: entryRuleFence returns [EObject current=null] : iv_ruleFence= ruleFence EOF ;
    public final EObject entryRuleFence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFence = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1831:2: (iv_ruleFence= ruleFence EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1832:2: iv_ruleFence= ruleFence EOF
            {
             newCompositeNode(grammarAccess.getFenceRule()); 
            pushFollow(FOLLOW_ruleFence_in_entryRuleFence4242);
            iv_ruleFence=ruleFence();

            state._fsp--;

             current =iv_ruleFence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFence4252); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1839:1: ruleFence returns [EObject current=null] : (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) ) ;
    public final EObject ruleFence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ordering_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1842:28: ( (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1843:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1843:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1843:3: otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleFence4289); 

                	newLeafNode(otherlv_0, grammarAccess.getFenceAccess().getFenceKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1847:1: (otherlv_1= 'singlethread' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==56) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1847:3: otherlv_1= 'singlethread'
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleFence4302); 

                        	newLeafNode(otherlv_1, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1851:3: ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1852:1: (lv_ordering_2_0= ruleATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1852:1: (lv_ordering_2_0= ruleATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1853:3: lv_ordering_2_0= ruleATOMIC_ORDERING
            {
             
            	        newCompositeNode(grammarAccess.getFenceAccess().getOrderingATOMIC_ORDERINGParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleFence4325);
            lv_ordering_2_0=ruleATOMIC_ORDERING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFenceRule());
            	        }
                   		set(
                   			current, 
                   			"ordering",
                    		lv_ordering_2_0, 
                    		"ATOMIC_ORDERING");
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


    // $ANTLR start "entryRuleATOMIC_ORDERING"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1877:1: entryRuleATOMIC_ORDERING returns [String current=null] : iv_ruleATOMIC_ORDERING= ruleATOMIC_ORDERING EOF ;
    public final String entryRuleATOMIC_ORDERING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATOMIC_ORDERING = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1878:2: (iv_ruleATOMIC_ORDERING= ruleATOMIC_ORDERING EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1879:2: iv_ruleATOMIC_ORDERING= ruleATOMIC_ORDERING EOF
            {
             newCompositeNode(grammarAccess.getATOMIC_ORDERINGRule()); 
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_entryRuleATOMIC_ORDERING4362);
            iv_ruleATOMIC_ORDERING=ruleATOMIC_ORDERING();

            state._fsp--;

             current =iv_ruleATOMIC_ORDERING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATOMIC_ORDERING4373); 

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
    // $ANTLR end "entryRuleATOMIC_ORDERING"


    // $ANTLR start "ruleATOMIC_ORDERING"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1886:1: ruleATOMIC_ORDERING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) ;
    public final AntlrDatatypeRuleToken ruleATOMIC_ORDERING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1889:28: ( (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1890:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1890:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt60=1;
                }
                break;
            case 58:
                {
                alt60=2;
                }
                break;
            case 59:
                {
                alt60=3;
                }
                break;
            case 60:
                {
                alt60=4;
                }
                break;
            case 61:
                {
                alt60=5;
                }
                break;
            case 62:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1891:2: kw= 'unordered'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleATOMIC_ORDERING4411); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getUnorderedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1898:2: kw= 'monotonic'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleATOMIC_ORDERING4430); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getMonotonicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1905:2: kw= 'aquire'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleATOMIC_ORDERING4449); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getAquireKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1912:2: kw= 'release'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleATOMIC_ORDERING4468); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getReleaseKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1919:2: kw= 'acq_rel'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleATOMIC_ORDERING4487); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getAcq_relKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1926:2: kw= 'seq_cst'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleATOMIC_ORDERING4506); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getSeq_cstKeyword_5()); 
                        

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
    // $ANTLR end "ruleATOMIC_ORDERING"


    // $ANTLR start "entryRuleCmpXchg"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1939:1: entryRuleCmpXchg returns [EObject current=null] : iv_ruleCmpXchg= ruleCmpXchg EOF ;
    public final EObject entryRuleCmpXchg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpXchg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1940:2: (iv_ruleCmpXchg= ruleCmpXchg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1941:2: iv_ruleCmpXchg= ruleCmpXchg EOF
            {
             newCompositeNode(grammarAccess.getCmpXchgRule()); 
            pushFollow(FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg4546);
            iv_ruleCmpXchg=ruleCmpXchg();

            state._fsp--;

             current =iv_ruleCmpXchg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmpXchg4556); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1948:1: ruleCmpXchg returns [EObject current=null] : (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1951:28: ( (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1952:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1952:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1952:3: otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,63,FOLLOW_63_in_ruleCmpXchg4593); 

                	newLeafNode(otherlv_0, grammarAccess.getCmpXchgAccess().getCmpxchgKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1956:1: (otherlv_1= 'volatile' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1956:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleCmpXchg4606); 

                        	newLeafNode(otherlv_1, grammarAccess.getCmpXchgAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1960:3: ( (lv_adress_2_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1961:1: (lv_adress_2_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1961:1: (lv_adress_2_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1962:3: lv_adress_2_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getAdressTypeAndValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg4629);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleCmpXchg4641); 

                	newLeafNode(otherlv_3, grammarAccess.getCmpXchgAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1982:1: ( (lv_compare_val_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1983:1: (lv_compare_val_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1983:1: (lv_compare_val_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1984:3: lv_compare_val_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getCompare_valTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg4662);
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

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleCmpXchg4674); 

                	newLeafNode(otherlv_5, grammarAccess.getCmpXchgAccess().getCommaKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2004:1: ( (lv_new_val_6_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2005:1: (lv_new_val_6_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2005:1: (lv_new_val_6_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2006:3: lv_new_val_6_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getNew_valTypeAndValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg4695);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2022:2: (otherlv_7= 'singlethread' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==56) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2022:4: otherlv_7= 'singlethread'
                    {
                    otherlv_7=(Token)match(input,56,FOLLOW_56_in_ruleCmpXchg4708); 

                        	newLeafNode(otherlv_7, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_7());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2026:3: ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2027:1: (lv_ordering_8_0= ruleATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2027:1: (lv_ordering_8_0= ruleATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2028:3: lv_ordering_8_0= ruleATOMIC_ORDERING
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getOrderingATOMIC_ORDERINGParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleCmpXchg4731);
            lv_ordering_8_0=ruleATOMIC_ORDERING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"ordering",
                    		lv_ordering_8_0, 
                    		"ATOMIC_ORDERING");
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2052:1: entryRuleAtomicRMW returns [EObject current=null] : iv_ruleAtomicRMW= ruleAtomicRMW EOF ;
    public final EObject entryRuleAtomicRMW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRMW = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2053:2: (iv_ruleAtomicRMW= ruleAtomicRMW EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2054:2: iv_ruleAtomicRMW= ruleAtomicRMW EOF
            {
             newCompositeNode(grammarAccess.getAtomicRMWRule()); 
            pushFollow(FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW4767);
            iv_ruleAtomicRMW=ruleAtomicRMW();

            state._fsp--;

             current =iv_ruleAtomicRMW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRMW4777); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2061:1: ruleAtomicRMW returns [EObject current=null] : (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2064:28: ( (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2065:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2065:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2065:3: otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleAtomicRMW4814); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRMWAccess().getAtomicrmwKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2069:1: (otherlv_1= 'volatile' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==64) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2069:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleAtomicRMW4827); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicRMWAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getAtomicRMWAccess().getBIN_OPParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleBIN_OP_in_ruleAtomicRMW4845);
            ruleBIN_OP();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2081:1: ( (lv_adress_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2082:1: (lv_adress_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2082:1: (lv_adress_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2083:3: lv_adress_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getAdressTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW4865);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleAtomicRMW4877); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRMWAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2103:1: ( (lv_value_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2104:1: (lv_value_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2104:1: (lv_value_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2105:3: lv_value_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getValueTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW4898);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2121:2: (otherlv_6= 'singlethread' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==56) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2121:4: otherlv_6= 'singlethread'
                    {
                    otherlv_6=(Token)match(input,56,FOLLOW_56_in_ruleAtomicRMW4911); 

                        	newLeafNode(otherlv_6, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_6());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2125:3: ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2126:1: (lv_ordering_7_0= ruleATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2126:1: (lv_ordering_7_0= ruleATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2127:3: lv_ordering_7_0= ruleATOMIC_ORDERING
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getOrderingATOMIC_ORDERINGParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleAtomicRMW4934);
            lv_ordering_7_0=ruleATOMIC_ORDERING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"ordering",
                    		lv_ordering_7_0, 
                    		"ATOMIC_ORDERING");
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


    // $ANTLR start "entryRuleBIN_OP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2151:1: entryRuleBIN_OP returns [String current=null] : iv_ruleBIN_OP= ruleBIN_OP EOF ;
    public final String entryRuleBIN_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBIN_OP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2152:2: (iv_ruleBIN_OP= ruleBIN_OP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2153:2: iv_ruleBIN_OP= ruleBIN_OP EOF
            {
             newCompositeNode(grammarAccess.getBIN_OPRule()); 
            pushFollow(FOLLOW_ruleBIN_OP_in_entryRuleBIN_OP4971);
            iv_ruleBIN_OP=ruleBIN_OP();

            state._fsp--;

             current =iv_ruleBIN_OP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBIN_OP4982); 

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
    // $ANTLR end "entryRuleBIN_OP"


    // $ANTLR start "ruleBIN_OP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2160:1: ruleBIN_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) ;
    public final AntlrDatatypeRuleToken ruleBIN_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2163:28: ( (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2164:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2164:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            int alt65=11;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt65=1;
                }
                break;
            case 67:
                {
                alt65=2;
                }
                break;
            case 68:
                {
                alt65=3;
                }
                break;
            case 69:
                {
                alt65=4;
                }
                break;
            case 70:
                {
                alt65=5;
                }
                break;
            case 71:
                {
                alt65=6;
                }
                break;
            case 72:
                {
                alt65=7;
                }
                break;
            case 73:
                {
                alt65=8;
                }
                break;
            case 74:
                {
                alt65=9;
                }
                break;
            case 75:
                {
                alt65=10;
                }
                break;
            case 76:
                {
                alt65=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2165:2: kw= 'xchg'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleBIN_OP5020); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getXchgKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2172:2: kw= 'add'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleBIN_OP5039); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getAddKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2179:2: kw= 'sub'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleBIN_OP5058); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getSubKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2186:2: kw= 'and'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleBIN_OP5077); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getAndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2193:2: kw= 'nand'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleBIN_OP5096); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getNandKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2200:2: kw= 'or'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleBIN_OP5115); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getOrKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2207:2: kw= 'xor'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleBIN_OP5134); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getXorKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2214:2: kw= 'max'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleBIN_OP5153); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getMaxKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2221:2: kw= 'min'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleBIN_OP5172); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getMinKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2228:2: kw= 'umax'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleBIN_OP5191); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getUmaxKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2235:2: kw= 'umin'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleBIN_OP5210); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getUminKeyword_10()); 
                        

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
    // $ANTLR end "ruleBIN_OP"


    // $ANTLR start "entryRuleLoad"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2248:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2249:2: (iv_ruleLoad= ruleLoad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2250:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_ruleLoad_in_entryRuleLoad5250);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoad5260); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2257:1: ruleLoad returns [EObject current=null] : ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_index_14_0=null;
        EObject lv_adress_2_0 = null;

        EObject lv_adress_9_0 = null;

        AntlrDatatypeRuleToken lv_ordering_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2260:28: ( ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2261:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2261:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==77) ) {
                int LA73_1 = input.LA(2);

                if ( (LA73_1==78) ) {
                    alt73=2;
                }
                else if ( ((LA73_1>=RULE_VAR_TYPE && LA73_1<=RULE_INT)||LA73_1==33||(LA73_1>=39 && LA73_1<=50)||LA73_1==64) ) {
                    alt73=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 73, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2261:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2261:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2261:4: otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    {
                    otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleLoad5298); 

                        	newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2265:1: (otherlv_1= 'volatile' )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==64) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2265:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleLoad5311); 

                                	newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2269:3: ( (lv_adress_2_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2270:1: (lv_adress_2_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2270:1: (lv_adress_2_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2271:3: lv_adress_2_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeAndValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLoad5334);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2287:2: (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==24) ) {
                            alt69=1;
                        }


                        switch (alt69) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2287:4: otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    {
                    	    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleLoad5347); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getCommaKeyword_0_3_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2291:1: ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    int alt68=2;
                    	    int LA68_0 = input.LA(1);

                    	    if ( (LA68_0==79) ) {
                    	        alt68=1;
                    	    }
                    	    else if ( (LA68_0==193||LA68_0==215) ) {
                    	        alt68=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 68, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt68) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2292:5: ruleALIGNMENT
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getLoadAccess().getALIGNMENTParserRuleCall_0_3_1_0()); 
                    	                
                    	            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleLoad5364);
                    	            ruleALIGNMENT();

                    	            state._fsp--;

                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2300:6: ( ruleMetadataValue )+
                    	            {
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2300:6: ( ruleMetadataValue )+
                    	            int cnt67=0;
                    	            loop67:
                    	            do {
                    	                int alt67=2;
                    	                int LA67_0 = input.LA(1);

                    	                if ( (LA67_0==193||LA67_0==215) ) {
                    	                    alt67=1;
                    	                }


                    	                switch (alt67) {
                    	            	case 1 :
                    	            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2301:5: ruleMetadataValue
                    	            	    {
                    	            	     
                    	            	            newCompositeNode(grammarAccess.getLoadAccess().getMetadataValueParserRuleCall_0_3_1_1()); 
                    	            	        
                    	            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleLoad5386);
                    	            	    ruleMetadataValue();

                    	            	    state._fsp--;

                    	            	     
                    	            	            afterParserOrEnumRuleCall();
                    	            	        

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt67 >= 1 ) break loop67;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(67, input);
                    	                        throw eee;
                    	                }
                    	                cnt67++;
                    	            } while (true);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2309:6: (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2309:6: (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2309:8: otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )?
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleLoad5410); 

                        	newLeafNode(otherlv_6, grammarAccess.getLoadAccess().getLoadKeyword_1_0());
                        
                    otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleLoad5422); 

                        	newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2317:1: (otherlv_8= 'volatile' )?
                    int alt70=2;
                    int LA70_0 = input.LA(1);

                    if ( (LA70_0==64) ) {
                        alt70=1;
                    }
                    switch (alt70) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2317:3: otherlv_8= 'volatile'
                            {
                            otherlv_8=(Token)match(input,64,FOLLOW_64_in_ruleLoad5435); 

                                	newLeafNode(otherlv_8, grammarAccess.getLoadAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2321:3: ( (lv_adress_9_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2322:1: (lv_adress_9_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2322:1: (lv_adress_9_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2323:3: lv_adress_9_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLoad5458);
                    lv_adress_9_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"adress",
                            		lv_adress_9_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2339:2: (otherlv_10= 'singlethread' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==56) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2339:4: otherlv_10= 'singlethread'
                            {
                            otherlv_10=(Token)match(input,56,FOLLOW_56_in_ruleLoad5471); 

                                	newLeafNode(otherlv_10, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_4());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2343:3: ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2344:1: (lv_ordering_11_0= ruleATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2344:1: (lv_ordering_11_0= ruleATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2345:3: lv_ordering_11_0= ruleATOMIC_ORDERING
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getOrderingATOMIC_ORDERINGParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleLoad5494);
                    lv_ordering_11_0=ruleATOMIC_ORDERING();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"ordering",
                            		lv_ordering_11_0, 
                            		"ATOMIC_ORDERING");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2361:2: (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==24) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2361:4: otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) )
                            {
                            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleLoad5507); 

                                	newLeafNode(otherlv_12, grammarAccess.getLoadAccess().getCommaKeyword_1_6_0());
                                
                            otherlv_13=(Token)match(input,79,FOLLOW_79_in_ruleLoad5519); 

                                	newLeafNode(otherlv_13, grammarAccess.getLoadAccess().getAlignKeyword_1_6_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2369:1: ( (lv_index_14_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2370:1: (lv_index_14_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2370:1: (lv_index_14_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2371:3: lv_index_14_0= RULE_INT
                            {
                            lv_index_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoad5536); 

                            			newLeafNode(lv_index_14_0, grammarAccess.getLoadAccess().getIndexINTTerminalRuleCall_1_6_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLoadRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"index",
                                    		lv_index_14_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2395:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2396:2: (iv_ruleStore= ruleStore EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2397:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore5580);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore5590); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2404:1: ruleStore returns [EObject current=null] : ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2407:28: ( ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2408:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2408:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==80) ) {
                int LA81_1 = input.LA(2);

                if ( ((LA81_1>=RULE_VAR_TYPE && LA81_1<=RULE_INT)||LA81_1==33||(LA81_1>=39 && LA81_1<=50)||LA81_1==64) ) {
                    alt81=1;
                }
                else if ( (LA81_1==78) ) {
                    alt81=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 81, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2408:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2408:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2408:4: otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    {
                    otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleStore5628); 

                        	newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2412:1: (otherlv_1= 'volatile' )?
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==64) ) {
                        alt74=1;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2412:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleStore5641); 

                                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2416:3: ( (lv_value_2_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2417:1: (lv_value_2_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2417:1: (lv_value_2_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2418:3: lv_value_2_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueTypeAndValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore5664);
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

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleStore5676); 

                        	newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getCommaKeyword_0_3());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2438:1: ( (lv_adress_4_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2439:1: (lv_adress_4_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2439:1: (lv_adress_4_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2440:3: lv_adress_4_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeAndValueParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore5697);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2456:2: (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    loop77:
                    do {
                        int alt77=2;
                        int LA77_0 = input.LA(1);

                        if ( (LA77_0==24) ) {
                            alt77=1;
                        }


                        switch (alt77) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2456:4: otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    {
                    	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleStore5710); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getCommaKeyword_0_5_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2460:1: ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    int alt76=2;
                    	    int LA76_0 = input.LA(1);

                    	    if ( (LA76_0==79) ) {
                    	        alt76=1;
                    	    }
                    	    else if ( (LA76_0==193||LA76_0==215) ) {
                    	        alt76=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 76, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt76) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2461:5: ruleALIGNMENT
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getStoreAccess().getALIGNMENTParserRuleCall_0_5_1_0()); 
                    	                
                    	            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleStore5727);
                    	            ruleALIGNMENT();

                    	            state._fsp--;

                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2469:6: ( ruleMetadataValue )+
                    	            {
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2469:6: ( ruleMetadataValue )+
                    	            int cnt75=0;
                    	            loop75:
                    	            do {
                    	                int alt75=2;
                    	                int LA75_0 = input.LA(1);

                    	                if ( (LA75_0==193||LA75_0==215) ) {
                    	                    alt75=1;
                    	                }


                    	                switch (alt75) {
                    	            	case 1 :
                    	            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2470:5: ruleMetadataValue
                    	            	    {
                    	            	     
                    	            	            newCompositeNode(grammarAccess.getStoreAccess().getMetadataValueParserRuleCall_0_5_1_1()); 
                    	            	        
                    	            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleStore5749);
                    	            	    ruleMetadataValue();

                    	            	    state._fsp--;

                    	            	     
                    	            	            afterParserOrEnumRuleCall();
                    	            	        

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt75 >= 1 ) break loop75;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(75, input);
                    	                        throw eee;
                    	                }
                    	                cnt75++;
                    	            } while (true);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop77;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2478:6: (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2478:6: (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2478:8: otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )?
                    {
                    otherlv_8=(Token)match(input,80,FOLLOW_80_in_ruleStore5773); 

                        	newLeafNode(otherlv_8, grammarAccess.getStoreAccess().getStoreKeyword_1_0());
                        
                    otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleStore5785); 

                        	newLeafNode(otherlv_9, grammarAccess.getStoreAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2486:1: (otherlv_10= 'volatile' )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==64) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2486:3: otherlv_10= 'volatile'
                            {
                            otherlv_10=(Token)match(input,64,FOLLOW_64_in_ruleStore5798); 

                                	newLeafNode(otherlv_10, grammarAccess.getStoreAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2490:3: ( (lv_value_11_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2491:1: (lv_value_11_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2491:1: (lv_value_11_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2492:3: lv_value_11_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore5821);
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

                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleStore5833); 

                        	newLeafNode(otherlv_12, grammarAccess.getStoreAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2512:1: ( (lv_adress_13_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2513:1: (lv_adress_13_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2513:1: (lv_adress_13_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2514:3: lv_adress_13_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeAndValueParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore5854);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2530:2: (otherlv_14= 'singlethread' )?
                    int alt79=2;
                    int LA79_0 = input.LA(1);

                    if ( (LA79_0==56) ) {
                        alt79=1;
                    }
                    switch (alt79) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2530:4: otherlv_14= 'singlethread'
                            {
                            otherlv_14=(Token)match(input,56,FOLLOW_56_in_ruleStore5867); 

                                	newLeafNode(otherlv_14, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2534:3: ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2535:1: (lv_ordering_15_0= ruleATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2535:1: (lv_ordering_15_0= ruleATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2536:3: lv_ordering_15_0= ruleATOMIC_ORDERING
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getOrderingATOMIC_ORDERINGParserRuleCall_1_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleStore5890);
                    lv_ordering_15_0=ruleATOMIC_ORDERING();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"ordering",
                            		lv_ordering_15_0, 
                            		"ATOMIC_ORDERING");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2552:2: (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==24) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2552:4: otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) )
                            {
                            otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleStore5903); 

                                	newLeafNode(otherlv_16, grammarAccess.getStoreAccess().getCommaKeyword_1_8_0());
                                
                            otherlv_17=(Token)match(input,79,FOLLOW_79_in_ruleStore5915); 

                                	newLeafNode(otherlv_17, grammarAccess.getStoreAccess().getAlignKeyword_1_8_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2560:1: ( (lv_index_18_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2561:1: (lv_index_18_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2561:1: (lv_index_18_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2562:3: lv_index_18_0= RULE_INT
                            {
                            lv_index_18_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStore5932); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2586:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2587:2: (iv_ruleCall= ruleCall EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2588:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall5976);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall5986); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2595:1: ruleCall returns [EObject current=null] : ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pointer_4_0 = null;

        AntlrDatatypeRuleToken lv_pList_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2598:28: ( ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2599:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2599:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2599:2: (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2599:2: (otherlv_0= 'tail' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==81) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2599:4: otherlv_0= 'tail'
                    {
                    otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleCall6024); 

                        	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getTailKeyword_0());
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleCall6038); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getCallKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2607:1: ( ruleCallingConv )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( ((LA83_0>=92 && LA83_0<=106)) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2608:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getCallingConvParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleCall6055);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2615:3: ( ruleRETURN_ATTRIBUTES )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( ((LA84_0>=83 && LA84_0<=90)) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2616:5: ruleRETURN_ATTRIBUTES
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getRETURN_ATTRIBUTESParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleCall6073);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2623:3: ( (lv_pointer_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2624:1: (lv_pointer_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2624:1: (lv_pointer_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2625:3: lv_pointer_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPointerTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCall6095);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2641:2: ( (lv_pList_5_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2642:1: (lv_pList_5_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2642:1: (lv_pList_5_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2643:3: lv_pList_5_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPListParameterListParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleCall6116);
            lv_pList_5_0=ruleParameterList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"pList",
                    		lv_pList_5_0, 
                    		"ParameterList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2659:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( ((LA85_0>=107 && LA85_0<=124)) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2660:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall6133);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop85;
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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleRETURN_ATTRIBUTES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2675:1: entryRuleRETURN_ATTRIBUTES returns [String current=null] : iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF ;
    public final String entryRuleRETURN_ATTRIBUTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN_ATTRIBUTES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2676:2: (iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2677:2: iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF
            {
             newCompositeNode(grammarAccess.getRETURN_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES6171);
            iv_ruleRETURN_ATTRIBUTES=ruleRETURN_ATTRIBUTES();

            state._fsp--;

             current =iv_ruleRETURN_ATTRIBUTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES6182); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2684:1: ruleRETURN_ATTRIBUTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) ;
    public final AntlrDatatypeRuleToken ruleRETURN_ATTRIBUTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2687:28: ( (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2688:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2688:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            int alt86=8;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt86=1;
                }
                break;
            case 84:
                {
                alt86=2;
                }
                break;
            case 85:
                {
                alt86=3;
                }
                break;
            case 86:
                {
                alt86=4;
                }
                break;
            case 87:
                {
                alt86=5;
                }
                break;
            case 88:
                {
                alt86=6;
                }
                break;
            case 89:
                {
                alt86=7;
                }
                break;
            case 90:
                {
                alt86=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2689:2: kw= 'zeroext'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleRETURN_ATTRIBUTES6220); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getZeroextKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2696:2: kw= 'signext'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleRETURN_ATTRIBUTES6239); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getSignextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2703:2: kw= 'inreg'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleRETURN_ATTRIBUTES6258); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getInregKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2710:2: kw= 'byval'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleRETURN_ATTRIBUTES6277); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getByvalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2717:2: kw= 'sret'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleRETURN_ATTRIBUTES6296); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getSretKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2724:2: kw= 'noalias'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleRETURN_ATTRIBUTES6315); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getNoaliasKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2731:2: kw= 'nocapture'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleRETURN_ATTRIBUTES6334); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getNocaptureKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2738:2: kw= 'nest'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleRETURN_ATTRIBUTES6353); 

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


    // $ANTLR start "entryRuleAlloc"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2751:1: entryRuleAlloc returns [EObject current=null] : iv_ruleAlloc= ruleAlloc EOF ;
    public final EObject entryRuleAlloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlloc = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2752:2: (iv_ruleAlloc= ruleAlloc EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2753:2: iv_ruleAlloc= ruleAlloc EOF
            {
             newCompositeNode(grammarAccess.getAllocRule()); 
            pushFollow(FOLLOW_ruleAlloc_in_entryRuleAlloc6393);
            iv_ruleAlloc=ruleAlloc();

            state._fsp--;

             current =iv_ruleAlloc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlloc6403); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2760:1: ruleAlloc returns [EObject current=null] : (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )? ) ;
    public final EObject ruleAlloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_numElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2763:28: ( (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2764:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2764:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2764:3: otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )?
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleAlloc6440); 

                	newLeafNode(otherlv_0, grammarAccess.getAllocAccess().getAllocaKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2768:1: ( (lv_type_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2769:1: (lv_type_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2769:1: (lv_type_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2770:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAllocAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlloc6461);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2786:2: (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==24) ) {
                int LA87_1 = input.LA(2);

                if ( ((LA87_1>=RULE_VAR_TYPE && LA87_1<=RULE_INT)||LA87_1==33||(LA87_1>=39 && LA87_1<=50)) ) {
                    alt87=1;
                }
            }
            switch (alt87) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2786:4: otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) )
                    {
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAlloc6474); 

                        	newLeafNode(otherlv_2, grammarAccess.getAllocAccess().getCommaKeyword_2_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2790:1: ( (lv_numElements_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2791:1: (lv_numElements_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2791:1: (lv_numElements_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2792:3: lv_numElements_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getNumElementsTypeAndValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAlloc6495);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2808:4: (otherlv_4= ',' ruleALIGNMENT )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==24) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2808:6: otherlv_4= ',' ruleALIGNMENT
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleAlloc6510); 

                        	newLeafNode(otherlv_4, grammarAccess.getAllocAccess().getCommaKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getAllocAccess().getALIGNMENTParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleALIGNMENT_in_ruleAlloc6526);
                    ruleALIGNMENT();

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2828:1: entryRuleCallingConv returns [String current=null] : iv_ruleCallingConv= ruleCallingConv EOF ;
    public final String entryRuleCallingConv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCallingConv = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2829:2: (iv_ruleCallingConv= ruleCallingConv EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2830:2: iv_ruleCallingConv= ruleCallingConv EOF
            {
             newCompositeNode(grammarAccess.getCallingConvRule()); 
            pushFollow(FOLLOW_ruleCallingConv_in_entryRuleCallingConv6564);
            iv_ruleCallingConv=ruleCallingConv();

            state._fsp--;

             current =iv_ruleCallingConv.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallingConv6575); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2837:1: ruleCallingConv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleCallingConv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_16=null;
        Token this_INT_18=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2840:28: ( (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2841:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2841:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) )
            int alt89=15;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt89=1;
                }
                break;
            case 93:
                {
                alt89=2;
                }
                break;
            case 94:
                {
                alt89=3;
                }
                break;
            case 95:
                {
                alt89=4;
                }
                break;
            case 96:
                {
                alt89=5;
                }
                break;
            case 97:
                {
                alt89=6;
                }
                break;
            case 98:
                {
                alt89=7;
                }
                break;
            case 99:
                {
                alt89=8;
                }
                break;
            case 100:
                {
                alt89=9;
                }
                break;
            case 101:
                {
                alt89=10;
                }
                break;
            case 102:
                {
                alt89=11;
                }
                break;
            case 103:
                {
                alt89=12;
                }
                break;
            case 104:
                {
                alt89=13;
                }
                break;
            case 105:
                {
                alt89=14;
                }
                break;
            case 106:
                {
                alt89=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }

            switch (alt89) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2842:2: kw= 'ccc'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleCallingConv6613); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCccKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2849:2: kw= 'fastcc'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleCallingConv6632); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getFastccKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2856:2: kw= 'coldcc'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleCallingConv6651); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getColdccKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2863:2: kw= 'x86_stdcallcc'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleCallingConv6670); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_stdcallccKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2870:2: kw= 'x86_fastcallcc'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleCallingConv6689); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_fastcallccKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2877:2: kw= 'x86_thiscallcc'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleCallingConv6708); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_thiscallccKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2884:2: kw= 'arm_apcscc'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleCallingConv6727); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_apcsccKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2891:2: kw= 'arm_aapcscc'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleCallingConv6746); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcsccKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2898:2: kw= 'arm_aapcs_vfpcc'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleCallingConv6765); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcs_vfpccKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2905:2: kw= 'msp430_intrcc'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleCallingConv6784); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getMsp430_intrccKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2912:2: kw= 'ptx_kernel'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleCallingConv6803); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_kernelKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2919:2: kw= 'ptx_device'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleCallingConv6822); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_deviceKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2926:2: kw= 'spir_func'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleCallingConv6841); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_funcKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2933:2: kw= 'spir_kernel'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleCallingConv6860); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_kernelKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2939:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2939:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2940:2: kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleCallingConv6880); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCcKeyword_14_0()); 
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleCallingConv6893); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getLessThanSignKeyword_14_1()); 
                        
                    this_INT_16=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv6908); 

                    		current.merge(this_INT_16);
                        
                     
                        newLeafNode(this_INT_16, grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_2()); 
                        
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleCallingConv6926); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getGreaterThanSignKeyword_14_3()); 
                        
                    this_INT_18=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv6941); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2979:1: entryRuleFUNCTION_ATTRIBUTES returns [String current=null] : iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF ;
    public final String entryRuleFUNCTION_ATTRIBUTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNCTION_ATTRIBUTES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2980:2: (iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2981:2: iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF
            {
             newCompositeNode(grammarAccess.getFUNCTION_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES6988);
            iv_ruleFUNCTION_ATTRIBUTES=ruleFUNCTION_ATTRIBUTES();

            state._fsp--;

             current =iv_ruleFUNCTION_ATTRIBUTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES6999); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2988:1: ruleFUNCTION_ATTRIBUTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) ;
    public final AntlrDatatypeRuleToken ruleFUNCTION_ATTRIBUTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2991:28: ( (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2992:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2992:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            int alt90=18;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt90=1;
                }
                break;
            case 108:
                {
                alt90=2;
                }
                break;
            case 109:
                {
                alt90=3;
                }
                break;
            case 110:
                {
                alt90=4;
                }
                break;
            case 111:
                {
                alt90=5;
                }
                break;
            case 112:
                {
                alt90=6;
                }
                break;
            case 113:
                {
                alt90=7;
                }
                break;
            case 114:
                {
                alt90=8;
                }
                break;
            case 115:
                {
                alt90=9;
                }
                break;
            case 116:
                {
                alt90=10;
                }
                break;
            case 117:
                {
                alt90=11;
                }
                break;
            case 118:
                {
                alt90=12;
                }
                break;
            case 119:
                {
                alt90=13;
                }
                break;
            case 120:
                {
                alt90=14;
                }
                break;
            case 121:
                {
                alt90=15;
                }
                break;
            case 122:
                {
                alt90=16;
                }
                break;
            case 123:
                {
                alt90=17;
                }
                break;
            case 124:
                {
                alt90=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }

            switch (alt90) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2993:2: kw= 'address_safety'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleFUNCTION_ATTRIBUTES7037); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAddress_safetyKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2999:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2999:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3000:2: kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleFUNCTION_ATTRIBUTES7057); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlignstackKeyword_1_0()); 
                        
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleFUNCTION_ATTRIBUTES7070); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLeftParenthesisKeyword_1_1()); 
                        
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleFUNCTION_ATTRIBUTES7083); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLessThanSignKeyword_1_2()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFUNCTION_ATTRIBUTES7098); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getINTTerminalRuleCall_1_3()); 
                        
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleFUNCTION_ATTRIBUTES7116); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getGreaterThanSignKeyword_1_4()); 
                        
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleFUNCTION_ATTRIBUTES7129); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getRightParenthesisKeyword_1_5()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3038:2: kw= 'alwaysinline'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleFUNCTION_ATTRIBUTES7149); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlwaysinlineKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3045:2: kw= 'nonlazybind'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleFUNCTION_ATTRIBUTES7168); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNonlazybindKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3052:2: kw= 'inlinehint'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleFUNCTION_ATTRIBUTES7187); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getInlinehintKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3059:2: kw= 'naked'
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleFUNCTION_ATTRIBUTES7206); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNakedKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3066:2: kw= 'noimplicitfloat'
                    {
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleFUNCTION_ATTRIBUTES7225); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoimplicitfloatKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3073:2: kw= 'noinline'
                    {
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleFUNCTION_ATTRIBUTES7244); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoinlineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3080:2: kw= 'noredzone'
                    {
                    kw=(Token)match(input,115,FOLLOW_115_in_ruleFUNCTION_ATTRIBUTES7263); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoredzoneKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3087:2: kw= 'noreturn'
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleFUNCTION_ATTRIBUTES7282); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoreturnKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3094:2: kw= 'nounwind'
                    {
                    kw=(Token)match(input,117,FOLLOW_117_in_ruleFUNCTION_ATTRIBUTES7301); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNounwindKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3101:2: kw= 'optsize'
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_ruleFUNCTION_ATTRIBUTES7320); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getOptsizeKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3108:2: kw= 'readnone'
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_ruleFUNCTION_ATTRIBUTES7339); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadnoneKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3115:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_ruleFUNCTION_ATTRIBUTES7358); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadonlyKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3122:2: kw= 'returns_twice'
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_ruleFUNCTION_ATTRIBUTES7377); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReturns_twiceKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3129:2: kw= 'ssp'
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleFUNCTION_ATTRIBUTES7396); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3136:2: kw= 'sspreq'
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleFUNCTION_ATTRIBUTES7415); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspreqKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3143:2: kw= 'uwtable'
                    {
                    kw=(Token)match(input,124,FOLLOW_124_in_ruleFUNCTION_ATTRIBUTES7434); 

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


    // $ANTLR start "entryRulePHI"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3156:1: entryRulePHI returns [EObject current=null] : iv_rulePHI= rulePHI EOF ;
    public final EObject entryRulePHI() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePHI = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3157:2: (iv_rulePHI= rulePHI EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3158:2: iv_rulePHI= rulePHI EOF
            {
             newCompositeNode(grammarAccess.getPHIRule()); 
            pushFollow(FOLLOW_rulePHI_in_entryRulePHI7474);
            iv_rulePHI=rulePHI();

            state._fsp--;

             current =iv_rulePHI; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePHI7484); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3165:1: rulePHI returns [EObject current=null] : (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3168:28: ( (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3169:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3169:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3169:3: otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            {
            otherlv_0=(Token)match(input,125,FOLLOW_125_in_rulePHI7521); 

                	newLeafNode(otherlv_0, grammarAccess.getPHIAccess().getPhiKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPHIAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_rulePHI7537);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePHI7548); 

                	newLeafNode(otherlv_2, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3185:1: ( (lv_values_3_0= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3186:1: (lv_values_3_0= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3186:1: (lv_values_3_0= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3187:3: lv_values_3_0= ruleValuePair
            {
             
            	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValuePair_in_rulePHI7569);
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

            otherlv_4=(Token)match(input,25,FOLLOW_25_in_rulePHI7581); 

                	newLeafNode(otherlv_4, grammarAccess.getPHIAccess().getRightSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3207:1: (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==24) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3207:3: otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']'
            	    {
            	    otherlv_5=(Token)match(input,24,FOLLOW_24_in_rulePHI7594); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPHIAccess().getCommaKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,23,FOLLOW_23_in_rulePHI7606); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_5_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3215:1: ( (lv_values_7_0= ruleValuePair ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3216:1: (lv_values_7_0= ruleValuePair )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3216:1: (lv_values_7_0= ruleValuePair )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3217:3: lv_values_7_0= ruleValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValuePair_in_rulePHI7627);
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

            	    otherlv_8=(Token)match(input,25,FOLLOW_25_in_rulePHI7639); 

            	        	newLeafNode(otherlv_8, grammarAccess.getPHIAccess().getRightSquareBracketKeyword_5_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop91;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3245:1: entryRuleValuePair returns [EObject current=null] : iv_ruleValuePair= ruleValuePair EOF ;
    public final EObject entryRuleValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuePair = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3246:2: (iv_ruleValuePair= ruleValuePair EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3247:2: iv_ruleValuePair= ruleValuePair EOF
            {
             newCompositeNode(grammarAccess.getValuePairRule()); 
            pushFollow(FOLLOW_ruleValuePair_in_entryRuleValuePair7677);
            iv_ruleValuePair=ruleValuePair();

            state._fsp--;

             current =iv_ruleValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuePair7687); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3254:1: ruleValuePair returns [EObject current=null] : ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) ) ;
    public final EObject ruleValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value1_0_0 = null;

        AntlrDatatypeRuleToken lv_value2_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3257:28: ( ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3258:1: ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3258:1: ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3258:2: ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3258:2: ( (lv_value1_0_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3259:1: (lv_value1_0_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3259:1: (lv_value1_0_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3260:3: lv_value1_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getValuePairAccess().getValue1TypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleValuePair7733);
            lv_value1_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValuePairRule());
            	        }
                   		set(
                   			current, 
                   			"value1",
                    		lv_value1_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleValuePair7745); 

                	newLeafNode(otherlv_1, grammarAccess.getValuePairAccess().getCommaKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3280:1: ( (lv_value2_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3281:1: (lv_value2_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3281:1: (lv_value2_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3282:3: lv_value2_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getValuePairAccess().getValue2TypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleValuePair7766);
            lv_value2_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getValuePairRule());
            	        }
                   		set(
                   			current, 
                   			"value2",
                    		lv_value2_2_0, 
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
    // $ANTLR end "ruleValuePair"


    // $ANTLR start "entryRuleLandingPad"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3306:1: entryRuleLandingPad returns [EObject current=null] : iv_ruleLandingPad= ruleLandingPad EOF ;
    public final EObject entryRuleLandingPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingPad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3307:2: (iv_ruleLandingPad= ruleLandingPad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3308:2: iv_ruleLandingPad= ruleLandingPad EOF
            {
             newCompositeNode(grammarAccess.getLandingPadRule()); 
            pushFollow(FOLLOW_ruleLandingPad_in_entryRuleLandingPad7802);
            iv_ruleLandingPad=ruleLandingPad();

            state._fsp--;

             current =iv_ruleLandingPad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLandingPad7812); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3315:1: ruleLandingPad returns [EObject current=null] : ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) ) ;
    public final EObject ruleLandingPad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token this_VAR_TYPE_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_personality_3_0 = null;

        EObject lv_clause_5_0 = null;

        EObject lv_clause_6_0 = null;

        AntlrDatatypeRuleToken lv_type_8_0 = null;

        AntlrDatatypeRuleToken lv_personalitytype_10_0 = null;

        AntlrDatatypeRuleToken lv_personalityfunction_11_0 = null;

        AntlrDatatypeRuleToken lv_value_13_0 = null;

        AntlrDatatypeRuleToken lv_castto_17_0 = null;

        EObject lv_clause_20_0 = null;

        EObject lv_clause_21_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3318:28: ( ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3319:1: ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3319:1: ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) )
            int alt98=2;
            alt98 = dfa98.predict(input);
            switch (alt98) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3319:2: (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3319:2: (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3319:4: otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ )
                    {
                    otherlv_0=(Token)match(input,126,FOLLOW_126_in_ruleLandingPad7850); 

                        	newLeafNode(otherlv_0, grammarAccess.getLandingPadAccess().getLandingpadKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3323:1: ( (lv_type_1_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3324:1: (lv_type_1_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3324:1: (lv_type_1_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3325:3: lv_type_1_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getTypeTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad7871);
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

                    otherlv_2=(Token)match(input,127,FOLLOW_127_in_ruleLandingPad7883); 

                        	newLeafNode(otherlv_2, grammarAccess.getLandingPadAccess().getPersonalityKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3345:1: ( (lv_personality_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3346:1: (lv_personality_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3346:1: (lv_personality_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3347:3: lv_personality_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityTypeAndValueParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLandingPad7904);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3363:2: ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( (LA94_0==128) ) {
                        alt94=1;
                    }
                    else if ( ((LA94_0>=131 && LA94_0<=132)) ) {
                        alt94=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;
                    }
                    switch (alt94) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3363:3: (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3363:3: (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3363:5: otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )*
                            {
                            otherlv_4=(Token)match(input,128,FOLLOW_128_in_ruleLandingPad7918); 

                                	newLeafNode(otherlv_4, grammarAccess.getLandingPadAccess().getCleanupKeyword_0_4_0_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3367:1: ( (lv_clause_5_0= ruleClause ) )*
                            loop92:
                            do {
                                int alt92=2;
                                int LA92_0 = input.LA(1);

                                if ( ((LA92_0>=131 && LA92_0<=132)) ) {
                                    alt92=1;
                                }


                                switch (alt92) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3368:1: (lv_clause_5_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3368:1: (lv_clause_5_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3369:3: lv_clause_5_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_0_4_0_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad7939);
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
                            	    break loop92;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3386:6: ( (lv_clause_6_0= ruleClause ) )+
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3386:6: ( (lv_clause_6_0= ruleClause ) )+
                            int cnt93=0;
                            loop93:
                            do {
                                int alt93=2;
                                int LA93_0 = input.LA(1);

                                if ( ((LA93_0>=131 && LA93_0<=132)) ) {
                                    alt93=1;
                                }


                                switch (alt93) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3387:1: (lv_clause_6_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3387:1: (lv_clause_6_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3388:3: lv_clause_6_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_0_4_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad7968);
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
                            	    if ( cnt93 >= 1 ) break loop93;
                                        EarlyExitException eee =
                                            new EarlyExitException(93, input);
                                        throw eee;
                                }
                                cnt93++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3405:6: (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3405:6: (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3405:8: otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ )
                    {
                    otherlv_7=(Token)match(input,126,FOLLOW_126_in_ruleLandingPad7990); 

                        	newLeafNode(otherlv_7, grammarAccess.getLandingPadAccess().getLandingpadKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3409:1: ( (lv_type_8_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3410:1: (lv_type_8_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3410:1: (lv_type_8_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3411:3: lv_type_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getTypeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad8011);
                    lv_type_8_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_8_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,127,FOLLOW_127_in_ruleLandingPad8023); 

                        	newLeafNode(otherlv_9, grammarAccess.getLandingPadAccess().getPersonalityKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3431:1: ( (lv_personalitytype_10_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3432:1: (lv_personalitytype_10_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3432:1: (lv_personalitytype_10_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3433:3: lv_personalitytype_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalitytypeTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad8044);
                    lv_personalitytype_10_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"personalitytype",
                            		lv_personalitytype_10_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3449:2: ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3450:1: (lv_personalityfunction_11_0= ruleCAST_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3450:1: (lv_personalityfunction_11_0= ruleCAST_TYPE )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3451:3: lv_personalityfunction_11_0= ruleCAST_TYPE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityfunctionCAST_TYPEParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCAST_TYPE_in_ruleLandingPad8065);
                    lv_personalityfunction_11_0=ruleCAST_TYPE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"personalityfunction",
                            		lv_personalityfunction_11_0, 
                            		"CAST_TYPE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,31,FOLLOW_31_in_ruleLandingPad8077); 

                        	newLeafNode(otherlv_12, grammarAccess.getLandingPadAccess().getLeftParenthesisKeyword_1_5());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3471:1: ( (lv_value_13_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3472:1: (lv_value_13_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3472:1: (lv_value_13_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3473:3: lv_value_13_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getValueTypeParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad8098);
                    lv_value_13_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_13_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_14=(Token)match(input,129,FOLLOW_129_in_ruleLandingPad8110); 

                        	newLeafNode(otherlv_14, grammarAccess.getLandingPadAccess().getLeftParenthesisFullStopFullStopFullStopRightParenthesisAsteriskKeyword_1_7());
                        
                    this_VAR_TYPE_15=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleLandingPad8121); 
                     
                        newLeafNode(this_VAR_TYPE_15, grammarAccess.getLandingPadAccess().getVAR_TYPETerminalRuleCall_1_8()); 
                        
                    otherlv_16=(Token)match(input,130,FOLLOW_130_in_ruleLandingPad8132); 

                        	newLeafNode(otherlv_16, grammarAccess.getLandingPadAccess().getToKeyword_1_9());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3501:1: ( (lv_castto_17_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3502:1: (lv_castto_17_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3502:1: (lv_castto_17_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3503:3: lv_castto_17_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getCasttoTypeParserRuleCall_1_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad8153);
                    lv_castto_17_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"castto",
                            		lv_castto_17_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_18=(Token)match(input,32,FOLLOW_32_in_ruleLandingPad8165); 

                        	newLeafNode(otherlv_18, grammarAccess.getLandingPadAccess().getRightParenthesisKeyword_1_11());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3523:1: ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ )
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==128) ) {
                        alt97=1;
                    }
                    else if ( ((LA97_0>=131 && LA97_0<=132)) ) {
                        alt97=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 97, 0, input);

                        throw nvae;
                    }
                    switch (alt97) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3523:2: (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3523:2: (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3523:4: otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )*
                            {
                            otherlv_19=(Token)match(input,128,FOLLOW_128_in_ruleLandingPad8179); 

                                	newLeafNode(otherlv_19, grammarAccess.getLandingPadAccess().getCleanupKeyword_1_12_0_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3527:1: ( (lv_clause_20_0= ruleClause ) )*
                            loop95:
                            do {
                                int alt95=2;
                                int LA95_0 = input.LA(1);

                                if ( ((LA95_0>=131 && LA95_0<=132)) ) {
                                    alt95=1;
                                }


                                switch (alt95) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3528:1: (lv_clause_20_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3528:1: (lv_clause_20_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3529:3: lv_clause_20_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_1_12_0_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad8200);
                            	    lv_clause_20_0=ruleClause();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"clause",
                            	            		lv_clause_20_0, 
                            	            		"Clause");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop95;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3546:6: ( (lv_clause_21_0= ruleClause ) )+
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3546:6: ( (lv_clause_21_0= ruleClause ) )+
                            int cnt96=0;
                            loop96:
                            do {
                                int alt96=2;
                                int LA96_0 = input.LA(1);

                                if ( ((LA96_0>=131 && LA96_0<=132)) ) {
                                    alt96=1;
                                }


                                switch (alt96) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3547:1: (lv_clause_21_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3547:1: (lv_clause_21_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3548:3: lv_clause_21_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_1_12_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad8229);
                            	    lv_clause_21_0=ruleClause();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"clause",
                            	            		lv_clause_21_0, 
                            	            		"Clause");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt96 >= 1 ) break loop96;
                                        EarlyExitException eee =
                                            new EarlyExitException(96, input);
                                        throw eee;
                                }
                                cnt96++;
                            } while (true);


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
    // $ANTLR end "ruleLandingPad"


    // $ANTLR start "entryRuleClause"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3572:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3573:2: (iv_ruleClause= ruleClause EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3574:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause8268);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause8278); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3581:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3584:28: ( ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3585:1: ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3585:1: ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==131) ) {
                alt100=1;
            }
            else if ( (LA100_0==132) ) {
                alt100=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3585:2: (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3585:2: (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3585:4: otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue
                    {
                    otherlv_0=(Token)match(input,131,FOLLOW_131_in_ruleClause8316); 

                        	newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getCatchKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getClauseAccess().getTypeAndValueParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause8338);
                    this_TypeAndValue_1=ruleTypeAndValue();

                    state._fsp--;

                     
                            current = this_TypeAndValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3599:6: (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3599:6: (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3599:8: otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )*
                    {
                    otherlv_2=(Token)match(input,132,FOLLOW_132_in_ruleClause8357); 

                        	newLeafNode(otherlv_2, grammarAccess.getClauseAccess().getFilterKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3603:1: ( (lv_filter_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3604:1: (lv_filter_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3604:1: (lv_filter_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3605:3: lv_filter_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause8378);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3621:2: (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )*
                    loop99:
                    do {
                        int alt99=2;
                        int LA99_0 = input.LA(1);

                        if ( (LA99_0==24) ) {
                            alt99=1;
                        }


                        switch (alt99) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3621:4: otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleClause8391); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3625:1: ( (lv_filter_5_0= ruleTypeAndValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3626:1: (lv_filter_5_0= ruleTypeAndValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3626:1: (lv_filter_5_0= ruleTypeAndValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3627:3: lv_filter_5_0= ruleTypeAndValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterTypeAndValueParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause8412);
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
                    	    break loop99;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3651:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3652:2: (iv_ruleSelect= ruleSelect EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3653:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect8451);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect8461); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3660:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3663:28: ( (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3664:1: (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3664:1: (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3664:3: otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,133,FOLLOW_133_in_ruleSelect8498); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3668:1: ( (lv_condition_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3669:1: (lv_condition_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3669:1: (lv_condition_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3670:3: lv_condition_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getConditionTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect8519);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleSelect8531); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3690:1: ( (lv_val1_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3691:1: (lv_val1_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3691:1: (lv_val1_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3692:3: lv_val1_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal1TypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect8552);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleSelect8564); 

                	newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3712:1: ( (lv_val2_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3713:1: (lv_val2_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3713:1: (lv_val2_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3714:3: lv_val2_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal2TypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect8585);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3738:1: entryRuleVA_Arg returns [EObject current=null] : iv_ruleVA_Arg= ruleVA_Arg EOF ;
    public final EObject entryRuleVA_Arg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVA_Arg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3739:2: (iv_ruleVA_Arg= ruleVA_Arg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3740:2: iv_ruleVA_Arg= ruleVA_Arg EOF
            {
             newCompositeNode(grammarAccess.getVA_ArgRule()); 
            pushFollow(FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg8621);
            iv_ruleVA_Arg=ruleVA_Arg();

            state._fsp--;

             current =iv_ruleVA_Arg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVA_Arg8631); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3747:1: ruleVA_Arg returns [EObject current=null] : (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) ) ;
    public final EObject ruleVA_Arg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;

        AntlrDatatypeRuleToken lv_argType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3750:28: ( (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3751:1: (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3751:1: (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3751:3: otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,134,FOLLOW_134_in_ruleVA_Arg8668); 

                	newLeafNode(otherlv_0, grammarAccess.getVA_ArgAccess().getVa_argKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3755:1: ( (lv_list_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3756:1: (lv_list_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3756:1: (lv_list_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3757:3: lv_list_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getListTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleVA_Arg8689);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleVA_Arg8701); 

                	newLeafNode(otherlv_2, grammarAccess.getVA_ArgAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3777:1: ( (lv_argType_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3778:1: (lv_argType_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3778:1: (lv_argType_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3779:3: lv_argType_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getArgTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVA_Arg8722);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3803:1: entryRuleExtractElement returns [EObject current=null] : iv_ruleExtractElement= ruleExtractElement EOF ;
    public final EObject entryRuleExtractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3804:2: (iv_ruleExtractElement= ruleExtractElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3805:2: iv_ruleExtractElement= ruleExtractElement EOF
            {
             newCompositeNode(grammarAccess.getExtractElementRule()); 
            pushFollow(FOLLOW_ruleExtractElement_in_entryRuleExtractElement8758);
            iv_ruleExtractElement=ruleExtractElement();

            state._fsp--;

             current =iv_ruleExtractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractElement8768); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3812:1: ruleExtractElement returns [EObject current=null] : (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) ) ;
    public final EObject ruleExtractElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_vector_1_0 = null;

        EObject lv_index_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3815:28: ( (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3816:1: (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3816:1: (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3816:3: otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,135,FOLLOW_135_in_ruleExtractElement8805); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractElementAccess().getExtractelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3820:1: ( (lv_vector_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3821:1: (lv_vector_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3821:1: (lv_vector_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3822:3: lv_vector_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getVectorTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractElement8826);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleExtractElement8838); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractElementAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3842:1: ( (lv_index_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3843:1: (lv_index_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3843:1: (lv_index_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3844:3: lv_index_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getIndexTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractElement8859);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3868:1: entryRuleInsertElement returns [EObject current=null] : iv_ruleInsertElement= ruleInsertElement EOF ;
    public final EObject entryRuleInsertElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3869:2: (iv_ruleInsertElement= ruleInsertElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3870:2: iv_ruleInsertElement= ruleInsertElement EOF
            {
             newCompositeNode(grammarAccess.getInsertElementRule()); 
            pushFollow(FOLLOW_ruleInsertElement_in_entryRuleInsertElement8895);
            iv_ruleInsertElement=ruleInsertElement();

            state._fsp--;

             current =iv_ruleInsertElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertElement8905); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3877:1: ruleInsertElement returns [EObject current=null] : (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3880:28: ( (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3881:1: (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3881:1: (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3881:3: otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,136,FOLLOW_136_in_ruleInsertElement8942); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertElementAccess().getInsertelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3885:1: ( (lv_vector_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3886:1: (lv_vector_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3886:1: (lv_vector_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3887:3: lv_vector_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getVectorTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement8963);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleInsertElement8975); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertElementAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3907:1: ( (lv_scalar_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3908:1: (lv_scalar_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3908:1: (lv_scalar_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3909:3: lv_scalar_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getScalarTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement8996);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleInsertElement9008); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertElementAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3929:1: ( (lv_index_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3930:1: (lv_index_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3930:1: (lv_index_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3931:3: lv_index_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getIndexTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement9029);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3955:1: entryRuleShuffleVector returns [EObject current=null] : iv_ruleShuffleVector= ruleShuffleVector EOF ;
    public final EObject entryRuleShuffleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3956:2: (iv_ruleShuffleVector= ruleShuffleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3957:2: iv_ruleShuffleVector= ruleShuffleVector EOF
            {
             newCompositeNode(grammarAccess.getShuffleVectorRule()); 
            pushFollow(FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector9065);
            iv_ruleShuffleVector=ruleShuffleVector();

            state._fsp--;

             current =iv_ruleShuffleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShuffleVector9075); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3964:1: ruleShuffleVector returns [EObject current=null] : (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3967:28: ( (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3968:1: (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3968:1: (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3968:3: otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,137,FOLLOW_137_in_ruleShuffleVector9112); 

                	newLeafNode(otherlv_0, grammarAccess.getShuffleVectorAccess().getShufflevectorKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3972:1: ( (lv_vector1_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3973:1: (lv_vector1_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3973:1: (lv_vector1_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3974:3: lv_vector1_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVector1TypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector9133);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleShuffleVector9145); 

                	newLeafNode(otherlv_2, grammarAccess.getShuffleVectorAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3994:1: ( (lv_vector2_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3995:1: (lv_vector2_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3995:1: (lv_vector2_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3996:3: lv_vector2_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVector2TypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector9166);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleShuffleVector9178); 

                	newLeafNode(otherlv_4, grammarAccess.getShuffleVectorAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4016:1: ( (lv_mask_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4017:1: (lv_mask_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4017:1: (lv_mask_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4018:3: lv_mask_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getMaskTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector9199);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4042:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4043:2: (iv_ruleCast= ruleCast EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4044:2: iv_ruleCast= ruleCast EOF
            {
             newCompositeNode(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast9235);
            iv_ruleCast=ruleCast();

            state._fsp--;

             current =iv_ruleCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast9245); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4051:1: ruleCast returns [EObject current=null] : ( ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_castto_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4054:28: ( ( ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4055:1: ( ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4055:1: ( ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4056:5: ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) )
            {
             
                    newCompositeNode(grammarAccess.getCastAccess().getCAST_TYPEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCAST_TYPE_in_ruleCast9286);
            ruleCAST_TYPE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4063:1: ( (lv_value_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4064:1: (lv_value_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4064:1: (lv_value_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4065:3: lv_value_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getValueTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCast9306);
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

            otherlv_2=(Token)match(input,130,FOLLOW_130_in_ruleCast9318); 

                	newLeafNode(otherlv_2, grammarAccess.getCastAccess().getToKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4085:1: ( (lv_castto_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4086:1: (lv_castto_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4086:1: (lv_castto_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4087:3: lv_castto_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getCasttoTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCast9339);
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


    // $ANTLR start "entryRuleCAST_TYPE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4111:1: entryRuleCAST_TYPE returns [String current=null] : iv_ruleCAST_TYPE= ruleCAST_TYPE EOF ;
    public final String entryRuleCAST_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCAST_TYPE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4112:2: (iv_ruleCAST_TYPE= ruleCAST_TYPE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4113:2: iv_ruleCAST_TYPE= ruleCAST_TYPE EOF
            {
             newCompositeNode(grammarAccess.getCAST_TYPERule()); 
            pushFollow(FOLLOW_ruleCAST_TYPE_in_entryRuleCAST_TYPE9376);
            iv_ruleCAST_TYPE=ruleCAST_TYPE();

            state._fsp--;

             current =iv_ruleCAST_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCAST_TYPE9387); 

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
    // $ANTLR end "entryRuleCAST_TYPE"


    // $ANTLR start "ruleCAST_TYPE"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4120:1: ruleCAST_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) ;
    public final AntlrDatatypeRuleToken ruleCAST_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4123:28: ( (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4124:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4124:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            int alt101=12;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt101=1;
                }
                break;
            case 139:
                {
                alt101=2;
                }
                break;
            case 140:
                {
                alt101=3;
                }
                break;
            case 141:
                {
                alt101=4;
                }
                break;
            case 142:
                {
                alt101=5;
                }
                break;
            case 143:
                {
                alt101=6;
                }
                break;
            case 144:
                {
                alt101=7;
                }
                break;
            case 145:
                {
                alt101=8;
                }
                break;
            case 146:
                {
                alt101=9;
                }
                break;
            case 147:
                {
                alt101=10;
                }
                break;
            case 148:
                {
                alt101=11;
                }
                break;
            case 149:
                {
                alt101=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }

            switch (alt101) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4125:2: kw= 'trunc'
                    {
                    kw=(Token)match(input,138,FOLLOW_138_in_ruleCAST_TYPE9425); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getTruncKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4132:2: kw= 'zext'
                    {
                    kw=(Token)match(input,139,FOLLOW_139_in_ruleCAST_TYPE9444); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getZextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4139:2: kw= 'sext'
                    {
                    kw=(Token)match(input,140,FOLLOW_140_in_ruleCAST_TYPE9463); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getSextKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4146:2: kw= 'fptrunc'
                    {
                    kw=(Token)match(input,141,FOLLOW_141_in_ruleCAST_TYPE9482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFptruncKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4153:2: kw= 'fpext'
                    {
                    kw=(Token)match(input,142,FOLLOW_142_in_ruleCAST_TYPE9501); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFpextKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4160:2: kw= 'fptoui'
                    {
                    kw=(Token)match(input,143,FOLLOW_143_in_ruleCAST_TYPE9520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFptouiKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4167:2: kw= 'fptosi'
                    {
                    kw=(Token)match(input,144,FOLLOW_144_in_ruleCAST_TYPE9539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFptosiKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4174:2: kw= 'uitofp'
                    {
                    kw=(Token)match(input,145,FOLLOW_145_in_ruleCAST_TYPE9558); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getUitofpKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4181:2: kw= 'sitofp'
                    {
                    kw=(Token)match(input,146,FOLLOW_146_in_ruleCAST_TYPE9577); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getSitofpKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4188:2: kw= 'ptrtoint'
                    {
                    kw=(Token)match(input,147,FOLLOW_147_in_ruleCAST_TYPE9596); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getPtrtointKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4195:2: kw= 'inttoptr'
                    {
                    kw=(Token)match(input,148,FOLLOW_148_in_ruleCAST_TYPE9615); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getInttoptrKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4202:2: kw= 'bitcast'
                    {
                    kw=(Token)match(input,149,FOLLOW_149_in_ruleCAST_TYPE9634); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getBitcastKeyword_11()); 
                        

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
    // $ANTLR end "ruleCAST_TYPE"


    // $ANTLR start "entryRuleCompare"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4215:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4216:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4217:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare9674);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare9684); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4224:1: ruleCompare returns [EObject current=null] : ( (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_ValuePair_3 = null;

        EObject this_ValuePair_7 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4227:28: ( ( (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4228:1: ( (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4228:1: ( (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==150) ) {
                alt102=1;
            }
            else if ( (LA102_0==151) ) {
                alt102=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4228:2: (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4228:2: (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4228:4: otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair
                    {
                    otherlv_0=(Token)match(input,150,FOLLOW_150_in_ruleCompare9722); 

                        	newLeafNode(otherlv_0, grammarAccess.getCompareAccess().getIcmpKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getI_PREDICATESParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleI_PREDICATES_in_ruleCompare9738);
                    ruleI_PREDICATES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getTypeParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCompare9753);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getValuePairParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleValuePair_in_ruleCompare9774);
                    this_ValuePair_3=ruleValuePair();

                    state._fsp--;

                     
                            current = this_ValuePair_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4258:6: (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4258:6: (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4258:8: otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair
                    {
                    otherlv_4=(Token)match(input,151,FOLLOW_151_in_ruleCompare9793); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getFcmpKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getF_PREDICATESParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleF_PREDICATES_in_ruleCompare9809);
                    ruleF_PREDICATES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getTypeParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCompare9824);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getValuePairParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleValuePair_in_ruleCompare9845);
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


    // $ANTLR start "entryRuleI_PREDICATES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4295:1: entryRuleI_PREDICATES returns [String current=null] : iv_ruleI_PREDICATES= ruleI_PREDICATES EOF ;
    public final String entryRuleI_PREDICATES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleI_PREDICATES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4296:2: (iv_ruleI_PREDICATES= ruleI_PREDICATES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4297:2: iv_ruleI_PREDICATES= ruleI_PREDICATES EOF
            {
             newCompositeNode(grammarAccess.getI_PREDICATESRule()); 
            pushFollow(FOLLOW_ruleI_PREDICATES_in_entryRuleI_PREDICATES9882);
            iv_ruleI_PREDICATES=ruleI_PREDICATES();

            state._fsp--;

             current =iv_ruleI_PREDICATES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleI_PREDICATES9893); 

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
    // $ANTLR end "entryRuleI_PREDICATES"


    // $ANTLR start "ruleI_PREDICATES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4304:1: ruleI_PREDICATES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) ;
    public final AntlrDatatypeRuleToken ruleI_PREDICATES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4307:28: ( (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4308:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4308:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            int alt103=10;
            switch ( input.LA(1) ) {
            case 152:
                {
                alt103=1;
                }
                break;
            case 153:
                {
                alt103=2;
                }
                break;
            case 154:
                {
                alt103=3;
                }
                break;
            case 155:
                {
                alt103=4;
                }
                break;
            case 156:
                {
                alt103=5;
                }
                break;
            case 157:
                {
                alt103=6;
                }
                break;
            case 158:
                {
                alt103=7;
                }
                break;
            case 159:
                {
                alt103=8;
                }
                break;
            case 160:
                {
                alt103=9;
                }
                break;
            case 161:
                {
                alt103=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4309:2: kw= 'eq'
                    {
                    kw=(Token)match(input,152,FOLLOW_152_in_ruleI_PREDICATES9931); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getEqKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4316:2: kw= 'ne'
                    {
                    kw=(Token)match(input,153,FOLLOW_153_in_ruleI_PREDICATES9950); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getNeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4323:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,154,FOLLOW_154_in_ruleI_PREDICATES9969); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4330:2: kw= 'uge'
                    {
                    kw=(Token)match(input,155,FOLLOW_155_in_ruleI_PREDICATES9988); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4337:2: kw= 'ult'
                    {
                    kw=(Token)match(input,156,FOLLOW_156_in_ruleI_PREDICATES10007); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4344:2: kw= 'ule'
                    {
                    kw=(Token)match(input,157,FOLLOW_157_in_ruleI_PREDICATES10026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4351:2: kw= 'sgt'
                    {
                    kw=(Token)match(input,158,FOLLOW_158_in_ruleI_PREDICATES10045); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSgtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4358:2: kw= 'sge'
                    {
                    kw=(Token)match(input,159,FOLLOW_159_in_ruleI_PREDICATES10064); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSgeKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4365:2: kw= 'slt'
                    {
                    kw=(Token)match(input,160,FOLLOW_160_in_ruleI_PREDICATES10083); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSltKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4372:2: kw= 'sle'
                    {
                    kw=(Token)match(input,161,FOLLOW_161_in_ruleI_PREDICATES10102); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSleKeyword_9()); 
                        

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
    // $ANTLR end "ruleI_PREDICATES"


    // $ANTLR start "entryRuleF_PREDICATES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4385:1: entryRuleF_PREDICATES returns [String current=null] : iv_ruleF_PREDICATES= ruleF_PREDICATES EOF ;
    public final String entryRuleF_PREDICATES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleF_PREDICATES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4386:2: (iv_ruleF_PREDICATES= ruleF_PREDICATES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4387:2: iv_ruleF_PREDICATES= ruleF_PREDICATES EOF
            {
             newCompositeNode(grammarAccess.getF_PREDICATESRule()); 
            pushFollow(FOLLOW_ruleF_PREDICATES_in_entryRuleF_PREDICATES10143);
            iv_ruleF_PREDICATES=ruleF_PREDICATES();

            state._fsp--;

             current =iv_ruleF_PREDICATES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleF_PREDICATES10154); 

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
    // $ANTLR end "entryRuleF_PREDICATES"


    // $ANTLR start "ruleF_PREDICATES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4394:1: ruleF_PREDICATES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleF_PREDICATES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4397:28: ( (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4398:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4398:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            int alt104=16;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt104=1;
                }
                break;
            case 162:
                {
                alt104=2;
                }
                break;
            case 163:
                {
                alt104=3;
                }
                break;
            case 164:
                {
                alt104=4;
                }
                break;
            case 165:
                {
                alt104=5;
                }
                break;
            case 166:
                {
                alt104=6;
                }
                break;
            case 167:
                {
                alt104=7;
                }
                break;
            case 168:
                {
                alt104=8;
                }
                break;
            case 169:
                {
                alt104=9;
                }
                break;
            case 154:
                {
                alt104=10;
                }
                break;
            case 155:
                {
                alt104=11;
                }
                break;
            case 156:
                {
                alt104=12;
                }
                break;
            case 157:
                {
                alt104=13;
                }
                break;
            case 170:
                {
                alt104=14;
                }
                break;
            case 171:
                {
                alt104=15;
                }
                break;
            case 43:
                {
                alt104=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4399:2: kw= 'false'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleF_PREDICATES10192); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getFalseKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4406:2: kw= 'oeq'
                    {
                    kw=(Token)match(input,162,FOLLOW_162_in_ruleF_PREDICATES10211); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOeqKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4413:2: kw= 'ogt'
                    {
                    kw=(Token)match(input,163,FOLLOW_163_in_ruleF_PREDICATES10230); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4420:2: kw= 'oge'
                    {
                    kw=(Token)match(input,164,FOLLOW_164_in_ruleF_PREDICATES10249); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4427:2: kw= 'olt'
                    {
                    kw=(Token)match(input,165,FOLLOW_165_in_ruleF_PREDICATES10268); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4434:2: kw= 'ole'
                    {
                    kw=(Token)match(input,166,FOLLOW_166_in_ruleF_PREDICATES10287); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4441:2: kw= 'one'
                    {
                    kw=(Token)match(input,167,FOLLOW_167_in_ruleF_PREDICATES10306); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOneKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4448:2: kw= 'ord'
                    {
                    kw=(Token)match(input,168,FOLLOW_168_in_ruleF_PREDICATES10325); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOrdKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4455:2: kw= 'ueq'
                    {
                    kw=(Token)match(input,169,FOLLOW_169_in_ruleF_PREDICATES10344); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUeqKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4462:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,154,FOLLOW_154_in_ruleF_PREDICATES10363); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUgtKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4469:2: kw= 'uge'
                    {
                    kw=(Token)match(input,155,FOLLOW_155_in_ruleF_PREDICATES10382); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUgeKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4476:2: kw= 'ult'
                    {
                    kw=(Token)match(input,156,FOLLOW_156_in_ruleF_PREDICATES10401); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUltKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4483:2: kw= 'ule'
                    {
                    kw=(Token)match(input,157,FOLLOW_157_in_ruleF_PREDICATES10420); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUleKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4490:2: kw= 'une'
                    {
                    kw=(Token)match(input,170,FOLLOW_170_in_ruleF_PREDICATES10439); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUneKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4497:2: kw= 'uno'
                    {
                    kw=(Token)match(input,171,FOLLOW_171_in_ruleF_PREDICATES10458); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUnoKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4504:2: kw= 'true'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleF_PREDICATES10477); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getTrueKeyword_15()); 
                        

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
    // $ANTLR end "ruleF_PREDICATES"


    // $ANTLR start "entryRuleARITHMETIC_OP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4517:1: entryRuleARITHMETIC_OP returns [EObject current=null] : iv_ruleARITHMETIC_OP= ruleARITHMETIC_OP EOF ;
    public final EObject entryRuleARITHMETIC_OP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARITHMETIC_OP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4518:2: (iv_ruleARITHMETIC_OP= ruleARITHMETIC_OP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4519:2: iv_ruleARITHMETIC_OP= ruleARITHMETIC_OP EOF
            {
             newCompositeNode(grammarAccess.getARITHMETIC_OPRule()); 
            pushFollow(FOLLOW_ruleARITHMETIC_OP_in_entryRuleARITHMETIC_OP10517);
            iv_ruleARITHMETIC_OP=ruleARITHMETIC_OP();

            state._fsp--;

             current =iv_ruleARITHMETIC_OP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleARITHMETIC_OP10527); 

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
    // $ANTLR end "entryRuleARITHMETIC_OP"


    // $ANTLR start "ruleARITHMETIC_OP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4526:1: ruleARITHMETIC_OP returns [EObject current=null] : ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair ) ;
    public final EObject ruleARITHMETIC_OP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject this_ValuePair_13 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4529:28: ( ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4530:1: ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4530:1: ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4530:2: (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4530:2: (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' )
            int alt105=12;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt105=1;
                }
                break;
            case 172:
                {
                alt105=2;
                }
                break;
            case 68:
                {
                alt105=3;
                }
                break;
            case 173:
                {
                alt105=4;
                }
                break;
            case 174:
                {
                alt105=5;
                }
                break;
            case 175:
                {
                alt105=6;
                }
                break;
            case 176:
                {
                alt105=7;
                }
                break;
            case 177:
                {
                alt105=8;
                }
                break;
            case 178:
                {
                alt105=9;
                }
                break;
            case 179:
                {
                alt105=10;
                }
                break;
            case 180:
                {
                alt105=11;
                }
                break;
            case 181:
                {
                alt105=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }

            switch (alt105) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4530:4: otherlv_0= 'add'
                    {
                    otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleARITHMETIC_OP10565); 

                        	newLeafNode(otherlv_0, grammarAccess.getARITHMETIC_OPAccess().getAddKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4535:7: otherlv_1= 'fadd'
                    {
                    otherlv_1=(Token)match(input,172,FOLLOW_172_in_ruleARITHMETIC_OP10583); 

                        	newLeafNode(otherlv_1, grammarAccess.getARITHMETIC_OPAccess().getFaddKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4540:7: otherlv_2= 'sub'
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleARITHMETIC_OP10601); 

                        	newLeafNode(otherlv_2, grammarAccess.getARITHMETIC_OPAccess().getSubKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4545:7: otherlv_3= 'fsub'
                    {
                    otherlv_3=(Token)match(input,173,FOLLOW_173_in_ruleARITHMETIC_OP10619); 

                        	newLeafNode(otherlv_3, grammarAccess.getARITHMETIC_OPAccess().getFsubKeyword_0_3());
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4550:7: otherlv_4= 'mul'
                    {
                    otherlv_4=(Token)match(input,174,FOLLOW_174_in_ruleARITHMETIC_OP10637); 

                        	newLeafNode(otherlv_4, grammarAccess.getARITHMETIC_OPAccess().getMulKeyword_0_4());
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4555:7: otherlv_5= 'fmul'
                    {
                    otherlv_5=(Token)match(input,175,FOLLOW_175_in_ruleARITHMETIC_OP10655); 

                        	newLeafNode(otherlv_5, grammarAccess.getARITHMETIC_OPAccess().getFmulKeyword_0_5());
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4560:7: otherlv_6= 'udiv'
                    {
                    otherlv_6=(Token)match(input,176,FOLLOW_176_in_ruleARITHMETIC_OP10673); 

                        	newLeafNode(otherlv_6, grammarAccess.getARITHMETIC_OPAccess().getUdivKeyword_0_6());
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4565:7: otherlv_7= 'sdiv'
                    {
                    otherlv_7=(Token)match(input,177,FOLLOW_177_in_ruleARITHMETIC_OP10691); 

                        	newLeafNode(otherlv_7, grammarAccess.getARITHMETIC_OPAccess().getSdivKeyword_0_7());
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4570:7: otherlv_8= 'fdiv'
                    {
                    otherlv_8=(Token)match(input,178,FOLLOW_178_in_ruleARITHMETIC_OP10709); 

                        	newLeafNode(otherlv_8, grammarAccess.getARITHMETIC_OPAccess().getFdivKeyword_0_8());
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4575:7: otherlv_9= 'urem'
                    {
                    otherlv_9=(Token)match(input,179,FOLLOW_179_in_ruleARITHMETIC_OP10727); 

                        	newLeafNode(otherlv_9, grammarAccess.getARITHMETIC_OPAccess().getUremKeyword_0_9());
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4580:7: otherlv_10= 'srem'
                    {
                    otherlv_10=(Token)match(input,180,FOLLOW_180_in_ruleARITHMETIC_OP10745); 

                        	newLeafNode(otherlv_10, grammarAccess.getARITHMETIC_OPAccess().getSremKeyword_0_10());
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4585:7: otherlv_11= 'frem'
                    {
                    otherlv_11=(Token)match(input,181,FOLLOW_181_in_ruleARITHMETIC_OP10763); 

                        	newLeafNode(otherlv_11, grammarAccess.getARITHMETIC_OPAccess().getFremKeyword_0_11());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getARITHMETIC_OPAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleARITHMETIC_OP10780);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getARITHMETIC_OPAccess().getValuePairParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleValuePair_in_ruleARITHMETIC_OP10801);
            this_ValuePair_13=ruleValuePair();

            state._fsp--;

             
                    current = this_ValuePair_13; 
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
    // $ANTLR end "ruleARITHMETIC_OP"


    // $ANTLR start "entryRuleLOGICAL_OP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4614:1: entryRuleLOGICAL_OP returns [EObject current=null] : iv_ruleLOGICAL_OP= ruleLOGICAL_OP EOF ;
    public final EObject entryRuleLOGICAL_OP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOGICAL_OP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4615:2: (iv_ruleLOGICAL_OP= ruleLOGICAL_OP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4616:2: iv_ruleLOGICAL_OP= ruleLOGICAL_OP EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_OPRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OP_in_entryRuleLOGICAL_OP10836);
            iv_ruleLOGICAL_OP=ruleLOGICAL_OP();

            state._fsp--;

             current =iv_ruleLOGICAL_OP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OP10846); 

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
    // $ANTLR end "entryRuleLOGICAL_OP"


    // $ANTLR start "ruleLOGICAL_OP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4623:1: ruleLOGICAL_OP returns [EObject current=null] : ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair ) ;
    public final EObject ruleLOGICAL_OP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject this_ValuePair_7 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4626:28: ( ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4627:1: ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4627:1: ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4627:2: (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4627:2: (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' )
            int alt106=6;
            switch ( input.LA(1) ) {
            case 182:
                {
                alt106=1;
                }
                break;
            case 183:
                {
                alt106=2;
                }
                break;
            case 184:
                {
                alt106=3;
                }
                break;
            case 69:
                {
                alt106=4;
                }
                break;
            case 71:
                {
                alt106=5;
                }
                break;
            case 72:
                {
                alt106=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4627:4: otherlv_0= 'shl'
                    {
                    otherlv_0=(Token)match(input,182,FOLLOW_182_in_ruleLOGICAL_OP10884); 

                        	newLeafNode(otherlv_0, grammarAccess.getLOGICAL_OPAccess().getShlKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4632:7: otherlv_1= 'lshr'
                    {
                    otherlv_1=(Token)match(input,183,FOLLOW_183_in_ruleLOGICAL_OP10902); 

                        	newLeafNode(otherlv_1, grammarAccess.getLOGICAL_OPAccess().getLshrKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4637:7: otherlv_2= 'ashr'
                    {
                    otherlv_2=(Token)match(input,184,FOLLOW_184_in_ruleLOGICAL_OP10920); 

                        	newLeafNode(otherlv_2, grammarAccess.getLOGICAL_OPAccess().getAshrKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4642:7: otherlv_3= 'and'
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_69_in_ruleLOGICAL_OP10938); 

                        	newLeafNode(otherlv_3, grammarAccess.getLOGICAL_OPAccess().getAndKeyword_0_3());
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4647:7: otherlv_4= 'or'
                    {
                    otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleLOGICAL_OP10956); 

                        	newLeafNode(otherlv_4, grammarAccess.getLOGICAL_OPAccess().getOrKeyword_0_4());
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4652:7: otherlv_5= 'xor'
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleLOGICAL_OP10974); 

                        	newLeafNode(otherlv_5, grammarAccess.getLOGICAL_OPAccess().getXorKeyword_0_5());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getLOGICAL_OPAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleLOGICAL_OP10991);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getLOGICAL_OPAccess().getValuePairParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleValuePair_in_ruleLOGICAL_OP11012);
            this_ValuePair_7=ruleValuePair();

            state._fsp--;

             
                    current = this_ValuePair_7; 
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
    // $ANTLR end "ruleLOGICAL_OP"


    // $ANTLR start "entryRuleInstruction"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4681:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4682:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4683:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction11047);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction11057); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4690:1: ruleInstruction returns [EObject current=null] : ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad | this_LocalVar_23= ruleLocalVar ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Load_1 = null;

        EObject this_Store_3 = null;

        EObject this_Fence_4 = null;

        EObject this_GetElementPtr_5 = null;

        EObject this_LOGICAL_OP_6 = null;

        EObject this_ARITHMETIC_OP_7 = null;

        EObject this_Compare_8 = null;

        EObject this_Cast_9 = null;

        EObject this_ShuffleVector_10 = null;

        EObject this_InsertElement_11 = null;

        EObject this_ExtractElement_12 = null;

        EObject this_InsertValue_13 = null;

        EObject this_ExtractValue_14 = null;

        EObject this_Alloc_15 = null;

        EObject this_CmpXchg_16 = null;

        EObject this_AtomicRMW_17 = null;

        EObject this_PHI_18 = null;

        EObject this_Select_19 = null;

        EObject this_Call_20 = null;

        EObject this_VA_Arg_21 = null;

        EObject this_LandingPad_22 = null;

        EObject this_LocalVar_23 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4693:28: ( ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad | this_LocalVar_23= ruleLocalVar ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:1: ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad | this_LocalVar_23= ruleLocalVar )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:1: ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad | this_LocalVar_23= ruleLocalVar )
            int alt109=22;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:2: ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:2: ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:3: (otherlv_0= 'volatile' )? this_Load_1= ruleLoad
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:3: (otherlv_0= 'volatile' )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==64) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4694:5: otherlv_0= 'volatile'
                            {
                            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleInstruction11096); 

                                	newLeafNode(otherlv_0, grammarAccess.getInstructionAccess().getVolatileKeyword_0_0());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleLoad_in_ruleInstruction11120);
                    this_Load_1=ruleLoad();

                    state._fsp--;

                     
                            current = this_Load_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4708:6: ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4708:6: ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4708:7: (otherlv_2= 'volatile' )? this_Store_3= ruleStore
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4708:7: (otherlv_2= 'volatile' )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==64) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4708:9: otherlv_2= 'volatile'
                            {
                            otherlv_2=(Token)match(input,64,FOLLOW_64_in_ruleInstruction11140); 

                                	newLeafNode(otherlv_2, grammarAccess.getInstructionAccess().getVolatileKeyword_1_0());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getStoreParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleStore_in_ruleInstruction11164);
                    this_Store_3=ruleStore();

                    state._fsp--;

                     
                            current = this_Store_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4723:5: this_Fence_4= ruleFence
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFence_in_ruleInstruction11192);
                    this_Fence_4=ruleFence();

                    state._fsp--;

                     
                            current = this_Fence_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4733:5: this_GetElementPtr_5= ruleGetElementPtr
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGetElementPtrParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGetElementPtr_in_ruleInstruction11219);
                    this_GetElementPtr_5=ruleGetElementPtr();

                    state._fsp--;

                     
                            current = this_GetElementPtr_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4743:5: this_LOGICAL_OP_6= ruleLOGICAL_OP
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLOGICAL_OPParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLOGICAL_OP_in_ruleInstruction11246);
                    this_LOGICAL_OP_6=ruleLOGICAL_OP();

                    state._fsp--;

                     
                            current = this_LOGICAL_OP_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4753:5: this_ARITHMETIC_OP_7= ruleARITHMETIC_OP
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getARITHMETIC_OPParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleARITHMETIC_OP_in_ruleInstruction11273);
                    this_ARITHMETIC_OP_7=ruleARITHMETIC_OP();

                    state._fsp--;

                     
                            current = this_ARITHMETIC_OP_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4763:5: this_Compare_8= ruleCompare
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCompareParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCompare_in_ruleInstruction11300);
                    this_Compare_8=ruleCompare();

                    state._fsp--;

                     
                            current = this_Compare_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4773:5: this_Cast_9= ruleCast
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCastParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleCast_in_ruleInstruction11327);
                    this_Cast_9=ruleCast();

                    state._fsp--;

                     
                            current = this_Cast_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4783:5: this_ShuffleVector_10= ruleShuffleVector
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getShuffleVectorParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleShuffleVector_in_ruleInstruction11354);
                    this_ShuffleVector_10=ruleShuffleVector();

                    state._fsp--;

                     
                            current = this_ShuffleVector_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4793:5: this_InsertElement_11= ruleInsertElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertElementParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleInsertElement_in_ruleInstruction11381);
                    this_InsertElement_11=ruleInsertElement();

                    state._fsp--;

                     
                            current = this_InsertElement_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4803:5: this_ExtractElement_12= ruleExtractElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractElementParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleExtractElement_in_ruleInstruction11408);
                    this_ExtractElement_12=ruleExtractElement();

                    state._fsp--;

                     
                            current = this_ExtractElement_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4813:5: this_InsertValue_13= ruleInsertValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertValueParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleInsertValue_in_ruleInstruction11435);
                    this_InsertValue_13=ruleInsertValue();

                    state._fsp--;

                     
                            current = this_InsertValue_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4823:5: this_ExtractValue_14= ruleExtractValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractValueParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleExtractValue_in_ruleInstruction11462);
                    this_ExtractValue_14=ruleExtractValue();

                    state._fsp--;

                     
                            current = this_ExtractValue_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4833:5: this_Alloc_15= ruleAlloc
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAllocParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleAlloc_in_ruleInstruction11489);
                    this_Alloc_15=ruleAlloc();

                    state._fsp--;

                     
                            current = this_Alloc_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4843:5: this_CmpXchg_16= ruleCmpXchg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCmpXchgParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleCmpXchg_in_ruleInstruction11516);
                    this_CmpXchg_16=ruleCmpXchg();

                    state._fsp--;

                     
                            current = this_CmpXchg_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4853:5: this_AtomicRMW_17= ruleAtomicRMW
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAtomicRMWParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRMW_in_ruleInstruction11543);
                    this_AtomicRMW_17=ruleAtomicRMW();

                    state._fsp--;

                     
                            current = this_AtomicRMW_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4863:5: this_PHI_18= rulePHI
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPHIParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_rulePHI_in_ruleInstruction11570);
                    this_PHI_18=rulePHI();

                    state._fsp--;

                     
                            current = this_PHI_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4873:5: this_Select_19= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSelectParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleInstruction11597);
                    this_Select_19=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4883:5: this_Call_20= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleInstruction11624);
                    this_Call_20=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4893:5: this_VA_Arg_21= ruleVA_Arg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getVA_ArgParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleVA_Arg_in_ruleInstruction11651);
                    this_VA_Arg_21=ruleVA_Arg();

                    state._fsp--;

                     
                            current = this_VA_Arg_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4903:5: this_LandingPad_22= ruleLandingPad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLandingPadParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleLandingPad_in_ruleInstruction11678);
                    this_LandingPad_22=ruleLandingPad();

                    state._fsp--;

                     
                            current = this_LandingPad_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4913:5: this_LocalVar_23= ruleLocalVar
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLocalVarParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleLocalVar_in_ruleInstruction11705);
                    this_LocalVar_23=ruleLocalVar();

                    state._fsp--;

                     
                            current = this_LocalVar_23; 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4929:1: entryRuleIndirectBranch returns [EObject current=null] : iv_ruleIndirectBranch= ruleIndirectBranch EOF ;
    public final EObject entryRuleIndirectBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4930:2: (iv_ruleIndirectBranch= ruleIndirectBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4931:2: iv_ruleIndirectBranch= ruleIndirectBranch EOF
            {
             newCompositeNode(grammarAccess.getIndirectBranchRule()); 
            pushFollow(FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch11740);
            iv_ruleIndirectBranch=ruleIndirectBranch();

            state._fsp--;

             current =iv_ruleIndirectBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndirectBranch11750); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4938:1: ruleIndirectBranch returns [EObject current=null] : (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4941:28: ( (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4942:1: (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4942:1: (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4942:3: otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,185,FOLLOW_185_in_ruleIndirectBranch11787); 

                	newLeafNode(otherlv_0, grammarAccess.getIndirectBranchAccess().getIndirectbrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4946:1: ( (lv_adress_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4947:1: (lv_adress_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4947:1: (lv_adress_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4948:3: lv_adress_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getAdressTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleIndirectBranch11808);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleIndirectBranch11820); 

                	newLeafNode(otherlv_2, grammarAccess.getIndirectBranchAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleIndirectBranch11832); 

                	newLeafNode(otherlv_3, grammarAccess.getIndirectBranchAccess().getLeftSquareBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4972:1: ( (lv_lList_4_0= ruleLabelList ) )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( ((LA110_0>=RULE_VAR_TYPE && LA110_0<=RULE_INT)||LA110_0==33||(LA110_0>=39 && LA110_0<=50)) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4973:1: (lv_lList_4_0= ruleLabelList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4973:1: (lv_lList_4_0= ruleLabelList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4974:3: lv_lList_4_0= ruleLabelList
                    {
                     
                    	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getLListLabelListParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelList_in_ruleIndirectBranch11853);
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

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleIndirectBranch11866); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5002:1: entryRuleLabelList returns [EObject current=null] : iv_ruleLabelList= ruleLabelList EOF ;
    public final EObject entryRuleLabelList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5003:2: (iv_ruleLabelList= ruleLabelList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5004:2: iv_ruleLabelList= ruleLabelList EOF
            {
             newCompositeNode(grammarAccess.getLabelListRule()); 
            pushFollow(FOLLOW_ruleLabelList_in_entryRuleLabelList11902);
            iv_ruleLabelList=ruleLabelList();

            state._fsp--;

             current =iv_ruleLabelList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelList11912); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5011:1: ruleLabelList returns [EObject current=null] : ( (lv_labels_0_0= ruleTypeAndValue ) )+ ;
    public final EObject ruleLabelList() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5014:28: ( ( (lv_labels_0_0= ruleTypeAndValue ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5015:1: ( (lv_labels_0_0= ruleTypeAndValue ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5015:1: ( (lv_labels_0_0= ruleTypeAndValue ) )+
            int cnt111=0;
            loop111:
            do {
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( ((LA111_0>=RULE_VAR_TYPE && LA111_0<=RULE_INT)||LA111_0==33||(LA111_0>=39 && LA111_0<=50)) ) {
                    alt111=1;
                }


                switch (alt111) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5016:1: (lv_labels_0_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5016:1: (lv_labels_0_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5017:3: lv_labels_0_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelListAccess().getLabelsTypeAndValueParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLabelList11957);
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
            	    if ( cnt111 >= 1 ) break loop111;
                        EarlyExitException eee =
                            new EarlyExitException(111, input);
                        throw eee;
                }
                cnt111++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5041:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5042:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5043:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch11993);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch12003); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5050:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5053:28: ( (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5054:1: (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5054:1: (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5054:3: otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,186,FOLLOW_186_in_ruleSwitch12040); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5058:1: ( (lv_value_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5059:1: (lv_value_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5059:1: (lv_value_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5060:3: lv_value_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getValueTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSwitch12061);
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

            otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleSwitch12073); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5080:1: ( (lv_default_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5081:1: (lv_default_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5081:1: (lv_default_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5082:3: lv_default_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSwitch12094);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleSwitch12106); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5102:1: ( (lv_jTable_5_0= ruleJumpTable ) )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=RULE_VAR_TYPE && LA112_0<=RULE_INT)||LA112_0==33||(LA112_0>=39 && LA112_0<=50)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5103:1: (lv_jTable_5_0= ruleJumpTable )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5103:1: (lv_jTable_5_0= ruleJumpTable )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5104:3: lv_jTable_5_0= ruleJumpTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getSwitchAccess().getJTableJumpTableParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJumpTable_in_ruleSwitch12127);
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

            otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleSwitch12140); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5132:1: entryRuleJumpTable returns [EObject current=null] : iv_ruleJumpTable= ruleJumpTable EOF ;
    public final EObject entryRuleJumpTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpTable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5133:2: (iv_ruleJumpTable= ruleJumpTable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5134:2: iv_ruleJumpTable= ruleJumpTable EOF
            {
             newCompositeNode(grammarAccess.getJumpTableRule()); 
            pushFollow(FOLLOW_ruleJumpTable_in_entryRuleJumpTable12176);
            iv_ruleJumpTable=ruleJumpTable();

            state._fsp--;

             current =iv_ruleJumpTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJumpTable12186); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5141:1: ruleJumpTable returns [EObject current=null] : ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+ ;
    public final EObject ruleJumpTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_destinations_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5144:28: ( ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5145:1: ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5145:1: ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+
            int cnt113=0;
            loop113:
            do {
                int alt113=2;
                int LA113_0 = input.LA(1);

                if ( ((LA113_0>=RULE_VAR_TYPE && LA113_0<=RULE_INT)||LA113_0==33||(LA113_0>=39 && LA113_0<=50)) ) {
                    alt113=1;
                }


                switch (alt113) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5145:2: ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5145:2: ( (lv_values_0_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5146:1: (lv_values_0_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5146:1: (lv_values_0_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5147:3: lv_values_0_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getValuesTypeAndValueParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleJumpTable12232);
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

            	    otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleJumpTable12244); 

            	        	newLeafNode(otherlv_1, grammarAccess.getJumpTableAccess().getCommaKeyword_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5167:1: ( (lv_destinations_2_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5168:1: (lv_destinations_2_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5168:1: (lv_destinations_2_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5169:3: lv_destinations_2_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getDestinationsTypeAndValueParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleJumpTable12265);
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
            	    if ( cnt113 >= 1 ) break loop113;
                        EarlyExitException eee =
                            new EarlyExitException(113, input);
                        throw eee;
                }
                cnt113++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5193:1: entryRuleInvoke returns [EObject current=null] : iv_ruleInvoke= ruleInvoke EOF ;
    public final EObject entryRuleInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoke = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5194:2: (iv_ruleInvoke= ruleInvoke EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5195:2: iv_ruleInvoke= ruleInvoke EOF
            {
             newCompositeNode(grammarAccess.getInvokeRule()); 
            pushFollow(FOLLOW_ruleInvoke_in_entryRuleInvoke12302);
            iv_ruleInvoke=ruleInvoke();

            state._fsp--;

             current =iv_ruleInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvoke12312); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5202:1: ruleInvoke returns [EObject current=null] : (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) ) ;
    public final EObject ruleInvoke() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_function_3_0 = null;

        AntlrDatatypeRuleToken lv_pList_4_0 = null;

        EObject lv_to_7_0 = null;

        EObject lv_unwind_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5205:28: ( (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5206:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5206:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5206:3: otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,187,FOLLOW_187_in_ruleInvoke12349); 

                	newLeafNode(otherlv_0, grammarAccess.getInvokeAccess().getInvokeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5210:1: ( ruleCallingConv )?
            int alt114=2;
            int LA114_0 = input.LA(1);

            if ( ((LA114_0>=92 && LA114_0<=106)) ) {
                alt114=1;
            }
            switch (alt114) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5211:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleInvoke12366);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5218:3: ( ruleRETURN_ATTRIBUTES )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( ((LA115_0>=83 && LA115_0<=90)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5219:5: ruleRETURN_ATTRIBUTES
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getRETURN_ATTRIBUTESParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleInvoke12384);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5226:3: ( (lv_function_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5227:1: (lv_function_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5227:1: (lv_function_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5228:3: lv_function_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getFunctionTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke12406);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5244:2: ( (lv_pList_4_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5245:1: (lv_pList_4_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5245:1: (lv_pList_4_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5246:3: lv_pList_4_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleInvoke12427);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5262:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( ((LA116_0>=107 && LA116_0<=124)) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5263:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke12444);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop116;
                }
            } while (true);

            otherlv_6=(Token)match(input,130,FOLLOW_130_in_ruleInvoke12457); 

                	newLeafNode(otherlv_6, grammarAccess.getInvokeAccess().getToKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5274:1: ( (lv_to_7_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5275:1: (lv_to_7_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5275:1: (lv_to_7_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5276:3: lv_to_7_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getToTypeAndValueParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke12478);
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

            otherlv_8=(Token)match(input,188,FOLLOW_188_in_ruleInvoke12490); 

                	newLeafNode(otherlv_8, grammarAccess.getInvokeAccess().getUnwindKeyword_8());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5296:1: ( (lv_unwind_9_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5297:1: (lv_unwind_9_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5297:1: (lv_unwind_9_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5298:3: lv_unwind_9_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getUnwindTypeAndValueParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke12511);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5322:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5323:2: (iv_ruleResume= ruleResume EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5324:2: iv_ruleResume= ruleResume EOF
            {
             newCompositeNode(grammarAccess.getResumeRule()); 
            pushFollow(FOLLOW_ruleResume_in_entryRuleResume12547);
            iv_ruleResume=ruleResume();

            state._fsp--;

             current =iv_ruleResume; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResume12557); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5331:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TypeAndValue_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5334:28: ( (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5335:1: (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5335:1: (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5335:3: otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue
            {
            otherlv_0=(Token)match(input,189,FOLLOW_189_in_ruleResume12594); 

                	newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getResumeAccess().getTypeAndValueParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleResume12616);
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


    // $ANTLR start "entryRuleUnreachable"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5356:1: entryRuleUnreachable returns [EObject current=null] : iv_ruleUnreachable= ruleUnreachable EOF ;
    public final EObject entryRuleUnreachable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnreachable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5357:2: (iv_ruleUnreachable= ruleUnreachable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5358:2: iv_ruleUnreachable= ruleUnreachable EOF
            {
             newCompositeNode(grammarAccess.getUnreachableRule()); 
            pushFollow(FOLLOW_ruleUnreachable_in_entryRuleUnreachable12651);
            iv_ruleUnreachable=ruleUnreachable();

            state._fsp--;

             current =iv_ruleUnreachable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnreachable12661); 

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
    // $ANTLR end "entryRuleUnreachable"


    // $ANTLR start "ruleUnreachable"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5365:1: ruleUnreachable returns [EObject current=null] : ( () otherlv_1= 'unreachable' ) ;
    public final EObject ruleUnreachable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5368:28: ( ( () otherlv_1= 'unreachable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5369:1: ( () otherlv_1= 'unreachable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5369:1: ( () otherlv_1= 'unreachable' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5369:2: () otherlv_1= 'unreachable'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5369:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5370:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnreachableAccess().getUnreachableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,190,FOLLOW_190_in_ruleUnreachable12707); 

                	newLeafNode(otherlv_1, grammarAccess.getUnreachableAccess().getUnreachableKeyword_1());
                

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
    // $ANTLR end "ruleUnreachable"


    // $ANTLR start "entryRuleReturn"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5387:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5388:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5389:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn12743);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn12753); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5396:1: ruleReturn returns [EObject current=null] : ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5399:28: ( ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )
            int alt119=2;
            alt119 = dfa119.predict(input);
            switch (alt119) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:3: () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:3: ()
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5401:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getReturnAccess().getReturnAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,191,FOLLOW_191_in_ruleReturn12800); 

                        	newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getRetKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,39,FOLLOW_39_in_ruleReturn12812); 

                        	newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getVoidKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5414:1: (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    int alt117=2;
                    int LA117_0 = input.LA(1);

                    if ( (LA117_0==24) ) {
                        alt117=1;
                    }
                    switch (alt117) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5414:3: otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT
                            {
                            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleReturn12825); 

                                	newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getCommaKeyword_0_3_0());
                                
                            otherlv_4=(Token)match(input,192,FOLLOW_192_in_ruleReturn12837); 

                                	newLeafNode(otherlv_4, grammarAccess.getReturnAccess().getDbgKeyword_0_3_1());
                                
                            otherlv_5=(Token)match(input,193,FOLLOW_193_in_ruleReturn12849); 

                                	newLeafNode(otherlv_5, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_3_2());
                                
                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn12860); 
                             
                                newLeafNode(this_INT_6, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_3_3()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5431:6: (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5431:6: (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5431:8: otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )?
                    {
                    otherlv_7=(Token)match(input,191,FOLLOW_191_in_ruleReturn12881); 

                        	newLeafNode(otherlv_7, grammarAccess.getReturnAccess().getRetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5435:1: ( (lv_value_8_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5436:1: (lv_value_8_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5436:1: (lv_value_8_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5437:3: lv_value_8_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getReturnAccess().getValueTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleReturn12902);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5453:2: (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )?
                    int alt118=2;
                    int LA118_0 = input.LA(1);

                    if ( (LA118_0==24) ) {
                        alt118=1;
                    }
                    switch (alt118) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5453:4: otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT
                            {
                            otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleReturn12915); 

                                	newLeafNode(otherlv_9, grammarAccess.getReturnAccess().getCommaKeyword_1_2_0());
                                
                            otherlv_10=(Token)match(input,192,FOLLOW_192_in_ruleReturn12927); 

                                	newLeafNode(otherlv_10, grammarAccess.getReturnAccess().getDbgKeyword_1_2_1());
                                
                            otherlv_11=(Token)match(input,193,FOLLOW_193_in_ruleReturn12939); 

                                	newLeafNode(otherlv_11, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_2_2());
                                
                            this_INT_12=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn12950); 
                             
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5477:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5478:2: (iv_ruleBranch= ruleBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5479:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_ruleBranch_in_entryRuleBranch12988);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranch12998); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5486:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5489:28: ( ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5490:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5490:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )
            int alt120=2;
            alt120 = dfa120.predict(input);
            switch (alt120) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5490:2: (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5490:2: (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5490:4: otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) )
                    {
                    otherlv_0=(Token)match(input,194,FOLLOW_194_in_ruleBranch13036); 

                        	newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBrKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5494:1: ( (lv_destination_1_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5495:1: (lv_destination_1_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5495:1: (lv_destination_1_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5496:3: lv_destination_1_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getDestinationTypeAndValueParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch13057);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5513:6: (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5513:6: (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5513:8: otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) )
                    {
                    otherlv_2=(Token)match(input,194,FOLLOW_194_in_ruleBranch13077); 

                        	newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getBrKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5517:1: ( (lv_cond_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5518:1: (lv_cond_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5518:1: (lv_cond_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5519:3: lv_cond_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getCondTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch13098);
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

                    otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleBranch13110); 

                        	newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getCommaKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5539:1: ( (lv_labelTrue_5_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5540:1: (lv_labelTrue_5_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5540:1: (lv_labelTrue_5_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5541:3: lv_labelTrue_5_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelTrueTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch13131);
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

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleBranch13143); 

                        	newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5561:1: ( (lv_labelFalse_7_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5562:1: (lv_labelFalse_7_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5562:1: (lv_labelFalse_7_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5563:3: lv_labelFalse_7_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelFalseTypeAndValueParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch13164);
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


    // $ANTLR start "entryRuleFunctionBody"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5587:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBody = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5588:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5589:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody13201);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody13211); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5596:1: ruleFunctionBody returns [EObject current=null] : ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_meta_0_0 = null;

        EObject lv_blocks_2_0 = null;

        AntlrDatatypeRuleToken lv_meta_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5599:28: ( ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5600:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5600:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5600:2: ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5600:2: ( (lv_meta_0_0= ruleMetadataValue ) )*
            loop121:
            do {
                int alt121=2;
                int LA121_0 = input.LA(1);

                if ( (LA121_0==193||LA121_0==215) ) {
                    alt121=1;
                }


                switch (alt121) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5601:1: (lv_meta_0_0= ruleMetadataValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5601:1: (lv_meta_0_0= ruleMetadataValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5602:3: lv_meta_0_0= ruleMetadataValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getMetaMetadataValueParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleFunctionBody13257);
            	    lv_meta_0_0=ruleMetadataValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"meta",
            	            		lv_meta_0_0, 
            	            		"MetadataValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop121;
                }
            } while (true);

            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleFunctionBody13270); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5622:1: ( (lv_blocks_2_0= ruleBasicBlock ) )+
            int cnt122=0;
            loop122:
            do {
                int alt122=2;
                int LA122_0 = input.LA(1);

                if ( ((LA122_0>=RULE_VAR_TYPE && LA122_0<=RULE_NOBRACKET)||LA122_0==33||LA122_0==37||(LA122_0>=39 && LA122_0<=51)||(LA122_0>=53 && LA122_0<=55)||(LA122_0>=63 && LA122_0<=65)||(LA122_0>=67 && LA122_0<=69)||(LA122_0>=71 && LA122_0<=72)||LA122_0==77||(LA122_0>=80 && LA122_0<=82)||LA122_0==91||(LA122_0>=125 && LA122_0<=126)||(LA122_0>=133 && LA122_0<=151)||(LA122_0>=172 && LA122_0<=187)||(LA122_0>=189 && LA122_0<=191)||LA122_0==194) ) {
                    alt122=1;
                }


                switch (alt122) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5623:1: (lv_blocks_2_0= ruleBasicBlock )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5623:1: (lv_blocks_2_0= ruleBasicBlock )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5624:3: lv_blocks_2_0= ruleBasicBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getBlocksBasicBlockParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBasicBlock_in_ruleFunctionBody13291);
            	    lv_blocks_2_0=ruleBasicBlock();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"blocks",
            	            		lv_blocks_2_0, 
            	            		"BasicBlock");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt122 >= 1 ) break loop122;
                        EarlyExitException eee =
                            new EarlyExitException(122, input);
                        throw eee;
                }
                cnt122++;
            } while (true);

            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleFunctionBody13304); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5644:1: ( (lv_meta_4_0= ruleMetadataValue ) )*
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==193||LA123_0==215) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5645:1: (lv_meta_4_0= ruleMetadataValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5645:1: (lv_meta_4_0= ruleMetadataValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5646:3: lv_meta_4_0= ruleMetadataValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getMetaMetadataValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleFunctionBody13325);
            	    lv_meta_4_0=ruleMetadataValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getFunctionBodyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"meta",
            	            		lv_meta_4_0, 
            	            		"MetadataValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop123;
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
    // $ANTLR end "ruleFunctionBody"


    // $ANTLR start "entryRuleBasicBlock"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5670:1: entryRuleBasicBlock returns [EObject current=null] : iv_ruleBasicBlock= ruleBasicBlock EOF ;
    public final EObject entryRuleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBlock = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5671:2: (iv_ruleBasicBlock= ruleBasicBlock EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5672:2: iv_ruleBasicBlock= ruleBasicBlock EOF
            {
             newCompositeNode(grammarAccess.getBasicBlockRule()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock13362);
            iv_ruleBasicBlock=ruleBasicBlock();

            state._fsp--;

             current =iv_ruleBasicBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicBlock13372); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5679:1: ruleBasicBlock returns [EObject current=null] : ( ( ( (lv_label_0_0= RULE_DOTS ) )? this_NOBRACKET_1= RULE_NOBRACKET otherlv_2= ':' )? ( (lv_instructions_3_0= ruleInstruction ) )* ( (lv_terminator_4_0= ruleRet_Instr ) ) ) ;
    public final EObject ruleBasicBlock() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token this_NOBRACKET_1=null;
        Token otherlv_2=null;
        EObject lv_instructions_3_0 = null;

        EObject lv_terminator_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5682:28: ( ( ( ( (lv_label_0_0= RULE_DOTS ) )? this_NOBRACKET_1= RULE_NOBRACKET otherlv_2= ':' )? ( (lv_instructions_3_0= ruleInstruction ) )* ( (lv_terminator_4_0= ruleRet_Instr ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5683:1: ( ( ( (lv_label_0_0= RULE_DOTS ) )? this_NOBRACKET_1= RULE_NOBRACKET otherlv_2= ':' )? ( (lv_instructions_3_0= ruleInstruction ) )* ( (lv_terminator_4_0= ruleRet_Instr ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5683:1: ( ( ( (lv_label_0_0= RULE_DOTS ) )? this_NOBRACKET_1= RULE_NOBRACKET otherlv_2= ':' )? ( (lv_instructions_3_0= ruleInstruction ) )* ( (lv_terminator_4_0= ruleRet_Instr ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5683:2: ( ( (lv_label_0_0= RULE_DOTS ) )? this_NOBRACKET_1= RULE_NOBRACKET otherlv_2= ':' )? ( (lv_instructions_3_0= ruleInstruction ) )* ( (lv_terminator_4_0= ruleRet_Instr ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5683:2: ( ( (lv_label_0_0= RULE_DOTS ) )? this_NOBRACKET_1= RULE_NOBRACKET otherlv_2= ':' )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( ((LA125_0>=RULE_DOTS && LA125_0<=RULE_NOBRACKET)) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5683:3: ( (lv_label_0_0= RULE_DOTS ) )? this_NOBRACKET_1= RULE_NOBRACKET otherlv_2= ':'
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5683:3: ( (lv_label_0_0= RULE_DOTS ) )?
                    int alt124=2;
                    int LA124_0 = input.LA(1);

                    if ( (LA124_0==RULE_DOTS) ) {
                        alt124=1;
                    }
                    switch (alt124) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5684:1: (lv_label_0_0= RULE_DOTS )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5684:1: (lv_label_0_0= RULE_DOTS )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5685:3: lv_label_0_0= RULE_DOTS
                            {
                            lv_label_0_0=(Token)match(input,RULE_DOTS,FOLLOW_RULE_DOTS_in_ruleBasicBlock13415); 

                            			newLeafNode(lv_label_0_0, grammarAccess.getBasicBlockAccess().getLabelDOTSTerminalRuleCall_0_0_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getBasicBlockRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"label",
                                    		lv_label_0_0, 
                                    		"DOTS");
                            	    

                            }


                            }
                            break;

                    }

                    this_NOBRACKET_1=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleBasicBlock13432); 
                     
                        newLeafNode(this_NOBRACKET_1, grammarAccess.getBasicBlockAccess().getNOBRACKETTerminalRuleCall_0_1()); 
                        
                    otherlv_2=(Token)match(input,195,FOLLOW_195_in_ruleBasicBlock13443); 

                        	newLeafNode(otherlv_2, grammarAccess.getBasicBlockAccess().getColonKeyword_0_2());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5709:3: ( (lv_instructions_3_0= ruleInstruction ) )*
            loop126:
            do {
                int alt126=2;
                int LA126_0 = input.LA(1);

                if ( ((LA126_0>=RULE_VAR_TYPE && LA126_0<=RULE_INT)||LA126_0==33||LA126_0==37||(LA126_0>=39 && LA126_0<=51)||(LA126_0>=53 && LA126_0<=55)||(LA126_0>=63 && LA126_0<=65)||(LA126_0>=67 && LA126_0<=69)||(LA126_0>=71 && LA126_0<=72)||LA126_0==77||(LA126_0>=80 && LA126_0<=82)||LA126_0==91||(LA126_0>=125 && LA126_0<=126)||(LA126_0>=133 && LA126_0<=151)||(LA126_0>=172 && LA126_0<=184)) ) {
                    alt126=1;
                }


                switch (alt126) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5710:1: (lv_instructions_3_0= ruleInstruction )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5710:1: (lv_instructions_3_0= ruleInstruction )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5711:3: lv_instructions_3_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBasicBlockAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBasicBlock13466);
            	    lv_instructions_3_0=ruleInstruction();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBasicBlockRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"instructions",
            	            		lv_instructions_3_0, 
            	            		"Instruction");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop126;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5727:3: ( (lv_terminator_4_0= ruleRet_Instr ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5728:1: (lv_terminator_4_0= ruleRet_Instr )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5728:1: (lv_terminator_4_0= ruleRet_Instr )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5729:3: lv_terminator_4_0= ruleRet_Instr
            {
             
            	        newCompositeNode(grammarAccess.getBasicBlockAccess().getTerminatorRet_InstrParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRet_Instr_in_ruleBasicBlock13488);
            lv_terminator_4_0=ruleRet_Instr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBasicBlockRule());
            	        }
                   		set(
                   			current, 
                   			"terminator",
                    		lv_terminator_4_0, 
                    		"Ret_Instr");
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
    // $ANTLR end "ruleBasicBlock"


    // $ANTLR start "entryRuleRet_Instr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5753:1: entryRuleRet_Instr returns [EObject current=null] : iv_ruleRet_Instr= ruleRet_Instr EOF ;
    public final EObject entryRuleRet_Instr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRet_Instr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5754:2: (iv_ruleRet_Instr= ruleRet_Instr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5755:2: iv_ruleRet_Instr= ruleRet_Instr EOF
            {
             newCompositeNode(grammarAccess.getRet_InstrRule()); 
            pushFollow(FOLLOW_ruleRet_Instr_in_entryRuleRet_Instr13524);
            iv_ruleRet_Instr=ruleRet_Instr();

            state._fsp--;

             current =iv_ruleRet_Instr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRet_Instr13534); 

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
    // $ANTLR end "entryRuleRet_Instr"


    // $ANTLR start "ruleRet_Instr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5762:1: ruleRet_Instr returns [EObject current=null] : (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable ) ;
    public final EObject ruleRet_Instr() throws RecognitionException {
        EObject current = null;

        EObject this_Return_0 = null;

        EObject this_Branch_1 = null;

        EObject this_Switch_2 = null;

        EObject this_IndirectBranch_3 = null;

        EObject this_Invoke_4 = null;

        EObject this_Resume_5 = null;

        EObject this_Unreachable_6 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5765:28: ( (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5766:1: (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5766:1: (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable )
            int alt127=7;
            switch ( input.LA(1) ) {
            case 191:
                {
                alt127=1;
                }
                break;
            case 194:
                {
                alt127=2;
                }
                break;
            case 186:
                {
                alt127=3;
                }
                break;
            case 185:
                {
                alt127=4;
                }
                break;
            case 187:
                {
                alt127=5;
                }
                break;
            case 189:
                {
                alt127=6;
                }
                break;
            case 190:
                {
                alt127=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }

            switch (alt127) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5767:5: this_Return_0= ruleReturn
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getReturnParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReturn_in_ruleRet_Instr13581);
                    this_Return_0=ruleReturn();

                    state._fsp--;

                     
                            current = this_Return_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5777:5: this_Branch_1= ruleBranch
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getBranchParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBranch_in_ruleRet_Instr13608);
                    this_Branch_1=ruleBranch();

                    state._fsp--;

                     
                            current = this_Branch_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5787:5: this_Switch_2= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getSwitchParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleRet_Instr13635);
                    this_Switch_2=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5797:5: this_IndirectBranch_3= ruleIndirectBranch
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getIndirectBranchParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIndirectBranch_in_ruleRet_Instr13662);
                    this_IndirectBranch_3=ruleIndirectBranch();

                    state._fsp--;

                     
                            current = this_IndirectBranch_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5807:5: this_Invoke_4= ruleInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getInvokeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInvoke_in_ruleRet_Instr13689);
                    this_Invoke_4=ruleInvoke();

                    state._fsp--;

                     
                            current = this_Invoke_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5817:5: this_Resume_5= ruleResume
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getResumeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleResume_in_ruleRet_Instr13716);
                    this_Resume_5=ruleResume();

                    state._fsp--;

                     
                            current = this_Resume_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5827:5: this_Unreachable_6= ruleUnreachable
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getUnreachableParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleUnreachable_in_ruleRet_Instr13743);
                    this_Unreachable_6=ruleUnreachable();

                    state._fsp--;

                     
                            current = this_Unreachable_6; 
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
    // $ANTLR end "ruleRet_Instr"


    // $ANTLR start "entryRuleVISIBILITY"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5843:1: entryRuleVISIBILITY returns [String current=null] : iv_ruleVISIBILITY= ruleVISIBILITY EOF ;
    public final String entryRuleVISIBILITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVISIBILITY = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5844:2: (iv_ruleVISIBILITY= ruleVISIBILITY EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5845:2: iv_ruleVISIBILITY= ruleVISIBILITY EOF
            {
             newCompositeNode(grammarAccess.getVISIBILITYRule()); 
            pushFollow(FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY13779);
            iv_ruleVISIBILITY=ruleVISIBILITY();

            state._fsp--;

             current =iv_ruleVISIBILITY.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVISIBILITY13790); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5852:1: ruleVISIBILITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'default' | kw= 'hidden' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleVISIBILITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5855:28: ( (kw= 'default' | kw= 'hidden' | kw= 'protected' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5856:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5856:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            int alt128=3;
            switch ( input.LA(1) ) {
            case 196:
                {
                alt128=1;
                }
                break;
            case 197:
                {
                alt128=2;
                }
                break;
            case 198:
                {
                alt128=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 128, 0, input);

                throw nvae;
            }

            switch (alt128) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5857:2: kw= 'default'
                    {
                    kw=(Token)match(input,196,FOLLOW_196_in_ruleVISIBILITY13828); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVISIBILITYAccess().getDefaultKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5864:2: kw= 'hidden'
                    {
                    kw=(Token)match(input,197,FOLLOW_197_in_ruleVISIBILITY13847); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVISIBILITYAccess().getHiddenKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5871:2: kw= 'protected'
                    {
                    kw=(Token)match(input,198,FOLLOW_198_in_ruleVISIBILITY13866); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5884:1: entryRuleLINKAGE returns [String current=null] : iv_ruleLINKAGE= ruleLINKAGE EOF ;
    public final String entryRuleLINKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLINKAGE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5885:2: (iv_ruleLINKAGE= ruleLINKAGE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5886:2: iv_ruleLINKAGE= ruleLINKAGE EOF
            {
             newCompositeNode(grammarAccess.getLINKAGERule()); 
            pushFollow(FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE13907);
            iv_ruleLINKAGE=ruleLINKAGE();

            state._fsp--;

             current =iv_ruleLINKAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLINKAGE13918); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5893:1: ruleLINKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE ) ;
    public final AntlrDatatypeRuleToken ruleLINKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ALIAS_LINKAGE_12 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5896:28: ( (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5897:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5897:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE )
            int alt129=13;
            switch ( input.LA(1) ) {
            case 199:
                {
                alt129=1;
                }
                break;
            case 200:
                {
                alt129=2;
                }
                break;
            case 201:
                {
                alt129=3;
                }
                break;
            case 202:
                {
                alt129=4;
                }
                break;
            case 203:
                {
                alt129=5;
                }
                break;
            case 204:
                {
                alt129=6;
                }
                break;
            case 205:
                {
                alt129=7;
                }
                break;
            case 206:
                {
                alt129=8;
                }
                break;
            case 207:
                {
                alt129=9;
                }
                break;
            case 208:
                {
                alt129=10;
                }
                break;
            case 209:
                {
                alt129=11;
                }
                break;
            case 210:
                {
                alt129=12;
                }
                break;
            case 211:
            case 212:
            case 213:
            case 214:
                {
                alt129=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5898:2: kw= 'private'
                    {
                    kw=(Token)match(input,199,FOLLOW_199_in_ruleLINKAGE13956); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5905:2: kw= 'linker_private'
                    {
                    kw=(Token)match(input,200,FOLLOW_200_in_ruleLINKAGE13975); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinker_privateKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5912:2: kw= 'linker_private_weak'
                    {
                    kw=(Token)match(input,201,FOLLOW_201_in_ruleLINKAGE13994); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinker_private_weakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5919:2: kw= 'available_externally'
                    {
                    kw=(Token)match(input,202,FOLLOW_202_in_ruleLINKAGE14013); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getAvailable_externallyKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5926:2: kw= 'linkonce'
                    {
                    kw=(Token)match(input,203,FOLLOW_203_in_ruleLINKAGE14032); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonceKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5933:2: kw= 'common'
                    {
                    kw=(Token)match(input,204,FOLLOW_204_in_ruleLINKAGE14051); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getCommonKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5940:2: kw= 'appending'
                    {
                    kw=(Token)match(input,205,FOLLOW_205_in_ruleLINKAGE14070); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getAppendingKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5947:2: kw= 'extern_weak'
                    {
                    kw=(Token)match(input,206,FOLLOW_206_in_ruleLINKAGE14089); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getExtern_weakKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5954:2: kw= 'linkonce_odr'
                    {
                    kw=(Token)match(input,207,FOLLOW_207_in_ruleLINKAGE14108); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonce_odrKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5961:2: kw= 'linkonce_odr_auto_hide'
                    {
                    kw=(Token)match(input,208,FOLLOW_208_in_ruleLINKAGE14127); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonce_odr_auto_hideKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5968:2: kw= 'dllimport'
                    {
                    kw=(Token)match(input,209,FOLLOW_209_in_ruleLINKAGE14146); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getDllimportKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5975:2: kw= 'dllexport'
                    {
                    kw=(Token)match(input,210,FOLLOW_210_in_ruleLINKAGE14165); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getDllexportKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5982:5: this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE
                    {
                     
                            newCompositeNode(grammarAccess.getLINKAGEAccess().getALIAS_LINKAGEParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_ruleLINKAGE14193);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6000:1: entryRuleALIAS_LINKAGE returns [String current=null] : iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF ;
    public final String entryRuleALIAS_LINKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALIAS_LINKAGE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6001:2: (iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6002:2: iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF
            {
             newCompositeNode(grammarAccess.getALIAS_LINKAGERule()); 
            pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE14239);
            iv_ruleALIAS_LINKAGE=ruleALIAS_LINKAGE();

            state._fsp--;

             current =iv_ruleALIAS_LINKAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIAS_LINKAGE14250); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6009:1: ruleALIAS_LINKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) ;
    public final AntlrDatatypeRuleToken ruleALIAS_LINKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6012:28: ( (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6013:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6013:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            int alt130=4;
            switch ( input.LA(1) ) {
            case 211:
                {
                alt130=1;
                }
                break;
            case 212:
                {
                alt130=2;
                }
                break;
            case 213:
                {
                alt130=3;
                }
                break;
            case 214:
                {
                alt130=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;
            }

            switch (alt130) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6014:2: kw= 'external'
                    {
                    kw=(Token)match(input,211,FOLLOW_211_in_ruleALIAS_LINKAGE14288); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getExternalKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6021:2: kw= 'internal'
                    {
                    kw=(Token)match(input,212,FOLLOW_212_in_ruleALIAS_LINKAGE14307); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getInternalKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6028:2: kw= 'weak'
                    {
                    kw=(Token)match(input,213,FOLLOW_213_in_ruleALIAS_LINKAGE14326); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getWeakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6035:2: kw= 'weak_odr'
                    {
                    kw=(Token)match(input,214,FOLLOW_214_in_ruleALIAS_LINKAGE14345); 

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


    // $ANTLR start "entryRuleMetadataValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6048:1: entryRuleMetadataValue returns [String current=null] : iv_ruleMetadataValue= ruleMetadataValue EOF ;
    public final String entryRuleMetadataValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetadataValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6049:2: (iv_ruleMetadataValue= ruleMetadataValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6050:2: iv_ruleMetadataValue= ruleMetadataValue EOF
            {
             newCompositeNode(grammarAccess.getMetadataValueRule()); 
            pushFollow(FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue14386);
            iv_ruleMetadataValue=ruleMetadataValue();

            state._fsp--;

             current =iv_ruleMetadataValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadataValue14397); 

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
    // $ANTLR end "entryRuleMetadataValue"


    // $ANTLR start "ruleMetadataValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6057:1: ruleMetadataValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )? ) ;
    public final AntlrDatatypeRuleToken ruleMetadataValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_NOBRACKET_3=null;
        Token this_NOBRACKET_6=null;
        Token this_INT_9=null;
        Token this_NOBRACKET_11=null;
        Token this_NOBRACKET_14=null;
        Token this_STRING_21=null;
        Token this_INT_25=null;
        AntlrDatatypeRuleToken this_BASIC_TYPE_26 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6060:28: ( ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6061:1: ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6061:1: ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6061:2: ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6061:2: ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) )
            int alt131=3;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==193) ) {
                int LA131_1 = input.LA(2);

                if ( (LA131_1==RULE_INT) ) {
                    alt131=1;
                }
                else if ( (LA131_1==RULE_NOBRACKET) ) {
                    alt131=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 131, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA131_0==215) ) {
                alt131=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 131, 0, input);

                throw nvae;
            }
            switch (alt131) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6061:3: (kw= '!' this_INT_1= RULE_INT )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6061:3: (kw= '!' this_INT_1= RULE_INT )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6062:2: kw= '!' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14437); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_0_0_0()); 
                        
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetadataValue14452); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getMetadataValueAccess().getINTTerminalRuleCall_0_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6075:6: (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6075:6: (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6076:2: kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}'
                    {
                    kw=(Token)match(input,215,FOLLOW_215_in_ruleMetadataValue14478); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_0_1_0()); 
                        
                    this_NOBRACKET_3=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14493); 

                    		current.merge(this_NOBRACKET_3);
                        
                     
                        newLeafNode(this_NOBRACKET_3, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_0_1_1()); 
                        
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleMetadataValue14511); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getRightCurlyBracketKeyword_0_1_2()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6095:6: (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6095:6: (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6096:2: kw= '!' this_NOBRACKET_6= RULE_NOBRACKET
                    {
                    kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14532); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_0_2_0()); 
                        
                    this_NOBRACKET_6=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14547); 

                    		current.merge(this_NOBRACKET_6);
                        
                     
                        newLeafNode(this_NOBRACKET_6, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_0_2_1()); 
                        

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6108:3: (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )?
            int alt136=2;
            int LA136_0 = input.LA(1);

            if ( (LA136_0==21) ) {
                alt136=1;
            }
            switch (alt136) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6109:2: kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) )
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleMetadataValue14568); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getEqualsSignKeyword_1_0()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6114:1: ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) )
                    int alt135=4;
                    switch ( input.LA(1) ) {
                    case 193:
                        {
                        int LA135_1 = input.LA(2);

                        if ( (LA135_1==RULE_INT) ) {
                            alt135=1;
                        }
                        else if ( (LA135_1==RULE_NOBRACKET) ) {
                            alt135=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 135, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 215:
                        {
                        alt135=2;
                        }
                        break;
                    case 216:
                        {
                        alt135=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 135, 0, input);

                        throw nvae;
                    }

                    switch (alt135) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6114:2: (kw= '!' this_INT_9= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6114:2: (kw= '!' this_INT_9= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6115:2: kw= '!' this_INT_9= RULE_INT
                            {
                            kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14583); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_0_0()); 
                                
                            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetadataValue14598); 

                            		current.merge(this_INT_9);
                                
                             
                                newLeafNode(this_INT_9, grammarAccess.getMetadataValueAccess().getINTTerminalRuleCall_1_1_0_1()); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6128:6: (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6128:6: (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6129:2: kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}'
                            {
                            kw=(Token)match(input,215,FOLLOW_215_in_ruleMetadataValue14624); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_1_1_1_0()); 
                                
                            this_NOBRACKET_11=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14639); 

                            		current.merge(this_NOBRACKET_11);
                                
                             
                                newLeafNode(this_NOBRACKET_11, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_1_1_1_1()); 
                                
                            kw=(Token)match(input,34,FOLLOW_34_in_ruleMetadataValue14657); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getRightCurlyBracketKeyword_1_1_1_2()); 
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6148:6: (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6148:6: (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6149:2: kw= '!' this_NOBRACKET_14= RULE_NOBRACKET
                            {
                            kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14678); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_2_0()); 
                                
                            this_NOBRACKET_14=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14693); 

                            		current.merge(this_NOBRACKET_14);
                                
                             
                                newLeafNode(this_NOBRACKET_14, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_1_1_2_1()); 
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6162:6: (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6162:6: (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6163:2: kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )?
                            {
                            kw=(Token)match(input,216,FOLLOW_216_in_ruleMetadataValue14719); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getMetadataKeyword_1_1_3_0()); 
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6168:1: ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )?
                            int alt134=2;
                            int LA134_0 = input.LA(1);

                            if ( (LA134_0==193) ) {
                                int LA134_1 = input.LA(2);

                                if ( (LA134_1==33) ) {
                                    alt134=1;
                                }
                            }
                            else if ( (LA134_0==215) ) {
                                int LA134_2 = input.LA(2);

                                if ( (LA134_2==216) ) {
                                    alt134=1;
                                }
                            }
                            switch (alt134) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6168:2: ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}'
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6168:2: ( (kw= '!' kw= '{' ) | kw= '!{' )
                                    int alt132=2;
                                    int LA132_0 = input.LA(1);

                                    if ( (LA132_0==193) ) {
                                        alt132=1;
                                    }
                                    else if ( (LA132_0==215) ) {
                                        alt132=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 132, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt132) {
                                        case 1 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6168:3: (kw= '!' kw= '{' )
                                            {
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6168:3: (kw= '!' kw= '{' )
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6169:2: kw= '!' kw= '{'
                                            {
                                            kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14735); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_3_1_0_0_0()); 
                                                
                                            kw=(Token)match(input,33,FOLLOW_33_in_ruleMetadataValue14748); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getLeftCurlyBracketKeyword_1_1_3_1_0_0_1()); 
                                                

                                            }


                                            }
                                            break;
                                        case 2 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6182:2: kw= '!{'
                                            {
                                            kw=(Token)match(input,215,FOLLOW_215_in_ruleMetadataValue14768); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_1_1_3_1_0_1()); 
                                                

                                            }
                                            break;

                                    }

                                    kw=(Token)match(input,216,FOLLOW_216_in_ruleMetadataValue14782); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getMetadataKeyword_1_1_3_1_1()); 
                                        
                                    kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14795); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_3_1_2()); 
                                        
                                    this_STRING_21=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadataValue14810); 

                                    		current.merge(this_STRING_21);
                                        
                                     
                                        newLeafNode(this_STRING_21, grammarAccess.getMetadataValueAccess().getSTRINGTerminalRuleCall_1_1_3_1_3()); 
                                        
                                    kw=(Token)match(input,24,FOLLOW_24_in_ruleMetadataValue14828); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getCommaKeyword_1_1_3_1_4()); 
                                        
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6212:1: ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE )
                                    int alt133=2;
                                    int LA133_0 = input.LA(1);

                                    if ( (LA133_0==216) ) {
                                        alt133=1;
                                    }
                                    else if ( ((LA133_0>=39 && LA133_0<=44)) ) {
                                        alt133=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 133, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt133) {
                                        case 1 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6212:2: (kw= 'metadata' kw= '!' this_INT_25= RULE_INT )
                                            {
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6212:2: (kw= 'metadata' kw= '!' this_INT_25= RULE_INT )
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6213:2: kw= 'metadata' kw= '!' this_INT_25= RULE_INT
                                            {
                                            kw=(Token)match(input,216,FOLLOW_216_in_ruleMetadataValue14843); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getMetadataKeyword_1_1_3_1_5_0_0()); 
                                                
                                            kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14856); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_3_1_5_0_1()); 
                                                
                                            this_INT_25=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetadataValue14871); 

                                            		current.merge(this_INT_25);
                                                
                                             
                                                newLeafNode(this_INT_25, grammarAccess.getMetadataValueAccess().getINTTerminalRuleCall_1_1_3_1_5_0_2()); 
                                                

                                            }


                                            }
                                            break;
                                        case 2 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6233:5: this_BASIC_TYPE_26= ruleBASIC_TYPE
                                            {
                                             
                                                    newCompositeNode(grammarAccess.getMetadataValueAccess().getBASIC_TYPEParserRuleCall_1_1_3_1_5_1()); 
                                                
                                            pushFollow(FOLLOW_ruleBASIC_TYPE_in_ruleMetadataValue14905);
                                            this_BASIC_TYPE_26=ruleBASIC_TYPE();

                                            state._fsp--;


                                            		current.merge(this_BASIC_TYPE_26);
                                                
                                             
                                                    afterParserOrEnumRuleCall();
                                                

                                            }
                                            break;

                                    }

                                    kw=(Token)match(input,34,FOLLOW_34_in_ruleMetadataValue14924); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getRightCurlyBracketKeyword_1_1_3_1_6()); 
                                        

                                    }
                                    break;

                            }


                            }


                            }
                            break;

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
    // $ANTLR end "ruleMetadataValue"


    // $ANTLR start "entryRuleALIGNMENT"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6257:1: entryRuleALIGNMENT returns [String current=null] : iv_ruleALIGNMENT= ruleALIGNMENT EOF ;
    public final String entryRuleALIGNMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALIGNMENT = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6258:2: (iv_ruleALIGNMENT= ruleALIGNMENT EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6259:2: iv_ruleALIGNMENT= ruleALIGNMENT EOF
            {
             newCompositeNode(grammarAccess.getALIGNMENTRule()); 
            pushFollow(FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT14971);
            iv_ruleALIGNMENT=ruleALIGNMENT();

            state._fsp--;

             current =iv_ruleALIGNMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIGNMENT14982); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6266:1: ruleALIGNMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'align' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleALIGNMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6269:28: ( (kw= 'align' this_INT_1= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6270:1: (kw= 'align' this_INT_1= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6270:1: (kw= 'align' this_INT_1= RULE_INT )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6271:2: kw= 'align' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,79,FOLLOW_79_in_ruleALIGNMENT15020); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getALIGNMENTAccess().getAlignKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleALIGNMENT15035); 

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


    protected DFA98 dfa98 = new DFA98(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA119 dfa119 = new DFA119(this);
    protected DFA120 dfa120 = new DFA120(this);
    static final String DFA98_eotS =
        "\u0098\uffff";
    static final String DFA98_eofS =
        "\u0098\uffff";
    static final String DFA98_minS =
        "\1\176\2\6\1\41\17\123\17\30\1\123\1\6\10\177\2\6\17\30\1\46\20"+
        "\6\1\uffff\17\30\1\6\1\123\10\6\1\uffff\36\30\1\6\17\30\1\6";
    static final String DFA98_maxS =
        "\1\176\2\62\1\41\17\177\17\42\1\177\1\62\10\177\2\62\17\42\1\46"+
        "\17\u0095\1\62\1\uffff\17\42\1\62\1\177\10\u0095\1\uffff\17\132"+
        "\17\42\1\62\17\132\1\u0095";
    static final String DFA98_acceptS =
        "\116\uffff\1\2\31\uffff\1\1\57\uffff";
    static final String DFA98_specialS =
        "\u0098\uffff}>";
    static final String[] DFA98_transitionS = {
            "\1\1",
            "\1\4\1\5\1\22\30\uffff\1\2\3\uffff\1\3\1\uffff\1\14\1\15\1"+
            "\16\1\17\1\20\1\21\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\23\1\24\1\41\31\uffff\1\42\4\uffff\1\33\1\34\1\35\1\36"+
            "\1\37\1\40\1\25\1\26\1\27\1\30\1\31\1\32",
            "\1\43",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\56\1\57\1\74\31\uffff\1\75\4\uffff\1\66\1\67\1\70\1\71"+
            "\1\72\1\73\1\60\1\61\1\62\1\63\1\64\1\65",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\76\1\77\1\114\30\uffff\1\115\3\uffff\1\116\1\uffff\1\106"+
            "\1\107\1\110\1\111\1\112\1\113\1\100\1\101\1\102\1\103\1\104"+
            "\1\105",
            "\1\117\1\120\1\135\36\uffff\1\127\1\130\1\131\1\132\1\133"+
            "\1\134\1\121\1\122\1\123\1\124\1\125\1\126",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\137",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\57\uffff\14"+
            "\116",
            "\1\151\1\152\1\167\30\uffff\1\150\1\116\2\uffff\1\150\1\uffff"+
            "\1\161\1\162\1\163\1\164\1\165\1\166\1\153\1\154\1\155\1\156"+
            "\1\157\1\160",
            "",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\55\11\uffff\1\42",
            "\1\170\1\171\1\u0086\36\uffff\1\u0080\1\u0081\1\u0082\1\u0083"+
            "\1\u0084\1\u0085\1\172\1\173\1\174\1\175\1\176\1\177",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\127\uffff"+
            "\14\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\127\uffff"+
            "\14\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\127\uffff"+
            "\14\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\127\uffff"+
            "\14\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\127\uffff"+
            "\14\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\127\uffff"+
            "\14\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\127\uffff"+
            "\14\116",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\127\uffff"+
            "\14\116",
            "",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\u0087\11\uffff\1\116\60\uffff\10\150",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\136\11\uffff\1\75",
            "\1\u0088\1\u0089\1\u0096\30\uffff\1\150\3\uffff\1\150\1\uffff"+
            "\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095\1\u008a\1\u008b"+
            "\1\u008c\1\u008d\1\u008e\1\u008f",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\1\116\11\uffff\1\u0097\60\uffff\10\150",
            "\3\150\30\uffff\1\150\3\uffff\1\150\1\uffff\14\150\40\uffff"+
            "\10\116\57\uffff\14\116"
    };

    static final short[] DFA98_eot = DFA.unpackEncodedString(DFA98_eotS);
    static final short[] DFA98_eof = DFA.unpackEncodedString(DFA98_eofS);
    static final char[] DFA98_min = DFA.unpackEncodedStringToUnsignedChars(DFA98_minS);
    static final char[] DFA98_max = DFA.unpackEncodedStringToUnsignedChars(DFA98_maxS);
    static final short[] DFA98_accept = DFA.unpackEncodedString(DFA98_acceptS);
    static final short[] DFA98_special = DFA.unpackEncodedString(DFA98_specialS);
    static final short[][] DFA98_transition;

    static {
        int numStates = DFA98_transitionS.length;
        DFA98_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA98_transition[i] = DFA.unpackEncodedString(DFA98_transitionS[i]);
        }
    }

    class DFA98 extends DFA {

        public DFA98(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 98;
            this.eot = DFA98_eot;
            this.eof = DFA98_eof;
            this.min = DFA98_min;
            this.max = DFA98_max;
            this.accept = DFA98_accept;
            this.special = DFA98_special;
            this.transition = DFA98_transition;
        }
        public String getDescription() {
            return "3319:1: ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) )";
        }
    }
    static final String DFA109_eotS =
        "\30\uffff";
    static final String DFA109_eofS =
        "\30\uffff";
    static final String DFA109_minS =
        "\1\6\1\115\26\uffff";
    static final String DFA109_maxS =
        "\1\u00b8\1\120\26\uffff";
    static final String DFA109_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26";
    static final String DFA109_specialS =
        "\30\uffff}>";
    static final String[] DFA109_transitionS = {
            "\3\27\30\uffff\1\27\3\uffff\1\27\1\uffff\14\27\1\5\1\uffff"+
            "\1\16\1\15\1\4\7\uffff\1\20\1\1\1\21\1\uffff\2\7\1\6\1\uffff"+
            "\2\6\4\uffff\1\2\2\uffff\1\3\2\24\10\uffff\1\17\41\uffff\1\22"+
            "\1\26\6\uffff\1\23\1\25\1\14\1\13\1\12\14\11\2\10\24\uffff\12"+
            "\7\3\6",
            "\1\2\2\uffff\1\3",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static final short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static final char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static final char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static final short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static final short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static final short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "4694:1: ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad | this_LocalVar_23= ruleLocalVar )";
        }
    }
    static final String DFA119_eotS =
        "\140\uffff";
    static final String DFA119_eofS =
        "\2\uffff\1\25\3\uffff\17\3\20\uffff\1\3\1\uffff\10\3\41\uffff\1"+
        "\3\17\uffff";
    static final String DFA119_minS =
        "\1\u00bf\2\6\1\uffff\1\6\1\41\17\6\1\uffff\17\30\13\6\17\30\1\46"+
        "\17\30\2\6\17\30";
    static final String DFA119_maxS =
        "\1\u00bf\1\62\1\u00c2\1\uffff\1\62\1\41\17\u00c2\1\uffff\17\42"+
        "\1\u00c2\1\62\10\u00c2\1\62\17\42\1\46\17\42\1\62\1\u00c2\17\42";
    static final String DFA119_acceptS =
        "\3\uffff\1\2\21\uffff\1\1\112\uffff";
    static final String DFA119_specialS =
        "\140\uffff}>";
    static final String[] DFA119_transitionS = {
            "\1\1",
            "\3\3\30\uffff\1\3\5\uffff\1\2\13\3",
            "\1\6\1\7\1\24\2\25\15\uffff\1\25\10\uffff\1\4\1\25\2\uffff"+
            "\1\5\1\uffff\1\16\1\17\1\20\1\21\1\22\1\23\1\10\1\11\1\12\1"+
            "\13\1\14\1\15\1\25\1\uffff\3\25\7\uffff\3\25\1\uffff\3\25\1"+
            "\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\3\1\25\41\uffff\2\25"+
            "\6\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff\1\25",
            "",
            "\1\26\1\27\1\44\31\uffff\1\45\4\uffff\1\36\1\37\1\40\1\41"+
            "\1\42\1\43\1\30\1\31\1\32\1\33\1\34\1\35",
            "\1\46",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\1\60\1\61\1\76\31\uffff\1\77\4\uffff\1\70\1\71\1\72\1\73"+
            "\1\74\1\75\1\62\1\63\1\64\1\65\1\66\1\67",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff\23"+
            "\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff\23"+
            "\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff\23"+
            "\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff\23"+
            "\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff\23"+
            "\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff\23"+
            "\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff\23"+
            "\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff\23"+
            "\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\1\100\1\101\1\116\36\uffff\1\110\1\111\1\112\1\113\1\114"+
            "\1\115\1\102\1\103\1\104\1\105\1\106\1\107",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\120",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\57\11\uffff\1\45",
            "\1\121\1\122\1\137\36\uffff\1\131\1\132\1\133\1\134\1\135"+
            "\1\136\1\123\1\124\1\125\1\126\1\127\1\130",
            "\5\3\12\uffff\1\25\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1"+
            "\uffff\15\3\1\uffff\3\3\7\uffff\3\3\1\uffff\3\3\1\uffff\2\3"+
            "\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1\55"+
            "\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff\3"+
            "\3\2\uffff\1\3",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77",
            "\1\117\11\uffff\1\77"
    };

    static final short[] DFA119_eot = DFA.unpackEncodedString(DFA119_eotS);
    static final short[] DFA119_eof = DFA.unpackEncodedString(DFA119_eofS);
    static final char[] DFA119_min = DFA.unpackEncodedStringToUnsignedChars(DFA119_minS);
    static final char[] DFA119_max = DFA.unpackEncodedStringToUnsignedChars(DFA119_maxS);
    static final short[] DFA119_accept = DFA.unpackEncodedString(DFA119_acceptS);
    static final short[] DFA119_special = DFA.unpackEncodedString(DFA119_specialS);
    static final short[][] DFA119_transition;

    static {
        int numStates = DFA119_transitionS.length;
        DFA119_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA119_transition[i] = DFA.unpackEncodedString(DFA119_transitionS[i]);
        }
    }

    class DFA119 extends DFA {

        public DFA119(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 119;
            this.eot = DFA119_eot;
            this.eof = DFA119_eof;
            this.min = DFA119_min;
            this.max = DFA119_max;
            this.accept = DFA119_accept;
            this.special = DFA119_special;
            this.transition = DFA119_transition;
        }
        public String getDescription() {
            return "5400:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )";
        }
    }
    static final String DFA120_eotS =
        "\u018a\uffff";
    static final String DFA120_eofS =
        "\34\uffff\17\126\40\uffff\1\126\1\uffff\10\126\137\uffff\1\126"+
        "\134\uffff\17\126\40\uffff\1\126\1\uffff\10\126\60\uffff\1\126\17"+
        "\uffff";
    static final String DFA120_minS =
        "\1\u00c2\32\6\1\41\20\6\1\41\36\30\12\6\2\uffff\20\30\1\6\10\30"+
        "\2\6\17\30\1\46\1\6\17\30\1\46\1\6\1\41\17\42\17\30\2\6\17\30\1"+
        "\6\20\30\1\42\1\6\10\42\1\6\36\30\1\6\17\30\1\46\1\6\1\41\17\6\17"+
        "\30\1\6\1\42\17\30\12\6\17\30\1\6\17\30\1\46\17\30\2\6\17\30";
    static final String DFA120_maxS =
        "\1\u00c2\1\62\17\132\12\62\1\41\17\u00c2\1\62\1\41\17\132\17\42"+
        "\1\u00c2\1\62\10\u00c2\2\uffff\17\42\1\132\1\62\10\30\2\62\17\42"+
        "\1\46\1\62\17\42\1\46\1\62\1\41\17\132\17\42\1\62\1\u00c2\17\42"+
        "\1\62\1\132\17\42\1\132\1\62\10\42\1\62\36\42\1\62\17\42\1\46\1"+
        "\62\1\41\17\u00c2\17\42\1\62\1\132\17\42\1\u00c2\1\62\10\u00c2\17"+
        "\42\1\62\17\42\1\46\17\42\1\62\1\u00c2\17\42";
    static final String DFA120_acceptS =
        "\125\uffff\1\2\1\1\u0133\uffff";
    static final String DFA120_specialS =
        "\u018a\uffff}>";
    static final String[] DFA120_transitionS = {
            "\1\1",
            "\1\2\1\3\1\20\30\uffff\1\21\5\uffff\1\12\1\13\1\14\1\15\1"+
            "\16\1\17\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43\40\uffff"+
            "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\55\1\56\1\73\30\uffff\1\53\3\uffff\1\54\1\uffff\1\65\1"+
            "\66\1\67\1\70\1\71\1\72\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\35\1\52\30\uffff\1\32\3\uffff\1\33\1\uffff\1\44\1"+
            "\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\74\1\75\1\112\31\uffff\1\113\4\uffff\1\104\1\105\1\106"+
            "\1\107\1\110\1\111\1\76\1\77\1\100\1\101\1\102\1\103",
            "\1\114",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\1\127\1\130\1\145\31\uffff\1\146\4\uffff\1\137\1\140\1\141"+
            "\1\142\1\143\1\144\1\131\1\132\1\133\1\134\1\135\1\136",
            "\1\147",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\1\162\1\163\1\u0080\31\uffff\1\u0081\4\uffff\1\172\1\173"+
            "\1\174\1\175\1\176\1\177\1\164\1\165\1\166\1\167\1\170\1\171",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "",
            "",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\u0083\1\u0084\1\u0091\31\uffff\1\u0092\4\uffff\1\u008b"+
            "\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0085\1\u0086\1\u0087"+
            "\1\u0088\1\u0089\1\u008a",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\u0095\1\u0096\1\u00a3\30\uffff\1\u0093\3\uffff\1\u0094"+
            "\1\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u0097"+
            "\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c",
            "\1\u00a4\1\u00a5\1\u00b2\36\uffff\1\u00ac\1\u00ad\1\u00ae"+
            "\1\u00af\1\u00b0\1\u00b1\1\u00a6\1\u00a7\1\u00a8\1\u00a9\1\u00aa"+
            "\1\u00ab",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b4",
            "\1\u00b5\1\u00b6\1\u00c3\36\uffff\1\u00bd\1\u00be\1\u00bf"+
            "\1\u00c0\1\u00c1\1\u00c2\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb"+
            "\1\u00bc",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c5",
            "\1\u00c6\1\u00c7\1\u00d4\31\uffff\1\u00d5\4\uffff\1\u00ce"+
            "\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00c8\1\u00c9\1\u00ca"+
            "\1\u00cb\1\u00cc\1\u00cd",
            "\1\u00d6",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\161\11\uffff\1\113",
            "\1\u00e0\1\u00e1\1\u00ee\36\uffff\1\u00e8\1\u00e9\1\u00ea"+
            "\1\u00eb\1\u00ec\1\u00ed\1\u00e2\1\u00e3\1\u00e4\1\u00e5\1\u00e6"+
            "\1\u00e7",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1\117\1\120\1\121"+
            "\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff\23\126\24\uffff"+
            "\20\126\1\uffff\3\126\2\uffff\1\126",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u0082\11\uffff\1\146",
            "\1\u00ef\1\u00f0\1\u00fd\36\uffff\1\u00f7\1\u00f8\1\u00f9"+
            "\1\u00fa\1\u00fb\1\u00fc\1\u00f1\1\u00f2\1\u00f3\1\u00f4\1\u00f5"+
            "\1\u00f6",
            "\1\160\72\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00ff\1\u0100\1\u010d\31\uffff\1\u010e\4\uffff\1\u0107"+
            "\1\u0108\1\u0109\1\u010a\1\u010b\1\u010c\1\u0101\1\u0102\1\u0103"+
            "\1\u0104\1\u0105\1\u0106",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u0111\1\u0112\1\u011f\30\uffff\1\u010f\3\uffff\1\u0110"+
            "\1\uffff\1\u0119\1\u011a\1\u011b\1\u011c\1\u011d\1\u011e\1\u0113"+
            "\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00b3\11\uffff\1\u0081",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u00c4\11\uffff\1\u0092",
            "\1\u0120\1\u0121\1\u012e\36\uffff\1\u0128\1\u0129\1\u012a"+
            "\1\u012b\1\u012c\1\u012d\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126"+
            "\1\u0127",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u0130",
            "\1\u0131\1\u0132\1\u013f\31\uffff\1\u0140\4\uffff\1\u0139"+
            "\1\u013a\1\u013b\1\u013c\1\u013d\1\u013e\1\u0133\1\u0134\1\u0135"+
            "\1\u0136\1\u0137\1\u0138",
            "\1\u0141",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u00fe\11\uffff\1\u00d5",
            "\1\u014a\1\u014b\1\u0158\36\uffff\1\u0152\1\u0153\1\u0154"+
            "\1\u0155\1\u0156\1\u0157\1\u014c\1\u014d\1\u014e\1\u014f\1\u0150"+
            "\1\u0151",
            "\1\u00df\60\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\1\u015a\1\u015b\1\u0168\31\uffff\1\u0169\4\uffff\1\u0162"+
            "\1\u0163\1\u0164\1\u0165\1\u0166\1\u0167\1\u015c\1\u015d\1\u015e"+
            "\1\u015f\1\u0160\1\u0161",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126\41\uffff\2\126"+
            "\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u012f\11\uffff\1\u010e",
            "\1\u016a\1\u016b\1\u0178\36\uffff\1\u0172\1\u0173\1\u0174"+
            "\1\u0175\1\u0176\1\u0177\1\u016c\1\u016d\1\u016e\1\u016f\1\u0170"+
            "\1\u0171",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u017a",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u0159\11\uffff\1\u0140",
            "\1\u017b\1\u017c\1\u0189\36\uffff\1\u0183\1\u0184\1\u0185"+
            "\1\u0186\1\u0187\1\u0188\1\u017d\1\u017e\1\u017f\1\u0180\1\u0181"+
            "\1\u0182",
            "\5\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\15\126\1\uffff\3\126\7\uffff\3\126\1\uffff\3\126\1\uffff\2"+
            "\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143\1\u0144\1\u0145"+
            "\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169",
            "\1\u0179\11\uffff\1\u0169"
    };

    static final short[] DFA120_eot = DFA.unpackEncodedString(DFA120_eotS);
    static final short[] DFA120_eof = DFA.unpackEncodedString(DFA120_eofS);
    static final char[] DFA120_min = DFA.unpackEncodedStringToUnsignedChars(DFA120_minS);
    static final char[] DFA120_max = DFA.unpackEncodedStringToUnsignedChars(DFA120_maxS);
    static final short[] DFA120_accept = DFA.unpackEncodedString(DFA120_acceptS);
    static final short[] DFA120_special = DFA.unpackEncodedString(DFA120_specialS);
    static final short[][] DFA120_transition;

    static {
        int numStates = DFA120_transitionS.length;
        DFA120_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA120_transition[i] = DFA.unpackEncodedString(DFA120_transitionS[i]);
        }
    }

    class DFA120 extends DFA {

        public DFA120(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 120;
            this.eot = DFA120_eot;
            this.eof = DFA120_eof;
            this.min = DFA120_min;
            this.max = DFA120_max;
            this.accept = DFA120_accept;
            this.special = DFA120_special;
            this.transition = DFA120_transition;
        }
        public String getDescription() {
            return "5490:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLLVM_in_entryRuleLLVM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLVM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleLLVM130 = new BitSet(new long[]{0x0007FFA2244501C2L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement224 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement266 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelEntity325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleTopLevelEntity363 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTopLevelEntity375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTopLevelEntity417 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_19_in_ruleTopLevelEntity430 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_20_in_ruleTopLevelEntity448 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTopLevelEntity461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleTopLevelEntity503 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTopLevelEntity515 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleTopLevelEntity527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity544 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_24_in_ruleTopLevelEntity562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity579 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_25_in_ruleTopLevelEntity598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainLevelEntity645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_ruleMainLevelEntity692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVar_in_ruleMainLevelEntity719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_entryRuleFunctionHeader754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionHeader764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionHeader802 = new BitSet(new long[]{0x0007FFA2244501C0L,0x000007FFF7F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleFunctionHeader819 = new BitSet(new long[]{0x0007FFA2244501C0L,0x000007FFF7F80000L,0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader837 = new BitSet(new long[]{0x0007FFA2244501C0L,0x000007FFF7F80000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionHeader855 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader873 = new BitSet(new long[]{0x0007FFA2244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionHeader895 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader912 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleFunctionHeader938 = new BitSet(new long[]{0x0000000218000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionHeader951 = new BitSet(new long[]{0x0000000218000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader970 = new BitSet(new long[]{0x0000000218000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionHeader984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionHeader995 = new BitSet(new long[]{0x0000000218000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader1013 = new BitSet(new long[]{0x0000000218000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionHeader1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleFunctionHeader1055 = new BitSet(new long[]{0x0007FFA2244501C0L,0x000007FFF7F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleFunctionHeader1072 = new BitSet(new long[]{0x0007FFA2244501C0L,0x000007FFF7F80000L,0x0000000000000000L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader1090 = new BitSet(new long[]{0x0007FFA2244501C0L,0x000007FFF7F80000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionHeader1108 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader1126 = new BitSet(new long[]{0x0007FFA2244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionHeader1148 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader1165 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleFunctionHeader1192 = new BitSet(new long[]{0x0000000018000002L,0x1FFFF80000008000L});
    public static final BitSet FOLLOW_30_in_ruleFunctionHeader1210 = new BitSet(new long[]{0x0000000018000002L,0x1FFFF80000008000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionHeader1224 = new BitSet(new long[]{0x0000000010000002L,0x1FFFF80000008000L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader1243 = new BitSet(new long[]{0x0000000010000002L,0x1FFFF80000008000L});
    public static final BitSet FOLLOW_28_in_ruleFunctionHeader1257 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionHeader1268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList1325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleParameterList1374 = new BitSet(new long[]{0x0007FFA3254501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleParameterList1392 = new BitSet(new long[]{0x0007FFA3254501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleParameterList1425 = new BitSet(new long[]{0x0007FFA3254501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleParameterList1454 = new BitSet(new long[]{0x0007FFA3254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterList1483 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_24_in_ruleParameterList1503 = new BitSet(new long[]{0x0007FFA3254501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleParameterList1520 = new BitSet(new long[]{0x0007FFA3254501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleParameterList1553 = new BitSet(new long[]{0x0007FFA3254501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleParameterList1582 = new BitSet(new long[]{0x0007FFA3254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterList1611 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_32_in_ruleParameterList1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_entryRuleTypeList1674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeList1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleTypeList1730 = new BitSet(new long[]{0x0007FFA3254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeList1752 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_24_in_ruleTypeList1765 = new BitSet(new long[]{0x0007FFA3254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeList1786 = new BitSet(new long[]{0x0000000101000000L});
    public static final BitSet FOLLOW_32_in_ruleTypeList1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_entryRuleAggregate1838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregate1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAggregate1885 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleAggregate1906 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAggregate1919 = new BitSet(new long[]{0x0007FFA6244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleAggregate1940 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAggregate1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVar_in_entryRuleLocalVar1989 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVar1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLocalVar2045 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleLocalVar2057 = new BitSet(new long[]{0x80EFFFBA244501C0L,0x60000000080721BBL,0x01FFF00000FFFFE0L});
    public static final BitSet FOLLOW_35_in_ruleLocalVar2071 = new BitSet(new long[]{0x0007FFA2244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleLocalVar2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleLocalVar2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleLocalVar2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAlias2231 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_ruleAlias2248 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleAlias2266 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAlias2288 = new BitSet(new long[]{0x0007FFA2244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlias2309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_ruleType2405 = new BitSet(new long[]{0x0000000000000002L,0x0000000007F80000L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleType2431 = new BitSet(new long[]{0x0000000000000002L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleType2464 = new BitSet(new long[]{0x0000000000000002L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleType2493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_entryRuleTypeAndValue2540 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeAndValue2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleTypeAndValue2595 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleTypeAndValue2619 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleTypeAndValue2639 = new BitSet(new long[]{0x0007FFA2244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeAndValue2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_ruleTypeAndValue2690 = new BitSet(new long[]{0x0007FFA2244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeAndValue2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_entryRuleStructType2749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructType2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleStructType2799 = new BitSet(new long[]{0x0007FFA6254501C0L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType2816 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleStructType2849 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_24_in_ruleStructType2869 = new BitSet(new long[]{0x0007FFA6254501C0L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType2885 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleStructType2918 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_34_in_ruleStructType2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStructType2962 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleStructType2975 = new BitSet(new long[]{0x0007FFA6254501C0L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType2992 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleStructType3025 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_24_in_ruleStructType3045 = new BitSet(new long[]{0x0007FFA6254501C0L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType3061 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleStructType3094 = new BitSet(new long[]{0x0000000401000000L});
    public static final BitSet FOLLOW_34_in_ruleStructType3117 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleStructType3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_entryRuleB_TYPE3172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleB_TYPE3183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleB_TYPE3223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleF_POINT_in_ruleB_TYPE3256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBASIC_TYPE_in_ruleB_TYPE3289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleB_TYPE3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBASIC_TYPE_in_entryRuleBASIC_TYPE3361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBASIC_TYPE3372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBASIC_TYPE3410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBASIC_TYPE3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBASIC_TYPE3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBASIC_TYPE3467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBASIC_TYPE3486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBASIC_TYPE3505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleF_POINT_in_entryRuleF_POINT3546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleF_POINT3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleF_POINT3595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleF_POINT3614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleF_POINT3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleF_POINT3652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleF_POINT3671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleF_POINT3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr3730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetElementPtr3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleGetElementPtr3777 = new BitSet(new long[]{0x0017FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_52_in_ruleGetElementPtr3790 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr3813 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleGetElementPtr3826 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr3847 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_entryRuleExtractValue3885 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractValue3895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleExtractValue3932 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleAggregate_in_ruleExtractValue3953 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleExtractValue3974 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleExtractValue3987 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExtractValue4004 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_entryRuleInsertValue4047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertValue4057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleInsertValue4094 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleAggregate_in_ruleInsertValue4115 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertValue4136 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInsertValue4148 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertValue4169 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInsertValue4182 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInsertValue4199 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleFence_in_entryRuleFence4242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFence4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFence4289 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_56_in_ruleFence4302 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleFence4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_entryRuleATOMIC_ORDERING4362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATOMIC_ORDERING4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleATOMIC_ORDERING4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleATOMIC_ORDERING4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleATOMIC_ORDERING4449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleATOMIC_ORDERING4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleATOMIC_ORDERING4487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleATOMIC_ORDERING4506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg4546 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmpXchg4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleCmpXchg4593 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80001L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_64_in_ruleCmpXchg4606 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg4629 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCmpXchg4641 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg4662 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCmpXchg4674 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg4695 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCmpXchg4708 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleCmpXchg4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW4767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRMW4777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAtomicRMW4814 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FFDL});
    public static final BitSet FOLLOW_64_in_ruleAtomicRMW4827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001FFDL});
    public static final BitSet FOLLOW_ruleBIN_OP_in_ruleAtomicRMW4845 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW4865 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAtomicRMW4877 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW4898 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_56_in_ruleAtomicRMW4911 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleAtomicRMW4934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBIN_OP_in_entryRuleBIN_OP4971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBIN_OP4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBIN_OP5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBIN_OP5039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBIN_OP5058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBIN_OP5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBIN_OP5096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBIN_OP5115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleBIN_OP5134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleBIN_OP5153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBIN_OP5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBIN_OP5191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBIN_OP5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_entryRuleLoad5250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoad5260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleLoad5298 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80001L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_64_in_ruleLoad5311 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLoad5334 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleLoad5347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleLoad5364 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleLoad5386 = new BitSet(new long[]{0x0000000001000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_77_in_ruleLoad5410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleLoad5422 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80001L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_64_in_ruleLoad5435 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLoad5458 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_56_in_ruleLoad5471 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleLoad5494 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleLoad5507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleLoad5519 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoad5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore5580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore5590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleStore5628 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80001L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_64_in_ruleStore5641 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore5664 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStore5676 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore5697 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleStore5710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleStore5727 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleStore5749 = new BitSet(new long[]{0x0000000001000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_80_in_ruleStore5773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleStore5785 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80001L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_64_in_ruleStore5798 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore5821 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleStore5833 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore5854 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_56_in_ruleStore5867 = new BitSet(new long[]{0x7F00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleStore5890 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleStore5903 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleStore5915 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStore5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall5976 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall5986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleCall6024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleCall6038 = new BitSet(new long[]{0x0007FFA2244501C0L,0x000007FFF7F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleCall6055 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleCall6073 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCall6095 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleCall6116 = new BitSet(new long[]{0x0000000000000002L,0x1FFFF80000000000L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall6133 = new BitSet(new long[]{0x0000000000000002L,0x1FFFF80000000000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES6171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES6182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleRETURN_ATTRIBUTES6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleRETURN_ATTRIBUTES6239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleRETURN_ATTRIBUTES6258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleRETURN_ATTRIBUTES6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleRETURN_ATTRIBUTES6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRETURN_ATTRIBUTES6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRETURN_ATTRIBUTES6334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRETURN_ATTRIBUTES6353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_entryRuleAlloc6393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlloc6403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleAlloc6440 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlloc6461 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAlloc6474 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAlloc6495 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleAlloc6510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleAlloc6526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_entryRuleCallingConv6564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallingConv6575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleCallingConv6613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCallingConv6632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCallingConv6651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleCallingConv6670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleCallingConv6689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleCallingConv6708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleCallingConv6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleCallingConv6746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleCallingConv6765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleCallingConv6784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleCallingConv6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleCallingConv6822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleCallingConv6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleCallingConv6860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleCallingConv6880 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleCallingConv6893 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv6908 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCallingConv6926 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES6988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES6999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleFUNCTION_ATTRIBUTES7037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleFUNCTION_ATTRIBUTES7057 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFUNCTION_ATTRIBUTES7070 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleFUNCTION_ATTRIBUTES7083 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFUNCTION_ATTRIBUTES7098 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFUNCTION_ATTRIBUTES7116 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleFUNCTION_ATTRIBUTES7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleFUNCTION_ATTRIBUTES7149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleFUNCTION_ATTRIBUTES7168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleFUNCTION_ATTRIBUTES7187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleFUNCTION_ATTRIBUTES7206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleFUNCTION_ATTRIBUTES7225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleFUNCTION_ATTRIBUTES7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleFUNCTION_ATTRIBUTES7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleFUNCTION_ATTRIBUTES7282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleFUNCTION_ATTRIBUTES7301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleFUNCTION_ATTRIBUTES7320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleFUNCTION_ATTRIBUTES7339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleFUNCTION_ATTRIBUTES7358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleFUNCTION_ATTRIBUTES7377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleFUNCTION_ATTRIBUTES7396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleFUNCTION_ATTRIBUTES7415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleFUNCTION_ATTRIBUTES7434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_entryRulePHI7474 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePHI7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_rulePHI7521 = new BitSet(new long[]{0x0007FFA224C501C0L});
    public static final BitSet FOLLOW_ruleType_in_rulePHI7537 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePHI7548 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI7569 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePHI7581 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_rulePHI7594 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePHI7606 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI7627 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePHI7639 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleValuePair_in_entryRuleValuePair7677 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuePair7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleValuePair7733 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleValuePair7745 = new BitSet(new long[]{0x0007FFA2244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleValuePair7766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_entryRuleLandingPad7802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLandingPad7812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleLandingPad7850 = new BitSet(new long[]{0x0007FFA2244501C0L,0x8000000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad7871 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleLandingPad7883 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLandingPad7904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_128_in_ruleLandingPad7918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad7939 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad7968 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_126_in_ruleLandingPad7990 = new BitSet(new long[]{0x0007FFA2244501C0L,0x8000000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad8011 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleLandingPad8023 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000000000000L,0x00000000003FFC00L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad8044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000003FFC00L});
    public static final BitSet FOLLOW_ruleCAST_TYPE_in_ruleLandingPad8065 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLandingPad8077 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad8098 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleLandingPad8110 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleLandingPad8121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleLandingPad8132 = new BitSet(new long[]{0x0007FFA3244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad8153 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleLandingPad8165 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_128_in_ruleLandingPad8179 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad8200 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad8229 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause8268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause8278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleClause8316 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause8338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleClause8357 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause8378 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleClause8391 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause8412 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect8451 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect8461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleSelect8498 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect8519 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSelect8531 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect8552 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSelect8564 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect8585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg8621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVA_Arg8631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleVA_Arg8668 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleVA_Arg8689 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVA_Arg8701 = new BitSet(new long[]{0x0007FFA2244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleVA_Arg8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_entryRuleExtractElement8758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractElement8768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleExtractElement8805 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractElement8826 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleExtractElement8838 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractElement8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_entryRuleInsertElement8895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertElement8905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleInsertElement8942 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement8963 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInsertElement8975 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement8996 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleInsertElement9008 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector9065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShuffleVector9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleShuffleVector9112 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector9133 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleShuffleVector9145 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector9166 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleShuffleVector9178 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector9199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast9235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCAST_TYPE_in_ruleCast9286 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCast9306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleCast9318 = new BitSet(new long[]{0x0007FFA2244501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast9339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCAST_TYPE_in_entryRuleCAST_TYPE9376 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCAST_TYPE9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleCAST_TYPE9425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleCAST_TYPE9444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleCAST_TYPE9463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleCAST_TYPE9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleCAST_TYPE9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleCAST_TYPE9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleCAST_TYPE9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleCAST_TYPE9558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleCAST_TYPE9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleCAST_TYPE9596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleCAST_TYPE9615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleCAST_TYPE9634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare9674 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare9684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleCompare9722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000003FF000000L});
    public static final BitSet FOLLOW_ruleI_PREDICATES_in_ruleCompare9738 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare9753 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleCompare9774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ruleCompare9793 = new BitSet(new long[]{0x0000180000000000L,0x0000000000000000L,0x00000FFC3C000000L});
    public static final BitSet FOLLOW_ruleF_PREDICATES_in_ruleCompare9809 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare9824 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleCompare9845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleI_PREDICATES_in_entryRuleI_PREDICATES9882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleI_PREDICATES9893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ruleI_PREDICATES9931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleI_PREDICATES9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleI_PREDICATES9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleI_PREDICATES9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleI_PREDICATES10007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleI_PREDICATES10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ruleI_PREDICATES10045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ruleI_PREDICATES10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleI_PREDICATES10083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_ruleI_PREDICATES10102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleF_PREDICATES_in_entryRuleF_PREDICATES10143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleF_PREDICATES10154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleF_PREDICATES10192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_ruleF_PREDICATES10211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_ruleF_PREDICATES10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_ruleF_PREDICATES10249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_ruleF_PREDICATES10268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_ruleF_PREDICATES10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_ruleF_PREDICATES10306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_ruleF_PREDICATES10325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleF_PREDICATES10344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleF_PREDICATES10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleF_PREDICATES10382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleF_PREDICATES10401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleF_PREDICATES10420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_ruleF_PREDICATES10439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_ruleF_PREDICATES10458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleF_PREDICATES10477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleARITHMETIC_OP_in_entryRuleARITHMETIC_OP10517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleARITHMETIC_OP10527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleARITHMETIC_OP10565 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_172_in_ruleARITHMETIC_OP10583 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_68_in_ruleARITHMETIC_OP10601 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_173_in_ruleARITHMETIC_OP10619 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_174_in_ruleARITHMETIC_OP10637 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_175_in_ruleARITHMETIC_OP10655 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_176_in_ruleARITHMETIC_OP10673 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_177_in_ruleARITHMETIC_OP10691 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_178_in_ruleARITHMETIC_OP10709 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_179_in_ruleARITHMETIC_OP10727 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_180_in_ruleARITHMETIC_OP10745 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_181_in_ruleARITHMETIC_OP10763 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleARITHMETIC_OP10780 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleARITHMETIC_OP10801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OP_in_entryRuleLOGICAL_OP10836 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OP10846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_ruleLOGICAL_OP10884 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_183_in_ruleLOGICAL_OP10902 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_184_in_ruleLOGICAL_OP10920 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_69_in_ruleLOGICAL_OP10938 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_71_in_ruleLOGICAL_OP10956 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_72_in_ruleLOGICAL_OP10974 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleType_in_ruleLOGICAL_OP10991 = new BitSet(new long[]{0x0007FFA2254501C0L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleLOGICAL_OP11012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction11047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction11057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleInstruction11096 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002001L});
    public static final BitSet FOLLOW_ruleLoad_in_ruleInstruction11120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleInstruction11140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010001L});
    public static final BitSet FOLLOW_ruleStore_in_ruleInstruction11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_ruleInstruction11192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_ruleInstruction11219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OP_in_ruleInstruction11246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleARITHMETIC_OP_in_ruleInstruction11273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleInstruction11300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleInstruction11327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_ruleInstruction11354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_ruleInstruction11381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_ruleInstruction11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_ruleInstruction11435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_ruleInstruction11462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_ruleInstruction11489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_ruleInstruction11516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_ruleInstruction11543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_ruleInstruction11570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleInstruction11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleInstruction11624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_ruleInstruction11651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_ruleInstruction11678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVar_in_ruleInstruction11705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch11740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndirectBranch11750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_ruleIndirectBranch11787 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleIndirectBranch11808 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIndirectBranch11820 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIndirectBranch11832 = new BitSet(new long[]{0x0007FFA2264501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleLabelList_in_ruleIndirectBranch11853 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleIndirectBranch11866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelList_in_entryRuleLabelList11902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelList11912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLabelList11957 = new BitSet(new long[]{0x0007FFA2244501C2L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch11993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch12003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_ruleSwitch12040 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSwitch12061 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSwitch12073 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSwitch12094 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSwitch12106 = new BitSet(new long[]{0x0007FFA2264501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleJumpTable_in_ruleSwitch12127 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSwitch12140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpTable_in_entryRuleJumpTable12176 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJumpTable12186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleJumpTable12232 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleJumpTable12244 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleJumpTable12265 = new BitSet(new long[]{0x0007FFA2244501C2L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleInvoke_in_entryRuleInvoke12302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvoke12312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_ruleInvoke12349 = new BitSet(new long[]{0x0007FFA2244501C0L,0x000007FFF7F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleInvoke12366 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleInvoke12384 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke12406 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleInvoke12427 = new BitSet(new long[]{0x0000000000000000L,0x1FFFF80000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke12444 = new BitSet(new long[]{0x0000000000000000L,0x1FFFF80000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleInvoke12457 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke12478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_ruleInvoke12490 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke12511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_entryRuleResume12547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResume12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_ruleResume12594 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleResume12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_entryRuleUnreachable12651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnreachable12661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_ruleUnreachable12707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn12743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn12753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_ruleReturn12800 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleReturn12812 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleReturn12825 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_ruleReturn12837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleReturn12849 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn12860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_ruleReturn12881 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleReturn12902 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleReturn12915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_ruleReturn12927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleReturn12939 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn12950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_entryRuleBranch12988 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranch12998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleBranch13036 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleBranch13077 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch13098 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBranch13110 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch13131 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBranch13143 = new BitSet(new long[]{0x0007FFA2244501C0L,0x0000000007F80000L,0x0000000000000000L,0x00000000007FFFF0L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch13164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody13201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody13211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleFunctionBody13257 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_33_in_ruleFunctionBody13270 = new BitSet(new long[]{0x80EFFFA2244507C0L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_ruleFunctionBody13291 = new BitSet(new long[]{0x80EFFFA6244507C0L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_34_in_ruleFunctionBody13304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleFunctionBody13325 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock13362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicBlock13372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DOTS_in_ruleBasicBlock13415 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleBasicBlock13432 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_ruleBasicBlock13443 = new BitSet(new long[]{0x80EFFFA2244507C0L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBasicBlock13466 = new BitSet(new long[]{0x80EFFFA2244507C0L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleRet_Instr_in_ruleBasicBlock13488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRet_Instr_in_entryRuleRet_Instr13524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRet_Instr13534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleRet_Instr13581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_ruleRet_Instr13608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleRet_Instr13635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_ruleRet_Instr13662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_ruleRet_Instr13689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_ruleRet_Instr13716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_ruleRet_Instr13743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY13779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVISIBILITY13790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_ruleVISIBILITY13828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_ruleVISIBILITY13847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_ruleVISIBILITY13866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE13907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLINKAGE13918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_ruleLINKAGE13956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_ruleLINKAGE13975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_ruleLINKAGE13994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_ruleLINKAGE14013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_ruleLINKAGE14032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_ruleLINKAGE14051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_ruleLINKAGE14070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_ruleLINKAGE14089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_ruleLINKAGE14108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_ruleLINKAGE14127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_ruleLINKAGE14146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_ruleLINKAGE14165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_ruleLINKAGE14193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE14239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIAS_LINKAGE14250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_ruleALIAS_LINKAGE14288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_ruleALIAS_LINKAGE14307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_ruleALIAS_LINKAGE14326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_ruleALIAS_LINKAGE14345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue14386 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadataValue14397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14437 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetadataValue14452 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_215_in_ruleMetadataValue14478 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14493 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMetadataValue14511 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14532 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14547 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleMetadataValue14568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001800002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14583 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetadataValue14598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_ruleMetadataValue14624 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14639 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMetadataValue14657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14678 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_ruleMetadataValue14719 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000800002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14735 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMetadataValue14748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_215_in_ruleMetadataValue14768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_ruleMetadataValue14782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14795 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadataValue14810 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMetadataValue14828 = new BitSet(new long[]{0x00001F8000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_216_in_ruleMetadataValue14843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14856 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetadataValue14871 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ruleBASIC_TYPE_in_ruleMetadataValue14905 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleMetadataValue14924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT14971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIGNMENT14982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleALIGNMENT15020 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleALIGNMENT15035 = new BitSet(new long[]{0x0000000000000002L});

}