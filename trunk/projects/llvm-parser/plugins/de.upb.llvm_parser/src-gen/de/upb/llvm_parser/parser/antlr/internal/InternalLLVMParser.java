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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_STRING", "RULE_VAR_TYPE", "RULE_NOBRACKET", "RULE_INTEGER", "RULE_INT", "RULE_POINT", "RULE_ID", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'asm'", "'target'", "'datalayout'", "'triple'", "'='", "'deplibs'", "'['", "','", "']'", "'define'", "'unnamed_addr'", "'section '", "'declare'", "'(...)'", "'('", "')'", "'{'", "'}'", "':'", "'type'", "'volatile'", "'alias'", "'<'", "'>'", "'void'", "'null'", "'label'", "'undef'", "'true'", "'false'", "'half'", "'float'", "'double'", "'x86_fp80'", "'fp128'", "'ppc_fp128'", "'getelementptr'", "'inbounds'", "'extractvalue'", "'insertvalue'", "'fence'", "'singlethread'", "'unordered'", "'monotonic'", "'aquire'", "'release'", "'acq_rel'", "'seq_cst'", "'cmpxchg'", "'atomicrmw'", "'xchg'", "'add'", "'sub'", "'and'", "'nand'", "'or'", "'xor'", "'max'", "'min'", "'umax'", "'umin'", "'load'", "'atomic'", "'align'", "'store'", "'tail'", "'call'", "'zeroext'", "'signext'", "'inreg'", "'byval'", "'sret'", "'noalias'", "'nocapture'", "'nest'", "'alloca'", "'ccc'", "'fastcc'", "'coldcc'", "'x86_stdcallcc'", "'x86_fastcallcc'", "'x86_thiscallcc'", "'arm_apcscc'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", "'msp430_intrcc'", "'ptx_kernel'", "'ptx_device'", "'spir_func'", "'spir_kernel'", "'cc'", "'address_safety'", "'alignstack'", "'alwaysinline'", "'nonlazybind'", "'inlinehint'", "'naked'", "'noimplicitfloat'", "'noinline'", "'noredzone'", "'noreturn'", "'nounwind'", "'optsize'", "'readnone'", "'readonly'", "'returns_twice'", "'ssp'", "'sspreq'", "'uwtable'", "'phi'", "'landingpad'", "'personality'", "'cleanup'", "'(...)*'", "'to'", "'catch'", "'filter'", "'select'", "'va_arg'", "'extractelement'", "'insertelement'", "'shufflevector'", "'trunc'", "'zext'", "'sext'", "'fptrunc'", "'fpext'", "'fptoui'", "'fptosi'", "'uitofp'", "'sitofp'", "'ptrtoint'", "'inttoptr'", "'bitcast'", "'icmp'", "'fcmp'", "'eq'", "'ne'", "'ugt'", "'uge'", "'ult'", "'ule'", "'sgt'", "'sge'", "'slt'", "'sle'", "'oeq'", "'ogt'", "'oge'", "'olt'", "'ole'", "'one'", "'ord'", "'ueq'", "'une'", "'uno'", "'fadd'", "'fsub'", "'mul'", "'fmul'", "'udiv'", "'sdiv'", "'fdiv'", "'urem'", "'srem'", "'frem'", "'shl'", "'lshr'", "'ashr'", "'indirectbr'", "'switch'", "'invoke'", "'unwind'", "'resume'", "'unreachable'", "'ret'", "'!dbg'", "'!'", "'br'", "'default'", "'hidden'", "'protected'", "'private'", "'linker_private'", "'linker_private_weak'", "'available_externally'", "'linkonce'", "'common'", "'appending'", "'extern_weak'", "'linkonce_odr'", "'linkonce_odr_auto_hide'", "'dllimport'", "'dllexport'", "'external'", "'internal'", "'weak'", "'weak_odr'", "'!{'", "'metadata'"
    };
    public static final int RULE_ID=11;
    public static final int RULE_VAR_TYPE=6;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=14;
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
    public static final int RULE_ML_COMMENT=12;
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
    public static final int RULE_NOBRACKET=7;
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
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int RULE_INTEGER=8;
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
    public static final int RULE_POINT=10;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__59=59;
    public static final int RULE_INT=9;
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
    public static final int RULE_WS=13;
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

                if ( (LA1_0==RULE_VAR_TYPE||(LA1_0>=RULE_INTEGER && LA1_0<=RULE_INT)||LA1_0==15||LA1_0==17||LA1_0==21||LA1_0==25||LA1_0==28||LA1_0==32||LA1_0==38||(LA1_0>=40 && LA1_0<=51)) ) {
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

            if ( (LA4_0==15||LA4_0==17||LA4_0==21) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_VAR_TYPE||(LA4_0>=RULE_INTEGER && LA4_0<=RULE_INT)||LA4_0==25||LA4_0==28||LA4_0==32||LA4_0==38||(LA4_0>=40 && LA4_0<=51)) ) {
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
            case 15:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 21:
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
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleTopLevelEntity363); 

                        	newLeafNode(otherlv_0, grammarAccess.getTopLevelEntityAccess().getModuleKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleTopLevelEntity375); 

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
                    otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleTopLevelEntity417); 

                        	newLeafNode(otherlv_3, grammarAccess.getTopLevelEntityAccess().getTargetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:198:1: (otherlv_4= 'datalayout' | otherlv_5= 'triple' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==19) ) {
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
                            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTopLevelEntity430); 

                                	newLeafNode(otherlv_4, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:203:7: otherlv_5= 'triple'
                            {
                            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleTopLevelEntity448); 

                                	newLeafNode(otherlv_5, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1());
                                

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleTopLevelEntity461); 

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
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleTopLevelEntity503); 

                        	newLeafNode(otherlv_8, grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_2_0());
                        
                    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleTopLevelEntity515); 

                        	newLeafNode(otherlv_9, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_2_1());
                        
                    otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleTopLevelEntity527); 

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

                        if ( (LA6_0==23) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:260:4: otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) )
                    	    {
                    	    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleTopLevelEntity562); 

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

                    otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleTopLevelEntity598); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:303:1: ruleMainLevelEntity returns [EObject current=null] : (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVarInstruction_1= ruleLocalVarInstruction ) ;
    public final EObject ruleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionHeader_0 = null;

        EObject this_LocalVarInstruction_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:306:28: ( (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVarInstruction_1= ruleLocalVarInstruction ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:307:1: (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVarInstruction_1= ruleLocalVarInstruction )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:307:1: (this_FunctionHeader_0= ruleFunctionHeader | this_LocalVarInstruction_1= ruleLocalVarInstruction )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25||LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_VAR_TYPE||(LA8_0>=RULE_INTEGER && LA8_0<=RULE_INT)||LA8_0==32||LA8_0==38||(LA8_0>=40 && LA8_0<=51)) ) {
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:318:5: this_LocalVarInstruction_1= ruleLocalVarInstruction
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getLocalVarInstructionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLocalVarInstruction_in_ruleMainLevelEntity719);
                    this_LocalVarInstruction_1=ruleLocalVarInstruction();

                    state._fsp--;

                     
                            current = this_LocalVarInstruction_1; 
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

        EObject lv_pl_7_0 = null;

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

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            else if ( (LA26_0==28) ) {
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
                    otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleFunctionHeader802); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionHeaderAccess().getDefineKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:351:1: ( ruleLINKAGE )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( ((LA9_0>=198 && LA9_0<=213)) ) {
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

                    if ( ((LA10_0>=195 && LA10_0<=197)) ) {
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

                    if ( (LA13_0==26) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:437:4: otherlv_8= 'unnamed_addr'
                            {
                            otherlv_8=(Token)match(input,26,FOLLOW_26_in_ruleFunctionHeader951); 

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

                    if ( (LA15_0==27) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:449:5: otherlv_10= 'section ' this_STRING_11= RULE_STRING
                            {
                            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleFunctionHeader984); 

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
                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleFunctionHeader1055); 

                        	newLeafNode(otherlv_14, grammarAccess.getFunctionHeaderAccess().getDeclareKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:488:1: ( ruleLINKAGE )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( ((LA17_0>=198 && LA17_0<=213)) ) {
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

                    if ( ((LA18_0>=195 && LA18_0<=197)) ) {
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

                    if ( (LA21_0==30) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==29) ) {
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
                            otherlv_22=(Token)match(input,29,FOLLOW_29_in_ruleFunctionHeader1210); 

                                	newLeafNode(otherlv_22, grammarAccess.getFunctionHeaderAccess().getLeftParenthesisFullStopFullStopFullStopRightParenthesisKeyword_1_7_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:579:2: (otherlv_23= 'unnamed_addr' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==26) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:579:4: otherlv_23= 'unnamed_addr'
                            {
                            otherlv_23=(Token)match(input,26,FOLLOW_26_in_ruleFunctionHeader1224); 

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

                    if ( (LA24_0==27) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:591:5: otherlv_25= 'section ' this_STRING_26= RULE_STRING
                            {
                            otherlv_25=(Token)match(input,27,FOLLOW_27_in_ruleFunctionHeader1257); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:615:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:616:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:617:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList1324);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList1334); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:624:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_params_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_params_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:627:28: ( ( () otherlv_1= '(' ( ( (lv_params_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )? otherlv_5= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:1: ( () otherlv_1= '(' ( ( (lv_params_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )? otherlv_5= ')' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:1: ( () otherlv_1= '(' ( ( (lv_params_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )? otherlv_5= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:2: () otherlv_1= '(' ( ( (lv_params_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )? otherlv_5= ')'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:629:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterListAccess().getParameterListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleParameterList1380); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:638:1: ( ( (lv_params_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_VAR_TYPE||(LA28_0>=RULE_INTEGER && LA28_0<=RULE_INT)||LA28_0==32||(LA28_0>=40 && LA28_0<=51)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:638:2: ( (lv_params_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:638:2: ( (lv_params_2_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:639:1: (lv_params_2_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:639:1: (lv_params_2_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:640:3: lv_params_2_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsTypeAndValueParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleParameterList1402);
                    lv_params_2_0=ruleTypeAndValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	        }
                           		add(
                           			current, 
                           			"params",
                            		lv_params_2_0, 
                            		"TypeAndValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:656:2: (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==23) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:656:4: otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleParameterList1415); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:660:1: ( (lv_params_4_0= ruleTypeAndValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:661:1: (lv_params_4_0= ruleTypeAndValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:661:1: (lv_params_4_0= ruleTypeAndValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:662:3: lv_params_4_0= ruleTypeAndValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsTypeAndValueParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleParameterList1436);
                    	    lv_params_4_0=ruleTypeAndValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
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
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleParameterList1452); 

                	newLeafNode(otherlv_5, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_3());
                

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:690:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBody = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:691:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:692:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody1488);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody1498); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:699:1: ruleFunctionBody returns [EObject current=null] : ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_meta_0_0 = null;

        EObject lv_blocks_2_0 = null;

        AntlrDatatypeRuleToken lv_meta_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:702:28: ( ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:703:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:703:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:703:2: ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:703:2: ( (lv_meta_0_0= ruleMetadataValue ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==193||LA29_0==214) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:704:1: (lv_meta_0_0= ruleMetadataValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:704:1: (lv_meta_0_0= ruleMetadataValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:705:3: lv_meta_0_0= ruleMetadataValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getMetaMetadataValueParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleFunctionBody1544);
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
            	    break loop29;
                }
            } while (true);

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleFunctionBody1557); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:725:1: ( (lv_blocks_2_0= ruleBasicBlock ) )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_VAR_TYPE && LA30_0<=RULE_INT)||LA30_0==32||LA30_0==36||LA30_0==38||(LA30_0>=40 && LA30_0<=52)||(LA30_0>=54 && LA30_0<=56)||(LA30_0>=64 && LA30_0<=65)||(LA30_0>=67 && LA30_0<=69)||(LA30_0>=71 && LA30_0<=72)||LA30_0==77||(LA30_0>=80 && LA30_0<=82)||LA30_0==91||(LA30_0>=125 && LA30_0<=126)||(LA30_0>=133 && LA30_0<=151)||(LA30_0>=172 && LA30_0<=187)||(LA30_0>=189 && LA30_0<=191)||LA30_0==194) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:726:1: (lv_blocks_2_0= ruleBasicBlock )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:726:1: (lv_blocks_2_0= ruleBasicBlock )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:727:3: lv_blocks_2_0= ruleBasicBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getBlocksBasicBlockParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBasicBlock_in_ruleFunctionBody1578);
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
            	    if ( cnt30 >= 1 ) break loop30;
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
            } while (true);

            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleFunctionBody1591); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:747:1: ( (lv_meta_4_0= ruleMetadataValue ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==193||LA31_0==214) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:748:1: (lv_meta_4_0= ruleMetadataValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:748:1: (lv_meta_4_0= ruleMetadataValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:749:3: lv_meta_4_0= ruleMetadataValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getMetaMetadataValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleFunctionBody1612);
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
            	    break loop31;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:773:1: entryRuleBasicBlock returns [EObject current=null] : iv_ruleBasicBlock= ruleBasicBlock EOF ;
    public final EObject entryRuleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBlock = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:774:2: (iv_ruleBasicBlock= ruleBasicBlock EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:775:2: iv_ruleBasicBlock= ruleBasicBlock EOF
            {
             newCompositeNode(grammarAccess.getBasicBlockRule()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock1649);
            iv_ruleBasicBlock=ruleBasicBlock();

            state._fsp--;

             current =iv_ruleBasicBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicBlock1659); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:782:1: ruleBasicBlock returns [EObject current=null] : ( ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) ) ) ;
    public final EObject ruleBasicBlock() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token otherlv_1=null;
        EObject lv_instructions_2_1 = null;

        EObject lv_instructions_2_2 = null;

        EObject lv_terminator_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:785:28: ( ( ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:786:1: ( ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:786:1: ( ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:786:2: ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:786:2: ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_NOBRACKET) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:786:3: ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':'
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:786:3: ( (lv_label_0_0= RULE_NOBRACKET ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:787:1: (lv_label_0_0= RULE_NOBRACKET )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:787:1: (lv_label_0_0= RULE_NOBRACKET )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:788:3: lv_label_0_0= RULE_NOBRACKET
                    {
                    lv_label_0_0=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleBasicBlock1702); 

                    			newLeafNode(lv_label_0_0, grammarAccess.getBasicBlockAccess().getLabelNOBRACKETTerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBasicBlockRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"label",
                            		lv_label_0_0, 
                            		"NOBRACKET");
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,34,FOLLOW_34_in_ruleBasicBlock1719); 

                        	newLeafNode(otherlv_1, grammarAccess.getBasicBlockAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:808:3: ( ( (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_VAR_TYPE||(LA34_0>=RULE_INTEGER && LA34_0<=RULE_INT)||LA34_0==32||LA34_0==36||LA34_0==38||(LA34_0>=40 && LA34_0<=52)||(LA34_0>=54 && LA34_0<=56)||(LA34_0>=64 && LA34_0<=65)||(LA34_0>=67 && LA34_0<=69)||(LA34_0>=71 && LA34_0<=72)||LA34_0==77||(LA34_0>=80 && LA34_0<=82)||LA34_0==91||(LA34_0>=125 && LA34_0<=126)||(LA34_0>=133 && LA34_0<=151)||(LA34_0>=172 && LA34_0<=184)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:809:1: ( (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction ) )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:809:1: ( (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:810:1: (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:810:1: (lv_instructions_2_1= ruleLocalVarInstruction | lv_instructions_2_2= ruleInstruction )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( (LA33_0==RULE_VAR_TYPE||(LA33_0>=RULE_INTEGER && LA33_0<=RULE_INT)||LA33_0==32||LA33_0==38||(LA33_0>=40 && LA33_0<=51)) ) {
            	        alt33=1;
            	    }
            	    else if ( (LA33_0==36||LA33_0==52||(LA33_0>=54 && LA33_0<=56)||(LA33_0>=64 && LA33_0<=65)||(LA33_0>=67 && LA33_0<=69)||(LA33_0>=71 && LA33_0<=72)||LA33_0==77||(LA33_0>=80 && LA33_0<=82)||LA33_0==91||(LA33_0>=125 && LA33_0<=126)||(LA33_0>=133 && LA33_0<=151)||(LA33_0>=172 && LA33_0<=184)) ) {
            	        alt33=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt33) {
            	        case 1 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:811:3: lv_instructions_2_1= ruleLocalVarInstruction
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBasicBlockAccess().getInstructionsLocalVarInstructionParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleLocalVarInstruction_in_ruleBasicBlock1744);
            	            lv_instructions_2_1=ruleLocalVarInstruction();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBasicBlockRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"instructions",
            	                    		lv_instructions_2_1, 
            	                    		"LocalVarInstruction");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:826:8: lv_instructions_2_2= ruleInstruction
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBasicBlockAccess().getInstructionsInstructionParserRuleCall_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleInstruction_in_ruleBasicBlock1763);
            	            lv_instructions_2_2=ruleInstruction();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBasicBlockRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"instructions",
            	                    		lv_instructions_2_2, 
            	                    		"Instruction");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:844:3: ( (lv_terminator_3_0= ruleRet_Instr ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:845:1: (lv_terminator_3_0= ruleRet_Instr )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:845:1: (lv_terminator_3_0= ruleRet_Instr )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:846:3: lv_terminator_3_0= ruleRet_Instr
            {
             
            	        newCompositeNode(grammarAccess.getBasicBlockAccess().getTerminatorRet_InstrParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRet_Instr_in_ruleBasicBlock1788);
            lv_terminator_3_0=ruleRet_Instr();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBasicBlockRule());
            	        }
                   		set(
                   			current, 
                   			"terminator",
                    		lv_terminator_3_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:870:1: entryRuleRet_Instr returns [EObject current=null] : iv_ruleRet_Instr= ruleRet_Instr EOF ;
    public final EObject entryRuleRet_Instr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRet_Instr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:871:2: (iv_ruleRet_Instr= ruleRet_Instr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:872:2: iv_ruleRet_Instr= ruleRet_Instr EOF
            {
             newCompositeNode(grammarAccess.getRet_InstrRule()); 
            pushFollow(FOLLOW_ruleRet_Instr_in_entryRuleRet_Instr1824);
            iv_ruleRet_Instr=ruleRet_Instr();

            state._fsp--;

             current =iv_ruleRet_Instr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRet_Instr1834); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:879:1: ruleRet_Instr returns [EObject current=null] : (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:882:28: ( (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:883:1: (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:883:1: (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable )
            int alt35=7;
            switch ( input.LA(1) ) {
            case 191:
                {
                alt35=1;
                }
                break;
            case 194:
                {
                alt35=2;
                }
                break;
            case 186:
                {
                alt35=3;
                }
                break;
            case 185:
                {
                alt35=4;
                }
                break;
            case 187:
                {
                alt35=5;
                }
                break;
            case 189:
                {
                alt35=6;
                }
                break;
            case 190:
                {
                alt35=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:884:5: this_Return_0= ruleReturn
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getReturnParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReturn_in_ruleRet_Instr1881);
                    this_Return_0=ruleReturn();

                    state._fsp--;

                     
                            current = this_Return_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:894:5: this_Branch_1= ruleBranch
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getBranchParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBranch_in_ruleRet_Instr1908);
                    this_Branch_1=ruleBranch();

                    state._fsp--;

                     
                            current = this_Branch_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:904:5: this_Switch_2= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getSwitchParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleRet_Instr1935);
                    this_Switch_2=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:914:5: this_IndirectBranch_3= ruleIndirectBranch
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getIndirectBranchParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIndirectBranch_in_ruleRet_Instr1962);
                    this_IndirectBranch_3=ruleIndirectBranch();

                    state._fsp--;

                     
                            current = this_IndirectBranch_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:924:5: this_Invoke_4= ruleInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getInvokeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInvoke_in_ruleRet_Instr1989);
                    this_Invoke_4=ruleInvoke();

                    state._fsp--;

                     
                            current = this_Invoke_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:934:5: this_Resume_5= ruleResume
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getResumeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleResume_in_ruleRet_Instr2016);
                    this_Resume_5=ruleResume();

                    state._fsp--;

                     
                            current = this_Resume_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:944:5: this_Unreachable_6= ruleUnreachable
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getUnreachableParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleUnreachable_in_ruleRet_Instr2043);
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


    // $ANTLR start "entryRuleTypeList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:960:1: entryRuleTypeList returns [EObject current=null] : iv_ruleTypeList= ruleTypeList EOF ;
    public final EObject entryRuleTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:961:2: (iv_ruleTypeList= ruleTypeList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:962:2: iv_ruleTypeList= ruleTypeList EOF
            {
             newCompositeNode(grammarAccess.getTypeListRule()); 
            pushFollow(FOLLOW_ruleTypeList_in_entryRuleTypeList2078);
            iv_ruleTypeList=ruleTypeList();

            state._fsp--;

             current =iv_ruleTypeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeList2088); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:969:1: ruleTypeList returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' ) ;
    public final EObject ruleTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_types_2_0 = null;

        AntlrDatatypeRuleToken lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:972:28: ( ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:973:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:973:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:973:2: () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:973:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:974:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeListAccess().getTypeListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleTypeList2134); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:983:1: ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_VAR_TYPE||(LA37_0>=RULE_INTEGER && LA37_0<=RULE_INT)||LA37_0==32||LA37_0==38||(LA37_0>=40 && LA37_0<=51)) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:983:2: ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:983:2: ( (lv_types_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:984:1: (lv_types_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:984:1: (lv_types_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:985:3: lv_types_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeListAccess().getTypesTypeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTypeList2156);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1001:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==23) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1001:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleTypeList2169); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTypeListAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1005:1: ( (lv_types_4_0= ruleType ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1006:1: (lv_types_4_0= ruleType )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1006:1: (lv_types_4_0= ruleType )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1007:3: lv_types_4_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeListAccess().getTypesTypeParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleTypeList2190);
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
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleTypeList2206); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1035:1: entryRuleAggregate returns [EObject current=null] : iv_ruleAggregate= ruleAggregate EOF ;
    public final EObject entryRuleAggregate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1036:2: (iv_ruleAggregate= ruleAggregate EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1037:2: iv_ruleAggregate= ruleAggregate EOF
            {
             newCompositeNode(grammarAccess.getAggregateRule()); 
            pushFollow(FOLLOW_ruleAggregate_in_entryRuleAggregate2242);
            iv_ruleAggregate=ruleAggregate();

            state._fsp--;

             current =iv_ruleAggregate; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregate2252); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1044:1: ruleAggregate returns [EObject current=null] : (otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}' ) ;
    public final EObject ruleAggregate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_agg_1_0 = null;

        AntlrDatatypeRuleToken lv_agg_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1047:28: ( (otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1048:1: (otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1048:1: (otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1048:3: otherlv_0= '{' ( (lv_agg_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) ) otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleAggregate2289); 

                	newLeafNode(otherlv_0, grammarAccess.getAggregateAccess().getLeftCurlyBracketKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1052:1: ( (lv_agg_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1053:1: (lv_agg_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1053:1: (lv_agg_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1054:3: lv_agg_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAggregateAccess().getAggTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAggregate2310);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1070:2: (otherlv_2= ',' ( (lv_agg_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1070:4: otherlv_2= ',' ( (lv_agg_3_0= ruleType ) )
            {
            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAggregate2323); 

                	newLeafNode(otherlv_2, grammarAccess.getAggregateAccess().getCommaKeyword_2_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1074:1: ( (lv_agg_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1075:1: (lv_agg_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1075:1: (lv_agg_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1076:3: lv_agg_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAggregateAccess().getAggTypeParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAggregate2344);
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

            otherlv_4=(Token)match(input,33,FOLLOW_33_in_ruleAggregate2357); 

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


    // $ANTLR start "entryRuleLocalVarInstruction"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1104:1: entryRuleLocalVarInstruction returns [EObject current=null] : iv_ruleLocalVarInstruction= ruleLocalVarInstruction EOF ;
    public final EObject entryRuleLocalVarInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalVarInstruction = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1105:2: (iv_ruleLocalVarInstruction= ruleLocalVarInstruction EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1106:2: iv_ruleLocalVarInstruction= ruleLocalVarInstruction EOF
            {
             newCompositeNode(grammarAccess.getLocalVarInstructionRule()); 
            pushFollow(FOLLOW_ruleLocalVarInstruction_in_entryRuleLocalVarInstruction2393);
            iv_ruleLocalVarInstruction=ruleLocalVarInstruction();

            state._fsp--;

             current =iv_ruleLocalVarInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLocalVarInstruction2403); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1113:1: ruleLocalVarInstruction returns [EObject current=null] : ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) ) ) ;
    public final EObject ruleLocalVarInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;

        EObject lv_instr_4_0 = null;

        EObject lv_alias_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1116:28: ( ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1117:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1117:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1117:2: ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1117:2: ( (lv_name_0_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1118:1: (lv_name_0_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1118:1: (lv_name_0_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1119:3: lv_name_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLocalVarInstructionAccess().getNameTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLocalVarInstruction2449);
            lv_name_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLocalVarInstructionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleLocalVarInstruction2461); 

                	newLeafNode(otherlv_1, grammarAccess.getLocalVarInstructionAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1139:1: ( (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) ) | ( (lv_instr_4_0= ruleInstruction ) ) | ( (lv_alias_5_0= ruleAlias ) ) )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt38=1;
                }
                break;
            case 36:
            case 52:
            case 54:
            case 55:
            case 56:
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
                alt38=2;
                }
                break;
            case 37:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1139:2: (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1139:2: (otherlv_2= 'type' ( (lv_type_3_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1139:4: otherlv_2= 'type' ( (lv_type_3_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_35_in_ruleLocalVarInstruction2475); 

                        	newLeafNode(otherlv_2, grammarAccess.getLocalVarInstructionAccess().getTypeKeyword_2_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1143:1: ( (lv_type_3_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1144:1: (lv_type_3_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1144:1: (lv_type_3_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1145:3: lv_type_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVarInstructionAccess().getTypeTypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLocalVarInstruction2496);
                    lv_type_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVarInstructionRule());
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1162:6: ( (lv_instr_4_0= ruleInstruction ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1162:6: ( (lv_instr_4_0= ruleInstruction ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1163:1: (lv_instr_4_0= ruleInstruction )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1163:1: (lv_instr_4_0= ruleInstruction )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1164:3: lv_instr_4_0= ruleInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVarInstructionAccess().getInstrInstructionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstruction_in_ruleLocalVarInstruction2524);
                    lv_instr_4_0=ruleInstruction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVarInstructionRule());
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1181:6: ( (lv_alias_5_0= ruleAlias ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1181:6: ( (lv_alias_5_0= ruleAlias ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:1: (lv_alias_5_0= ruleAlias )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:1: (lv_alias_5_0= ruleAlias )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1183:3: lv_alias_5_0= ruleAlias
                    {
                     
                    	        newCompositeNode(grammarAccess.getLocalVarInstructionAccess().getAliasAliasParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAlias_in_ruleLocalVarInstruction2551);
                    lv_alias_5_0=ruleAlias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLocalVarInstructionRule());
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
    // $ANTLR end "ruleLocalVarInstruction"


    // $ANTLR start "entryRuleInstruction"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1207:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1208:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1209:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction2588);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction2598); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1216:1: ruleInstruction returns [EObject current=null] : ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad ) ;
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


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1219:28: ( ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1220:1: ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1220:1: ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad )
            int alt41=21;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1220:2: ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1220:2: ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1220:3: (otherlv_0= 'volatile' )? this_Load_1= ruleLoad
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1220:3: (otherlv_0= 'volatile' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==36) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1220:5: otherlv_0= 'volatile'
                            {
                            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleInstruction2637); 

                                	newLeafNode(otherlv_0, grammarAccess.getInstructionAccess().getVolatileKeyword_0_0());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleLoad_in_ruleInstruction2661);
                    this_Load_1=ruleLoad();

                    state._fsp--;

                     
                            current = this_Load_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1234:6: ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1234:6: ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1234:7: (otherlv_2= 'volatile' )? this_Store_3= ruleStore
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1234:7: (otherlv_2= 'volatile' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==36) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1234:9: otherlv_2= 'volatile'
                            {
                            otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleInstruction2681); 

                                	newLeafNode(otherlv_2, grammarAccess.getInstructionAccess().getVolatileKeyword_1_0());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getStoreParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleStore_in_ruleInstruction2705);
                    this_Store_3=ruleStore();

                    state._fsp--;

                     
                            current = this_Store_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1249:5: this_Fence_4= ruleFence
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFence_in_ruleInstruction2733);
                    this_Fence_4=ruleFence();

                    state._fsp--;

                     
                            current = this_Fence_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1259:5: this_GetElementPtr_5= ruleGetElementPtr
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGetElementPtrParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGetElementPtr_in_ruleInstruction2760);
                    this_GetElementPtr_5=ruleGetElementPtr();

                    state._fsp--;

                     
                            current = this_GetElementPtr_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1269:5: this_LOGICAL_OP_6= ruleLOGICAL_OP
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLOGICAL_OPParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLOGICAL_OP_in_ruleInstruction2787);
                    this_LOGICAL_OP_6=ruleLOGICAL_OP();

                    state._fsp--;

                     
                            current = this_LOGICAL_OP_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1279:5: this_ARITHMETIC_OP_7= ruleARITHMETIC_OP
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getARITHMETIC_OPParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleARITHMETIC_OP_in_ruleInstruction2814);
                    this_ARITHMETIC_OP_7=ruleARITHMETIC_OP();

                    state._fsp--;

                     
                            current = this_ARITHMETIC_OP_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1289:5: this_Compare_8= ruleCompare
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCompareParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCompare_in_ruleInstruction2841);
                    this_Compare_8=ruleCompare();

                    state._fsp--;

                     
                            current = this_Compare_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1299:5: this_Cast_9= ruleCast
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCastParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleCast_in_ruleInstruction2868);
                    this_Cast_9=ruleCast();

                    state._fsp--;

                     
                            current = this_Cast_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1309:5: this_ShuffleVector_10= ruleShuffleVector
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getShuffleVectorParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleShuffleVector_in_ruleInstruction2895);
                    this_ShuffleVector_10=ruleShuffleVector();

                    state._fsp--;

                     
                            current = this_ShuffleVector_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1319:5: this_InsertElement_11= ruleInsertElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertElementParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleInsertElement_in_ruleInstruction2922);
                    this_InsertElement_11=ruleInsertElement();

                    state._fsp--;

                     
                            current = this_InsertElement_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1329:5: this_ExtractElement_12= ruleExtractElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractElementParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleExtractElement_in_ruleInstruction2949);
                    this_ExtractElement_12=ruleExtractElement();

                    state._fsp--;

                     
                            current = this_ExtractElement_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:5: this_InsertValue_13= ruleInsertValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertValueParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleInsertValue_in_ruleInstruction2976);
                    this_InsertValue_13=ruleInsertValue();

                    state._fsp--;

                     
                            current = this_InsertValue_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1349:5: this_ExtractValue_14= ruleExtractValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractValueParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleExtractValue_in_ruleInstruction3003);
                    this_ExtractValue_14=ruleExtractValue();

                    state._fsp--;

                     
                            current = this_ExtractValue_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1359:5: this_Alloc_15= ruleAlloc
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAllocParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleAlloc_in_ruleInstruction3030);
                    this_Alloc_15=ruleAlloc();

                    state._fsp--;

                     
                            current = this_Alloc_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1369:5: this_CmpXchg_16= ruleCmpXchg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCmpXchgParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleCmpXchg_in_ruleInstruction3057);
                    this_CmpXchg_16=ruleCmpXchg();

                    state._fsp--;

                     
                            current = this_CmpXchg_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1379:5: this_AtomicRMW_17= ruleAtomicRMW
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAtomicRMWParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRMW_in_ruleInstruction3084);
                    this_AtomicRMW_17=ruleAtomicRMW();

                    state._fsp--;

                     
                            current = this_AtomicRMW_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1389:5: this_PHI_18= rulePHI
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPHIParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_rulePHI_in_ruleInstruction3111);
                    this_PHI_18=rulePHI();

                    state._fsp--;

                     
                            current = this_PHI_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1399:5: this_Select_19= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSelectParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleInstruction3138);
                    this_Select_19=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1409:5: this_Call_20= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleInstruction3165);
                    this_Call_20=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1419:5: this_VA_Arg_21= ruleVA_Arg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getVA_ArgParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleVA_Arg_in_ruleInstruction3192);
                    this_VA_Arg_21=ruleVA_Arg();

                    state._fsp--;

                     
                            current = this_VA_Arg_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1429:5: this_LandingPad_22= ruleLandingPad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLandingPadParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleLandingPad_in_ruleInstruction3219);
                    this_LandingPad_22=ruleLandingPad();

                    state._fsp--;

                     
                            current = this_LandingPad_22; 
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


    // $ANTLR start "entryRuleAlias"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1445:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1446:2: (iv_ruleAlias= ruleAlias EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1447:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias3254);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias3264); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1454:1: ruleAlias returns [EObject current=null] : (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_3_0 = null;

        AntlrDatatypeRuleToken lv_aliasee_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1457:28: ( (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1458:1: (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1458:1: (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1458:3: otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_type_3_0= ruleTypeAndValue ) ) ( (lv_aliasee_4_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleAlias3301); 

                	newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getAliasKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1462:1: ( ruleALIAS_LINKAGE )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=210 && LA42_0<=213)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1463:5: ruleALIAS_LINKAGE
                    {
                     
                            newCompositeNode(grammarAccess.getAliasAccess().getALIAS_LINKAGEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_ruleAlias3318);
                    ruleALIAS_LINKAGE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1470:3: ( ruleVISIBILITY )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=195 && LA43_0<=197)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1471:5: ruleVISIBILITY
                    {
                     
                            newCompositeNode(grammarAccess.getAliasAccess().getVISIBILITYParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVISIBILITY_in_ruleAlias3336);
                    ruleVISIBILITY();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1478:3: ( (lv_type_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1479:1: (lv_type_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1479:1: (lv_type_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1480:3: lv_type_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAliasAccess().getTypeTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAlias3358);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1496:2: ( (lv_aliasee_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1497:1: (lv_aliasee_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1497:1: (lv_aliasee_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1498:3: lv_aliasee_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAliasAccess().getAliaseeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlias3379);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1522:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1523:2: (iv_ruleType= ruleType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType3416);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType3427); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1531:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_TYPE_1=null;
        AntlrDatatypeRuleToken this_StructType_0 = null;

        AntlrDatatypeRuleToken this_B_TYPE_2 = null;

        AntlrDatatypeRuleToken this_RETURN_ATTRIBUTES_3 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1534:28: ( ( (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1535:1: ( (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1535:1: ( (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1535:2: (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1535:2: (this_StructType_0= ruleStructType | this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE )
            int alt44=3;
            switch ( input.LA(1) ) {
            case 32:
            case 38:
                {
                alt44=1;
                }
                break;
            case RULE_VAR_TYPE:
                {
                alt44=2;
                }
                break;
            case RULE_INTEGER:
            case RULE_INT:
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
                {
                alt44=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }

            switch (alt44) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1536:5: this_StructType_0= ruleStructType
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getStructTypeParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleStructType_in_ruleType3475);
                    this_StructType_0=ruleStructType();

                    state._fsp--;


                    		current.merge(this_StructType_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1547:10: this_VAR_TYPE_1= RULE_VAR_TYPE
                    {
                    this_VAR_TYPE_1=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleType3501); 

                    		current.merge(this_VAR_TYPE_1);
                        
                     
                        newLeafNode(this_VAR_TYPE_1, grammarAccess.getTypeAccess().getVAR_TYPETerminalRuleCall_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1556:5: this_B_TYPE_2= ruleB_TYPE
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getB_TYPEParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleB_TYPE_in_ruleType3534);
                    this_B_TYPE_2=ruleB_TYPE();

                    state._fsp--;


                    		current.merge(this_B_TYPE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1566:2: (this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=83 && LA45_0<=90)) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1567:5: this_RETURN_ATTRIBUTES_3= ruleRETURN_ATTRIBUTES
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getRETURN_ATTRIBUTESParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleType3563);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1585:1: entryRuleTypeAndValue returns [EObject current=null] : iv_ruleTypeAndValue= ruleTypeAndValue EOF ;
    public final EObject entryRuleTypeAndValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeAndValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1586:2: (iv_ruleTypeAndValue= ruleTypeAndValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1587:2: iv_ruleTypeAndValue= ruleTypeAndValue EOF
            {
             newCompositeNode(grammarAccess.getTypeAndValueRule()); 
            pushFollow(FOLLOW_ruleTypeAndValue_in_entryRuleTypeAndValue3610);
            iv_ruleTypeAndValue=ruleTypeAndValue();

            state._fsp--;

             current =iv_ruleTypeAndValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeAndValue3620); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1594:1: ruleTypeAndValue returns [EObject current=null] : ( ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) ) | ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) ) ) ;
    public final EObject ruleTypeAndValue() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        AntlrDatatypeRuleToken lv_type_0_2 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        EObject lv_aggregate_3_0 = null;

        AntlrDatatypeRuleToken lv_value_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1597:28: ( ( ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) ) | ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1598:1: ( ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) ) | ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1598:1: ( ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) ) | ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_VAR_TYPE||(LA48_0>=RULE_INTEGER && LA48_0<=RULE_INT)||(LA48_0>=40 && LA48_0<=51)) ) {
                alt48=1;
            }
            else if ( (LA48_0==32) ) {
                alt48=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1598:2: ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1598:2: ( ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1598:3: ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) ) ( ruleRETURN_ATTRIBUTES )? ( (lv_value_2_0= ruleType ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1598:3: ( ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1599:1: ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1599:1: ( (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1600:1: (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1600:1: (lv_type_0_1= RULE_VAR_TYPE | lv_type_0_2= ruleB_TYPE )
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( (LA46_0==RULE_VAR_TYPE) ) {
                        alt46=1;
                    }
                    else if ( ((LA46_0>=RULE_INTEGER && LA46_0<=RULE_INT)||(LA46_0>=40 && LA46_0<=51)) ) {
                        alt46=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 46, 0, input);

                        throw nvae;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1601:3: lv_type_0_1= RULE_VAR_TYPE
                            {
                            lv_type_0_1=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleTypeAndValue3665); 

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
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1616:8: lv_type_0_2= ruleB_TYPE
                            {
                             
                            	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getTypeB_TYPEParserRuleCall_0_0_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleB_TYPE_in_ruleTypeAndValue3689);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1634:2: ( ruleRETURN_ATTRIBUTES )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=83 && LA47_0<=90)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1635:5: ruleRETURN_ATTRIBUTES
                            {
                             
                                    newCompositeNode(grammarAccess.getTypeAndValueAccess().getRETURN_ATTRIBUTESParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleTypeAndValue3709);
                            ruleRETURN_ATTRIBUTES();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1642:3: ( (lv_value_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1643:1: (lv_value_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1643:1: (lv_value_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1644:3: lv_value_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getValueTypeParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTypeAndValue3731);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1661:6: ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1661:6: ( ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1661:7: ( (lv_aggregate_3_0= ruleAggregate ) ) ( (lv_value_4_0= ruleType ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1661:7: ( (lv_aggregate_3_0= ruleAggregate ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1662:1: (lv_aggregate_3_0= ruleAggregate )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1662:1: (lv_aggregate_3_0= ruleAggregate )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1663:3: lv_aggregate_3_0= ruleAggregate
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getAggregateAggregateParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAggregate_in_ruleTypeAndValue3760);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1679:2: ( (lv_value_4_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1680:1: (lv_value_4_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1680:1: (lv_value_4_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1681:3: lv_value_4_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAndValueAccess().getValueTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTypeAndValue3781);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1705:1: entryRuleStructType returns [String current=null] : iv_ruleStructType= ruleStructType EOF ;
    public final String entryRuleStructType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleStructType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1706:2: (iv_ruleStructType= ruleStructType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1707:2: iv_ruleStructType= ruleStructType EOF
            {
             newCompositeNode(grammarAccess.getStructTypeRule()); 
            pushFollow(FOLLOW_ruleStructType_in_entryRuleStructType3819);
            iv_ruleStructType=ruleStructType();

            state._fsp--;

             current =iv_ruleStructType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructType3830); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1714:1: ruleStructType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' ) | (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1717:28: ( ( (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' ) | (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1718:1: ( (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' ) | (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1718:1: ( (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' ) | (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==32) ) {
                alt57=1;
            }
            else if ( (LA57_0==38) ) {
                alt57=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1718:2: (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1718:2: (kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1719:2: kw= '{' ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )? kw= '}'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleStructType3869); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_0_0()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1724:1: ( (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )* )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==RULE_VAR_TYPE||(LA52_0>=RULE_INTEGER && LA52_0<=RULE_INT)||(LA52_0>=40 && LA52_0<=51)) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1724:2: (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1724:2: (this_VAR_TYPE_1= RULE_VAR_TYPE | this_B_TYPE_2= ruleB_TYPE )
                            int alt49=2;
                            int LA49_0 = input.LA(1);

                            if ( (LA49_0==RULE_VAR_TYPE) ) {
                                alt49=1;
                            }
                            else if ( ((LA49_0>=RULE_INTEGER && LA49_0<=RULE_INT)||(LA49_0>=40 && LA49_0<=51)) ) {
                                alt49=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 49, 0, input);

                                throw nvae;
                            }
                            switch (alt49) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1724:7: this_VAR_TYPE_1= RULE_VAR_TYPE
                                    {
                                    this_VAR_TYPE_1=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType3886); 

                                    		current.merge(this_VAR_TYPE_1);
                                        
                                     
                                        newLeafNode(this_VAR_TYPE_1, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_0_1_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1733:5: this_B_TYPE_2= ruleB_TYPE
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStructTypeAccess().getB_TYPEParserRuleCall_0_1_0_1()); 
                                        
                                    pushFollow(FOLLOW_ruleB_TYPE_in_ruleStructType3919);
                                    this_B_TYPE_2=ruleB_TYPE();

                                    state._fsp--;


                                    		current.merge(this_B_TYPE_2);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1743:2: (kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE ) )*
                            loop51:
                            do {
                                int alt51=2;
                                int LA51_0 = input.LA(1);

                                if ( (LA51_0==23) ) {
                                    alt51=1;
                                }


                                switch (alt51) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1744:2: kw= ',' (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE )
                            	    {
                            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleStructType3939); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getStructTypeAccess().getCommaKeyword_0_1_1_0()); 
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1749:1: (this_VAR_TYPE_4= RULE_VAR_TYPE | this_B_TYPE_5= ruleB_TYPE )
                            	    int alt50=2;
                            	    int LA50_0 = input.LA(1);

                            	    if ( (LA50_0==RULE_VAR_TYPE) ) {
                            	        alt50=1;
                            	    }
                            	    else if ( ((LA50_0>=RULE_INTEGER && LA50_0<=RULE_INT)||(LA50_0>=40 && LA50_0<=51)) ) {
                            	        alt50=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 50, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt50) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1749:6: this_VAR_TYPE_4= RULE_VAR_TYPE
                            	            {
                            	            this_VAR_TYPE_4=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType3955); 

                            	            		current.merge(this_VAR_TYPE_4);
                            	                
                            	             
                            	                newLeafNode(this_VAR_TYPE_4, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_0_1_1_1_0()); 
                            	                

                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1758:5: this_B_TYPE_5= ruleB_TYPE
                            	            {
                            	             
                            	                    newCompositeNode(grammarAccess.getStructTypeAccess().getB_TYPEParserRuleCall_0_1_1_1_1()); 
                            	                
                            	            pushFollow(FOLLOW_ruleB_TYPE_in_ruleStructType3988);
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
                            	    break loop51;
                                }
                            } while (true);


                            }
                            break;

                    }

                    kw=(Token)match(input,33,FOLLOW_33_in_ruleStructType4011); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_0_2()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1775:6: (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1775:6: (kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1776:2: kw= '<' kw= '{' ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )? kw= '}' kw= '>'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleStructType4032); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLessThanSignKeyword_1_0()); 
                        
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleStructType4045); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getLeftCurlyBracketKeyword_1_1()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1787:1: ( (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )* )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==RULE_VAR_TYPE||(LA56_0>=RULE_INTEGER && LA56_0<=RULE_INT)||(LA56_0>=40 && LA56_0<=51)) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1787:2: (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE ) (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1787:2: (this_VAR_TYPE_9= RULE_VAR_TYPE | this_B_TYPE_10= ruleB_TYPE )
                            int alt53=2;
                            int LA53_0 = input.LA(1);

                            if ( (LA53_0==RULE_VAR_TYPE) ) {
                                alt53=1;
                            }
                            else if ( ((LA53_0>=RULE_INTEGER && LA53_0<=RULE_INT)||(LA53_0>=40 && LA53_0<=51)) ) {
                                alt53=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 53, 0, input);

                                throw nvae;
                            }
                            switch (alt53) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1787:7: this_VAR_TYPE_9= RULE_VAR_TYPE
                                    {
                                    this_VAR_TYPE_9=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType4062); 

                                    		current.merge(this_VAR_TYPE_9);
                                        
                                     
                                        newLeafNode(this_VAR_TYPE_9, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_1_2_0_0()); 
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1796:5: this_B_TYPE_10= ruleB_TYPE
                                    {
                                     
                                            newCompositeNode(grammarAccess.getStructTypeAccess().getB_TYPEParserRuleCall_1_2_0_1()); 
                                        
                                    pushFollow(FOLLOW_ruleB_TYPE_in_ruleStructType4095);
                                    this_B_TYPE_10=ruleB_TYPE();

                                    state._fsp--;


                                    		current.merge(this_B_TYPE_10);
                                        
                                     
                                            afterParserOrEnumRuleCall();
                                        

                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1806:2: (kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE ) )*
                            loop55:
                            do {
                                int alt55=2;
                                int LA55_0 = input.LA(1);

                                if ( (LA55_0==23) ) {
                                    alt55=1;
                                }


                                switch (alt55) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1807:2: kw= ',' (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE )
                            	    {
                            	    kw=(Token)match(input,23,FOLLOW_23_in_ruleStructType4115); 

                            	            current.merge(kw);
                            	            newLeafNode(kw, grammarAccess.getStructTypeAccess().getCommaKeyword_1_2_1_0()); 
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1812:1: (this_VAR_TYPE_12= RULE_VAR_TYPE | this_B_TYPE_13= ruleB_TYPE )
                            	    int alt54=2;
                            	    int LA54_0 = input.LA(1);

                            	    if ( (LA54_0==RULE_VAR_TYPE) ) {
                            	        alt54=1;
                            	    }
                            	    else if ( ((LA54_0>=RULE_INTEGER && LA54_0<=RULE_INT)||(LA54_0>=40 && LA54_0<=51)) ) {
                            	        alt54=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 54, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt54) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1812:6: this_VAR_TYPE_12= RULE_VAR_TYPE
                            	            {
                            	            this_VAR_TYPE_12=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleStructType4131); 

                            	            		current.merge(this_VAR_TYPE_12);
                            	                
                            	             
                            	                newLeafNode(this_VAR_TYPE_12, grammarAccess.getStructTypeAccess().getVAR_TYPETerminalRuleCall_1_2_1_1_0()); 
                            	                

                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1821:5: this_B_TYPE_13= ruleB_TYPE
                            	            {
                            	             
                            	                    newCompositeNode(grammarAccess.getStructTypeAccess().getB_TYPEParserRuleCall_1_2_1_1_1()); 
                            	                
                            	            pushFollow(FOLLOW_ruleB_TYPE_in_ruleStructType4164);
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
                            	    break loop55;
                                }
                            } while (true);


                            }
                            break;

                    }

                    kw=(Token)match(input,33,FOLLOW_33_in_ruleStructType4187); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getStructTypeAccess().getRightCurlyBracketKeyword_1_3()); 
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleStructType4200); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1851:1: entryRuleB_TYPE returns [String current=null] : iv_ruleB_TYPE= ruleB_TYPE EOF ;
    public final String entryRuleB_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleB_TYPE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1852:2: (iv_ruleB_TYPE= ruleB_TYPE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1853:2: iv_ruleB_TYPE= ruleB_TYPE EOF
            {
             newCompositeNode(grammarAccess.getB_TYPERule()); 
            pushFollow(FOLLOW_ruleB_TYPE_in_entryRuleB_TYPE4242);
            iv_ruleB_TYPE=ruleB_TYPE();

            state._fsp--;

             current =iv_ruleB_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleB_TYPE4253); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1860:1: ruleB_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INTEGER_0= RULE_INTEGER | this_F_POINT_1= ruleF_POINT | this_BASIC_TYPE_2= ruleBASIC_TYPE | this_INT_3= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleB_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INTEGER_0=null;
        Token this_INT_3=null;
        AntlrDatatypeRuleToken this_F_POINT_1 = null;

        AntlrDatatypeRuleToken this_BASIC_TYPE_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1863:28: ( (this_INTEGER_0= RULE_INTEGER | this_F_POINT_1= ruleF_POINT | this_BASIC_TYPE_2= ruleBASIC_TYPE | this_INT_3= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1864:1: (this_INTEGER_0= RULE_INTEGER | this_F_POINT_1= ruleF_POINT | this_BASIC_TYPE_2= ruleBASIC_TYPE | this_INT_3= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1864:1: (this_INTEGER_0= RULE_INTEGER | this_F_POINT_1= ruleF_POINT | this_BASIC_TYPE_2= ruleBASIC_TYPE | this_INT_3= RULE_INT )
            int alt58=4;
            switch ( input.LA(1) ) {
            case RULE_INTEGER:
                {
                alt58=1;
                }
                break;
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt58=2;
                }
                break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
                {
                alt58=3;
                }
                break;
            case RULE_INT:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1864:6: this_INTEGER_0= RULE_INTEGER
                    {
                    this_INTEGER_0=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleB_TYPE4293); 

                    		current.merge(this_INTEGER_0);
                        
                     
                        newLeafNode(this_INTEGER_0, grammarAccess.getB_TYPEAccess().getINTEGERTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1873:5: this_F_POINT_1= ruleF_POINT
                    {
                     
                            newCompositeNode(grammarAccess.getB_TYPEAccess().getF_POINTParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleF_POINT_in_ruleB_TYPE4326);
                    this_F_POINT_1=ruleF_POINT();

                    state._fsp--;


                    		current.merge(this_F_POINT_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1885:5: this_BASIC_TYPE_2= ruleBASIC_TYPE
                    {
                     
                            newCompositeNode(grammarAccess.getB_TYPEAccess().getBASIC_TYPEParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleBASIC_TYPE_in_ruleB_TYPE4359);
                    this_BASIC_TYPE_2=ruleBASIC_TYPE();

                    state._fsp--;


                    		current.merge(this_BASIC_TYPE_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1896:10: this_INT_3= RULE_INT
                    {
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleB_TYPE4385); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1911:1: entryRuleBASIC_TYPE returns [String current=null] : iv_ruleBASIC_TYPE= ruleBASIC_TYPE EOF ;
    public final String entryRuleBASIC_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBASIC_TYPE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1912:2: (iv_ruleBASIC_TYPE= ruleBASIC_TYPE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1913:2: iv_ruleBASIC_TYPE= ruleBASIC_TYPE EOF
            {
             newCompositeNode(grammarAccess.getBASIC_TYPERule()); 
            pushFollow(FOLLOW_ruleBASIC_TYPE_in_entryRuleBASIC_TYPE4431);
            iv_ruleBASIC_TYPE=ruleBASIC_TYPE();

            state._fsp--;

             current =iv_ruleBASIC_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBASIC_TYPE4442); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1920:1: ruleBASIC_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBASIC_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1923:28: ( (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1924:1: (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1924:1: (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' )
            int alt59=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt59=1;
                }
                break;
            case 41:
                {
                alt59=2;
                }
                break;
            case 42:
                {
                alt59=3;
                }
                break;
            case 43:
                {
                alt59=4;
                }
                break;
            case 44:
                {
                alt59=5;
                }
                break;
            case 45:
                {
                alt59=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1925:2: kw= 'void'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleBASIC_TYPE4480); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getVoidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1932:2: kw= 'null'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleBASIC_TYPE4499); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getNullKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1939:2: kw= 'label'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleBASIC_TYPE4518); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getLabelKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1946:2: kw= 'undef'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleBASIC_TYPE4537); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getUndefKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1953:2: kw= 'true'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleBASIC_TYPE4556); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBASIC_TYPEAccess().getTrueKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1960:2: kw= 'false'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleBASIC_TYPE4575); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1973:1: entryRuleF_POINT returns [String current=null] : iv_ruleF_POINT= ruleF_POINT EOF ;
    public final String entryRuleF_POINT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleF_POINT = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1974:2: (iv_ruleF_POINT= ruleF_POINT EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1975:2: iv_ruleF_POINT= ruleF_POINT EOF
            {
             newCompositeNode(grammarAccess.getF_POINTRule()); 
            pushFollow(FOLLOW_ruleF_POINT_in_entryRuleF_POINT4616);
            iv_ruleF_POINT=ruleF_POINT();

            state._fsp--;

             current =iv_ruleF_POINT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleF_POINT4627); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1982:1: ruleF_POINT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' ) ;
    public final AntlrDatatypeRuleToken ruleF_POINT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1985:28: ( (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1986:1: (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1986:1: (kw= 'half' | kw= 'float' | kw= 'double' | kw= 'x86_fp80' | kw= 'fp128' | kw= 'ppc_fp128' )
            int alt60=6;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt60=1;
                }
                break;
            case 47:
                {
                alt60=2;
                }
                break;
            case 48:
                {
                alt60=3;
                }
                break;
            case 49:
                {
                alt60=4;
                }
                break;
            case 50:
                {
                alt60=5;
                }
                break;
            case 51:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1987:2: kw= 'half'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleF_POINT4665); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getHalfKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1994:2: kw= 'float'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleF_POINT4684); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getFloatKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2001:2: kw= 'double'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleF_POINT4703); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getDoubleKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2008:2: kw= 'x86_fp80'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleF_POINT4722); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getX86_fp80Keyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2015:2: kw= 'fp128'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleF_POINT4741); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_POINTAccess().getFp128Keyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2022:2: kw= 'ppc_fp128'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleF_POINT4760); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2035:1: entryRuleGetElementPtr returns [EObject current=null] : iv_ruleGetElementPtr= ruleGetElementPtr EOF ;
    public final EObject entryRuleGetElementPtr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetElementPtr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2036:2: (iv_ruleGetElementPtr= ruleGetElementPtr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2037:2: iv_ruleGetElementPtr= ruleGetElementPtr EOF
            {
             newCompositeNode(grammarAccess.getGetElementPtrRule()); 
            pushFollow(FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr4800);
            iv_ruleGetElementPtr=ruleGetElementPtr();

            state._fsp--;

             current =iv_ruleGetElementPtr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetElementPtr4810); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2044:1: ruleGetElementPtr returns [EObject current=null] : (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* ) ;
    public final EObject ruleGetElementPtr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_pointer_2_0 = null;

        EObject lv_params_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2047:28: ( (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2048:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2048:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2048:3: otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_pointer_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleGetElementPtr4847); 

                	newLeafNode(otherlv_0, grammarAccess.getGetElementPtrAccess().getGetelementptrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2052:1: (otherlv_1= 'inbounds' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==53) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2052:3: otherlv_1= 'inbounds'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleGetElementPtr4860); 

                        	newLeafNode(otherlv_1, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2056:3: ( (lv_pointer_2_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2057:1: (lv_pointer_2_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2057:1: (lv_pointer_2_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2058:3: lv_pointer_2_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getPointerTypeAndValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr4883);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2074:2: (otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==23) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2074:4: otherlv_3= ',' ( (lv_params_4_0= ruleTypeAndValue ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleGetElementPtr4896); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGetElementPtrAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2078:1: ( (lv_params_4_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2079:1: (lv_params_4_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2079:1: (lv_params_4_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2080:3: lv_params_4_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getParamsTypeAndValueParserRuleCall_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr4917);
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
            	    break loop62;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2104:1: entryRuleExtractValue returns [EObject current=null] : iv_ruleExtractValue= ruleExtractValue EOF ;
    public final EObject entryRuleExtractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2105:2: (iv_ruleExtractValue= ruleExtractValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2106:2: iv_ruleExtractValue= ruleExtractValue EOF
            {
             newCompositeNode(grammarAccess.getExtractValueRule()); 
            pushFollow(FOLLOW_ruleExtractValue_in_entryRuleExtractValue4955);
            iv_ruleExtractValue=ruleExtractValue();

            state._fsp--;

             current =iv_ruleExtractValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractValue4965); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2113:1: ruleExtractValue returns [EObject current=null] : (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleExtractValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token lv_index_4_0=null;
        EObject lv_aggregate_1_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2116:28: ( (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2117:1: (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2117:1: (otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2117:3: otherlv_0= 'extractvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleExtractValue5002); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractValueAccess().getExtractvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2121:1: ( (lv_aggregate_1_0= ruleAggregate ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2122:1: (lv_aggregate_1_0= ruleAggregate )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2122:1: (lv_aggregate_1_0= ruleAggregate )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2123:3: lv_aggregate_1_0= ruleAggregate
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getAggregateAggregateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAggregate_in_ruleExtractValue5023);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2139:2: ( (lv_type_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2140:1: (lv_type_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2140:1: (lv_type_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2141:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleExtractValue5044);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2157:2: (otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) ) )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==23) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2157:4: otherlv_3= ',' ( (lv_index_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleExtractValue5057); 

            	        	newLeafNode(otherlv_3, grammarAccess.getExtractValueAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2161:1: ( (lv_index_4_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2162:1: (lv_index_4_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2162:1: (lv_index_4_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2163:3: lv_index_4_0= RULE_INT
            	    {
            	    lv_index_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExtractValue5074); 

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
            	    if ( cnt63 >= 1 ) break loop63;
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2187:1: entryRuleInsertValue returns [EObject current=null] : iv_ruleInsertValue= ruleInsertValue EOF ;
    public final EObject entryRuleInsertValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2188:2: (iv_ruleInsertValue= ruleInsertValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2189:2: iv_ruleInsertValue= ruleInsertValue EOF
            {
             newCompositeNode(grammarAccess.getInsertValueRule()); 
            pushFollow(FOLLOW_ruleInsertValue_in_entryRuleInsertValue5117);
            iv_ruleInsertValue=ruleInsertValue();

            state._fsp--;

             current =iv_ruleInsertValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertValue5127); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2196:1: ruleInsertValue returns [EObject current=null] : (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+ ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2199:28: ( (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2200:1: (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2200:1: (otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2200:3: otherlv_0= 'insertvalue' ( (lv_aggregate_1_0= ruleAggregate ) ) ( (lv_type_2_0= ruleType ) ) otherlv_3= ',' ( (lv_value_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleInsertValue5164); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertValueAccess().getInsertvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2204:1: ( (lv_aggregate_1_0= ruleAggregate ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2205:1: (lv_aggregate_1_0= ruleAggregate )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2205:1: (lv_aggregate_1_0= ruleAggregate )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2206:3: lv_aggregate_1_0= ruleAggregate
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getAggregateAggregateParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAggregate_in_ruleInsertValue5185);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2222:2: ( (lv_type_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2223:1: (lv_type_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2223:1: (lv_type_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2224:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertValue5206);
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleInsertValue5218); 

                	newLeafNode(otherlv_3, grammarAccess.getInsertValueAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2244:1: ( (lv_value_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2245:1: (lv_value_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2245:1: (lv_value_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2246:3: lv_value_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getValueTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertValue5239);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2262:2: (otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==23) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2262:4: otherlv_5= ',' ( (lv_index_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleInsertValue5252); 

            	        	newLeafNode(otherlv_5, grammarAccess.getInsertValueAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2266:1: ( (lv_index_6_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2267:1: (lv_index_6_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2267:1: (lv_index_6_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2268:3: lv_index_6_0= RULE_INT
            	    {
            	    lv_index_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInsertValue5269); 

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
            	    if ( cnt64 >= 1 ) break loop64;
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2292:1: entryRuleFence returns [EObject current=null] : iv_ruleFence= ruleFence EOF ;
    public final EObject entryRuleFence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFence = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2293:2: (iv_ruleFence= ruleFence EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2294:2: iv_ruleFence= ruleFence EOF
            {
             newCompositeNode(grammarAccess.getFenceRule()); 
            pushFollow(FOLLOW_ruleFence_in_entryRuleFence5312);
            iv_ruleFence=ruleFence();

            state._fsp--;

             current =iv_ruleFence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFence5322); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2301:1: ruleFence returns [EObject current=null] : (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) ) ;
    public final EObject ruleFence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ordering_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2304:28: ( (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2305:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2305:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2305:3: otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleFence5359); 

                	newLeafNode(otherlv_0, grammarAccess.getFenceAccess().getFenceKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2309:1: (otherlv_1= 'singlethread' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==57) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2309:3: otherlv_1= 'singlethread'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleFence5372); 

                        	newLeafNode(otherlv_1, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2313:3: ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2314:1: (lv_ordering_2_0= ruleATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2314:1: (lv_ordering_2_0= ruleATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2315:3: lv_ordering_2_0= ruleATOMIC_ORDERING
            {
             
            	        newCompositeNode(grammarAccess.getFenceAccess().getOrderingATOMIC_ORDERINGParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleFence5395);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2339:1: entryRuleATOMIC_ORDERING returns [String current=null] : iv_ruleATOMIC_ORDERING= ruleATOMIC_ORDERING EOF ;
    public final String entryRuleATOMIC_ORDERING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATOMIC_ORDERING = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2340:2: (iv_ruleATOMIC_ORDERING= ruleATOMIC_ORDERING EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2341:2: iv_ruleATOMIC_ORDERING= ruleATOMIC_ORDERING EOF
            {
             newCompositeNode(grammarAccess.getATOMIC_ORDERINGRule()); 
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_entryRuleATOMIC_ORDERING5432);
            iv_ruleATOMIC_ORDERING=ruleATOMIC_ORDERING();

            state._fsp--;

             current =iv_ruleATOMIC_ORDERING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATOMIC_ORDERING5443); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2348:1: ruleATOMIC_ORDERING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) ;
    public final AntlrDatatypeRuleToken ruleATOMIC_ORDERING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2351:28: ( (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2352:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2352:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            int alt66=6;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt66=1;
                }
                break;
            case 59:
                {
                alt66=2;
                }
                break;
            case 60:
                {
                alt66=3;
                }
                break;
            case 61:
                {
                alt66=4;
                }
                break;
            case 62:
                {
                alt66=5;
                }
                break;
            case 63:
                {
                alt66=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2353:2: kw= 'unordered'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleATOMIC_ORDERING5481); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getUnorderedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2360:2: kw= 'monotonic'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleATOMIC_ORDERING5500); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getMonotonicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2367:2: kw= 'aquire'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleATOMIC_ORDERING5519); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getAquireKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2374:2: kw= 'release'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleATOMIC_ORDERING5538); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getReleaseKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2381:2: kw= 'acq_rel'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleATOMIC_ORDERING5557); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getAcq_relKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2388:2: kw= 'seq_cst'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleATOMIC_ORDERING5576); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2401:1: entryRuleCmpXchg returns [EObject current=null] : iv_ruleCmpXchg= ruleCmpXchg EOF ;
    public final EObject entryRuleCmpXchg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpXchg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2402:2: (iv_ruleCmpXchg= ruleCmpXchg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2403:2: iv_ruleCmpXchg= ruleCmpXchg EOF
            {
             newCompositeNode(grammarAccess.getCmpXchgRule()); 
            pushFollow(FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg5616);
            iv_ruleCmpXchg=ruleCmpXchg();

            state._fsp--;

             current =iv_ruleCmpXchg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmpXchg5626); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2410:1: ruleCmpXchg returns [EObject current=null] : (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2413:28: ( (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2414:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2414:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2414:3: otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_compare_val_4_0= ruleTypeAndValue ) ) otherlv_5= ',' ( (lv_new_val_6_0= ruleTypeAndValue ) ) (otherlv_7= 'singlethread' )? ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleCmpXchg5663); 

                	newLeafNode(otherlv_0, grammarAccess.getCmpXchgAccess().getCmpxchgKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2418:1: (otherlv_1= 'volatile' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==36) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2418:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleCmpXchg5676); 

                        	newLeafNode(otherlv_1, grammarAccess.getCmpXchgAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2422:3: ( (lv_adress_2_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2423:1: (lv_adress_2_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2423:1: (lv_adress_2_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2424:3: lv_adress_2_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getAdressTypeAndValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg5699);
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

            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleCmpXchg5711); 

                	newLeafNode(otherlv_3, grammarAccess.getCmpXchgAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2444:1: ( (lv_compare_val_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2445:1: (lv_compare_val_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2445:1: (lv_compare_val_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2446:3: lv_compare_val_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getCompare_valTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg5732);
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

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleCmpXchg5744); 

                	newLeafNode(otherlv_5, grammarAccess.getCmpXchgAccess().getCommaKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2466:1: ( (lv_new_val_6_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2467:1: (lv_new_val_6_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2467:1: (lv_new_val_6_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2468:3: lv_new_val_6_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getNew_valTypeAndValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCmpXchg5765);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2484:2: (otherlv_7= 'singlethread' )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==57) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2484:4: otherlv_7= 'singlethread'
                    {
                    otherlv_7=(Token)match(input,57,FOLLOW_57_in_ruleCmpXchg5778); 

                        	newLeafNode(otherlv_7, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_7());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2488:3: ( (lv_ordering_8_0= ruleATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2489:1: (lv_ordering_8_0= ruleATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2489:1: (lv_ordering_8_0= ruleATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2490:3: lv_ordering_8_0= ruleATOMIC_ORDERING
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getOrderingATOMIC_ORDERINGParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleCmpXchg5801);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2514:1: entryRuleAtomicRMW returns [EObject current=null] : iv_ruleAtomicRMW= ruleAtomicRMW EOF ;
    public final EObject entryRuleAtomicRMW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRMW = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2515:2: (iv_ruleAtomicRMW= ruleAtomicRMW EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2516:2: iv_ruleAtomicRMW= ruleAtomicRMW EOF
            {
             newCompositeNode(grammarAccess.getAtomicRMWRule()); 
            pushFollow(FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW5837);
            iv_ruleAtomicRMW=ruleAtomicRMW();

            state._fsp--;

             current =iv_ruleAtomicRMW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRMW5847); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2523:1: ruleAtomicRMW returns [EObject current=null] : (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2526:28: ( (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2527:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2527:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2527:3: otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adress_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_value_5_0= ruleTypeAndValue ) ) (otherlv_6= 'singlethread' )? ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_65_in_ruleAtomicRMW5884); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRMWAccess().getAtomicrmwKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2531:1: (otherlv_1= 'volatile' )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==36) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2531:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleAtomicRMW5897); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicRMWAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getAtomicRMWAccess().getBIN_OPParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleBIN_OP_in_ruleAtomicRMW5915);
            ruleBIN_OP();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2543:1: ( (lv_adress_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2544:1: (lv_adress_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2544:1: (lv_adress_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2545:3: lv_adress_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getAdressTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW5935);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleAtomicRMW5947); 

                	newLeafNode(otherlv_4, grammarAccess.getAtomicRMWAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2565:1: ( (lv_value_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2566:1: (lv_value_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2566:1: (lv_value_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2567:3: lv_value_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getValueTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW5968);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2583:2: (otherlv_6= 'singlethread' )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==57) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2583:4: otherlv_6= 'singlethread'
                    {
                    otherlv_6=(Token)match(input,57,FOLLOW_57_in_ruleAtomicRMW5981); 

                        	newLeafNode(otherlv_6, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_6());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2587:3: ( (lv_ordering_7_0= ruleATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2588:1: (lv_ordering_7_0= ruleATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2588:1: (lv_ordering_7_0= ruleATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2589:3: lv_ordering_7_0= ruleATOMIC_ORDERING
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getOrderingATOMIC_ORDERINGParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleAtomicRMW6004);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2613:1: entryRuleBIN_OP returns [String current=null] : iv_ruleBIN_OP= ruleBIN_OP EOF ;
    public final String entryRuleBIN_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBIN_OP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2614:2: (iv_ruleBIN_OP= ruleBIN_OP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2615:2: iv_ruleBIN_OP= ruleBIN_OP EOF
            {
             newCompositeNode(grammarAccess.getBIN_OPRule()); 
            pushFollow(FOLLOW_ruleBIN_OP_in_entryRuleBIN_OP6041);
            iv_ruleBIN_OP=ruleBIN_OP();

            state._fsp--;

             current =iv_ruleBIN_OP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBIN_OP6052); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2622:1: ruleBIN_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) ;
    public final AntlrDatatypeRuleToken ruleBIN_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2625:28: ( (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2626:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2626:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            int alt71=11;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt71=1;
                }
                break;
            case 67:
                {
                alt71=2;
                }
                break;
            case 68:
                {
                alt71=3;
                }
                break;
            case 69:
                {
                alt71=4;
                }
                break;
            case 70:
                {
                alt71=5;
                }
                break;
            case 71:
                {
                alt71=6;
                }
                break;
            case 72:
                {
                alt71=7;
                }
                break;
            case 73:
                {
                alt71=8;
                }
                break;
            case 74:
                {
                alt71=9;
                }
                break;
            case 75:
                {
                alt71=10;
                }
                break;
            case 76:
                {
                alt71=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2627:2: kw= 'xchg'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleBIN_OP6090); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getXchgKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2634:2: kw= 'add'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleBIN_OP6109); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getAddKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2641:2: kw= 'sub'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleBIN_OP6128); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getSubKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2648:2: kw= 'and'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleBIN_OP6147); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getAndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2655:2: kw= 'nand'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleBIN_OP6166); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getNandKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2662:2: kw= 'or'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleBIN_OP6185); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getOrKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2669:2: kw= 'xor'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleBIN_OP6204); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getXorKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2676:2: kw= 'max'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleBIN_OP6223); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getMaxKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2683:2: kw= 'min'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleBIN_OP6242); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getMinKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2690:2: kw= 'umax'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleBIN_OP6261); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getUmaxKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2697:2: kw= 'umin'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleBIN_OP6280); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2710:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2711:2: (iv_ruleLoad= ruleLoad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2712:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_ruleLoad_in_entryRuleLoad6320);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoad6330); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2719:1: ruleLoad returns [EObject current=null] : ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2722:28: ( ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2723:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2723:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? ) )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==77) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==RULE_VAR_TYPE||(LA79_1>=RULE_INTEGER && LA79_1<=RULE_INT)||LA79_1==32||LA79_1==36||(LA79_1>=40 && LA79_1<=51)) ) {
                    alt79=1;
                }
                else if ( (LA79_1==78) ) {
                    alt79=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2723:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2723:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2723:4: otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adress_2_0= ruleTypeAndValue ) ) (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    {
                    otherlv_0=(Token)match(input,77,FOLLOW_77_in_ruleLoad6368); 

                        	newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2727:1: (otherlv_1= 'volatile' )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==36) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2727:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleLoad6381); 

                                	newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2731:3: ( (lv_adress_2_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2732:1: (lv_adress_2_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2732:1: (lv_adress_2_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2733:3: lv_adress_2_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeAndValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLoad6404);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2749:2: (otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==23) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2749:4: otherlv_3= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    {
                    	    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleLoad6417); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getCommaKeyword_0_3_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2753:1: ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    int alt74=2;
                    	    int LA74_0 = input.LA(1);

                    	    if ( (LA74_0==79) ) {
                    	        alt74=1;
                    	    }
                    	    else if ( (LA74_0==193||LA74_0==214) ) {
                    	        alt74=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 74, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt74) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2754:5: ruleALIGNMENT
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getLoadAccess().getALIGNMENTParserRuleCall_0_3_1_0()); 
                    	                
                    	            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleLoad6434);
                    	            ruleALIGNMENT();

                    	            state._fsp--;

                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2762:6: ( ruleMetadataValue )+
                    	            {
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2762:6: ( ruleMetadataValue )+
                    	            int cnt73=0;
                    	            loop73:
                    	            do {
                    	                int alt73=2;
                    	                int LA73_0 = input.LA(1);

                    	                if ( (LA73_0==193||LA73_0==214) ) {
                    	                    alt73=1;
                    	                }


                    	                switch (alt73) {
                    	            	case 1 :
                    	            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2763:5: ruleMetadataValue
                    	            	    {
                    	            	     
                    	            	            newCompositeNode(grammarAccess.getLoadAccess().getMetadataValueParserRuleCall_0_3_1_1()); 
                    	            	        
                    	            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleLoad6456);
                    	            	    ruleMetadataValue();

                    	            	    state._fsp--;

                    	            	     
                    	            	            afterParserOrEnumRuleCall();
                    	            	        

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt73 >= 1 ) break loop73;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(73, input);
                    	                        throw eee;
                    	                }
                    	                cnt73++;
                    	            } while (true);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2771:6: (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2771:6: (otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2771:8: otherlv_6= 'load' otherlv_7= 'atomic' (otherlv_8= 'volatile' )? ( (lv_adress_9_0= ruleTypeAndValue ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )?
                    {
                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleLoad6480); 

                        	newLeafNode(otherlv_6, grammarAccess.getLoadAccess().getLoadKeyword_1_0());
                        
                    otherlv_7=(Token)match(input,78,FOLLOW_78_in_ruleLoad6492); 

                        	newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2779:1: (otherlv_8= 'volatile' )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==36) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2779:3: otherlv_8= 'volatile'
                            {
                            otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleLoad6505); 

                                	newLeafNode(otherlv_8, grammarAccess.getLoadAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2783:3: ( (lv_adress_9_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2784:1: (lv_adress_9_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2784:1: (lv_adress_9_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2785:3: lv_adress_9_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLoad6528);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2801:2: (otherlv_10= 'singlethread' )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==57) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2801:4: otherlv_10= 'singlethread'
                            {
                            otherlv_10=(Token)match(input,57,FOLLOW_57_in_ruleLoad6541); 

                                	newLeafNode(otherlv_10, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_4());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2805:3: ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2806:1: (lv_ordering_11_0= ruleATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2806:1: (lv_ordering_11_0= ruleATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2807:3: lv_ordering_11_0= ruleATOMIC_ORDERING
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getOrderingATOMIC_ORDERINGParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleLoad6564);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2823:2: (otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) ) )?
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==23) ) {
                        alt78=1;
                    }
                    switch (alt78) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2823:4: otherlv_12= ',' otherlv_13= 'align' ( (lv_index_14_0= RULE_INT ) )
                            {
                            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleLoad6577); 

                                	newLeafNode(otherlv_12, grammarAccess.getLoadAccess().getCommaKeyword_1_6_0());
                                
                            otherlv_13=(Token)match(input,79,FOLLOW_79_in_ruleLoad6589); 

                                	newLeafNode(otherlv_13, grammarAccess.getLoadAccess().getAlignKeyword_1_6_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2831:1: ( (lv_index_14_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2832:1: (lv_index_14_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2832:1: (lv_index_14_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2833:3: lv_index_14_0= RULE_INT
                            {
                            lv_index_14_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoad6606); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2857:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2858:2: (iv_ruleStore= ruleStore EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2859:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore6650);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore6660); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2866:1: ruleStore returns [EObject current=null] : ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2869:28: ( ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2870:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2870:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==80) ) {
                int LA87_1 = input.LA(2);

                if ( (LA87_1==RULE_VAR_TYPE||(LA87_1>=RULE_INTEGER && LA87_1<=RULE_INT)||LA87_1==32||LA87_1==36||(LA87_1>=40 && LA87_1<=51)) ) {
                    alt87=1;
                }
                else if ( (LA87_1==78) ) {
                    alt87=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 87, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2870:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2870:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2870:4: otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_value_2_0= ruleTypeAndValue ) ) otherlv_3= ',' ( (lv_adress_4_0= ruleTypeAndValue ) ) (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    {
                    otherlv_0=(Token)match(input,80,FOLLOW_80_in_ruleStore6698); 

                        	newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2874:1: (otherlv_1= 'volatile' )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==36) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2874:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleStore6711); 

                                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2878:3: ( (lv_value_2_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2879:1: (lv_value_2_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2879:1: (lv_value_2_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2880:3: lv_value_2_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueTypeAndValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore6734);
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

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleStore6746); 

                        	newLeafNode(otherlv_3, grammarAccess.getStoreAccess().getCommaKeyword_0_3());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2900:1: ( (lv_adress_4_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2901:1: (lv_adress_4_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2901:1: (lv_adress_4_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2902:3: lv_adress_4_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeAndValueParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore6767);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2918:2: (otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    loop83:
                    do {
                        int alt83=2;
                        int LA83_0 = input.LA(1);

                        if ( (LA83_0==23) ) {
                            alt83=1;
                        }


                        switch (alt83) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2918:4: otherlv_5= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    {
                    	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleStore6780); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getCommaKeyword_0_5_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2922:1: ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    int alt82=2;
                    	    int LA82_0 = input.LA(1);

                    	    if ( (LA82_0==79) ) {
                    	        alt82=1;
                    	    }
                    	    else if ( (LA82_0==193||LA82_0==214) ) {
                    	        alt82=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 82, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt82) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2923:5: ruleALIGNMENT
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getStoreAccess().getALIGNMENTParserRuleCall_0_5_1_0()); 
                    	                
                    	            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleStore6797);
                    	            ruleALIGNMENT();

                    	            state._fsp--;

                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2931:6: ( ruleMetadataValue )+
                    	            {
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2931:6: ( ruleMetadataValue )+
                    	            int cnt81=0;
                    	            loop81:
                    	            do {
                    	                int alt81=2;
                    	                int LA81_0 = input.LA(1);

                    	                if ( (LA81_0==193||LA81_0==214) ) {
                    	                    alt81=1;
                    	                }


                    	                switch (alt81) {
                    	            	case 1 :
                    	            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2932:5: ruleMetadataValue
                    	            	    {
                    	            	     
                    	            	            newCompositeNode(grammarAccess.getStoreAccess().getMetadataValueParserRuleCall_0_5_1_1()); 
                    	            	        
                    	            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleStore6819);
                    	            	    ruleMetadataValue();

                    	            	    state._fsp--;

                    	            	     
                    	            	            afterParserOrEnumRuleCall();
                    	            	        

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt81 >= 1 ) break loop81;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(81, input);
                    	                        throw eee;
                    	                }
                    	                cnt81++;
                    	            } while (true);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop83;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2940:6: (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2940:6: (otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2940:8: otherlv_8= 'store' otherlv_9= 'atomic' (otherlv_10= 'volatile' )? ( (lv_value_11_0= ruleTypeAndValue ) ) otherlv_12= ',' ( (lv_adress_13_0= ruleTypeAndValue ) ) (otherlv_14= 'singlethread' )? ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) ) (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )?
                    {
                    otherlv_8=(Token)match(input,80,FOLLOW_80_in_ruleStore6843); 

                        	newLeafNode(otherlv_8, grammarAccess.getStoreAccess().getStoreKeyword_1_0());
                        
                    otherlv_9=(Token)match(input,78,FOLLOW_78_in_ruleStore6855); 

                        	newLeafNode(otherlv_9, grammarAccess.getStoreAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2948:1: (otherlv_10= 'volatile' )?
                    int alt84=2;
                    int LA84_0 = input.LA(1);

                    if ( (LA84_0==36) ) {
                        alt84=1;
                    }
                    switch (alt84) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2948:3: otherlv_10= 'volatile'
                            {
                            otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleStore6868); 

                                	newLeafNode(otherlv_10, grammarAccess.getStoreAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2952:3: ( (lv_value_11_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2953:1: (lv_value_11_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2953:1: (lv_value_11_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2954:3: lv_value_11_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore6891);
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

                    otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleStore6903); 

                        	newLeafNode(otherlv_12, grammarAccess.getStoreAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2974:1: ( (lv_adress_13_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2975:1: (lv_adress_13_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2975:1: (lv_adress_13_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2976:3: lv_adress_13_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeAndValueParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleStore6924);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2992:2: (otherlv_14= 'singlethread' )?
                    int alt85=2;
                    int LA85_0 = input.LA(1);

                    if ( (LA85_0==57) ) {
                        alt85=1;
                    }
                    switch (alt85) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2992:4: otherlv_14= 'singlethread'
                            {
                            otherlv_14=(Token)match(input,57,FOLLOW_57_in_ruleStore6937); 

                                	newLeafNode(otherlv_14, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2996:3: ( (lv_ordering_15_0= ruleATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2997:1: (lv_ordering_15_0= ruleATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2997:1: (lv_ordering_15_0= ruleATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2998:3: lv_ordering_15_0= ruleATOMIC_ORDERING
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getOrderingATOMIC_ORDERINGParserRuleCall_1_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleStore6960);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3014:2: (otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) ) )?
                    int alt86=2;
                    int LA86_0 = input.LA(1);

                    if ( (LA86_0==23) ) {
                        alt86=1;
                    }
                    switch (alt86) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3014:4: otherlv_16= ',' otherlv_17= 'align' ( (lv_index_18_0= RULE_INT ) )
                            {
                            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleStore6973); 

                                	newLeafNode(otherlv_16, grammarAccess.getStoreAccess().getCommaKeyword_1_8_0());
                                
                            otherlv_17=(Token)match(input,79,FOLLOW_79_in_ruleStore6985); 

                                	newLeafNode(otherlv_17, grammarAccess.getStoreAccess().getAlignKeyword_1_8_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3022:1: ( (lv_index_18_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3023:1: (lv_index_18_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3023:1: (lv_index_18_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3024:3: lv_index_18_0= RULE_INT
                            {
                            lv_index_18_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStore7002); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3048:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3049:2: (iv_ruleCall= ruleCall EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3050:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall7046);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall7056); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3057:1: ruleCall returns [EObject current=null] : ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_pointer_4_0 = null;

        EObject lv_pList_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3060:28: ( ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3061:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3061:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3061:2: (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_pointer_4_0= ruleTypeAndValue ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3061:2: (otherlv_0= 'tail' )?
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==81) ) {
                alt88=1;
            }
            switch (alt88) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3061:4: otherlv_0= 'tail'
                    {
                    otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleCall7094); 

                        	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getTailKeyword_0());
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleCall7108); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getCallKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3069:1: ( ruleCallingConv )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( ((LA89_0>=92 && LA89_0<=106)) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3070:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getCallingConvParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleCall7125);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3077:3: ( ruleRETURN_ATTRIBUTES )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( ((LA90_0>=83 && LA90_0<=90)) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3078:5: ruleRETURN_ATTRIBUTES
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getRETURN_ATTRIBUTESParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleCall7143);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3085:3: ( (lv_pointer_4_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3086:1: (lv_pointer_4_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3086:1: (lv_pointer_4_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3087:3: lv_pointer_4_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPointerTypeAndValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCall7165);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3103:2: ( (lv_pList_5_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3104:1: (lv_pList_5_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3104:1: (lv_pList_5_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3105:3: lv_pList_5_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPListParameterListParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleCall7186);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3121:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( ((LA91_0>=107 && LA91_0<=124)) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3122:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall7203);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

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
    // $ANTLR end "ruleCall"


    // $ANTLR start "entryRuleRETURN_ATTRIBUTES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3137:1: entryRuleRETURN_ATTRIBUTES returns [String current=null] : iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF ;
    public final String entryRuleRETURN_ATTRIBUTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN_ATTRIBUTES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3138:2: (iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3139:2: iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF
            {
             newCompositeNode(grammarAccess.getRETURN_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES7241);
            iv_ruleRETURN_ATTRIBUTES=ruleRETURN_ATTRIBUTES();

            state._fsp--;

             current =iv_ruleRETURN_ATTRIBUTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES7252); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3146:1: ruleRETURN_ATTRIBUTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) ;
    public final AntlrDatatypeRuleToken ruleRETURN_ATTRIBUTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3149:28: ( (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3150:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3150:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            int alt92=8;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt92=1;
                }
                break;
            case 84:
                {
                alt92=2;
                }
                break;
            case 85:
                {
                alt92=3;
                }
                break;
            case 86:
                {
                alt92=4;
                }
                break;
            case 87:
                {
                alt92=5;
                }
                break;
            case 88:
                {
                alt92=6;
                }
                break;
            case 89:
                {
                alt92=7;
                }
                break;
            case 90:
                {
                alt92=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3151:2: kw= 'zeroext'
                    {
                    kw=(Token)match(input,83,FOLLOW_83_in_ruleRETURN_ATTRIBUTES7290); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getZeroextKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3158:2: kw= 'signext'
                    {
                    kw=(Token)match(input,84,FOLLOW_84_in_ruleRETURN_ATTRIBUTES7309); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getSignextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3165:2: kw= 'inreg'
                    {
                    kw=(Token)match(input,85,FOLLOW_85_in_ruleRETURN_ATTRIBUTES7328); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getInregKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3172:2: kw= 'byval'
                    {
                    kw=(Token)match(input,86,FOLLOW_86_in_ruleRETURN_ATTRIBUTES7347); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getByvalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3179:2: kw= 'sret'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleRETURN_ATTRIBUTES7366); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getSretKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3186:2: kw= 'noalias'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleRETURN_ATTRIBUTES7385); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getNoaliasKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3193:2: kw= 'nocapture'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleRETURN_ATTRIBUTES7404); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getNocaptureKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3200:2: kw= 'nest'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleRETURN_ATTRIBUTES7423); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3213:1: entryRuleAlloc returns [EObject current=null] : iv_ruleAlloc= ruleAlloc EOF ;
    public final EObject entryRuleAlloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlloc = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3214:2: (iv_ruleAlloc= ruleAlloc EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3215:2: iv_ruleAlloc= ruleAlloc EOF
            {
             newCompositeNode(grammarAccess.getAllocRule()); 
            pushFollow(FOLLOW_ruleAlloc_in_entryRuleAlloc7463);
            iv_ruleAlloc=ruleAlloc();

            state._fsp--;

             current =iv_ruleAlloc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlloc7473); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3222:1: ruleAlloc returns [EObject current=null] : (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )? ) ;
    public final EObject ruleAlloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        EObject lv_numElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3225:28: ( (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3226:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3226:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3226:3: otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )? (otherlv_4= ',' ruleALIGNMENT )?
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleAlloc7510); 

                	newLeafNode(otherlv_0, grammarAccess.getAllocAccess().getAllocaKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3230:1: ( (lv_type_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3231:1: (lv_type_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3231:1: (lv_type_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3232:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAllocAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlloc7531);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3248:2: (otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) ) )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==23) ) {
                int LA93_1 = input.LA(2);

                if ( (LA93_1==RULE_VAR_TYPE||(LA93_1>=RULE_INTEGER && LA93_1<=RULE_INT)||LA93_1==32||(LA93_1>=40 && LA93_1<=51)) ) {
                    alt93=1;
                }
            }
            switch (alt93) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3248:4: otherlv_2= ',' ( (lv_numElements_3_0= ruleTypeAndValue ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAlloc7544); 

                        	newLeafNode(otherlv_2, grammarAccess.getAllocAccess().getCommaKeyword_2_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3252:1: ( (lv_numElements_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3253:1: (lv_numElements_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3253:1: (lv_numElements_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3254:3: lv_numElements_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getNumElementsTypeAndValueParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleAlloc7565);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3270:4: (otherlv_4= ',' ruleALIGNMENT )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==23) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3270:6: otherlv_4= ',' ruleALIGNMENT
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleAlloc7580); 

                        	newLeafNode(otherlv_4, grammarAccess.getAllocAccess().getCommaKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getAllocAccess().getALIGNMENTParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleALIGNMENT_in_ruleAlloc7596);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3290:1: entryRuleCallingConv returns [String current=null] : iv_ruleCallingConv= ruleCallingConv EOF ;
    public final String entryRuleCallingConv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCallingConv = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3291:2: (iv_ruleCallingConv= ruleCallingConv EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3292:2: iv_ruleCallingConv= ruleCallingConv EOF
            {
             newCompositeNode(grammarAccess.getCallingConvRule()); 
            pushFollow(FOLLOW_ruleCallingConv_in_entryRuleCallingConv7634);
            iv_ruleCallingConv=ruleCallingConv();

            state._fsp--;

             current =iv_ruleCallingConv.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallingConv7645); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3299:1: ruleCallingConv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleCallingConv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_16=null;
        Token this_INT_18=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3302:28: ( (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3303:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3303:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) )
            int alt95=15;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt95=1;
                }
                break;
            case 93:
                {
                alt95=2;
                }
                break;
            case 94:
                {
                alt95=3;
                }
                break;
            case 95:
                {
                alt95=4;
                }
                break;
            case 96:
                {
                alt95=5;
                }
                break;
            case 97:
                {
                alt95=6;
                }
                break;
            case 98:
                {
                alt95=7;
                }
                break;
            case 99:
                {
                alt95=8;
                }
                break;
            case 100:
                {
                alt95=9;
                }
                break;
            case 101:
                {
                alt95=10;
                }
                break;
            case 102:
                {
                alt95=11;
                }
                break;
            case 103:
                {
                alt95=12;
                }
                break;
            case 104:
                {
                alt95=13;
                }
                break;
            case 105:
                {
                alt95=14;
                }
                break;
            case 106:
                {
                alt95=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3304:2: kw= 'ccc'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleCallingConv7683); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCccKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3311:2: kw= 'fastcc'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleCallingConv7702); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getFastccKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3318:2: kw= 'coldcc'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleCallingConv7721); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getColdccKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3325:2: kw= 'x86_stdcallcc'
                    {
                    kw=(Token)match(input,95,FOLLOW_95_in_ruleCallingConv7740); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_stdcallccKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3332:2: kw= 'x86_fastcallcc'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleCallingConv7759); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_fastcallccKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3339:2: kw= 'x86_thiscallcc'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleCallingConv7778); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_thiscallccKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3346:2: kw= 'arm_apcscc'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleCallingConv7797); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_apcsccKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3353:2: kw= 'arm_aapcscc'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleCallingConv7816); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcsccKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3360:2: kw= 'arm_aapcs_vfpcc'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleCallingConv7835); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcs_vfpccKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3367:2: kw= 'msp430_intrcc'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleCallingConv7854); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getMsp430_intrccKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3374:2: kw= 'ptx_kernel'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleCallingConv7873); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_kernelKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3381:2: kw= 'ptx_device'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleCallingConv7892); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_deviceKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3388:2: kw= 'spir_func'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleCallingConv7911); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_funcKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3395:2: kw= 'spir_kernel'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleCallingConv7930); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_kernelKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3401:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3401:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3402:2: kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleCallingConv7950); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCcKeyword_14_0()); 
                        
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleCallingConv7963); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getLessThanSignKeyword_14_1()); 
                        
                    this_INT_16=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv7978); 

                    		current.merge(this_INT_16);
                        
                     
                        newLeafNode(this_INT_16, grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_2()); 
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleCallingConv7996); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getGreaterThanSignKeyword_14_3()); 
                        
                    this_INT_18=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv8011); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3441:1: entryRuleFUNCTION_ATTRIBUTES returns [String current=null] : iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF ;
    public final String entryRuleFUNCTION_ATTRIBUTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNCTION_ATTRIBUTES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3442:2: (iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3443:2: iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF
            {
             newCompositeNode(grammarAccess.getFUNCTION_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES8058);
            iv_ruleFUNCTION_ATTRIBUTES=ruleFUNCTION_ATTRIBUTES();

            state._fsp--;

             current =iv_ruleFUNCTION_ATTRIBUTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES8069); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3450:1: ruleFUNCTION_ATTRIBUTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) ;
    public final AntlrDatatypeRuleToken ruleFUNCTION_ATTRIBUTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3453:28: ( (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3454:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3454:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            int alt96=18;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt96=1;
                }
                break;
            case 108:
                {
                alt96=2;
                }
                break;
            case 109:
                {
                alt96=3;
                }
                break;
            case 110:
                {
                alt96=4;
                }
                break;
            case 111:
                {
                alt96=5;
                }
                break;
            case 112:
                {
                alt96=6;
                }
                break;
            case 113:
                {
                alt96=7;
                }
                break;
            case 114:
                {
                alt96=8;
                }
                break;
            case 115:
                {
                alt96=9;
                }
                break;
            case 116:
                {
                alt96=10;
                }
                break;
            case 117:
                {
                alt96=11;
                }
                break;
            case 118:
                {
                alt96=12;
                }
                break;
            case 119:
                {
                alt96=13;
                }
                break;
            case 120:
                {
                alt96=14;
                }
                break;
            case 121:
                {
                alt96=15;
                }
                break;
            case 122:
                {
                alt96=16;
                }
                break;
            case 123:
                {
                alt96=17;
                }
                break;
            case 124:
                {
                alt96=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3455:2: kw= 'address_safety'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleFUNCTION_ATTRIBUTES8107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAddress_safetyKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3461:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3461:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3462:2: kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleFUNCTION_ATTRIBUTES8127); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlignstackKeyword_1_0()); 
                        
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleFUNCTION_ATTRIBUTES8140); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLeftParenthesisKeyword_1_1()); 
                        
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleFUNCTION_ATTRIBUTES8153); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLessThanSignKeyword_1_2()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFUNCTION_ATTRIBUTES8168); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getINTTerminalRuleCall_1_3()); 
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleFUNCTION_ATTRIBUTES8186); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getGreaterThanSignKeyword_1_4()); 
                        
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleFUNCTION_ATTRIBUTES8199); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getRightParenthesisKeyword_1_5()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3500:2: kw= 'alwaysinline'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleFUNCTION_ATTRIBUTES8219); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlwaysinlineKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3507:2: kw= 'nonlazybind'
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleFUNCTION_ATTRIBUTES8238); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNonlazybindKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3514:2: kw= 'inlinehint'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleFUNCTION_ATTRIBUTES8257); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getInlinehintKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3521:2: kw= 'naked'
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleFUNCTION_ATTRIBUTES8276); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNakedKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3528:2: kw= 'noimplicitfloat'
                    {
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleFUNCTION_ATTRIBUTES8295); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoimplicitfloatKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3535:2: kw= 'noinline'
                    {
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleFUNCTION_ATTRIBUTES8314); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoinlineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3542:2: kw= 'noredzone'
                    {
                    kw=(Token)match(input,115,FOLLOW_115_in_ruleFUNCTION_ATTRIBUTES8333); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoredzoneKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3549:2: kw= 'noreturn'
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleFUNCTION_ATTRIBUTES8352); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoreturnKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3556:2: kw= 'nounwind'
                    {
                    kw=(Token)match(input,117,FOLLOW_117_in_ruleFUNCTION_ATTRIBUTES8371); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNounwindKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3563:2: kw= 'optsize'
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_ruleFUNCTION_ATTRIBUTES8390); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getOptsizeKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3570:2: kw= 'readnone'
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_ruleFUNCTION_ATTRIBUTES8409); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadnoneKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3577:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_ruleFUNCTION_ATTRIBUTES8428); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadonlyKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3584:2: kw= 'returns_twice'
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_ruleFUNCTION_ATTRIBUTES8447); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReturns_twiceKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3591:2: kw= 'ssp'
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleFUNCTION_ATTRIBUTES8466); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3598:2: kw= 'sspreq'
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleFUNCTION_ATTRIBUTES8485); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspreqKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3605:2: kw= 'uwtable'
                    {
                    kw=(Token)match(input,124,FOLLOW_124_in_ruleFUNCTION_ATTRIBUTES8504); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3618:1: entryRulePHI returns [EObject current=null] : iv_rulePHI= rulePHI EOF ;
    public final EObject entryRulePHI() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePHI = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3619:2: (iv_rulePHI= rulePHI EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3620:2: iv_rulePHI= rulePHI EOF
            {
             newCompositeNode(grammarAccess.getPHIRule()); 
            pushFollow(FOLLOW_rulePHI_in_entryRulePHI8544);
            iv_rulePHI=rulePHI();

            state._fsp--;

             current =iv_rulePHI; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePHI8554); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3627:1: rulePHI returns [EObject current=null] : (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3630:28: ( (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3631:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3631:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3631:3: otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            {
            otherlv_0=(Token)match(input,125,FOLLOW_125_in_rulePHI8591); 

                	newLeafNode(otherlv_0, grammarAccess.getPHIAccess().getPhiKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPHIAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_rulePHI8607);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,22,FOLLOW_22_in_rulePHI8618); 

                	newLeafNode(otherlv_2, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3647:1: ( (lv_values_3_0= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3648:1: (lv_values_3_0= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3648:1: (lv_values_3_0= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3649:3: lv_values_3_0= ruleValuePair
            {
             
            	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValuePair_in_rulePHI8639);
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

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_rulePHI8651); 

                	newLeafNode(otherlv_4, grammarAccess.getPHIAccess().getRightSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3669:1: (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==23) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3669:3: otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']'
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_23_in_rulePHI8664); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPHIAccess().getCommaKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,22,FOLLOW_22_in_rulePHI8676); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_5_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3677:1: ( (lv_values_7_0= ruleValuePair ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3678:1: (lv_values_7_0= ruleValuePair )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3678:1: (lv_values_7_0= ruleValuePair )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3679:3: lv_values_7_0= ruleValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValuePair_in_rulePHI8697);
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

            	    otherlv_8=(Token)match(input,24,FOLLOW_24_in_rulePHI8709); 

            	        	newLeafNode(otherlv_8, grammarAccess.getPHIAccess().getRightSquareBracketKeyword_5_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop97;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3707:1: entryRuleValuePair returns [EObject current=null] : iv_ruleValuePair= ruleValuePair EOF ;
    public final EObject entryRuleValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuePair = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3708:2: (iv_ruleValuePair= ruleValuePair EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3709:2: iv_ruleValuePair= ruleValuePair EOF
            {
             newCompositeNode(grammarAccess.getValuePairRule()); 
            pushFollow(FOLLOW_ruleValuePair_in_entryRuleValuePair8747);
            iv_ruleValuePair=ruleValuePair();

            state._fsp--;

             current =iv_ruleValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuePair8757); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3716:1: ruleValuePair returns [EObject current=null] : ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) ) ;
    public final EObject ruleValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value1_0_0 = null;

        AntlrDatatypeRuleToken lv_value2_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3719:28: ( ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3720:1: ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3720:1: ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3720:2: ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3720:2: ( (lv_value1_0_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3721:1: (lv_value1_0_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3721:1: (lv_value1_0_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3722:3: lv_value1_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getValuePairAccess().getValue1TypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleValuePair8803);
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

            otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleValuePair8815); 

                	newLeafNode(otherlv_1, grammarAccess.getValuePairAccess().getCommaKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3742:1: ( (lv_value2_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3743:1: (lv_value2_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3743:1: (lv_value2_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3744:3: lv_value2_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getValuePairAccess().getValue2TypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleValuePair8836);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3768:1: entryRuleLandingPad returns [EObject current=null] : iv_ruleLandingPad= ruleLandingPad EOF ;
    public final EObject entryRuleLandingPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingPad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3769:2: (iv_ruleLandingPad= ruleLandingPad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3770:2: iv_ruleLandingPad= ruleLandingPad EOF
            {
             newCompositeNode(grammarAccess.getLandingPadRule()); 
            pushFollow(FOLLOW_ruleLandingPad_in_entryRuleLandingPad8872);
            iv_ruleLandingPad=ruleLandingPad();

            state._fsp--;

             current =iv_ruleLandingPad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLandingPad8882); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3777:1: ruleLandingPad returns [EObject current=null] : ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3780:28: ( ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3781:1: ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3781:1: ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) )
            int alt104=2;
            alt104 = dfa104.predict(input);
            switch (alt104) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3781:2: (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3781:2: (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3781:4: otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ )
                    {
                    otherlv_0=(Token)match(input,126,FOLLOW_126_in_ruleLandingPad8920); 

                        	newLeafNode(otherlv_0, grammarAccess.getLandingPadAccess().getLandingpadKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3785:1: ( (lv_type_1_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3786:1: (lv_type_1_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3786:1: (lv_type_1_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3787:3: lv_type_1_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getTypeTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad8941);
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

                    otherlv_2=(Token)match(input,127,FOLLOW_127_in_ruleLandingPad8953); 

                        	newLeafNode(otherlv_2, grammarAccess.getLandingPadAccess().getPersonalityKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3807:1: ( (lv_personality_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3808:1: (lv_personality_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3808:1: (lv_personality_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3809:3: lv_personality_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityTypeAndValueParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLandingPad8974);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3825:2: ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ )
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==128) ) {
                        alt100=1;
                    }
                    else if ( ((LA100_0>=131 && LA100_0<=132)) ) {
                        alt100=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 100, 0, input);

                        throw nvae;
                    }
                    switch (alt100) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3825:3: (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3825:3: (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3825:5: otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )*
                            {
                            otherlv_4=(Token)match(input,128,FOLLOW_128_in_ruleLandingPad8988); 

                                	newLeafNode(otherlv_4, grammarAccess.getLandingPadAccess().getCleanupKeyword_0_4_0_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3829:1: ( (lv_clause_5_0= ruleClause ) )*
                            loop98:
                            do {
                                int alt98=2;
                                int LA98_0 = input.LA(1);

                                if ( ((LA98_0>=131 && LA98_0<=132)) ) {
                                    alt98=1;
                                }


                                switch (alt98) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3830:1: (lv_clause_5_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3830:1: (lv_clause_5_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3831:3: lv_clause_5_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_0_4_0_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad9009);
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
                            	    break loop98;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3848:6: ( (lv_clause_6_0= ruleClause ) )+
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3848:6: ( (lv_clause_6_0= ruleClause ) )+
                            int cnt99=0;
                            loop99:
                            do {
                                int alt99=2;
                                int LA99_0 = input.LA(1);

                                if ( ((LA99_0>=131 && LA99_0<=132)) ) {
                                    alt99=1;
                                }


                                switch (alt99) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3849:1: (lv_clause_6_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3849:1: (lv_clause_6_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3850:3: lv_clause_6_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_0_4_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad9038);
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
                            	    if ( cnt99 >= 1 ) break loop99;
                                        EarlyExitException eee =
                                            new EarlyExitException(99, input);
                                        throw eee;
                                }
                                cnt99++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3867:6: (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3867:6: (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3867:8: otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ )
                    {
                    otherlv_7=(Token)match(input,126,FOLLOW_126_in_ruleLandingPad9060); 

                        	newLeafNode(otherlv_7, grammarAccess.getLandingPadAccess().getLandingpadKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3871:1: ( (lv_type_8_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3872:1: (lv_type_8_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3872:1: (lv_type_8_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3873:3: lv_type_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getTypeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad9081);
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

                    otherlv_9=(Token)match(input,127,FOLLOW_127_in_ruleLandingPad9093); 

                        	newLeafNode(otherlv_9, grammarAccess.getLandingPadAccess().getPersonalityKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3893:1: ( (lv_personalitytype_10_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3894:1: (lv_personalitytype_10_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3894:1: (lv_personalitytype_10_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3895:3: lv_personalitytype_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalitytypeTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad9114);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3911:2: ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3912:1: (lv_personalityfunction_11_0= ruleCAST_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3912:1: (lv_personalityfunction_11_0= ruleCAST_TYPE )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3913:3: lv_personalityfunction_11_0= ruleCAST_TYPE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityfunctionCAST_TYPEParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCAST_TYPE_in_ruleLandingPad9135);
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

                    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleLandingPad9147); 

                        	newLeafNode(otherlv_12, grammarAccess.getLandingPadAccess().getLeftParenthesisKeyword_1_5());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3933:1: ( (lv_value_13_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3934:1: (lv_value_13_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3934:1: (lv_value_13_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3935:3: lv_value_13_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getValueTypeParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad9168);
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

                    otherlv_14=(Token)match(input,129,FOLLOW_129_in_ruleLandingPad9180); 

                        	newLeafNode(otherlv_14, grammarAccess.getLandingPadAccess().getLeftParenthesisFullStopFullStopFullStopRightParenthesisAsteriskKeyword_1_7());
                        
                    this_VAR_TYPE_15=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleLandingPad9191); 
                     
                        newLeafNode(this_VAR_TYPE_15, grammarAccess.getLandingPadAccess().getVAR_TYPETerminalRuleCall_1_8()); 
                        
                    otherlv_16=(Token)match(input,130,FOLLOW_130_in_ruleLandingPad9202); 

                        	newLeafNode(otherlv_16, grammarAccess.getLandingPadAccess().getToKeyword_1_9());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3963:1: ( (lv_castto_17_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3964:1: (lv_castto_17_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3964:1: (lv_castto_17_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3965:3: lv_castto_17_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getCasttoTypeParserRuleCall_1_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad9223);
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

                    otherlv_18=(Token)match(input,31,FOLLOW_31_in_ruleLandingPad9235); 

                        	newLeafNode(otherlv_18, grammarAccess.getLandingPadAccess().getRightParenthesisKeyword_1_11());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3985:1: ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==128) ) {
                        alt103=1;
                    }
                    else if ( ((LA103_0>=131 && LA103_0<=132)) ) {
                        alt103=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3985:2: (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3985:2: (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3985:4: otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )*
                            {
                            otherlv_19=(Token)match(input,128,FOLLOW_128_in_ruleLandingPad9249); 

                                	newLeafNode(otherlv_19, grammarAccess.getLandingPadAccess().getCleanupKeyword_1_12_0_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3989:1: ( (lv_clause_20_0= ruleClause ) )*
                            loop101:
                            do {
                                int alt101=2;
                                int LA101_0 = input.LA(1);

                                if ( ((LA101_0>=131 && LA101_0<=132)) ) {
                                    alt101=1;
                                }


                                switch (alt101) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3990:1: (lv_clause_20_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3990:1: (lv_clause_20_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3991:3: lv_clause_20_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_1_12_0_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad9270);
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
                            	    break loop101;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4008:6: ( (lv_clause_21_0= ruleClause ) )+
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4008:6: ( (lv_clause_21_0= ruleClause ) )+
                            int cnt102=0;
                            loop102:
                            do {
                                int alt102=2;
                                int LA102_0 = input.LA(1);

                                if ( ((LA102_0>=131 && LA102_0<=132)) ) {
                                    alt102=1;
                                }


                                switch (alt102) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4009:1: (lv_clause_21_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4009:1: (lv_clause_21_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4010:3: lv_clause_21_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_1_12_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad9299);
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
                            	    if ( cnt102 >= 1 ) break loop102;
                                        EarlyExitException eee =
                                            new EarlyExitException(102, input);
                                        throw eee;
                                }
                                cnt102++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4034:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4035:2: (iv_ruleClause= ruleClause EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4036:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause9338);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause9348); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4043:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4046:28: ( ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4047:1: ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4047:1: ( (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue ) | (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==131) ) {
                alt106=1;
            }
            else if ( (LA106_0==132) ) {
                alt106=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4047:2: (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4047:2: (otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4047:4: otherlv_0= 'catch' this_TypeAndValue_1= ruleTypeAndValue
                    {
                    otherlv_0=(Token)match(input,131,FOLLOW_131_in_ruleClause9386); 

                        	newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getCatchKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getClauseAccess().getTypeAndValueParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause9408);
                    this_TypeAndValue_1=ruleTypeAndValue();

                    state._fsp--;

                     
                            current = this_TypeAndValue_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4061:6: (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4061:6: (otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4061:8: otherlv_2= 'filter' ( (lv_filter_3_0= ruleTypeAndValue ) ) (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )*
                    {
                    otherlv_2=(Token)match(input,132,FOLLOW_132_in_ruleClause9427); 

                        	newLeafNode(otherlv_2, grammarAccess.getClauseAccess().getFilterKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4065:1: ( (lv_filter_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4066:1: (lv_filter_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4066:1: (lv_filter_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4067:3: lv_filter_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause9448);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4083:2: (otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==23) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4083:4: otherlv_4= ',' ( (lv_filter_5_0= ruleTypeAndValue ) )
                    	    {
                    	    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleClause9461); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getClauseAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4087:1: ( (lv_filter_5_0= ruleTypeAndValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4088:1: (lv_filter_5_0= ruleTypeAndValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4088:1: (lv_filter_5_0= ruleTypeAndValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4089:3: lv_filter_5_0= ruleTypeAndValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterTypeAndValueParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleClause9482);
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
                    	    break loop105;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4113:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4114:2: (iv_ruleSelect= ruleSelect EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4115:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect9521);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect9531); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4122:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4125:28: ( (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4126:1: (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4126:1: (otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4126:3: otherlv_0= 'select' ( (lv_condition_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_val1_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_val2_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,133,FOLLOW_133_in_ruleSelect9568); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4130:1: ( (lv_condition_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4131:1: (lv_condition_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4131:1: (lv_condition_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4132:3: lv_condition_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getConditionTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect9589);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleSelect9601); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4152:1: ( (lv_val1_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4153:1: (lv_val1_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4153:1: (lv_val1_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4154:3: lv_val1_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal1TypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect9622);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleSelect9634); 

                	newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4174:1: ( (lv_val2_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4175:1: (lv_val2_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4175:1: (lv_val2_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4176:3: lv_val2_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal2TypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSelect9655);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4200:1: entryRuleVA_Arg returns [EObject current=null] : iv_ruleVA_Arg= ruleVA_Arg EOF ;
    public final EObject entryRuleVA_Arg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVA_Arg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4201:2: (iv_ruleVA_Arg= ruleVA_Arg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4202:2: iv_ruleVA_Arg= ruleVA_Arg EOF
            {
             newCompositeNode(grammarAccess.getVA_ArgRule()); 
            pushFollow(FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg9691);
            iv_ruleVA_Arg=ruleVA_Arg();

            state._fsp--;

             current =iv_ruleVA_Arg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVA_Arg9701); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4209:1: ruleVA_Arg returns [EObject current=null] : (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) ) ;
    public final EObject ruleVA_Arg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_list_1_0 = null;

        AntlrDatatypeRuleToken lv_argType_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4212:28: ( (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4213:1: (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4213:1: (otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4213:3: otherlv_0= 'va_arg' ( (lv_list_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_argType_3_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,134,FOLLOW_134_in_ruleVA_Arg9738); 

                	newLeafNode(otherlv_0, grammarAccess.getVA_ArgAccess().getVa_argKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4217:1: ( (lv_list_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4218:1: (lv_list_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4218:1: (lv_list_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4219:3: lv_list_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getListTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleVA_Arg9759);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleVA_Arg9771); 

                	newLeafNode(otherlv_2, grammarAccess.getVA_ArgAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4239:1: ( (lv_argType_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4240:1: (lv_argType_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4240:1: (lv_argType_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4241:3: lv_argType_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getArgTypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVA_Arg9792);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4265:1: entryRuleExtractElement returns [EObject current=null] : iv_ruleExtractElement= ruleExtractElement EOF ;
    public final EObject entryRuleExtractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4266:2: (iv_ruleExtractElement= ruleExtractElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4267:2: iv_ruleExtractElement= ruleExtractElement EOF
            {
             newCompositeNode(grammarAccess.getExtractElementRule()); 
            pushFollow(FOLLOW_ruleExtractElement_in_entryRuleExtractElement9828);
            iv_ruleExtractElement=ruleExtractElement();

            state._fsp--;

             current =iv_ruleExtractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractElement9838); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4274:1: ruleExtractElement returns [EObject current=null] : (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) ) ;
    public final EObject ruleExtractElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_vector_1_0 = null;

        EObject lv_index_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4277:28: ( (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4278:1: (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4278:1: (otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4278:3: otherlv_0= 'extractelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_index_3_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,135,FOLLOW_135_in_ruleExtractElement9875); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractElementAccess().getExtractelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4282:1: ( (lv_vector_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4283:1: (lv_vector_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4283:1: (lv_vector_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4284:3: lv_vector_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getVectorTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractElement9896);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleExtractElement9908); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractElementAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4304:1: ( (lv_index_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4305:1: (lv_index_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4305:1: (lv_index_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4306:3: lv_index_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getIndexTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleExtractElement9929);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4330:1: entryRuleInsertElement returns [EObject current=null] : iv_ruleInsertElement= ruleInsertElement EOF ;
    public final EObject entryRuleInsertElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4331:2: (iv_ruleInsertElement= ruleInsertElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4332:2: iv_ruleInsertElement= ruleInsertElement EOF
            {
             newCompositeNode(grammarAccess.getInsertElementRule()); 
            pushFollow(FOLLOW_ruleInsertElement_in_entryRuleInsertElement9965);
            iv_ruleInsertElement=ruleInsertElement();

            state._fsp--;

             current =iv_ruleInsertElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertElement9975); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4339:1: ruleInsertElement returns [EObject current=null] : (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4342:28: ( (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4343:1: (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4343:1: (otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4343:3: otherlv_0= 'insertelement' ( (lv_vector_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_scalar_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_index_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,136,FOLLOW_136_in_ruleInsertElement10012); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertElementAccess().getInsertelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4347:1: ( (lv_vector_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4348:1: (lv_vector_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4348:1: (lv_vector_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4349:3: lv_vector_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getVectorTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement10033);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleInsertElement10045); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertElementAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4369:1: ( (lv_scalar_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4370:1: (lv_scalar_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4370:1: (lv_scalar_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4371:3: lv_scalar_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getScalarTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement10066);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleInsertElement10078); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertElementAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4391:1: ( (lv_index_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4392:1: (lv_index_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4392:1: (lv_index_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4393:3: lv_index_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getIndexTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInsertElement10099);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4417:1: entryRuleShuffleVector returns [EObject current=null] : iv_ruleShuffleVector= ruleShuffleVector EOF ;
    public final EObject entryRuleShuffleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4418:2: (iv_ruleShuffleVector= ruleShuffleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4419:2: iv_ruleShuffleVector= ruleShuffleVector EOF
            {
             newCompositeNode(grammarAccess.getShuffleVectorRule()); 
            pushFollow(FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector10135);
            iv_ruleShuffleVector=ruleShuffleVector();

            state._fsp--;

             current =iv_ruleShuffleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShuffleVector10145); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4426:1: ruleShuffleVector returns [EObject current=null] : (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4429:28: ( (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4430:1: (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4430:1: (otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4430:3: otherlv_0= 'shufflevector' ( (lv_vector1_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_vector2_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_mask_5_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,137,FOLLOW_137_in_ruleShuffleVector10182); 

                	newLeafNode(otherlv_0, grammarAccess.getShuffleVectorAccess().getShufflevectorKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4434:1: ( (lv_vector1_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4435:1: (lv_vector1_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4435:1: (lv_vector1_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4436:3: lv_vector1_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVector1TypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector10203);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleShuffleVector10215); 

                	newLeafNode(otherlv_2, grammarAccess.getShuffleVectorAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4456:1: ( (lv_vector2_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4457:1: (lv_vector2_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4457:1: (lv_vector2_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4458:3: lv_vector2_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVector2TypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector10236);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleShuffleVector10248); 

                	newLeafNode(otherlv_4, grammarAccess.getShuffleVectorAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4478:1: ( (lv_mask_5_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4479:1: (lv_mask_5_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4479:1: (lv_mask_5_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4480:3: lv_mask_5_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getMaskTypeAndValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleShuffleVector10269);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4504:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4505:2: (iv_ruleCast= ruleCast EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4506:2: iv_ruleCast= ruleCast EOF
            {
             newCompositeNode(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast10305);
            iv_ruleCast=ruleCast();

            state._fsp--;

             current =iv_ruleCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast10315); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4513:1: ruleCast returns [EObject current=null] : ( ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_castto_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4516:28: ( ( ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4517:1: ( ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4517:1: ( ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4518:5: ruleCAST_TYPE ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= 'to' ( (lv_castto_3_0= ruleType ) )
            {
             
                    newCompositeNode(grammarAccess.getCastAccess().getCAST_TYPEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCAST_TYPE_in_ruleCast10356);
            ruleCAST_TYPE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4525:1: ( (lv_value_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4526:1: (lv_value_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4526:1: (lv_value_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4527:3: lv_value_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getValueTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleCast10376);
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

            otherlv_2=(Token)match(input,130,FOLLOW_130_in_ruleCast10388); 

                	newLeafNode(otherlv_2, grammarAccess.getCastAccess().getToKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4547:1: ( (lv_castto_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4548:1: (lv_castto_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4548:1: (lv_castto_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4549:3: lv_castto_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getCasttoTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCast10409);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4573:1: entryRuleCAST_TYPE returns [String current=null] : iv_ruleCAST_TYPE= ruleCAST_TYPE EOF ;
    public final String entryRuleCAST_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCAST_TYPE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4574:2: (iv_ruleCAST_TYPE= ruleCAST_TYPE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4575:2: iv_ruleCAST_TYPE= ruleCAST_TYPE EOF
            {
             newCompositeNode(grammarAccess.getCAST_TYPERule()); 
            pushFollow(FOLLOW_ruleCAST_TYPE_in_entryRuleCAST_TYPE10446);
            iv_ruleCAST_TYPE=ruleCAST_TYPE();

            state._fsp--;

             current =iv_ruleCAST_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCAST_TYPE10457); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4582:1: ruleCAST_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) ;
    public final AntlrDatatypeRuleToken ruleCAST_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4585:28: ( (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4586:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4586:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            int alt107=12;
            switch ( input.LA(1) ) {
            case 138:
                {
                alt107=1;
                }
                break;
            case 139:
                {
                alt107=2;
                }
                break;
            case 140:
                {
                alt107=3;
                }
                break;
            case 141:
                {
                alt107=4;
                }
                break;
            case 142:
                {
                alt107=5;
                }
                break;
            case 143:
                {
                alt107=6;
                }
                break;
            case 144:
                {
                alt107=7;
                }
                break;
            case 145:
                {
                alt107=8;
                }
                break;
            case 146:
                {
                alt107=9;
                }
                break;
            case 147:
                {
                alt107=10;
                }
                break;
            case 148:
                {
                alt107=11;
                }
                break;
            case 149:
                {
                alt107=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4587:2: kw= 'trunc'
                    {
                    kw=(Token)match(input,138,FOLLOW_138_in_ruleCAST_TYPE10495); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getTruncKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4594:2: kw= 'zext'
                    {
                    kw=(Token)match(input,139,FOLLOW_139_in_ruleCAST_TYPE10514); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getZextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4601:2: kw= 'sext'
                    {
                    kw=(Token)match(input,140,FOLLOW_140_in_ruleCAST_TYPE10533); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getSextKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4608:2: kw= 'fptrunc'
                    {
                    kw=(Token)match(input,141,FOLLOW_141_in_ruleCAST_TYPE10552); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFptruncKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4615:2: kw= 'fpext'
                    {
                    kw=(Token)match(input,142,FOLLOW_142_in_ruleCAST_TYPE10571); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFpextKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4622:2: kw= 'fptoui'
                    {
                    kw=(Token)match(input,143,FOLLOW_143_in_ruleCAST_TYPE10590); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFptouiKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4629:2: kw= 'fptosi'
                    {
                    kw=(Token)match(input,144,FOLLOW_144_in_ruleCAST_TYPE10609); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFptosiKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4636:2: kw= 'uitofp'
                    {
                    kw=(Token)match(input,145,FOLLOW_145_in_ruleCAST_TYPE10628); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getUitofpKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4643:2: kw= 'sitofp'
                    {
                    kw=(Token)match(input,146,FOLLOW_146_in_ruleCAST_TYPE10647); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getSitofpKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4650:2: kw= 'ptrtoint'
                    {
                    kw=(Token)match(input,147,FOLLOW_147_in_ruleCAST_TYPE10666); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getPtrtointKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4657:2: kw= 'inttoptr'
                    {
                    kw=(Token)match(input,148,FOLLOW_148_in_ruleCAST_TYPE10685); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getInttoptrKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4664:2: kw= 'bitcast'
                    {
                    kw=(Token)match(input,149,FOLLOW_149_in_ruleCAST_TYPE10704); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4677:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4678:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4679:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare10744);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare10754); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4686:1: ruleCompare returns [EObject current=null] : ( (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        EObject this_ValuePair_3 = null;

        EObject this_ValuePair_7 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4689:28: ( ( (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4690:1: ( (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4690:1: ( (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair ) | (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==150) ) {
                alt108=1;
            }
            else if ( (LA108_0==151) ) {
                alt108=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4690:2: (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4690:2: (otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4690:4: otherlv_0= 'icmp' ruleI_PREDICATES ruleType this_ValuePair_3= ruleValuePair
                    {
                    otherlv_0=(Token)match(input,150,FOLLOW_150_in_ruleCompare10792); 

                        	newLeafNode(otherlv_0, grammarAccess.getCompareAccess().getIcmpKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getI_PREDICATESParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleI_PREDICATES_in_ruleCompare10808);
                    ruleI_PREDICATES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getTypeParserRuleCall_0_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCompare10823);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getValuePairParserRuleCall_0_3()); 
                        
                    pushFollow(FOLLOW_ruleValuePair_in_ruleCompare10844);
                    this_ValuePair_3=ruleValuePair();

                    state._fsp--;

                     
                            current = this_ValuePair_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4720:6: (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4720:6: (otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4720:8: otherlv_4= 'fcmp' ruleF_PREDICATES ruleType this_ValuePair_7= ruleValuePair
                    {
                    otherlv_4=(Token)match(input,151,FOLLOW_151_in_ruleCompare10863); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getFcmpKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getF_PREDICATESParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleF_PREDICATES_in_ruleCompare10879);
                    ruleF_PREDICATES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getTypeParserRuleCall_1_2()); 
                        
                    pushFollow(FOLLOW_ruleType_in_ruleCompare10894);
                    ruleType();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getValuePairParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleValuePair_in_ruleCompare10915);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4757:1: entryRuleI_PREDICATES returns [String current=null] : iv_ruleI_PREDICATES= ruleI_PREDICATES EOF ;
    public final String entryRuleI_PREDICATES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleI_PREDICATES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4758:2: (iv_ruleI_PREDICATES= ruleI_PREDICATES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4759:2: iv_ruleI_PREDICATES= ruleI_PREDICATES EOF
            {
             newCompositeNode(grammarAccess.getI_PREDICATESRule()); 
            pushFollow(FOLLOW_ruleI_PREDICATES_in_entryRuleI_PREDICATES10952);
            iv_ruleI_PREDICATES=ruleI_PREDICATES();

            state._fsp--;

             current =iv_ruleI_PREDICATES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleI_PREDICATES10963); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4766:1: ruleI_PREDICATES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) ;
    public final AntlrDatatypeRuleToken ruleI_PREDICATES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4769:28: ( (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4770:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4770:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            int alt109=10;
            switch ( input.LA(1) ) {
            case 152:
                {
                alt109=1;
                }
                break;
            case 153:
                {
                alt109=2;
                }
                break;
            case 154:
                {
                alt109=3;
                }
                break;
            case 155:
                {
                alt109=4;
                }
                break;
            case 156:
                {
                alt109=5;
                }
                break;
            case 157:
                {
                alt109=6;
                }
                break;
            case 158:
                {
                alt109=7;
                }
                break;
            case 159:
                {
                alt109=8;
                }
                break;
            case 160:
                {
                alt109=9;
                }
                break;
            case 161:
                {
                alt109=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4771:2: kw= 'eq'
                    {
                    kw=(Token)match(input,152,FOLLOW_152_in_ruleI_PREDICATES11001); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getEqKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4778:2: kw= 'ne'
                    {
                    kw=(Token)match(input,153,FOLLOW_153_in_ruleI_PREDICATES11020); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getNeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4785:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,154,FOLLOW_154_in_ruleI_PREDICATES11039); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4792:2: kw= 'uge'
                    {
                    kw=(Token)match(input,155,FOLLOW_155_in_ruleI_PREDICATES11058); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4799:2: kw= 'ult'
                    {
                    kw=(Token)match(input,156,FOLLOW_156_in_ruleI_PREDICATES11077); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4806:2: kw= 'ule'
                    {
                    kw=(Token)match(input,157,FOLLOW_157_in_ruleI_PREDICATES11096); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4813:2: kw= 'sgt'
                    {
                    kw=(Token)match(input,158,FOLLOW_158_in_ruleI_PREDICATES11115); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSgtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4820:2: kw= 'sge'
                    {
                    kw=(Token)match(input,159,FOLLOW_159_in_ruleI_PREDICATES11134); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSgeKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4827:2: kw= 'slt'
                    {
                    kw=(Token)match(input,160,FOLLOW_160_in_ruleI_PREDICATES11153); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSltKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4834:2: kw= 'sle'
                    {
                    kw=(Token)match(input,161,FOLLOW_161_in_ruleI_PREDICATES11172); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4847:1: entryRuleF_PREDICATES returns [String current=null] : iv_ruleF_PREDICATES= ruleF_PREDICATES EOF ;
    public final String entryRuleF_PREDICATES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleF_PREDICATES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4848:2: (iv_ruleF_PREDICATES= ruleF_PREDICATES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4849:2: iv_ruleF_PREDICATES= ruleF_PREDICATES EOF
            {
             newCompositeNode(grammarAccess.getF_PREDICATESRule()); 
            pushFollow(FOLLOW_ruleF_PREDICATES_in_entryRuleF_PREDICATES11213);
            iv_ruleF_PREDICATES=ruleF_PREDICATES();

            state._fsp--;

             current =iv_ruleF_PREDICATES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleF_PREDICATES11224); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4856:1: ruleF_PREDICATES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleF_PREDICATES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4859:28: ( (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4860:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4860:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            int alt110=16;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt110=1;
                }
                break;
            case 162:
                {
                alt110=2;
                }
                break;
            case 163:
                {
                alt110=3;
                }
                break;
            case 164:
                {
                alt110=4;
                }
                break;
            case 165:
                {
                alt110=5;
                }
                break;
            case 166:
                {
                alt110=6;
                }
                break;
            case 167:
                {
                alt110=7;
                }
                break;
            case 168:
                {
                alt110=8;
                }
                break;
            case 169:
                {
                alt110=9;
                }
                break;
            case 154:
                {
                alt110=10;
                }
                break;
            case 155:
                {
                alt110=11;
                }
                break;
            case 156:
                {
                alt110=12;
                }
                break;
            case 157:
                {
                alt110=13;
                }
                break;
            case 170:
                {
                alt110=14;
                }
                break;
            case 171:
                {
                alt110=15;
                }
                break;
            case 44:
                {
                alt110=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4861:2: kw= 'false'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleF_PREDICATES11262); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getFalseKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4868:2: kw= 'oeq'
                    {
                    kw=(Token)match(input,162,FOLLOW_162_in_ruleF_PREDICATES11281); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOeqKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4875:2: kw= 'ogt'
                    {
                    kw=(Token)match(input,163,FOLLOW_163_in_ruleF_PREDICATES11300); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4882:2: kw= 'oge'
                    {
                    kw=(Token)match(input,164,FOLLOW_164_in_ruleF_PREDICATES11319); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:2: kw= 'olt'
                    {
                    kw=(Token)match(input,165,FOLLOW_165_in_ruleF_PREDICATES11338); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4896:2: kw= 'ole'
                    {
                    kw=(Token)match(input,166,FOLLOW_166_in_ruleF_PREDICATES11357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4903:2: kw= 'one'
                    {
                    kw=(Token)match(input,167,FOLLOW_167_in_ruleF_PREDICATES11376); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOneKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4910:2: kw= 'ord'
                    {
                    kw=(Token)match(input,168,FOLLOW_168_in_ruleF_PREDICATES11395); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOrdKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4917:2: kw= 'ueq'
                    {
                    kw=(Token)match(input,169,FOLLOW_169_in_ruleF_PREDICATES11414); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUeqKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4924:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,154,FOLLOW_154_in_ruleF_PREDICATES11433); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUgtKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4931:2: kw= 'uge'
                    {
                    kw=(Token)match(input,155,FOLLOW_155_in_ruleF_PREDICATES11452); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUgeKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4938:2: kw= 'ult'
                    {
                    kw=(Token)match(input,156,FOLLOW_156_in_ruleF_PREDICATES11471); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUltKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4945:2: kw= 'ule'
                    {
                    kw=(Token)match(input,157,FOLLOW_157_in_ruleF_PREDICATES11490); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUleKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4952:2: kw= 'une'
                    {
                    kw=(Token)match(input,170,FOLLOW_170_in_ruleF_PREDICATES11509); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUneKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4959:2: kw= 'uno'
                    {
                    kw=(Token)match(input,171,FOLLOW_171_in_ruleF_PREDICATES11528); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUnoKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4966:2: kw= 'true'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleF_PREDICATES11547); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4979:1: entryRuleARITHMETIC_OP returns [EObject current=null] : iv_ruleARITHMETIC_OP= ruleARITHMETIC_OP EOF ;
    public final EObject entryRuleARITHMETIC_OP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARITHMETIC_OP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4980:2: (iv_ruleARITHMETIC_OP= ruleARITHMETIC_OP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4981:2: iv_ruleARITHMETIC_OP= ruleARITHMETIC_OP EOF
            {
             newCompositeNode(grammarAccess.getARITHMETIC_OPRule()); 
            pushFollow(FOLLOW_ruleARITHMETIC_OP_in_entryRuleARITHMETIC_OP11587);
            iv_ruleARITHMETIC_OP=ruleARITHMETIC_OP();

            state._fsp--;

             current =iv_ruleARITHMETIC_OP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleARITHMETIC_OP11597); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4988:1: ruleARITHMETIC_OP returns [EObject current=null] : ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4991:28: ( ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4992:1: ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4992:1: ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4992:2: (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ruleType this_ValuePair_13= ruleValuePair
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4992:2: (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' )
            int alt111=12;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt111=1;
                }
                break;
            case 172:
                {
                alt111=2;
                }
                break;
            case 68:
                {
                alt111=3;
                }
                break;
            case 173:
                {
                alt111=4;
                }
                break;
            case 174:
                {
                alt111=5;
                }
                break;
            case 175:
                {
                alt111=6;
                }
                break;
            case 176:
                {
                alt111=7;
                }
                break;
            case 177:
                {
                alt111=8;
                }
                break;
            case 178:
                {
                alt111=9;
                }
                break;
            case 179:
                {
                alt111=10;
                }
                break;
            case 180:
                {
                alt111=11;
                }
                break;
            case 181:
                {
                alt111=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4992:4: otherlv_0= 'add'
                    {
                    otherlv_0=(Token)match(input,67,FOLLOW_67_in_ruleARITHMETIC_OP11635); 

                        	newLeafNode(otherlv_0, grammarAccess.getARITHMETIC_OPAccess().getAddKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4997:7: otherlv_1= 'fadd'
                    {
                    otherlv_1=(Token)match(input,172,FOLLOW_172_in_ruleARITHMETIC_OP11653); 

                        	newLeafNode(otherlv_1, grammarAccess.getARITHMETIC_OPAccess().getFaddKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5002:7: otherlv_2= 'sub'
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleARITHMETIC_OP11671); 

                        	newLeafNode(otherlv_2, grammarAccess.getARITHMETIC_OPAccess().getSubKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5007:7: otherlv_3= 'fsub'
                    {
                    otherlv_3=(Token)match(input,173,FOLLOW_173_in_ruleARITHMETIC_OP11689); 

                        	newLeafNode(otherlv_3, grammarAccess.getARITHMETIC_OPAccess().getFsubKeyword_0_3());
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5012:7: otherlv_4= 'mul'
                    {
                    otherlv_4=(Token)match(input,174,FOLLOW_174_in_ruleARITHMETIC_OP11707); 

                        	newLeafNode(otherlv_4, grammarAccess.getARITHMETIC_OPAccess().getMulKeyword_0_4());
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5017:7: otherlv_5= 'fmul'
                    {
                    otherlv_5=(Token)match(input,175,FOLLOW_175_in_ruleARITHMETIC_OP11725); 

                        	newLeafNode(otherlv_5, grammarAccess.getARITHMETIC_OPAccess().getFmulKeyword_0_5());
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5022:7: otherlv_6= 'udiv'
                    {
                    otherlv_6=(Token)match(input,176,FOLLOW_176_in_ruleARITHMETIC_OP11743); 

                        	newLeafNode(otherlv_6, grammarAccess.getARITHMETIC_OPAccess().getUdivKeyword_0_6());
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5027:7: otherlv_7= 'sdiv'
                    {
                    otherlv_7=(Token)match(input,177,FOLLOW_177_in_ruleARITHMETIC_OP11761); 

                        	newLeafNode(otherlv_7, grammarAccess.getARITHMETIC_OPAccess().getSdivKeyword_0_7());
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5032:7: otherlv_8= 'fdiv'
                    {
                    otherlv_8=(Token)match(input,178,FOLLOW_178_in_ruleARITHMETIC_OP11779); 

                        	newLeafNode(otherlv_8, grammarAccess.getARITHMETIC_OPAccess().getFdivKeyword_0_8());
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5037:7: otherlv_9= 'urem'
                    {
                    otherlv_9=(Token)match(input,179,FOLLOW_179_in_ruleARITHMETIC_OP11797); 

                        	newLeafNode(otherlv_9, grammarAccess.getARITHMETIC_OPAccess().getUremKeyword_0_9());
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5042:7: otherlv_10= 'srem'
                    {
                    otherlv_10=(Token)match(input,180,FOLLOW_180_in_ruleARITHMETIC_OP11815); 

                        	newLeafNode(otherlv_10, grammarAccess.getARITHMETIC_OPAccess().getSremKeyword_0_10());
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5047:7: otherlv_11= 'frem'
                    {
                    otherlv_11=(Token)match(input,181,FOLLOW_181_in_ruleARITHMETIC_OP11833); 

                        	newLeafNode(otherlv_11, grammarAccess.getARITHMETIC_OPAccess().getFremKeyword_0_11());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getARITHMETIC_OPAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleARITHMETIC_OP11850);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getARITHMETIC_OPAccess().getValuePairParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleValuePair_in_ruleARITHMETIC_OP11871);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5076:1: entryRuleLOGICAL_OP returns [EObject current=null] : iv_ruleLOGICAL_OP= ruleLOGICAL_OP EOF ;
    public final EObject entryRuleLOGICAL_OP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOGICAL_OP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5077:2: (iv_ruleLOGICAL_OP= ruleLOGICAL_OP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5078:2: iv_ruleLOGICAL_OP= ruleLOGICAL_OP EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_OPRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OP_in_entryRuleLOGICAL_OP11906);
            iv_ruleLOGICAL_OP=ruleLOGICAL_OP();

            state._fsp--;

             current =iv_ruleLOGICAL_OP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OP11916); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5085:1: ruleLOGICAL_OP returns [EObject current=null] : ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5088:28: ( ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5089:1: ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5089:1: ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5089:2: (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ruleType this_ValuePair_7= ruleValuePair
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5089:2: (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' )
            int alt112=6;
            switch ( input.LA(1) ) {
            case 182:
                {
                alt112=1;
                }
                break;
            case 183:
                {
                alt112=2;
                }
                break;
            case 184:
                {
                alt112=3;
                }
                break;
            case 69:
                {
                alt112=4;
                }
                break;
            case 71:
                {
                alt112=5;
                }
                break;
            case 72:
                {
                alt112=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5089:4: otherlv_0= 'shl'
                    {
                    otherlv_0=(Token)match(input,182,FOLLOW_182_in_ruleLOGICAL_OP11954); 

                        	newLeafNode(otherlv_0, grammarAccess.getLOGICAL_OPAccess().getShlKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5094:7: otherlv_1= 'lshr'
                    {
                    otherlv_1=(Token)match(input,183,FOLLOW_183_in_ruleLOGICAL_OP11972); 

                        	newLeafNode(otherlv_1, grammarAccess.getLOGICAL_OPAccess().getLshrKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5099:7: otherlv_2= 'ashr'
                    {
                    otherlv_2=(Token)match(input,184,FOLLOW_184_in_ruleLOGICAL_OP11990); 

                        	newLeafNode(otherlv_2, grammarAccess.getLOGICAL_OPAccess().getAshrKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5104:7: otherlv_3= 'and'
                    {
                    otherlv_3=(Token)match(input,69,FOLLOW_69_in_ruleLOGICAL_OP12008); 

                        	newLeafNode(otherlv_3, grammarAccess.getLOGICAL_OPAccess().getAndKeyword_0_3());
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5109:7: otherlv_4= 'or'
                    {
                    otherlv_4=(Token)match(input,71,FOLLOW_71_in_ruleLOGICAL_OP12026); 

                        	newLeafNode(otherlv_4, grammarAccess.getLOGICAL_OPAccess().getOrKeyword_0_4());
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5114:7: otherlv_5= 'xor'
                    {
                    otherlv_5=(Token)match(input,72,FOLLOW_72_in_ruleLOGICAL_OP12044); 

                        	newLeafNode(otherlv_5, grammarAccess.getLOGICAL_OPAccess().getXorKeyword_0_5());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getLOGICAL_OPAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_ruleLOGICAL_OP12061);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
             
                    newCompositeNode(grammarAccess.getLOGICAL_OPAccess().getValuePairParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleValuePair_in_ruleLOGICAL_OP12082);
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


    // $ANTLR start "entryRuleIndirectBranch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5143:1: entryRuleIndirectBranch returns [EObject current=null] : iv_ruleIndirectBranch= ruleIndirectBranch EOF ;
    public final EObject entryRuleIndirectBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5144:2: (iv_ruleIndirectBranch= ruleIndirectBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5145:2: iv_ruleIndirectBranch= ruleIndirectBranch EOF
            {
             newCompositeNode(grammarAccess.getIndirectBranchRule()); 
            pushFollow(FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch12117);
            iv_ruleIndirectBranch=ruleIndirectBranch();

            state._fsp--;

             current =iv_ruleIndirectBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndirectBranch12127); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5152:1: ruleIndirectBranch returns [EObject current=null] : (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5155:28: ( (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5156:1: (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5156:1: (otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5156:3: otherlv_0= 'indirectbr' ( (lv_adress_1_0= ruleTypeAndValue ) ) otherlv_2= ',' otherlv_3= '[' ( (lv_lList_4_0= ruleLabelList ) )? otherlv_5= ']'
            {
            otherlv_0=(Token)match(input,185,FOLLOW_185_in_ruleIndirectBranch12164); 

                	newLeafNode(otherlv_0, grammarAccess.getIndirectBranchAccess().getIndirectbrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5160:1: ( (lv_adress_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5161:1: (lv_adress_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5161:1: (lv_adress_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5162:3: lv_adress_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getAdressTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleIndirectBranch12185);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleIndirectBranch12197); 

                	newLeafNode(otherlv_2, grammarAccess.getIndirectBranchAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleIndirectBranch12209); 

                	newLeafNode(otherlv_3, grammarAccess.getIndirectBranchAccess().getLeftSquareBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5186:1: ( (lv_lList_4_0= ruleLabelList ) )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_VAR_TYPE||(LA113_0>=RULE_INTEGER && LA113_0<=RULE_INT)||LA113_0==32||(LA113_0>=40 && LA113_0<=51)) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5187:1: (lv_lList_4_0= ruleLabelList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5187:1: (lv_lList_4_0= ruleLabelList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5188:3: lv_lList_4_0= ruleLabelList
                    {
                     
                    	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getLListLabelListParserRuleCall_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelList_in_ruleIndirectBranch12230);
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

            otherlv_5=(Token)match(input,24,FOLLOW_24_in_ruleIndirectBranch12243); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5216:1: entryRuleLabelList returns [EObject current=null] : iv_ruleLabelList= ruleLabelList EOF ;
    public final EObject entryRuleLabelList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5217:2: (iv_ruleLabelList= ruleLabelList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5218:2: iv_ruleLabelList= ruleLabelList EOF
            {
             newCompositeNode(grammarAccess.getLabelListRule()); 
            pushFollow(FOLLOW_ruleLabelList_in_entryRuleLabelList12279);
            iv_ruleLabelList=ruleLabelList();

            state._fsp--;

             current =iv_ruleLabelList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelList12289); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5225:1: ruleLabelList returns [EObject current=null] : ( (lv_labels_0_0= ruleTypeAndValue ) )+ ;
    public final EObject ruleLabelList() throws RecognitionException {
        EObject current = null;

        EObject lv_labels_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5228:28: ( ( (lv_labels_0_0= ruleTypeAndValue ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5229:1: ( (lv_labels_0_0= ruleTypeAndValue ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5229:1: ( (lv_labels_0_0= ruleTypeAndValue ) )+
            int cnt114=0;
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==RULE_VAR_TYPE||(LA114_0>=RULE_INTEGER && LA114_0<=RULE_INT)||LA114_0==32||(LA114_0>=40 && LA114_0<=51)) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5230:1: (lv_labels_0_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5230:1: (lv_labels_0_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5231:3: lv_labels_0_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelListAccess().getLabelsTypeAndValueParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleLabelList12334);
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
            	    if ( cnt114 >= 1 ) break loop114;
                        EarlyExitException eee =
                            new EarlyExitException(114, input);
                        throw eee;
                }
                cnt114++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5255:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5256:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5257:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch12370);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch12380); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5264:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5267:28: ( (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5268:1: (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5268:1: (otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5268:3: otherlv_0= 'switch' ( (lv_value_1_0= ruleTypeAndValue ) ) otherlv_2= ',' ( (lv_default_3_0= ruleTypeAndValue ) ) otherlv_4= '[' ( (lv_jTable_5_0= ruleJumpTable ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,186,FOLLOW_186_in_ruleSwitch12417); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5272:1: ( (lv_value_1_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5273:1: (lv_value_1_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5273:1: (lv_value_1_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5274:3: lv_value_1_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getValueTypeAndValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSwitch12438);
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

            otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleSwitch12450); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getCommaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5294:1: ( (lv_default_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5295:1: (lv_default_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5295:1: (lv_default_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5296:3: lv_default_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleSwitch12471);
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

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleSwitch12483); 

                	newLeafNode(otherlv_4, grammarAccess.getSwitchAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5316:1: ( (lv_jTable_5_0= ruleJumpTable ) )?
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==RULE_VAR_TYPE||(LA115_0>=RULE_INTEGER && LA115_0<=RULE_INT)||LA115_0==32||(LA115_0>=40 && LA115_0<=51)) ) {
                alt115=1;
            }
            switch (alt115) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5317:1: (lv_jTable_5_0= ruleJumpTable )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5317:1: (lv_jTable_5_0= ruleJumpTable )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5318:3: lv_jTable_5_0= ruleJumpTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getSwitchAccess().getJTableJumpTableParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJumpTable_in_ruleSwitch12504);
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

            otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleSwitch12517); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5346:1: entryRuleJumpTable returns [EObject current=null] : iv_ruleJumpTable= ruleJumpTable EOF ;
    public final EObject entryRuleJumpTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpTable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5347:2: (iv_ruleJumpTable= ruleJumpTable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5348:2: iv_ruleJumpTable= ruleJumpTable EOF
            {
             newCompositeNode(grammarAccess.getJumpTableRule()); 
            pushFollow(FOLLOW_ruleJumpTable_in_entryRuleJumpTable12553);
            iv_ruleJumpTable=ruleJumpTable();

            state._fsp--;

             current =iv_ruleJumpTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJumpTable12563); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5355:1: ruleJumpTable returns [EObject current=null] : ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+ ;
    public final EObject ruleJumpTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_values_0_0 = null;

        EObject lv_destinations_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5358:28: ( ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5359:1: ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5359:1: ( ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) ) )+
            int cnt116=0;
            loop116:
            do {
                int alt116=2;
                int LA116_0 = input.LA(1);

                if ( (LA116_0==RULE_VAR_TYPE||(LA116_0>=RULE_INTEGER && LA116_0<=RULE_INT)||LA116_0==32||(LA116_0>=40 && LA116_0<=51)) ) {
                    alt116=1;
                }


                switch (alt116) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5359:2: ( (lv_values_0_0= ruleTypeAndValue ) ) otherlv_1= ',' ( (lv_destinations_2_0= ruleTypeAndValue ) )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5359:2: ( (lv_values_0_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5360:1: (lv_values_0_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5360:1: (lv_values_0_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5361:3: lv_values_0_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getValuesTypeAndValueParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleJumpTable12609);
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

            	    otherlv_1=(Token)match(input,23,FOLLOW_23_in_ruleJumpTable12621); 

            	        	newLeafNode(otherlv_1, grammarAccess.getJumpTableAccess().getCommaKeyword_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5381:1: ( (lv_destinations_2_0= ruleTypeAndValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5382:1: (lv_destinations_2_0= ruleTypeAndValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5382:1: (lv_destinations_2_0= ruleTypeAndValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5383:3: lv_destinations_2_0= ruleTypeAndValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getDestinationsTypeAndValueParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleJumpTable12642);
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
            	    if ( cnt116 >= 1 ) break loop116;
                        EarlyExitException eee =
                            new EarlyExitException(116, input);
                        throw eee;
                }
                cnt116++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5407:1: entryRuleInvoke returns [EObject current=null] : iv_ruleInvoke= ruleInvoke EOF ;
    public final EObject entryRuleInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoke = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5408:2: (iv_ruleInvoke= ruleInvoke EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5409:2: iv_ruleInvoke= ruleInvoke EOF
            {
             newCompositeNode(grammarAccess.getInvokeRule()); 
            pushFollow(FOLLOW_ruleInvoke_in_entryRuleInvoke12679);
            iv_ruleInvoke=ruleInvoke();

            state._fsp--;

             current =iv_ruleInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvoke12689); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5416:1: ruleInvoke returns [EObject current=null] : (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5419:28: ( (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5420:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5420:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5420:3: otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_function_3_0= ruleTypeAndValue ) ) ( (lv_pList_4_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_6= 'to' ( (lv_to_7_0= ruleTypeAndValue ) ) otherlv_8= 'unwind' ( (lv_unwind_9_0= ruleTypeAndValue ) )
            {
            otherlv_0=(Token)match(input,187,FOLLOW_187_in_ruleInvoke12726); 

                	newLeafNode(otherlv_0, grammarAccess.getInvokeAccess().getInvokeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5424:1: ( ruleCallingConv )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( ((LA117_0>=92 && LA117_0<=106)) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5425:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleInvoke12743);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5432:3: ( ruleRETURN_ATTRIBUTES )?
            int alt118=2;
            int LA118_0 = input.LA(1);

            if ( ((LA118_0>=83 && LA118_0<=90)) ) {
                alt118=1;
            }
            switch (alt118) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5433:5: ruleRETURN_ATTRIBUTES
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getRETURN_ATTRIBUTESParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleInvoke12761);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5440:3: ( (lv_function_3_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5441:1: (lv_function_3_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5441:1: (lv_function_3_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5442:3: lv_function_3_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getFunctionTypeAndValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke12783);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5458:2: ( (lv_pList_4_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5459:1: (lv_pList_4_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5459:1: (lv_pList_4_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5460:3: lv_pList_4_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleInvoke12804);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5476:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop119:
            do {
                int alt119=2;
                int LA119_0 = input.LA(1);

                if ( ((LA119_0>=107 && LA119_0<=124)) ) {
                    alt119=1;
                }


                switch (alt119) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5477:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_5()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke12821);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop119;
                }
            } while (true);

            otherlv_6=(Token)match(input,130,FOLLOW_130_in_ruleInvoke12834); 

                	newLeafNode(otherlv_6, grammarAccess.getInvokeAccess().getToKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5488:1: ( (lv_to_7_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5489:1: (lv_to_7_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5489:1: (lv_to_7_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5490:3: lv_to_7_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getToTypeAndValueParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke12855);
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

            otherlv_8=(Token)match(input,188,FOLLOW_188_in_ruleInvoke12867); 

                	newLeafNode(otherlv_8, grammarAccess.getInvokeAccess().getUnwindKeyword_8());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5510:1: ( (lv_unwind_9_0= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5511:1: (lv_unwind_9_0= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5511:1: (lv_unwind_9_0= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5512:3: lv_unwind_9_0= ruleTypeAndValue
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getUnwindTypeAndValueParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleInvoke12888);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5536:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5537:2: (iv_ruleResume= ruleResume EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5538:2: iv_ruleResume= ruleResume EOF
            {
             newCompositeNode(grammarAccess.getResumeRule()); 
            pushFollow(FOLLOW_ruleResume_in_entryRuleResume12924);
            iv_ruleResume=ruleResume();

            state._fsp--;

             current =iv_ruleResume; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResume12934); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5545:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_TypeAndValue_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5548:28: ( (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5549:1: (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5549:1: (otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5549:3: otherlv_0= 'resume' this_TypeAndValue_1= ruleTypeAndValue
            {
            otherlv_0=(Token)match(input,189,FOLLOW_189_in_ruleResume12971); 

                	newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getResumeAccess().getTypeAndValueParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleTypeAndValue_in_ruleResume12993);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5570:1: entryRuleUnreachable returns [EObject current=null] : iv_ruleUnreachable= ruleUnreachable EOF ;
    public final EObject entryRuleUnreachable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnreachable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5571:2: (iv_ruleUnreachable= ruleUnreachable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5572:2: iv_ruleUnreachable= ruleUnreachable EOF
            {
             newCompositeNode(grammarAccess.getUnreachableRule()); 
            pushFollow(FOLLOW_ruleUnreachable_in_entryRuleUnreachable13028);
            iv_ruleUnreachable=ruleUnreachable();

            state._fsp--;

             current =iv_ruleUnreachable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnreachable13038); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5579:1: ruleUnreachable returns [EObject current=null] : ( () otherlv_1= 'unreachable' ) ;
    public final EObject ruleUnreachable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5582:28: ( ( () otherlv_1= 'unreachable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5583:1: ( () otherlv_1= 'unreachable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5583:1: ( () otherlv_1= 'unreachable' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5583:2: () otherlv_1= 'unreachable'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5583:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5584:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnreachableAccess().getUnreachableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,190,FOLLOW_190_in_ruleUnreachable13084); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5601:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5602:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5603:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn13120);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn13130); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5610:1: ruleReturn returns [EObject current=null] : ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5613:28: ( ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5614:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5614:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )
            int alt122=2;
            alt122 = dfa122.predict(input);
            switch (alt122) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5614:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5614:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5614:3: () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5614:3: ()
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5615:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getReturnAccess().getReturnAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,191,FOLLOW_191_in_ruleReturn13177); 

                        	newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getRetKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleReturn13189); 

                        	newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getVoidKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5628:1: (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    int alt120=2;
                    int LA120_0 = input.LA(1);

                    if ( (LA120_0==23) ) {
                        alt120=1;
                    }
                    switch (alt120) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5628:3: otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT
                            {
                            otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleReturn13202); 

                                	newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getCommaKeyword_0_3_0());
                                
                            otherlv_4=(Token)match(input,192,FOLLOW_192_in_ruleReturn13214); 

                                	newLeafNode(otherlv_4, grammarAccess.getReturnAccess().getDbgKeyword_0_3_1());
                                
                            otherlv_5=(Token)match(input,193,FOLLOW_193_in_ruleReturn13226); 

                                	newLeafNode(otherlv_5, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_3_2());
                                
                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn13237); 
                             
                                newLeafNode(this_INT_6, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_3_3()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5645:6: (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5645:6: (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5645:8: otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )?
                    {
                    otherlv_7=(Token)match(input,191,FOLLOW_191_in_ruleReturn13258); 

                        	newLeafNode(otherlv_7, grammarAccess.getReturnAccess().getRetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5649:1: ( (lv_value_8_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5650:1: (lv_value_8_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5650:1: (lv_value_8_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5651:3: lv_value_8_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getReturnAccess().getValueTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleReturn13279);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5667:2: (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )?
                    int alt121=2;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==23) ) {
                        alt121=1;
                    }
                    switch (alt121) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5667:4: otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT
                            {
                            otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleReturn13292); 

                                	newLeafNode(otherlv_9, grammarAccess.getReturnAccess().getCommaKeyword_1_2_0());
                                
                            otherlv_10=(Token)match(input,192,FOLLOW_192_in_ruleReturn13304); 

                                	newLeafNode(otherlv_10, grammarAccess.getReturnAccess().getDbgKeyword_1_2_1());
                                
                            otherlv_11=(Token)match(input,193,FOLLOW_193_in_ruleReturn13316); 

                                	newLeafNode(otherlv_11, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_2_2());
                                
                            this_INT_12=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn13327); 
                             
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5691:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5692:2: (iv_ruleBranch= ruleBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5693:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_ruleBranch_in_entryRuleBranch13365);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranch13375); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5700:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5703:28: ( ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5704:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5704:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )
            int alt123=2;
            alt123 = dfa123.predict(input);
            switch (alt123) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5704:2: (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5704:2: (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5704:4: otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) )
                    {
                    otherlv_0=(Token)match(input,194,FOLLOW_194_in_ruleBranch13413); 

                        	newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBrKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5708:1: ( (lv_destination_1_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5709:1: (lv_destination_1_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5709:1: (lv_destination_1_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5710:3: lv_destination_1_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getDestinationTypeAndValueParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch13434);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5727:6: (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5727:6: (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5727:8: otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) )
                    {
                    otherlv_2=(Token)match(input,194,FOLLOW_194_in_ruleBranch13454); 

                        	newLeafNode(otherlv_2, grammarAccess.getBranchAccess().getBrKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5731:1: ( (lv_cond_3_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5732:1: (lv_cond_3_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5732:1: (lv_cond_3_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5733:3: lv_cond_3_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getCondTypeAndValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch13475);
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

                    otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleBranch13487); 

                        	newLeafNode(otherlv_4, grammarAccess.getBranchAccess().getCommaKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5753:1: ( (lv_labelTrue_5_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5754:1: (lv_labelTrue_5_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5754:1: (lv_labelTrue_5_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5755:3: lv_labelTrue_5_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelTrueTypeAndValueParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch13508);
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

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleBranch13520); 

                        	newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5775:1: ( (lv_labelFalse_7_0= ruleTypeAndValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5776:1: (lv_labelFalse_7_0= ruleTypeAndValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5776:1: (lv_labelFalse_7_0= ruleTypeAndValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5777:3: lv_labelFalse_7_0= ruleTypeAndValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelFalseTypeAndValueParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeAndValue_in_ruleBranch13541);
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


    // $ANTLR start "entryRuleVISIBILITY"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5801:1: entryRuleVISIBILITY returns [String current=null] : iv_ruleVISIBILITY= ruleVISIBILITY EOF ;
    public final String entryRuleVISIBILITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVISIBILITY = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5802:2: (iv_ruleVISIBILITY= ruleVISIBILITY EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5803:2: iv_ruleVISIBILITY= ruleVISIBILITY EOF
            {
             newCompositeNode(grammarAccess.getVISIBILITYRule()); 
            pushFollow(FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY13579);
            iv_ruleVISIBILITY=ruleVISIBILITY();

            state._fsp--;

             current =iv_ruleVISIBILITY.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVISIBILITY13590); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5810:1: ruleVISIBILITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'default' | kw= 'hidden' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleVISIBILITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5813:28: ( (kw= 'default' | kw= 'hidden' | kw= 'protected' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5814:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5814:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            int alt124=3;
            switch ( input.LA(1) ) {
            case 195:
                {
                alt124=1;
                }
                break;
            case 196:
                {
                alt124=2;
                }
                break;
            case 197:
                {
                alt124=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 124, 0, input);

                throw nvae;
            }

            switch (alt124) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5815:2: kw= 'default'
                    {
                    kw=(Token)match(input,195,FOLLOW_195_in_ruleVISIBILITY13628); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVISIBILITYAccess().getDefaultKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5822:2: kw= 'hidden'
                    {
                    kw=(Token)match(input,196,FOLLOW_196_in_ruleVISIBILITY13647); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVISIBILITYAccess().getHiddenKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5829:2: kw= 'protected'
                    {
                    kw=(Token)match(input,197,FOLLOW_197_in_ruleVISIBILITY13666); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5842:1: entryRuleLINKAGE returns [String current=null] : iv_ruleLINKAGE= ruleLINKAGE EOF ;
    public final String entryRuleLINKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLINKAGE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5843:2: (iv_ruleLINKAGE= ruleLINKAGE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5844:2: iv_ruleLINKAGE= ruleLINKAGE EOF
            {
             newCompositeNode(grammarAccess.getLINKAGERule()); 
            pushFollow(FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE13707);
            iv_ruleLINKAGE=ruleLINKAGE();

            state._fsp--;

             current =iv_ruleLINKAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLINKAGE13718); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5851:1: ruleLINKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE ) ;
    public final AntlrDatatypeRuleToken ruleLINKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ALIAS_LINKAGE_12 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5854:28: ( (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5855:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5855:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE )
            int alt125=13;
            switch ( input.LA(1) ) {
            case 198:
                {
                alt125=1;
                }
                break;
            case 199:
                {
                alt125=2;
                }
                break;
            case 200:
                {
                alt125=3;
                }
                break;
            case 201:
                {
                alt125=4;
                }
                break;
            case 202:
                {
                alt125=5;
                }
                break;
            case 203:
                {
                alt125=6;
                }
                break;
            case 204:
                {
                alt125=7;
                }
                break;
            case 205:
                {
                alt125=8;
                }
                break;
            case 206:
                {
                alt125=9;
                }
                break;
            case 207:
                {
                alt125=10;
                }
                break;
            case 208:
                {
                alt125=11;
                }
                break;
            case 209:
                {
                alt125=12;
                }
                break;
            case 210:
            case 211:
            case 212:
            case 213:
                {
                alt125=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }

            switch (alt125) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5856:2: kw= 'private'
                    {
                    kw=(Token)match(input,198,FOLLOW_198_in_ruleLINKAGE13756); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5863:2: kw= 'linker_private'
                    {
                    kw=(Token)match(input,199,FOLLOW_199_in_ruleLINKAGE13775); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinker_privateKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5870:2: kw= 'linker_private_weak'
                    {
                    kw=(Token)match(input,200,FOLLOW_200_in_ruleLINKAGE13794); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinker_private_weakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5877:2: kw= 'available_externally'
                    {
                    kw=(Token)match(input,201,FOLLOW_201_in_ruleLINKAGE13813); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getAvailable_externallyKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5884:2: kw= 'linkonce'
                    {
                    kw=(Token)match(input,202,FOLLOW_202_in_ruleLINKAGE13832); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonceKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5891:2: kw= 'common'
                    {
                    kw=(Token)match(input,203,FOLLOW_203_in_ruleLINKAGE13851); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getCommonKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5898:2: kw= 'appending'
                    {
                    kw=(Token)match(input,204,FOLLOW_204_in_ruleLINKAGE13870); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getAppendingKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5905:2: kw= 'extern_weak'
                    {
                    kw=(Token)match(input,205,FOLLOW_205_in_ruleLINKAGE13889); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getExtern_weakKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5912:2: kw= 'linkonce_odr'
                    {
                    kw=(Token)match(input,206,FOLLOW_206_in_ruleLINKAGE13908); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonce_odrKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5919:2: kw= 'linkonce_odr_auto_hide'
                    {
                    kw=(Token)match(input,207,FOLLOW_207_in_ruleLINKAGE13927); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonce_odr_auto_hideKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5926:2: kw= 'dllimport'
                    {
                    kw=(Token)match(input,208,FOLLOW_208_in_ruleLINKAGE13946); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getDllimportKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5933:2: kw= 'dllexport'
                    {
                    kw=(Token)match(input,209,FOLLOW_209_in_ruleLINKAGE13965); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getDllexportKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5940:5: this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE
                    {
                     
                            newCompositeNode(grammarAccess.getLINKAGEAccess().getALIAS_LINKAGEParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_ruleLINKAGE13993);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5958:1: entryRuleALIAS_LINKAGE returns [String current=null] : iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF ;
    public final String entryRuleALIAS_LINKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALIAS_LINKAGE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5959:2: (iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5960:2: iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF
            {
             newCompositeNode(grammarAccess.getALIAS_LINKAGERule()); 
            pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE14039);
            iv_ruleALIAS_LINKAGE=ruleALIAS_LINKAGE();

            state._fsp--;

             current =iv_ruleALIAS_LINKAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIAS_LINKAGE14050); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5967:1: ruleALIAS_LINKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) ;
    public final AntlrDatatypeRuleToken ruleALIAS_LINKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5970:28: ( (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5971:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5971:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            int alt126=4;
            switch ( input.LA(1) ) {
            case 210:
                {
                alt126=1;
                }
                break;
            case 211:
                {
                alt126=2;
                }
                break;
            case 212:
                {
                alt126=3;
                }
                break;
            case 213:
                {
                alt126=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5972:2: kw= 'external'
                    {
                    kw=(Token)match(input,210,FOLLOW_210_in_ruleALIAS_LINKAGE14088); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getExternalKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5979:2: kw= 'internal'
                    {
                    kw=(Token)match(input,211,FOLLOW_211_in_ruleALIAS_LINKAGE14107); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getInternalKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5986:2: kw= 'weak'
                    {
                    kw=(Token)match(input,212,FOLLOW_212_in_ruleALIAS_LINKAGE14126); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getWeakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5993:2: kw= 'weak_odr'
                    {
                    kw=(Token)match(input,213,FOLLOW_213_in_ruleALIAS_LINKAGE14145); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6006:1: entryRuleMetadataValue returns [String current=null] : iv_ruleMetadataValue= ruleMetadataValue EOF ;
    public final String entryRuleMetadataValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetadataValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6007:2: (iv_ruleMetadataValue= ruleMetadataValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6008:2: iv_ruleMetadataValue= ruleMetadataValue EOF
            {
             newCompositeNode(grammarAccess.getMetadataValueRule()); 
            pushFollow(FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue14186);
            iv_ruleMetadataValue=ruleMetadataValue();

            state._fsp--;

             current =iv_ruleMetadataValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadataValue14197); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6015:1: ruleMetadataValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )? ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6018:28: ( ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6019:1: ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6019:1: ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6019:2: ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6019:2: ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) )
            int alt127=3;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==193) ) {
                int LA127_1 = input.LA(2);

                if ( (LA127_1==RULE_INT) ) {
                    alt127=1;
                }
                else if ( (LA127_1==RULE_NOBRACKET) ) {
                    alt127=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 127, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA127_0==214) ) {
                alt127=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 127, 0, input);

                throw nvae;
            }
            switch (alt127) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6019:3: (kw= '!' this_INT_1= RULE_INT )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6019:3: (kw= '!' this_INT_1= RULE_INT )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6020:2: kw= '!' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14237); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_0_0_0()); 
                        
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetadataValue14252); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getMetadataValueAccess().getINTTerminalRuleCall_0_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6033:6: (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6033:6: (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6034:2: kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}'
                    {
                    kw=(Token)match(input,214,FOLLOW_214_in_ruleMetadataValue14278); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_0_1_0()); 
                        
                    this_NOBRACKET_3=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14293); 

                    		current.merge(this_NOBRACKET_3);
                        
                     
                        newLeafNode(this_NOBRACKET_3, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_0_1_1()); 
                        
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleMetadataValue14311); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getRightCurlyBracketKeyword_0_1_2()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6053:6: (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6053:6: (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6054:2: kw= '!' this_NOBRACKET_6= RULE_NOBRACKET
                    {
                    kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14332); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_0_2_0()); 
                        
                    this_NOBRACKET_6=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14347); 

                    		current.merge(this_NOBRACKET_6);
                        
                     
                        newLeafNode(this_NOBRACKET_6, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_0_2_1()); 
                        

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6066:3: (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) ) )?
            int alt132=2;
            int LA132_0 = input.LA(1);

            if ( (LA132_0==20) ) {
                alt132=1;
            }
            switch (alt132) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6067:2: kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) )
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleMetadataValue14368); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getEqualsSignKeyword_1_0()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6072:1: ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? ) )
                    int alt131=4;
                    switch ( input.LA(1) ) {
                    case 193:
                        {
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
                        break;
                    case 214:
                        {
                        alt131=2;
                        }
                        break;
                    case 215:
                        {
                        alt131=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }

                    switch (alt131) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6072:2: (kw= '!' this_INT_9= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6072:2: (kw= '!' this_INT_9= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6073:2: kw= '!' this_INT_9= RULE_INT
                            {
                            kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14383); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_0_0()); 
                                
                            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetadataValue14398); 

                            		current.merge(this_INT_9);
                                
                             
                                newLeafNode(this_INT_9, grammarAccess.getMetadataValueAccess().getINTTerminalRuleCall_1_1_0_1()); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6086:6: (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6086:6: (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6087:2: kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}'
                            {
                            kw=(Token)match(input,214,FOLLOW_214_in_ruleMetadataValue14424); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_1_1_1_0()); 
                                
                            this_NOBRACKET_11=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14439); 

                            		current.merge(this_NOBRACKET_11);
                                
                             
                                newLeafNode(this_NOBRACKET_11, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_1_1_1_1()); 
                                
                            kw=(Token)match(input,33,FOLLOW_33_in_ruleMetadataValue14457); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getRightCurlyBracketKeyword_1_1_1_2()); 
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6106:6: (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6106:6: (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6107:2: kw= '!' this_NOBRACKET_14= RULE_NOBRACKET
                            {
                            kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14478); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_2_0()); 
                                
                            this_NOBRACKET_14=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14493); 

                            		current.merge(this_NOBRACKET_14);
                                
                             
                                newLeafNode(this_NOBRACKET_14, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_1_1_2_1()); 
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6120:6: (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6120:6: (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )? )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6121:2: kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )?
                            {
                            kw=(Token)match(input,215,FOLLOW_215_in_ruleMetadataValue14519); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getMetadataKeyword_1_1_3_0()); 
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6126:1: ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}' )?
                            int alt130=2;
                            int LA130_0 = input.LA(1);

                            if ( (LA130_0==193) ) {
                                int LA130_1 = input.LA(2);

                                if ( (LA130_1==32) ) {
                                    alt130=1;
                                }
                            }
                            else if ( (LA130_0==214) ) {
                                int LA130_2 = input.LA(2);

                                if ( (LA130_2==215) ) {
                                    alt130=1;
                                }
                            }
                            switch (alt130) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6126:2: ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE ) kw= '}'
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6126:2: ( (kw= '!' kw= '{' ) | kw= '!{' )
                                    int alt128=2;
                                    int LA128_0 = input.LA(1);

                                    if ( (LA128_0==193) ) {
                                        alt128=1;
                                    }
                                    else if ( (LA128_0==214) ) {
                                        alt128=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 128, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt128) {
                                        case 1 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6126:3: (kw= '!' kw= '{' )
                                            {
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6126:3: (kw= '!' kw= '{' )
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6127:2: kw= '!' kw= '{'
                                            {
                                            kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14535); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_3_1_0_0_0()); 
                                                
                                            kw=(Token)match(input,32,FOLLOW_32_in_ruleMetadataValue14548); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getLeftCurlyBracketKeyword_1_1_3_1_0_0_1()); 
                                                

                                            }


                                            }
                                            break;
                                        case 2 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6140:2: kw= '!{'
                                            {
                                            kw=(Token)match(input,214,FOLLOW_214_in_ruleMetadataValue14568); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_1_1_3_1_0_1()); 
                                                

                                            }
                                            break;

                                    }

                                    kw=(Token)match(input,215,FOLLOW_215_in_ruleMetadataValue14582); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getMetadataKeyword_1_1_3_1_1()); 
                                        
                                    kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14595); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_3_1_2()); 
                                        
                                    this_STRING_21=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadataValue14610); 

                                    		current.merge(this_STRING_21);
                                        
                                     
                                        newLeafNode(this_STRING_21, grammarAccess.getMetadataValueAccess().getSTRINGTerminalRuleCall_1_1_3_1_3()); 
                                        
                                    kw=(Token)match(input,23,FOLLOW_23_in_ruleMetadataValue14628); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getCommaKeyword_1_1_3_1_4()); 
                                        
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6170:1: ( (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) | this_BASIC_TYPE_26= ruleBASIC_TYPE )
                                    int alt129=2;
                                    int LA129_0 = input.LA(1);

                                    if ( (LA129_0==215) ) {
                                        alt129=1;
                                    }
                                    else if ( ((LA129_0>=40 && LA129_0<=45)) ) {
                                        alt129=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 129, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt129) {
                                        case 1 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6170:2: (kw= 'metadata' kw= '!' this_INT_25= RULE_INT )
                                            {
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6170:2: (kw= 'metadata' kw= '!' this_INT_25= RULE_INT )
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6171:2: kw= 'metadata' kw= '!' this_INT_25= RULE_INT
                                            {
                                            kw=(Token)match(input,215,FOLLOW_215_in_ruleMetadataValue14643); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getMetadataKeyword_1_1_3_1_5_0_0()); 
                                                
                                            kw=(Token)match(input,193,FOLLOW_193_in_ruleMetadataValue14656); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_3_1_5_0_1()); 
                                                
                                            this_INT_25=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetadataValue14671); 

                                            		current.merge(this_INT_25);
                                                
                                             
                                                newLeafNode(this_INT_25, grammarAccess.getMetadataValueAccess().getINTTerminalRuleCall_1_1_3_1_5_0_2()); 
                                                

                                            }


                                            }
                                            break;
                                        case 2 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6191:5: this_BASIC_TYPE_26= ruleBASIC_TYPE
                                            {
                                             
                                                    newCompositeNode(grammarAccess.getMetadataValueAccess().getBASIC_TYPEParserRuleCall_1_1_3_1_5_1()); 
                                                
                                            pushFollow(FOLLOW_ruleBASIC_TYPE_in_ruleMetadataValue14705);
                                            this_BASIC_TYPE_26=ruleBASIC_TYPE();

                                            state._fsp--;


                                            		current.merge(this_BASIC_TYPE_26);
                                                
                                             
                                                    afterParserOrEnumRuleCall();
                                                

                                            }
                                            break;

                                    }

                                    kw=(Token)match(input,33,FOLLOW_33_in_ruleMetadataValue14724); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6215:1: entryRuleALIGNMENT returns [String current=null] : iv_ruleALIGNMENT= ruleALIGNMENT EOF ;
    public final String entryRuleALIGNMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALIGNMENT = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6216:2: (iv_ruleALIGNMENT= ruleALIGNMENT EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6217:2: iv_ruleALIGNMENT= ruleALIGNMENT EOF
            {
             newCompositeNode(grammarAccess.getALIGNMENTRule()); 
            pushFollow(FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT14771);
            iv_ruleALIGNMENT=ruleALIGNMENT();

            state._fsp--;

             current =iv_ruleALIGNMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIGNMENT14782); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6224:1: ruleALIGNMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'align' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleALIGNMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6227:28: ( (kw= 'align' this_INT_1= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6228:1: (kw= 'align' this_INT_1= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6228:1: (kw= 'align' this_INT_1= RULE_INT )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6229:2: kw= 'align' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,79,FOLLOW_79_in_ruleALIGNMENT14820); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getALIGNMENTAccess().getAlignKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleALIGNMENT14835); 

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


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA122 dfa122 = new DFA122(this);
    protected DFA123 dfa123 = new DFA123(this);
    static final String DFA41_eotS =
        "\27\uffff";
    static final String DFA41_eofS =
        "\27\uffff";
    static final String DFA41_minS =
        "\1\44\1\115\25\uffff";
    static final String DFA41_maxS =
        "\1\u00b8\1\120\25\uffff";
    static final String DFA41_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25";
    static final String DFA41_specialS =
        "\27\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\1\17\uffff\1\5\1\uffff\1\16\1\15\1\4\7\uffff\1\20\1\21\1"+
            "\uffff\2\7\1\6\1\uffff\2\6\4\uffff\1\2\2\uffff\1\3\2\24\10\uffff"+
            "\1\17\41\uffff\1\22\1\26\6\uffff\1\23\1\25\1\14\1\13\1\12\14"+
            "\11\2\10\24\uffff\12\7\3\6",
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
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "1220:1: ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad )";
        }
    }
    static final String DFA104_eotS =
        "\u0098\uffff";
    static final String DFA104_eofS =
        "\u0098\uffff";
    static final String DFA104_minS =
        "\1\176\2\6\1\40\17\123\17\27\1\123\1\6\10\177\2\6\17\27\1\47\1"+
        "\6\1\uffff\17\6\17\27\1\6\1\123\17\27\1\uffff\10\6\17\27\1\6\17"+
        "\27\1\6";
    static final String DFA104_maxS =
        "\1\176\2\63\1\40\17\177\17\41\1\177\1\63\10\177\2\63\17\41\1\47"+
        "\1\63\1\uffff\17\u0095\17\41\1\63\1\177\17\132\1\uffff\10\u0095"+
        "\17\41\1\63\17\132\1\u0095";
    static final String DFA104_acceptS =
        "\77\uffff\1\2\57\uffff\1\1\50\uffff";
    static final String DFA104_specialS =
        "\u0098\uffff}>";
    static final String[] DFA104_transitionS = {
            "\1\1",
            "\1\4\1\uffff\1\5\1\22\26\uffff\1\2\5\uffff\1\3\1\uffff\1\14"+
            "\1\15\1\16\1\17\1\20\1\21\1\6\1\7\1\10\1\11\1\12\1\13",
            "\1\23\1\uffff\1\24\1\41\27\uffff\1\42\6\uffff\1\33\1\34\1"+
            "\35\1\36\1\37\1\40\1\25\1\26\1\27\1\30\1\31\1\32",
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
            "\1\56\1\uffff\1\57\1\74\27\uffff\1\75\6\uffff\1\66\1\67\1"+
            "\70\1\71\1\72\1\73\1\60\1\61\1\62\1\63\1\64\1\65",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\54",
            "\1\100\1\uffff\1\101\1\116\26\uffff\1\76\5\uffff\1\77\1\uffff"+
            "\1\110\1\111\1\112\1\113\1\114\1\115\1\102\1\103\1\104\1\105"+
            "\1\106\1\107",
            "\1\117\1\uffff\1\120\1\135\36\uffff\1\127\1\130\1\131\1\132"+
            "\1\133\1\134\1\121\1\122\1\123\1\124\1\125\1\126",
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
            "\1\140\1\uffff\1\141\1\156\26\uffff\1\157\1\77\4\uffff\1\157"+
            "\1\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\142\1\143\1\144"+
            "\1\145\1\146\1\147",
            "",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\1\160\1\161\1\162\1\163\1\164\1\165\1\166\1"+
            "\167\57\uffff\14\77",
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
            "\1\170\1\uffff\1\171\1\u0086\36\uffff\1\u0080\1\u0081\1\u0082"+
            "\1\u0083\1\u0084\1\u0085\1\172\1\173\1\174\1\175\1\176\1\177",
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\44\uffff\1\54",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "\1\u0087\11\uffff\1\77\61\uffff\10\157",
            "",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\126\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\126\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\126\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\126\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\126\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\126\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\126\uffff\14\77",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\126\uffff\14\77",
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
            "\1\u0088\1\uffff\1\u0089\1\u0096\26\uffff\1\157\5\uffff\1"+
            "\157\1\uffff\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095"+
            "\1\u008a\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\77\11\uffff\1\u0097\61\uffff\10\157",
            "\1\157\1\uffff\2\157\26\uffff\1\157\5\uffff\1\157\1\uffff"+
            "\14\157\37\uffff\10\77\57\uffff\14\77"
    };

    static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
    static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
    static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
    static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
    static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
    static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
    static final short[][] DFA104_transition;

    static {
        int numStates = DFA104_transitionS.length;
        DFA104_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
        }
    }

    class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = DFA104_eot;
            this.eof = DFA104_eof;
            this.min = DFA104_min;
            this.max = DFA104_max;
            this.accept = DFA104_accept;
            this.special = DFA104_special;
            this.transition = DFA104_transition;
        }
        public String getDescription() {
            return "3781:1: ( (otherlv_0= 'landingpad' ( (lv_type_1_0= ruleType ) ) otherlv_2= 'personality' ( (lv_personality_3_0= ruleTypeAndValue ) ) ( (otherlv_4= 'cleanup' ( (lv_clause_5_0= ruleClause ) )* ) | ( (lv_clause_6_0= ruleClause ) )+ ) ) | (otherlv_7= 'landingpad' ( (lv_type_8_0= ruleType ) ) otherlv_9= 'personality' ( (lv_personalitytype_10_0= ruleType ) ) ( (lv_personalityfunction_11_0= ruleCAST_TYPE ) ) otherlv_12= '(' ( (lv_value_13_0= ruleType ) ) otherlv_14= '(...)*' this_VAR_TYPE_15= RULE_VAR_TYPE otherlv_16= 'to' ( (lv_castto_17_0= ruleType ) ) otherlv_18= ')' ( (otherlv_19= 'cleanup' ( (lv_clause_20_0= ruleClause ) )* ) | ( (lv_clause_21_0= ruleClause ) )+ ) ) )";
        }
    }
    static final String DFA122_eotS =
        "\140\uffff";
    static final String DFA122_eofS =
        "\2\uffff\1\4\4\uffff\17\3\17\uffff\1\3\1\uffff\10\3\41\uffff\1"+
        "\3\17\uffff";
    static final String DFA122_minS =
        "\1\u00bf\2\6\2\uffff\1\6\1\40\17\6\17\27\13\6\17\27\1\47\17\27"+
        "\2\6\17\27";
    static final String DFA122_maxS =
        "\1\u00bf\1\63\1\u00c2\2\uffff\1\63\1\40\17\u00c2\17\41\1\u00c2"+
        "\1\63\10\u00c2\1\63\17\41\1\47\17\41\1\63\1\u00c2\17\41";
    static final String DFA122_acceptS =
        "\3\uffff\1\2\1\1\133\uffff";
    static final String DFA122_specialS =
        "\140\uffff}>";
    static final String[] DFA122_transitionS = {
            "\1\1",
            "\1\3\1\uffff\2\3\26\uffff\1\3\7\uffff\1\2\13\3",
            "\1\7\1\4\1\10\1\25\15\uffff\1\4\10\uffff\1\5\1\4\2\uffff\1"+
            "\4\1\uffff\1\6\1\uffff\1\17\1\20\1\21\1\22\1\23\1\24\1\11\1"+
            "\12\1\13\1\14\1\15\1\16\1\4\1\uffff\3\4\7\uffff\2\4\1\uffff"+
            "\3\4\1\uffff\2\4\4\uffff\1\4\2\uffff\3\4\10\3\1\4\41\uffff\2"+
            "\4\6\uffff\23\4\24\uffff\20\4\1\uffff\3\4\2\uffff\1\4",
            "",
            "",
            "\1\26\1\uffff\1\27\1\44\27\uffff\1\45\6\uffff\1\36\1\37\1"+
            "\40\1\41\1\42\1\43\1\30\1\31\1\32\1\33\1\34\1\35",
            "\1\46",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
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
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
            "\1\60\1\uffff\1\61\1\76\27\uffff\1\77\6\uffff\1\70\1\71\1"+
            "\72\1\73\1\74\1\75\1\62\1\63\1\64\1\65\1\66\1\67",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff"+
            "\23\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff"+
            "\23\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff"+
            "\23\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff"+
            "\23\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff"+
            "\23\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff"+
            "\23\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff"+
            "\23\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\10\uffff\1\3\41\uffff\2\3\6\uffff"+
            "\23\3\24\uffff\20\3\1\uffff\3\3\2\uffff\1\3",
            "\1\100\1\uffff\1\101\1\116\36\uffff\1\110\1\111\1\112\1\113"+
            "\1\114\1\115\1\102\1\103\1\104\1\105\1\106\1\107",
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
            "\1\121\1\uffff\1\122\1\137\36\uffff\1\131\1\132\1\133\1\134"+
            "\1\135\1\136\1\123\1\124\1\125\1\126\1\127\1\130",
            "\4\3\12\uffff\1\4\2\uffff\1\3\10\uffff\2\3\2\uffff\1\3\1\uffff"+
            "\1\3\1\uffff\15\3\1\uffff\3\3\7\uffff\2\3\1\uffff\3\3\1\uffff"+
            "\2\3\4\uffff\1\3\2\uffff\3\3\1\47\1\50\1\51\1\52\1\53\1\54\1"+
            "\55\1\56\1\3\41\uffff\2\3\6\uffff\23\3\24\uffff\20\3\1\uffff"+
            "\3\3\2\uffff\1\3",
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

    static final short[] DFA122_eot = DFA.unpackEncodedString(DFA122_eotS);
    static final short[] DFA122_eof = DFA.unpackEncodedString(DFA122_eofS);
    static final char[] DFA122_min = DFA.unpackEncodedStringToUnsignedChars(DFA122_minS);
    static final char[] DFA122_max = DFA.unpackEncodedStringToUnsignedChars(DFA122_maxS);
    static final short[] DFA122_accept = DFA.unpackEncodedString(DFA122_acceptS);
    static final short[] DFA122_special = DFA.unpackEncodedString(DFA122_specialS);
    static final short[][] DFA122_transition;

    static {
        int numStates = DFA122_transitionS.length;
        DFA122_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA122_transition[i] = DFA.unpackEncodedString(DFA122_transitionS[i]);
        }
    }

    class DFA122 extends DFA {

        public DFA122(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 122;
            this.eot = DFA122_eot;
            this.eof = DFA122_eof;
            this.min = DFA122_min;
            this.max = DFA122_max;
            this.accept = DFA122_accept;
            this.special = DFA122_special;
            this.transition = DFA122_transition;
        }
        public String getDescription() {
            return "5614:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_value_8_0= ruleTypeAndValue ) ) (otherlv_9= ',' otherlv_10= '!dbg' otherlv_11= '!' this_INT_12= RULE_INT )? ) )";
        }
    }
    static final String DFA123_eotS =
        "\u018a\uffff";
    static final String DFA123_eofS =
        "\34\uffff\17\126\40\uffff\1\126\1\uffff\10\126\137\uffff\1\126"+
        "\134\uffff\17\126\40\uffff\1\126\1\uffff\10\126\60\uffff\1\126\17"+
        "\uffff";
    static final String DFA123_minS =
        "\1\u00c2\32\6\1\40\20\6\1\40\36\27\12\6\2\uffff\20\27\1\6\10\27"+
        "\2\6\17\27\1\47\1\6\17\27\1\47\1\6\1\40\17\41\17\27\2\6\17\27\1"+
        "\6\20\27\1\41\1\6\10\41\1\6\36\27\1\6\17\27\1\47\1\6\1\40\17\6\17"+
        "\27\1\6\1\41\17\27\12\6\17\27\1\6\17\27\1\47\17\27\2\6\17\27";
    static final String DFA123_maxS =
        "\1\u00c2\1\63\17\132\12\63\1\40\17\u00c2\1\63\1\40\17\132\17\41"+
        "\1\u00c2\1\63\10\u00c2\2\uffff\17\41\1\132\1\63\10\27\2\63\17\41"+
        "\1\47\1\63\17\41\1\47\1\63\1\40\17\132\17\41\1\63\1\u00c2\17\41"+
        "\1\63\1\132\17\41\1\132\1\63\10\41\1\63\36\41\1\63\17\41\1\47\1"+
        "\63\1\40\17\u00c2\17\41\1\63\1\132\17\41\1\u00c2\1\63\10\u00c2\17"+
        "\41\1\63\17\41\1\47\17\41\1\63\1\u00c2\17\41";
    static final String DFA123_acceptS =
        "\125\uffff\1\2\1\1\u0133\uffff";
    static final String DFA123_specialS =
        "\u018a\uffff}>";
    static final String[] DFA123_transitionS = {
            "\1\1",
            "\1\2\1\uffff\1\3\1\20\26\uffff\1\21\7\uffff\1\12\1\13\1\14"+
            "\1\15\1\16\1\17\1\4\1\5\1\6\1\7\1\10\1\11",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43"+
            "\37\uffff\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31",
            "\1\55\1\uffff\1\56\1\73\26\uffff\1\53\5\uffff\1\54\1\uffff"+
            "\1\65\1\66\1\67\1\70\1\71\1\72\1\57\1\60\1\61\1\62\1\63\1\64",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\34\1\uffff\1\35\1\52\26\uffff\1\32\5\uffff\1\33\1\uffff"+
            "\1\44\1\45\1\46\1\47\1\50\1\51\1\36\1\37\1\40\1\41\1\42\1\43",
            "\1\74\1\uffff\1\75\1\112\27\uffff\1\113\6\uffff\1\104\1\105"+
            "\1\106\1\107\1\110\1\111\1\76\1\77\1\100\1\101\1\102\1\103",
            "\1\114",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\1\127\1\uffff\1\130\1\145\27\uffff\1\146\6\uffff\1\137\1"+
            "\140\1\141\1\142\1\143\1\144\1\131\1\132\1\133\1\134\1\135\1"+
            "\136",
            "\1\147",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
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
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
            "\1\162\1\uffff\1\163\1\u0080\27\uffff\1\u0081\6\uffff\1\172"+
            "\1\173\1\174\1\175\1\176\1\177\1\164\1\165\1\166\1\167\1\170"+
            "\1\171",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
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
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
            "\1\157",
            "\1\u0083\1\uffff\1\u0084\1\u0091\27\uffff\1\u0092\6\uffff"+
            "\1\u008b\1\u008c\1\u008d\1\u008e\1\u008f\1\u0090\1\u0085\1\u0086"+
            "\1\u0087\1\u0088\1\u0089\1\u008a",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\160",
            "\1\u0095\1\uffff\1\u0096\1\u00a3\26\uffff\1\u0093\5\uffff"+
            "\1\u0094\1\uffff\1\u009d\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2"+
            "\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c",
            "\1\u00a4\1\uffff\1\u00a5\1\u00b2\36\uffff\1\u00ac\1\u00ad"+
            "\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00a6\1\u00a7\1\u00a8\1\u00a9"+
            "\1\u00aa\1\u00ab",
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
            "\1\u00b5\1\uffff\1\u00b6\1\u00c3\36\uffff\1\u00bd\1\u00be"+
            "\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00b7\1\u00b8\1\u00b9\1\u00ba"+
            "\1\u00bb\1\u00bc",
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
            "\1\u00c6\1\uffff\1\u00c7\1\u00d4\27\uffff\1\u00d5\6\uffff"+
            "\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3\1\u00c8\1\u00c9"+
            "\1\u00ca\1\u00cb\1\u00cc\1\u00cd",
            "\1\u00d6",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
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
            "\1\u00e0\1\uffff\1\u00e1\1\u00ee\36\uffff\1\u00e8\1\u00e9"+
            "\1\u00ea\1\u00eb\1\u00ec\1\u00ed\1\u00e2\1\u00e3\1\u00e4\1\u00e5"+
            "\1\u00e6\1\u00e7",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\115\1\116\1"+
            "\117\1\120\1\121\1\122\1\123\1\124\1\126\41\uffff\2\126\6\uffff"+
            "\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff\1\126",
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
            "\1\u00ef\1\uffff\1\u00f0\1\u00fd\36\uffff\1\u00f7\1\u00f8"+
            "\1\u00f9\1\u00fa\1\u00fb\1\u00fc\1\u00f1\1\u00f2\1\u00f3\1\u00f4"+
            "\1\u00f5\1\u00f6",
            "\1\160\73\uffff\1\150\1\151\1\152\1\153\1\154\1\155\1\156"+
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
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
            "\1\u00dc\1\u00dd\1\u00de",
            "\1\u00ff\1\uffff\1\u0100\1\u010d\27\uffff\1\u010e\6\uffff"+
            "\1\u0107\1\u0108\1\u0109\1\u010a\1\u010b\1\u010c\1\u0101\1\u0102"+
            "\1\u0103\1\u0104\1\u0105\1\u0106",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u00df",
            "\1\u0111\1\uffff\1\u0112\1\u011f\26\uffff\1\u010f\5\uffff"+
            "\1\u0110\1\uffff\1\u0119\1\u011a\1\u011b\1\u011c\1\u011d\1\u011e"+
            "\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118",
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
            "\1\u0120\1\uffff\1\u0121\1\u012e\36\uffff\1\u0128\1\u0129"+
            "\1\u012a\1\u012b\1\u012c\1\u012d\1\u0122\1\u0123\1\u0124\1\u0125"+
            "\1\u0126\1\u0127",
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
            "\1\u0131\1\uffff\1\u0132\1\u013f\27\uffff\1\u0140\6\uffff"+
            "\1\u0139\1\u013a\1\u013b\1\u013c\1\u013d\1\u013e\1\u0133\1\u0134"+
            "\1\u0135\1\u0136\1\u0137\1\u0138",
            "\1\u0141",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
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
            "\1\u014a\1\uffff\1\u014b\1\u0158\36\uffff\1\u0152\1\u0153"+
            "\1\u0154\1\u0155\1\u0156\1\u0157\1\u014c\1\u014d\1\u014e\1\u014f"+
            "\1\u0150\1\u0151",
            "\1\u00df\61\uffff\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
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
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
            "\1\u015a\1\uffff\1\u015b\1\u0168\27\uffff\1\u0169\6\uffff"+
            "\1\u0162\1\u0163\1\u0164\1\u0165\1\u0166\1\u0167\1\u015c\1\u015d"+
            "\1\u015e\1\u015f\1\u0160\1\u0161",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\10\uffff\1\126"+
            "\41\uffff\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126"+
            "\2\uffff\1\126",
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
            "\1\u016a\1\uffff\1\u016b\1\u0178\36\uffff\1\u0172\1\u0173"+
            "\1\u0174\1\u0175\1\u0176\1\u0177\1\u016c\1\u016d\1\u016e\1\u016f"+
            "\1\u0170\1\u0171",
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
            "\1\u017b\1\uffff\1\u017c\1\u0189\36\uffff\1\u0183\1\u0184"+
            "\1\u0185\1\u0186\1\u0187\1\u0188\1\u017d\1\u017e\1\u017f\1\u0180"+
            "\1\u0181\1\u0182",
            "\4\126\15\uffff\1\125\10\uffff\2\126\2\uffff\1\126\1\uffff"+
            "\1\126\1\uffff\15\126\1\uffff\3\126\7\uffff\2\126\1\uffff\3"+
            "\126\1\uffff\2\126\4\uffff\1\126\2\uffff\3\126\1\u0142\1\u0143"+
            "\1\u0144\1\u0145\1\u0146\1\u0147\1\u0148\1\u0149\1\126\41\uffff"+
            "\2\126\6\uffff\23\126\24\uffff\20\126\1\uffff\3\126\2\uffff"+
            "\1\126",
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

    static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
    static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
    static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
    static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
    static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
    static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
    static final short[][] DFA123_transition;

    static {
        int numStates = DFA123_transitionS.length;
        DFA123_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
        }
    }

    class DFA123 extends DFA {

        public DFA123(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 123;
            this.eot = DFA123_eot;
            this.eof = DFA123_eof;
            this.min = DFA123_min;
            this.max = DFA123_max;
            this.accept = DFA123_accept;
            this.special = DFA123_special;
            this.transition = DFA123_transition;
        }
        public String getDescription() {
            return "5704:1: ( (otherlv_0= 'br' ( (lv_destination_1_0= ruleTypeAndValue ) ) ) | (otherlv_2= 'br' ( (lv_cond_3_0= ruleTypeAndValue ) ) otherlv_4= ',' ( (lv_labelTrue_5_0= ruleTypeAndValue ) ) otherlv_6= ',' ( (lv_labelFalse_7_0= ruleTypeAndValue ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLLVM_in_entryRuleLLVM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLVM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleLLVM130 = new BitSet(new long[]{0x000FFF4112228342L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement224 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement266 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelEntity325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleTopLevelEntity363 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleTopLevelEntity375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTopLevelEntity417 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleTopLevelEntity430 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19_in_ruleTopLevelEntity448 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTopLevelEntity461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTopLevelEntity503 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTopLevelEntity515 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTopLevelEntity527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity544 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleTopLevelEntity562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity579 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_24_in_ruleTopLevelEntity598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainLevelEntity645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_ruleMainLevelEntity692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVarInstruction_in_ruleMainLevelEntity719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_entryRuleFunctionHeader754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionHeader764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleFunctionHeader802 = new BitSet(new long[]{0x000FFF4112228340L,0x000007FFF7F80000L,0x0000000000000000L,0x00000000003FFFF8L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleFunctionHeader819 = new BitSet(new long[]{0x000FFF4112228340L,0x000007FFF7F80000L,0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader837 = new BitSet(new long[]{0x000FFF4112228340L,0x000007FFF7F80000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionHeader855 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader873 = new BitSet(new long[]{0x000FFF4112228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionHeader895 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader912 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleFunctionHeader938 = new BitSet(new long[]{0x000000010C000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_26_in_ruleFunctionHeader951 = new BitSet(new long[]{0x000000010C000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader970 = new BitSet(new long[]{0x000000010C000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_27_in_ruleFunctionHeader984 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionHeader995 = new BitSet(new long[]{0x000000010C000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader1013 = new BitSet(new long[]{0x000000010C000000L,0x1FFFF80000008000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionHeader1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleFunctionHeader1055 = new BitSet(new long[]{0x000FFF4112228340L,0x000007FFF7F80000L,0x0000000000000000L,0x00000000003FFFF8L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleFunctionHeader1072 = new BitSet(new long[]{0x000FFF4112228340L,0x000007FFF7F80000L,0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader1090 = new BitSet(new long[]{0x000FFF4112228340L,0x000007FFF7F80000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionHeader1108 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader1126 = new BitSet(new long[]{0x000FFF4112228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionHeader1148 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader1165 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleFunctionHeader1192 = new BitSet(new long[]{0x000000000C000002L,0x1FFFF80000008000L});
    public static final BitSet FOLLOW_29_in_ruleFunctionHeader1210 = new BitSet(new long[]{0x000000000C000002L,0x1FFFF80000008000L});
    public static final BitSet FOLLOW_26_in_ruleFunctionHeader1224 = new BitSet(new long[]{0x0000000008000002L,0x1FFFF80000008000L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader1243 = new BitSet(new long[]{0x0000000008000002L,0x1FFFF80000008000L});
    public static final BitSet FOLLOW_27_in_ruleFunctionHeader1257 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionHeader1268 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList1324 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleParameterList1380 = new BitSet(new long[]{0x000FFF4192228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleParameterList1402 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_23_in_ruleParameterList1415 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleParameterList1436 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_31_in_ruleParameterList1452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody1488 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody1498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleFunctionBody1544 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_32_in_ruleFunctionBody1557 = new BitSet(new long[]{0x01DFFF51122283C0L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_ruleFunctionBody1578 = new BitSet(new long[]{0x01DFFF53122283C0L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_33_in_ruleFunctionBody1591 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleFunctionBody1612 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock1649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicBlock1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleBasicBlock1702 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleBasicBlock1719 = new BitSet(new long[]{0x01DFFF5112228340L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleLocalVarInstruction_in_ruleBasicBlock1744 = new BitSet(new long[]{0x01DFFF5112228340L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBasicBlock1763 = new BitSet(new long[]{0x01DFFF5112228340L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleRet_Instr_in_ruleBasicBlock1788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRet_Instr_in_entryRuleRet_Instr1824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRet_Instr1834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleRet_Instr1881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_ruleRet_Instr1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleRet_Instr1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_ruleRet_Instr1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_ruleRet_Instr1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_ruleRet_Instr2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_ruleRet_Instr2043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_entryRuleTypeList2078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeList2088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleTypeList2134 = new BitSet(new long[]{0x000FFF4192A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeList2156 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_23_in_ruleTypeList2169 = new BitSet(new long[]{0x000FFF4192A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeList2190 = new BitSet(new long[]{0x0000000080800000L});
    public static final BitSet FOLLOW_31_in_ruleTypeList2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_entryRuleAggregate2242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregate2252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAggregate2289 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleAggregate2310 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAggregate2323 = new BitSet(new long[]{0x000FFF4312228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleAggregate2344 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAggregate2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLocalVarInstruction_in_entryRuleLocalVarInstruction2393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLocalVarInstruction2403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLocalVarInstruction2449 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleLocalVarInstruction2461 = new BitSet(new long[]{0x01DFFF7912228340L,0x60000000080721BBL,0xEFFFF00000FFFFE0L,0x0000000000000004L});
    public static final BitSet FOLLOW_35_in_ruleLocalVarInstruction2475 = new BitSet(new long[]{0x000FFF4112228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleLocalVarInstruction2496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleLocalVarInstruction2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleLocalVarInstruction2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction2588 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInstruction2637 = new BitSet(new long[]{0x0000001000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleLoad_in_ruleInstruction2661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleInstruction2681 = new BitSet(new long[]{0x0000001000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleStore_in_ruleInstruction2705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_ruleInstruction2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_ruleInstruction2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OP_in_ruleInstruction2787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleARITHMETIC_OP_in_ruleInstruction2814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleInstruction2841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleInstruction2868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_ruleInstruction2895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_ruleInstruction2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_ruleInstruction2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_ruleInstruction2976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_ruleInstruction3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_ruleInstruction3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_ruleInstruction3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_ruleInstruction3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_ruleInstruction3111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleInstruction3138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleInstruction3165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_ruleInstruction3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_ruleInstruction3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias3254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAlias3301 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L,0x0000000000000000L,0x00000000003FFFF8L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_ruleAlias3318 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L,0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleAlias3336 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAlias3358 = new BitSet(new long[]{0x000FFF4112228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlias3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType3416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType3427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_ruleType3475 = new BitSet(new long[]{0x0000000000000002L,0x0000000007F80000L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleType3501 = new BitSet(new long[]{0x0000000000000002L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleType3534 = new BitSet(new long[]{0x0000000000000002L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleType3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_entryRuleTypeAndValue3610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeAndValue3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleTypeAndValue3665 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleTypeAndValue3689 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleTypeAndValue3709 = new BitSet(new long[]{0x000FFF4112228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeAndValue3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_in_ruleTypeAndValue3760 = new BitSet(new long[]{0x000FFF4112228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeAndValue3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructType_in_entryRuleStructType3819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructType3830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleStructType3869 = new BitSet(new long[]{0x000FFF4312A28340L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType3886 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleStructType3919 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_23_in_ruleStructType3939 = new BitSet(new long[]{0x000FFF4312A28340L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType3955 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleStructType3988 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_33_in_ruleStructType4011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleStructType4032 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleStructType4045 = new BitSet(new long[]{0x000FFF4312A28340L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType4062 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleStructType4095 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_23_in_ruleStructType4115 = new BitSet(new long[]{0x000FFF4312A28340L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleStructType4131 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_ruleStructType4164 = new BitSet(new long[]{0x0000000200800000L});
    public static final BitSet FOLLOW_33_in_ruleStructType4187 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleStructType4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleB_TYPE_in_entryRuleB_TYPE4242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleB_TYPE4253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleB_TYPE4293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleF_POINT_in_ruleB_TYPE4326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBASIC_TYPE_in_ruleB_TYPE4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleB_TYPE4385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBASIC_TYPE_in_entryRuleBASIC_TYPE4431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBASIC_TYPE4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBASIC_TYPE4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBASIC_TYPE4499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBASIC_TYPE4518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBASIC_TYPE4537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleBASIC_TYPE4556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleBASIC_TYPE4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleF_POINT_in_entryRuleF_POINT4616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleF_POINT4627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleF_POINT4665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleF_POINT4684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleF_POINT4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleF_POINT4722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleF_POINT4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleF_POINT4760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr4800 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetElementPtr4810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleGetElementPtr4847 = new BitSet(new long[]{0x002FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_53_in_ruleGetElementPtr4860 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr4883 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleGetElementPtr4896 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleGetElementPtr4917 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_entryRuleExtractValue4955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractValue4965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleExtractValue5002 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleAggregate_in_ruleExtractValue5023 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleExtractValue5044 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleExtractValue5057 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExtractValue5074 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_entryRuleInsertValue5117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertValue5127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInsertValue5164 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleAggregate_in_ruleInsertValue5185 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertValue5206 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInsertValue5218 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertValue5239 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInsertValue5252 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInsertValue5269 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleFence_in_entryRuleFence5312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFence5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFence5359 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleFence5372 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleFence5395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_entryRuleATOMIC_ORDERING5432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATOMIC_ORDERING5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleATOMIC_ORDERING5481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleATOMIC_ORDERING5500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleATOMIC_ORDERING5519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleATOMIC_ORDERING5538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleATOMIC_ORDERING5557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleATOMIC_ORDERING5576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg5616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmpXchg5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleCmpXchg5663 = new BitSet(new long[]{0x000FFF5112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_36_in_ruleCmpXchg5676 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg5699 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCmpXchg5711 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg5732 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCmpXchg5744 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCmpXchg5765 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleCmpXchg5778 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleCmpXchg5801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW5837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRMW5847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAtomicRMW5884 = new BitSet(new long[]{0x0000001000000000L,0x0000000000001FFCL});
    public static final BitSet FOLLOW_36_in_ruleAtomicRMW5897 = new BitSet(new long[]{0x0000001000000000L,0x0000000000001FFCL});
    public static final BitSet FOLLOW_ruleBIN_OP_in_ruleAtomicRMW5915 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW5935 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAtomicRMW5947 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAtomicRMW5968 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleAtomicRMW5981 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleAtomicRMW6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBIN_OP_in_entryRuleBIN_OP6041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBIN_OP6052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleBIN_OP6090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleBIN_OP6109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleBIN_OP6128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleBIN_OP6147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBIN_OP6166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBIN_OP6185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleBIN_OP6204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleBIN_OP6223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBIN_OP6242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBIN_OP6261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBIN_OP6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_entryRuleLoad6320 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoad6330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleLoad6368 = new BitSet(new long[]{0x000FFF5112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_36_in_ruleLoad6381 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLoad6404 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleLoad6417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleLoad6434 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleLoad6456 = new BitSet(new long[]{0x0000000000800002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_77_in_ruleLoad6480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleLoad6492 = new BitSet(new long[]{0x000FFF5112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_36_in_ruleLoad6505 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLoad6528 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleLoad6541 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleLoad6564 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleLoad6577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleLoad6589 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoad6606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore6650 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleStore6698 = new BitSet(new long[]{0x000FFF5112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_36_in_ruleStore6711 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore6734 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStore6746 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore6767 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleStore6780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleStore6797 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleStore6819 = new BitSet(new long[]{0x0000000000800002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_80_in_ruleStore6843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleStore6855 = new BitSet(new long[]{0x000FFF5112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_36_in_ruleStore6868 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore6891 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleStore6903 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleStore6924 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_57_in_ruleStore6937 = new BitSet(new long[]{0xFE00000000000000L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleStore6960 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleStore6973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleStore6985 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStore7002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall7046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleCall7094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleCall7108 = new BitSet(new long[]{0x000FFF4112228340L,0x000007FFF7F80000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleCall7125 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleCall7143 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCall7165 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleCall7186 = new BitSet(new long[]{0x0000000000000002L,0x1FFFF80000000000L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall7203 = new BitSet(new long[]{0x0000000000000002L,0x1FFFF80000000000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES7241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES7252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleRETURN_ATTRIBUTES7290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleRETURN_ATTRIBUTES7309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleRETURN_ATTRIBUTES7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleRETURN_ATTRIBUTES7347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleRETURN_ATTRIBUTES7366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRETURN_ATTRIBUTES7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRETURN_ATTRIBUTES7404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRETURN_ATTRIBUTES7423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_entryRuleAlloc7463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlloc7473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleAlloc7510 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlloc7531 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleAlloc7544 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleAlloc7565 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleAlloc7580 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleAlloc7596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_entryRuleCallingConv7634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallingConv7645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleCallingConv7683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleCallingConv7702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleCallingConv7721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleCallingConv7740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleCallingConv7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleCallingConv7778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleCallingConv7797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleCallingConv7816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleCallingConv7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleCallingConv7854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleCallingConv7873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleCallingConv7892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleCallingConv7911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleCallingConv7930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleCallingConv7950 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleCallingConv7963 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv7978 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCallingConv7996 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES8058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleFUNCTION_ATTRIBUTES8107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleFUNCTION_ATTRIBUTES8127 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleFUNCTION_ATTRIBUTES8140 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleFUNCTION_ATTRIBUTES8153 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFUNCTION_ATTRIBUTES8168 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleFUNCTION_ATTRIBUTES8186 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleFUNCTION_ATTRIBUTES8199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleFUNCTION_ATTRIBUTES8219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleFUNCTION_ATTRIBUTES8238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleFUNCTION_ATTRIBUTES8257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleFUNCTION_ATTRIBUTES8276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleFUNCTION_ATTRIBUTES8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleFUNCTION_ATTRIBUTES8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleFUNCTION_ATTRIBUTES8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleFUNCTION_ATTRIBUTES8352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleFUNCTION_ATTRIBUTES8371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleFUNCTION_ATTRIBUTES8390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleFUNCTION_ATTRIBUTES8409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleFUNCTION_ATTRIBUTES8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleFUNCTION_ATTRIBUTES8447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleFUNCTION_ATTRIBUTES8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleFUNCTION_ATTRIBUTES8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleFUNCTION_ATTRIBUTES8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_entryRulePHI8544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePHI8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_rulePHI8591 = new BitSet(new long[]{0x000FFF4112628340L});
    public static final BitSet FOLLOW_ruleType_in_rulePHI8607 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePHI8618 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI8639 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePHI8651 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_rulePHI8664 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePHI8676 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI8697 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePHI8709 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleValuePair_in_entryRuleValuePair8747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuePair8757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleValuePair8803 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleValuePair8815 = new BitSet(new long[]{0x000FFF4112228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleValuePair8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_entryRuleLandingPad8872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLandingPad8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleLandingPad8920 = new BitSet(new long[]{0x000FFF4112228340L,0x8000000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad8941 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleLandingPad8953 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLandingPad8974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_128_in_ruleLandingPad8988 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad9009 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad9038 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_126_in_ruleLandingPad9060 = new BitSet(new long[]{0x000FFF4112228340L,0x8000000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad9081 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleLandingPad9093 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000000000000L,0x00000000003FFC00L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad9114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000003FFC00L});
    public static final BitSet FOLLOW_ruleCAST_TYPE_in_ruleLandingPad9135 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleLandingPad9147 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad9168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleLandingPad9180 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleLandingPad9191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleLandingPad9202 = new BitSet(new long[]{0x000FFF4192228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad9223 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleLandingPad9235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_128_in_ruleLandingPad9249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad9270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad9299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000019L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause9338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause9348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_131_in_ruleClause9386 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause9408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_132_in_ruleClause9427 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause9448 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleClause9461 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleClause9482 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect9521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect9531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_133_in_ruleSelect9568 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect9589 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSelect9601 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect9622 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSelect9634 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSelect9655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg9691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVA_Arg9701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleVA_Arg9738 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleVA_Arg9759 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleVA_Arg9771 = new BitSet(new long[]{0x000FFF4112228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleVA_Arg9792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_entryRuleExtractElement9828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractElement9838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleExtractElement9875 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractElement9896 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleExtractElement9908 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleExtractElement9929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_entryRuleInsertElement9965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertElement9975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleInsertElement10012 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement10033 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInsertElement10045 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement10066 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleInsertElement10078 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInsertElement10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector10135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShuffleVector10145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleShuffleVector10182 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector10203 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleShuffleVector10215 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector10236 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleShuffleVector10248 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleShuffleVector10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast10305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast10315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCAST_TYPE_in_ruleCast10356 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleCast10376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleCast10388 = new BitSet(new long[]{0x000FFF4112228340L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast10409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCAST_TYPE_in_entryRuleCAST_TYPE10446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCAST_TYPE10457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleCAST_TYPE10495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleCAST_TYPE10514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleCAST_TYPE10533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleCAST_TYPE10552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleCAST_TYPE10571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleCAST_TYPE10590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleCAST_TYPE10609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleCAST_TYPE10628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleCAST_TYPE10647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleCAST_TYPE10666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleCAST_TYPE10685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleCAST_TYPE10704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare10744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare10754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleCompare10792 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000003FF000000L});
    public static final BitSet FOLLOW_ruleI_PREDICATES_in_ruleCompare10808 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare10823 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleCompare10844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ruleCompare10863 = new BitSet(new long[]{0x0000300000000000L,0x0000000000000000L,0x00000FFC3C000000L});
    public static final BitSet FOLLOW_ruleF_PREDICATES_in_ruleCompare10879 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare10894 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleCompare10915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleI_PREDICATES_in_entryRuleI_PREDICATES10952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleI_PREDICATES10963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ruleI_PREDICATES11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleI_PREDICATES11020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleI_PREDICATES11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleI_PREDICATES11058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleI_PREDICATES11077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleI_PREDICATES11096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ruleI_PREDICATES11115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ruleI_PREDICATES11134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleI_PREDICATES11153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_ruleI_PREDICATES11172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleF_PREDICATES_in_entryRuleF_PREDICATES11213 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleF_PREDICATES11224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleF_PREDICATES11262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_ruleF_PREDICATES11281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_ruleF_PREDICATES11300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_ruleF_PREDICATES11319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_ruleF_PREDICATES11338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_ruleF_PREDICATES11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_ruleF_PREDICATES11376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_ruleF_PREDICATES11395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleF_PREDICATES11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleF_PREDICATES11433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleF_PREDICATES11452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleF_PREDICATES11471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleF_PREDICATES11490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_ruleF_PREDICATES11509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_ruleF_PREDICATES11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleF_PREDICATES11547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleARITHMETIC_OP_in_entryRuleARITHMETIC_OP11587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleARITHMETIC_OP11597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleARITHMETIC_OP11635 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_172_in_ruleARITHMETIC_OP11653 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_68_in_ruleARITHMETIC_OP11671 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_173_in_ruleARITHMETIC_OP11689 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_174_in_ruleARITHMETIC_OP11707 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_175_in_ruleARITHMETIC_OP11725 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_176_in_ruleARITHMETIC_OP11743 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_177_in_ruleARITHMETIC_OP11761 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_178_in_ruleARITHMETIC_OP11779 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_179_in_ruleARITHMETIC_OP11797 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_180_in_ruleARITHMETIC_OP11815 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_181_in_ruleARITHMETIC_OP11833 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleARITHMETIC_OP11850 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleARITHMETIC_OP11871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OP_in_entryRuleLOGICAL_OP11906 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OP11916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_182_in_ruleLOGICAL_OP11954 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_183_in_ruleLOGICAL_OP11972 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_184_in_ruleLOGICAL_OP11990 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_69_in_ruleLOGICAL_OP12008 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_71_in_ruleLOGICAL_OP12026 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_72_in_ruleLOGICAL_OP12044 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleType_in_ruleLOGICAL_OP12061 = new BitSet(new long[]{0x000FFF4112A28340L});
    public static final BitSet FOLLOW_ruleValuePair_in_ruleLOGICAL_OP12082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch12117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndirectBranch12127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_ruleIndirectBranch12164 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleIndirectBranch12185 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleIndirectBranch12197 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleIndirectBranch12209 = new BitSet(new long[]{0x000FFF4113228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleLabelList_in_ruleIndirectBranch12230 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleIndirectBranch12243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelList_in_entryRuleLabelList12279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelList12289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleLabelList12334 = new BitSet(new long[]{0x000FFF4112228342L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch12370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch12380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_186_in_ruleSwitch12417 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSwitch12438 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleSwitch12450 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleSwitch12471 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleSwitch12483 = new BitSet(new long[]{0x000FFF4113228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleJumpTable_in_ruleSwitch12504 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSwitch12517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpTable_in_entryRuleJumpTable12553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJumpTable12563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleJumpTable12609 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleJumpTable12621 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleJumpTable12642 = new BitSet(new long[]{0x000FFF4112228342L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleInvoke_in_entryRuleInvoke12679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvoke12689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_187_in_ruleInvoke12726 = new BitSet(new long[]{0x000FFF4112228340L,0x000007FFF7F80000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleInvoke12743 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleInvoke12761 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke12783 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleInvoke12804 = new BitSet(new long[]{0x0000000000000000L,0x1FFFF80000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke12821 = new BitSet(new long[]{0x0000000000000000L,0x1FFFF80000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleInvoke12834 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke12855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_188_in_ruleInvoke12867 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleInvoke12888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_entryRuleResume12924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResume12934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_ruleResume12971 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleResume12993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_entryRuleUnreachable13028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnreachable13038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_ruleUnreachable13084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn13120 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn13130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_ruleReturn13177 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleReturn13189 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleReturn13202 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_ruleReturn13214 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleReturn13226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn13237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_191_in_ruleReturn13258 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleReturn13279 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_23_in_ruleReturn13292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_192_in_ruleReturn13304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleReturn13316 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn13327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_entryRuleBranch13365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranch13375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleBranch13413 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch13434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleBranch13454 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch13475 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBranch13487 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch13508 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBranch13520 = new BitSet(new long[]{0x000FFF4112228340L,0x0000000007F80000L});
    public static final BitSet FOLLOW_ruleTypeAndValue_in_ruleBranch13541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY13579 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVISIBILITY13590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_195_in_ruleVISIBILITY13628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_ruleVISIBILITY13647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_ruleVISIBILITY13666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE13707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLINKAGE13718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_ruleLINKAGE13756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_ruleLINKAGE13775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_ruleLINKAGE13794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_ruleLINKAGE13813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_ruleLINKAGE13832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_ruleLINKAGE13851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_ruleLINKAGE13870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_ruleLINKAGE13889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_ruleLINKAGE13908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_ruleLINKAGE13927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_ruleLINKAGE13946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_ruleLINKAGE13965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_ruleLINKAGE13993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE14039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIAS_LINKAGE14050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_ruleALIAS_LINKAGE14088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_ruleALIAS_LINKAGE14107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_ruleALIAS_LINKAGE14126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_ruleALIAS_LINKAGE14145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue14186 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadataValue14197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14237 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetadataValue14252 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_214_in_ruleMetadataValue14278 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14293 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMetadataValue14311 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14332 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14347 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_ruleMetadataValue14368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000C00002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14383 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetadataValue14398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_ruleMetadataValue14424 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14439 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMetadataValue14457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14478 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue14493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_ruleMetadataValue14519 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000400002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14535 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleMetadataValue14548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_214_in_ruleMetadataValue14568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_ruleMetadataValue14582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14595 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadataValue14610 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMetadataValue14628 = new BitSet(new long[]{0x00003F0000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_215_in_ruleMetadataValue14643 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleMetadataValue14656 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetadataValue14671 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ruleBASIC_TYPE_in_ruleMetadataValue14705 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleMetadataValue14724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT14771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIGNMENT14782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleALIGNMENT14820 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleALIGNMENT14835 = new BitSet(new long[]{0x0000000000000002L});

}