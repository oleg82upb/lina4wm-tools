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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ARRAY", "RULE_CSTRING", "RULE_VAR_TYPE", "RULE_INT", "RULE_INTEGER", "RULE_OREST", "RULE_NOBRACKET", "RULE_F_POINT", "RULE_POINT", "RULE_ID", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'asm'", "'target'", "'datalayout'", "'triple'", "'='", "'deplibs'", "'['", "','", "']'", "'global'", "'unnamed_addr'", "'constant'", "'type'", "'zeroinitializer'", "'null'", "'0 ,'", "'0,'", "'{'", "'}'", "'<'", "'>'", "'alias'", "'void'", "'label'", "'undef'", "'true'", "'false'", "'opaque'", "'define'", "'section '", "'declare'", "'('", "')'", "':'", "'*'", "'volatile'", "'getelementptr'", "'inbounds'", "'extractvalue'", "'insertvalue'", "'fence'", "'singlethread'", "'unordered'", "'monotonic'", "'aquire'", "'release'", "'acq_rel'", "'seq_cst'", "'cmpxchg'", "'atomicrmw'", "'xchg'", "'add'", "'sub'", "'and'", "'nand'", "'or'", "'xor'", "'max'", "'min'", "'umax'", "'umin'", "'load'", "'atomic'", "'align'", "'store'", "'tail'", "'call'", "'zeroext'", "'signext'", "'inreg'", "'byval'", "'sret'", "'noalias'", "'nocapture'", "'nest'", "'alloca'", "'ccc'", "'fastcc'", "'coldcc'", "'x86_stdcallcc'", "'x86_fastcallcc'", "'x86_thiscallcc'", "'arm_apcscc'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", "'msp430_intrcc'", "'ptx_kernel'", "'ptx_device'", "'spir_func'", "'spir_kernel'", "'cc'", "'address_safety'", "'alignstack'", "'alwaysinline'", "'nonlazybind'", "'inlinehint'", "'naked'", "'noimplicitfloat'", "'noinline'", "'noredzone'", "'noreturn'", "'nounwind'", "'optsize'", "'readnone'", "'readonly'", "'returns_twice'", "'ssp'", "'sspreq'", "'uwtable'", "'phi'", "'landingpad'", "'personality'", "'cleanup'", "'to'", "'catch'", "'filter'", "'select'", "'va_arg'", "'extractelement'", "'insertelement'", "'shufflevector'", "'trunc'", "'zext'", "'sext'", "'fptrunc'", "'fpext'", "'fptoui'", "'fptosi'", "'uitofp'", "'sitofp'", "'ptrtoint'", "'inttoptr'", "'bitcast'", "'icmp'", "'fcmp'", "'eq'", "'ne'", "'ugt'", "'uge'", "'ult'", "'ule'", "'sgt'", "'sge'", "'slt'", "'sle'", "'oeq'", "'ogt'", "'oge'", "'olt'", "'ole'", "'one'", "'ord'", "'ueq'", "'une'", "'uno'", "'fadd'", "'fsub'", "'mul'", "'fmul'", "'udiv'", "'sdiv'", "'fdiv'", "'urem'", "'srem'", "'frem'", "'shl'", "'lshr'", "'ashr'", "'indirectbr'", "'switch'", "'invoke'", "'unwind'", "'resume'", "'unreachable'", "'ret'", "'!dbg'", "'!'", "'br'", "'default'", "'hidden'", "'protected'", "'private'", "'linker_private'", "'linker_private_weak'", "'available_externally'", "'linkonce'", "'common'", "'appending'", "'extern_weak'", "'linkonce_odr'", "'linkonce_odr_auto_hide'", "'dllimport'", "'dllexport'", "'external'", "'internal'", "'weak'", "'weak_odr'", "'!{'", "'metadata'"
    };
    public static final int RULE_ID=15;
    public static final int RULE_VAR_TYPE=8;
    public static final int T__159=159;
    public static final int T__158=158;
    public static final int RULE_ANY_OTHER=18;
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
    public static final int RULE_ML_COMMENT=16;
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
    public static final int T__217=217;
    public static final int T__218=218;
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
    public static final int RULE_NOBRACKET=12;
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
    public static final int RULE_ARRAY=6;
    public static final int T__200=200;
    public static final int T__201=201;
    public static final int RULE_INTEGER=10;
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
    public static final int RULE_POINT=14;
    public static final int T__192=192;
    public static final int T__191=191;
    public static final int T__190=190;
    public static final int T__59=59;
    public static final int RULE_INT=9;
    public static final int RULE_CSTRING=7;
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
    public static final int RULE_F_POINT=13;
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
    public static final int RULE_OREST=11;
    public static final int RULE_WS=17;
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

                if ( ((LA1_0>=RULE_VAR_TYPE && LA1_0<=RULE_INTEGER)||LA1_0==19||LA1_0==21||LA1_0==25||LA1_0==34||(LA1_0>=42 && LA1_0<=46)||LA1_0==48||LA1_0==50) ) {
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

            if ( (LA4_0==19||LA4_0==21||LA4_0==25) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=RULE_VAR_TYPE && LA4_0<=RULE_INTEGER)||LA4_0==34||(LA4_0>=42 && LA4_0<=46)||LA4_0==48||LA4_0==50) ) {
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
            case 19:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 25:
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
                    otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTopLevelEntity363); 

                        	newLeafNode(otherlv_0, grammarAccess.getTopLevelEntityAccess().getModuleKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleTopLevelEntity375); 

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
                    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleTopLevelEntity417); 

                        	newLeafNode(otherlv_3, grammarAccess.getTopLevelEntityAccess().getTargetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:198:1: (otherlv_4= 'datalayout' | otherlv_5= 'triple' )
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==22) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==23) ) {
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
                            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleTopLevelEntity430); 

                                	newLeafNode(otherlv_4, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:203:7: otherlv_5= 'triple'
                            {
                            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleTopLevelEntity448); 

                                	newLeafNode(otherlv_5, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1());
                                

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,24,FOLLOW_24_in_ruleTopLevelEntity461); 

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
                    otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleTopLevelEntity503); 

                        	newLeafNode(otherlv_8, grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_2_0());
                        
                    otherlv_9=(Token)match(input,24,FOLLOW_24_in_ruleTopLevelEntity515); 

                        	newLeafNode(otherlv_9, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_2_1());
                        
                    otherlv_10=(Token)match(input,26,FOLLOW_26_in_ruleTopLevelEntity527); 

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

                        if ( (LA6_0==27) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:260:4: otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) )
                    	    {
                    	    otherlv_12=(Token)match(input,27,FOLLOW_27_in_ruleTopLevelEntity562); 

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

                    otherlv_14=(Token)match(input,28,FOLLOW_28_in_ruleTopLevelEntity598); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:303:1: ruleMainLevelEntity returns [EObject current=null] : (this_FunctionHeader_0= ruleFunctionHeader | this_NamedType_1= ruleNamedType ) ;
    public final EObject ruleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject this_FunctionHeader_0 = null;

        EObject this_NamedType_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:306:28: ( (this_FunctionHeader_0= ruleFunctionHeader | this_NamedType_1= ruleNamedType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:307:1: (this_FunctionHeader_0= ruleFunctionHeader | this_NamedType_1= ruleNamedType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:307:1: (this_FunctionHeader_0= ruleFunctionHeader | this_NamedType_1= ruleNamedType )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==48||LA8_0==50) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=RULE_VAR_TYPE && LA8_0<=RULE_INTEGER)||LA8_0==34||(LA8_0>=42 && LA8_0<=46)) ) {
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:318:5: this_NamedType_1= ruleNamedType
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getNamedTypeParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNamedType_in_ruleMainLevelEntity719);
                    this_NamedType_1=ruleNamedType();

                    state._fsp--;

                     
                            current = this_NamedType_1; 
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


    // $ANTLR start "entryRuleNamedType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:334:1: entryRuleNamedType returns [EObject current=null] : iv_ruleNamedType= ruleNamedType EOF ;
    public final EObject entryRuleNamedType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamedType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:335:2: (iv_ruleNamedType= ruleNamedType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:336:2: iv_ruleNamedType= ruleNamedType EOF
            {
             newCompositeNode(grammarAccess.getNamedTypeRule()); 
            pushFollow(FOLLOW_ruleNamedType_in_entryRuleNamedType754);
            iv_ruleNamedType=ruleNamedType();

            state._fsp--;

             current =iv_ruleNamedType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNamedType764); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNamedType"


    // $ANTLR start "ruleNamedType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:343:1: ruleNamedType returns [EObject current=null] : ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* ( (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) | ( (lv_instr_9_0= ruleInstruction ) ) | (this_ARRAY_10= RULE_ARRAY this_CSTRING_11= RULE_CSTRING (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )* (otherlv_14= ',' ruleALIGNMENT )? ) | ( (lv_alias_16_0= ruleAlias ) ) | ( ( (lv_type_17_0= ruleType ) ) (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )* ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )? ) ) ) ;
    public final EObject ruleNamedType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token this_ARRAY_10=null;
        Token this_CSTRING_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_struct_7_0 = null;

        EObject lv_instr_9_0 = null;

        EObject lv_alias_16_0 = null;

        AntlrDatatypeRuleToken lv_type_17_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:346:28: ( ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* ( (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) | ( (lv_instr_9_0= ruleInstruction ) ) | (this_ARRAY_10= RULE_ARRAY this_CSTRING_11= RULE_CSTRING (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )* (otherlv_14= ',' ruleALIGNMENT )? ) | ( (lv_alias_16_0= ruleAlias ) ) | ( ( (lv_type_17_0= ruleType ) ) (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )* ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )? ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* ( (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) | ( (lv_instr_9_0= ruleInstruction ) ) | (this_ARRAY_10= RULE_ARRAY this_CSTRING_11= RULE_CSTRING (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )* (otherlv_14= ',' ruleALIGNMENT )? ) | ( (lv_alias_16_0= ruleAlias ) ) | ( ( (lv_type_17_0= ruleType ) ) (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )* ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )? ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:1: ( ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* ( (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) | ( (lv_instr_9_0= ruleInstruction ) ) | (this_ARRAY_10= RULE_ARRAY this_CSTRING_11= RULE_CSTRING (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )* (otherlv_14= ',' ruleALIGNMENT )? ) | ( (lv_alias_16_0= ruleAlias ) ) | ( ( (lv_type_17_0= ruleType ) ) (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )* ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:2: ( (lv_name_0_0= ruleType ) ) otherlv_1= '=' ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )* ( (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) | ( (lv_instr_9_0= ruleInstruction ) ) | (this_ARRAY_10= RULE_ARRAY this_CSTRING_11= RULE_CSTRING (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )* (otherlv_14= ',' ruleALIGNMENT )? ) | ( (lv_alias_16_0= ruleAlias ) ) | ( ( (lv_type_17_0= ruleType ) ) (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )* ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:347:2: ( (lv_name_0_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:348:1: (lv_name_0_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:348:1: (lv_name_0_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:349:3: lv_name_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getNamedTypeAccess().getNameTypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleNamedType810);
            lv_name_0_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNamedTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleNamedType822); 

                	newLeafNode(otherlv_1, grammarAccess.getNamedTypeAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:369:1: ( ruleLINKAGE | otherlv_3= 'global' | otherlv_4= 'unnamed_addr' | otherlv_5= 'constant' )*
            loop9:
            do {
                int alt9=5;
                switch ( input.LA(1) ) {
                case 201:
                case 202:
                case 203:
                case 204:
                case 205:
                case 206:
                case 207:
                case 208:
                case 209:
                case 210:
                case 211:
                case 212:
                case 213:
                case 214:
                case 215:
                case 216:
                    {
                    alt9=1;
                    }
                    break;
                case 29:
                    {
                    alt9=2;
                    }
                    break;
                case 30:
                    {
                    alt9=3;
                    }
                    break;
                case 31:
                    {
                    alt9=4;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:370:5: ruleLINKAGE
            	    {
            	     
            	            newCompositeNode(grammarAccess.getNamedTypeAccess().getLINKAGEParserRuleCall_2_0()); 
            	        
            	    pushFollow(FOLLOW_ruleLINKAGE_in_ruleNamedType839);
            	    ruleLINKAGE();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:378:7: otherlv_3= 'global'
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleNamedType856); 

            	        	newLeafNode(otherlv_3, grammarAccess.getNamedTypeAccess().getGlobalKeyword_2_1());
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:383:7: otherlv_4= 'unnamed_addr'
            	    {
            	    otherlv_4=(Token)match(input,30,FOLLOW_30_in_ruleNamedType874); 

            	        	newLeafNode(otherlv_4, grammarAccess.getNamedTypeAccess().getUnnamed_addrKeyword_2_2());
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:388:7: otherlv_5= 'constant'
            	    {
            	    otherlv_5=(Token)match(input,31,FOLLOW_31_in_ruleNamedType892); 

            	        	newLeafNode(otherlv_5, grammarAccess.getNamedTypeAccess().getConstantKeyword_2_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:392:3: ( (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) ) | ( (lv_instr_9_0= ruleInstruction ) ) | (this_ARRAY_10= RULE_ARRAY this_CSTRING_11= RULE_CSTRING (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )* (otherlv_14= ',' ruleALIGNMENT )? ) | ( (lv_alias_16_0= ruleAlias ) ) | ( ( (lv_type_17_0= ruleType ) ) (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )* ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )? ) )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt16=1;
                }
                break;
            case 55:
            case 56:
            case 58:
            case 59:
            case 60:
            case 68:
            case 69:
            case 71:
            case 72:
            case 73:
            case 75:
            case 76:
            case 81:
            case 84:
            case 85:
            case 86:
            case 95:
            case 129:
            case 130:
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
            case 152:
            case 153:
            case 154:
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
            case 185:
            case 186:
            case 187:
                {
                alt16=2;
                }
                break;
            case RULE_ARRAY:
                {
                alt16=3;
                }
                break;
            case 41:
                {
                alt16=4;
                }
                break;
            case RULE_VAR_TYPE:
            case RULE_INT:
            case RULE_INTEGER:
            case 34:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt16=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:392:4: (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:392:4: (otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:392:6: otherlv_6= 'type' ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque )
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleNamedType908); 

                        	newLeafNode(otherlv_6, grammarAccess.getNamedTypeAccess().getTypeKeyword_3_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:396:1: ( ( (lv_struct_7_0= ruleStructure ) ) | ruleOpaque )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==37||LA10_0==39) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==47) ) {
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
                             
                            	        newCompositeNode(grammarAccess.getNamedTypeAccess().getStructStructureParserRuleCall_3_0_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleStructure_in_ruleNamedType930);
                            lv_struct_7_0=ruleStructure();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getNamedTypeRule());
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
                             
                                    newCompositeNode(grammarAccess.getNamedTypeAccess().getOpaqueParserRuleCall_3_0_1_1()); 
                                
                            pushFollow(FOLLOW_ruleOpaque_in_ruleNamedType952);
                            ruleOpaque();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:424:6: ( (lv_instr_9_0= ruleInstruction ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:424:6: ( (lv_instr_9_0= ruleInstruction ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:425:1: (lv_instr_9_0= ruleInstruction )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:425:1: (lv_instr_9_0= ruleInstruction )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:426:3: lv_instr_9_0= ruleInstruction
                    {
                     
                    	        newCompositeNode(grammarAccess.getNamedTypeAccess().getInstrInstructionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleInstruction_in_ruleNamedType980);
                    lv_instr_9_0=ruleInstruction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNamedTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"instr",
                            		lv_instr_9_0, 
                            		"Instruction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:443:6: (this_ARRAY_10= RULE_ARRAY this_CSTRING_11= RULE_CSTRING (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )* (otherlv_14= ',' ruleALIGNMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:443:6: (this_ARRAY_10= RULE_ARRAY this_CSTRING_11= RULE_CSTRING (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )* (otherlv_14= ',' ruleALIGNMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:443:7: this_ARRAY_10= RULE_ARRAY this_CSTRING_11= RULE_CSTRING (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )* (otherlv_14= ',' ruleALIGNMENT )?
                    {
                    this_ARRAY_10=(Token)match(input,RULE_ARRAY,FOLLOW_RULE_ARRAY_in_ruleNamedType998); 
                     
                        newLeafNode(this_ARRAY_10, grammarAccess.getNamedTypeAccess().getARRAYTerminalRuleCall_3_2_0()); 
                        
                    this_CSTRING_11=(Token)match(input,RULE_CSTRING,FOLLOW_RULE_CSTRING_in_ruleNamedType1008); 
                     
                        newLeafNode(this_CSTRING_11, grammarAccess.getNamedTypeAccess().getCSTRINGTerminalRuleCall_3_2_1()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:451:1: (otherlv_12= 'zeroinitializer' | otherlv_13= 'null' )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==34) ) {
                            int LA11_2 = input.LA(2);

                            if ( (LA11_2==EOF||LA11_2==RULE_SL_COMMENT||(LA11_2>=RULE_VAR_TYPE && LA11_2<=RULE_INTEGER)||LA11_2==19||LA11_2==21||LA11_2==25||LA11_2==27||(LA11_2>=33 && LA11_2<=34)||(LA11_2>=42 && LA11_2<=46)||LA11_2==48||LA11_2==50||(LA11_2>=55 && LA11_2<=56)||(LA11_2>=58 && LA11_2<=60)||(LA11_2>=68 && LA11_2<=69)||(LA11_2>=71 && LA11_2<=73)||(LA11_2>=75 && LA11_2<=76)||LA11_2==81||(LA11_2>=84 && LA11_2<=86)||LA11_2==95||(LA11_2>=129 && LA11_2<=130)||(LA11_2>=136 && LA11_2<=154)||(LA11_2>=175 && LA11_2<=190)||(LA11_2>=192 && LA11_2<=194)||LA11_2==197) ) {
                                alt11=2;
                            }


                        }
                        else if ( (LA11_0==33) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:451:3: otherlv_12= 'zeroinitializer'
                    	    {
                    	    otherlv_12=(Token)match(input,33,FOLLOW_33_in_ruleNamedType1020); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getNamedTypeAccess().getZeroinitializerKeyword_3_2_2_0());
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:456:7: otherlv_13= 'null'
                    	    {
                    	    otherlv_13=(Token)match(input,34,FOLLOW_34_in_ruleNamedType1038); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getNamedTypeAccess().getNullKeyword_3_2_2_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:460:3: (otherlv_14= ',' ruleALIGNMENT )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==27) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:460:5: otherlv_14= ',' ruleALIGNMENT
                            {
                            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleNamedType1053); 

                                	newLeafNode(otherlv_14, grammarAccess.getNamedTypeAccess().getCommaKeyword_3_2_3_0());
                                
                             
                                    newCompositeNode(grammarAccess.getNamedTypeAccess().getALIGNMENTParserRuleCall_3_2_3_1()); 
                                
                            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleNamedType1069);
                            ruleALIGNMENT();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:473:6: ( (lv_alias_16_0= ruleAlias ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:473:6: ( (lv_alias_16_0= ruleAlias ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:474:1: (lv_alias_16_0= ruleAlias )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:474:1: (lv_alias_16_0= ruleAlias )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:475:3: lv_alias_16_0= ruleAlias
                    {
                     
                    	        newCompositeNode(grammarAccess.getNamedTypeAccess().getAliasAliasParserRuleCall_3_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAlias_in_ruleNamedType1098);
                    lv_alias_16_0=ruleAlias();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNamedTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"alias",
                            		lv_alias_16_0, 
                            		"Alias");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:492:6: ( ( (lv_type_17_0= ruleType ) ) (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )* ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:492:6: ( ( (lv_type_17_0= ruleType ) ) (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )* ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:492:7: ( (lv_type_17_0= ruleType ) ) (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )* ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:492:7: ( (lv_type_17_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:493:1: (lv_type_17_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:493:1: (lv_type_17_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:494:3: lv_type_17_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getNamedTypeAccess().getTypeTypeParserRuleCall_3_4_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleNamedType1126);
                    lv_type_17_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNamedTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_17_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:510:2: (otherlv_18= 'zeroinitializer' | otherlv_19= 'null' )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==34) ) {
                            int LA13_2 = input.LA(2);

                            if ( (LA13_2==EOF||LA13_2==RULE_SL_COMMENT||(LA13_2>=RULE_VAR_TYPE && LA13_2<=RULE_INTEGER)||LA13_2==19||LA13_2==21||LA13_2==25||LA13_2==27||(LA13_2>=33 && LA13_2<=36)||(LA13_2>=42 && LA13_2<=46)||LA13_2==48||LA13_2==50||(LA13_2>=55 && LA13_2<=56)||(LA13_2>=58 && LA13_2<=60)||(LA13_2>=68 && LA13_2<=69)||(LA13_2>=71 && LA13_2<=73)||(LA13_2>=75 && LA13_2<=76)||LA13_2==81||(LA13_2>=84 && LA13_2<=86)||LA13_2==95||(LA13_2>=129 && LA13_2<=130)||(LA13_2>=136 && LA13_2<=154)||(LA13_2>=175 && LA13_2<=190)||(LA13_2>=192 && LA13_2<=194)||LA13_2==197) ) {
                                alt13=2;
                            }


                        }
                        else if ( (LA13_0==33) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:510:4: otherlv_18= 'zeroinitializer'
                    	    {
                    	    otherlv_18=(Token)match(input,33,FOLLOW_33_in_ruleNamedType1139); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getNamedTypeAccess().getZeroinitializerKeyword_3_4_1_0());
                    	        

                    	    }
                    	    break;
                    	case 2 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:515:7: otherlv_19= 'null'
                    	    {
                    	    otherlv_19=(Token)match(input,34,FOLLOW_34_in_ruleNamedType1157); 

                    	        	newLeafNode(otherlv_19, grammarAccess.getNamedTypeAccess().getNullKeyword_3_4_1_1());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:519:3: ( (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==27||(LA15_0>=35 && LA15_0<=36)) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:519:4: (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' ) ruleALIGNMENT
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:519:4: (otherlv_20= '0 ,' | otherlv_21= '0,' | otherlv_22= ',' )
                            int alt14=3;
                            switch ( input.LA(1) ) {
                            case 35:
                                {
                                alt14=1;
                                }
                                break;
                            case 36:
                                {
                                alt14=2;
                                }
                                break;
                            case 27:
                                {
                                alt14=3;
                                }
                                break;
                            default:
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 0, input);

                                throw nvae;
                            }

                            switch (alt14) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:519:6: otherlv_20= '0 ,'
                                    {
                                    otherlv_20=(Token)match(input,35,FOLLOW_35_in_ruleNamedType1173); 

                                        	newLeafNode(otherlv_20, grammarAccess.getNamedTypeAccess().getDigitZeroSpaceCommaKeyword_3_4_2_0_0());
                                        

                                    }
                                    break;
                                case 2 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:524:7: otherlv_21= '0,'
                                    {
                                    otherlv_21=(Token)match(input,36,FOLLOW_36_in_ruleNamedType1191); 

                                        	newLeafNode(otherlv_21, grammarAccess.getNamedTypeAccess().getDigitZeroCommaKeyword_3_4_2_0_1());
                                        

                                    }
                                    break;
                                case 3 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:529:7: otherlv_22= ','
                                    {
                                    otherlv_22=(Token)match(input,27,FOLLOW_27_in_ruleNamedType1209); 

                                        	newLeafNode(otherlv_22, grammarAccess.getNamedTypeAccess().getCommaKeyword_3_4_2_0_2());
                                        

                                    }
                                    break;

                            }

                             
                                    newCompositeNode(grammarAccess.getNamedTypeAccess().getALIGNMENTParserRuleCall_3_4_2_1()); 
                                
                            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleNamedType1226);
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


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamedType"


    // $ANTLR start "entryRuleType"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:549:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:550:2: (iv_ruleType= ruleType EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:551:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType1266);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType1277); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:558:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_VAR_TYPE_0= RULE_VAR_TYPE | this_INT_1= RULE_INT | this_INTEGER_2= RULE_INTEGER | this_Primitive_3= rulePrimitive ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_VAR_TYPE_0=null;
        Token this_INT_1=null;
        Token this_INTEGER_2=null;
        AntlrDatatypeRuleToken this_Primitive_3 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:561:28: ( (this_VAR_TYPE_0= RULE_VAR_TYPE | this_INT_1= RULE_INT | this_INTEGER_2= RULE_INTEGER | this_Primitive_3= rulePrimitive ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:562:1: (this_VAR_TYPE_0= RULE_VAR_TYPE | this_INT_1= RULE_INT | this_INTEGER_2= RULE_INTEGER | this_Primitive_3= rulePrimitive )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:562:1: (this_VAR_TYPE_0= RULE_VAR_TYPE | this_INT_1= RULE_INT | this_INTEGER_2= RULE_INTEGER | this_Primitive_3= rulePrimitive )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_VAR_TYPE:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
                {
                alt17=2;
                }
                break;
            case RULE_INTEGER:
                {
                alt17=3;
                }
                break;
            case 34:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:562:6: this_VAR_TYPE_0= RULE_VAR_TYPE
                    {
                    this_VAR_TYPE_0=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleType1317); 

                    		current.merge(this_VAR_TYPE_0);
                        
                     
                        newLeafNode(this_VAR_TYPE_0, grammarAccess.getTypeAccess().getVAR_TYPETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:570:10: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleType1343); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getTypeAccess().getINTTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:578:10: this_INTEGER_2= RULE_INTEGER
                    {
                    this_INTEGER_2=(Token)match(input,RULE_INTEGER,FOLLOW_RULE_INTEGER_in_ruleType1369); 

                    		current.merge(this_INTEGER_2);
                        
                     
                        newLeafNode(this_INTEGER_2, grammarAccess.getTypeAccess().getINTEGERTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:587:5: this_Primitive_3= rulePrimitive
                    {
                     
                            newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePrimitive_in_ruleType1402);
                    this_Primitive_3=rulePrimitive();

                    state._fsp--;


                    		current.merge(this_Primitive_3);
                        
                     
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleStructure"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:605:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:606:2: (iv_ruleStructure= ruleStructure EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:607:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure1447);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure1457); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:614:1: ruleStructure returns [EObject current=null] : ( ( () otherlv_1= '{' ( ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY ) (this_OREST_4= RULE_OREST )? ( (lv_Lists_5_0= ruleTypeList ) )? (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )* )? otherlv_11= '}' ) | ( () otherlv_13= '<' otherlv_14= '{' ( ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY ) (this_OREST_17= RULE_OREST )? ( (lv_Lists_18_0= ruleTypeList ) )? (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )* )? otherlv_24= '}' otherlv_25= '>' ) ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_ARRAY_3=null;
        Token this_OREST_4=null;
        Token otherlv_6=null;
        Token this_ARRAY_8=null;
        Token this_OREST_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token this_ARRAY_16=null;
        Token this_OREST_17=null;
        Token otherlv_19=null;
        Token this_ARRAY_21=null;
        Token this_OREST_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_types_2_0 = null;

        EObject lv_Lists_5_0 = null;

        AntlrDatatypeRuleToken lv_types_7_0 = null;

        EObject lv_Lists_10_0 = null;

        AntlrDatatypeRuleToken lv_types_15_0 = null;

        EObject lv_Lists_18_0 = null;

        AntlrDatatypeRuleToken lv_types_20_0 = null;

        EObject lv_Lists_23_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:617:28: ( ( ( () otherlv_1= '{' ( ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY ) (this_OREST_4= RULE_OREST )? ( (lv_Lists_5_0= ruleTypeList ) )? (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )* )? otherlv_11= '}' ) | ( () otherlv_13= '<' otherlv_14= '{' ( ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY ) (this_OREST_17= RULE_OREST )? ( (lv_Lists_18_0= ruleTypeList ) )? (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )* )? otherlv_24= '}' otherlv_25= '>' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:618:1: ( ( () otherlv_1= '{' ( ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY ) (this_OREST_4= RULE_OREST )? ( (lv_Lists_5_0= ruleTypeList ) )? (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )* )? otherlv_11= '}' ) | ( () otherlv_13= '<' otherlv_14= '{' ( ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY ) (this_OREST_17= RULE_OREST )? ( (lv_Lists_18_0= ruleTypeList ) )? (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )* )? otherlv_24= '}' otherlv_25= '>' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:618:1: ( ( () otherlv_1= '{' ( ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY ) (this_OREST_4= RULE_OREST )? ( (lv_Lists_5_0= ruleTypeList ) )? (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )* )? otherlv_11= '}' ) | ( () otherlv_13= '<' otherlv_14= '{' ( ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY ) (this_OREST_17= RULE_OREST )? ( (lv_Lists_18_0= ruleTypeList ) )? (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )* )? otherlv_24= '}' otherlv_25= '>' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            else if ( (LA34_0==39) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:618:2: ( () otherlv_1= '{' ( ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY ) (this_OREST_4= RULE_OREST )? ( (lv_Lists_5_0= ruleTypeList ) )? (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )* )? otherlv_11= '}' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:618:2: ( () otherlv_1= '{' ( ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY ) (this_OREST_4= RULE_OREST )? ( (lv_Lists_5_0= ruleTypeList ) )? (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )* )? otherlv_11= '}' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:618:3: () otherlv_1= '{' ( ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY ) (this_OREST_4= RULE_OREST )? ( (lv_Lists_5_0= ruleTypeList ) )? (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )* )? otherlv_11= '}'
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:618:3: ()
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:619:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStructureAccess().getStructureAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleStructure1504); 

                        	newLeafNode(otherlv_1, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:1: ( ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY ) (this_OREST_4= RULE_OREST )? ( (lv_Lists_5_0= ruleTypeList ) )? (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_ARRAY||(LA25_0>=RULE_VAR_TYPE && LA25_0<=RULE_INTEGER)||LA25_0==34||(LA25_0>=42 && LA25_0<=46)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:2: ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY ) (this_OREST_4= RULE_OREST )? ( (lv_Lists_5_0= ruleTypeList ) )? (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:2: ( ( (lv_types_2_0= ruleType ) ) | this_ARRAY_3= RULE_ARRAY )
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( ((LA18_0>=RULE_VAR_TYPE && LA18_0<=RULE_INTEGER)||LA18_0==34||(LA18_0>=42 && LA18_0<=46)) ) {
                                alt18=1;
                            }
                            else if ( (LA18_0==RULE_ARRAY) ) {
                                alt18=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 0, input);

                                throw nvae;
                            }
                            switch (alt18) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:3: ( (lv_types_2_0= ruleType ) )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:628:3: ( (lv_types_2_0= ruleType ) )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:629:1: (lv_types_2_0= ruleType )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:629:1: (lv_types_2_0= ruleType )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:630:3: lv_types_2_0= ruleType
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeParserRuleCall_0_2_0_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleType_in_ruleStructure1527);
                                    lv_types_2_0=ruleType();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"types",
                                            		lv_types_2_0, 
                                            		"Type");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:647:6: this_ARRAY_3= RULE_ARRAY
                                    {
                                    this_ARRAY_3=(Token)match(input,RULE_ARRAY,FOLLOW_RULE_ARRAY_in_ruleStructure1544); 
                                     
                                        newLeafNode(this_ARRAY_3, grammarAccess.getStructureAccess().getARRAYTerminalRuleCall_0_2_0_1()); 
                                        

                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:651:2: (this_OREST_4= RULE_OREST )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==RULE_OREST) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:651:3: this_OREST_4= RULE_OREST
                                    {
                                    this_OREST_4=(Token)match(input,RULE_OREST,FOLLOW_RULE_OREST_in_ruleStructure1556); 
                                     
                                        newLeafNode(this_OREST_4, grammarAccess.getStructureAccess().getORESTTerminalRuleCall_0_2_1()); 
                                        

                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:655:3: ( (lv_Lists_5_0= ruleTypeList ) )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==51) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:656:1: (lv_Lists_5_0= ruleTypeList )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:656:1: (lv_Lists_5_0= ruleTypeList )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:657:3: lv_Lists_5_0= ruleTypeList
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getStructureAccess().getListsTypeListParserRuleCall_0_2_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleTypeList_in_ruleStructure1578);
                                    lv_Lists_5_0=ruleTypeList();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"Lists",
                                            		lv_Lists_5_0, 
                                            		"TypeList");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:673:3: (otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )? )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==27) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:673:5: otherlv_6= ',' ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY ) (this_OREST_9= RULE_OREST )? ( (lv_Lists_10_0= ruleTypeList ) )?
                            	    {
                            	    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleStructure1592); 

                            	        	newLeafNode(otherlv_6, grammarAccess.getStructureAccess().getCommaKeyword_0_2_3_0());
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:677:1: ( ( (lv_types_7_0= ruleType ) ) | this_ARRAY_8= RULE_ARRAY )
                            	    int alt21=2;
                            	    int LA21_0 = input.LA(1);

                            	    if ( ((LA21_0>=RULE_VAR_TYPE && LA21_0<=RULE_INTEGER)||LA21_0==34||(LA21_0>=42 && LA21_0<=46)) ) {
                            	        alt21=1;
                            	    }
                            	    else if ( (LA21_0==RULE_ARRAY) ) {
                            	        alt21=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 21, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt21) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:677:2: ( (lv_types_7_0= ruleType ) )
                            	            {
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:677:2: ( (lv_types_7_0= ruleType ) )
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:678:1: (lv_types_7_0= ruleType )
                            	            {
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:678:1: (lv_types_7_0= ruleType )
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:679:3: lv_types_7_0= ruleType
                            	            {
                            	             
                            	            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeParserRuleCall_0_2_3_1_0_0()); 
                            	            	    
                            	            pushFollow(FOLLOW_ruleType_in_ruleStructure1614);
                            	            lv_types_7_0=ruleType();

                            	            state._fsp--;


                            	            	        if (current==null) {
                            	            	            current = createModelElementForParent(grammarAccess.getStructureRule());
                            	            	        }
                            	                   		add(
                            	                   			current, 
                            	                   			"types",
                            	                    		lv_types_7_0, 
                            	                    		"Type");
                            	            	        afterParserOrEnumRuleCall();
                            	            	    

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:696:6: this_ARRAY_8= RULE_ARRAY
                            	            {
                            	            this_ARRAY_8=(Token)match(input,RULE_ARRAY,FOLLOW_RULE_ARRAY_in_ruleStructure1631); 
                            	             
                            	                newLeafNode(this_ARRAY_8, grammarAccess.getStructureAccess().getARRAYTerminalRuleCall_0_2_3_1_1()); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:700:2: (this_OREST_9= RULE_OREST )?
                            	    int alt22=2;
                            	    int LA22_0 = input.LA(1);

                            	    if ( (LA22_0==RULE_OREST) ) {
                            	        alt22=1;
                            	    }
                            	    switch (alt22) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:700:3: this_OREST_9= RULE_OREST
                            	            {
                            	            this_OREST_9=(Token)match(input,RULE_OREST,FOLLOW_RULE_OREST_in_ruleStructure1643); 
                            	             
                            	                newLeafNode(this_OREST_9, grammarAccess.getStructureAccess().getORESTTerminalRuleCall_0_2_3_2()); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:704:3: ( (lv_Lists_10_0= ruleTypeList ) )?
                            	    int alt23=2;
                            	    int LA23_0 = input.LA(1);

                            	    if ( (LA23_0==51) ) {
                            	        alt23=1;
                            	    }
                            	    switch (alt23) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:705:1: (lv_Lists_10_0= ruleTypeList )
                            	            {
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:705:1: (lv_Lists_10_0= ruleTypeList )
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:706:3: lv_Lists_10_0= ruleTypeList
                            	            {
                            	             
                            	            	        newCompositeNode(grammarAccess.getStructureAccess().getListsTypeListParserRuleCall_0_2_3_3_0()); 
                            	            	    
                            	            pushFollow(FOLLOW_ruleTypeList_in_ruleStructure1665);
                            	            lv_Lists_10_0=ruleTypeList();

                            	            state._fsp--;


                            	            	        if (current==null) {
                            	            	            current = createModelElementForParent(grammarAccess.getStructureRule());
                            	            	        }
                            	                   		add(
                            	                   			current, 
                            	                   			"Lists",
                            	                    		lv_Lists_10_0, 
                            	                    		"TypeList");
                            	            	        afterParserOrEnumRuleCall();
                            	            	    

                            	            }


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,38,FOLLOW_38_in_ruleStructure1682); 

                        	newLeafNode(otherlv_11, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:727:6: ( () otherlv_13= '<' otherlv_14= '{' ( ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY ) (this_OREST_17= RULE_OREST )? ( (lv_Lists_18_0= ruleTypeList ) )? (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )* )? otherlv_24= '}' otherlv_25= '>' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:727:6: ( () otherlv_13= '<' otherlv_14= '{' ( ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY ) (this_OREST_17= RULE_OREST )? ( (lv_Lists_18_0= ruleTypeList ) )? (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )* )? otherlv_24= '}' otherlv_25= '>' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:727:7: () otherlv_13= '<' otherlv_14= '{' ( ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY ) (this_OREST_17= RULE_OREST )? ( (lv_Lists_18_0= ruleTypeList ) )? (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )* )? otherlv_24= '}' otherlv_25= '>'
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:727:7: ()
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:728:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getStructureAccess().getStructureAction_1_0(),
                                current);
                        

                    }

                    otherlv_13=(Token)match(input,39,FOLLOW_39_in_ruleStructure1711); 

                        	newLeafNode(otherlv_13, grammarAccess.getStructureAccess().getLessThanSignKeyword_1_1());
                        
                    otherlv_14=(Token)match(input,37,FOLLOW_37_in_ruleStructure1723); 

                        	newLeafNode(otherlv_14, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:741:1: ( ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY ) (this_OREST_17= RULE_OREST )? ( (lv_Lists_18_0= ruleTypeList ) )? (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )* )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_ARRAY||(LA33_0>=RULE_VAR_TYPE && LA33_0<=RULE_INTEGER)||LA33_0==34||(LA33_0>=42 && LA33_0<=46)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:741:2: ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY ) (this_OREST_17= RULE_OREST )? ( (lv_Lists_18_0= ruleTypeList ) )? (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:741:2: ( ( (lv_types_15_0= ruleType ) ) | this_ARRAY_16= RULE_ARRAY )
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( ((LA26_0>=RULE_VAR_TYPE && LA26_0<=RULE_INTEGER)||LA26_0==34||(LA26_0>=42 && LA26_0<=46)) ) {
                                alt26=1;
                            }
                            else if ( (LA26_0==RULE_ARRAY) ) {
                                alt26=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 26, 0, input);

                                throw nvae;
                            }
                            switch (alt26) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:741:3: ( (lv_types_15_0= ruleType ) )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:741:3: ( (lv_types_15_0= ruleType ) )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:742:1: (lv_types_15_0= ruleType )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:742:1: (lv_types_15_0= ruleType )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:743:3: lv_types_15_0= ruleType
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeParserRuleCall_1_3_0_0_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleType_in_ruleStructure1746);
                                    lv_types_15_0=ruleType();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"types",
                                            		lv_types_15_0, 
                                            		"Type");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }


                                    }
                                    break;
                                case 2 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:760:6: this_ARRAY_16= RULE_ARRAY
                                    {
                                    this_ARRAY_16=(Token)match(input,RULE_ARRAY,FOLLOW_RULE_ARRAY_in_ruleStructure1763); 
                                     
                                        newLeafNode(this_ARRAY_16, grammarAccess.getStructureAccess().getARRAYTerminalRuleCall_1_3_0_1()); 
                                        

                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:764:2: (this_OREST_17= RULE_OREST )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==RULE_OREST) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:764:3: this_OREST_17= RULE_OREST
                                    {
                                    this_OREST_17=(Token)match(input,RULE_OREST,FOLLOW_RULE_OREST_in_ruleStructure1775); 
                                     
                                        newLeafNode(this_OREST_17, grammarAccess.getStructureAccess().getORESTTerminalRuleCall_1_3_1()); 
                                        

                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:768:3: ( (lv_Lists_18_0= ruleTypeList ) )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==51) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:769:1: (lv_Lists_18_0= ruleTypeList )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:769:1: (lv_Lists_18_0= ruleTypeList )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:770:3: lv_Lists_18_0= ruleTypeList
                                    {
                                     
                                    	        newCompositeNode(grammarAccess.getStructureAccess().getListsTypeListParserRuleCall_1_3_2_0()); 
                                    	    
                                    pushFollow(FOLLOW_ruleTypeList_in_ruleStructure1797);
                                    lv_Lists_18_0=ruleTypeList();

                                    state._fsp--;


                                    	        if (current==null) {
                                    	            current = createModelElementForParent(grammarAccess.getStructureRule());
                                    	        }
                                           		add(
                                           			current, 
                                           			"Lists",
                                            		lv_Lists_18_0, 
                                            		"TypeList");
                                    	        afterParserOrEnumRuleCall();
                                    	    

                                    }


                                    }
                                    break;

                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:786:3: (otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )? )*
                            loop32:
                            do {
                                int alt32=2;
                                int LA32_0 = input.LA(1);

                                if ( (LA32_0==27) ) {
                                    alt32=1;
                                }


                                switch (alt32) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:786:5: otherlv_19= ',' ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY ) (this_OREST_22= RULE_OREST )? ( (lv_Lists_23_0= ruleTypeList ) )?
                            	    {
                            	    otherlv_19=(Token)match(input,27,FOLLOW_27_in_ruleStructure1811); 

                            	        	newLeafNode(otherlv_19, grammarAccess.getStructureAccess().getCommaKeyword_1_3_3_0());
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:790:1: ( ( (lv_types_20_0= ruleType ) ) | this_ARRAY_21= RULE_ARRAY )
                            	    int alt29=2;
                            	    int LA29_0 = input.LA(1);

                            	    if ( ((LA29_0>=RULE_VAR_TYPE && LA29_0<=RULE_INTEGER)||LA29_0==34||(LA29_0>=42 && LA29_0<=46)) ) {
                            	        alt29=1;
                            	    }
                            	    else if ( (LA29_0==RULE_ARRAY) ) {
                            	        alt29=2;
                            	    }
                            	    else {
                            	        NoViableAltException nvae =
                            	            new NoViableAltException("", 29, 0, input);

                            	        throw nvae;
                            	    }
                            	    switch (alt29) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:790:2: ( (lv_types_20_0= ruleType ) )
                            	            {
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:790:2: ( (lv_types_20_0= ruleType ) )
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:791:1: (lv_types_20_0= ruleType )
                            	            {
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:791:1: (lv_types_20_0= ruleType )
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:792:3: lv_types_20_0= ruleType
                            	            {
                            	             
                            	            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeParserRuleCall_1_3_3_1_0_0()); 
                            	            	    
                            	            pushFollow(FOLLOW_ruleType_in_ruleStructure1833);
                            	            lv_types_20_0=ruleType();

                            	            state._fsp--;


                            	            	        if (current==null) {
                            	            	            current = createModelElementForParent(grammarAccess.getStructureRule());
                            	            	        }
                            	                   		add(
                            	                   			current, 
                            	                   			"types",
                            	                    		lv_types_20_0, 
                            	                    		"Type");
                            	            	        afterParserOrEnumRuleCall();
                            	            	    

                            	            }


                            	            }


                            	            }
                            	            break;
                            	        case 2 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:809:6: this_ARRAY_21= RULE_ARRAY
                            	            {
                            	            this_ARRAY_21=(Token)match(input,RULE_ARRAY,FOLLOW_RULE_ARRAY_in_ruleStructure1850); 
                            	             
                            	                newLeafNode(this_ARRAY_21, grammarAccess.getStructureAccess().getARRAYTerminalRuleCall_1_3_3_1_1()); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:813:2: (this_OREST_22= RULE_OREST )?
                            	    int alt30=2;
                            	    int LA30_0 = input.LA(1);

                            	    if ( (LA30_0==RULE_OREST) ) {
                            	        alt30=1;
                            	    }
                            	    switch (alt30) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:813:3: this_OREST_22= RULE_OREST
                            	            {
                            	            this_OREST_22=(Token)match(input,RULE_OREST,FOLLOW_RULE_OREST_in_ruleStructure1862); 
                            	             
                            	                newLeafNode(this_OREST_22, grammarAccess.getStructureAccess().getORESTTerminalRuleCall_1_3_3_2()); 
                            	                

                            	            }
                            	            break;

                            	    }

                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:817:3: ( (lv_Lists_23_0= ruleTypeList ) )?
                            	    int alt31=2;
                            	    int LA31_0 = input.LA(1);

                            	    if ( (LA31_0==51) ) {
                            	        alt31=1;
                            	    }
                            	    switch (alt31) {
                            	        case 1 :
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:818:1: (lv_Lists_23_0= ruleTypeList )
                            	            {
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:818:1: (lv_Lists_23_0= ruleTypeList )
                            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:819:3: lv_Lists_23_0= ruleTypeList
                            	            {
                            	             
                            	            	        newCompositeNode(grammarAccess.getStructureAccess().getListsTypeListParserRuleCall_1_3_3_3_0()); 
                            	            	    
                            	            pushFollow(FOLLOW_ruleTypeList_in_ruleStructure1884);
                            	            lv_Lists_23_0=ruleTypeList();

                            	            state._fsp--;


                            	            	        if (current==null) {
                            	            	            current = createModelElementForParent(grammarAccess.getStructureRule());
                            	            	        }
                            	                   		add(
                            	                   			current, 
                            	                   			"Lists",
                            	                    		lv_Lists_23_0, 
                            	                    		"TypeList");
                            	            	        afterParserOrEnumRuleCall();
                            	            	    

                            	            }


                            	            }
                            	            break;

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop32;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_24=(Token)match(input,38,FOLLOW_38_in_ruleStructure1901); 

                        	newLeafNode(otherlv_24, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_1_4());
                        
                    otherlv_25=(Token)match(input,40,FOLLOW_40_in_ruleStructure1913); 

                        	newLeafNode(otherlv_25, grammarAccess.getStructureAccess().getGreaterThanSignKeyword_1_5());
                        

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
    // $ANTLR end "ruleStructure"


    // $ANTLR start "entryRuleAlias"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:851:1: entryRuleAlias returns [EObject current=null] : iv_ruleAlias= ruleAlias EOF ;
    public final EObject entryRuleAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlias = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:852:2: (iv_ruleAlias= ruleAlias EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:853:2: iv_ruleAlias= ruleAlias EOF
            {
             newCompositeNode(grammarAccess.getAliasRule()); 
            pushFollow(FOLLOW_ruleAlias_in_entryRuleAlias1950);
            iv_ruleAlias=ruleAlias();

            state._fsp--;

             current =iv_ruleAlias; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlias1960); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:860:1: ruleAlias returns [EObject current=null] : (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_aliastype_3_0= ruleType ) ) ( (lv_aliasvalue_4_0= ruleType ) ) ( (lv_aliasee_5_0= ruleType ) ) ) ;
    public final EObject ruleAlias() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_aliastype_3_0 = null;

        AntlrDatatypeRuleToken lv_aliasvalue_4_0 = null;

        AntlrDatatypeRuleToken lv_aliasee_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:863:28: ( (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_aliastype_3_0= ruleType ) ) ( (lv_aliasvalue_4_0= ruleType ) ) ( (lv_aliasee_5_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:864:1: (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_aliastype_3_0= ruleType ) ) ( (lv_aliasvalue_4_0= ruleType ) ) ( (lv_aliasee_5_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:864:1: (otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_aliastype_3_0= ruleType ) ) ( (lv_aliasvalue_4_0= ruleType ) ) ( (lv_aliasee_5_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:864:3: otherlv_0= 'alias' ( ruleALIAS_LINKAGE )? ( ruleVISIBILITY )? ( (lv_aliastype_3_0= ruleType ) ) ( (lv_aliasvalue_4_0= ruleType ) ) ( (lv_aliasee_5_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleAlias1997); 

                	newLeafNode(otherlv_0, grammarAccess.getAliasAccess().getAliasKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:868:1: ( ruleALIAS_LINKAGE )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( ((LA35_0>=213 && LA35_0<=216)) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:869:5: ruleALIAS_LINKAGE
                    {
                     
                            newCompositeNode(grammarAccess.getAliasAccess().getALIAS_LINKAGEParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_ruleAlias2014);
                    ruleALIAS_LINKAGE();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:876:3: ( ruleVISIBILITY )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=198 && LA36_0<=200)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:877:5: ruleVISIBILITY
                    {
                     
                            newCompositeNode(grammarAccess.getAliasAccess().getVISIBILITYParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVISIBILITY_in_ruleAlias2032);
                    ruleVISIBILITY();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:884:3: ( (lv_aliastype_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:885:1: (lv_aliastype_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:885:1: (lv_aliastype_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:886:3: lv_aliastype_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAliasAccess().getAliastypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlias2054);
            lv_aliastype_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAliasRule());
            	        }
                   		set(
                   			current, 
                   			"aliastype",
                    		lv_aliastype_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:902:2: ( (lv_aliasvalue_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:903:1: (lv_aliasvalue_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:903:1: (lv_aliasvalue_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:904:3: lv_aliasvalue_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAliasAccess().getAliasvalueTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlias2075);
            lv_aliasvalue_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAliasRule());
            	        }
                   		set(
                   			current, 
                   			"aliasvalue",
                    		lv_aliasvalue_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:920:2: ( (lv_aliasee_5_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:921:1: (lv_aliasee_5_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:921:1: (lv_aliasee_5_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:922:3: lv_aliasee_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAliasAccess().getAliaseeTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlias2096);
            lv_aliasee_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAliasRule());
            	        }
                   		set(
                   			current, 
                   			"aliasee",
                    		lv_aliasee_5_0, 
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


    // $ANTLR start "entryRulePrimitive"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:946:1: entryRulePrimitive returns [String current=null] : iv_rulePrimitive= rulePrimitive EOF ;
    public final String entryRulePrimitive() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePrimitive = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:947:2: (iv_rulePrimitive= rulePrimitive EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:948:2: iv_rulePrimitive= rulePrimitive EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveRule()); 
            pushFollow(FOLLOW_rulePrimitive_in_entryRulePrimitive2133);
            iv_rulePrimitive=rulePrimitive();

            state._fsp--;

             current =iv_rulePrimitive.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitive2144); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitive"


    // $ANTLR start "rulePrimitive"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:955:1: rulePrimitive returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken rulePrimitive() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:958:28: ( (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:959:1: (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:959:1: (kw= 'void' | kw= 'null' | kw= 'label' | kw= 'undef' | kw= 'true' | kw= 'false' )
            int alt37=6;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt37=1;
                }
                break;
            case 34:
                {
                alt37=2;
                }
                break;
            case 43:
                {
                alt37=3;
                }
                break;
            case 44:
                {
                alt37=4;
                }
                break;
            case 45:
                {
                alt37=5;
                }
                break;
            case 46:
                {
                alt37=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:960:2: kw= 'void'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_rulePrimitive2182); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getVoidKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:967:2: kw= 'null'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_rulePrimitive2201); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getNullKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:974:2: kw= 'label'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_rulePrimitive2220); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getLabelKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:981:2: kw= 'undef'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_rulePrimitive2239); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getUndefKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:988:2: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_rulePrimitive2258); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getTrueKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:995:2: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_rulePrimitive2277); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPrimitiveAccess().getFalseKeyword_5()); 
                        

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
    // $ANTLR end "rulePrimitive"


    // $ANTLR start "entryRuleOpaque"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1008:1: entryRuleOpaque returns [String current=null] : iv_ruleOpaque= ruleOpaque EOF ;
    public final String entryRuleOpaque() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpaque = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1009:2: (iv_ruleOpaque= ruleOpaque EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1010:2: iv_ruleOpaque= ruleOpaque EOF
            {
             newCompositeNode(grammarAccess.getOpaqueRule()); 
            pushFollow(FOLLOW_ruleOpaque_in_entryRuleOpaque2318);
            iv_ruleOpaque=ruleOpaque();

            state._fsp--;

             current =iv_ruleOpaque.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOpaque2329); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1017:1: ruleOpaque returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'opaque' ;
    public final AntlrDatatypeRuleToken ruleOpaque() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1020:28: (kw= 'opaque' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1022:2: kw= 'opaque'
            {
            kw=(Token)match(input,47,FOLLOW_47_in_ruleOpaque2366); 

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


    // $ANTLR start "entryRuleFunctionHeader"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1035:1: entryRuleFunctionHeader returns [EObject current=null] : iv_ruleFunctionHeader= ruleFunctionHeader EOF ;
    public final EObject entryRuleFunctionHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionHeader = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1036:2: (iv_ruleFunctionHeader= ruleFunctionHeader EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1037:2: iv_ruleFunctionHeader= ruleFunctionHeader EOF
            {
             newCompositeNode(grammarAccess.getFunctionHeaderRule()); 
            pushFollow(FOLLOW_ruleFunctionHeader_in_entryRuleFunctionHeader2405);
            iv_ruleFunctionHeader=ruleFunctionHeader();

            state._fsp--;

             current =iv_ruleFunctionHeader; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionHeader2415); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1044:1: ruleFunctionHeader returns [EObject current=null] : ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) ) ;
    public final EObject ruleFunctionHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_6_0=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token this_STRING_11=null;
        Token otherlv_14=null;
        Token lv_name_20_0=null;
        Token this_OREST_22=null;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1047:28: ( ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1048:1: ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1048:1: ( (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) ) | (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==48) ) {
                alt55=1;
            }
            else if ( (LA55_0==50) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1048:2: (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1048:2: (otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1048:4: otherlv_0= 'define' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_5_0= ruleType ) ) ( (lv_name_6_0= RULE_VAR_TYPE ) ) ( (lv_pl_7_0= ruleParameterList ) ) (otherlv_8= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_10= 'section ' this_STRING_11= RULE_STRING )? ( ruleALIGNMENT )? ( (lv_body_13_0= ruleFunctionBody ) )
                    {
                    otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleFunctionHeader2453); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionHeaderAccess().getDefineKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1052:1: ( ruleLINKAGE )?
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( ((LA38_0>=201 && LA38_0<=216)) ) {
                        alt38=1;
                    }
                    switch (alt38) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1053:5: ruleLINKAGE
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getLINKAGEParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_ruleLINKAGE_in_ruleFunctionHeader2470);
                            ruleLINKAGE();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1060:3: ( ruleVISIBILITY )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( ((LA39_0>=198 && LA39_0<=200)) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1061:5: ruleVISIBILITY
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getVISIBILITYParserRuleCall_0_2()); 
                                
                            pushFollow(FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader2488);
                            ruleVISIBILITY();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1068:3: ( ruleCallingConv )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=96 && LA40_0<=110)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1069:5: ruleCallingConv
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_0_3()); 
                                
                            pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionHeader2506);
                            ruleCallingConv();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1076:3: ( ruleRETURN_ATTRIBUTES )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( ((LA41_0>=87 && LA41_0<=94)) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1077:5: ruleRETURN_ATTRIBUTES
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getRETURN_ATTRIBUTESParserRuleCall_0_4()); 
                                
                            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader2524);
                            ruleRETURN_ATTRIBUTES();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1084:3: ( (lv_returnType_5_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1085:1: (lv_returnType_5_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1085:1: (lv_returnType_5_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1086:3: lv_returnType_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getReturnTypeTypeParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleFunctionHeader2546);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1102:2: ( (lv_name_6_0= RULE_VAR_TYPE ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1103:1: (lv_name_6_0= RULE_VAR_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1103:1: (lv_name_6_0= RULE_VAR_TYPE )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1104:3: lv_name_6_0= RULE_VAR_TYPE
                    {
                    lv_name_6_0=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader2563); 

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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1120:2: ( (lv_pl_7_0= ruleParameterList ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1121:1: (lv_pl_7_0= ruleParameterList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1121:1: (lv_pl_7_0= ruleParameterList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1122:3: lv_pl_7_0= ruleParameterList
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getPlParameterListParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameterList_in_ruleFunctionHeader2589);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1138:2: (otherlv_8= 'unnamed_addr' )?
                    int alt42=2;
                    int LA42_0 = input.LA(1);

                    if ( (LA42_0==30) ) {
                        alt42=1;
                    }
                    switch (alt42) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1138:4: otherlv_8= 'unnamed_addr'
                            {
                            otherlv_8=(Token)match(input,30,FOLLOW_30_in_ruleFunctionHeader2602); 

                                	newLeafNode(otherlv_8, grammarAccess.getFunctionHeaderAccess().getUnnamed_addrKeyword_0_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1142:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( ((LA43_0>=111 && LA43_0<=128)) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1143:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader2621);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1150:3: (otherlv_10= 'section ' this_STRING_11= RULE_STRING )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==49) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1150:5: otherlv_10= 'section ' this_STRING_11= RULE_STRING
                            {
                            otherlv_10=(Token)match(input,49,FOLLOW_49_in_ruleFunctionHeader2635); 

                                	newLeafNode(otherlv_10, grammarAccess.getFunctionHeaderAccess().getSectionKeyword_0_10_0());
                                
                            this_STRING_11=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionHeader2646); 
                             
                                newLeafNode(this_STRING_11, grammarAccess.getFunctionHeaderAccess().getSTRINGTerminalRuleCall_0_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1158:3: ( ruleALIGNMENT )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==83) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1159:5: ruleALIGNMENT
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getALIGNMENTParserRuleCall_0_11()); 
                                
                            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader2664);
                            ruleALIGNMENT();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1166:3: ( (lv_body_13_0= ruleFunctionBody ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1167:1: (lv_body_13_0= ruleFunctionBody )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1167:1: (lv_body_13_0= ruleFunctionBody )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1168:3: lv_body_13_0= ruleFunctionBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getBodyFunctionBodyParserRuleCall_0_12_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionHeader2686);
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1185:6: (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1185:6: (otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1185:8: otherlv_14= 'declare' ( ruleLINKAGE )? ( ruleVISIBILITY )? ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_returnType_19_0= ruleType ) ) ( (lv_name_20_0= RULE_VAR_TYPE ) ) ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST ) (otherlv_23= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_25= 'section ' this_STRING_26= RULE_STRING )? ( ruleALIGNMENT )?
                    {
                    otherlv_14=(Token)match(input,50,FOLLOW_50_in_ruleFunctionHeader2706); 

                        	newLeafNode(otherlv_14, grammarAccess.getFunctionHeaderAccess().getDeclareKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1189:1: ( ruleLINKAGE )?
                    int alt46=2;
                    int LA46_0 = input.LA(1);

                    if ( ((LA46_0>=201 && LA46_0<=216)) ) {
                        alt46=1;
                    }
                    switch (alt46) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1190:5: ruleLINKAGE
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getLINKAGEParserRuleCall_1_1()); 
                                
                            pushFollow(FOLLOW_ruleLINKAGE_in_ruleFunctionHeader2723);
                            ruleLINKAGE();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1197:3: ( ruleVISIBILITY )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( ((LA47_0>=198 && LA47_0<=200)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1198:5: ruleVISIBILITY
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getVISIBILITYParserRuleCall_1_2()); 
                                
                            pushFollow(FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader2741);
                            ruleVISIBILITY();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1205:3: ( ruleCallingConv )?
                    int alt48=2;
                    int LA48_0 = input.LA(1);

                    if ( ((LA48_0>=96 && LA48_0<=110)) ) {
                        alt48=1;
                    }
                    switch (alt48) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1206:5: ruleCallingConv
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getCallingConvParserRuleCall_1_3()); 
                                
                            pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionHeader2759);
                            ruleCallingConv();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1213:3: ( ruleRETURN_ATTRIBUTES )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=87 && LA49_0<=94)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1214:5: ruleRETURN_ATTRIBUTES
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getRETURN_ATTRIBUTESParserRuleCall_1_4()); 
                                
                            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader2777);
                            ruleRETURN_ATTRIBUTES();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1221:3: ( (lv_returnType_19_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1222:1: (lv_returnType_19_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1222:1: (lv_returnType_19_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1223:3: lv_returnType_19_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getReturnTypeTypeParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleFunctionHeader2799);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1239:2: ( (lv_name_20_0= RULE_VAR_TYPE ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1240:1: (lv_name_20_0= RULE_VAR_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1240:1: (lv_name_20_0= RULE_VAR_TYPE )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1241:3: lv_name_20_0= RULE_VAR_TYPE
                    {
                    lv_name_20_0=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader2816); 

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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1257:2: ( ( (lv_tList_21_0= ruleTypeList ) ) | this_OREST_22= RULE_OREST )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==51) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==RULE_OREST) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1257:3: ( (lv_tList_21_0= ruleTypeList ) )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1257:3: ( (lv_tList_21_0= ruleTypeList ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1258:1: (lv_tList_21_0= ruleTypeList )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1258:1: (lv_tList_21_0= ruleTypeList )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1259:3: lv_tList_21_0= ruleTypeList
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionHeaderAccess().getTListTypeListParserRuleCall_1_7_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeList_in_ruleFunctionHeader2843);
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
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1276:6: this_OREST_22= RULE_OREST
                            {
                            this_OREST_22=(Token)match(input,RULE_OREST,FOLLOW_RULE_OREST_in_ruleFunctionHeader2860); 
                             
                                newLeafNode(this_OREST_22, grammarAccess.getFunctionHeaderAccess().getORESTTerminalRuleCall_1_7_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1280:2: (otherlv_23= 'unnamed_addr' )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==30) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1280:4: otherlv_23= 'unnamed_addr'
                            {
                            otherlv_23=(Token)match(input,30,FOLLOW_30_in_ruleFunctionHeader2873); 

                                	newLeafNode(otherlv_23, grammarAccess.getFunctionHeaderAccess().getUnnamed_addrKeyword_1_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1284:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=111 && LA52_0<=128)) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1285:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionHeaderAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader2892);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1292:3: (otherlv_25= 'section ' this_STRING_26= RULE_STRING )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==49) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1292:5: otherlv_25= 'section ' this_STRING_26= RULE_STRING
                            {
                            otherlv_25=(Token)match(input,49,FOLLOW_49_in_ruleFunctionHeader2906); 

                                	newLeafNode(otherlv_25, grammarAccess.getFunctionHeaderAccess().getSectionKeyword_1_10_0());
                                
                            this_STRING_26=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionHeader2917); 
                             
                                newLeafNode(this_STRING_26, grammarAccess.getFunctionHeaderAccess().getSTRINGTerminalRuleCall_1_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1300:3: ( ruleALIGNMENT )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==83) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1301:5: ruleALIGNMENT
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionHeaderAccess().getALIGNMENTParserRuleCall_1_11()); 
                                
                            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader2935);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1316:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1317:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1318:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList2973);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList2983); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1325:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) ( (lv_variables_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) ( (lv_variables_6_0= ruleType ) ) )* )? otherlv_7= ')' ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_types_2_0 = null;

        AntlrDatatypeRuleToken lv_variables_3_0 = null;

        AntlrDatatypeRuleToken lv_types_5_0 = null;

        AntlrDatatypeRuleToken lv_variables_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1328:28: ( ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) ( (lv_variables_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) ( (lv_variables_6_0= ruleType ) ) )* )? otherlv_7= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1329:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) ( (lv_variables_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) ( (lv_variables_6_0= ruleType ) ) )* )? otherlv_7= ')' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1329:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) ( (lv_variables_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) ( (lv_variables_6_0= ruleType ) ) )* )? otherlv_7= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1329:2: () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) ( (lv_variables_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) ( (lv_variables_6_0= ruleType ) ) )* )? otherlv_7= ')'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1329:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1330:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterListAccess().getParameterListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleParameterList3029); 

                	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:1: ( ( (lv_types_2_0= ruleType ) ) ( (lv_variables_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) ( (lv_variables_6_0= ruleType ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_VAR_TYPE && LA57_0<=RULE_INTEGER)||LA57_0==34||(LA57_0>=42 && LA57_0<=46)) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:2: ( (lv_types_2_0= ruleType ) ) ( (lv_variables_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) ( (lv_variables_6_0= ruleType ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:2: ( (lv_types_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1340:1: (lv_types_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1340:1: (lv_types_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1341:3: lv_types_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterListAccess().getTypesTypeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleParameterList3051);
                    lv_types_2_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	        }
                           		add(
                           			current, 
                           			"types",
                            		lv_types_2_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1357:2: ( (lv_variables_3_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1358:1: (lv_variables_3_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1358:1: (lv_variables_3_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1359:3: lv_variables_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterListAccess().getVariablesTypeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleParameterList3072);
                    lv_variables_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	        }
                           		add(
                           			current, 
                           			"variables",
                            		lv_variables_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1375:2: (otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) ( (lv_variables_6_0= ruleType ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==27) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1375:4: otherlv_4= ',' ( (lv_types_5_0= ruleType ) ) ( (lv_variables_6_0= ruleType ) )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleParameterList3085); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getParameterListAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1379:1: ( (lv_types_5_0= ruleType ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1380:1: (lv_types_5_0= ruleType )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1380:1: (lv_types_5_0= ruleType )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1381:3: lv_types_5_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterListAccess().getTypesTypeParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleParameterList3106);
                    	    lv_types_5_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"types",
                    	            		lv_types_5_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1397:2: ( (lv_variables_6_0= ruleType ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1398:1: (lv_variables_6_0= ruleType )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1398:1: (lv_variables_6_0= ruleType )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1399:3: lv_variables_6_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getParameterListAccess().getVariablesTypeParserRuleCall_2_2_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleParameterList3127);
                    	    lv_variables_6_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"variables",
                    	            		lv_variables_6_0, 
                    	            		"Type");
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
                    break;

            }

            otherlv_7=(Token)match(input,52,FOLLOW_52_in_ruleParameterList3143); 

                	newLeafNode(otherlv_7, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_3());
                

            }


            }

             leaveRule(); 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1427:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBody = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1428:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1429:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody3179);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody3189); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1436:1: ruleFunctionBody returns [EObject current=null] : ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_meta_0_0 = null;

        EObject lv_blocks_2_0 = null;

        AntlrDatatypeRuleToken lv_meta_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1439:28: ( ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:2: ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ( (lv_meta_4_0= ruleMetadataValue ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1440:2: ( (lv_meta_0_0= ruleMetadataValue ) )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==196||LA58_0==217) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1441:1: (lv_meta_0_0= ruleMetadataValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1441:1: (lv_meta_0_0= ruleMetadataValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1442:3: lv_meta_0_0= ruleMetadataValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getMetaMetadataValueParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleFunctionBody3235);
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
            	    break loop58;
                }
            } while (true);

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleFunctionBody3248); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1462:1: ( (lv_blocks_2_0= ruleBasicBlock ) )+
            int cnt59=0;
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( ((LA59_0>=RULE_VAR_TYPE && LA59_0<=RULE_INTEGER)||LA59_0==RULE_NOBRACKET||LA59_0==34||(LA59_0>=42 && LA59_0<=46)||(LA59_0>=55 && LA59_0<=56)||(LA59_0>=58 && LA59_0<=60)||(LA59_0>=68 && LA59_0<=69)||(LA59_0>=71 && LA59_0<=73)||(LA59_0>=75 && LA59_0<=76)||LA59_0==81||(LA59_0>=84 && LA59_0<=86)||LA59_0==95||(LA59_0>=129 && LA59_0<=130)||(LA59_0>=136 && LA59_0<=154)||(LA59_0>=175 && LA59_0<=190)||(LA59_0>=192 && LA59_0<=194)||LA59_0==197) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1463:1: (lv_blocks_2_0= ruleBasicBlock )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1463:1: (lv_blocks_2_0= ruleBasicBlock )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1464:3: lv_blocks_2_0= ruleBasicBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getBlocksBasicBlockParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBasicBlock_in_ruleFunctionBody3269);
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
            	    if ( cnt59 >= 1 ) break loop59;
                        EarlyExitException eee =
                            new EarlyExitException(59, input);
                        throw eee;
                }
                cnt59++;
            } while (true);

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleFunctionBody3282); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1484:1: ( (lv_meta_4_0= ruleMetadataValue ) )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==196||LA60_0==217) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1485:1: (lv_meta_4_0= ruleMetadataValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1485:1: (lv_meta_4_0= ruleMetadataValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1486:3: lv_meta_4_0= ruleMetadataValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getMetaMetadataValueParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleFunctionBody3303);
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
            	    break loop60;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1510:1: entryRuleBasicBlock returns [EObject current=null] : iv_ruleBasicBlock= ruleBasicBlock EOF ;
    public final EObject entryRuleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBlock = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1511:2: (iv_ruleBasicBlock= ruleBasicBlock EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1512:2: iv_ruleBasicBlock= ruleBasicBlock EOF
            {
             newCompositeNode(grammarAccess.getBasicBlockRule()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock3340);
            iv_ruleBasicBlock=ruleBasicBlock();

            state._fsp--;

             current =iv_ruleBasicBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicBlock3350); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1519:1: ruleBasicBlock returns [EObject current=null] : ( ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) ) ) ;
    public final EObject ruleBasicBlock() throws RecognitionException {
        EObject current = null;

        Token lv_label_0_0=null;
        Token otherlv_1=null;
        EObject lv_instructions_2_1 = null;

        EObject lv_instructions_2_2 = null;

        EObject lv_terminator_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1522:28: ( ( ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1523:1: ( ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1523:1: ( ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1523:2: ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )? ( ( (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction ) ) )* ( (lv_terminator_3_0= ruleRet_Instr ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1523:2: ( ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_NOBRACKET) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1523:3: ( (lv_label_0_0= RULE_NOBRACKET ) ) otherlv_1= ':'
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1523:3: ( (lv_label_0_0= RULE_NOBRACKET ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:1: (lv_label_0_0= RULE_NOBRACKET )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:1: (lv_label_0_0= RULE_NOBRACKET )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1525:3: lv_label_0_0= RULE_NOBRACKET
                    {
                    lv_label_0_0=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleBasicBlock3393); 

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

                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleBasicBlock3410); 

                        	newLeafNode(otherlv_1, grammarAccess.getBasicBlockAccess().getColonKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1545:3: ( ( (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( ((LA63_0>=RULE_VAR_TYPE && LA63_0<=RULE_INTEGER)||LA63_0==34||(LA63_0>=42 && LA63_0<=46)||(LA63_0>=55 && LA63_0<=56)||(LA63_0>=58 && LA63_0<=60)||(LA63_0>=68 && LA63_0<=69)||(LA63_0>=71 && LA63_0<=73)||(LA63_0>=75 && LA63_0<=76)||LA63_0==81||(LA63_0>=84 && LA63_0<=86)||LA63_0==95||(LA63_0>=129 && LA63_0<=130)||(LA63_0>=136 && LA63_0<=154)||(LA63_0>=175 && LA63_0<=187)) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1546:1: ( (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction ) )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1546:1: ( (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1547:1: (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1547:1: (lv_instructions_2_1= ruleNamedType | lv_instructions_2_2= ruleInstruction )
            	    int alt62=2;
            	    int LA62_0 = input.LA(1);

            	    if ( ((LA62_0>=RULE_VAR_TYPE && LA62_0<=RULE_INTEGER)||LA62_0==34||(LA62_0>=42 && LA62_0<=46)) ) {
            	        alt62=1;
            	    }
            	    else if ( ((LA62_0>=55 && LA62_0<=56)||(LA62_0>=58 && LA62_0<=60)||(LA62_0>=68 && LA62_0<=69)||(LA62_0>=71 && LA62_0<=73)||(LA62_0>=75 && LA62_0<=76)||LA62_0==81||(LA62_0>=84 && LA62_0<=86)||LA62_0==95||(LA62_0>=129 && LA62_0<=130)||(LA62_0>=136 && LA62_0<=154)||(LA62_0>=175 && LA62_0<=187)) ) {
            	        alt62=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 62, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt62) {
            	        case 1 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1548:3: lv_instructions_2_1= ruleNamedType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBasicBlockAccess().getInstructionsNamedTypeParserRuleCall_1_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleNamedType_in_ruleBasicBlock3435);
            	            lv_instructions_2_1=ruleNamedType();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getBasicBlockRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"instructions",
            	                    		lv_instructions_2_1, 
            	                    		"NamedType");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1563:8: lv_instructions_2_2= ruleInstruction
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getBasicBlockAccess().getInstructionsInstructionParserRuleCall_1_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleInstruction_in_ruleBasicBlock3454);
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
            	    break loop63;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1581:3: ( (lv_terminator_3_0= ruleRet_Instr ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1582:1: (lv_terminator_3_0= ruleRet_Instr )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1582:1: (lv_terminator_3_0= ruleRet_Instr )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1583:3: lv_terminator_3_0= ruleRet_Instr
            {
             
            	        newCompositeNode(grammarAccess.getBasicBlockAccess().getTerminatorRet_InstrParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRet_Instr_in_ruleBasicBlock3479);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1607:1: entryRuleRet_Instr returns [EObject current=null] : iv_ruleRet_Instr= ruleRet_Instr EOF ;
    public final EObject entryRuleRet_Instr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRet_Instr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1608:2: (iv_ruleRet_Instr= ruleRet_Instr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1609:2: iv_ruleRet_Instr= ruleRet_Instr EOF
            {
             newCompositeNode(grammarAccess.getRet_InstrRule()); 
            pushFollow(FOLLOW_ruleRet_Instr_in_entryRuleRet_Instr3515);
            iv_ruleRet_Instr=ruleRet_Instr();

            state._fsp--;

             current =iv_ruleRet_Instr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRet_Instr3525); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1616:1: ruleRet_Instr returns [EObject current=null] : (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1619:28: ( (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1620:1: (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1620:1: (this_Return_0= ruleReturn | this_Branch_1= ruleBranch | this_Switch_2= ruleSwitch | this_IndirectBranch_3= ruleIndirectBranch | this_Invoke_4= ruleInvoke | this_Resume_5= ruleResume | this_Unreachable_6= ruleUnreachable )
            int alt64=7;
            switch ( input.LA(1) ) {
            case 194:
                {
                alt64=1;
                }
                break;
            case 197:
                {
                alt64=2;
                }
                break;
            case 189:
                {
                alt64=3;
                }
                break;
            case 188:
                {
                alt64=4;
                }
                break;
            case 190:
                {
                alt64=5;
                }
                break;
            case 192:
                {
                alt64=6;
                }
                break;
            case 193:
                {
                alt64=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1621:5: this_Return_0= ruleReturn
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getReturnParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleReturn_in_ruleRet_Instr3572);
                    this_Return_0=ruleReturn();

                    state._fsp--;

                     
                            current = this_Return_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1631:5: this_Branch_1= ruleBranch
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getBranchParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleBranch_in_ruleRet_Instr3599);
                    this_Branch_1=ruleBranch();

                    state._fsp--;

                     
                            current = this_Branch_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1641:5: this_Switch_2= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getSwitchParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleRet_Instr3626);
                    this_Switch_2=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1651:5: this_IndirectBranch_3= ruleIndirectBranch
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getIndirectBranchParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleIndirectBranch_in_ruleRet_Instr3653);
                    this_IndirectBranch_3=ruleIndirectBranch();

                    state._fsp--;

                     
                            current = this_IndirectBranch_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1661:5: this_Invoke_4= ruleInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getInvokeParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleInvoke_in_ruleRet_Instr3680);
                    this_Invoke_4=ruleInvoke();

                    state._fsp--;

                     
                            current = this_Invoke_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1671:5: this_Resume_5= ruleResume
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getResumeParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleResume_in_ruleRet_Instr3707);
                    this_Resume_5=ruleResume();

                    state._fsp--;

                     
                            current = this_Resume_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1681:5: this_Unreachable_6= ruleUnreachable
                    {
                     
                            newCompositeNode(grammarAccess.getRet_InstrAccess().getUnreachableParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleUnreachable_in_ruleRet_Instr3734);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1697:1: entryRuleTypeList returns [EObject current=null] : iv_ruleTypeList= ruleTypeList EOF ;
    public final EObject entryRuleTypeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1698:2: (iv_ruleTypeList= ruleTypeList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1699:2: iv_ruleTypeList= ruleTypeList EOF
            {
             newCompositeNode(grammarAccess.getTypeListRule()); 
            pushFollow(FOLLOW_ruleTypeList_in_entryRuleTypeList3769);
            iv_ruleTypeList=ruleTypeList();

            state._fsp--;

             current =iv_ruleTypeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeList3779); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1706:1: ruleTypeList returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' (otherlv_6= '*' )* ) ;
    public final EObject ruleTypeList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_types_2_0 = null;

        AntlrDatatypeRuleToken lv_types_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1709:28: ( ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' (otherlv_6= '*' )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1710:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' (otherlv_6= '*' )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1710:1: ( () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' (otherlv_6= '*' )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1710:2: () otherlv_1= '(' ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )? otherlv_5= ')' (otherlv_6= '*' )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1710:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1711:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getTypeListAccess().getTypeListAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleTypeList3825); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeListAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1720:1: ( ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )* )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=RULE_VAR_TYPE && LA66_0<=RULE_INTEGER)||LA66_0==34||(LA66_0>=42 && LA66_0<=46)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1720:2: ( (lv_types_2_0= ruleType ) ) (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1720:2: ( (lv_types_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1721:1: (lv_types_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1721:1: (lv_types_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1722:3: lv_types_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeListAccess().getTypesTypeParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleTypeList3847);
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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1738:2: (otherlv_3= ',' ( (lv_types_4_0= ruleType ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==27) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1738:4: otherlv_3= ',' ( (lv_types_4_0= ruleType ) )
                    	    {
                    	    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleTypeList3860); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getTypeListAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1742:1: ( (lv_types_4_0= ruleType ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1743:1: (lv_types_4_0= ruleType )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1743:1: (lv_types_4_0= ruleType )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1744:3: lv_types_4_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getTypeListAccess().getTypesTypeParserRuleCall_2_1_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleTypeList3881);
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
                    	    break loop65;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,52,FOLLOW_52_in_ruleTypeList3897); 

                	newLeafNode(otherlv_5, grammarAccess.getTypeListAccess().getRightParenthesisKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1764:1: (otherlv_6= '*' )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==54) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1764:3: otherlv_6= '*'
            	    {
            	    otherlv_6=(Token)match(input,54,FOLLOW_54_in_ruleTypeList3910); 

            	        	newLeafNode(otherlv_6, grammarAccess.getTypeListAccess().getAsteriskKeyword_4());
            	        

            	    }
            	    break;

            	default :
            	    break loop67;
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
    // $ANTLR end "ruleTypeList"


    // $ANTLR start "entryRuleInstruction"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1776:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1777:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1778:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction3948);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction3958); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1785:1: ruleInstruction returns [EObject current=null] : ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1788:28: ( ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:1: ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:1: ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad )
            int alt70=21;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:2: ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:2: ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:3: (otherlv_0= 'volatile' )? this_Load_1= ruleLoad
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:3: (otherlv_0= 'volatile' )?
                    int alt68=2;
                    int LA68_0 = input.LA(1);

                    if ( (LA68_0==55) ) {
                        alt68=1;
                    }
                    switch (alt68) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1789:5: otherlv_0= 'volatile'
                            {
                            otherlv_0=(Token)match(input,55,FOLLOW_55_in_ruleInstruction3997); 

                                	newLeafNode(otherlv_0, grammarAccess.getInstructionAccess().getVolatileKeyword_0_0());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleLoad_in_ruleInstruction4021);
                    this_Load_1=ruleLoad();

                    state._fsp--;

                     
                            current = this_Load_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1803:6: ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1803:6: ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1803:7: (otherlv_2= 'volatile' )? this_Store_3= ruleStore
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1803:7: (otherlv_2= 'volatile' )?
                    int alt69=2;
                    int LA69_0 = input.LA(1);

                    if ( (LA69_0==55) ) {
                        alt69=1;
                    }
                    switch (alt69) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1803:9: otherlv_2= 'volatile'
                            {
                            otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleInstruction4041); 

                                	newLeafNode(otherlv_2, grammarAccess.getInstructionAccess().getVolatileKeyword_1_0());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getStoreParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleStore_in_ruleInstruction4065);
                    this_Store_3=ruleStore();

                    state._fsp--;

                     
                            current = this_Store_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1818:5: this_Fence_4= ruleFence
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFenceParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFence_in_ruleInstruction4093);
                    this_Fence_4=ruleFence();

                    state._fsp--;

                     
                            current = this_Fence_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1828:5: this_GetElementPtr_5= ruleGetElementPtr
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGetElementPtrParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleGetElementPtr_in_ruleInstruction4120);
                    this_GetElementPtr_5=ruleGetElementPtr();

                    state._fsp--;

                     
                            current = this_GetElementPtr_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1838:5: this_LOGICAL_OP_6= ruleLOGICAL_OP
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLOGICAL_OPParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleLOGICAL_OP_in_ruleInstruction4147);
                    this_LOGICAL_OP_6=ruleLOGICAL_OP();

                    state._fsp--;

                     
                            current = this_LOGICAL_OP_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1848:5: this_ARITHMETIC_OP_7= ruleARITHMETIC_OP
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getARITHMETIC_OPParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleARITHMETIC_OP_in_ruleInstruction4174);
                    this_ARITHMETIC_OP_7=ruleARITHMETIC_OP();

                    state._fsp--;

                     
                            current = this_ARITHMETIC_OP_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1858:5: this_Compare_8= ruleCompare
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCompareParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCompare_in_ruleInstruction4201);
                    this_Compare_8=ruleCompare();

                    state._fsp--;

                     
                            current = this_Compare_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1868:5: this_Cast_9= ruleCast
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCastParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleCast_in_ruleInstruction4228);
                    this_Cast_9=ruleCast();

                    state._fsp--;

                     
                            current = this_Cast_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1878:5: this_ShuffleVector_10= ruleShuffleVector
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getShuffleVectorParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleShuffleVector_in_ruleInstruction4255);
                    this_ShuffleVector_10=ruleShuffleVector();

                    state._fsp--;

                     
                            current = this_ShuffleVector_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1888:5: this_InsertElement_11= ruleInsertElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertElementParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleInsertElement_in_ruleInstruction4282);
                    this_InsertElement_11=ruleInsertElement();

                    state._fsp--;

                     
                            current = this_InsertElement_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1898:5: this_ExtractElement_12= ruleExtractElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractElementParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleExtractElement_in_ruleInstruction4309);
                    this_ExtractElement_12=ruleExtractElement();

                    state._fsp--;

                     
                            current = this_ExtractElement_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1908:5: this_InsertValue_13= ruleInsertValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertValueParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleInsertValue_in_ruleInstruction4336);
                    this_InsertValue_13=ruleInsertValue();

                    state._fsp--;

                     
                            current = this_InsertValue_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1918:5: this_ExtractValue_14= ruleExtractValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractValueParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleExtractValue_in_ruleInstruction4363);
                    this_ExtractValue_14=ruleExtractValue();

                    state._fsp--;

                     
                            current = this_ExtractValue_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1928:5: this_Alloc_15= ruleAlloc
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAllocParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleAlloc_in_ruleInstruction4390);
                    this_Alloc_15=ruleAlloc();

                    state._fsp--;

                     
                            current = this_Alloc_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1938:5: this_CmpXchg_16= ruleCmpXchg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCmpXchgParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleCmpXchg_in_ruleInstruction4417);
                    this_CmpXchg_16=ruleCmpXchg();

                    state._fsp--;

                     
                            current = this_CmpXchg_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1948:5: this_AtomicRMW_17= ruleAtomicRMW
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAtomicRMWParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRMW_in_ruleInstruction4444);
                    this_AtomicRMW_17=ruleAtomicRMW();

                    state._fsp--;

                     
                            current = this_AtomicRMW_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1958:5: this_PHI_18= rulePHI
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPHIParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_rulePHI_in_ruleInstruction4471);
                    this_PHI_18=rulePHI();

                    state._fsp--;

                     
                            current = this_PHI_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1968:5: this_Select_19= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSelectParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleInstruction4498);
                    this_Select_19=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1978:5: this_Call_20= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleInstruction4525);
                    this_Call_20=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1988:5: this_VA_Arg_21= ruleVA_Arg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getVA_ArgParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleVA_Arg_in_ruleInstruction4552);
                    this_VA_Arg_21=ruleVA_Arg();

                    state._fsp--;

                     
                            current = this_VA_Arg_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1998:5: this_LandingPad_22= ruleLandingPad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLandingPadParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleLandingPad_in_ruleInstruction4579);
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


    // $ANTLR start "entryRuleGetElementPtr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2014:1: entryRuleGetElementPtr returns [EObject current=null] : iv_ruleGetElementPtr= ruleGetElementPtr EOF ;
    public final EObject entryRuleGetElementPtr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetElementPtr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2015:2: (iv_ruleGetElementPtr= ruleGetElementPtr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2016:2: iv_ruleGetElementPtr= ruleGetElementPtr EOF
            {
             newCompositeNode(grammarAccess.getGetElementPtrRule()); 
            pushFollow(FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr4614);
            iv_ruleGetElementPtr=ruleGetElementPtr();

            state._fsp--;

             current =iv_ruleGetElementPtr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetElementPtr4624); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2023:1: ruleGetElementPtr returns [EObject current=null] : (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_elementtype_2_0= ruleType ) ) ( (lv_element_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_indicetypes_5_0= ruleType ) ) ( (lv_indices_6_0= ruleType ) ) )* ) ;
    public final EObject ruleGetElementPtr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_elementtype_2_0 = null;

        AntlrDatatypeRuleToken lv_element_3_0 = null;

        AntlrDatatypeRuleToken lv_indicetypes_5_0 = null;

        AntlrDatatypeRuleToken lv_indices_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2026:28: ( (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_elementtype_2_0= ruleType ) ) ( (lv_element_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_indicetypes_5_0= ruleType ) ) ( (lv_indices_6_0= ruleType ) ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2027:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_elementtype_2_0= ruleType ) ) ( (lv_element_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_indicetypes_5_0= ruleType ) ) ( (lv_indices_6_0= ruleType ) ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2027:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_elementtype_2_0= ruleType ) ) ( (lv_element_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_indicetypes_5_0= ruleType ) ) ( (lv_indices_6_0= ruleType ) ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2027:3: otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? ( (lv_elementtype_2_0= ruleType ) ) ( (lv_element_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_indicetypes_5_0= ruleType ) ) ( (lv_indices_6_0= ruleType ) ) )*
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleGetElementPtr4661); 

                	newLeafNode(otherlv_0, grammarAccess.getGetElementPtrAccess().getGetelementptrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2031:1: (otherlv_1= 'inbounds' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==57) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2031:3: otherlv_1= 'inbounds'
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleGetElementPtr4674); 

                        	newLeafNode(otherlv_1, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2035:3: ( (lv_elementtype_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2036:1: (lv_elementtype_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2036:1: (lv_elementtype_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2037:3: lv_elementtype_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getElementtypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleGetElementPtr4697);
            lv_elementtype_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	        }
                   		set(
                   			current, 
                   			"elementtype",
                    		lv_elementtype_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2053:2: ( (lv_element_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2054:1: (lv_element_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2054:1: (lv_element_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2055:3: lv_element_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getElementTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleGetElementPtr4718);
            lv_element_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	        }
                   		set(
                   			current, 
                   			"element",
                    		lv_element_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2071:2: (otherlv_4= ',' ( (lv_indicetypes_5_0= ruleType ) ) ( (lv_indices_6_0= ruleType ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==27) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2071:4: otherlv_4= ',' ( (lv_indicetypes_5_0= ruleType ) ) ( (lv_indices_6_0= ruleType ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleGetElementPtr4731); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGetElementPtrAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2075:1: ( (lv_indicetypes_5_0= ruleType ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2076:1: (lv_indicetypes_5_0= ruleType )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2076:1: (lv_indicetypes_5_0= ruleType )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2077:3: lv_indicetypes_5_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getIndicetypesTypeParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleGetElementPtr4752);
            	    lv_indicetypes_5_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indicetypes",
            	            		lv_indicetypes_5_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2093:2: ( (lv_indices_6_0= ruleType ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2094:1: (lv_indices_6_0= ruleType )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2094:1: (lv_indices_6_0= ruleType )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2095:3: lv_indices_6_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getIndicesTypeParserRuleCall_4_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleGetElementPtr4773);
            	    lv_indices_6_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indices",
            	            		lv_indices_6_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2119:1: entryRuleExtractValue returns [EObject current=null] : iv_ruleExtractValue= ruleExtractValue EOF ;
    public final EObject entryRuleExtractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2120:2: (iv_ruleExtractValue= ruleExtractValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2121:2: iv_ruleExtractValue= ruleExtractValue EOF
            {
             newCompositeNode(grammarAccess.getExtractValueRule()); 
            pushFollow(FOLLOW_ruleExtractValue_in_entryRuleExtractValue4811);
            iv_ruleExtractValue=ruleExtractValue();

            state._fsp--;

             current =iv_ruleExtractValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractValue4821); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2128:1: ruleExtractValue returns [EObject current=null] : (otherlv_0= 'extractvalue' ( ( (lv_array_1_0= RULE_ARRAY ) ) | ( (lv_struct_2_0= ruleStructure ) ) ) ( (lv_type_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleExtractValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_1_0=null;
        Token otherlv_4=null;
        Token lv_index_5_0=null;
        EObject lv_struct_2_0 = null;

        AntlrDatatypeRuleToken lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2131:28: ( (otherlv_0= 'extractvalue' ( ( (lv_array_1_0= RULE_ARRAY ) ) | ( (lv_struct_2_0= ruleStructure ) ) ) ( (lv_type_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2132:1: (otherlv_0= 'extractvalue' ( ( (lv_array_1_0= RULE_ARRAY ) ) | ( (lv_struct_2_0= ruleStructure ) ) ) ( (lv_type_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2132:1: (otherlv_0= 'extractvalue' ( ( (lv_array_1_0= RULE_ARRAY ) ) | ( (lv_struct_2_0= ruleStructure ) ) ) ( (lv_type_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2132:3: otherlv_0= 'extractvalue' ( ( (lv_array_1_0= RULE_ARRAY ) ) | ( (lv_struct_2_0= ruleStructure ) ) ) ( (lv_type_3_0= ruleType ) ) (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleExtractValue4858); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractValueAccess().getExtractvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2136:1: ( ( (lv_array_1_0= RULE_ARRAY ) ) | ( (lv_struct_2_0= ruleStructure ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ARRAY) ) {
                alt73=1;
            }
            else if ( (LA73_0==37||LA73_0==39) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2136:2: ( (lv_array_1_0= RULE_ARRAY ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2136:2: ( (lv_array_1_0= RULE_ARRAY ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2137:1: (lv_array_1_0= RULE_ARRAY )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2137:1: (lv_array_1_0= RULE_ARRAY )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2138:3: lv_array_1_0= RULE_ARRAY
                    {
                    lv_array_1_0=(Token)match(input,RULE_ARRAY,FOLLOW_RULE_ARRAY_in_ruleExtractValue4876); 

                    			newLeafNode(lv_array_1_0, grammarAccess.getExtractValueAccess().getArrayARRAYTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getExtractValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"array",
                            		lv_array_1_0, 
                            		"ARRAY");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2155:6: ( (lv_struct_2_0= ruleStructure ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2155:6: ( (lv_struct_2_0= ruleStructure ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2156:1: (lv_struct_2_0= ruleStructure )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2156:1: (lv_struct_2_0= ruleStructure )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2157:3: lv_struct_2_0= ruleStructure
                    {
                     
                    	        newCompositeNode(grammarAccess.getExtractValueAccess().getStructStructureParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStructure_in_ruleExtractValue4908);
                    lv_struct_2_0=ruleStructure();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getExtractValueRule());
                    	        }
                           		set(
                           			current, 
                           			"struct",
                            		lv_struct_2_0, 
                            		"Structure");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2173:3: ( (lv_type_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2174:1: (lv_type_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2174:1: (lv_type_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2175:3: lv_type_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getTypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleExtractValue4930);
            lv_type_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractValueRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2191:2: (otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) ) )+
            int cnt74=0;
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==27) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2191:4: otherlv_4= ',' ( (lv_index_5_0= RULE_INT ) )
            	    {
            	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleExtractValue4943); 

            	        	newLeafNode(otherlv_4, grammarAccess.getExtractValueAccess().getCommaKeyword_3_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2195:1: ( (lv_index_5_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2196:1: (lv_index_5_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2196:1: (lv_index_5_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2197:3: lv_index_5_0= RULE_INT
            	    {
            	    lv_index_5_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleExtractValue4960); 

            	    			newLeafNode(lv_index_5_0, grammarAccess.getExtractValueAccess().getIndexINTTerminalRuleCall_3_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getExtractValueRule());
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
            	    if ( cnt74 >= 1 ) break loop74;
                        EarlyExitException eee =
                            new EarlyExitException(74, input);
                        throw eee;
                }
                cnt74++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2221:1: entryRuleInsertValue returns [EObject current=null] : iv_ruleInsertValue= ruleInsertValue EOF ;
    public final EObject entryRuleInsertValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2222:2: (iv_ruleInsertValue= ruleInsertValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2223:2: iv_ruleInsertValue= ruleInsertValue EOF
            {
             newCompositeNode(grammarAccess.getInsertValueRule()); 
            pushFollow(FOLLOW_ruleInsertValue_in_entryRuleInsertValue5003);
            iv_ruleInsertValue=ruleInsertValue();

            state._fsp--;

             current =iv_ruleInsertValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertValue5013); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2230:1: ruleInsertValue returns [EObject current=null] : (otherlv_0= 'insertvalue' ( (lv_struct_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_inserttype_4_0= ruleType ) ) ( (lv_insertvalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_index_7_0= RULE_INT ) ) )+ ) ;
    public final EObject ruleInsertValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token lv_index_7_0=null;
        EObject lv_struct_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_inserttype_4_0 = null;

        AntlrDatatypeRuleToken lv_insertvalue_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2233:28: ( (otherlv_0= 'insertvalue' ( (lv_struct_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_inserttype_4_0= ruleType ) ) ( (lv_insertvalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_index_7_0= RULE_INT ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2234:1: (otherlv_0= 'insertvalue' ( (lv_struct_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_inserttype_4_0= ruleType ) ) ( (lv_insertvalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_index_7_0= RULE_INT ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2234:1: (otherlv_0= 'insertvalue' ( (lv_struct_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_inserttype_4_0= ruleType ) ) ( (lv_insertvalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_index_7_0= RULE_INT ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2234:3: otherlv_0= 'insertvalue' ( (lv_struct_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_inserttype_4_0= ruleType ) ) ( (lv_insertvalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_index_7_0= RULE_INT ) ) )+
            {
            otherlv_0=(Token)match(input,59,FOLLOW_59_in_ruleInsertValue5050); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertValueAccess().getInsertvalueKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2238:1: ( (lv_struct_1_0= ruleStructure ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2239:1: (lv_struct_1_0= ruleStructure )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2239:1: (lv_struct_1_0= ruleStructure )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2240:3: lv_struct_1_0= ruleStructure
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getStructStructureParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStructure_in_ruleInsertValue5071);
            lv_struct_1_0=ruleStructure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"struct",
                    		lv_struct_1_0, 
                    		"Structure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2256:2: ( (lv_value_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2257:1: (lv_value_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2257:1: (lv_value_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2258:3: lv_value_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getValueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertValue5092);
            lv_value_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleInsertValue5104); 

                	newLeafNode(otherlv_3, grammarAccess.getInsertValueAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2278:1: ( (lv_inserttype_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2279:1: (lv_inserttype_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2279:1: (lv_inserttype_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2280:3: lv_inserttype_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getInserttypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertValue5125);
            lv_inserttype_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"inserttype",
                    		lv_inserttype_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2296:2: ( (lv_insertvalue_5_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2297:1: (lv_insertvalue_5_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2297:1: (lv_insertvalue_5_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2298:3: lv_insertvalue_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getInsertvalueTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertValue5146);
            lv_insertvalue_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"insertvalue",
                    		lv_insertvalue_5_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2314:2: (otherlv_6= ',' ( (lv_index_7_0= RULE_INT ) ) )+
            int cnt75=0;
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==27) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2314:4: otherlv_6= ',' ( (lv_index_7_0= RULE_INT ) )
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleInsertValue5159); 

            	        	newLeafNode(otherlv_6, grammarAccess.getInsertValueAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2318:1: ( (lv_index_7_0= RULE_INT ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2319:1: (lv_index_7_0= RULE_INT )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2319:1: (lv_index_7_0= RULE_INT )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2320:3: lv_index_7_0= RULE_INT
            	    {
            	    lv_index_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInsertValue5176); 

            	    			newLeafNode(lv_index_7_0, grammarAccess.getInsertValueAccess().getIndexINTTerminalRuleCall_6_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getInsertValueRule());
            	    	        }
            	           		addWithLastConsumed(
            	           			current, 
            	           			"index",
            	            		lv_index_7_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


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


            }

             leaveRule(); 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2344:1: entryRuleFence returns [EObject current=null] : iv_ruleFence= ruleFence EOF ;
    public final EObject entryRuleFence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFence = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2345:2: (iv_ruleFence= ruleFence EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2346:2: iv_ruleFence= ruleFence EOF
            {
             newCompositeNode(grammarAccess.getFenceRule()); 
            pushFollow(FOLLOW_ruleFence_in_entryRuleFence5219);
            iv_ruleFence=ruleFence();

            state._fsp--;

             current =iv_ruleFence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFence5229); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2353:1: ruleFence returns [EObject current=null] : (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) ) ;
    public final EObject ruleFence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_ordering_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2356:28: ( (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2357:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2357:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2357:3: otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_60_in_ruleFence5266); 

                	newLeafNode(otherlv_0, grammarAccess.getFenceAccess().getFenceKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2361:1: (otherlv_1= 'singlethread' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==61) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2361:3: otherlv_1= 'singlethread'
                    {
                    otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleFence5279); 

                        	newLeafNode(otherlv_1, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2365:3: ( (lv_ordering_2_0= ruleATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2366:1: (lv_ordering_2_0= ruleATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2366:1: (lv_ordering_2_0= ruleATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2367:3: lv_ordering_2_0= ruleATOMIC_ORDERING
            {
             
            	        newCompositeNode(grammarAccess.getFenceAccess().getOrderingATOMIC_ORDERINGParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleFence5302);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2391:1: entryRuleATOMIC_ORDERING returns [String current=null] : iv_ruleATOMIC_ORDERING= ruleATOMIC_ORDERING EOF ;
    public final String entryRuleATOMIC_ORDERING() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleATOMIC_ORDERING = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2392:2: (iv_ruleATOMIC_ORDERING= ruleATOMIC_ORDERING EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2393:2: iv_ruleATOMIC_ORDERING= ruleATOMIC_ORDERING EOF
            {
             newCompositeNode(grammarAccess.getATOMIC_ORDERINGRule()); 
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_entryRuleATOMIC_ORDERING5339);
            iv_ruleATOMIC_ORDERING=ruleATOMIC_ORDERING();

            state._fsp--;

             current =iv_ruleATOMIC_ORDERING.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleATOMIC_ORDERING5350); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2400:1: ruleATOMIC_ORDERING returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) ;
    public final AntlrDatatypeRuleToken ruleATOMIC_ORDERING() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2403:28: ( (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2404:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2404:1: (kw= 'unordered' | kw= 'monotonic' | kw= 'aquire' | kw= 'release' | kw= 'acq_rel' | kw= 'seq_cst' )
            int alt77=6;
            switch ( input.LA(1) ) {
            case 62:
                {
                alt77=1;
                }
                break;
            case 63:
                {
                alt77=2;
                }
                break;
            case 64:
                {
                alt77=3;
                }
                break;
            case 65:
                {
                alt77=4;
                }
                break;
            case 66:
                {
                alt77=5;
                }
                break;
            case 67:
                {
                alt77=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2405:2: kw= 'unordered'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleATOMIC_ORDERING5388); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getUnorderedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2412:2: kw= 'monotonic'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleATOMIC_ORDERING5407); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getMonotonicKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2419:2: kw= 'aquire'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleATOMIC_ORDERING5426); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getAquireKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2426:2: kw= 'release'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleATOMIC_ORDERING5445); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getReleaseKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2433:2: kw= 'acq_rel'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleATOMIC_ORDERING5464); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getATOMIC_ORDERINGAccess().getAcq_relKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2440:2: kw= 'seq_cst'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleATOMIC_ORDERING5483); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2453:1: entryRuleCmpXchg returns [EObject current=null] : iv_ruleCmpXchg= ruleCmpXchg EOF ;
    public final EObject entryRuleCmpXchg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpXchg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2454:2: (iv_ruleCmpXchg= ruleCmpXchg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2455:2: iv_ruleCmpXchg= ruleCmpXchg EOF
            {
             newCompositeNode(grammarAccess.getCmpXchgRule()); 
            pushFollow(FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg5523);
            iv_ruleCmpXchg=ruleCmpXchg();

            state._fsp--;

             current =iv_ruleCmpXchg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmpXchg5533); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2462:1: ruleCmpXchg returns [EObject current=null] : (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) otherlv_4= ',' ( (lv_comparetype_5_0= ruleType ) ) ( (lv_comparevalue_6_0= ruleType ) ) otherlv_7= ',' ( (lv_newtype_8_0= ruleType ) ) ( (lv_newvalue_9_0= ruleType ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) ) ;
    public final EObject ruleCmpXchg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_adresstype_2_0 = null;

        AntlrDatatypeRuleToken lv_adress_3_0 = null;

        AntlrDatatypeRuleToken lv_comparetype_5_0 = null;

        AntlrDatatypeRuleToken lv_comparevalue_6_0 = null;

        AntlrDatatypeRuleToken lv_newtype_8_0 = null;

        AntlrDatatypeRuleToken lv_newvalue_9_0 = null;

        AntlrDatatypeRuleToken lv_ordering_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2465:28: ( (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) otherlv_4= ',' ( (lv_comparetype_5_0= ruleType ) ) ( (lv_comparevalue_6_0= ruleType ) ) otherlv_7= ',' ( (lv_newtype_8_0= ruleType ) ) ( (lv_newvalue_9_0= ruleType ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2466:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) otherlv_4= ',' ( (lv_comparetype_5_0= ruleType ) ) ( (lv_comparevalue_6_0= ruleType ) ) otherlv_7= ',' ( (lv_newtype_8_0= ruleType ) ) ( (lv_newvalue_9_0= ruleType ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2466:1: (otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) otherlv_4= ',' ( (lv_comparetype_5_0= ruleType ) ) ( (lv_comparevalue_6_0= ruleType ) ) otherlv_7= ',' ( (lv_newtype_8_0= ruleType ) ) ( (lv_newvalue_9_0= ruleType ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2466:3: otherlv_0= 'cmpxchg' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) otherlv_4= ',' ( (lv_comparetype_5_0= ruleType ) ) ( (lv_comparevalue_6_0= ruleType ) ) otherlv_7= ',' ( (lv_newtype_8_0= ruleType ) ) ( (lv_newvalue_9_0= ruleType ) ) (otherlv_10= 'singlethread' )? ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleCmpXchg5570); 

                	newLeafNode(otherlv_0, grammarAccess.getCmpXchgAccess().getCmpxchgKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2470:1: (otherlv_1= 'volatile' )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==55) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2470:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleCmpXchg5583); 

                        	newLeafNode(otherlv_1, grammarAccess.getCmpXchgAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2474:3: ( (lv_adresstype_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2475:1: (lv_adresstype_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2475:1: (lv_adresstype_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2476:3: lv_adresstype_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getAdresstypeTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCmpXchg5606);
            lv_adresstype_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"adresstype",
                    		lv_adresstype_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2492:2: ( (lv_adress_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2493:1: (lv_adress_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2493:1: (lv_adress_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2494:3: lv_adress_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getAdressTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCmpXchg5627);
            lv_adress_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"adress",
                    		lv_adress_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleCmpXchg5639); 

                	newLeafNode(otherlv_4, grammarAccess.getCmpXchgAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2514:1: ( (lv_comparetype_5_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2515:1: (lv_comparetype_5_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2515:1: (lv_comparetype_5_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2516:3: lv_comparetype_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getComparetypeTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCmpXchg5660);
            lv_comparetype_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"comparetype",
                    		lv_comparetype_5_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2532:2: ( (lv_comparevalue_6_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2533:1: (lv_comparevalue_6_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2533:1: (lv_comparevalue_6_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2534:3: lv_comparevalue_6_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getComparevalueTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCmpXchg5681);
            lv_comparevalue_6_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"comparevalue",
                    		lv_comparevalue_6_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleCmpXchg5693); 

                	newLeafNode(otherlv_7, grammarAccess.getCmpXchgAccess().getCommaKeyword_7());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2554:1: ( (lv_newtype_8_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2555:1: (lv_newtype_8_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2555:1: (lv_newtype_8_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2556:3: lv_newtype_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getNewtypeTypeParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCmpXchg5714);
            lv_newtype_8_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"newtype",
                    		lv_newtype_8_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2572:2: ( (lv_newvalue_9_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2573:1: (lv_newvalue_9_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2573:1: (lv_newvalue_9_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2574:3: lv_newvalue_9_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getNewvalueTypeParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCmpXchg5735);
            lv_newvalue_9_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"newvalue",
                    		lv_newvalue_9_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2590:2: (otherlv_10= 'singlethread' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==61) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2590:4: otherlv_10= 'singlethread'
                    {
                    otherlv_10=(Token)match(input,61,FOLLOW_61_in_ruleCmpXchg5748); 

                        	newLeafNode(otherlv_10, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_10());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2594:3: ( (lv_ordering_11_0= ruleATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2595:1: (lv_ordering_11_0= ruleATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2595:1: (lv_ordering_11_0= ruleATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2596:3: lv_ordering_11_0= ruleATOMIC_ORDERING
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getOrderingATOMIC_ORDERINGParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleCmpXchg5771);
            lv_ordering_11_0=ruleATOMIC_ORDERING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"ordering",
                    		lv_ordering_11_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2620:1: entryRuleAtomicRMW returns [EObject current=null] : iv_ruleAtomicRMW= ruleAtomicRMW EOF ;
    public final EObject entryRuleAtomicRMW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRMW = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2621:2: (iv_ruleAtomicRMW= ruleAtomicRMW EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2622:2: iv_ruleAtomicRMW= ruleAtomicRMW EOF
            {
             newCompositeNode(grammarAccess.getAtomicRMWRule()); 
            pushFollow(FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW5807);
            iv_ruleAtomicRMW=ruleAtomicRMW();

            state._fsp--;

             current =iv_ruleAtomicRMW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRMW5817); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2629:1: ruleAtomicRMW returns [EObject current=null] : (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adresstype_3_0= ruleType ) ) ( (lv_adress_4_0= ruleType ) ) otherlv_5= ',' ( (lv_optype_6_0= ruleType ) ) ( (lv_opvalue_7_0= ruleType ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= ruleATOMIC_ORDERING ) ) ) ;
    public final EObject ruleAtomicRMW() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_adresstype_3_0 = null;

        AntlrDatatypeRuleToken lv_adress_4_0 = null;

        AntlrDatatypeRuleToken lv_optype_6_0 = null;

        AntlrDatatypeRuleToken lv_opvalue_7_0 = null;

        AntlrDatatypeRuleToken lv_ordering_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2632:28: ( (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adresstype_3_0= ruleType ) ) ( (lv_adress_4_0= ruleType ) ) otherlv_5= ',' ( (lv_optype_6_0= ruleType ) ) ( (lv_opvalue_7_0= ruleType ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= ruleATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2633:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adresstype_3_0= ruleType ) ) ( (lv_adress_4_0= ruleType ) ) otherlv_5= ',' ( (lv_optype_6_0= ruleType ) ) ( (lv_opvalue_7_0= ruleType ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= ruleATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2633:1: (otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adresstype_3_0= ruleType ) ) ( (lv_adress_4_0= ruleType ) ) otherlv_5= ',' ( (lv_optype_6_0= ruleType ) ) ( (lv_opvalue_7_0= ruleType ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= ruleATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2633:3: otherlv_0= 'atomicrmw' (otherlv_1= 'volatile' )? ruleBIN_OP ( (lv_adresstype_3_0= ruleType ) ) ( (lv_adress_4_0= ruleType ) ) otherlv_5= ',' ( (lv_optype_6_0= ruleType ) ) ( (lv_opvalue_7_0= ruleType ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= ruleATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleAtomicRMW5854); 

                	newLeafNode(otherlv_0, grammarAccess.getAtomicRMWAccess().getAtomicrmwKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2637:1: (otherlv_1= 'volatile' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==55) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2637:3: otherlv_1= 'volatile'
                    {
                    otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleAtomicRMW5867); 

                        	newLeafNode(otherlv_1, grammarAccess.getAtomicRMWAccess().getVolatileKeyword_1());
                        

                    }
                    break;

            }

             
                    newCompositeNode(grammarAccess.getAtomicRMWAccess().getBIN_OPParserRuleCall_2()); 
                
            pushFollow(FOLLOW_ruleBIN_OP_in_ruleAtomicRMW5885);
            ruleBIN_OP();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2649:1: ( (lv_adresstype_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2650:1: (lv_adresstype_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2650:1: (lv_adresstype_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2651:3: lv_adresstype_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getAdresstypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAtomicRMW5905);
            lv_adresstype_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"adresstype",
                    		lv_adresstype_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2667:2: ( (lv_adress_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2668:1: (lv_adress_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2668:1: (lv_adress_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2669:3: lv_adress_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getAdressTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAtomicRMW5926);
            lv_adress_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"adress",
                    		lv_adress_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleAtomicRMW5938); 

                	newLeafNode(otherlv_5, grammarAccess.getAtomicRMWAccess().getCommaKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2689:1: ( (lv_optype_6_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2690:1: (lv_optype_6_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2690:1: (lv_optype_6_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2691:3: lv_optype_6_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getOptypeTypeParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAtomicRMW5959);
            lv_optype_6_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"optype",
                    		lv_optype_6_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2707:2: ( (lv_opvalue_7_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2708:1: (lv_opvalue_7_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2708:1: (lv_opvalue_7_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2709:3: lv_opvalue_7_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getOpvalueTypeParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAtomicRMW5980);
            lv_opvalue_7_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"opvalue",
                    		lv_opvalue_7_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2725:2: (otherlv_8= 'singlethread' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==61) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2725:4: otherlv_8= 'singlethread'
                    {
                    otherlv_8=(Token)match(input,61,FOLLOW_61_in_ruleAtomicRMW5993); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_8());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2729:3: ( (lv_ordering_9_0= ruleATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2730:1: (lv_ordering_9_0= ruleATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2730:1: (lv_ordering_9_0= ruleATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2731:3: lv_ordering_9_0= ruleATOMIC_ORDERING
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getOrderingATOMIC_ORDERINGParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleAtomicRMW6016);
            lv_ordering_9_0=ruleATOMIC_ORDERING();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"ordering",
                    		lv_ordering_9_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2755:1: entryRuleBIN_OP returns [String current=null] : iv_ruleBIN_OP= ruleBIN_OP EOF ;
    public final String entryRuleBIN_OP() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBIN_OP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2756:2: (iv_ruleBIN_OP= ruleBIN_OP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2757:2: iv_ruleBIN_OP= ruleBIN_OP EOF
            {
             newCompositeNode(grammarAccess.getBIN_OPRule()); 
            pushFollow(FOLLOW_ruleBIN_OP_in_entryRuleBIN_OP6053);
            iv_ruleBIN_OP=ruleBIN_OP();

            state._fsp--;

             current =iv_ruleBIN_OP.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBIN_OP6064); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2764:1: ruleBIN_OP returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) ;
    public final AntlrDatatypeRuleToken ruleBIN_OP() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2767:28: ( (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2768:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2768:1: (kw= 'xchg' | kw= 'add' | kw= 'sub' | kw= 'and' | kw= 'nand' | kw= 'or' | kw= 'xor' | kw= 'max' | kw= 'min' | kw= 'umax' | kw= 'umin' )
            int alt82=11;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt82=1;
                }
                break;
            case 71:
                {
                alt82=2;
                }
                break;
            case 72:
                {
                alt82=3;
                }
                break;
            case 73:
                {
                alt82=4;
                }
                break;
            case 74:
                {
                alt82=5;
                }
                break;
            case 75:
                {
                alt82=6;
                }
                break;
            case 76:
                {
                alt82=7;
                }
                break;
            case 77:
                {
                alt82=8;
                }
                break;
            case 78:
                {
                alt82=9;
                }
                break;
            case 79:
                {
                alt82=10;
                }
                break;
            case 80:
                {
                alt82=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2769:2: kw= 'xchg'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleBIN_OP6102); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getXchgKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2776:2: kw= 'add'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleBIN_OP6121); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getAddKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2783:2: kw= 'sub'
                    {
                    kw=(Token)match(input,72,FOLLOW_72_in_ruleBIN_OP6140); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getSubKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2790:2: kw= 'and'
                    {
                    kw=(Token)match(input,73,FOLLOW_73_in_ruleBIN_OP6159); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getAndKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2797:2: kw= 'nand'
                    {
                    kw=(Token)match(input,74,FOLLOW_74_in_ruleBIN_OP6178); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getNandKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2804:2: kw= 'or'
                    {
                    kw=(Token)match(input,75,FOLLOW_75_in_ruleBIN_OP6197); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getOrKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2811:2: kw= 'xor'
                    {
                    kw=(Token)match(input,76,FOLLOW_76_in_ruleBIN_OP6216); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getXorKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2818:2: kw= 'max'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleBIN_OP6235); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getMaxKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2825:2: kw= 'min'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleBIN_OP6254); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getMinKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2832:2: kw= 'umax'
                    {
                    kw=(Token)match(input,79,FOLLOW_79_in_ruleBIN_OP6273); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getBIN_OPAccess().getUmaxKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2839:2: kw= 'umin'
                    {
                    kw=(Token)match(input,80,FOLLOW_80_in_ruleBIN_OP6292); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2852:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2853:2: (iv_ruleLoad= ruleLoad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2854:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_ruleLoad_in_entryRuleLoad6332);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoad6342); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2861:1: ruleLoad returns [EObject current=null] : ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) (otherlv_4= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_7= 'load' otherlv_8= 'atomic' (otherlv_9= 'volatile' )? ( (lv_adresstype_10_0= ruleType ) ) ( (lv_adress_11_0= ruleType ) ) (otherlv_12= 'singlethread' )? ( (lv_ordering_13_0= ruleATOMIC_ORDERING ) ) (otherlv_14= ',' otherlv_15= 'align' ( (lv_index_16_0= RULE_INT ) ) )? ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_index_16_0=null;
        AntlrDatatypeRuleToken lv_adresstype_2_0 = null;

        AntlrDatatypeRuleToken lv_adress_3_0 = null;

        AntlrDatatypeRuleToken lv_adresstype_10_0 = null;

        AntlrDatatypeRuleToken lv_adress_11_0 = null;

        AntlrDatatypeRuleToken lv_ordering_13_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2864:28: ( ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) (otherlv_4= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_7= 'load' otherlv_8= 'atomic' (otherlv_9= 'volatile' )? ( (lv_adresstype_10_0= ruleType ) ) ( (lv_adress_11_0= ruleType ) ) (otherlv_12= 'singlethread' )? ( (lv_ordering_13_0= ruleATOMIC_ORDERING ) ) (otherlv_14= ',' otherlv_15= 'align' ( (lv_index_16_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2865:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) (otherlv_4= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_7= 'load' otherlv_8= 'atomic' (otherlv_9= 'volatile' )? ( (lv_adresstype_10_0= ruleType ) ) ( (lv_adress_11_0= ruleType ) ) (otherlv_12= 'singlethread' )? ( (lv_ordering_13_0= ruleATOMIC_ORDERING ) ) (otherlv_14= ',' otherlv_15= 'align' ( (lv_index_16_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2865:1: ( (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) (otherlv_4= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_7= 'load' otherlv_8= 'atomic' (otherlv_9= 'volatile' )? ( (lv_adresstype_10_0= ruleType ) ) ( (lv_adress_11_0= ruleType ) ) (otherlv_12= 'singlethread' )? ( (lv_ordering_13_0= ruleATOMIC_ORDERING ) ) (otherlv_14= ',' otherlv_15= 'align' ( (lv_index_16_0= RULE_INT ) ) )? ) )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==81) ) {
                int LA90_1 = input.LA(2);

                if ( (LA90_1==82) ) {
                    alt90=2;
                }
                else if ( ((LA90_1>=RULE_VAR_TYPE && LA90_1<=RULE_INTEGER)||LA90_1==34||(LA90_1>=42 && LA90_1<=46)||LA90_1==55) ) {
                    alt90=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 90, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2865:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) (otherlv_4= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2865:2: (otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) (otherlv_4= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2865:4: otherlv_0= 'load' (otherlv_1= 'volatile' )? ( (lv_adresstype_2_0= ruleType ) ) ( (lv_adress_3_0= ruleType ) ) (otherlv_4= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    {
                    otherlv_0=(Token)match(input,81,FOLLOW_81_in_ruleLoad6380); 

                        	newLeafNode(otherlv_0, grammarAccess.getLoadAccess().getLoadKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2869:1: (otherlv_1= 'volatile' )?
                    int alt83=2;
                    int LA83_0 = input.LA(1);

                    if ( (LA83_0==55) ) {
                        alt83=1;
                    }
                    switch (alt83) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2869:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleLoad6393); 

                                	newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2873:3: ( (lv_adresstype_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2874:1: (lv_adresstype_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2874:1: (lv_adresstype_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2875:3: lv_adresstype_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdresstypeTypeParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLoad6416);
                    lv_adresstype_2_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"adresstype",
                            		lv_adresstype_2_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2891:2: ( (lv_adress_3_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2892:1: (lv_adress_3_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2892:1: (lv_adress_3_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2893:3: lv_adress_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLoad6437);
                    lv_adress_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"adress",
                            		lv_adress_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2909:2: (otherlv_4= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    loop86:
                    do {
                        int alt86=2;
                        int LA86_0 = input.LA(1);

                        if ( (LA86_0==27) ) {
                            alt86=1;
                        }


                        switch (alt86) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2909:4: otherlv_4= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    {
                    	    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleLoad6450); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getLoadAccess().getCommaKeyword_0_4_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2913:1: ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    int alt85=2;
                    	    int LA85_0 = input.LA(1);

                    	    if ( (LA85_0==83) ) {
                    	        alt85=1;
                    	    }
                    	    else if ( (LA85_0==196||LA85_0==217) ) {
                    	        alt85=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 85, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt85) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2914:5: ruleALIGNMENT
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getLoadAccess().getALIGNMENTParserRuleCall_0_4_1_0()); 
                    	                
                    	            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleLoad6467);
                    	            ruleALIGNMENT();

                    	            state._fsp--;

                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2922:6: ( ruleMetadataValue )+
                    	            {
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2922:6: ( ruleMetadataValue )+
                    	            int cnt84=0;
                    	            loop84:
                    	            do {
                    	                int alt84=2;
                    	                int LA84_0 = input.LA(1);

                    	                if ( (LA84_0==196||LA84_0==217) ) {
                    	                    alt84=1;
                    	                }


                    	                switch (alt84) {
                    	            	case 1 :
                    	            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2923:5: ruleMetadataValue
                    	            	    {
                    	            	     
                    	            	            newCompositeNode(grammarAccess.getLoadAccess().getMetadataValueParserRuleCall_0_4_1_1()); 
                    	            	        
                    	            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleLoad6489);
                    	            	    ruleMetadataValue();

                    	            	    state._fsp--;

                    	            	     
                    	            	            afterParserOrEnumRuleCall();
                    	            	        

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt84 >= 1 ) break loop84;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(84, input);
                    	                        throw eee;
                    	                }
                    	                cnt84++;
                    	            } while (true);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop86;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2931:6: (otherlv_7= 'load' otherlv_8= 'atomic' (otherlv_9= 'volatile' )? ( (lv_adresstype_10_0= ruleType ) ) ( (lv_adress_11_0= ruleType ) ) (otherlv_12= 'singlethread' )? ( (lv_ordering_13_0= ruleATOMIC_ORDERING ) ) (otherlv_14= ',' otherlv_15= 'align' ( (lv_index_16_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2931:6: (otherlv_7= 'load' otherlv_8= 'atomic' (otherlv_9= 'volatile' )? ( (lv_adresstype_10_0= ruleType ) ) ( (lv_adress_11_0= ruleType ) ) (otherlv_12= 'singlethread' )? ( (lv_ordering_13_0= ruleATOMIC_ORDERING ) ) (otherlv_14= ',' otherlv_15= 'align' ( (lv_index_16_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2931:8: otherlv_7= 'load' otherlv_8= 'atomic' (otherlv_9= 'volatile' )? ( (lv_adresstype_10_0= ruleType ) ) ( (lv_adress_11_0= ruleType ) ) (otherlv_12= 'singlethread' )? ( (lv_ordering_13_0= ruleATOMIC_ORDERING ) ) (otherlv_14= ',' otherlv_15= 'align' ( (lv_index_16_0= RULE_INT ) ) )?
                    {
                    otherlv_7=(Token)match(input,81,FOLLOW_81_in_ruleLoad6513); 

                        	newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getLoadKeyword_1_0());
                        
                    otherlv_8=(Token)match(input,82,FOLLOW_82_in_ruleLoad6525); 

                        	newLeafNode(otherlv_8, grammarAccess.getLoadAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2939:1: (otherlv_9= 'volatile' )?
                    int alt87=2;
                    int LA87_0 = input.LA(1);

                    if ( (LA87_0==55) ) {
                        alt87=1;
                    }
                    switch (alt87) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2939:3: otherlv_9= 'volatile'
                            {
                            otherlv_9=(Token)match(input,55,FOLLOW_55_in_ruleLoad6538); 

                                	newLeafNode(otherlv_9, grammarAccess.getLoadAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2943:3: ( (lv_adresstype_10_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2944:1: (lv_adresstype_10_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2944:1: (lv_adresstype_10_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2945:3: lv_adresstype_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdresstypeTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLoad6561);
                    lv_adresstype_10_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"adresstype",
                            		lv_adresstype_10_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2961:2: ( (lv_adress_11_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2962:1: (lv_adress_11_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2962:1: (lv_adress_11_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2963:3: lv_adress_11_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAdressTypeParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLoad6582);
                    lv_adress_11_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"adress",
                            		lv_adress_11_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2979:2: (otherlv_12= 'singlethread' )?
                    int alt88=2;
                    int LA88_0 = input.LA(1);

                    if ( (LA88_0==61) ) {
                        alt88=1;
                    }
                    switch (alt88) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2979:4: otherlv_12= 'singlethread'
                            {
                            otherlv_12=(Token)match(input,61,FOLLOW_61_in_ruleLoad6595); 

                                	newLeafNode(otherlv_12, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_5());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2983:3: ( (lv_ordering_13_0= ruleATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2984:1: (lv_ordering_13_0= ruleATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2984:1: (lv_ordering_13_0= ruleATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2985:3: lv_ordering_13_0= ruleATOMIC_ORDERING
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getOrderingATOMIC_ORDERINGParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleLoad6618);
                    lv_ordering_13_0=ruleATOMIC_ORDERING();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"ordering",
                            		lv_ordering_13_0, 
                            		"ATOMIC_ORDERING");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3001:2: (otherlv_14= ',' otherlv_15= 'align' ( (lv_index_16_0= RULE_INT ) ) )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==27) ) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3001:4: otherlv_14= ',' otherlv_15= 'align' ( (lv_index_16_0= RULE_INT ) )
                            {
                            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleLoad6631); 

                                	newLeafNode(otherlv_14, grammarAccess.getLoadAccess().getCommaKeyword_1_7_0());
                                
                            otherlv_15=(Token)match(input,83,FOLLOW_83_in_ruleLoad6643); 

                                	newLeafNode(otherlv_15, grammarAccess.getLoadAccess().getAlignKeyword_1_7_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3009:1: ( (lv_index_16_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3010:1: (lv_index_16_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3010:1: (lv_index_16_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3011:3: lv_index_16_0= RULE_INT
                            {
                            lv_index_16_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLoad6660); 

                            			newLeafNode(lv_index_16_0, grammarAccess.getLoadAccess().getIndexINTTerminalRuleCall_1_7_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLoadRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"index",
                                    		lv_index_16_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3035:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3036:2: (iv_ruleStore= ruleStore EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3037:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore6704);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore6714); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3044:1: ruleStore returns [EObject current=null] : ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_newtype_2_0= ruleType ) ) ( (lv_newvalue_3_0= ruleType ) ) otherlv_4= ',' ( (lv_adresstype_5_0= ruleType ) ) ( (lv_adress_6_0= ruleType ) ) (otherlv_7= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_10= 'store' otherlv_11= 'atomic' (otherlv_12= 'volatile' )? ( (lv_newtype_13_0= ruleType ) ) ( (lv_newvalue_14_0= ruleType ) ) otherlv_15= ',' ( (lv_adresstype_16_0= ruleType ) ) ( (lv_adress_17_0= ruleType ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= ruleATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_index_22_0= RULE_INT ) ) )? ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_index_22_0=null;
        AntlrDatatypeRuleToken lv_newtype_2_0 = null;

        AntlrDatatypeRuleToken lv_newvalue_3_0 = null;

        AntlrDatatypeRuleToken lv_adresstype_5_0 = null;

        AntlrDatatypeRuleToken lv_adress_6_0 = null;

        AntlrDatatypeRuleToken lv_newtype_13_0 = null;

        AntlrDatatypeRuleToken lv_newvalue_14_0 = null;

        AntlrDatatypeRuleToken lv_adresstype_16_0 = null;

        AntlrDatatypeRuleToken lv_adress_17_0 = null;

        AntlrDatatypeRuleToken lv_ordering_19_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3047:28: ( ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_newtype_2_0= ruleType ) ) ( (lv_newvalue_3_0= ruleType ) ) otherlv_4= ',' ( (lv_adresstype_5_0= ruleType ) ) ( (lv_adress_6_0= ruleType ) ) (otherlv_7= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_10= 'store' otherlv_11= 'atomic' (otherlv_12= 'volatile' )? ( (lv_newtype_13_0= ruleType ) ) ( (lv_newvalue_14_0= ruleType ) ) otherlv_15= ',' ( (lv_adresstype_16_0= ruleType ) ) ( (lv_adress_17_0= ruleType ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= ruleATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_index_22_0= RULE_INT ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3048:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_newtype_2_0= ruleType ) ) ( (lv_newvalue_3_0= ruleType ) ) otherlv_4= ',' ( (lv_adresstype_5_0= ruleType ) ) ( (lv_adress_6_0= ruleType ) ) (otherlv_7= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_10= 'store' otherlv_11= 'atomic' (otherlv_12= 'volatile' )? ( (lv_newtype_13_0= ruleType ) ) ( (lv_newvalue_14_0= ruleType ) ) otherlv_15= ',' ( (lv_adresstype_16_0= ruleType ) ) ( (lv_adress_17_0= ruleType ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= ruleATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_index_22_0= RULE_INT ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3048:1: ( (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_newtype_2_0= ruleType ) ) ( (lv_newvalue_3_0= ruleType ) ) otherlv_4= ',' ( (lv_adresstype_5_0= ruleType ) ) ( (lv_adress_6_0= ruleType ) ) (otherlv_7= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* ) | (otherlv_10= 'store' otherlv_11= 'atomic' (otherlv_12= 'volatile' )? ( (lv_newtype_13_0= ruleType ) ) ( (lv_newvalue_14_0= ruleType ) ) otherlv_15= ',' ( (lv_adresstype_16_0= ruleType ) ) ( (lv_adress_17_0= ruleType ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= ruleATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_index_22_0= RULE_INT ) ) )? ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==84) ) {
                int LA98_1 = input.LA(2);

                if ( (LA98_1==82) ) {
                    alt98=2;
                }
                else if ( ((LA98_1>=RULE_VAR_TYPE && LA98_1<=RULE_INTEGER)||LA98_1==34||(LA98_1>=42 && LA98_1<=46)||LA98_1==55) ) {
                    alt98=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 98, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3048:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_newtype_2_0= ruleType ) ) ( (lv_newvalue_3_0= ruleType ) ) otherlv_4= ',' ( (lv_adresstype_5_0= ruleType ) ) ( (lv_adress_6_0= ruleType ) ) (otherlv_7= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3048:2: (otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_newtype_2_0= ruleType ) ) ( (lv_newvalue_3_0= ruleType ) ) otherlv_4= ',' ( (lv_adresstype_5_0= ruleType ) ) ( (lv_adress_6_0= ruleType ) ) (otherlv_7= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3048:4: otherlv_0= 'store' (otherlv_1= 'volatile' )? ( (lv_newtype_2_0= ruleType ) ) ( (lv_newvalue_3_0= ruleType ) ) otherlv_4= ',' ( (lv_adresstype_5_0= ruleType ) ) ( (lv_adress_6_0= ruleType ) ) (otherlv_7= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    {
                    otherlv_0=(Token)match(input,84,FOLLOW_84_in_ruleStore6752); 

                        	newLeafNode(otherlv_0, grammarAccess.getStoreAccess().getStoreKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3052:1: (otherlv_1= 'volatile' )?
                    int alt91=2;
                    int LA91_0 = input.LA(1);

                    if ( (LA91_0==55) ) {
                        alt91=1;
                    }
                    switch (alt91) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3052:3: otherlv_1= 'volatile'
                            {
                            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleStore6765); 

                                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getVolatileKeyword_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3056:3: ( (lv_newtype_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3057:1: (lv_newtype_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3057:1: (lv_newtype_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3058:3: lv_newtype_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getNewtypeTypeParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleStore6788);
                    lv_newtype_2_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"newtype",
                            		lv_newtype_2_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3074:2: ( (lv_newvalue_3_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3075:1: (lv_newvalue_3_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3075:1: (lv_newvalue_3_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3076:3: lv_newvalue_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getNewvalueTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleStore6809);
                    lv_newvalue_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"newvalue",
                            		lv_newvalue_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleStore6821); 

                        	newLeafNode(otherlv_4, grammarAccess.getStoreAccess().getCommaKeyword_0_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3096:1: ( (lv_adresstype_5_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3097:1: (lv_adresstype_5_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3097:1: (lv_adresstype_5_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3098:3: lv_adresstype_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdresstypeTypeParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleStore6842);
                    lv_adresstype_5_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"adresstype",
                            		lv_adresstype_5_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3114:2: ( (lv_adress_6_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3115:1: (lv_adress_6_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3115:1: (lv_adress_6_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3116:3: lv_adress_6_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeParserRuleCall_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleStore6863);
                    lv_adress_6_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"adress",
                            		lv_adress_6_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3132:2: (otherlv_7= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ ) )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==27) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3132:4: otherlv_7= ',' ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    {
                    	    otherlv_7=(Token)match(input,27,FOLLOW_27_in_ruleStore6876); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getStoreAccess().getCommaKeyword_0_7_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3136:1: ( ruleALIGNMENT | ( ruleMetadataValue )+ )
                    	    int alt93=2;
                    	    int LA93_0 = input.LA(1);

                    	    if ( (LA93_0==83) ) {
                    	        alt93=1;
                    	    }
                    	    else if ( (LA93_0==196||LA93_0==217) ) {
                    	        alt93=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 93, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt93) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3137:5: ruleALIGNMENT
                    	            {
                    	             
                    	                    newCompositeNode(grammarAccess.getStoreAccess().getALIGNMENTParserRuleCall_0_7_1_0()); 
                    	                
                    	            pushFollow(FOLLOW_ruleALIGNMENT_in_ruleStore6893);
                    	            ruleALIGNMENT();

                    	            state._fsp--;

                    	             
                    	                    afterParserOrEnumRuleCall();
                    	                

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3145:6: ( ruleMetadataValue )+
                    	            {
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3145:6: ( ruleMetadataValue )+
                    	            int cnt92=0;
                    	            loop92:
                    	            do {
                    	                int alt92=2;
                    	                int LA92_0 = input.LA(1);

                    	                if ( (LA92_0==196||LA92_0==217) ) {
                    	                    alt92=1;
                    	                }


                    	                switch (alt92) {
                    	            	case 1 :
                    	            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3146:5: ruleMetadataValue
                    	            	    {
                    	            	     
                    	            	            newCompositeNode(grammarAccess.getStoreAccess().getMetadataValueParserRuleCall_0_7_1_1()); 
                    	            	        
                    	            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleStore6915);
                    	            	    ruleMetadataValue();

                    	            	    state._fsp--;

                    	            	     
                    	            	            afterParserOrEnumRuleCall();
                    	            	        

                    	            	    }
                    	            	    break;

                    	            	default :
                    	            	    if ( cnt92 >= 1 ) break loop92;
                    	                        EarlyExitException eee =
                    	                            new EarlyExitException(92, input);
                    	                        throw eee;
                    	                }
                    	                cnt92++;
                    	            } while (true);


                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3154:6: (otherlv_10= 'store' otherlv_11= 'atomic' (otherlv_12= 'volatile' )? ( (lv_newtype_13_0= ruleType ) ) ( (lv_newvalue_14_0= ruleType ) ) otherlv_15= ',' ( (lv_adresstype_16_0= ruleType ) ) ( (lv_adress_17_0= ruleType ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= ruleATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_index_22_0= RULE_INT ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3154:6: (otherlv_10= 'store' otherlv_11= 'atomic' (otherlv_12= 'volatile' )? ( (lv_newtype_13_0= ruleType ) ) ( (lv_newvalue_14_0= ruleType ) ) otherlv_15= ',' ( (lv_adresstype_16_0= ruleType ) ) ( (lv_adress_17_0= ruleType ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= ruleATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_index_22_0= RULE_INT ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3154:8: otherlv_10= 'store' otherlv_11= 'atomic' (otherlv_12= 'volatile' )? ( (lv_newtype_13_0= ruleType ) ) ( (lv_newvalue_14_0= ruleType ) ) otherlv_15= ',' ( (lv_adresstype_16_0= ruleType ) ) ( (lv_adress_17_0= ruleType ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= ruleATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_index_22_0= RULE_INT ) ) )?
                    {
                    otherlv_10=(Token)match(input,84,FOLLOW_84_in_ruleStore6939); 

                        	newLeafNode(otherlv_10, grammarAccess.getStoreAccess().getStoreKeyword_1_0());
                        
                    otherlv_11=(Token)match(input,82,FOLLOW_82_in_ruleStore6951); 

                        	newLeafNode(otherlv_11, grammarAccess.getStoreAccess().getAtomicKeyword_1_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3162:1: (otherlv_12= 'volatile' )?
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==55) ) {
                        alt95=1;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3162:3: otherlv_12= 'volatile'
                            {
                            otherlv_12=(Token)match(input,55,FOLLOW_55_in_ruleStore6964); 

                                	newLeafNode(otherlv_12, grammarAccess.getStoreAccess().getVolatileKeyword_1_2());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3166:3: ( (lv_newtype_13_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3167:1: (lv_newtype_13_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3167:1: (lv_newtype_13_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3168:3: lv_newtype_13_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getNewtypeTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleStore6987);
                    lv_newtype_13_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"newtype",
                            		lv_newtype_13_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3184:2: ( (lv_newvalue_14_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3185:1: (lv_newvalue_14_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3185:1: (lv_newvalue_14_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3186:3: lv_newvalue_14_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getNewvalueTypeParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleStore7008);
                    lv_newvalue_14_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"newvalue",
                            		lv_newvalue_14_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_15=(Token)match(input,27,FOLLOW_27_in_ruleStore7020); 

                        	newLeafNode(otherlv_15, grammarAccess.getStoreAccess().getCommaKeyword_1_5());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3206:1: ( (lv_adresstype_16_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3207:1: (lv_adresstype_16_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3207:1: (lv_adresstype_16_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3208:3: lv_adresstype_16_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdresstypeTypeParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleStore7041);
                    lv_adresstype_16_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"adresstype",
                            		lv_adresstype_16_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3224:2: ( (lv_adress_17_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3225:1: (lv_adress_17_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3225:1: (lv_adress_17_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3226:3: lv_adress_17_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getAdressTypeParserRuleCall_1_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleStore7062);
                    lv_adress_17_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"adress",
                            		lv_adress_17_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3242:2: (otherlv_18= 'singlethread' )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==61) ) {
                        alt96=1;
                    }
                    switch (alt96) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3242:4: otherlv_18= 'singlethread'
                            {
                            otherlv_18=(Token)match(input,61,FOLLOW_61_in_ruleStore7075); 

                                	newLeafNode(otherlv_18, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3246:3: ( (lv_ordering_19_0= ruleATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3247:1: (lv_ordering_19_0= ruleATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3247:1: (lv_ordering_19_0= ruleATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3248:3: lv_ordering_19_0= ruleATOMIC_ORDERING
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getOrderingATOMIC_ORDERINGParserRuleCall_1_9_0()); 
                    	    
                    pushFollow(FOLLOW_ruleATOMIC_ORDERING_in_ruleStore7098);
                    lv_ordering_19_0=ruleATOMIC_ORDERING();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"ordering",
                            		lv_ordering_19_0, 
                            		"ATOMIC_ORDERING");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3264:2: (otherlv_20= ',' otherlv_21= 'align' ( (lv_index_22_0= RULE_INT ) ) )?
                    int alt97=2;
                    int LA97_0 = input.LA(1);

                    if ( (LA97_0==27) ) {
                        alt97=1;
                    }
                    switch (alt97) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3264:4: otherlv_20= ',' otherlv_21= 'align' ( (lv_index_22_0= RULE_INT ) )
                            {
                            otherlv_20=(Token)match(input,27,FOLLOW_27_in_ruleStore7111); 

                                	newLeafNode(otherlv_20, grammarAccess.getStoreAccess().getCommaKeyword_1_10_0());
                                
                            otherlv_21=(Token)match(input,83,FOLLOW_83_in_ruleStore7123); 

                                	newLeafNode(otherlv_21, grammarAccess.getStoreAccess().getAlignKeyword_1_10_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3272:1: ( (lv_index_22_0= RULE_INT ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3273:1: (lv_index_22_0= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3273:1: (lv_index_22_0= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3274:3: lv_index_22_0= RULE_INT
                            {
                            lv_index_22_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleStore7140); 

                            			newLeafNode(lv_index_22_0, grammarAccess.getStoreAccess().getIndexINTTerminalRuleCall_1_10_2_0()); 
                            		

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStoreRule());
                            	        }
                                   		setWithLastConsumed(
                                   			current, 
                                   			"index",
                                    		lv_index_22_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3298:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3299:2: (iv_ruleCall= ruleCall EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3300:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall7184);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall7194); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3307:1: ruleCall returns [EObject current=null] : ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_adresstype_4_0= ruleType ) ) ( (lv_adress_5_0= ruleType ) ) ( (lv_pList_6_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_adresstype_4_0 = null;

        AntlrDatatypeRuleToken lv_adress_5_0 = null;

        EObject lv_pList_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3310:28: ( ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_adresstype_4_0= ruleType ) ) ( (lv_adress_5_0= ruleType ) ) ( (lv_pList_6_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3311:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_adresstype_4_0= ruleType ) ) ( (lv_adress_5_0= ruleType ) ) ( (lv_pList_6_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3311:1: ( (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_adresstype_4_0= ruleType ) ) ( (lv_adress_5_0= ruleType ) ) ( (lv_pList_6_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3311:2: (otherlv_0= 'tail' )? otherlv_1= 'call' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_adresstype_4_0= ruleType ) ) ( (lv_adress_5_0= ruleType ) ) ( (lv_pList_6_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3311:2: (otherlv_0= 'tail' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==85) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3311:4: otherlv_0= 'tail'
                    {
                    otherlv_0=(Token)match(input,85,FOLLOW_85_in_ruleCall7232); 

                        	newLeafNode(otherlv_0, grammarAccess.getCallAccess().getTailKeyword_0());
                        

                    }
                    break;

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleCall7246); 

                	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getCallKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3319:1: ( ruleCallingConv )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( ((LA100_0>=96 && LA100_0<=110)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3320:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getCallingConvParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleCall7263);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3327:3: ( ruleRETURN_ATTRIBUTES )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( ((LA101_0>=87 && LA101_0<=94)) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3328:5: ruleRETURN_ATTRIBUTES
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getRETURN_ATTRIBUTESParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleCall7281);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3335:3: ( (lv_adresstype_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3336:1: (lv_adresstype_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3336:1: (lv_adresstype_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3337:3: lv_adresstype_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getAdresstypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCall7303);
            lv_adresstype_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"adresstype",
                    		lv_adresstype_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3353:2: ( (lv_adress_5_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3354:1: (lv_adress_5_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3354:1: (lv_adress_5_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3355:3: lv_adress_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getAdressTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCall7324);
            lv_adress_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"adress",
                    		lv_adress_5_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3371:2: ( (lv_pList_6_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3372:1: (lv_pList_6_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3372:1: (lv_pList_6_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3373:3: lv_pList_6_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPListParameterListParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleCall7345);
            lv_pList_6_0=ruleParameterList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"pList",
                    		lv_pList_6_0, 
                    		"ParameterList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3389:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop102:
            do {
                int alt102=2;
                int LA102_0 = input.LA(1);

                if ( ((LA102_0>=111 && LA102_0<=128)) ) {
                    alt102=1;
                }


                switch (alt102) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3390:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_7()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall7362);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop102;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3405:1: entryRuleRETURN_ATTRIBUTES returns [String current=null] : iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF ;
    public final String entryRuleRETURN_ATTRIBUTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRETURN_ATTRIBUTES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3406:2: (iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3407:2: iv_ruleRETURN_ATTRIBUTES= ruleRETURN_ATTRIBUTES EOF
            {
             newCompositeNode(grammarAccess.getRETURN_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES7400);
            iv_ruleRETURN_ATTRIBUTES=ruleRETURN_ATTRIBUTES();

            state._fsp--;

             current =iv_ruleRETURN_ATTRIBUTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES7411); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3414:1: ruleRETURN_ATTRIBUTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) ;
    public final AntlrDatatypeRuleToken ruleRETURN_ATTRIBUTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3417:28: ( (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3418:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3418:1: (kw= 'zeroext' | kw= 'signext' | kw= 'inreg' | kw= 'byval' | kw= 'sret' | kw= 'noalias' | kw= 'nocapture' | kw= 'nest' )
            int alt103=8;
            switch ( input.LA(1) ) {
            case 87:
                {
                alt103=1;
                }
                break;
            case 88:
                {
                alt103=2;
                }
                break;
            case 89:
                {
                alt103=3;
                }
                break;
            case 90:
                {
                alt103=4;
                }
                break;
            case 91:
                {
                alt103=5;
                }
                break;
            case 92:
                {
                alt103=6;
                }
                break;
            case 93:
                {
                alt103=7;
                }
                break;
            case 94:
                {
                alt103=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3419:2: kw= 'zeroext'
                    {
                    kw=(Token)match(input,87,FOLLOW_87_in_ruleRETURN_ATTRIBUTES7449); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getZeroextKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3426:2: kw= 'signext'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleRETURN_ATTRIBUTES7468); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getSignextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3433:2: kw= 'inreg'
                    {
                    kw=(Token)match(input,89,FOLLOW_89_in_ruleRETURN_ATTRIBUTES7487); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getInregKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3440:2: kw= 'byval'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleRETURN_ATTRIBUTES7506); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getByvalKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3447:2: kw= 'sret'
                    {
                    kw=(Token)match(input,91,FOLLOW_91_in_ruleRETURN_ATTRIBUTES7525); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getSretKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3454:2: kw= 'noalias'
                    {
                    kw=(Token)match(input,92,FOLLOW_92_in_ruleRETURN_ATTRIBUTES7544); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getNoaliasKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3461:2: kw= 'nocapture'
                    {
                    kw=(Token)match(input,93,FOLLOW_93_in_ruleRETURN_ATTRIBUTES7563); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRETURN_ATTRIBUTESAccess().getNocaptureKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3468:2: kw= 'nest'
                    {
                    kw=(Token)match(input,94,FOLLOW_94_in_ruleRETURN_ATTRIBUTES7582); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3481:1: entryRuleAlloc returns [EObject current=null] : iv_ruleAlloc= ruleAlloc EOF ;
    public final EObject entryRuleAlloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlloc = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3482:2: (iv_ruleAlloc= ruleAlloc EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3483:2: iv_ruleAlloc= ruleAlloc EOF
            {
             newCompositeNode(grammarAccess.getAllocRule()); 
            pushFollow(FOLLOW_ruleAlloc_in_entryRuleAlloc7622);
            iv_ruleAlloc=ruleAlloc();

            state._fsp--;

             current =iv_ruleAlloc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlloc7632); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3490:1: ruleAlloc returns [EObject current=null] : (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numelementstype_3_0= ruleType ) ) ( (lv_numelementsvalue_4_0= ruleType ) ) )? (otherlv_5= ',' ruleALIGNMENT )? ) ;
    public final EObject ruleAlloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_numelementstype_3_0 = null;

        AntlrDatatypeRuleToken lv_numelementsvalue_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3493:28: ( (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numelementstype_3_0= ruleType ) ) ( (lv_numelementsvalue_4_0= ruleType ) ) )? (otherlv_5= ',' ruleALIGNMENT )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3494:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numelementstype_3_0= ruleType ) ) ( (lv_numelementsvalue_4_0= ruleType ) ) )? (otherlv_5= ',' ruleALIGNMENT )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3494:1: (otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numelementstype_3_0= ruleType ) ) ( (lv_numelementsvalue_4_0= ruleType ) ) )? (otherlv_5= ',' ruleALIGNMENT )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3494:3: otherlv_0= 'alloca' ( (lv_type_1_0= ruleType ) ) (otherlv_2= ',' ( (lv_numelementstype_3_0= ruleType ) ) ( (lv_numelementsvalue_4_0= ruleType ) ) )? (otherlv_5= ',' ruleALIGNMENT )?
            {
            otherlv_0=(Token)match(input,95,FOLLOW_95_in_ruleAlloc7669); 

                	newLeafNode(otherlv_0, grammarAccess.getAllocAccess().getAllocaKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3498:1: ( (lv_type_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3499:1: (lv_type_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3499:1: (lv_type_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3500:3: lv_type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getAllocAccess().getTypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleAlloc7690);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3516:2: (otherlv_2= ',' ( (lv_numelementstype_3_0= ruleType ) ) ( (lv_numelementsvalue_4_0= ruleType ) ) )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==27) ) {
                int LA104_1 = input.LA(2);

                if ( ((LA104_1>=RULE_VAR_TYPE && LA104_1<=RULE_INTEGER)||LA104_1==34||(LA104_1>=42 && LA104_1<=46)) ) {
                    alt104=1;
                }
            }
            switch (alt104) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3516:4: otherlv_2= ',' ( (lv_numelementstype_3_0= ruleType ) ) ( (lv_numelementsvalue_4_0= ruleType ) )
                    {
                    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAlloc7703); 

                        	newLeafNode(otherlv_2, grammarAccess.getAllocAccess().getCommaKeyword_2_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3520:1: ( (lv_numelementstype_3_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3521:1: (lv_numelementstype_3_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3521:1: (lv_numelementstype_3_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3522:3: lv_numelementstype_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getNumelementstypeTypeParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAlloc7724);
                    lv_numelementstype_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAllocRule());
                    	        }
                           		set(
                           			current, 
                           			"numelementstype",
                            		lv_numelementstype_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3538:2: ( (lv_numelementsvalue_4_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3539:1: (lv_numelementsvalue_4_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3539:1: (lv_numelementsvalue_4_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3540:3: lv_numelementsvalue_4_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getNumelementsvalueTypeParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleAlloc7745);
                    lv_numelementsvalue_4_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAllocRule());
                    	        }
                           		set(
                           			current, 
                           			"numelementsvalue",
                            		lv_numelementsvalue_4_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3556:4: (otherlv_5= ',' ruleALIGNMENT )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==27) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3556:6: otherlv_5= ',' ruleALIGNMENT
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleAlloc7760); 

                        	newLeafNode(otherlv_5, grammarAccess.getAllocAccess().getCommaKeyword_3_0());
                        
                     
                            newCompositeNode(grammarAccess.getAllocAccess().getALIGNMENTParserRuleCall_3_1()); 
                        
                    pushFollow(FOLLOW_ruleALIGNMENT_in_ruleAlloc7776);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3576:1: entryRuleCallingConv returns [String current=null] : iv_ruleCallingConv= ruleCallingConv EOF ;
    public final String entryRuleCallingConv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCallingConv = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3577:2: (iv_ruleCallingConv= ruleCallingConv EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3578:2: iv_ruleCallingConv= ruleCallingConv EOF
            {
             newCompositeNode(grammarAccess.getCallingConvRule()); 
            pushFollow(FOLLOW_ruleCallingConv_in_entryRuleCallingConv7814);
            iv_ruleCallingConv=ruleCallingConv();

            state._fsp--;

             current =iv_ruleCallingConv.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallingConv7825); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3585:1: ruleCallingConv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleCallingConv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_16=null;
        Token this_INT_18=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3588:28: ( (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3589:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3589:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT ) )
            int alt106=15;
            switch ( input.LA(1) ) {
            case 96:
                {
                alt106=1;
                }
                break;
            case 97:
                {
                alt106=2;
                }
                break;
            case 98:
                {
                alt106=3;
                }
                break;
            case 99:
                {
                alt106=4;
                }
                break;
            case 100:
                {
                alt106=5;
                }
                break;
            case 101:
                {
                alt106=6;
                }
                break;
            case 102:
                {
                alt106=7;
                }
                break;
            case 103:
                {
                alt106=8;
                }
                break;
            case 104:
                {
                alt106=9;
                }
                break;
            case 105:
                {
                alt106=10;
                }
                break;
            case 106:
                {
                alt106=11;
                }
                break;
            case 107:
                {
                alt106=12;
                }
                break;
            case 108:
                {
                alt106=13;
                }
                break;
            case 109:
                {
                alt106=14;
                }
                break;
            case 110:
                {
                alt106=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }

            switch (alt106) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3590:2: kw= 'ccc'
                    {
                    kw=(Token)match(input,96,FOLLOW_96_in_ruleCallingConv7863); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCccKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3597:2: kw= 'fastcc'
                    {
                    kw=(Token)match(input,97,FOLLOW_97_in_ruleCallingConv7882); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getFastccKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3604:2: kw= 'coldcc'
                    {
                    kw=(Token)match(input,98,FOLLOW_98_in_ruleCallingConv7901); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getColdccKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3611:2: kw= 'x86_stdcallcc'
                    {
                    kw=(Token)match(input,99,FOLLOW_99_in_ruleCallingConv7920); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_stdcallccKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3618:2: kw= 'x86_fastcallcc'
                    {
                    kw=(Token)match(input,100,FOLLOW_100_in_ruleCallingConv7939); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_fastcallccKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3625:2: kw= 'x86_thiscallcc'
                    {
                    kw=(Token)match(input,101,FOLLOW_101_in_ruleCallingConv7958); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_thiscallccKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3632:2: kw= 'arm_apcscc'
                    {
                    kw=(Token)match(input,102,FOLLOW_102_in_ruleCallingConv7977); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_apcsccKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3639:2: kw= 'arm_aapcscc'
                    {
                    kw=(Token)match(input,103,FOLLOW_103_in_ruleCallingConv7996); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcsccKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3646:2: kw= 'arm_aapcs_vfpcc'
                    {
                    kw=(Token)match(input,104,FOLLOW_104_in_ruleCallingConv8015); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcs_vfpccKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3653:2: kw= 'msp430_intrcc'
                    {
                    kw=(Token)match(input,105,FOLLOW_105_in_ruleCallingConv8034); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getMsp430_intrccKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3660:2: kw= 'ptx_kernel'
                    {
                    kw=(Token)match(input,106,FOLLOW_106_in_ruleCallingConv8053); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_kernelKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3667:2: kw= 'ptx_device'
                    {
                    kw=(Token)match(input,107,FOLLOW_107_in_ruleCallingConv8072); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_deviceKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3674:2: kw= 'spir_func'
                    {
                    kw=(Token)match(input,108,FOLLOW_108_in_ruleCallingConv8091); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_funcKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3681:2: kw= 'spir_kernel'
                    {
                    kw=(Token)match(input,109,FOLLOW_109_in_ruleCallingConv8110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_kernelKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3687:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3687:6: (kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3688:2: kw= 'cc' kw= '<' this_INT_16= RULE_INT kw= '>' this_INT_18= RULE_INT
                    {
                    kw=(Token)match(input,110,FOLLOW_110_in_ruleCallingConv8130); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCcKeyword_14_0()); 
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleCallingConv8143); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getLessThanSignKeyword_14_1()); 
                        
                    this_INT_16=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv8158); 

                    		current.merge(this_INT_16);
                        
                     
                        newLeafNode(this_INT_16, grammarAccess.getCallingConvAccess().getINTTerminalRuleCall_14_2()); 
                        
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleCallingConv8176); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getGreaterThanSignKeyword_14_3()); 
                        
                    this_INT_18=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCallingConv8191); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3727:1: entryRuleFUNCTION_ATTRIBUTES returns [String current=null] : iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF ;
    public final String entryRuleFUNCTION_ATTRIBUTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNCTION_ATTRIBUTES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3728:2: (iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3729:2: iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF
            {
             newCompositeNode(grammarAccess.getFUNCTION_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES8238);
            iv_ruleFUNCTION_ATTRIBUTES=ruleFUNCTION_ATTRIBUTES();

            state._fsp--;

             current =iv_ruleFUNCTION_ATTRIBUTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES8249); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3736:1: ruleFUNCTION_ATTRIBUTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) ;
    public final AntlrDatatypeRuleToken ruleFUNCTION_ATTRIBUTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_4=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3739:28: ( (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3740:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3740:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            int alt107=18;
            switch ( input.LA(1) ) {
            case 111:
                {
                alt107=1;
                }
                break;
            case 112:
                {
                alt107=2;
                }
                break;
            case 113:
                {
                alt107=3;
                }
                break;
            case 114:
                {
                alt107=4;
                }
                break;
            case 115:
                {
                alt107=5;
                }
                break;
            case 116:
                {
                alt107=6;
                }
                break;
            case 117:
                {
                alt107=7;
                }
                break;
            case 118:
                {
                alt107=8;
                }
                break;
            case 119:
                {
                alt107=9;
                }
                break;
            case 120:
                {
                alt107=10;
                }
                break;
            case 121:
                {
                alt107=11;
                }
                break;
            case 122:
                {
                alt107=12;
                }
                break;
            case 123:
                {
                alt107=13;
                }
                break;
            case 124:
                {
                alt107=14;
                }
                break;
            case 125:
                {
                alt107=15;
                }
                break;
            case 126:
                {
                alt107=16;
                }
                break;
            case 127:
                {
                alt107=17;
                }
                break;
            case 128:
                {
                alt107=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3741:2: kw= 'address_safety'
                    {
                    kw=(Token)match(input,111,FOLLOW_111_in_ruleFUNCTION_ATTRIBUTES8287); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAddress_safetyKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3747:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3747:6: (kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3748:2: kw= 'alignstack' kw= '(' kw= '<' this_INT_4= RULE_INT kw= '>' kw= ')'
                    {
                    kw=(Token)match(input,112,FOLLOW_112_in_ruleFUNCTION_ATTRIBUTES8307); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlignstackKeyword_1_0()); 
                        
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleFUNCTION_ATTRIBUTES8320); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLeftParenthesisKeyword_1_1()); 
                        
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleFUNCTION_ATTRIBUTES8333); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLessThanSignKeyword_1_2()); 
                        
                    this_INT_4=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleFUNCTION_ATTRIBUTES8348); 

                    		current.merge(this_INT_4);
                        
                     
                        newLeafNode(this_INT_4, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getINTTerminalRuleCall_1_3()); 
                        
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleFUNCTION_ATTRIBUTES8366); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getGreaterThanSignKeyword_1_4()); 
                        
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleFUNCTION_ATTRIBUTES8379); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getRightParenthesisKeyword_1_5()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3786:2: kw= 'alwaysinline'
                    {
                    kw=(Token)match(input,113,FOLLOW_113_in_ruleFUNCTION_ATTRIBUTES8399); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlwaysinlineKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3793:2: kw= 'nonlazybind'
                    {
                    kw=(Token)match(input,114,FOLLOW_114_in_ruleFUNCTION_ATTRIBUTES8418); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNonlazybindKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3800:2: kw= 'inlinehint'
                    {
                    kw=(Token)match(input,115,FOLLOW_115_in_ruleFUNCTION_ATTRIBUTES8437); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getInlinehintKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3807:2: kw= 'naked'
                    {
                    kw=(Token)match(input,116,FOLLOW_116_in_ruleFUNCTION_ATTRIBUTES8456); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNakedKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3814:2: kw= 'noimplicitfloat'
                    {
                    kw=(Token)match(input,117,FOLLOW_117_in_ruleFUNCTION_ATTRIBUTES8475); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoimplicitfloatKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3821:2: kw= 'noinline'
                    {
                    kw=(Token)match(input,118,FOLLOW_118_in_ruleFUNCTION_ATTRIBUTES8494); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoinlineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3828:2: kw= 'noredzone'
                    {
                    kw=(Token)match(input,119,FOLLOW_119_in_ruleFUNCTION_ATTRIBUTES8513); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoredzoneKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3835:2: kw= 'noreturn'
                    {
                    kw=(Token)match(input,120,FOLLOW_120_in_ruleFUNCTION_ATTRIBUTES8532); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoreturnKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3842:2: kw= 'nounwind'
                    {
                    kw=(Token)match(input,121,FOLLOW_121_in_ruleFUNCTION_ATTRIBUTES8551); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNounwindKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3849:2: kw= 'optsize'
                    {
                    kw=(Token)match(input,122,FOLLOW_122_in_ruleFUNCTION_ATTRIBUTES8570); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getOptsizeKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3856:2: kw= 'readnone'
                    {
                    kw=(Token)match(input,123,FOLLOW_123_in_ruleFUNCTION_ATTRIBUTES8589); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadnoneKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3863:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,124,FOLLOW_124_in_ruleFUNCTION_ATTRIBUTES8608); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadonlyKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3870:2: kw= 'returns_twice'
                    {
                    kw=(Token)match(input,125,FOLLOW_125_in_ruleFUNCTION_ATTRIBUTES8627); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReturns_twiceKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3877:2: kw= 'ssp'
                    {
                    kw=(Token)match(input,126,FOLLOW_126_in_ruleFUNCTION_ATTRIBUTES8646); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3884:2: kw= 'sspreq'
                    {
                    kw=(Token)match(input,127,FOLLOW_127_in_ruleFUNCTION_ATTRIBUTES8665); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspreqKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3891:2: kw= 'uwtable'
                    {
                    kw=(Token)match(input,128,FOLLOW_128_in_ruleFUNCTION_ATTRIBUTES8684); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3904:1: entryRulePHI returns [EObject current=null] : iv_rulePHI= rulePHI EOF ;
    public final EObject entryRulePHI() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePHI = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3905:2: (iv_rulePHI= rulePHI EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3906:2: iv_rulePHI= rulePHI EOF
            {
             newCompositeNode(grammarAccess.getPHIRule()); 
            pushFollow(FOLLOW_rulePHI_in_entryRulePHI8724);
            iv_rulePHI=rulePHI();

            state._fsp--;

             current =iv_rulePHI; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePHI8734); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3913:1: rulePHI returns [EObject current=null] : (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3916:28: ( (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3917:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3917:1: (otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3917:3: otherlv_0= 'phi' ruleType otherlv_2= '[' ( (lv_values_3_0= ruleValuePair ) ) otherlv_4= ']' (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            {
            otherlv_0=(Token)match(input,129,FOLLOW_129_in_rulePHI8771); 

                	newLeafNode(otherlv_0, grammarAccess.getPHIAccess().getPhiKeyword_0());
                
             
                    newCompositeNode(grammarAccess.getPHIAccess().getTypeParserRuleCall_1()); 
                
            pushFollow(FOLLOW_ruleType_in_rulePHI8787);
            ruleType();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_rulePHI8798); 

                	newLeafNode(otherlv_2, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3933:1: ( (lv_values_3_0= ruleValuePair ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3934:1: (lv_values_3_0= ruleValuePair )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3934:1: (lv_values_3_0= ruleValuePair )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3935:3: lv_values_3_0= ruleValuePair
            {
             
            	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValuePair_in_rulePHI8819);
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

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_rulePHI8831); 

                	newLeafNode(otherlv_4, grammarAccess.getPHIAccess().getRightSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3955:1: (otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']' )*
            loop108:
            do {
                int alt108=2;
                int LA108_0 = input.LA(1);

                if ( (LA108_0==27) ) {
                    alt108=1;
                }


                switch (alt108) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3955:3: otherlv_5= ',' otherlv_6= '[' ( (lv_values_7_0= ruleValuePair ) ) otherlv_8= ']'
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_27_in_rulePHI8844); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPHIAccess().getCommaKeyword_5_0());
            	        
            	    otherlv_6=(Token)match(input,26,FOLLOW_26_in_rulePHI8856); 

            	        	newLeafNode(otherlv_6, grammarAccess.getPHIAccess().getLeftSquareBracketKeyword_5_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3963:1: ( (lv_values_7_0= ruleValuePair ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3964:1: (lv_values_7_0= ruleValuePair )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3964:1: (lv_values_7_0= ruleValuePair )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3965:3: lv_values_7_0= ruleValuePair
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPHIAccess().getValuesValuePairParserRuleCall_5_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValuePair_in_rulePHI8877);
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

            	    otherlv_8=(Token)match(input,28,FOLLOW_28_in_rulePHI8889); 

            	        	newLeafNode(otherlv_8, grammarAccess.getPHIAccess().getRightSquareBracketKeyword_5_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop108;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3993:1: entryRuleValuePair returns [EObject current=null] : iv_ruleValuePair= ruleValuePair EOF ;
    public final EObject entryRuleValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValuePair = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3994:2: (iv_ruleValuePair= ruleValuePair EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3995:2: iv_ruleValuePair= ruleValuePair EOF
            {
             newCompositeNode(grammarAccess.getValuePairRule()); 
            pushFollow(FOLLOW_ruleValuePair_in_entryRuleValuePair8927);
            iv_ruleValuePair=ruleValuePair();

            state._fsp--;

             current =iv_ruleValuePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValuePair8937); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4002:1: ruleValuePair returns [EObject current=null] : ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) ) ;
    public final EObject ruleValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value1_0_0 = null;

        AntlrDatatypeRuleToken lv_value2_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4005:28: ( ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4006:1: ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4006:1: ( ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4006:2: ( (lv_value1_0_0= ruleType ) ) otherlv_1= ',' ( (lv_value2_2_0= ruleType ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4006:2: ( (lv_value1_0_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4007:1: (lv_value1_0_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4007:1: (lv_value1_0_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4008:3: lv_value1_0_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getValuePairAccess().getValue1TypeParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleValuePair8983);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleValuePair8995); 

                	newLeafNode(otherlv_1, grammarAccess.getValuePairAccess().getCommaKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4028:1: ( (lv_value2_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4029:1: (lv_value2_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4029:1: (lv_value2_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4030:3: lv_value2_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getValuePairAccess().getValue2TypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleValuePair9016);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4054:1: entryRuleLandingPad returns [EObject current=null] : iv_ruleLandingPad= ruleLandingPad EOF ;
    public final EObject entryRuleLandingPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingPad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4055:2: (iv_ruleLandingPad= ruleLandingPad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4056:2: iv_ruleLandingPad= ruleLandingPad EOF
            {
             newCompositeNode(grammarAccess.getLandingPadRule()); 
            pushFollow(FOLLOW_ruleLandingPad_in_entryRuleLandingPad9052);
            iv_ruleLandingPad=ruleLandingPad();

            state._fsp--;

             current =iv_ruleLandingPad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLandingPad9062); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4063:1: ruleLandingPad returns [EObject current=null] : ( (otherlv_0= 'landingpad' ( (lv_struct_1_0= ruleStructure ) ) otherlv_2= 'personality' ( (lv_personalitytype_3_0= ruleType ) ) ( (lv_personalityvalue_4_0= ruleType ) ) ( (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* ) | ( (lv_clause_7_0= ruleClause ) )+ ) ) | (otherlv_8= 'landingpad' ( (lv_struct_9_0= ruleStructure ) ) otherlv_10= 'personality' ( (lv_personalitytype_11_0= ruleType ) ) ( (lv_personalityfunction_12_0= ruleCAST_TYPE ) ) otherlv_13= '(' ( (lv_value_14_0= ruleType ) ) this_OREST_15= RULE_OREST this_VAR_TYPE_16= RULE_VAR_TYPE otherlv_17= 'to' ( (lv_castto_18_0= ruleType ) ) otherlv_19= ')' ( (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* ) | ( (lv_clause_22_0= ruleClause ) )+ ) ) ) ;
    public final EObject ruleLandingPad() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token this_OREST_15=null;
        Token this_VAR_TYPE_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        EObject lv_struct_1_0 = null;

        AntlrDatatypeRuleToken lv_personalitytype_3_0 = null;

        AntlrDatatypeRuleToken lv_personalityvalue_4_0 = null;

        EObject lv_clause_6_0 = null;

        EObject lv_clause_7_0 = null;

        EObject lv_struct_9_0 = null;

        AntlrDatatypeRuleToken lv_personalitytype_11_0 = null;

        AntlrDatatypeRuleToken lv_personalityfunction_12_0 = null;

        AntlrDatatypeRuleToken lv_value_14_0 = null;

        AntlrDatatypeRuleToken lv_castto_18_0 = null;

        EObject lv_clause_21_0 = null;

        EObject lv_clause_22_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4066:28: ( ( (otherlv_0= 'landingpad' ( (lv_struct_1_0= ruleStructure ) ) otherlv_2= 'personality' ( (lv_personalitytype_3_0= ruleType ) ) ( (lv_personalityvalue_4_0= ruleType ) ) ( (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* ) | ( (lv_clause_7_0= ruleClause ) )+ ) ) | (otherlv_8= 'landingpad' ( (lv_struct_9_0= ruleStructure ) ) otherlv_10= 'personality' ( (lv_personalitytype_11_0= ruleType ) ) ( (lv_personalityfunction_12_0= ruleCAST_TYPE ) ) otherlv_13= '(' ( (lv_value_14_0= ruleType ) ) this_OREST_15= RULE_OREST this_VAR_TYPE_16= RULE_VAR_TYPE otherlv_17= 'to' ( (lv_castto_18_0= ruleType ) ) otherlv_19= ')' ( (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* ) | ( (lv_clause_22_0= ruleClause ) )+ ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4067:1: ( (otherlv_0= 'landingpad' ( (lv_struct_1_0= ruleStructure ) ) otherlv_2= 'personality' ( (lv_personalitytype_3_0= ruleType ) ) ( (lv_personalityvalue_4_0= ruleType ) ) ( (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* ) | ( (lv_clause_7_0= ruleClause ) )+ ) ) | (otherlv_8= 'landingpad' ( (lv_struct_9_0= ruleStructure ) ) otherlv_10= 'personality' ( (lv_personalitytype_11_0= ruleType ) ) ( (lv_personalityfunction_12_0= ruleCAST_TYPE ) ) otherlv_13= '(' ( (lv_value_14_0= ruleType ) ) this_OREST_15= RULE_OREST this_VAR_TYPE_16= RULE_VAR_TYPE otherlv_17= 'to' ( (lv_castto_18_0= ruleType ) ) otherlv_19= ')' ( (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* ) | ( (lv_clause_22_0= ruleClause ) )+ ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4067:1: ( (otherlv_0= 'landingpad' ( (lv_struct_1_0= ruleStructure ) ) otherlv_2= 'personality' ( (lv_personalitytype_3_0= ruleType ) ) ( (lv_personalityvalue_4_0= ruleType ) ) ( (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* ) | ( (lv_clause_7_0= ruleClause ) )+ ) ) | (otherlv_8= 'landingpad' ( (lv_struct_9_0= ruleStructure ) ) otherlv_10= 'personality' ( (lv_personalitytype_11_0= ruleType ) ) ( (lv_personalityfunction_12_0= ruleCAST_TYPE ) ) otherlv_13= '(' ( (lv_value_14_0= ruleType ) ) this_OREST_15= RULE_OREST this_VAR_TYPE_16= RULE_VAR_TYPE otherlv_17= 'to' ( (lv_castto_18_0= ruleType ) ) otherlv_19= ')' ( (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* ) | ( (lv_clause_22_0= ruleClause ) )+ ) ) )
            int alt115=2;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4067:2: (otherlv_0= 'landingpad' ( (lv_struct_1_0= ruleStructure ) ) otherlv_2= 'personality' ( (lv_personalitytype_3_0= ruleType ) ) ( (lv_personalityvalue_4_0= ruleType ) ) ( (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* ) | ( (lv_clause_7_0= ruleClause ) )+ ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4067:2: (otherlv_0= 'landingpad' ( (lv_struct_1_0= ruleStructure ) ) otherlv_2= 'personality' ( (lv_personalitytype_3_0= ruleType ) ) ( (lv_personalityvalue_4_0= ruleType ) ) ( (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* ) | ( (lv_clause_7_0= ruleClause ) )+ ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4067:4: otherlv_0= 'landingpad' ( (lv_struct_1_0= ruleStructure ) ) otherlv_2= 'personality' ( (lv_personalitytype_3_0= ruleType ) ) ( (lv_personalityvalue_4_0= ruleType ) ) ( (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* ) | ( (lv_clause_7_0= ruleClause ) )+ )
                    {
                    otherlv_0=(Token)match(input,130,FOLLOW_130_in_ruleLandingPad9100); 

                        	newLeafNode(otherlv_0, grammarAccess.getLandingPadAccess().getLandingpadKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4071:1: ( (lv_struct_1_0= ruleStructure ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4072:1: (lv_struct_1_0= ruleStructure )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4072:1: (lv_struct_1_0= ruleStructure )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4073:3: lv_struct_1_0= ruleStructure
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getStructStructureParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStructure_in_ruleLandingPad9121);
                    lv_struct_1_0=ruleStructure();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"struct",
                            		lv_struct_1_0, 
                            		"Structure");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,131,FOLLOW_131_in_ruleLandingPad9133); 

                        	newLeafNode(otherlv_2, grammarAccess.getLandingPadAccess().getPersonalityKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4093:1: ( (lv_personalitytype_3_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4094:1: (lv_personalitytype_3_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4094:1: (lv_personalitytype_3_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4095:3: lv_personalitytype_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalitytypeTypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad9154);
                    lv_personalitytype_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"personalitytype",
                            		lv_personalitytype_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4111:2: ( (lv_personalityvalue_4_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4112:1: (lv_personalityvalue_4_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4112:1: (lv_personalityvalue_4_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4113:3: lv_personalityvalue_4_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityvalueTypeParserRuleCall_0_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad9175);
                    lv_personalityvalue_4_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"personalityvalue",
                            		lv_personalityvalue_4_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4129:2: ( (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* ) | ( (lv_clause_7_0= ruleClause ) )+ )
                    int alt111=2;
                    int LA111_0 = input.LA(1);

                    if ( (LA111_0==132) ) {
                        alt111=1;
                    }
                    else if ( ((LA111_0>=134 && LA111_0<=135)) ) {
                        alt111=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 111, 0, input);

                        throw nvae;
                    }
                    switch (alt111) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4129:3: (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4129:3: (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4129:5: otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )*
                            {
                            otherlv_5=(Token)match(input,132,FOLLOW_132_in_ruleLandingPad9189); 

                                	newLeafNode(otherlv_5, grammarAccess.getLandingPadAccess().getCleanupKeyword_0_5_0_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4133:1: ( (lv_clause_6_0= ruleClause ) )*
                            loop109:
                            do {
                                int alt109=2;
                                int LA109_0 = input.LA(1);

                                if ( ((LA109_0>=134 && LA109_0<=135)) ) {
                                    alt109=1;
                                }


                                switch (alt109) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4134:1: (lv_clause_6_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4134:1: (lv_clause_6_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4135:3: lv_clause_6_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_0_5_0_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad9210);
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
                            	    break loop109;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4152:6: ( (lv_clause_7_0= ruleClause ) )+
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4152:6: ( (lv_clause_7_0= ruleClause ) )+
                            int cnt110=0;
                            loop110:
                            do {
                                int alt110=2;
                                int LA110_0 = input.LA(1);

                                if ( ((LA110_0>=134 && LA110_0<=135)) ) {
                                    alt110=1;
                                }


                                switch (alt110) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4153:1: (lv_clause_7_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4153:1: (lv_clause_7_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4154:3: lv_clause_7_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_0_5_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad9239);
                            	    lv_clause_7_0=ruleClause();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"clause",
                            	            		lv_clause_7_0, 
                            	            		"Clause");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt110 >= 1 ) break loop110;
                                        EarlyExitException eee =
                                            new EarlyExitException(110, input);
                                        throw eee;
                                }
                                cnt110++;
                            } while (true);


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4171:6: (otherlv_8= 'landingpad' ( (lv_struct_9_0= ruleStructure ) ) otherlv_10= 'personality' ( (lv_personalitytype_11_0= ruleType ) ) ( (lv_personalityfunction_12_0= ruleCAST_TYPE ) ) otherlv_13= '(' ( (lv_value_14_0= ruleType ) ) this_OREST_15= RULE_OREST this_VAR_TYPE_16= RULE_VAR_TYPE otherlv_17= 'to' ( (lv_castto_18_0= ruleType ) ) otherlv_19= ')' ( (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* ) | ( (lv_clause_22_0= ruleClause ) )+ ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4171:6: (otherlv_8= 'landingpad' ( (lv_struct_9_0= ruleStructure ) ) otherlv_10= 'personality' ( (lv_personalitytype_11_0= ruleType ) ) ( (lv_personalityfunction_12_0= ruleCAST_TYPE ) ) otherlv_13= '(' ( (lv_value_14_0= ruleType ) ) this_OREST_15= RULE_OREST this_VAR_TYPE_16= RULE_VAR_TYPE otherlv_17= 'to' ( (lv_castto_18_0= ruleType ) ) otherlv_19= ')' ( (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* ) | ( (lv_clause_22_0= ruleClause ) )+ ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4171:8: otherlv_8= 'landingpad' ( (lv_struct_9_0= ruleStructure ) ) otherlv_10= 'personality' ( (lv_personalitytype_11_0= ruleType ) ) ( (lv_personalityfunction_12_0= ruleCAST_TYPE ) ) otherlv_13= '(' ( (lv_value_14_0= ruleType ) ) this_OREST_15= RULE_OREST this_VAR_TYPE_16= RULE_VAR_TYPE otherlv_17= 'to' ( (lv_castto_18_0= ruleType ) ) otherlv_19= ')' ( (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* ) | ( (lv_clause_22_0= ruleClause ) )+ )
                    {
                    otherlv_8=(Token)match(input,130,FOLLOW_130_in_ruleLandingPad9261); 

                        	newLeafNode(otherlv_8, grammarAccess.getLandingPadAccess().getLandingpadKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4175:1: ( (lv_struct_9_0= ruleStructure ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4176:1: (lv_struct_9_0= ruleStructure )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4176:1: (lv_struct_9_0= ruleStructure )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4177:3: lv_struct_9_0= ruleStructure
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getStructStructureParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStructure_in_ruleLandingPad9282);
                    lv_struct_9_0=ruleStructure();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"struct",
                            		lv_struct_9_0, 
                            		"Structure");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,131,FOLLOW_131_in_ruleLandingPad9294); 

                        	newLeafNode(otherlv_10, grammarAccess.getLandingPadAccess().getPersonalityKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4197:1: ( (lv_personalitytype_11_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4198:1: (lv_personalitytype_11_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4198:1: (lv_personalitytype_11_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4199:3: lv_personalitytype_11_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalitytypeTypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad9315);
                    lv_personalitytype_11_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"personalitytype",
                            		lv_personalitytype_11_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4215:2: ( (lv_personalityfunction_12_0= ruleCAST_TYPE ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4216:1: (lv_personalityfunction_12_0= ruleCAST_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4216:1: (lv_personalityfunction_12_0= ruleCAST_TYPE )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4217:3: lv_personalityfunction_12_0= ruleCAST_TYPE
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityfunctionCAST_TYPEParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCAST_TYPE_in_ruleLandingPad9336);
                    lv_personalityfunction_12_0=ruleCAST_TYPE();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"personalityfunction",
                            		lv_personalityfunction_12_0, 
                            		"CAST_TYPE");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,51,FOLLOW_51_in_ruleLandingPad9348); 

                        	newLeafNode(otherlv_13, grammarAccess.getLandingPadAccess().getLeftParenthesisKeyword_1_5());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4237:1: ( (lv_value_14_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4238:1: (lv_value_14_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4238:1: (lv_value_14_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4239:3: lv_value_14_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getValueTypeParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad9369);
                    lv_value_14_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_14_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    this_OREST_15=(Token)match(input,RULE_OREST,FOLLOW_RULE_OREST_in_ruleLandingPad9380); 
                     
                        newLeafNode(this_OREST_15, grammarAccess.getLandingPadAccess().getORESTTerminalRuleCall_1_7()); 
                        
                    this_VAR_TYPE_16=(Token)match(input,RULE_VAR_TYPE,FOLLOW_RULE_VAR_TYPE_in_ruleLandingPad9390); 
                     
                        newLeafNode(this_VAR_TYPE_16, grammarAccess.getLandingPadAccess().getVAR_TYPETerminalRuleCall_1_8()); 
                        
                    otherlv_17=(Token)match(input,133,FOLLOW_133_in_ruleLandingPad9401); 

                        	newLeafNode(otherlv_17, grammarAccess.getLandingPadAccess().getToKeyword_1_9());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4267:1: ( (lv_castto_18_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4268:1: (lv_castto_18_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4268:1: (lv_castto_18_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4269:3: lv_castto_18_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getLandingPadAccess().getCasttoTypeParserRuleCall_1_10_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleLandingPad9422);
                    lv_castto_18_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	        }
                           		set(
                           			current, 
                           			"castto",
                            		lv_castto_18_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_19=(Token)match(input,52,FOLLOW_52_in_ruleLandingPad9434); 

                        	newLeafNode(otherlv_19, grammarAccess.getLandingPadAccess().getRightParenthesisKeyword_1_11());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4289:1: ( (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* ) | ( (lv_clause_22_0= ruleClause ) )+ )
                    int alt114=2;
                    int LA114_0 = input.LA(1);

                    if ( (LA114_0==132) ) {
                        alt114=1;
                    }
                    else if ( ((LA114_0>=134 && LA114_0<=135)) ) {
                        alt114=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 114, 0, input);

                        throw nvae;
                    }
                    switch (alt114) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4289:2: (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4289:2: (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4289:4: otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )*
                            {
                            otherlv_20=(Token)match(input,132,FOLLOW_132_in_ruleLandingPad9448); 

                                	newLeafNode(otherlv_20, grammarAccess.getLandingPadAccess().getCleanupKeyword_1_12_0_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4293:1: ( (lv_clause_21_0= ruleClause ) )*
                            loop112:
                            do {
                                int alt112=2;
                                int LA112_0 = input.LA(1);

                                if ( ((LA112_0>=134 && LA112_0<=135)) ) {
                                    alt112=1;
                                }


                                switch (alt112) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4294:1: (lv_clause_21_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4294:1: (lv_clause_21_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4295:3: lv_clause_21_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_1_12_0_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad9469);
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
                            	    break loop112;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4312:6: ( (lv_clause_22_0= ruleClause ) )+
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4312:6: ( (lv_clause_22_0= ruleClause ) )+
                            int cnt113=0;
                            loop113:
                            do {
                                int alt113=2;
                                int LA113_0 = input.LA(1);

                                if ( ((LA113_0>=134 && LA113_0<=135)) ) {
                                    alt113=1;
                                }


                                switch (alt113) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4313:1: (lv_clause_22_0= ruleClause )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4313:1: (lv_clause_22_0= ruleClause )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4314:3: lv_clause_22_0= ruleClause
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_1_12_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad9498);
                            	    lv_clause_22_0=ruleClause();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"clause",
                            	            		lv_clause_22_0, 
                            	            		"Clause");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4338:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4339:2: (iv_ruleClause= ruleClause EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4340:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause9537);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause9547); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4347:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) ) | (otherlv_3= 'filter' ( (lv_filtertype_4_0= ruleType ) ) ( (lv_filtervalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_filtertype_7_0= ruleType ) ) ( (lv_filtervalue_8_0= ruleType ) ) )* ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_type_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_filtertype_4_0 = null;

        AntlrDatatypeRuleToken lv_filtervalue_5_0 = null;

        AntlrDatatypeRuleToken lv_filtertype_7_0 = null;

        AntlrDatatypeRuleToken lv_filtervalue_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4350:28: ( ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) ) | (otherlv_3= 'filter' ( (lv_filtertype_4_0= ruleType ) ) ( (lv_filtervalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_filtertype_7_0= ruleType ) ) ( (lv_filtervalue_8_0= ruleType ) ) )* ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4351:1: ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) ) | (otherlv_3= 'filter' ( (lv_filtertype_4_0= ruleType ) ) ( (lv_filtervalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_filtertype_7_0= ruleType ) ) ( (lv_filtervalue_8_0= ruleType ) ) )* ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4351:1: ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) ) | (otherlv_3= 'filter' ( (lv_filtertype_4_0= ruleType ) ) ( (lv_filtervalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_filtertype_7_0= ruleType ) ) ( (lv_filtervalue_8_0= ruleType ) ) )* ) )
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==134) ) {
                alt117=1;
            }
            else if ( (LA117_0==135) ) {
                alt117=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }
            switch (alt117) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4351:2: (otherlv_0= 'catch' ( (lv_type_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4351:2: (otherlv_0= 'catch' ( (lv_type_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4351:4: otherlv_0= 'catch' ( (lv_type_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) )
                    {
                    otherlv_0=(Token)match(input,134,FOLLOW_134_in_ruleClause9585); 

                        	newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getCatchKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4355:1: ( (lv_type_1_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4356:1: (lv_type_1_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4356:1: (lv_type_1_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4357:3: lv_type_1_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getTypeTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleClause9606);
                    lv_type_1_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4373:2: ( (lv_value_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4374:1: (lv_value_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4374:1: (lv_value_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4375:3: lv_value_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getValueTypeParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleClause9627);
                    lv_value_2_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4392:6: (otherlv_3= 'filter' ( (lv_filtertype_4_0= ruleType ) ) ( (lv_filtervalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_filtertype_7_0= ruleType ) ) ( (lv_filtervalue_8_0= ruleType ) ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4392:6: (otherlv_3= 'filter' ( (lv_filtertype_4_0= ruleType ) ) ( (lv_filtervalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_filtertype_7_0= ruleType ) ) ( (lv_filtervalue_8_0= ruleType ) ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4392:8: otherlv_3= 'filter' ( (lv_filtertype_4_0= ruleType ) ) ( (lv_filtervalue_5_0= ruleType ) ) (otherlv_6= ',' ( (lv_filtertype_7_0= ruleType ) ) ( (lv_filtervalue_8_0= ruleType ) ) )*
                    {
                    otherlv_3=(Token)match(input,135,FOLLOW_135_in_ruleClause9647); 

                        	newLeafNode(otherlv_3, grammarAccess.getClauseAccess().getFilterKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4396:1: ( (lv_filtertype_4_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4397:1: (lv_filtertype_4_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4397:1: (lv_filtertype_4_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4398:3: lv_filtertype_4_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getFiltertypeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleClause9668);
                    lv_filtertype_4_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		add(
                           			current, 
                           			"filtertype",
                            		lv_filtertype_4_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4414:2: ( (lv_filtervalue_5_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4415:1: (lv_filtervalue_5_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4415:1: (lv_filtervalue_5_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4416:3: lv_filtervalue_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getFiltervalueTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleClause9689);
                    lv_filtervalue_5_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		add(
                           			current, 
                           			"filtervalue",
                            		lv_filtervalue_5_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4432:2: (otherlv_6= ',' ( (lv_filtertype_7_0= ruleType ) ) ( (lv_filtervalue_8_0= ruleType ) ) )*
                    loop116:
                    do {
                        int alt116=2;
                        int LA116_0 = input.LA(1);

                        if ( (LA116_0==27) ) {
                            alt116=1;
                        }


                        switch (alt116) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4432:4: otherlv_6= ',' ( (lv_filtertype_7_0= ruleType ) ) ( (lv_filtervalue_8_0= ruleType ) )
                    	    {
                    	    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleClause9702); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getClauseAccess().getCommaKeyword_1_3_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4436:1: ( (lv_filtertype_7_0= ruleType ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4437:1: (lv_filtertype_7_0= ruleType )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4437:1: (lv_filtertype_7_0= ruleType )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4438:3: lv_filtertype_7_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClauseAccess().getFiltertypeTypeParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleClause9723);
                    	    lv_filtertype_7_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"filtertype",
                    	            		lv_filtertype_7_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4454:2: ( (lv_filtervalue_8_0= ruleType ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4455:1: (lv_filtervalue_8_0= ruleType )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4455:1: (lv_filtervalue_8_0= ruleType )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4456:3: lv_filtervalue_8_0= ruleType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getClauseAccess().getFiltervalueTypeParserRuleCall_1_3_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleType_in_ruleClause9744);
                    	    lv_filtervalue_8_0=ruleType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"filtervalue",
                    	            		lv_filtervalue_8_0, 
                    	            		"Type");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop116;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4480:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4481:2: (iv_ruleSelect= ruleSelect EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4482:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect9783);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect9793); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4489:1: ruleSelect returns [EObject current=null] : (otherlv_0= 'select' ( (lv_conditiontype_1_0= ruleType ) ) ( (lv_conditionvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val1type_4_0= ruleType ) ) ( (lv_val1value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_val2type_7_0= ruleType ) ) ( (lv_val2value_8_0= ruleType ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_conditiontype_1_0 = null;

        AntlrDatatypeRuleToken lv_conditionvalue_2_0 = null;

        AntlrDatatypeRuleToken lv_val1type_4_0 = null;

        AntlrDatatypeRuleToken lv_val1value_5_0 = null;

        AntlrDatatypeRuleToken lv_val2type_7_0 = null;

        AntlrDatatypeRuleToken lv_val2value_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4492:28: ( (otherlv_0= 'select' ( (lv_conditiontype_1_0= ruleType ) ) ( (lv_conditionvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val1type_4_0= ruleType ) ) ( (lv_val1value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_val2type_7_0= ruleType ) ) ( (lv_val2value_8_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4493:1: (otherlv_0= 'select' ( (lv_conditiontype_1_0= ruleType ) ) ( (lv_conditionvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val1type_4_0= ruleType ) ) ( (lv_val1value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_val2type_7_0= ruleType ) ) ( (lv_val2value_8_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4493:1: (otherlv_0= 'select' ( (lv_conditiontype_1_0= ruleType ) ) ( (lv_conditionvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val1type_4_0= ruleType ) ) ( (lv_val1value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_val2type_7_0= ruleType ) ) ( (lv_val2value_8_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4493:3: otherlv_0= 'select' ( (lv_conditiontype_1_0= ruleType ) ) ( (lv_conditionvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val1type_4_0= ruleType ) ) ( (lv_val1value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_val2type_7_0= ruleType ) ) ( (lv_val2value_8_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,136,FOLLOW_136_in_ruleSelect9830); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectAccess().getSelectKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4497:1: ( (lv_conditiontype_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4498:1: (lv_conditiontype_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4498:1: (lv_conditiontype_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4499:3: lv_conditiontype_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getConditiontypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSelect9851);
            lv_conditiontype_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"conditiontype",
                    		lv_conditiontype_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4515:2: ( (lv_conditionvalue_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4516:1: (lv_conditionvalue_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4516:1: (lv_conditionvalue_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4517:3: lv_conditionvalue_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getConditionvalueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSelect9872);
            lv_conditionvalue_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"conditionvalue",
                    		lv_conditionvalue_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSelect9884); 

                	newLeafNode(otherlv_3, grammarAccess.getSelectAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4537:1: ( (lv_val1type_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4538:1: (lv_val1type_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4538:1: (lv_val1type_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4539:3: lv_val1type_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal1typeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSelect9905);
            lv_val1type_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"val1type",
                    		lv_val1type_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4555:2: ( (lv_val1value_5_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4556:1: (lv_val1value_5_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4556:1: (lv_val1value_5_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4557:3: lv_val1value_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal1valueTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSelect9926);
            lv_val1value_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"val1value",
                    		lv_val1value_5_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleSelect9938); 

                	newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4577:1: ( (lv_val2type_7_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4578:1: (lv_val2type_7_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4578:1: (lv_val2type_7_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4579:3: lv_val2type_7_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal2typeTypeParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSelect9959);
            lv_val2type_7_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"val2type",
                    		lv_val2type_7_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4595:2: ( (lv_val2value_8_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4596:1: (lv_val2value_8_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4596:1: (lv_val2value_8_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4597:3: lv_val2value_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getVal2valueTypeParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSelect9980);
            lv_val2value_8_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"val2value",
                    		lv_val2value_8_0, 
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
    // $ANTLR end "ruleSelect"


    // $ANTLR start "entryRuleVA_Arg"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4621:1: entryRuleVA_Arg returns [EObject current=null] : iv_ruleVA_Arg= ruleVA_Arg EOF ;
    public final EObject entryRuleVA_Arg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVA_Arg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4622:2: (iv_ruleVA_Arg= ruleVA_Arg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4623:2: iv_ruleVA_Arg= ruleVA_Arg EOF
            {
             newCompositeNode(grammarAccess.getVA_ArgRule()); 
            pushFollow(FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg10016);
            iv_ruleVA_Arg=ruleVA_Arg();

            state._fsp--;

             current =iv_ruleVA_Arg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVA_Arg10026); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4630:1: ruleVA_Arg returns [EObject current=null] : (otherlv_0= 'va_arg' ( (lv_listtype_1_0= ruleType ) ) ( (lv_listvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_argType_4_0= ruleType ) ) ) ;
    public final EObject ruleVA_Arg() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_listtype_1_0 = null;

        AntlrDatatypeRuleToken lv_listvalue_2_0 = null;

        AntlrDatatypeRuleToken lv_argType_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4633:28: ( (otherlv_0= 'va_arg' ( (lv_listtype_1_0= ruleType ) ) ( (lv_listvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_argType_4_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4634:1: (otherlv_0= 'va_arg' ( (lv_listtype_1_0= ruleType ) ) ( (lv_listvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_argType_4_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4634:1: (otherlv_0= 'va_arg' ( (lv_listtype_1_0= ruleType ) ) ( (lv_listvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_argType_4_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4634:3: otherlv_0= 'va_arg' ( (lv_listtype_1_0= ruleType ) ) ( (lv_listvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_argType_4_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,137,FOLLOW_137_in_ruleVA_Arg10063); 

                	newLeafNode(otherlv_0, grammarAccess.getVA_ArgAccess().getVa_argKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4638:1: ( (lv_listtype_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4639:1: (lv_listtype_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4639:1: (lv_listtype_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4640:3: lv_listtype_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getListtypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVA_Arg10084);
            lv_listtype_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVA_ArgRule());
            	        }
                   		set(
                   			current, 
                   			"listtype",
                    		lv_listtype_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4656:2: ( (lv_listvalue_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4657:1: (lv_listvalue_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4657:1: (lv_listvalue_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4658:3: lv_listvalue_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getListvalueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVA_Arg10105);
            lv_listvalue_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVA_ArgRule());
            	        }
                   		set(
                   			current, 
                   			"listvalue",
                    		lv_listvalue_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleVA_Arg10117); 

                	newLeafNode(otherlv_3, grammarAccess.getVA_ArgAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4678:1: ( (lv_argType_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4679:1: (lv_argType_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4679:1: (lv_argType_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4680:3: lv_argType_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getVA_ArgAccess().getArgTypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleVA_Arg10138);
            lv_argType_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVA_ArgRule());
            	        }
                   		set(
                   			current, 
                   			"argType",
                    		lv_argType_4_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4704:1: entryRuleExtractElement returns [EObject current=null] : iv_ruleExtractElement= ruleExtractElement EOF ;
    public final EObject entryRuleExtractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4705:2: (iv_ruleExtractElement= ruleExtractElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4706:2: iv_ruleExtractElement= ruleExtractElement EOF
            {
             newCompositeNode(grammarAccess.getExtractElementRule()); 
            pushFollow(FOLLOW_ruleExtractElement_in_entryRuleExtractElement10174);
            iv_ruleExtractElement=ruleExtractElement();

            state._fsp--;

             current =iv_ruleExtractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractElement10184); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4713:1: ruleExtractElement returns [EObject current=null] : (otherlv_0= 'extractelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_indextype_4_0= ruleType ) ) ( (lv_index_5_0= ruleType ) ) ) ;
    public final EObject ruleExtractElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_vectortype_1_0 = null;

        AntlrDatatypeRuleToken lv_vectorvalue_2_0 = null;

        AntlrDatatypeRuleToken lv_indextype_4_0 = null;

        AntlrDatatypeRuleToken lv_index_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4716:28: ( (otherlv_0= 'extractelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_indextype_4_0= ruleType ) ) ( (lv_index_5_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4717:1: (otherlv_0= 'extractelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_indextype_4_0= ruleType ) ) ( (lv_index_5_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4717:1: (otherlv_0= 'extractelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_indextype_4_0= ruleType ) ) ( (lv_index_5_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4717:3: otherlv_0= 'extractelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_indextype_4_0= ruleType ) ) ( (lv_index_5_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,138,FOLLOW_138_in_ruleExtractElement10221); 

                	newLeafNode(otherlv_0, grammarAccess.getExtractElementAccess().getExtractelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4721:1: ( (lv_vectortype_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4722:1: (lv_vectortype_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4722:1: (lv_vectortype_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4723:3: lv_vectortype_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getVectortypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleExtractElement10242);
            lv_vectortype_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractElementRule());
            	        }
                   		set(
                   			current, 
                   			"vectortype",
                    		lv_vectortype_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4739:2: ( (lv_vectorvalue_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4740:1: (lv_vectorvalue_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4740:1: (lv_vectorvalue_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4741:3: lv_vectorvalue_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getVectorvalueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleExtractElement10263);
            lv_vectorvalue_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractElementRule());
            	        }
                   		set(
                   			current, 
                   			"vectorvalue",
                    		lv_vectorvalue_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleExtractElement10275); 

                	newLeafNode(otherlv_3, grammarAccess.getExtractElementAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4761:1: ( (lv_indextype_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4762:1: (lv_indextype_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4762:1: (lv_indextype_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4763:3: lv_indextype_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getIndextypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleExtractElement10296);
            lv_indextype_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractElementRule());
            	        }
                   		set(
                   			current, 
                   			"indextype",
                    		lv_indextype_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4779:2: ( (lv_index_5_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4780:1: (lv_index_5_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4780:1: (lv_index_5_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4781:3: lv_index_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getIndexTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleExtractElement10317);
            lv_index_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractElementRule());
            	        }
                   		set(
                   			current, 
                   			"index",
                    		lv_index_5_0, 
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
    // $ANTLR end "ruleExtractElement"


    // $ANTLR start "entryRuleInsertElement"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4805:1: entryRuleInsertElement returns [EObject current=null] : iv_ruleInsertElement= ruleInsertElement EOF ;
    public final EObject entryRuleInsertElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4806:2: (iv_ruleInsertElement= ruleInsertElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4807:2: iv_ruleInsertElement= ruleInsertElement EOF
            {
             newCompositeNode(grammarAccess.getInsertElementRule()); 
            pushFollow(FOLLOW_ruleInsertElement_in_entryRuleInsertElement10353);
            iv_ruleInsertElement=ruleInsertElement();

            state._fsp--;

             current =iv_ruleInsertElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertElement10363); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4814:1: ruleInsertElement returns [EObject current=null] : (otherlv_0= 'insertelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_scalartype_4_0= ruleType ) ) ( (lv_scalarvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_indextype_7_0= ruleType ) ) ( (lv_index_8_0= ruleType ) ) ) ;
    public final EObject ruleInsertElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_vectortype_1_0 = null;

        AntlrDatatypeRuleToken lv_vectorvalue_2_0 = null;

        AntlrDatatypeRuleToken lv_scalartype_4_0 = null;

        AntlrDatatypeRuleToken lv_scalarvalue_5_0 = null;

        AntlrDatatypeRuleToken lv_indextype_7_0 = null;

        AntlrDatatypeRuleToken lv_index_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4817:28: ( (otherlv_0= 'insertelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_scalartype_4_0= ruleType ) ) ( (lv_scalarvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_indextype_7_0= ruleType ) ) ( (lv_index_8_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4818:1: (otherlv_0= 'insertelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_scalartype_4_0= ruleType ) ) ( (lv_scalarvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_indextype_7_0= ruleType ) ) ( (lv_index_8_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4818:1: (otherlv_0= 'insertelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_scalartype_4_0= ruleType ) ) ( (lv_scalarvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_indextype_7_0= ruleType ) ) ( (lv_index_8_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4818:3: otherlv_0= 'insertelement' ( (lv_vectortype_1_0= ruleType ) ) ( (lv_vectorvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_scalartype_4_0= ruleType ) ) ( (lv_scalarvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_indextype_7_0= ruleType ) ) ( (lv_index_8_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,139,FOLLOW_139_in_ruleInsertElement10400); 

                	newLeafNode(otherlv_0, grammarAccess.getInsertElementAccess().getInsertelementKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4822:1: ( (lv_vectortype_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4823:1: (lv_vectortype_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4823:1: (lv_vectortype_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4824:3: lv_vectortype_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getVectortypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertElement10421);
            lv_vectortype_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"vectortype",
                    		lv_vectortype_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4840:2: ( (lv_vectorvalue_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4841:1: (lv_vectorvalue_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4841:1: (lv_vectorvalue_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4842:3: lv_vectorvalue_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getVectorvalueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertElement10442);
            lv_vectorvalue_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"vectorvalue",
                    		lv_vectorvalue_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleInsertElement10454); 

                	newLeafNode(otherlv_3, grammarAccess.getInsertElementAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4862:1: ( (lv_scalartype_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4863:1: (lv_scalartype_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4863:1: (lv_scalartype_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4864:3: lv_scalartype_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getScalartypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertElement10475);
            lv_scalartype_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"scalartype",
                    		lv_scalartype_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4880:2: ( (lv_scalarvalue_5_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4881:1: (lv_scalarvalue_5_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4881:1: (lv_scalarvalue_5_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4882:3: lv_scalarvalue_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getScalarvalueTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertElement10496);
            lv_scalarvalue_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"scalarvalue",
                    		lv_scalarvalue_5_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleInsertElement10508); 

                	newLeafNode(otherlv_6, grammarAccess.getInsertElementAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4902:1: ( (lv_indextype_7_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4903:1: (lv_indextype_7_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4903:1: (lv_indextype_7_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4904:3: lv_indextype_7_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getIndextypeTypeParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertElement10529);
            lv_indextype_7_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"indextype",
                    		lv_indextype_7_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4920:2: ( (lv_index_8_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4921:1: (lv_index_8_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4921:1: (lv_index_8_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4922:3: lv_index_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getIndexTypeParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInsertElement10550);
            lv_index_8_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"index",
                    		lv_index_8_0, 
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
    // $ANTLR end "ruleInsertElement"


    // $ANTLR start "entryRuleShuffleVector"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4946:1: entryRuleShuffleVector returns [EObject current=null] : iv_ruleShuffleVector= ruleShuffleVector EOF ;
    public final EObject entryRuleShuffleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4947:2: (iv_ruleShuffleVector= ruleShuffleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4948:2: iv_ruleShuffleVector= ruleShuffleVector EOF
            {
             newCompositeNode(grammarAccess.getShuffleVectorRule()); 
            pushFollow(FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector10586);
            iv_ruleShuffleVector=ruleShuffleVector();

            state._fsp--;

             current =iv_ruleShuffleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShuffleVector10596); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4955:1: ruleShuffleVector returns [EObject current=null] : (otherlv_0= 'shufflevector' ( (lv_val1type_1_0= ruleType ) ) ( (lv_val1value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val2type_4_0= ruleType ) ) ( (lv_val2value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_masktype_7_0= ruleType ) ) ( (lv_maskvalue_8_0= ruleType ) ) ) ;
    public final EObject ruleShuffleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_val1type_1_0 = null;

        AntlrDatatypeRuleToken lv_val1value_2_0 = null;

        AntlrDatatypeRuleToken lv_val2type_4_0 = null;

        AntlrDatatypeRuleToken lv_val2value_5_0 = null;

        AntlrDatatypeRuleToken lv_masktype_7_0 = null;

        AntlrDatatypeRuleToken lv_maskvalue_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4958:28: ( (otherlv_0= 'shufflevector' ( (lv_val1type_1_0= ruleType ) ) ( (lv_val1value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val2type_4_0= ruleType ) ) ( (lv_val2value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_masktype_7_0= ruleType ) ) ( (lv_maskvalue_8_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4959:1: (otherlv_0= 'shufflevector' ( (lv_val1type_1_0= ruleType ) ) ( (lv_val1value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val2type_4_0= ruleType ) ) ( (lv_val2value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_masktype_7_0= ruleType ) ) ( (lv_maskvalue_8_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4959:1: (otherlv_0= 'shufflevector' ( (lv_val1type_1_0= ruleType ) ) ( (lv_val1value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val2type_4_0= ruleType ) ) ( (lv_val2value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_masktype_7_0= ruleType ) ) ( (lv_maskvalue_8_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4959:3: otherlv_0= 'shufflevector' ( (lv_val1type_1_0= ruleType ) ) ( (lv_val1value_2_0= ruleType ) ) otherlv_3= ',' ( (lv_val2type_4_0= ruleType ) ) ( (lv_val2value_5_0= ruleType ) ) otherlv_6= ',' ( (lv_masktype_7_0= ruleType ) ) ( (lv_maskvalue_8_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,140,FOLLOW_140_in_ruleShuffleVector10633); 

                	newLeafNode(otherlv_0, grammarAccess.getShuffleVectorAccess().getShufflevectorKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4963:1: ( (lv_val1type_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4964:1: (lv_val1type_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4964:1: (lv_val1type_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4965:3: lv_val1type_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVal1typeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleShuffleVector10654);
            lv_val1type_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"val1type",
                    		lv_val1type_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4981:2: ( (lv_val1value_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4982:1: (lv_val1value_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4982:1: (lv_val1value_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4983:3: lv_val1value_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVal1valueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleShuffleVector10675);
            lv_val1value_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"val1value",
                    		lv_val1value_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleShuffleVector10687); 

                	newLeafNode(otherlv_3, grammarAccess.getShuffleVectorAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5003:1: ( (lv_val2type_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5004:1: (lv_val2type_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5004:1: (lv_val2type_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5005:3: lv_val2type_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVal2typeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleShuffleVector10708);
            lv_val2type_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"val2type",
                    		lv_val2type_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5021:2: ( (lv_val2value_5_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5022:1: (lv_val2value_5_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5022:1: (lv_val2value_5_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5023:3: lv_val2value_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getVal2valueTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleShuffleVector10729);
            lv_val2value_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"val2value",
                    		lv_val2value_5_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleShuffleVector10741); 

                	newLeafNode(otherlv_6, grammarAccess.getShuffleVectorAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5043:1: ( (lv_masktype_7_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5044:1: (lv_masktype_7_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5044:1: (lv_masktype_7_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5045:3: lv_masktype_7_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getMasktypeTypeParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleShuffleVector10762);
            lv_masktype_7_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"masktype",
                    		lv_masktype_7_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5061:2: ( (lv_maskvalue_8_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5062:1: (lv_maskvalue_8_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5062:1: (lv_maskvalue_8_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5063:3: lv_maskvalue_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getMaskvalueTypeParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleShuffleVector10783);
            lv_maskvalue_8_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"maskvalue",
                    		lv_maskvalue_8_0, 
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
    // $ANTLR end "ruleShuffleVector"


    // $ANTLR start "entryRuleCast"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5087:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5088:2: (iv_ruleCast= ruleCast EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5089:2: iv_ruleCast= ruleCast EOF
            {
             newCompositeNode(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast10819);
            iv_ruleCast=ruleCast();

            state._fsp--;

             current =iv_ruleCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast10829); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5096:1: ruleCast returns [EObject current=null] : ( ruleCAST_TYPE ( (lv_castfrom_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= 'to' ( (lv_castto_4_0= ruleType ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_castfrom_1_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;

        AntlrDatatypeRuleToken lv_castto_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5099:28: ( ( ruleCAST_TYPE ( (lv_castfrom_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= 'to' ( (lv_castto_4_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5100:1: ( ruleCAST_TYPE ( (lv_castfrom_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= 'to' ( (lv_castto_4_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5100:1: ( ruleCAST_TYPE ( (lv_castfrom_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= 'to' ( (lv_castto_4_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5101:5: ruleCAST_TYPE ( (lv_castfrom_1_0= ruleType ) ) ( (lv_value_2_0= ruleType ) ) otherlv_3= 'to' ( (lv_castto_4_0= ruleType ) )
            {
             
                    newCompositeNode(grammarAccess.getCastAccess().getCAST_TYPEParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleCAST_TYPE_in_ruleCast10870);
            ruleCAST_TYPE();

            state._fsp--;

             
                    afterParserOrEnumRuleCall();
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5108:1: ( (lv_castfrom_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5109:1: (lv_castfrom_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5109:1: (lv_castfrom_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5110:3: lv_castfrom_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getCastfromTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCast10890);
            lv_castfrom_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastRule());
            	        }
                   		set(
                   			current, 
                   			"castfrom",
                    		lv_castfrom_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5126:2: ( (lv_value_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5127:1: (lv_value_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5127:1: (lv_value_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5128:3: lv_value_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getValueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCast10911);
            lv_value_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,133,FOLLOW_133_in_ruleCast10923); 

                	newLeafNode(otherlv_3, grammarAccess.getCastAccess().getToKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5148:1: ( (lv_castto_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5149:1: (lv_castto_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5149:1: (lv_castto_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5150:3: lv_castto_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getCasttoTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleCast10944);
            lv_castto_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastRule());
            	        }
                   		set(
                   			current, 
                   			"castto",
                    		lv_castto_4_0, 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5174:1: entryRuleCAST_TYPE returns [String current=null] : iv_ruleCAST_TYPE= ruleCAST_TYPE EOF ;
    public final String entryRuleCAST_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCAST_TYPE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5175:2: (iv_ruleCAST_TYPE= ruleCAST_TYPE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5176:2: iv_ruleCAST_TYPE= ruleCAST_TYPE EOF
            {
             newCompositeNode(grammarAccess.getCAST_TYPERule()); 
            pushFollow(FOLLOW_ruleCAST_TYPE_in_entryRuleCAST_TYPE10981);
            iv_ruleCAST_TYPE=ruleCAST_TYPE();

            state._fsp--;

             current =iv_ruleCAST_TYPE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCAST_TYPE10992); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5183:1: ruleCAST_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) ;
    public final AntlrDatatypeRuleToken ruleCAST_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5186:28: ( (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5187:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5187:1: (kw= 'trunc' | kw= 'zext' | kw= 'sext' | kw= 'fptrunc' | kw= 'fpext' | kw= 'fptoui' | kw= 'fptosi' | kw= 'uitofp' | kw= 'sitofp' | kw= 'ptrtoint' | kw= 'inttoptr' | kw= 'bitcast' )
            int alt118=12;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt118=1;
                }
                break;
            case 142:
                {
                alt118=2;
                }
                break;
            case 143:
                {
                alt118=3;
                }
                break;
            case 144:
                {
                alt118=4;
                }
                break;
            case 145:
                {
                alt118=5;
                }
                break;
            case 146:
                {
                alt118=6;
                }
                break;
            case 147:
                {
                alt118=7;
                }
                break;
            case 148:
                {
                alt118=8;
                }
                break;
            case 149:
                {
                alt118=9;
                }
                break;
            case 150:
                {
                alt118=10;
                }
                break;
            case 151:
                {
                alt118=11;
                }
                break;
            case 152:
                {
                alt118=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5188:2: kw= 'trunc'
                    {
                    kw=(Token)match(input,141,FOLLOW_141_in_ruleCAST_TYPE11030); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getTruncKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5195:2: kw= 'zext'
                    {
                    kw=(Token)match(input,142,FOLLOW_142_in_ruleCAST_TYPE11049); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getZextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5202:2: kw= 'sext'
                    {
                    kw=(Token)match(input,143,FOLLOW_143_in_ruleCAST_TYPE11068); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getSextKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5209:2: kw= 'fptrunc'
                    {
                    kw=(Token)match(input,144,FOLLOW_144_in_ruleCAST_TYPE11087); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFptruncKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5216:2: kw= 'fpext'
                    {
                    kw=(Token)match(input,145,FOLLOW_145_in_ruleCAST_TYPE11106); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFpextKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5223:2: kw= 'fptoui'
                    {
                    kw=(Token)match(input,146,FOLLOW_146_in_ruleCAST_TYPE11125); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFptouiKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5230:2: kw= 'fptosi'
                    {
                    kw=(Token)match(input,147,FOLLOW_147_in_ruleCAST_TYPE11144); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getFptosiKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5237:2: kw= 'uitofp'
                    {
                    kw=(Token)match(input,148,FOLLOW_148_in_ruleCAST_TYPE11163); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getUitofpKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5244:2: kw= 'sitofp'
                    {
                    kw=(Token)match(input,149,FOLLOW_149_in_ruleCAST_TYPE11182); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getSitofpKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5251:2: kw= 'ptrtoint'
                    {
                    kw=(Token)match(input,150,FOLLOW_150_in_ruleCAST_TYPE11201); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getPtrtointKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5258:2: kw= 'inttoptr'
                    {
                    kw=(Token)match(input,151,FOLLOW_151_in_ruleCAST_TYPE11220); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCAST_TYPEAccess().getInttoptrKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5265:2: kw= 'bitcast'
                    {
                    kw=(Token)match(input,152,FOLLOW_152_in_ruleCAST_TYPE11239); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5278:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5279:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5280:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare11279);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare11289); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5287:1: ruleCompare returns [EObject current=null] : ( (otherlv_0= 'icmp' ruleI_PREDICATES ( (lv_comptype_2_0= ruleType ) ) ( (lv_value1_3_0= ruleType ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleType ) ) ) | (otherlv_6= 'fcmp' ruleF_PREDICATES ( (lv_comptype_8_0= ruleType ) ) ( (lv_value1_9_0= ruleType ) ) otherlv_10= ',' ( (lv_value2_11_0= ruleType ) ) ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_comptype_2_0 = null;

        AntlrDatatypeRuleToken lv_value1_3_0 = null;

        AntlrDatatypeRuleToken lv_value2_5_0 = null;

        AntlrDatatypeRuleToken lv_comptype_8_0 = null;

        AntlrDatatypeRuleToken lv_value1_9_0 = null;

        AntlrDatatypeRuleToken lv_value2_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5290:28: ( ( (otherlv_0= 'icmp' ruleI_PREDICATES ( (lv_comptype_2_0= ruleType ) ) ( (lv_value1_3_0= ruleType ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleType ) ) ) | (otherlv_6= 'fcmp' ruleF_PREDICATES ( (lv_comptype_8_0= ruleType ) ) ( (lv_value1_9_0= ruleType ) ) otherlv_10= ',' ( (lv_value2_11_0= ruleType ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5291:1: ( (otherlv_0= 'icmp' ruleI_PREDICATES ( (lv_comptype_2_0= ruleType ) ) ( (lv_value1_3_0= ruleType ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleType ) ) ) | (otherlv_6= 'fcmp' ruleF_PREDICATES ( (lv_comptype_8_0= ruleType ) ) ( (lv_value1_9_0= ruleType ) ) otherlv_10= ',' ( (lv_value2_11_0= ruleType ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5291:1: ( (otherlv_0= 'icmp' ruleI_PREDICATES ( (lv_comptype_2_0= ruleType ) ) ( (lv_value1_3_0= ruleType ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleType ) ) ) | (otherlv_6= 'fcmp' ruleF_PREDICATES ( (lv_comptype_8_0= ruleType ) ) ( (lv_value1_9_0= ruleType ) ) otherlv_10= ',' ( (lv_value2_11_0= ruleType ) ) ) )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==153) ) {
                alt119=1;
            }
            else if ( (LA119_0==154) ) {
                alt119=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }
            switch (alt119) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5291:2: (otherlv_0= 'icmp' ruleI_PREDICATES ( (lv_comptype_2_0= ruleType ) ) ( (lv_value1_3_0= ruleType ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5291:2: (otherlv_0= 'icmp' ruleI_PREDICATES ( (lv_comptype_2_0= ruleType ) ) ( (lv_value1_3_0= ruleType ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5291:4: otherlv_0= 'icmp' ruleI_PREDICATES ( (lv_comptype_2_0= ruleType ) ) ( (lv_value1_3_0= ruleType ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleType ) )
                    {
                    otherlv_0=(Token)match(input,153,FOLLOW_153_in_ruleCompare11327); 

                        	newLeafNode(otherlv_0, grammarAccess.getCompareAccess().getIcmpKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getI_PREDICATESParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleI_PREDICATES_in_ruleCompare11343);
                    ruleI_PREDICATES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5303:1: ( (lv_comptype_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5304:1: (lv_comptype_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5304:1: (lv_comptype_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5305:3: lv_comptype_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompareAccess().getComptypeTypeParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCompare11363);
                    lv_comptype_2_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompareRule());
                    	        }
                           		set(
                           			current, 
                           			"comptype",
                            		lv_comptype_2_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5321:2: ( (lv_value1_3_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5322:1: (lv_value1_3_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5322:1: (lv_value1_3_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5323:3: lv_value1_3_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompareAccess().getValue1TypeParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCompare11384);
                    lv_value1_3_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompareRule());
                    	        }
                           		set(
                           			current, 
                           			"value1",
                            		lv_value1_3_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleCompare11396); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompareAccess().getCommaKeyword_0_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5343:1: ( (lv_value2_5_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5344:1: (lv_value2_5_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5344:1: (lv_value2_5_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5345:3: lv_value2_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompareAccess().getValue2TypeParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCompare11417);
                    lv_value2_5_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompareRule());
                    	        }
                           		set(
                           			current, 
                           			"value2",
                            		lv_value2_5_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5362:6: (otherlv_6= 'fcmp' ruleF_PREDICATES ( (lv_comptype_8_0= ruleType ) ) ( (lv_value1_9_0= ruleType ) ) otherlv_10= ',' ( (lv_value2_11_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5362:6: (otherlv_6= 'fcmp' ruleF_PREDICATES ( (lv_comptype_8_0= ruleType ) ) ( (lv_value1_9_0= ruleType ) ) otherlv_10= ',' ( (lv_value2_11_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5362:8: otherlv_6= 'fcmp' ruleF_PREDICATES ( (lv_comptype_8_0= ruleType ) ) ( (lv_value1_9_0= ruleType ) ) otherlv_10= ',' ( (lv_value2_11_0= ruleType ) )
                    {
                    otherlv_6=(Token)match(input,154,FOLLOW_154_in_ruleCompare11437); 

                        	newLeafNode(otherlv_6, grammarAccess.getCompareAccess().getFcmpKeyword_1_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompareAccess().getF_PREDICATESParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleF_PREDICATES_in_ruleCompare11453);
                    ruleF_PREDICATES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5374:1: ( (lv_comptype_8_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5375:1: (lv_comptype_8_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5375:1: (lv_comptype_8_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5376:3: lv_comptype_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompareAccess().getComptypeTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCompare11473);
                    lv_comptype_8_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompareRule());
                    	        }
                           		set(
                           			current, 
                           			"comptype",
                            		lv_comptype_8_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5392:2: ( (lv_value1_9_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5393:1: (lv_value1_9_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5393:1: (lv_value1_9_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5394:3: lv_value1_9_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompareAccess().getValue1TypeParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCompare11494);
                    lv_value1_9_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompareRule());
                    	        }
                           		set(
                           			current, 
                           			"value1",
                            		lv_value1_9_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleCompare11506); 

                        	newLeafNode(otherlv_10, grammarAccess.getCompareAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5414:1: ( (lv_value2_11_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5415:1: (lv_value2_11_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5415:1: (lv_value2_11_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5416:3: lv_value2_11_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompareAccess().getValue2TypeParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCompare11527);
                    lv_value2_11_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompareRule());
                    	        }
                           		set(
                           			current, 
                           			"value2",
                            		lv_value2_11_0, 
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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleI_PREDICATES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5440:1: entryRuleI_PREDICATES returns [String current=null] : iv_ruleI_PREDICATES= ruleI_PREDICATES EOF ;
    public final String entryRuleI_PREDICATES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleI_PREDICATES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5441:2: (iv_ruleI_PREDICATES= ruleI_PREDICATES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5442:2: iv_ruleI_PREDICATES= ruleI_PREDICATES EOF
            {
             newCompositeNode(grammarAccess.getI_PREDICATESRule()); 
            pushFollow(FOLLOW_ruleI_PREDICATES_in_entryRuleI_PREDICATES11565);
            iv_ruleI_PREDICATES=ruleI_PREDICATES();

            state._fsp--;

             current =iv_ruleI_PREDICATES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleI_PREDICATES11576); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5449:1: ruleI_PREDICATES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) ;
    public final AntlrDatatypeRuleToken ruleI_PREDICATES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5452:28: ( (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5453:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5453:1: (kw= 'eq' | kw= 'ne' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'sgt' | kw= 'sge' | kw= 'slt' | kw= 'sle' )
            int alt120=10;
            switch ( input.LA(1) ) {
            case 155:
                {
                alt120=1;
                }
                break;
            case 156:
                {
                alt120=2;
                }
                break;
            case 157:
                {
                alt120=3;
                }
                break;
            case 158:
                {
                alt120=4;
                }
                break;
            case 159:
                {
                alt120=5;
                }
                break;
            case 160:
                {
                alt120=6;
                }
                break;
            case 161:
                {
                alt120=7;
                }
                break;
            case 162:
                {
                alt120=8;
                }
                break;
            case 163:
                {
                alt120=9;
                }
                break;
            case 164:
                {
                alt120=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }

            switch (alt120) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5454:2: kw= 'eq'
                    {
                    kw=(Token)match(input,155,FOLLOW_155_in_ruleI_PREDICATES11614); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getEqKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5461:2: kw= 'ne'
                    {
                    kw=(Token)match(input,156,FOLLOW_156_in_ruleI_PREDICATES11633); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getNeKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5468:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,157,FOLLOW_157_in_ruleI_PREDICATES11652); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5475:2: kw= 'uge'
                    {
                    kw=(Token)match(input,158,FOLLOW_158_in_ruleI_PREDICATES11671); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5482:2: kw= 'ult'
                    {
                    kw=(Token)match(input,159,FOLLOW_159_in_ruleI_PREDICATES11690); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5489:2: kw= 'ule'
                    {
                    kw=(Token)match(input,160,FOLLOW_160_in_ruleI_PREDICATES11709); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getUleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5496:2: kw= 'sgt'
                    {
                    kw=(Token)match(input,161,FOLLOW_161_in_ruleI_PREDICATES11728); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSgtKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5503:2: kw= 'sge'
                    {
                    kw=(Token)match(input,162,FOLLOW_162_in_ruleI_PREDICATES11747); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSgeKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5510:2: kw= 'slt'
                    {
                    kw=(Token)match(input,163,FOLLOW_163_in_ruleI_PREDICATES11766); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getI_PREDICATESAccess().getSltKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5517:2: kw= 'sle'
                    {
                    kw=(Token)match(input,164,FOLLOW_164_in_ruleI_PREDICATES11785); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5530:1: entryRuleF_PREDICATES returns [String current=null] : iv_ruleF_PREDICATES= ruleF_PREDICATES EOF ;
    public final String entryRuleF_PREDICATES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleF_PREDICATES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5531:2: (iv_ruleF_PREDICATES= ruleF_PREDICATES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5532:2: iv_ruleF_PREDICATES= ruleF_PREDICATES EOF
            {
             newCompositeNode(grammarAccess.getF_PREDICATESRule()); 
            pushFollow(FOLLOW_ruleF_PREDICATES_in_entryRuleF_PREDICATES11826);
            iv_ruleF_PREDICATES=ruleF_PREDICATES();

            state._fsp--;

             current =iv_ruleF_PREDICATES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleF_PREDICATES11837); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5539:1: ruleF_PREDICATES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) ;
    public final AntlrDatatypeRuleToken ruleF_PREDICATES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5542:28: ( (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5543:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5543:1: (kw= 'false' | kw= 'oeq' | kw= 'ogt' | kw= 'oge' | kw= 'olt' | kw= 'ole' | kw= 'one' | kw= 'ord' | kw= 'ueq' | kw= 'ugt' | kw= 'uge' | kw= 'ult' | kw= 'ule' | kw= 'une' | kw= 'uno' | kw= 'true' )
            int alt121=16;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt121=1;
                }
                break;
            case 165:
                {
                alt121=2;
                }
                break;
            case 166:
                {
                alt121=3;
                }
                break;
            case 167:
                {
                alt121=4;
                }
                break;
            case 168:
                {
                alt121=5;
                }
                break;
            case 169:
                {
                alt121=6;
                }
                break;
            case 170:
                {
                alt121=7;
                }
                break;
            case 171:
                {
                alt121=8;
                }
                break;
            case 172:
                {
                alt121=9;
                }
                break;
            case 157:
                {
                alt121=10;
                }
                break;
            case 158:
                {
                alt121=11;
                }
                break;
            case 159:
                {
                alt121=12;
                }
                break;
            case 160:
                {
                alt121=13;
                }
                break;
            case 173:
                {
                alt121=14;
                }
                break;
            case 174:
                {
                alt121=15;
                }
                break;
            case 45:
                {
                alt121=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }

            switch (alt121) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5544:2: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleF_PREDICATES11875); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getFalseKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5551:2: kw= 'oeq'
                    {
                    kw=(Token)match(input,165,FOLLOW_165_in_ruleF_PREDICATES11894); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOeqKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5558:2: kw= 'ogt'
                    {
                    kw=(Token)match(input,166,FOLLOW_166_in_ruleF_PREDICATES11913); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOgtKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5565:2: kw= 'oge'
                    {
                    kw=(Token)match(input,167,FOLLOW_167_in_ruleF_PREDICATES11932); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOgeKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5572:2: kw= 'olt'
                    {
                    kw=(Token)match(input,168,FOLLOW_168_in_ruleF_PREDICATES11951); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOltKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5579:2: kw= 'ole'
                    {
                    kw=(Token)match(input,169,FOLLOW_169_in_ruleF_PREDICATES11970); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOleKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5586:2: kw= 'one'
                    {
                    kw=(Token)match(input,170,FOLLOW_170_in_ruleF_PREDICATES11989); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOneKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5593:2: kw= 'ord'
                    {
                    kw=(Token)match(input,171,FOLLOW_171_in_ruleF_PREDICATES12008); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getOrdKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5600:2: kw= 'ueq'
                    {
                    kw=(Token)match(input,172,FOLLOW_172_in_ruleF_PREDICATES12027); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUeqKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5607:2: kw= 'ugt'
                    {
                    kw=(Token)match(input,157,FOLLOW_157_in_ruleF_PREDICATES12046); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUgtKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5614:2: kw= 'uge'
                    {
                    kw=(Token)match(input,158,FOLLOW_158_in_ruleF_PREDICATES12065); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUgeKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5621:2: kw= 'ult'
                    {
                    kw=(Token)match(input,159,FOLLOW_159_in_ruleF_PREDICATES12084); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUltKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5628:2: kw= 'ule'
                    {
                    kw=(Token)match(input,160,FOLLOW_160_in_ruleF_PREDICATES12103); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUleKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5635:2: kw= 'une'
                    {
                    kw=(Token)match(input,173,FOLLOW_173_in_ruleF_PREDICATES12122); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUneKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5642:2: kw= 'uno'
                    {
                    kw=(Token)match(input,174,FOLLOW_174_in_ruleF_PREDICATES12141); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getF_PREDICATESAccess().getUnoKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5649:2: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleF_PREDICATES12160); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5662:1: entryRuleARITHMETIC_OP returns [EObject current=null] : iv_ruleARITHMETIC_OP= ruleARITHMETIC_OP EOF ;
    public final EObject entryRuleARITHMETIC_OP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARITHMETIC_OP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5663:2: (iv_ruleARITHMETIC_OP= ruleARITHMETIC_OP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5664:2: iv_ruleARITHMETIC_OP= ruleARITHMETIC_OP EOF
            {
             newCompositeNode(grammarAccess.getARITHMETIC_OPRule()); 
            pushFollow(FOLLOW_ruleARITHMETIC_OP_in_entryRuleARITHMETIC_OP12200);
            iv_ruleARITHMETIC_OP=ruleARITHMETIC_OP();

            state._fsp--;

             current =iv_ruleARITHMETIC_OP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleARITHMETIC_OP12210); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5671:1: ruleARITHMETIC_OP returns [EObject current=null] : ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ( (lv_optype_12_0= ruleType ) ) ( (lv_value1_13_0= ruleType ) ) otherlv_14= ',' ( (lv_value2_15_0= ruleType ) ) ) ;
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
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_optype_12_0 = null;

        AntlrDatatypeRuleToken lv_value1_13_0 = null;

        AntlrDatatypeRuleToken lv_value2_15_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5674:28: ( ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ( (lv_optype_12_0= ruleType ) ) ( (lv_value1_13_0= ruleType ) ) otherlv_14= ',' ( (lv_value2_15_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5675:1: ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ( (lv_optype_12_0= ruleType ) ) ( (lv_value1_13_0= ruleType ) ) otherlv_14= ',' ( (lv_value2_15_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5675:1: ( (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ( (lv_optype_12_0= ruleType ) ) ( (lv_value1_13_0= ruleType ) ) otherlv_14= ',' ( (lv_value2_15_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5675:2: (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' ) ( (lv_optype_12_0= ruleType ) ) ( (lv_value1_13_0= ruleType ) ) otherlv_14= ',' ( (lv_value2_15_0= ruleType ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5675:2: (otherlv_0= 'add' | otherlv_1= 'fadd' | otherlv_2= 'sub' | otherlv_3= 'fsub' | otherlv_4= 'mul' | otherlv_5= 'fmul' | otherlv_6= 'udiv' | otherlv_7= 'sdiv' | otherlv_8= 'fdiv' | otherlv_9= 'urem' | otherlv_10= 'srem' | otherlv_11= 'frem' )
            int alt122=12;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt122=1;
                }
                break;
            case 175:
                {
                alt122=2;
                }
                break;
            case 72:
                {
                alt122=3;
                }
                break;
            case 176:
                {
                alt122=4;
                }
                break;
            case 177:
                {
                alt122=5;
                }
                break;
            case 178:
                {
                alt122=6;
                }
                break;
            case 179:
                {
                alt122=7;
                }
                break;
            case 180:
                {
                alt122=8;
                }
                break;
            case 181:
                {
                alt122=9;
                }
                break;
            case 182:
                {
                alt122=10;
                }
                break;
            case 183:
                {
                alt122=11;
                }
                break;
            case 184:
                {
                alt122=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }

            switch (alt122) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5675:4: otherlv_0= 'add'
                    {
                    otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleARITHMETIC_OP12248); 

                        	newLeafNode(otherlv_0, grammarAccess.getARITHMETIC_OPAccess().getAddKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5680:7: otherlv_1= 'fadd'
                    {
                    otherlv_1=(Token)match(input,175,FOLLOW_175_in_ruleARITHMETIC_OP12266); 

                        	newLeafNode(otherlv_1, grammarAccess.getARITHMETIC_OPAccess().getFaddKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5685:7: otherlv_2= 'sub'
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleARITHMETIC_OP12284); 

                        	newLeafNode(otherlv_2, grammarAccess.getARITHMETIC_OPAccess().getSubKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5690:7: otherlv_3= 'fsub'
                    {
                    otherlv_3=(Token)match(input,176,FOLLOW_176_in_ruleARITHMETIC_OP12302); 

                        	newLeafNode(otherlv_3, grammarAccess.getARITHMETIC_OPAccess().getFsubKeyword_0_3());
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5695:7: otherlv_4= 'mul'
                    {
                    otherlv_4=(Token)match(input,177,FOLLOW_177_in_ruleARITHMETIC_OP12320); 

                        	newLeafNode(otherlv_4, grammarAccess.getARITHMETIC_OPAccess().getMulKeyword_0_4());
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5700:7: otherlv_5= 'fmul'
                    {
                    otherlv_5=(Token)match(input,178,FOLLOW_178_in_ruleARITHMETIC_OP12338); 

                        	newLeafNode(otherlv_5, grammarAccess.getARITHMETIC_OPAccess().getFmulKeyword_0_5());
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5705:7: otherlv_6= 'udiv'
                    {
                    otherlv_6=(Token)match(input,179,FOLLOW_179_in_ruleARITHMETIC_OP12356); 

                        	newLeafNode(otherlv_6, grammarAccess.getARITHMETIC_OPAccess().getUdivKeyword_0_6());
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5710:7: otherlv_7= 'sdiv'
                    {
                    otherlv_7=(Token)match(input,180,FOLLOW_180_in_ruleARITHMETIC_OP12374); 

                        	newLeafNode(otherlv_7, grammarAccess.getARITHMETIC_OPAccess().getSdivKeyword_0_7());
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5715:7: otherlv_8= 'fdiv'
                    {
                    otherlv_8=(Token)match(input,181,FOLLOW_181_in_ruleARITHMETIC_OP12392); 

                        	newLeafNode(otherlv_8, grammarAccess.getARITHMETIC_OPAccess().getFdivKeyword_0_8());
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5720:7: otherlv_9= 'urem'
                    {
                    otherlv_9=(Token)match(input,182,FOLLOW_182_in_ruleARITHMETIC_OP12410); 

                        	newLeafNode(otherlv_9, grammarAccess.getARITHMETIC_OPAccess().getUremKeyword_0_9());
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5725:7: otherlv_10= 'srem'
                    {
                    otherlv_10=(Token)match(input,183,FOLLOW_183_in_ruleARITHMETIC_OP12428); 

                        	newLeafNode(otherlv_10, grammarAccess.getARITHMETIC_OPAccess().getSremKeyword_0_10());
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5730:7: otherlv_11= 'frem'
                    {
                    otherlv_11=(Token)match(input,184,FOLLOW_184_in_ruleARITHMETIC_OP12446); 

                        	newLeafNode(otherlv_11, grammarAccess.getARITHMETIC_OPAccess().getFremKeyword_0_11());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5734:2: ( (lv_optype_12_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5735:1: (lv_optype_12_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5735:1: (lv_optype_12_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5736:3: lv_optype_12_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getARITHMETIC_OPAccess().getOptypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleARITHMETIC_OP12468);
            lv_optype_12_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getARITHMETIC_OPRule());
            	        }
                   		set(
                   			current, 
                   			"optype",
                    		lv_optype_12_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5752:2: ( (lv_value1_13_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5753:1: (lv_value1_13_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5753:1: (lv_value1_13_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5754:3: lv_value1_13_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getARITHMETIC_OPAccess().getValue1TypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleARITHMETIC_OP12489);
            lv_value1_13_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getARITHMETIC_OPRule());
            	        }
                   		set(
                   			current, 
                   			"value1",
                    		lv_value1_13_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_14=(Token)match(input,27,FOLLOW_27_in_ruleARITHMETIC_OP12501); 

                	newLeafNode(otherlv_14, grammarAccess.getARITHMETIC_OPAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5774:1: ( (lv_value2_15_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5775:1: (lv_value2_15_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5775:1: (lv_value2_15_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5776:3: lv_value2_15_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getARITHMETIC_OPAccess().getValue2TypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleARITHMETIC_OP12522);
            lv_value2_15_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getARITHMETIC_OPRule());
            	        }
                   		set(
                   			current, 
                   			"value2",
                    		lv_value2_15_0, 
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
    // $ANTLR end "ruleARITHMETIC_OP"


    // $ANTLR start "entryRuleLOGICAL_OP"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5800:1: entryRuleLOGICAL_OP returns [EObject current=null] : iv_ruleLOGICAL_OP= ruleLOGICAL_OP EOF ;
    public final EObject entryRuleLOGICAL_OP() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOGICAL_OP = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5801:2: (iv_ruleLOGICAL_OP= ruleLOGICAL_OP EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5802:2: iv_ruleLOGICAL_OP= ruleLOGICAL_OP EOF
            {
             newCompositeNode(grammarAccess.getLOGICAL_OPRule()); 
            pushFollow(FOLLOW_ruleLOGICAL_OP_in_entryRuleLOGICAL_OP12558);
            iv_ruleLOGICAL_OP=ruleLOGICAL_OP();

            state._fsp--;

             current =iv_ruleLOGICAL_OP; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOGICAL_OP12568); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5809:1: ruleLOGICAL_OP returns [EObject current=null] : ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ( (lv_optype_6_0= ruleType ) ) ( (lv_value1_7_0= ruleType ) ) otherlv_8= ',' ( (lv_value2_9_0= ruleType ) ) ) ;
    public final EObject ruleLOGICAL_OP() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_optype_6_0 = null;

        AntlrDatatypeRuleToken lv_value1_7_0 = null;

        AntlrDatatypeRuleToken lv_value2_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5812:28: ( ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ( (lv_optype_6_0= ruleType ) ) ( (lv_value1_7_0= ruleType ) ) otherlv_8= ',' ( (lv_value2_9_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5813:1: ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ( (lv_optype_6_0= ruleType ) ) ( (lv_value1_7_0= ruleType ) ) otherlv_8= ',' ( (lv_value2_9_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5813:1: ( (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ( (lv_optype_6_0= ruleType ) ) ( (lv_value1_7_0= ruleType ) ) otherlv_8= ',' ( (lv_value2_9_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5813:2: (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' ) ( (lv_optype_6_0= ruleType ) ) ( (lv_value1_7_0= ruleType ) ) otherlv_8= ',' ( (lv_value2_9_0= ruleType ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5813:2: (otherlv_0= 'shl' | otherlv_1= 'lshr' | otherlv_2= 'ashr' | otherlv_3= 'and' | otherlv_4= 'or' | otherlv_5= 'xor' )
            int alt123=6;
            switch ( input.LA(1) ) {
            case 185:
                {
                alt123=1;
                }
                break;
            case 186:
                {
                alt123=2;
                }
                break;
            case 187:
                {
                alt123=3;
                }
                break;
            case 73:
                {
                alt123=4;
                }
                break;
            case 75:
                {
                alt123=5;
                }
                break;
            case 76:
                {
                alt123=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }

            switch (alt123) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5813:4: otherlv_0= 'shl'
                    {
                    otherlv_0=(Token)match(input,185,FOLLOW_185_in_ruleLOGICAL_OP12606); 

                        	newLeafNode(otherlv_0, grammarAccess.getLOGICAL_OPAccess().getShlKeyword_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5818:7: otherlv_1= 'lshr'
                    {
                    otherlv_1=(Token)match(input,186,FOLLOW_186_in_ruleLOGICAL_OP12624); 

                        	newLeafNode(otherlv_1, grammarAccess.getLOGICAL_OPAccess().getLshrKeyword_0_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5823:7: otherlv_2= 'ashr'
                    {
                    otherlv_2=(Token)match(input,187,FOLLOW_187_in_ruleLOGICAL_OP12642); 

                        	newLeafNode(otherlv_2, grammarAccess.getLOGICAL_OPAccess().getAshrKeyword_0_2());
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5828:7: otherlv_3= 'and'
                    {
                    otherlv_3=(Token)match(input,73,FOLLOW_73_in_ruleLOGICAL_OP12660); 

                        	newLeafNode(otherlv_3, grammarAccess.getLOGICAL_OPAccess().getAndKeyword_0_3());
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5833:7: otherlv_4= 'or'
                    {
                    otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleLOGICAL_OP12678); 

                        	newLeafNode(otherlv_4, grammarAccess.getLOGICAL_OPAccess().getOrKeyword_0_4());
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5838:7: otherlv_5= 'xor'
                    {
                    otherlv_5=(Token)match(input,76,FOLLOW_76_in_ruleLOGICAL_OP12696); 

                        	newLeafNode(otherlv_5, grammarAccess.getLOGICAL_OPAccess().getXorKeyword_0_5());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5842:2: ( (lv_optype_6_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5843:1: (lv_optype_6_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5843:1: (lv_optype_6_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5844:3: lv_optype_6_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLOGICAL_OPAccess().getOptypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLOGICAL_OP12718);
            lv_optype_6_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLOGICAL_OPRule());
            	        }
                   		set(
                   			current, 
                   			"optype",
                    		lv_optype_6_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5860:2: ( (lv_value1_7_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5861:1: (lv_value1_7_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5861:1: (lv_value1_7_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5862:3: lv_value1_7_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLOGICAL_OPAccess().getValue1TypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLOGICAL_OP12739);
            lv_value1_7_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLOGICAL_OPRule());
            	        }
                   		set(
                   			current, 
                   			"value1",
                    		lv_value1_7_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,27,FOLLOW_27_in_ruleLOGICAL_OP12751); 

                	newLeafNode(otherlv_8, grammarAccess.getLOGICAL_OPAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5882:1: ( (lv_value2_9_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5883:1: (lv_value2_9_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5883:1: (lv_value2_9_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5884:3: lv_value2_9_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getLOGICAL_OPAccess().getValue2TypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleLOGICAL_OP12772);
            lv_value2_9_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLOGICAL_OPRule());
            	        }
                   		set(
                   			current, 
                   			"value2",
                    		lv_value2_9_0, 
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
    // $ANTLR end "ruleLOGICAL_OP"


    // $ANTLR start "entryRuleIndirectBranch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5908:1: entryRuleIndirectBranch returns [EObject current=null] : iv_ruleIndirectBranch= ruleIndirectBranch EOF ;
    public final EObject entryRuleIndirectBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5909:2: (iv_ruleIndirectBranch= ruleIndirectBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5910:2: iv_ruleIndirectBranch= ruleIndirectBranch EOF
            {
             newCompositeNode(grammarAccess.getIndirectBranchRule()); 
            pushFollow(FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch12808);
            iv_ruleIndirectBranch=ruleIndirectBranch();

            state._fsp--;

             current =iv_ruleIndirectBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndirectBranch12818); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5917:1: ruleIndirectBranch returns [EObject current=null] : (otherlv_0= 'indirectbr' ( (lv_adresstype_1_0= ruleType ) ) ( (lv_adress_2_0= ruleType ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_lList_5_0= ruleLabelList ) )? otherlv_6= ']' ) ;
    public final EObject ruleIndirectBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_adresstype_1_0 = null;

        AntlrDatatypeRuleToken lv_adress_2_0 = null;

        EObject lv_lList_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5920:28: ( (otherlv_0= 'indirectbr' ( (lv_adresstype_1_0= ruleType ) ) ( (lv_adress_2_0= ruleType ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_lList_5_0= ruleLabelList ) )? otherlv_6= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5921:1: (otherlv_0= 'indirectbr' ( (lv_adresstype_1_0= ruleType ) ) ( (lv_adress_2_0= ruleType ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_lList_5_0= ruleLabelList ) )? otherlv_6= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5921:1: (otherlv_0= 'indirectbr' ( (lv_adresstype_1_0= ruleType ) ) ( (lv_adress_2_0= ruleType ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_lList_5_0= ruleLabelList ) )? otherlv_6= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5921:3: otherlv_0= 'indirectbr' ( (lv_adresstype_1_0= ruleType ) ) ( (lv_adress_2_0= ruleType ) ) otherlv_3= ',' otherlv_4= '[' ( (lv_lList_5_0= ruleLabelList ) )? otherlv_6= ']'
            {
            otherlv_0=(Token)match(input,188,FOLLOW_188_in_ruleIndirectBranch12855); 

                	newLeafNode(otherlv_0, grammarAccess.getIndirectBranchAccess().getIndirectbrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5925:1: ( (lv_adresstype_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5926:1: (lv_adresstype_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5926:1: (lv_adresstype_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5927:3: lv_adresstype_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getAdresstypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleIndirectBranch12876);
            lv_adresstype_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIndirectBranchRule());
            	        }
                   		set(
                   			current, 
                   			"adresstype",
                    		lv_adresstype_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5943:2: ( (lv_adress_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5944:1: (lv_adress_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5944:1: (lv_adress_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5945:3: lv_adress_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getAdressTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleIndirectBranch12897);
            lv_adress_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIndirectBranchRule());
            	        }
                   		set(
                   			current, 
                   			"adress",
                    		lv_adress_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleIndirectBranch12909); 

                	newLeafNode(otherlv_3, grammarAccess.getIndirectBranchAccess().getCommaKeyword_3());
                
            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleIndirectBranch12921); 

                	newLeafNode(otherlv_4, grammarAccess.getIndirectBranchAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5969:1: ( (lv_lList_5_0= ruleLabelList ) )?
            int alt124=2;
            int LA124_0 = input.LA(1);

            if ( ((LA124_0>=RULE_VAR_TYPE && LA124_0<=RULE_INTEGER)||LA124_0==34||(LA124_0>=42 && LA124_0<=46)) ) {
                alt124=1;
            }
            switch (alt124) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5970:1: (lv_lList_5_0= ruleLabelList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5970:1: (lv_lList_5_0= ruleLabelList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5971:3: lv_lList_5_0= ruleLabelList
                    {
                     
                    	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getLListLabelListParserRuleCall_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabelList_in_ruleIndirectBranch12942);
                    lv_lList_5_0=ruleLabelList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getIndirectBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"lList",
                            		lv_lList_5_0, 
                            		"LabelList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleIndirectBranch12955); 

                	newLeafNode(otherlv_6, grammarAccess.getIndirectBranchAccess().getRightSquareBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5999:1: entryRuleLabelList returns [EObject current=null] : iv_ruleLabelList= ruleLabelList EOF ;
    public final EObject entryRuleLabelList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLabelList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6000:2: (iv_ruleLabelList= ruleLabelList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6001:2: iv_ruleLabelList= ruleLabelList EOF
            {
             newCompositeNode(grammarAccess.getLabelListRule()); 
            pushFollow(FOLLOW_ruleLabelList_in_entryRuleLabelList12991);
            iv_ruleLabelList=ruleLabelList();

            state._fsp--;

             current =iv_ruleLabelList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabelList13001); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6008:1: ruleLabelList returns [EObject current=null] : ( ( (lv_labeltype_0_0= ruleType ) ) ( (lv_labels_1_0= ruleType ) ) )+ ;
    public final EObject ruleLabelList() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_labeltype_0_0 = null;

        AntlrDatatypeRuleToken lv_labels_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6011:28: ( ( ( (lv_labeltype_0_0= ruleType ) ) ( (lv_labels_1_0= ruleType ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6012:1: ( ( (lv_labeltype_0_0= ruleType ) ) ( (lv_labels_1_0= ruleType ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6012:1: ( ( (lv_labeltype_0_0= ruleType ) ) ( (lv_labels_1_0= ruleType ) ) )+
            int cnt125=0;
            loop125:
            do {
                int alt125=2;
                int LA125_0 = input.LA(1);

                if ( ((LA125_0>=RULE_VAR_TYPE && LA125_0<=RULE_INTEGER)||LA125_0==34||(LA125_0>=42 && LA125_0<=46)) ) {
                    alt125=1;
                }


                switch (alt125) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6012:2: ( (lv_labeltype_0_0= ruleType ) ) ( (lv_labels_1_0= ruleType ) )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6012:2: ( (lv_labeltype_0_0= ruleType ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6013:1: (lv_labeltype_0_0= ruleType )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6013:1: (lv_labeltype_0_0= ruleType )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6014:3: lv_labeltype_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelListAccess().getLabeltypeTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleLabelList13047);
            	    lv_labeltype_0_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"labeltype",
            	            		lv_labeltype_0_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6030:2: ( (lv_labels_1_0= ruleType ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6031:1: (lv_labels_1_0= ruleType )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6031:1: (lv_labels_1_0= ruleType )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6032:3: lv_labels_1_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getLabelListAccess().getLabelsTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleLabelList13068);
            	    lv_labels_1_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getLabelListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"labels",
            	            		lv_labels_1_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt125 >= 1 ) break loop125;
                        EarlyExitException eee =
                            new EarlyExitException(125, input);
                        throw eee;
                }
                cnt125++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6056:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6057:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6058:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch13105);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch13115); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6065:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' ( (lv_comptype_1_0= ruleType ) ) ( (lv_compvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_defaulttype_4_0= ruleType ) ) ( (lv_defaultvalue_5_0= ruleType ) ) otherlv_6= '[' ( (lv_jTable_7_0= ruleJumpTable ) )? otherlv_8= ']' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_comptype_1_0 = null;

        AntlrDatatypeRuleToken lv_compvalue_2_0 = null;

        AntlrDatatypeRuleToken lv_defaulttype_4_0 = null;

        AntlrDatatypeRuleToken lv_defaultvalue_5_0 = null;

        EObject lv_jTable_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6068:28: ( (otherlv_0= 'switch' ( (lv_comptype_1_0= ruleType ) ) ( (lv_compvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_defaulttype_4_0= ruleType ) ) ( (lv_defaultvalue_5_0= ruleType ) ) otherlv_6= '[' ( (lv_jTable_7_0= ruleJumpTable ) )? otherlv_8= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6069:1: (otherlv_0= 'switch' ( (lv_comptype_1_0= ruleType ) ) ( (lv_compvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_defaulttype_4_0= ruleType ) ) ( (lv_defaultvalue_5_0= ruleType ) ) otherlv_6= '[' ( (lv_jTable_7_0= ruleJumpTable ) )? otherlv_8= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6069:1: (otherlv_0= 'switch' ( (lv_comptype_1_0= ruleType ) ) ( (lv_compvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_defaulttype_4_0= ruleType ) ) ( (lv_defaultvalue_5_0= ruleType ) ) otherlv_6= '[' ( (lv_jTable_7_0= ruleJumpTable ) )? otherlv_8= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6069:3: otherlv_0= 'switch' ( (lv_comptype_1_0= ruleType ) ) ( (lv_compvalue_2_0= ruleType ) ) otherlv_3= ',' ( (lv_defaulttype_4_0= ruleType ) ) ( (lv_defaultvalue_5_0= ruleType ) ) otherlv_6= '[' ( (lv_jTable_7_0= ruleJumpTable ) )? otherlv_8= ']'
            {
            otherlv_0=(Token)match(input,189,FOLLOW_189_in_ruleSwitch13152); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6073:1: ( (lv_comptype_1_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6074:1: (lv_comptype_1_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6074:1: (lv_comptype_1_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6075:3: lv_comptype_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getComptypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSwitch13173);
            lv_comptype_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"comptype",
                    		lv_comptype_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6091:2: ( (lv_compvalue_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6092:1: (lv_compvalue_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6092:1: (lv_compvalue_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6093:3: lv_compvalue_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getCompvalueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSwitch13194);
            lv_compvalue_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"compvalue",
                    		lv_compvalue_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleSwitch13206); 

                	newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getCommaKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6113:1: ( (lv_defaulttype_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6114:1: (lv_defaulttype_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6114:1: (lv_defaulttype_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6115:3: lv_defaulttype_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaulttypeTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSwitch13227);
            lv_defaulttype_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"defaulttype",
                    		lv_defaulttype_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6131:2: ( (lv_defaultvalue_5_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6132:1: (lv_defaultvalue_5_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6132:1: (lv_defaultvalue_5_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6133:3: lv_defaultvalue_5_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getDefaultvalueTypeParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleSwitch13248);
            lv_defaultvalue_5_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"defaultvalue",
                    		lv_defaultvalue_5_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,26,FOLLOW_26_in_ruleSwitch13260); 

                	newLeafNode(otherlv_6, grammarAccess.getSwitchAccess().getLeftSquareBracketKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6153:1: ( (lv_jTable_7_0= ruleJumpTable ) )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( ((LA126_0>=RULE_VAR_TYPE && LA126_0<=RULE_INTEGER)||LA126_0==34||(LA126_0>=42 && LA126_0<=46)) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6154:1: (lv_jTable_7_0= ruleJumpTable )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6154:1: (lv_jTable_7_0= ruleJumpTable )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6155:3: lv_jTable_7_0= ruleJumpTable
                    {
                     
                    	        newCompositeNode(grammarAccess.getSwitchAccess().getJTableJumpTableParserRuleCall_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJumpTable_in_ruleSwitch13281);
                    lv_jTable_7_0=ruleJumpTable();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSwitchRule());
                    	        }
                           		set(
                           			current, 
                           			"jTable",
                            		lv_jTable_7_0, 
                            		"JumpTable");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_28_in_ruleSwitch13294); 

                	newLeafNode(otherlv_8, grammarAccess.getSwitchAccess().getRightSquareBracketKeyword_8());
                

            }


            }

             leaveRule(); 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6183:1: entryRuleJumpTable returns [EObject current=null] : iv_ruleJumpTable= ruleJumpTable EOF ;
    public final EObject entryRuleJumpTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJumpTable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6184:2: (iv_ruleJumpTable= ruleJumpTable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6185:2: iv_ruleJumpTable= ruleJumpTable EOF
            {
             newCompositeNode(grammarAccess.getJumpTableRule()); 
            pushFollow(FOLLOW_ruleJumpTable_in_entryRuleJumpTable13330);
            iv_ruleJumpTable=ruleJumpTable();

            state._fsp--;

             current =iv_ruleJumpTable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJumpTable13340); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6192:1: ruleJumpTable returns [EObject current=null] : ( ( (lv_jtypes_0_0= ruleType ) ) ( (lv_jvalues_1_0= ruleType ) ) otherlv_2= ',' ( (lv_destinationtypes_3_0= ruleType ) ) ( (lv_destinations_4_0= ruleType ) ) )+ ;
    public final EObject ruleJumpTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_jtypes_0_0 = null;

        AntlrDatatypeRuleToken lv_jvalues_1_0 = null;

        AntlrDatatypeRuleToken lv_destinationtypes_3_0 = null;

        AntlrDatatypeRuleToken lv_destinations_4_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6195:28: ( ( ( (lv_jtypes_0_0= ruleType ) ) ( (lv_jvalues_1_0= ruleType ) ) otherlv_2= ',' ( (lv_destinationtypes_3_0= ruleType ) ) ( (lv_destinations_4_0= ruleType ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6196:1: ( ( (lv_jtypes_0_0= ruleType ) ) ( (lv_jvalues_1_0= ruleType ) ) otherlv_2= ',' ( (lv_destinationtypes_3_0= ruleType ) ) ( (lv_destinations_4_0= ruleType ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6196:1: ( ( (lv_jtypes_0_0= ruleType ) ) ( (lv_jvalues_1_0= ruleType ) ) otherlv_2= ',' ( (lv_destinationtypes_3_0= ruleType ) ) ( (lv_destinations_4_0= ruleType ) ) )+
            int cnt127=0;
            loop127:
            do {
                int alt127=2;
                int LA127_0 = input.LA(1);

                if ( ((LA127_0>=RULE_VAR_TYPE && LA127_0<=RULE_INTEGER)||LA127_0==34||(LA127_0>=42 && LA127_0<=46)) ) {
                    alt127=1;
                }


                switch (alt127) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6196:2: ( (lv_jtypes_0_0= ruleType ) ) ( (lv_jvalues_1_0= ruleType ) ) otherlv_2= ',' ( (lv_destinationtypes_3_0= ruleType ) ) ( (lv_destinations_4_0= ruleType ) )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6196:2: ( (lv_jtypes_0_0= ruleType ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6197:1: (lv_jtypes_0_0= ruleType )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6197:1: (lv_jtypes_0_0= ruleType )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6198:3: lv_jtypes_0_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getJtypesTypeParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleJumpTable13386);
            	    lv_jtypes_0_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJumpTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"jtypes",
            	            		lv_jtypes_0_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6214:2: ( (lv_jvalues_1_0= ruleType ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6215:1: (lv_jvalues_1_0= ruleType )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6215:1: (lv_jvalues_1_0= ruleType )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6216:3: lv_jvalues_1_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getJvaluesTypeParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleJumpTable13407);
            	    lv_jvalues_1_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJumpTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"jvalues",
            	            		lv_jvalues_1_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleJumpTable13419); 

            	        	newLeafNode(otherlv_2, grammarAccess.getJumpTableAccess().getCommaKeyword_2());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6236:1: ( (lv_destinationtypes_3_0= ruleType ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6237:1: (lv_destinationtypes_3_0= ruleType )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6237:1: (lv_destinationtypes_3_0= ruleType )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6238:3: lv_destinationtypes_3_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getDestinationtypesTypeParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleJumpTable13440);
            	    lv_destinationtypes_3_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJumpTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"destinationtypes",
            	            		lv_destinationtypes_3_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6254:2: ( (lv_destinations_4_0= ruleType ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6255:1: (lv_destinations_4_0= ruleType )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6255:1: (lv_destinations_4_0= ruleType )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6256:3: lv_destinations_4_0= ruleType
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJumpTableAccess().getDestinationsTypeParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleType_in_ruleJumpTable13461);
            	    lv_destinations_4_0=ruleType();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJumpTableRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"destinations",
            	            		lv_destinations_4_0, 
            	            		"Type");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt127 >= 1 ) break loop127;
                        EarlyExitException eee =
                            new EarlyExitException(127, input);
                        throw eee;
                }
                cnt127++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6280:1: entryRuleInvoke returns [EObject current=null] : iv_ruleInvoke= ruleInvoke EOF ;
    public final EObject entryRuleInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoke = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6281:2: (iv_ruleInvoke= ruleInvoke EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6282:2: iv_ruleInvoke= ruleInvoke EOF
            {
             newCompositeNode(grammarAccess.getInvokeRule()); 
            pushFollow(FOLLOW_ruleInvoke_in_entryRuleInvoke13498);
            iv_ruleInvoke=ruleInvoke();

            state._fsp--;

             current =iv_ruleInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvoke13508); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6289:1: ruleInvoke returns [EObject current=null] : (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_functiontype_3_0= ruleType ) ) ( (lv_functionvalue_4_0= ruleType ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' ( (lv_totype_8_0= ruleType ) ) ( (lv_tovalue_9_0= ruleType ) ) otherlv_10= 'unwind' ( (lv_unwindtype_11_0= ruleType ) ) ( (lv_unwindvalue_12_0= ruleType ) ) ) ;
    public final EObject ruleInvoke() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_functiontype_3_0 = null;

        AntlrDatatypeRuleToken lv_functionvalue_4_0 = null;

        EObject lv_pList_5_0 = null;

        AntlrDatatypeRuleToken lv_totype_8_0 = null;

        AntlrDatatypeRuleToken lv_tovalue_9_0 = null;

        AntlrDatatypeRuleToken lv_unwindtype_11_0 = null;

        AntlrDatatypeRuleToken lv_unwindvalue_12_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6292:28: ( (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_functiontype_3_0= ruleType ) ) ( (lv_functionvalue_4_0= ruleType ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' ( (lv_totype_8_0= ruleType ) ) ( (lv_tovalue_9_0= ruleType ) ) otherlv_10= 'unwind' ( (lv_unwindtype_11_0= ruleType ) ) ( (lv_unwindvalue_12_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6293:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_functiontype_3_0= ruleType ) ) ( (lv_functionvalue_4_0= ruleType ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' ( (lv_totype_8_0= ruleType ) ) ( (lv_tovalue_9_0= ruleType ) ) otherlv_10= 'unwind' ( (lv_unwindtype_11_0= ruleType ) ) ( (lv_unwindvalue_12_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6293:1: (otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_functiontype_3_0= ruleType ) ) ( (lv_functionvalue_4_0= ruleType ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' ( (lv_totype_8_0= ruleType ) ) ( (lv_tovalue_9_0= ruleType ) ) otherlv_10= 'unwind' ( (lv_unwindtype_11_0= ruleType ) ) ( (lv_unwindvalue_12_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6293:3: otherlv_0= 'invoke' ( ruleCallingConv )? ( ruleRETURN_ATTRIBUTES )? ( (lv_functiontype_3_0= ruleType ) ) ( (lv_functionvalue_4_0= ruleType ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' ( (lv_totype_8_0= ruleType ) ) ( (lv_tovalue_9_0= ruleType ) ) otherlv_10= 'unwind' ( (lv_unwindtype_11_0= ruleType ) ) ( (lv_unwindvalue_12_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,190,FOLLOW_190_in_ruleInvoke13545); 

                	newLeafNode(otherlv_0, grammarAccess.getInvokeAccess().getInvokeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6297:1: ( ruleCallingConv )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( ((LA128_0>=96 && LA128_0<=110)) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6298:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleInvoke13562);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6305:3: ( ruleRETURN_ATTRIBUTES )?
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( ((LA129_0>=87 && LA129_0<=94)) ) {
                alt129=1;
            }
            switch (alt129) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6306:5: ruleRETURN_ATTRIBUTES
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getRETURN_ATTRIBUTESParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleInvoke13580);
                    ruleRETURN_ATTRIBUTES();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6313:3: ( (lv_functiontype_3_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6314:1: (lv_functiontype_3_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6314:1: (lv_functiontype_3_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6315:3: lv_functiontype_3_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getFunctiontypeTypeParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInvoke13602);
            lv_functiontype_3_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"functiontype",
                    		lv_functiontype_3_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6331:2: ( (lv_functionvalue_4_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6332:1: (lv_functionvalue_4_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6332:1: (lv_functionvalue_4_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6333:3: lv_functionvalue_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getFunctionvalueTypeParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInvoke13623);
            lv_functionvalue_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"functionvalue",
                    		lv_functionvalue_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6349:2: ( (lv_pList_5_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6350:1: (lv_pList_5_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6350:1: (lv_pList_5_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6351:3: lv_pList_5_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleInvoke13644);
            lv_pList_5_0=ruleParameterList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"pList",
                    		lv_pList_5_0, 
                    		"ParameterList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6367:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop130:
            do {
                int alt130=2;
                int LA130_0 = input.LA(1);

                if ( ((LA130_0>=111 && LA130_0<=128)) ) {
                    alt130=1;
                }


                switch (alt130) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6368:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke13661);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop130;
                }
            } while (true);

            otherlv_7=(Token)match(input,133,FOLLOW_133_in_ruleInvoke13674); 

                	newLeafNode(otherlv_7, grammarAccess.getInvokeAccess().getToKeyword_7());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6379:1: ( (lv_totype_8_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6380:1: (lv_totype_8_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6380:1: (lv_totype_8_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6381:3: lv_totype_8_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getTotypeTypeParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInvoke13695);
            lv_totype_8_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"totype",
                    		lv_totype_8_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6397:2: ( (lv_tovalue_9_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6398:1: (lv_tovalue_9_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6398:1: (lv_tovalue_9_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6399:3: lv_tovalue_9_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getTovalueTypeParserRuleCall_9_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInvoke13716);
            lv_tovalue_9_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"tovalue",
                    		lv_tovalue_9_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,191,FOLLOW_191_in_ruleInvoke13728); 

                	newLeafNode(otherlv_10, grammarAccess.getInvokeAccess().getUnwindKeyword_10());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6419:1: ( (lv_unwindtype_11_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6420:1: (lv_unwindtype_11_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6420:1: (lv_unwindtype_11_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6421:3: lv_unwindtype_11_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getUnwindtypeTypeParserRuleCall_11_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInvoke13749);
            lv_unwindtype_11_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"unwindtype",
                    		lv_unwindtype_11_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6437:2: ( (lv_unwindvalue_12_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6438:1: (lv_unwindvalue_12_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6438:1: (lv_unwindvalue_12_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6439:3: lv_unwindvalue_12_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getUnwindvalueTypeParserRuleCall_12_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleInvoke13770);
            lv_unwindvalue_12_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"unwindvalue",
                    		lv_unwindvalue_12_0, 
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
    // $ANTLR end "ruleInvoke"


    // $ANTLR start "entryRuleResume"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6463:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6464:2: (iv_ruleResume= ruleResume EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6465:2: iv_ruleResume= ruleResume EOF
            {
             newCompositeNode(grammarAccess.getResumeRule()); 
            pushFollow(FOLLOW_ruleResume_in_entryRuleResume13806);
            iv_ruleResume=ruleResume();

            state._fsp--;

             current =iv_ruleResume; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResume13816); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6472:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' ( (lv_resumestruct_1_0= ruleStructure ) ) ( (lv_resumevalue_2_0= ruleType ) ) ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_resumestruct_1_0 = null;

        AntlrDatatypeRuleToken lv_resumevalue_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6475:28: ( (otherlv_0= 'resume' ( (lv_resumestruct_1_0= ruleStructure ) ) ( (lv_resumevalue_2_0= ruleType ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6476:1: (otherlv_0= 'resume' ( (lv_resumestruct_1_0= ruleStructure ) ) ( (lv_resumevalue_2_0= ruleType ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6476:1: (otherlv_0= 'resume' ( (lv_resumestruct_1_0= ruleStructure ) ) ( (lv_resumevalue_2_0= ruleType ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6476:3: otherlv_0= 'resume' ( (lv_resumestruct_1_0= ruleStructure ) ) ( (lv_resumevalue_2_0= ruleType ) )
            {
            otherlv_0=(Token)match(input,192,FOLLOW_192_in_ruleResume13853); 

                	newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6480:1: ( (lv_resumestruct_1_0= ruleStructure ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6481:1: (lv_resumestruct_1_0= ruleStructure )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6481:1: (lv_resumestruct_1_0= ruleStructure )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6482:3: lv_resumestruct_1_0= ruleStructure
            {
             
            	        newCompositeNode(grammarAccess.getResumeAccess().getResumestructStructureParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStructure_in_ruleResume13874);
            lv_resumestruct_1_0=ruleStructure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResumeRule());
            	        }
                   		set(
                   			current, 
                   			"resumestruct",
                    		lv_resumestruct_1_0, 
                    		"Structure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6498:2: ( (lv_resumevalue_2_0= ruleType ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6499:1: (lv_resumevalue_2_0= ruleType )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6499:1: (lv_resumevalue_2_0= ruleType )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6500:3: lv_resumevalue_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getResumeAccess().getResumevalueTypeParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleResume13895);
            lv_resumevalue_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResumeRule());
            	        }
                   		set(
                   			current, 
                   			"resumevalue",
                    		lv_resumevalue_2_0, 
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
    // $ANTLR end "ruleResume"


    // $ANTLR start "entryRuleUnreachable"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6524:1: entryRuleUnreachable returns [EObject current=null] : iv_ruleUnreachable= ruleUnreachable EOF ;
    public final EObject entryRuleUnreachable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnreachable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6525:2: (iv_ruleUnreachable= ruleUnreachable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6526:2: iv_ruleUnreachable= ruleUnreachable EOF
            {
             newCompositeNode(grammarAccess.getUnreachableRule()); 
            pushFollow(FOLLOW_ruleUnreachable_in_entryRuleUnreachable13931);
            iv_ruleUnreachable=ruleUnreachable();

            state._fsp--;

             current =iv_ruleUnreachable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnreachable13941); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6533:1: ruleUnreachable returns [EObject current=null] : ( () otherlv_1= 'unreachable' ) ;
    public final EObject ruleUnreachable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6536:28: ( ( () otherlv_1= 'unreachable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6537:1: ( () otherlv_1= 'unreachable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6537:1: ( () otherlv_1= 'unreachable' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6537:2: () otherlv_1= 'unreachable'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6537:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6538:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnreachableAccess().getUnreachableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,193,FOLLOW_193_in_ruleUnreachable13987); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6555:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6556:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6557:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn14023);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn14033); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6564:1: ruleReturn returns [EObject current=null] : ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_returntype_8_0= ruleType ) ) ( (lv_returnvalue_9_0= ruleType ) ) (otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT )? ) ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token this_INT_6=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_INT_13=null;
        AntlrDatatypeRuleToken lv_returntype_8_0 = null;

        AntlrDatatypeRuleToken lv_returnvalue_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6567:28: ( ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_returntype_8_0= ruleType ) ) ( (lv_returnvalue_9_0= ruleType ) ) (otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6568:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_returntype_8_0= ruleType ) ) ( (lv_returnvalue_9_0= ruleType ) ) (otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6568:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_returntype_8_0= ruleType ) ) ( (lv_returnvalue_9_0= ruleType ) ) (otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT )? ) )
            int alt133=2;
            alt133 = dfa133.predict(input);
            switch (alt133) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6568:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6568:2: ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6568:3: () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6568:3: ()
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6569:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getReturnAccess().getReturnAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,194,FOLLOW_194_in_ruleReturn14080); 

                        	newLeafNode(otherlv_1, grammarAccess.getReturnAccess().getRetKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,42,FOLLOW_42_in_ruleReturn14092); 

                        	newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getVoidKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6582:1: (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )?
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==27) ) {
                        alt131=1;
                    }
                    switch (alt131) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6582:3: otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT
                            {
                            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleReturn14105); 

                                	newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getCommaKeyword_0_3_0());
                                
                            otherlv_4=(Token)match(input,195,FOLLOW_195_in_ruleReturn14117); 

                                	newLeafNode(otherlv_4, grammarAccess.getReturnAccess().getDbgKeyword_0_3_1());
                                
                            otherlv_5=(Token)match(input,196,FOLLOW_196_in_ruleReturn14129); 

                                	newLeafNode(otherlv_5, grammarAccess.getReturnAccess().getExclamationMarkKeyword_0_3_2());
                                
                            this_INT_6=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn14140); 
                             
                                newLeafNode(this_INT_6, grammarAccess.getReturnAccess().getINTTerminalRuleCall_0_3_3()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6599:6: (otherlv_7= 'ret' ( (lv_returntype_8_0= ruleType ) ) ( (lv_returnvalue_9_0= ruleType ) ) (otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6599:6: (otherlv_7= 'ret' ( (lv_returntype_8_0= ruleType ) ) ( (lv_returnvalue_9_0= ruleType ) ) (otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6599:8: otherlv_7= 'ret' ( (lv_returntype_8_0= ruleType ) ) ( (lv_returnvalue_9_0= ruleType ) ) (otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT )?
                    {
                    otherlv_7=(Token)match(input,194,FOLLOW_194_in_ruleReturn14161); 

                        	newLeafNode(otherlv_7, grammarAccess.getReturnAccess().getRetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6603:1: ( (lv_returntype_8_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6604:1: (lv_returntype_8_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6604:1: (lv_returntype_8_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6605:3: lv_returntype_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getReturnAccess().getReturntypeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleReturn14182);
                    lv_returntype_8_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReturnRule());
                    	        }
                           		set(
                           			current, 
                           			"returntype",
                            		lv_returntype_8_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6621:2: ( (lv_returnvalue_9_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6622:1: (lv_returnvalue_9_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6622:1: (lv_returnvalue_9_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6623:3: lv_returnvalue_9_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getReturnAccess().getReturnvalueTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleReturn14203);
                    lv_returnvalue_9_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getReturnRule());
                    	        }
                           		set(
                           			current, 
                           			"returnvalue",
                            		lv_returnvalue_9_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6639:2: (otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==27) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6639:4: otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT
                            {
                            otherlv_10=(Token)match(input,27,FOLLOW_27_in_ruleReturn14216); 

                                	newLeafNode(otherlv_10, grammarAccess.getReturnAccess().getCommaKeyword_1_3_0());
                                
                            otherlv_11=(Token)match(input,195,FOLLOW_195_in_ruleReturn14228); 

                                	newLeafNode(otherlv_11, grammarAccess.getReturnAccess().getDbgKeyword_1_3_1());
                                
                            otherlv_12=(Token)match(input,196,FOLLOW_196_in_ruleReturn14240); 

                                	newLeafNode(otherlv_12, grammarAccess.getReturnAccess().getExclamationMarkKeyword_1_3_2());
                                
                            this_INT_13=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReturn14251); 
                             
                                newLeafNode(this_INT_13, grammarAccess.getReturnAccess().getINTTerminalRuleCall_1_3_3()); 
                                

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6663:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6664:2: (iv_ruleBranch= ruleBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6665:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_ruleBranch_in_entryRuleBranch14289);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranch14299); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6672:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= 'br' ( (lv_destinationtype_1_0= ruleType ) ) ( (lv_destination_2_0= ruleType ) ) ) | (otherlv_3= 'br' ( (lv_condtype_4_0= ruleType ) ) ( (lv_condvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_labelTruetype_7_0= ruleType ) ) ( (lv_labelTrue_8_0= ruleType ) ) otherlv_9= ',' ( (lv_labelFalsetype_10_0= ruleType ) ) ( (lv_labelFalse_11_0= ruleType ) ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_destinationtype_1_0 = null;

        AntlrDatatypeRuleToken lv_destination_2_0 = null;

        AntlrDatatypeRuleToken lv_condtype_4_0 = null;

        AntlrDatatypeRuleToken lv_condvalue_5_0 = null;

        AntlrDatatypeRuleToken lv_labelTruetype_7_0 = null;

        AntlrDatatypeRuleToken lv_labelTrue_8_0 = null;

        AntlrDatatypeRuleToken lv_labelFalsetype_10_0 = null;

        AntlrDatatypeRuleToken lv_labelFalse_11_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6675:28: ( ( (otherlv_0= 'br' ( (lv_destinationtype_1_0= ruleType ) ) ( (lv_destination_2_0= ruleType ) ) ) | (otherlv_3= 'br' ( (lv_condtype_4_0= ruleType ) ) ( (lv_condvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_labelTruetype_7_0= ruleType ) ) ( (lv_labelTrue_8_0= ruleType ) ) otherlv_9= ',' ( (lv_labelFalsetype_10_0= ruleType ) ) ( (lv_labelFalse_11_0= ruleType ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6676:1: ( (otherlv_0= 'br' ( (lv_destinationtype_1_0= ruleType ) ) ( (lv_destination_2_0= ruleType ) ) ) | (otherlv_3= 'br' ( (lv_condtype_4_0= ruleType ) ) ( (lv_condvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_labelTruetype_7_0= ruleType ) ) ( (lv_labelTrue_8_0= ruleType ) ) otherlv_9= ',' ( (lv_labelFalsetype_10_0= ruleType ) ) ( (lv_labelFalse_11_0= ruleType ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6676:1: ( (otherlv_0= 'br' ( (lv_destinationtype_1_0= ruleType ) ) ( (lv_destination_2_0= ruleType ) ) ) | (otherlv_3= 'br' ( (lv_condtype_4_0= ruleType ) ) ( (lv_condvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_labelTruetype_7_0= ruleType ) ) ( (lv_labelTrue_8_0= ruleType ) ) otherlv_9= ',' ( (lv_labelFalsetype_10_0= ruleType ) ) ( (lv_labelFalse_11_0= ruleType ) ) ) )
            int alt134=2;
            alt134 = dfa134.predict(input);
            switch (alt134) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6676:2: (otherlv_0= 'br' ( (lv_destinationtype_1_0= ruleType ) ) ( (lv_destination_2_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6676:2: (otherlv_0= 'br' ( (lv_destinationtype_1_0= ruleType ) ) ( (lv_destination_2_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6676:4: otherlv_0= 'br' ( (lv_destinationtype_1_0= ruleType ) ) ( (lv_destination_2_0= ruleType ) )
                    {
                    otherlv_0=(Token)match(input,197,FOLLOW_197_in_ruleBranch14337); 

                        	newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBrKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6680:1: ( (lv_destinationtype_1_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6681:1: (lv_destinationtype_1_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6681:1: (lv_destinationtype_1_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6682:3: lv_destinationtype_1_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getDestinationtypeTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBranch14358);
                    lv_destinationtype_1_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"destinationtype",
                            		lv_destinationtype_1_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6698:2: ( (lv_destination_2_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6699:1: (lv_destination_2_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6699:1: (lv_destination_2_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6700:3: lv_destination_2_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getDestinationTypeParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBranch14379);
                    lv_destination_2_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"destination",
                            		lv_destination_2_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6717:6: (otherlv_3= 'br' ( (lv_condtype_4_0= ruleType ) ) ( (lv_condvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_labelTruetype_7_0= ruleType ) ) ( (lv_labelTrue_8_0= ruleType ) ) otherlv_9= ',' ( (lv_labelFalsetype_10_0= ruleType ) ) ( (lv_labelFalse_11_0= ruleType ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6717:6: (otherlv_3= 'br' ( (lv_condtype_4_0= ruleType ) ) ( (lv_condvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_labelTruetype_7_0= ruleType ) ) ( (lv_labelTrue_8_0= ruleType ) ) otherlv_9= ',' ( (lv_labelFalsetype_10_0= ruleType ) ) ( (lv_labelFalse_11_0= ruleType ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6717:8: otherlv_3= 'br' ( (lv_condtype_4_0= ruleType ) ) ( (lv_condvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_labelTruetype_7_0= ruleType ) ) ( (lv_labelTrue_8_0= ruleType ) ) otherlv_9= ',' ( (lv_labelFalsetype_10_0= ruleType ) ) ( (lv_labelFalse_11_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,197,FOLLOW_197_in_ruleBranch14399); 

                        	newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getBrKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6721:1: ( (lv_condtype_4_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6722:1: (lv_condtype_4_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6722:1: (lv_condtype_4_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6723:3: lv_condtype_4_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getCondtypeTypeParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBranch14420);
                    lv_condtype_4_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"condtype",
                            		lv_condtype_4_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6739:2: ( (lv_condvalue_5_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6740:1: (lv_condvalue_5_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6740:1: (lv_condvalue_5_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6741:3: lv_condvalue_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getCondvalueTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBranch14441);
                    lv_condvalue_5_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"condvalue",
                            		lv_condvalue_5_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleBranch14453); 

                        	newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_1_3());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6761:1: ( (lv_labelTruetype_7_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6762:1: (lv_labelTruetype_7_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6762:1: (lv_labelTruetype_7_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6763:3: lv_labelTruetype_7_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelTruetypeTypeParserRuleCall_1_4_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBranch14474);
                    lv_labelTruetype_7_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"labelTruetype",
                            		lv_labelTruetype_7_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6779:2: ( (lv_labelTrue_8_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6780:1: (lv_labelTrue_8_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6780:1: (lv_labelTrue_8_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6781:3: lv_labelTrue_8_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelTrueTypeParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBranch14495);
                    lv_labelTrue_8_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"labelTrue",
                            		lv_labelTrue_8_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,27,FOLLOW_27_in_ruleBranch14507); 

                        	newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getCommaKeyword_1_6());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6801:1: ( (lv_labelFalsetype_10_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6802:1: (lv_labelFalsetype_10_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6802:1: (lv_labelFalsetype_10_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6803:3: lv_labelFalsetype_10_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelFalsetypeTypeParserRuleCall_1_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBranch14528);
                    lv_labelFalsetype_10_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"labelFalsetype",
                            		lv_labelFalsetype_10_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6819:2: ( (lv_labelFalse_11_0= ruleType ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6820:1: (lv_labelFalse_11_0= ruleType )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6820:1: (lv_labelFalse_11_0= ruleType )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6821:3: lv_labelFalse_11_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getLabelFalseTypeParserRuleCall_1_8_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleBranch14549);
                    lv_labelFalse_11_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"labelFalse",
                            		lv_labelFalse_11_0, 
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
    // $ANTLR end "ruleBranch"


    // $ANTLR start "entryRuleVISIBILITY"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6845:1: entryRuleVISIBILITY returns [String current=null] : iv_ruleVISIBILITY= ruleVISIBILITY EOF ;
    public final String entryRuleVISIBILITY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVISIBILITY = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6846:2: (iv_ruleVISIBILITY= ruleVISIBILITY EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6847:2: iv_ruleVISIBILITY= ruleVISIBILITY EOF
            {
             newCompositeNode(grammarAccess.getVISIBILITYRule()); 
            pushFollow(FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY14587);
            iv_ruleVISIBILITY=ruleVISIBILITY();

            state._fsp--;

             current =iv_ruleVISIBILITY.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVISIBILITY14598); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6854:1: ruleVISIBILITY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'default' | kw= 'hidden' | kw= 'protected' ) ;
    public final AntlrDatatypeRuleToken ruleVISIBILITY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6857:28: ( (kw= 'default' | kw= 'hidden' | kw= 'protected' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6858:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6858:1: (kw= 'default' | kw= 'hidden' | kw= 'protected' )
            int alt135=3;
            switch ( input.LA(1) ) {
            case 198:
                {
                alt135=1;
                }
                break;
            case 199:
                {
                alt135=2;
                }
                break;
            case 200:
                {
                alt135=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;
            }

            switch (alt135) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6859:2: kw= 'default'
                    {
                    kw=(Token)match(input,198,FOLLOW_198_in_ruleVISIBILITY14636); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVISIBILITYAccess().getDefaultKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6866:2: kw= 'hidden'
                    {
                    kw=(Token)match(input,199,FOLLOW_199_in_ruleVISIBILITY14655); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVISIBILITYAccess().getHiddenKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6873:2: kw= 'protected'
                    {
                    kw=(Token)match(input,200,FOLLOW_200_in_ruleVISIBILITY14674); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6886:1: entryRuleLINKAGE returns [String current=null] : iv_ruleLINKAGE= ruleLINKAGE EOF ;
    public final String entryRuleLINKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLINKAGE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6887:2: (iv_ruleLINKAGE= ruleLINKAGE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6888:2: iv_ruleLINKAGE= ruleLINKAGE EOF
            {
             newCompositeNode(grammarAccess.getLINKAGERule()); 
            pushFollow(FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE14715);
            iv_ruleLINKAGE=ruleLINKAGE();

            state._fsp--;

             current =iv_ruleLINKAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLINKAGE14726); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6895:1: ruleLINKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE ) ;
    public final AntlrDatatypeRuleToken ruleLINKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ALIAS_LINKAGE_12 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6898:28: ( (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6899:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6899:1: (kw= 'private' | kw= 'linker_private' | kw= 'linker_private_weak' | kw= 'available_externally' | kw= 'linkonce' | kw= 'common' | kw= 'appending' | kw= 'extern_weak' | kw= 'linkonce_odr' | kw= 'linkonce_odr_auto_hide' | kw= 'dllimport' | kw= 'dllexport' | this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE )
            int alt136=13;
            switch ( input.LA(1) ) {
            case 201:
                {
                alt136=1;
                }
                break;
            case 202:
                {
                alt136=2;
                }
                break;
            case 203:
                {
                alt136=3;
                }
                break;
            case 204:
                {
                alt136=4;
                }
                break;
            case 205:
                {
                alt136=5;
                }
                break;
            case 206:
                {
                alt136=6;
                }
                break;
            case 207:
                {
                alt136=7;
                }
                break;
            case 208:
                {
                alt136=8;
                }
                break;
            case 209:
                {
                alt136=9;
                }
                break;
            case 210:
                {
                alt136=10;
                }
                break;
            case 211:
                {
                alt136=11;
                }
                break;
            case 212:
                {
                alt136=12;
                }
                break;
            case 213:
            case 214:
            case 215:
            case 216:
                {
                alt136=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 136, 0, input);

                throw nvae;
            }

            switch (alt136) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6900:2: kw= 'private'
                    {
                    kw=(Token)match(input,201,FOLLOW_201_in_ruleLINKAGE14764); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getPrivateKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6907:2: kw= 'linker_private'
                    {
                    kw=(Token)match(input,202,FOLLOW_202_in_ruleLINKAGE14783); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinker_privateKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6914:2: kw= 'linker_private_weak'
                    {
                    kw=(Token)match(input,203,FOLLOW_203_in_ruleLINKAGE14802); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinker_private_weakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6921:2: kw= 'available_externally'
                    {
                    kw=(Token)match(input,204,FOLLOW_204_in_ruleLINKAGE14821); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getAvailable_externallyKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6928:2: kw= 'linkonce'
                    {
                    kw=(Token)match(input,205,FOLLOW_205_in_ruleLINKAGE14840); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonceKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6935:2: kw= 'common'
                    {
                    kw=(Token)match(input,206,FOLLOW_206_in_ruleLINKAGE14859); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getCommonKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6942:2: kw= 'appending'
                    {
                    kw=(Token)match(input,207,FOLLOW_207_in_ruleLINKAGE14878); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getAppendingKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6949:2: kw= 'extern_weak'
                    {
                    kw=(Token)match(input,208,FOLLOW_208_in_ruleLINKAGE14897); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getExtern_weakKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6956:2: kw= 'linkonce_odr'
                    {
                    kw=(Token)match(input,209,FOLLOW_209_in_ruleLINKAGE14916); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonce_odrKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6963:2: kw= 'linkonce_odr_auto_hide'
                    {
                    kw=(Token)match(input,210,FOLLOW_210_in_ruleLINKAGE14935); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getLinkonce_odr_auto_hideKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6970:2: kw= 'dllimport'
                    {
                    kw=(Token)match(input,211,FOLLOW_211_in_ruleLINKAGE14954); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getDllimportKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6977:2: kw= 'dllexport'
                    {
                    kw=(Token)match(input,212,FOLLOW_212_in_ruleLINKAGE14973); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLINKAGEAccess().getDllexportKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6984:5: this_ALIAS_LINKAGE_12= ruleALIAS_LINKAGE
                    {
                     
                            newCompositeNode(grammarAccess.getLINKAGEAccess().getALIAS_LINKAGEParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_ruleLINKAGE15001);
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7002:1: entryRuleALIAS_LINKAGE returns [String current=null] : iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF ;
    public final String entryRuleALIAS_LINKAGE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALIAS_LINKAGE = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7003:2: (iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7004:2: iv_ruleALIAS_LINKAGE= ruleALIAS_LINKAGE EOF
            {
             newCompositeNode(grammarAccess.getALIAS_LINKAGERule()); 
            pushFollow(FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE15047);
            iv_ruleALIAS_LINKAGE=ruleALIAS_LINKAGE();

            state._fsp--;

             current =iv_ruleALIAS_LINKAGE.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIAS_LINKAGE15058); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7011:1: ruleALIAS_LINKAGE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) ;
    public final AntlrDatatypeRuleToken ruleALIAS_LINKAGE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7014:28: ( (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7015:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7015:1: (kw= 'external' | kw= 'internal' | kw= 'weak' | kw= 'weak_odr' )
            int alt137=4;
            switch ( input.LA(1) ) {
            case 213:
                {
                alt137=1;
                }
                break;
            case 214:
                {
                alt137=2;
                }
                break;
            case 215:
                {
                alt137=3;
                }
                break;
            case 216:
                {
                alt137=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 137, 0, input);

                throw nvae;
            }

            switch (alt137) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7016:2: kw= 'external'
                    {
                    kw=(Token)match(input,213,FOLLOW_213_in_ruleALIAS_LINKAGE15096); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getExternalKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7023:2: kw= 'internal'
                    {
                    kw=(Token)match(input,214,FOLLOW_214_in_ruleALIAS_LINKAGE15115); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getInternalKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7030:2: kw= 'weak'
                    {
                    kw=(Token)match(input,215,FOLLOW_215_in_ruleALIAS_LINKAGE15134); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getALIAS_LINKAGEAccess().getWeakKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7037:2: kw= 'weak_odr'
                    {
                    kw=(Token)match(input,216,FOLLOW_216_in_ruleALIAS_LINKAGE15153); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7050:1: entryRuleMetadataValue returns [String current=null] : iv_ruleMetadataValue= ruleMetadataValue EOF ;
    public final String entryRuleMetadataValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMetadataValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7051:2: (iv_ruleMetadataValue= ruleMetadataValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7052:2: iv_ruleMetadataValue= ruleMetadataValue EOF
            {
             newCompositeNode(grammarAccess.getMetadataValueRule()); 
            pushFollow(FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue15194);
            iv_ruleMetadataValue=ruleMetadataValue();

            state._fsp--;

             current =iv_ruleMetadataValue.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadataValue15205); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7059:1: ruleMetadataValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? ) ) )? ) ;
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

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7062:28: ( ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? ) ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7063:1: ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? ) ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7063:1: ( ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? ) ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7063:2: ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) ) (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? ) ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7063:2: ( (kw= '!' this_INT_1= RULE_INT ) | (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET ) )
            int alt138=3;
            int LA138_0 = input.LA(1);

            if ( (LA138_0==196) ) {
                int LA138_1 = input.LA(2);

                if ( (LA138_1==RULE_NOBRACKET) ) {
                    alt138=3;
                }
                else if ( (LA138_1==RULE_INT) ) {
                    alt138=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 138, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA138_0==217) ) {
                alt138=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 138, 0, input);

                throw nvae;
            }
            switch (alt138) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7063:3: (kw= '!' this_INT_1= RULE_INT )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7063:3: (kw= '!' this_INT_1= RULE_INT )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7064:2: kw= '!' this_INT_1= RULE_INT
                    {
                    kw=(Token)match(input,196,FOLLOW_196_in_ruleMetadataValue15245); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_0_0_0()); 
                        
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetadataValue15260); 

                    		current.merge(this_INT_1);
                        
                     
                        newLeafNode(this_INT_1, grammarAccess.getMetadataValueAccess().getINTTerminalRuleCall_0_0_1()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7077:6: (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7077:6: (kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7078:2: kw= '!{' this_NOBRACKET_3= RULE_NOBRACKET kw= '}'
                    {
                    kw=(Token)match(input,217,FOLLOW_217_in_ruleMetadataValue15286); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_0_1_0()); 
                        
                    this_NOBRACKET_3=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue15301); 

                    		current.merge(this_NOBRACKET_3);
                        
                     
                        newLeafNode(this_NOBRACKET_3, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_0_1_1()); 
                        
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleMetadataValue15319); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getRightCurlyBracketKeyword_0_1_2()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7097:6: (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7097:6: (kw= '!' this_NOBRACKET_6= RULE_NOBRACKET )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7098:2: kw= '!' this_NOBRACKET_6= RULE_NOBRACKET
                    {
                    kw=(Token)match(input,196,FOLLOW_196_in_ruleMetadataValue15340); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_0_2_0()); 
                        
                    this_NOBRACKET_6=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue15355); 

                    		current.merge(this_NOBRACKET_6);
                        
                     
                        newLeafNode(this_NOBRACKET_6, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_0_2_1()); 
                        

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7110:3: (kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? ) ) )?
            int alt142=2;
            int LA142_0 = input.LA(1);

            if ( (LA142_0==24) ) {
                alt142=1;
            }
            switch (alt142) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7111:2: kw= '=' ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? ) )
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleMetadataValue15376); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getEqualsSignKeyword_1_0()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7116:1: ( (kw= '!' this_INT_9= RULE_INT ) | (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' ) | (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET ) | (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? ) )
                    int alt141=4;
                    switch ( input.LA(1) ) {
                    case 196:
                        {
                        int LA141_1 = input.LA(2);

                        if ( (LA141_1==RULE_INT) ) {
                            alt141=1;
                        }
                        else if ( (LA141_1==RULE_NOBRACKET) ) {
                            alt141=3;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 141, 1, input);

                            throw nvae;
                        }
                        }
                        break;
                    case 217:
                        {
                        alt141=2;
                        }
                        break;
                    case 218:
                        {
                        alt141=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 141, 0, input);

                        throw nvae;
                    }

                    switch (alt141) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7116:2: (kw= '!' this_INT_9= RULE_INT )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7116:2: (kw= '!' this_INT_9= RULE_INT )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7117:2: kw= '!' this_INT_9= RULE_INT
                            {
                            kw=(Token)match(input,196,FOLLOW_196_in_ruleMetadataValue15391); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_0_0()); 
                                
                            this_INT_9=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetadataValue15406); 

                            		current.merge(this_INT_9);
                                
                             
                                newLeafNode(this_INT_9, grammarAccess.getMetadataValueAccess().getINTTerminalRuleCall_1_1_0_1()); 
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7130:6: (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7130:6: (kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7131:2: kw= '!{' this_NOBRACKET_11= RULE_NOBRACKET kw= '}'
                            {
                            kw=(Token)match(input,217,FOLLOW_217_in_ruleMetadataValue15432); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_1_1_1_0()); 
                                
                            this_NOBRACKET_11=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue15447); 

                            		current.merge(this_NOBRACKET_11);
                                
                             
                                newLeafNode(this_NOBRACKET_11, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_1_1_1_1()); 
                                
                            kw=(Token)match(input,38,FOLLOW_38_in_ruleMetadataValue15465); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getRightCurlyBracketKeyword_1_1_1_2()); 
                                

                            }


                            }
                            break;
                        case 3 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7150:6: (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7150:6: (kw= '!' this_NOBRACKET_14= RULE_NOBRACKET )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7151:2: kw= '!' this_NOBRACKET_14= RULE_NOBRACKET
                            {
                            kw=(Token)match(input,196,FOLLOW_196_in_ruleMetadataValue15486); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_2_0()); 
                                
                            this_NOBRACKET_14=(Token)match(input,RULE_NOBRACKET,FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue15501); 

                            		current.merge(this_NOBRACKET_14);
                                
                             
                                newLeafNode(this_NOBRACKET_14, grammarAccess.getMetadataValueAccess().getNOBRACKETTerminalRuleCall_1_1_2_1()); 
                                

                            }


                            }
                            break;
                        case 4 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7164:6: (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7164:6: (kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )? )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7165:2: kw= 'metadata' ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )?
                            {
                            kw=(Token)match(input,218,FOLLOW_218_in_ruleMetadataValue15527); 

                                    current.merge(kw);
                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getMetadataKeyword_1_1_3_0()); 
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7170:1: ( ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}' )?
                            int alt140=2;
                            int LA140_0 = input.LA(1);

                            if ( (LA140_0==196) ) {
                                int LA140_1 = input.LA(2);

                                if ( (LA140_1==37) ) {
                                    alt140=1;
                                }
                            }
                            else if ( (LA140_0==217) ) {
                                int LA140_2 = input.LA(2);

                                if ( (LA140_2==218) ) {
                                    alt140=1;
                                }
                            }
                            switch (alt140) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7170:2: ( (kw= '!' kw= '{' ) | kw= '!{' ) kw= 'metadata' kw= '!' this_STRING_21= RULE_STRING kw= ',' (kw= 'metadata' kw= '!' this_INT_25= RULE_INT ) kw= '}'
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7170:2: ( (kw= '!' kw= '{' ) | kw= '!{' )
                                    int alt139=2;
                                    int LA139_0 = input.LA(1);

                                    if ( (LA139_0==196) ) {
                                        alt139=1;
                                    }
                                    else if ( (LA139_0==217) ) {
                                        alt139=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 139, 0, input);

                                        throw nvae;
                                    }
                                    switch (alt139) {
                                        case 1 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7170:3: (kw= '!' kw= '{' )
                                            {
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7170:3: (kw= '!' kw= '{' )
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7171:2: kw= '!' kw= '{'
                                            {
                                            kw=(Token)match(input,196,FOLLOW_196_in_ruleMetadataValue15543); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_3_1_0_0_0()); 
                                                
                                            kw=(Token)match(input,37,FOLLOW_37_in_ruleMetadataValue15556); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getLeftCurlyBracketKeyword_1_1_3_1_0_0_1()); 
                                                

                                            }


                                            }
                                            break;
                                        case 2 :
                                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7184:2: kw= '!{'
                                            {
                                            kw=(Token)match(input,217,FOLLOW_217_in_ruleMetadataValue15576); 

                                                    current.merge(kw);
                                                    newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_1_1_3_1_0_1()); 
                                                

                                            }
                                            break;

                                    }

                                    kw=(Token)match(input,218,FOLLOW_218_in_ruleMetadataValue15590); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getMetadataKeyword_1_1_3_1_1()); 
                                        
                                    kw=(Token)match(input,196,FOLLOW_196_in_ruleMetadataValue15603); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_3_1_2()); 
                                        
                                    this_STRING_21=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetadataValue15618); 

                                    		current.merge(this_STRING_21);
                                        
                                     
                                        newLeafNode(this_STRING_21, grammarAccess.getMetadataValueAccess().getSTRINGTerminalRuleCall_1_1_3_1_3()); 
                                        
                                    kw=(Token)match(input,27,FOLLOW_27_in_ruleMetadataValue15636); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getCommaKeyword_1_1_3_1_4()); 
                                        
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7214:1: (kw= 'metadata' kw= '!' this_INT_25= RULE_INT )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7215:2: kw= 'metadata' kw= '!' this_INT_25= RULE_INT
                                    {
                                    kw=(Token)match(input,218,FOLLOW_218_in_ruleMetadataValue15650); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getMetadataKeyword_1_1_3_1_5_0()); 
                                        
                                    kw=(Token)match(input,196,FOLLOW_196_in_ruleMetadataValue15663); 

                                            current.merge(kw);
                                            newLeafNode(kw, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_1_1_3_1_5_1()); 
                                        
                                    this_INT_25=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleMetadataValue15678); 

                                    		current.merge(this_INT_25);
                                        
                                     
                                        newLeafNode(this_INT_25, grammarAccess.getMetadataValueAccess().getINTTerminalRuleCall_1_1_3_1_5_2()); 
                                        

                                    }

                                    kw=(Token)match(input,38,FOLLOW_38_in_ruleMetadataValue15697); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7247:1: entryRuleALIGNMENT returns [String current=null] : iv_ruleALIGNMENT= ruleALIGNMENT EOF ;
    public final String entryRuleALIGNMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleALIGNMENT = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7248:2: (iv_ruleALIGNMENT= ruleALIGNMENT EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7249:2: iv_ruleALIGNMENT= ruleALIGNMENT EOF
            {
             newCompositeNode(grammarAccess.getALIGNMENTRule()); 
            pushFollow(FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT15744);
            iv_ruleALIGNMENT=ruleALIGNMENT();

            state._fsp--;

             current =iv_ruleALIGNMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleALIGNMENT15755); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7256:1: ruleALIGNMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'align' this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleALIGNMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7259:28: ( (kw= 'align' this_INT_1= RULE_INT ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7260:1: (kw= 'align' this_INT_1= RULE_INT )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7260:1: (kw= 'align' this_INT_1= RULE_INT )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7261:2: kw= 'align' this_INT_1= RULE_INT
            {
            kw=(Token)match(input,83,FOLLOW_83_in_ruleALIGNMENT15793); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getALIGNMENTAccess().getAlignKeyword_0()); 
                
            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleALIGNMENT15808); 

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


    protected DFA70 dfa70 = new DFA70(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA133 dfa133 = new DFA133(this);
    protected DFA134 dfa134 = new DFA134(this);
    static final String DFA70_eotS =
        "\27\uffff";
    static final String DFA70_eofS =
        "\27\uffff";
    static final String DFA70_minS =
        "\1\67\1\121\25\uffff";
    static final String DFA70_maxS =
        "\1\u00bb\1\124\25\uffff";
    static final String DFA70_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25";
    static final String DFA70_specialS =
        "\27\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\1\1\5\1\uffff\1\16\1\15\1\4\7\uffff\1\20\1\21\1\uffff\2"+
            "\7\1\6\1\uffff\2\6\4\uffff\1\2\2\uffff\1\3\2\24\10\uffff\1\17"+
            "\41\uffff\1\22\1\26\5\uffff\1\23\1\25\1\14\1\13\1\12\14\11\2"+
            "\10\24\uffff\12\7\3\6",
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

    static final short[] DFA70_eot = DFA.unpackEncodedString(DFA70_eotS);
    static final short[] DFA70_eof = DFA.unpackEncodedString(DFA70_eofS);
    static final char[] DFA70_min = DFA.unpackEncodedStringToUnsignedChars(DFA70_minS);
    static final char[] DFA70_max = DFA.unpackEncodedStringToUnsignedChars(DFA70_maxS);
    static final short[] DFA70_accept = DFA.unpackEncodedString(DFA70_acceptS);
    static final short[] DFA70_special = DFA.unpackEncodedString(DFA70_specialS);
    static final short[][] DFA70_transition;

    static {
        int numStates = DFA70_transitionS.length;
        DFA70_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA70_transition[i] = DFA.unpackEncodedString(DFA70_transitionS[i]);
        }
    }

    class DFA70 extends DFA {

        public DFA70(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 70;
            this.eot = DFA70_eot;
            this.eof = DFA70_eof;
            this.min = DFA70_min;
            this.max = DFA70_max;
            this.accept = DFA70_accept;
            this.special = DFA70_special;
            this.transition = DFA70_transition;
        }
        public String getDescription() {
            return "1789:1: ( ( (otherlv_0= 'volatile' )? this_Load_1= ruleLoad ) | ( (otherlv_2= 'volatile' )? this_Store_3= ruleStore ) | this_Fence_4= ruleFence | this_GetElementPtr_5= ruleGetElementPtr | this_LOGICAL_OP_6= ruleLOGICAL_OP | this_ARITHMETIC_OP_7= ruleARITHMETIC_OP | this_Compare_8= ruleCompare | this_Cast_9= ruleCast | this_ShuffleVector_10= ruleShuffleVector | this_InsertElement_11= ruleInsertElement | this_ExtractElement_12= ruleExtractElement | this_InsertValue_13= ruleInsertValue | this_ExtractValue_14= ruleExtractValue | this_Alloc_15= ruleAlloc | this_CmpXchg_16= ruleCmpXchg | this_AtomicRMW_17= ruleAtomicRMW | this_PHI_18= rulePHI | this_Select_19= ruleSelect | this_Call_20= ruleCall | this_VA_Arg_21= ruleVA_Arg | this_LandingPad_22= ruleLandingPad )";
        }
    }
    static final String DFA115_eotS =
        "\u009a\uffff";
    static final String DFA115_eofS =
        "\u009a\uffff";
    static final String DFA115_minS =
        "\1\u0082\1\45\1\6\1\45\12\13\1\u0083\1\6\1\33\1\10\1\6\1\10\12"+
        "\13\1\50\12\33\12\13\11\10\1\33\1\10\1\6\1\u0083\1\10\2\33\1\10"+
        "\2\uffff\12\33\12\13\23\33\1\10\2\33\2\10\35\33\1\10\12\33";
    static final String DFA115_maxS =
        "\1\u0082\1\47\1\56\1\45\12\63\1\u0083\1\56\1\63\1\64\2\56\12\63"+
        "\1\50\11\64\1\66\12\63\11\u0098\1\63\1\64\1\56\1\u0083\1\56\1\66"+
        "\1\63\1\64\2\uffff\11\64\1\66\12\63\22\64\1\66\1\56\1\66\1\63\1"+
        "\64\1\56\1\66\22\64\1\66\11\64\1\56\1\66\11\64";
    static final String DFA115_acceptS =
        "\104\uffff\1\1\1\2\124\uffff";
    static final String DFA115_specialS =
        "\u009a\uffff}>";
    static final String[] DFA115_transitionS = {
            "\1\1",
            "\1\2\1\uffff\1\3",
            "\1\15\1\uffff\1\4\1\5\1\6\27\uffff\1\10\3\uffff\1\16\3\uffff"+
            "\1\7\1\11\1\12\1\13\1\14",
            "\1\17",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\20\17\uffff\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\23",
            "\1\35\1\uffff\1\24\1\25\1\26\27\uffff\1\30\3\uffff\1\36\3"+
            "\uffff\1\27\1\31\1\32\1\33\1\34",
            "\1\22\12\uffff\1\16\14\uffff\1\21",
            "\1\37\1\40\1\41\27\uffff\1\43\7\uffff\1\42\1\44\1\45\1\46"+
            "\1\47\5\uffff\1\50",
            "\1\62\1\uffff\1\51\1\52\1\53\27\uffff\1\55\7\uffff\1\54\1"+
            "\56\1\57\1\60\1\61",
            "\1\63\1\64\1\65\27\uffff\1\67\7\uffff\1\66\1\70\1\71\1\72"+
            "\1\73",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\74\17\uffff\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\77",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\22\12\uffff\1\16\17\uffff\1\101",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\102\17\uffff\1\22\12\uffff\1\16\14\uffff\1\103",
            "\3\104\27\uffff\1\104\7\uffff\5\104\136\uffff\14\105",
            "\3\104\27\uffff\1\104\7\uffff\5\104\136\uffff\14\105",
            "\3\104\27\uffff\1\104\7\uffff\5\104\136\uffff\14\105",
            "\3\104\27\uffff\1\104\7\uffff\5\104\136\uffff\14\105",
            "\3\104\27\uffff\1\104\7\uffff\5\104\136\uffff\14\105",
            "\3\104\27\uffff\1\104\7\uffff\5\104\136\uffff\14\105",
            "\3\104\27\uffff\1\104\7\uffff\5\104\136\uffff\14\105",
            "\3\104\27\uffff\1\104\7\uffff\5\104\136\uffff\14\105",
            "\3\104\27\uffff\1\104\7\uffff\5\104\136\uffff\14\105",
            "\1\76\12\uffff\1\36\14\uffff\1\75",
            "\1\106\1\107\1\110\27\uffff\1\112\7\uffff\1\111\1\113\1\114"+
            "\1\115\1\116\5\uffff\1\117",
            "\1\131\1\uffff\1\120\1\121\1\122\27\uffff\1\124\7\uffff\1"+
            "\123\1\125\1\126\1\127\1\130",
            "\1\23",
            "\1\132\1\133\1\134\27\uffff\1\136\7\uffff\1\135\1\137\1\140"+
            "\1\141\1\142",
            "\1\22\12\uffff\1\16\17\uffff\1\101",
            "\1\22\12\uffff\1\16\14\uffff\1\103",
            "\1\143\1\144\1\145\27\uffff\1\147\7\uffff\1\146\1\150\1\151"+
            "\1\152\1\153\5\uffff\1\154",
            "",
            "",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\76\12\uffff\1\36\17\uffff\1\156",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\157\17\uffff\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\100\30\uffff\1\50",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\22\12\uffff\1\16\17\uffff\1\162",
            "\1\163\1\164\1\165\27\uffff\1\167\7\uffff\1\166\1\170\1\171"+
            "\1\172\1\173",
            "\1\76\12\uffff\1\36\17\uffff\1\156",
            "\1\76\12\uffff\1\36\14\uffff\1\160",
            "\1\174\1\175\1\176\27\uffff\1\u0080\7\uffff\1\177\1\u0081"+
            "\1\u0082\1\u0083\1\u0084\5\uffff\1\u0085",
            "\1\u0086\1\u0087\1\u0088\27\uffff\1\u008a\7\uffff\1\u0089"+
            "\1\u008b\1\u008c\1\u008d\1\u008e",
            "\1\22\12\uffff\1\16\17\uffff\1\162",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\155\30\uffff\1\117",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\76\12\uffff\1\36\17\uffff\1\u0090",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\161\30\uffff\1\154",
            "\1\u0091\1\u0092\1\u0093\27\uffff\1\u0095\7\uffff\1\u0094"+
            "\1\u0096\1\u0097\1\u0098\1\u0099",
            "\1\76\12\uffff\1\36\17\uffff\1\u0090",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085",
            "\1\u008f\30\uffff\1\u0085"
    };

    static final short[] DFA115_eot = DFA.unpackEncodedString(DFA115_eotS);
    static final short[] DFA115_eof = DFA.unpackEncodedString(DFA115_eofS);
    static final char[] DFA115_min = DFA.unpackEncodedStringToUnsignedChars(DFA115_minS);
    static final char[] DFA115_max = DFA.unpackEncodedStringToUnsignedChars(DFA115_maxS);
    static final short[] DFA115_accept = DFA.unpackEncodedString(DFA115_acceptS);
    static final short[] DFA115_special = DFA.unpackEncodedString(DFA115_specialS);
    static final short[][] DFA115_transition;

    static {
        int numStates = DFA115_transitionS.length;
        DFA115_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA115_transition[i] = DFA.unpackEncodedString(DFA115_transitionS[i]);
        }
    }

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = DFA115_eot;
            this.eof = DFA115_eof;
            this.min = DFA115_min;
            this.max = DFA115_max;
            this.accept = DFA115_accept;
            this.special = DFA115_special;
            this.transition = DFA115_transition;
        }
        public String getDescription() {
            return "4067:1: ( (otherlv_0= 'landingpad' ( (lv_struct_1_0= ruleStructure ) ) otherlv_2= 'personality' ( (lv_personalitytype_3_0= ruleType ) ) ( (lv_personalityvalue_4_0= ruleType ) ) ( (otherlv_5= 'cleanup' ( (lv_clause_6_0= ruleClause ) )* ) | ( (lv_clause_7_0= ruleClause ) )+ ) ) | (otherlv_8= 'landingpad' ( (lv_struct_9_0= ruleStructure ) ) otherlv_10= 'personality' ( (lv_personalitytype_11_0= ruleType ) ) ( (lv_personalityfunction_12_0= ruleCAST_TYPE ) ) otherlv_13= '(' ( (lv_value_14_0= ruleType ) ) this_OREST_15= RULE_OREST this_VAR_TYPE_16= RULE_VAR_TYPE otherlv_17= 'to' ( (lv_castto_18_0= ruleType ) ) otherlv_19= ')' ( (otherlv_20= 'cleanup' ( (lv_clause_21_0= ruleClause ) )* ) | ( (lv_clause_22_0= ruleClause ) )+ ) ) )";
        }
    }
    static final String DFA133_eotS =
        "\16\uffff";
    static final String DFA133_eofS =
        "\3\uffff\1\4\1\uffff\11\2";
    static final String DFA133_minS =
        "\1\u00c2\1\10\1\uffff\1\10\1\uffff\11\10";
    static final String DFA133_maxS =
        "\1\u00c2\1\56\1\uffff\1\u00c5\1\uffff\11\u00c5";
    static final String DFA133_acceptS =
        "\2\uffff\1\2\1\uffff\1\1\11\uffff";
    static final String DFA133_specialS =
        "\16\uffff}>";
    static final String[] DFA133_transitionS = {
            "\1\1",
            "\3\2\27\uffff\1\2\7\uffff\1\3\4\2",
            "",
            "\1\5\1\6\1\7\1\uffff\1\4\16\uffff\1\4\6\uffff\1\11\3\uffff"+
            "\1\4\3\uffff\1\10\1\12\1\13\1\14\1\15\10\uffff\2\4\1\uffff\3"+
            "\4\7\uffff\2\4\1\uffff\3\4\1\uffff\2\4\4\uffff\1\4\2\uffff\3"+
            "\4\10\uffff\1\4\41\uffff\2\4\5\uffff\23\4\24\uffff\20\4\1\uffff"+
            "\3\4\2\uffff\1\4",
            "",
            "\3\2\1\uffff\1\2\13\uffff\1\4\2\uffff\1\2\6\uffff\1\2\3\uffff"+
            "\1\2\3\uffff\5\2\10\uffff\2\2\1\uffff\3\2\7\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\2\2\4\uffff\1\2\2\uffff\3\2\10\uffff\1\2\41\uffff"+
            "\2\2\5\uffff\23\2\24\uffff\20\2\1\uffff\3\2\2\uffff\1\2",
            "\3\2\1\uffff\1\2\13\uffff\1\4\2\uffff\1\2\6\uffff\1\2\3\uffff"+
            "\1\2\3\uffff\5\2\10\uffff\2\2\1\uffff\3\2\7\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\2\2\4\uffff\1\2\2\uffff\3\2\10\uffff\1\2\41\uffff"+
            "\2\2\5\uffff\23\2\24\uffff\20\2\1\uffff\3\2\2\uffff\1\2",
            "\3\2\1\uffff\1\2\13\uffff\1\4\2\uffff\1\2\6\uffff\1\2\3\uffff"+
            "\1\2\3\uffff\5\2\10\uffff\2\2\1\uffff\3\2\7\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\2\2\4\uffff\1\2\2\uffff\3\2\10\uffff\1\2\41\uffff"+
            "\2\2\5\uffff\23\2\24\uffff\20\2\1\uffff\3\2\2\uffff\1\2",
            "\3\2\1\uffff\1\2\13\uffff\1\4\2\uffff\1\2\6\uffff\1\2\3\uffff"+
            "\1\2\3\uffff\5\2\10\uffff\2\2\1\uffff\3\2\7\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\2\2\4\uffff\1\2\2\uffff\3\2\10\uffff\1\2\41\uffff"+
            "\2\2\5\uffff\23\2\24\uffff\20\2\1\uffff\3\2\2\uffff\1\2",
            "\3\2\1\uffff\1\2\13\uffff\1\4\2\uffff\1\2\6\uffff\1\2\3\uffff"+
            "\1\2\3\uffff\5\2\10\uffff\2\2\1\uffff\3\2\7\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\2\2\4\uffff\1\2\2\uffff\3\2\10\uffff\1\2\41\uffff"+
            "\2\2\5\uffff\23\2\24\uffff\20\2\1\uffff\3\2\2\uffff\1\2",
            "\3\2\1\uffff\1\2\13\uffff\1\4\2\uffff\1\2\6\uffff\1\2\3\uffff"+
            "\1\2\3\uffff\5\2\10\uffff\2\2\1\uffff\3\2\7\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\2\2\4\uffff\1\2\2\uffff\3\2\10\uffff\1\2\41\uffff"+
            "\2\2\5\uffff\23\2\24\uffff\20\2\1\uffff\3\2\2\uffff\1\2",
            "\3\2\1\uffff\1\2\13\uffff\1\4\2\uffff\1\2\6\uffff\1\2\3\uffff"+
            "\1\2\3\uffff\5\2\10\uffff\2\2\1\uffff\3\2\7\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\2\2\4\uffff\1\2\2\uffff\3\2\10\uffff\1\2\41\uffff"+
            "\2\2\5\uffff\23\2\24\uffff\20\2\1\uffff\3\2\2\uffff\1\2",
            "\3\2\1\uffff\1\2\13\uffff\1\4\2\uffff\1\2\6\uffff\1\2\3\uffff"+
            "\1\2\3\uffff\5\2\10\uffff\2\2\1\uffff\3\2\7\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\2\2\4\uffff\1\2\2\uffff\3\2\10\uffff\1\2\41\uffff"+
            "\2\2\5\uffff\23\2\24\uffff\20\2\1\uffff\3\2\2\uffff\1\2",
            "\3\2\1\uffff\1\2\13\uffff\1\4\2\uffff\1\2\6\uffff\1\2\3\uffff"+
            "\1\2\3\uffff\5\2\10\uffff\2\2\1\uffff\3\2\7\uffff\2\2\1\uffff"+
            "\3\2\1\uffff\2\2\4\uffff\1\2\2\uffff\3\2\10\uffff\1\2\41\uffff"+
            "\2\2\5\uffff\23\2\24\uffff\20\2\1\uffff\3\2\2\uffff\1\2"
    };

    static final short[] DFA133_eot = DFA.unpackEncodedString(DFA133_eotS);
    static final short[] DFA133_eof = DFA.unpackEncodedString(DFA133_eofS);
    static final char[] DFA133_min = DFA.unpackEncodedStringToUnsignedChars(DFA133_minS);
    static final char[] DFA133_max = DFA.unpackEncodedStringToUnsignedChars(DFA133_maxS);
    static final short[] DFA133_accept = DFA.unpackEncodedString(DFA133_acceptS);
    static final short[] DFA133_special = DFA.unpackEncodedString(DFA133_specialS);
    static final short[][] DFA133_transition;

    static {
        int numStates = DFA133_transitionS.length;
        DFA133_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA133_transition[i] = DFA.unpackEncodedString(DFA133_transitionS[i]);
        }
    }

    class DFA133 extends DFA {

        public DFA133(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 133;
            this.eot = DFA133_eot;
            this.eof = DFA133_eof;
            this.min = DFA133_min;
            this.max = DFA133_max;
            this.accept = DFA133_accept;
            this.special = DFA133_special;
            this.transition = DFA133_transition;
        }
        public String getDescription() {
            return "6568:1: ( ( () otherlv_1= 'ret' otherlv_2= 'void' (otherlv_3= ',' otherlv_4= '!dbg' otherlv_5= '!' this_INT_6= RULE_INT )? ) | (otherlv_7= 'ret' ( (lv_returntype_8_0= ruleType ) ) ( (lv_returnvalue_9_0= ruleType ) ) (otherlv_10= ',' otherlv_11= '!dbg' otherlv_12= '!' this_INT_13= RULE_INT )? ) )";
        }
    }
    static final String DFA134_eotS =
        "\26\uffff";
    static final String DFA134_eofS =
        "\13\uffff\11\25\2\uffff";
    static final String DFA134_minS =
        "\1\u00c5\23\10\2\uffff";
    static final String DFA134_maxS =
        "\1\u00c5\12\56\11\u00c5\2\uffff";
    static final String DFA134_acceptS =
        "\24\uffff\1\2\1\1";
    static final String DFA134_specialS =
        "\26\uffff}>";
    static final String[] DFA134_transitionS = {
            "\1\1",
            "\1\2\1\3\1\4\27\uffff\1\6\7\uffff\1\5\1\7\1\10\1\11\1\12",
            "\1\13\1\14\1\15\27\uffff\1\17\7\uffff\1\16\1\20\1\21\1\22"+
            "\1\23",
            "\1\13\1\14\1\15\27\uffff\1\17\7\uffff\1\16\1\20\1\21\1\22"+
            "\1\23",
            "\1\13\1\14\1\15\27\uffff\1\17\7\uffff\1\16\1\20\1\21\1\22"+
            "\1\23",
            "\1\13\1\14\1\15\27\uffff\1\17\7\uffff\1\16\1\20\1\21\1\22"+
            "\1\23",
            "\1\13\1\14\1\15\27\uffff\1\17\7\uffff\1\16\1\20\1\21\1\22"+
            "\1\23",
            "\1\13\1\14\1\15\27\uffff\1\17\7\uffff\1\16\1\20\1\21\1\22"+
            "\1\23",
            "\1\13\1\14\1\15\27\uffff\1\17\7\uffff\1\16\1\20\1\21\1\22"+
            "\1\23",
            "\1\13\1\14\1\15\27\uffff\1\17\7\uffff\1\16\1\20\1\21\1\22"+
            "\1\23",
            "\1\13\1\14\1\15\27\uffff\1\17\7\uffff\1\16\1\20\1\21\1\22"+
            "\1\23",
            "\3\25\1\uffff\1\25\16\uffff\1\24\6\uffff\1\25\3\uffff\1\25"+
            "\3\uffff\5\25\10\uffff\2\25\1\uffff\3\25\7\uffff\2\25\1\uffff"+
            "\3\25\1\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\uffff\1\25\41"+
            "\uffff\2\25\5\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff"+
            "\1\25",
            "\3\25\1\uffff\1\25\16\uffff\1\24\6\uffff\1\25\3\uffff\1\25"+
            "\3\uffff\5\25\10\uffff\2\25\1\uffff\3\25\7\uffff\2\25\1\uffff"+
            "\3\25\1\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\uffff\1\25\41"+
            "\uffff\2\25\5\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff"+
            "\1\25",
            "\3\25\1\uffff\1\25\16\uffff\1\24\6\uffff\1\25\3\uffff\1\25"+
            "\3\uffff\5\25\10\uffff\2\25\1\uffff\3\25\7\uffff\2\25\1\uffff"+
            "\3\25\1\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\uffff\1\25\41"+
            "\uffff\2\25\5\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff"+
            "\1\25",
            "\3\25\1\uffff\1\25\16\uffff\1\24\6\uffff\1\25\3\uffff\1\25"+
            "\3\uffff\5\25\10\uffff\2\25\1\uffff\3\25\7\uffff\2\25\1\uffff"+
            "\3\25\1\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\uffff\1\25\41"+
            "\uffff\2\25\5\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff"+
            "\1\25",
            "\3\25\1\uffff\1\25\16\uffff\1\24\6\uffff\1\25\3\uffff\1\25"+
            "\3\uffff\5\25\10\uffff\2\25\1\uffff\3\25\7\uffff\2\25\1\uffff"+
            "\3\25\1\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\uffff\1\25\41"+
            "\uffff\2\25\5\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff"+
            "\1\25",
            "\3\25\1\uffff\1\25\16\uffff\1\24\6\uffff\1\25\3\uffff\1\25"+
            "\3\uffff\5\25\10\uffff\2\25\1\uffff\3\25\7\uffff\2\25\1\uffff"+
            "\3\25\1\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\uffff\1\25\41"+
            "\uffff\2\25\5\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff"+
            "\1\25",
            "\3\25\1\uffff\1\25\16\uffff\1\24\6\uffff\1\25\3\uffff\1\25"+
            "\3\uffff\5\25\10\uffff\2\25\1\uffff\3\25\7\uffff\2\25\1\uffff"+
            "\3\25\1\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\uffff\1\25\41"+
            "\uffff\2\25\5\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff"+
            "\1\25",
            "\3\25\1\uffff\1\25\16\uffff\1\24\6\uffff\1\25\3\uffff\1\25"+
            "\3\uffff\5\25\10\uffff\2\25\1\uffff\3\25\7\uffff\2\25\1\uffff"+
            "\3\25\1\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\uffff\1\25\41"+
            "\uffff\2\25\5\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff"+
            "\1\25",
            "\3\25\1\uffff\1\25\16\uffff\1\24\6\uffff\1\25\3\uffff\1\25"+
            "\3\uffff\5\25\10\uffff\2\25\1\uffff\3\25\7\uffff\2\25\1\uffff"+
            "\3\25\1\uffff\2\25\4\uffff\1\25\2\uffff\3\25\10\uffff\1\25\41"+
            "\uffff\2\25\5\uffff\23\25\24\uffff\20\25\1\uffff\3\25\2\uffff"+
            "\1\25",
            "",
            ""
    };

    static final short[] DFA134_eot = DFA.unpackEncodedString(DFA134_eotS);
    static final short[] DFA134_eof = DFA.unpackEncodedString(DFA134_eofS);
    static final char[] DFA134_min = DFA.unpackEncodedStringToUnsignedChars(DFA134_minS);
    static final char[] DFA134_max = DFA.unpackEncodedStringToUnsignedChars(DFA134_maxS);
    static final short[] DFA134_accept = DFA.unpackEncodedString(DFA134_acceptS);
    static final short[] DFA134_special = DFA.unpackEncodedString(DFA134_specialS);
    static final short[][] DFA134_transition;

    static {
        int numStates = DFA134_transitionS.length;
        DFA134_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA134_transition[i] = DFA.unpackEncodedString(DFA134_transitionS[i]);
        }
    }

    class DFA134 extends DFA {

        public DFA134(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 134;
            this.eot = DFA134_eot;
            this.eof = DFA134_eof;
            this.min = DFA134_min;
            this.max = DFA134_max;
            this.accept = DFA134_accept;
            this.special = DFA134_special;
            this.transition = DFA134_transition;
        }
        public String getDescription() {
            return "6676:1: ( (otherlv_0= 'br' ( (lv_destinationtype_1_0= ruleType ) ) ( (lv_destination_2_0= ruleType ) ) ) | (otherlv_3= 'br' ( (lv_condtype_4_0= ruleType ) ) ( (lv_condvalue_5_0= ruleType ) ) otherlv_6= ',' ( (lv_labelTruetype_7_0= ruleType ) ) ( (lv_labelTrue_8_0= ruleType ) ) otherlv_9= ',' ( (lv_labelFalsetype_10_0= ruleType ) ) ( (lv_labelFalse_11_0= ruleType ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLLVM_in_entryRuleLLVM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLVM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleLLVM130 = new BitSet(new long[]{0x00057C0402280702L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement224 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement266 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelEntity325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTopLevelEntity363 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleTopLevelEntity375 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleTopLevelEntity417 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleTopLevelEntity430 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23_in_ruleTopLevelEntity448 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTopLevelEntity461 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTopLevelEntity503 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTopLevelEntity515 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTopLevelEntity527 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity544 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleTopLevelEntity562 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity579 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_28_in_ruleTopLevelEntity598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainLevelEntity645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_ruleMainLevelEntity692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_ruleMainLevelEntity719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNamedType_in_entryRuleNamedType754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNamedType764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleNamedType810 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNamedType822 = new BitSet(new long[]{0x1D857E1FEA280740L,0x0000000080721BB0L,0x0FFF800007FFFF06L,0x0000000001FFFE00L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleNamedType839 = new BitSet(new long[]{0x1D857E1FEA280740L,0x0000000080721BB0L,0x0FFF800007FFFF06L,0x0000000001FFFE00L});
    public static final BitSet FOLLOW_29_in_ruleNamedType856 = new BitSet(new long[]{0x1D857E1FEA280740L,0x0000000080721BB0L,0x0FFF800007FFFF06L,0x0000000001FFFE00L});
    public static final BitSet FOLLOW_30_in_ruleNamedType874 = new BitSet(new long[]{0x1D857E1FEA280740L,0x0000000080721BB0L,0x0FFF800007FFFF06L,0x0000000001FFFE00L});
    public static final BitSet FOLLOW_31_in_ruleNamedType892 = new BitSet(new long[]{0x1D857E1FEA280740L,0x0000000080721BB0L,0x0FFF800007FFFF06L,0x0000000001FFFE00L});
    public static final BitSet FOLLOW_32_in_ruleNamedType908 = new BitSet(new long[]{0x000080A000000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleNamedType930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpaque_in_ruleNamedType952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleNamedType980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ARRAY_in_ruleNamedType998 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_CSTRING_in_ruleNamedType1008 = new BitSet(new long[]{0x0000000608000002L});
    public static final BitSet FOLLOW_33_in_ruleNamedType1020 = new BitSet(new long[]{0x0000000608000002L});
    public static final BitSet FOLLOW_34_in_ruleNamedType1038 = new BitSet(new long[]{0x0000000608000002L});
    public static final BitSet FOLLOW_27_in_ruleNamedType1053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleNamedType1069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_ruleNamedType1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleNamedType1126 = new BitSet(new long[]{0x0000001E08000002L});
    public static final BitSet FOLLOW_33_in_ruleNamedType1139 = new BitSet(new long[]{0x0000001E08000002L});
    public static final BitSet FOLLOW_34_in_ruleNamedType1157 = new BitSet(new long[]{0x0000001E08000002L});
    public static final BitSet FOLLOW_35_in_ruleNamedType1173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_36_in_ruleNamedType1191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_27_in_ruleNamedType1209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleNamedType1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType1266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType1277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleType1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleType1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INTEGER_in_ruleType1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_ruleType1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleStructure1504 = new BitSet(new long[]{0x000D7C440A280F40L});
    public static final BitSet FOLLOW_ruleType_in_ruleStructure1527 = new BitSet(new long[]{0x0008004008000800L});
    public static final BitSet FOLLOW_RULE_ARRAY_in_ruleStructure1544 = new BitSet(new long[]{0x0008004008000800L});
    public static final BitSet FOLLOW_RULE_OREST_in_ruleStructure1556 = new BitSet(new long[]{0x0008004008000000L});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleStructure1578 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_27_in_ruleStructure1592 = new BitSet(new long[]{0x000D7C440A280F40L});
    public static final BitSet FOLLOW_ruleType_in_ruleStructure1614 = new BitSet(new long[]{0x0008004008000800L});
    public static final BitSet FOLLOW_RULE_ARRAY_in_ruleStructure1631 = new BitSet(new long[]{0x0008004008000800L});
    public static final BitSet FOLLOW_RULE_OREST_in_ruleStructure1643 = new BitSet(new long[]{0x0008004008000000L});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleStructure1665 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_38_in_ruleStructure1682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleStructure1711 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleStructure1723 = new BitSet(new long[]{0x000D7C440A280F40L});
    public static final BitSet FOLLOW_ruleType_in_ruleStructure1746 = new BitSet(new long[]{0x0008004008000800L});
    public static final BitSet FOLLOW_RULE_ARRAY_in_ruleStructure1763 = new BitSet(new long[]{0x0008004008000800L});
    public static final BitSet FOLLOW_RULE_OREST_in_ruleStructure1775 = new BitSet(new long[]{0x0008004008000000L});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleStructure1797 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_27_in_ruleStructure1811 = new BitSet(new long[]{0x000D7C440A280F40L});
    public static final BitSet FOLLOW_ruleType_in_ruleStructure1833 = new BitSet(new long[]{0x0008004008000800L});
    public static final BitSet FOLLOW_RULE_ARRAY_in_ruleStructure1850 = new BitSet(new long[]{0x0008004008000800L});
    public static final BitSet FOLLOW_RULE_OREST_in_ruleStructure1862 = new BitSet(new long[]{0x0008004008000000L});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleStructure1884 = new BitSet(new long[]{0x0000004008000000L});
    public static final BitSet FOLLOW_38_in_ruleStructure1901 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleStructure1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlias_in_entryRuleAlias1950 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlias1960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleAlias1997 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x0000000000000000L,0x0000000001FFFFC0L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_ruleAlias2014 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleAlias2032 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlias2054 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlias2075 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlias2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitive_in_entryRulePrimitive2133 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitive2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rulePrimitive2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rulePrimitive2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rulePrimitive2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rulePrimitive2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rulePrimitive2258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rulePrimitive2277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOpaque_in_entryRuleOpaque2318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOpaque2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOpaque2366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionHeader_in_entryRuleFunctionHeader2405 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionHeader2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFunctionHeader2453 = new BitSet(new long[]{0x00057C0402280700L,0x00007FFF7F800000L,0x0000000000000000L,0x0000000001FFFFC0L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleFunctionHeader2470 = new BitSet(new long[]{0x00057C0402280700L,0x00007FFF7F800000L,0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader2488 = new BitSet(new long[]{0x00057C0402280700L,0x00007FFF7F800000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionHeader2506 = new BitSet(new long[]{0x00057C0402280700L,0x000000007F800000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader2524 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionHeader2546 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader2563 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleFunctionHeader2589 = new BitSet(new long[]{0x0002002040000000L,0xFFFF800000080000L,0x0000000000000001L,0x0000000002000010L});
    public static final BitSet FOLLOW_30_in_ruleFunctionHeader2602 = new BitSet(new long[]{0x0002002040000000L,0xFFFF800000080000L,0x0000000000000001L,0x0000000002000010L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader2621 = new BitSet(new long[]{0x0002002040000000L,0xFFFF800000080000L,0x0000000000000001L,0x0000000002000010L});
    public static final BitSet FOLLOW_49_in_ruleFunctionHeader2635 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionHeader2646 = new BitSet(new long[]{0x0002002040000000L,0xFFFF800000080000L,0x0000000000000001L,0x0000000002000010L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader2664 = new BitSet(new long[]{0x0002002040000000L,0xFFFF800000080000L,0x0000000000000001L,0x0000000002000010L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionHeader2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleFunctionHeader2706 = new BitSet(new long[]{0x00057C0402280700L,0x00007FFF7F800000L,0x0000000000000000L,0x0000000001FFFFC0L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_ruleFunctionHeader2723 = new BitSet(new long[]{0x00057C0402280700L,0x00007FFF7F800000L,0x0000000000000000L,0x00000000000001C0L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_ruleFunctionHeader2741 = new BitSet(new long[]{0x00057C0402280700L,0x00007FFF7F800000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionHeader2759 = new BitSet(new long[]{0x00057C0402280700L,0x000000007F800000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleFunctionHeader2777 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleFunctionHeader2799 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleFunctionHeader2816 = new BitSet(new long[]{0x0008000000000800L});
    public static final BitSet FOLLOW_ruleTypeList_in_ruleFunctionHeader2843 = new BitSet(new long[]{0x0002000040000002L,0xFFFF800000080000L,0x0000000000000001L});
    public static final BitSet FOLLOW_RULE_OREST_in_ruleFunctionHeader2860 = new BitSet(new long[]{0x0002000040000002L,0xFFFF800000080000L,0x0000000000000001L});
    public static final BitSet FOLLOW_30_in_ruleFunctionHeader2873 = new BitSet(new long[]{0x0002000000000002L,0xFFFF800000080000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionHeader2892 = new BitSet(new long[]{0x0002000000000002L,0xFFFF800000080000L,0x0000000000000001L});
    public static final BitSet FOLLOW_49_in_ruleFunctionHeader2906 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionHeader2917 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleFunctionHeader2935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList2973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList2983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleParameterList3029 = new BitSet(new long[]{0x00157C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterList3051 = new BitSet(new long[]{0x00157C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterList3072 = new BitSet(new long[]{0x0010000008000000L});
    public static final BitSet FOLLOW_27_in_ruleParameterList3085 = new BitSet(new long[]{0x00157C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterList3106 = new BitSet(new long[]{0x00157C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleParameterList3127 = new BitSet(new long[]{0x0010000008000000L});
    public static final BitSet FOLLOW_52_in_ruleParameterList3143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody3179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleFunctionBody3235 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000010L});
    public static final BitSet FOLLOW_37_in_ruleFunctionBody3248 = new BitSet(new long[]{0x1D857C0402281700L,0x0000000080721BB0L,0x7FFF800007FFFF06L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_ruleFunctionBody3269 = new BitSet(new long[]{0x1D857C4402281700L,0x0000000080721BB0L,0x7FFF800007FFFF06L,0x0000000000000027L});
    public static final BitSet FOLLOW_38_in_ruleFunctionBody3282 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000010L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleFunctionBody3303 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000010L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock3340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicBlock3350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleBasicBlock3393 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleBasicBlock3410 = new BitSet(new long[]{0x1D857C0402280700L,0x0000000080721BB0L,0x7FFF800007FFFF06L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleNamedType_in_ruleBasicBlock3435 = new BitSet(new long[]{0x1D857C0402280700L,0x0000000080721BB0L,0x7FFF800007FFFF06L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBasicBlock3454 = new BitSet(new long[]{0x1D857C0402280700L,0x0000000080721BB0L,0x7FFF800007FFFF06L,0x0000000000000027L});
    public static final BitSet FOLLOW_ruleRet_Instr_in_ruleBasicBlock3479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRet_Instr_in_entryRuleRet_Instr3515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRet_Instr3525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleRet_Instr3572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_ruleRet_Instr3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleRet_Instr3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_ruleRet_Instr3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_ruleRet_Instr3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_ruleRet_Instr3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_ruleRet_Instr3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeList_in_entryRuleTypeList3769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeList3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleTypeList3825 = new BitSet(new long[]{0x00157C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeList3847 = new BitSet(new long[]{0x0010000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTypeList3860 = new BitSet(new long[]{0x00157C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleTypeList3881 = new BitSet(new long[]{0x0010000008000000L});
    public static final BitSet FOLLOW_52_in_ruleTypeList3897 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_ruleTypeList3910 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction3948 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction3958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInstruction3997 = new BitSet(new long[]{0x0080000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleLoad_in_ruleInstruction4021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleInstruction4041 = new BitSet(new long[]{0x0080000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_ruleStore_in_ruleInstruction4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_ruleInstruction4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_ruleInstruction4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OP_in_ruleInstruction4147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleARITHMETIC_OP_in_ruleInstruction4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleInstruction4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleInstruction4228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_ruleInstruction4255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_ruleInstruction4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_ruleInstruction4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_ruleInstruction4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_ruleInstruction4363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_ruleInstruction4390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_ruleInstruction4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_ruleInstruction4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_ruleInstruction4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleInstruction4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleInstruction4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_ruleInstruction4552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_ruleInstruction4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr4614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetElementPtr4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleGetElementPtr4661 = new BitSet(new long[]{0x02057C040A280700L});
    public static final BitSet FOLLOW_57_in_ruleGetElementPtr4674 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleGetElementPtr4697 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleGetElementPtr4718 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleGetElementPtr4731 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleGetElementPtr4752 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleGetElementPtr4773 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_entryRuleExtractValue4811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractValue4821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleExtractValue4858 = new BitSet(new long[]{0x000000A000000040L});
    public static final BitSet FOLLOW_RULE_ARRAY_in_ruleExtractValue4876 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleExtractValue4908 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleExtractValue4930 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleExtractValue4943 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleExtractValue4960 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_entryRuleInsertValue5003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertValue5013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleInsertValue5050 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleInsertValue5071 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertValue5092 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInsertValue5104 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertValue5125 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertValue5146 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInsertValue5159 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInsertValue5176 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleFence_in_entryRuleFence5219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFence5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleFence5266 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_61_in_ruleFence5279 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleFence5302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_entryRuleATOMIC_ORDERING5339 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleATOMIC_ORDERING5350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleATOMIC_ORDERING5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleATOMIC_ORDERING5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleATOMIC_ORDERING5426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleATOMIC_ORDERING5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleATOMIC_ORDERING5464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleATOMIC_ORDERING5483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg5523 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmpXchg5533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleCmpXchg5570 = new BitSet(new long[]{0x00857C040A280700L});
    public static final BitSet FOLLOW_55_in_ruleCmpXchg5583 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCmpXchg5606 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCmpXchg5627 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCmpXchg5639 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCmpXchg5660 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCmpXchg5681 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCmpXchg5693 = new BitSet(new long[]{0xE0057C0402280700L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleType_in_ruleCmpXchg5714 = new BitSet(new long[]{0xE0057C0402280700L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleType_in_ruleCmpXchg5735 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_61_in_ruleCmpXchg5748 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleCmpXchg5771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW5807 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRMW5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleAtomicRMW5854 = new BitSet(new long[]{0x0080000000000000L,0x000000000001FFC0L});
    public static final BitSet FOLLOW_55_in_ruleAtomicRMW5867 = new BitSet(new long[]{0x0080000000000000L,0x000000000001FFC0L});
    public static final BitSet FOLLOW_ruleBIN_OP_in_ruleAtomicRMW5885 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleAtomicRMW5905 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleAtomicRMW5926 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAtomicRMW5938 = new BitSet(new long[]{0xE0057C0402280700L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleType_in_ruleAtomicRMW5959 = new BitSet(new long[]{0xE0057C0402280700L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleType_in_ruleAtomicRMW5980 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_61_in_ruleAtomicRMW5993 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleAtomicRMW6016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBIN_OP_in_entryRuleBIN_OP6053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBIN_OP6064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleBIN_OP6102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleBIN_OP6121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleBIN_OP6140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleBIN_OP6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleBIN_OP6178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleBIN_OP6197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleBIN_OP6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleBIN_OP6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleBIN_OP6254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleBIN_OP6273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleBIN_OP6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_entryRuleLoad6332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoad6342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleLoad6380 = new BitSet(new long[]{0x00857C040A280700L});
    public static final BitSet FOLLOW_55_in_ruleLoad6393 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleLoad6416 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleLoad6437 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleLoad6450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000002000010L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleLoad6467 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleLoad6489 = new BitSet(new long[]{0x0000000008000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000010L});
    public static final BitSet FOLLOW_81_in_ruleLoad6513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleLoad6525 = new BitSet(new long[]{0xE0857C0402280700L,0x000000000000000FL});
    public static final BitSet FOLLOW_55_in_ruleLoad6538 = new BitSet(new long[]{0xE0057C0402280700L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleType_in_ruleLoad6561 = new BitSet(new long[]{0xE0057C0402280700L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleType_in_ruleLoad6582 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_61_in_ruleLoad6595 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleLoad6618 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleLoad6631 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleLoad6643 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLoad6660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore6704 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore6714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleStore6752 = new BitSet(new long[]{0x00857C040A280700L});
    public static final BitSet FOLLOW_55_in_ruleStore6765 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleStore6788 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleStore6809 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStore6821 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleStore6842 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleStore6863 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleStore6876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000002000010L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleStore6893 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleStore6915 = new BitSet(new long[]{0x0000000008000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000010L});
    public static final BitSet FOLLOW_84_in_ruleStore6939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleStore6951 = new BitSet(new long[]{0x00857C040A280700L});
    public static final BitSet FOLLOW_55_in_ruleStore6964 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleStore6987 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleStore7008 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleStore7020 = new BitSet(new long[]{0xE0057C0402280700L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleType_in_ruleStore7041 = new BitSet(new long[]{0xE0057C0402280700L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleType_in_ruleStore7062 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_61_in_ruleStore7075 = new BitSet(new long[]{0xE000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_ruleATOMIC_ORDERING_in_ruleStore7098 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleStore7111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_ruleStore7123 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleStore7140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall7184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall7194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleCall7232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_ruleCall7246 = new BitSet(new long[]{0x000D7C0402280700L,0x00007FFF7F800000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleCall7263 = new BitSet(new long[]{0x000D7C0402280700L,0x000000007F800000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleCall7281 = new BitSet(new long[]{0x000D7C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCall7303 = new BitSet(new long[]{0x000D7C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCall7324 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleCall7345 = new BitSet(new long[]{0x0000000000000002L,0xFFFF800000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall7362 = new BitSet(new long[]{0x0000000000000002L,0xFFFF800000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_entryRuleRETURN_ATTRIBUTES7400 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRETURN_ATTRIBUTES7411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleRETURN_ATTRIBUTES7449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleRETURN_ATTRIBUTES7468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleRETURN_ATTRIBUTES7487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleRETURN_ATTRIBUTES7506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleRETURN_ATTRIBUTES7525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRETURN_ATTRIBUTES7544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRETURN_ATTRIBUTES7563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRETURN_ATTRIBUTES7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_entryRuleAlloc7622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlloc7632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleAlloc7669 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlloc7690 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAlloc7703 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlloc7724 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleAlloc7745 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAlloc7760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_ruleAlloc7776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_entryRuleCallingConv7814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallingConv7825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleCallingConv7863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleCallingConv7882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleCallingConv7901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleCallingConv7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_ruleCallingConv7939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_101_in_ruleCallingConv7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_102_in_ruleCallingConv7977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_103_in_ruleCallingConv7996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_104_in_ruleCallingConv8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_105_in_ruleCallingConv8034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_106_in_ruleCallingConv8053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_107_in_ruleCallingConv8072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_108_in_ruleCallingConv8091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_109_in_ruleCallingConv8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_ruleCallingConv8130 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCallingConv8143 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv8158 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCallingConv8176 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCallingConv8191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES8238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_111_in_ruleFUNCTION_ATTRIBUTES8287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_112_in_ruleFUNCTION_ATTRIBUTES8307 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleFUNCTION_ATTRIBUTES8320 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleFUNCTION_ATTRIBUTES8333 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleFUNCTION_ATTRIBUTES8348 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleFUNCTION_ATTRIBUTES8366 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleFUNCTION_ATTRIBUTES8379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_113_in_ruleFUNCTION_ATTRIBUTES8399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_114_in_ruleFUNCTION_ATTRIBUTES8418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_115_in_ruleFUNCTION_ATTRIBUTES8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_116_in_ruleFUNCTION_ATTRIBUTES8456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_117_in_ruleFUNCTION_ATTRIBUTES8475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_ruleFUNCTION_ATTRIBUTES8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleFUNCTION_ATTRIBUTES8513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_120_in_ruleFUNCTION_ATTRIBUTES8532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_121_in_ruleFUNCTION_ATTRIBUTES8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleFUNCTION_ATTRIBUTES8570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_123_in_ruleFUNCTION_ATTRIBUTES8589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleFUNCTION_ATTRIBUTES8608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_125_in_ruleFUNCTION_ATTRIBUTES8627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_126_in_ruleFUNCTION_ATTRIBUTES8646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleFUNCTION_ATTRIBUTES8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_128_in_ruleFUNCTION_ATTRIBUTES8684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePHI_in_entryRulePHI8724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePHI8734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_rulePHI8771 = new BitSet(new long[]{0x00057C0406280700L});
    public static final BitSet FOLLOW_ruleType_in_rulePHI8787 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePHI8798 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI8819 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePHI8831 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_rulePHI8844 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePHI8856 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleValuePair_in_rulePHI8877 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePHI8889 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleValuePair_in_entryRuleValuePair8927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValuePair8937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleValuePair8983 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleValuePair8995 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleValuePair9016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_entryRuleLandingPad9052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLandingPad9062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_130_in_ruleLandingPad9100 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleLandingPad9121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_ruleLandingPad9133 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad9154 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad9175 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_132_in_ruleLandingPad9189 = new BitSet(new long[]{0x00057C0402280702L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad9210 = new BitSet(new long[]{0x00057C0402280702L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad9239 = new BitSet(new long[]{0x00057C0402280702L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_130_in_ruleLandingPad9261 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleLandingPad9282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_ruleLandingPad9294 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x0000000001FFE000L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad9315 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001FFE000L});
    public static final BitSet FOLLOW_ruleCAST_TYPE_in_ruleLandingPad9336 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleLandingPad9348 = new BitSet(new long[]{0x00057C0402280F00L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad9369 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_OREST_in_ruleLandingPad9380 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_VAR_TYPE_in_ruleLandingPad9390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_ruleLandingPad9401 = new BitSet(new long[]{0x00157C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleLandingPad9422 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleLandingPad9434 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_132_in_ruleLandingPad9448 = new BitSet(new long[]{0x00057C0402280702L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad9469 = new BitSet(new long[]{0x00057C0402280702L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad9498 = new BitSet(new long[]{0x00057C0402280702L,0x0000000000000000L,0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause9537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause9547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_134_in_ruleClause9585 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleClause9606 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleClause9627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_135_in_ruleClause9647 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleClause9668 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleClause9689 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleClause9702 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleClause9723 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleClause9744 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect9783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect9793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_136_in_ruleSelect9830 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSelect9851 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSelect9872 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSelect9884 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSelect9905 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSelect9926 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSelect9938 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSelect9959 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSelect9980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVA_Arg_in_entryRuleVA_Arg10016 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVA_Arg10026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_137_in_ruleVA_Arg10063 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleVA_Arg10084 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleVA_Arg10105 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleVA_Arg10117 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleVA_Arg10138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_entryRuleExtractElement10174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractElement10184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_138_in_ruleExtractElement10221 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleExtractElement10242 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleExtractElement10263 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleExtractElement10275 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleExtractElement10296 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleExtractElement10317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_entryRuleInsertElement10353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertElement10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_139_in_ruleInsertElement10400 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertElement10421 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertElement10442 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInsertElement10454 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertElement10475 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertElement10496 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleInsertElement10508 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertElement10529 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInsertElement10550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector10586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShuffleVector10596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleShuffleVector10633 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleShuffleVector10654 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleShuffleVector10675 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleShuffleVector10687 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleShuffleVector10708 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleShuffleVector10729 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleShuffleVector10741 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleShuffleVector10762 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleShuffleVector10783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast10819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast10829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCAST_TYPE_in_ruleCast10870 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast10890 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast10911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_ruleCast10923 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCast10944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCAST_TYPE_in_entryRuleCAST_TYPE10981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCAST_TYPE10992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_141_in_ruleCAST_TYPE11030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_142_in_ruleCAST_TYPE11049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_143_in_ruleCAST_TYPE11068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_144_in_ruleCAST_TYPE11087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_145_in_ruleCAST_TYPE11106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_146_in_ruleCAST_TYPE11125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_147_in_ruleCAST_TYPE11144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_148_in_ruleCAST_TYPE11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_149_in_ruleCAST_TYPE11182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleCAST_TYPE11201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_151_in_ruleCAST_TYPE11220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_152_in_ruleCAST_TYPE11239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare11279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleCompare11327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000001FF8000000L});
    public static final BitSet FOLLOW_ruleI_PREDICATES_in_ruleCompare11343 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare11363 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare11384 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCompare11396 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare11417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleCompare11437 = new BitSet(new long[]{0x0000600000000000L,0x0000000000000000L,0x00007FE1E0000000L});
    public static final BitSet FOLLOW_ruleF_PREDICATES_in_ruleCompare11453 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare11473 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare11494 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCompare11506 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleCompare11527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleI_PREDICATES_in_entryRuleI_PREDICATES11565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleI_PREDICATES11576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_155_in_ruleI_PREDICATES11614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleI_PREDICATES11633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleI_PREDICATES11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ruleI_PREDICATES11671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ruleI_PREDICATES11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleI_PREDICATES11709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_161_in_ruleI_PREDICATES11728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_162_in_ruleI_PREDICATES11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_163_in_ruleI_PREDICATES11766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_164_in_ruleI_PREDICATES11785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleF_PREDICATES_in_entryRuleF_PREDICATES11826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleF_PREDICATES11837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleF_PREDICATES11875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_165_in_ruleF_PREDICATES11894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_166_in_ruleF_PREDICATES11913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_167_in_ruleF_PREDICATES11932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_168_in_ruleF_PREDICATES11951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_169_in_ruleF_PREDICATES11970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_170_in_ruleF_PREDICATES11989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_171_in_ruleF_PREDICATES12008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_172_in_ruleF_PREDICATES12027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_157_in_ruleF_PREDICATES12046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_158_in_ruleF_PREDICATES12065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_159_in_ruleF_PREDICATES12084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_160_in_ruleF_PREDICATES12103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_173_in_ruleF_PREDICATES12122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_174_in_ruleF_PREDICATES12141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleF_PREDICATES12160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleARITHMETIC_OP_in_entryRuleARITHMETIC_OP12200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleARITHMETIC_OP12210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleARITHMETIC_OP12248 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_175_in_ruleARITHMETIC_OP12266 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_72_in_ruleARITHMETIC_OP12284 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_176_in_ruleARITHMETIC_OP12302 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_177_in_ruleARITHMETIC_OP12320 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_178_in_ruleARITHMETIC_OP12338 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_179_in_ruleARITHMETIC_OP12356 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_180_in_ruleARITHMETIC_OP12374 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_181_in_ruleARITHMETIC_OP12392 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_182_in_ruleARITHMETIC_OP12410 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_183_in_ruleARITHMETIC_OP12428 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_184_in_ruleARITHMETIC_OP12446 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleARITHMETIC_OP12468 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleARITHMETIC_OP12489 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleARITHMETIC_OP12501 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleARITHMETIC_OP12522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOGICAL_OP_in_entryRuleLOGICAL_OP12558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOGICAL_OP12568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_185_in_ruleLOGICAL_OP12606 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_186_in_ruleLOGICAL_OP12624 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_187_in_ruleLOGICAL_OP12642 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_73_in_ruleLOGICAL_OP12660 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_75_in_ruleLOGICAL_OP12678 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_76_in_ruleLOGICAL_OP12696 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleLOGICAL_OP12718 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleLOGICAL_OP12739 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleLOGICAL_OP12751 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleLOGICAL_OP12772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch12808 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndirectBranch12818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_188_in_ruleIndirectBranch12855 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleIndirectBranch12876 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleIndirectBranch12897 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleIndirectBranch12909 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleIndirectBranch12921 = new BitSet(new long[]{0x00057C0412280700L});
    public static final BitSet FOLLOW_ruleLabelList_in_ruleIndirectBranch12942 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleIndirectBranch12955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelList_in_entryRuleLabelList12991 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabelList13001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleLabelList13047 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleLabelList13068 = new BitSet(new long[]{0x00057C0402280702L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch13105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch13115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_189_in_ruleSwitch13152 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSwitch13173 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSwitch13194 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSwitch13206 = new BitSet(new long[]{0x00057C0406280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSwitch13227 = new BitSet(new long[]{0x00057C0406280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleSwitch13248 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleSwitch13260 = new BitSet(new long[]{0x00057C041A280700L});
    public static final BitSet FOLLOW_ruleJumpTable_in_ruleSwitch13281 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSwitch13294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJumpTable_in_entryRuleJumpTable13330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJumpTable13340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_ruleJumpTable13386 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleJumpTable13407 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleJumpTable13419 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleJumpTable13440 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleJumpTable13461 = new BitSet(new long[]{0x00057C040A280702L});
    public static final BitSet FOLLOW_ruleInvoke_in_entryRuleInvoke13498 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvoke13508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_190_in_ruleInvoke13545 = new BitSet(new long[]{0x000D7C0402280700L,0x00007FFF7F800000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleInvoke13562 = new BitSet(new long[]{0x000D7C0402280700L,0x000000007F800000L});
    public static final BitSet FOLLOW_ruleRETURN_ATTRIBUTES_in_ruleInvoke13580 = new BitSet(new long[]{0x000D7C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInvoke13602 = new BitSet(new long[]{0x000D7C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInvoke13623 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleInvoke13644 = new BitSet(new long[]{0x0000000000000000L,0xFFFF800000000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke13661 = new BitSet(new long[]{0x0000000000000000L,0xFFFF800000000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_133_in_ruleInvoke13674 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleInvoke13695 = new BitSet(new long[]{0x00057C0402280700L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_ruleType_in_ruleInvoke13716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_191_in_ruleInvoke13728 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInvoke13749 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleInvoke13770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_entryRuleResume13806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResume13816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_192_in_ruleResume13853 = new BitSet(new long[]{0x000000A000000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleResume13874 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleResume13895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_entryRuleUnreachable13931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnreachable13941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_193_in_ruleUnreachable13987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn14023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn14033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleReturn14080 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleReturn14092 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleReturn14105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_ruleReturn14117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_ruleReturn14129 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn14140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_194_in_ruleReturn14161 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleReturn14182 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleReturn14203 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleReturn14216 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_195_in_ruleReturn14228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_ruleReturn14240 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReturn14251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_entryRuleBranch14289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranch14299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_ruleBranch14337 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleBranch14358 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleBranch14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_197_in_ruleBranch14399 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleBranch14420 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleBranch14441 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBranch14453 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleBranch14474 = new BitSet(new long[]{0x00057C040A280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleBranch14495 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleBranch14507 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleBranch14528 = new BitSet(new long[]{0x00057C0402280700L});
    public static final BitSet FOLLOW_ruleType_in_ruleBranch14549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVISIBILITY_in_entryRuleVISIBILITY14587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVISIBILITY14598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_198_in_ruleVISIBILITY14636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_199_in_ruleVISIBILITY14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_200_in_ruleVISIBILITY14674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLINKAGE_in_entryRuleLINKAGE14715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLINKAGE14726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_201_in_ruleLINKAGE14764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_202_in_ruleLINKAGE14783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_203_in_ruleLINKAGE14802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_204_in_ruleLINKAGE14821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_205_in_ruleLINKAGE14840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_206_in_ruleLINKAGE14859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_207_in_ruleLINKAGE14878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_208_in_ruleLINKAGE14897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_209_in_ruleLINKAGE14916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_210_in_ruleLINKAGE14935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_211_in_ruleLINKAGE14954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_212_in_ruleLINKAGE14973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_ruleLINKAGE15001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIAS_LINKAGE_in_entryRuleALIAS_LINKAGE15047 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIAS_LINKAGE15058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_213_in_ruleALIAS_LINKAGE15096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_214_in_ruleALIAS_LINKAGE15115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_215_in_ruleALIAS_LINKAGE15134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_216_in_ruleALIAS_LINKAGE15153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue15194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadataValue15205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_ruleMetadataValue15245 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetadataValue15260 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_217_in_ruleMetadataValue15286 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue15301 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMetadataValue15319 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_196_in_ruleMetadataValue15340 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue15355 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24_in_ruleMetadataValue15376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000006000010L});
    public static final BitSet FOLLOW_196_in_ruleMetadataValue15391 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetadataValue15406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_217_in_ruleMetadataValue15432 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue15447 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMetadataValue15465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_196_in_ruleMetadataValue15486 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_RULE_NOBRACKET_in_ruleMetadataValue15501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_218_in_ruleMetadataValue15527 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000002000010L});
    public static final BitSet FOLLOW_196_in_ruleMetadataValue15543 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleMetadataValue15556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_217_in_ruleMetadataValue15576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_218_in_ruleMetadataValue15590 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_ruleMetadataValue15603 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetadataValue15618 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMetadataValue15636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_218_in_ruleMetadataValue15650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_196_in_ruleMetadataValue15663 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleMetadataValue15678 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleMetadataValue15697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleALIGNMENT_in_entryRuleALIGNMENT15744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleALIGNMENT15755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleALIGNMENT15793 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleALIGNMENT15808 = new BitSet(new long[]{0x0000000000000002L});

}