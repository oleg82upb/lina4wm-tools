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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ALIAS_LINKAGE", "RULE_ATOMIC_ORDERING", "RULE_BIN_OP", "RULE_RETURN_ATTRIBUTES", "RULE_CAST_OP", "RULE_I_PREDICATES", "RULE_VISIBILITY", "RULE_LINKAGE", "RULE_INT_TYPE", "RULE_ID", "RULE_BOOL", "RULE_SL_COMMENT", "RULE_STRING", "RULE_UNKNOWN_TYPE", "RULE_VALID_ID", "RULE_POINTER", "RULE_PRIMITIVE_VALUE", "RULE_FLOATING_POINT_TYPE", "RULE_INITIALIZER", "RULE_METADATA", "RULE_F_PREDICATES", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'-'", "'.'", "'ccc'", "'fastcc'", "'coldcc'", "'x86_stdcallcc'", "'x86_fastcallcc'", "'x86_thiscallcc'", "'arm_apcscc'", "'arm_aapcscc'", "'arm_aapcs_vfpcc'", "'msp430_intrcc'", "'ptx_kernel'", "'ptx_device'", "'spir_func'", "'spir_kernel'", "'cc'", "'<'", "'>'", "'address_safety'", "'alignstack'", "'('", "')'", "'alwaysinline'", "'nonlazybind'", "'inlinehint'", "'naked'", "'noimplicitfloat'", "'noinline'", "'noredzone'", "'noreturn'", "'nounwind'", "'optsize'", "'readnone'", "'readonly'", "'returns_twice'", "'ssp'", "'sspreq'", "'uwtable'", "'catch'", "'invoke'", "'resume'", "'switch'", "'module'", "'asm'", "'target'", "'datalayout'", "'triple'", "'='", "'deplibs'", "'['", "','", "']'", "'type'", "'opaque'", "'global'", "'unnamed_addr'", "'constant'", "'align'", "'define'", "'section '", "'declare'", "'alias'", "'x'", "'[]'", "'{'", "'}'", "'()'", "':'", "'add'", "'fadd'", "'sub'", "'fsub'", "'mul'", "'fmul'", "'udiv'", "'sdiv'", "'fdiv'", "'urem'", "'srem'", "'frem'", "'nsw'", "'nuw'", "'shl'", "'lshr'", "'ashr'", "'and'", "'or'", "'xor'", "'to'", "'metadata'", "'!'", "'!{'", "'getelementptr'", "'inbounds'", "'fence'", "'singlethread'", "'cmpxchg'", "'volatile'", "'atomicrmw'", "'load'", "'atomic'", "'store'", "'tail'", "'call'", "'!srcloc'", "'alloca'", "'phi'", "'landingpad'", "'personality'", "'cleanup'", "'filter'", "'select'", "'va_arg'", "'extractvalue'", "'insertvalue'", "'extractelement'", "'insertelement'", "'shufflevector'", "'icmp'", "'fcmp'", "'indirectbr'", "'label'", "'unwind'", "'unreachable'", "'ret'", "'!dbg'", "'br'"
    };
    public static final int RULE_F_PREDICATES=25;
    public static final int RULE_ID=14;
    public static final int T__29=29;
    public static final int RULE_ANY_OTHER=28;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__148=148;
    public static final int T__147=147;
    public static final int T__90=90;
    public static final int T__149=149;
    public static final int RULE_FLOATING_POINT_TYPE=22;
    public static final int T__154=154;
    public static final int T__155=155;
    public static final int T__156=156;
    public static final int T__99=99;
    public static final int T__150=150;
    public static final int T__98=98;
    public static final int T__151=151;
    public static final int T__97=97;
    public static final int T__152=152;
    public static final int T__96=96;
    public static final int T__153=153;
    public static final int T__95=95;
    public static final int T__139=139;
    public static final int T__138=138;
    public static final int T__137=137;
    public static final int RULE_INITIALIZER=23;
    public static final int T__136=136;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_METADATA=24;
    public static final int T__141=141;
    public static final int T__85=85;
    public static final int T__142=142;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__140=140;
    public static final int T__86=86;
    public static final int T__145=145;
    public static final int T__89=89;
    public static final int T__146=146;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=26;
    public static final int T__143=143;
    public static final int T__144=144;
    public static final int T__126=126;
    public static final int T__125=125;
    public static final int T__128=128;
    public static final int RULE_STRING=17;
    public static final int T__127=127;
    public static final int T__71=71;
    public static final int T__129=129;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__130=130;
    public static final int T__74=74;
    public static final int T__131=131;
    public static final int T__73=73;
    public static final int T__132=132;
    public static final int T__133=133;
    public static final int T__79=79;
    public static final int T__134=134;
    public static final int T__78=78;
    public static final int T__135=135;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ALIAS_LINKAGE=5;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__116=116;
    public static final int RULE_POINTER=20;
    public static final int RULE_I_PREDICATES=10;
    public static final int RULE_ATOMIC_ORDERING=6;
    public static final int T__117=117;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__124=124;
    public static final int RULE_BOOL=15;
    public static final int RULE_RETURN_ATTRIBUTES=8;
    public static final int T__123=123;
    public static final int T__122=122;
    public static final int T__121=121;
    public static final int T__120=120;
    public static final int T__61=61;
    public static final int RULE_PRIMITIVE_VALUE=21;
    public static final int T__60=60;
    public static final int T__55=55;
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
    public static final int RULE_UNKNOWN_TYPE=18;
    public static final int RULE_CAST_OP=9;
    public static final int T__59=59;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__111=111;
    public static final int T__110=110;
    public static final int RULE_BIN_OP=7;
    public static final int RULE_INT=4;
    public static final int T__113=113;
    public static final int T__112=112;
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
    public static final int RULE_VALID_ID=19;
    public static final int T__100=100;
    public static final int RULE_SL_COMMENT=16;
    public static final int RULE_INT_TYPE=13;
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
    public static final int RULE_LINKAGE=12;
    public static final int RULE_VISIBILITY=11;
    public static final int RULE_WS=27;

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

                if ( (LA1_0==RULE_VALID_ID||LA1_0==RULE_METADATA||LA1_0==72||LA1_0==74||LA1_0==78||LA1_0==88||LA1_0==90) ) {
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


    // $ANTLR start "entryRuleNUMBER"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:106:1: entryRuleNUMBER returns [String current=null] : iv_ruleNUMBER= ruleNUMBER EOF ;
    public final String entryRuleNUMBER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMBER = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:107:2: (iv_ruleNUMBER= ruleNUMBER EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:108:2: iv_ruleNUMBER= ruleNUMBER EOF
            {
             newCompositeNode(grammarAccess.getNUMBERRule()); 
            pushFollow(FOLLOW_ruleNUMBER_in_entryRuleNUMBER167);
            iv_ruleNUMBER=ruleNUMBER();

            state._fsp--;

             current =iv_ruleNUMBER.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNUMBER178); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:115:1: ruleNUMBER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNUMBER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:118:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:119:2: (kw= '-' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==29) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:120:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleNUMBER217); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNUMBERAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER234); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_1()); 
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:132:1: (kw= '.' this_INT_3= RULE_INT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==30) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:133:2: kw= '.' this_INT_3= RULE_INT
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleNUMBER253); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNUMBERAccess().getFullStopKeyword_2_0()); 
                        
                    this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNUMBER268); 

                    		current.merge(this_INT_3);
                        
                     
                        newLeafNode(this_INT_3, grammarAccess.getNUMBERAccess().getINTTerminalRuleCall_2_1()); 
                        

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
    // $ANTLR end "ruleNUMBER"


    // $ANTLR start "entryRuleCallingConv"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:153:1: entryRuleCallingConv returns [String current=null] : iv_ruleCallingConv= ruleCallingConv EOF ;
    public final String entryRuleCallingConv() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCallingConv = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:154:2: (iv_ruleCallingConv= ruleCallingConv EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:155:2: iv_ruleCallingConv= ruleCallingConv EOF
            {
             newCompositeNode(grammarAccess.getCallingConvRule()); 
            pushFollow(FOLLOW_ruleCallingConv_in_entryRuleCallingConv316);
            iv_ruleCallingConv=ruleCallingConv();

            state._fsp--;

             current =iv_ruleCallingConv.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCallingConv327); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:162:1: ruleCallingConv returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER ) ) ;
    public final AntlrDatatypeRuleToken ruleCallingConv() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NUMBER_16 = null;

        AntlrDatatypeRuleToken this_NUMBER_18 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:165:28: ( (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:166:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:166:1: (kw= 'ccc' | kw= 'fastcc' | kw= 'coldcc' | kw= 'x86_stdcallcc' | kw= 'x86_fastcallcc' | kw= 'x86_thiscallcc' | kw= 'arm_apcscc' | kw= 'arm_aapcscc' | kw= 'arm_aapcs_vfpcc' | kw= 'msp430_intrcc' | kw= 'ptx_kernel' | kw= 'ptx_device' | kw= 'spir_func' | kw= 'spir_kernel' | (kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER ) )
            int alt4=15;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 33:
                {
                alt4=3;
                }
                break;
            case 34:
                {
                alt4=4;
                }
                break;
            case 35:
                {
                alt4=5;
                }
                break;
            case 36:
                {
                alt4=6;
                }
                break;
            case 37:
                {
                alt4=7;
                }
                break;
            case 38:
                {
                alt4=8;
                }
                break;
            case 39:
                {
                alt4=9;
                }
                break;
            case 40:
                {
                alt4=10;
                }
                break;
            case 41:
                {
                alt4=11;
                }
                break;
            case 42:
                {
                alt4=12;
                }
                break;
            case 43:
                {
                alt4=13;
                }
                break;
            case 44:
                {
                alt4=14;
                }
                break;
            case 45:
                {
                alt4=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:167:2: kw= 'ccc'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleCallingConv365); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCccKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:174:2: kw= 'fastcc'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleCallingConv384); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getFastccKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:181:2: kw= 'coldcc'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleCallingConv403); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getColdccKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:188:2: kw= 'x86_stdcallcc'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleCallingConv422); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_stdcallccKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:195:2: kw= 'x86_fastcallcc'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleCallingConv441); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_fastcallccKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:202:2: kw= 'x86_thiscallcc'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleCallingConv460); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getX86_thiscallccKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:209:2: kw= 'arm_apcscc'
                    {
                    kw=(Token)match(input,37,FOLLOW_37_in_ruleCallingConv479); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_apcsccKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:216:2: kw= 'arm_aapcscc'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleCallingConv498); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcsccKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:223:2: kw= 'arm_aapcs_vfpcc'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleCallingConv517); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getArm_aapcs_vfpccKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:230:2: kw= 'msp430_intrcc'
                    {
                    kw=(Token)match(input,40,FOLLOW_40_in_ruleCallingConv536); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getMsp430_intrccKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:237:2: kw= 'ptx_kernel'
                    {
                    kw=(Token)match(input,41,FOLLOW_41_in_ruleCallingConv555); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_kernelKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:244:2: kw= 'ptx_device'
                    {
                    kw=(Token)match(input,42,FOLLOW_42_in_ruleCallingConv574); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getPtx_deviceKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:251:2: kw= 'spir_func'
                    {
                    kw=(Token)match(input,43,FOLLOW_43_in_ruleCallingConv593); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_funcKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:258:2: kw= 'spir_kernel'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleCallingConv612); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getSpir_kernelKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:264:6: (kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:264:6: (kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:265:2: kw= 'cc' kw= '<' this_NUMBER_16= ruleNUMBER kw= '>' this_NUMBER_18= ruleNUMBER
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleCallingConv632); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getCcKeyword_14_0()); 
                        
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleCallingConv645); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getLessThanSignKeyword_14_1()); 
                        
                     
                            newCompositeNode(grammarAccess.getCallingConvAccess().getNUMBERParserRuleCall_14_2()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleCallingConv667);
                    this_NUMBER_16=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_16);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleCallingConv685); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getCallingConvAccess().getGreaterThanSignKeyword_14_3()); 
                        
                     
                            newCompositeNode(grammarAccess.getCallingConvAccess().getNUMBERParserRuleCall_14_4()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleCallingConv707);
                    this_NUMBER_18=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_18);
                        
                     
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
    // $ANTLR end "ruleCallingConv"


    // $ANTLR start "entryRuleFUNCTION_ATTRIBUTES"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:312:1: entryRuleFUNCTION_ATTRIBUTES returns [String current=null] : iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF ;
    public final String entryRuleFUNCTION_ATTRIBUTES() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFUNCTION_ATTRIBUTES = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:313:2: (iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:314:2: iv_ruleFUNCTION_ATTRIBUTES= ruleFUNCTION_ATTRIBUTES EOF
            {
             newCompositeNode(grammarAccess.getFUNCTION_ATTRIBUTESRule()); 
            pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES754);
            iv_ruleFUNCTION_ATTRIBUTES=ruleFUNCTION_ATTRIBUTES();

            state._fsp--;

             current =iv_ruleFUNCTION_ATTRIBUTES.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES765); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:321:1: ruleFUNCTION_ATTRIBUTES returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_NUMBER_4= ruleNUMBER kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) ;
    public final AntlrDatatypeRuleToken ruleFUNCTION_ATTRIBUTES() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_NUMBER_4 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:324:28: ( (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_NUMBER_4= ruleNUMBER kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:325:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_NUMBER_4= ruleNUMBER kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:325:1: (kw= 'address_safety' | (kw= 'alignstack' kw= '(' kw= '<' this_NUMBER_4= ruleNUMBER kw= '>' kw= ')' ) | kw= 'alwaysinline' | kw= 'nonlazybind' | kw= 'inlinehint' | kw= 'naked' | kw= 'noimplicitfloat' | kw= 'noinline' | kw= 'noredzone' | kw= 'noreturn' | kw= 'nounwind' | kw= 'optsize' | kw= 'readnone' | kw= 'readonly' | kw= 'returns_twice' | kw= 'ssp' | kw= 'sspreq' | kw= 'uwtable' )
            int alt5=18;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt5=1;
                }
                break;
            case 49:
                {
                alt5=2;
                }
                break;
            case 52:
                {
                alt5=3;
                }
                break;
            case 53:
                {
                alt5=4;
                }
                break;
            case 54:
                {
                alt5=5;
                }
                break;
            case 55:
                {
                alt5=6;
                }
                break;
            case 56:
                {
                alt5=7;
                }
                break;
            case 57:
                {
                alt5=8;
                }
                break;
            case 58:
                {
                alt5=9;
                }
                break;
            case 59:
                {
                alt5=10;
                }
                break;
            case 60:
                {
                alt5=11;
                }
                break;
            case 61:
                {
                alt5=12;
                }
                break;
            case 62:
                {
                alt5=13;
                }
                break;
            case 63:
                {
                alt5=14;
                }
                break;
            case 64:
                {
                alt5=15;
                }
                break;
            case 65:
                {
                alt5=16;
                }
                break;
            case 66:
                {
                alt5=17;
                }
                break;
            case 67:
                {
                alt5=18;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:326:2: kw= 'address_safety'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleFUNCTION_ATTRIBUTES803); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAddress_safetyKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:332:6: (kw= 'alignstack' kw= '(' kw= '<' this_NUMBER_4= ruleNUMBER kw= '>' kw= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:332:6: (kw= 'alignstack' kw= '(' kw= '<' this_NUMBER_4= ruleNUMBER kw= '>' kw= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:333:2: kw= 'alignstack' kw= '(' kw= '<' this_NUMBER_4= ruleNUMBER kw= '>' kw= ')'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleFUNCTION_ATTRIBUTES823); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlignstackKeyword_1_0()); 
                        
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleFUNCTION_ATTRIBUTES836); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLeftParenthesisKeyword_1_1()); 
                        
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleFUNCTION_ATTRIBUTES849); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getLessThanSignKeyword_1_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNUMBERParserRuleCall_1_3()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleFUNCTION_ATTRIBUTES871);
                    this_NUMBER_4=ruleNUMBER();

                    state._fsp--;


                    		current.merge(this_NUMBER_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleFUNCTION_ATTRIBUTES889); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getGreaterThanSignKeyword_1_4()); 
                        
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleFUNCTION_ATTRIBUTES902); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getRightParenthesisKeyword_1_5()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:375:2: kw= 'alwaysinline'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleFUNCTION_ATTRIBUTES922); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getAlwaysinlineKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:382:2: kw= 'nonlazybind'
                    {
                    kw=(Token)match(input,53,FOLLOW_53_in_ruleFUNCTION_ATTRIBUTES941); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNonlazybindKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:389:2: kw= 'inlinehint'
                    {
                    kw=(Token)match(input,54,FOLLOW_54_in_ruleFUNCTION_ATTRIBUTES960); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getInlinehintKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:396:2: kw= 'naked'
                    {
                    kw=(Token)match(input,55,FOLLOW_55_in_ruleFUNCTION_ATTRIBUTES979); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNakedKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:403:2: kw= 'noimplicitfloat'
                    {
                    kw=(Token)match(input,56,FOLLOW_56_in_ruleFUNCTION_ATTRIBUTES998); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoimplicitfloatKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:410:2: kw= 'noinline'
                    {
                    kw=(Token)match(input,57,FOLLOW_57_in_ruleFUNCTION_ATTRIBUTES1017); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoinlineKeyword_7()); 
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:417:2: kw= 'noredzone'
                    {
                    kw=(Token)match(input,58,FOLLOW_58_in_ruleFUNCTION_ATTRIBUTES1036); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoredzoneKeyword_8()); 
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:424:2: kw= 'noreturn'
                    {
                    kw=(Token)match(input,59,FOLLOW_59_in_ruleFUNCTION_ATTRIBUTES1055); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNoreturnKeyword_9()); 
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:431:2: kw= 'nounwind'
                    {
                    kw=(Token)match(input,60,FOLLOW_60_in_ruleFUNCTION_ATTRIBUTES1074); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getNounwindKeyword_10()); 
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:438:2: kw= 'optsize'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleFUNCTION_ATTRIBUTES1093); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getOptsizeKeyword_11()); 
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:445:2: kw= 'readnone'
                    {
                    kw=(Token)match(input,62,FOLLOW_62_in_ruleFUNCTION_ATTRIBUTES1112); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadnoneKeyword_12()); 
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:452:2: kw= 'readonly'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleFUNCTION_ATTRIBUTES1131); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReadonlyKeyword_13()); 
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:459:2: kw= 'returns_twice'
                    {
                    kw=(Token)match(input,64,FOLLOW_64_in_ruleFUNCTION_ATTRIBUTES1150); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getReturns_twiceKeyword_14()); 
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:466:2: kw= 'ssp'
                    {
                    kw=(Token)match(input,65,FOLLOW_65_in_ruleFUNCTION_ATTRIBUTES1169); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspKeyword_15()); 
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:473:2: kw= 'sspreq'
                    {
                    kw=(Token)match(input,66,FOLLOW_66_in_ruleFUNCTION_ATTRIBUTES1188); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getFUNCTION_ATTRIBUTESAccess().getSspreqKeyword_16()); 
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:480:2: kw= 'uwtable'
                    {
                    kw=(Token)match(input,67,FOLLOW_67_in_ruleFUNCTION_ATTRIBUTES1207); 

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


    // $ANTLR start "entryRuleKEYWORDS"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:493:1: entryRuleKEYWORDS returns [String current=null] : iv_ruleKEYWORDS= ruleKEYWORDS EOF ;
    public final String entryRuleKEYWORDS() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORDS = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:494:2: (iv_ruleKEYWORDS= ruleKEYWORDS EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:495:2: iv_ruleKEYWORDS= ruleKEYWORDS EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDSRule()); 
            pushFollow(FOLLOW_ruleKEYWORDS_in_entryRuleKEYWORDS1248);
            iv_ruleKEYWORDS=ruleKEYWORDS();

            state._fsp--;

             current =iv_ruleKEYWORDS.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleKEYWORDS1259); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleKEYWORDS"


    // $ANTLR start "ruleKEYWORDS"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:502:1: ruleKEYWORDS returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALIAS_LINKAGE_0= RULE_ALIAS_LINKAGE | this_ATOMIC_ORDERING_1= RULE_ATOMIC_ORDERING | this_BIN_OP_2= RULE_BIN_OP | this_RETURN_ATTRIBUTES_3= RULE_RETURN_ATTRIBUTES | this_CAST_OP_4= RULE_CAST_OP | this_I_PREDICATES_5= RULE_I_PREDICATES | this_VISIBILITY_6= RULE_VISIBILITY | this_LINKAGE_7= RULE_LINKAGE ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORDS() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALIAS_LINKAGE_0=null;
        Token this_ATOMIC_ORDERING_1=null;
        Token this_BIN_OP_2=null;
        Token this_RETURN_ATTRIBUTES_3=null;
        Token this_CAST_OP_4=null;
        Token this_I_PREDICATES_5=null;
        Token this_VISIBILITY_6=null;
        Token this_LINKAGE_7=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:505:28: ( (this_ALIAS_LINKAGE_0= RULE_ALIAS_LINKAGE | this_ATOMIC_ORDERING_1= RULE_ATOMIC_ORDERING | this_BIN_OP_2= RULE_BIN_OP | this_RETURN_ATTRIBUTES_3= RULE_RETURN_ATTRIBUTES | this_CAST_OP_4= RULE_CAST_OP | this_I_PREDICATES_5= RULE_I_PREDICATES | this_VISIBILITY_6= RULE_VISIBILITY | this_LINKAGE_7= RULE_LINKAGE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:506:1: (this_ALIAS_LINKAGE_0= RULE_ALIAS_LINKAGE | this_ATOMIC_ORDERING_1= RULE_ATOMIC_ORDERING | this_BIN_OP_2= RULE_BIN_OP | this_RETURN_ATTRIBUTES_3= RULE_RETURN_ATTRIBUTES | this_CAST_OP_4= RULE_CAST_OP | this_I_PREDICATES_5= RULE_I_PREDICATES | this_VISIBILITY_6= RULE_VISIBILITY | this_LINKAGE_7= RULE_LINKAGE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:506:1: (this_ALIAS_LINKAGE_0= RULE_ALIAS_LINKAGE | this_ATOMIC_ORDERING_1= RULE_ATOMIC_ORDERING | this_BIN_OP_2= RULE_BIN_OP | this_RETURN_ATTRIBUTES_3= RULE_RETURN_ATTRIBUTES | this_CAST_OP_4= RULE_CAST_OP | this_I_PREDICATES_5= RULE_I_PREDICATES | this_VISIBILITY_6= RULE_VISIBILITY | this_LINKAGE_7= RULE_LINKAGE )
            int alt6=8;
            switch ( input.LA(1) ) {
            case RULE_ALIAS_LINKAGE:
                {
                alt6=1;
                }
                break;
            case RULE_ATOMIC_ORDERING:
                {
                alt6=2;
                }
                break;
            case RULE_BIN_OP:
                {
                alt6=3;
                }
                break;
            case RULE_RETURN_ATTRIBUTES:
                {
                alt6=4;
                }
                break;
            case RULE_CAST_OP:
                {
                alt6=5;
                }
                break;
            case RULE_I_PREDICATES:
                {
                alt6=6;
                }
                break;
            case RULE_VISIBILITY:
                {
                alt6=7;
                }
                break;
            case RULE_LINKAGE:
                {
                alt6=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:506:6: this_ALIAS_LINKAGE_0= RULE_ALIAS_LINKAGE
                    {
                    this_ALIAS_LINKAGE_0=(Token)match(input,RULE_ALIAS_LINKAGE,FOLLOW_RULE_ALIAS_LINKAGE_in_ruleKEYWORDS1299); 

                    		current.merge(this_ALIAS_LINKAGE_0);
                        
                     
                        newLeafNode(this_ALIAS_LINKAGE_0, grammarAccess.getKEYWORDSAccess().getALIAS_LINKAGETerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:514:10: this_ATOMIC_ORDERING_1= RULE_ATOMIC_ORDERING
                    {
                    this_ATOMIC_ORDERING_1=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleKEYWORDS1325); 

                    		current.merge(this_ATOMIC_ORDERING_1);
                        
                     
                        newLeafNode(this_ATOMIC_ORDERING_1, grammarAccess.getKEYWORDSAccess().getATOMIC_ORDERINGTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:522:10: this_BIN_OP_2= RULE_BIN_OP
                    {
                    this_BIN_OP_2=(Token)match(input,RULE_BIN_OP,FOLLOW_RULE_BIN_OP_in_ruleKEYWORDS1351); 

                    		current.merge(this_BIN_OP_2);
                        
                     
                        newLeafNode(this_BIN_OP_2, grammarAccess.getKEYWORDSAccess().getBIN_OPTerminalRuleCall_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:530:10: this_RETURN_ATTRIBUTES_3= RULE_RETURN_ATTRIBUTES
                    {
                    this_RETURN_ATTRIBUTES_3=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleKEYWORDS1377); 

                    		current.merge(this_RETURN_ATTRIBUTES_3);
                        
                     
                        newLeafNode(this_RETURN_ATTRIBUTES_3, grammarAccess.getKEYWORDSAccess().getRETURN_ATTRIBUTESTerminalRuleCall_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:538:10: this_CAST_OP_4= RULE_CAST_OP
                    {
                    this_CAST_OP_4=(Token)match(input,RULE_CAST_OP,FOLLOW_RULE_CAST_OP_in_ruleKEYWORDS1403); 

                    		current.merge(this_CAST_OP_4);
                        
                     
                        newLeafNode(this_CAST_OP_4, grammarAccess.getKEYWORDSAccess().getCAST_OPTerminalRuleCall_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:546:10: this_I_PREDICATES_5= RULE_I_PREDICATES
                    {
                    this_I_PREDICATES_5=(Token)match(input,RULE_I_PREDICATES,FOLLOW_RULE_I_PREDICATES_in_ruleKEYWORDS1429); 

                    		current.merge(this_I_PREDICATES_5);
                        
                     
                        newLeafNode(this_I_PREDICATES_5, grammarAccess.getKEYWORDSAccess().getI_PREDICATESTerminalRuleCall_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:554:10: this_VISIBILITY_6= RULE_VISIBILITY
                    {
                    this_VISIBILITY_6=(Token)match(input,RULE_VISIBILITY,FOLLOW_RULE_VISIBILITY_in_ruleKEYWORDS1455); 

                    		current.merge(this_VISIBILITY_6);
                        
                     
                        newLeafNode(this_VISIBILITY_6, grammarAccess.getKEYWORDSAccess().getVISIBILITYTerminalRuleCall_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:562:10: this_LINKAGE_7= RULE_LINKAGE
                    {
                    this_LINKAGE_7=(Token)match(input,RULE_LINKAGE,FOLLOW_RULE_LINKAGE_in_ruleKEYWORDS1481); 

                    		current.merge(this_LINKAGE_7);
                        
                     
                        newLeafNode(this_LINKAGE_7, grammarAccess.getKEYWORDSAccess().getLINKAGETerminalRuleCall_7()); 
                        

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
    // $ANTLR end "ruleKEYWORDS"


    // $ANTLR start "entryRuleLABEL_ID"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:577:1: entryRuleLABEL_ID returns [String current=null] : iv_ruleLABEL_ID= ruleLABEL_ID EOF ;
    public final String entryRuleLABEL_ID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLABEL_ID = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:578:2: (iv_ruleLABEL_ID= ruleLABEL_ID EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:579:2: iv_ruleLABEL_ID= ruleLABEL_ID EOF
            {
             newCompositeNode(grammarAccess.getLABEL_IDRule()); 
            pushFollow(FOLLOW_ruleLABEL_ID_in_entryRuleLABEL_ID1527);
            iv_ruleLABEL_ID=ruleLABEL_ID();

            state._fsp--;

             current =iv_ruleLABEL_ID.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLABEL_ID1538); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLABEL_ID"


    // $ANTLR start "ruleLABEL_ID"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:586:1: ruleLABEL_ID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_KEYWORDS_0= ruleKEYWORDS | this_INT_TYPE_1= RULE_INT_TYPE | this_ID_2= RULE_ID | this_BOOL_3= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) (kw= '.' (this_KEYWORDS_9= ruleKEYWORDS | this_INT_TYPE_10= RULE_INT_TYPE | this_ID_11= RULE_ID | this_BOOL_12= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) )* ) ;
    public final AntlrDatatypeRuleToken ruleLABEL_ID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_TYPE_1=null;
        Token this_ID_2=null;
        Token this_BOOL_3=null;
        Token kw=null;
        Token this_INT_TYPE_10=null;
        Token this_ID_11=null;
        Token this_BOOL_12=null;
        AntlrDatatypeRuleToken this_KEYWORDS_0 = null;

        AntlrDatatypeRuleToken this_KEYWORDS_9 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:589:28: ( ( (this_KEYWORDS_0= ruleKEYWORDS | this_INT_TYPE_1= RULE_INT_TYPE | this_ID_2= RULE_ID | this_BOOL_3= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) (kw= '.' (this_KEYWORDS_9= ruleKEYWORDS | this_INT_TYPE_10= RULE_INT_TYPE | this_ID_11= RULE_ID | this_BOOL_12= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:590:1: ( (this_KEYWORDS_0= ruleKEYWORDS | this_INT_TYPE_1= RULE_INT_TYPE | this_ID_2= RULE_ID | this_BOOL_3= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) (kw= '.' (this_KEYWORDS_9= ruleKEYWORDS | this_INT_TYPE_10= RULE_INT_TYPE | this_ID_11= RULE_ID | this_BOOL_12= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:590:1: ( (this_KEYWORDS_0= ruleKEYWORDS | this_INT_TYPE_1= RULE_INT_TYPE | this_ID_2= RULE_ID | this_BOOL_3= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) (kw= '.' (this_KEYWORDS_9= ruleKEYWORDS | this_INT_TYPE_10= RULE_INT_TYPE | this_ID_11= RULE_ID | this_BOOL_12= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:590:2: (this_KEYWORDS_0= ruleKEYWORDS | this_INT_TYPE_1= RULE_INT_TYPE | this_ID_2= RULE_ID | this_BOOL_3= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) (kw= '.' (this_KEYWORDS_9= ruleKEYWORDS | this_INT_TYPE_10= RULE_INT_TYPE | this_ID_11= RULE_ID | this_BOOL_12= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:590:2: (this_KEYWORDS_0= ruleKEYWORDS | this_INT_TYPE_1= RULE_INT_TYPE | this_ID_2= RULE_ID | this_BOOL_3= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' )
            int alt7=8;
            switch ( input.LA(1) ) {
            case RULE_ALIAS_LINKAGE:
            case RULE_ATOMIC_ORDERING:
            case RULE_BIN_OP:
            case RULE_RETURN_ATTRIBUTES:
            case RULE_CAST_OP:
            case RULE_I_PREDICATES:
            case RULE_VISIBILITY:
            case RULE_LINKAGE:
                {
                alt7=1;
                }
                break;
            case RULE_INT_TYPE:
                {
                alt7=2;
                }
                break;
            case RULE_ID:
                {
                alt7=3;
                }
                break;
            case RULE_BOOL:
                {
                alt7=4;
                }
                break;
            case 68:
                {
                alt7=5;
                }
                break;
            case 69:
                {
                alt7=6;
                }
                break;
            case 70:
                {
                alt7=7;
                }
                break;
            case 71:
                {
                alt7=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:591:5: this_KEYWORDS_0= ruleKEYWORDS
                    {
                     
                            newCompositeNode(grammarAccess.getLABEL_IDAccess().getKEYWORDSParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleKEYWORDS_in_ruleLABEL_ID1586);
                    this_KEYWORDS_0=ruleKEYWORDS();

                    state._fsp--;


                    		current.merge(this_KEYWORDS_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:602:10: this_INT_TYPE_1= RULE_INT_TYPE
                    {
                    this_INT_TYPE_1=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_ruleLABEL_ID1612); 

                    		current.merge(this_INT_TYPE_1);
                        
                     
                        newLeafNode(this_INT_TYPE_1, grammarAccess.getLABEL_IDAccess().getINT_TYPETerminalRuleCall_0_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:610:10: this_ID_2= RULE_ID
                    {
                    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLABEL_ID1638); 

                    		current.merge(this_ID_2);
                        
                     
                        newLeafNode(this_ID_2, grammarAccess.getLABEL_IDAccess().getIDTerminalRuleCall_0_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:618:10: this_BOOL_3= RULE_BOOL
                    {
                    this_BOOL_3=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleLABEL_ID1664); 

                    		current.merge(this_BOOL_3);
                        
                     
                        newLeafNode(this_BOOL_3, grammarAccess.getLABEL_IDAccess().getBOOLTerminalRuleCall_0_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:627:2: kw= 'catch'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleLABEL_ID1688); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLABEL_IDAccess().getCatchKeyword_0_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:634:2: kw= 'invoke'
                    {
                    kw=(Token)match(input,69,FOLLOW_69_in_ruleLABEL_ID1707); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLABEL_IDAccess().getInvokeKeyword_0_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:641:2: kw= 'resume'
                    {
                    kw=(Token)match(input,70,FOLLOW_70_in_ruleLABEL_ID1726); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLABEL_IDAccess().getResumeKeyword_0_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:648:2: kw= 'switch'
                    {
                    kw=(Token)match(input,71,FOLLOW_71_in_ruleLABEL_ID1745); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLABEL_IDAccess().getSwitchKeyword_0_7()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:653:2: (kw= '.' (this_KEYWORDS_9= ruleKEYWORDS | this_INT_TYPE_10= RULE_INT_TYPE | this_ID_11= RULE_ID | this_BOOL_12= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:654:2: kw= '.' (this_KEYWORDS_9= ruleKEYWORDS | this_INT_TYPE_10= RULE_INT_TYPE | this_ID_11= RULE_ID | this_BOOL_12= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' )
            	    {
            	    kw=(Token)match(input,30,FOLLOW_30_in_ruleLABEL_ID1760); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getLABEL_IDAccess().getFullStopKeyword_1_0()); 
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:659:1: (this_KEYWORDS_9= ruleKEYWORDS | this_INT_TYPE_10= RULE_INT_TYPE | this_ID_11= RULE_ID | this_BOOL_12= RULE_BOOL | kw= 'catch' | kw= 'invoke' | kw= 'resume' | kw= 'switch' )
            	    int alt8=8;
            	    switch ( input.LA(1) ) {
            	    case RULE_ALIAS_LINKAGE:
            	    case RULE_ATOMIC_ORDERING:
            	    case RULE_BIN_OP:
            	    case RULE_RETURN_ATTRIBUTES:
            	    case RULE_CAST_OP:
            	    case RULE_I_PREDICATES:
            	    case RULE_VISIBILITY:
            	    case RULE_LINKAGE:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case RULE_INT_TYPE:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case RULE_ID:
            	        {
            	        alt8=3;
            	        }
            	        break;
            	    case RULE_BOOL:
            	        {
            	        alt8=4;
            	        }
            	        break;
            	    case 68:
            	        {
            	        alt8=5;
            	        }
            	        break;
            	    case 69:
            	        {
            	        alt8=6;
            	        }
            	        break;
            	    case 70:
            	        {
            	        alt8=7;
            	        }
            	        break;
            	    case 71:
            	        {
            	        alt8=8;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 8, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt8) {
            	        case 1 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:660:5: this_KEYWORDS_9= ruleKEYWORDS
            	            {
            	             
            	                    newCompositeNode(grammarAccess.getLABEL_IDAccess().getKEYWORDSParserRuleCall_1_1_0()); 
            	                
            	            pushFollow(FOLLOW_ruleKEYWORDS_in_ruleLABEL_ID1783);
            	            this_KEYWORDS_9=ruleKEYWORDS();

            	            state._fsp--;


            	            		current.merge(this_KEYWORDS_9);
            	                
            	             
            	                    afterParserOrEnumRuleCall();
            	                

            	            }
            	            break;
            	        case 2 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:671:10: this_INT_TYPE_10= RULE_INT_TYPE
            	            {
            	            this_INT_TYPE_10=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_ruleLABEL_ID1809); 

            	            		current.merge(this_INT_TYPE_10);
            	                
            	             
            	                newLeafNode(this_INT_TYPE_10, grammarAccess.getLABEL_IDAccess().getINT_TYPETerminalRuleCall_1_1_1()); 
            	                

            	            }
            	            break;
            	        case 3 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:679:10: this_ID_11= RULE_ID
            	            {
            	            this_ID_11=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleLABEL_ID1835); 

            	            		current.merge(this_ID_11);
            	                
            	             
            	                newLeafNode(this_ID_11, grammarAccess.getLABEL_IDAccess().getIDTerminalRuleCall_1_1_2()); 
            	                

            	            }
            	            break;
            	        case 4 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:687:10: this_BOOL_12= RULE_BOOL
            	            {
            	            this_BOOL_12=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleLABEL_ID1861); 

            	            		current.merge(this_BOOL_12);
            	                
            	             
            	                newLeafNode(this_BOOL_12, grammarAccess.getLABEL_IDAccess().getBOOLTerminalRuleCall_1_1_3()); 
            	                

            	            }
            	            break;
            	        case 5 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:696:2: kw= 'catch'
            	            {
            	            kw=(Token)match(input,68,FOLLOW_68_in_ruleLABEL_ID1885); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getLABEL_IDAccess().getCatchKeyword_1_1_4()); 
            	                

            	            }
            	            break;
            	        case 6 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:703:2: kw= 'invoke'
            	            {
            	            kw=(Token)match(input,69,FOLLOW_69_in_ruleLABEL_ID1904); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getLABEL_IDAccess().getInvokeKeyword_1_1_5()); 
            	                

            	            }
            	            break;
            	        case 7 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:710:2: kw= 'resume'
            	            {
            	            kw=(Token)match(input,70,FOLLOW_70_in_ruleLABEL_ID1923); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getLABEL_IDAccess().getResumeKeyword_1_1_6()); 
            	                

            	            }
            	            break;
            	        case 8 :
            	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:717:2: kw= 'switch'
            	            {
            	            kw=(Token)match(input,71,FOLLOW_71_in_ruleLABEL_ID1942); 

            	                    current.merge(kw);
            	                    newLeafNode(kw, grammarAccess.getLABEL_IDAccess().getSwitchKeyword_1_1_7()); 
            	                

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleLABEL_ID"


    // $ANTLR start "entryRuleAbstractElement"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:730:1: entryRuleAbstractElement returns [EObject current=null] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final EObject entryRuleAbstractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:731:2: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:732:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             newCompositeNode(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement1985);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractElement1995); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:739:1: ruleAbstractElement returns [EObject current=null] : ( (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? ) ) ;
    public final EObject ruleAbstractElement() throws RecognitionException {
        EObject current = null;

        Token this_SL_COMMENT_1=null;
        Token this_SL_COMMENT_3=null;
        EObject this_TopLevelEntity_0 = null;

        EObject this_MainLevelEntity_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:742:28: ( ( (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:743:1: ( (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:743:1: ( (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? ) | (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==72||LA12_0==74||LA12_0==78) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_VALID_ID||LA12_0==RULE_METADATA||LA12_0==88||LA12_0==90) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:743:2: (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:743:2: (this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:744:5: this_TopLevelEntity_0= ruleTopLevelEntity (this_SL_COMMENT_1= RULE_SL_COMMENT )?
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getTopLevelEntityParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement2043);
                    this_TopLevelEntity_0=ruleTopLevelEntity();

                    state._fsp--;

                     
                            current = this_TopLevelEntity_0; 
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:752:1: (this_SL_COMMENT_1= RULE_SL_COMMENT )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_SL_COMMENT) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:752:2: this_SL_COMMENT_1= RULE_SL_COMMENT
                            {
                            this_SL_COMMENT_1=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement2054); 
                             
                                newLeafNode(this_SL_COMMENT_1, grammarAccess.getAbstractElementAccess().getSL_COMMENTTerminalRuleCall_0_1()); 
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:757:6: (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:757:6: (this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:758:5: this_MainLevelEntity_2= ruleMainLevelEntity (this_SL_COMMENT_3= RULE_SL_COMMENT )?
                    {
                     
                            newCompositeNode(grammarAccess.getAbstractElementAccess().getMainLevelEntityParserRuleCall_1_0()); 
                        
                    pushFollow(FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement2085);
                    this_MainLevelEntity_2=ruleMainLevelEntity();

                    state._fsp--;

                     
                            current = this_MainLevelEntity_2; 
                            afterParserOrEnumRuleCall();
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:766:1: (this_SL_COMMENT_3= RULE_SL_COMMENT )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_SL_COMMENT) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:766:2: this_SL_COMMENT_3= RULE_SL_COMMENT
                            {
                            this_SL_COMMENT_3=(Token)match(input,RULE_SL_COMMENT,FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement2096); 
                             
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:778:1: entryRuleTopLevelEntity returns [EObject current=null] : iv_ruleTopLevelEntity= ruleTopLevelEntity EOF ;
    public final EObject entryRuleTopLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopLevelEntity = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:779:2: (iv_ruleTopLevelEntity= ruleTopLevelEntity EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:780:2: iv_ruleTopLevelEntity= ruleTopLevelEntity EOF
            {
             newCompositeNode(grammarAccess.getTopLevelEntityRule()); 
            pushFollow(FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity2134);
            iv_ruleTopLevelEntity=ruleTopLevelEntity();

            state._fsp--;

             current =iv_ruleTopLevelEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTopLevelEntity2144); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:787:1: ruleTopLevelEntity returns [EObject current=null] : ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:790:28: ( ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:791:1: ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:791:1: ( (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) ) | (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) ) | (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt15=1;
                }
                break;
            case 74:
                {
                alt15=2;
                }
                break;
            case 78:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:791:2: (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:791:2: (otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:791:4: otherlv_0= 'module' otherlv_1= 'asm' ( (lv_module_2_0= RULE_STRING ) )
                    {
                    otherlv_0=(Token)match(input,72,FOLLOW_72_in_ruleTopLevelEntity2182); 

                        	newLeafNode(otherlv_0, grammarAccess.getTopLevelEntityAccess().getModuleKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleTopLevelEntity2194); 

                        	newLeafNode(otherlv_1, grammarAccess.getTopLevelEntityAccess().getAsmKeyword_0_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:799:1: ( (lv_module_2_0= RULE_STRING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:800:1: (lv_module_2_0= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:800:1: (lv_module_2_0= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:801:3: lv_module_2_0= RULE_STRING
                    {
                    lv_module_2_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity2211); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:818:6: (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:818:6: (otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:818:8: otherlv_3= 'target' (otherlv_4= 'datalayout' | otherlv_5= 'triple' ) otherlv_6= '=' ( (lv_target_7_0= RULE_STRING ) )
                    {
                    otherlv_3=(Token)match(input,74,FOLLOW_74_in_ruleTopLevelEntity2236); 

                        	newLeafNode(otherlv_3, grammarAccess.getTopLevelEntityAccess().getTargetKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:822:1: (otherlv_4= 'datalayout' | otherlv_5= 'triple' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==75) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==76) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:822:3: otherlv_4= 'datalayout'
                            {
                            otherlv_4=(Token)match(input,75,FOLLOW_75_in_ruleTopLevelEntity2249); 

                                	newLeafNode(otherlv_4, grammarAccess.getTopLevelEntityAccess().getDatalayoutKeyword_1_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:827:7: otherlv_5= 'triple'
                            {
                            otherlv_5=(Token)match(input,76,FOLLOW_76_in_ruleTopLevelEntity2267); 

                                	newLeafNode(otherlv_5, grammarAccess.getTopLevelEntityAccess().getTripleKeyword_1_1_1());
                                

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,77,FOLLOW_77_in_ruleTopLevelEntity2280); 

                        	newLeafNode(otherlv_6, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:835:1: ( (lv_target_7_0= RULE_STRING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:836:1: (lv_target_7_0= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:836:1: (lv_target_7_0= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:837:3: lv_target_7_0= RULE_STRING
                    {
                    lv_target_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity2297); 

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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:854:6: (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:854:6: (otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:854:8: otherlv_8= 'deplibs' otherlv_9= '=' otherlv_10= '[' ( (lv_libs_11_0= RULE_STRING ) ) (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )* otherlv_14= ']'
                    {
                    otherlv_8=(Token)match(input,78,FOLLOW_78_in_ruleTopLevelEntity2322); 

                        	newLeafNode(otherlv_8, grammarAccess.getTopLevelEntityAccess().getDeplibsKeyword_2_0());
                        
                    otherlv_9=(Token)match(input,77,FOLLOW_77_in_ruleTopLevelEntity2334); 

                        	newLeafNode(otherlv_9, grammarAccess.getTopLevelEntityAccess().getEqualsSignKeyword_2_1());
                        
                    otherlv_10=(Token)match(input,79,FOLLOW_79_in_ruleTopLevelEntity2346); 

                        	newLeafNode(otherlv_10, grammarAccess.getTopLevelEntityAccess().getLeftSquareBracketKeyword_2_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:866:1: ( (lv_libs_11_0= RULE_STRING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:867:1: (lv_libs_11_0= RULE_STRING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:867:1: (lv_libs_11_0= RULE_STRING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:868:3: lv_libs_11_0= RULE_STRING
                    {
                    lv_libs_11_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity2363); 

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

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:884:2: (otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==80) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:884:4: otherlv_12= ',' ( (lv_libs_13_0= RULE_STRING ) )
                    	    {
                    	    otherlv_12=(Token)match(input,80,FOLLOW_80_in_ruleTopLevelEntity2381); 

                    	        	newLeafNode(otherlv_12, grammarAccess.getTopLevelEntityAccess().getCommaKeyword_2_4_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:888:1: ( (lv_libs_13_0= RULE_STRING ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:889:1: (lv_libs_13_0= RULE_STRING )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:889:1: (lv_libs_13_0= RULE_STRING )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:890:3: lv_libs_13_0= RULE_STRING
                    	    {
                    	    lv_libs_13_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTopLevelEntity2398); 

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
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,81,FOLLOW_81_in_ruleTopLevelEntity2417); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:918:1: entryRuleMainLevelEntity returns [EObject current=null] : iv_ruleMainLevelEntity= ruleMainLevelEntity EOF ;
    public final EObject entryRuleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMainLevelEntity = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:919:2: (iv_ruleMainLevelEntity= ruleMainLevelEntity EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:920:2: iv_ruleMainLevelEntity= ruleMainLevelEntity EOF
            {
             newCompositeNode(grammarAccess.getMainLevelEntityRule()); 
            pushFollow(FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity2454);
            iv_ruleMainLevelEntity=ruleMainLevelEntity();

            state._fsp--;

             current =iv_ruleMainLevelEntity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMainLevelEntity2464); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:927:1: ruleMainLevelEntity returns [EObject current=null] : (this_TypeDefinition_0= ruleTypeDefinition | this_GlobalDefinition_1= ruleGlobalDefinition | this_FunctionDefinition_2= ruleFunctionDefinition | this_AliasDefinition_3= ruleAliasDefinition | this_MetadataValue_4= ruleMetadataValue ) ;
    public final EObject ruleMainLevelEntity() throws RecognitionException {
        EObject current = null;

        EObject this_TypeDefinition_0 = null;

        EObject this_GlobalDefinition_1 = null;

        EObject this_FunctionDefinition_2 = null;

        EObject this_AliasDefinition_3 = null;

        EObject this_MetadataValue_4 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:930:28: ( (this_TypeDefinition_0= ruleTypeDefinition | this_GlobalDefinition_1= ruleGlobalDefinition | this_FunctionDefinition_2= ruleFunctionDefinition | this_AliasDefinition_3= ruleAliasDefinition | this_MetadataValue_4= ruleMetadataValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:931:1: (this_TypeDefinition_0= ruleTypeDefinition | this_GlobalDefinition_1= ruleGlobalDefinition | this_FunctionDefinition_2= ruleFunctionDefinition | this_AliasDefinition_3= ruleAliasDefinition | this_MetadataValue_4= ruleMetadataValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:931:1: (this_TypeDefinition_0= ruleTypeDefinition | this_GlobalDefinition_1= ruleGlobalDefinition | this_FunctionDefinition_2= ruleFunctionDefinition | this_AliasDefinition_3= ruleAliasDefinition | this_MetadataValue_4= ruleMetadataValue )
            int alt16=5;
            switch ( input.LA(1) ) {
            case RULE_VALID_ID:
                {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==77) ) {
                    switch ( input.LA(3) ) {
                    case 91:
                        {
                        alt16=4;
                        }
                        break;
                    case 82:
                        {
                        alt16=1;
                        }
                        break;
                    case RULE_ALIAS_LINKAGE:
                    case RULE_LINKAGE:
                    case RULE_INT_TYPE:
                    case RULE_VALID_ID:
                    case RULE_PRIMITIVE_VALUE:
                    case RULE_FLOATING_POINT_TYPE:
                    case 46:
                    case 79:
                    case 84:
                    case 85:
                    case 86:
                    case 93:
                    case 94:
                        {
                        alt16=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 4, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
                }
                break;
            case 88:
            case 90:
                {
                alt16=3;
                }
                break;
            case RULE_METADATA:
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
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:932:5: this_TypeDefinition_0= ruleTypeDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getTypeDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTypeDefinition_in_ruleMainLevelEntity2511);
                    this_TypeDefinition_0=ruleTypeDefinition();

                    state._fsp--;

                     
                            current = this_TypeDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:942:5: this_GlobalDefinition_1= ruleGlobalDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getGlobalDefinitionParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGlobalDefinition_in_ruleMainLevelEntity2538);
                    this_GlobalDefinition_1=ruleGlobalDefinition();

                    state._fsp--;

                     
                            current = this_GlobalDefinition_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:952:5: this_FunctionDefinition_2= ruleFunctionDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getFunctionDefinitionParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleFunctionDefinition_in_ruleMainLevelEntity2565);
                    this_FunctionDefinition_2=ruleFunctionDefinition();

                    state._fsp--;

                     
                            current = this_FunctionDefinition_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:962:5: this_AliasDefinition_3= ruleAliasDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getAliasDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAliasDefinition_in_ruleMainLevelEntity2592);
                    this_AliasDefinition_3=ruleAliasDefinition();

                    state._fsp--;

                     
                            current = this_AliasDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:972:5: this_MetadataValue_4= ruleMetadataValue
                    {
                     
                            newCompositeNode(grammarAccess.getMainLevelEntityAccess().getMetadataValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleMetadataValue_in_ruleMainLevelEntity2619);
                    this_MetadataValue_4=ruleMetadataValue();

                    state._fsp--;

                     
                            current = this_MetadataValue_4; 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:988:1: entryRuleTypeDefinition returns [EObject current=null] : iv_ruleTypeDefinition= ruleTypeDefinition EOF ;
    public final EObject entryRuleTypeDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDefinition = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:989:2: (iv_ruleTypeDefinition= ruleTypeDefinition EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:990:2: iv_ruleTypeDefinition= ruleTypeDefinition EOF
            {
             newCompositeNode(grammarAccess.getTypeDefinitionRule()); 
            pushFollow(FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition2654);
            iv_ruleTypeDefinition=ruleTypeDefinition();

            state._fsp--;

             current =iv_ruleTypeDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeDefinition2664); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:997:1: ruleTypeDefinition returns [EObject current=null] : ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (otherlv_2= 'type' ( ( (lv_struct_3_0= ruleStructure ) ) | otherlv_4= 'opaque' ) ) ) ;
    public final EObject ruleTypeDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_address_0_0 = null;

        EObject lv_struct_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1000:28: ( ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (otherlv_2= 'type' ( ( (lv_struct_3_0= ruleStructure ) ) | otherlv_4= 'opaque' ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1001:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (otherlv_2= 'type' ( ( (lv_struct_3_0= ruleStructure ) ) | otherlv_4= 'opaque' ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1001:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (otherlv_2= 'type' ( ( (lv_struct_3_0= ruleStructure ) ) | otherlv_4= 'opaque' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1001:2: ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (otherlv_2= 'type' ( ( (lv_struct_3_0= ruleStructure ) ) | otherlv_4= 'opaque' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1001:2: ( (lv_address_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1002:1: (lv_address_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1002:1: (lv_address_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1003:3: lv_address_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getAddressAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleTypeDefinition2710);
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

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleTypeDefinition2722); 

                	newLeafNode(otherlv_1, grammarAccess.getTypeDefinitionAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1023:1: (otherlv_2= 'type' ( ( (lv_struct_3_0= ruleStructure ) ) | otherlv_4= 'opaque' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1023:3: otherlv_2= 'type' ( ( (lv_struct_3_0= ruleStructure ) ) | otherlv_4= 'opaque' )
            {
            otherlv_2=(Token)match(input,82,FOLLOW_82_in_ruleTypeDefinition2735); 

                	newLeafNode(otherlv_2, grammarAccess.getTypeDefinitionAccess().getTypeKeyword_2_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1027:1: ( ( (lv_struct_3_0= ruleStructure ) ) | otherlv_4= 'opaque' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==94) ) {
                alt17=1;
            }
            else if ( (LA17_0==83) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1027:2: ( (lv_struct_3_0= ruleStructure ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1027:2: ( (lv_struct_3_0= ruleStructure ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1028:1: (lv_struct_3_0= ruleStructure )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1028:1: (lv_struct_3_0= ruleStructure )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1029:3: lv_struct_3_0= ruleStructure
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeDefinitionAccess().getStructStructureParserRuleCall_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleStructure_in_ruleTypeDefinition2757);
                    lv_struct_3_0=ruleStructure();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"struct",
                            		lv_struct_3_0, 
                            		"Structure");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1046:7: otherlv_4= 'opaque'
                    {
                    otherlv_4=(Token)match(input,83,FOLLOW_83_in_ruleTypeDefinition2775); 

                        	newLeafNode(otherlv_4, grammarAccess.getTypeDefinitionAccess().getOpaqueKeyword_2_1_1());
                        

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


    // $ANTLR start "entryRuleGlobalDefinition"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1058:1: entryRuleGlobalDefinition returns [EObject current=null] : iv_ruleGlobalDefinition= ruleGlobalDefinition EOF ;
    public final EObject entryRuleGlobalDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalDefinition = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1059:2: (iv_ruleGlobalDefinition= ruleGlobalDefinition EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1060:2: iv_ruleGlobalDefinition= ruleGlobalDefinition EOF
            {
             newCompositeNode(grammarAccess.getGlobalDefinitionRule()); 
            pushFollow(FOLLOW_ruleGlobalDefinition_in_entryRuleGlobalDefinition2813);
            iv_ruleGlobalDefinition=ruleGlobalDefinition();

            state._fsp--;

             current =iv_ruleGlobalDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGlobalDefinition2823); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGlobalDefinition"


    // $ANTLR start "ruleGlobalDefinition"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1067:1: ruleGlobalDefinition returns [EObject current=null] : ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (this_LINKAGE_2= RULE_LINKAGE | this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE | otherlv_4= 'global' | otherlv_5= 'unnamed_addr' | otherlv_6= 'constant' )* ( (lv_value_7_0= ruleParameter ) ) (otherlv_8= ',' otherlv_9= 'align' ( (lv_align_10_0= ruleNUMBER ) ) )? ) ;
    public final EObject ruleGlobalDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_LINKAGE_2=null;
        Token this_ALIAS_LINKAGE_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_address_0_0 = null;

        EObject lv_value_7_0 = null;

        AntlrDatatypeRuleToken lv_align_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1070:28: ( ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (this_LINKAGE_2= RULE_LINKAGE | this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE | otherlv_4= 'global' | otherlv_5= 'unnamed_addr' | otherlv_6= 'constant' )* ( (lv_value_7_0= ruleParameter ) ) (otherlv_8= ',' otherlv_9= 'align' ( (lv_align_10_0= ruleNUMBER ) ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1071:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (this_LINKAGE_2= RULE_LINKAGE | this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE | otherlv_4= 'global' | otherlv_5= 'unnamed_addr' | otherlv_6= 'constant' )* ( (lv_value_7_0= ruleParameter ) ) (otherlv_8= ',' otherlv_9= 'align' ( (lv_align_10_0= ruleNUMBER ) ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1071:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (this_LINKAGE_2= RULE_LINKAGE | this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE | otherlv_4= 'global' | otherlv_5= 'unnamed_addr' | otherlv_6= 'constant' )* ( (lv_value_7_0= ruleParameter ) ) (otherlv_8= ',' otherlv_9= 'align' ( (lv_align_10_0= ruleNUMBER ) ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1071:2: ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' (this_LINKAGE_2= RULE_LINKAGE | this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE | otherlv_4= 'global' | otherlv_5= 'unnamed_addr' | otherlv_6= 'constant' )* ( (lv_value_7_0= ruleParameter ) ) (otherlv_8= ',' otherlv_9= 'align' ( (lv_align_10_0= ruleNUMBER ) ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1071:2: ( (lv_address_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1072:1: (lv_address_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1072:1: (lv_address_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1073:3: lv_address_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getGlobalDefinitionAccess().getAddressAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleGlobalDefinition2869);
            lv_address_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlobalDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"address",
                    		lv_address_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleGlobalDefinition2881); 

                	newLeafNode(otherlv_1, grammarAccess.getGlobalDefinitionAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1093:1: (this_LINKAGE_2= RULE_LINKAGE | this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE | otherlv_4= 'global' | otherlv_5= 'unnamed_addr' | otherlv_6= 'constant' )*
            loop18:
            do {
                int alt18=6;
                switch ( input.LA(1) ) {
                case RULE_LINKAGE:
                    {
                    alt18=1;
                    }
                    break;
                case RULE_ALIAS_LINKAGE:
                    {
                    alt18=2;
                    }
                    break;
                case 84:
                    {
                    alt18=3;
                    }
                    break;
                case 85:
                    {
                    alt18=4;
                    }
                    break;
                case 86:
                    {
                    alt18=5;
                    }
                    break;

                }

                switch (alt18) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1093:2: this_LINKAGE_2= RULE_LINKAGE
            	    {
            	    this_LINKAGE_2=(Token)match(input,RULE_LINKAGE,FOLLOW_RULE_LINKAGE_in_ruleGlobalDefinition2893); 
            	     
            	        newLeafNode(this_LINKAGE_2, grammarAccess.getGlobalDefinitionAccess().getLINKAGETerminalRuleCall_2_0()); 
            	        

            	    }
            	    break;
            	case 2 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1098:6: this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE
            	    {
            	    this_ALIAS_LINKAGE_3=(Token)match(input,RULE_ALIAS_LINKAGE,FOLLOW_RULE_ALIAS_LINKAGE_in_ruleGlobalDefinition2909); 
            	     
            	        newLeafNode(this_ALIAS_LINKAGE_3, grammarAccess.getGlobalDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;
            	case 3 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1103:7: otherlv_4= 'global'
            	    {
            	    otherlv_4=(Token)match(input,84,FOLLOW_84_in_ruleGlobalDefinition2926); 

            	        	newLeafNode(otherlv_4, grammarAccess.getGlobalDefinitionAccess().getGlobalKeyword_2_2());
            	        

            	    }
            	    break;
            	case 4 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1108:7: otherlv_5= 'unnamed_addr'
            	    {
            	    otherlv_5=(Token)match(input,85,FOLLOW_85_in_ruleGlobalDefinition2944); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGlobalDefinitionAccess().getUnnamed_addrKeyword_2_3());
            	        

            	    }
            	    break;
            	case 5 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1113:7: otherlv_6= 'constant'
            	    {
            	    otherlv_6=(Token)match(input,86,FOLLOW_86_in_ruleGlobalDefinition2962); 

            	        	newLeafNode(otherlv_6, grammarAccess.getGlobalDefinitionAccess().getConstantKeyword_2_4());
            	        

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1117:3: ( (lv_value_7_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1118:1: (lv_value_7_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1118:1: (lv_value_7_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1119:3: lv_value_7_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getGlobalDefinitionAccess().getValueParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleGlobalDefinition2985);
            lv_value_7_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGlobalDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_7_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1135:2: (otherlv_8= ',' otherlv_9= 'align' ( (lv_align_10_0= ruleNUMBER ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==80) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1135:4: otherlv_8= ',' otherlv_9= 'align' ( (lv_align_10_0= ruleNUMBER ) )
                    {
                    otherlv_8=(Token)match(input,80,FOLLOW_80_in_ruleGlobalDefinition2998); 

                        	newLeafNode(otherlv_8, grammarAccess.getGlobalDefinitionAccess().getCommaKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,87,FOLLOW_87_in_ruleGlobalDefinition3010); 

                        	newLeafNode(otherlv_9, grammarAccess.getGlobalDefinitionAccess().getAlignKeyword_4_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1143:1: ( (lv_align_10_0= ruleNUMBER ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1144:1: (lv_align_10_0= ruleNUMBER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1144:1: (lv_align_10_0= ruleNUMBER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1145:3: lv_align_10_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getGlobalDefinitionAccess().getAlignNUMBERParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleGlobalDefinition3031);
                    lv_align_10_0=ruleNUMBER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGlobalDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"align",
                            		lv_align_10_0, 
                            		"NUMBER");
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
    // $ANTLR end "ruleGlobalDefinition"


    // $ANTLR start "entryRuleFunctionDefinition"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1169:1: entryRuleFunctionDefinition returns [EObject current=null] : iv_ruleFunctionDefinition= ruleFunctionDefinition EOF ;
    public final EObject entryRuleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionDefinition = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1170:2: (iv_ruleFunctionDefinition= ruleFunctionDefinition EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1171:2: iv_ruleFunctionDefinition= ruleFunctionDefinition EOF
            {
             newCompositeNode(grammarAccess.getFunctionDefinitionRule()); 
            pushFollow(FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition3069);
            iv_ruleFunctionDefinition=ruleFunctionDefinition();

            state._fsp--;

             current =iv_ruleFunctionDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionDefinition3079); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1178:1: ruleFunctionDefinition returns [EObject current=null] : ( (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) ( (lv_parameter_8_0= ruleFunctionParameterList ) ) (otherlv_9= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? (otherlv_13= 'align' ( (lv_align_14_0= ruleNUMBER ) ) )? ( (lv_body_15_0= ruleFunctionBody ) ) ) | (otherlv_16= 'declare' (this_LINKAGE_17= RULE_LINKAGE | this_ALIAS_LINKAGE_18= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_19= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_21= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_22_0= ruleTypeUse ) ) ( (lv_address_23_0= ruleAddress ) ) ( (lv_parameter_24_0= ruleFunctionParameterList ) ) (otherlv_25= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_27= 'section ' this_STRING_28= RULE_STRING )? (otherlv_29= 'align' ( (lv_align_30_0= ruleNUMBER ) ) )? ) ) ;
    public final EObject ruleFunctionDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LINKAGE_1=null;
        Token this_ALIAS_LINKAGE_2=null;
        Token this_VISIBILITY_3=null;
        Token this_RETURN_ATTRIBUTES_5=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_STRING_12=null;
        Token otherlv_13=null;
        Token otherlv_16=null;
        Token this_LINKAGE_17=null;
        Token this_ALIAS_LINKAGE_18=null;
        Token this_VISIBILITY_19=null;
        Token this_RETURN_ATTRIBUTES_21=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token this_STRING_28=null;
        Token otherlv_29=null;
        EObject lv_returnType_6_0 = null;

        EObject lv_address_7_0 = null;

        EObject lv_parameter_8_0 = null;

        AntlrDatatypeRuleToken lv_align_14_0 = null;

        EObject lv_body_15_0 = null;

        EObject lv_returnType_22_0 = null;

        EObject lv_address_23_0 = null;

        EObject lv_parameter_24_0 = null;

        AntlrDatatypeRuleToken lv_align_30_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1181:28: ( ( (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) ( (lv_parameter_8_0= ruleFunctionParameterList ) ) (otherlv_9= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? (otherlv_13= 'align' ( (lv_align_14_0= ruleNUMBER ) ) )? ( (lv_body_15_0= ruleFunctionBody ) ) ) | (otherlv_16= 'declare' (this_LINKAGE_17= RULE_LINKAGE | this_ALIAS_LINKAGE_18= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_19= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_21= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_22_0= ruleTypeUse ) ) ( (lv_address_23_0= ruleAddress ) ) ( (lv_parameter_24_0= ruleFunctionParameterList ) ) (otherlv_25= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_27= 'section ' this_STRING_28= RULE_STRING )? (otherlv_29= 'align' ( (lv_align_30_0= ruleNUMBER ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:1: ( (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) ( (lv_parameter_8_0= ruleFunctionParameterList ) ) (otherlv_9= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? (otherlv_13= 'align' ( (lv_align_14_0= ruleNUMBER ) ) )? ( (lv_body_15_0= ruleFunctionBody ) ) ) | (otherlv_16= 'declare' (this_LINKAGE_17= RULE_LINKAGE | this_ALIAS_LINKAGE_18= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_19= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_21= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_22_0= ruleTypeUse ) ) ( (lv_address_23_0= ruleAddress ) ) ( (lv_parameter_24_0= ruleFunctionParameterList ) ) (otherlv_25= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_27= 'section ' this_STRING_28= RULE_STRING )? (otherlv_29= 'align' ( (lv_align_30_0= ruleNUMBER ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:1: ( (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) ( (lv_parameter_8_0= ruleFunctionParameterList ) ) (otherlv_9= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? (otherlv_13= 'align' ( (lv_align_14_0= ruleNUMBER ) ) )? ( (lv_body_15_0= ruleFunctionBody ) ) ) | (otherlv_16= 'declare' (this_LINKAGE_17= RULE_LINKAGE | this_ALIAS_LINKAGE_18= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_19= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_21= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_22_0= ruleTypeUse ) ) ( (lv_address_23_0= ruleAddress ) ) ( (lv_parameter_24_0= ruleFunctionParameterList ) ) (otherlv_25= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_27= 'section ' this_STRING_28= RULE_STRING )? (otherlv_29= 'align' ( (lv_align_30_0= ruleNUMBER ) ) )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==88) ) {
                alt36=1;
            }
            else if ( (LA36_0==90) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:2: (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) ( (lv_parameter_8_0= ruleFunctionParameterList ) ) (otherlv_9= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? (otherlv_13= 'align' ( (lv_align_14_0= ruleNUMBER ) ) )? ( (lv_body_15_0= ruleFunctionBody ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:2: (otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) ( (lv_parameter_8_0= ruleFunctionParameterList ) ) (otherlv_9= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? (otherlv_13= 'align' ( (lv_align_14_0= ruleNUMBER ) ) )? ( (lv_body_15_0= ruleFunctionBody ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1182:4: otherlv_0= 'define' (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_3= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_6_0= ruleTypeUse ) ) ( (lv_address_7_0= ruleAddress ) ) ( (lv_parameter_8_0= ruleFunctionParameterList ) ) (otherlv_9= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_11= 'section ' this_STRING_12= RULE_STRING )? (otherlv_13= 'align' ( (lv_align_14_0= ruleNUMBER ) ) )? ( (lv_body_15_0= ruleFunctionBody ) )
                    {
                    otherlv_0=(Token)match(input,88,FOLLOW_88_in_ruleFunctionDefinition3117); 

                        	newLeafNode(otherlv_0, grammarAccess.getFunctionDefinitionAccess().getDefineKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1186:1: (this_LINKAGE_1= RULE_LINKAGE | this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE )?
                    int alt20=3;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==RULE_LINKAGE) ) {
                        alt20=1;
                    }
                    else if ( (LA20_0==RULE_ALIAS_LINKAGE) ) {
                        alt20=2;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1186:2: this_LINKAGE_1= RULE_LINKAGE
                            {
                            this_LINKAGE_1=(Token)match(input,RULE_LINKAGE,FOLLOW_RULE_LINKAGE_in_ruleFunctionDefinition3129); 
                             
                                newLeafNode(this_LINKAGE_1, grammarAccess.getFunctionDefinitionAccess().getLINKAGETerminalRuleCall_0_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1191:6: this_ALIAS_LINKAGE_2= RULE_ALIAS_LINKAGE
                            {
                            this_ALIAS_LINKAGE_2=(Token)match(input,RULE_ALIAS_LINKAGE,FOLLOW_RULE_ALIAS_LINKAGE_in_ruleFunctionDefinition3145); 
                             
                                newLeafNode(this_ALIAS_LINKAGE_2, grammarAccess.getFunctionDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_0_1_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1195:3: (this_VISIBILITY_3= RULE_VISIBILITY )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==RULE_VISIBILITY) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1195:4: this_VISIBILITY_3= RULE_VISIBILITY
                            {
                            this_VISIBILITY_3=(Token)match(input,RULE_VISIBILITY,FOLLOW_RULE_VISIBILITY_in_ruleFunctionDefinition3158); 
                             
                                newLeafNode(this_VISIBILITY_3, grammarAccess.getFunctionDefinitionAccess().getVISIBILITYTerminalRuleCall_0_2()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1199:3: ( ruleCallingConv )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( ((LA22_0>=31 && LA22_0<=45)) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1200:5: ruleCallingConv
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_0_3()); 
                                
                            pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionDefinition3176);
                            ruleCallingConv();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1207:3: (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_RETURN_ATTRIBUTES) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1207:4: this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES
                            {
                            this_RETURN_ATTRIBUTES_5=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionDefinition3189); 
                             
                                newLeafNode(this_RETURN_ATTRIBUTES_5, grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESTerminalRuleCall_0_4()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1211:3: ( (lv_returnType_6_0= ruleTypeUse ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1212:1: (lv_returnType_6_0= ruleTypeUse )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1212:1: (lv_returnType_6_0= ruleTypeUse )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1213:3: lv_returnType_6_0= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeUseParserRuleCall_0_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleFunctionDefinition3211);
                    lv_returnType_6_0=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_6_0, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1229:2: ( (lv_address_7_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1230:1: (lv_address_7_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1230:1: (lv_address_7_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1231:3: lv_address_7_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAddressAddressParserRuleCall_0_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleFunctionDefinition3232);
                    lv_address_7_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_7_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1247:2: ( (lv_parameter_8_0= ruleFunctionParameterList ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1248:1: (lv_parameter_8_0= ruleFunctionParameterList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1248:1: (lv_parameter_8_0= ruleFunctionParameterList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1249:3: lv_parameter_8_0= ruleFunctionParameterList
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParameterFunctionParameterListParserRuleCall_0_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterList_in_ruleFunctionDefinition3253);
                    lv_parameter_8_0=ruleFunctionParameterList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameter",
                            		lv_parameter_8_0, 
                            		"FunctionParameterList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1265:2: (otherlv_9= 'unnamed_addr' )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==85) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1265:4: otherlv_9= 'unnamed_addr'
                            {
                            otherlv_9=(Token)match(input,85,FOLLOW_85_in_ruleFunctionDefinition3266); 

                                	newLeafNode(otherlv_9, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_0_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1269:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( ((LA25_0>=48 && LA25_0<=49)||(LA25_0>=52 && LA25_0<=67)) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1270:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_0_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition3285);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1277:3: (otherlv_11= 'section ' this_STRING_12= RULE_STRING )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==89) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1277:5: otherlv_11= 'section ' this_STRING_12= RULE_STRING
                            {
                            otherlv_11=(Token)match(input,89,FOLLOW_89_in_ruleFunctionDefinition3299); 

                                	newLeafNode(otherlv_11, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_0_10_0());
                                
                            this_STRING_12=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionDefinition3310); 
                             
                                newLeafNode(this_STRING_12, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_0_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1285:3: (otherlv_13= 'align' ( (lv_align_14_0= ruleNUMBER ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==87) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1285:5: otherlv_13= 'align' ( (lv_align_14_0= ruleNUMBER ) )
                            {
                            otherlv_13=(Token)match(input,87,FOLLOW_87_in_ruleFunctionDefinition3324); 

                                	newLeafNode(otherlv_13, grammarAccess.getFunctionDefinitionAccess().getAlignKeyword_0_11_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1289:1: ( (lv_align_14_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1290:1: (lv_align_14_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1290:1: (lv_align_14_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1291:3: lv_align_14_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAlignNUMBERParserRuleCall_0_11_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleFunctionDefinition3345);
                            lv_align_14_0=ruleNUMBER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"align",
                                    		lv_align_14_0, 
                                    		"NUMBER");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1307:4: ( (lv_body_15_0= ruleFunctionBody ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1308:1: (lv_body_15_0= ruleFunctionBody )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1308:1: (lv_body_15_0= ruleFunctionBody )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1309:3: lv_body_15_0= ruleFunctionBody
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getBodyFunctionBodyParserRuleCall_0_12_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionBody_in_ruleFunctionDefinition3368);
                    lv_body_15_0=ruleFunctionBody();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"body",
                            		lv_body_15_0, 
                            		"FunctionBody");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1326:6: (otherlv_16= 'declare' (this_LINKAGE_17= RULE_LINKAGE | this_ALIAS_LINKAGE_18= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_19= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_21= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_22_0= ruleTypeUse ) ) ( (lv_address_23_0= ruleAddress ) ) ( (lv_parameter_24_0= ruleFunctionParameterList ) ) (otherlv_25= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_27= 'section ' this_STRING_28= RULE_STRING )? (otherlv_29= 'align' ( (lv_align_30_0= ruleNUMBER ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1326:6: (otherlv_16= 'declare' (this_LINKAGE_17= RULE_LINKAGE | this_ALIAS_LINKAGE_18= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_19= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_21= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_22_0= ruleTypeUse ) ) ( (lv_address_23_0= ruleAddress ) ) ( (lv_parameter_24_0= ruleFunctionParameterList ) ) (otherlv_25= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_27= 'section ' this_STRING_28= RULE_STRING )? (otherlv_29= 'align' ( (lv_align_30_0= ruleNUMBER ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1326:8: otherlv_16= 'declare' (this_LINKAGE_17= RULE_LINKAGE | this_ALIAS_LINKAGE_18= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_19= RULE_VISIBILITY )? ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_21= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_22_0= ruleTypeUse ) ) ( (lv_address_23_0= ruleAddress ) ) ( (lv_parameter_24_0= ruleFunctionParameterList ) ) (otherlv_25= 'unnamed_addr' )? ( ruleFUNCTION_ATTRIBUTES )* (otherlv_27= 'section ' this_STRING_28= RULE_STRING )? (otherlv_29= 'align' ( (lv_align_30_0= ruleNUMBER ) ) )?
                    {
                    otherlv_16=(Token)match(input,90,FOLLOW_90_in_ruleFunctionDefinition3388); 

                        	newLeafNode(otherlv_16, grammarAccess.getFunctionDefinitionAccess().getDeclareKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1330:1: (this_LINKAGE_17= RULE_LINKAGE | this_ALIAS_LINKAGE_18= RULE_ALIAS_LINKAGE )?
                    int alt28=3;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==RULE_LINKAGE) ) {
                        alt28=1;
                    }
                    else if ( (LA28_0==RULE_ALIAS_LINKAGE) ) {
                        alt28=2;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1330:2: this_LINKAGE_17= RULE_LINKAGE
                            {
                            this_LINKAGE_17=(Token)match(input,RULE_LINKAGE,FOLLOW_RULE_LINKAGE_in_ruleFunctionDefinition3400); 
                             
                                newLeafNode(this_LINKAGE_17, grammarAccess.getFunctionDefinitionAccess().getLINKAGETerminalRuleCall_1_1_0()); 
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1335:6: this_ALIAS_LINKAGE_18= RULE_ALIAS_LINKAGE
                            {
                            this_ALIAS_LINKAGE_18=(Token)match(input,RULE_ALIAS_LINKAGE,FOLLOW_RULE_ALIAS_LINKAGE_in_ruleFunctionDefinition3416); 
                             
                                newLeafNode(this_ALIAS_LINKAGE_18, grammarAccess.getFunctionDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_1_1_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:3: (this_VISIBILITY_19= RULE_VISIBILITY )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==RULE_VISIBILITY) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1339:4: this_VISIBILITY_19= RULE_VISIBILITY
                            {
                            this_VISIBILITY_19=(Token)match(input,RULE_VISIBILITY,FOLLOW_RULE_VISIBILITY_in_ruleFunctionDefinition3429); 
                             
                                newLeafNode(this_VISIBILITY_19, grammarAccess.getFunctionDefinitionAccess().getVISIBILITYTerminalRuleCall_1_2()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1343:3: ( ruleCallingConv )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( ((LA30_0>=31 && LA30_0<=45)) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1344:5: ruleCallingConv
                            {
                             
                                    newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getCallingConvParserRuleCall_1_3()); 
                                
                            pushFollow(FOLLOW_ruleCallingConv_in_ruleFunctionDefinition3447);
                            ruleCallingConv();

                            state._fsp--;

                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1351:3: (this_RETURN_ATTRIBUTES_21= RULE_RETURN_ATTRIBUTES )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==RULE_RETURN_ATTRIBUTES) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1351:4: this_RETURN_ATTRIBUTES_21= RULE_RETURN_ATTRIBUTES
                            {
                            this_RETURN_ATTRIBUTES_21=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionDefinition3460); 
                             
                                newLeafNode(this_RETURN_ATTRIBUTES_21, grammarAccess.getFunctionDefinitionAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1_4()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1355:3: ( (lv_returnType_22_0= ruleTypeUse ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1356:1: (lv_returnType_22_0= ruleTypeUse )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1356:1: (lv_returnType_22_0= ruleTypeUse )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1357:3: lv_returnType_22_0= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getReturnTypeTypeUseParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleFunctionDefinition3482);
                    lv_returnType_22_0=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"returnType",
                            		lv_returnType_22_0, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1373:2: ( (lv_address_23_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1374:1: (lv_address_23_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1374:1: (lv_address_23_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1375:3: lv_address_23_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAddressAddressParserRuleCall_1_6_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleFunctionDefinition3503);
                    lv_address_23_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_23_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1391:2: ( (lv_parameter_24_0= ruleFunctionParameterList ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1392:1: (lv_parameter_24_0= ruleFunctionParameterList )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1392:1: (lv_parameter_24_0= ruleFunctionParameterList )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1393:3: lv_parameter_24_0= ruleFunctionParameterList
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getParameterFunctionParameterListParserRuleCall_1_7_0()); 
                    	    
                    pushFollow(FOLLOW_ruleFunctionParameterList_in_ruleFunctionDefinition3524);
                    lv_parameter_24_0=ruleFunctionParameterList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"parameter",
                            		lv_parameter_24_0, 
                            		"FunctionParameterList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1409:2: (otherlv_25= 'unnamed_addr' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==85) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1409:4: otherlv_25= 'unnamed_addr'
                            {
                            otherlv_25=(Token)match(input,85,FOLLOW_85_in_ruleFunctionDefinition3537); 

                                	newLeafNode(otherlv_25, grammarAccess.getFunctionDefinitionAccess().getUnnamed_addrKeyword_1_8());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1413:3: ( ruleFUNCTION_ATTRIBUTES )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( ((LA33_0>=48 && LA33_0<=49)||(LA33_0>=52 && LA33_0<=67)) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1414:5: ruleFUNCTION_ATTRIBUTES
                    	    {
                    	     
                    	            newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getFUNCTION_ATTRIBUTESParserRuleCall_1_9()); 
                    	        
                    	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition3556);
                    	    ruleFUNCTION_ATTRIBUTES();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1421:3: (otherlv_27= 'section ' this_STRING_28= RULE_STRING )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==89) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1421:5: otherlv_27= 'section ' this_STRING_28= RULE_STRING
                            {
                            otherlv_27=(Token)match(input,89,FOLLOW_89_in_ruleFunctionDefinition3570); 

                                	newLeafNode(otherlv_27, grammarAccess.getFunctionDefinitionAccess().getSectionKeyword_1_10_0());
                                
                            this_STRING_28=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleFunctionDefinition3581); 
                             
                                newLeafNode(this_STRING_28, grammarAccess.getFunctionDefinitionAccess().getSTRINGTerminalRuleCall_1_10_1()); 
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1429:3: (otherlv_29= 'align' ( (lv_align_30_0= ruleNUMBER ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==87) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1429:5: otherlv_29= 'align' ( (lv_align_30_0= ruleNUMBER ) )
                            {
                            otherlv_29=(Token)match(input,87,FOLLOW_87_in_ruleFunctionDefinition3595); 

                                	newLeafNode(otherlv_29, grammarAccess.getFunctionDefinitionAccess().getAlignKeyword_1_11_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1433:1: ( (lv_align_30_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1434:1: (lv_align_30_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1434:1: (lv_align_30_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1435:3: lv_align_30_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionDefinitionAccess().getAlignNUMBERParserRuleCall_1_11_1_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleFunctionDefinition3616);
                            lv_align_30_0=ruleNUMBER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"align",
                                    		lv_align_30_0, 
                                    		"NUMBER");
                            	        afterParserOrEnumRuleCall();
                            	    

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
    // $ANTLR end "ruleFunctionDefinition"


    // $ANTLR start "entryRuleAliasDefinition"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1459:1: entryRuleAliasDefinition returns [EObject current=null] : iv_ruleAliasDefinition= ruleAliasDefinition EOF ;
    public final EObject entryRuleAliasDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAliasDefinition = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1460:2: (iv_ruleAliasDefinition= ruleAliasDefinition EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1461:2: iv_ruleAliasDefinition= ruleAliasDefinition EOF
            {
             newCompositeNode(grammarAccess.getAliasDefinitionRule()); 
            pushFollow(FOLLOW_ruleAliasDefinition_in_entryRuleAliasDefinition3655);
            iv_ruleAliasDefinition=ruleAliasDefinition();

            state._fsp--;

             current =iv_ruleAliasDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAliasDefinition3665); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAliasDefinition"


    // $ANTLR start "ruleAliasDefinition"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1468:1: ruleAliasDefinition returns [EObject current=null] : ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) ) ) ;
    public final EObject ruleAliasDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token this_ALIAS_LINKAGE_3=null;
        Token this_VISIBILITY_4=null;
        EObject lv_address_0_0 = null;

        EObject lv_aliastype_5_0 = null;

        EObject lv_aliasvalue_6_0 = null;

        EObject lv_aliasee_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1471:28: ( ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1472:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1472:1: ( ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1472:2: ( (lv_address_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alias' (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )? (this_VISIBILITY_4= RULE_VISIBILITY )? ( (lv_aliastype_5_0= ruleTypeUse ) ) ( (lv_aliasvalue_6_0= ruleValue ) ) ( (lv_aliasee_7_0= ruleTypeUse ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1472:2: ( (lv_address_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1473:1: (lv_address_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1473:1: (lv_address_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1474:3: lv_address_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getAliasDefinitionAccess().getAddressAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleAliasDefinition3711);
            lv_address_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAliasDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"address",
                    		lv_address_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleAliasDefinition3723); 

                	newLeafNode(otherlv_1, grammarAccess.getAliasDefinitionAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,91,FOLLOW_91_in_ruleAliasDefinition3735); 

                	newLeafNode(otherlv_2, grammarAccess.getAliasDefinitionAccess().getAliasKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1498:1: (this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ALIAS_LINKAGE) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1498:2: this_ALIAS_LINKAGE_3= RULE_ALIAS_LINKAGE
                    {
                    this_ALIAS_LINKAGE_3=(Token)match(input,RULE_ALIAS_LINKAGE,FOLLOW_RULE_ALIAS_LINKAGE_in_ruleAliasDefinition3747); 
                     
                        newLeafNode(this_ALIAS_LINKAGE_3, grammarAccess.getAliasDefinitionAccess().getALIAS_LINKAGETerminalRuleCall_3()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1502:3: (this_VISIBILITY_4= RULE_VISIBILITY )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_VISIBILITY) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1502:4: this_VISIBILITY_4= RULE_VISIBILITY
                    {
                    this_VISIBILITY_4=(Token)match(input,RULE_VISIBILITY,FOLLOW_RULE_VISIBILITY_in_ruleAliasDefinition3760); 
                     
                        newLeafNode(this_VISIBILITY_4, grammarAccess.getAliasDefinitionAccess().getVISIBILITYTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1506:3: ( (lv_aliastype_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1507:1: (lv_aliastype_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1507:1: (lv_aliastype_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1508:3: lv_aliastype_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getAliasDefinitionAccess().getAliastypeTypeUseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleAliasDefinition3782);
            lv_aliastype_5_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAliasDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"aliastype",
                    		lv_aliastype_5_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1524:2: ( (lv_aliasvalue_6_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1525:1: (lv_aliasvalue_6_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1525:1: (lv_aliasvalue_6_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1526:3: lv_aliasvalue_6_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getAliasDefinitionAccess().getAliasvalueValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleAliasDefinition3803);
            lv_aliasvalue_6_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAliasDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"aliasvalue",
                    		lv_aliasvalue_6_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1542:2: ( (lv_aliasee_7_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1543:1: (lv_aliasee_7_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1543:1: (lv_aliasee_7_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1544:3: lv_aliasee_7_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getAliasDefinitionAccess().getAliaseeTypeUseParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleAliasDefinition3824);
            lv_aliasee_7_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAliasDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"aliasee",
                    		lv_aliasee_7_0, 
                    		"TypeUse");
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
    // $ANTLR end "ruleAliasDefinition"


    // $ANTLR start "entryRuleTypeUse"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1568:1: entryRuleTypeUse returns [EObject current=null] : iv_ruleTypeUse= ruleTypeUse EOF ;
    public final EObject entryRuleTypeUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeUse = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1569:2: (iv_ruleTypeUse= ruleTypeUse EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1570:2: iv_ruleTypeUse= ruleTypeUse EOF
            {
             newCompositeNode(grammarAccess.getTypeUseRule()); 
            pushFollow(FOLLOW_ruleTypeUse_in_entryRuleTypeUse3860);
            iv_ruleTypeUse=ruleTypeUse();

            state._fsp--;

             current =iv_ruleTypeUse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTypeUse3870); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1577:1: ruleTypeUse returns [EObject current=null] : ( (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )? ) ;
    public final EObject ruleTypeUse() throws RecognitionException {
        EObject current = null;

        Token lv_functionInput_2_0=null;
        EObject this_Predefined_0 = null;

        EObject this_AddressUse_1 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1580:28: ( ( (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1581:1: ( (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1581:1: ( (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1581:2: (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse ) ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1581:2: (this_Predefined_0= rulePredefined | this_AddressUse_1= ruleAddressUse )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT_TYPE||(LA39_0>=RULE_PRIMITIVE_VALUE && LA39_0<=RULE_FLOATING_POINT_TYPE)) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_VALID_ID) ) {
                alt39=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1582:5: this_Predefined_0= rulePredefined
                    {
                     
                            newCompositeNode(grammarAccess.getTypeUseAccess().getPredefinedParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_rulePredefined_in_ruleTypeUse3918);
                    this_Predefined_0=rulePredefined();

                    state._fsp--;

                     
                            current = this_Predefined_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1592:5: this_AddressUse_1= ruleAddressUse
                    {
                     
                            newCompositeNode(grammarAccess.getTypeUseAccess().getAddressUseParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleAddressUse_in_ruleTypeUse3945);
                    this_AddressUse_1=ruleAddressUse();

                    state._fsp--;

                     
                            current = this_AddressUse_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1600:2: ( (lv_functionInput_2_0= RULE_UNKNOWN_TYPE ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_UNKNOWN_TYPE) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1601:1: (lv_functionInput_2_0= RULE_UNKNOWN_TYPE )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1601:1: (lv_functionInput_2_0= RULE_UNKNOWN_TYPE )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1602:3: lv_functionInput_2_0= RULE_UNKNOWN_TYPE
                    {
                    lv_functionInput_2_0=(Token)match(input,RULE_UNKNOWN_TYPE,FOLLOW_RULE_UNKNOWN_TYPE_in_ruleTypeUse3962); 

                    			newLeafNode(lv_functionInput_2_0, grammarAccess.getTypeUseAccess().getFunctionInputUNKNOWN_TYPETerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTypeUseRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"functionInput",
                            		lv_functionInput_2_0, 
                            		"UNKNOWN_TYPE");
                    	    

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
    // $ANTLR end "ruleTypeUse"


    // $ANTLR start "entryRuleAddressUse"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1626:1: entryRuleAddressUse returns [EObject current=null] : iv_ruleAddressUse= ruleAddressUse EOF ;
    public final EObject entryRuleAddressUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddressUse = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1627:2: (iv_ruleAddressUse= ruleAddressUse EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1628:2: iv_ruleAddressUse= ruleAddressUse EOF
            {
             newCompositeNode(grammarAccess.getAddressUseRule()); 
            pushFollow(FOLLOW_ruleAddressUse_in_entryRuleAddressUse4004);
            iv_ruleAddressUse=ruleAddressUse();

            state._fsp--;

             current =iv_ruleAddressUse; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddressUse4014); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1635:1: ruleAddressUse returns [EObject current=null] : ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) ;
    public final EObject ruleAddressUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_pointer_1_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1638:28: ( ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1639:1: ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1639:1: ( ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1639:2: ( (otherlv_0= RULE_VALID_ID ) ) ( (lv_pointer_1_0= RULE_POINTER ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1639:2: ( (otherlv_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1640:1: (otherlv_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1640:1: (otherlv_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1641:3: otherlv_0= RULE_VALID_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAddressUseRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleAddressUse4059); 

            		newLeafNode(otherlv_0, grammarAccess.getAddressUseAccess().getAddressAddressCrossReference_0_0()); 
            	

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1652:2: ( (lv_pointer_1_0= RULE_POINTER ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_POINTER) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1653:1: (lv_pointer_1_0= RULE_POINTER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1653:1: (lv_pointer_1_0= RULE_POINTER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1654:3: lv_pointer_1_0= RULE_POINTER
                    {
                    lv_pointer_1_0=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_ruleAddressUse4076); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1678:1: entryRuleAddress returns [EObject current=null] : iv_ruleAddress= ruleAddress EOF ;
    public final EObject entryRuleAddress() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddress = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1679:2: (iv_ruleAddress= ruleAddress EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1680:2: iv_ruleAddress= ruleAddress EOF
            {
             newCompositeNode(grammarAccess.getAddressRule()); 
            pushFollow(FOLLOW_ruleAddress_in_entryRuleAddress4118);
            iv_ruleAddress=ruleAddress();

            state._fsp--;

             current =iv_ruleAddress; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddress4128); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1687:1: ruleAddress returns [EObject current=null] : ( (lv_name_0_0= RULE_VALID_ID ) ) ;
    public final EObject ruleAddress() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1690:28: ( ( (lv_name_0_0= RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1691:1: ( (lv_name_0_0= RULE_VALID_ID ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1691:1: ( (lv_name_0_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1692:1: (lv_name_0_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1692:1: (lv_name_0_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1693:3: lv_name_0_0= RULE_VALID_ID
            {
            lv_name_0_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleAddress4169); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1717:1: entryRulePredefined returns [EObject current=null] : iv_rulePredefined= rulePredefined EOF ;
    public final EObject entryRulePredefined() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredefined = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1718:2: (iv_rulePredefined= rulePredefined EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1719:2: iv_rulePredefined= rulePredefined EOF
            {
             newCompositeNode(grammarAccess.getPredefinedRule()); 
            pushFollow(FOLLOW_rulePredefined_in_entryRulePredefined4209);
            iv_rulePredefined=rulePredefined();

            state._fsp--;

             current =iv_rulePredefined; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePredefined4219); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1726:1: rulePredefined returns [EObject current=null] : ( ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) ;
    public final EObject rulePredefined() throws RecognitionException {
        EObject current = null;

        Token lv_type_0_1=null;
        Token lv_type_0_2=null;
        Token lv_type_0_3=null;
        Token lv_pointer_1_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1729:28: ( ( ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1730:1: ( ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1730:1: ( ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1730:2: ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) ) ( (lv_pointer_1_0= RULE_POINTER ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1730:2: ( ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1731:1: ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1731:1: ( (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1732:1: (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1732:1: (lv_type_0_1= RULE_PRIMITIVE_VALUE | lv_type_0_2= RULE_INT_TYPE | lv_type_0_3= RULE_FLOATING_POINT_TYPE )
            int alt42=3;
            switch ( input.LA(1) ) {
            case RULE_PRIMITIVE_VALUE:
                {
                alt42=1;
                }
                break;
            case RULE_INT_TYPE:
                {
                alt42=2;
                }
                break;
            case RULE_FLOATING_POINT_TYPE:
                {
                alt42=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1733:3: lv_type_0_1= RULE_PRIMITIVE_VALUE
                    {
                    lv_type_0_1=(Token)match(input,RULE_PRIMITIVE_VALUE,FOLLOW_RULE_PRIMITIVE_VALUE_in_rulePredefined4263); 

                    			newLeafNode(lv_type_0_1, grammarAccess.getPredefinedAccess().getTypePRIMITIVE_VALUETerminalRuleCall_0_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredefinedRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_0_1, 
                            		"PRIMITIVE_VALUE");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1748:8: lv_type_0_2= RULE_INT_TYPE
                    {
                    lv_type_0_2=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_rulePredefined4283); 

                    			newLeafNode(lv_type_0_2, grammarAccess.getPredefinedAccess().getTypeINT_TYPETerminalRuleCall_0_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredefinedRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_0_2, 
                            		"INT_TYPE");
                    	    

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1763:8: lv_type_0_3= RULE_FLOATING_POINT_TYPE
                    {
                    lv_type_0_3=(Token)match(input,RULE_FLOATING_POINT_TYPE,FOLLOW_RULE_FLOATING_POINT_TYPE_in_rulePredefined4303); 

                    			newLeafNode(lv_type_0_3, grammarAccess.getPredefinedAccess().getTypeFLOATING_POINT_TYPETerminalRuleCall_0_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPredefinedRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"type",
                            		lv_type_0_3, 
                            		"FLOATING_POINT_TYPE");
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1781:2: ( (lv_pointer_1_0= RULE_POINTER ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_POINTER) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1782:1: (lv_pointer_1_0= RULE_POINTER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1782:1: (lv_pointer_1_0= RULE_POINTER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1783:3: lv_pointer_1_0= RULE_POINTER
                    {
                    lv_pointer_1_0=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_rulePredefined4328); 

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


    // $ANTLR start "entryRuleVector"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1807:1: entryRuleVector returns [EObject current=null] : iv_ruleVector= ruleVector EOF ;
    public final EObject entryRuleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1808:2: (iv_ruleVector= ruleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1809:2: iv_ruleVector= ruleVector EOF
            {
             newCompositeNode(grammarAccess.getVectorRule()); 
            pushFollow(FOLLOW_ruleVector_in_entryRuleVector4370);
            iv_ruleVector=ruleVector();

            state._fsp--;

             current =iv_ruleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVector4380); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1816:1: ruleVector returns [EObject current=null] : (otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>' ) ;
    public final EObject ruleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_length_1_0 = null;

        EObject lv_type_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1819:28: ( (otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1820:1: (otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1820:1: (otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1820:3: otherlv_0= '<' ( (lv_length_1_0= ruleNUMBER ) ) otherlv_2= 'x' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '>'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleVector4417); 

                	newLeafNode(otherlv_0, grammarAccess.getVectorAccess().getLessThanSignKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1824:1: ( (lv_length_1_0= ruleNUMBER ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1825:1: (lv_length_1_0= ruleNUMBER )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1825:1: (lv_length_1_0= ruleNUMBER )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1826:3: lv_length_1_0= ruleNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getLengthNUMBERParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleNUMBER_in_ruleVector4438);
            lv_length_1_0=ruleNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"length",
                    		lv_length_1_0, 
                    		"NUMBER");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,92,FOLLOW_92_in_ruleVector4450); 

                	newLeafNode(otherlv_2, grammarAccess.getVectorAccess().getXKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1846:1: ( (lv_type_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1847:1: (lv_type_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1847:1: (lv_type_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1848:3: lv_type_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getVectorAccess().getTypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleVector4471);
            lv_type_3_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVectorRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,47,FOLLOW_47_in_ruleVector4483); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1876:1: entryRuleArray returns [EObject current=null] : iv_ruleArray= ruleArray EOF ;
    public final EObject entryRuleArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArray = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1877:2: (iv_ruleArray= ruleArray EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1878:2: iv_ruleArray= ruleArray EOF
            {
             newCompositeNode(grammarAccess.getArrayRule()); 
            pushFollow(FOLLOW_ruleArray_in_entryRuleArray4519);
            iv_ruleArray=ruleArray();

            state._fsp--;

             current =iv_ruleArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArray4529); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1885:1: ruleArray returns [EObject current=null] : ( () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )? ) ;
    public final EObject ruleArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token this_POINTER_9=null;
        AntlrDatatypeRuleToken lv_length_2_0 = null;

        EObject lv_type_4_1 = null;

        EObject lv_type_4_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1888:28: ( ( () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1889:1: ( () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1889:1: ( () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1889:2: () ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) ) (this_POINTER_9= RULE_POINTER )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1889:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1890:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getArrayAccess().getArrayAction_0(),
                        current);
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1895:2: ( (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' ) | otherlv_6= '[]' | (otherlv_7= '[' otherlv_8= ']' ) )
            int alt45=3;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==79) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==RULE_INT||LA45_1==29) ) {
                    alt45=1;
                }
                else if ( (LA45_1==81) ) {
                    alt45=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 45, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA45_0==93) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1895:3: (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1895:3: (otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1895:5: otherlv_1= '[' ( (lv_length_2_0= ruleNUMBER ) ) otherlv_3= 'x' ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) ) otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleArray4577); 

                        	newLeafNode(otherlv_1, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1899:1: ( (lv_length_2_0= ruleNUMBER ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1900:1: (lv_length_2_0= ruleNUMBER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1900:1: (lv_length_2_0= ruleNUMBER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1901:3: lv_length_2_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getArrayAccess().getLengthNUMBERParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleArray4598);
                    lv_length_2_0=ruleNUMBER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getArrayRule());
                    	        }
                           		set(
                           			current, 
                           			"length",
                            		lv_length_2_0, 
                            		"NUMBER");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_3=(Token)match(input,92,FOLLOW_92_in_ruleArray4610); 

                        	newLeafNode(otherlv_3, grammarAccess.getArrayAccess().getXKeyword_1_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1921:1: ( ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1922:1: ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1922:1: ( (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1923:1: (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1923:1: (lv_type_4_1= ruleTypeUse | lv_type_4_2= ruleAggregate_Type )
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==RULE_INT_TYPE||LA44_0==RULE_VALID_ID||(LA44_0>=RULE_PRIMITIVE_VALUE && LA44_0<=RULE_FLOATING_POINT_TYPE)) ) {
                        alt44=1;
                    }
                    else if ( (LA44_0==46||LA44_0==79||(LA44_0>=93 && LA44_0<=94)) ) {
                        alt44=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 0, input);

                        throw nvae;
                    }
                    switch (alt44) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1924:3: lv_type_4_1= ruleTypeUse
                            {
                             
                            	        newCompositeNode(grammarAccess.getArrayAccess().getTypeTypeUseParserRuleCall_1_0_3_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeUse_in_ruleArray4633);
                            lv_type_4_1=ruleTypeUse();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getArrayRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_4_1, 
                                    		"TypeUse");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1939:8: lv_type_4_2= ruleAggregate_Type
                            {
                             
                            	        newCompositeNode(grammarAccess.getArrayAccess().getTypeAggregate_TypeParserRuleCall_1_0_3_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleAggregate_Type_in_ruleArray4652);
                            lv_type_4_2=ruleAggregate_Type();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getArrayRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"type",
                                    		lv_type_4_2, 
                                    		"Aggregate_Type");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    otherlv_5=(Token)match(input,81,FOLLOW_81_in_ruleArray4667); 

                        	newLeafNode(otherlv_5, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_1_0_4());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1962:7: otherlv_6= '[]'
                    {
                    otherlv_6=(Token)match(input,93,FOLLOW_93_in_ruleArray4686); 

                        	newLeafNode(otherlv_6, grammarAccess.getArrayAccess().getLeftSquareBracketRightSquareBracketKeyword_1_1());
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1967:6: (otherlv_7= '[' otherlv_8= ']' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1967:6: (otherlv_7= '[' otherlv_8= ']' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1967:8: otherlv_7= '[' otherlv_8= ']'
                    {
                    otherlv_7=(Token)match(input,79,FOLLOW_79_in_ruleArray4705); 

                        	newLeafNode(otherlv_7, grammarAccess.getArrayAccess().getLeftSquareBracketKeyword_1_2_0());
                        
                    otherlv_8=(Token)match(input,81,FOLLOW_81_in_ruleArray4717); 

                        	newLeafNode(otherlv_8, grammarAccess.getArrayAccess().getRightSquareBracketKeyword_1_2_1());
                        

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1975:3: (this_POINTER_9= RULE_POINTER )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_POINTER) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1975:4: this_POINTER_9= RULE_POINTER
                    {
                    this_POINTER_9=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_ruleArray4731); 
                     
                        newLeafNode(this_POINTER_9, grammarAccess.getArrayAccess().getPOINTERTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleArray"


    // $ANTLR start "entryRuleAggregate_Type"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1987:1: entryRuleAggregate_Type returns [EObject current=null] : iv_ruleAggregate_Type= ruleAggregate_Type EOF ;
    public final EObject entryRuleAggregate_Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAggregate_Type = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1988:2: (iv_ruleAggregate_Type= ruleAggregate_Type EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1989:2: iv_ruleAggregate_Type= ruleAggregate_Type EOF
            {
             newCompositeNode(grammarAccess.getAggregate_TypeRule()); 
            pushFollow(FOLLOW_ruleAggregate_Type_in_entryRuleAggregate_Type4768);
            iv_ruleAggregate_Type=ruleAggregate_Type();

            state._fsp--;

             current =iv_ruleAggregate_Type; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAggregate_Type4778); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAggregate_Type"


    // $ANTLR start "ruleAggregate_Type"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1996:1: ruleAggregate_Type returns [EObject current=null] : (this_Structure_0= ruleStructure | this_Array_1= ruleArray | this_Vector_2= ruleVector ) ;
    public final EObject ruleAggregate_Type() throws RecognitionException {
        EObject current = null;

        EObject this_Structure_0 = null;

        EObject this_Array_1 = null;

        EObject this_Vector_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:1999:28: ( (this_Structure_0= ruleStructure | this_Array_1= ruleArray | this_Vector_2= ruleVector ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2000:1: (this_Structure_0= ruleStructure | this_Array_1= ruleArray | this_Vector_2= ruleVector )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2000:1: (this_Structure_0= ruleStructure | this_Array_1= ruleArray | this_Vector_2= ruleVector )
            int alt47=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt47=1;
                }
                break;
            case 79:
            case 93:
                {
                alt47=2;
                }
                break;
            case 46:
                {
                alt47=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2001:5: this_Structure_0= ruleStructure
                    {
                     
                            newCompositeNode(grammarAccess.getAggregate_TypeAccess().getStructureParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStructure_in_ruleAggregate_Type4825);
                    this_Structure_0=ruleStructure();

                    state._fsp--;

                     
                            current = this_Structure_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2011:5: this_Array_1= ruleArray
                    {
                     
                            newCompositeNode(grammarAccess.getAggregate_TypeAccess().getArrayParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleArray_in_ruleAggregate_Type4852);
                    this_Array_1=ruleArray();

                    state._fsp--;

                     
                            current = this_Array_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2021:5: this_Vector_2= ruleVector
                    {
                     
                            newCompositeNode(grammarAccess.getAggregate_TypeAccess().getVectorParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleVector_in_ruleAggregate_Type4879);
                    this_Vector_2=ruleVector();

                    state._fsp--;

                     
                            current = this_Vector_2; 
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
    // $ANTLR end "ruleAggregate_Type"


    // $ANTLR start "entryRuleConstant"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2037:1: entryRuleConstant returns [EObject current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final EObject entryRuleConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstant = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2038:2: (iv_ruleConstant= ruleConstant EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2039:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_ruleConstant_in_entryRuleConstant4914);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstant4924); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2046:1: ruleConstant returns [EObject current=null] : ( (lv_value_0_0= ruleNUMBER ) ) ;
    public final EObject ruleConstant() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2049:28: ( ( (lv_value_0_0= ruleNUMBER ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2050:1: ( (lv_value_0_0= ruleNUMBER ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2050:1: ( (lv_value_0_0= ruleNUMBER ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2051:1: (lv_value_0_0= ruleNUMBER )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2051:1: (lv_value_0_0= ruleNUMBER )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2052:3: lv_value_0_0= ruleNUMBER
            {
             
            	        newCompositeNode(grammarAccess.getConstantAccess().getValueNUMBERParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleNUMBER_in_ruleConstant4969);
            lv_value_0_0=ruleNUMBER();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConstantRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"NUMBER");
            	        afterParserOrEnumRuleCall();
            	    

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


    // $ANTLR start "entryRulePrimitiveValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2076:1: entryRulePrimitiveValue returns [EObject current=null] : iv_rulePrimitiveValue= rulePrimitiveValue EOF ;
    public final EObject entryRulePrimitiveValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2077:2: (iv_rulePrimitiveValue= rulePrimitiveValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2078:2: iv_rulePrimitiveValue= rulePrimitiveValue EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveValueRule()); 
            pushFollow(FOLLOW_rulePrimitiveValue_in_entryRulePrimitiveValue5004);
            iv_rulePrimitiveValue=rulePrimitiveValue();

            state._fsp--;

             current =iv_rulePrimitiveValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimitiveValue5014); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveValue"


    // $ANTLR start "rulePrimitiveValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2085:1: rulePrimitiveValue returns [EObject current=null] : ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) ) ) ;
    public final EObject rulePrimitiveValue() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;
        Token lv_value_0_3=null;
        Token lv_value_0_4=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2088:28: ( ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2089:1: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2089:1: ( ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2090:1: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2090:1: ( (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2091:1: (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2091:1: (lv_value_0_1= RULE_STRING | lv_value_0_2= RULE_PRIMITIVE_VALUE | lv_value_0_3= RULE_INITIALIZER | lv_value_0_4= RULE_BOOL )
            int alt48=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt48=1;
                }
                break;
            case RULE_PRIMITIVE_VALUE:
                {
                alt48=2;
                }
                break;
            case RULE_INITIALIZER:
                {
                alt48=3;
                }
                break;
            case RULE_BOOL:
                {
                alt48=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }

            switch (alt48) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2092:3: lv_value_0_1= RULE_STRING
                    {
                    lv_value_0_1=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePrimitiveValue5057); 

                    			newLeafNode(lv_value_0_1, grammarAccess.getPrimitiveValueAccess().getValueSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_1, 
                            		"STRING");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2107:8: lv_value_0_2= RULE_PRIMITIVE_VALUE
                    {
                    lv_value_0_2=(Token)match(input,RULE_PRIMITIVE_VALUE,FOLLOW_RULE_PRIMITIVE_VALUE_in_rulePrimitiveValue5077); 

                    			newLeafNode(lv_value_0_2, grammarAccess.getPrimitiveValueAccess().getValuePRIMITIVE_VALUETerminalRuleCall_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_2, 
                            		"PRIMITIVE_VALUE");
                    	    

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2122:8: lv_value_0_3= RULE_INITIALIZER
                    {
                    lv_value_0_3=(Token)match(input,RULE_INITIALIZER,FOLLOW_RULE_INITIALIZER_in_rulePrimitiveValue5097); 

                    			newLeafNode(lv_value_0_3, grammarAccess.getPrimitiveValueAccess().getValueINITIALIZERTerminalRuleCall_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_3, 
                            		"INITIALIZER");
                    	    

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2137:8: lv_value_0_4= RULE_BOOL
                    {
                    lv_value_0_4=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_rulePrimitiveValue5117); 

                    			newLeafNode(lv_value_0_4, grammarAccess.getPrimitiveValueAccess().getValueBOOLTerminalRuleCall_0_3()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getPrimitiveValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_0_4, 
                            		"BOOL");
                    	    

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
    // $ANTLR end "rulePrimitiveValue"


    // $ANTLR start "entryRuleValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2163:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2164:2: (iv_ruleValue= ruleValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2165:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_ruleValue_in_entryRuleValue5160);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValue5170); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2172:1: ruleValue returns [EObject current=null] : (this_NestedCast_0= ruleNestedCast | this_NestedGetElementPtr_1= ruleNestedGetElementPtr | this_Constant_2= ruleConstant | this_AddressUse_3= ruleAddressUse | this_PrimitiveValue_4= rulePrimitiveValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_NestedCast_0 = null;

        EObject this_NestedGetElementPtr_1 = null;

        EObject this_Constant_2 = null;

        EObject this_AddressUse_3 = null;

        EObject this_PrimitiveValue_4 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2175:28: ( (this_NestedCast_0= ruleNestedCast | this_NestedGetElementPtr_1= ruleNestedGetElementPtr | this_Constant_2= ruleConstant | this_AddressUse_3= ruleAddressUse | this_PrimitiveValue_4= rulePrimitiveValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2176:1: (this_NestedCast_0= ruleNestedCast | this_NestedGetElementPtr_1= ruleNestedGetElementPtr | this_Constant_2= ruleConstant | this_AddressUse_3= ruleAddressUse | this_PrimitiveValue_4= rulePrimitiveValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2176:1: (this_NestedCast_0= ruleNestedCast | this_NestedGetElementPtr_1= ruleNestedGetElementPtr | this_Constant_2= ruleConstant | this_AddressUse_3= ruleAddressUse | this_PrimitiveValue_4= rulePrimitiveValue )
            int alt49=5;
            switch ( input.LA(1) ) {
            case RULE_CAST_OP:
                {
                alt49=1;
                }
                break;
            case 122:
                {
                alt49=2;
                }
                break;
            case RULE_INT:
            case 29:
                {
                alt49=3;
                }
                break;
            case RULE_VALID_ID:
                {
                alt49=4;
                }
                break;
            case RULE_BOOL:
            case RULE_STRING:
            case RULE_PRIMITIVE_VALUE:
            case RULE_INITIALIZER:
                {
                alt49=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2177:5: this_NestedCast_0= ruleNestedCast
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNestedCastParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleNestedCast_in_ruleValue5217);
                    this_NestedCast_0=ruleNestedCast();

                    state._fsp--;

                     
                            current = this_NestedCast_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2187:5: this_NestedGetElementPtr_1= ruleNestedGetElementPtr
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getNestedGetElementPtrParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleNestedGetElementPtr_in_ruleValue5244);
                    this_NestedGetElementPtr_1=ruleNestedGetElementPtr();

                    state._fsp--;

                     
                            current = this_NestedGetElementPtr_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2197:5: this_Constant_2= ruleConstant
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getConstantParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleConstant_in_ruleValue5271);
                    this_Constant_2=ruleConstant();

                    state._fsp--;

                     
                            current = this_Constant_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2207:5: this_AddressUse_3= ruleAddressUse
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getAddressUseParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAddressUse_in_ruleValue5298);
                    this_AddressUse_3=ruleAddressUse();

                    state._fsp--;

                     
                            current = this_AddressUse_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2217:5: this_PrimitiveValue_4= rulePrimitiveValue
                    {
                     
                            newCompositeNode(grammarAccess.getValueAccess().getPrimitiveValueParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_rulePrimitiveValue_in_ruleValue5325);
                    this_PrimitiveValue_4=rulePrimitiveValue();

                    state._fsp--;

                     
                            current = this_PrimitiveValue_4; 
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2235:1: entryRuleStructure returns [EObject current=null] : iv_ruleStructure= ruleStructure EOF ;
    public final EObject entryRuleStructure() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructure = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2236:2: (iv_ruleStructure= ruleStructure EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2237:2: iv_ruleStructure= ruleStructure EOF
            {
             newCompositeNode(grammarAccess.getStructureRule()); 
            pushFollow(FOLLOW_ruleStructure_in_entryRuleStructure5362);
            iv_ruleStructure=ruleStructure();

            state._fsp--;

             current =iv_ruleStructure; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStructure5372); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2244:1: ruleStructure returns [EObject current=null] : ( () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? ) ;
    public final EObject ruleStructure() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token this_POINTER_6=null;
        EObject lv_types_2_1 = null;

        EObject lv_types_2_2 = null;

        EObject lv_types_4_1 = null;

        EObject lv_types_4_2 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2247:28: ( ( () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2248:1: ( () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2248:1: ( () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2248:2: () otherlv_1= '{' ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )? otherlv_5= '}' (this_POINTER_6= RULE_POINTER )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2248:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2249:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getStructureAccess().getStructureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleStructure5418); 

                	newLeafNode(otherlv_1, grammarAccess.getStructureAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2258:1: ( ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )* )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT_TYPE||LA53_0==RULE_VALID_ID||(LA53_0>=RULE_PRIMITIVE_VALUE && LA53_0<=RULE_FLOATING_POINT_TYPE)||LA53_0==46||LA53_0==79||(LA53_0>=93 && LA53_0<=94)) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2258:2: ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) ) (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2258:2: ( ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2259:1: ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2259:1: ( (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2260:1: (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2260:1: (lv_types_2_1= ruleTypeUse | lv_types_2_2= ruleAggregate_Type )
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==RULE_INT_TYPE||LA50_0==RULE_VALID_ID||(LA50_0>=RULE_PRIMITIVE_VALUE && LA50_0<=RULE_FLOATING_POINT_TYPE)) ) {
                        alt50=1;
                    }
                    else if ( (LA50_0==46||LA50_0==79||(LA50_0>=93 && LA50_0<=94)) ) {
                        alt50=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 0, input);

                        throw nvae;
                    }
                    switch (alt50) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2261:3: lv_types_2_1= ruleTypeUse
                            {
                             
                            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_0_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleTypeUse_in_ruleStructure5442);
                            lv_types_2_1=ruleTypeUse();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStructureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"types",
                                    		lv_types_2_1, 
                                    		"TypeUse");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2276:8: lv_types_2_2= ruleAggregate_Type
                            {
                             
                            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesAggregate_TypeParserRuleCall_2_0_0_1()); 
                            	    
                            pushFollow(FOLLOW_ruleAggregate_Type_in_ruleStructure5461);
                            lv_types_2_2=ruleAggregate_Type();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStructureRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"types",
                                    		lv_types_2_2, 
                                    		"Aggregate_Type");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2294:2: (otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==80) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2294:4: otherlv_3= ',' ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) )
                    	    {
                    	    otherlv_3=(Token)match(input,80,FOLLOW_80_in_ruleStructure5477); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getStructureAccess().getCommaKeyword_2_1_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2298:1: ( ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2299:1: ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2299:1: ( (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2300:1: (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2300:1: (lv_types_4_1= ruleTypeUse | lv_types_4_2= ruleAggregate_Type )
                    	    int alt51=2;
                    	    int LA51_0 = input.LA(1);

                    	    if ( (LA51_0==RULE_INT_TYPE||LA51_0==RULE_VALID_ID||(LA51_0>=RULE_PRIMITIVE_VALUE && LA51_0<=RULE_FLOATING_POINT_TYPE)) ) {
                    	        alt51=1;
                    	    }
                    	    else if ( (LA51_0==46||LA51_0==79||(LA51_0>=93 && LA51_0<=94)) ) {
                    	        alt51=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 51, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt51) {
                    	        case 1 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2301:3: lv_types_4_1= ruleTypeUse
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesTypeUseParserRuleCall_2_1_1_0_0()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleTypeUse_in_ruleStructure5500);
                    	            lv_types_4_1=ruleTypeUse();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getStructureRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"types",
                    	                    		lv_types_4_1, 
                    	                    		"TypeUse");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;
                    	        case 2 :
                    	            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2316:8: lv_types_4_2= ruleAggregate_Type
                    	            {
                    	             
                    	            	        newCompositeNode(grammarAccess.getStructureAccess().getTypesAggregate_TypeParserRuleCall_2_1_1_0_1()); 
                    	            	    
                    	            pushFollow(FOLLOW_ruleAggregate_Type_in_ruleStructure5519);
                    	            lv_types_4_2=ruleAggregate_Type();

                    	            state._fsp--;


                    	            	        if (current==null) {
                    	            	            current = createModelElementForParent(grammarAccess.getStructureRule());
                    	            	        }
                    	                   		add(
                    	                   			current, 
                    	                   			"types",
                    	                    		lv_types_4_2, 
                    	                    		"Aggregate_Type");
                    	            	        afterParserOrEnumRuleCall();
                    	            	    

                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,95,FOLLOW_95_in_ruleStructure5538); 

                	newLeafNode(otherlv_5, grammarAccess.getStructureAccess().getRightCurlyBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2338:1: (this_POINTER_6= RULE_POINTER )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_POINTER) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2338:2: this_POINTER_6= RULE_POINTER
                    {
                    this_POINTER_6=(Token)match(input,RULE_POINTER,FOLLOW_RULE_POINTER_in_ruleStructure5550); 
                     
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


    // $ANTLR start "entryRuleParameter"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2350:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2351:2: (iv_ruleParameter= ruleParameter EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2352:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_ruleParameter_in_entryRuleParameter5587);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameter5597); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2359:1: ruleParameter returns [EObject current=null] : ( ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token this_RETURN_ATTRIBUTES_1=null;
        Token this_RETURN_ATTRIBUTES_4=null;
        EObject lv_type_0_1 = null;

        EObject lv_type_0_2 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2362:28: ( ( ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2363:1: ( ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2363:1: ( ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2363:2: ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) ) ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2363:2: ( ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2364:1: ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2364:1: ( (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2365:1: (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2365:1: (lv_type_0_1= ruleTypeUse | lv_type_0_2= ruleAggregate_Type )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_INT_TYPE||LA55_0==RULE_VALID_ID||(LA55_0>=RULE_PRIMITIVE_VALUE && LA55_0<=RULE_FLOATING_POINT_TYPE)) ) {
                alt55=1;
            }
            else if ( (LA55_0==46||LA55_0==79||(LA55_0>=93 && LA55_0<=94)) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2366:3: lv_type_0_1= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getTypeTypeUseParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleParameter5645);
                    lv_type_0_1=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_1, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2381:8: lv_type_0_2= ruleAggregate_Type
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getTypeAggregate_TypeParserRuleCall_0_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAggregate_Type_in_ruleParameter5664);
                    lv_type_0_2=ruleAggregate_Type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_0_2, 
                            		"Aggregate_Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2399:2: ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) )
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2399:3: ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2399:3: ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2399:4: (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2399:4: (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+
                    int cnt56=0;
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_RETURN_ATTRIBUTES) ) {
                            alt56=1;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2399:5: this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES
                    	    {
                    	    this_RETURN_ATTRIBUTES_1=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleParameter5681); 
                    	     
                    	        newLeafNode(this_RETURN_ATTRIBUTES_1, grammarAccess.getParameterAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1_0_0()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt56 >= 1 ) break loop56;
                                EarlyExitException eee =
                                    new EarlyExitException(56, input);
                                throw eee;
                        }
                        cnt56++;
                    } while (true);

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2403:3: ( (lv_value_2_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2404:1: (lv_value_2_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2404:1: (lv_value_2_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2405:3: lv_value_2_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getValueValueParserRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleParameter5703);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2422:6: ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2422:6: ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2422:7: ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2422:7: ( (lv_value_3_0= ruleValue ) )?
                    int alt57=2;
                    switch ( input.LA(1) ) {
                        case RULE_CAST_OP:
                            {
                            int LA57_1 = input.LA(2);

                            if ( (LA57_1==50) ) {
                                alt57=1;
                            }
                            }
                            break;
                        case RULE_INT:
                        case RULE_STRING:
                        case RULE_PRIMITIVE_VALUE:
                        case RULE_INITIALIZER:
                        case 29:
                        case 122:
                            {
                            alt57=1;
                            }
                            break;
                        case RULE_VALID_ID:
                            {
                            int LA57_3 = input.LA(2);

                            if ( (LA57_3==EOF||(LA57_3>=RULE_ALIAS_LINKAGE && LA57_3<=RULE_SL_COMMENT)||(LA57_3>=RULE_VALID_ID && LA57_3<=RULE_POINTER)||LA57_3==RULE_METADATA||(LA57_3>=50 && LA57_3<=51)||(LA57_3>=68 && LA57_3<=72)||LA57_3==74||LA57_3==78||LA57_3==80||LA57_3==88||LA57_3==90||(LA57_3>=95 && LA57_3<=96)||(LA57_3>=124 && LA57_3<=125)||LA57_3==127||(LA57_3>=131 && LA57_3<=133)||LA57_3==150||(LA57_3>=153 && LA57_3<=154)||LA57_3==156) ) {
                                alt57=1;
                            }
                            }
                            break;
                        case RULE_BOOL:
                            {
                            int LA57_4 = input.LA(2);

                            if ( (LA57_4==EOF||(LA57_4>=RULE_ALIAS_LINKAGE && LA57_4<=RULE_SL_COMMENT)||LA57_4==RULE_VALID_ID||LA57_4==RULE_METADATA||(LA57_4>=50 && LA57_4<=51)||(LA57_4>=68 && LA57_4<=72)||LA57_4==74||LA57_4==78||LA57_4==80||LA57_4==88||LA57_4==90||(LA57_4>=95 && LA57_4<=96)||(LA57_4>=124 && LA57_4<=125)||LA57_4==127||(LA57_4>=131 && LA57_4<=133)||LA57_4==150||(LA57_4>=153 && LA57_4<=154)||LA57_4==156) ) {
                                alt57=1;
                            }
                            }
                            break;
                    }

                    switch (alt57) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2423:1: (lv_value_3_0= ruleValue )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2423:1: (lv_value_3_0= ruleValue )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2424:3: lv_value_3_0= ruleValue
                            {
                             
                            	        newCompositeNode(grammarAccess.getParameterAccess().getValueValueParserRuleCall_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleValue_in_ruleParameter5732);
                            lv_value_3_0=ruleValue();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getParameterRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"value",
                                    		lv_value_3_0, 
                                    		"Value");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2440:3: (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==RULE_RETURN_ATTRIBUTES) ) {
                            int LA58_2 = input.LA(2);

                            if ( (LA58_2==EOF||(LA58_2>=RULE_ALIAS_LINKAGE && LA58_2<=RULE_SL_COMMENT)||LA58_2==RULE_VALID_ID||LA58_2==RULE_METADATA||(LA58_2>=50 && LA58_2<=51)||(LA58_2>=68 && LA58_2<=72)||LA58_2==74||LA58_2==78||LA58_2==80||LA58_2==88||LA58_2==90||(LA58_2>=95 && LA58_2<=96)||(LA58_2>=124 && LA58_2<=125)||LA58_2==127||(LA58_2>=131 && LA58_2<=133)||LA58_2==150||(LA58_2>=153 && LA58_2<=154)||LA58_2==156) ) {
                                alt58=1;
                            }


                        }


                        switch (alt58) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2440:4: this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES
                    	    {
                    	    this_RETURN_ATTRIBUTES_4=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleParameter5745); 
                    	     
                    	        newLeafNode(this_RETURN_ATTRIBUTES_4, grammarAccess.getParameterAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1_1_1()); 
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleParameterList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2452:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2453:2: (iv_ruleParameterList= ruleParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2454:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_ruleParameterList_in_entryRuleParameterList5784);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameterList5794); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2461:1: ruleParameterList returns [EObject current=null] : ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ) ) ;
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
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2464:28: ( ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2465:1: ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2465:1: ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2465:2: () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2465:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2466:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getParameterListAccess().getParameterListAction_0(),
                        current);
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2471:2: (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==96) ) {
                alt62=1;
            }
            else if ( (LA62_0==50) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2471:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleParameterList5841); 

                        	newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2476:6: (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2476:6: (otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2476:8: otherlv_2= '(' ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleParameterList5860); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterListAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2480:1: ( ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )* )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==RULE_INT_TYPE||LA61_0==RULE_VALID_ID||(LA61_0>=RULE_PRIMITIVE_VALUE && LA61_0<=RULE_FLOATING_POINT_TYPE)||LA61_0==46||LA61_0==79||(LA61_0>=93 && LA61_0<=94)) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2480:2: ( (lv_params_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2480:2: ( (lv_params_3_0= ruleParameter ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2481:1: (lv_params_3_0= ruleParameter )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2481:1: (lv_params_3_0= ruleParameter )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2482:3: lv_params_3_0= ruleParameter
                            {
                             
                            	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleParameter_in_ruleParameterList5882);
                            lv_params_3_0=ruleParameter();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"params",
                                    		lv_params_3_0, 
                                    		"Parameter");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2498:2: (otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) ) )*
                            loop60:
                            do {
                                int alt60=2;
                                int LA60_0 = input.LA(1);

                                if ( (LA60_0==80) ) {
                                    alt60=1;
                                }


                                switch (alt60) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2498:4: otherlv_4= ',' ( (lv_params_5_0= ruleParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleParameterList5895); 

                            	        	newLeafNode(otherlv_4, grammarAccess.getParameterListAccess().getCommaKeyword_1_1_1_1_0());
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2502:1: ( (lv_params_5_0= ruleParameter ) )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2503:1: (lv_params_5_0= ruleParameter )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2503:1: (lv_params_5_0= ruleParameter )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2504:3: lv_params_5_0= ruleParameter
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getParameterListAccess().getParamsParameterParserRuleCall_1_1_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleParameter_in_ruleParameterList5916);
                            	    lv_params_5_0=ruleParameter();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getParameterListRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"params",
                            	            		lv_params_5_0, 
                            	            		"Parameter");
                            	    	        afterParserOrEnumRuleCall();
                            	    	    

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop60;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleParameterList5932); 

                        	newLeafNode(otherlv_6, grammarAccess.getParameterListAccess().getRightParenthesisKeyword_1_1_2());
                        

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


    // $ANTLR start "entryRuleFunctionParameter"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2532:1: entryRuleFunctionParameter returns [EObject current=null] : iv_ruleFunctionParameter= ruleFunctionParameter EOF ;
    public final EObject entryRuleFunctionParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameter = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2533:2: (iv_ruleFunctionParameter= ruleFunctionParameter EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2534:2: iv_ruleFunctionParameter= ruleFunctionParameter EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterRule()); 
            pushFollow(FOLLOW_ruleFunctionParameter_in_entryRuleFunctionParameter5970);
            iv_ruleFunctionParameter=ruleFunctionParameter();

            state._fsp--;

             current =iv_ruleFunctionParameter; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameter5980); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionParameter"


    // $ANTLR start "ruleFunctionParameter"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2541:1: ruleFunctionParameter returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )? ) ;
    public final EObject ruleFunctionParameter() throws RecognitionException {
        EObject current = null;

        Token this_RETURN_ATTRIBUTES_1=null;
        EObject lv_type_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2544:28: ( ( ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2545:1: ( ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2545:1: ( ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2545:2: ( (lv_type_0_0= ruleTypeUse ) ) (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )* ( (lv_value_2_0= ruleAddress ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2545:2: ( (lv_type_0_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2546:1: (lv_type_0_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2546:1: (lv_type_0_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2547:3: lv_type_0_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getFunctionParameterAccess().getTypeTypeUseParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleFunctionParameter6026);
            lv_type_0_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getFunctionParameterRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2563:2: (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_RETURN_ATTRIBUTES) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2563:3: this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES
            	    {
            	    this_RETURN_ATTRIBUTES_1=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionParameter6038); 
            	     
            	        newLeafNode(this_RETURN_ATTRIBUTES_1, grammarAccess.getFunctionParameterAccess().getRETURN_ATTRIBUTESTerminalRuleCall_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2567:3: ( (lv_value_2_0= ruleAddress ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_VALID_ID) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2568:1: (lv_value_2_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2568:1: (lv_value_2_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2569:3: lv_value_2_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getFunctionParameterAccess().getValueAddressParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleFunctionParameter6060);
                    lv_value_2_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getFunctionParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleFunctionParameter"


    // $ANTLR start "entryRuleFunctionParameterList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2593:1: entryRuleFunctionParameterList returns [EObject current=null] : iv_ruleFunctionParameterList= ruleFunctionParameterList EOF ;
    public final EObject entryRuleFunctionParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionParameterList = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2594:2: (iv_ruleFunctionParameterList= ruleFunctionParameterList EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2595:2: iv_ruleFunctionParameterList= ruleFunctionParameterList EOF
            {
             newCompositeNode(grammarAccess.getFunctionParameterListRule()); 
            pushFollow(FOLLOW_ruleFunctionParameterList_in_entryRuleFunctionParameterList6097);
            iv_ruleFunctionParameterList=ruleFunctionParameterList();

            state._fsp--;

             current =iv_ruleFunctionParameterList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionParameterList6107); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFunctionParameterList"


    // $ANTLR start "ruleFunctionParameterList"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2602:1: ruleFunctionParameterList returns [EObject current=null] : ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )? otherlv_6= ')' ) ) ) ;
    public final EObject ruleFunctionParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2605:28: ( ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )? otherlv_6= ')' ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2606:1: ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )? otherlv_6= ')' ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2606:1: ( () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )? otherlv_6= ')' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2606:2: () (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )? otherlv_6= ')' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2606:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2607:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getFunctionParameterListAccess().getFunctionParameterListAction_0(),
                        current);
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2612:2: (otherlv_1= '()' | (otherlv_2= '(' ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )? otherlv_6= ')' ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==96) ) {
                alt67=1;
            }
            else if ( (LA67_0==50) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2612:4: otherlv_1= '()'
                    {
                    otherlv_1=(Token)match(input,96,FOLLOW_96_in_ruleFunctionParameterList6154); 

                        	newLeafNode(otherlv_1, grammarAccess.getFunctionParameterListAccess().getLeftParenthesisRightParenthesisKeyword_1_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2617:6: (otherlv_2= '(' ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )? otherlv_6= ')' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2617:6: (otherlv_2= '(' ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )? otherlv_6= ')' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2617:8: otherlv_2= '(' ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )? otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleFunctionParameterList6173); 

                        	newLeafNode(otherlv_2, grammarAccess.getFunctionParameterListAccess().getLeftParenthesisKeyword_1_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2621:1: ( ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )* )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==RULE_INT_TYPE||LA66_0==RULE_VALID_ID||(LA66_0>=RULE_PRIMITIVE_VALUE && LA66_0<=RULE_FLOATING_POINT_TYPE)) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2621:2: ( (lv_params_3_0= ruleFunctionParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )*
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2621:2: ( (lv_params_3_0= ruleFunctionParameter ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2622:1: (lv_params_3_0= ruleFunctionParameter )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2622:1: (lv_params_3_0= ruleFunctionParameter )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2623:3: lv_params_3_0= ruleFunctionParameter
                            {
                             
                            	        newCompositeNode(grammarAccess.getFunctionParameterListAccess().getParamsFunctionParameterParserRuleCall_1_1_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleFunctionParameter_in_ruleFunctionParameterList6195);
                            lv_params_3_0=ruleFunctionParameter();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getFunctionParameterListRule());
                            	        }
                                   		add(
                                   			current, 
                                   			"params",
                                    		lv_params_3_0, 
                                    		"FunctionParameter");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2639:2: (otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) ) )*
                            loop65:
                            do {
                                int alt65=2;
                                int LA65_0 = input.LA(1);

                                if ( (LA65_0==80) ) {
                                    alt65=1;
                                }


                                switch (alt65) {
                            	case 1 :
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2639:4: otherlv_4= ',' ( (lv_params_5_0= ruleFunctionParameter ) )
                            	    {
                            	    otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleFunctionParameterList6208); 

                            	        	newLeafNode(otherlv_4, grammarAccess.getFunctionParameterListAccess().getCommaKeyword_1_1_1_1_0());
                            	        
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2643:1: ( (lv_params_5_0= ruleFunctionParameter ) )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2644:1: (lv_params_5_0= ruleFunctionParameter )
                            	    {
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2644:1: (lv_params_5_0= ruleFunctionParameter )
                            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2645:3: lv_params_5_0= ruleFunctionParameter
                            	    {
                            	     
                            	    	        newCompositeNode(grammarAccess.getFunctionParameterListAccess().getParamsFunctionParameterParserRuleCall_1_1_1_1_1_0()); 
                            	    	    
                            	    pushFollow(FOLLOW_ruleFunctionParameter_in_ruleFunctionParameterList6229);
                            	    lv_params_5_0=ruleFunctionParameter();

                            	    state._fsp--;


                            	    	        if (current==null) {
                            	    	            current = createModelElementForParent(grammarAccess.getFunctionParameterListRule());
                            	    	        }
                            	           		add(
                            	           			current, 
                            	           			"params",
                            	            		lv_params_5_0, 
                            	            		"FunctionParameter");
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

                    otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleFunctionParameterList6245); 

                        	newLeafNode(otherlv_6, grammarAccess.getFunctionParameterListAccess().getRightParenthesisKeyword_1_1_2());
                        

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
    // $ANTLR end "ruleFunctionParameterList"


    // $ANTLR start "entryRuleFunctionBody"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2673:1: entryRuleFunctionBody returns [EObject current=null] : iv_ruleFunctionBody= ruleFunctionBody EOF ;
    public final EObject entryRuleFunctionBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFunctionBody = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2674:2: (iv_ruleFunctionBody= ruleFunctionBody EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2675:2: iv_ruleFunctionBody= ruleFunctionBody EOF
            {
             newCompositeNode(grammarAccess.getFunctionBodyRule()); 
            pushFollow(FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody6283);
            iv_ruleFunctionBody=ruleFunctionBody();

            state._fsp--;

             current =iv_ruleFunctionBody; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionBody6293); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2682:1: ruleFunctionBody returns [EObject current=null] : ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ) ;
    public final EObject ruleFunctionBody() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_meta_0_0 = null;

        EObject lv_blocks_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2685:28: ( ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2686:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2686:1: ( ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2686:2: ( (lv_meta_0_0= ruleMetadataValue ) )* otherlv_1= '{' ( (lv_blocks_2_0= ruleBasicBlock ) )+ otherlv_3= '}'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2686:2: ( (lv_meta_0_0= ruleMetadataValue ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==RULE_METADATA) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2687:1: (lv_meta_0_0= ruleMetadataValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2687:1: (lv_meta_0_0= ruleMetadataValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2688:3: lv_meta_0_0= ruleMetadataValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getMetaMetadataValueParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMetadataValue_in_ruleFunctionBody6339);
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
            	    break loop68;
                }
            } while (true);

            otherlv_1=(Token)match(input,94,FOLLOW_94_in_ruleFunctionBody6352); 

                	newLeafNode(otherlv_1, grammarAccess.getFunctionBodyAccess().getLeftCurlyBracketKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2708:1: ( (lv_blocks_2_0= ruleBasicBlock ) )+
            int cnt69=0;
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=RULE_ALIAS_LINKAGE && LA69_0<=RULE_BOOL)||(LA69_0>=68 && LA69_0<=71)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2709:1: (lv_blocks_2_0= ruleBasicBlock )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2709:1: (lv_blocks_2_0= ruleBasicBlock )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2710:3: lv_blocks_2_0= ruleBasicBlock
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getFunctionBodyAccess().getBlocksBasicBlockParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleBasicBlock_in_ruleFunctionBody6373);
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
            	    if ( cnt69 >= 1 ) break loop69;
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
            } while (true);

            otherlv_3=(Token)match(input,95,FOLLOW_95_in_ruleFunctionBody6386); 

                	newLeafNode(otherlv_3, grammarAccess.getFunctionBodyAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleInstruction"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2738:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2739:2: (iv_ruleInstruction= ruleInstruction EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2740:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_ruleInstruction_in_entryRuleInstruction6422);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstruction6432); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2747:1: ruleInstruction returns [EObject current=null] : (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        EObject this_Store_0 = null;

        EObject this_Load_1 = null;

        EObject this_GetElementPtr_2 = null;

        EObject this_Alloc_3 = null;

        EObject this_CmpXchg_4 = null;

        EObject this_AtomicRMW_5 = null;

        EObject this_Fence_6 = null;

        EObject this_Return_7 = null;

        EObject this_Branch_8 = null;

        EObject this_Switch_9 = null;

        EObject this_IndirectBranch_10 = null;

        EObject this_Invoke_11 = null;

        EObject this_Resume_12 = null;

        EObject this_Unreachable_13 = null;

        EObject this_LogicOperation_14 = null;

        EObject this_ArithmeticOperation_15 = null;

        EObject this_Compare_16 = null;

        EObject this_Cast_17 = null;

        EObject this_ShuffleVector_18 = null;

        EObject this_InsertElement_19 = null;

        EObject this_ExtractElement_20 = null;

        EObject this_InsertValue_21 = null;

        EObject this_ExtractValue_22 = null;

        EObject this_Phi_23 = null;

        EObject this_Select_24 = null;

        EObject this_Call_25 = null;

        EObject this_VariableAttributeAccess_26 = null;

        EObject this_LandingPad_27 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2750:28: ( (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2751:1: (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2751:1: (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad )
            int alt70=28;
            alt70 = dfa70.predict(input);
            switch (alt70) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2752:5: this_Store_0= ruleStore
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getStoreParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleStore_in_ruleInstruction6479);
                    this_Store_0=ruleStore();

                    state._fsp--;

                     
                            current = this_Store_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2762:5: this_Load_1= ruleLoad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLoadParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleLoad_in_ruleInstruction6506);
                    this_Load_1=ruleLoad();

                    state._fsp--;

                     
                            current = this_Load_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2772:5: this_GetElementPtr_2= ruleGetElementPtr
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getGetElementPtrParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleGetElementPtr_in_ruleInstruction6533);
                    this_GetElementPtr_2=ruleGetElementPtr();

                    state._fsp--;

                     
                            current = this_GetElementPtr_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2782:5: this_Alloc_3= ruleAlloc
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAllocParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleAlloc_in_ruleInstruction6560);
                    this_Alloc_3=ruleAlloc();

                    state._fsp--;

                     
                            current = this_Alloc_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2792:5: this_CmpXchg_4= ruleCmpXchg
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCmpXchgParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleCmpXchg_in_ruleInstruction6587);
                    this_CmpXchg_4=ruleCmpXchg();

                    state._fsp--;

                     
                            current = this_CmpXchg_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2802:5: this_AtomicRMW_5= ruleAtomicRMW
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getAtomicRMWParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleAtomicRMW_in_ruleInstruction6614);
                    this_AtomicRMW_5=ruleAtomicRMW();

                    state._fsp--;

                     
                            current = this_AtomicRMW_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2812:5: this_Fence_6= ruleFence
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getFenceParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleFence_in_ruleInstruction6641);
                    this_Fence_6=ruleFence();

                    state._fsp--;

                     
                            current = this_Fence_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2822:5: this_Return_7= ruleReturn
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getReturnParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleReturn_in_ruleInstruction6668);
                    this_Return_7=ruleReturn();

                    state._fsp--;

                     
                            current = this_Return_7; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2832:5: this_Branch_8= ruleBranch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getBranchParserRuleCall_8()); 
                        
                    pushFollow(FOLLOW_ruleBranch_in_ruleInstruction6695);
                    this_Branch_8=ruleBranch();

                    state._fsp--;

                     
                            current = this_Branch_8; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2842:5: this_Switch_9= ruleSwitch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSwitchParserRuleCall_9()); 
                        
                    pushFollow(FOLLOW_ruleSwitch_in_ruleInstruction6722);
                    this_Switch_9=ruleSwitch();

                    state._fsp--;

                     
                            current = this_Switch_9; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2852:5: this_IndirectBranch_10= ruleIndirectBranch
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getIndirectBranchParserRuleCall_10()); 
                        
                    pushFollow(FOLLOW_ruleIndirectBranch_in_ruleInstruction6749);
                    this_IndirectBranch_10=ruleIndirectBranch();

                    state._fsp--;

                     
                            current = this_IndirectBranch_10; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2862:5: this_Invoke_11= ruleInvoke
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInvokeParserRuleCall_11()); 
                        
                    pushFollow(FOLLOW_ruleInvoke_in_ruleInstruction6776);
                    this_Invoke_11=ruleInvoke();

                    state._fsp--;

                     
                            current = this_Invoke_11; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 13 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2872:5: this_Resume_12= ruleResume
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getResumeParserRuleCall_12()); 
                        
                    pushFollow(FOLLOW_ruleResume_in_ruleInstruction6803);
                    this_Resume_12=ruleResume();

                    state._fsp--;

                     
                            current = this_Resume_12; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 14 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2882:5: this_Unreachable_13= ruleUnreachable
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getUnreachableParserRuleCall_13()); 
                        
                    pushFollow(FOLLOW_ruleUnreachable_in_ruleInstruction6830);
                    this_Unreachable_13=ruleUnreachable();

                    state._fsp--;

                     
                            current = this_Unreachable_13; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 15 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2892:5: this_LogicOperation_14= ruleLogicOperation
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLogicOperationParserRuleCall_14()); 
                        
                    pushFollow(FOLLOW_ruleLogicOperation_in_ruleInstruction6857);
                    this_LogicOperation_14=ruleLogicOperation();

                    state._fsp--;

                     
                            current = this_LogicOperation_14; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 16 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2902:5: this_ArithmeticOperation_15= ruleArithmeticOperation
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getArithmeticOperationParserRuleCall_15()); 
                        
                    pushFollow(FOLLOW_ruleArithmeticOperation_in_ruleInstruction6884);
                    this_ArithmeticOperation_15=ruleArithmeticOperation();

                    state._fsp--;

                     
                            current = this_ArithmeticOperation_15; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 17 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2912:5: this_Compare_16= ruleCompare
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCompareParserRuleCall_16()); 
                        
                    pushFollow(FOLLOW_ruleCompare_in_ruleInstruction6911);
                    this_Compare_16=ruleCompare();

                    state._fsp--;

                     
                            current = this_Compare_16; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 18 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2922:5: this_Cast_17= ruleCast
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCastParserRuleCall_17()); 
                        
                    pushFollow(FOLLOW_ruleCast_in_ruleInstruction6938);
                    this_Cast_17=ruleCast();

                    state._fsp--;

                     
                            current = this_Cast_17; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 19 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2932:5: this_ShuffleVector_18= ruleShuffleVector
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getShuffleVectorParserRuleCall_18()); 
                        
                    pushFollow(FOLLOW_ruleShuffleVector_in_ruleInstruction6965);
                    this_ShuffleVector_18=ruleShuffleVector();

                    state._fsp--;

                     
                            current = this_ShuffleVector_18; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 20 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2942:5: this_InsertElement_19= ruleInsertElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertElementParserRuleCall_19()); 
                        
                    pushFollow(FOLLOW_ruleInsertElement_in_ruleInstruction6992);
                    this_InsertElement_19=ruleInsertElement();

                    state._fsp--;

                     
                            current = this_InsertElement_19; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 21 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2952:5: this_ExtractElement_20= ruleExtractElement
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractElementParserRuleCall_20()); 
                        
                    pushFollow(FOLLOW_ruleExtractElement_in_ruleInstruction7019);
                    this_ExtractElement_20=ruleExtractElement();

                    state._fsp--;

                     
                            current = this_ExtractElement_20; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 22 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2962:5: this_InsertValue_21= ruleInsertValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getInsertValueParserRuleCall_21()); 
                        
                    pushFollow(FOLLOW_ruleInsertValue_in_ruleInstruction7046);
                    this_InsertValue_21=ruleInsertValue();

                    state._fsp--;

                     
                            current = this_InsertValue_21; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 23 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2972:5: this_ExtractValue_22= ruleExtractValue
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getExtractValueParserRuleCall_22()); 
                        
                    pushFollow(FOLLOW_ruleExtractValue_in_ruleInstruction7073);
                    this_ExtractValue_22=ruleExtractValue();

                    state._fsp--;

                     
                            current = this_ExtractValue_22; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 24 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2982:5: this_Phi_23= rulePhi
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getPhiParserRuleCall_23()); 
                        
                    pushFollow(FOLLOW_rulePhi_in_ruleInstruction7100);
                    this_Phi_23=rulePhi();

                    state._fsp--;

                     
                            current = this_Phi_23; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 25 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:2992:5: this_Select_24= ruleSelect
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getSelectParserRuleCall_24()); 
                        
                    pushFollow(FOLLOW_ruleSelect_in_ruleInstruction7127);
                    this_Select_24=ruleSelect();

                    state._fsp--;

                     
                            current = this_Select_24; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 26 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3002:5: this_Call_25= ruleCall
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getCallParserRuleCall_25()); 
                        
                    pushFollow(FOLLOW_ruleCall_in_ruleInstruction7154);
                    this_Call_25=ruleCall();

                    state._fsp--;

                     
                            current = this_Call_25; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 27 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3012:5: this_VariableAttributeAccess_26= ruleVariableAttributeAccess
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getVariableAttributeAccessParserRuleCall_26()); 
                        
                    pushFollow(FOLLOW_ruleVariableAttributeAccess_in_ruleInstruction7181);
                    this_VariableAttributeAccess_26=ruleVariableAttributeAccess();

                    state._fsp--;

                     
                            current = this_VariableAttributeAccess_26; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 28 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3022:5: this_LandingPad_27= ruleLandingPad
                    {
                     
                            newCompositeNode(grammarAccess.getInstructionAccess().getLandingPadParserRuleCall_27()); 
                        
                    pushFollow(FOLLOW_ruleLandingPad_in_ruleInstruction7208);
                    this_LandingPad_27=ruleLandingPad();

                    state._fsp--;

                     
                            current = this_LandingPad_27; 
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


    // $ANTLR start "entryRuleBasicBlock"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3038:1: entryRuleBasicBlock returns [EObject current=null] : iv_ruleBasicBlock= ruleBasicBlock EOF ;
    public final EObject entryRuleBasicBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicBlock = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3039:2: (iv_ruleBasicBlock= ruleBasicBlock EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3040:2: iv_ruleBasicBlock= ruleBasicBlock EOF
            {
             newCompositeNode(grammarAccess.getBasicBlockRule()); 
            pushFollow(FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock7243);
            iv_ruleBasicBlock=ruleBasicBlock();

            state._fsp--;

             current =iv_ruleBasicBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBasicBlock7253); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3047:1: ruleBasicBlock returns [EObject current=null] : ( ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+ ) ;
    public final EObject ruleBasicBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_label_0_0 = null;

        EObject lv_instructions_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3050:28: ( ( ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3051:1: ( ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3051:1: ( ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3051:2: ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' ) ( (lv_instructions_2_0= ruleInstruction ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3051:2: ( ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3051:3: ( (lv_label_0_0= ruleLABEL_ID ) ) otherlv_1= ':'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3051:3: ( (lv_label_0_0= ruleLABEL_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3052:1: (lv_label_0_0= ruleLABEL_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3052:1: (lv_label_0_0= ruleLABEL_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3053:3: lv_label_0_0= ruleLABEL_ID
            {
             
            	        newCompositeNode(grammarAccess.getBasicBlockAccess().getLabelLABEL_IDParserRuleCall_0_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLABEL_ID_in_ruleBasicBlock7300);
            lv_label_0_0=ruleLABEL_ID();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getBasicBlockRule());
            	        }
                   		set(
                   			current, 
                   			"label",
                    		lv_label_0_0, 
                    		"LABEL_ID");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,97,FOLLOW_97_in_ruleBasicBlock7312); 

                	newLeafNode(otherlv_1, grammarAccess.getBasicBlockAccess().getColonKeyword_0_1());
                

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3073:2: ( (lv_instructions_2_0= ruleInstruction ) )+
            int cnt71=0;
            loop71:
            do {
                int alt71=2;
                switch ( input.LA(1) ) {
                case 69:
                    {
                    int LA71_2 = input.LA(2);

                    if ( (LA71_2==RULE_RETURN_ATTRIBUTES||LA71_2==RULE_INT_TYPE||LA71_2==RULE_VALID_ID||(LA71_2>=RULE_PRIMITIVE_VALUE && LA71_2<=RULE_FLOATING_POINT_TYPE)||(LA71_2>=31 && LA71_2<=45)) ) {
                        alt71=1;
                    }


                    }
                    break;
                case 70:
                    {
                    int LA71_3 = input.LA(2);

                    if ( (LA71_3==94) ) {
                        alt71=1;
                    }


                    }
                    break;
                case 71:
                    {
                    int LA71_4 = input.LA(2);

                    if ( (LA71_4==RULE_INT_TYPE||LA71_4==RULE_VALID_ID||(LA71_4>=RULE_PRIMITIVE_VALUE && LA71_4<=RULE_FLOATING_POINT_TYPE)||LA71_4==46||LA71_4==79||(LA71_4>=93 && LA71_4<=94)) ) {
                        alt71=1;
                    }


                    }
                    break;
                case RULE_VALID_ID:
                case 124:
                case 127:
                case 131:
                case 132:
                case 133:
                case 150:
                case 153:
                case 154:
                case 156:
                    {
                    alt71=1;
                    }
                    break;

                }

                switch (alt71) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3074:1: (lv_instructions_2_0= ruleInstruction )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3074:1: (lv_instructions_2_0= ruleInstruction )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3075:3: lv_instructions_2_0= ruleInstruction
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBasicBlockAccess().getInstructionsInstructionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleInstruction_in_ruleBasicBlock7334);
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
            	    if ( cnt71 >= 1 ) break loop71;
                        EarlyExitException eee =
                            new EarlyExitException(71, input);
                        throw eee;
                }
                cnt71++;
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


    // $ANTLR start "entryRuleArithmeticOperation"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3099:1: entryRuleArithmeticOperation returns [EObject current=null] : iv_ruleArithmeticOperation= ruleArithmeticOperation EOF ;
    public final EObject entryRuleArithmeticOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticOperation = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3100:2: (iv_ruleArithmeticOperation= ruleArithmeticOperation EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3101:2: iv_ruleArithmeticOperation= ruleArithmeticOperation EOF
            {
             newCompositeNode(grammarAccess.getArithmeticOperationRule()); 
            pushFollow(FOLLOW_ruleArithmeticOperation_in_entryRuleArithmeticOperation7371);
            iv_ruleArithmeticOperation=ruleArithmeticOperation();

            state._fsp--;

             current =iv_ruleArithmeticOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticOperation7381); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArithmeticOperation"


    // $ANTLR start "ruleArithmeticOperation"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3108:1: ruleArithmeticOperation returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) ) ) ;
    public final EObject ruleArithmeticOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        Token lv_operation_2_3=null;
        Token lv_operation_2_4=null;
        Token lv_operation_2_5=null;
        Token lv_operation_2_6=null;
        Token lv_operation_2_7=null;
        Token lv_operation_2_8=null;
        Token lv_operation_2_9=null;
        Token lv_operation_2_10=null;
        Token lv_operation_2_11=null;
        Token lv_operation_2_12=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        EObject lv_result_0_0 = null;

        EObject lv_optype_7_0 = null;

        EObject lv_value1_8_0 = null;

        EObject lv_value2_10_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3111:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3112:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3112:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3112:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) ) ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )? ( (lv_optype_7_0= ruleTypeUse ) ) ( (lv_value1_8_0= ruleValue ) ) otherlv_9= ',' ( (lv_value2_10_0= ruleValue ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3112:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3113:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3113:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3114:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getArithmeticOperationAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleArithmeticOperation7427);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArithmeticOperationRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleArithmeticOperation7439); 

                	newLeafNode(otherlv_1, grammarAccess.getArithmeticOperationAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3134:1: ( ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3135:1: ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3135:1: ( (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3136:1: (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3136:1: (lv_operation_2_1= 'add' | lv_operation_2_2= 'fadd' | lv_operation_2_3= 'sub' | lv_operation_2_4= 'fsub' | lv_operation_2_5= 'mul' | lv_operation_2_6= 'fmul' | lv_operation_2_7= 'udiv' | lv_operation_2_8= 'sdiv' | lv_operation_2_9= 'fdiv' | lv_operation_2_10= 'urem' | lv_operation_2_11= 'srem' | lv_operation_2_12= 'frem' )
            int alt72=12;
            switch ( input.LA(1) ) {
            case 98:
                {
                alt72=1;
                }
                break;
            case 99:
                {
                alt72=2;
                }
                break;
            case 100:
                {
                alt72=3;
                }
                break;
            case 101:
                {
                alt72=4;
                }
                break;
            case 102:
                {
                alt72=5;
                }
                break;
            case 103:
                {
                alt72=6;
                }
                break;
            case 104:
                {
                alt72=7;
                }
                break;
            case 105:
                {
                alt72=8;
                }
                break;
            case 106:
                {
                alt72=9;
                }
                break;
            case 107:
                {
                alt72=10;
                }
                break;
            case 108:
                {
                alt72=11;
                }
                break;
            case 109:
                {
                alt72=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3137:3: lv_operation_2_1= 'add'
                    {
                    lv_operation_2_1=(Token)match(input,98,FOLLOW_98_in_ruleArithmeticOperation7459); 

                            newLeafNode(lv_operation_2_1, grammarAccess.getArithmeticOperationAccess().getOperationAddKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3149:8: lv_operation_2_2= 'fadd'
                    {
                    lv_operation_2_2=(Token)match(input,99,FOLLOW_99_in_ruleArithmeticOperation7488); 

                            newLeafNode(lv_operation_2_2, grammarAccess.getArithmeticOperationAccess().getOperationFaddKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3161:8: lv_operation_2_3= 'sub'
                    {
                    lv_operation_2_3=(Token)match(input,100,FOLLOW_100_in_ruleArithmeticOperation7517); 

                            newLeafNode(lv_operation_2_3, grammarAccess.getArithmeticOperationAccess().getOperationSubKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3173:8: lv_operation_2_4= 'fsub'
                    {
                    lv_operation_2_4=(Token)match(input,101,FOLLOW_101_in_ruleArithmeticOperation7546); 

                            newLeafNode(lv_operation_2_4, grammarAccess.getArithmeticOperationAccess().getOperationFsubKeyword_2_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3185:8: lv_operation_2_5= 'mul'
                    {
                    lv_operation_2_5=(Token)match(input,102,FOLLOW_102_in_ruleArithmeticOperation7575); 

                            newLeafNode(lv_operation_2_5, grammarAccess.getArithmeticOperationAccess().getOperationMulKeyword_2_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3197:8: lv_operation_2_6= 'fmul'
                    {
                    lv_operation_2_6=(Token)match(input,103,FOLLOW_103_in_ruleArithmeticOperation7604); 

                            newLeafNode(lv_operation_2_6, grammarAccess.getArithmeticOperationAccess().getOperationFmulKeyword_2_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_6, null);
                    	    

                    }
                    break;
                case 7 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3209:8: lv_operation_2_7= 'udiv'
                    {
                    lv_operation_2_7=(Token)match(input,104,FOLLOW_104_in_ruleArithmeticOperation7633); 

                            newLeafNode(lv_operation_2_7, grammarAccess.getArithmeticOperationAccess().getOperationUdivKeyword_2_0_6());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_7, null);
                    	    

                    }
                    break;
                case 8 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3221:8: lv_operation_2_8= 'sdiv'
                    {
                    lv_operation_2_8=(Token)match(input,105,FOLLOW_105_in_ruleArithmeticOperation7662); 

                            newLeafNode(lv_operation_2_8, grammarAccess.getArithmeticOperationAccess().getOperationSdivKeyword_2_0_7());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_8, null);
                    	    

                    }
                    break;
                case 9 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3233:8: lv_operation_2_9= 'fdiv'
                    {
                    lv_operation_2_9=(Token)match(input,106,FOLLOW_106_in_ruleArithmeticOperation7691); 

                            newLeafNode(lv_operation_2_9, grammarAccess.getArithmeticOperationAccess().getOperationFdivKeyword_2_0_8());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_9, null);
                    	    

                    }
                    break;
                case 10 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3245:8: lv_operation_2_10= 'urem'
                    {
                    lv_operation_2_10=(Token)match(input,107,FOLLOW_107_in_ruleArithmeticOperation7720); 

                            newLeafNode(lv_operation_2_10, grammarAccess.getArithmeticOperationAccess().getOperationUremKeyword_2_0_9());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_10, null);
                    	    

                    }
                    break;
                case 11 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3257:8: lv_operation_2_11= 'srem'
                    {
                    lv_operation_2_11=(Token)match(input,108,FOLLOW_108_in_ruleArithmeticOperation7749); 

                            newLeafNode(lv_operation_2_11, grammarAccess.getArithmeticOperationAccess().getOperationSremKeyword_2_0_10());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_11, null);
                    	    

                    }
                    break;
                case 12 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3269:8: lv_operation_2_12= 'frem'
                    {
                    lv_operation_2_12=(Token)match(input,109,FOLLOW_109_in_ruleArithmeticOperation7778); 

                            newLeafNode(lv_operation_2_12, grammarAccess.getArithmeticOperationAccess().getOperationFremKeyword_2_0_11());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getArithmeticOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_12, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3284:2: ( (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )? )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( ((LA75_0>=110 && LA75_0<=111)) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3284:3: (otherlv_3= 'nsw' | otherlv_4= 'nuw' ) (otherlv_5= 'nuw' | otherlv_6= 'nsw' )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3284:3: (otherlv_3= 'nsw' | otherlv_4= 'nuw' )
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==110) ) {
                        alt73=1;
                    }
                    else if ( (LA73_0==111) ) {
                        alt73=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 73, 0, input);

                        throw nvae;
                    }
                    switch (alt73) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3284:5: otherlv_3= 'nsw'
                            {
                            otherlv_3=(Token)match(input,110,FOLLOW_110_in_ruleArithmeticOperation7808); 

                                	newLeafNode(otherlv_3, grammarAccess.getArithmeticOperationAccess().getNswKeyword_3_0_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3289:7: otherlv_4= 'nuw'
                            {
                            otherlv_4=(Token)match(input,111,FOLLOW_111_in_ruleArithmeticOperation7826); 

                                	newLeafNode(otherlv_4, grammarAccess.getArithmeticOperationAccess().getNuwKeyword_3_0_1());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3293:2: (otherlv_5= 'nuw' | otherlv_6= 'nsw' )?
                    int alt74=3;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==111) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==110) ) {
                        alt74=2;
                    }
                    switch (alt74) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3293:4: otherlv_5= 'nuw'
                            {
                            otherlv_5=(Token)match(input,111,FOLLOW_111_in_ruleArithmeticOperation7840); 

                                	newLeafNode(otherlv_5, grammarAccess.getArithmeticOperationAccess().getNuwKeyword_3_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3298:7: otherlv_6= 'nsw'
                            {
                            otherlv_6=(Token)match(input,110,FOLLOW_110_in_ruleArithmeticOperation7858); 

                                	newLeafNode(otherlv_6, grammarAccess.getArithmeticOperationAccess().getNswKeyword_3_1_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3302:5: ( (lv_optype_7_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3303:1: (lv_optype_7_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3303:1: (lv_optype_7_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3304:3: lv_optype_7_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getArithmeticOperationAccess().getOptypeTypeUseParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleArithmeticOperation7883);
            lv_optype_7_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArithmeticOperationRule());
            	        }
                   		set(
                   			current, 
                   			"optype",
                    		lv_optype_7_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3320:2: ( (lv_value1_8_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3321:1: (lv_value1_8_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3321:1: (lv_value1_8_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3322:3: lv_value1_8_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getArithmeticOperationAccess().getValue1ValueParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleArithmeticOperation7904);
            lv_value1_8_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArithmeticOperationRule());
            	        }
                   		set(
                   			current, 
                   			"value1",
                    		lv_value1_8_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,80,FOLLOW_80_in_ruleArithmeticOperation7916); 

                	newLeafNode(otherlv_9, grammarAccess.getArithmeticOperationAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3342:1: ( (lv_value2_10_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3343:1: (lv_value2_10_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3343:1: (lv_value2_10_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3344:3: lv_value2_10_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getArithmeticOperationAccess().getValue2ValueParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleArithmeticOperation7937);
            lv_value2_10_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArithmeticOperationRule());
            	        }
                   		set(
                   			current, 
                   			"value2",
                    		lv_value2_10_0, 
                    		"Value");
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
    // $ANTLR end "ruleArithmeticOperation"


    // $ANTLR start "entryRuleLogicOperation"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3368:1: entryRuleLogicOperation returns [EObject current=null] : iv_ruleLogicOperation= ruleLogicOperation EOF ;
    public final EObject entryRuleLogicOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicOperation = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3369:2: (iv_ruleLogicOperation= ruleLogicOperation EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3370:2: iv_ruleLogicOperation= ruleLogicOperation EOF
            {
             newCompositeNode(grammarAccess.getLogicOperationRule()); 
            pushFollow(FOLLOW_ruleLogicOperation_in_entryRuleLogicOperation7973);
            iv_ruleLogicOperation=ruleLogicOperation();

            state._fsp--;

             current =iv_ruleLogicOperation; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLogicOperation7983); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLogicOperation"


    // $ANTLR start "ruleLogicOperation"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3377:1: ruleLogicOperation returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) ) ) ;
    public final EObject ruleLogicOperation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operation_2_1=null;
        Token lv_operation_2_2=null;
        Token lv_operation_2_3=null;
        Token lv_operation_2_4=null;
        Token lv_operation_2_5=null;
        Token lv_operation_2_6=null;
        Token otherlv_5=null;
        EObject lv_result_0_0 = null;

        EObject lv_optype_3_0 = null;

        EObject lv_value1_4_0 = null;

        EObject lv_value2_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3380:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3381:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3381:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3381:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) ) ( (lv_optype_3_0= ruleTypeUse ) ) ( (lv_value1_4_0= ruleValue ) ) otherlv_5= ',' ( (lv_value2_6_0= ruleValue ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3381:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3382:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3382:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3383:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getLogicOperationAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleLogicOperation8029);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicOperationRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleLogicOperation8041); 

                	newLeafNode(otherlv_1, grammarAccess.getLogicOperationAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3403:1: ( ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3404:1: ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3404:1: ( (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3405:1: (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3405:1: (lv_operation_2_1= 'shl' | lv_operation_2_2= 'lshr' | lv_operation_2_3= 'ashr' | lv_operation_2_4= 'and' | lv_operation_2_5= 'or' | lv_operation_2_6= 'xor' )
            int alt76=6;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt76=1;
                }
                break;
            case 113:
                {
                alt76=2;
                }
                break;
            case 114:
                {
                alt76=3;
                }
                break;
            case 115:
                {
                alt76=4;
                }
                break;
            case 116:
                {
                alt76=5;
                }
                break;
            case 117:
                {
                alt76=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3406:3: lv_operation_2_1= 'shl'
                    {
                    lv_operation_2_1=(Token)match(input,112,FOLLOW_112_in_ruleLogicOperation8061); 

                            newLeafNode(lv_operation_2_1, grammarAccess.getLogicOperationAccess().getOperationShlKeyword_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_1, null);
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3418:8: lv_operation_2_2= 'lshr'
                    {
                    lv_operation_2_2=(Token)match(input,113,FOLLOW_113_in_ruleLogicOperation8090); 

                            newLeafNode(lv_operation_2_2, grammarAccess.getLogicOperationAccess().getOperationLshrKeyword_2_0_1());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_2, null);
                    	    

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3430:8: lv_operation_2_3= 'ashr'
                    {
                    lv_operation_2_3=(Token)match(input,114,FOLLOW_114_in_ruleLogicOperation8119); 

                            newLeafNode(lv_operation_2_3, grammarAccess.getLogicOperationAccess().getOperationAshrKeyword_2_0_2());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_3, null);
                    	    

                    }
                    break;
                case 4 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3442:8: lv_operation_2_4= 'and'
                    {
                    lv_operation_2_4=(Token)match(input,115,FOLLOW_115_in_ruleLogicOperation8148); 

                            newLeafNode(lv_operation_2_4, grammarAccess.getLogicOperationAccess().getOperationAndKeyword_2_0_3());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_4, null);
                    	    

                    }
                    break;
                case 5 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3454:8: lv_operation_2_5= 'or'
                    {
                    lv_operation_2_5=(Token)match(input,116,FOLLOW_116_in_ruleLogicOperation8177); 

                            newLeafNode(lv_operation_2_5, grammarAccess.getLogicOperationAccess().getOperationOrKeyword_2_0_4());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_5, null);
                    	    

                    }
                    break;
                case 6 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3466:8: lv_operation_2_6= 'xor'
                    {
                    lv_operation_2_6=(Token)match(input,117,FOLLOW_117_in_ruleLogicOperation8206); 

                            newLeafNode(lv_operation_2_6, grammarAccess.getLogicOperationAccess().getOperationXorKeyword_2_0_5());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLogicOperationRule());
                    	        }
                           		setWithLastConsumed(current, "operation", lv_operation_2_6, null);
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3481:2: ( (lv_optype_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3482:1: (lv_optype_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3482:1: (lv_optype_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3483:3: lv_optype_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getLogicOperationAccess().getOptypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleLogicOperation8243);
            lv_optype_3_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicOperationRule());
            	        }
                   		set(
                   			current, 
                   			"optype",
                    		lv_optype_3_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3499:2: ( (lv_value1_4_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3500:1: (lv_value1_4_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3500:1: (lv_value1_4_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3501:3: lv_value1_4_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getLogicOperationAccess().getValue1ValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleLogicOperation8264);
            lv_value1_4_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicOperationRule());
            	        }
                   		set(
                   			current, 
                   			"value1",
                    		lv_value1_4_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleLogicOperation8276); 

                	newLeafNode(otherlv_5, grammarAccess.getLogicOperationAccess().getCommaKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3521:1: ( (lv_value2_6_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3522:1: (lv_value2_6_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3522:1: (lv_value2_6_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3523:3: lv_value2_6_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getLogicOperationAccess().getValue2ValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleLogicOperation8297);
            lv_value2_6_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLogicOperationRule());
            	        }
                   		set(
                   			current, 
                   			"value2",
                    		lv_value2_6_0, 
                    		"Value");
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
    // $ANTLR end "ruleLogicOperation"


    // $ANTLR start "entryRuleCast"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3547:1: entryRuleCast returns [EObject current=null] : iv_ruleCast= ruleCast EOF ;
    public final EObject entryRuleCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCast = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3548:2: (iv_ruleCast= ruleCast EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3549:2: iv_ruleCast= ruleCast EOF
            {
             newCompositeNode(grammarAccess.getCastRule()); 
            pushFollow(FOLLOW_ruleCast_in_entryRuleCast8333);
            iv_ruleCast=ruleCast();

            state._fsp--;

             current =iv_ruleCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCast8343); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3556:1: ruleCast returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) ) ) ;
    public final EObject ruleCast() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_operation_2_0=null;
        Token otherlv_5=null;
        EObject lv_result_0_0 = null;

        EObject lv_from_3_1 = null;

        EObject lv_from_3_2 = null;

        EObject lv_value_4_0 = null;

        EObject lv_to_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3559:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3560:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3560:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3560:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (lv_operation_2_0= RULE_CAST_OP ) ) ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) ) ( (lv_value_4_0= ruleValue ) ) otherlv_5= 'to' ( (lv_to_6_0= ruleTypeUse ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3560:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3561:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3561:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3562:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleCast8389);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleCast8401); 

                	newLeafNode(otherlv_1, grammarAccess.getCastAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3582:1: ( (lv_operation_2_0= RULE_CAST_OP ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3583:1: (lv_operation_2_0= RULE_CAST_OP )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3583:1: (lv_operation_2_0= RULE_CAST_OP )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3584:3: lv_operation_2_0= RULE_CAST_OP
            {
            lv_operation_2_0=(Token)match(input,RULE_CAST_OP,FOLLOW_RULE_CAST_OP_in_ruleCast8418); 

            			newLeafNode(lv_operation_2_0, grammarAccess.getCastAccess().getOperationCAST_OPTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCastRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operation",
                    		lv_operation_2_0, 
                    		"CAST_OP");
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3600:2: ( ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3601:1: ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3601:1: ( (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3602:1: (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3602:1: (lv_from_3_1= ruleTypeUse | lv_from_3_2= ruleAggregate_Type )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_INT_TYPE||LA77_0==RULE_VALID_ID||(LA77_0>=RULE_PRIMITIVE_VALUE && LA77_0<=RULE_FLOATING_POINT_TYPE)) ) {
                alt77=1;
            }
            else if ( (LA77_0==46||LA77_0==79||(LA77_0>=93 && LA77_0<=94)) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3603:3: lv_from_3_1= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getFromTypeUseParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleCast8446);
                    lv_from_3_1=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastRule());
                    	        }
                           		set(
                           			current, 
                           			"from",
                            		lv_from_3_1, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3618:8: lv_from_3_2= ruleAggregate_Type
                    {
                     
                    	        newCompositeNode(grammarAccess.getCastAccess().getFromAggregate_TypeParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAggregate_Type_in_ruleCast8465);
                    lv_from_3_2=ruleAggregate_Type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCastRule());
                    	        }
                           		set(
                           			current, 
                           			"from",
                            		lv_from_3_2, 
                            		"Aggregate_Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3636:2: ( (lv_value_4_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3637:1: (lv_value_4_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3637:1: (lv_value_4_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3638:3: lv_value_4_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getValueValueParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleCast8489);
            lv_value_4_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_4_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,118,FOLLOW_118_in_ruleCast8501); 

                	newLeafNode(otherlv_5, grammarAccess.getCastAccess().getToKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3658:1: ( (lv_to_6_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3659:1: (lv_to_6_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3659:1: (lv_to_6_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3660:3: lv_to_6_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getCastAccess().getToTypeUseParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleCast8522);
            lv_to_6_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCastRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_6_0, 
                    		"TypeUse");
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


    // $ANTLR start "entryRuleNestedCast"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3684:1: entryRuleNestedCast returns [EObject current=null] : iv_ruleNestedCast= ruleNestedCast EOF ;
    public final EObject entryRuleNestedCast() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedCast = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3685:2: (iv_ruleNestedCast= ruleNestedCast EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3686:2: iv_ruleNestedCast= ruleNestedCast EOF
            {
             newCompositeNode(grammarAccess.getNestedCastRule()); 
            pushFollow(FOLLOW_ruleNestedCast_in_entryRuleNestedCast8558);
            iv_ruleNestedCast=ruleNestedCast();

            state._fsp--;

             current =iv_ruleNestedCast; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedCast8568); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedCast"


    // $ANTLR start "ruleNestedCast"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3693:1: ruleNestedCast returns [EObject current=null] : ( ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')' ) ;
    public final EObject ruleNestedCast() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_from_2_1 = null;

        EObject lv_from_2_2 = null;

        EObject lv_value_3_0 = null;

        EObject lv_to_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3696:28: ( ( ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3697:1: ( ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3697:1: ( ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3697:2: ( (lv_operation_0_0= RULE_CAST_OP ) ) otherlv_1= '(' ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= 'to' ( (lv_to_5_0= ruleTypeUse ) ) otherlv_6= ')'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3697:2: ( (lv_operation_0_0= RULE_CAST_OP ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3698:1: (lv_operation_0_0= RULE_CAST_OP )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3698:1: (lv_operation_0_0= RULE_CAST_OP )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3699:3: lv_operation_0_0= RULE_CAST_OP
            {
            lv_operation_0_0=(Token)match(input,RULE_CAST_OP,FOLLOW_RULE_CAST_OP_in_ruleNestedCast8610); 

            			newLeafNode(lv_operation_0_0, grammarAccess.getNestedCastAccess().getOperationCAST_OPTerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getNestedCastRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operation",
                    		lv_operation_0_0, 
                    		"CAST_OP");
            	    

            }


            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleNestedCast8627); 

                	newLeafNode(otherlv_1, grammarAccess.getNestedCastAccess().getLeftParenthesisKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3719:1: ( ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3720:1: ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3720:1: ( (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3721:1: (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3721:1: (lv_from_2_1= ruleTypeUse | lv_from_2_2= ruleAggregate_Type )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_INT_TYPE||LA78_0==RULE_VALID_ID||(LA78_0>=RULE_PRIMITIVE_VALUE && LA78_0<=RULE_FLOATING_POINT_TYPE)) ) {
                alt78=1;
            }
            else if ( (LA78_0==46||LA78_0==79||(LA78_0>=93 && LA78_0<=94)) ) {
                alt78=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3722:3: lv_from_2_1= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedCastAccess().getFromTypeUseParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleNestedCast8650);
                    lv_from_2_1=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNestedCastRule());
                    	        }
                           		set(
                           			current, 
                           			"from",
                            		lv_from_2_1, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3737:8: lv_from_2_2= ruleAggregate_Type
                    {
                     
                    	        newCompositeNode(grammarAccess.getNestedCastAccess().getFromAggregate_TypeParserRuleCall_2_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleAggregate_Type_in_ruleNestedCast8669);
                    lv_from_2_2=ruleAggregate_Type();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getNestedCastRule());
                    	        }
                           		set(
                           			current, 
                           			"from",
                            		lv_from_2_2, 
                            		"Aggregate_Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3755:2: ( (lv_value_3_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3756:1: (lv_value_3_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3756:1: (lv_value_3_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3757:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getNestedCastAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleNestedCast8693);
            lv_value_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNestedCastRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,118,FOLLOW_118_in_ruleNestedCast8705); 

                	newLeafNode(otherlv_4, grammarAccess.getNestedCastAccess().getToKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3777:1: ( (lv_to_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3778:1: (lv_to_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3778:1: (lv_to_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3779:3: lv_to_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getNestedCastAccess().getToTypeUseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleNestedCast8726);
            lv_to_5_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNestedCastRule());
            	        }
                   		set(
                   			current, 
                   			"to",
                    		lv_to_5_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,51,FOLLOW_51_in_ruleNestedCast8738); 

                	newLeafNode(otherlv_6, grammarAccess.getNestedCastAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedCast"


    // $ANTLR start "entryRuleMetaArgValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3807:1: entryRuleMetaArgValue returns [EObject current=null] : iv_ruleMetaArgValue= ruleMetaArgValue EOF ;
    public final EObject entryRuleMetaArgValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetaArgValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3808:2: (iv_ruleMetaArgValue= ruleMetaArgValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3809:2: iv_ruleMetaArgValue= ruleMetaArgValue EOF
            {
             newCompositeNode(grammarAccess.getMetaArgValueRule()); 
            pushFollow(FOLLOW_ruleMetaArgValue_in_entryRuleMetaArgValue8774);
            iv_ruleMetaArgValue=ruleMetaArgValue();

            state._fsp--;

             current =iv_ruleMetaArgValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetaArgValue8784); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMetaArgValue"


    // $ANTLR start "ruleMetaArgValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3816:1: ruleMetaArgValue returns [EObject current=null] : ( ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) ) ) ;
    public final EObject ruleMetaArgValue() throws RecognitionException {
        EObject current = null;

        Token lv_arg_0_0=null;
        Token lv_value_1_1=null;
        Token lv_value_1_2=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3819:28: ( ( ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3820:1: ( ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3820:1: ( ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3820:2: ( (lv_arg_0_0= RULE_METADATA ) ) ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3820:2: ( (lv_arg_0_0= RULE_METADATA ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3821:1: (lv_arg_0_0= RULE_METADATA )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3821:1: (lv_arg_0_0= RULE_METADATA )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3822:3: lv_arg_0_0= RULE_METADATA
            {
            lv_arg_0_0=(Token)match(input,RULE_METADATA,FOLLOW_RULE_METADATA_in_ruleMetaArgValue8826); 

            			newLeafNode(lv_arg_0_0, grammarAccess.getMetaArgValueAccess().getArgMETADATATerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetaArgValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"arg",
                    		lv_arg_0_0, 
                    		"METADATA");
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3838:2: ( ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3839:1: ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3839:1: ( (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3840:1: (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3840:1: (lv_value_1_1= RULE_METADATA | lv_value_1_2= RULE_STRING )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_METADATA) ) {
                alt79=1;
            }
            else if ( (LA79_0==RULE_STRING) ) {
                alt79=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3841:3: lv_value_1_1= RULE_METADATA
                    {
                    lv_value_1_1=(Token)match(input,RULE_METADATA,FOLLOW_RULE_METADATA_in_ruleMetaArgValue8850); 

                    			newLeafNode(lv_value_1_1, grammarAccess.getMetaArgValueAccess().getValueMETADATATerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetaArgValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_1, 
                            		"METADATA");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3856:8: lv_value_1_2= RULE_STRING
                    {
                    lv_value_1_2=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMetaArgValue8870); 

                    			newLeafNode(lv_value_1_2, grammarAccess.getMetaArgValueAccess().getValueSTRINGTerminalRuleCall_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetaArgValueRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_2, 
                            		"STRING");
                    	    

                    }
                    break;

            }


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
    // $ANTLR end "ruleMetaArgValue"


    // $ANTLR start "entryRuleMeta"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3882:1: entryRuleMeta returns [EObject current=null] : iv_ruleMeta= ruleMeta EOF ;
    public final EObject entryRuleMeta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeta = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3883:2: (iv_ruleMeta= ruleMeta EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3884:2: iv_ruleMeta= ruleMeta EOF
            {
             newCompositeNode(grammarAccess.getMetaRule()); 
            pushFollow(FOLLOW_ruleMeta_in_entryRuleMeta8914);
            iv_ruleMeta=ruleMeta();

            state._fsp--;

             current =iv_ruleMeta; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMeta8924); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeta"


    // $ANTLR start "ruleMeta"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3891:1: ruleMeta returns [EObject current=null] : ( (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) ) | ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) ) ) ;
    public final EObject ruleMeta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_meta_1_0=null;
        EObject lv_arg_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3894:28: ( ( (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) ) | ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3895:1: ( (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) ) | ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3895:1: ( (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) ) | ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) ) )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==119) ) {
                alt81=1;
            }
            else if ( (LA81_0==RULE_INT||LA81_0==RULE_CAST_OP||LA81_0==RULE_INT_TYPE||LA81_0==RULE_BOOL||LA81_0==RULE_STRING||LA81_0==RULE_VALID_ID||(LA81_0>=RULE_PRIMITIVE_VALUE && LA81_0<=RULE_INITIALIZER)||LA81_0==29||LA81_0==122) ) {
                alt81=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }
            switch (alt81) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3895:2: (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3895:2: (otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3895:4: otherlv_0= 'metadata' ( (lv_meta_1_0= RULE_METADATA ) )
                    {
                    otherlv_0=(Token)match(input,119,FOLLOW_119_in_ruleMeta8962); 

                        	newLeafNode(otherlv_0, grammarAccess.getMetaAccess().getMetadataKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3899:1: ( (lv_meta_1_0= RULE_METADATA ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3900:1: (lv_meta_1_0= RULE_METADATA )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3900:1: (lv_meta_1_0= RULE_METADATA )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3901:3: lv_meta_1_0= RULE_METADATA
                    {
                    lv_meta_1_0=(Token)match(input,RULE_METADATA,FOLLOW_RULE_METADATA_in_ruleMeta8979); 

                    			newLeafNode(lv_meta_1_0, grammarAccess.getMetaAccess().getMetaMETADATATerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getMetaRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"meta",
                            		lv_meta_1_0, 
                            		"METADATA");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3918:6: ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3918:6: ( ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3918:7: ( (lv_arg_2_0= rulePredefined ) )? ( (lv_value_3_0= ruleValue ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3918:7: ( (lv_arg_2_0= rulePredefined ) )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_PRIMITIVE_VALUE) ) {
                        int LA80_1 = input.LA(2);

                        if ( (LA80_1==RULE_INT||LA80_1==RULE_CAST_OP||LA80_1==RULE_BOOL||LA80_1==RULE_STRING||(LA80_1>=RULE_VALID_ID && LA80_1<=RULE_PRIMITIVE_VALUE)||LA80_1==RULE_INITIALIZER||LA80_1==29||LA80_1==122) ) {
                            alt80=1;
                        }
                    }
                    else if ( (LA80_0==RULE_INT_TYPE||LA80_0==RULE_FLOATING_POINT_TYPE) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3919:1: (lv_arg_2_0= rulePredefined )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3919:1: (lv_arg_2_0= rulePredefined )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3920:3: lv_arg_2_0= rulePredefined
                            {
                             
                            	        newCompositeNode(grammarAccess.getMetaAccess().getArgPredefinedParserRuleCall_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_rulePredefined_in_ruleMeta9013);
                            lv_arg_2_0=rulePredefined();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getMetaRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"arg",
                                    		lv_arg_2_0, 
                                    		"Predefined");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3936:3: ( (lv_value_3_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3937:1: (lv_value_3_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3937:1: (lv_value_3_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3938:3: lv_value_3_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getMetaAccess().getValueValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleMeta9035);
                    lv_value_3_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getMetaRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
                            		"Value");
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
    // $ANTLR end "ruleMeta"


    // $ANTLR start "entryRuleMetadataValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3962:1: entryRuleMetadataValue returns [EObject current=null] : iv_ruleMetadataValue= ruleMetadataValue EOF ;
    public final EObject entryRuleMetadataValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMetadataValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3963:2: (iv_ruleMetadataValue= ruleMetadataValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3964:2: iv_ruleMetadataValue= ruleMetadataValue EOF
            {
             newCompositeNode(grammarAccess.getMetadataValueRule()); 
            pushFollow(FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue9072);
            iv_ruleMetadataValue=ruleMetadataValue();

            state._fsp--;

             current =iv_ruleMetadataValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMetadataValue9082); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3971:1: ruleMetadataValue returns [EObject current=null] : ( ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleMetadataValue() throws RecognitionException {
        EObject current = null;

        Token lv_nodeId_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_values_6_0 = null;

        EObject lv_values_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3974:28: ( ( ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3975:1: ( ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3975:1: ( ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3975:2: ( (lv_nodeId_0_0= RULE_METADATA ) ) otherlv_1= '=' (otherlv_2= 'metadata' )? ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' ) ( (lv_values_6_0= ruleMeta ) ) (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )* otherlv_9= '}'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3975:2: ( (lv_nodeId_0_0= RULE_METADATA ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3976:1: (lv_nodeId_0_0= RULE_METADATA )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3976:1: (lv_nodeId_0_0= RULE_METADATA )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3977:3: lv_nodeId_0_0= RULE_METADATA
            {
            lv_nodeId_0_0=(Token)match(input,RULE_METADATA,FOLLOW_RULE_METADATA_in_ruleMetadataValue9124); 

            			newLeafNode(lv_nodeId_0_0, grammarAccess.getMetadataValueAccess().getNodeIdMETADATATerminalRuleCall_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getMetadataValueRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"nodeId",
                    		lv_nodeId_0_0, 
                    		"METADATA");
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleMetadataValue9141); 

                	newLeafNode(otherlv_1, grammarAccess.getMetadataValueAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3997:1: (otherlv_2= 'metadata' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==119) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:3997:3: otherlv_2= 'metadata'
                    {
                    otherlv_2=(Token)match(input,119,FOLLOW_119_in_ruleMetadataValue9154); 

                        	newLeafNode(otherlv_2, grammarAccess.getMetadataValueAccess().getMetadataKeyword_2());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4001:3: ( (otherlv_3= '!' otherlv_4= '{' ) | otherlv_5= '!{' )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==120) ) {
                alt83=1;
            }
            else if ( (LA83_0==121) ) {
                alt83=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4001:4: (otherlv_3= '!' otherlv_4= '{' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4001:4: (otherlv_3= '!' otherlv_4= '{' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4001:6: otherlv_3= '!' otherlv_4= '{'
                    {
                    otherlv_3=(Token)match(input,120,FOLLOW_120_in_ruleMetadataValue9170); 

                        	newLeafNode(otherlv_3, grammarAccess.getMetadataValueAccess().getExclamationMarkKeyword_3_0_0());
                        
                    otherlv_4=(Token)match(input,94,FOLLOW_94_in_ruleMetadataValue9182); 

                        	newLeafNode(otherlv_4, grammarAccess.getMetadataValueAccess().getLeftCurlyBracketKeyword_3_0_1());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4010:7: otherlv_5= '!{'
                    {
                    otherlv_5=(Token)match(input,121,FOLLOW_121_in_ruleMetadataValue9201); 

                        	newLeafNode(otherlv_5, grammarAccess.getMetadataValueAccess().getExclamationMarkLeftCurlyBracketKeyword_3_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4014:2: ( (lv_values_6_0= ruleMeta ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4015:1: (lv_values_6_0= ruleMeta )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4015:1: (lv_values_6_0= ruleMeta )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4016:3: lv_values_6_0= ruleMeta
            {
             
            	        newCompositeNode(grammarAccess.getMetadataValueAccess().getValuesMetaParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleMeta_in_ruleMetadataValue9223);
            lv_values_6_0=ruleMeta();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMetadataValueRule());
            	        }
                   		add(
                   			current, 
                   			"values",
                    		lv_values_6_0, 
                    		"Meta");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4032:2: (otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) ) )*
            loop84:
            do {
                int alt84=2;
                int LA84_0 = input.LA(1);

                if ( (LA84_0==80) ) {
                    alt84=1;
                }


                switch (alt84) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4032:4: otherlv_7= ',' ( (lv_values_8_0= ruleMeta ) )
            	    {
            	    otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleMetadataValue9236); 

            	        	newLeafNode(otherlv_7, grammarAccess.getMetadataValueAccess().getCommaKeyword_5_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4036:1: ( (lv_values_8_0= ruleMeta ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4037:1: (lv_values_8_0= ruleMeta )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4037:1: (lv_values_8_0= ruleMeta )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4038:3: lv_values_8_0= ruleMeta
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getMetadataValueAccess().getValuesMetaParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMeta_in_ruleMetadataValue9257);
            	    lv_values_8_0=ruleMeta();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getMetadataValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"values",
            	            		lv_values_8_0, 
            	            		"Meta");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop84;
                }
            } while (true);

            otherlv_9=(Token)match(input,95,FOLLOW_95_in_ruleMetadataValue9271); 

                	newLeafNode(otherlv_9, grammarAccess.getMetadataValueAccess().getRightCurlyBracketKeyword_6());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleGetElementPtr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4066:1: entryRuleGetElementPtr returns [EObject current=null] : iv_ruleGetElementPtr= ruleGetElementPtr EOF ;
    public final EObject entryRuleGetElementPtr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGetElementPtr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4067:2: (iv_ruleGetElementPtr= ruleGetElementPtr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4068:2: iv_ruleGetElementPtr= ruleGetElementPtr EOF
            {
             newCompositeNode(grammarAccess.getGetElementPtrRule()); 
            pushFollow(FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr9307);
            iv_ruleGetElementPtr=ruleGetElementPtr();

            state._fsp--;

             current =iv_ruleGetElementPtr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGetElementPtr9317); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4075:1: ruleGetElementPtr returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggerate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indTypes_6_0= ruleTypeUse ) ) ( (lv_indizies_7_0= ruleValue ) ) )* ) ) ;
    public final EObject ruleGetElementPtr() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_result_0_0 = null;

        EObject lv_aggerate_4_0 = null;

        EObject lv_indTypes_6_0 = null;

        EObject lv_indizies_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4078:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggerate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indTypes_6_0= ruleTypeUse ) ) ( (lv_indizies_7_0= ruleValue ) ) )* ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4079:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggerate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indTypes_6_0= ruleTypeUse ) ) ( (lv_indizies_7_0= ruleValue ) ) )* ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4079:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggerate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indTypes_6_0= ruleTypeUse ) ) ( (lv_indizies_7_0= ruleValue ) ) )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4079:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'getelementptr' (otherlv_3= 'inbounds' )? ( ( (lv_aggerate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indTypes_6_0= ruleTypeUse ) ) ( (lv_indizies_7_0= ruleValue ) ) )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4079:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4080:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4080:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4081:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleGetElementPtr9363);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleGetElementPtr9375); 

                	newLeafNode(otherlv_1, grammarAccess.getGetElementPtrAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,122,FOLLOW_122_in_ruleGetElementPtr9387); 

                	newLeafNode(otherlv_2, grammarAccess.getGetElementPtrAccess().getGetelementptrKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4105:1: (otherlv_3= 'inbounds' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==123) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4105:3: otherlv_3= 'inbounds'
                    {
                    otherlv_3=(Token)match(input,123,FOLLOW_123_in_ruleGetElementPtr9400); 

                        	newLeafNode(otherlv_3, grammarAccess.getGetElementPtrAccess().getInboundsKeyword_3());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4109:3: ( ( (lv_aggerate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indTypes_6_0= ruleTypeUse ) ) ( (lv_indizies_7_0= ruleValue ) ) )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4109:4: ( (lv_aggerate_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_indTypes_6_0= ruleTypeUse ) ) ( (lv_indizies_7_0= ruleValue ) ) )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4109:4: ( (lv_aggerate_4_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4110:1: (lv_aggerate_4_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4110:1: (lv_aggerate_4_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4111:3: lv_aggerate_4_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getAggerateParameterParserRuleCall_4_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleGetElementPtr9424);
            lv_aggerate_4_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	        }
                   		set(
                   			current, 
                   			"aggerate",
                    		lv_aggerate_4_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4127:2: (otherlv_5= ',' ( (lv_indTypes_6_0= ruleTypeUse ) ) ( (lv_indizies_7_0= ruleValue ) ) )*
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==80) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4127:4: otherlv_5= ',' ( (lv_indTypes_6_0= ruleTypeUse ) ) ( (lv_indizies_7_0= ruleValue ) )
            	    {
            	    otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleGetElementPtr9437); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGetElementPtrAccess().getCommaKeyword_4_1_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4131:1: ( (lv_indTypes_6_0= ruleTypeUse ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4132:1: (lv_indTypes_6_0= ruleTypeUse )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4132:1: (lv_indTypes_6_0= ruleTypeUse )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4133:3: lv_indTypes_6_0= ruleTypeUse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getIndTypesTypeUseParserRuleCall_4_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeUse_in_ruleGetElementPtr9458);
            	    lv_indTypes_6_0=ruleTypeUse();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indTypes",
            	            		lv_indTypes_6_0, 
            	            		"TypeUse");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4149:2: ( (lv_indizies_7_0= ruleValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4150:1: (lv_indizies_7_0= ruleValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4150:1: (lv_indizies_7_0= ruleValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4151:3: lv_indizies_7_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGetElementPtrAccess().getIndiziesValueParserRuleCall_4_1_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleGetElementPtr9479);
            	    lv_indizies_7_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGetElementPtrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indizies",
            	            		lv_indizies_7_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop86;
                }
            } while (true);


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
    // $ANTLR end "ruleGetElementPtr"


    // $ANTLR start "entryRuleNestedGetElementPtr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4175:1: entryRuleNestedGetElementPtr returns [EObject current=null] : iv_ruleNestedGetElementPtr= ruleNestedGetElementPtr EOF ;
    public final EObject entryRuleNestedGetElementPtr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedGetElementPtr = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4176:2: (iv_ruleNestedGetElementPtr= ruleNestedGetElementPtr EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4177:2: iv_ruleNestedGetElementPtr= ruleNestedGetElementPtr EOF
            {
             newCompositeNode(grammarAccess.getNestedGetElementPtrRule()); 
            pushFollow(FOLLOW_ruleNestedGetElementPtr_in_entryRuleNestedGetElementPtr9518);
            iv_ruleNestedGetElementPtr=ruleNestedGetElementPtr();

            state._fsp--;

             current =iv_ruleNestedGetElementPtr; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNestedGetElementPtr9528); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedGetElementPtr"


    // $ANTLR start "ruleNestedGetElementPtr"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4184:1: ruleNestedGetElementPtr returns [EObject current=null] : (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indTypes_5_0= ruleTypeUse ) ) ( (lv_indizies_6_0= ruleValue ) ) )* otherlv_7= ')' ) ) ;
    public final EObject ruleNestedGetElementPtr() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_aggerate_3_0 = null;

        EObject lv_indTypes_5_0 = null;

        EObject lv_indizies_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4187:28: ( (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indTypes_5_0= ruleTypeUse ) ) ( (lv_indizies_6_0= ruleValue ) ) )* otherlv_7= ')' ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4188:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indTypes_5_0= ruleTypeUse ) ) ( (lv_indizies_6_0= ruleValue ) ) )* otherlv_7= ')' ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4188:1: (otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indTypes_5_0= ruleTypeUse ) ) ( (lv_indizies_6_0= ruleValue ) ) )* otherlv_7= ')' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4188:3: otherlv_0= 'getelementptr' (otherlv_1= 'inbounds' )? (otherlv_2= '(' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indTypes_5_0= ruleTypeUse ) ) ( (lv_indizies_6_0= ruleValue ) ) )* otherlv_7= ')' )
            {
            otherlv_0=(Token)match(input,122,FOLLOW_122_in_ruleNestedGetElementPtr9565); 

                	newLeafNode(otherlv_0, grammarAccess.getNestedGetElementPtrAccess().getGetelementptrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4192:1: (otherlv_1= 'inbounds' )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==123) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4192:3: otherlv_1= 'inbounds'
                    {
                    otherlv_1=(Token)match(input,123,FOLLOW_123_in_ruleNestedGetElementPtr9578); 

                        	newLeafNode(otherlv_1, grammarAccess.getNestedGetElementPtrAccess().getInboundsKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4196:3: (otherlv_2= '(' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indTypes_5_0= ruleTypeUse ) ) ( (lv_indizies_6_0= ruleValue ) ) )* otherlv_7= ')' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4196:5: otherlv_2= '(' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_indTypes_5_0= ruleTypeUse ) ) ( (lv_indizies_6_0= ruleValue ) ) )* otherlv_7= ')'
            {
            otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleNestedGetElementPtr9593); 

                	newLeafNode(otherlv_2, grammarAccess.getNestedGetElementPtrAccess().getLeftParenthesisKeyword_2_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4200:1: ( (lv_aggerate_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4201:1: (lv_aggerate_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4201:1: (lv_aggerate_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4202:3: lv_aggerate_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getNestedGetElementPtrAccess().getAggerateParameterParserRuleCall_2_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleNestedGetElementPtr9614);
            lv_aggerate_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getNestedGetElementPtrRule());
            	        }
                   		set(
                   			current, 
                   			"aggerate",
                    		lv_aggerate_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4218:2: (otherlv_4= ',' ( (lv_indTypes_5_0= ruleTypeUse ) ) ( (lv_indizies_6_0= ruleValue ) ) )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==80) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4218:4: otherlv_4= ',' ( (lv_indTypes_5_0= ruleTypeUse ) ) ( (lv_indizies_6_0= ruleValue ) )
            	    {
            	    otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleNestedGetElementPtr9627); 

            	        	newLeafNode(otherlv_4, grammarAccess.getNestedGetElementPtrAccess().getCommaKeyword_2_2_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4222:1: ( (lv_indTypes_5_0= ruleTypeUse ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4223:1: (lv_indTypes_5_0= ruleTypeUse )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4223:1: (lv_indTypes_5_0= ruleTypeUse )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4224:3: lv_indTypes_5_0= ruleTypeUse
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNestedGetElementPtrAccess().getIndTypesTypeUseParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleTypeUse_in_ruleNestedGetElementPtr9648);
            	    lv_indTypes_5_0=ruleTypeUse();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNestedGetElementPtrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indTypes",
            	            		lv_indTypes_5_0, 
            	            		"TypeUse");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4240:2: ( (lv_indizies_6_0= ruleValue ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4241:1: (lv_indizies_6_0= ruleValue )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4241:1: (lv_indizies_6_0= ruleValue )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4242:3: lv_indizies_6_0= ruleValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getNestedGetElementPtrAccess().getIndiziesValueParserRuleCall_2_2_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValue_in_ruleNestedGetElementPtr9669);
            	    lv_indizies_6_0=ruleValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getNestedGetElementPtrRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"indizies",
            	            		lv_indizies_6_0, 
            	            		"Value");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            otherlv_7=(Token)match(input,51,FOLLOW_51_in_ruleNestedGetElementPtr9683); 

                	newLeafNode(otherlv_7, grammarAccess.getNestedGetElementPtrAccess().getRightParenthesisKeyword_2_3());
                

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
    // $ANTLR end "ruleNestedGetElementPtr"


    // $ANTLR start "entryRuleFence"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4270:1: entryRuleFence returns [EObject current=null] : iv_ruleFence= ruleFence EOF ;
    public final EObject entryRuleFence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFence = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4271:2: (iv_ruleFence= ruleFence EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4272:2: iv_ruleFence= ruleFence EOF
            {
             newCompositeNode(grammarAccess.getFenceRule()); 
            pushFollow(FOLLOW_ruleFence_in_entryRuleFence9720);
            iv_ruleFence=ruleFence();

            state._fsp--;

             current =iv_ruleFence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFence9730); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4279:1: ruleFence returns [EObject current=null] : (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) ) ) ;
    public final EObject ruleFence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_ordering_2_0=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4282:28: ( (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4283:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4283:1: (otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4283:3: otherlv_0= 'fence' (otherlv_1= 'singlethread' )? ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) )
            {
            otherlv_0=(Token)match(input,124,FOLLOW_124_in_ruleFence9767); 

                	newLeafNode(otherlv_0, grammarAccess.getFenceAccess().getFenceKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4287:1: (otherlv_1= 'singlethread' )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==125) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4287:3: otherlv_1= 'singlethread'
                    {
                    otherlv_1=(Token)match(input,125,FOLLOW_125_in_ruleFence9780); 

                        	newLeafNode(otherlv_1, grammarAccess.getFenceAccess().getSinglethreadKeyword_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4291:3: ( (lv_ordering_2_0= RULE_ATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4292:1: (lv_ordering_2_0= RULE_ATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4292:1: (lv_ordering_2_0= RULE_ATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4293:3: lv_ordering_2_0= RULE_ATOMIC_ORDERING
            {
            lv_ordering_2_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleFence9799); 

            			newLeafNode(lv_ordering_2_0, grammarAccess.getFenceAccess().getOrderingATOMIC_ORDERINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getFenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ordering",
                    		lv_ordering_2_0, 
                    		"ATOMIC_ORDERING");
            	    

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


    // $ANTLR start "entryRuleCmpXchg"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4317:1: entryRuleCmpXchg returns [EObject current=null] : iv_ruleCmpXchg= ruleCmpXchg EOF ;
    public final EObject entryRuleCmpXchg() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCmpXchg = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4318:2: (iv_ruleCmpXchg= ruleCmpXchg EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4319:2: iv_ruleCmpXchg= ruleCmpXchg EOF
            {
             newCompositeNode(grammarAccess.getCmpXchgRule()); 
            pushFollow(FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg9840);
            iv_ruleCmpXchg=ruleCmpXchg();

            state._fsp--;

             current =iv_ruleCmpXchg; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCmpXchg9850); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4326:1: ruleCmpXchg returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) ) ) ;
    public final EObject ruleCmpXchg() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_volatile_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_ordering_10_0=null;
        EObject lv_result_0_0 = null;

        EObject lv_address_4_0 = null;

        EObject lv_value_6_0 = null;

        EObject lv_newValue_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4329:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4330:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4330:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4330:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'cmpxchg' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_address_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) otherlv_7= ',' ( (lv_newValue_8_0= ruleParameter ) ) (otherlv_9= 'singlethread' )? ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4330:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4331:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4331:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4332:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleCmpXchg9896);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleCmpXchg9908); 

                	newLeafNode(otherlv_1, grammarAccess.getCmpXchgAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,126,FOLLOW_126_in_ruleCmpXchg9920); 

                	newLeafNode(otherlv_2, grammarAccess.getCmpXchgAccess().getCmpxchgKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4356:1: ( (lv_volatile_3_0= 'volatile' ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==127) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4357:1: (lv_volatile_3_0= 'volatile' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4357:1: (lv_volatile_3_0= 'volatile' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4358:3: lv_volatile_3_0= 'volatile'
                    {
                    lv_volatile_3_0=(Token)match(input,127,FOLLOW_127_in_ruleCmpXchg9938); 

                            newLeafNode(lv_volatile_3_0, grammarAccess.getCmpXchgAccess().getVolatileVolatileKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCmpXchgRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4371:3: ( (lv_address_4_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4372:1: (lv_address_4_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4372:1: (lv_address_4_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4373:3: lv_address_4_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getAddressParameterParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCmpXchg9973);
            lv_address_4_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"address",
                    		lv_address_4_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleCmpXchg9985); 

                	newLeafNode(otherlv_5, grammarAccess.getCmpXchgAccess().getCommaKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4393:1: ( (lv_value_6_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4394:1: (lv_value_6_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4394:1: (lv_value_6_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4395:3: lv_value_6_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getValueParameterParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCmpXchg10006);
            lv_value_6_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_6_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleCmpXchg10018); 

                	newLeafNode(otherlv_7, grammarAccess.getCmpXchgAccess().getCommaKeyword_7());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4415:1: ( (lv_newValue_8_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4416:1: (lv_newValue_8_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4416:1: (lv_newValue_8_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4417:3: lv_newValue_8_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCmpXchgAccess().getNewValueParameterParserRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCmpXchg10039);
            lv_newValue_8_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCmpXchgRule());
            	        }
                   		set(
                   			current, 
                   			"newValue",
                    		lv_newValue_8_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4433:2: (otherlv_9= 'singlethread' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==125) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4433:4: otherlv_9= 'singlethread'
                    {
                    otherlv_9=(Token)match(input,125,FOLLOW_125_in_ruleCmpXchg10052); 

                        	newLeafNode(otherlv_9, grammarAccess.getCmpXchgAccess().getSinglethreadKeyword_9());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4437:3: ( (lv_ordering_10_0= RULE_ATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4438:1: (lv_ordering_10_0= RULE_ATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4438:1: (lv_ordering_10_0= RULE_ATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4439:3: lv_ordering_10_0= RULE_ATOMIC_ORDERING
            {
            lv_ordering_10_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleCmpXchg10071); 

            			newLeafNode(lv_ordering_10_0, grammarAccess.getCmpXchgAccess().getOrderingATOMIC_ORDERINGTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCmpXchgRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ordering",
                    		lv_ordering_10_0, 
                    		"ATOMIC_ORDERING");
            	    

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4463:1: entryRuleAtomicRMW returns [EObject current=null] : iv_ruleAtomicRMW= ruleAtomicRMW EOF ;
    public final EObject entryRuleAtomicRMW() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicRMW = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4464:2: (iv_ruleAtomicRMW= ruleAtomicRMW EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4465:2: iv_ruleAtomicRMW= ruleAtomicRMW EOF
            {
             newCompositeNode(grammarAccess.getAtomicRMWRule()); 
            pushFollow(FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW10112);
            iv_ruleAtomicRMW=ruleAtomicRMW();

            state._fsp--;

             current =iv_ruleAtomicRMW; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicRMW10122); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4472:1: ruleAtomicRMW returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) ) ) ;
    public final EObject ruleAtomicRMW() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_volatile_3_0=null;
        Token lv_operation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_ordering_9_0=null;
        EObject lv_result_0_0 = null;

        EObject lv_address_5_0 = null;

        EObject lv_argument_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4475:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4476:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4476:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4476:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'atomicrmw' ( (lv_volatile_3_0= 'volatile' ) )? ( (lv_operation_4_0= RULE_BIN_OP ) ) ( (lv_address_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_argument_7_0= ruleParameter ) ) (otherlv_8= 'singlethread' )? ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4476:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4477:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4477:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4478:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleAtomicRMW10168);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleAtomicRMW10180); 

                	newLeafNode(otherlv_1, grammarAccess.getAtomicRMWAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,128,FOLLOW_128_in_ruleAtomicRMW10192); 

                	newLeafNode(otherlv_2, grammarAccess.getAtomicRMWAccess().getAtomicrmwKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4502:1: ( (lv_volatile_3_0= 'volatile' ) )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==127) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4503:1: (lv_volatile_3_0= 'volatile' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4503:1: (lv_volatile_3_0= 'volatile' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4504:3: lv_volatile_3_0= 'volatile'
                    {
                    lv_volatile_3_0=(Token)match(input,127,FOLLOW_127_in_ruleAtomicRMW10210); 

                            newLeafNode(lv_volatile_3_0, grammarAccess.getAtomicRMWAccess().getVolatileVolatileKeyword_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtomicRMWRule());
                    	        }
                           		setWithLastConsumed(current, "volatile", true, "volatile");
                    	    

                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4517:3: ( (lv_operation_4_0= RULE_BIN_OP ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4518:1: (lv_operation_4_0= RULE_BIN_OP )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4518:1: (lv_operation_4_0= RULE_BIN_OP )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4519:3: lv_operation_4_0= RULE_BIN_OP
            {
            lv_operation_4_0=(Token)match(input,RULE_BIN_OP,FOLLOW_RULE_BIN_OP_in_ruleAtomicRMW10241); 

            			newLeafNode(lv_operation_4_0, grammarAccess.getAtomicRMWAccess().getOperationBIN_OPTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicRMWRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"operation",
                    		lv_operation_4_0, 
                    		"BIN_OP");
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4535:2: ( (lv_address_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4536:1: (lv_address_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4536:1: (lv_address_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4537:3: lv_address_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getAddressParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleAtomicRMW10267);
            lv_address_5_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"address",
                    		lv_address_5_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleAtomicRMW10279); 

                	newLeafNode(otherlv_6, grammarAccess.getAtomicRMWAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4557:1: ( (lv_argument_7_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4558:1: (lv_argument_7_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4558:1: (lv_argument_7_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4559:3: lv_argument_7_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getAtomicRMWAccess().getArgumentParameterParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleAtomicRMW10300);
            lv_argument_7_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAtomicRMWRule());
            	        }
                   		set(
                   			current, 
                   			"argument",
                    		lv_argument_7_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4575:2: (otherlv_8= 'singlethread' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==125) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4575:4: otherlv_8= 'singlethread'
                    {
                    otherlv_8=(Token)match(input,125,FOLLOW_125_in_ruleAtomicRMW10313); 

                        	newLeafNode(otherlv_8, grammarAccess.getAtomicRMWAccess().getSinglethreadKeyword_8());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4579:3: ( (lv_ordering_9_0= RULE_ATOMIC_ORDERING ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4580:1: (lv_ordering_9_0= RULE_ATOMIC_ORDERING )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4580:1: (lv_ordering_9_0= RULE_ATOMIC_ORDERING )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4581:3: lv_ordering_9_0= RULE_ATOMIC_ORDERING
            {
            lv_ordering_9_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleAtomicRMW10332); 

            			newLeafNode(lv_ordering_9_0, grammarAccess.getAtomicRMWAccess().getOrderingATOMIC_ORDERINGTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAtomicRMWRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"ordering",
                    		lv_ordering_9_0, 
                    		"ATOMIC_ORDERING");
            	    

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


    // $ANTLR start "entryRuleLoad"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4605:1: entryRuleLoad returns [EObject current=null] : iv_ruleLoad= ruleLoad EOF ;
    public final EObject entryRuleLoad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4606:2: (iv_ruleLoad= ruleLoad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4607:2: iv_ruleLoad= ruleLoad EOF
            {
             newCompositeNode(grammarAccess.getLoadRule()); 
            pushFollow(FOLLOW_ruleLoad_in_entryRuleLoad10373);
            iv_ruleLoad=ruleLoad();

            state._fsp--;

             current =iv_ruleLoad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLoad10383); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4614:1: ruleLoad returns [EObject current=null] : ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) ) ;
    public final EObject ruleLoad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_volatile_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_volatile_5_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_atomic_15_0=null;
        Token lv_volatile_16_0=null;
        Token otherlv_18=null;
        Token lv_ordering_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_result_0_0 = null;

        EObject lv_address_6_0 = null;

        AntlrDatatypeRuleToken lv_align_9_0 = null;

        EObject lv_meta_11_0 = null;

        EObject lv_result_12_0 = null;

        EObject lv_address_17_0 = null;

        AntlrDatatypeRuleToken lv_align_22_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4617:28: ( ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4618:1: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4618:1: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_VALID_ID) ) {
                int LA101_1 = input.LA(2);

                if ( (LA101_1==77) ) {
                    int LA101_2 = input.LA(3);

                    if ( (LA101_2==129) ) {
                        int LA101_3 = input.LA(4);

                        if ( (LA101_3==130) ) {
                            alt101=2;
                        }
                        else if ( (LA101_3==RULE_INT_TYPE||LA101_3==RULE_VALID_ID||(LA101_3>=RULE_PRIMITIVE_VALUE && LA101_3<=RULE_FLOATING_POINT_TYPE)||LA101_3==46||LA101_3==79||(LA101_3>=93 && LA101_3<=94)||LA101_3==127) ) {
                            alt101=1;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 101, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA101_2==127) ) {
                        alt101=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 101, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 101, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4618:2: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4618:2: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4618:3: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) ) ( (lv_address_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4618:3: ( (lv_result_0_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4619:1: (lv_result_0_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4619:1: (lv_result_0_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4620:3: lv_result_0_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getResultAddressParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleLoad10430);
                    lv_result_0_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"result",
                            		lv_result_0_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleLoad10442); 

                        	newLeafNode(otherlv_1, grammarAccess.getLoadAccess().getEqualsSignKeyword_0_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4640:1: ( ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' ) | (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? ) )
                    int alt95=2;
                    int LA95_0 = input.LA(1);

                    if ( (LA95_0==127) ) {
                        alt95=1;
                    }
                    else if ( (LA95_0==129) ) {
                        alt95=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 95, 0, input);

                        throw nvae;
                    }
                    switch (alt95) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4640:2: ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4640:2: ( ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4640:3: ( (lv_volatile_2_0= 'volatile' ) ) otherlv_3= 'load'
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4640:3: ( (lv_volatile_2_0= 'volatile' ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4641:1: (lv_volatile_2_0= 'volatile' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4641:1: (lv_volatile_2_0= 'volatile' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4642:3: lv_volatile_2_0= 'volatile'
                            {
                            lv_volatile_2_0=(Token)match(input,127,FOLLOW_127_in_ruleLoad10462); 

                                    newLeafNode(lv_volatile_2_0, grammarAccess.getLoadAccess().getVolatileVolatileKeyword_0_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLoadRule());
                            	        }
                                   		setWithLastConsumed(current, "volatile", true, "volatile");
                            	    

                            }


                            }

                            otherlv_3=(Token)match(input,129,FOLLOW_129_in_ruleLoad10487); 

                                	newLeafNode(otherlv_3, grammarAccess.getLoadAccess().getLoadKeyword_0_2_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4660:6: (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4660:6: (otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )? )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4660:8: otherlv_4= 'load' ( (lv_volatile_5_0= 'volatile' ) )?
                            {
                            otherlv_4=(Token)match(input,129,FOLLOW_129_in_ruleLoad10507); 

                                	newLeafNode(otherlv_4, grammarAccess.getLoadAccess().getLoadKeyword_0_2_1_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4664:1: ( (lv_volatile_5_0= 'volatile' ) )?
                            int alt94=2;
                            int LA94_0 = input.LA(1);

                            if ( (LA94_0==127) ) {
                                alt94=1;
                            }
                            switch (alt94) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4665:1: (lv_volatile_5_0= 'volatile' )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4665:1: (lv_volatile_5_0= 'volatile' )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4666:3: lv_volatile_5_0= 'volatile'
                                    {
                                    lv_volatile_5_0=(Token)match(input,127,FOLLOW_127_in_ruleLoad10525); 

                                            newLeafNode(lv_volatile_5_0, grammarAccess.getLoadAccess().getVolatileVolatileKeyword_0_2_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getLoadRule());
                                    	        }
                                           		setWithLastConsumed(current, "volatile", true, "volatile");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4679:5: ( (lv_address_6_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4680:1: (lv_address_6_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4680:1: (lv_address_6_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4681:3: lv_address_6_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAddressParameterParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleLoad10562);
                    lv_address_6_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_6_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4697:2: (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )?
                    int alt96=2;
                    int LA96_0 = input.LA(1);

                    if ( (LA96_0==80) ) {
                        int LA96_1 = input.LA(2);

                        if ( (LA96_1==87) ) {
                            alt96=1;
                        }
                    }
                    switch (alt96) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4697:4: otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) )
                            {
                            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleLoad10575); 

                                	newLeafNode(otherlv_7, grammarAccess.getLoadAccess().getCommaKeyword_0_4_0());
                                
                            otherlv_8=(Token)match(input,87,FOLLOW_87_in_ruleLoad10587); 

                                	newLeafNode(otherlv_8, grammarAccess.getLoadAccess().getAlignKeyword_0_4_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4705:1: ( (lv_align_9_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4706:1: (lv_align_9_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4706:1: (lv_align_9_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4707:3: lv_align_9_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getLoadAccess().getAlignNUMBERParserRuleCall_0_4_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLoad10608);
                            lv_align_9_0=ruleNUMBER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLoadRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"align",
                                    		lv_align_9_0, 
                                    		"NUMBER");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4723:4: (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )*
                    loop97:
                    do {
                        int alt97=2;
                        int LA97_0 = input.LA(1);

                        if ( (LA97_0==80) ) {
                            alt97=1;
                        }


                        switch (alt97) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4723:6: otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,80,FOLLOW_80_in_ruleLoad10623); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getLoadAccess().getCommaKeyword_0_5_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4727:1: ( (lv_meta_11_0= ruleMetaArgValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4728:1: (lv_meta_11_0= ruleMetaArgValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4728:1: (lv_meta_11_0= ruleMetaArgValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4729:3: lv_meta_11_0= ruleMetaArgValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLoadAccess().getMetaMetaArgValueParserRuleCall_0_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetaArgValue_in_ruleLoad10644);
                    	    lv_meta_11_0=ruleMetaArgValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"meta",
                    	            		lv_meta_11_0, 
                    	            		"MetaArgValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop97;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4746:6: ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4746:6: ( ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4746:7: ( (lv_result_12_0= ruleAddress ) ) otherlv_13= '=' otherlv_14= 'load' ( (lv_atomic_15_0= 'atomic' ) ) ( (lv_volatile_16_0= 'volatile' ) )? ( (lv_address_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )?
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4746:7: ( (lv_result_12_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4747:1: (lv_result_12_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4747:1: (lv_result_12_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4748:3: lv_result_12_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getResultAddressParserRuleCall_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleLoad10675);
                    lv_result_12_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"result",
                            		lv_result_12_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_13=(Token)match(input,77,FOLLOW_77_in_ruleLoad10687); 

                        	newLeafNode(otherlv_13, grammarAccess.getLoadAccess().getEqualsSignKeyword_1_1());
                        
                    otherlv_14=(Token)match(input,129,FOLLOW_129_in_ruleLoad10699); 

                        	newLeafNode(otherlv_14, grammarAccess.getLoadAccess().getLoadKeyword_1_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4772:1: ( (lv_atomic_15_0= 'atomic' ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4773:1: (lv_atomic_15_0= 'atomic' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4773:1: (lv_atomic_15_0= 'atomic' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4774:3: lv_atomic_15_0= 'atomic'
                    {
                    lv_atomic_15_0=(Token)match(input,130,FOLLOW_130_in_ruleLoad10717); 

                            newLeafNode(lv_atomic_15_0, grammarAccess.getLoadAccess().getAtomicAtomicKeyword_1_3_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoadRule());
                    	        }
                           		setWithLastConsumed(current, "atomic", true, "atomic");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4787:2: ( (lv_volatile_16_0= 'volatile' ) )?
                    int alt98=2;
                    int LA98_0 = input.LA(1);

                    if ( (LA98_0==127) ) {
                        alt98=1;
                    }
                    switch (alt98) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4788:1: (lv_volatile_16_0= 'volatile' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4788:1: (lv_volatile_16_0= 'volatile' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4789:3: lv_volatile_16_0= 'volatile'
                            {
                            lv_volatile_16_0=(Token)match(input,127,FOLLOW_127_in_ruleLoad10748); 

                                    newLeafNode(lv_volatile_16_0, grammarAccess.getLoadAccess().getVolatileVolatileKeyword_1_4_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getLoadRule());
                            	        }
                                   		setWithLastConsumed(current, "volatile", true, "volatile");
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4802:3: ( (lv_address_17_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4803:1: (lv_address_17_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4803:1: (lv_address_17_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4804:3: lv_address_17_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getLoadAccess().getAddressParameterParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleLoad10783);
                    lv_address_17_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLoadRule());
                    	        }
                           		set(
                           			current, 
                           			"address",
                            		lv_address_17_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4820:2: (otherlv_18= 'singlethread' )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==125) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4820:4: otherlv_18= 'singlethread'
                            {
                            otherlv_18=(Token)match(input,125,FOLLOW_125_in_ruleLoad10796); 

                                	newLeafNode(otherlv_18, grammarAccess.getLoadAccess().getSinglethreadKeyword_1_6());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4824:3: ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4825:1: (lv_ordering_19_0= RULE_ATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4825:1: (lv_ordering_19_0= RULE_ATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4826:3: lv_ordering_19_0= RULE_ATOMIC_ORDERING
                    {
                    lv_ordering_19_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleLoad10815); 

                    			newLeafNode(lv_ordering_19_0, grammarAccess.getLoadAccess().getOrderingATOMIC_ORDERINGTerminalRuleCall_1_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLoadRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ordering",
                            		lv_ordering_19_0, 
                            		"ATOMIC_ORDERING");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4842:2: (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )?
                    int alt100=2;
                    int LA100_0 = input.LA(1);

                    if ( (LA100_0==80) ) {
                        alt100=1;
                    }
                    switch (alt100) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4842:4: otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) )
                            {
                            otherlv_20=(Token)match(input,80,FOLLOW_80_in_ruleLoad10833); 

                                	newLeafNode(otherlv_20, grammarAccess.getLoadAccess().getCommaKeyword_1_8_0());
                                
                            otherlv_21=(Token)match(input,87,FOLLOW_87_in_ruleLoad10845); 

                                	newLeafNode(otherlv_21, grammarAccess.getLoadAccess().getAlignKeyword_1_8_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4850:1: ( (lv_align_22_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4851:1: (lv_align_22_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4851:1: (lv_align_22_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4852:3: lv_align_22_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getLoadAccess().getAlignNUMBERParserRuleCall_1_8_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleLoad10866);
                            lv_align_22_0=ruleNUMBER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getLoadRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"align",
                                    		lv_align_22_0, 
                                    		"NUMBER");
                            	        afterParserOrEnumRuleCall();
                            	    

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4876:1: entryRuleStore returns [EObject current=null] : iv_ruleStore= ruleStore EOF ;
    public final EObject entryRuleStore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStore = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4877:2: (iv_ruleStore= ruleStore EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4878:2: iv_ruleStore= ruleStore EOF
            {
             newCompositeNode(grammarAccess.getStoreRule()); 
            pushFollow(FOLLOW_ruleStore_in_entryRuleStore10905);
            iv_ruleStore=ruleStore();

            state._fsp--;

             current =iv_ruleStore; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStore10915); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4885:1: ruleStore returns [EObject current=null] : ( ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_targetAddress_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_targetAddress_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_value_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) ) ;
    public final EObject ruleStore() throws RecognitionException {
        EObject current = null;

        Token lv_volatile_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_volatile_3_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_atomic_13_0=null;
        Token lv_volatile_14_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token lv_ordering_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        EObject lv_targetAddress_4_0 = null;

        EObject lv_value_6_0 = null;

        AntlrDatatypeRuleToken lv_align_9_0 = null;

        EObject lv_meta_11_0 = null;

        EObject lv_targetAddress_15_0 = null;

        EObject lv_value_17_0 = null;

        AntlrDatatypeRuleToken lv_align_22_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4888:28: ( ( ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_targetAddress_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_targetAddress_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_value_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:1: ( ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_targetAddress_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_targetAddress_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_value_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:1: ( ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_targetAddress_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* ) | (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_targetAddress_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_value_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? ) )
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==127) ) {
                alt109=1;
            }
            else if ( (LA109_0==131) ) {
                int LA109_2 = input.LA(2);

                if ( (LA109_2==RULE_INT_TYPE||LA109_2==RULE_VALID_ID||(LA109_2>=RULE_PRIMITIVE_VALUE && LA109_2<=RULE_FLOATING_POINT_TYPE)||LA109_2==46||LA109_2==79||(LA109_2>=93 && LA109_2<=94)||LA109_2==127) ) {
                    alt109=1;
                }
                else if ( (LA109_2==130) ) {
                    alt109=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 109, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }
            switch (alt109) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:2: ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_targetAddress_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:2: ( ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_targetAddress_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:3: ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) ) ( (lv_targetAddress_4_0= ruleParameter ) ) otherlv_5= ',' ( (lv_value_6_0= ruleParameter ) ) (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )? (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )*
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:3: ( ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' ) | (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? ) )
                    int alt103=2;
                    int LA103_0 = input.LA(1);

                    if ( (LA103_0==127) ) {
                        alt103=1;
                    }
                    else if ( (LA103_0==131) ) {
                        alt103=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 103, 0, input);

                        throw nvae;
                    }
                    switch (alt103) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:4: ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:4: ( ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:5: ( (lv_volatile_0_0= 'volatile' ) ) otherlv_1= 'store'
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4889:5: ( (lv_volatile_0_0= 'volatile' ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4890:1: (lv_volatile_0_0= 'volatile' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4890:1: (lv_volatile_0_0= 'volatile' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4891:3: lv_volatile_0_0= 'volatile'
                            {
                            lv_volatile_0_0=(Token)match(input,127,FOLLOW_127_in_ruleStore10961); 

                                    newLeafNode(lv_volatile_0_0, grammarAccess.getStoreAccess().getVolatileVolatileKeyword_0_0_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStoreRule());
                            	        }
                                   		setWithLastConsumed(current, "volatile", true, "volatile");
                            	    

                            }


                            }

                            otherlv_1=(Token)match(input,131,FOLLOW_131_in_ruleStore10986); 

                                	newLeafNode(otherlv_1, grammarAccess.getStoreAccess().getStoreKeyword_0_0_0_1());
                                

                            }


                            }
                            break;
                        case 2 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4909:6: (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4909:6: (otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )? )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4909:8: otherlv_2= 'store' ( (lv_volatile_3_0= 'volatile' ) )?
                            {
                            otherlv_2=(Token)match(input,131,FOLLOW_131_in_ruleStore11006); 

                                	newLeafNode(otherlv_2, grammarAccess.getStoreAccess().getStoreKeyword_0_0_1_0());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4913:1: ( (lv_volatile_3_0= 'volatile' ) )?
                            int alt102=2;
                            int LA102_0 = input.LA(1);

                            if ( (LA102_0==127) ) {
                                alt102=1;
                            }
                            switch (alt102) {
                                case 1 :
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4914:1: (lv_volatile_3_0= 'volatile' )
                                    {
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4914:1: (lv_volatile_3_0= 'volatile' )
                                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4915:3: lv_volatile_3_0= 'volatile'
                                    {
                                    lv_volatile_3_0=(Token)match(input,127,FOLLOW_127_in_ruleStore11024); 

                                            newLeafNode(lv_volatile_3_0, grammarAccess.getStoreAccess().getVolatileVolatileKeyword_0_0_1_1_0());
                                        

                                    	        if (current==null) {
                                    	            current = createModelElement(grammarAccess.getStoreRule());
                                    	        }
                                           		setWithLastConsumed(current, "volatile", true, "volatile");
                                    	    

                                    }


                                    }
                                    break;

                            }


                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4928:5: ( (lv_targetAddress_4_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4929:1: (lv_targetAddress_4_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4929:1: (lv_targetAddress_4_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4930:3: lv_targetAddress_4_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getTargetAddressParameterParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleStore11061);
                    lv_targetAddress_4_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"targetAddress",
                            		lv_targetAddress_4_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,80,FOLLOW_80_in_ruleStore11073); 

                        	newLeafNode(otherlv_5, grammarAccess.getStoreAccess().getCommaKeyword_0_2());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4950:1: ( (lv_value_6_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4951:1: (lv_value_6_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4951:1: (lv_value_6_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4952:3: lv_value_6_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueParameterParserRuleCall_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleStore11094);
                    lv_value_6_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4968:2: (otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) ) )?
                    int alt104=2;
                    int LA104_0 = input.LA(1);

                    if ( (LA104_0==80) ) {
                        int LA104_1 = input.LA(2);

                        if ( (LA104_1==87) ) {
                            alt104=1;
                        }
                    }
                    switch (alt104) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4968:4: otherlv_7= ',' otherlv_8= 'align' ( (lv_align_9_0= ruleNUMBER ) )
                            {
                            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleStore11107); 

                                	newLeafNode(otherlv_7, grammarAccess.getStoreAccess().getCommaKeyword_0_4_0());
                                
                            otherlv_8=(Token)match(input,87,FOLLOW_87_in_ruleStore11119); 

                                	newLeafNode(otherlv_8, grammarAccess.getStoreAccess().getAlignKeyword_0_4_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4976:1: ( (lv_align_9_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4977:1: (lv_align_9_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4977:1: (lv_align_9_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4978:3: lv_align_9_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getStoreAccess().getAlignNUMBERParserRuleCall_0_4_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleStore11140);
                            lv_align_9_0=ruleNUMBER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStoreRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"align",
                                    		lv_align_9_0, 
                                    		"NUMBER");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4994:4: (otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) ) )*
                    loop105:
                    do {
                        int alt105=2;
                        int LA105_0 = input.LA(1);

                        if ( (LA105_0==80) ) {
                            alt105=1;
                        }


                        switch (alt105) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4994:6: otherlv_10= ',' ( (lv_meta_11_0= ruleMetaArgValue ) )
                    	    {
                    	    otherlv_10=(Token)match(input,80,FOLLOW_80_in_ruleStore11155); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getStoreAccess().getCommaKeyword_0_5_0());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4998:1: ( (lv_meta_11_0= ruleMetaArgValue ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4999:1: (lv_meta_11_0= ruleMetaArgValue )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:4999:1: (lv_meta_11_0= ruleMetaArgValue )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5000:3: lv_meta_11_0= ruleMetaArgValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getStoreAccess().getMetaMetaArgValueParserRuleCall_0_5_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleMetaArgValue_in_ruleStore11176);
                    	    lv_meta_11_0=ruleMetaArgValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"meta",
                    	            		lv_meta_11_0, 
                    	            		"MetaArgValue");
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
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5017:6: (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_targetAddress_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_value_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5017:6: (otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_targetAddress_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_value_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )? )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5017:8: otherlv_12= 'store' ( (lv_atomic_13_0= 'atomic' ) ) ( (lv_volatile_14_0= 'volatile' ) )? ( (lv_targetAddress_15_0= ruleParameter ) ) otherlv_16= ',' ( (lv_value_17_0= ruleParameter ) ) (otherlv_18= 'singlethread' )? ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) ) (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )?
                    {
                    otherlv_12=(Token)match(input,131,FOLLOW_131_in_ruleStore11198); 

                        	newLeafNode(otherlv_12, grammarAccess.getStoreAccess().getStoreKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5021:1: ( (lv_atomic_13_0= 'atomic' ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5022:1: (lv_atomic_13_0= 'atomic' )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5022:1: (lv_atomic_13_0= 'atomic' )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5023:3: lv_atomic_13_0= 'atomic'
                    {
                    lv_atomic_13_0=(Token)match(input,130,FOLLOW_130_in_ruleStore11216); 

                            newLeafNode(lv_atomic_13_0, grammarAccess.getStoreAccess().getAtomicAtomicKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStoreRule());
                    	        }
                           		setWithLastConsumed(current, "atomic", true, "atomic");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5036:2: ( (lv_volatile_14_0= 'volatile' ) )?
                    int alt106=2;
                    int LA106_0 = input.LA(1);

                    if ( (LA106_0==127) ) {
                        alt106=1;
                    }
                    switch (alt106) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5037:1: (lv_volatile_14_0= 'volatile' )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5037:1: (lv_volatile_14_0= 'volatile' )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5038:3: lv_volatile_14_0= 'volatile'
                            {
                            lv_volatile_14_0=(Token)match(input,127,FOLLOW_127_in_ruleStore11247); 

                                    newLeafNode(lv_volatile_14_0, grammarAccess.getStoreAccess().getVolatileVolatileKeyword_1_2_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getStoreRule());
                            	        }
                                   		setWithLastConsumed(current, "volatile", true, "volatile");
                            	    

                            }


                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5051:3: ( (lv_targetAddress_15_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5052:1: (lv_targetAddress_15_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5052:1: (lv_targetAddress_15_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5053:3: lv_targetAddress_15_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getTargetAddressParameterParserRuleCall_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleStore11282);
                    lv_targetAddress_15_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"targetAddress",
                            		lv_targetAddress_15_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_16=(Token)match(input,80,FOLLOW_80_in_ruleStore11294); 

                        	newLeafNode(otherlv_16, grammarAccess.getStoreAccess().getCommaKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5073:1: ( (lv_value_17_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5074:1: (lv_value_17_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5074:1: (lv_value_17_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5075:3: lv_value_17_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getStoreAccess().getValueParameterParserRuleCall_1_5_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleStore11315);
                    lv_value_17_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStoreRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_17_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5091:2: (otherlv_18= 'singlethread' )?
                    int alt107=2;
                    int LA107_0 = input.LA(1);

                    if ( (LA107_0==125) ) {
                        alt107=1;
                    }
                    switch (alt107) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5091:4: otherlv_18= 'singlethread'
                            {
                            otherlv_18=(Token)match(input,125,FOLLOW_125_in_ruleStore11328); 

                                	newLeafNode(otherlv_18, grammarAccess.getStoreAccess().getSinglethreadKeyword_1_6());
                                

                            }
                            break;

                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5095:3: ( (lv_ordering_19_0= RULE_ATOMIC_ORDERING ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5096:1: (lv_ordering_19_0= RULE_ATOMIC_ORDERING )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5096:1: (lv_ordering_19_0= RULE_ATOMIC_ORDERING )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5097:3: lv_ordering_19_0= RULE_ATOMIC_ORDERING
                    {
                    lv_ordering_19_0=(Token)match(input,RULE_ATOMIC_ORDERING,FOLLOW_RULE_ATOMIC_ORDERING_in_ruleStore11347); 

                    			newLeafNode(lv_ordering_19_0, grammarAccess.getStoreAccess().getOrderingATOMIC_ORDERINGTerminalRuleCall_1_7_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getStoreRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"ordering",
                            		lv_ordering_19_0, 
                            		"ATOMIC_ORDERING");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5113:2: (otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) ) )?
                    int alt108=2;
                    int LA108_0 = input.LA(1);

                    if ( (LA108_0==80) ) {
                        alt108=1;
                    }
                    switch (alt108) {
                        case 1 :
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5113:4: otherlv_20= ',' otherlv_21= 'align' ( (lv_align_22_0= ruleNUMBER ) )
                            {
                            otherlv_20=(Token)match(input,80,FOLLOW_80_in_ruleStore11365); 

                                	newLeafNode(otherlv_20, grammarAccess.getStoreAccess().getCommaKeyword_1_8_0());
                                
                            otherlv_21=(Token)match(input,87,FOLLOW_87_in_ruleStore11377); 

                                	newLeafNode(otherlv_21, grammarAccess.getStoreAccess().getAlignKeyword_1_8_1());
                                
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5121:1: ( (lv_align_22_0= ruleNUMBER ) )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5122:1: (lv_align_22_0= ruleNUMBER )
                            {
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5122:1: (lv_align_22_0= ruleNUMBER )
                            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5123:3: lv_align_22_0= ruleNUMBER
                            {
                             
                            	        newCompositeNode(grammarAccess.getStoreAccess().getAlignNUMBERParserRuleCall_1_8_2_0()); 
                            	    
                            pushFollow(FOLLOW_ruleNUMBER_in_ruleStore11398);
                            lv_align_22_0=ruleNUMBER();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getStoreRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"align",
                                    		lv_align_22_0, 
                                    		"NUMBER");
                            	        afterParserOrEnumRuleCall();
                            	    

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5147:1: entryRuleCall returns [EObject current=null] : iv_ruleCall= ruleCall EOF ;
    public final EObject entryRuleCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCall = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5148:2: (iv_ruleCall= ruleCall EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5149:2: iv_ruleCall= ruleCall EOF
            {
             newCompositeNode(grammarAccess.getCallRule()); 
            pushFollow(FOLLOW_ruleCall_in_entryRuleCall11437);
            iv_ruleCall=ruleCall();

            state._fsp--;

             current =iv_ruleCall; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCall11447); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5156:1: ruleCall returns [EObject current=null] : ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )* ) ;
    public final EObject ruleCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token this_RETURN_ATTRIBUTES_5=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_result_0_0 = null;

        EObject lv_function_6_0 = null;

        EObject lv_pList_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5159:28: ( ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5160:1: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5160:1: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5160:2: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )? (otherlv_2= 'tail' )? otherlv_3= 'call' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )? ( (lv_function_6_0= ruleParameter ) ) ( (lv_pList_7_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5160:2: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==RULE_VALID_ID) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5160:3: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '='
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5160:3: ( (lv_result_0_0= ruleAddress ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5161:1: (lv_result_0_0= ruleAddress )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5161:1: (lv_result_0_0= ruleAddress )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5162:3: lv_result_0_0= ruleAddress
                    {
                     
                    	        newCompositeNode(grammarAccess.getCallAccess().getResultAddressParserRuleCall_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAddress_in_ruleCall11494);
                    lv_result_0_0=ruleAddress();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCallRule());
                    	        }
                           		set(
                           			current, 
                           			"result",
                            		lv_result_0_0, 
                            		"Address");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleCall11506); 

                        	newLeafNode(otherlv_1, grammarAccess.getCallAccess().getEqualsSignKeyword_0_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5182:3: (otherlv_2= 'tail' )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==132) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5182:5: otherlv_2= 'tail'
                    {
                    otherlv_2=(Token)match(input,132,FOLLOW_132_in_ruleCall11521); 

                        	newLeafNode(otherlv_2, grammarAccess.getCallAccess().getTailKeyword_1());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,133,FOLLOW_133_in_ruleCall11535); 

                	newLeafNode(otherlv_3, grammarAccess.getCallAccess().getCallKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5190:1: ( ruleCallingConv )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( ((LA112_0>=31 && LA112_0<=45)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5191:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getCallAccess().getCallingConvParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleCall11552);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5198:3: (this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RULE_RETURN_ATTRIBUTES) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5198:4: this_RETURN_ATTRIBUTES_5= RULE_RETURN_ATTRIBUTES
                    {
                    this_RETURN_ATTRIBUTES_5=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleCall11565); 
                     
                        newLeafNode(this_RETURN_ATTRIBUTES_5, grammarAccess.getCallAccess().getRETURN_ATTRIBUTESTerminalRuleCall_4()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5202:3: ( (lv_function_6_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5203:1: (lv_function_6_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5203:1: (lv_function_6_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5204:3: lv_function_6_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getFunctionParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleCall11587);
            lv_function_6_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"function",
                    		lv_function_6_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5220:2: ( (lv_pList_7_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5221:1: (lv_pList_7_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5221:1: (lv_pList_7_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5222:3: lv_pList_7_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getCallAccess().getPListParameterListParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleCall11608);
            lv_pList_7_0=ruleParameterList();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCallRule());
            	        }
                   		set(
                   			current, 
                   			"pList",
                    		lv_pList_7_0, 
                    		"ParameterList");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5238:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( ((LA114_0>=48 && LA114_0<=49)||(LA114_0>=52 && LA114_0<=67)) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5239:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getCallAccess().getFUNCTION_ATTRIBUTESParserRuleCall_7()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall11625);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5246:3: (otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER )*
            loop115:
            do {
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==80) ) {
                    alt115=1;
                }


                switch (alt115) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5246:5: otherlv_9= ',' otherlv_10= '!srcloc' otherlv_11= '!' ruleNUMBER
            	    {
            	    otherlv_9=(Token)match(input,80,FOLLOW_80_in_ruleCall11639); 

            	        	newLeafNode(otherlv_9, grammarAccess.getCallAccess().getCommaKeyword_8_0());
            	        
            	    otherlv_10=(Token)match(input,134,FOLLOW_134_in_ruleCall11651); 

            	        	newLeafNode(otherlv_10, grammarAccess.getCallAccess().getSrclocKeyword_8_1());
            	        
            	    otherlv_11=(Token)match(input,120,FOLLOW_120_in_ruleCall11663); 

            	        	newLeafNode(otherlv_11, grammarAccess.getCallAccess().getExclamationMarkKeyword_8_2());
            	        
            	     
            	            newCompositeNode(grammarAccess.getCallAccess().getNUMBERParserRuleCall_8_3()); 
            	        
            	    pushFollow(FOLLOW_ruleNUMBER_in_ruleCall11679);
            	    ruleNUMBER();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop115;
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


    // $ANTLR start "entryRuleAlloc"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5274:1: entryRuleAlloc returns [EObject current=null] : iv_ruleAlloc= ruleAlloc EOF ;
    public final EObject entryRuleAlloc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlloc = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5275:2: (iv_ruleAlloc= ruleAlloc EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5276:2: iv_ruleAlloc= ruleAlloc EOF
            {
             newCompositeNode(grammarAccess.getAllocRule()); 
            pushFollow(FOLLOW_ruleAlloc_in_entryRuleAlloc11716);
            iv_ruleAlloc=ruleAlloc();

            state._fsp--;

             current =iv_ruleAlloc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlloc11726); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5283:1: ruleAlloc returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )? ) ;
    public final EObject ruleAlloc() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_result_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_numOfElements_5_0 = null;

        AntlrDatatypeRuleToken lv_align_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5286:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5287:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5287:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5287:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'alloca' ( (lv_type_3_0= ruleTypeUse ) ) (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )? (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )?
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5287:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5288:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5288:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5289:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getAllocAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleAlloc11772);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAllocRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleAlloc11784); 

                	newLeafNode(otherlv_1, grammarAccess.getAllocAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,135,FOLLOW_135_in_ruleAlloc11796); 

                	newLeafNode(otherlv_2, grammarAccess.getAllocAccess().getAllocaKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5313:1: ( (lv_type_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5314:1: (lv_type_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5314:1: (lv_type_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5315:3: lv_type_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getAllocAccess().getTypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleAlloc11817);
            lv_type_3_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAllocRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5331:2: (otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) ) )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==80) ) {
                int LA116_1 = input.LA(2);

                if ( (LA116_1==RULE_INT_TYPE||LA116_1==RULE_VALID_ID||(LA116_1>=RULE_PRIMITIVE_VALUE && LA116_1<=RULE_FLOATING_POINT_TYPE)||LA116_1==46||LA116_1==79||(LA116_1>=93 && LA116_1<=94)) ) {
                    alt116=1;
                }
            }
            switch (alt116) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5331:4: otherlv_4= ',' ( (lv_numOfElements_5_0= ruleParameter ) )
                    {
                    otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleAlloc11830); 

                        	newLeafNode(otherlv_4, grammarAccess.getAllocAccess().getCommaKeyword_4_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5335:1: ( (lv_numOfElements_5_0= ruleParameter ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5336:1: (lv_numOfElements_5_0= ruleParameter )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5336:1: (lv_numOfElements_5_0= ruleParameter )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5337:3: lv_numOfElements_5_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getNumOfElementsParameterParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleParameter_in_ruleAlloc11851);
                    lv_numOfElements_5_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAllocRule());
                    	        }
                           		set(
                           			current, 
                           			"numOfElements",
                            		lv_numOfElements_5_0, 
                            		"Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5353:4: (otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) ) )?
            int alt117=2;
            int LA117_0 = input.LA(1);

            if ( (LA117_0==80) ) {
                alt117=1;
            }
            switch (alt117) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5353:6: otherlv_6= ',' otherlv_7= 'align' ( (lv_align_8_0= ruleNUMBER ) )
                    {
                    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleAlloc11866); 

                        	newLeafNode(otherlv_6, grammarAccess.getAllocAccess().getCommaKeyword_5_0());
                        
                    otherlv_7=(Token)match(input,87,FOLLOW_87_in_ruleAlloc11878); 

                        	newLeafNode(otherlv_7, grammarAccess.getAllocAccess().getAlignKeyword_5_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5361:1: ( (lv_align_8_0= ruleNUMBER ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5362:1: (lv_align_8_0= ruleNUMBER )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5362:1: (lv_align_8_0= ruleNUMBER )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5363:3: lv_align_8_0= ruleNUMBER
                    {
                     
                    	        newCompositeNode(grammarAccess.getAllocAccess().getAlignNUMBERParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleAlloc11899);
                    lv_align_8_0=ruleNUMBER();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAllocRule());
                    	        }
                           		set(
                           			current, 
                           			"align",
                            		lv_align_8_0, 
                            		"NUMBER");
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
    // $ANTLR end "ruleAlloc"


    // $ANTLR start "entryRulePhiCase"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5387:1: entryRulePhiCase returns [EObject current=null] : iv_rulePhiCase= rulePhiCase EOF ;
    public final EObject entryRulePhiCase() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhiCase = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5388:2: (iv_rulePhiCase= rulePhiCase EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5389:2: iv_rulePhiCase= rulePhiCase EOF
            {
             newCompositeNode(grammarAccess.getPhiCaseRule()); 
            pushFollow(FOLLOW_rulePhiCase_in_entryRulePhiCase11937);
            iv_rulePhiCase=rulePhiCase();

            state._fsp--;

             current =iv_rulePhiCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhiCase11947); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhiCase"


    // $ANTLR start "rulePhiCase"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5396:1: rulePhiCase returns [EObject current=null] : ( ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) ) ) ;
    public final EObject rulePhiCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_label_2_0=null;
        EObject lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5399:28: ( ( ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:1: ( ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:1: ( ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:2: ( (lv_value_0_0= ruleValue ) ) otherlv_1= ',' ( (lv_label_2_0= RULE_VALID_ID ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5400:2: ( (lv_value_0_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5401:1: (lv_value_0_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5401:1: (lv_value_0_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5402:3: lv_value_0_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getPhiCaseAccess().getValueValueParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_rulePhiCase11993);
            lv_value_0_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPhiCaseRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_rulePhiCase12005); 

                	newLeafNode(otherlv_1, grammarAccess.getPhiCaseAccess().getCommaKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5422:1: ( (lv_label_2_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5423:1: (lv_label_2_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5423:1: (lv_label_2_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5424:3: lv_label_2_0= RULE_VALID_ID
            {
            lv_label_2_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_rulePhiCase12022); 

            			newLeafNode(lv_label_2_0, grammarAccess.getPhiCaseAccess().getLabelVALID_IDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPhiCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"label",
                    		lv_label_2_0, 
                    		"VALID_ID");
            	    

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
    // $ANTLR end "rulePhiCase"


    // $ANTLR start "entryRulePhi"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5448:1: entryRulePhi returns [EObject current=null] : iv_rulePhi= rulePhi EOF ;
    public final EObject entryRulePhi() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePhi = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5449:2: (iv_rulePhi= rulePhi EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5450:2: iv_rulePhi= rulePhi EOF
            {
             newCompositeNode(grammarAccess.getPhiRule()); 
            pushFollow(FOLLOW_rulePhi_in_entryRulePhi12063);
            iv_rulePhi=rulePhi();

            state._fsp--;

             current =iv_rulePhi; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhi12073); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePhi"


    // $ANTLR start "rulePhi"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5457:1: rulePhi returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )* ) ;
    public final EObject rulePhi() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_result_0_0 = null;

        EObject lv_type_3_0 = null;

        EObject lv_cases_5_0 = null;

        EObject lv_cases_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5460:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )* ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5461:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )* )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5461:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )* )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5461:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'phi' ( (lv_type_3_0= ruleTypeUse ) ) otherlv_4= '[' ( (lv_cases_5_0= rulePhiCase ) ) otherlv_6= ']' (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )*
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5461:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5462:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5462:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5463:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getPhiAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_rulePhi12119);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPhiRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_rulePhi12131); 

                	newLeafNode(otherlv_1, grammarAccess.getPhiAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,136,FOLLOW_136_in_rulePhi12143); 

                	newLeafNode(otherlv_2, grammarAccess.getPhiAccess().getPhiKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5487:1: ( (lv_type_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5488:1: (lv_type_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5488:1: (lv_type_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5489:3: lv_type_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getPhiAccess().getTypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_rulePhi12164);
            lv_type_3_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPhiRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_3_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,79,FOLLOW_79_in_rulePhi12176); 

                	newLeafNode(otherlv_4, grammarAccess.getPhiAccess().getLeftSquareBracketKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5509:1: ( (lv_cases_5_0= rulePhiCase ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5510:1: (lv_cases_5_0= rulePhiCase )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5510:1: (lv_cases_5_0= rulePhiCase )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5511:3: lv_cases_5_0= rulePhiCase
            {
             
            	        newCompositeNode(grammarAccess.getPhiAccess().getCasesPhiCaseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_rulePhiCase_in_rulePhi12197);
            lv_cases_5_0=rulePhiCase();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPhiRule());
            	        }
                   		add(
                   			current, 
                   			"cases",
                    		lv_cases_5_0, 
                    		"PhiCase");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,81,FOLLOW_81_in_rulePhi12209); 

                	newLeafNode(otherlv_6, grammarAccess.getPhiAccess().getRightSquareBracketKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5531:1: (otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']' )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==80) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5531:3: otherlv_7= ',' otherlv_8= '[' ( (lv_cases_9_0= rulePhiCase ) ) otherlv_10= ']'
            	    {
            	    otherlv_7=(Token)match(input,80,FOLLOW_80_in_rulePhi12222); 

            	        	newLeafNode(otherlv_7, grammarAccess.getPhiAccess().getCommaKeyword_7_0());
            	        
            	    otherlv_8=(Token)match(input,79,FOLLOW_79_in_rulePhi12234); 

            	        	newLeafNode(otherlv_8, grammarAccess.getPhiAccess().getLeftSquareBracketKeyword_7_1());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5539:1: ( (lv_cases_9_0= rulePhiCase ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5540:1: (lv_cases_9_0= rulePhiCase )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5540:1: (lv_cases_9_0= rulePhiCase )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5541:3: lv_cases_9_0= rulePhiCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPhiAccess().getCasesPhiCaseParserRuleCall_7_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePhiCase_in_rulePhi12255);
            	    lv_cases_9_0=rulePhiCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPhiRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_9_0, 
            	            		"PhiCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    otherlv_10=(Token)match(input,81,FOLLOW_81_in_rulePhi12267); 

            	        	newLeafNode(otherlv_10, grammarAccess.getPhiAccess().getRightSquareBracketKeyword_7_3());
            	        

            	    }
            	    break;

            	default :
            	    break loop118;
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
    // $ANTLR end "rulePhi"


    // $ANTLR start "entryRuleLandingPad"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5569:1: entryRuleLandingPad returns [EObject current=null] : iv_ruleLandingPad= ruleLandingPad EOF ;
    public final EObject entryRuleLandingPad() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLandingPad = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5570:2: (iv_ruleLandingPad= ruleLandingPad EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5571:2: iv_ruleLandingPad= ruleLandingPad EOF
            {
             newCompositeNode(grammarAccess.getLandingPadRule()); 
            pushFollow(FOLLOW_ruleLandingPad_in_entryRuleLandingPad12305);
            iv_ruleLandingPad=ruleLandingPad();

            state._fsp--;

             current =iv_ruleLandingPad; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLandingPad12315); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5578:1: ruleLandingPad returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ ) ) ;
    public final EObject ruleLandingPad() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        EObject lv_result_0_0 = null;

        EObject lv_struct_3_0 = null;

        EObject lv_personalitytype_5_0 = null;

        EObject lv_personalityvalue_6_0 = null;

        EObject lv_clause_8_0 = null;

        EObject lv_clause_9_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5581:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5582:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5582:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5582:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'landingpad' ( (lv_struct_3_0= ruleStructure ) ) otherlv_4= 'personality' ( (lv_personalitytype_5_0= ruleTypeUse ) ) ( (lv_personalityvalue_6_0= ruleValue ) ) ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5582:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5583:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5583:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5584:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleLandingPad12361);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleLandingPad12373); 

                	newLeafNode(otherlv_1, grammarAccess.getLandingPadAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,137,FOLLOW_137_in_ruleLandingPad12385); 

                	newLeafNode(otherlv_2, grammarAccess.getLandingPadAccess().getLandingpadKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5608:1: ( (lv_struct_3_0= ruleStructure ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5609:1: (lv_struct_3_0= ruleStructure )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5609:1: (lv_struct_3_0= ruleStructure )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5610:3: lv_struct_3_0= ruleStructure
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getStructStructureParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleStructure_in_ruleLandingPad12406);
            lv_struct_3_0=ruleStructure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
            	        }
                   		set(
                   			current, 
                   			"struct",
                    		lv_struct_3_0, 
                    		"Structure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,138,FOLLOW_138_in_ruleLandingPad12418); 

                	newLeafNode(otherlv_4, grammarAccess.getLandingPadAccess().getPersonalityKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5630:1: ( (lv_personalitytype_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5631:1: (lv_personalitytype_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5631:1: (lv_personalitytype_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5632:3: lv_personalitytype_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalitytypeTypeUseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleLandingPad12439);
            lv_personalitytype_5_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
            	        }
                   		set(
                   			current, 
                   			"personalitytype",
                    		lv_personalitytype_5_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5648:2: ( (lv_personalityvalue_6_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5649:1: (lv_personalityvalue_6_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5649:1: (lv_personalityvalue_6_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5650:3: lv_personalityvalue_6_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getLandingPadAccess().getPersonalityvalueValueParserRuleCall_6_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleLandingPad12460);
            lv_personalityvalue_6_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
            	        }
                   		set(
                   			current, 
                   			"personalityvalue",
                    		lv_personalityvalue_6_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5666:2: ( (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* ) | ( (lv_clause_9_0= ruleClause ) )+ )
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==139) ) {
                alt121=1;
            }
            else if ( (LA121_0==68||LA121_0==140) ) {
                alt121=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 121, 0, input);

                throw nvae;
            }
            switch (alt121) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5666:3: (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5666:3: (otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )* )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5666:5: otherlv_7= 'cleanup' ( (lv_clause_8_0= ruleClause ) )*
                    {
                    otherlv_7=(Token)match(input,139,FOLLOW_139_in_ruleLandingPad12474); 

                        	newLeafNode(otherlv_7, grammarAccess.getLandingPadAccess().getCleanupKeyword_7_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5670:1: ( (lv_clause_8_0= ruleClause ) )*
                    loop119:
                    do {
                        int alt119=2;
                        int LA119_0 = input.LA(1);

                        if ( (LA119_0==68) ) {
                            int LA119_2 = input.LA(2);

                            if ( (LA119_2==RULE_INT_TYPE||LA119_2==RULE_VALID_ID||(LA119_2>=RULE_PRIMITIVE_VALUE && LA119_2<=RULE_FLOATING_POINT_TYPE)) ) {
                                alt119=1;
                            }


                        }
                        else if ( (LA119_0==140) ) {
                            alt119=1;
                        }


                        switch (alt119) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5671:1: (lv_clause_8_0= ruleClause )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5671:1: (lv_clause_8_0= ruleClause )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5672:3: lv_clause_8_0= ruleClause
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_7_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad12495);
                    	    lv_clause_8_0=ruleClause();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"clause",
                    	            		lv_clause_8_0, 
                    	            		"Clause");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop119;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5689:6: ( (lv_clause_9_0= ruleClause ) )+
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5689:6: ( (lv_clause_9_0= ruleClause ) )+
                    int cnt120=0;
                    loop120:
                    do {
                        int alt120=2;
                        int LA120_0 = input.LA(1);

                        if ( (LA120_0==68) ) {
                            int LA120_2 = input.LA(2);

                            if ( (LA120_2==RULE_INT_TYPE||LA120_2==RULE_VALID_ID||(LA120_2>=RULE_PRIMITIVE_VALUE && LA120_2<=RULE_FLOATING_POINT_TYPE)) ) {
                                alt120=1;
                            }


                        }
                        else if ( (LA120_0==140) ) {
                            alt120=1;
                        }


                        switch (alt120) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5690:1: (lv_clause_9_0= ruleClause )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5690:1: (lv_clause_9_0= ruleClause )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5691:3: lv_clause_9_0= ruleClause
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getLandingPadAccess().getClauseClauseParserRuleCall_7_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleClause_in_ruleLandingPad12524);
                    	    lv_clause_9_0=ruleClause();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getLandingPadRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"clause",
                    	            		lv_clause_9_0, 
                    	            		"Clause");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt120 >= 1 ) break loop120;
                                EarlyExitException eee =
                                    new EarlyExitException(120, input);
                                throw eee;
                        }
                        cnt120++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5715:1: entryRuleClause returns [EObject current=null] : iv_ruleClause= ruleClause EOF ;
    public final EObject entryRuleClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClause = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5716:2: (iv_ruleClause= ruleClause EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5717:2: iv_ruleClause= ruleClause EOF
            {
             newCompositeNode(grammarAccess.getClauseRule()); 
            pushFollow(FOLLOW_ruleClause_in_entryRuleClause12562);
            iv_ruleClause=ruleClause();

            state._fsp--;

             current =iv_ruleClause; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleClause12572); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5724:1: ruleClause returns [EObject current=null] : ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) ) | (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) ) ) ;
    public final EObject ruleClause() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_filterarray_4_0 = null;

        EObject lv_constant_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5727:28: ( ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) ) | (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5728:1: ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) ) | (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5728:1: ( (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) ) | (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) ) )
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==68) ) {
                alt122=1;
            }
            else if ( (LA122_0==140) ) {
                alt122=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;
            }
            switch (alt122) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5728:2: (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5728:2: (otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5728:4: otherlv_0= 'catch' ( (lv_type_1_0= ruleTypeUse ) ) ( (lv_value_2_0= ruleValue ) )
                    {
                    otherlv_0=(Token)match(input,68,FOLLOW_68_in_ruleClause12610); 

                        	newLeafNode(otherlv_0, grammarAccess.getClauseAccess().getCatchKeyword_0_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5732:1: ( (lv_type_1_0= ruleTypeUse ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5733:1: (lv_type_1_0= ruleTypeUse )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5733:1: (lv_type_1_0= ruleTypeUse )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5734:3: lv_type_1_0= ruleTypeUse
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getTypeTypeUseParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleTypeUse_in_ruleClause12631);
                    lv_type_1_0=ruleTypeUse();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_1_0, 
                            		"TypeUse");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5750:2: ( (lv_value_2_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5751:1: (lv_value_2_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5751:1: (lv_value_2_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5752:3: lv_value_2_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getValueValueParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleClause12652);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5769:6: (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5769:6: (otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5769:8: otherlv_3= 'filter' ( (lv_filterarray_4_0= ruleArray ) ) ( (lv_constant_5_0= ruleValue ) )
                    {
                    otherlv_3=(Token)match(input,140,FOLLOW_140_in_ruleClause12672); 

                        	newLeafNode(otherlv_3, grammarAccess.getClauseAccess().getFilterKeyword_1_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5773:1: ( (lv_filterarray_4_0= ruleArray ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5774:1: (lv_filterarray_4_0= ruleArray )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5774:1: (lv_filterarray_4_0= ruleArray )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5775:3: lv_filterarray_4_0= ruleArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getFilterarrayArrayParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleArray_in_ruleClause12693);
                    lv_filterarray_4_0=ruleArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"filterarray",
                            		lv_filterarray_4_0, 
                            		"Array");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5791:2: ( (lv_constant_5_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5792:1: (lv_constant_5_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5792:1: (lv_constant_5_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5793:3: lv_constant_5_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getClauseAccess().getConstantValueParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleClause12714);
                    lv_constant_5_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getClauseRule());
                    	        }
                           		set(
                           			current, 
                           			"constant",
                            		lv_constant_5_0, 
                            		"Value");
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
    // $ANTLR end "ruleClause"


    // $ANTLR start "entryRuleSelect"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5817:1: entryRuleSelect returns [EObject current=null] : iv_ruleSelect= ruleSelect EOF ;
    public final EObject entryRuleSelect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelect = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5818:2: (iv_ruleSelect= ruleSelect EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5819:2: iv_ruleSelect= ruleSelect EOF
            {
             newCompositeNode(grammarAccess.getSelectRule()); 
            pushFollow(FOLLOW_ruleSelect_in_entryRuleSelect12751);
            iv_ruleSelect=ruleSelect();

            state._fsp--;

             current =iv_ruleSelect; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelect12761); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5826:1: ruleSelect returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) ) ) ;
    public final EObject ruleSelect() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_result_0_0 = null;

        EObject lv_condition_3_0 = null;

        EObject lv_trueValue_5_0 = null;

        EObject lv_elseValue_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5829:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5830:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5830:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5830:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'select' ( (lv_condition_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_trueValue_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_elseValue_7_0= ruleParameter ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5830:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5831:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5831:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5832:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleSelect12807);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleSelect12819); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,141,FOLLOW_141_in_ruleSelect12831); 

                	newLeafNode(otherlv_2, grammarAccess.getSelectAccess().getSelectKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5856:1: ( (lv_condition_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5857:1: (lv_condition_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5857:1: (lv_condition_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5858:3: lv_condition_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getConditionParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSelect12852);
            lv_condition_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"condition",
                    		lv_condition_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleSelect12864); 

                	newLeafNode(otherlv_4, grammarAccess.getSelectAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5878:1: ( (lv_trueValue_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5879:1: (lv_trueValue_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5879:1: (lv_trueValue_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5880:3: lv_trueValue_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getTrueValueParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSelect12885);
            lv_trueValue_5_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"trueValue",
                    		lv_trueValue_5_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleSelect12897); 

                	newLeafNode(otherlv_6, grammarAccess.getSelectAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5900:1: ( (lv_elseValue_7_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5901:1: (lv_elseValue_7_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5901:1: (lv_elseValue_7_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5902:3: lv_elseValue_7_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSelectAccess().getElseValueParameterParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSelect12918);
            lv_elseValue_7_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSelectRule());
            	        }
                   		set(
                   			current, 
                   			"elseValue",
                    		lv_elseValue_7_0, 
                    		"Parameter");
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


    // $ANTLR start "entryRuleVariableAttributeAccess"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5926:1: entryRuleVariableAttributeAccess returns [EObject current=null] : iv_ruleVariableAttributeAccess= ruleVariableAttributeAccess EOF ;
    public final EObject entryRuleVariableAttributeAccess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableAttributeAccess = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5927:2: (iv_ruleVariableAttributeAccess= ruleVariableAttributeAccess EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5928:2: iv_ruleVariableAttributeAccess= ruleVariableAttributeAccess EOF
            {
             newCompositeNode(grammarAccess.getVariableAttributeAccessRule()); 
            pushFollow(FOLLOW_ruleVariableAttributeAccess_in_entryRuleVariableAttributeAccess12954);
            iv_ruleVariableAttributeAccess=ruleVariableAttributeAccess();

            state._fsp--;

             current =iv_ruleVariableAttributeAccess; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVariableAttributeAccess12964); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableAttributeAccess"


    // $ANTLR start "ruleVariableAttributeAccess"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5935:1: ruleVariableAttributeAccess returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) ) ) ;
    public final EObject ruleVariableAttributeAccess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_result_0_0 = null;

        EObject lv_vaList_3_0 = null;

        EObject lv_aType_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5938:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5939:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5939:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5939:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'va_arg' ( (lv_vaList_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_aType_5_0= ruleTypeUse ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5939:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5940:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5940:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5941:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccessAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleVariableAttributeAccess13010);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableAttributeAccessRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleVariableAttributeAccess13022); 

                	newLeafNode(otherlv_1, grammarAccess.getVariableAttributeAccessAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,142,FOLLOW_142_in_ruleVariableAttributeAccess13034); 

                	newLeafNode(otherlv_2, grammarAccess.getVariableAttributeAccessAccess().getVa_argKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5965:1: ( (lv_vaList_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5966:1: (lv_vaList_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5966:1: (lv_vaList_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5967:3: lv_vaList_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccessAccess().getVaListParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleVariableAttributeAccess13055);
            lv_vaList_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableAttributeAccessRule());
            	        }
                   		set(
                   			current, 
                   			"vaList",
                    		lv_vaList_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleVariableAttributeAccess13067); 

                	newLeafNode(otherlv_4, grammarAccess.getVariableAttributeAccessAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5987:1: ( (lv_aType_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5988:1: (lv_aType_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5988:1: (lv_aType_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:5989:3: lv_aType_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getVariableAttributeAccessAccess().getATypeTypeUseParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleVariableAttributeAccess13088);
            lv_aType_5_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVariableAttributeAccessRule());
            	        }
                   		set(
                   			current, 
                   			"aType",
                    		lv_aType_5_0, 
                    		"TypeUse");
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
    // $ANTLR end "ruleVariableAttributeAccess"


    // $ANTLR start "entryRuleExtractValue"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6013:1: entryRuleExtractValue returns [EObject current=null] : iv_ruleExtractValue= ruleExtractValue EOF ;
    public final EObject entryRuleExtractValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6014:2: (iv_ruleExtractValue= ruleExtractValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6015:2: iv_ruleExtractValue= ruleExtractValue EOF
            {
             newCompositeNode(grammarAccess.getExtractValueRule()); 
            pushFollow(FOLLOW_ruleExtractValue_in_entryRuleExtractValue13124);
            iv_ruleExtractValue=ruleExtractValue();

            state._fsp--;

             current =iv_ruleExtractValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractValue13134); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6022:1: ruleExtractValue returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+ ) ;
    public final EObject ruleExtractValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_result_0_0 = null;

        EObject lv_aggerate_3_0 = null;

        AntlrDatatypeRuleToken lv_index_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6025:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6026:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6026:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6026:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractvalue' ( (lv_aggerate_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6026:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6027:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6027:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6028:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleExtractValue13180);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractValueRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleExtractValue13192); 

                	newLeafNode(otherlv_1, grammarAccess.getExtractValueAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,143,FOLLOW_143_in_ruleExtractValue13204); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractValueAccess().getExtractvalueKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6052:1: ( (lv_aggerate_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6053:1: (lv_aggerate_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6053:1: (lv_aggerate_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6054:3: lv_aggerate_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getExtractValueAccess().getAggerateParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleExtractValue13225);
            lv_aggerate_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractValueRule());
            	        }
                   		set(
                   			current, 
                   			"aggerate",
                    		lv_aggerate_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6070:2: (otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) ) )+
            int cnt123=0;
            loop123:
            do {
                int alt123=2;
                int LA123_0 = input.LA(1);

                if ( (LA123_0==80) ) {
                    alt123=1;
                }


                switch (alt123) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6070:4: otherlv_4= ',' ( (lv_index_5_0= ruleNUMBER ) )
            	    {
            	    otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleExtractValue13238); 

            	        	newLeafNode(otherlv_4, grammarAccess.getExtractValueAccess().getCommaKeyword_4_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6074:1: ( (lv_index_5_0= ruleNUMBER ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6075:1: (lv_index_5_0= ruleNUMBER )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6075:1: (lv_index_5_0= ruleNUMBER )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6076:3: lv_index_5_0= ruleNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getExtractValueAccess().getIndexNUMBERParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNUMBER_in_ruleExtractValue13259);
            	    lv_index_5_0=ruleNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getExtractValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"index",
            	            		lv_index_5_0, 
            	            		"NUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt123 >= 1 ) break loop123;
                        EarlyExitException eee =
                            new EarlyExitException(123, input);
                        throw eee;
                }
                cnt123++;
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6100:1: entryRuleInsertValue returns [EObject current=null] : iv_ruleInsertValue= ruleInsertValue EOF ;
    public final EObject entryRuleInsertValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertValue = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6101:2: (iv_ruleInsertValue= ruleInsertValue EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6102:2: iv_ruleInsertValue= ruleInsertValue EOF
            {
             newCompositeNode(grammarAccess.getInsertValueRule()); 
            pushFollow(FOLLOW_ruleInsertValue_in_entryRuleInsertValue13297);
            iv_ruleInsertValue=ruleInsertValue();

            state._fsp--;

             current =iv_ruleInsertValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertValue13307); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6109:1: ruleInsertValue returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+ ) ;
    public final EObject ruleInsertValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_result_0_0 = null;

        EObject lv_aggerate_3_0 = null;

        EObject lv_value_5_0 = null;

        AntlrDatatypeRuleToken lv_index_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6112:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+ ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6113:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+ )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6113:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+ )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6113:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertvalue' ( (lv_aggerate_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6113:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6114:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6114:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6115:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleInsertValue13353);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleInsertValue13365); 

                	newLeafNode(otherlv_1, grammarAccess.getInsertValueAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,144,FOLLOW_144_in_ruleInsertValue13377); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertValueAccess().getInsertvalueKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6139:1: ( (lv_aggerate_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6140:1: (lv_aggerate_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6140:1: (lv_aggerate_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6141:3: lv_aggerate_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getAggerateParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertValue13398);
            lv_aggerate_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"aggerate",
                    		lv_aggerate_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleInsertValue13410); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertValueAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6161:1: ( (lv_value_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6162:1: (lv_value_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6162:1: (lv_value_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6163:3: lv_value_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertValueAccess().getValueParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertValue13431);
            lv_value_5_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6179:2: (otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) ) )+
            int cnt124=0;
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==80) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6179:4: otherlv_6= ',' ( (lv_index_7_0= ruleNUMBER ) )
            	    {
            	    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleInsertValue13444); 

            	        	newLeafNode(otherlv_6, grammarAccess.getInsertValueAccess().getCommaKeyword_6_0());
            	        
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6183:1: ( (lv_index_7_0= ruleNUMBER ) )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6184:1: (lv_index_7_0= ruleNUMBER )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6184:1: (lv_index_7_0= ruleNUMBER )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6185:3: lv_index_7_0= ruleNUMBER
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInsertValueAccess().getIndexNUMBERParserRuleCall_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNUMBER_in_ruleInsertValue13465);
            	    lv_index_7_0=ruleNUMBER();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInsertValueRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"index",
            	            		lv_index_7_0, 
            	            		"NUMBER");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt124 >= 1 ) break loop124;
                        EarlyExitException eee =
                            new EarlyExitException(124, input);
                        throw eee;
                }
                cnt124++;
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


    // $ANTLR start "entryRuleExtractElement"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6209:1: entryRuleExtractElement returns [EObject current=null] : iv_ruleExtractElement= ruleExtractElement EOF ;
    public final EObject entryRuleExtractElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtractElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6210:2: (iv_ruleExtractElement= ruleExtractElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6211:2: iv_ruleExtractElement= ruleExtractElement EOF
            {
             newCompositeNode(grammarAccess.getExtractElementRule()); 
            pushFollow(FOLLOW_ruleExtractElement_in_entryRuleExtractElement13503);
            iv_ruleExtractElement=ruleExtractElement();

            state._fsp--;

             current =iv_ruleExtractElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExtractElement13513); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6218:1: ruleExtractElement returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) ) ) ;
    public final EObject ruleExtractElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_result_0_0 = null;

        EObject lv_vector_3_0 = null;

        EObject lv_index_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6221:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6222:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6222:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6222:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'extractelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_index_5_0= ruleParameter ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6222:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6223:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6223:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6224:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleExtractElement13559);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractElementRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleExtractElement13571); 

                	newLeafNode(otherlv_1, grammarAccess.getExtractElementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,145,FOLLOW_145_in_ruleExtractElement13583); 

                	newLeafNode(otherlv_2, grammarAccess.getExtractElementAccess().getExtractelementKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6248:1: ( (lv_vector_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6249:1: (lv_vector_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6249:1: (lv_vector_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6250:3: lv_vector_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getVectorParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleExtractElement13604);
            lv_vector_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractElementRule());
            	        }
                   		set(
                   			current, 
                   			"vector",
                    		lv_vector_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleExtractElement13616); 

                	newLeafNode(otherlv_4, grammarAccess.getExtractElementAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6270:1: ( (lv_index_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6271:1: (lv_index_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6271:1: (lv_index_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6272:3: lv_index_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getExtractElementAccess().getIndexParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleExtractElement13637);
            lv_index_5_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExtractElementRule());
            	        }
                   		set(
                   			current, 
                   			"index",
                    		lv_index_5_0, 
                    		"Parameter");
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6296:1: entryRuleInsertElement returns [EObject current=null] : iv_ruleInsertElement= ruleInsertElement EOF ;
    public final EObject entryRuleInsertElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInsertElement = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6297:2: (iv_ruleInsertElement= ruleInsertElement EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6298:2: iv_ruleInsertElement= ruleInsertElement EOF
            {
             newCompositeNode(grammarAccess.getInsertElementRule()); 
            pushFollow(FOLLOW_ruleInsertElement_in_entryRuleInsertElement13673);
            iv_ruleInsertElement=ruleInsertElement();

            state._fsp--;

             current =iv_ruleInsertElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInsertElement13683); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6305:1: ruleInsertElement returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) ) ) ;
    public final EObject ruleInsertElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_result_0_0 = null;

        EObject lv_vector_3_0 = null;

        EObject lv_value_5_0 = null;

        EObject lv_index_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6308:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6309:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6309:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6309:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'insertelement' ( (lv_vector_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_index_7_0= ruleParameter ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6309:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6310:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6310:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6311:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleInsertElement13729);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleInsertElement13741); 

                	newLeafNode(otherlv_1, grammarAccess.getInsertElementAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,146,FOLLOW_146_in_ruleInsertElement13753); 

                	newLeafNode(otherlv_2, grammarAccess.getInsertElementAccess().getInsertelementKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6335:1: ( (lv_vector_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6336:1: (lv_vector_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6336:1: (lv_vector_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6337:3: lv_vector_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getVectorParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertElement13774);
            lv_vector_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"vector",
                    		lv_vector_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleInsertElement13786); 

                	newLeafNode(otherlv_4, grammarAccess.getInsertElementAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6357:1: ( (lv_value_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6358:1: (lv_value_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6358:1: (lv_value_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6359:3: lv_value_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getValueParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertElement13807);
            lv_value_5_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_5_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleInsertElement13819); 

                	newLeafNode(otherlv_6, grammarAccess.getInsertElementAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6379:1: ( (lv_index_7_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6380:1: (lv_index_7_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6380:1: (lv_index_7_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6381:3: lv_index_7_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getInsertElementAccess().getIndexParameterParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleInsertElement13840);
            lv_index_7_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInsertElementRule());
            	        }
                   		set(
                   			current, 
                   			"index",
                    		lv_index_7_0, 
                    		"Parameter");
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6405:1: entryRuleShuffleVector returns [EObject current=null] : iv_ruleShuffleVector= ruleShuffleVector EOF ;
    public final EObject entryRuleShuffleVector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleShuffleVector = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6406:2: (iv_ruleShuffleVector= ruleShuffleVector EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6407:2: iv_ruleShuffleVector= ruleShuffleVector EOF
            {
             newCompositeNode(grammarAccess.getShuffleVectorRule()); 
            pushFollow(FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector13876);
            iv_ruleShuffleVector=ruleShuffleVector();

            state._fsp--;

             current =iv_ruleShuffleVector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleShuffleVector13886); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6414:1: ruleShuffleVector returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) ) ) ;
    public final EObject ruleShuffleVector() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_result_0_0 = null;

        EObject lv_value1_3_0 = null;

        EObject lv_value2_5_0 = null;

        EObject lv_mask_7_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6417:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6418:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6418:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6418:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' otherlv_2= 'shufflevector' ( (lv_value1_3_0= ruleParameter ) ) otherlv_4= ',' ( (lv_value2_5_0= ruleParameter ) ) otherlv_6= ',' ( (lv_mask_7_0= ruleParameter ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6418:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6419:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6419:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6420:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleShuffleVector13932);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleShuffleVector13944); 

                	newLeafNode(otherlv_1, grammarAccess.getShuffleVectorAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,147,FOLLOW_147_in_ruleShuffleVector13956); 

                	newLeafNode(otherlv_2, grammarAccess.getShuffleVectorAccess().getShufflevectorKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6444:1: ( (lv_value1_3_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6445:1: (lv_value1_3_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6445:1: (lv_value1_3_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6446:3: lv_value1_3_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getValue1ParameterParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleShuffleVector13977);
            lv_value1_3_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"value1",
                    		lv_value1_3_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,80,FOLLOW_80_in_ruleShuffleVector13989); 

                	newLeafNode(otherlv_4, grammarAccess.getShuffleVectorAccess().getCommaKeyword_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6466:1: ( (lv_value2_5_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6467:1: (lv_value2_5_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6467:1: (lv_value2_5_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6468:3: lv_value2_5_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getValue2ParameterParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleShuffleVector14010);
            lv_value2_5_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"value2",
                    		lv_value2_5_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleShuffleVector14022); 

                	newLeafNode(otherlv_6, grammarAccess.getShuffleVectorAccess().getCommaKeyword_6());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6488:1: ( (lv_mask_7_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6489:1: (lv_mask_7_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6489:1: (lv_mask_7_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6490:3: lv_mask_7_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getShuffleVectorAccess().getMaskParameterParserRuleCall_7_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleShuffleVector14043);
            lv_mask_7_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getShuffleVectorRule());
            	        }
                   		set(
                   			current, 
                   			"mask",
                    		lv_mask_7_0, 
                    		"Parameter");
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


    // $ANTLR start "entryRuleCompare"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6514:1: entryRuleCompare returns [EObject current=null] : iv_ruleCompare= ruleCompare EOF ;
    public final EObject entryRuleCompare() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompare = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6515:2: (iv_ruleCompare= ruleCompare EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6516:2: iv_ruleCompare= ruleCompare EOF
            {
             newCompositeNode(grammarAccess.getCompareRule()); 
            pushFollow(FOLLOW_ruleCompare_in_entryRuleCompare14079);
            iv_ruleCompare=ruleCompare();

            state._fsp--;

             current =iv_ruleCompare; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompare14089); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6523:1: ruleCompare returns [EObject current=null] : ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) ) ) ;
    public final EObject ruleCompare() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_cond_4_1=null;
        Token lv_cond_4_2=null;
        Token lv_cond_4_3=null;
        Token otherlv_7=null;
        EObject lv_result_0_0 = null;

        EObject lv_opType_5_0 = null;

        EObject lv_operand1_6_0 = null;

        EObject lv_operand2_8_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6526:28: ( ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6527:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6527:1: ( ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6527:2: ( (lv_result_0_0= ruleAddress ) ) otherlv_1= '=' ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6527:2: ( (lv_result_0_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6528:1: (lv_result_0_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6528:1: (lv_result_0_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6529:3: lv_result_0_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getCompareAccess().getResultAddressParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleCompare14135);
            lv_result_0_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompareRule());
            	        }
                   		set(
                   			current, 
                   			"result",
                    		lv_result_0_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleCompare14147); 

                	newLeafNode(otherlv_1, grammarAccess.getCompareAccess().getEqualsSignKeyword_1());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6549:1: ( (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6549:2: (otherlv_2= 'icmp' | otherlv_3= 'fcmp' ) ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) ) ( (lv_opType_5_0= ruleTypeUse ) ) ( (lv_operand1_6_0= ruleValue ) ) otherlv_7= ',' ( (lv_operand2_8_0= ruleValue ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6549:2: (otherlv_2= 'icmp' | otherlv_3= 'fcmp' )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==148) ) {
                alt125=1;
            }
            else if ( (LA125_0==149) ) {
                alt125=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;
            }
            switch (alt125) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6549:4: otherlv_2= 'icmp'
                    {
                    otherlv_2=(Token)match(input,148,FOLLOW_148_in_ruleCompare14161); 

                        	newLeafNode(otherlv_2, grammarAccess.getCompareAccess().getIcmpKeyword_2_0_0());
                        

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6554:7: otherlv_3= 'fcmp'
                    {
                    otherlv_3=(Token)match(input,149,FOLLOW_149_in_ruleCompare14179); 

                        	newLeafNode(otherlv_3, grammarAccess.getCompareAccess().getFcmpKeyword_2_0_1());
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6558:2: ( ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6559:1: ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6559:1: ( (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6560:1: (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6560:1: (lv_cond_4_1= RULE_I_PREDICATES | lv_cond_4_2= RULE_F_PREDICATES | lv_cond_4_3= RULE_BOOL )
            int alt126=3;
            switch ( input.LA(1) ) {
            case RULE_I_PREDICATES:
                {
                alt126=1;
                }
                break;
            case RULE_F_PREDICATES:
                {
                alt126=2;
                }
                break;
            case RULE_BOOL:
                {
                alt126=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 126, 0, input);

                throw nvae;
            }

            switch (alt126) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6561:3: lv_cond_4_1= RULE_I_PREDICATES
                    {
                    lv_cond_4_1=(Token)match(input,RULE_I_PREDICATES,FOLLOW_RULE_I_PREDICATES_in_ruleCompare14199); 

                    			newLeafNode(lv_cond_4_1, grammarAccess.getCompareAccess().getCondI_PREDICATESTerminalRuleCall_2_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompareRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cond",
                            		lv_cond_4_1, 
                            		"I_PREDICATES");
                    	    

                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6576:8: lv_cond_4_2= RULE_F_PREDICATES
                    {
                    lv_cond_4_2=(Token)match(input,RULE_F_PREDICATES,FOLLOW_RULE_F_PREDICATES_in_ruleCompare14219); 

                    			newLeafNode(lv_cond_4_2, grammarAccess.getCompareAccess().getCondF_PREDICATESTerminalRuleCall_2_1_0_1()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompareRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cond",
                            		lv_cond_4_2, 
                            		"F_PREDICATES");
                    	    

                    }
                    break;
                case 3 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6591:8: lv_cond_4_3= RULE_BOOL
                    {
                    lv_cond_4_3=(Token)match(input,RULE_BOOL,FOLLOW_RULE_BOOL_in_ruleCompare14239); 

                    			newLeafNode(lv_cond_4_3, grammarAccess.getCompareAccess().getCondBOOLTerminalRuleCall_2_1_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompareRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"cond",
                            		lv_cond_4_3, 
                            		"BOOL");
                    	    

                    }
                    break;

            }


            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6609:2: ( (lv_opType_5_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6610:1: (lv_opType_5_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6610:1: (lv_opType_5_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6611:3: lv_opType_5_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getCompareAccess().getOpTypeTypeUseParserRuleCall_2_2_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleCompare14268);
            lv_opType_5_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompareRule());
            	        }
                   		set(
                   			current, 
                   			"opType",
                    		lv_opType_5_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6627:2: ( (lv_operand1_6_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6628:1: (lv_operand1_6_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6628:1: (lv_operand1_6_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6629:3: lv_operand1_6_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getCompareAccess().getOperand1ValueParserRuleCall_2_3_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleCompare14289);
            lv_operand1_6_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompareRule());
            	        }
                   		set(
                   			current, 
                   			"operand1",
                    		lv_operand1_6_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,80,FOLLOW_80_in_ruleCompare14301); 

                	newLeafNode(otherlv_7, grammarAccess.getCompareAccess().getCommaKeyword_2_4());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6649:1: ( (lv_operand2_8_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6650:1: (lv_operand2_8_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6650:1: (lv_operand2_8_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6651:3: lv_operand2_8_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getCompareAccess().getOperand2ValueParserRuleCall_2_5_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleCompare14322);
            lv_operand2_8_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompareRule());
            	        }
                   		set(
                   			current, 
                   			"operand2",
                    		lv_operand2_8_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


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
    // $ANTLR end "ruleCompare"


    // $ANTLR start "entryRuleIndirectBranch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6675:1: entryRuleIndirectBranch returns [EObject current=null] : iv_ruleIndirectBranch= ruleIndirectBranch EOF ;
    public final EObject entryRuleIndirectBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndirectBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6676:2: (iv_ruleIndirectBranch= ruleIndirectBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6677:2: iv_ruleIndirectBranch= ruleIndirectBranch EOF
            {
             newCompositeNode(grammarAccess.getIndirectBranchRule()); 
            pushFollow(FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch14359);
            iv_ruleIndirectBranch=ruleIndirectBranch();

            state._fsp--;

             current =iv_ruleIndirectBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIndirectBranch14369); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6684:1: ruleIndirectBranch returns [EObject current=null] : (otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']' ) ;
    public final EObject ruleIndirectBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_potTargetLabels_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_potTargetLabels_8_0=null;
        Token otherlv_9=null;
        EObject lv_target_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6687:28: ( (otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6688:1: (otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6688:1: (otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6688:3: otherlv_0= 'indirectbr' ( (lv_target_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= '[' (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )? otherlv_9= ']'
            {
            otherlv_0=(Token)match(input,150,FOLLOW_150_in_ruleIndirectBranch14406); 

                	newLeafNode(otherlv_0, grammarAccess.getIndirectBranchAccess().getIndirectbrKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6692:1: ( (lv_target_1_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6693:1: (lv_target_1_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6693:1: (lv_target_1_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6694:3: lv_target_1_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getIndirectBranchAccess().getTargetParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleIndirectBranch14427);
            lv_target_1_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getIndirectBranchRule());
            	        }
                   		set(
                   			current, 
                   			"target",
                    		lv_target_1_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleIndirectBranch14439); 

                	newLeafNode(otherlv_2, grammarAccess.getIndirectBranchAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,79,FOLLOW_79_in_ruleIndirectBranch14451); 

                	newLeafNode(otherlv_3, grammarAccess.getIndirectBranchAccess().getLeftSquareBracketKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6718:1: (otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )* )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==151) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6718:3: otherlv_4= 'label' ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) ) (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )*
                    {
                    otherlv_4=(Token)match(input,151,FOLLOW_151_in_ruleIndirectBranch14464); 

                        	newLeafNode(otherlv_4, grammarAccess.getIndirectBranchAccess().getLabelKeyword_4_0());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6722:1: ( (lv_potTargetLabels_5_0= RULE_VALID_ID ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6723:1: (lv_potTargetLabels_5_0= RULE_VALID_ID )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6723:1: (lv_potTargetLabels_5_0= RULE_VALID_ID )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6724:3: lv_potTargetLabels_5_0= RULE_VALID_ID
                    {
                    lv_potTargetLabels_5_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleIndirectBranch14481); 

                    			newLeafNode(lv_potTargetLabels_5_0, grammarAccess.getIndirectBranchAccess().getPotTargetLabelsVALID_IDTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getIndirectBranchRule());
                    	        }
                           		addWithLastConsumed(
                           			current, 
                           			"potTargetLabels",
                            		lv_potTargetLabels_5_0, 
                            		"VALID_ID");
                    	    

                    }


                    }

                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6740:2: (otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) ) )*
                    loop127:
                    do {
                        int alt127=2;
                        int LA127_0 = input.LA(1);

                        if ( (LA127_0==80) ) {
                            alt127=1;
                        }


                        switch (alt127) {
                    	case 1 :
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6740:4: otherlv_6= ',' otherlv_7= 'label' ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) )
                    	    {
                    	    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleIndirectBranch14499); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getIndirectBranchAccess().getCommaKeyword_4_2_0());
                    	        
                    	    otherlv_7=(Token)match(input,151,FOLLOW_151_in_ruleIndirectBranch14511); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getIndirectBranchAccess().getLabelKeyword_4_2_1());
                    	        
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6748:1: ( (lv_potTargetLabels_8_0= RULE_VALID_ID ) )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6749:1: (lv_potTargetLabels_8_0= RULE_VALID_ID )
                    	    {
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6749:1: (lv_potTargetLabels_8_0= RULE_VALID_ID )
                    	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6750:3: lv_potTargetLabels_8_0= RULE_VALID_ID
                    	    {
                    	    lv_potTargetLabels_8_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleIndirectBranch14528); 

                    	    			newLeafNode(lv_potTargetLabels_8_0, grammarAccess.getIndirectBranchAccess().getPotTargetLabelsVALID_IDTerminalRuleCall_4_2_2_0()); 
                    	    		

                    	    	        if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getIndirectBranchRule());
                    	    	        }
                    	           		addWithLastConsumed(
                    	           			current, 
                    	           			"potTargetLabels",
                    	            		lv_potTargetLabels_8_0, 
                    	            		"VALID_ID");
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop127;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,81,FOLLOW_81_in_ruleIndirectBranch14549); 

                	newLeafNode(otherlv_9, grammarAccess.getIndirectBranchAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleSwitch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6778:1: entryRuleSwitch returns [EObject current=null] : iv_ruleSwitch= ruleSwitch EOF ;
    public final EObject entryRuleSwitch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6779:2: (iv_ruleSwitch= ruleSwitch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6780:2: iv_ruleSwitch= ruleSwitch EOF
            {
             newCompositeNode(grammarAccess.getSwitchRule()); 
            pushFollow(FOLLOW_ruleSwitch_in_entryRuleSwitch14585);
            iv_ruleSwitch=ruleSwitch();

            state._fsp--;

             current =iv_ruleSwitch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitch14595); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6787:1: ruleSwitch returns [EObject current=null] : (otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']' ) ;
    public final EObject ruleSwitch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_defaultCase_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_caseValue_1_0 = null;

        EObject lv_cases_6_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6790:28: ( (otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6791:1: (otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6791:1: (otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6791:3: otherlv_0= 'switch' ( (lv_caseValue_1_0= ruleParameter ) ) otherlv_2= ',' otherlv_3= 'label' ( (lv_defaultCase_4_0= RULE_VALID_ID ) ) otherlv_5= '[' ( (lv_cases_6_0= ruleSwitchCase ) )* otherlv_7= ']'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_71_in_ruleSwitch14632); 

                	newLeafNode(otherlv_0, grammarAccess.getSwitchAccess().getSwitchKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6795:1: ( (lv_caseValue_1_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6796:1: (lv_caseValue_1_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6796:1: (lv_caseValue_1_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6797:3: lv_caseValue_1_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSwitchAccess().getCaseValueParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSwitch14653);
            lv_caseValue_1_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	        }
                   		set(
                   			current, 
                   			"caseValue",
                    		lv_caseValue_1_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleSwitch14665); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchAccess().getCommaKeyword_2());
                
            otherlv_3=(Token)match(input,151,FOLLOW_151_in_ruleSwitch14677); 

                	newLeafNode(otherlv_3, grammarAccess.getSwitchAccess().getLabelKeyword_3());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6821:1: ( (lv_defaultCase_4_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6822:1: (lv_defaultCase_4_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6822:1: (lv_defaultCase_4_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6823:3: lv_defaultCase_4_0= RULE_VALID_ID
            {
            lv_defaultCase_4_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleSwitch14694); 

            			newLeafNode(lv_defaultCase_4_0, grammarAccess.getSwitchAccess().getDefaultCaseVALID_IDTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSwitchRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"defaultCase",
                    		lv_defaultCase_4_0, 
                    		"VALID_ID");
            	    

            }


            }

            otherlv_5=(Token)match(input,79,FOLLOW_79_in_ruleSwitch14711); 

                	newLeafNode(otherlv_5, grammarAccess.getSwitchAccess().getLeftSquareBracketKeyword_5());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6843:1: ( (lv_cases_6_0= ruleSwitchCase ) )*
            loop129:
            do {
                int alt129=2;
                int LA129_0 = input.LA(1);

                if ( (LA129_0==RULE_INT_TYPE||LA129_0==RULE_VALID_ID||(LA129_0>=RULE_PRIMITIVE_VALUE && LA129_0<=RULE_FLOATING_POINT_TYPE)||LA129_0==46||LA129_0==79||(LA129_0>=93 && LA129_0<=94)) ) {
                    alt129=1;
                }


                switch (alt129) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6844:1: (lv_cases_6_0= ruleSwitchCase )
            	    {
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6844:1: (lv_cases_6_0= ruleSwitchCase )
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6845:3: lv_cases_6_0= ruleSwitchCase
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSwitchAccess().getCasesSwitchCaseParserRuleCall_6_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSwitchCase_in_ruleSwitch14732);
            	    lv_cases_6_0=ruleSwitchCase();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSwitchRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"cases",
            	            		lv_cases_6_0, 
            	            		"SwitchCase");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop129;
                }
            } while (true);

            otherlv_7=(Token)match(input,81,FOLLOW_81_in_ruleSwitch14745); 

                	newLeafNode(otherlv_7, grammarAccess.getSwitchAccess().getRightSquareBracketKeyword_7());
                

            }


            }

             leaveRule(); 
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


    // $ANTLR start "entryRuleSwitchCase"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6873:1: entryRuleSwitchCase returns [EObject current=null] : iv_ruleSwitchCase= ruleSwitchCase EOF ;
    public final EObject entryRuleSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSwitchCase = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6874:2: (iv_ruleSwitchCase= ruleSwitchCase EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6875:2: iv_ruleSwitchCase= ruleSwitchCase EOF
            {
             newCompositeNode(grammarAccess.getSwitchCaseRule()); 
            pushFollow(FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase14781);
            iv_ruleSwitchCase=ruleSwitchCase();

            state._fsp--;

             current =iv_ruleSwitchCase; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSwitchCase14791); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSwitchCase"


    // $ANTLR start "ruleSwitchCase"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6882:1: ruleSwitchCase returns [EObject current=null] : ( ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) ) ) ;
    public final EObject ruleSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_destination_3_0=null;
        EObject lv_caseValue_0_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6885:28: ( ( ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6886:1: ( ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6886:1: ( ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6886:2: ( (lv_caseValue_0_0= ruleParameter ) ) otherlv_1= ',' otherlv_2= 'label' ( (lv_destination_3_0= RULE_VALID_ID ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6886:2: ( (lv_caseValue_0_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6887:1: (lv_caseValue_0_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6887:1: (lv_caseValue_0_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6888:3: lv_caseValue_0_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getSwitchCaseAccess().getCaseValueParameterParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleSwitchCase14837);
            lv_caseValue_0_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSwitchCaseRule());
            	        }
                   		set(
                   			current, 
                   			"caseValue",
                    		lv_caseValue_0_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleSwitchCase14849); 

                	newLeafNode(otherlv_1, grammarAccess.getSwitchCaseAccess().getCommaKeyword_1());
                
            otherlv_2=(Token)match(input,151,FOLLOW_151_in_ruleSwitchCase14861); 

                	newLeafNode(otherlv_2, grammarAccess.getSwitchCaseAccess().getLabelKeyword_2());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6912:1: ( (lv_destination_3_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6913:1: (lv_destination_3_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6913:1: (lv_destination_3_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6914:3: lv_destination_3_0= RULE_VALID_ID
            {
            lv_destination_3_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleSwitchCase14878); 

            			newLeafNode(lv_destination_3_0, grammarAccess.getSwitchCaseAccess().getDestinationVALID_IDTerminalRuleCall_3_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSwitchCaseRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"destination",
                    		lv_destination_3_0, 
                    		"VALID_ID");
            	    

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
    // $ANTLR end "ruleSwitchCase"


    // $ANTLR start "entryRuleInvoke"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6938:1: entryRuleInvoke returns [EObject current=null] : iv_ruleInvoke= ruleInvoke EOF ;
    public final EObject entryRuleInvoke() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInvoke = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6939:2: (iv_ruleInvoke= ruleInvoke EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6940:2: iv_ruleInvoke= ruleInvoke EOF
            {
             newCompositeNode(grammarAccess.getInvokeRule()); 
            pushFollow(FOLLOW_ruleInvoke_in_entryRuleInvoke14919);
            iv_ruleInvoke=ruleInvoke();

            state._fsp--;

             current =iv_ruleInvoke; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInvoke14929); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6947:1: ruleInvoke returns [EObject current=null] : (otherlv_0= 'invoke' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) ) ) ;
    public final EObject ruleInvoke() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_RETURN_ATTRIBUTES_2=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_targetLabel_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_unwindTargetLabel_12_0=null;
        EObject lv_returnType_3_0 = null;

        EObject lv_name_4_0 = null;

        EObject lv_pList_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6950:28: ( (otherlv_0= 'invoke' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6951:1: (otherlv_0= 'invoke' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6951:1: (otherlv_0= 'invoke' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6951:3: otherlv_0= 'invoke' ( ruleCallingConv )? (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )? ( (lv_returnType_3_0= ruleTypeUse ) ) ( (lv_name_4_0= ruleAddress ) ) ( (lv_pList_5_0= ruleParameterList ) ) ( ruleFUNCTION_ATTRIBUTES )* otherlv_7= 'to' otherlv_8= 'label' ( (lv_targetLabel_9_0= RULE_VALID_ID ) ) otherlv_10= 'unwind' otherlv_11= 'label' ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_69_in_ruleInvoke14966); 

                	newLeafNode(otherlv_0, grammarAccess.getInvokeAccess().getInvokeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6955:1: ( ruleCallingConv )?
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( ((LA130_0>=31 && LA130_0<=45)) ) {
                alt130=1;
            }
            switch (alt130) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6956:5: ruleCallingConv
                    {
                     
                            newCompositeNode(grammarAccess.getInvokeAccess().getCallingConvParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleCallingConv_in_ruleInvoke14983);
                    ruleCallingConv();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6963:3: (this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES )?
            int alt131=2;
            int LA131_0 = input.LA(1);

            if ( (LA131_0==RULE_RETURN_ATTRIBUTES) ) {
                alt131=1;
            }
            switch (alt131) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6963:4: this_RETURN_ATTRIBUTES_2= RULE_RETURN_ATTRIBUTES
                    {
                    this_RETURN_ATTRIBUTES_2=(Token)match(input,RULE_RETURN_ATTRIBUTES,FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleInvoke14996); 
                     
                        newLeafNode(this_RETURN_ATTRIBUTES_2, grammarAccess.getInvokeAccess().getRETURN_ATTRIBUTESTerminalRuleCall_2()); 
                        

                    }
                    break;

            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6967:3: ( (lv_returnType_3_0= ruleTypeUse ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6968:1: (lv_returnType_3_0= ruleTypeUse )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6968:1: (lv_returnType_3_0= ruleTypeUse )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6969:3: lv_returnType_3_0= ruleTypeUse
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getReturnTypeTypeUseParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleTypeUse_in_ruleInvoke15018);
            lv_returnType_3_0=ruleTypeUse();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"returnType",
                    		lv_returnType_3_0, 
                    		"TypeUse");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6985:2: ( (lv_name_4_0= ruleAddress ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6986:1: (lv_name_4_0= ruleAddress )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6986:1: (lv_name_4_0= ruleAddress )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:6987:3: lv_name_4_0= ruleAddress
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getNameAddressParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleAddress_in_ruleInvoke15039);
            lv_name_4_0=ruleAddress();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInvokeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"Address");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7003:2: ( (lv_pList_5_0= ruleParameterList ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7004:1: (lv_pList_5_0= ruleParameterList )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7004:1: (lv_pList_5_0= ruleParameterList )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7005:3: lv_pList_5_0= ruleParameterList
            {
             
            	        newCompositeNode(grammarAccess.getInvokeAccess().getPListParameterListParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleParameterList_in_ruleInvoke15060);
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

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7021:2: ( ruleFUNCTION_ATTRIBUTES )*
            loop132:
            do {
                int alt132=2;
                int LA132_0 = input.LA(1);

                if ( ((LA132_0>=48 && LA132_0<=49)||(LA132_0>=52 && LA132_0<=67)) ) {
                    alt132=1;
                }


                switch (alt132) {
            	case 1 :
            	    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7022:5: ruleFUNCTION_ATTRIBUTES
            	    {
            	     
            	            newCompositeNode(grammarAccess.getInvokeAccess().getFUNCTION_ATTRIBUTESParserRuleCall_6()); 
            	        
            	    pushFollow(FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke15077);
            	    ruleFUNCTION_ATTRIBUTES();

            	    state._fsp--;

            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop132;
                }
            } while (true);

            otherlv_7=(Token)match(input,118,FOLLOW_118_in_ruleInvoke15090); 

                	newLeafNode(otherlv_7, grammarAccess.getInvokeAccess().getToKeyword_7());
                
            otherlv_8=(Token)match(input,151,FOLLOW_151_in_ruleInvoke15102); 

                	newLeafNode(otherlv_8, grammarAccess.getInvokeAccess().getLabelKeyword_8());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7037:1: ( (lv_targetLabel_9_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7038:1: (lv_targetLabel_9_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7038:1: (lv_targetLabel_9_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7039:3: lv_targetLabel_9_0= RULE_VALID_ID
            {
            lv_targetLabel_9_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleInvoke15119); 

            			newLeafNode(lv_targetLabel_9_0, grammarAccess.getInvokeAccess().getTargetLabelVALID_IDTerminalRuleCall_9_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInvokeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"targetLabel",
                    		lv_targetLabel_9_0, 
                    		"VALID_ID");
            	    

            }


            }

            otherlv_10=(Token)match(input,152,FOLLOW_152_in_ruleInvoke15136); 

                	newLeafNode(otherlv_10, grammarAccess.getInvokeAccess().getUnwindKeyword_10());
                
            otherlv_11=(Token)match(input,151,FOLLOW_151_in_ruleInvoke15148); 

                	newLeafNode(otherlv_11, grammarAccess.getInvokeAccess().getLabelKeyword_11());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7063:1: ( (lv_unwindTargetLabel_12_0= RULE_VALID_ID ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7064:1: (lv_unwindTargetLabel_12_0= RULE_VALID_ID )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7064:1: (lv_unwindTargetLabel_12_0= RULE_VALID_ID )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7065:3: lv_unwindTargetLabel_12_0= RULE_VALID_ID
            {
            lv_unwindTargetLabel_12_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleInvoke15165); 

            			newLeafNode(lv_unwindTargetLabel_12_0, grammarAccess.getInvokeAccess().getUnwindTargetLabelVALID_IDTerminalRuleCall_12_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getInvokeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"unwindTargetLabel",
                    		lv_unwindTargetLabel_12_0, 
                    		"VALID_ID");
            	    

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7089:1: entryRuleResume returns [EObject current=null] : iv_ruleResume= ruleResume EOF ;
    public final EObject entryRuleResume() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResume = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7090:2: (iv_ruleResume= ruleResume EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7091:2: iv_ruleResume= ruleResume EOF
            {
             newCompositeNode(grammarAccess.getResumeRule()); 
            pushFollow(FOLLOW_ruleResume_in_entryRuleResume15206);
            iv_ruleResume=ruleResume();

            state._fsp--;

             current =iv_ruleResume; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResume15216); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7098:1: ruleResume returns [EObject current=null] : (otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleResume() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_type_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7101:28: ( (otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7102:1: (otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7102:1: (otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7102:3: otherlv_0= 'resume' ( (lv_type_1_0= ruleStructure ) ) ( (lv_value_2_0= ruleValue ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_70_in_ruleResume15253); 

                	newLeafNode(otherlv_0, grammarAccess.getResumeAccess().getResumeKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7106:1: ( (lv_type_1_0= ruleStructure ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7107:1: (lv_type_1_0= ruleStructure )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7107:1: (lv_type_1_0= ruleStructure )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7108:3: lv_type_1_0= ruleStructure
            {
             
            	        newCompositeNode(grammarAccess.getResumeAccess().getTypeStructureParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleStructure_in_ruleResume15274);
            lv_type_1_0=ruleStructure();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResumeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_1_0, 
                    		"Structure");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7124:2: ( (lv_value_2_0= ruleValue ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7125:1: (lv_value_2_0= ruleValue )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7125:1: (lv_value_2_0= ruleValue )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7126:3: lv_value_2_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getResumeAccess().getValueValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleValue_in_ruleResume15295);
            lv_value_2_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResumeRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"Value");
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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7150:1: entryRuleUnreachable returns [EObject current=null] : iv_ruleUnreachable= ruleUnreachable EOF ;
    public final EObject entryRuleUnreachable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnreachable = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7151:2: (iv_ruleUnreachable= ruleUnreachable EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7152:2: iv_ruleUnreachable= ruleUnreachable EOF
            {
             newCompositeNode(grammarAccess.getUnreachableRule()); 
            pushFollow(FOLLOW_ruleUnreachable_in_entryRuleUnreachable15331);
            iv_ruleUnreachable=ruleUnreachable();

            state._fsp--;

             current =iv_ruleUnreachable; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnreachable15341); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7159:1: ruleUnreachable returns [EObject current=null] : ( () otherlv_1= 'unreachable' ) ;
    public final EObject ruleUnreachable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7162:28: ( ( () otherlv_1= 'unreachable' ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7163:1: ( () otherlv_1= 'unreachable' )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7163:1: ( () otherlv_1= 'unreachable' )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7163:2: () otherlv_1= 'unreachable'
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7163:2: ()
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7164:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getUnreachableAccess().getUnreachableAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,153,FOLLOW_153_in_ruleUnreachable15387); 

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7181:1: entryRuleReturn returns [EObject current=null] : iv_ruleReturn= ruleReturn EOF ;
    public final EObject entryRuleReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReturn = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7182:2: (iv_ruleReturn= ruleReturn EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7183:2: iv_ruleReturn= ruleReturn EOF
            {
             newCompositeNode(grammarAccess.getReturnRule()); 
            pushFollow(FOLLOW_ruleReturn_in_entryRuleReturn15423);
            iv_ruleReturn=ruleReturn();

            state._fsp--;

             current =iv_ruleReturn; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReturn15433); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7190:1: ruleReturn returns [EObject current=null] : (otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )? ) ;
    public final EObject ruleReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7193:28: ( (otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )? ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7194:1: (otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )? )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7194:1: (otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )? )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7194:3: otherlv_0= 'ret' ( (lv_value_1_0= ruleParameter ) ) (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )?
            {
            otherlv_0=(Token)match(input,154,FOLLOW_154_in_ruleReturn15470); 

                	newLeafNode(otherlv_0, grammarAccess.getReturnAccess().getRetKeyword_0());
                
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7198:1: ( (lv_value_1_0= ruleParameter ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7199:1: (lv_value_1_0= ruleParameter )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7199:1: (lv_value_1_0= ruleParameter )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7200:3: lv_value_1_0= ruleParameter
            {
             
            	        newCompositeNode(grammarAccess.getReturnAccess().getValueParameterParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleParameter_in_ruleReturn15491);
            lv_value_1_0=ruleParameter();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getReturnRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_1_0, 
                    		"Parameter");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7216:2: (otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER )?
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==80) ) {
                alt133=1;
            }
            switch (alt133) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7216:4: otherlv_2= ',' otherlv_3= '!dbg' otherlv_4= '!' ruleNUMBER
                    {
                    otherlv_2=(Token)match(input,80,FOLLOW_80_in_ruleReturn15504); 

                        	newLeafNode(otherlv_2, grammarAccess.getReturnAccess().getCommaKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,155,FOLLOW_155_in_ruleReturn15516); 

                        	newLeafNode(otherlv_3, grammarAccess.getReturnAccess().getDbgKeyword_2_1());
                        
                    otherlv_4=(Token)match(input,120,FOLLOW_120_in_ruleReturn15528); 

                        	newLeafNode(otherlv_4, grammarAccess.getReturnAccess().getExclamationMarkKeyword_2_2());
                        
                     
                            newCompositeNode(grammarAccess.getReturnAccess().getNUMBERParserRuleCall_2_3()); 
                        
                    pushFollow(FOLLOW_ruleNUMBER_in_ruleReturn15544);
                    ruleNUMBER();

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
    // $ANTLR end "ruleReturn"


    // $ANTLR start "entryRuleBranch"
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7244:1: entryRuleBranch returns [EObject current=null] : iv_ruleBranch= ruleBranch EOF ;
    public final EObject entryRuleBranch() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBranch = null;


        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7245:2: (iv_ruleBranch= ruleBranch EOF )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7246:2: iv_ruleBranch= ruleBranch EOF
            {
             newCompositeNode(grammarAccess.getBranchRule()); 
            pushFollow(FOLLOW_ruleBranch_in_entryRuleBranch15581);
            iv_ruleBranch=ruleBranch();

            state._fsp--;

             current =iv_ruleBranch; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBranch15591); 

            }

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
    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7253:1: ruleBranch returns [EObject current=null] : ( (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) ) | (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) ) ) ;
    public final EObject ruleBranch() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_destination_2_0=null;
        Token otherlv_3=null;
        Token this_INT_TYPE_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_destination_8_0=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_elseDestination_11_0=null;
        EObject lv_condition_5_0 = null;


         enterRule(); 
            
        try {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7256:28: ( ( (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) ) | (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) ) ) )
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7257:1: ( (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) ) | (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) ) )
            {
            // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7257:1: ( (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) ) | (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) ) )
            int alt134=2;
            int LA134_0 = input.LA(1);

            if ( (LA134_0==156) ) {
                int LA134_1 = input.LA(2);

                if ( (LA134_1==RULE_INT_TYPE) ) {
                    alt134=2;
                }
                else if ( (LA134_1==151) ) {
                    alt134=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 134, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }
            switch (alt134) {
                case 1 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7257:2: (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7257:2: (otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7257:4: otherlv_0= 'br' otherlv_1= 'label' ( (lv_destination_2_0= RULE_VALID_ID ) )
                    {
                    otherlv_0=(Token)match(input,156,FOLLOW_156_in_ruleBranch15629); 

                        	newLeafNode(otherlv_0, grammarAccess.getBranchAccess().getBrKeyword_0_0());
                        
                    otherlv_1=(Token)match(input,151,FOLLOW_151_in_ruleBranch15641); 

                        	newLeafNode(otherlv_1, grammarAccess.getBranchAccess().getLabelKeyword_0_1());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7265:1: ( (lv_destination_2_0= RULE_VALID_ID ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7266:1: (lv_destination_2_0= RULE_VALID_ID )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7266:1: (lv_destination_2_0= RULE_VALID_ID )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7267:3: lv_destination_2_0= RULE_VALID_ID
                    {
                    lv_destination_2_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleBranch15658); 

                    			newLeafNode(lv_destination_2_0, grammarAccess.getBranchAccess().getDestinationVALID_IDTerminalRuleCall_0_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBranchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"destination",
                            		lv_destination_2_0, 
                            		"VALID_ID");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7284:6: (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7284:6: (otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7284:8: otherlv_3= 'br' this_INT_TYPE_4= RULE_INT_TYPE ( (lv_condition_5_0= ruleValue ) ) otherlv_6= ',' otherlv_7= 'label' ( (lv_destination_8_0= RULE_VALID_ID ) ) otherlv_9= ',' otherlv_10= 'label' ( (lv_elseDestination_11_0= RULE_VALID_ID ) )
                    {
                    otherlv_3=(Token)match(input,156,FOLLOW_156_in_ruleBranch15683); 

                        	newLeafNode(otherlv_3, grammarAccess.getBranchAccess().getBrKeyword_1_0());
                        
                    this_INT_TYPE_4=(Token)match(input,RULE_INT_TYPE,FOLLOW_RULE_INT_TYPE_in_ruleBranch15694); 
                     
                        newLeafNode(this_INT_TYPE_4, grammarAccess.getBranchAccess().getINT_TYPETerminalRuleCall_1_1()); 
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7292:1: ( (lv_condition_5_0= ruleValue ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7293:1: (lv_condition_5_0= ruleValue )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7293:1: (lv_condition_5_0= ruleValue )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7294:3: lv_condition_5_0= ruleValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getBranchAccess().getConditionValueParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValue_in_ruleBranch15714);
                    lv_condition_5_0=ruleValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getBranchRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_5_0, 
                            		"Value");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,80,FOLLOW_80_in_ruleBranch15726); 

                        	newLeafNode(otherlv_6, grammarAccess.getBranchAccess().getCommaKeyword_1_3());
                        
                    otherlv_7=(Token)match(input,151,FOLLOW_151_in_ruleBranch15738); 

                        	newLeafNode(otherlv_7, grammarAccess.getBranchAccess().getLabelKeyword_1_4());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7318:1: ( (lv_destination_8_0= RULE_VALID_ID ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7319:1: (lv_destination_8_0= RULE_VALID_ID )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7319:1: (lv_destination_8_0= RULE_VALID_ID )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7320:3: lv_destination_8_0= RULE_VALID_ID
                    {
                    lv_destination_8_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleBranch15755); 

                    			newLeafNode(lv_destination_8_0, grammarAccess.getBranchAccess().getDestinationVALID_IDTerminalRuleCall_1_5_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBranchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"destination",
                            		lv_destination_8_0, 
                            		"VALID_ID");
                    	    

                    }


                    }

                    otherlv_9=(Token)match(input,80,FOLLOW_80_in_ruleBranch15772); 

                        	newLeafNode(otherlv_9, grammarAccess.getBranchAccess().getCommaKeyword_1_6());
                        
                    otherlv_10=(Token)match(input,151,FOLLOW_151_in_ruleBranch15784); 

                        	newLeafNode(otherlv_10, grammarAccess.getBranchAccess().getLabelKeyword_1_7());
                        
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7344:1: ( (lv_elseDestination_11_0= RULE_VALID_ID ) )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7345:1: (lv_elseDestination_11_0= RULE_VALID_ID )
                    {
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7345:1: (lv_elseDestination_11_0= RULE_VALID_ID )
                    // ../de.upb.llvm_parser/src-gen/de/upb/llvm_parser/parser/antlr/internal/InternalLLVM.g:7346:3: lv_elseDestination_11_0= RULE_VALID_ID
                    {
                    lv_elseDestination_11_0=(Token)match(input,RULE_VALID_ID,FOLLOW_RULE_VALID_ID_in_ruleBranch15801); 

                    			newLeafNode(lv_elseDestination_11_0, grammarAccess.getBranchAccess().getElseDestinationVALID_IDTerminalRuleCall_1_8_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getBranchRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"elseDestination",
                            		lv_elseDestination_11_0, 
                            		"VALID_ID");
                    	    

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

    // Delegated rules


    protected DFA59 dfa59 = new DFA59(this);
    protected DFA70 dfa70 = new DFA70(this);
    static final String DFA59_eotS =
        "\7\uffff";
    static final String DFA59_eofS =
        "\2\2\1\uffff\1\6\1\uffff\1\6\1\uffff";
    static final String DFA59_minS =
        "\2\4\1\uffff\1\5\1\36\1\5\1\uffff";
    static final String DFA59_maxS =
        "\2\u009c\1\uffff\1\u009c\1\141\1\u009c\1\uffff";
    static final String DFA59_acceptS =
        "\2\uffff\1\2\3\uffff\1\1";
    static final String DFA59_specialS =
        "\7\uffff}>";
    static final String[] DFA59_transitionS = {
            "\4\2\1\1\11\2\1\uffff\1\2\1\uffff\1\2\1\uffff\2\2\4\uffff\1"+
            "\2\24\uffff\2\2\20\uffff\5\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
            "\1\2\7\uffff\1\2\1\uffff\1\2\4\uffff\2\2\31\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\1\2\3\uffff\3\2\20\uffff\1\2\2\uffff\2\2\1\uffff"+
            "\1\2",
            "\1\6\3\2\1\1\1\4\5\2\1\5\1\2\1\6\1\uffff\1\3\1\uffff\1\6\1"+
            "\uffff\1\6\1\2\4\uffff\1\6\1\2\23\uffff\2\2\20\uffff\5\2\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\1\2\7\uffff\1\2\1\uffff\1\2\4\uffff"+
            "\3\2\30\uffff\1\6\1\uffff\2\2\1\uffff\1\2\3\uffff\3\2\20\uffff"+
            "\1\2\2\uffff\2\2\1\uffff\1\2",
            "",
            "\14\6\2\uffff\2\6\3\uffff\1\6\31\uffff\2\6\20\uffff\5\6\1"+
            "\uffff\1\6\2\uffff\1\2\1\6\1\uffff\1\6\7\uffff\1\6\1\uffff\1"+
            "\6\4\uffff\2\6\33\uffff\2\6\1\uffff\1\6\3\uffff\3\6\20\uffff"+
            "\1\6\2\uffff\2\6\1\uffff\1\6",
            "\1\2\23\uffff\1\6\56\uffff\1\2",
            "\14\6\2\uffff\1\6\4\uffff\1\6\5\uffff\1\2\23\uffff\2\6\20"+
            "\uffff\5\6\1\uffff\1\6\3\uffff\1\6\1\uffff\1\6\7\uffff\1\6\1"+
            "\uffff\1\6\4\uffff\2\6\1\2\32\uffff\2\6\1\uffff\1\6\3\uffff"+
            "\3\6\20\uffff\1\6\2\uffff\2\6\1\uffff\1\6",
            ""
    };

    static final short[] DFA59_eot = DFA.unpackEncodedString(DFA59_eotS);
    static final short[] DFA59_eof = DFA.unpackEncodedString(DFA59_eofS);
    static final char[] DFA59_min = DFA.unpackEncodedStringToUnsignedChars(DFA59_minS);
    static final char[] DFA59_max = DFA.unpackEncodedStringToUnsignedChars(DFA59_maxS);
    static final short[] DFA59_accept = DFA.unpackEncodedString(DFA59_acceptS);
    static final short[] DFA59_special = DFA.unpackEncodedString(DFA59_specialS);
    static final short[][] DFA59_transition;

    static {
        int numStates = DFA59_transitionS.length;
        DFA59_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA59_transition[i] = DFA.unpackEncodedString(DFA59_transitionS[i]);
        }
    }

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = DFA59_eot;
            this.eof = DFA59_eof;
            this.min = DFA59_min;
            this.max = DFA59_max;
            this.accept = DFA59_accept;
            this.special = DFA59_special;
            this.transition = DFA59_transition;
        }
        public String getDescription() {
            return "2399:2: ( ( (this_RETURN_ATTRIBUTES_1= RULE_RETURN_ATTRIBUTES )+ ( (lv_value_2_0= ruleValue ) ) ) | ( ( (lv_value_3_0= ruleValue ) )? (this_RETURN_ATTRIBUTES_4= RULE_RETURN_ATTRIBUTES )* ) )";
        }
    }
    static final String DFA70_eotS =
        "\37\uffff";
    static final String DFA70_eofS =
        "\37\uffff";
    static final String DFA70_minS =
        "\1\23\1\uffff\1\115\11\uffff\1\11\22\uffff";
    static final String DFA70_maxS =
        "\1\u009c\1\uffff\1\115\11\uffff\1\u0095\22\uffff";
    static final String DFA70_acceptS =
        "\1\uffff\1\1\1\uffff\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\32"+
        "\1\uffff\1\17\1\3\1\27\1\2\1\5\1\31\1\21\1\23\1\30\1\20\1\24\1\34"+
        "\1\33\1\25\1\26\1\22\1\6\1\4";
    static final String DFA70_specialS =
        "\37\uffff}>";
    static final String[] DFA70_transitionS = {
            "\1\2\61\uffff\1\10\1\11\1\6\64\uffff\1\3\2\uffff\1\1\3\uffff"+
            "\1\1\2\13\20\uffff\1\7\2\uffff\1\12\1\4\1\uffff\1\5",
            "",
            "\1\14",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\130\uffff\14\26\2\uffff\6\15\4\uffff\1\16\3\uffff\1"+
            "\21\1\20\1\35\1\20\2\uffff\2\13\1\uffff\1\36\1\25\1\30\3\uffff"+
            "\1\22\1\31\1\17\1\33\1\32\1\27\1\24\2\23",
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
            return "2751:1: (this_Store_0= ruleStore | this_Load_1= ruleLoad | this_GetElementPtr_2= ruleGetElementPtr | this_Alloc_3= ruleAlloc | this_CmpXchg_4= ruleCmpXchg | this_AtomicRMW_5= ruleAtomicRMW | this_Fence_6= ruleFence | this_Return_7= ruleReturn | this_Branch_8= ruleBranch | this_Switch_9= ruleSwitch | this_IndirectBranch_10= ruleIndirectBranch | this_Invoke_11= ruleInvoke | this_Resume_12= ruleResume | this_Unreachable_13= ruleUnreachable | this_LogicOperation_14= ruleLogicOperation | this_ArithmeticOperation_15= ruleArithmeticOperation | this_Compare_16= ruleCompare | this_Cast_17= ruleCast | this_ShuffleVector_18= ruleShuffleVector | this_InsertElement_19= ruleInsertElement | this_ExtractElement_20= ruleExtractElement | this_InsertValue_21= ruleInsertValue | this_ExtractValue_22= ruleExtractValue | this_Phi_23= rulePhi | this_Select_24= ruleSelect | this_Call_25= ruleCall | this_VariableAttributeAccess_26= ruleVariableAttributeAccess | this_LandingPad_27= ruleLandingPad )";
        }
    }
 

    public static final BitSet FOLLOW_ruleLLVM_in_entryRuleLLVM75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLLVM85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_ruleLLVM130 = new BitSet(new long[]{0x0000000001080002L,0x0000000005004500L});
    public static final BitSet FOLLOW_ruleNUMBER_in_entryRuleNUMBER167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNUMBER178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleNUMBER217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER234 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleNUMBER253 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNUMBER268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCallingConv_in_entryRuleCallingConv316 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCallingConv327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleCallingConv365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleCallingConv384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleCallingConv403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleCallingConv422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleCallingConv441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleCallingConv460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleCallingConv479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCallingConv498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleCallingConv517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleCallingConv536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCallingConv555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCallingConv574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCallingConv593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleCallingConv612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleCallingConv632 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCallingConv645 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleCallingConv667 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleCallingConv685 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleCallingConv707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_entryRuleFUNCTION_ATTRIBUTES754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFUNCTION_ATTRIBUTES765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleFUNCTION_ATTRIBUTES803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleFUNCTION_ATTRIBUTES823 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleFUNCTION_ATTRIBUTES836 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleFUNCTION_ATTRIBUTES849 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleFUNCTION_ATTRIBUTES871 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleFUNCTION_ATTRIBUTES889 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleFUNCTION_ATTRIBUTES902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleFUNCTION_ATTRIBUTES922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleFUNCTION_ATTRIBUTES941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleFUNCTION_ATTRIBUTES960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleFUNCTION_ATTRIBUTES979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleFUNCTION_ATTRIBUTES998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleFUNCTION_ATTRIBUTES1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleFUNCTION_ATTRIBUTES1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleFUNCTION_ATTRIBUTES1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleFUNCTION_ATTRIBUTES1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleFUNCTION_ATTRIBUTES1093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleFUNCTION_ATTRIBUTES1112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleFUNCTION_ATTRIBUTES1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleFUNCTION_ATTRIBUTES1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleFUNCTION_ATTRIBUTES1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleFUNCTION_ATTRIBUTES1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleFUNCTION_ATTRIBUTES1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKEYWORDS_in_entryRuleKEYWORDS1248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleKEYWORDS1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ALIAS_LINKAGE_in_ruleKEYWORDS1299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleKEYWORDS1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIN_OP_in_ruleKEYWORDS1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleKEYWORDS1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAST_OP_in_ruleKEYWORDS1403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_I_PREDICATES_in_ruleKEYWORDS1429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VISIBILITY_in_ruleKEYWORDS1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LINKAGE_in_ruleKEYWORDS1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLABEL_ID_in_entryRuleLABEL_ID1527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLABEL_ID1538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleKEYWORDS_in_ruleLABEL_ID1586 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_ruleLABEL_ID1612 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLABEL_ID1638 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleLABEL_ID1664 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_68_in_ruleLABEL_ID1688 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_69_in_ruleLABEL_ID1707 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_70_in_ruleLABEL_ID1726 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_71_in_ruleLABEL_ID1745 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_30_in_ruleLABEL_ID1760 = new BitSet(new long[]{0x000000000000FFE0L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleKEYWORDS_in_ruleLABEL_ID1783 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_ruleLABEL_ID1809 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleLABEL_ID1835 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleLABEL_ID1861 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_68_in_ruleLABEL_ID1885 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_69_in_ruleLABEL_ID1904 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_70_in_ruleLABEL_ID1923 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_71_in_ruleLABEL_ID1942 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleAbstractElement_in_entryRuleAbstractElement1985 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractElement1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_ruleAbstractElement2043 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_ruleAbstractElement2085 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_RULE_SL_COMMENT_in_ruleAbstractElement2096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTopLevelEntity_in_entryRuleTopLevelEntity2134 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTopLevelEntity2144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleTopLevelEntity2182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_ruleTopLevelEntity2194 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleTopLevelEntity2236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001800L});
    public static final BitSet FOLLOW_75_in_ruleTopLevelEntity2249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_76_in_ruleTopLevelEntity2267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleTopLevelEntity2280 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleTopLevelEntity2322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleTopLevelEntity2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleTopLevelEntity2346 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_ruleTopLevelEntity2381 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTopLevelEntity2398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_81_in_ruleTopLevelEntity2417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMainLevelEntity_in_entryRuleMainLevelEntity2454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMainLevelEntity2464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_ruleMainLevelEntity2511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDefinition_in_ruleMainLevelEntity2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_ruleMainLevelEntity2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDefinition_in_ruleMainLevelEntity2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleMainLevelEntity2619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeDefinition_in_entryRuleTypeDefinition2654 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeDefinition2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleTypeDefinition2710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleTypeDefinition2722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_ruleTypeDefinition2735 = new BitSet(new long[]{0x0000000000000000L,0x0000000040080000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleTypeDefinition2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleTypeDefinition2775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGlobalDefinition_in_entryRuleGlobalDefinition2813 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGlobalDefinition2823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleGlobalDefinition2869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleGlobalDefinition2881 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_RULE_LINKAGE_in_ruleGlobalDefinition2893 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_RULE_ALIAS_LINKAGE_in_ruleGlobalDefinition2909 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_84_in_ruleGlobalDefinition2926 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_85_in_ruleGlobalDefinition2944 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_86_in_ruleGlobalDefinition2962 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleGlobalDefinition2985 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleGlobalDefinition2998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleGlobalDefinition3010 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleGlobalDefinition3031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionDefinition_in_entryRuleFunctionDefinition3069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionDefinition3079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleFunctionDefinition3117 = new BitSet(new long[]{0x00003FFF80683920L});
    public static final BitSet FOLLOW_RULE_LINKAGE_in_ruleFunctionDefinition3129 = new BitSet(new long[]{0x00003FFF80682900L});
    public static final BitSet FOLLOW_RULE_ALIAS_LINKAGE_in_ruleFunctionDefinition3145 = new BitSet(new long[]{0x00003FFF80682900L});
    public static final BitSet FOLLOW_RULE_VISIBILITY_in_ruleFunctionDefinition3158 = new BitSet(new long[]{0x00003FFF80682100L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionDefinition3176 = new BitSet(new long[]{0x0000000000682100L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionDefinition3189 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleFunctionDefinition3211 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleFunctionDefinition3232 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterList_in_ruleFunctionDefinition3253 = new BitSet(new long[]{0xFFF3000001080000L,0x0000000047A0450FL});
    public static final BitSet FOLLOW_85_in_ruleFunctionDefinition3266 = new BitSet(new long[]{0xFFF3000001080000L,0x0000000047A0450FL});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition3285 = new BitSet(new long[]{0xFFF3000001080000L,0x0000000047A0450FL});
    public static final BitSet FOLLOW_89_in_ruleFunctionDefinition3299 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionDefinition3310 = new BitSet(new long[]{0xFFF3000001080000L,0x0000000047A0450FL});
    public static final BitSet FOLLOW_87_in_ruleFunctionDefinition3324 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleFunctionDefinition3345 = new BitSet(new long[]{0xFFF3000001080000L,0x0000000047A0450FL});
    public static final BitSet FOLLOW_ruleFunctionBody_in_ruleFunctionDefinition3368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleFunctionDefinition3388 = new BitSet(new long[]{0x00003FFF80683920L});
    public static final BitSet FOLLOW_RULE_LINKAGE_in_ruleFunctionDefinition3400 = new BitSet(new long[]{0x00003FFF80682900L});
    public static final BitSet FOLLOW_RULE_ALIAS_LINKAGE_in_ruleFunctionDefinition3416 = new BitSet(new long[]{0x00003FFF80682900L});
    public static final BitSet FOLLOW_RULE_VISIBILITY_in_ruleFunctionDefinition3429 = new BitSet(new long[]{0x00003FFF80682100L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleFunctionDefinition3447 = new BitSet(new long[]{0x0000000000682100L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionDefinition3460 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleFunctionDefinition3482 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleFunctionDefinition3503 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleFunctionParameterList_in_ruleFunctionDefinition3524 = new BitSet(new long[]{0xFFF3000000000002L,0x0000000002A0000FL});
    public static final BitSet FOLLOW_85_in_ruleFunctionDefinition3537 = new BitSet(new long[]{0xFFF3000000000002L,0x000000000280000FL});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleFunctionDefinition3556 = new BitSet(new long[]{0xFFF3000000000002L,0x000000000280000FL});
    public static final BitSet FOLLOW_89_in_ruleFunctionDefinition3570 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleFunctionDefinition3581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleFunctionDefinition3595 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleFunctionDefinition3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAliasDefinition_in_entryRuleAliasDefinition3655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAliasDefinition3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleAliasDefinition3711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleAliasDefinition3723 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_91_in_ruleAliasDefinition3735 = new BitSet(new long[]{0x0000000000682820L});
    public static final BitSet FOLLOW_RULE_ALIAS_LINKAGE_in_ruleAliasDefinition3747 = new BitSet(new long[]{0x0000000000682800L});
    public static final BitSet FOLLOW_RULE_VISIBILITY_in_ruleAliasDefinition3760 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleAliasDefinition3782 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleAliasDefinition3803 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleAliasDefinition3824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_entryRuleTypeUse3860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTypeUse3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_ruleTypeUse3918 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_ruleTypeUse3945 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_RULE_UNKNOWN_TYPE_in_ruleTypeUse3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_entryRuleAddressUse4004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddressUse4014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleAddressUse4059 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_ruleAddressUse4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_entryRuleAddress4118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddress4128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleAddress4169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_entryRulePredefined4209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePredefined4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRIMITIVE_VALUE_in_rulePredefined4263 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_rulePredefined4283 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_FLOATING_POINT_TYPE_in_rulePredefined4303 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_rulePredefined4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_entryRuleVector4370 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVector4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVector4417 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleVector4438 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleVector4450 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleVector4471 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_ruleVector4483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_entryRuleArray4519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArray4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleArray4577 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleArray4598 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_92_in_ruleArray4610 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleArray4633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleArray4652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleArray4667 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_93_in_ruleArray4686 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_79_in_ruleArray4705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_ruleArray4717 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_ruleArray4731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_entryRuleAggregate_Type4768 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAggregate_Type4778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleAggregate_Type4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArray_in_ruleAggregate_Type4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVector_in_ruleAggregate_Type4879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_entryRuleConstant4914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstant4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleConstant4969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValue_in_entryRulePrimitiveValue5004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimitiveValue5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePrimitiveValue5057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_PRIMITIVE_VALUE_in_rulePrimitiveValue5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INITIALIZER_in_rulePrimitiveValue5097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOL_in_rulePrimitiveValue5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_entryRuleValue5160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValue5170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedCast_in_ruleValue5217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedGetElementPtr_in_ruleValue5244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstant_in_ruleValue5271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddressUse_in_ruleValue5298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimitiveValue_in_ruleValue5325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStructure_in_entryRuleStructure5362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStructure5372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleStructure5418 = new BitSet(new long[]{0x0000400000683020L,0x00000000E0708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleStructure5442 = new BitSet(new long[]{0x0000000000000000L,0x0000000080010000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleStructure5461 = new BitSet(new long[]{0x0000000000000000L,0x0000000080010000L});
    public static final BitSet FOLLOW_80_in_ruleStructure5477 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleStructure5500 = new BitSet(new long[]{0x0000000000000000L,0x0000000080010000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleStructure5519 = new BitSet(new long[]{0x0000000000000000L,0x0000000080010000L});
    public static final BitSet FOLLOW_95_in_ruleStructure5538 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_RULE_POINTER_in_ruleStructure5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_entryRuleParameter5587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameter5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleParameter5645 = new BitSet(new long[]{0x0000000020EAA312L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleParameter5664 = new BitSet(new long[]{0x0000000020EAA312L,0x0400000000000000L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleParameter5681 = new BitSet(new long[]{0x0000000020EAA310L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter5703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_ruleParameter5732 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleParameter5745 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_ruleParameterList_in_entryRuleParameterList5784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameterList5794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleParameterList5841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleParameterList5860 = new BitSet(new long[]{0x0008400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList5882 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleParameterList5895 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleParameterList5916 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51_in_ruleParameterList5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameter_in_entryRuleFunctionParameter5970 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameter5980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleFunctionParameter6026 = new BitSet(new long[]{0x0000000000080102L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleFunctionParameter6038 = new BitSet(new long[]{0x0000000000080102L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleFunctionParameter6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionParameterList_in_entryRuleFunctionParameterList6097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionParameterList6107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleFunctionParameterList6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleFunctionParameterList6173 = new BitSet(new long[]{0x0008000000682000L});
    public static final BitSet FOLLOW_ruleFunctionParameter_in_ruleFunctionParameterList6195 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleFunctionParameterList6208 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleFunctionParameter_in_ruleFunctionParameterList6229 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51_in_ruleFunctionParameterList6245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionBody_in_entryRuleFunctionBody6283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionBody6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_ruleFunctionBody6339 = new BitSet(new long[]{0x0000000001080000L,0x0000000045004500L});
    public static final BitSet FOLLOW_94_in_ruleFunctionBody6352 = new BitSet(new long[]{0x000000000000FFE0L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_ruleFunctionBody6373 = new BitSet(new long[]{0x000000000000FFE0L,0x00000000800000F0L});
    public static final BitSet FOLLOW_95_in_ruleFunctionBody6386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstruction_in_entryRuleInstruction6422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstruction6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_ruleInstruction6479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_ruleInstruction6506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_ruleInstruction6533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlloc_in_ruleInstruction6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_ruleInstruction6587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_ruleInstruction6614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_ruleInstruction6641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_ruleInstruction6668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_ruleInstruction6695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_ruleInstruction6722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_ruleInstruction6749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_ruleInstruction6776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_ruleInstruction6803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_ruleInstruction6830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperation_in_ruleInstruction6857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticOperation_in_ruleInstruction6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_ruleInstruction6911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_ruleInstruction6938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_ruleInstruction6965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_ruleInstruction6992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractElement_in_ruleInstruction7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertValue_in_ruleInstruction7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_ruleInstruction7073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhi_in_ruleInstruction7100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_ruleInstruction7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_ruleInstruction7154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttributeAccess_in_ruleInstruction7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLandingPad_in_ruleInstruction7208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicBlock_in_entryRuleBasicBlock7243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBasicBlock7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLABEL_ID_in_ruleBasicBlock7300 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_97_in_ruleBasicBlock7312 = new BitSet(new long[]{0x0000000000080000L,0x90000000000000E0L,0x0000000016400038L});
    public static final BitSet FOLLOW_ruleInstruction_in_ruleBasicBlock7334 = new BitSet(new long[]{0x0000000000080002L,0x90000000000000E0L,0x0000000016400038L});
    public static final BitSet FOLLOW_ruleArithmeticOperation_in_entryRuleArithmeticOperation7371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticOperation7381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleArithmeticOperation7427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleArithmeticOperation7439 = new BitSet(new long[]{0x0000000000000000L,0x00003FFC00000000L});
    public static final BitSet FOLLOW_98_in_ruleArithmeticOperation7459 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_99_in_ruleArithmeticOperation7488 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_100_in_ruleArithmeticOperation7517 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_101_in_ruleArithmeticOperation7546 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_102_in_ruleArithmeticOperation7575 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_103_in_ruleArithmeticOperation7604 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_104_in_ruleArithmeticOperation7633 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_105_in_ruleArithmeticOperation7662 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_106_in_ruleArithmeticOperation7691 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_107_in_ruleArithmeticOperation7720 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_108_in_ruleArithmeticOperation7749 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_109_in_ruleArithmeticOperation7778 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_110_in_ruleArithmeticOperation7808 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_111_in_ruleArithmeticOperation7826 = new BitSet(new long[]{0x0000000000682000L,0x0000C00000000000L});
    public static final BitSet FOLLOW_111_in_ruleArithmeticOperation7840 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_110_in_ruleArithmeticOperation7858 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleArithmeticOperation7883 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArithmeticOperation7904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleArithmeticOperation7916 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleArithmeticOperation7937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLogicOperation_in_entryRuleLogicOperation7973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLogicOperation7983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleLogicOperation8029 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleLogicOperation8041 = new BitSet(new long[]{0x0000000000000000L,0x003F000000000000L});
    public static final BitSet FOLLOW_112_in_ruleLogicOperation8061 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_113_in_ruleLogicOperation8090 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_114_in_ruleLogicOperation8119 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_115_in_ruleLogicOperation8148 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_116_in_ruleLogicOperation8177 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_117_in_ruleLogicOperation8206 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleLogicOperation8243 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLogicOperation8264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleLogicOperation8276 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLogicOperation8297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCast_in_entryRuleCast8333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCast8343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleCast8389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleCast8401 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_CAST_OP_in_ruleCast8418 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleCast8446 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleCast8465 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCast8489 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleCast8501 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleCast8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNestedCast_in_entryRuleNestedCast8558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedCast8568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_CAST_OP_in_ruleNestedCast8610 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleNestedCast8627 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleNestedCast8650 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleAggregate_Type_in_ruleNestedCast8669 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNestedCast8693 = new BitSet(new long[]{0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_118_in_ruleNestedCast8705 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleNestedCast8726 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleNestedCast8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetaArgValue_in_entryRuleMetaArgValue8774 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetaArgValue8784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_METADATA_in_ruleMetaArgValue8826 = new BitSet(new long[]{0x0000000001020000L});
    public static final BitSet FOLLOW_RULE_METADATA_in_ruleMetaArgValue8850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMetaArgValue8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMeta_in_entryRuleMeta8914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMeta8924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_119_in_ruleMeta8962 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_RULE_METADATA_in_ruleMeta8979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePredefined_in_ruleMeta9013 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleMeta9035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMetadataValue_in_entryRuleMetadataValue9072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMetadataValue9082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_METADATA_in_ruleMetadataValue9124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleMetadataValue9141 = new BitSet(new long[]{0x0000000000000000L,0x0380000000000000L});
    public static final BitSet FOLLOW_119_in_ruleMetadataValue9154 = new BitSet(new long[]{0x0000000000000000L,0x0300000000000000L});
    public static final BitSet FOLLOW_120_in_ruleMetadataValue9170 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_94_in_ruleMetadataValue9182 = new BitSet(new long[]{0x0000000020EAA210L,0x0480000000000000L});
    public static final BitSet FOLLOW_121_in_ruleMetadataValue9201 = new BitSet(new long[]{0x0000000020EAA210L,0x0480000000000000L});
    public static final BitSet FOLLOW_ruleMeta_in_ruleMetadataValue9223 = new BitSet(new long[]{0x0000000000000000L,0x0000000080010000L});
    public static final BitSet FOLLOW_80_in_ruleMetadataValue9236 = new BitSet(new long[]{0x0000000020EAA210L,0x0480000000000000L});
    public static final BitSet FOLLOW_ruleMeta_in_ruleMetadataValue9257 = new BitSet(new long[]{0x0000000000000000L,0x0000000080010000L});
    public static final BitSet FOLLOW_95_in_ruleMetadataValue9271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGetElementPtr_in_entryRuleGetElementPtr9307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGetElementPtr9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleGetElementPtr9363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleGetElementPtr9375 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_122_in_ruleGetElementPtr9387 = new BitSet(new long[]{0x0000400000683020L,0x0800000060708000L});
    public static final BitSet FOLLOW_123_in_ruleGetElementPtr9400 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleGetElementPtr9424 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleGetElementPtr9437 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleGetElementPtr9458 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleGetElementPtr9479 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleNestedGetElementPtr_in_entryRuleNestedGetElementPtr9518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNestedGetElementPtr9528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_122_in_ruleNestedGetElementPtr9565 = new BitSet(new long[]{0x0004000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_123_in_ruleNestedGetElementPtr9578 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleNestedGetElementPtr9593 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleNestedGetElementPtr9614 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleNestedGetElementPtr9627 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleNestedGetElementPtr9648 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleNestedGetElementPtr9669 = new BitSet(new long[]{0x0008000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_51_in_ruleNestedGetElementPtr9683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFence_in_entryRuleFence9720 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFence9730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_124_in_ruleFence9767 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleFence9780 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleFence9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCmpXchg_in_entryRuleCmpXchg9840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCmpXchg9850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleCmpXchg9896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleCmpXchg9908 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000000L});
    public static final BitSet FOLLOW_126_in_ruleCmpXchg9920 = new BitSet(new long[]{0x0000400000683020L,0x8000000060708000L});
    public static final BitSet FOLLOW_127_in_ruleCmpXchg9938 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCmpXchg9973 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleCmpXchg9985 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCmpXchg10006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleCmpXchg10018 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCmpXchg10039 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleCmpXchg10052 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleCmpXchg10071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicRMW_in_entryRuleAtomicRMW10112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicRMW10122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleAtomicRMW10168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleAtomicRMW10180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_128_in_ruleAtomicRMW10192 = new BitSet(new long[]{0x0000000000000080L,0x8000000000000000L});
    public static final BitSet FOLLOW_127_in_ruleAtomicRMW10210 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_BIN_OP_in_ruleAtomicRMW10241 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAtomicRMW10267 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleAtomicRMW10279 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAtomicRMW10300 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleAtomicRMW10313 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleAtomicRMW10332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLoad_in_entryRuleLoad10373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLoad10383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleLoad10430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleLoad10442 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleLoad10462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleLoad10487 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_129_in_ruleLoad10507 = new BitSet(new long[]{0x0000400000683020L,0x8000000060708000L});
    public static final BitSet FOLLOW_127_in_ruleLoad10525 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleLoad10562 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleLoad10575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleLoad10587 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLoad10608 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleLoad10623 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleMetaArgValue_in_ruleLoad10644 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleLoad10675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleLoad10687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_129_in_ruleLoad10699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleLoad10717 = new BitSet(new long[]{0x0000400000683020L,0x8000000060708000L});
    public static final BitSet FOLLOW_127_in_ruleLoad10748 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleLoad10783 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleLoad10796 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleLoad10815 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleLoad10833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleLoad10845 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleLoad10866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStore_in_entryRuleStore10905 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStore10915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_127_in_ruleStore10961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_131_in_ruleStore10986 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_131_in_ruleStore11006 = new BitSet(new long[]{0x0000400000683020L,0x8000000060708000L});
    public static final BitSet FOLLOW_127_in_ruleStore11024 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleStore11061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11073 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleStore11094 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleStore11119 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleStore11140 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11155 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ruleMetaArgValue_in_ruleStore11176 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_131_in_ruleStore11198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_130_in_ruleStore11216 = new BitSet(new long[]{0x0000400000683020L,0x8000000060708000L});
    public static final BitSet FOLLOW_127_in_ruleStore11247 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleStore11282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11294 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleStore11315 = new BitSet(new long[]{0x0000000000000040L,0x2000000000000000L});
    public static final BitSet FOLLOW_125_in_ruleStore11328 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ATOMIC_ORDERING_in_ruleStore11347 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleStore11365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleStore11377 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleStore11398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCall_in_entryRuleCall11437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCall11447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleCall11494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleCall11506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000030L});
    public static final BitSet FOLLOW_132_in_ruleCall11521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_133_in_ruleCall11535 = new BitSet(new long[]{0x00007FFF80683120L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleCall11552 = new BitSet(new long[]{0x0000400000683120L,0x0000000060708000L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleCall11565 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleCall11587 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleCall11608 = new BitSet(new long[]{0xFFF3000000000002L,0x000000000001000FL});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleCall11625 = new BitSet(new long[]{0xFFF3000000000002L,0x000000000001000FL});
    public static final BitSet FOLLOW_80_in_ruleCall11639 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_134_in_ruleCall11651 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleCall11663 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleCall11679 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleAlloc_in_entryRuleAlloc11716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlloc11726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleAlloc11772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleAlloc11784 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_135_in_ruleAlloc11796 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleAlloc11817 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleAlloc11830 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleAlloc11851 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleAlloc11866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleAlloc11878 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleAlloc11899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhiCase_in_entryRulePhiCase11937 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhiCase11947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValue_in_rulePhiCase11993 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rulePhiCase12005 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_rulePhiCase12022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhi_in_entryRulePhi12063 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhi12073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_rulePhi12119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_rulePhi12131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_136_in_rulePhi12143 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_rulePhi12164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_rulePhi12176 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_rulePhiCase_in_rulePhi12197 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rulePhi12209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_rulePhi12222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_rulePhi12234 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_rulePhiCase_in_rulePhi12255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_rulePhi12267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleLandingPad_in_entryRuleLandingPad12305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLandingPad12315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleLandingPad12361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleLandingPad12373 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_137_in_ruleLandingPad12385 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleLandingPad12406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_138_in_ruleLandingPad12418 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleLandingPad12439 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleLandingPad12460 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_139_in_ruleLandingPad12474 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad12495 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleClause_in_ruleLandingPad12524 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleClause_in_entryRuleClause12562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleClause12572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleClause12610 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleClause12631 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleClause12652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_140_in_ruleClause12672 = new BitSet(new long[]{0x0000000000000000L,0x0000000020008000L});
    public static final BitSet FOLLOW_ruleArray_in_ruleClause12693 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleClause12714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelect_in_entryRuleSelect12751 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelect12761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleSelect12807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleSelect12819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_141_in_ruleSelect12831 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelect12852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSelect12864 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelect12885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSelect12897 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSelect12918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVariableAttributeAccess_in_entryRuleVariableAttributeAccess12954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVariableAttributeAccess12964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleVariableAttributeAccess13010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleVariableAttributeAccess13022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_142_in_ruleVariableAttributeAccess13034 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleVariableAttributeAccess13055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleVariableAttributeAccess13067 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleVariableAttributeAccess13088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExtractValue_in_entryRuleExtractValue13124 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractValue13134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleExtractValue13180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleExtractValue13192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_143_in_ruleExtractValue13204 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExtractValue13225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleExtractValue13238 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleExtractValue13259 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleInsertValue_in_entryRuleInsertValue13297 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertValue13307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleInsertValue13353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleInsertValue13365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_144_in_ruleInsertValue13377 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertValue13398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInsertValue13410 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertValue13431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInsertValue13444 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleInsertValue13465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_ruleExtractElement_in_entryRuleExtractElement13503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExtractElement13513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleExtractElement13559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleExtractElement13571 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_145_in_ruleExtractElement13583 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExtractElement13604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleExtractElement13616 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleExtractElement13637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInsertElement_in_entryRuleInsertElement13673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInsertElement13683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleInsertElement13729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleInsertElement13741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_146_in_ruleInsertElement13753 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertElement13774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInsertElement13786 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertElement13807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleInsertElement13819 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleInsertElement13840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleShuffleVector_in_entryRuleShuffleVector13876 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleShuffleVector13886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleShuffleVector13932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleShuffleVector13944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_147_in_ruleShuffleVector13956 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleShuffleVector13977 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleShuffleVector13989 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleShuffleVector14010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleShuffleVector14022 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleShuffleVector14043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompare_in_entryRuleCompare14079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompare14089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleCompare14135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleCompare14147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000300000L});
    public static final BitSet FOLLOW_148_in_ruleCompare14161 = new BitSet(new long[]{0x0000000002008400L});
    public static final BitSet FOLLOW_149_in_ruleCompare14179 = new BitSet(new long[]{0x0000000002008400L});
    public static final BitSet FOLLOW_RULE_I_PREDICATES_in_ruleCompare14199 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_RULE_F_PREDICATES_in_ruleCompare14219 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_RULE_BOOL_in_ruleCompare14239 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleCompare14268 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCompare14289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleCompare14301 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleCompare14322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIndirectBranch_in_entryRuleIndirectBranch14359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIndirectBranch14369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_150_in_ruleIndirectBranch14406 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleIndirectBranch14427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleIndirectBranch14439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleIndirectBranch14451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleIndirectBranch14464 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleIndirectBranch14481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_80_in_ruleIndirectBranch14499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleIndirectBranch14511 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleIndirectBranch14528 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_81_in_ruleIndirectBranch14549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitch_in_entryRuleSwitch14585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitch14595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSwitch14632 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSwitch14653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSwitch14665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleSwitch14677 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleSwitch14694 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_ruleSwitch14711 = new BitSet(new long[]{0x0000400000683020L,0x0000000060728000L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_ruleSwitch14732 = new BitSet(new long[]{0x0000400000683020L,0x0000000060728000L});
    public static final BitSet FOLLOW_81_in_ruleSwitch14745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSwitchCase_in_entryRuleSwitchCase14781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSwitchCase14791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleSwitchCase14837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleSwitchCase14849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleSwitchCase14861 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleSwitchCase14878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInvoke_in_entryRuleInvoke14919 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInvoke14929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleInvoke14966 = new BitSet(new long[]{0x00003FFF80682100L});
    public static final BitSet FOLLOW_ruleCallingConv_in_ruleInvoke14983 = new BitSet(new long[]{0x0000000000682100L});
    public static final BitSet FOLLOW_RULE_RETURN_ATTRIBUTES_in_ruleInvoke14996 = new BitSet(new long[]{0x0000000000682000L});
    public static final BitSet FOLLOW_ruleTypeUse_in_ruleInvoke15018 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleAddress_in_ruleInvoke15039 = new BitSet(new long[]{0x0004000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_ruleParameterList_in_ruleInvoke15060 = new BitSet(new long[]{0xFFF3000000000000L,0x004000000000000FL});
    public static final BitSet FOLLOW_ruleFUNCTION_ATTRIBUTES_in_ruleInvoke15077 = new BitSet(new long[]{0xFFF3000000000000L,0x004000000000000FL});
    public static final BitSet FOLLOW_118_in_ruleInvoke15090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleInvoke15102 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleInvoke15119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_152_in_ruleInvoke15136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleInvoke15148 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleInvoke15165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResume_in_entryRuleResume15206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResume15216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleResume15253 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ruleStructure_in_ruleResume15274 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleResume15295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnreachable_in_entryRuleUnreachable15331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnreachable15341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_153_in_ruleUnreachable15387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReturn_in_entryRuleReturn15423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReturn15433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_154_in_ruleReturn15470 = new BitSet(new long[]{0x0000400000683020L,0x0000000060708000L});
    public static final BitSet FOLLOW_ruleParameter_in_ruleReturn15491 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleReturn15504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_155_in_ruleReturn15516 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_ruleReturn15528 = new BitSet(new long[]{0x0000000020000010L});
    public static final BitSet FOLLOW_ruleNUMBER_in_ruleReturn15544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBranch_in_entryRuleBranch15581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBranch15591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleBranch15629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleBranch15641 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleBranch15658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_156_in_ruleBranch15683 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RULE_INT_TYPE_in_ruleBranch15694 = new BitSet(new long[]{0x0000000020EAA210L,0x0400000000000000L});
    public static final BitSet FOLLOW_ruleValue_in_ruleBranch15714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleBranch15726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleBranch15738 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleBranch15755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_ruleBranch15772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_151_in_ruleBranch15784 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_RULE_VALID_ID_in_ruleBranch15801 = new BitSet(new long[]{0x0000000000000002L});

}